package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import ci.l7;
import ci.y9;
import ci.z9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ob;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b31;
import org.telegram.ui.ry;
import org.telegram.ui.sp0;
public abstract class o2 {
    protected k actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private ob bulletinDelegate;
    protected boolean finishing;
    protected boolean fragmentBeginToShow;
    public View fragmentView;
    private Runnable fullyVisibleListener;
    protected boolean inBubbleMode;
    protected boolean inMenuMode;
    protected boolean inPreviewMode;
    public boolean isFinished;
    private boolean isFullyVisible;
    protected Dialog parentDialog;
    protected h5 parentLayout;
    private n2 previewDelegate;
    private boolean removingFromStack;
    protected g6 resourceProvider;
    public ArrayList<k2> sheetsStack;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final ni.e glassEngine = new ni.e();
    private final g6 themedColors = new a2(this, 1);
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public o2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new i2(this));
    }

    public static boolean hasFullyVisibleSheets(o2 o2Var) {
        ry w9;
        if (o2Var != null) {
            if (!o2Var.hasShownFullyVisibleSheet()) {
                if ((o2Var.getParentLayout() instanceof ActionBarLayout) && (w9 = ((ActionBarLayout) o2Var.getParentLayout()).w()) != null && w9.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(o2 o2Var) {
        ry w9;
        if (o2Var != null) {
            if (!o2Var.hasShownSheet()) {
                if ((o2Var.getParentLayout() instanceof ActionBarLayout) && (w9 = ((ActionBarLayout) o2Var.getParentLayout()).w()) != null && w9.hasShownSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean S(MotionEvent motionEvent, boolean z10) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(k2 k2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        z9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f6267v0 = k2Var;
            k2Var.setOnDismissListener(new ci.s3(lastStoryViewer, 3));
        }
        this.sheetsStack.add(k2Var);
        updateSheetsVisibility();
    }

    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return true;
    }

    public boolean allowPresentFragment() {
        return true;
    }

    public void attachSheets(v vVar) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                k2 k2Var = this.sheetsStack.get(i10);
                if (k2Var != null && k2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(k2Var.getWindowView());
                    vVar.addView(k2Var.getWindowView());
                }
            }
        }
    }

    public boolean canBeginSlide() {
        return true;
    }

    public void checkSystemBarColors() {
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ((LaunchActivity) parentActivity).H(true, true, true);
        }
    }

    public void clearSheets() {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                this.sheetsStack.get(size).dismiss(true);
            }
            this.sheetsStack.clear();
        }
    }

    public void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            this.fragmentView = null;
        }
        k kVar = this.actionBar;
        if (kVar != null) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeSheet() {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).isShown()) {
                    return this.sheetsStack.get(size).onAttachedBackPressed();
                }
            }
            return false;
        }
        return false;
    }

    public k createActionBar(Context context) {
        h5 h5Var;
        k kVar = new k(context, getResourceProvider());
        r6.i(k6.f21462s8, kVar, this.themedColors);
        r6.m(kVar, 3, k6.f21481t8, this.themedColors);
        r6.a(kVar, k6.f21590z8, this.themedColors, true);
        r6.m(kVar, 1, k6.f21518v8, this.themedColors);
        r6.b(kVar, k6.f21573y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((h5Var = this.parentLayout) == null || !((ActionBarLayout) h5Var).S0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
    }

    public org.telegram.ui.k4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.w3) && getLastSheet().isShown()) {
                return ((org.telegram.ui.w3) getLastSheet()).K;
            }
            h5 h5Var = this.parentLayout;
            if ((h5Var instanceof ActionBarLayout) && ((ActionBarLayout) h5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.w3)) {
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (w3Var.isShown()) {
                    return w3Var.K;
                }
            }
        }
        org.telegram.ui.k4 k4Var = new org.telegram.ui.k4(this);
        org.telegram.ui.w3 w3Var2 = k4Var.K;
        addSheet(w3Var2);
        l3.b(w3Var2);
        return k4Var;
    }

    public z9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        z9 z9Var = new z9(this);
        h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).f20616b) {
            z9Var.f6259r1 = true;
        }
        this.sheetsStack.add(z9Var);
        updateSheetsVisibility();
        return z9Var;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                k2 k2Var = this.sheetsStack.get(i10);
                if (k2Var != null && k2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(k2Var.getWindowView());
                }
            }
        }
    }

    public void dismissCurrentDialog() {
        Dialog dialog = this.visibleDialog;
        if (dialog == null) {
            return;
        }
        try {
            dialog.dismiss();
            this.visibleDialog = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public boolean drawEdgeNavigationBar() {
        return isSupportEdgeToEdge();
    }

    public void dumpCanvas() {
        AndroidUtilities.dumpCanvas(this.fragmentView);
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        n2 n2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (n2Var = this.previewDelegate) != null) {
            ((b31) ((sp0) n2Var).f41783b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        h5 h5Var = this.parentLayout;
        if (h5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) h5Var;
            if (actionBarLayout.h || actionBarLayout.f20614a0) {
                Runnable runnable = actionBarLayout.e;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    actionBarLayout.e = null;
                }
                actionBarLayout.l(true, false);
            }
        }
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.currentAccount);
    }

    public k getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public org.telegram.ui.k4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.w3) && getLastSheet().isShown()) {
            return ((org.telegram.ui.w3) getLastSheet()).K;
        }
        h5 h5Var = this.parentLayout;
        if ((h5Var instanceof ActionBarLayout) && ((ActionBarLayout) h5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.w3)) {
            org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
            if (w3Var.isShown()) {
                return w3Var.K;
            }
            return null;
        }
        return null;
    }

    public c5 getBackButtonState() {
        k kVar = this.actionBar;
        if (kVar != null) {
            return kVar.getBackButtonState();
        }
        return null;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public ob getBulletinDelegate() {
        return this.bulletinDelegate;
    }

    public FrameLayout getBulletinLayoutContainer() {
        return getLayoutContainer();
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public ConnectionsManager getConnectionsManager() {
        return getAccountInstance().getConnectionsManager();
    }

    public ContactsController getContactsController() {
        return getAccountInstance().getContactsController();
    }

    public Context getContext() {
        return getParentActivity();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        return null;
    }

    public DownloadController getDownloadController() {
        return getAccountInstance().getDownloadController();
    }

    public c4 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return c4.f20791b;
        }
        return c4.f20790a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public o2 getFragmentForAlert(int i10) {
        h5 h5Var = this.parentLayout;
        if (h5Var != null && h5Var.getFragmentStack().size() > i10 + 1) {
            return (o2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i10);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public GiftAuctionController getGiftAuctionsController() {
        return getAccountInstance().getGiftAuctionsController();
    }

    public boolean getInPassivePreviewMode() {
        h5 h5Var = this.parentLayout;
        if (h5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) h5Var;
            if ((actionBarLayout.h && actionBarLayout.J == null) || actionBarLayout.f20614a0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public k2 getLastSheet() {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).isShown()) {
                    return this.sheetsStack.get(size);
                }
            }
            return null;
        }
        return null;
    }

    public z9 getLastStoryViewer() {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof z9) && this.sheetsStack.get(size).isShown()) {
                    return (z9) this.sheetsStack.get(size);
                }
            }
            return null;
        }
        return null;
    }

    public FrameLayout getLayoutContainer() {
        View view = this.fragmentView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof FrameLayout) {
                return (FrameLayout) parent;
            }
            return null;
        }
        return null;
    }

    public LocationController getLocationController() {
        return getAccountInstance().getLocationController();
    }

    public MediaController getMediaController() {
        return MediaController.getInstance();
    }

    public MediaDataController getMediaDataController() {
        return getAccountInstance().getMediaDataController();
    }

    public MessagesController getMessagesController() {
        return getAccountInstance().getMessagesController();
    }

    public MessagesStorage getMessagesStorage() {
        return getAccountInstance().getMessagesStorage();
    }

    public int getNavigationBarColor() {
        int w02 = k6.w0(k6.f21125a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                k2 k2Var = this.sheetsStack.get(i10);
                if (k2Var.attachedToParent()) {
                    w02 = k2Var.getNavigationBarColor(w02);
                }
            }
        }
        return w02;
    }

    public NotificationCenter getNotificationCenter() {
        return getAccountInstance().getNotificationCenter();
    }

    public NotificationsController getNotificationsController() {
        return getAccountInstance().getNotificationsController();
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().getNotificationsSettings();
    }

    public z9 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        z9 z9Var = (this.sheetsStack.isEmpty() || !(i2.o1.i(1, this.sheetsStack) instanceof z9)) ? null : (z9) i2.o1.i(1, this.sheetsStack);
        if (z9Var == null) {
            z9Var = new z9(this);
            h5 h5Var = this.parentLayout;
            if (h5Var != null && ((ActionBarLayout) h5Var).f20616b) {
                z9Var.f6259r1 = true;
            }
            this.sheetsStack.add(z9Var);
            updateSheetsVisibility();
        }
        return z9Var;
    }

    public Activity getParentActivity() {
        h5 h5Var = this.parentLayout;
        if (h5Var != null) {
            return h5Var.getParentActivity();
        }
        return null;
    }

    public h5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public g6 getResourceProvider() {
        return this.resourceProvider;
    }

    public SecretChatHelper getSecretChatHelper() {
        return getAccountInstance().getSecretChatHelper();
    }

    public SendMessagesHelper getSendMessagesHelper() {
        return getAccountInstance().getSendMessagesHelper();
    }

    public ArrayList<t6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i10) {
        return k6.w0(i10, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return k6.Q0(str);
    }

    public Paint getThemedPaint(String str) {
        Paint paint;
        if (getResourceProvider() != null) {
            paint = getResourceProvider().d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return k6.U0(str);
    }

    public UserConfig getUserConfig() {
        return getAccountInstance().getUserConfig();
    }

    public Dialog getVisibleDialog() {
        return this.visibleDialog;
    }

    public boolean hasForceLightStatusBar() {
        return false;
    }

    public boolean hasOwnBackground() {
        return this.hasOwnBackground;
    }

    public boolean hasSheet() {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasShownFullyVisibleSheet() {
        if (hasSheet()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).isShown() && this.sheetsStack.get(size).isFullyVisible()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean hasShownSheet() {
        if (hasSheet()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).isShown()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean hasStoryViewer() {
        if (getLastStoryViewer() != null) {
            return true;
        }
        return false;
    }

    public boolean hideKeyboardOnShow() {
        return true;
    }

    public boolean isActionBarCrossfadeEnabled() {
        if (this.actionBar != null) {
            return true;
        }
        return false;
    }

    public boolean isBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public boolean isBotView(View view) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                this.sheetsStack.get(i10);
            }
        }
        return false;
    }

    public boolean isFinishing() {
        return this.finishing;
    }

    public boolean isInBubbleMode() {
        return this.inBubbleMode;
    }

    public boolean isInPreviewMode() {
        return this.inPreviewMode;
    }

    public boolean isLastFragment() {
        h5 h5Var = this.parentLayout;
        if (h5Var != null && h5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int x02;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || k6.C0().q()) {
                g6 resourceProvider = getResourceProvider();
                int i10 = k6.f21462s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.s()) {
                    i10 = k6.f21537w8;
                }
                if (resourceProvider != null) {
                    x02 = resourceProvider.e(i10);
                } else {
                    x02 = k6.x0(null, i10, true);
                }
                if (i0.a.h(x02) <= 0.699999988079071d) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public boolean isRemovingFromStack() {
        return this.removingFromStack;
    }

    public boolean isStoryViewer(View view) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                k2 k2Var = this.sheetsStack.get(i10);
                if ((k2Var instanceof z9) && view == ((z9) k2Var).f6260s) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean isSupportEdgeToEdge() {
        return false;
    }

    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public void movePreviewFragment(float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.o2.movePreviewFragment(float):void");
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
            return false;
        }
        return true;
    }

    public void onBecomeFullyHidden() {
        this.isFullyVisible = false;
        updateSheetsVisibility();
    }

    public void onBecomeFullyVisible() {
        k actionBar;
        this.isFullyVisible = true;
        if (((AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility")).isEnabled() && (actionBar = getActionBar()) != null) {
            String title = actionBar.getTitle();
            if (!TextUtils.isEmpty(title)) {
                setParentActivityTitle(title);
            }
        }
        Runnable runnable = this.fullyVisibleListener;
        if (runnable != null) {
            this.fullyVisibleListener = null;
            runnable.run();
        }
        updateSheetsVisibility();
        checkSystemBarColors();
    }

    public void onBeginSlide() {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing()) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = false;
            kVar.O();
            y yVar = kVar.E;
            if (yVar != null) {
                int childCount = yVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = yVar.getChildAt(i10);
                    if (childAt instanceof u0) {
                        ((u0) childAt).n();
                    }
                }
            }
        }
    }

    public AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    public boolean onFragmentCreate() {
        return true;
    }

    public void onFragmentDestroy() {
        boolean z10;
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.isFinished = true;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (k6.x0(null, k6.f21462s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(parentActivity, z10);
        }
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                k2 k2Var = this.sheetsStack.get(size);
                k2Var.setLastVisible(false);
                k2Var.dismiss(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        i0.b f7 = k1Var.f45251a.f(3);
        int i10 = f7.f12315a;
        int i11 = f7.f12316b;
        int i12 = f7.f12317c;
        int i13 = f7.d;
        this.bottomInset = i13;
        onInsets(i10, i11, i12, i13);
        return r0.k1.f45250b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = false;
            kVar.O();
            y yVar = kVar.E;
            if (yVar != null) {
                int childCount = yVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = yVar.getChildAt(i10);
                    if (childAt instanceof u0) {
                        ((u0) childAt).n();
                    }
                }
            }
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (getLastStoryViewer() != null) {
            z9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f6262s1 = true;
            y9 y9Var = lastStoryViewer.f6276z0;
            if (y9Var != null) {
                y9Var.release(null);
                lastStoryViewer.f6276z0 = null;
            }
            if (lastStoryViewer.E0 == null) {
                ei.d4 d4Var = lastStoryViewer.D0;
                if (d4Var != null) {
                    d4Var.d(0L, null);
                }
                ci.h1 h1Var = lastStoryViewer.A0;
                if (h1Var != null) {
                    if (h1Var.f5383n) {
                        h1Var.s(null);
                    } else {
                        h1Var.e();
                    }
                    lastStoryViewer.A0 = null;
                }
            }
            l7 l7Var = lastStoryViewer.f6266u1;
            if (l7Var != null) {
                l7Var.b();
            }
            getLastStoryViewer().P();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = true;
            kVar.O();
        }
        if (getLastStoryViewer() != null) {
            z9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f6262s1 = false;
            if (!org.telegram.ui.k4.x().V && lastStoryViewer.t() != null) {
                lastStoryViewer.t().e1(false);
            }
            l7 l7Var = lastStoryViewer.f6266u1;
            if (l7Var != null) {
                l7Var.a(false);
            }
            if (ci.o1.Z.S) {
                ci.o1.j();
            }
            getLastStoryViewer().P();
        }
    }

    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.inTransitionAnimation = false;
    }

    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.inTransitionAnimation = true;
        if (z10) {
            this.fragmentBeginToShow = true;
        }
    }

    public void onViewCreated(View view) {
        this.glassEngine.b(view);
    }

    public View performCreateView(Context context) {
        View createView = createView(context);
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(o2 o2Var) {
        h5 h5Var;
        return allowPresentFragment() && (h5Var = this.parentLayout) != null && ((ActionBarLayout) h5Var).Q(o2Var);
    }

    public boolean presentFragmentAsPreview(o2 o2Var) {
        h5 h5Var;
        if (allowPresentFragment() && (h5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) h5Var;
            actionBarLayout.getClass();
            e5 e5Var = new e5(o2Var);
            e5Var.e = true;
            if (actionBarLayout.S(e5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(o2 o2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        h5 h5Var;
        if (allowPresentFragment() && (h5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) h5Var;
            actionBarLayout.getClass();
            e5 e5Var = new e5(o2Var);
            e5Var.e = true;
            e5Var.f20872f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.S(e5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(k2 k2Var) {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(k2Var);
        updateSheetsVisibility();
    }

    public void resetFragment() {
        if (this.isFinished) {
            clearViews();
            this.isFinished = false;
            this.finishing = false;
        }
    }

    public void resumeDelayedFragmentAnimation() {
        h5 h5Var = this.parentLayout;
        if (h5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) h5Var;
            actionBarLayout.X0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable != null && actionBarLayout.d == null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.e.run();
                actionBarLayout.e = null;
            }
        }
    }

    public void setBulletinDelegate(ob obVar) {
        this.bulletinDelegate = obVar;
    }

    public void setCurrentAccount(int i10) {
        if (this.fragmentView == null) {
            this.currentAccount = i10;
            return;
        }
        throw new IllegalStateException("trying to set current account when fragment UI already created");
    }

    public void setFinishing(boolean z10) {
        this.finishing = z10;
    }

    public void setFragmentPanTranslationOffset(int i10) {
        h5 h5Var = this.parentLayout;
        if (h5Var != null) {
            h5Var.setFragmentPanTranslationOffset(i10);
        }
    }

    public void setFragmentView(View view) {
        this.fragmentView = view;
    }

    public void setHasOwnBackground(boolean z10) {
        this.hasOwnBackground = z10;
    }

    public void setInBubbleMode(boolean z10) {
        this.inBubbleMode = z10;
    }

    public void setInMenuMode(boolean z10) {
        this.inMenuMode = z10;
    }

    public void setInPreviewMode(boolean z10) {
        this.inPreviewMode = z10;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setOccupyStatusBar(!z10);
        }
    }

    public void setKeyboardHeightFromParent(int i10) {
        if (this.sheetsStack != null) {
            for (int i11 = 0; i11 < this.sheetsStack.size(); i11++) {
                k2 k2Var = this.sheetsStack.get(i11);
                if (k2Var != null) {
                    k2Var.setKeyboardHeightFromParent(i10);
                }
            }
        }
    }

    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (!isSupportEdgeToEdge()) {
            Activity parentActivity = getParentActivity();
            if (parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) parentActivity).E0(i10);
            } else if (parentActivity != null) {
                Window window = parentActivity.getWindow();
                if (Build.VERSION.SDK_INT >= 26 && window != null) {
                    window.getNavigationBarColor();
                }
            }
            if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(parentActivity, z10);
            h5 h5Var = this.parentLayout;
            if (h5Var != null) {
                h5Var.setNavigationBarColor(i10);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(o2 o2Var) {
        setParentLayout(o2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentLayout(h5 h5Var) {
        boolean z10;
        ViewGroup viewGroup;
        if (this.parentLayout != h5Var) {
            this.parentLayout = h5Var;
            boolean z11 = false;
            if (h5Var != null && ((ActionBarLayout) h5Var).f20626f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.inBubbleMode = z10;
            View view = this.fragmentView;
            if (view != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    try {
                        onRemoveFromParent();
                        viewGroup2.removeViewInLayout(this.fragmentView);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                h5 h5Var2 = this.parentLayout;
                if (h5Var2 != null && h5Var2.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                h5 h5Var3 = this.parentLayout;
                if (h5Var3 != null && h5Var3.getView().getContext() != this.actionBar.getContext()) {
                    z11 = true;
                }
                k kVar = this.actionBar;
                if ((kVar.K || z11) && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (z11) {
                    this.actionBar = null;
                }
            }
            h5 h5Var4 = this.parentLayout;
            if (h5Var4 != null && this.actionBar == null) {
                k createActionBar = createActionBar(h5Var4.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f21082t0 = this;
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.isPaused == z10) {
            return;
        }
        if (z10) {
            onPause();
        } else {
            onResume();
        }
    }

    public void setPreviewDelegate(n2 n2Var) {
        this.previewDelegate = n2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(g6 g6Var) {
        this.resourceProvider = g6Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.J(str, i10, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null && kVar.K) {
            setTitleOverlayText(str, i10, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public h5[] showAsSheet(o2 o2Var) {
        return showAsSheet(o2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        h5 h5Var = this.parentLayout;
        if (h5Var != null && (activity = (actionBarLayout = (ActionBarLayout) h5Var).Q0) != null) {
            if (actionBarLayout.W) {
                AnimatorSet animatorSet = actionBarLayout.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.K = null;
                }
                if (actionBarLayout.E0 != null) {
                    actionBarLayout.I();
                } else if (actionBarLayout.F0 != null) {
                    actionBarLayout.L();
                }
                actionBarLayout.f20653s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i10);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                k2 k2Var = this.sheetsStack.get(i10);
                boolean z10 = true;
                if (i10 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                k2Var.setLastVisible(z10);
            }
        }
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public boolean presentFragment(o2 o2Var, boolean z10) {
        h5 h5Var;
        return allowPresentFragment() && (h5Var = this.parentLayout) != null && ((ActionBarLayout) h5Var).R(o2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        h5 h5Var;
        if (this.isFinished || (h5Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) h5Var).b0(this, z10);
        }
    }

    public h5[] showAsSheet(o2 o2Var, m2 m2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        h5[] h5VarArr = {new b5(getParentActivity(), new n(r7, 5))};
        h5VarArr[0].setIsSheet(true);
        LaunchActivity.J1.P.add(h5VarArr[0]);
        o2Var.onTransitionAnimationStart(true, false);
        j2 j2Var = new j2(getParentActivity(), o2Var.getResourceProvider(), m2Var, h5VarArr, o2Var, r7);
        h3[] h3VarArr = {j2Var};
        if (m2Var != null) {
            j2Var.setAllowNestedScroll(false);
            h3VarArr[0].transitionFromRight(m2Var.f21636a);
        }
        h3 h3Var = h3VarArr[0];
        o2Var.parentDialog = h3Var;
        h3Var.setOpenNoDelay(true);
        h3VarArr[0].show();
        return h5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(o2 o2Var, boolean z10, boolean z11) {
        h5 h5Var;
        if (allowPresentFragment() && (h5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) h5Var;
            actionBarLayout.getClass();
            e5 e5Var = new e5(o2Var);
            e5Var.f20870b = z10;
            e5Var.f20871c = z11;
            e5Var.d = true;
            e5Var.e = false;
            e5Var.f20872f = null;
            if (actionBarLayout.S(e5Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        h5 h5Var;
        if (dialog != null && (h5Var = this.parentLayout) != null && !((ActionBarLayout) h5Var).A()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.Q && (z10 || !actionBarLayout.i())) {
                ArrayList<k2> arrayList = this.sheetsStack;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (this.sheetsStack.get(size).isShown() && this.sheetsStack.get(size).showDialog(dialog)) {
                            return dialog;
                        }
                    }
                }
                try {
                    Dialog dialog2 = this.visibleDialog;
                    if (dialog2 != null) {
                        dialog2.dismiss();
                        this.visibleDialog = null;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new ai.z3(5, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z10) {
        h5 h5Var;
        if (this.isFinished || (h5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) h5Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(e5 e5Var) {
        h5 h5Var;
        return allowPresentFragment() && (h5Var = this.parentLayout) != null && ((ActionBarLayout) h5Var).S(e5Var);
    }

    public z9 getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        z9 z9Var = null;
        z9 z9Var2 = (this.sheetsStack.isEmpty() || !(i2.o1.i(1, this.sheetsStack) instanceof z9)) ? null : (z9) i2.o1.i(1, this.sheetsStack);
        if (z9Var2 == null || z9Var2.h == i10) {
            z9Var = z9Var2;
        } else {
            z9Var2.q(true);
            removeSheet(z9Var2);
        }
        if (z9Var == null) {
            z9 z9Var3 = new z9(this);
            h5 h5Var = this.parentLayout;
            if (h5Var != null && ((ActionBarLayout) h5Var).f20616b) {
                z9Var3.f6259r1 = true;
            }
            this.sheetsStack.add(z9Var3);
            updateSheetsVisibility();
            return z9Var3;
        }
        return z9Var;
    }

    public void addThemeColorKeys(HashSet<Integer> hashSet) {
    }

    public void onBottomSheetCreated() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public void onFragmentClosed() {
    }

    public void onLowMemory() {
    }

    public void onPanTransitionEnd() {
    }

    public void onPanTransitionStart() {
    }

    public void onPanTranslationUpdate(float f7) {
    }

    public void onPreviewOpenAnimationEnd() {
    }

    public void onThemeColorsChanged() {
    }

    public void onUserLeaveHint() {
    }

    public void restoreSelfArgs(Bundle bundle) {
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setPreviewOpenedProgress(float f7) {
    }

    public void setPreviewReplaceProgress(float f7) {
    }

    public void onSlideProgress(boolean z10, float f7) {
    }

    public void onTransitionAnimationProgress(boolean z10, float f7) {
    }

    public void prepareFragmentToSlide(boolean z10, boolean z11) {
    }

    public void onActivityResultFragment(int i10, int i11, Intent intent) {
    }

    public void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
    }

    public void onInsets(int i10, int i11, int i12, int i13) {
    }
}

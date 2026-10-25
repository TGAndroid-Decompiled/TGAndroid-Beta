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
import di.l7;
import di.x9;
import di.y9;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ob;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e31;
import org.telegram.ui.hl0;
import org.telegram.ui.py;
public abstract class r2 {
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
    private ViewGroup listViewForSimpleGlass;
    protected View navigationBarFadeView;
    protected Dialog parentDialog;
    protected j5 parentLayout;
    private q2 previewDelegate;
    private boolean removingFromStack;
    protected u6 resourceProvider;
    public ArrayList<n2> sheetsStack;
    protected r5 simpleActionBar;
    private oi.a simpleGlass;
    private z5 simpleMenuOverlay;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final oi.q glassEngine = new oi.q();
    private final u6 themedColors = new c2(this, 1);
    protected i0.b mSystemInsets = i0.b.e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public r2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new l2(this));
    }

    public static boolean hasFullyVisibleSheets(r2 r2Var) {
        py w10;
        if (r2Var != null) {
            if (!r2Var.hasShownFullyVisibleSheet()) {
                if ((r2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) r2Var.getParentLayout()).w()) != null && w10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(r2 r2Var) {
        py w10;
        if (r2Var != null) {
            if (!r2Var.hasShownSheet()) {
                if ((r2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) r2Var.getParentLayout()).w()) != null && w10.hasShownSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean T(MotionEvent motionEvent, boolean z10) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(n2 n2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        y9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f9463v0 = n2Var;
            n2Var.setOnDismissListener(new di.s3(lastStoryViewer, 3));
        }
        this.sheetsStack.add(n2Var);
        updateSheetsVisibility();
    }

    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return true;
    }

    public boolean allowPresentFragment() {
        return true;
    }

    public void attachSheets(w wVar) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                n2 n2Var = this.sheetsStack.get(i10);
                if (n2Var != null && n2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(n2Var.getWindowView());
                    wVar.addView(n2Var.getWindowView());
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
        ArrayList<n2> arrayList = this.sheetsStack;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            this.actionBar = null;
        }
        r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            AndroidUtilities.removeFromParent(r5Var);
            this.simpleActionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeSheet() {
        ArrayList<n2> arrayList = this.sheetsStack;
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
        j5 j5Var;
        k kVar = new k(context, getResourceProvider());
        f7.i(y6.f23634s8, kVar, this.themedColors);
        f7.m(kVar, 3, y6.f23654t8, this.themedColors);
        f7.a(kVar, y6.f23767z8, this.themedColors, true);
        f7.m(kVar, 1, y6.f23692v8, this.themedColors);
        f7.b(kVar, y6.f23748y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((j5Var = this.parentLayout) == null || !((ActionBarLayout) j5Var).S0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
    }

    public org.telegram.ui.j4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.v3) && getLastSheet().isShown()) {
                return ((org.telegram.ui.v3) getLastSheet()).K;
            }
            j5 j5Var = this.parentLayout;
            if ((j5Var instanceof ActionBarLayout) && ((ActionBarLayout) j5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.v3)) {
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (v3Var.isShown()) {
                    return v3Var.K;
                }
            }
        }
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(this);
        org.telegram.ui.v3 v3Var2 = j4Var.K;
        addSheet(v3Var2);
        o3.b(v3Var2);
        return j4Var;
    }

    public y9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        y9 y9Var = new y9(this);
        j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).f22304b) {
            y9Var.f9455r1 = true;
        }
        this.sheetsStack.add(y9Var);
        updateSheetsVisibility();
        return y9Var;
    }

    public r5 createSimpleActionBar(Context context) {
        j5 j5Var;
        r5 r5Var = new r5(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((j5Var = this.parentLayout) == null || !((ActionBarLayout) j5Var).S0)) {
            return r5Var;
        }
        r5Var.setOccupyStatusBar(false);
        return r5Var;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                n2 n2Var = this.sheetsStack.get(i10);
                if (n2Var != null && n2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(n2Var.getWindowView());
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
        q2 q2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (q2Var = this.previewDelegate) != null) {
            ((e31) ((hl0) q2Var).f40032b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        j5 j5Var = this.parentLayout;
        if (j5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) j5Var;
            if (actionBarLayout.h || actionBarLayout.f22302a0) {
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

    public org.telegram.ui.j4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.v3) && getLastSheet().isShown()) {
            return ((org.telegram.ui.v3) getLastSheet()).K;
        }
        j5 j5Var = this.parentLayout;
        if ((j5Var instanceof ActionBarLayout) && ((ActionBarLayout) j5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.v3)) {
            org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
            if (v3Var.isShown()) {
                return v3Var.K;
            }
            return null;
        }
        return null;
    }

    public e5 getBackButtonState() {
        k kVar = this.actionBar;
        if (kVar != null) {
            return kVar.getBackButtonState();
        }
        return null;
    }

    public oi.a getBaseSimpleGlass() {
        if (this.simpleGlass == null) {
            this.simpleGlass = new oi.a(this.glassEngine, new n(this));
        }
        return this.simpleGlass;
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

    public e4 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return e4.f22601b;
        }
        return e4.f22600a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public r2 getFragmentForAlert(int i10) {
        j5 j5Var = this.parentLayout;
        if (j5Var != null && j5Var.getFragmentStack().size() > i10 + 1) {
            return (r2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i10);
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
        j5 j5Var = this.parentLayout;
        if (j5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) j5Var;
            if ((actionBarLayout.h && actionBarLayout.J == null) || actionBarLayout.f22302a0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public n2 getLastSheet() {
        ArrayList<n2> arrayList = this.sheetsStack;
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

    public y9 getLastStoryViewer() {
        ArrayList<n2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof y9) && this.sheetsStack.get(size).isShown()) {
                    return (y9) this.sheetsStack.get(size);
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

    public mm0 getListViewForSimpleGlass() {
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
        int w02 = y6.w0(y6.f23297a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                n2 n2Var = this.sheetsStack.get(i10);
                if (n2Var.attachedToParent()) {
                    w02 = n2Var.getNavigationBarColor(w02);
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

    public y9 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        y9 y9Var = (this.sheetsStack.isEmpty() || !(ic.a.g(1, this.sheetsStack) instanceof y9)) ? null : (y9) ic.a.g(1, this.sheetsStack);
        if (y9Var == null) {
            y9Var = new y9(this);
            j5 j5Var = this.parentLayout;
            if (j5Var != null && ((ActionBarLayout) j5Var).f22304b) {
                y9Var.f9455r1 = true;
            }
            this.sheetsStack.add(y9Var);
            updateSheetsVisibility();
        }
        return y9Var;
    }

    public Activity getParentActivity() {
        j5 j5Var = this.parentLayout;
        if (j5Var != null) {
            return j5Var.getParentActivity();
        }
        return null;
    }

    public j5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public u6 getResourceProvider() {
        return this.resourceProvider;
    }

    public gp0 getScrollViewForSimpleGlass() {
        return null;
    }

    public SecretChatHelper getSecretChatHelper() {
        return getAccountInstance().getSecretChatHelper();
    }

    public SendMessagesHelper getSendMessagesHelper() {
        return getAccountInstance().getSendMessagesHelper();
    }

    public r5 getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public z5 getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            r5 r5Var = this.simpleActionBar;
            if (r5Var != null && (r5Var.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        z5 z5Var = this.simpleMenuOverlay;
        if (z5Var == null || z5Var.getParent() != viewGroup) {
            z5 z5Var2 = this.simpleMenuOverlay;
            if (z5Var2 != null) {
                z5Var2.a(false);
                AndroidUtilities.removeFromParent(this.simpleMenuOverlay);
            }
            z5 z5Var3 = new z5(viewGroup.getContext());
            this.simpleMenuOverlay = z5Var3;
            viewGroup.addView(z5Var3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<h7> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i10) {
        return y6.w0(i10, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return y6.Q0(str);
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
        return y6.U0(str);
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
        ArrayList<n2> arrayList = this.sheetsStack;
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
        j5 j5Var = this.parentLayout;
        if (j5Var != null && j5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int x02;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || y6.C0().q()) {
                u6 resourceProvider = getResourceProvider();
                int i10 = y6.f23634s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.q()) {
                    i10 = y6.f23711w8;
                } else if (this.simpleActionBar != null) {
                    i10 = y6.f23297a7;
                }
                if (resourceProvider != null) {
                    x02 = resourceProvider.e(i10);
                } else {
                    x02 = y6.x0(null, i10, true);
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
                n2 n2Var = this.sheetsStack.get(i10);
                if ((n2Var instanceof y9) && view == ((y9) n2Var).f9456s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.r2.movePreviewFragment(float):void");
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
        String title;
        this.isFullyVisible = true;
        if (((AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility")).isEnabled() && ((actionBar = getActionBar()) != null || this.simpleActionBar != null)) {
            if (actionBar != null) {
                title = actionBar.getTitle();
            } else {
                title = this.simpleActionBar.getTitle();
            }
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
            kVar.L();
            z zVar = kVar.E;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zVar.getChildAt(i10);
                    if (childAt instanceof w0) {
                        ((w0) childAt).o();
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
        r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (y6.x0(null, y6.f23634s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(parentActivity, z10);
        }
        ArrayList<n2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                n2 n2Var = this.sheetsStack.get(size);
                n2Var.setLastVisible(false);
                n2Var.dismiss(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        this.mSystemInsets = defaultWindowInsets;
        ViewGroup viewGroup = this.listViewForSimpleGlass;
        if (viewGroup != null) {
            oi.a.d(viewGroup, defaultWindowInsets.f13451b, defaultWindowInsets.d, k.getCurrentActionBarHeight(), 0);
        }
        if (this.navigationBarFadeView != null) {
            if (this.mSystemInsets.d < AndroidUtilities.dp(40.0f)) {
                i10 = 8;
            }
            this.navigationBarFadeView.getLayoutParams().height = this.mSystemInsets.d;
            this.navigationBarFadeView.setVisibility(i10);
        }
        int i11 = defaultWindowInsets.f13450a;
        int i12 = defaultWindowInsets.f13451b;
        int i13 = defaultWindowInsets.f13452c;
        int i14 = defaultWindowInsets.d;
        this.bottomInset = i14;
        onInsets(i11, i12, i13, i14);
        return r0.k1.f47114b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = false;
            kVar.L();
            z zVar = kVar.E;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zVar.getChildAt(i10);
                    if (childAt instanceof w0) {
                        ((w0) childAt).o();
                    }
                }
            }
        }
        z5 z5Var = this.simpleMenuOverlay;
        if (z5Var != null) {
            z5Var.a(false);
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
            y9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f9458s1 = true;
            x9 x9Var = lastStoryViewer.f9472z0;
            if (x9Var != null) {
                x9Var.release(null);
                lastStoryViewer.f9472z0 = null;
            }
            if (lastStoryViewer.E0 == null) {
                fi.b4 b4Var = lastStoryViewer.D0;
                if (b4Var != null) {
                    b4Var.d(0L, null);
                }
                di.h1 h1Var = lastStoryViewer.A0;
                if (h1Var != null) {
                    if (h1Var.f8608n) {
                        h1Var.s(null);
                    } else {
                        h1Var.e();
                    }
                    lastStoryViewer.A0 = null;
                }
            }
            l7 l7Var = lastStoryViewer.f9462u1;
            if (l7Var != null) {
                l7Var.b();
            }
            getLastStoryViewer().P();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<n2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = true;
            kVar.L();
        }
        if (getLastStoryViewer() != null) {
            y9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f9458s1 = false;
            if (!org.telegram.ui.j4.x().V && lastStoryViewer.t() != null) {
                lastStoryViewer.t().d1(false);
            }
            l7 l7Var = lastStoryViewer.f9462u1;
            if (l7Var != null) {
                l7Var.a(false);
            }
            if (di.o1.Z.S) {
                di.o1.j();
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
        this.glassEngine.i(view);
    }

    public View performCreateView(Context context) {
        mm0 mm0Var;
        View createView = createView(context);
        mm0 listViewForSimpleGlass = getListViewForSimpleGlass();
        gp0 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            mm0Var = listViewForSimpleGlass;
        } else {
            mm0Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = mm0Var;
        if (mm0Var != null && (createView instanceof FrameLayout)) {
            oi.a baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.e((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                u6 u6Var = this.resourceProvider;
                baseSimpleGlass.f19423g = frameLayout;
                baseSimpleGlass.h = scrollViewForSimpleGlass;
                baseSimpleGlass.f19424i = new bi.g(3, scrollViewForSimpleGlass, frameLayout);
                oi.q qVar = baseSimpleGlass.f19419a;
                qVar.getClass();
                scrollViewForSimpleGlass.L.add(new oi.k(qVar, scrollViewForSimpleGlass));
                oi.l lVar = new oi.l(qVar);
                if (scrollViewForSimpleGlass.J == null) {
                    scrollViewForSimpleGlass.J = new ArrayList();
                }
                if (!scrollViewForSimpleGlass.J.contains(lVar)) {
                    scrollViewForSimpleGlass.J.add(lVar);
                }
                scrollViewForSimpleGlass.setClipToPadding(false);
                baseSimpleGlass.f(frameLayout, view, u6Var);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            i0.b bVar = this.mSystemInsets;
            oi.a.d(viewGroup, bVar.f13451b, bVar.d, k.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams i10 = gb1.i(-1, 0, 80);
                i10.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, i10);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(r2 r2Var) {
        j5 j5Var;
        return allowPresentFragment() && (j5Var = this.parentLayout) != null && ((ActionBarLayout) j5Var).R(r2Var);
    }

    public boolean presentFragmentAsPreview(r2 r2Var) {
        j5 j5Var;
        if (allowPresentFragment() && (j5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) j5Var;
            actionBarLayout.getClass();
            g5 g5Var = new g5(r2Var);
            g5Var.e = true;
            if (actionBarLayout.T(g5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(r2 r2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        j5 j5Var;
        if (allowPresentFragment() && (j5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) j5Var;
            actionBarLayout.getClass();
            g5 g5Var = new g5(r2Var);
            g5Var.e = true;
            g5Var.f22663f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.T(g5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(n2 n2Var) {
        ArrayList<n2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(n2Var);
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
        j5 j5Var = this.parentLayout;
        if (j5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) j5Var;
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
        j5 j5Var = this.parentLayout;
        if (j5Var != null) {
            j5Var.setFragmentPanTranslationOffset(i10);
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
        r5 r5Var = this.simpleActionBar;
        if (r5Var != null) {
            r5Var.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i10) {
        if (this.sheetsStack != null) {
            for (int i11 = 0; i11 < this.sheetsStack.size(); i11++) {
                n2 n2Var = this.sheetsStack.get(i11);
                if (n2Var != null) {
                    n2Var.setKeyboardHeightFromParent(i10);
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
            j5 j5Var = this.parentLayout;
            if (j5Var != null) {
                j5Var.setNavigationBarColor(i10);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(r2 r2Var) {
        setParentLayout(r2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentLayout(j5 j5Var) {
        boolean z10;
        j5 j5Var2;
        ViewGroup viewGroup;
        if (this.parentLayout != j5Var) {
            this.parentLayout = j5Var;
            boolean z11 = false;
            if (j5Var != null && ((ActionBarLayout) j5Var).f22314f) {
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
                j5 j5Var3 = this.parentLayout;
                if (j5Var3 != null && j5Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                j5 j5Var4 = this.parentLayout;
                if (j5Var4 != null && j5Var4.getView().getContext() != this.actionBar.getContext()) {
                    z11 = true;
                }
                k kVar = this.actionBar;
                if ((kVar.K || z11) && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z11) {
                    this.actionBar = null;
                }
            }
            if (this.simpleActionBar != null && (j5Var2 = this.parentLayout) != null && j5Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                AndroidUtilities.removeFromParent(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    r5 createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            return r2.this.getSimpleMenuOverlay();
                        }
                    });
                    return;
                }
                return;
            }
            j5 j5Var5 = this.parentLayout;
            if (j5Var5 != null && this.actionBar == null) {
                k createActionBar = createActionBar(j5Var5.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f22786t0 = this;
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

    public void setPreviewDelegate(q2 q2Var) {
        this.previewDelegate = q2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(u6 u6Var) {
        this.resourceProvider = u6Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.H(str, i10, runnable);
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

    public j5[] showAsSheet(r2 r2Var) {
        return showAsSheet(r2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        j5 j5Var = this.parentLayout;
        if (j5Var != null && (activity = (actionBarLayout = (ActionBarLayout) j5Var).Q0) != null) {
            if (actionBarLayout.W) {
                AnimatorSet animatorSet = actionBarLayout.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.K = null;
                }
                if (actionBarLayout.E0 != null) {
                    actionBarLayout.J();
                } else if (actionBarLayout.F0 != null) {
                    actionBarLayout.M();
                }
                actionBarLayout.f22341s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i10);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                n2 n2Var = this.sheetsStack.get(i10);
                boolean z10 = true;
                if (i10 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                n2Var.setLastVisible(z10);
            }
        }
    }

    public boolean useFadeDrawableForActionBar() {
        return true;
    }

    public boolean useSimpleActionBar() {
        return false;
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public boolean presentFragment(r2 r2Var, boolean z10) {
        j5 j5Var;
        return allowPresentFragment() && (j5Var = this.parentLayout) != null && ((ActionBarLayout) j5Var).S(r2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        j5 j5Var;
        if (this.isFinished || (j5Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) j5Var).c0(this, z10);
        }
    }

    public j5[] showAsSheet(r2 r2Var, p2 p2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        j5[] j5VarArr = {new d5(getParentActivity(), new p(r7, 4))};
        j5VarArr[0].setIsSheet(true);
        LaunchActivity.I1.P.add(j5VarArr[0]);
        r2Var.onTransitionAnimationStart(true, false);
        m2 m2Var = new m2(getParentActivity(), r2Var.getResourceProvider(), p2Var, j5VarArr, r2Var, r7);
        k3[] k3VarArr = {m2Var};
        if (p2Var != null) {
            m2Var.setAllowNestedScroll(false);
            k3VarArr[0].transitionFromRight(p2Var.f22926a);
        }
        k3 k3Var = k3VarArr[0];
        r2Var.parentDialog = k3Var;
        k3Var.setOpenNoDelay(true);
        k3VarArr[0].show();
        return j5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(r2 r2Var, boolean z10, boolean z11) {
        j5 j5Var;
        if (allowPresentFragment() && (j5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) j5Var;
            actionBarLayout.getClass();
            g5 g5Var = new g5(r2Var);
            g5Var.f22661b = z10;
            g5Var.f22662c = z11;
            g5Var.d = true;
            g5Var.e = false;
            g5Var.f22663f = null;
            if (actionBarLayout.T(g5Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        j5 j5Var;
        if (dialog != null && (j5Var = this.parentLayout) != null && !((ActionBarLayout) j5Var).A()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.Q && (z10 || !actionBarLayout.i())) {
                ArrayList<n2> arrayList = this.sheetsStack;
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
                    this.visibleDialog.setOnDismissListener(new bi.u3(5, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z10) {
        j5 j5Var;
        if (this.isFinished || (j5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) j5Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(g5 g5Var) {
        j5 j5Var;
        return allowPresentFragment() && (j5Var = this.parentLayout) != null && ((ActionBarLayout) j5Var).T(g5Var);
    }

    public y9 getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        y9 y9Var = null;
        y9 y9Var2 = (this.sheetsStack.isEmpty() || !(ic.a.g(1, this.sheetsStack) instanceof y9)) ? null : (y9) ic.a.g(1, this.sheetsStack);
        if (y9Var2 == null || y9Var2.h == i10) {
            y9Var = y9Var2;
        } else {
            y9Var2.q(true);
            removeSheet(y9Var2);
        }
        if (y9Var == null) {
            y9 y9Var3 = new y9(this);
            j5 j5Var = this.parentLayout;
            if (j5Var != null && ((ActionBarLayout) j5Var).f22304b) {
                y9Var3.f9455r1 = true;
            }
            this.sheetsStack.add(y9Var3);
            updateSheetsVisibility();
            return y9Var3;
        }
        return y9Var;
    }

    public void onBottomSheetCreated() {
    }

    public void onFragmentClosed() {
    }

    public void onLowMemory() {
    }

    public void onPanTransitionEnd() {
    }

    public void onPanTransitionStart() {
    }

    public void onPreviewOpenAnimationEnd() {
    }

    public void onThemeColorsChanged() {
    }

    public void onUserLeaveHint() {
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void addThemeColorKeys(HashSet<Integer> hashSet) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public void onPanTranslationUpdate(float f7) {
    }

    public void restoreSelfArgs(Bundle bundle) {
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

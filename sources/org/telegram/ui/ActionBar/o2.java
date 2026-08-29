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
import java.util.ArrayList;
import lh.h9;
import lh.i9;
import lh.w6;
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
import org.telegram.ui.Components.kb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h31;
import org.telegram.ui.sy;
import org.telegram.ui.zk0;
public abstract class o2 {
    protected l actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private kb bulletinDelegate;
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
    protected b5 parentLayout;
    private n2 previewDelegate;
    private boolean removingFromStack;
    protected c6 resourceProvider;
    public ArrayList<k2> sheetsStack;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public o2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new i2(this));
    }

    public static boolean hasFullyVisibleSheets(o2 o2Var) {
        sy w10;
        if (o2Var != null) {
            if (!o2Var.hasShownFullyVisibleSheet()) {
                if ((o2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) o2Var.getParentLayout()).w()) != null && w10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(o2 o2Var) {
        sy w10;
        if (o2Var != null) {
            if (!o2Var.hasShownSheet()) {
                if ((o2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) o2Var.getParentLayout()).w()) != null && w10.hasShownSheet()) {
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
        i9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f15781r0 = k2Var;
            k2Var.setOnDismissListener(new lh.j3(lastStoryViewer, 3));
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

    public void attachSheets(x xVar) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                k2 k2Var = this.sheetsStack.get(i10);
                if (k2Var != null && k2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(k2Var.getWindowView());
                    xVar.addView(k2Var.getWindowView());
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            this.fragmentView = null;
        }
        l lVar = this.actionBar;
        if (lVar != null) {
            ViewGroup viewGroup2 = (ViewGroup) lVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e11) {
                    FileLog.e(e11);
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

    public l createActionBar(Context context) {
        b5 b5Var;
        l lVar = new l(context, getResourceProvider());
        lVar.setBackgroundColor(getThemedColor(g6.f23329s8));
        lVar.B(getThemedColor(g6.f23348t8), false);
        lVar.B(getThemedColor(g6.f23452z8), true);
        lVar.C(getThemedColor(g6.f23385v8), false);
        lVar.C(getThemedColor(g6.y8), true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((b5Var = this.parentLayout) == null || !((ActionBarLayout) b5Var).I0)) {
            return lVar;
        }
        lVar.setOccupyStatusBar(false);
        return lVar;
    }

    public org.telegram.ui.m4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.z3) && getLastSheet().isShown()) {
                return ((org.telegram.ui.z3) getLastSheet()).G;
            }
            b5 b5Var = this.parentLayout;
            if ((b5Var instanceof ActionBarLayout) && ((ActionBarLayout) b5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.z3)) {
                org.telegram.ui.z3 z3Var = (org.telegram.ui.z3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (z3Var.isShown()) {
                    return z3Var.G;
                }
            }
        }
        org.telegram.ui.m4 m4Var = new org.telegram.ui.m4(this);
        org.telegram.ui.z3 z3Var2 = m4Var.G;
        addSheet(z3Var2);
        i3.b(z3Var2);
        return m4Var;
    }

    public i9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = new i9(this);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).f22659b) {
            i9Var.f15773n1 = true;
        }
        this.sheetsStack.add(i9Var);
        updateSheetsVisibility();
        return i9Var;
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
        } catch (Exception e10) {
            FileLog.e(e10);
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
            ((h31) ((zk0) n2Var).f45255b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        b5 b5Var = this.parentLayout;
        if (b5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            if (actionBarLayout.h || actionBarLayout.T) {
                Runnable runnable = actionBarLayout.f22667e;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    actionBarLayout.f22667e = null;
                }
                actionBarLayout.l(true, false);
            }
        }
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.currentAccount);
    }

    public l getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public org.telegram.ui.m4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.z3) && getLastSheet().isShown()) {
            return ((org.telegram.ui.z3) getLastSheet()).G;
        }
        b5 b5Var = this.parentLayout;
        if ((b5Var instanceof ActionBarLayout) && ((ActionBarLayout) b5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.z3)) {
            org.telegram.ui.z3 z3Var = (org.telegram.ui.z3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
            if (z3Var.isShown()) {
                return z3Var.G;
            }
            return null;
        }
        return null;
    }

    public x4 getBackButtonState() {
        l lVar = this.actionBar;
        if (lVar != null) {
            return lVar.getBackButtonState();
        }
        return null;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public kb getBulletinDelegate() {
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

    public Animator getCustomSlideTransition(boolean z10, boolean z11, float f9) {
        return null;
    }

    public DownloadController getDownloadController() {
        return getAccountInstance().getDownloadController();
    }

    public y3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return y3.f23983b;
        }
        return y3.f23982a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public o2 getFragmentForAlert(int i10) {
        b5 b5Var = this.parentLayout;
        if (b5Var != null && b5Var.getFragmentStack().size() > i10 + 1) {
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
        b5 b5Var = this.parentLayout;
        if (b5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            if ((actionBarLayout.h && actionBarLayout.F == null) || actionBarLayout.T) {
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

    public i9 getLastStoryViewer() {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof i9) && this.sheetsStack.get(size).isShown()) {
                    return (i9) this.sheetsStack.get(size);
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
        int v02 = g6.v0(g6.f23009a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                k2 k2Var = this.sheetsStack.get(i10);
                if (k2Var.attachedToParent()) {
                    v02 = k2Var.getNavigationBarColor(v02);
                }
            }
        }
        return v02;
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

    public i9 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = (this.sheetsStack.isEmpty() || !(j7.l1.i(1, this.sheetsStack) instanceof i9)) ? null : (i9) j7.l1.i(1, this.sheetsStack);
        if (i9Var == null) {
            i9Var = new i9(this);
            b5 b5Var = this.parentLayout;
            if (b5Var != null && ((ActionBarLayout) b5Var).f22659b) {
                i9Var.f15773n1 = true;
            }
            this.sheetsStack.add(i9Var);
            updateSheetsVisibility();
        }
        return i9Var;
    }

    public Activity getParentActivity() {
        b5 b5Var = this.parentLayout;
        if (b5Var != null) {
            return b5Var.getParentActivity();
        }
        return null;
    }

    public b5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public c6 getResourceProvider() {
        return this.resourceProvider;
    }

    public SecretChatHelper getSecretChatHelper() {
        return getAccountInstance().getSecretChatHelper();
    }

    public SendMessagesHelper getSendMessagesHelper() {
        return getAccountInstance().getSendMessagesHelper();
    }

    public ArrayList<i6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i10) {
        return g6.v0(i10, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return g6.O0(str);
    }

    public Paint getThemedPaint(String str) {
        Paint paint;
        if (getResourceProvider() != null) {
            paint = getResourceProvider().G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return g6.S0(str);
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
        b5 b5Var = this.parentLayout;
        if (b5Var != null && b5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int w02;
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            if (!hasForceLightStatusBar() || g6.A0().q()) {
                c6 resourceProvider = getResourceProvider();
                int i10 = g6.f23329s8;
                l lVar = this.actionBar;
                if (lVar != null && lVar.s()) {
                    i10 = g6.f23403w8;
                }
                if (resourceProvider != null) {
                    w02 = resourceProvider.h0(i10);
                } else {
                    w02 = g6.w0(null, i10, true);
                }
                if (i0.a.f(w02) <= 0.699999988079071d) {
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
                if ((k2Var instanceof i9) && view == ((i9) k2Var).f15783s) {
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
        l actionBar;
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.f23638z0 = false;
            lVar.P();
            a0 a0Var = lVar.A;
            if (a0Var != null) {
                int childCount = a0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = a0Var.getChildAt(i10);
                    if (childAt instanceof w0) {
                        ((w0) childAt).n();
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
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (g6.w0(null, g6.f23329s8, false) == -1) {
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

    public r0.m1 onInsetsInternal(View view, r0.m1 m1Var) {
        i0.b f9 = m1Var.f46843a.f(3);
        int i10 = f9.f8186a;
        int i11 = f9.f8187b;
        int i12 = f9.f8188c;
        int i13 = f9.d;
        this.bottomInset = i13;
        onInsets(i10, i11, i12, i13);
        return r0.m1.f46842b;
    }

    public void onPause() {
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.f23638z0 = false;
            lVar.P();
            a0 a0Var = lVar.A;
            if (a0Var != null) {
                int childCount = a0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = a0Var.getChildAt(i10);
                    if (childAt instanceof w0) {
                        ((w0) childAt).n();
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (getLastStoryViewer() != null) {
            i9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f15775o1 = true;
            h9 h9Var = lastStoryViewer.f15788v0;
            if (h9Var != null) {
                h9Var.release(null);
                lastStoryViewer.f15788v0 = null;
            }
            if (lastStoryViewer.A0 == null) {
                nh.y3 y3Var = lastStoryViewer.f15795z0;
                if (y3Var != null) {
                    y3Var.d(0L, null);
                }
                lh.d1 d1Var = lastStoryViewer.f15790w0;
                if (d1Var != null) {
                    if (d1Var.f15458n) {
                        d1Var.s(null);
                    } else {
                        d1Var.e();
                    }
                    lastStoryViewer.f15790w0 = null;
                }
            }
            w6 w6Var = lastStoryViewer.f15779q1;
            if (w6Var != null) {
                w6Var.b();
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
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.f23638z0 = true;
            lVar.P();
        }
        if (getLastStoryViewer() != null) {
            i9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f15775o1 = false;
            if (!org.telegram.ui.m4.x().R && lastStoryViewer.t() != null) {
                lastStoryViewer.t().f1(false);
            }
            w6 w6Var = lastStoryViewer.f15779q1;
            if (w6Var != null) {
                w6Var.a(false);
            }
            if (lh.i1.V.O) {
                lh.i1.j();
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

    public View performCreateView(Context context) {
        return createView(context);
    }

    public boolean presentFragment(o2 o2Var) {
        b5 b5Var;
        return allowPresentFragment() && (b5Var = this.parentLayout) != null && ((ActionBarLayout) b5Var).P(o2Var);
    }

    public boolean presentFragmentAsPreview(o2 o2Var) {
        b5 b5Var;
        if (allowPresentFragment() && (b5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            actionBarLayout.getClass();
            z4 z4Var = new z4(o2Var);
            z4Var.f24015e = true;
            if (actionBarLayout.R(z4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(o2 o2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        b5 b5Var;
        if (allowPresentFragment() && (b5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            actionBarLayout.getClass();
            z4 z4Var = new z4(o2Var);
            z4Var.f24015e = true;
            z4Var.f24016f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.R(z4Var)) {
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
        b5 b5Var = this.parentLayout;
        if (b5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            actionBarLayout.N0 = true;
            Runnable runnable = actionBarLayout.f22667e;
            if (runnable != null && actionBarLayout.d == null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.f22667e.run();
                actionBarLayout.f22667e = null;
            }
        }
    }

    public void setBulletinDelegate(kb kbVar) {
        this.bulletinDelegate = kbVar;
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
        b5 b5Var = this.parentLayout;
        if (b5Var != null) {
            b5Var.setFragmentPanTranslationOffset(i10);
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
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setOccupyStatusBar(!z10);
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
                ((LaunchActivity) parentActivity).z0(i10);
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
            b5 b5Var = this.parentLayout;
            if (b5Var != null) {
                b5Var.setNavigationBarColor(i10);
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

    public void setParentLayout(b5 b5Var) {
        boolean z10;
        ViewGroup viewGroup;
        if (this.parentLayout != b5Var) {
            this.parentLayout = b5Var;
            boolean z11 = false;
            if (b5Var != null && ((ActionBarLayout) b5Var).f22670f) {
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                b5 b5Var2 = this.parentLayout;
                if (b5Var2 != null && b5Var2.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                b5 b5Var3 = this.parentLayout;
                if (b5Var3 != null && b5Var3.getView().getContext() != this.actionBar.getContext()) {
                    z11 = true;
                }
                l lVar = this.actionBar;
                if ((lVar.G || z11) && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                if (z11) {
                    this.actionBar = null;
                }
            }
            b5 b5Var4 = this.parentLayout;
            if (b5Var4 != null && this.actionBar == null) {
                l createActionBar = createActionBar(b5Var4.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f23623p0 = this;
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

    public void setResourceProvider(c6 c6Var) {
        this.resourceProvider = c6Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.J(str, i10, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        l lVar = this.actionBar;
        if (lVar != null && lVar.G) {
            setTitleOverlayText(str, i10, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public b5[] showAsSheet(o2 o2Var) {
        return showAsSheet(o2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        b5 b5Var = this.parentLayout;
        if (b5Var != null && (activity = (actionBarLayout = (ActionBarLayout) b5Var).G0) != null) {
            if (actionBarLayout.S) {
                AnimatorSet animatorSet = actionBarLayout.G;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.G = null;
                }
                if (actionBarLayout.f22694u0 != null) {
                    actionBarLayout.H();
                } else if (actionBarLayout.f22695v0 != null) {
                    actionBarLayout.K();
                }
                actionBarLayout.f22691s.invalidate();
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
        b5 b5Var;
        return allowPresentFragment() && (b5Var = this.parentLayout) != null && ((ActionBarLayout) b5Var).Q(o2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        b5 b5Var;
        if (this.isFinished || (b5Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) b5Var).a0(this, z10);
        }
    }

    public b5[] showAsSheet(o2 o2Var, m2 m2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        b5[] b5VarArr = {new w4(getParentActivity(), new o(r7, 5))};
        b5VarArr[0].setIsSheet(true);
        LaunchActivity.C1.L.add(b5VarArr[0]);
        o2Var.onTransitionAnimationStart(true, false);
        j2 j2Var = new j2(getParentActivity(), o2Var.getResourceProvider(), m2Var, b5VarArr, o2Var, r7);
        f3[] f3VarArr = {j2Var};
        if (m2Var != null) {
            j2Var.setAllowNestedScroll(false);
            f3VarArr[0].transitionFromRight(m2Var.f23673a);
        }
        f3 f3Var = f3VarArr[0];
        o2Var.parentDialog = f3Var;
        f3Var.setOpenNoDelay(true);
        f3VarArr[0].show();
        return b5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(o2 o2Var, boolean z10, boolean z11) {
        b5 b5Var;
        if (allowPresentFragment() && (b5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            actionBarLayout.getClass();
            z4 z4Var = new z4(o2Var);
            z4Var.f24013b = z10;
            z4Var.f24014c = z11;
            z4Var.d = true;
            z4Var.f24015e = false;
            z4Var.f24016f = null;
            if (actionBarLayout.R(z4Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        b5 b5Var;
        if (dialog != null && (b5Var = this.parentLayout) != null && !((ActionBarLayout) b5Var).A()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.M && (z10 || !actionBarLayout.j())) {
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new eg.g(2, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z10) {
        b5 b5Var;
        if (this.isFinished || (b5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) b5Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(z4 z4Var) {
        b5 b5Var;
        return allowPresentFragment() && (b5Var = this.parentLayout) != null && ((ActionBarLayout) b5Var).R(z4Var);
    }

    public i9 getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = null;
        i9 i9Var2 = (this.sheetsStack.isEmpty() || !(j7.l1.i(1, this.sheetsStack) instanceof i9)) ? null : (i9) j7.l1.i(1, this.sheetsStack);
        if (i9Var2 == null || i9Var2.h == i10) {
            i9Var = i9Var2;
        } else {
            i9Var2.q(true);
            removeSheet(i9Var2);
        }
        if (i9Var == null) {
            i9 i9Var3 = new i9(this);
            b5 b5Var = this.parentLayout;
            if (b5Var != null && ((ActionBarLayout) b5Var).f22659b) {
                i9Var3.f15773n1 = true;
            }
            this.sheetsStack.add(i9Var3);
            updateSheetsVisibility();
            return i9Var3;
        }
        return i9Var;
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

    public void onPanTranslationUpdate(float f9) {
    }

    public void onPreviewOpenAnimationEnd() {
    }

    public void onUserLeaveHint() {
    }

    public void restoreSelfArgs(Bundle bundle) {
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setPreviewOpenedProgress(float f9) {
    }

    public void setPreviewReplaceProgress(float f9) {
    }

    public void onSlideProgress(boolean z10, float f9) {
    }

    public void onTransitionAnimationProgress(boolean z10, float f9) {
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

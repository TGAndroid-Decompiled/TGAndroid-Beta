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
import org.telegram.ui.Components.nb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jz;
import org.telegram.ui.r41;
import org.telegram.ui.ul0;
import zh.t7;
import zh.u7;
public abstract class p2 {
    protected l actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private nb bulletinDelegate;
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
    protected f5 parentLayout;
    private o2 previewDelegate;
    private boolean removingFromStack;
    protected f6 resourceProvider;
    public ArrayList<l2> sheetsStack;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public p2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new j2(this));
    }

    public static boolean hasFullyVisibleSheets(p2 p2Var) {
        jz w10;
        if (p2Var != null) {
            if (!p2Var.hasShownFullyVisibleSheet()) {
                if ((p2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) p2Var.getParentLayout()).w()) != null && w10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(p2 p2Var) {
        jz w10;
        if (p2Var != null) {
            if (!p2Var.hasShownSheet()) {
                if ((p2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) p2Var.getParentLayout()).w()) != null && w10.hasShownSheet()) {
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

    public void addSheet(l2 l2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        u7 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f48965v0 = l2Var;
            l2Var.setOnDismissListener(new zh.j2(lastStoryViewer, 3));
        }
        this.sheetsStack.add(l2Var);
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
                l2 l2Var = this.sheetsStack.get(i10);
                if (l2Var != null && l2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(l2Var.getWindowView());
                    wVar.addView(l2Var.getWindowView());
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
        ArrayList<l2> arrayList = this.sheetsStack;
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
        l lVar = this.actionBar;
        if (lVar != null) {
            ViewGroup viewGroup2 = (ViewGroup) lVar.getParent();
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
        ArrayList<l2> arrayList = this.sheetsStack;
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
        f5 f5Var;
        l lVar = new l(context, getResourceProvider());
        lVar.setBackgroundColor(getThemedColor(j6.f18201s8));
        lVar.A(getThemedColor(j6.f18220t8), false);
        lVar.A(getThemedColor(j6.f18327z8), true);
        lVar.C(getThemedColor(j6.f18256v8), false);
        lVar.C(getThemedColor(j6.f18308y8), true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((f5Var = this.parentLayout) == null || !((ActionBarLayout) f5Var).M0)) {
            return lVar;
        }
        lVar.setOccupyStatusBar(false);
        return lVar;
    }

    public org.telegram.ui.j4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.w3) && getLastSheet().isShown()) {
                return ((org.telegram.ui.w3) getLastSheet()).K;
            }
            f5 f5Var = this.parentLayout;
            if ((f5Var instanceof ActionBarLayout) && ((ActionBarLayout) f5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.w3)) {
                org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (w3Var.isShown()) {
                    return w3Var.K;
                }
            }
        }
        org.telegram.ui.j4 j4Var = new org.telegram.ui.j4(this);
        org.telegram.ui.w3 w3Var2 = j4Var.K;
        addSheet(w3Var2);
        k3.b(w3Var2);
        return j4Var;
    }

    public u7 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        u7 u7Var = new u7(this);
        f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).f17472b) {
            u7Var.f48957r1 = true;
        }
        this.sheetsStack.add(u7Var);
        updateSheetsVisibility();
        return u7Var;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                l2 l2Var = this.sheetsStack.get(i10);
                if (l2Var != null && l2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(l2Var.getWindowView());
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
        o2 o2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (o2Var = this.previewDelegate) != null) {
            ((r41) ((ul0) o2Var).f37294b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        f5 f5Var = this.parentLayout;
        if (f5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) f5Var;
            if (actionBarLayout.h || actionBarLayout.f17470a0) {
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

    public l getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public org.telegram.ui.j4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.w3) && getLastSheet().isShown()) {
            return ((org.telegram.ui.w3) getLastSheet()).K;
        }
        f5 f5Var = this.parentLayout;
        if ((f5Var instanceof ActionBarLayout) && ((ActionBarLayout) f5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.w3)) {
            org.telegram.ui.w3 w3Var = (org.telegram.ui.w3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
            if (w3Var.isShown()) {
                return w3Var.K;
            }
            return null;
        }
        return null;
    }

    public b5 getBackButtonState() {
        l lVar = this.actionBar;
        if (lVar != null) {
            return lVar.getBackButtonState();
        }
        return null;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public nb getBulletinDelegate() {
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
            return c4.f17573b;
        }
        return c4.f17572a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public p2 getFragmentForAlert(int i10) {
        f5 f5Var = this.parentLayout;
        if (f5Var != null && f5Var.getFragmentStack().size() > i10 + 1) {
            return (p2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i10);
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
        f5 f5Var = this.parentLayout;
        if (f5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) f5Var;
            if ((actionBarLayout.h && actionBarLayout.J == null) || actionBarLayout.f17470a0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public l2 getLastSheet() {
        ArrayList<l2> arrayList = this.sheetsStack;
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

    public u7 getLastStoryViewer() {
        ArrayList<l2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof u7) && this.sheetsStack.get(size).isShown()) {
                    return (u7) this.sheetsStack.get(size);
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
        int v02 = j6.v0(j6.f17872a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                l2 l2Var = this.sheetsStack.get(i10);
                if (l2Var.attachedToParent()) {
                    v02 = l2Var.getNavigationBarColor(v02);
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

    public u7 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        u7 u7Var = (this.sheetsStack.isEmpty() || !(hc.b.i(1, this.sheetsStack) instanceof u7)) ? null : (u7) hc.b.i(1, this.sheetsStack);
        if (u7Var == null) {
            u7Var = new u7(this);
            f5 f5Var = this.parentLayout;
            if (f5Var != null && ((ActionBarLayout) f5Var).f17472b) {
                u7Var.f48957r1 = true;
            }
            this.sheetsStack.add(u7Var);
            updateSheetsVisibility();
        }
        return u7Var;
    }

    public Activity getParentActivity() {
        f5 f5Var = this.parentLayout;
        if (f5Var != null) {
            return f5Var.getParentActivity();
        }
        return null;
    }

    public f5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public f6 getResourceProvider() {
        return this.resourceProvider;
    }

    public SecretChatHelper getSecretChatHelper() {
        return getAccountInstance().getSecretChatHelper();
    }

    public SendMessagesHelper getSendMessagesHelper() {
        return getAccountInstance().getSendMessagesHelper();
    }

    public ArrayList<l6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i10) {
        return j6.v0(i10, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return j6.O0(str);
    }

    public Paint getThemedPaint(String str) {
        Paint paint;
        if (getResourceProvider() != null) {
            paint = getResourceProvider().F(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return j6.S0(str);
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
        ArrayList<l2> arrayList = this.sheetsStack;
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
        f5 f5Var = this.parentLayout;
        if (f5Var != null && f5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int w02;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || j6.A0().q()) {
                f6 resourceProvider = getResourceProvider();
                int i10 = j6.f18201s8;
                l lVar = this.actionBar;
                if (lVar != null && lVar.s()) {
                    i10 = j6.f18273w8;
                }
                if (resourceProvider != null) {
                    w02 = resourceProvider.e0(i10);
                } else {
                    w02 = j6.w0(null, i10, true);
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
                l2 l2Var = this.sheetsStack.get(i10);
                if ((l2Var instanceof u7) && view == ((u7) l2Var).f48958s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.p2.movePreviewFragment(float):void");
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = false;
            lVar.P();
            z zVar = lVar.E;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zVar.getChildAt(i10);
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
            if (j6.w0(null, j6.f18201s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(parentActivity, z10);
        }
        ArrayList<l2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                l2 l2Var = this.sheetsStack.get(size);
                l2Var.setLastVisible(false);
                l2Var.dismiss(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        i0.c f7 = l1Var.f41074a.f(3);
        int i10 = f7.f10074a;
        int i11 = f7.f10075b;
        int i12 = f7.f10076c;
        int i13 = f7.d;
        this.bottomInset = i13;
        onInsets(i10, i11, i12, i13);
        return r0.l1.f41073b;
    }

    public void onPause() {
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = false;
            lVar.P();
            z zVar = lVar.E;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zVar.getChildAt(i10);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (getLastStoryViewer() != null) {
            u7 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f48960s1 = true;
            t7 t7Var = lastStoryViewer.f48974z0;
            if (t7Var != null) {
                t7Var.release(null);
                lastStoryViewer.f48974z0 = null;
            }
            if (lastStoryViewer.E0 == null) {
                bi.f5 f5Var = lastStoryViewer.D0;
                if (f5Var != null) {
                    f5Var.d(0L, null);
                }
                zh.t0 t0Var = lastStoryViewer.A0;
                if (t0Var != null) {
                    if (t0Var.f48882n) {
                        t0Var.s(null);
                    } else {
                        t0Var.e();
                    }
                    lastStoryViewer.A0 = null;
                }
            }
            zh.n5 n5Var = lastStoryViewer.f48964u1;
            if (n5Var != null) {
                n5Var.b();
            }
            getLastStoryViewer().P();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<l2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = true;
            lVar.P();
        }
        if (getLastStoryViewer() != null) {
            u7 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f48960s1 = false;
            if (!org.telegram.ui.j4.x().V && lastStoryViewer.t() != null) {
                lastStoryViewer.t().f1(false);
            }
            zh.n5 n5Var = lastStoryViewer.f48964u1;
            if (n5Var != null) {
                n5Var.a(false);
            }
            if (zh.x0.Z.S) {
                zh.x0.j();
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

    public boolean presentFragment(p2 p2Var) {
        f5 f5Var;
        return allowPresentFragment() && (f5Var = this.parentLayout) != null && ((ActionBarLayout) f5Var).P(p2Var);
    }

    public boolean presentFragmentAsPreview(p2 p2Var) {
        f5 f5Var;
        if (allowPresentFragment() && (f5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) f5Var;
            actionBarLayout.getClass();
            d5 d5Var = new d5(p2Var);
            d5Var.e = true;
            if (actionBarLayout.R(d5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(p2 p2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        f5 f5Var;
        if (allowPresentFragment() && (f5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) f5Var;
            actionBarLayout.getClass();
            d5 d5Var = new d5(p2Var);
            d5Var.e = true;
            d5Var.f17654f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.R(d5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(l2 l2Var) {
        ArrayList<l2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(l2Var);
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
        f5 f5Var = this.parentLayout;
        if (f5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) f5Var;
            actionBarLayout.R0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable != null && actionBarLayout.d == null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.e.run();
                actionBarLayout.e = null;
            }
        }
    }

    public void setBulletinDelegate(nb nbVar) {
        this.bulletinDelegate = nbVar;
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
        f5 f5Var = this.parentLayout;
        if (f5Var != null) {
            f5Var.setFragmentPanTranslationOffset(i10);
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
                l2 l2Var = this.sheetsStack.get(i11);
                if (l2Var != null) {
                    l2Var.setKeyboardHeightFromParent(i10);
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
            f5 f5Var = this.parentLayout;
            if (f5Var != null) {
                f5Var.setNavigationBarColor(i10);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(p2 p2Var) {
        setParentLayout(p2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentLayout(f5 f5Var) {
        boolean z10;
        ViewGroup viewGroup;
        if (this.parentLayout != f5Var) {
            this.parentLayout = f5Var;
            boolean z11 = false;
            if (f5Var != null && ((ActionBarLayout) f5Var).f17482f) {
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
                f5 f5Var2 = this.parentLayout;
                if (f5Var2 != null && f5Var2.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                f5 f5Var3 = this.parentLayout;
                if (f5Var3 != null && f5Var3.getView().getContext() != this.actionBar.getContext()) {
                    z11 = true;
                }
                l lVar = this.actionBar;
                if ((lVar.K || z11) && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
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
            f5 f5Var4 = this.parentLayout;
            if (f5Var4 != null && this.actionBar == null) {
                l createActionBar = createActionBar(f5Var4.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f18403t0 = this;
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

    public void setPreviewDelegate(o2 o2Var) {
        this.previewDelegate = o2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(f6 f6Var) {
        this.resourceProvider = f6Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.K(str, i10, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        l lVar = this.actionBar;
        if (lVar != null && lVar.K) {
            setTitleOverlayText(str, i10, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public f5[] showAsSheet(p2 p2Var) {
        return showAsSheet(p2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        f5 f5Var = this.parentLayout;
        if (f5Var != null && (activity = (actionBarLayout = (ActionBarLayout) f5Var).K0) != null) {
            if (actionBarLayout.W) {
                AnimatorSet animatorSet = actionBarLayout.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.K = null;
                }
                if (actionBarLayout.f17516y0 != null) {
                    actionBarLayout.H();
                } else if (actionBarLayout.f17517z0 != null) {
                    actionBarLayout.K();
                }
                actionBarLayout.f17506s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i10);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                l2 l2Var = this.sheetsStack.get(i10);
                boolean z10 = true;
                if (i10 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                l2Var.setLastVisible(z10);
            }
        }
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public boolean presentFragment(p2 p2Var, boolean z10) {
        f5 f5Var;
        return allowPresentFragment() && (f5Var = this.parentLayout) != null && ((ActionBarLayout) f5Var).Q(p2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        f5 f5Var;
        if (this.isFinished || (f5Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) f5Var).a0(this, z10);
        }
    }

    public f5[] showAsSheet(p2 p2Var, n2 n2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        f5[] f5VarArr = {new a5(getParentActivity(), new o(r7, 5))};
        f5VarArr[0].setIsSheet(true);
        LaunchActivity.G1.P.add(f5VarArr[0]);
        p2Var.onTransitionAnimationStart(true, false);
        k2 k2Var = new k2(getParentActivity(), p2Var.getResourceProvider(), n2Var, f5VarArr, p2Var, r7);
        h3[] h3VarArr = {k2Var};
        if (n2Var != null) {
            k2Var.setAllowNestedScroll(false);
            h3VarArr[0].transitionFromRight(n2Var.f18485a);
        }
        h3 h3Var = h3VarArr[0];
        p2Var.parentDialog = h3Var;
        h3Var.setOpenNoDelay(true);
        h3VarArr[0].show();
        return f5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(p2 p2Var, boolean z10, boolean z11) {
        f5 f5Var;
        if (allowPresentFragment() && (f5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) f5Var;
            actionBarLayout.getClass();
            d5 d5Var = new d5(p2Var);
            d5Var.f17652b = z10;
            d5Var.f17653c = z11;
            d5Var.d = true;
            d5Var.e = false;
            d5Var.f17654f = null;
            if (actionBarLayout.R(d5Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        f5 f5Var;
        if (dialog != null && (f5Var = this.parentLayout) != null && !((ActionBarLayout) f5Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.Q && (z10 || !actionBarLayout.j())) {
                ArrayList<l2> arrayList = this.sheetsStack;
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
                    this.visibleDialog.setOnDismissListener(new di.h0(3, this, onDismissListener));
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
        f5 f5Var;
        if (this.isFinished || (f5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) f5Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(d5 d5Var) {
        f5 f5Var;
        return allowPresentFragment() && (f5Var = this.parentLayout) != null && ((ActionBarLayout) f5Var).R(d5Var);
    }

    public u7 getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        u7 u7Var = null;
        u7 u7Var2 = (this.sheetsStack.isEmpty() || !(hc.b.i(1, this.sheetsStack) instanceof u7)) ? null : (u7) hc.b.i(1, this.sheetsStack);
        if (u7Var2 == null || u7Var2.h == i10) {
            u7Var = u7Var2;
        } else {
            u7Var2.q(true);
            removeSheet(u7Var2);
        }
        if (u7Var == null) {
            u7 u7Var3 = new u7(this);
            f5 f5Var = this.parentLayout;
            if (f5Var != null && ((ActionBarLayout) f5Var).f17472b) {
                u7Var3.f48957r1 = true;
            }
            this.sheetsStack.add(u7Var3);
            updateSheetsVisibility();
            return u7Var3;
        }
        return u7Var;
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

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
import nh.h9;
import nh.i9;
import nh.x6;
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
import org.telegram.ui.Components.fb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a41;
import org.telegram.ui.ez;
import org.telegram.ui.kl0;
public abstract class p2 {
    protected k actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private fb bulletinDelegate;
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
    protected e5 parentLayout;
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
        ez w10;
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
        ez w10;
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

    public boolean S(MotionEvent motionEvent, boolean z4) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(l2 l2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f15469s0 = l2Var;
            l2Var.setOnDismissListener(new nh.k3(lastStoryViewer, 3));
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
        k kVar = this.actionBar;
        if (kVar != null) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e6) {
                    FileLog.e(e6);
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

    public k createActionBar(Context context) {
        e5 e5Var;
        k kVar = new k(context, getResourceProvider());
        kVar.setBackgroundColor(getThemedColor(j6.f20151s8));
        kVar.B(getThemedColor(j6.f20167t8), false);
        kVar.B(getThemedColor(j6.f20275z8), true);
        kVar.C(getThemedColor(j6.f20202v8), false);
        kVar.C(getThemedColor(j6.f20258y8), true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((e5Var = this.parentLayout) == null || !((ActionBarLayout) e5Var).J0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
    }

    public org.telegram.ui.n4 createArticleViewer(boolean z4) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z4) {
            if ((getLastSheet() instanceof org.telegram.ui.a4) && getLastSheet().isShown()) {
                return ((org.telegram.ui.a4) getLastSheet()).H;
            }
            e5 e5Var = this.parentLayout;
            if ((e5Var instanceof ActionBarLayout) && ((ActionBarLayout) e5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.a4)) {
                org.telegram.ui.a4 a4Var = (org.telegram.ui.a4) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (a4Var.isShown()) {
                    return a4Var.H;
                }
            }
        }
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(this);
        org.telegram.ui.a4 a4Var2 = n4Var.H;
        addSheet(a4Var2);
        j3.b(a4Var2);
        return n4Var;
    }

    public i9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = new i9(this);
        e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).f19425b) {
            i9Var.f15460o1 = true;
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
            ((a41) ((kl0) o2Var).f35555b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            if (actionBarLayout.h || actionBarLayout.U) {
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

    public org.telegram.ui.n4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.a4) && getLastSheet().isShown()) {
            return ((org.telegram.ui.a4) getLastSheet()).H;
        }
        e5 e5Var = this.parentLayout;
        if ((e5Var instanceof ActionBarLayout) && ((ActionBarLayout) e5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.a4)) {
            org.telegram.ui.a4 a4Var = (org.telegram.ui.a4) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
            if (a4Var.isShown()) {
                return a4Var.H;
            }
            return null;
        }
        return null;
    }

    public a5 getBackButtonState() {
        k kVar = this.actionBar;
        if (kVar != null) {
            return kVar.getBackButtonState();
        }
        return null;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public fb getBulletinDelegate() {
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

    public Animator getCustomSlideTransition(boolean z4, boolean z10, float f10) {
        return null;
    }

    public DownloadController getDownloadController() {
        return getAccountInstance().getDownloadController();
    }

    public z3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return z3.f20758b;
        }
        return z3.f20757a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public p2 getFragmentForAlert(int i10) {
        e5 e5Var = this.parentLayout;
        if (e5Var != null && e5Var.getFragmentStack().size() > i10 + 1) {
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
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            if ((actionBarLayout.h && actionBarLayout.G == null) || actionBarLayout.U) {
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

    public i9 getLastStoryViewer() {
        ArrayList<l2> arrayList = this.sheetsStack;
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
        int v02 = j6.v0(j6.f19827a7, getResourceProvider());
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

    public i9 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = (this.sheetsStack.isEmpty() || !(kf.k0.i(1, this.sheetsStack) instanceof i9)) ? null : (i9) kf.k0.i(1, this.sheetsStack);
        if (i9Var == null) {
            i9Var = new i9(this);
            e5 e5Var = this.parentLayout;
            if (e5Var != null && ((ActionBarLayout) e5Var).f19425b) {
                i9Var.f15460o1 = true;
            }
            this.sheetsStack.add(i9Var);
            updateSheetsVisibility();
        }
        return i9Var;
    }

    public Activity getParentActivity() {
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            return e5Var.getParentActivity();
        }
        return null;
    }

    public e5 getParentLayout() {
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
            paint = getResourceProvider().G(str);
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
        e5 e5Var = this.parentLayout;
        if (e5Var != null && e5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int w02;
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            if (!hasForceLightStatusBar() || j6.A0().q()) {
                f6 resourceProvider = getResourceProvider();
                int i10 = j6.f20151s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.s()) {
                    i10 = j6.f20221w8;
                }
                if (resourceProvider != null) {
                    w02 = resourceProvider.d0(i10);
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
                if ((l2Var instanceof i9) && view == ((i9) l2Var).f15468s) {
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

    public boolean onBackPressed(boolean z4) {
        if (hasShownSheet()) {
            if (z4) {
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
            kVar.A0 = false;
            kVar.P();
            z zVar = kVar.B;
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

    public AnimatorSet onCustomTransitionAnimation(boolean z4, Runnable runnable) {
        return null;
    }

    public boolean onFragmentCreate() {
        return true;
    }

    public void onFragmentDestroy() {
        boolean z4;
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.isFinished = true;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (j6.w0(null, j6.f20151s8, false) == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            AndroidUtilities.setLightStatusBar(parentActivity, z4);
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

    public r0.m1 onInsetsInternal(View view, r0.m1 m1Var) {
        i0.b f10 = m1Var.f43154a.f(3);
        int i10 = f10.f7196a;
        int i11 = f10.f7197b;
        int i12 = f10.f7198c;
        int i13 = f10.d;
        this.bottomInset = i13;
        onInsets(i10, i11, i12, i13);
        return r0.m1.f43153b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.A0 = false;
            kVar.P();
            z zVar = kVar.B;
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
            i9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f15462p1 = true;
            h9 h9Var = lastStoryViewer.f15476w0;
            if (h9Var != null) {
                h9Var.release(null);
                lastStoryViewer.f15476w0 = null;
            }
            if (lastStoryViewer.B0 == null) {
                ph.k3 k3Var = lastStoryViewer.A0;
                if (k3Var != null) {
                    k3Var.d(0L, null);
                }
                nh.e1 e1Var = lastStoryViewer.f15478x0;
                if (e1Var != null) {
                    if (e1Var.f15276n) {
                        e1Var.s(null);
                    } else {
                        e1Var.e();
                    }
                    lastStoryViewer.f15478x0 = null;
                }
            }
            x6 x6Var = lastStoryViewer.f15467r1;
            if (x6Var != null) {
                x6Var.b();
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
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.A0 = true;
            kVar.P();
        }
        if (getLastStoryViewer() != null) {
            i9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f15462p1 = false;
            if (!org.telegram.ui.n4.x().S && lastStoryViewer.t() != null) {
                lastStoryViewer.t().f1(false);
            }
            x6 x6Var = lastStoryViewer.f15467r1;
            if (x6Var != null) {
                x6Var.a(false);
            }
            if (nh.j1.W.P) {
                nh.j1.j();
            }
            getLastStoryViewer().P();
        }
    }

    public void onTransitionAnimationEnd(boolean z4, boolean z10) {
        this.inTransitionAnimation = false;
    }

    public void onTransitionAnimationStart(boolean z4, boolean z10) {
        this.inTransitionAnimation = true;
        if (z4) {
            this.fragmentBeginToShow = true;
        }
    }

    public View performCreateView(Context context) {
        return createView(context);
    }

    public boolean presentFragment(p2 p2Var) {
        e5 e5Var;
        return allowPresentFragment() && (e5Var = this.parentLayout) != null && ((ActionBarLayout) e5Var).P(p2Var);
    }

    public boolean presentFragmentAsPreview(p2 p2Var) {
        e5 e5Var;
        if (allowPresentFragment() && (e5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            actionBarLayout.getClass();
            c5 c5Var = new c5(p2Var);
            c5Var.e = true;
            if (actionBarLayout.R(c5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(p2 p2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        e5 e5Var;
        if (allowPresentFragment() && (e5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            actionBarLayout.getClass();
            c5 c5Var = new c5(p2Var);
            c5Var.e = true;
            c5Var.f19527f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.R(c5Var)) {
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
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            actionBarLayout.O0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable != null && actionBarLayout.d == null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.e.run();
                actionBarLayout.e = null;
            }
        }
    }

    public void setBulletinDelegate(fb fbVar) {
        this.bulletinDelegate = fbVar;
    }

    public void setCurrentAccount(int i10) {
        if (this.fragmentView == null) {
            this.currentAccount = i10;
            return;
        }
        throw new IllegalStateException("trying to set current account when fragment UI already created");
    }

    public void setFinishing(boolean z4) {
        this.finishing = z4;
    }

    public void setFragmentPanTranslationOffset(int i10) {
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            e5Var.setFragmentPanTranslationOffset(i10);
        }
    }

    public void setFragmentView(View view) {
        this.fragmentView = view;
    }

    public void setHasOwnBackground(boolean z4) {
        this.hasOwnBackground = z4;
    }

    public void setInBubbleMode(boolean z4) {
        this.inBubbleMode = z4;
    }

    public void setInMenuMode(boolean z4) {
        this.inMenuMode = z4;
    }

    public void setInPreviewMode(boolean z4) {
        this.inPreviewMode = z4;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setOccupyStatusBar(!z4);
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
        boolean z4;
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
                z4 = true;
            } else {
                z4 = false;
            }
            AndroidUtilities.setLightNavigationBar(parentActivity, z4);
            e5 e5Var = this.parentLayout;
            if (e5Var != null) {
                e5Var.setNavigationBarColor(i10);
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

    public void setParentLayout(e5 e5Var) {
        boolean z4;
        ViewGroup viewGroup;
        if (this.parentLayout != e5Var) {
            this.parentLayout = e5Var;
            boolean z10 = false;
            if (e5Var != null && ((ActionBarLayout) e5Var).f19435f) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.inBubbleMode = z4;
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
                e5 e5Var2 = this.parentLayout;
                if (e5Var2 != null && e5Var2.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                e5 e5Var3 = this.parentLayout;
                if (e5Var3 != null && e5Var3.getView().getContext() != this.actionBar.getContext()) {
                    z10 = true;
                }
                k kVar = this.actionBar;
                if ((kVar.H || z10) && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                if (z10) {
                    this.actionBar = null;
                }
            }
            e5 e5Var4 = this.parentLayout;
            if (e5Var4 != null && this.actionBar == null) {
                k createActionBar = createActionBar(e5Var4.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f20316q0 = this;
                }
            }
        }
    }

    public void setPaused(boolean z4) {
        if (this.isPaused == z4) {
            return;
        }
        if (z4) {
            onPause();
        } else {
            onResume();
        }
    }

    public void setPreviewDelegate(o2 o2Var) {
        this.previewDelegate = o2Var;
    }

    public void setRemovingFromStack(boolean z4) {
        this.removingFromStack = z4;
    }

    public void setResourceProvider(f6 f6Var) {
        this.resourceProvider = f6Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.J(str, i10, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null && kVar.H) {
            setTitleOverlayText(str, i10, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z4, boolean z10) {
        return false;
    }

    public e5[] showAsSheet(p2 p2Var) {
        return showAsSheet(p2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        e5 e5Var = this.parentLayout;
        if (e5Var != null && (activity = (actionBarLayout = (ActionBarLayout) e5Var).H0) != null) {
            if (actionBarLayout.T) {
                AnimatorSet animatorSet = actionBarLayout.H;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.H = null;
                }
                if (actionBarLayout.f19460v0 != null) {
                    actionBarLayout.H();
                } else if (actionBarLayout.f19462w0 != null) {
                    actionBarLayout.K();
                }
                actionBarLayout.f19456s.invalidate();
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
                boolean z4 = true;
                if (i10 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z4 = false;
                }
                l2Var.setLastVisible(z4);
            }
        }
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public boolean presentFragment(p2 p2Var, boolean z4) {
        e5 e5Var;
        return allowPresentFragment() && (e5Var = this.parentLayout) != null && ((ActionBarLayout) e5Var).Q(p2Var, z4);
    }

    public void removeSelfFromStack(boolean z4) {
        e5 e5Var;
        if (this.isFinished || (e5Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) e5Var).a0(this, z4);
        }
    }

    public e5[] showAsSheet(p2 p2Var, n2 n2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        e5[] e5VarArr = {new z4(getParentActivity(), new n(r7, 5))};
        e5VarArr[0].setIsSheet(true);
        LaunchActivity.D1.M.add(e5VarArr[0]);
        p2Var.onTransitionAnimationStart(true, false);
        k2 k2Var = new k2(getParentActivity(), p2Var.getResourceProvider(), n2Var, e5VarArr, p2Var, r7);
        g3[] g3VarArr = {k2Var};
        if (n2Var != null) {
            k2Var.setAllowNestedScroll(false);
            g3VarArr[0].transitionFromRight(n2Var.f20453a);
        }
        g3 g3Var = g3VarArr[0];
        p2Var.parentDialog = g3Var;
        g3Var.setOpenNoDelay(true);
        g3VarArr[0].show();
        return e5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(p2 p2Var, boolean z4, boolean z10) {
        e5 e5Var;
        if (allowPresentFragment() && (e5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            actionBarLayout.getClass();
            c5 c5Var = new c5(p2Var);
            c5Var.f19525b = z4;
            c5Var.f19526c = z10;
            c5Var.d = true;
            c5Var.e = false;
            c5Var.f19527f = null;
            if (actionBarLayout.R(c5Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z4, DialogInterface.OnDismissListener onDismissListener) {
        e5 e5Var;
        if (dialog != null && (e5Var = this.parentLayout) != null && !((ActionBarLayout) e5Var).A()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.N && (z4 || !actionBarLayout.j())) {
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
                    this.visibleDialog.setOnDismissListener(new gg.g(2, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z4) {
        e5 e5Var;
        if (this.isFinished || (e5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) e5Var).l(z4, false);
        return true;
    }

    public boolean presentFragment(c5 c5Var) {
        e5 e5Var;
        return allowPresentFragment() && (e5Var = this.parentLayout) != null && ((ActionBarLayout) e5Var).R(c5Var);
    }

    public i9 getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = null;
        i9 i9Var2 = (this.sheetsStack.isEmpty() || !(kf.k0.i(1, this.sheetsStack) instanceof i9)) ? null : (i9) kf.k0.i(1, this.sheetsStack);
        if (i9Var2 == null || i9Var2.h == i10) {
            i9Var = i9Var2;
        } else {
            i9Var2.q(true);
            removeSheet(i9Var2);
        }
        if (i9Var == null) {
            i9 i9Var3 = new i9(this);
            e5 e5Var = this.parentLayout;
            if (e5Var != null && ((ActionBarLayout) e5Var).f19425b) {
                i9Var3.f15460o1 = true;
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

    public void onPanTranslationUpdate(float f10) {
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

    public void setPreviewOpenedProgress(float f10) {
    }

    public void setPreviewReplaceProgress(float f10) {
    }

    public void onSlideProgress(boolean z4, float f10) {
    }

    public void onTransitionAnimationProgress(boolean z4, float f10) {
    }

    public void prepareFragmentToSlide(boolean z4, boolean z10) {
    }

    public void onActivityResultFragment(int i10, int i11, Intent intent) {
    }

    public void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
    }

    public void onInsets(int i10, int i11, int i12, int i13) {
    }
}

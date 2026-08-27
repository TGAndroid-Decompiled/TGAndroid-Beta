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
import jh.h9;
import jh.i9;
import jh.w6;
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
import org.telegram.ui.Components.db;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dl0;
import org.telegram.ui.g31;
import org.telegram.ui.ty;

public abstract class n2 {
    protected k actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private db bulletinDelegate;
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
    private m2 previewDelegate;
    private boolean removingFromStack;
    protected c6 resourceProvider;
    public ArrayList<j2> sheetsStack;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public n2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new h2(this));
    }

    public static boolean hasFullyVisibleSheets(n2 n2Var) {
        ty tyVarW;
        if (n2Var == null) {
            return false;
        }
        if (n2Var.hasShownFullyVisibleSheet()) {
            return true;
        }
        return (n2Var.getParentLayout() instanceof ActionBarLayout) && (tyVarW = ((ActionBarLayout) n2Var.getParentLayout()).w()) != null && tyVarW.hasShownFullyVisibleSheet();
    }

    public static boolean hasSheets(n2 n2Var) {
        ty tyVarW;
        if (n2Var == null) {
            return false;
        }
        if (n2Var.hasShownSheet()) {
            return true;
        }
        return (n2Var.getParentLayout() instanceof ActionBarLayout) && (tyVarW = ((ActionBarLayout) n2Var.getParentLayout()).w()) != null && tyVarW.hasShownSheet();
    }

    public boolean S(MotionEvent motionEvent, boolean z10) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(j2 j2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f13503r0 = j2Var;
            j2Var.setOnDismissListener(new jh.l3(lastStoryViewer, 3));
        }
        this.sheetsStack.add(j2Var);
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
                j2 j2Var = this.sheetsStack.get(i10);
                if (j2Var != null && j2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(j2Var.getWindowView());
                    wVar.addView(j2Var.getWindowView());
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
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            this.sheetsStack.get(size).dismiss(true);
        }
        this.sheetsStack.clear();
    }

    public void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e9) {
                    FileLog.e(e9);
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
        clearSheets();
        this.parentLayout = null;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeSheet() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (this.sheetsStack.get(size).isShown()) {
                return this.sheetsStack.get(size).onAttachedBackPressed();
            }
        }
        return false;
    }

    public k createActionBar(Context context) {
        b5 b5Var;
        k kVar = new k(context, getResourceProvider());
        kVar.setBackgroundColor(getThemedColor(g6.f23322s8));
        kVar.C(getThemedColor(g6.f23341t8), false);
        kVar.C(getThemedColor(g6.f23443z8), true);
        kVar.D(getThemedColor(g6.f23375v8), false);
        kVar.D(getThemedColor(g6.f23425y8), true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((b5Var = this.parentLayout) == null || !((ActionBarLayout) b5Var).I0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
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
        h3.b(z3Var2);
        return m4Var;
    }

    public i9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = new i9(this);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).f22647b) {
            i9Var.f13495n1 = true;
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
                j2 j2Var = this.sheetsStack.get(i10);
                if (j2Var != null && j2Var.attachedToParent()) {
                    AndroidUtilities.removeFromParent(j2Var.getWindowView());
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
        } catch (Exception e9) {
            FileLog.e(e9);
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
        m2 m2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (!this.inPreviewMode || (m2Var = this.previewDelegate) == null) {
            finishFragment(true);
        } else {
            ((g31) ((dl0) m2Var).f37438b).a();
        }
    }

    public void finishPreviewFragment() {
        b5 b5Var = this.parentLayout;
        if (b5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            if (actionBarLayout.h || actionBarLayout.T) {
                Runnable runnable = actionBarLayout.f22655e;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    actionBarLayout.f22655e = null;
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

    public org.telegram.ui.m4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.z3) && getLastSheet().isShown()) {
            return ((org.telegram.ui.z3) getLastSheet()).G;
        }
        b5 b5Var = this.parentLayout;
        if (!(b5Var instanceof ActionBarLayout) || ((ActionBarLayout) b5Var).w() == null || !(((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.z3)) {
            return null;
        }
        org.telegram.ui.z3 z3Var = (org.telegram.ui.z3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
        if (z3Var.isShown()) {
            return z3Var.G;
        }
        return null;
    }

    public x4 getBackButtonState() {
        k kVar = this.actionBar;
        if (kVar != null) {
            return kVar.getBackButtonState();
        }
        return null;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public db getBulletinDelegate() {
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

    public Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        return null;
    }

    public DownloadController getDownloadController() {
        return getAccountInstance().getDownloadController();
    }

    public y3 getEdgeToEdgeSupportMode() {
        return isSupportEdgeToEdge() ? y3.f23972b : y3.f23971a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public n2 getFragmentForAlert(int i10) {
        b5 b5Var = this.parentLayout;
        return (b5Var == null || b5Var.getFragmentStack().size() <= i10 + 1) ? this : (n2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i10);
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public GiftAuctionController getGiftAuctionsController() {
        return getAccountInstance().getGiftAuctionsController();
    }

    public boolean getInPassivePreviewMode() {
        b5 b5Var = this.parentLayout;
        if (b5Var == null) {
            return false;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
        return (actionBarLayout.h && actionBarLayout.F == null) || actionBarLayout.T;
    }

    public j2 getLastSheet() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if (this.sheetsStack.get(size).isShown()) {
                return this.sheetsStack.get(size);
            }
        }
        return null;
    }

    public i9 getLastStoryViewer() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if ((this.sheetsStack.get(size) instanceof i9) && this.sheetsStack.get(size).isShown()) {
                return (i9) this.sheetsStack.get(size);
            }
        }
        return null;
    }

    public FrameLayout getLayoutContainer() {
        View view = this.fragmentView;
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof FrameLayout) {
            return (FrameLayout) parent;
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
        int iV0 = g6.v0(g6.f22999a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                j2 j2Var = this.sheetsStack.get(i10);
                if (j2Var.attachedToParent()) {
                    iV0 = j2Var.getNavigationBarColor(iV0);
                }
            }
        }
        return iV0;
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
        i9 i9Var = (this.sheetsStack.isEmpty() || !(i0.a.i(1, this.sheetsStack) instanceof i9)) ? null : (i9) i0.a.i(1, this.sheetsStack);
        if (i9Var == null) {
            i9Var = new i9(this);
            b5 b5Var = this.parentLayout;
            if (b5Var != null && ((ActionBarLayout) b5Var).f22647b) {
                i9Var.f13495n1 = true;
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
        Paint paintN = getResourceProvider() != null ? getResourceProvider().N(str) : null;
        return paintN != null ? paintN : g6.S0(str);
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
        ArrayList<j2> arrayList = this.sheetsStack;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public boolean hasShownFullyVisibleSheet() {
        if (!hasSheet()) {
            return false;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if (this.sheetsStack.get(size).isShown() && this.sheetsStack.get(size).isFullyVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasShownSheet() {
        if (!hasSheet()) {
            return false;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if (this.sheetsStack.get(size).isShown()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStoryViewer() {
        return getLastStoryViewer() != null;
    }

    public boolean hideKeyboardOnShow() {
        return true;
    }

    public boolean isActionBarCrossfadeEnabled() {
        return this.actionBar != null;
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
        return b5Var != null && b5Var.getLastFragment() == this;
    }

    public boolean isLightStatusBar() {
        if (getLastStoryViewer() != null && !getLastStoryViewer().D0) {
            return false;
        }
        if (!hasForceLightStatusBar() || g6.A0().q()) {
            c6 resourceProvider = getResourceProvider();
            int i10 = g6.f23322s8;
            k kVar = this.actionBar;
            if (kVar != null && kVar.t()) {
                i10 = g6.f23393w8;
            }
            if (i0.b.f(resourceProvider != null ? resourceProvider.q0(i10) : g6.w0(null, i10, true)) <= 0.699999988079071d) {
                return false;
            }
        }
        return true;
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
                j2 j2Var = this.sheetsStack.get(i10);
                if ((j2Var instanceof i9) && view == ((i9) j2Var).f13505s) {
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

    public void movePreviewFragment(float f10) {
        ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
        if (actionBarLayout.h && actionBarLayout.F == null && !actionBarLayout.T) {
            float translationY = actionBarLayout.f22679s.getTranslationY();
            float f11 = -f10;
            if (f11 > 0.0f) {
                f11 = 0.0f;
            } else if (f11 < (-AndroidUtilities.dp(60.0f))) {
                actionBarLayout.r();
                f11 = 0.0f;
            }
            if (translationY != f11) {
                actionBarLayout.f22679s.setTranslationY(f11);
                actionBarLayout.invalidate();
            }
        }
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public boolean onBackPressed(boolean z10) {
        if (!hasShownSheet()) {
            return true;
        }
        if (!z10) {
            return false;
        }
        closeSheet();
        return false;
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.f23604z0 = false;
            kVar.P();
            z zVar = kVar.A;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zVar.getChildAt(i10);
                    if (childAt instanceof v0) {
                        ((v0) childAt).n();
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
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.isFinished = true;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), g6.w0(null, g6.f23322s8, false) == -1);
        }
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j2 j2Var = this.sheetsStack.get(size);
                j2Var.setLastVisible(false);
                j2Var.dismiss(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.m1 onInsetsInternal(View view, r0.m1 m1Var) {
        i0.c cVarF = m1Var.f46619a.f(3);
        int i10 = cVarF.f10489a;
        int i11 = cVarF.f10490b;
        int i12 = cVarF.f10491c;
        int i13 = cVarF.d;
        this.bottomInset = i13;
        onInsets(i10, i11, i12, i13);
        return r0.m1.f46618b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.f23604z0 = false;
            kVar.P();
            z zVar = kVar.A;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zVar.getChildAt(i10);
                    if (childAt instanceof v0) {
                        ((v0) childAt).n();
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (getLastStoryViewer() != null) {
            i9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f13497o1 = true;
            h9 h9Var = lastStoryViewer.f13510v0;
            if (h9Var != null) {
                h9Var.release(null);
                lastStoryViewer.f13510v0 = null;
            }
            if (lastStoryViewer.A0 == null) {
                lh.c4 c4Var = lastStoryViewer.f13517z0;
                if (c4Var != null) {
                    c4Var.d(0L, null);
                }
                jh.d1 d1Var = lastStoryViewer.f13512w0;
                if (d1Var != null) {
                    if (d1Var.f13179n) {
                        d1Var.s(null);
                    } else {
                        d1Var.e();
                    }
                    lastStoryViewer.f13512w0 = null;
                }
            }
            w6 w6Var = lastStoryViewer.f13501q1;
            if (w6Var != null) {
                w6Var.b();
            }
            getLastStoryViewer().P();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        updateSheetsVisibility();
    }

    public void onResume() {
        this.isPaused = false;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.f23604z0 = true;
            kVar.P();
        }
        if (getLastStoryViewer() != null) {
            i9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f13497o1 = false;
            if (!org.telegram.ui.m4.x().R && lastStoryViewer.t() != null) {
                lastStoryViewer.t().f1(false);
            }
            w6 w6Var = lastStoryViewer.f13501q1;
            if (w6Var != null) {
                w6Var.a(false);
            }
            if (jh.i1.V.O) {
                jh.i1.j();
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

    public boolean presentFragment(n2 n2Var) {
        b5 b5Var;
        return allowPresentFragment() && (b5Var = this.parentLayout) != null && ((ActionBarLayout) b5Var).P(n2Var);
    }

    public boolean presentFragmentAsPreview(n2 n2Var) {
        b5 b5Var;
        if (!allowPresentFragment() || (b5Var = this.parentLayout) == null) {
            return false;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
        actionBarLayout.getClass();
        z4 z4Var = new z4(n2Var);
        z4Var.f24002e = true;
        return actionBarLayout.R(z4Var);
    }

    public boolean presentFragmentAsPreviewWithMenu(n2 n2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        b5 b5Var;
        if (!allowPresentFragment() || (b5Var = this.parentLayout) == null) {
            return false;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
        actionBarLayout.getClass();
        z4 z4Var = new z4(n2Var);
        z4Var.f24002e = true;
        z4Var.f24003f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        return actionBarLayout.R(z4Var);
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(j2 j2Var) {
        ArrayList<j2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(j2Var);
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
            Runnable runnable = actionBarLayout.f22655e;
            if (runnable == null || actionBarLayout.d != null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            actionBarLayout.f22655e.run();
            actionBarLayout.f22655e = null;
        }
    }

    public void setBulletinDelegate(db dbVar) {
        this.bulletinDelegate = dbVar;
    }

    public void setCurrentAccount(int i10) {
        if (this.fragmentView != null) {
            throw new IllegalStateException("trying to set current account when fragment UI already created");
        }
        this.currentAccount = i10;
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
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setOccupyStatusBar(!z10);
        }
    }

    public void setKeyboardHeightFromParent(int i10) {
        if (this.sheetsStack != null) {
            for (int i11 = 0; i11 < this.sheetsStack.size(); i11++) {
                j2 j2Var = this.sheetsStack.get(i11);
                if (j2Var != null) {
                    j2Var.setKeyboardHeightFromParent(i10);
                }
            }
        }
    }

    public void setNavigationBarColor(int i10) {
        if (isSupportEdgeToEdge()) {
            return;
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ((LaunchActivity) parentActivity).z0(i10);
        } else if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            if (Build.VERSION.SDK_INT >= 26 && window != null) {
                window.getNavigationBarColor();
            }
        }
        AndroidUtilities.setLightNavigationBar(parentActivity, AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f);
        b5 b5Var = this.parentLayout;
        if (b5Var != null) {
            b5Var.setNavigationBarColor(i10);
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(n2 n2Var) {
        setParentLayout(n2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentLayout(b5 b5Var) {
        ViewGroup viewGroup;
        if (this.parentLayout != b5Var) {
            this.parentLayout = b5Var;
            boolean z10 = false;
            this.inBubbleMode = b5Var != null && ((ActionBarLayout) b5Var).f22658f;
            View view = this.fragmentView;
            if (view != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    try {
                        onRemoveFromParent();
                        viewGroup2.removeViewInLayout(this.fragmentView);
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
                    z10 = true;
                }
                k kVar = this.actionBar;
                if ((kVar.G || z10) && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (z10) {
                    this.actionBar = null;
                }
            }
            b5 b5Var4 = this.parentLayout;
            if (b5Var4 == null || this.actionBar != null) {
                return;
            }
            k kVarCreateActionBar = createActionBar(b5Var4.getView().getContext());
            this.actionBar = kVarCreateActionBar;
            if (kVarCreateActionBar != null) {
                kVarCreateActionBar.f23589p0 = this;
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

    public void setPreviewDelegate(m2 m2Var) {
        this.previewDelegate = m2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(c6 c6Var) {
        this.resourceProvider = c6Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.K(str, i10, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar == null || !kVar.G) {
            return;
        }
        setTitleOverlayText(str, i10, runnable);
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public b5[] showAsSheet(n2 n2Var) {
        return showAsSheet(n2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        b5 b5Var = this.parentLayout;
        if (b5Var == null || (activity = (actionBarLayout = (ActionBarLayout) b5Var).G0) == null) {
            return;
        }
        if (actionBarLayout.S) {
            AnimatorSet animatorSet = actionBarLayout.G;
            if (animatorSet != null) {
                animatorSet.cancel();
                actionBarLayout.G = null;
            }
            if (actionBarLayout.f22682u0 != null) {
                actionBarLayout.H();
            } else if (actionBarLayout.f22683v0 != null) {
                actionBarLayout.K();
            }
            actionBarLayout.f22679s.invalidate();
        }
        if (intent != null) {
            activity.startActivityForResult(intent, i10);
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack == null) {
            return;
        }
        for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
            j2 j2Var = this.sheetsStack.get(i10);
            boolean z10 = true;
            if (i10 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                z10 = false;
            }
            j2Var.setLastVisible(z10);
        }
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public boolean presentFragment(n2 n2Var, boolean z10) {
        b5 b5Var;
        return allowPresentFragment() && (b5Var = this.parentLayout) != null && ((ActionBarLayout) b5Var).Q(n2Var, z10);
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

    public b5[] showAsSheet(n2 n2Var, l2 l2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        b5[] b5VarArr = {new w4(getParentActivity(), new n(e3VarArr, 5))};
        b5VarArr[0].setIsSheet(true);
        LaunchActivity.C1.L.add(b5VarArr[0]);
        n2Var.onTransitionAnimationStart(true, false);
        i2 i2Var = new i2(getParentActivity(), n2Var.getResourceProvider(), l2Var, b5VarArr, n2Var, e3VarArr);
        e3[] e3VarArr = {i2Var};
        if (l2Var != null) {
            i2Var.setAllowNestedScroll(false);
            e3VarArr[0].transitionFromRight(l2Var.f23619a);
        }
        e3 e3Var = e3VarArr[0];
        n2Var.parentDialog = e3Var;
        e3Var.setOpenNoDelay(true);
        e3VarArr[0].show();
        return b5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(n2 n2Var, boolean z10, boolean z11) {
        b5 b5Var;
        if (allowPresentFragment() && (b5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            actionBarLayout.getClass();
            z4 z4Var = new z4(n2Var);
            z4Var.f24000b = z10;
            z4Var.f24001c = z11;
            z4Var.d = true;
            z4Var.f24002e = false;
            z4Var.f24003f = null;
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
                ArrayList<j2> arrayList = this.sheetsStack;
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new cg.g(4, this, onDismissListener));
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
        i9 i9Var2 = (this.sheetsStack.isEmpty() || !(i0.a.i(1, this.sheetsStack) instanceof i9)) ? null : (i9) i0.a.i(1, this.sheetsStack);
        if (i9Var2 == null || i9Var2.h == i10) {
            i9Var = i9Var2;
        } else {
            i9Var2.q(true);
            removeSheet(i9Var2);
        }
        if (i9Var != null) {
            return i9Var;
        }
        i9 i9Var3 = new i9(this);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).f22647b) {
            i9Var3.f13495n1 = true;
        }
        this.sheetsStack.add(i9Var3);
        updateSheetsVisibility();
        return i9Var3;
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

    public void onSlideProgress(boolean z10, float f10) {
    }

    public void onTransitionAnimationProgress(boolean z10, float f10) {
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

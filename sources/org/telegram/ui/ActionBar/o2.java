package org.telegram.ui.ActionBar;

import ai.ic;
import ai.jc;
import ai.p9;
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
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jz;
import org.telegram.ui.n41;
import org.telegram.ui.nl0;
public abstract class o2 {
    protected k actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private mb bulletinDelegate;
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
    private n2 previewDelegate;
    private ml0 recyclerListViewForSimpleGlass;
    private boolean removingFromStack;
    protected f6 resourceProvider;
    public ArrayList<k2> sheetsStack;
    private ki.b simpleGlass;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final ki.i glassEngine = new ki.i();
    protected i0.b mSystemInsets = i0.b.e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public o2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new i2(this));
    }

    public static boolean hasFullyVisibleSheets(o2 o2Var) {
        jz w10;
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
        jz w10;
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
        jc lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f1114v0 = k2Var;
            k2Var.setOnDismissListener(new ai.e5(lastStoryViewer, 3));
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
        e5 e5Var;
        k kVar = new k(context, getResourceProvider());
        kVar.setBackgroundColor(getThemedColor(j6.f19140s8));
        kVar.A(getThemedColor(j6.f19159t8), false);
        kVar.A(getThemedColor(j6.f19266z8), true);
        kVar.B(getThemedColor(j6.f19195v8), false);
        kVar.B(getThemedColor(j6.f19247y8), true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((e5Var = this.parentLayout) == null || !((ActionBarLayout) e5Var).M0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
    }

    public org.telegram.ui.h4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.u3) && getLastSheet().isShown()) {
                return ((org.telegram.ui.u3) getLastSheet()).K;
            }
            e5 e5Var = this.parentLayout;
            if ((e5Var instanceof ActionBarLayout) && ((ActionBarLayout) e5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.u3)) {
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (u3Var.isShown()) {
                    return u3Var.K;
                }
            }
        }
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(this);
        org.telegram.ui.u3 u3Var2 = h4Var.K;
        addSheet(u3Var2);
        j3.b(u3Var2);
        return h4Var;
    }

    public jc createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        jc jcVar = new jc(this);
        e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).f18391b) {
            jcVar.f1106r1 = true;
        }
        this.sheetsStack.add(jcVar);
        updateSheetsVisibility();
        return jcVar;
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
            ((n41) ((nl0) n2Var).f36131b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            if (actionBarLayout.h || actionBarLayout.f18389a0) {
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

    public org.telegram.ui.h4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.u3) && getLastSheet().isShown()) {
            return ((org.telegram.ui.u3) getLastSheet()).K;
        }
        e5 e5Var = this.parentLayout;
        if ((e5Var instanceof ActionBarLayout) && ((ActionBarLayout) e5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.u3)) {
            org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
            if (u3Var.isShown()) {
                return u3Var.K;
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

    public ki.b getBaseSimpleGlass() {
        if (this.simpleGlass == null) {
            this.simpleGlass = new ki.b(this.glassEngine, new n(this));
        }
        return this.simpleGlass;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public mb getBulletinDelegate() {
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

    public b4 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return b4.f18473b;
        }
        return b4.f18472a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public o2 getFragmentForAlert(int i10) {
        e5 e5Var = this.parentLayout;
        if (e5Var != null && e5Var.getFragmentStack().size() > i10 + 1) {
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
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            if ((actionBarLayout.h && actionBarLayout.J == null) || actionBarLayout.f18389a0) {
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

    public jc getLastStoryViewer() {
        ArrayList<k2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof jc) && this.sheetsStack.get(size).isShown()) {
                    return (jc) this.sheetsStack.get(size);
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

    public ml0 getListViewForSimpleGlass() {
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
        int v02 = j6.v0(j6.f18807a7, getResourceProvider());
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

    public jc getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        jc jcVar = (this.sheetsStack.isEmpty() || !(hg.k0.h(1, this.sheetsStack) instanceof jc)) ? null : (jc) hg.k0.h(1, this.sheetsStack);
        if (jcVar == null) {
            jcVar = new jc(this);
            e5 e5Var = this.parentLayout;
            if (e5Var != null && ((ActionBarLayout) e5Var).f18391b) {
                jcVar.f1106r1 = true;
            }
            this.sheetsStack.add(jcVar);
            updateSheetsVisibility();
        }
        return jcVar;
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
        e5 e5Var = this.parentLayout;
        if (e5Var != null && e5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int w02;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || j6.A0().q()) {
                f6 resourceProvider = getResourceProvider();
                int i10 = j6.f19140s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.s()) {
                    i10 = j6.f19213w8;
                }
                if (resourceProvider != null) {
                    w02 = resourceProvider.g0(i10);
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
                k2 k2Var = this.sheetsStack.get(i10);
                if ((k2Var instanceof jc) && view == ((jc) k2Var).f1107s) {
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
            kVar.P();
            a0 a0Var = kVar.E;
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
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (j6.w0(null, j6.f19140s8, false) == -1) {
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

    public r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        i0.b f7 = l1Var.f41882a.f(3);
        this.mSystemInsets = f7;
        ml0 ml0Var = this.recyclerListViewForSimpleGlass;
        if (ml0Var != null) {
            ki.b.a(ml0Var, f7.f10592b, f7.d, k.getCurrentActionBarHeight());
        }
        int i10 = f7.f10591a;
        int i11 = f7.f10592b;
        int i12 = f7.f10593c;
        int i13 = f7.d;
        this.bottomInset = i13;
        onInsets(i10, i11, i12, i13);
        return r0.l1.f41881b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = false;
            kVar.P();
            a0 a0Var = kVar.E;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (getLastStoryViewer() != null) {
            jc lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f1109s1 = true;
            ic icVar = lastStoryViewer.f1123z0;
            if (icVar != null) {
                icVar.release(null);
                lastStoryViewer.f1123z0 = null;
            }
            if (lastStoryViewer.E0 == null) {
                ci.l4 l4Var = lastStoryViewer.D0;
                if (l4Var != null) {
                    l4Var.d(0L, null);
                }
                ai.d2 d2Var = lastStoryViewer.A0;
                if (d2Var != null) {
                    if (d2Var.f692n) {
                        d2Var.s(null);
                    } else {
                        d2Var.e();
                    }
                    lastStoryViewer.A0 = null;
                }
            }
            p9 p9Var = lastStoryViewer.f1113u1;
            if (p9Var != null) {
                p9Var.b();
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
            kVar.P();
        }
        if (getLastStoryViewer() != null) {
            jc lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f1109s1 = false;
            if (!org.telegram.ui.h4.x().V && lastStoryViewer.t() != null) {
                lastStoryViewer.t().f1(false);
            }
            p9 p9Var = lastStoryViewer.f1113u1;
            if (p9Var != null) {
                p9Var.a(false);
            }
            if (ai.m2.Z.S) {
                ai.m2.j();
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
        this.glassEngine.c(view);
    }

    public View performCreateView(Context context) {
        View createView = createView(context);
        onViewCreated(createView);
        ml0 listViewForSimpleGlass = getListViewForSimpleGlass();
        this.recyclerListViewForSimpleGlass = listViewForSimpleGlass;
        if (listViewForSimpleGlass != null && (createView instanceof FrameLayout)) {
            getBaseSimpleGlass().b((FrameLayout) createView, this.recyclerListViewForSimpleGlass, this.actionBar, this.resourceProvider);
            ml0 ml0Var = this.recyclerListViewForSimpleGlass;
            i0.b bVar = this.mSystemInsets;
            ki.b.a(ml0Var, bVar.f10592b, bVar.d, k.getCurrentActionBarHeight());
        }
        return createView;
    }

    public boolean presentFragment(o2 o2Var) {
        e5 e5Var;
        return allowPresentFragment() && (e5Var = this.parentLayout) != null && ((ActionBarLayout) e5Var).P(o2Var);
    }

    public boolean presentFragmentAsPreview(o2 o2Var) {
        e5 e5Var;
        if (allowPresentFragment() && (e5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            actionBarLayout.getClass();
            c5 c5Var = new c5(o2Var);
            c5Var.e = true;
            if (actionBarLayout.R(c5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(o2 o2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        e5 e5Var;
        if (allowPresentFragment() && (e5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            actionBarLayout.getClass();
            c5 c5Var = new c5(o2Var);
            c5Var.e = true;
            c5Var.f18536f = actionBarPopupWindow$ActionBarPopupWindowLayout;
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
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            actionBarLayout.R0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable != null && actionBarLayout.d == null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.e.run();
                actionBarLayout.e = null;
            }
        }
    }

    public void setBulletinDelegate(mb mbVar) {
        this.bulletinDelegate = mbVar;
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
        e5 e5Var = this.parentLayout;
        if (e5Var != null) {
            e5Var.setFragmentPanTranslationOffset(i10);
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

    public void setParentFragment(o2 o2Var) {
        setParentLayout(o2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentLayout(e5 e5Var) {
        boolean z10;
        ViewGroup viewGroup;
        if (this.parentLayout != e5Var) {
            this.parentLayout = e5Var;
            boolean z11 = false;
            if (e5Var != null && ((ActionBarLayout) e5Var).f18401f) {
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
                e5 e5Var2 = this.parentLayout;
                if (e5Var2 != null && e5Var2.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                e5 e5Var3 = this.parentLayout;
                if (e5Var3 != null && e5Var3.getView().getContext() != this.actionBar.getContext()) {
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
            e5 e5Var4 = this.parentLayout;
            if (e5Var4 != null && this.actionBar == null) {
                k createActionBar = createActionBar(e5Var4.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f19319t0 = this;
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

    public void setResourceProvider(f6 f6Var) {
        this.resourceProvider = f6Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.K(str, i10, runnable);
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

    public e5[] showAsSheet(o2 o2Var) {
        return showAsSheet(o2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        e5 e5Var = this.parentLayout;
        if (e5Var != null && (activity = (actionBarLayout = (ActionBarLayout) e5Var).K0) != null) {
            if (actionBarLayout.W) {
                AnimatorSet animatorSet = actionBarLayout.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.K = null;
                }
                if (actionBarLayout.f18435y0 != null) {
                    actionBarLayout.H();
                } else if (actionBarLayout.f18436z0 != null) {
                    actionBarLayout.K();
                }
                actionBarLayout.f18425s.invalidate();
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
        e5 e5Var;
        return allowPresentFragment() && (e5Var = this.parentLayout) != null && ((ActionBarLayout) e5Var).Q(o2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        e5 e5Var;
        if (this.isFinished || (e5Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) e5Var).a0(this, z10);
        }
    }

    public e5[] showAsSheet(o2 o2Var, m2 m2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        e5[] e5VarArr = {new z4(getParentActivity(), new p(r7, 4))};
        e5VarArr[0].setIsSheet(true);
        LaunchActivity.G1.P.add(e5VarArr[0]);
        o2Var.onTransitionAnimationStart(true, false);
        j2 j2Var = new j2(getParentActivity(), o2Var.getResourceProvider(), m2Var, e5VarArr, o2Var, r7);
        g3[] g3VarArr = {j2Var};
        if (m2Var != null) {
            j2Var.setAllowNestedScroll(false);
            g3VarArr[0].transitionFromRight(m2Var.f19398a);
        }
        g3 g3Var = g3VarArr[0];
        o2Var.parentDialog = g3Var;
        g3Var.setOpenNoDelay(true);
        g3VarArr[0].show();
        return e5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(o2 o2Var, boolean z10, boolean z11) {
        e5 e5Var;
        if (allowPresentFragment() && (e5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) e5Var;
            actionBarLayout.getClass();
            c5 c5Var = new c5(o2Var);
            c5Var.f18534b = z10;
            c5Var.f18535c = z11;
            c5Var.d = true;
            c5Var.e = false;
            c5Var.f18536f = null;
            if (actionBarLayout.R(c5Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        e5 e5Var;
        if (dialog != null && (e5Var = this.parentLayout) != null && !((ActionBarLayout) e5Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.Q && (z10 || !actionBarLayout.j())) {
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
                    this.visibleDialog.setOnDismissListener(new ei.e0(3, this, onDismissListener));
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
        e5 e5Var;
        if (this.isFinished || (e5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) e5Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(c5 c5Var) {
        e5 e5Var;
        return allowPresentFragment() && (e5Var = this.parentLayout) != null && ((ActionBarLayout) e5Var).R(c5Var);
    }

    public jc getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        jc jcVar = null;
        jc jcVar2 = (this.sheetsStack.isEmpty() || !(hg.k0.h(1, this.sheetsStack) instanceof jc)) ? null : (jc) hg.k0.h(1, this.sheetsStack);
        if (jcVar2 == null || jcVar2.h == i10) {
            jcVar = jcVar2;
        } else {
            jcVar2.q(true);
            removeSheet(jcVar2);
        }
        if (jcVar == null) {
            jc jcVar3 = new jc(this);
            e5 e5Var = this.parentLayout;
            if (e5Var != null && ((ActionBarLayout) e5Var).f18391b) {
                jcVar3.f1106r1 = true;
            }
            this.sheetsStack.add(jcVar3);
            updateSheetsVisibility();
            return jcVar3;
        }
        return jcVar;
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

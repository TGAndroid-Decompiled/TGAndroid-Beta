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
import org.telegram.ui.Components.ob;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e41;
import org.telegram.ui.ez;
import org.telegram.ui.nl0;
public abstract class n2 {
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
    protected c5 parentLayout;
    private m2 previewDelegate;
    private boolean removingFromStack;
    protected d6 resourceProvider;
    public ArrayList<j2> sheetsStack;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final ki.e glassEngine = new ki.e();
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public n2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new h2(this));
    }

    public static boolean hasFullyVisibleSheets(n2 n2Var) {
        ez w10;
        if (n2Var != null) {
            if (!n2Var.hasShownFullyVisibleSheet()) {
                if ((n2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) n2Var.getParentLayout()).w()) != null && w10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(n2 n2Var) {
        ez w10;
        if (n2Var != null) {
            if (!n2Var.hasShownSheet()) {
                if ((n2Var.getParentLayout() instanceof ActionBarLayout) && (w10 = ((ActionBarLayout) n2Var.getParentLayout()).w()) != null && w10.hasShownSheet()) {
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

    public void addSheet(j2 j2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        jc lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f1105v0 = j2Var;
            j2Var.setOnDismissListener(new ai.d5(lastStoryViewer, 3));
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
        ArrayList<j2> arrayList = this.sheetsStack;
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
        c5 c5Var;
        k kVar = new k(context, getResourceProvider());
        kVar.setBackgroundColor(getThemedColor(h6.f19065s8));
        kVar.A(getThemedColor(h6.f19084t8), false);
        kVar.A(getThemedColor(h6.f19191z8), true);
        kVar.B(getThemedColor(h6.f19120v8), false);
        kVar.B(getThemedColor(h6.f19172y8), true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((c5Var = this.parentLayout) == null || !((ActionBarLayout) c5Var).M0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
    }

    public org.telegram.ui.i4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.v3) && getLastSheet().isShown()) {
                return ((org.telegram.ui.v3) getLastSheet()).K;
            }
            c5 c5Var = this.parentLayout;
            if ((c5Var instanceof ActionBarLayout) && ((ActionBarLayout) c5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.v3)) {
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (v3Var.isShown()) {
                    return v3Var.K;
                }
            }
        }
        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(this);
        org.telegram.ui.v3 v3Var2 = i4Var.K;
        addSheet(v3Var2);
        i3.b(v3Var2);
        return i4Var;
    }

    public jc createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        jc jcVar = new jc(this);
        c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).f18353b) {
            jcVar.f1097r1 = true;
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
        m2 m2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (m2Var = this.previewDelegate) != null) {
            ((e41) ((nl0) m2Var).f35552b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        c5 c5Var = this.parentLayout;
        if (c5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) c5Var;
            if (actionBarLayout.h || actionBarLayout.f18351a0) {
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

    public org.telegram.ui.i4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.v3) && getLastSheet().isShown()) {
            return ((org.telegram.ui.v3) getLastSheet()).K;
        }
        c5 c5Var = this.parentLayout;
        if ((c5Var instanceof ActionBarLayout) && ((ActionBarLayout) c5Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.v3)) {
            org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
            if (v3Var.isShown()) {
                return v3Var.K;
            }
            return null;
        }
        return null;
    }

    public y4 getBackButtonState() {
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

    public z3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return z3.f19711b;
        }
        return z3.f19710a;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public n2 getFragmentForAlert(int i10) {
        c5 c5Var = this.parentLayout;
        if (c5Var != null && c5Var.getFragmentStack().size() > i10 + 1) {
            return (n2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i10);
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
        c5 c5Var = this.parentLayout;
        if (c5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) c5Var;
            if ((actionBarLayout.h && actionBarLayout.J == null) || actionBarLayout.f18351a0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public j2 getLastSheet() {
        ArrayList<j2> arrayList = this.sheetsStack;
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
        ArrayList<j2> arrayList = this.sheetsStack;
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
        int v02 = h6.v0(h6.f18733a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                j2 j2Var = this.sheetsStack.get(i10);
                if (j2Var.attachedToParent()) {
                    v02 = j2Var.getNavigationBarColor(v02);
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
        jc jcVar = (this.sheetsStack.isEmpty() || !(hg.c.h(1, this.sheetsStack) instanceof jc)) ? null : (jc) hg.c.h(1, this.sheetsStack);
        if (jcVar == null) {
            jcVar = new jc(this);
            c5 c5Var = this.parentLayout;
            if (c5Var != null && ((ActionBarLayout) c5Var).f18353b) {
                jcVar.f1097r1 = true;
            }
            this.sheetsStack.add(jcVar);
            updateSheetsVisibility();
        }
        return jcVar;
    }

    public Activity getParentActivity() {
        c5 c5Var = this.parentLayout;
        if (c5Var != null) {
            return c5Var.getParentActivity();
        }
        return null;
    }

    public c5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public d6 getResourceProvider() {
        return this.resourceProvider;
    }

    public SecretChatHelper getSecretChatHelper() {
        return getAccountInstance().getSecretChatHelper();
    }

    public SendMessagesHelper getSendMessagesHelper() {
        return getAccountInstance().getSendMessagesHelper();
    }

    public ArrayList<j6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i10) {
        return h6.v0(i10, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return h6.O0(str);
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
        return h6.S0(str);
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
        c5 c5Var = this.parentLayout;
        if (c5Var != null && c5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int w02;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || h6.A0().q()) {
                d6 resourceProvider = getResourceProvider();
                int i10 = h6.f19065s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.s()) {
                    i10 = h6.f19138w8;
                }
                if (resourceProvider != null) {
                    w02 = resourceProvider.g0(i10);
                } else {
                    w02 = h6.w0(null, i10, true);
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
                j2 j2Var = this.sheetsStack.get(i10);
                if ((j2Var instanceof jc) && view == ((jc) j2Var).f1098s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.n2.movePreviewFragment(float):void");
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
            z zVar = kVar.E;
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
            if (h6.w0(null, h6.f19065s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(parentActivity, z10);
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

    public r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        i0.b f7 = l1Var.f41807a.f(3);
        int i10 = f7.f10576a;
        int i11 = f7.f10577b;
        int i12 = f7.f10578c;
        int i13 = f7.d;
        this.bottomInset = i13;
        onInsets(i10, i11, i12, i13);
        return r0.l1.f41806b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.D0 = false;
            kVar.P();
            z zVar = kVar.E;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (getLastStoryViewer() != null) {
            jc lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f1100s1 = true;
            ic icVar = lastStoryViewer.f1114z0;
            if (icVar != null) {
                icVar.release(null);
                lastStoryViewer.f1114z0 = null;
            }
            if (lastStoryViewer.E0 == null) {
                ci.k4 k4Var = lastStoryViewer.D0;
                if (k4Var != null) {
                    k4Var.d(0L, null);
                }
                ai.d2 d2Var = lastStoryViewer.A0;
                if (d2Var != null) {
                    if (d2Var.f698n) {
                        d2Var.s(null);
                    } else {
                        d2Var.e();
                    }
                    lastStoryViewer.A0 = null;
                }
            }
            p9 p9Var = lastStoryViewer.f1104u1;
            if (p9Var != null) {
                p9Var.b();
            }
            getLastStoryViewer().P();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<j2> arrayList = this.sheetsStack;
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
            lastStoryViewer.f1100s1 = false;
            if (!org.telegram.ui.i4.x().V && lastStoryViewer.t() != null) {
                lastStoryViewer.t().f1(false);
            }
            p9 p9Var = lastStoryViewer.f1104u1;
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
        this.glassEngine.b(view);
    }

    public View performCreateView(Context context) {
        View createView = createView(context);
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(n2 n2Var) {
        c5 c5Var;
        return allowPresentFragment() && (c5Var = this.parentLayout) != null && ((ActionBarLayout) c5Var).P(n2Var);
    }

    public boolean presentFragmentAsPreview(n2 n2Var) {
        c5 c5Var;
        if (allowPresentFragment() && (c5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) c5Var;
            actionBarLayout.getClass();
            a5 a5Var = new a5(n2Var);
            a5Var.e = true;
            if (actionBarLayout.R(a5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(n2 n2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        c5 c5Var;
        if (allowPresentFragment() && (c5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) c5Var;
            actionBarLayout.getClass();
            a5 a5Var = new a5(n2Var);
            a5Var.e = true;
            a5Var.f18421f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.R(a5Var)) {
                return true;
            }
            return false;
        }
        return false;
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
        c5 c5Var = this.parentLayout;
        if (c5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) c5Var;
            actionBarLayout.R0 = true;
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
        c5 c5Var = this.parentLayout;
        if (c5Var != null) {
            c5Var.setFragmentPanTranslationOffset(i10);
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
            c5 c5Var = this.parentLayout;
            if (c5Var != null) {
                c5Var.setNavigationBarColor(i10);
            }
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

    public void setParentLayout(c5 c5Var) {
        boolean z10;
        ViewGroup viewGroup;
        if (this.parentLayout != c5Var) {
            this.parentLayout = c5Var;
            boolean z11 = false;
            if (c5Var != null && ((ActionBarLayout) c5Var).f18363f) {
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
                c5 c5Var2 = this.parentLayout;
                if (c5Var2 != null && c5Var2.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                c5 c5Var3 = this.parentLayout;
                if (c5Var3 != null && c5Var3.getView().getContext() != this.actionBar.getContext()) {
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
            c5 c5Var4 = this.parentLayout;
            if (c5Var4 != null && this.actionBar == null) {
                k createActionBar = createActionBar(c5Var4.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f19310t0 = this;
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

    public void setPreviewDelegate(m2 m2Var) {
        this.previewDelegate = m2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(d6 d6Var) {
        this.resourceProvider = d6Var;
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

    public c5[] showAsSheet(n2 n2Var) {
        return showAsSheet(n2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        c5 c5Var = this.parentLayout;
        if (c5Var != null && (activity = (actionBarLayout = (ActionBarLayout) c5Var).K0) != null) {
            if (actionBarLayout.W) {
                AnimatorSet animatorSet = actionBarLayout.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.K = null;
                }
                if (actionBarLayout.f18397y0 != null) {
                    actionBarLayout.H();
                } else if (actionBarLayout.f18398z0 != null) {
                    actionBarLayout.K();
                }
                actionBarLayout.f18387s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i10);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                j2 j2Var = this.sheetsStack.get(i10);
                boolean z10 = true;
                if (i10 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                j2Var.setLastVisible(z10);
            }
        }
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public boolean presentFragment(n2 n2Var, boolean z10) {
        c5 c5Var;
        return allowPresentFragment() && (c5Var = this.parentLayout) != null && ((ActionBarLayout) c5Var).Q(n2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        c5 c5Var;
        if (this.isFinished || (c5Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) c5Var).a0(this, z10);
        }
    }

    public c5[] showAsSheet(n2 n2Var, l2 l2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        c5[] c5VarArr = {new x4(getParentActivity(), new n(r7, 5))};
        c5VarArr[0].setIsSheet(true);
        LaunchActivity.G1.P.add(c5VarArr[0]);
        n2Var.onTransitionAnimationStart(true, false);
        i2 i2Var = new i2(getParentActivity(), n2Var.getResourceProvider(), l2Var, c5VarArr, n2Var, r7);
        f3[] f3VarArr = {i2Var};
        if (l2Var != null) {
            i2Var.setAllowNestedScroll(false);
            f3VarArr[0].transitionFromRight(l2Var.f19352a);
        }
        f3 f3Var = f3VarArr[0];
        n2Var.parentDialog = f3Var;
        f3Var.setOpenNoDelay(true);
        f3VarArr[0].show();
        return c5VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(n2 n2Var, boolean z10, boolean z11) {
        c5 c5Var;
        if (allowPresentFragment() && (c5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) c5Var;
            actionBarLayout.getClass();
            a5 a5Var = new a5(n2Var);
            a5Var.f18419b = z10;
            a5Var.f18420c = z11;
            a5Var.d = true;
            a5Var.e = false;
            a5Var.f18421f = null;
            if (actionBarLayout.R(a5Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        c5 c5Var;
        if (dialog != null && (c5Var = this.parentLayout) != null && !((ActionBarLayout) c5Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.Q && (z10 || !actionBarLayout.j())) {
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
        c5 c5Var;
        if (this.isFinished || (c5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) c5Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(a5 a5Var) {
        c5 c5Var;
        return allowPresentFragment() && (c5Var = this.parentLayout) != null && ((ActionBarLayout) c5Var).R(a5Var);
    }

    public jc getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        jc jcVar = null;
        jc jcVar2 = (this.sheetsStack.isEmpty() || !(hg.c.h(1, this.sheetsStack) instanceof jc)) ? null : (jc) hg.c.h(1, this.sheetsStack);
        if (jcVar2 == null || jcVar2.h == i10) {
            jcVar = jcVar2;
        } else {
            jcVar2.q(true);
            removeSheet(jcVar2);
        }
        if (jcVar == null) {
            jc jcVar3 = new jc(this);
            c5 c5Var = this.parentLayout;
            if (c5Var != null && ((ActionBarLayout) c5Var).f18353b) {
                jcVar3.f1097r1 = true;
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

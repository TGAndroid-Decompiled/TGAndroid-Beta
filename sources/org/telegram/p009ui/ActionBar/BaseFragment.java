package org.telegram.p009ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
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
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.tgnet.ConnectionsManager;

public abstract class BaseFragment {
    protected C1006ActionBar actionBar;
    protected Bundle arguments;
    protected boolean finishing;
    protected boolean fragmentBeginToShow;
    protected View fragmentView;
    protected boolean inBubbleMode;
    protected boolean inMenuMode;
    protected boolean inPreviewMode;
    private boolean isFinished;
    protected Dialog parentDialog;
    protected ActionBarLayout parentLayout;
    private boolean removingFromStack;
    protected Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    protected boolean allowPresentFragment() {
        return true;
    }

    public boolean canBeginSlide() {
        return true;
    }

    public View createView(Context context) {
        return null;
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        return null;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public Theme.ResourcesProvider getResourceProvider() {
        return null;
    }

    public boolean hasForceLightStatusBar() {
        return false;
    }

    public boolean hideKeyboardOnShow() {
        return true;
    }

    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public void onActivityResultFragment(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return true;
    }

    public void onBecomeFullyHidden() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        return null;
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public boolean onFragmentCreate() {
        return true;
    }

    public void onLowMemory() {
    }

    public void onPreviewOpenAnimationEnd() {
    }

    public void onRemoveFromParent() {
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
    }

    public void onSlideProgress(boolean z, float f) {
    }

    public void onTransitionAnimationEnd(boolean z, boolean z2) {
    }

    public void onTransitionAnimationProgress(boolean z, float f) {
    }

    public void prepareFragmentToSlide(boolean z, boolean z2) {
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setProgressToDrawerOpened(float f) {
    }

    public boolean shouldOverrideSlideTransition(boolean z, boolean z2) {
        return false;
    }

    public BaseFragment() {
    }

    public BaseFragment(Bundle bundle) {
        this.arguments = bundle;
    }

    public void setCurrentAccount(int i) {
        if (this.fragmentView == null) {
            this.currentAccount = i;
            return;
        }
        throw new IllegalStateException("trying to set current account when fragment UI already created");
    }

    public C1006ActionBar getActionBar() {
        return this.actionBar;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public void setInBubbleMode(boolean z) {
        this.inBubbleMode = z;
    }

    public boolean isInBubbleMode() {
        return this.inBubbleMode;
    }

    public boolean isInPreviewMode() {
        return this.inPreviewMode;
    }

    public void setInPreviewMode(boolean z) {
        this.inPreviewMode = z;
        C1006ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            boolean z2 = false;
            if (z) {
                actionBar.setOccupyStatusBar(false);
                return;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                z2 = true;
            }
            actionBar.setOccupyStatusBar(z2);
        }
    }

    public void setInMenuMode(boolean z) {
        this.inMenuMode = z;
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
                    FileLog.m30e(e);
                }
            }
            this.fragmentView = null;
        }
        C1006ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            ViewGroup viewGroup2 = (ViewGroup) actionBar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    FileLog.m30e(e2);
                }
            }
            this.actionBar = null;
        }
        this.parentLayout = null;
    }

    public void setParentFragment(BaseFragment baseFragment) {
        setParentLayout(baseFragment.parentLayout);
        this.fragmentView = createView(this.parentLayout.getContext());
    }

    public void setParentLayout(ActionBarLayout actionBarLayout) {
        ViewGroup viewGroup;
        if (this.parentLayout != actionBarLayout) {
            this.parentLayout = actionBarLayout;
            boolean z = true;
            this.inBubbleMode = actionBarLayout != null && actionBarLayout.isInBubbleMode();
            View view = this.fragmentView;
            if (view != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    try {
                        onRemoveFromParent();
                        viewGroup2.removeViewInLayout(this.fragmentView);
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                }
                ActionBarLayout actionBarLayout2 = this.parentLayout;
                if (!(actionBarLayout2 == null || actionBarLayout2.getContext() == this.fragmentView.getContext())) {
                    this.fragmentView = null;
                }
            }
            if (this.actionBar != null) {
                ActionBarLayout actionBarLayout3 = this.parentLayout;
                if (actionBarLayout3 == null || actionBarLayout3.getContext() == this.actionBar.getContext()) {
                    z = false;
                }
                if ((this.actionBar.shouldAddToContainer() || z) && (viewGroup = (ViewGroup) this.actionBar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e2) {
                        FileLog.m30e(e2);
                    }
                }
                if (z) {
                    this.actionBar = null;
                }
            }
            ActionBarLayout actionBarLayout4 = this.parentLayout;
            if (actionBarLayout4 != null && this.actionBar == null) {
                C1006ActionBar createActionBar = createActionBar(actionBarLayout4.getContext());
                this.actionBar = createActionBar;
                createActionBar.parentFragment = this;
            }
        }
    }

    public C1006ActionBar createActionBar(Context context) {
        C1006ActionBar actionBar = new C1006ActionBar(context);
        actionBar.setBackgroundColor(getThemedColor("actionBarDefault"));
        actionBar.setItemsBackgroundColor(getThemedColor("actionBarDefaultSelector"), false);
        actionBar.setItemsBackgroundColor(getThemedColor("actionBarActionModeDefaultSelector"), true);
        actionBar.setItemsColor(getThemedColor("actionBarDefaultIcon"), false);
        actionBar.setItemsColor(getThemedColor("actionBarActionModeDefaultIcon"), true);
        if (this.inPreviewMode || this.inBubbleMode) {
            actionBar.setOccupyStatusBar(false);
        }
        return actionBar;
    }

    public void movePreviewFragment(float f) {
        this.parentLayout.movePreviewFragment(f);
    }

    public void finishPreviewFragment() {
        this.parentLayout.finishPreviewFragment();
    }

    public void finishFragment() {
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            finishFragment(true);
        }
    }

    public void finishFragment(boolean z) {
        ActionBarLayout actionBarLayout;
        if (!this.isFinished && (actionBarLayout = this.parentLayout) != null) {
            this.finishing = true;
            actionBarLayout.closeLastFragment(z);
        }
    }

    public void removeSelfFromStack() {
        ActionBarLayout actionBarLayout;
        if (!this.isFinished && (actionBarLayout = this.parentLayout) != null) {
            Dialog dialog = this.parentDialog;
            if (dialog != null) {
                dialog.dismiss();
            } else {
                actionBarLayout.removeFragmentFromStack(this);
            }
        }
    }

    public boolean isFinishing() {
        return this.finishing;
    }

    public void onFragmentDestroy() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        boolean z = true;
        this.isFinished = true;
        C1006ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Window window = getParentActivity().getWindow();
            if (Theme.getColor("actionBarDefault") != -1) {
                z = false;
            }
            AndroidUtilities.setLightStatusBar(window, z);
        }
    }

    public void resumeDelayedFragmentAnimation() {
        ActionBarLayout actionBarLayout = this.parentLayout;
        if (actionBarLayout != null) {
            actionBarLayout.resumeDelayedFragmentAnimation();
        }
    }

    public void onResume() {
        this.isPaused = false;
    }

    public void onPause() {
        C1006ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.onPause();
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    public BaseFragment getFragmentForAlert(int i) {
        ActionBarLayout actionBarLayout = this.parentLayout;
        if (actionBarLayout == null || actionBarLayout.fragmentsStack.size() <= i + 1) {
            return this;
        }
        ArrayList<BaseFragment> arrayList = this.parentLayout.fragmentsStack;
        return arrayList.get((arrayList.size() - 2) - i);
    }

    public boolean isLastFragment() {
        ActionBarLayout actionBarLayout = this.parentLayout;
        if (actionBarLayout != null && !actionBarLayout.fragmentsStack.isEmpty()) {
            ArrayList<BaseFragment> arrayList = this.parentLayout.fragmentsStack;
            if (arrayList.get(arrayList.size() - 1) == this) {
                return true;
            }
        }
        return false;
    }

    public ActionBarLayout getParentLayout() {
        return this.parentLayout;
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

    public boolean presentFragmentAsPreview(BaseFragment baseFragment) {
        ActionBarLayout actionBarLayout;
        return allowPresentFragment() && (actionBarLayout = this.parentLayout) != null && actionBarLayout.presentFragmentAsPreview(baseFragment);
    }

    public boolean presentFragmentAsPreviewWithMenu(BaseFragment baseFragment, View view) {
        ActionBarLayout actionBarLayout;
        return allowPresentFragment() && (actionBarLayout = this.parentLayout) != null && actionBarLayout.presentFragmentAsPreviewWithMenu(baseFragment, view);
    }

    public boolean presentFragment(BaseFragment baseFragment) {
        ActionBarLayout actionBarLayout;
        return allowPresentFragment() && (actionBarLayout = this.parentLayout) != null && actionBarLayout.presentFragment(baseFragment);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z) {
        ActionBarLayout actionBarLayout;
        return allowPresentFragment() && (actionBarLayout = this.parentLayout) != null && actionBarLayout.presentFragment(baseFragment, z);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2) {
        ActionBarLayout actionBarLayout;
        return allowPresentFragment() && (actionBarLayout = this.parentLayout) != null && actionBarLayout.presentFragment(baseFragment, z, z2, true, false, null);
    }

    public Activity getParentActivity() {
        ActionBarLayout actionBarLayout = this.parentLayout;
        if (actionBarLayout != null) {
            return actionBarLayout.parentActivity;
        }
        return null;
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        ActionBarLayout actionBarLayout = this.parentLayout;
        if (actionBarLayout != null) {
            actionBarLayout.startActivityForResult(intent, i);
        }
    }

    public void dismissCurrentDialog() {
        Dialog dialog = this.visibleDialog;
        if (dialog != null) {
            try {
                dialog.dismiss();
                this.visibleDialog = null;
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
    }

    public void onBeginSlide() {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing()) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        C1006ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.onPause();
        }
    }

    public void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.fragmentBeginToShow = true;
        }
    }

    public void onBecomeFullyVisible() {
        C1006ActionBar actionBar;
        if (((AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility")).isEnabled() && (actionBar = getActionBar()) != null) {
            String title = actionBar.getTitle();
            if (!TextUtils.isEmpty(title)) {
                setParentActivityTitle(title);
            }
        }
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public Dialog showDialog(Dialog dialog, boolean z, final DialogInterface.OnDismissListener onDismissListener) {
        ActionBarLayout actionBarLayout;
        if (dialog != null && (actionBarLayout = this.parentLayout) != null && !actionBarLayout.animationInProgress && !actionBarLayout.startedTracking && (z || !actionBarLayout.checkTransitionAnimation())) {
            try {
                Dialog dialog2 = this.visibleDialog;
                if (dialog2 != null) {
                    dialog2.dismiss();
                    this.visibleDialog = null;
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
            try {
                this.visibleDialog = dialog;
                dialog.setCanceledOnTouchOutside(true);
                this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BaseFragment.this.lambda$showDialog$0(onDismissListener, dialogInterface);
                    }
                });
                this.visibleDialog.show();
                return this.visibleDialog;
            } catch (Exception e2) {
                FileLog.m30e(e2);
            }
        }
        return null;
    }

    public void lambda$showDialog$0(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        onDialogDismiss((Dialog) dialogInterface);
        if (dialogInterface == this.visibleDialog) {
            this.visibleDialog = null;
        }
    }

    public Dialog getVisibleDialog() {
        return this.visibleDialog;
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.currentAccount);
    }

    public MessagesController getMessagesController() {
        return getAccountInstance().getMessagesController();
    }

    public ContactsController getContactsController() {
        return getAccountInstance().getContactsController();
    }

    public MediaDataController getMediaDataController() {
        return getAccountInstance().getMediaDataController();
    }

    public ConnectionsManager getConnectionsManager() {
        return getAccountInstance().getConnectionsManager();
    }

    public LocationController getLocationController() {
        return getAccountInstance().getLocationController();
    }

    public NotificationsController getNotificationsController() {
        return getAccountInstance().getNotificationsController();
    }

    public MessagesStorage getMessagesStorage() {
        return getAccountInstance().getMessagesStorage();
    }

    public SendMessagesHelper getSendMessagesHelper() {
        return getAccountInstance().getSendMessagesHelper();
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public SecretChatHelper getSecretChatHelper() {
        return getAccountInstance().getSecretChatHelper();
    }

    public DownloadController getDownloadController() {
        return getAccountInstance().getDownloadController();
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().getNotificationsSettings();
    }

    public NotificationCenter getNotificationCenter() {
        return getAccountInstance().getNotificationCenter();
    }

    public MediaController getMediaController() {
        return MediaController.getInstance();
    }

    public UserConfig getUserConfig() {
        return getAccountInstance().getUserConfig();
    }

    public void setFragmentPanTranslationOffset(int i) {
        ActionBarLayout actionBarLayout = this.parentLayout;
        if (actionBarLayout != null) {
            actionBarLayout.setFragmentPanTranslationOffset(i);
        }
    }

    public ActionBarLayout[] showAsSheet(BaseFragment baseFragment) {
        if (getParentActivity() == null) {
            return null;
        }
        ActionBarLayout[] actionBarLayoutArr = {new ActionBarLayout(getParentActivity())};
        DialogC10561 r7 = new DialogC10561(this, getParentActivity(), true, actionBarLayoutArr, baseFragment);
        baseFragment.setParentDialog(r7);
        r7.show();
        return actionBarLayoutArr;
    }

    class DialogC10561 extends BottomSheet {
        final ActionBarLayout[] val$actionBarLayout;
        final BaseFragment val$fragment;

        @Override
        protected boolean canDismissWithSwipe() {
            return false;
        }

        DialogC10561(BaseFragment baseFragment, Context context, boolean z, ActionBarLayout[] actionBarLayoutArr, final BaseFragment baseFragment2) {
            super(context, z);
            this.val$actionBarLayout = actionBarLayoutArr;
            this.val$fragment = baseFragment2;
            actionBarLayoutArr[0].init(new ArrayList<>());
            actionBarLayoutArr[0].addFragmentToStack(baseFragment2);
            actionBarLayoutArr[0].showLastFragment();
            ActionBarLayout actionBarLayout = actionBarLayoutArr[0];
            int i = this.backgroundPaddingLeft;
            actionBarLayout.setPadding(i, 0, i, 0);
            this.containerView = actionBarLayoutArr[0];
            setApplyBottomPadding(false);
            setApplyBottomPadding(false);
            setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    BaseFragment.this.onFragmentDestroy();
                }
            });
        }

        @Override
        public void onBackPressed() {
            ActionBarLayout[] actionBarLayoutArr = this.val$actionBarLayout;
            if (actionBarLayoutArr[0] == null || actionBarLayoutArr[0].fragmentsStack.size() <= 1) {
                super.onBackPressed();
            } else {
                this.val$actionBarLayout[0].onBackPressed();
            }
        }

        @Override
        public void dismiss() {
            super.dismiss();
            this.val$actionBarLayout[0] = null;
        }
    }

    public int getThemedColor(String str) {
        return Theme.getColor(str, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return Theme.getThemeDrawable(str);
    }

    public int getNavigationBarColor() {
        return Theme.getColor("windowBackgroundGray");
    }

    public void setNavigationBarColor(int i) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            if (Build.VERSION.SDK_INT >= 26 && window != null && window.getNavigationBarColor() != i) {
                window.setNavigationBarColor(i);
                AndroidUtilities.setLightNavigationBar(window, AndroidUtilities.computePerceivedBrightness(i) >= 0.721f);
            }
        }
    }

    public boolean isBeginToShow() {
        return this.fragmentBeginToShow;
    }

    private void setParentDialog(Dialog dialog) {
        this.parentDialog = dialog;
    }

    public boolean isRemovingFromStack() {
        return this.removingFromStack;
    }

    public void setRemovingFromStack(boolean z) {
        this.removingFromStack = z;
    }

    public boolean isLightStatusBar() {
        int i;
        if (hasForceLightStatusBar() && !Theme.getCurrentTheme().isDark()) {
            return true;
        }
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        C1006ActionBar actionBar = this.actionBar;
        String str = (actionBar == null || !actionBar.isActionModeShowed()) ? "actionBarDefault" : "actionBarActionModeDefault";
        if (resourceProvider != null) {
            i = resourceProvider.getColorOrDefault(str);
        } else {
            i = Theme.getColor(str, null, true);
        }
        return ColorUtils.calculateLuminance(i) > 0.699999988079071d;
    }
}

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
import android.graphics.Canvas;
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
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.INavigationLayout;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.tgnet.ConnectionsManager;

public abstract class BaseFragment {
    protected C1133ActionBar actionBar;
    protected Bundle arguments;
    protected boolean finishing;
    protected boolean fragmentBeginToShow;
    protected View fragmentView;
    protected boolean inBubbleMode;
    protected boolean inMenuMode;
    protected boolean inPreviewMode;
    private boolean isFinished;
    protected Dialog parentDialog;
    protected INavigationLayout parentLayout;
    private PreviewDelegate previewDelegate;
    private boolean removingFromStack;
    protected Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public interface PreviewDelegate {
        void finishFragment();
    }

    protected boolean allowPresentFragment() {
        return true;
    }

    public boolean canBeginSlide() {
        return true;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public View createView(Context context) {
        return null;
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public void drawOverlay(Canvas canvas, View view) {
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

    public void onSlideProgressFront(boolean z, float f) {
    }

    public void onTransitionAnimationEnd(boolean z, boolean z2) {
    }

    public void onTransitionAnimationProgress(boolean z, float f) {
    }

    public void onUserLeaveHint() {
    }

    public void prepareFragmentToSlide(boolean z, boolean z2) {
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setPreviewOpenedProgress(float f) {
    }

    public void setPreviewReplaceProgress(float f) {
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
        if (this.fragmentView != null) {
            throw new IllegalStateException("trying to set current account when fragment UI already created");
        }
        this.currentAccount = i;
    }

    public boolean hasOwnBackground() {
        return this.hasOwnBackground;
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public C1133ActionBar getActionBar() {
        return this.actionBar;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public void setFragmentView(View view) {
        this.fragmentView = view;
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

    public INavigationLayout.BackButtonState getBackButtonState() {
        C1133ActionBar c1133ActionBar = this.actionBar;
        if (c1133ActionBar != null) {
            return c1133ActionBar.getBackButtonState();
        }
        return null;
    }

    public void setInPreviewMode(boolean z) {
        this.inPreviewMode = z;
        C1133ActionBar c1133ActionBar = this.actionBar;
        if (c1133ActionBar != null) {
            if (z) {
                c1133ActionBar.setOccupyStatusBar(false);
            } else {
                c1133ActionBar.setOccupyStatusBar(Build.VERSION.SDK_INT >= 21);
            }
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
                    FileLog.m31e(e);
                }
            }
            this.fragmentView = null;
        }
        C1133ActionBar c1133ActionBar = this.actionBar;
        if (c1133ActionBar != null) {
            ViewGroup viewGroup2 = (ViewGroup) c1133ActionBar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    FileLog.m31e(e2);
                }
            }
            this.actionBar = null;
        }
        this.parentLayout = null;
    }

    public void setParentFragment(BaseFragment baseFragment) {
        setParentLayout(baseFragment.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentLayout(INavigationLayout iNavigationLayout) {
        ViewGroup viewGroup;
        if (this.parentLayout != iNavigationLayout) {
            this.parentLayout = iNavigationLayout;
            boolean z = true;
            this.inBubbleMode = iNavigationLayout != null && iNavigationLayout.isInBubbleMode();
            View view = this.fragmentView;
            if (view != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    try {
                        onRemoveFromParent();
                        viewGroup2.removeViewInLayout(this.fragmentView);
                    } catch (Exception e) {
                        FileLog.m31e(e);
                    }
                }
                INavigationLayout iNavigationLayout2 = this.parentLayout;
                if (iNavigationLayout2 != null && iNavigationLayout2.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                }
            }
            if (this.actionBar != null) {
                INavigationLayout iNavigationLayout3 = this.parentLayout;
                z = (iNavigationLayout3 == null || iNavigationLayout3.getView().getContext() == this.actionBar.getContext()) ? false : false;
                if ((this.actionBar.shouldAddToContainer() || z) && (viewGroup = (ViewGroup) this.actionBar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e2) {
                        FileLog.m31e(e2);
                    }
                }
                if (z) {
                    this.actionBar = null;
                }
            }
            INavigationLayout iNavigationLayout4 = this.parentLayout;
            if (iNavigationLayout4 == null || this.actionBar != null) {
                return;
            }
            C1133ActionBar createActionBar = createActionBar(iNavigationLayout4.getView().getContext());
            this.actionBar = createActionBar;
            if (createActionBar != null) {
                createActionBar.parentFragment = this;
            }
        }
    }

    public C1133ActionBar createActionBar(Context context) {
        C1133ActionBar c1133ActionBar = new C1133ActionBar(context, getResourceProvider());
        c1133ActionBar.setBackgroundColor(getThemedColor("actionBarDefault"));
        c1133ActionBar.setItemsBackgroundColor(getThemedColor("actionBarDefaultSelector"), false);
        c1133ActionBar.setItemsBackgroundColor(getThemedColor("actionBarActionModeDefaultSelector"), true);
        c1133ActionBar.setItemsColor(getThemedColor("actionBarDefaultIcon"), false);
        c1133ActionBar.setItemsColor(getThemedColor("actionBarActionModeDefaultIcon"), true);
        if (this.inPreviewMode || this.inBubbleMode) {
            c1133ActionBar.setOccupyStatusBar(false);
        }
        return c1133ActionBar;
    }

    public void movePreviewFragment(float f) {
        this.parentLayout.movePreviewFragment(f);
    }

    public void finishPreviewFragment() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            iNavigationLayout.finishPreviewFragment();
        }
    }

    public void finishFragment() {
        PreviewDelegate previewDelegate;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (previewDelegate = this.previewDelegate) != null) {
            previewDelegate.finishFragment();
        } else {
            finishFragment(true);
        }
    }

    public void setFinishing(boolean z) {
        this.finishing = z;
    }

    public void finishFragment(boolean z) {
        INavigationLayout iNavigationLayout;
        if (this.isFinished || (iNavigationLayout = this.parentLayout) == null) {
            return;
        }
        this.finishing = true;
        iNavigationLayout.closeLastFragment(z);
    }

    public void removeSelfFromStack() {
        INavigationLayout iNavigationLayout;
        if (this.isFinished || (iNavigationLayout = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            iNavigationLayout.removeFragmentFromStack(this);
        }
    }

    public boolean isFinishing() {
        return this.finishing;
    }

    public void onFragmentDestroy() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.isFinished = true;
        C1133ActionBar c1133ActionBar = this.actionBar;
        if (c1133ActionBar != null) {
            c1133ActionBar.setEnabled(false);
        }
        if (!hasForceLightStatusBar() || AndroidUtilities.isTablet() || getParentLayout().getLastFragment() != this || getParentActivity() == null || this.finishing) {
            return;
        }
        AndroidUtilities.setLightStatusBar(getParentActivity().getWindow(), Theme.getColor("actionBarDefault") == -1);
    }

    public void resumeDelayedFragmentAnimation() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            iNavigationLayout.resumeDelayedFragmentAnimation();
        }
    }

    public void onResume() {
        this.isPaused = false;
    }

    public void onPause() {
        C1133ActionBar c1133ActionBar = this.actionBar;
        if (c1133ActionBar != null) {
            c1133ActionBar.onPause();
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public void setPaused(boolean z) {
        if (this.isPaused == z) {
            return;
        }
        if (z) {
            onPause();
        } else {
            onResume();
        }
    }

    public BaseFragment getFragmentForAlert(int i) {
        INavigationLayout iNavigationLayout = this.parentLayout;
        return (iNavigationLayout == null || iNavigationLayout.getFragmentStack().size() <= i + 1) ? this : this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i);
    }

    public boolean isLastFragment() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        return iNavigationLayout != null && iNavigationLayout.getLastFragment() == this;
    }

    public INavigationLayout getParentLayout() {
        return this.parentLayout;
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

    public boolean presentFragmentAsPreview(BaseFragment baseFragment) {
        INavigationLayout iNavigationLayout;
        return allowPresentFragment() && (iNavigationLayout = this.parentLayout) != null && iNavigationLayout.presentFragmentAsPreview(baseFragment);
    }

    public boolean presentFragmentAsPreviewWithMenu(BaseFragment baseFragment, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        INavigationLayout iNavigationLayout;
        return allowPresentFragment() && (iNavigationLayout = this.parentLayout) != null && iNavigationLayout.presentFragmentAsPreviewWithMenu(baseFragment, actionBarPopupWindowLayout);
    }

    public boolean presentFragment(BaseFragment baseFragment) {
        INavigationLayout iNavigationLayout;
        return allowPresentFragment() && (iNavigationLayout = this.parentLayout) != null && iNavigationLayout.presentFragment(baseFragment);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z) {
        INavigationLayout iNavigationLayout;
        return allowPresentFragment() && (iNavigationLayout = this.parentLayout) != null && iNavigationLayout.presentFragment(baseFragment, z);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2) {
        INavigationLayout iNavigationLayout;
        return allowPresentFragment() && (iNavigationLayout = this.parentLayout) != null && iNavigationLayout.presentFragment(baseFragment, z, z2, true, false, null);
    }

    public Activity getParentActivity() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            return iNavigationLayout.getParentActivity();
        }
        return null;
    }

    public Context getContext() {
        return getParentActivity();
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            iNavigationLayout.startActivityForResult(intent, i);
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
            FileLog.m31e(e);
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
            FileLog.m31e(e);
        }
        C1133ActionBar c1133ActionBar = this.actionBar;
        if (c1133ActionBar != null) {
            c1133ActionBar.onPause();
        }
    }

    public void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.fragmentBeginToShow = true;
        }
    }

    public void onBecomeFullyVisible() {
        C1133ActionBar actionBar;
        if (!((AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility")).isEnabled() || (actionBar = getActionBar()) == null) {
            return;
        }
        String title = actionBar.getTitle();
        if (TextUtils.isEmpty(title)) {
            return;
        }
        setParentActivityTitle(title);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public Dialog showDialog(Dialog dialog, boolean z, final DialogInterface.OnDismissListener onDismissListener) {
        INavigationLayout iNavigationLayout;
        if (dialog != null && (iNavigationLayout = this.parentLayout) != null && !iNavigationLayout.isTransitionAnimationInProgress() && !this.parentLayout.isSwipeInProgress() && (z || !this.parentLayout.checkTransitionAnimation())) {
            try {
                Dialog dialog2 = this.visibleDialog;
                if (dialog2 != null) {
                    dialog2.dismiss();
                    this.visibleDialog = null;
                }
            } catch (Exception e) {
                FileLog.m31e(e);
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
                FileLog.m31e(e2);
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
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            iNavigationLayout.setFragmentPanTranslationOffset(i);
        }
    }

    public INavigationLayout[] showAsSheet(BaseFragment baseFragment) {
        if (getParentActivity() == null) {
            return null;
        }
        INavigationLayout[] iNavigationLayoutArr = {INavigationLayout.CC.newLayout(getParentActivity())};
        DialogC11891 dialogC11891 = new DialogC11891(this, getParentActivity(), true, iNavigationLayoutArr, baseFragment);
        baseFragment.setParentDialog(dialogC11891);
        dialogC11891.show();
        return iNavigationLayoutArr;
    }

    public class DialogC11891 extends BottomSheet {
        final INavigationLayout[] val$actionBarLayout;
        final BaseFragment val$fragment;

        @Override
        protected boolean canDismissWithSwipe() {
            return false;
        }

        DialogC11891(BaseFragment baseFragment, Context context, boolean z, INavigationLayout[] iNavigationLayoutArr, final BaseFragment baseFragment2) {
            super(context, z);
            this.val$actionBarLayout = iNavigationLayoutArr;
            this.val$fragment = baseFragment2;
            iNavigationLayoutArr[0].setFragmentStack(new ArrayList());
            iNavigationLayoutArr[0].addFragmentToStack(baseFragment2);
            iNavigationLayoutArr[0].showLastFragment();
            ViewGroup view = iNavigationLayoutArr[0].getView();
            int i = this.backgroundPaddingLeft;
            view.setPadding(i, 0, i, 0);
            this.containerView = iNavigationLayoutArr[0].getView();
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
            INavigationLayout[] iNavigationLayoutArr = this.val$actionBarLayout;
            if (iNavigationLayoutArr[0] == null || iNavigationLayoutArr[0].getFragmentStack().size() <= 1) {
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
            if (Build.VERSION.SDK_INT < 26 || window == null || window.getNavigationBarColor() == i) {
                return;
            }
            window.setNavigationBarColor(i);
            AndroidUtilities.setLightNavigationBar(window, AndroidUtilities.computePerceivedBrightness(i) >= 0.721f);
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
        int color;
        if (!hasForceLightStatusBar() || Theme.getCurrentTheme().isDark()) {
            Theme.ResourcesProvider resourceProvider = getResourceProvider();
            C1133ActionBar c1133ActionBar = this.actionBar;
            String str = (c1133ActionBar == null || !c1133ActionBar.isActionModeShowed()) ? "actionBarDefault" : "actionBarActionModeDefault";
            if (resourceProvider != null) {
                color = resourceProvider.getColorOrDefault(str);
            } else {
                color = Theme.getColor(str, null, true);
            }
            return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
        }
        return true;
    }

    public void setPreviewDelegate(PreviewDelegate previewDelegate) {
        this.previewDelegate = previewDelegate;
    }

    public void resetFragment() {
        if (this.isFinished) {
            clearViews();
            this.isFinished = false;
            this.finishing = false;
        }
    }
}

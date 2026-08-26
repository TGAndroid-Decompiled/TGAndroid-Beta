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
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.EmptyBaseFragment;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.RightSlidingDialogContainer;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.StoriesIntro;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryViewer$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda16;

public abstract class BaseFragment {
    protected ActionBar actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private Bulletin.Delegate bulletinDelegate;
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
    protected INavigationLayout parentLayout;
    private PreviewDelegate previewDelegate;
    private boolean removingFromStack;
    protected Theme.ResourcesProvider resourceProvider;
    public ArrayList<AttachedSheet> sheetsStack;
    public Dialog visibleDialog;
    protected int currentAccount = UserConfig.selectedAccount;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public interface AttachedSheet {
        boolean attachedToParent();

        void lambda$showGiftOfferSheet$15();

        void dismiss(boolean z);

        BulletinFactory getBulletinFactory();

        int getNavigationBarColor(int i);

        View getWindowView();

        boolean isAttachedLightStatusBar();

        boolean isFullyVisible();

        boolean isShown();

        boolean onAttachedBackPressed();

        void setKeyboardHeightFromParent(int i);

        void setLastVisible(boolean z);

        void setOnDismissListener(Runnable runnable);

        boolean showDialog(Dialog dialog);
    }

    public interface AttachedSheetWindow {
    }

    public final class BottomSheetParams {
        public boolean occupyNavigationBar;
        public Runnable onDismiss;
        public Runnable onOpenAnimationFinished;
        public Runnable onPreFinished;
        public boolean transitionFromLeft;
    }

    public interface PreviewDelegate {
    }

    public BaseFragment(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return true;
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return true;
            }

            @Override
            public final boolean clipWithGradient(int i) {
                return false;
            }

            @Override
            public final int getBottomOffset(int i) {
                if (BaseFragment.this.isSupportEdgeToEdge()) {
                    return AndroidUtilities.navigationBarHeight;
                }
                return 0;
            }

            @Override
            public final int getTopOffset() {
                return 0;
            }

            @Override
            public final void onBottomOffsetChange(float f) {
            }

            @Override
            public final void onHide(Bulletin bulletin) {
            }

            @Override
            public final void onShow(Bulletin bulletin) {
            }
        });
    }

    public static boolean hasFullyVisibleSheets(BaseFragment baseFragment) {
        EmptyBaseFragment sheetFragment$1;
        if (baseFragment == null) {
            return false;
        }
        if (baseFragment.hasShownFullyVisibleSheet()) {
            return true;
        }
        return (baseFragment.getParentLayout() instanceof ActionBarLayout) && (sheetFragment$1 = ((ActionBarLayout) baseFragment.getParentLayout()).getSheetFragment$1()) != null && sheetFragment$1.hasShownFullyVisibleSheet();
    }

    public static boolean hasSheets(BaseFragment baseFragment) {
        EmptyBaseFragment sheetFragment$1;
        if (baseFragment == null) {
            return false;
        }
        if (baseFragment.hasShownSheet()) {
            return true;
        }
        return (baseFragment.getParentLayout() instanceof ActionBarLayout) && (sheetFragment$1 = ((ActionBarLayout) baseFragment.getParentLayout()).getSheetFragment$1()) != null && sheetFragment$1.hasShownSheet();
    }

    public static BottomSheet lambda$showAsSheet$1(BottomSheet[] bottomSheetArr) {
        return bottomSheetArr[0];
    }

    public void addSheet(AttachedSheet attachedSheet) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        StoryViewer lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.currentSheet = attachedSheet;
            attachedSheet.setOnDismissListener(new StoryViewer$$ExternalSyntheticLambda2(lastStoryViewer, 5));
        }
        this.sheetsStack.add(attachedSheet);
        updateSheetsVisibility();
    }

    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return true;
    }

    public boolean allowPresentFragment() {
        return true;
    }

    public void attachSheets(ActionBarLayout.LayoutContainer layoutContainer) {
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                AttachedSheet attachedSheet = this.sheetsStack.get(i);
                if (attachedSheet != null && attachedSheet.attachedToParent()) {
                    AndroidUtilities.removeFromParent(attachedSheet.getWindowView());
                    layoutContainer.addView(attachedSheet.getWindowView());
                }
            }
        }
    }

    public boolean canBeginSlide() {
        return true;
    }

    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void checkSystemBarColors() {
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ((LaunchActivity) parentActivity).checkSystemBarColors(true, true, true);
        }
    }

    public void clearSheets() {
        ArrayList<AttachedSheet> arrayList = this.sheetsStack;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            this.fragmentView = null;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            ViewGroup viewGroup2 = (ViewGroup) actionBar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    FileLog.e(e2);
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
        ArrayList<AttachedSheet> arrayList = this.sheetsStack;
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

    public ActionBar createActionBar(Context context) {
        INavigationLayout iNavigationLayout;
        ActionBar actionBar = new ActionBar(context, getResourceProvider());
        actionBar.setBackgroundColor(getThemedColor(Theme.key_actionBarDefault));
        actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSelector), false);
        actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), true);
        actionBar.setItemsColor(getThemedColor(Theme.key_actionBarDefaultIcon), false);
        actionBar.setItemsColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((iNavigationLayout = this.parentLayout) == null || !((ActionBarLayout) iNavigationLayout).isLayersLayout)) {
            return actionBar;
        }
        actionBar.setOccupyStatusBar(false);
        return actionBar;
    }

    public ArticleViewer createArticleViewer(boolean z) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z) {
            if ((getLastSheet() instanceof ArticleViewer.Sheet) && getLastSheet().isShown()) {
                return ArticleViewer.this;
            }
            INavigationLayout iNavigationLayout = this.parentLayout;
            if ((iNavigationLayout instanceof ActionBarLayout) && ((ActionBarLayout) iNavigationLayout).getSheetFragment$1() != null && (((ActionBarLayout) this.parentLayout).getSheetFragment$1().getLastSheet() instanceof ArticleViewer.Sheet)) {
                ArticleViewer.Sheet sheet = (ArticleViewer.Sheet) ((ActionBarLayout) this.parentLayout).getSheetFragment$1().getLastSheet();
                if (sheet.isShown()) {
                    return ArticleViewer.this;
                }
            }
        }
        ArticleViewer articleViewer = new ArticleViewer(this);
        ArticleViewer.Sheet sheet2 = articleViewer.sheet;
        addSheet(sheet2);
        BottomSheetTabDialog.checkSheet(sheet2);
        return articleViewer;
    }

    public StoryViewer createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        StoryViewer storyViewer = new StoryViewer(this);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isSheet) {
            storyViewer.fromBottomSheet = true;
        }
        this.sheetsStack.add(storyViewer);
        updateSheetsVisibility();
        return storyViewer;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                AttachedSheet attachedSheet = this.sheetsStack.get(i);
                if (attachedSheet != null && attachedSheet.attachedToParent()) {
                    AndroidUtilities.removeFromParent(attachedSheet.getWindowView());
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
        PreviewDelegate previewDelegate;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (!this.inPreviewMode || (previewDelegate = this.previewDelegate) == null) {
            finishFragment(true);
        } else {
            ((RightSlidingDialogContainer) ((StoriesViewPager$$ExternalSyntheticLambda0) previewDelegate).f$0).finishPreview();
        }
    }

    public void finishPreviewFragment() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) iNavigationLayout;
            if (actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) {
                Runnable runnable = actionBarLayout.delayedOpenAnimationRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    actionBarLayout.delayedOpenAnimationRunnable = null;
                }
                actionBarLayout.closeLastFragment(true, false);
            }
        }
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.currentAccount);
    }

    public ActionBar getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public ArticleViewer getArticleViewer() {
        if ((getLastSheet() instanceof ArticleViewer.Sheet) && getLastSheet().isShown()) {
            return ArticleViewer.this;
        }
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (!(iNavigationLayout instanceof ActionBarLayout) || ((ActionBarLayout) iNavigationLayout).getSheetFragment$1() == null || !(((ActionBarLayout) this.parentLayout).getSheetFragment$1().getLastSheet() instanceof ArticleViewer.Sheet)) {
            return null;
        }
        ArticleViewer.Sheet sheet = (ArticleViewer.Sheet) ((ActionBarLayout) this.parentLayout).getSheetFragment$1().getLastSheet();
        if (sheet.isShown()) {
            return ArticleViewer.this;
        }
        return null;
    }

    public INavigationLayout.BackButtonState getBackButtonState() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            return actionBar.getBackButtonState();
        }
        return null;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public Bulletin.Delegate getBulletinDelegate() {
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

    public Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        return null;
    }

    public DownloadController getDownloadController() {
        return getAccountInstance().getDownloadController();
    }

    public EdgeToEdgeSupportMode getEdgeToEdgeSupportMode() {
        return isSupportEdgeToEdge() ? EdgeToEdgeSupportMode.VERTICAL : EdgeToEdgeSupportMode.NONE;
    }

    public FileLoader getFileLoader() {
        return getAccountInstance().getFileLoader();
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public BaseFragment getFragmentForAlert(int i) {
        INavigationLayout iNavigationLayout = this.parentLayout;
        return (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getFragmentStack().size() <= i + 1) ? this : ((ActionBarLayout) this.parentLayout).getFragmentStack().get((((ActionBarLayout) this.parentLayout).getFragmentStack().size() - 2) - i);
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public GiftAuctionController getGiftAuctionsController() {
        return getAccountInstance().getGiftAuctionsController();
    }

    public boolean getInPassivePreviewMode() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout == null) {
            return false;
        }
        ActionBarLayout actionBarLayout = (ActionBarLayout) iNavigationLayout;
        return (actionBarLayout.inPreviewMode && actionBarLayout.previewMenu == null) || actionBarLayout.transitionAnimationPreviewMode;
    }

    public AttachedSheet getLastSheet() {
        ArrayList<AttachedSheet> arrayList = this.sheetsStack;
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

    public StoryViewer getLastStoryViewer() {
        ArrayList<AttachedSheet> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
            if ((this.sheetsStack.get(size) instanceof StoryViewer) && this.sheetsStack.get(size).isShown()) {
                return (StoryViewer) this.sheetsStack.get(size);
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
        int color = Theme.getColor(Theme.key_windowBackgroundGray, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                AttachedSheet attachedSheet = this.sheetsStack.get(i);
                if (attachedSheet.attachedToParent()) {
                    color = attachedSheet.getNavigationBarColor(color);
                }
            }
        }
        return color;
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

    public StoryViewer getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        StoryViewer storyViewer = (this.sheetsStack.isEmpty() || !(zziq.m(1, this.sheetsStack) instanceof StoryViewer)) ? null : (StoryViewer) zziq.m(1, this.sheetsStack);
        if (storyViewer == null) {
            storyViewer = new StoryViewer(this);
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isSheet) {
                storyViewer.fromBottomSheet = true;
            }
            this.sheetsStack.add(storyViewer);
            updateSheetsVisibility();
        }
        return storyViewer;
    }

    public Activity getParentActivity() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            return ((ActionBarLayout) iNavigationLayout).getParentActivity();
        }
        return null;
    }

    public INavigationLayout getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourceProvider;
    }

    public SecretChatHelper getSecretChatHelper() {
        return getAccountInstance().getSecretChatHelper();
    }

    public SendMessagesHelper getSendMessagesHelper() {
        return getAccountInstance().getSendMessagesHelper();
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return (Drawable) Theme.defaultChatDrawables.get(str);
    }

    public Paint getThemedPaint(String str) {
        Paint paint = getResourceProvider() != null ? getResourceProvider().getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
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
        ArrayList<AttachedSheet> arrayList = this.sheetsStack;
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
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                this.sheetsStack.get(i);
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
        INavigationLayout iNavigationLayout = this.parentLayout;
        return iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).getLastFragment() == this;
    }

    public boolean isLightStatusBar() {
        Theme.ResourcesProvider resourceProvider;
        int i;
        ActionBar actionBar;
        int color;
        if (getLastStoryViewer() != null && !getLastStoryViewer().isClosed) {
            return false;
        }
        if (hasForceLightStatusBar()) {
            Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
            if (themeInfo == null) {
                themeInfo = Theme.defaultTheme;
            }
            if (themeInfo.isDark()) {
                resourceProvider = getResourceProvider();
                i = Theme.key_actionBarDefault;
                actionBar = this.actionBar;
                if (actionBar != null) {
                    i = Theme.key_actionBarActionModeDefault;
                }
                if (resourceProvider != null) {
                    color = resourceProvider.getColorOrDefault(i);
                } else {
                    color = Theme.getColor(null, i, true);
                }
                if (ColorUtils.calculateLuminance(color) > 0.699999988079071d) {
                    return false;
                }
            }
        } else {
            resourceProvider = getResourceProvider();
            i = Theme.key_actionBarDefault;
            actionBar = this.actionBar;
            if (actionBar != null && actionBar.isActionModeShowed()) {
                i = Theme.key_actionBarActionModeDefault;
            }
            if (resourceProvider != null) {
                color = resourceProvider.getColorOrDefault(i);
            } else {
                color = Theme.getColor(null, i, true);
            }
            if (ColorUtils.calculateLuminance(color) > 0.699999988079071d) {
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
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                AttachedSheet attachedSheet = this.sheetsStack.get(i);
                if ((attachedSheet instanceof StoryViewer) && view == ((StoryViewer) attachedSheet).windowView) {
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

    public void lambda$checkChangesBeforeExit$15(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$10(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$14(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$2(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$21(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$27(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$28(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$31(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$61(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$63(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkDiscard$69(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$checkShowBlur$119(View view) {
        finishPreviewFragment();
    }

    public void lambda$createView$1$12(View view) {
        finishFragment();
    }

    public void lambda$createView$27(View view) {
        finishPreviewFragment();
    }

    public void lambda$createView$42$1(View view) {
        finishPreviewFragment();
    }

    public void lambda$createView$9$5(View view) {
        finishPreviewFragment();
    }

    public void lambda$deleteFolder$14(Boolean bool) {
        finishFragment();
    }

    public void lambda$discardEditor$2(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$finished$12(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onBackPressed$23(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onBackPressed$3$2(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onBackPressed$4(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onBackPressed$4$1(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onBackPressed$5$1(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onBackPressed$6(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onBackPressed$8$1(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onFragmentCreate$16(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$onItemClick$5(TLRPC.WallPaper wallPaper) {
        removeSelfFromStack();
    }

    public final void lambda$showDialog$0(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        onDialogDismiss((Dialog) dialogInterface);
        if (dialogInterface == this.visibleDialog) {
            this.visibleDialog = null;
        }
    }

    public void lambda$showQuickRepliesRemoveAlert$362(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$showSetForcePasswordAlert$37(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$showSetForcePasswordAlert$51(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$showUnsavedAlert$14(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$showUnsavedAlert$3(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void movePreviewFragment(float f) {
        ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
        if (actionBarLayout.inPreviewMode && actionBarLayout.previewMenu == null && !actionBarLayout.transitionAnimationPreviewMode) {
            float translationY = actionBarLayout.containerView.getTranslationY();
            float f2 = -f;
            if (f2 > 0.0f) {
                f2 = 0.0f;
            } else if (f2 < (-AndroidUtilities.dp(60.0f))) {
                actionBarLayout.expandPreviewFragment();
                f2 = 0.0f;
            }
            if (translationY != f2) {
                actionBarLayout.containerView.setTranslationY(f2);
                actionBarLayout.invalidate();
            }
        }
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public void onActivityResultFragment(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed(boolean z) {
        if (!hasShownSheet()) {
            return true;
        }
        if (!z) {
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
        ActionBar actionBar;
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
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.resumed = false;
            actionBar.updateAttachState$1();
            ActionBarMenu actionBarMenu = actionBar.menu;
            if (actionBarMenu != null) {
                int childCount = actionBarMenu.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = actionBarMenu.getChildAt(i);
                    if (childAt instanceof ActionBarMenuItem) {
                        ((ActionBarMenuItem) childAt).closeSubMenu();
                    }
                }
            }
        }
    }

    public void onBottomSheetCreated() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        return null;
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public void onFragmentClosed() {
    }

    public boolean onFragmentCreate() {
        return true;
    }

    public void onFragmentDestroy() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.isFinished = true;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !AndroidUtilities.isTablet() && ((ActionBarLayout) getParentLayout()).getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), Theme.getColor(null, Theme.key_actionBarDefault, false) == -1);
        }
        ArrayList<AttachedSheet> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AttachedSheet attachedSheet = this.sheetsStack.get(size);
                attachedSheet.setLastVisible(false);
                attachedSheet.dismiss(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public void onInsets(int i, int i2, int i3, int i4) {
    }

    public WindowInsetsCompat onInsetsInternal(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.mImpl.getInsets(3);
        int i = insets.left;
        int i2 = insets.bottom;
        this.bottomInset = i2;
        onInsets(i, insets.top, insets.right, i2);
        return WindowInsetsCompat.CONSUMED;
    }

    public void onLowMemory() {
    }

    public void onPanTransitionEnd() {
    }

    public void onPanTransitionStart() {
    }

    public void onPanTranslationUpdate(float f) {
    }

    public void onPause() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.resumed = false;
            actionBar.updateAttachState$1();
            ActionBarMenu actionBarMenu = actionBar.menu;
            if (actionBarMenu != null) {
                int childCount = actionBarMenu.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = actionBarMenu.getChildAt(i);
                    if (childAt instanceof ActionBarMenuItem) {
                        ((ActionBarMenuItem) childAt).closeSubMenu();
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
            StoryViewer lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.paused = true;
            StoryViewer.VideoPlayerHolder videoPlayerHolder = lastStoryViewer.playerHolder;
            if (videoPlayerHolder != null) {
                videoPlayerHolder.release(null);
                lastStoryViewer.playerHolder = null;
            }
            if (lastStoryViewer.pipLiveView == null) {
                LivePlayerView livePlayerView = lastStoryViewer.liveView;
                if (livePlayerView != null) {
                    livePlayerView.setScope(0L, null);
                }
                LivePlayer livePlayer = lastStoryViewer.livePlayer;
                if (livePlayer != null) {
                    if (livePlayer.outgoing) {
                        livePlayer.setDisplaySink(null);
                    } else {
                        livePlayer.destroy();
                    }
                    lastStoryViewer.livePlayer = null;
                }
            }
            StoriesIntro storiesIntro = lastStoryViewer.storiesIntro;
            if (storiesIntro != null) {
                storiesIntro.stopAnimation();
            }
            getLastStoryViewer().updatePlayingMode();
        }
    }

    public void onPreviewOpenAnimationEnd() {
    }

    public void onRemoveFromParent() {
        ArrayList<AttachedSheet> arrayList = this.sheetsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        updateSheetsVisibility();
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.isPaused = false;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.resumed = true;
            actionBar.updateAttachState$1();
        }
        if (getLastStoryViewer() != null) {
            StoryViewer lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.paused = false;
            if (!ArticleViewer.getInstance().isVisible && lastStoryViewer.getCurrentPeerView() != null) {
                lastStoryViewer.getCurrentPeerView().updatePosition(false);
            }
            StoriesIntro storiesIntro = lastStoryViewer.storiesIntro;
            if (storiesIntro != null) {
                storiesIntro.startAnimation(false);
            }
            LiveStoryPipOverlay liveStoryPipOverlay = LiveStoryPipOverlay.instance;
            if (liveStoryPipOverlay.isVisible) {
                liveStoryPipOverlay.dismissInternal$1(true);
            }
            getLastStoryViewer().updatePlayingMode();
        }
    }

    public void onSlideProgress(boolean z, float f) {
    }

    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.inTransitionAnimation = false;
    }

    public void onTransitionAnimationProgress(boolean z, float f) {
    }

    public void onTransitionAnimationStart(boolean z, boolean z2) {
        this.inTransitionAnimation = true;
        if (z) {
            this.fragmentBeginToShow = true;
        }
    }

    public void onUserLeaveHint() {
    }

    public View performCreateView(Context context) {
        return createView(context);
    }

    public void prepareFragmentToSlide(boolean z, boolean z2) {
    }

    public boolean presentFragment(BaseFragment baseFragment) {
        INavigationLayout iNavigationLayout;
        if (!allowPresentFragment() || (iNavigationLayout = this.parentLayout) == null) {
            return false;
        }
        return ((ActionBarLayout) iNavigationLayout).presentFragment(new INavigationLayout.NavigationParams(baseFragment));
    }

    public boolean presentFragmentAsPreview(BaseFragment baseFragment) {
        INavigationLayout iNavigationLayout;
        if (!allowPresentFragment() || (iNavigationLayout = this.parentLayout) == null) {
            return false;
        }
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(baseFragment);
        navigationParams.preview = true;
        return ((ActionBarLayout) iNavigationLayout).presentFragment(navigationParams);
    }

    public boolean presentFragmentAsPreviewWithMenu(BaseFragment baseFragment, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        INavigationLayout iNavigationLayout;
        if (!allowPresentFragment() || (iNavigationLayout = this.parentLayout) == null) {
            return false;
        }
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(baseFragment);
        navigationParams.preview = true;
        navigationParams.menuView = actionBarPopupWindowLayout;
        return ((ActionBarLayout) iNavigationLayout).presentFragment(navigationParams);
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(AttachedSheet attachedSheet) {
        ArrayList<AttachedSheet> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(attachedSheet);
        updateSheetsVisibility();
    }

    public void resetFragment() {
        if (this.isFinished) {
            clearViews();
            this.isFinished = false;
            this.finishing = false;
        }
    }

    public void restoreSelfArgs(Bundle bundle) {
    }

    public void resumeDelayedFragmentAnimation() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) iNavigationLayout;
            actionBarLayout.delayedAnimationResumed = true;
            Runnable runnable = actionBarLayout.delayedOpenAnimationRunnable;
            if (runnable == null || actionBarLayout.waitingForKeyboardCloseRunnable != null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            actionBarLayout.delayedOpenAnimationRunnable.run();
            actionBarLayout.delayedOpenAnimationRunnable = null;
        }
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setBulletinDelegate(Bulletin.Delegate delegate) {
        this.bulletinDelegate = delegate;
    }

    public void setCurrentAccount(int i) {
        if (this.fragmentView != null) {
            throw new IllegalStateException("trying to set current account when fragment UI already created");
        }
        this.currentAccount = i;
    }

    public void setFinishing(boolean z) {
        this.finishing = z;
    }

    public void setFragmentPanTranslationOffset(int i) {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            ((ActionBarLayout) iNavigationLayout).setFragmentPanTranslationOffset(i);
        }
    }

    public void setFragmentView(View view) {
        this.fragmentView = view;
    }

    public void setHasOwnBackground(boolean z) {
        this.hasOwnBackground = z;
    }

    public void setInBubbleMode(boolean z) {
        this.inBubbleMode = z;
    }

    public void setInMenuMode(boolean z) {
        this.inMenuMode = z;
    }

    public void setInPreviewMode(boolean z) {
        this.inPreviewMode = z;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setOccupyStatusBar(!z);
        }
    }

    public void setKeyboardHeightFromParent(int i) {
        if (this.sheetsStack != null) {
            for (int i2 = 0; i2 < this.sheetsStack.size(); i2++) {
                AttachedSheet attachedSheet = this.sheetsStack.get(i2);
                if (attachedSheet != null) {
                    attachedSheet.setKeyboardHeightFromParent(i);
                }
            }
        }
    }

    public void setNavigationBarColor(int i) {
        if (isSupportEdgeToEdge()) {
            return;
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            launchActivity.drawerLayoutContainer.setInternalNavigationBarColor(i);
            BottomSheetTabs bottomSheetTabs = launchActivity.getBottomSheetTabs();
            if (bottomSheetTabs != null) {
                bottomSheetTabs.setNavigationBarColor(i);
            }
        } else if (parentActivity != null) {
            Window window = parentActivity.getWindow();
            if (Build.VERSION.SDK_INT >= 26 && window != null) {
                window.getNavigationBarColor();
            }
        }
        AndroidUtilities.setLightNavigationBar(parentActivity, AndroidUtilities.computePerceivedBrightness(i) >= 0.721f);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            ((ActionBarLayout) iNavigationLayout).setNavigationBarColor(i);
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(BaseFragment baseFragment) {
        setParentLayout(baseFragment.parentLayout);
        this.fragmentView = createView(((ActionBarLayout) this.parentLayout).getView().getContext());
    }

    public void setParentLayout(INavigationLayout iNavigationLayout) {
        ViewGroup viewGroup;
        if (this.parentLayout != iNavigationLayout) {
            this.parentLayout = iNavigationLayout;
            boolean z = false;
            this.inBubbleMode = iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).inBubbleMode;
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
                INavigationLayout iNavigationLayout2 = this.parentLayout;
                if (iNavigationLayout2 != null && ((ActionBarLayout) iNavigationLayout2).getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                INavigationLayout iNavigationLayout3 = this.parentLayout;
                if (iNavigationLayout3 != null && ((ActionBarLayout) iNavigationLayout3).getView().getContext() != this.actionBar.getContext()) {
                    z = true;
                }
                ActionBar actionBar = this.actionBar;
                if ((actionBar.addToContainer || z) && (viewGroup = (ViewGroup) actionBar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e2) {
                        FileLog.e(e2);
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
            ActionBar actionBarCreateActionBar = createActionBar(((ActionBarLayout) iNavigationLayout4).getView().getContext());
            this.actionBar = actionBarCreateActionBar;
            if (actionBarCreateActionBar != null) {
                actionBarCreateActionBar.parentFragment = this;
            }
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

    public void setPreviewDelegate(PreviewDelegate previewDelegate) {
        this.previewDelegate = previewDelegate;
    }

    public void setPreviewOpenedProgress(float f) {
    }

    public void setPreviewReplaceProgress(float f) {
    }

    public void setRemovingFromStack(boolean z) {
        this.removingFromStack = z;
    }

    public void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourceProvider = resourcesProvider;
    }

    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitleOverlayText(str, i, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        ActionBar actionBar = this.actionBar;
        if (actionBar == null || !actionBar.addToContainer) {
            return;
        }
        setTitleOverlayText(str, i, runnable);
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z, boolean z2) {
        return false;
    }

    public INavigationLayout[] showAsSheet(BaseFragment baseFragment) {
        return showAsSheet(baseFragment, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout == null || (activity = (actionBarLayout = (ActionBarLayout) iNavigationLayout).parentActivity) == null) {
            return;
        }
        if (actionBarLayout.transitionAnimationInProgress) {
            AnimatorSet animatorSet = actionBarLayout.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                actionBarLayout.currentAnimation = null;
            }
            if (actionBarLayout.onCloseAnimationEndRunnable != null) {
                actionBarLayout.onCloseAnimationEnd();
            } else if (actionBarLayout.onOpenAnimationEndRunnable != null) {
                actionBarLayout.onOpenAnimationEnd$1();
            }
            actionBarLayout.containerView.invalidate();
        }
        if (intent != null) {
            activity.startActivityForResult(intent, i);
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack == null) {
            return;
        }
        for (int i = 0; i < this.sheetsStack.size(); i++) {
            AttachedSheet attachedSheet = this.sheetsStack.get(i);
            boolean z = true;
            if (i != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                z = false;
            }
            attachedSheet.setLastVisible(z);
        }
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public void removeSelfFromStack(boolean z) {
        INavigationLayout iNavigationLayout;
        if (this.isFinished || (iNavigationLayout = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) iNavigationLayout).removeFragmentFromStack(this, z);
        }
    }

    public INavigationLayout[] showAsSheet(BaseFragment baseFragment, BottomSheetParams bottomSheetParams) {
        if (getParentActivity() == null) {
            return null;
        }
        Activity parentActivity = getParentActivity();
        final AlertDialog$$ExternalSyntheticLambda11 alertDialog$$ExternalSyntheticLambda11 = new AlertDialog$$ExternalSyntheticLambda11(bottomSheetArr, 5);
        INavigationLayout[] iNavigationLayoutArr = {new ActionBarLayout(parentActivity) {
            @Override
            public final BottomSheet getBottomSheet() {
                return BaseFragment.lambda$showAsSheet$1((BottomSheet[]) alertDialog$$ExternalSyntheticLambda11.f$0);
            }
        }};
        ((ActionBarLayout) iNavigationLayoutArr[0]).setIsSheet(true);
        LaunchActivity.instance.sheetFragmentsStack.add(iNavigationLayoutArr[0]);
        baseFragment.onTransitionAnimationStart(true, false);
        BottomSheet bottomSheet = new BottomSheet(getParentActivity(), baseFragment.getResourceProvider(), bottomSheetParams, iNavigationLayoutArr, baseFragment, bottomSheetArr) {
            public final INavigationLayout[] val$actionBarLayout;
            public final BottomSheet[] val$bottomSheet;
            public final BaseFragment val$fragment;
            public final BottomSheetParams val$params;

            {
                this.val$params = bottomSheetParams;
                this.val$actionBarLayout = iNavigationLayoutArr;
                this.val$fragment = baseFragment;
                this.val$bottomSheet = bottomSheetArr;
                boolean z = bottomSheetParams != null && bottomSheetParams.occupyNavigationBar;
                this.occupyNavigationBar = z;
                this.drawNavigationBar = !z;
                ((ActionBarLayout) iNavigationLayoutArr[0]).setFragmentStack(new ArrayList());
                INavigationLayout iNavigationLayout = iNavigationLayoutArr[0];
                iNavigationLayout.getClass();
                ((ActionBarLayout) iNavigationLayout).addFragmentToStack(-1, baseFragment);
                ((ActionBarLayout) iNavigationLayoutArr[0]).showLastFragment();
                ViewGroup view = ((ActionBarLayout) iNavigationLayoutArr[0]).getView();
                int i = this.backgroundPaddingLeft;
                view.setPadding(i, 0, i, 0);
                this.containerView = ((ActionBarLayout) iNavigationLayoutArr[0]).getView();
                setApplyBottomPadding(false);
                setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(2, baseFragment, bottomSheetParams));
            }

            @Override
            public final boolean canDismissWithSwipe() {
                return false;
            }

            @Override
            public final boolean canSwipeToBack(MotionEvent motionEvent) {
                INavigationLayout[] iNavigationLayoutArr2;
                INavigationLayout iNavigationLayout;
                BottomSheetParams bottomSheetParams2 = this.val$params;
                return bottomSheetParams2 != null && bottomSheetParams2.transitionFromLeft && (iNavigationLayout = (iNavigationLayoutArr2 = this.val$actionBarLayout)[0]) != null && ((ActionBarLayout) iNavigationLayout).getFragmentStack().size() <= 1 && (((ActionBarLayout) iNavigationLayoutArr2[0]).getFragmentStack().size() != 1 || ((ActionBarLayout) iNavigationLayoutArr2[0]).getFragmentStack().get(0).isSwipeBackEnabled(motionEvent));
            }

            @Override
            public final void lambda$showGiftOfferSheet$15() {
                BottomSheetParams bottomSheetParams2;
                Runnable runnable;
                if (!isDismissed() && (bottomSheetParams2 = this.val$params) != null && (runnable = bottomSheetParams2.onPreFinished) != null) {
                    runnable.run();
                }
                super.lambda$showGiftOfferSheet$15();
                ArrayList arrayList = LaunchActivity.instance.sheetFragmentsStack;
                INavigationLayout[] iNavigationLayoutArr2 = this.val$actionBarLayout;
                arrayList.remove(iNavigationLayoutArr2[0]);
                iNavigationLayoutArr2[0] = null;
            }

            @Override
            public final void lambda$openCrafting$8() {
                INavigationLayout[] iNavigationLayoutArr2 = this.val$actionBarLayout;
                INavigationLayout iNavigationLayout = iNavigationLayoutArr2[0];
                if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getFragmentStack().size() <= 1) {
                    super.lambda$openCrafting$8();
                } else {
                    ((ActionBarLayout) iNavigationLayoutArr2[0]).onBackPressed();
                }
            }

            @Override
            public final void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                INavigationLayout iNavigationLayout = this.val$actionBarLayout[0];
                BottomSheet[] bottomSheetArr = this.val$bottomSheet;
                ((ActionBarLayout) iNavigationLayout).setWindow(bottomSheetArr[0].getWindow());
                BaseFragment baseFragment2 = this.val$fragment;
                BottomSheetParams bottomSheetParams2 = this.val$params;
                if (bottomSheetParams2 == null || !bottomSheetParams2.occupyNavigationBar) {
                    fixNavigationBar(Theme.getColor(Theme.key_dialogBackgroundGray, baseFragment2.getResourceProvider()));
                } else {
                    AndroidUtilities.setLightNavigationBar((Dialog) bottomSheetArr[0], true);
                }
                AndroidUtilities.setLightStatusBar(this, baseFragment2.isLightStatusBar());
                baseFragment2.onBottomSheetCreated();
            }

            @Override
            public final void onInsetsChanged() {
                INavigationLayout iNavigationLayout = this.val$actionBarLayout[0];
                if (iNavigationLayout != null) {
                    for (BaseFragment baseFragment2 : ((ActionBarLayout) iNavigationLayout).getFragmentStack()) {
                        if (baseFragment2.getFragmentView() != null) {
                            baseFragment2.getFragmentView().requestLayout();
                        }
                    }
                }
            }

            @Override
            public final void onOpenAnimationEnd() {
                Runnable runnable;
                this.val$fragment.onTransitionAnimationEnd(true, false);
                BottomSheetParams bottomSheetParams2 = this.val$params;
                if (bottomSheetParams2 == null || (runnable = bottomSheetParams2.onOpenAnimationFinished) == null) {
                    return;
                }
                runnable.run();
            }
        };
        BottomSheet[] bottomSheetArr = {bottomSheet};
        if (bottomSheetParams != null) {
            bottomSheet.setAllowNestedScroll(false);
            bottomSheetArr[0].transitionFromRight(bottomSheetParams.transitionFromLeft);
        }
        BottomSheet bottomSheet2 = bottomSheetArr[0];
        baseFragment.parentDialog = bottomSheet2;
        bottomSheet2.setOpenNoDelay(true);
        bottomSheetArr[0].show();
        return iNavigationLayoutArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z) {
        INavigationLayout iNavigationLayout;
        if (!allowPresentFragment() || (iNavigationLayout = this.parentLayout) == null) {
            return false;
        }
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(baseFragment);
        navigationParams.removeLast = z;
        return ((ActionBarLayout) iNavigationLayout).presentFragment(navigationParams);
    }

    public Dialog showDialog(Dialog dialog, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        INavigationLayout iNavigationLayout;
        if (dialog != null && (iNavigationLayout = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) iNavigationLayout;
            if (!actionBarLayout.transitionAnimationInProgress && !actionBarLayout.animationInProgress && !actionBarLayout.startedTracking && (z || !actionBarLayout.checkTransitionAnimation())) {
                ArrayList<AttachedSheet> arrayList = this.sheetsStack;
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
                    this.visibleDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(1, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z) {
        INavigationLayout iNavigationLayout;
        if (this.isFinished || (iNavigationLayout = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) iNavigationLayout).closeLastFragment(z, false);
        return true;
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2) {
        INavigationLayout iNavigationLayout;
        if (allowPresentFragment() && (iNavigationLayout = this.parentLayout) != null) {
            INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(baseFragment);
            navigationParams.removeLast = z;
            navigationParams.noAnimation = z2;
            navigationParams.checkPresentFromDelegate = true;
            navigationParams.preview = false;
            navigationParams.menuView = null;
            if (((ActionBarLayout) iNavigationLayout).presentFragment(navigationParams)) {
                return true;
            }
        }
        return false;
    }

    public StoryViewer getOrCreateStoryViewer(int i) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        StoryViewer storyViewer = null;
        StoryViewer storyViewer2 = (this.sheetsStack.isEmpty() || !(zziq.m(1, this.sheetsStack) instanceof StoryViewer)) ? null : (StoryViewer) zziq.m(1, this.sheetsStack);
        if (storyViewer2 == null || storyViewer2.currentAccount == i) {
            storyViewer = storyViewer2;
        } else {
            storyViewer2.close(true);
            removeSheet(storyViewer2);
        }
        if (storyViewer != null) {
            return storyViewer;
        }
        StoryViewer storyViewer3 = new StoryViewer(this);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isSheet) {
            storyViewer3.fromBottomSheet = true;
        }
        this.sheetsStack.add(storyViewer3);
        updateSheetsVisibility();
        return storyViewer3;
    }

    public boolean presentFragment(INavigationLayout.NavigationParams navigationParams) {
        INavigationLayout iNavigationLayout;
        return allowPresentFragment() && (iNavigationLayout = this.parentLayout) != null && ((ActionBarLayout) iNavigationLayout).presentFragment(navigationParams);
    }
}

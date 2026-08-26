package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Collections;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EdgeToEdgeSupportMode;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FolderDrawable;
import org.telegram.ui.Components.HintsController;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.LiquidGlassEffect;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.HintView2;

public class MainTabsActivity extends ViewPagerActivity implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private static final int ANIMATOR_ID_TABS_VISIBLE = 0;
    private static final int INDEX_CALLS = 3;
    private static final int INDEX_CHATS = 0;
    private static final int INDEX_CONTACTS = 1;
    private static final int INDEX_PROFILE = 4;
    private static final int INDEX_SETTINGS = 2;
    private static final int POSITION_CALLS_OR_SETTINGS = 2;
    private static final int POSITION_CHATS = 0;
    private static final int POSITION_CONTACTS = 1;
    private static final int POSITION_PROFILE = 3;
    public static final int TABS_COUNT = 4;
    private HintView2 accountSwitchHint;
    private boolean accountSwitchHintShown;
    private DialogsActivity dialogsActivity;
    private boolean dropCallsFragmentAfterPageScroll;
    private View fadeView;
    private NotificationCenter.ObserversGroup globalObserversGroup;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceTabGlass;
    private int insetLeft;
    private int insetRight;
    private int navigationBarHeight;
    private NotificationCenter.ObserversGroup observersGroup;
    private Integer pendingFolderId;
    private boolean tabletLayout;
    public GlassTabView[] tabs;
    private MainTabsLayout tabsView;
    private BlurredBackgroundDrawable tabsViewBackground;
    private FrameLayout tabsViewWrapper;
    private IUpdateLayout updateLayout;
    private UpdateLayoutWrapper updateLayoutWrapper;
    private final BoolAnimator animatorTabsVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380, true);
    private final RectF fragmentPosition = new RectF();

    public class FolderCounterSpan extends ReplacementSpan {
        private static final float HEIGHT_DP = 17.333f;
        private final Paint backgroundPaint;
        private final String count;
        private final float counterWidth;
        private final boolean hasUnmutedUnreadDialogs;
        private final TextPaint textPaint;

        public FolderCounterSpan(int i, boolean z) {
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            this.backgroundPaint = new Paint(1);
            String strValueOf = String.valueOf(i);
            this.count = strValueOf;
            this.hasUnmutedUnreadDialogs = z;
            textPaint.setTextSize(AndroidUtilities.dpf2(11.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            this.counterWidth = Math.max(AndroidUtilities.dp(7.333f), textPaint.measureText(strValueOf)) + AndroidUtilities.dp(10.0f);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            float fDp = f + AndroidUtilities.dp(5.0f);
            float fDp2 = ((i3 + i5) / 2.0f) + AndroidUtilities.dp(1.0f);
            float fDp3 = AndroidUtilities.dp(17.333f) / 2.0f;
            this.backgroundPaint.setColor(MainTabsActivity.this.getThemedColor(this.hasUnmutedUnreadDialogs ? Theme.key_featuredStickers_addButton : Theme.key_chats_tabUnreadUnactiveBackground));
            this.textPaint.setColor(MainTabsActivity.this.getThemedColor(Theme.key_actionBarDefault));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fDp, fDp2 - fDp3, this.counterWidth + fDp, fDp2 + fDp3);
            canvas.drawRoundRect(rectF, fDp3, fDp3, this.backgroundPaint);
            Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
            float f2 = fDp2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            String str = this.count;
            canvas.drawText(str, ((this.counterWidth - this.textPaint.measureText(str)) / 2.0f) + fDp, f2, this.textPaint);
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) Math.ceil(AndroidUtilities.dp(5.0f) + this.counterWidth);
        }
    }

    public class MainTabsActivityControllerImpl implements MainTabsActivityController {
        private MainTabsActivityControllerImpl() {
        }

        @Override
        public void setTabsVisible(boolean z) {
            MainTabsActivity.this.animatorTabsVisible.setValue(z, true);
        }
    }

    public MainTabsActivity() {
        if (Build.VERSION.SDK_INT >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceTabGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
                    blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, MainTabsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    Blur3HashImpl blur3HashImpl2 = (Blur3HashImpl) iBlur3Hash;
                    blur3HashImpl2.add(SharedConfig.chatBlurEnabled());
                    int size = MainTabsActivity.this.fragmentsArr.size();
                    for (int i = 0; i < size; i++) {
                        BaseFragment baseFragment = MainTabsActivity.this.fragmentsArr.valueAt(i).fragment;
                        View view = baseFragment.fragmentView;
                        if (view != null) {
                            MainTabsActivity mainTabsActivity = MainTabsActivity.this;
                            if (ViewPositionWatcher.computeRectInParent(view, mainTabsActivity.contentView, mainTabsActivity.fragmentPosition) && MainTabsActivity.this.fragmentPosition.right > 0.0f && MainTabsActivity.this.fragmentPosition.left < MainTabsActivity.this.fragmentView.getMeasuredWidth() && (baseFragment instanceof TabFragmentDelegate) && ((TabFragmentDelegate) baseFragment).getGlassSource() != null) {
                                blur3HashImpl2.addF(MainTabsActivity.this.fragmentPosition.left);
                                blur3HashImpl2.addF(MainTabsActivity.this.fragmentPosition.top);
                                blur3HashImpl2.hash = MediaDataController.calcHash(blur3HashImpl2.hash, baseFragment.getClassGuid());
                            }
                        }
                    }
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    BlurredBackgroundSourceRenderNode glassSource;
                    Canvas canvas2;
                    int measuredWidth = MainTabsActivity.this.fragmentView.getMeasuredWidth();
                    int measuredHeight = MainTabsActivity.this.fragmentView.getMeasuredHeight();
                    canvas.drawColor(MainTabsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    int size = MainTabsActivity.this.fragmentsArr.size();
                    int i = 0;
                    while (i < size) {
                        BaseFragment baseFragment = MainTabsActivity.this.fragmentsArr.valueAt(i).fragment;
                        View view = baseFragment.fragmentView;
                        if (view == null) {
                            canvas2 = canvas;
                        } else {
                            MainTabsActivity mainTabsActivity = MainTabsActivity.this;
                            if (ViewPositionWatcher.computeRectInParent(view, mainTabsActivity.contentView, mainTabsActivity.fragmentPosition) && MainTabsActivity.this.fragmentPosition.right > 0.0f && MainTabsActivity.this.fragmentPosition.left < MainTabsActivity.this.fragmentView.getMeasuredWidth() && (baseFragment instanceof TabFragmentDelegate) && (glassSource = ((TabFragmentDelegate) baseFragment).getGlassSource()) != null) {
                                canvas.save();
                                canvas.translate(MainTabsActivity.this.fragmentPosition.left, MainTabsActivity.this.fragmentPosition.top);
                                canvas2 = canvas;
                                glassSource.draw(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                                canvas2.restore();
                            } else {
                                canvas2 = canvas;
                            }
                        }
                        i++;
                        canvas = canvas2;
                    }
                }
            });
        } else {
            this.iBlur3SourceTabGlass = null;
        }
        this.iBlur3SourceColor = new BlurredBackgroundSourceColor();
        Bulletin.Delegate delegate = new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public final boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(64.0f) + MainTabsActivity.this.navigationBarHeight;
            }

            @Override
            public final int getLeftPadding() {
                return Bulletin.Delegate.CC.$default$getLeftPadding(this);
            }

            @Override
            public final int getRightPadding() {
                return Bulletin.Delegate.CC.$default$getRightPadding(this);
            }

            @Override
            public final int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public final void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public final void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public final void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }
        };
        Bulletin.addDelegate(this, delegate);
        Bulletin.addDelegate(this.contentView, delegate);
    }

    public void blur3_invalidateBlur() {
        View view;
        if (Build.VERSION.SDK_INT < 31 || this.iBlur3SourceTabGlass == null || (view = this.fragmentView) == null) {
            return;
        }
        this.iBlur3SourceTabGlass.setSize(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        this.iBlur3SourceTabGlass.renderNodeWithHash.updateDisplayListIfNeeded();
    }

    public void blur3_updateColors() {
        blur3_updateFadeColors();
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.tabsViewBackground;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        blur3_invalidateBlur();
        View view = this.fadeView;
        if (view != null) {
            view.invalidate();
        }
        MainTabsLayout mainTabsLayout = this.tabsView;
        if (mainTabsLayout != null) {
            mainTabsLayout.invalidate();
        }
        GlassTabView[] glassTabViewArr = this.tabs;
        if (glassTabViewArr != null) {
            for (GlassTabView glassTabView : glassTabViewArr) {
                glassTabView.getClass();
                glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, glassTabView.resourcesProvider);
                glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, glassTabView.resourcesProvider);
                glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, glassTabView.resourcesProvider);
                glassTabView.updateColors$2();
                glassTabView.invalidate();
            }
        }
    }

    public void blur3_updateFadeColors() {
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = this.iBlur3SourceColor;
        blurredBackgroundSourceColor.paint.setColor(getEstBackgroundColor());
        View view = this.fadeView;
        if (view != null) {
            view.invalidate();
        }
    }

    private boolean canScrollInternal(MotionEvent motionEvent, boolean z) {
        Object currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment instanceof TabFragmentDelegate) {
            return ((TabFragmentDelegate) currentVisibleFragment).canParentTabsSlide(motionEvent, z);
        }
        return false;
    }

    private void checkContactsTabBadge() {
        if (this.tabsView == null || this.tabs[1] == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 23 && ContactsController.hasContactsPermission();
        if (z) {
            MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (i < 23 || !UserConfig.getInstance(this.currentAccount).syncContacts || z || !MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
            this.tabs[1].setCounter(null, true, true);
        } else {
            this.tabs[1].setCounter("!", true, true);
        }
    }

    private void checkUi_callTabVisible(boolean z, boolean z2) {
        MainTabsLayout mainTabsLayout = this.tabsView;
        if (mainTabsLayout != null) {
            mainTabsLayout.setViewVisible(this.tabs[2], !z, z2);
            this.tabsView.setViewVisible(this.tabs[3], z, z2);
        }
    }

    public void checkUi_fadeView() {
        ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        if (viewPagerActivityPagerLayout == null || this.fadeView == null) {
            return;
        }
        float fClamp = 1.0f - MathUtils.clamp(Math.abs(3.0f - viewPagerActivityPagerLayout.getPositionAnimated()), 0.0f, 1.0f);
        float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.navigationBarHeight)) * fClamp)) * this.animatorTabsVisible.floatValue;
        if (this.tabletLayout) {
            navigationBarThirdButtonsFactor = 0.0f;
        }
        this.fadeView.setAlpha(navigationBarThirdButtonsFactor);
        this.fadeView.setTranslationY(fClamp * AndroidUtilities.dp(48.0f));
        this.fadeView.setVisibility(navigationBarThirdButtonsFactor > 0.0f ? 0 : 8);
    }

    public void checkUi_tabsPosition() {
        int i = -(this.updateLayoutWrapper.isUpdateLayoutVisible() ? AndroidUtilities.dp(44.0f) : 0);
        int iDp = AndroidUtilities.dp(40.0f) + i;
        float f = this.animatorTabsVisible.floatValue;
        AndroidUtilities.lerp(0.85f, 1.0f, f);
        this.tabsViewWrapper.setTranslationY(AndroidUtilities.lerp(iDp, i, f));
        this.tabsView.setClickable(f > 1.0f);
        this.tabsView.setEnabled(f > 1.0f);
        this.tabsView.setAlpha(f);
        this.tabsView.setVisibility(f <= 0.0f ? 8 : 0);
    }

    private void checkUnreadCount(boolean z) {
        if (this.tabsView == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount <= 0) {
            this.tabs[0].setCounter(null, false, z);
        } else {
            this.tabs[0].setCounter(LocaleController.formatNumber(mainUnreadCount, ','), false, z);
        }
    }

    public int getEstBackgroundColor() {
        int themedColor = getThemedColor(Theme.key_windowBackgroundGray);
        int themedColor2 = getThemedColor(Theme.key_windowBackgroundWhite);
        ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        return ColorUtils.blendARGB(viewPagerActivityPagerLayout != null ? viewPagerActivityPagerLayout.getPositionVisibility(0) : 1.0f, themedColor, themedColor2);
    }

    private boolean hasUnmutedUnreadDialogs(MessagesController.DialogFilter dialogFilter) {
        TLRPC.EncryptedChat encryptedChatM;
        MessagesController messagesController = getMessagesController();
        ArrayList<TLRPC.Dialog> dialogs = dialogFilter.isDefault() ? messagesController.getDialogs(0) : messagesController.getAllDialogs();
        for (int i = 0; i < dialogs.size(); i++) {
            TLRPC.Dialog dialog = dialogs.get(i);
            if (dialogFilter.isDefault()) {
                return messagesController.getDialogUnreadCount(dialog) <= 0 ? true : true;
            }
            long j = dialog.id;
            if (DialogObject.isEncryptedDialog(j) && (encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(messagesController, j)) != null) {
                j = encryptedChatM.user_id;
            }
            if (!dialogFilter.includesDialog(getAccountInstance(), j, dialog)) {
                continue;
            } else if ((messagesController.getDialogUnreadCount(dialog) <= 0 || dialog.unread_mark) && !messagesController.isDialogMuted(dialog.id, 0L)) {
            }
        }
        return false;
    }

    private static int indexToPosition(int i) {
        return i > 2 ? i - 1 : i;
    }

    public void lambda$createView$0(int i, View view) {
        if (this.viewPager.isManualScrolling() || this.viewPager.isTouch()) {
            return;
        }
        if (this.viewPager.getCurrentPosition() != i) {
            selectTab(i, true);
            this.viewPager.scrollToPosition(i);
        } else {
            Object currentVisibleFragment = getCurrentVisibleFragment();
            if (currentVisibleFragment instanceof TabFragmentDelegate) {
                ((TabFragmentDelegate) currentVisibleFragment).onParentScrollToTop();
            }
        }
    }

    public static void lambda$createView$1(View view) {
    }

    private void lambda$openAccountSelector$11() {
        AndroidUtilities.runOnUIThread(new MainTabsActivity$$ExternalSyntheticLambda7(this, 5), 1000L);
    }

    public void lambda$openAccountSelector$12(int i, ItemOptions itemOptions, View view) {
        if (this.currentAccount == i) {
            return;
        }
        itemOptions.dismiss();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.switchToAccount(i, true);
        }
    }

    public static int lambda$openAccountSelector$8(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void lambda$openAccountSelector$9() {
        int i = 0;
        Integer numValueOf = null;
        for (int i2 = 3; i2 >= 0; i2--) {
            if (!UserConfig.getInstance(i2).isClientActivated()) {
                i++;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i2);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i--;
        }
        if (i > 0 && numValueOf != null) {
            presentFragment(new LoginActivity(numValueOf.intValue()));
        } else {
            if (UserConfig.hasPremiumOnAccounts()) {
                return;
            }
            showDialog(new LimitReachedBottomSheet(7, this, getContext(), this.currentAccount, null));
        }
    }

    public void lambda$openCallsSelector$4() {
        CallLogActivity.openCreateCall(this);
    }

    public void lambda$openCallsSelector$5() {
        getUserConfig().setShowCallsTab(false);
        checkUi_callTabVisible(false, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public void lambda$openCallsSelector$6() {
        getUserConfig().setShowCallsTab(true);
        checkUi_callTabVisible(true, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public void lambda$openContactsSelector$2() {
        new NewContactBottomSheet(this, getContext()).show();
    }

    public void lambda$openContactsSelector$3() {
        presentFragment(new CallLogActivity(CallLogActivity$$ExternalSyntheticOutline0.m("needFinishFragment", false)));
    }

    public void lambda$openFoldersSelector$7(ItemOptions itemOptions, MessagesController.DialogFilter dialogFilter, View view) {
        itemOptions.dismiss();
        openFolder(dialogFilter.id);
    }

    public void lambda$showAccountChangeHint$13() {
        AndroidUtilities.removeFromParent(this.accountSwitchHint);
    }

    public void lambda$showAccountChangeHint$14() {
        GlassTabView[] glassTabViewArr;
        if (getContext() == null || (glassTabViewArr = this.tabs) == null) {
            return;
        }
        GlassTabView glassTabView = glassTabViewArr[4];
        float width = ((glassTabView.getWidth() / 2.0f) + (this.contentView.getWidth() - ((glassTabView.getX() + this.tabsView.getX()) + glassTabView.getWidth()))) / AndroidUtilities.density;
        HintView2 hintView2 = new HintView2(getContext(), 3);
        this.accountSwitchHint = hintView2;
        hintView2.setTranslationY(AndroidUtilities.dp(4.0f) + (-this.navigationBarHeight));
        this.accountSwitchHint.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
        this.accountSwitchHint.setMultilineText(false);
        this.accountSwitchHint.setCloseButton(true);
        this.accountSwitchHint.setText(LocaleController.getString(R.string.SwitchAccountHint));
        this.accountSwitchHint.setJoint(1.0f, (-width) + 7.33f);
        this.contentView.addView(this.accountSwitchHint, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        this.accountSwitchHint.setOnHiddenListener(new MainTabsActivity$$ExternalSyntheticLambda7(this, 4));
        this.accountSwitchHint.setDuration(8000L);
        this.accountSwitchHint.show();
        HintsController.Hint.AccountSwitchHint.increment();
    }

    private void openFolder(int i) {
        DialogsActivity dialogsActivity;
        if (this.viewPager.getCurrentPosition() == 0 && (dialogsActivity = this.dialogsActivity) != null) {
            dialogsActivity.scrollToFolder(i);
            return;
        }
        if (this.dialogsActivity == null) {
            prepareDialogsActivity(null);
        }
        this.pendingFolderId = Integer.valueOf(i);
        selectTab(0, true);
        this.viewPager.scrollToPosition(0);
    }

    public boolean openFoldersSelector(View view) {
        ArrayList<MessagesController.DialogFilter> dialogFilters;
        if (getContext() == null || getParentActivity() == null || (dialogFilters = getMessagesController().getDialogFilters()) == null || dialogFilters.size() <= 1) {
            return false;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
        for (int i = 0; i < dialogFilters.size(); i++) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i);
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(2, getParentActivity(), getResourceProvider(), false, false);
            actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, actionBarMenuSubItem.getTextView().getPaint().getFontMetricsInt(), false);
            if (!dialogFilter.isDefault()) {
                charSequenceReplaceEmoji = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, dialogFilter.entities, actionBarMenuSubItem.getTextView().getPaint().getFontMetricsInt());
            }
            int mainUnreadCount = dialogFilter.isDefault() ? MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount() : dialogFilter.unreadCount;
            if (mainUnreadCount > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceReplaceEmoji);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) String.valueOf(mainUnreadCount));
                spannableStringBuilder.setSpan(new FolderCounterSpan(mainUnreadCount, hasUnmutedUnreadDialogs(dialogFilter)), length, spannableStringBuilder.length(), 33);
                actionBarMenuSubItem.setContentDescription(TextUtils.concat(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, "\n", LocaleController.formatPluralString("AccDescrUnreadCount", mainUnreadCount, new Object[0])));
                charSequenceReplaceEmoji = spannableStringBuilder;
            }
            actionBarMenuSubItem.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
            actionBarMenuSubItem.setTextAndIcon(charSequenceReplaceEmoji, 0, new FolderDrawable(getContext(), R.drawable.msg_folders, getMessagesController().folderTags ? dialogFilter.color : -1));
            actionBarMenuSubItem.getTextView().setEmojiColor(getThemedColor(Theme.key_featuredStickers_addButton));
            actionBarMenuSubItem.setMinimumWidth(160);
            actionBarMenuSubItem.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda0(this, itemOptionsMakeOptions, dialogFilter, 12));
            itemOptionsMakeOptions.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
        }
        itemOptionsMakeOptions.translate(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
        itemOptionsMakeOptions.setMaxHeight(AndroidUtilities.dp(400.0f));
        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
        itemOptionsMakeOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
        itemOptionsMakeOptions.setGravity(3);
        itemOptionsMakeOptions.show();
        return true;
    }

    private void showAccountChangeHint() {
        if (this.accountSwitchHintShown) {
            return;
        }
        if (this.accountSwitchHint == null && HintsController.Hint.AccountSwitchHint.show()) {
            AndroidUtilities.runOnUIThread(new MainTabsActivity$$ExternalSyntheticLambda7(this, 0), 1500L);
        }
        this.accountSwitchHintShown = true;
    }

    public LinearLayout accountView(int i, final boolean z) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 0, 0));
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(currentUser);
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            private final Paint selectedPaint = new Paint(1);

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (z) {
                    this.selectedPaint.setStyle(Paint.Style.STROKE);
                    this.selectedPaint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    this.selectedPaint.setColor(MainTabsActivity.this.getThemedColor(Theme.key_featuredStickers_addButton));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.selectedPaint);
                }
                super.dispatchDraw(canvas);
            }
        };
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(34, 34, 16, 12, 0, 0, 0));
        BackupImageView backupImageView = new BackupImageView(getContext());
        if (z) {
            backupImageView.setScaleX(0.833f);
            backupImageView.setScaleY(0.833f);
        }
        backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
        backupImageView.getImageReceiver().setCurrentAccount(i);
        backupImageView.setForUserOrChat(currentUser, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createLinear(32, 32, 17, 1, 1, 1, 1));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        textView.setText(UserObject.getUserName(currentUser));
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, LayoutHelper.createLinear(0, -2, 1.0f, 16, 13, 0, 14, 0));
        return linearLayout;
    }

    @Override
    public boolean canBeginSlide() {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        return currentVisibleFragment != null && currentVisibleFragment.canBeginSlide();
    }

    @Override
    public boolean canScrollBackward(MotionEvent motionEvent) {
        return canScrollInternal(motionEvent, false);
    }

    @Override
    public boolean canScrollForward(MotionEvent motionEvent) {
        return canScrollInternal(motionEvent, true);
    }

    @Override
    public BaseFragment createBaseFragmentAt(int i) {
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i == 2) {
            if (!getUserConfig().showCallsTab) {
                return new SettingsActivity(CallLogActivity$$ExternalSyntheticOutline0.m("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new CallLogActivity(bundle2);
        }
        if (i == 0) {
            DialogsActivity dialogsActivity = new DialogsActivity(CallLogActivity$$ExternalSyntheticOutline0.m("hasMainTabs", true));
            this.dialogsActivity = dialogsActivity;
            dialogsActivity.setMainTabsActivityController(new MainTabsActivityControllerImpl());
            return this.dialogsActivity;
        }
        if (i != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3);
    }

    @Override
    public FrameLayout createContentView(Context context) {
        return new FrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                int estBackgroundColor = MainTabsActivity.this.getEstBackgroundColor();
                if (MainTabsActivity.this.insetLeft != 0) {
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, MainTabsActivity.this.insetLeft, getHeight(), Theme.fillingPaint(estBackgroundColor));
                } else {
                    canvas2 = canvas;
                }
                if (MainTabsActivity.this.insetRight != 0) {
                    canvas2.drawRect(getWidth() - MainTabsActivity.this.insetRight, 0.0f, getWidth(), getHeight(), Theme.fillingPaint(estBackgroundColor));
                }
                super.dispatchDraw(canvas2);
                MainTabsActivity.this.blur3_invalidateBlur();
                MainTabsActivity.this.blur3_updateFadeColors();
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                MainTabsActivity.this.checkUi_tabsPosition();
                MainTabsActivity.this.checkUi_fadeView();
            }
        };
    }

    @Override
    public View createView(Context context) {
        super.createView(context);
        this.tabletLayout = false;
        MainTabsLayout mainTabsLayout = new MainTabsLayout(context, this.resourceProvider);
        this.tabsView = mainTabsLayout;
        mainTabsLayout.setClipChildren(false);
        this.tabsView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.tabsView.setMaxWidth(AndroidUtilities.dp(344.0f));
        GlassTabView[] glassTabViewArr = new GlassTabView[5];
        this.tabs = glassTabViewArr;
        glassTabViewArr[0] = GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.CHATS, R.string.MainTabsChats);
        this.tabs[1] = GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.CONTACTS, R.string.MainTabsContacts);
        this.tabs[2] = GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.SETTINGS, R.string.Settings);
        this.tabs[3] = GlassTabView.createMainTab(context, this.resourceProvider, GlassTabView.TabAnimation.CALLS, R.string.MainTabsCalls);
        GlassTabView[] glassTabViewArr2 = this.tabs;
        Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
        int i = this.currentAccount;
        int i2 = R.string.MainTabsProfile;
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.textView.setText(LocaleController.getString(i2));
        glassTabView.imageView.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
        AvatarDrawable avatarDrawable = new AvatarDrawable(user);
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        backupImageView.setRoundRadius(AndroidUtilities.dp(11.0f));
        glassTabView.backupImageView = backupImageView;
        glassTabView.addView(backupImageView, LayoutHelper.createFrame(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
        glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
        glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
        glassTabView.updateColors$2();
        glassTabViewArr2[4] = glassTabView;
        final int i3 = 0;
        this.tabs[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final MainTabsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (i3) {
                    case 0:
                        return this.f$0.openFoldersSelector(view);
                    case 1:
                        return this.f$0.openContactsSelector(view);
                    case 2:
                        return this.f$0.openCallsSelector(view);
                    default:
                        return this.f$0.openAccountSelector(view);
                }
            }
        });
        final int i4 = 1;
        this.tabs[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final MainTabsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (i4) {
                    case 0:
                        return this.f$0.openFoldersSelector(view);
                    case 1:
                        return this.f$0.openContactsSelector(view);
                    case 2:
                        return this.f$0.openCallsSelector(view);
                    default:
                        return this.f$0.openAccountSelector(view);
                }
            }
        });
        final int i5 = 2;
        this.tabs[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final MainTabsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (i5) {
                    case 0:
                        return this.f$0.openFoldersSelector(view);
                    case 1:
                        return this.f$0.openContactsSelector(view);
                    case 2:
                        return this.f$0.openCallsSelector(view);
                    default:
                        return this.f$0.openAccountSelector(view);
                }
            }
        });
        final int i6 = 3;
        this.tabs[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final MainTabsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (i6) {
                    case 0:
                        return this.f$0.openFoldersSelector(view);
                    case 1:
                        return this.f$0.openContactsSelector(view);
                    case 2:
                        return this.f$0.openCallsSelector(view);
                    default:
                        return this.f$0.openAccountSelector(view);
                }
            }
        });
        this.tabsView.addTabToIgnoreClick(this.tabs[0]);
        this.tabsView.addTabToIgnoreClick(this.tabs[1]);
        this.tabsView.addTabToIgnoreClick(this.tabs[4]);
        this.tabsView.addTabToIgnoreClick(this.tabs[3]);
        int i7 = 0;
        while (true) {
            GlassTabView[] glassTabViewArr3 = this.tabs;
            if (i7 >= glassTabViewArr3.length) {
                break;
            }
            GlassTabView glassTabView2 = glassTabViewArr3[i7];
            this.tabs[i7].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda323(this, indexToPosition(i7), 4));
            this.tabsView.addView(this.tabs[i7]);
            this.tabsView.setViewVisible(glassTabView2, true, false);
            i7++;
        }
        checkUi_callTabVisible(getUserConfig().showCallsTab, false);
        selectTab(this.viewPager.getCurrentPosition(), false);
        this.iBlur3SourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        BlurredBackgroundSource blurredBackgroundSource = this.iBlur3SourceTabGlass;
        if (blurredBackgroundSource == null) {
            blurredBackgroundSource = this.iBlur3SourceColor;
        }
        FrameLayout frameLayout = this.contentView;
        boolean zIsEnabled = LiteMode.isEnabled(262144);
        MainTabsLayout mainTabsLayout2 = this.tabsView;
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilderMainTabs = BlurredBackgroundProviderImpl.mainTabs(this.resourceProvider);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreateDrawable = blurredBackgroundSource.createDrawable();
        if (zIsEnabled && Build.VERSION.SDK_INT >= 33 && (blurredBackgroundDrawableCreateDrawable instanceof BlurredBackgroundDrawableRenderNode)) {
            BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = (BlurredBackgroundDrawableRenderNode) blurredBackgroundDrawableCreateDrawable;
            blurredBackgroundDrawableRenderNode.liquidGlassEffect = new LiquidGlassEffect(blurredBackgroundDrawableRenderNode.renderNodeFill);
        }
        blurredBackgroundDrawableCreateDrawable.setColorProvider(blurredBackgroundProviderBuilderMainTabs);
        if (frameLayout != null && mainTabsLayout2 != null) {
            viewPositionWatcher.subscribe(mainTabsLayout2, frameLayout, new RateCallLayout$$ExternalSyntheticLambda1(9, blurredBackgroundDrawableCreateDrawable, mainTabsLayout2), false);
        }
        this.tabsViewBackground = blurredBackgroundDrawableCreateDrawable;
        blurredBackgroundDrawableCreateDrawable.setRadius(AndroidUtilities.dp(28.0f));
        this.tabsViewBackground.setPadding(AndroidUtilities.dp(7.666f));
        this.tabsView.setBackground(this.tabsViewBackground);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = this.iBlur3SourceColor;
        FrameLayout frameLayout2 = this.contentView;
        this.fadeView = new View(context);
        View view = this.fadeView;
        blurredBackgroundSourceColor.getClass();
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceColor);
        blurredBackgroundDrawableSource.setColorProvider(null);
        if (frameLayout2 != null && view != null) {
            viewPositionWatcher.subscribe(view, frameLayout2, new RateCallLayout$$ExternalSyntheticLambda1(9, blurredBackgroundDrawableSource, view), false);
        }
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableSource);
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(60.0f), true);
        this.fadeView.setBackground(blurredBackgroundWithFadeDrawable);
        this.contentView.addView(this.fadeView, LayoutHelper.createFrame(-1, 0, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.tabsViewWrapper = frameLayout3;
        frameLayout3.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda464(4));
        this.tabsViewWrapper.addView(this.tabsView, LayoutHelper.createFrame(-1, 72, 81));
        this.tabsViewWrapper.setClipToPadding(false);
        this.contentView.addView(this.tabsViewWrapper, LayoutHelper.createFrame(-1, -2, 80));
        UpdateLayoutWrapper updateLayoutWrapper = new UpdateLayoutWrapper(context);
        this.updateLayoutWrapper = updateLayoutWrapper;
        this.contentView.addView(updateLayoutWrapper, LayoutHelper.createFrame(-1, -2, 80));
        IUpdateLayout iUpdateLayoutTakeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.updateLayoutWrapper);
        this.updateLayout = iUpdateLayoutTakeUpdateLayout;
        if (iUpdateLayoutTakeUpdateLayout != null) {
            iUpdateLayoutTakeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        updateLayout();
        checkUnreadCount(false);
        return this.contentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        GlassTabView glassTabView;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z = false;
        if (i == NotificationCenter.notificationsCountUpdated || i == NotificationCenter.updateInterfaces) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z = true;
            }
            checkUnreadCount(z);
            return;
        }
        if (i == NotificationCenter.appUpdateLoading) {
            IUpdateLayout iUpdateLayout3 = this.updateLayout;
            if (iUpdateLayout3 != null) {
                iUpdateLayout3.updateFileProgress(null);
                this.updateLayout.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.updateLayout) != null) {
                iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoadFailed) {
            String str2 = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.updateLayout) != null) {
                iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoadProgressChanged) {
            IUpdateLayout iUpdateLayout4 = this.updateLayout;
            if (iUpdateLayout4 != null) {
                iUpdateLayout4.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i == NotificationCenter.appUpdateAvailable) {
            IUpdateLayout iUpdateLayout5 = this.updateLayout;
            if (iUpdateLayout5 == null || (launchActivity = LaunchActivity.instance) == null) {
                return;
            }
            iUpdateLayout5.updateAppUpdateViews(this.currentAccount, launchActivity.getMainFragmentsStackSize() == 1);
            return;
        }
        if (i == NotificationCenter.needSetDayNightTheme) {
            clearAllHiddenFragments();
            return;
        }
        if (i == NotificationCenter.callTabsVisibleToggled) {
            checkUi_callTabVisible(getUserConfig().showCallsTab, true);
            ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
            if (viewPagerActivityPagerLayout == null || viewPagerActivityPagerLayout.getCurrentPosition() != 2) {
                dropFragmentAtPosition(2);
                return;
            }
            this.viewPager.scrollToPosition(0);
            selectTab(0, true);
            this.dropCallsFragmentAfterPageScroll = true;
            return;
        }
        if (i != NotificationCenter.mainUserInfoChanged) {
            if (i == NotificationCenter.contactsPermissionBadgeCheck) {
                checkContactsTabBadge();
                return;
            }
            return;
        }
        GlassTabView[] glassTabViewArr = this.tabs;
        if (glassTabViewArr == null || (glassTabView = glassTabViewArr[4]) == null) {
            return;
        }
        int i3 = this.currentAccount;
        TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(UserConfig.getInstance(i3).getClientUserId()));
        glassTabView.backupImageView.setForUserOrChat(user, new AvatarDrawable(user));
    }

    @Override
    public Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            return currentVisibleFragment.getCustomSlideTransition(z, z2, f);
        }
        return null;
    }

    public DialogsActivity getDialogsActivity() {
        return this.dialogsActivity;
    }

    @Override
    public EdgeToEdgeSupportMode getEdgeToEdgeSupportMode() {
        return EdgeToEdgeSupportMode.FULL;
    }

    @Override
    public int getFragmentsCount() {
        return 4;
    }

    @Override
    public int getStartPosition() {
        return 0;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions = super.getThemeDescriptions();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 23);
        themeDescriptions.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhite));
        themeDescriptions.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_dialogBackground));
        return themeDescriptions;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        this.insetLeft = defaultWindowInsets.left;
        int i = defaultWindowInsets.right;
        this.insetRight = i;
        this.navigationBarHeight = defaultWindowInsets.bottom;
        boolean zIsUpdateLayoutVisible = this.updateLayoutWrapper.isUpdateLayoutVisible();
        int iDp = zIsUpdateLayoutVisible ? AndroidUtilities.dp(44.0f) : 0;
        this.updateLayoutWrapper.setPadding(0, 0, 0, this.navigationBarHeight);
        int iDp2 = AndroidUtilities.dp(72.0f) + this.navigationBarHeight + iDp;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.fadeView.getLayoutParams();
        if (marginLayoutParams.height != iDp2) {
            marginLayoutParams.height = iDp2;
            this.fadeView.setLayoutParams(marginLayoutParams);
        }
        int iM = zIsUpdateLayoutVisible ? this.navigationBarHeight + iDp : 0;
        if (this.tabletLayout) {
            iM = MessageObject$$ExternalSyntheticOutline0.m(72.0f, this.navigationBarHeight, iM);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.viewPager.getLayoutParams();
        int i2 = marginLayoutParams2.bottomMargin;
        int i3 = defaultWindowInsets.left;
        if (i2 != iM || marginLayoutParams2.leftMargin != i3 || marginLayoutParams2.rightMargin != i) {
            marginLayoutParams2.leftMargin = i3;
            marginLayoutParams2.rightMargin = i;
            marginLayoutParams2.bottomMargin = iM;
            this.viewPager.setLayoutParams(marginLayoutParams2);
        }
        this.tabsViewWrapper.setPadding(i3, 0, i, this.navigationBarHeight);
        if (zIsUpdateLayoutVisible) {
            windowInsetsCompat = windowInsetsCompat.mImpl.inset(0, 0, 0, this.navigationBarHeight);
        }
        checkUi_tabsPosition();
        checkUi_fadeView();
        return super.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public boolean onBackPressed(boolean z) {
        int startPosition;
        boolean zOnBackPressed = super.onBackPressed(z);
        if (!zOnBackPressed || this.viewPager.getCurrentPosition() == (startPosition = getStartPosition())) {
            return zOnBackPressed;
        }
        if (!z) {
            return false;
        }
        this.viewPager.scrollToPosition(startPosition);
        return false;
    }

    @Override
    public void onBeginSlide() {
        super.onBeginSlide();
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.onBeginSlide();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateLayout();
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkUi_tabsPosition();
            checkUi_fadeView();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        this.observersGroup = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.globalObserversGroup = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        Bulletin.removeDelegate(this);
        Bulletin.removeDelegate(this.contentView);
        NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.observersGroup = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.globalObserversGroup;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.globalObserversGroup = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public void onPause() {
        super.onPause();
        HintView2 hintView2 = this.accountSwitchHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        blur3_updateColors();
        checkContactsTabBadge();
        checkUnreadCount(true);
        showAccountChangeHint();
    }

    @Override
    public void onSlideProgress(boolean z, float f) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.onSlideProgress(z, f);
        }
    }

    @Override
    public void onViewPagerScrollEnd() {
        DialogsActivity dialogsActivity;
        if (this.tabsView != null) {
            selectTab(this.viewPager.getCurrentPosition(), true);
            setGestureSelectedOverride(0.0f, false);
        }
        blur3_invalidateBlur();
        ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        if (viewPagerActivityPagerLayout != null) {
            int currentPosition = viewPagerActivityPagerLayout.getCurrentPosition();
            if (currentPosition != 2 && this.dropCallsFragmentAfterPageScroll) {
                dropFragmentAtPosition(2);
                this.dropCallsFragmentAfterPageScroll = false;
            }
            if (currentPosition != 3) {
                dropFragmentAtPosition(3);
            }
            Integer num = this.pendingFolderId;
            if (num == null || currentPosition != 0 || (dialogsActivity = this.dialogsActivity) == null) {
                return;
            }
            dialogsActivity.scrollToFolder(num.intValue());
            this.pendingFolderId = null;
        }
    }

    @Override
    public void onViewPagerTabAnimationUpdate(boolean z) {
        boolean z2 = !z;
        if (this.tabsView != null) {
            float positionAnimated = this.viewPager.getPositionAnimated();
            setGestureSelectedOverride(positionAnimated, z2);
            if (!z) {
                selectTab(Math.round(positionAnimated), true);
            }
        }
        checkUi_fadeView();
        blur3_invalidateBlur();
        this.contentView.invalidate();
    }

    public boolean openAccountSelector(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda10(14));
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            itemOptionsMakeOptions.add(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new MainTabsActivity$$ExternalSyntheticLambda7(this, 8));
        }
        if (arrayList.size() > 0) {
            if (itemOptionsMakeOptions.getItemsCount() > 0) {
                itemOptionsMakeOptions.addGap();
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int iIntValue = ((Integer) obj).intValue();
                LinearLayout linearLayoutAccountView = accountView(iIntValue, this.currentAccount == iIntValue);
                linearLayoutAccountView.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(this, iIntValue, itemOptionsMakeOptions, 6));
                itemOptionsMakeOptions.addView(linearLayoutAccountView, LayoutHelper.createLinear(230, 48));
            }
        }
        itemOptionsMakeOptions.setBlur(true);
        itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
        itemOptionsMakeOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
        itemOptionsMakeOptions.show();
        HintsController.Hint.AccountSwitchHint.doNotShowAgain();
        return true;
    }

    public boolean openCallsSelector(View view) {
        if (getContext() == null || getParentActivity() == null) {
            return false;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
        itemOptionsMakeOptions.add(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new MainTabsActivity$$ExternalSyntheticLambda7(this, 1));
        if (getUserConfig().showCallsTab) {
            itemOptionsMakeOptions.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new MainTabsActivity$$ExternalSyntheticLambda7(this, 2));
        } else {
            itemOptionsMakeOptions.add(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new MainTabsActivity$$ExternalSyntheticLambda7(this, 3));
        }
        itemOptionsMakeOptions.setBlur(true);
        itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
        itemOptionsMakeOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
        itemOptionsMakeOptions.show();
        return true;
    }

    public boolean openContactsSelector(View view) {
        if (getContext() == null || getParentActivity() == null) {
            return false;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
        itemOptionsMakeOptions.add(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new MainTabsActivity$$ExternalSyntheticLambda7(this, 6));
        itemOptionsMakeOptions.add(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new MainTabsActivity$$ExternalSyntheticLambda7(this, 7));
        itemOptionsMakeOptions.setBlur(true);
        itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
        itemOptionsMakeOptions.setGravity(3);
        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
        itemOptionsMakeOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
        itemOptionsMakeOptions.show();
        return true;
    }

    public DialogsActivity prepareDialogsActivity(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        this.dialogsActivity = dialogsActivity;
        dialogsActivity.setMainTabsActivityController(new MainTabsActivityControllerImpl());
        putFragmentAtPosition(0, this.dialogsActivity);
        return this.dialogsActivity;
    }

    @Override
    public void prepareFragmentToSlide(boolean z, boolean z2) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.prepareFragmentToSlide(z, z2);
        }
    }

    public void selectTab(int i, boolean z) {
        int i2 = 0;
        while (true) {
            GlassTabView[] glassTabViewArr = this.tabs;
            if (i2 >= glassTabViewArr.length) {
                return;
            }
            glassTabViewArr[i2].setSelected(indexToPosition(i2) == i, z);
            i2++;
        }
    }

    public void setGestureSelectedOverride(float f, boolean z) {
        for (int i = 0; i < this.tabs.length; i++) {
            float fMax = Math.max(0.0f, 1.0f - Math.abs(indexToPosition(i) - f));
            GlassTabView glassTabView = this.tabs[i];
            glassTabView.gestureSelectedOverride = fMax;
            glassTabView.hasGestureSelectedOverride = z;
            glassTabView.invalidate();
        }
        this.tabsView.invalidate();
    }

    public void updateLayout() {
    }

    public interface TabFragmentDelegate {
        boolean canParentTabsSlide(MotionEvent motionEvent, boolean z);

        BlurredBackgroundSourceRenderNode getGlassSource();

        void onParentScrollToTop();

        public abstract class CC {
            public static boolean $default$canParentTabsSlide(TabFragmentDelegate tabFragmentDelegate, MotionEvent motionEvent, boolean z) {
                return false;
            }

            public static BlurredBackgroundSourceRenderNode $default$getGlassSource(TabFragmentDelegate tabFragmentDelegate) {
                return null;
            }

            public static void $default$onParentScrollToTop(TabFragmentDelegate tabFragmentDelegate) {
            }
        }
    }
}

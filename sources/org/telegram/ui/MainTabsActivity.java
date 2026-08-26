package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
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
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
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
import org.telegram.messenger.MessageObject;
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
import org.telegram.ui.Components.HintsController$Hint;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.LiquidGlassEffect;
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

public final class MainTabsActivity extends ViewPagerActivity implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public HintView2 accountSwitchHint;
    public boolean accountSwitchHintShown;
    public DialogsActivity dialogsActivity;
    public boolean dropCallsFragmentAfterPageScroll;
    public View fadeView;
    public NotificationCenter.ObserversGroup globalObserversGroup;
    public final BlurredBackgroundSourceColor iBlur3SourceColor;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceTabGlass;
    public int insetLeft;
    public int insetRight;
    public int navigationBarHeight;
    public NotificationCenter.ObserversGroup observersGroup;
    public Integer pendingFolderId;
    public GlassTabView[] tabs;
    public MainTabsLayout tabsView;
    public BlurredBackgroundDrawable tabsViewBackground;
    public FrameLayout tabsViewWrapper;
    public IUpdateLayout updateLayout;
    public UpdateLayoutWrapper updateLayoutWrapper;
    public final BoolAnimator animatorTabsVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380, true);
    public final RectF fragmentPosition = new RectF();

    public final class FolderCounterSpan extends ReplacementSpan {
        public final Paint backgroundPaint;
        public final String count;
        public final float counterWidth;
        public final boolean hasUnmutedUnreadDialogs;
        public final TextPaint textPaint;

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
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            float fDp = f + AndroidUtilities.dp(5.0f);
            float fDp2 = ((i3 + i5) / 2.0f) + AndroidUtilities.dp(1.0f);
            float fDp3 = AndroidUtilities.dp(17.333f) / 2.0f;
            Paint paint2 = this.backgroundPaint;
            int i6 = this.hasUnmutedUnreadDialogs ? Theme.key_featuredStickers_addButton : Theme.key_chats_tabUnreadUnactiveBackground;
            MainTabsActivity mainTabsActivity = MainTabsActivity.this;
            paint2.setColor(mainTabsActivity.getThemedColor(i6));
            TextPaint textPaint = this.textPaint;
            textPaint.setColor(mainTabsActivity.getThemedColor(Theme.key_actionBarDefault));
            RectF rectF = AndroidUtilities.rectTmp;
            float f2 = this.counterWidth;
            rectF.set(fDp, fDp2 - fDp3, fDp + f2, fDp2 + fDp3);
            canvas.drawRoundRect(rectF, fDp3, fDp3, paint2);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f3 = fDp2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            String str = this.count;
            canvas.drawText(str, ((f2 - textPaint.measureText(str)) / 2.0f) + fDp, f3, textPaint);
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) Math.ceil(AndroidUtilities.dp(5.0f) + this.counterWidth);
        }
    }

    public interface TabFragmentDelegate {
        boolean canParentTabsSlide(MotionEvent motionEvent, boolean z);

        BlurredBackgroundSourceRenderNode getGlassSource();

        void onParentScrollToTop();
    }

    public MainTabsActivity() {
        if (Build.VERSION.SDK_INT >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceTabGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new PollItemMenu.AnonymousClass6(this, 2));
        } else {
            this.iBlur3SourceTabGlass = null;
        }
        this.iBlur3SourceColor = new BlurredBackgroundSourceColor();
        ChatActivity.AnonymousClass103 anonymousClass103 = new ChatActivity.AnonymousClass103(this, 12);
        setBulletinDelegate(anonymousClass103);
        LoginActivity.AnonymousClass4 anonymousClass4 = this.contentView;
        if (anonymousClass4 != null) {
            anonymousClass4.setTag(R.id.bulletin_delegate_tag, anonymousClass103);
        }
    }

    public final void blur3_invalidateBlur() {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        View view;
        if (Build.VERSION.SDK_INT < 31 || (blurredBackgroundSourceRenderNode = this.iBlur3SourceTabGlass) == null || (view = this.fragmentView) == null) {
            return;
        }
        blurredBackgroundSourceRenderNode.setSize(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        blurredBackgroundSourceRenderNode.renderNodeWithHash.updateDisplayListIfNeeded();
    }

    public final void blur3_updateColors() {
        int themedColor = getThemedColor(Theme.key_windowBackgroundGray);
        int themedColor2 = getThemedColor(Theme.key_windowBackgroundWhite);
        ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        this.iBlur3SourceColor.paint.setColor(ColorUtils.blendARGB(viewPagerActivityPagerLayout != null ? viewPagerActivityPagerLayout.getMeasuredWidth() == 0 ? MathUtils.clamp(1 - Math.abs(viewPagerActivityPagerLayout.getCurrentPosition()), 0, 1) : MathUtils.clamp(1.0f - Math.abs(viewPagerActivityPagerLayout.getPositionAnimated() - 0), 0.0f, 1.0f) : 1.0f, themedColor, themedColor2));
        View view = this.fadeView;
        if (view != null) {
            view.invalidate();
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.tabsViewBackground;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        blur3_invalidateBlur();
        View view2 = this.fadeView;
        if (view2 != null) {
            view2.invalidate();
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
                glassTabView.updateColors$11();
                glassTabView.invalidate();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        return currentVisibleFragment != null && currentVisibleFragment.canBeginSlide();
    }

    public final void checkContactsTabBadge() {
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

    public final void checkUi_callTabVisible(boolean z, boolean z2) {
        MainTabsLayout mainTabsLayout = this.tabsView;
        if (mainTabsLayout != null) {
            mainTabsLayout.setViewVisible(this.tabs[2], !z, z2);
            this.tabsView.setViewVisible(this.tabs[3], z, z2);
        }
    }

    public final void checkUi_fadeView$1() {
        ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
        if (viewPagerActivityPagerLayout == null || this.fadeView == null) {
            return;
        }
        float fClamp = 1.0f - MathUtils.clamp(Math.abs(3.0f - viewPagerActivityPagerLayout.getPositionAnimated()), 0.0f, 1.0f);
        float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.navigationBarHeight)) * fClamp)) * this.animatorTabsVisible.floatValue;
        this.fadeView.setAlpha(navigationBarThirdButtonsFactor);
        this.fadeView.setTranslationY(fClamp * AndroidUtilities.dp(48.0f));
        this.fadeView.setVisibility(navigationBarThirdButtonsFactor > 0.0f ? 0 : 8);
    }

    public final void checkUi_tabsPosition() {
        View view = this.updateLayoutWrapper.updateLayout;
        int i = -((view == null || view.getVisibility() != 0) ? 0 : AndroidUtilities.dp(44.0f));
        int iDp = AndroidUtilities.dp(40.0f) + i;
        float f = this.animatorTabsVisible.floatValue;
        AndroidUtilities.lerp(0.85f, 1.0f, f);
        this.tabsViewWrapper.setTranslationY(AndroidUtilities.lerp(iDp, i, f));
        this.tabsView.setClickable(f > 1.0f);
        this.tabsView.setEnabled(f > 1.0f);
        this.tabsView.setAlpha(f);
        this.tabsView.setVisibility(f <= 0.0f ? 8 : 0);
    }

    public final void checkUnreadCount(boolean z) {
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

    @Override
    public final BaseFragment createBaseFragmentAt(int i) {
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i == 2) {
            if (!getUserConfig().showCallsTab) {
                return new SettingsActivity(zzkw.m("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new CallLogActivity(bundle2);
        }
        if (i == 0) {
            DialogsActivity dialogsActivity = new DialogsActivity(zzkw.m("hasMainTabs", true));
            this.dialogsActivity = dialogsActivity;
            dialogsActivity.mainTabsActivityController = new PhotoViewer.AnonymousClass18(this, 22);
            return dialogsActivity;
        }
        if (i != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
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
        backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
        backupImageView.onNewImageSet();
        backupImageView.setRoundRadius(AndroidUtilities.dp(11.0f));
        glassTabView.backupImageView = backupImageView;
        glassTabView.addView(backupImageView, LayoutHelper.createFrame(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
        glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
        glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
        glassTabView.updateColors$11();
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
                        MainTabsActivity mainTabsActivity = this.f$0;
                        if (mainTabsActivity.getParentActivity() == null || mainTabsActivity.getParentActivity() == null) {
                            return false;
                        }
                        ItemOptions itemOptions = new ItemOptions(mainTabsActivity, view, false, true);
                        itemOptions.add(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 5), false);
                        itemOptions.add(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 6), false);
                        itemOptions.blur = true;
                        itemOptions.blurForMenu = true;
                        itemOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
                        itemOptions.gravity = 3;
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), mainTabsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
                        itemOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
                        itemOptions.show();
                        return true;
                    case 2:
                        MainTabsActivity mainTabsActivity2 = this.f$0;
                        if (mainTabsActivity2.getParentActivity() == null || mainTabsActivity2.getParentActivity() == null) {
                            return false;
                        }
                        ItemOptions itemOptions2 = new ItemOptions(mainTabsActivity2, view, false, true);
                        itemOptions2.add(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 7), false);
                        if (mainTabsActivity2.getUserConfig().showCallsTab) {
                            itemOptions2.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 1), false);
                        } else {
                            itemOptions2.add(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 2), false);
                        }
                        itemOptions2.blur = true;
                        itemOptions2.blurForMenu = true;
                        itemOptions2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable2 = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), mainTabsActivity2.getThemedColor(Theme.key_windowBackgroundWhite));
                        shapeDrawableCreateRoundRectDrawable2.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
                        itemOptions2.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable2);
                        itemOptions2.show();
                        return true;
                    default:
                        this.f$0.openAccountSelector$1(view);
                        return true;
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
                        MainTabsActivity mainTabsActivity = this.f$0;
                        if (mainTabsActivity.getParentActivity() == null || mainTabsActivity.getParentActivity() == null) {
                            return false;
                        }
                        ItemOptions itemOptions = new ItemOptions(mainTabsActivity, view, false, true);
                        itemOptions.add(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 5), false);
                        itemOptions.add(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 6), false);
                        itemOptions.blur = true;
                        itemOptions.blurForMenu = true;
                        itemOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
                        itemOptions.gravity = 3;
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), mainTabsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
                        itemOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
                        itemOptions.show();
                        return true;
                    case 2:
                        MainTabsActivity mainTabsActivity2 = this.f$0;
                        if (mainTabsActivity2.getParentActivity() == null || mainTabsActivity2.getParentActivity() == null) {
                            return false;
                        }
                        ItemOptions itemOptions2 = new ItemOptions(mainTabsActivity2, view, false, true);
                        itemOptions2.add(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 7), false);
                        if (mainTabsActivity2.getUserConfig().showCallsTab) {
                            itemOptions2.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 1), false);
                        } else {
                            itemOptions2.add(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 2), false);
                        }
                        itemOptions2.blur = true;
                        itemOptions2.blurForMenu = true;
                        itemOptions2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable2 = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), mainTabsActivity2.getThemedColor(Theme.key_windowBackgroundWhite));
                        shapeDrawableCreateRoundRectDrawable2.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
                        itemOptions2.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable2);
                        itemOptions2.show();
                        return true;
                    default:
                        this.f$0.openAccountSelector$1(view);
                        return true;
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
                        MainTabsActivity mainTabsActivity = this.f$0;
                        if (mainTabsActivity.getParentActivity() == null || mainTabsActivity.getParentActivity() == null) {
                            return false;
                        }
                        ItemOptions itemOptions = new ItemOptions(mainTabsActivity, view, false, true);
                        itemOptions.add(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 5), false);
                        itemOptions.add(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 6), false);
                        itemOptions.blur = true;
                        itemOptions.blurForMenu = true;
                        itemOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
                        itemOptions.gravity = 3;
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), mainTabsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
                        itemOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
                        itemOptions.show();
                        return true;
                    case 2:
                        MainTabsActivity mainTabsActivity2 = this.f$0;
                        if (mainTabsActivity2.getParentActivity() == null || mainTabsActivity2.getParentActivity() == null) {
                            return false;
                        }
                        ItemOptions itemOptions2 = new ItemOptions(mainTabsActivity2, view, false, true);
                        itemOptions2.add(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 7), false);
                        if (mainTabsActivity2.getUserConfig().showCallsTab) {
                            itemOptions2.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 1), false);
                        } else {
                            itemOptions2.add(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 2), false);
                        }
                        itemOptions2.blur = true;
                        itemOptions2.blurForMenu = true;
                        itemOptions2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable2 = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), mainTabsActivity2.getThemedColor(Theme.key_windowBackgroundWhite));
                        shapeDrawableCreateRoundRectDrawable2.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
                        itemOptions2.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable2);
                        itemOptions2.show();
                        return true;
                    default:
                        this.f$0.openAccountSelector$1(view);
                        return true;
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
                        MainTabsActivity mainTabsActivity = this.f$0;
                        if (mainTabsActivity.getParentActivity() == null || mainTabsActivity.getParentActivity() == null) {
                            return false;
                        }
                        ItemOptions itemOptions = new ItemOptions(mainTabsActivity, view, false, true);
                        itemOptions.add(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 5), false);
                        itemOptions.add(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity, 6), false);
                        itemOptions.blur = true;
                        itemOptions.blurForMenu = true;
                        itemOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
                        itemOptions.gravity = 3;
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), mainTabsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
                        itemOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
                        itemOptions.show();
                        return true;
                    case 2:
                        MainTabsActivity mainTabsActivity2 = this.f$0;
                        if (mainTabsActivity2.getParentActivity() == null || mainTabsActivity2.getParentActivity() == null) {
                            return false;
                        }
                        ItemOptions itemOptions2 = new ItemOptions(mainTabsActivity2, view, false, true);
                        itemOptions2.add(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 7), false);
                        if (mainTabsActivity2.getUserConfig().showCallsTab) {
                            itemOptions2.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 1), false);
                        } else {
                            itemOptions2.add(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new MainTabsActivity$$ExternalSyntheticLambda6(mainTabsActivity2, 2), false);
                        }
                        itemOptions2.blur = true;
                        itemOptions2.blurForMenu = true;
                        itemOptions2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable2 = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), mainTabsActivity2.getThemedColor(Theme.key_windowBackgroundWhite));
                        shapeDrawableCreateRoundRectDrawable2.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
                        itemOptions2.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable2);
                        itemOptions2.show();
                        return true;
                    default:
                        this.f$0.openAccountSelector$1(view);
                        return true;
                }
            }
        });
        this.tabsView.tabsWithIgnoreClick.add(this.tabs[0]);
        this.tabsView.tabsWithIgnoreClick.add(this.tabs[1]);
        this.tabsView.tabsWithIgnoreClick.add(this.tabs[4]);
        this.tabsView.tabsWithIgnoreClick.add(this.tabs[3]);
        int i7 = 0;
        while (true) {
            GlassTabView[] glassTabViewArr3 = this.tabs;
            if (i7 >= glassTabViewArr3.length) {
                break;
            }
            GlassTabView glassTabView2 = glassTabViewArr3[i7];
            glassTabView2.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i7 > 2 ? i7 - 1 : i7, 16));
            this.tabsView.addView(this.tabs[i7]);
            this.tabsView.setViewVisible(glassTabView2, true, false);
            i7++;
        }
        checkUi_callTabVisible(getUserConfig().showCallsTab, false);
        selectTab(this.viewPager.getCurrentPosition(), false);
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = this.iBlur3SourceColor;
        blurredBackgroundSourceColor.paint.setColor(themedColor);
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        BlurredBackgroundSource blurredBackgroundSource = this.iBlur3SourceTabGlass;
        if (blurredBackgroundSource == null) {
            blurredBackgroundSource = blurredBackgroundSourceColor;
        }
        LoginActivity.AnonymousClass4 anonymousClass4 = this.contentView;
        boolean zIsEnabled = LiteMode.isEnabled(262144);
        MainTabsLayout mainTabsLayout2 = this.tabsView;
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilderMainTabs = BlurredBackgroundProviderImpl.mainTabs(this.resourceProvider);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreateDrawable = blurredBackgroundSource.createDrawable();
        if (zIsEnabled && Build.VERSION.SDK_INT >= 33 && (blurredBackgroundDrawableCreateDrawable instanceof BlurredBackgroundDrawableRenderNode)) {
            BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = (BlurredBackgroundDrawableRenderNode) blurredBackgroundDrawableCreateDrawable;
            blurredBackgroundDrawableRenderNode.liquidGlassEffect = new LiquidGlassEffect(blurredBackgroundDrawableRenderNode.renderNodeFill);
        }
        blurredBackgroundDrawableCreateDrawable.setColorProvider(blurredBackgroundProviderBuilderMainTabs);
        if (anonymousClass4 != null && mainTabsLayout2 != null) {
            viewPositionWatcher.subscribe(mainTabsLayout2, anonymousClass4, new RateCallLayout$$ExternalSyntheticLambda1(22, blurredBackgroundDrawableCreateDrawable, mainTabsLayout2), false);
        }
        this.tabsViewBackground = blurredBackgroundDrawableCreateDrawable;
        blurredBackgroundDrawableCreateDrawable.setRadius(AndroidUtilities.dp(28.0f));
        this.tabsViewBackground.setPadding(AndroidUtilities.dp(7.666f));
        this.tabsView.setBackground(this.tabsViewBackground);
        LoginActivity.AnonymousClass4 anonymousClass5 = this.contentView;
        this.fadeView = new View(context);
        View view = this.fadeView;
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceColor);
        blurredBackgroundDrawableSource.setColorProvider(null);
        if (anonymousClass5 != null && view != null) {
            viewPositionWatcher.subscribe(view, anonymousClass5, new RateCallLayout$$ExternalSyntheticLambda1(22, blurredBackgroundDrawableSource, view), false);
        }
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableSource);
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(60.0f), true);
        this.fadeView.setBackground(blurredBackgroundWithFadeDrawable);
        this.contentView.addView(this.fadeView, LayoutHelper.createFrame(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.tabsViewWrapper = frameLayout;
        frameLayout.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(19));
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
        checkUnreadCount(false);
        return this.contentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        GlassTabView glassTabView;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z = false;
        z = false;
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
                iUpdateLayout3.updateFileProgress();
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
                iUpdateLayout4.updateFileProgress();
                return;
            }
            return;
        }
        if (i == NotificationCenter.appUpdateAvailable) {
            IUpdateLayout iUpdateLayout5 = this.updateLayout;
            if (iUpdateLayout5 == null || (launchActivity = LaunchActivity.instance) == null) {
                return;
            }
            iUpdateLayout5.updateAppUpdateViews(this.currentAccount, launchActivity.mainFragmentsStack.size() == 1);
            return;
        }
        if (i == NotificationCenter.needSetDayNightTheme) {
            int currentPosition = this.viewPager.getCurrentPosition();
            SparseArray sparseArray = this.fragmentsArr;
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                ViewPagerActivity.FragmentState fragmentState = (ViewPagerActivity.FragmentState) sparseArray.valueAt(i3);
                if (sparseArray.keyAt(i3) != currentPosition && fragmentState != null) {
                    fragmentState.fragment.clearViews();
                }
            }
            return;
        }
        if (i == NotificationCenter.callTabsVisibleToggled) {
            checkUi_callTabVisible(getUserConfig().showCallsTab, true);
            ViewPagerActivity.ViewPagerActivityPagerLayout viewPagerActivityPagerLayout = this.viewPager;
            if (viewPagerActivityPagerLayout == null || viewPagerActivityPagerLayout.getCurrentPosition() != 2) {
                dropFragmentAtPosition(2);
                return;
            }
            this.viewPager.scrollToPosition$1(0);
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
        int i4 = this.currentAccount;
        TLRPC.User user = MessagesController.getInstance(i4).getUser(Long.valueOf(UserConfig.getInstance(i4).getClientUserId()));
        AvatarDrawable avatarDrawable = new AvatarDrawable(user);
        BackupImageView backupImageView = glassTabView.backupImageView;
        backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
        backupImageView.onNewImageSet();
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            return currentVisibleFragment.getCustomSlideTransition(z, z2, f);
        }
        return null;
    }

    @Override
    public final EdgeToEdgeSupportMode getEdgeToEdgeSupportMode() {
        return EdgeToEdgeSupportMode.FULL;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(6, this);
        themeDescriptions.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhite));
        themeDescriptions.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_dialogBackground));
        return themeDescriptions;
    }

    public final void lambda$openAccountSelector$12(int i, ItemOptions itemOptions) {
        if (this.currentAccount == i) {
            return;
        }
        itemOptions.dismiss();
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.switchToAccount(i);
        }
    }

    public final void lambda$openAccountSelector$9() {
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
            showDialog(new LimitReachedBottomSheet(7, this.currentAccount, getParentActivity(), this, null));
        }
    }

    public final void lambda$openCallsSelector$5() {
        getUserConfig().setShowCallsTab(false);
        checkUi_callTabVisible(false, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public final void lambda$openCallsSelector$6() {
        getUserConfig().setShowCallsTab(true);
        checkUi_callTabVisible(true, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        boolean zOnBackPressed = super.onBackPressed(z);
        if (zOnBackPressed && this.viewPager.getCurrentPosition() != 0) {
            zOnBackPressed = false;
            if (z) {
                this.viewPager.scrollToPosition$1(0);
            }
        }
        return zOnBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.onBeginSlide();
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkUi_tabsPosition();
            checkUi_fadeView$1();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.observersGroup = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.globalObserversGroup = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
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
    public final void onPause() {
        super.onPause();
        HintView2 hintView2 = this.accountSwitchHint;
        if (hintView2 != null) {
            hintView2.hide(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        blur3_updateColors();
        checkContactsTabBadge();
        checkUnreadCount(true);
        if (this.accountSwitchHintShown) {
            return;
        }
        if (this.accountSwitchHint == null && HintsController$Hint.AccountSwitchHint.show()) {
            AndroidUtilities.runOnUIThread(new MainTabsActivity$$ExternalSyntheticLambda6(this, 0), 1500L);
        }
        this.accountSwitchHintShown = true;
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.onSlideProgress(z, f);
        }
    }

    public final void openAccountSelector$1(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(1));
        ItemOptions itemOptions = new ItemOptions(this, view, false, true);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            itemOptions.add(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new MainTabsActivity$$ExternalSyntheticLambda6(this, 4), false);
        }
        if (arrayList.size() > 0) {
            if (itemOptions.getItemsCount() > 0) {
                itemOptions.addGap();
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int iIntValue = ((Integer) obj).intValue();
                boolean z = this.currentAccount == iIntValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(iIntValue).getCurrentUser();
                AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                avatarDrawable.setInfo(UserConfig.selectedAccount, currentUser);
                DialogsActivity.AnonymousClass52 anonymousClass52 = new DialogsActivity.AnonymousClass52(this, getParentActivity(), z);
                linearLayout.addView(anonymousClass52, LayoutHelper.createLinear(34, 34, 16, 12, 0, 0, 0));
                BackupImageView backupImageView = new BackupImageView(getParentActivity());
                if (z) {
                    backupImageView.setScaleX(0.833f);
                    backupImageView.setScaleY(0.833f);
                }
                backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
                backupImageView.getImageReceiver().setCurrentAccount(iIntValue);
                backupImageView.imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
                backupImageView.onNewImageSet();
                anonymousClass52.addView(backupImageView, LayoutHelper.createLinear(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, LayoutHelper.createLinear(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(this, iIntValue, itemOptions, 16));
                itemOptions.addView(linearLayout, LayoutHelper.createLinear(230, 48));
            }
        }
        itemOptions.blur = true;
        itemOptions.blurForMenu = true;
        itemOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
        itemOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
        itemOptions.show();
        HintsController$Hint.AccountSwitchHint.doNotShowAgain();
    }

    public final boolean openFoldersSelector(View view) {
        ArrayList<MessagesController.DialogFilter> dialogFilters;
        ?? r18;
        ?? r19;
        boolean z;
        TLRPC.EncryptedChat encryptedChatM;
        ?? r4 = 0;
        if (getParentActivity() == null || getParentActivity() == null || (dialogFilters = getMessagesController().getDialogFilters()) == null || dialogFilters.size() <= 1) {
            return false;
        }
        int i = 0;
        ?? itemOptions = new ItemOptions(this, view, false, true);
        while (i < dialogFilters.size()) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i);
            ?? actionBarMenuSubItem = new ActionBarMenuSubItem(2, getParentActivity(), getResourceProvider(), false, false);
            actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), r4, AndroidUtilities.dp(18.0f), r4);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, actionBarMenuSubItem.getTextView().getPaint().getFontMetricsInt(), r4);
            if (!dialogFilter.isDefault()) {
                charSequenceReplaceEmoji = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, dialogFilter.entities, actionBarMenuSubItem.getTextView().getPaint().getFontMetricsInt());
            }
            int mainUnreadCount = dialogFilter.isDefault() ? MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount() : dialogFilter.unreadCount;
            if (mainUnreadCount > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceReplaceEmoji);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) String.valueOf(mainUnreadCount));
                ?? messagesController = getMessagesController();
                ArrayList<TLRPC.Dialog> dialogs = dialogFilter.isDefault() ? messagesController.getDialogs(r4) : messagesController.getAllDialogs();
                int i2 = 0;
                ?? r5 = itemOptions;
                while (true) {
                    if (i2 >= dialogs.size()) {
                        r19 = r5;
                        z = false;
                        break;
                    }
                    TLRPC.Dialog dialog = dialogs.get(i2);
                    ?? r110 = r5;
                    if (dialogFilter.isDefault()) {
                        if (messagesController.getDialogUnreadCount(dialog) > 0) {
                            z = true;
                            r19 = r110;
                            break;
                        }
                        z = true;
                        r19 = r110;
                        break;
                    }
                    long j = dialog.id;
                    if (DialogObject.isEncryptedDialog(j) && (encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(messagesController, j)) != null) {
                        j = encryptedChatM.user_id;
                    }
                    if (!dialogFilter.includesDialog(getAccountInstance(), j, dialog)) {
                        continue;
                    } else if ((messagesController.getDialogUnreadCount(dialog) > 0 || dialog.unread_mark) && !messagesController.isDialogMuted(dialog.id, 0L)) {
                        z = true;
                        r19 = r110;
                        break;
                    }
                    i2++;
                    r5 = r110;
                }
                spannableStringBuilder.setSpan(new FolderCounterSpan(mainUnreadCount, z), length, spannableStringBuilder.length(), 33);
                actionBarMenuSubItem.setContentDescription(TextUtils.concat(dialogFilter.isDefault() ? LocaleController.getString(R.string.FilterAllChats) : dialogFilter.name, "\n", LocaleController.formatPluralString("AccDescrUnreadCount", mainUnreadCount, new Object[0])));
                charSequenceReplaceEmoji = spannableStringBuilder;
                r18 = r19;
            } else {
                r18 = itemOptions;
            }
            actionBarMenuSubItem.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
            actionBarMenuSubItem.setTextAndIcon(charSequenceReplaceEmoji, 0, new FolderDrawable(getParentActivity(), R.drawable.msg_folders, getMessagesController().folderTags ? dialogFilter.color : -1));
            actionBarMenuSubItem.getTextView().setEmojiColor(getThemedColor(Theme.key_featuredStickers_addButton));
            actionBarMenuSubItem.setMinimumWidth(160);
            ?? r6 = r18;
            actionBarMenuSubItem.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(this, r6, dialogFilter, 8));
            r6.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
            i++;
            r4 = 0;
            itemOptions = r6;
        }
        itemOptions.translate(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
        itemOptions.maxHeight = AndroidUtilities.dp(400.0f);
        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(0.15f, -16777216));
        itemOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
        itemOptions.gravity = 3;
        itemOptions.show();
        return true;
    }

    public final DialogsActivity prepareDialogsActivity(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        this.dialogsActivity = dialogsActivity;
        dialogsActivity.mainTabsActivityController = new PhotoViewer.AnonymousClass18(this, 22);
        this.fragmentsArr.put(0, new ViewPagerActivity.FragmentState(dialogsActivity));
        return this.dialogsActivity;
    }

    @Override
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        BaseFragment currentVisibleFragment = getCurrentVisibleFragment();
        if (currentVisibleFragment != null) {
            currentVisibleFragment.prepareFragmentToSlide(z, z2);
        }
    }

    public final void selectTab(int i, boolean z) {
        int i2 = 0;
        while (true) {
            GlassTabView[] glassTabViewArr = this.tabs;
            if (i2 >= glassTabViewArr.length) {
                return;
            }
            glassTabViewArr[i2].setSelected((i2 > 2 ? i2 + (-1) : i2) == i, z);
            i2++;
        }
    }
}

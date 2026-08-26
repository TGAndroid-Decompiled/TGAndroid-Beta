package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;

public final class EnableTopicsActivity extends BaseFragment {
    public TLRPC.Chat currentChat;
    public final long dialogId;
    public boolean forum;
    public boolean isTabs;
    public AnonymousClass2 listView;
    public OAuthSheet$$ExternalSyntheticLambda18 onForumChanged;

    public final class AnonymousClass2 extends UniversalRecyclerView {
        @Override
        public final Integer getSelectorColor(int i) {
            UItem item = this.adapter.getItem(i);
            if (item == null || item.id != 2) {
                return super.getSelectorColor(i);
            }
            return 0;
        }
    }

    public final class TopicsLayoutSwitcher extends LinearLayout {
        public ValueAnimator animator;
        public final BackupImageView leftImageView;
        public final FrameLayout leftLayout;
        public final FrameLayout leftTitleBackground;
        public final Theme.ResourcesProvider resourcesProvider;
        public final BackupImageView rightImageView;
        public final FrameLayout rightLayout;
        public final FrameLayout rightTitleBackground;
        public float tabsAlpha;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                TopicsLayoutSwitcher topicsLayoutSwitcher = (TopicsLayoutSwitcher) view;
                topicsLayoutSwitcher.leftLayout.setOnClickListener((View.OnClickListener) uItem.object);
                topicsLayoutSwitcher.rightLayout.setOnClickListener((View.OnClickListener) uItem.object2);
                topicsLayoutSwitcher.setChecked(uItem.checked, false);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new TopicsLayoutSwitcher(context, resourcesProvider);
            }
        }

        public TopicsLayoutSwitcher(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setOrientation(0);
            setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            FrameLayout frameLayout = new FrameLayout(context);
            this.leftLayout = frameLayout;
            ScaleStateListAnimator.apply(frameLayout, 0.05f, 1.25f);
            addView(frameLayout, LayoutHelper.createLinear(-1, 226, 1.0f, 119));
            BackupImageView backupImageView = new BackupImageView(context);
            this.leftImageView = backupImageView;
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.topics_tabs, "topics_tabs", AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f), true, null));
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            int i = Theme.key_windowBackgroundWhiteGrayText2;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 14.0f, i, true, null);
            int i2 = R.string.TopicsLayoutTabs;
            textViewMakeTextView.setPadding(zzlm.m(12.0f, i2, textViewMakeTextView), 0, AndroidUtilities.dp(12.0f), 0);
            frameLayout2.addView(textViewMakeTextView, LayoutHelper.createFrame(-2, -2, 17));
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.leftTitleBackground = frameLayout3;
            frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            int iDp = AndroidUtilities.dp(13.0f);
            int i3 = Theme.key_featuredStickers_addButton;
            frameLayout3.setBackground(Theme.createRoundRectDrawable(iDp, Theme.getColor(i3, resourcesProvider)));
            frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-2, 26, 17));
            int i4 = Theme.key_windowBackgroundCheckText;
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i4, true, null);
            textViewMakeTextView2.setText(LocaleController.getString(i2));
            frameLayout3.addView(textViewMakeTextView2, LayoutHelper.createFrame(-2, -2, 17));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.rightLayout = frameLayout4;
            ScaleStateListAnimator.apply(frameLayout4, 0.05f, 1.25f);
            addView(frameLayout4, LayoutHelper.createLinear(-1, 226, 1.0f, 119));
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.rightImageView = backupImageView2;
            backupImageView2.setImageDrawable(new RLottieDrawable(R.raw.topics_list, "topics_list", AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f), true, null));
            frameLayout4.addView(backupImageView2, LayoutHelper.createFrame(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
            FrameLayout frameLayout5 = new FrameLayout(context);
            TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 14.0f, i, true, null);
            int i5 = R.string.TopicsLayoutList;
            textViewMakeTextView3.setPadding(zzlm.m(12.0f, i5, textViewMakeTextView3), 0, AndroidUtilities.dp(12.0f), 0);
            frameLayout5.addView(textViewMakeTextView3, LayoutHelper.createFrame(-2, -2, 17));
            FrameLayout frameLayout6 = new FrameLayout(context);
            this.rightTitleBackground = frameLayout6;
            frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            frameLayout6.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), Theme.getColor(i3, resourcesProvider)));
            frameLayout5.addView(frameLayout6, LayoutHelper.createFrame(-2, 26, 17));
            TextView textViewMakeTextView4 = TextHelper.makeTextView(context, 14.0f, i4, true, null);
            textViewMakeTextView4.setText(LocaleController.getString(i5));
            frameLayout6.addView(textViewMakeTextView4, LayoutHelper.createFrame(-2, -2, 17));
            frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
            setChecked(false, false);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public final void setChecked(boolean z, boolean z2) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            BackupImageView backupImageView = this.rightImageView;
            BackupImageView backupImageView2 = this.leftImageView;
            FrameLayout frameLayout = this.rightTitleBackground;
            FrameLayout frameLayout2 = this.leftTitleBackground;
            if (z2) {
                ViewPropertyAnimator viewPropertyAnimatorAlpha = frameLayout2.animate().scaleX(!z ? 0.0f : 1.0f).scaleY(!z ? 0.0f : 1.0f).alpha(!z ? 0.0f : 1.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                OKLCH.m(viewPropertyAnimatorAlpha, cubicBezierInterpolator, 320L);
                frameLayout.animate().scaleX(z ? 0.0f : 1.0f).scaleY(z ? 0.0f : 1.0f).alpha(z ? 0.0f : 1.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.tabsAlpha, z ? 1.0f : 0.0f);
                this.animator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 11));
                this.animator.addListener(new LoginActivity.AnonymousClass9(17, this, z));
                this.animator.setInterpolator(cubicBezierInterpolator);
                this.animator.setDuration(320L);
                this.animator.start();
            } else {
                frameLayout2.animate().cancel();
                frameLayout.animate().cancel();
                frameLayout2.setScaleX(!z ? 0.0f : 1.0f);
                frameLayout2.setScaleY(!z ? 0.0f : 1.0f);
                frameLayout2.setAlpha(!z ? 0.0f : 1.0f);
                frameLayout.setScaleX(z ? 0.0f : 1.0f);
                frameLayout.setScaleY(z ? 0.0f : 1.0f);
                frameLayout.setAlpha(z ? 0.0f : 1.0f);
                this.tabsAlpha = z ? 1.0f : 0.0f;
                int i = Theme.key_windowBackgroundWhiteGrayText5;
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                int color = Theme.getColor(i, resourcesProvider);
                int i2 = Theme.key_featuredStickers_addButton;
                int iBlendARGB = ColorUtils.blendARGB(this.tabsAlpha, color, Theme.getColor(i2, resourcesProvider));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                backupImageView2.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
                backupImageView2.invalidate();
                backupImageView.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(1.0f - this.tabsAlpha, Theme.getColor(i, resourcesProvider), Theme.getColor(i2, resourcesProvider)), mode));
                backupImageView.invalidate();
            }
            if (z) {
                backupImageView = backupImageView2;
            }
            RLottieDrawable lottieAnimation = backupImageView.getImageReceiver().getLottieAnimation();
            if (lottieAnimation != null) {
                if (lottieAnimation.getProgress() > (z ? 0.85f : 0.8f)) {
                    lottieAnimation.setProgress(0.0f, false);
                }
                lottieAnimation.restart(true);
            }
        }
    }

    public EnableTopicsActivity(long j) {
        super(null);
        this.dialogId = j;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 15));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(getParentActivity(), getCurrentAccount(), getClassGuid(), new GiftSheet$$ExternalSyntheticLambda8(this, 21), new VideoEditTextureView$$ExternalSyntheticLambda1(this, 19), null, getResourceProvider());
        this.listView = anonymousClass2;
        anonymousClass2.setSections();
        this.listView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourceProvider));
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.currentChat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        return super.onFragmentCreate();
    }
}

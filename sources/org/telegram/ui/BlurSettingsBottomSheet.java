package org.telegram.ui;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.stripe.android.Stripe;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;

public final class BlurSettingsBottomSheet extends BottomSheet {
    public static float blurAlpha = 1.0f - (Color.alpha(Theme.getColor(null, Theme.key_chat_BlurAlpha, false)) / 255.0f);
    public static float blurRadius = 1.0f;
    public static float saturation = 1.0f;
    public final SizeNotifierFrameLayout contentView;

    public BlurSettingsBottomSheet(BaseFragment baseFragment) {
        super(baseFragment.getParentActivity(), null, false, false);
        if (baseFragment.getFragmentView() instanceof SizeNotifierFrameLayout) {
            this.contentView = (SizeNotifierFrameLayout) baseFragment.getFragmentView();
        }
        Activity parentActivity = baseFragment.getParentActivity();
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(parentActivity, 1);
        final TextView textView = new TextView(parentActivity);
        textView.setText("Saturation " + (saturation * 5.0f));
        int i = Theme.key_dialogTextBlue2;
        ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, i, false), 16.0f, 1, true);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        linearLayoutM.addView(textView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        SeekBarView seekBarView = new SeekBarView(parentActivity, null, false);
        final int i2 = 0;
        seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate(this) {
            public final BlurSettingsBottomSheet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final CharSequence getContentDescription() {
                switch (i2) {
                }
                return null;
            }

            @Override
            public final int getStepsCount() {
                switch (i2) {
                }
                return 0;
            }

            @Override
            public final void onSeekBarDrag(float f, boolean z) {
                switch (i2) {
                    case 0:
                        BlurSettingsBottomSheet.saturation = f;
                        textView.setText("Saturation " + (f * 5.0f));
                        BlurSettingsBottomSheet blurSettingsBottomSheet = this.this$0;
                        blurSettingsBottomSheet.contentView.invalidateBlurredViews();
                        blurSettingsBottomSheet.contentView.invalidateBlur();
                        break;
                    default:
                        textView.setText("Alpha " + BlurSettingsBottomSheet.blurAlpha);
                        BlurSettingsBottomSheet.blurAlpha = f;
                        this.this$0.contentView.invalidateBlur();
                        break;
                }
            }

            @Override
            public final void onSeekBarPressed() {
                int i3 = i2;
            }

            private final void onSeekBarPressed$org$telegram$ui$BlurSettingsBottomSheet$1() {
            }

            private final void onSeekBarPressed$org$telegram$ui$BlurSettingsBottomSheet$2() {
            }
        });
        seekBarView.setReportChanges(true);
        linearLayoutM.addView(seekBarView, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
        final TextView textView2 = new TextView(parentActivity);
        textView2.setText("Alpha " + blurAlpha);
        ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, i, false), 16.0f, 1, true);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        linearLayoutM.addView(textView2, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        SeekBarView seekBarView2 = new SeekBarView(parentActivity, null, false);
        final int i3 = 1;
        seekBarView2.setDelegate(new SeekBarView.SeekBarViewDelegate(this) {
            public final BlurSettingsBottomSheet this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final CharSequence getContentDescription() {
                switch (i3) {
                }
                return null;
            }

            @Override
            public final int getStepsCount() {
                switch (i3) {
                }
                return 0;
            }

            @Override
            public final void onSeekBarDrag(float f, boolean z) {
                switch (i3) {
                    case 0:
                        BlurSettingsBottomSheet.saturation = f;
                        textView2.setText("Saturation " + (f * 5.0f));
                        BlurSettingsBottomSheet blurSettingsBottomSheet = this.this$0;
                        blurSettingsBottomSheet.contentView.invalidateBlurredViews();
                        blurSettingsBottomSheet.contentView.invalidateBlur();
                        break;
                    default:
                        textView2.setText("Alpha " + BlurSettingsBottomSheet.blurAlpha);
                        BlurSettingsBottomSheet.blurAlpha = f;
                        this.this$0.contentView.invalidateBlur();
                        break;
                }
            }

            @Override
            public final void onSeekBarPressed() {
                int i4 = i3;
            }

            private final void onSeekBarPressed$org$telegram$ui$BlurSettingsBottomSheet$1() {
            }

            private final void onSeekBarPressed$org$telegram$ui$BlurSettingsBottomSheet$2() {
            }
        });
        seekBarView2.setReportChanges(true);
        linearLayoutM.addView(seekBarView2, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
        TextView textView3 = new TextView(parentActivity);
        textView3.setText("Blur Radius");
        ArticleViewer.IBlock.CC.m(textView3, Theme.getColor(null, i, false), 16.0f, 1, true);
        textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        linearLayoutM.addView(textView3, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        SeekBarView seekBarView3 = new SeekBarView(parentActivity, null, false);
        seekBarView3.setDelegate(new Stripe(this, 14));
        seekBarView3.setReportChanges(true);
        linearLayoutM.addView(seekBarView3, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
        linearLayoutM.addOnLayoutChangeListener(new AnonymousClass4(seekBarView, seekBarView3, seekBarView2));
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayoutM);
        setCustomView(scrollView);
    }

    public final class AnonymousClass4 implements View.OnLayoutChangeListener {
        public final int $r8$classId;
        public final Object val$seekBar;
        public final Object val$seekBar2;
        public final Object val$seekBar3;

        public AnonymousClass4(FloatingToolbar floatingToolbar) {
            this.$r8$classId = 1;
            this.val$seekBar3 = floatingToolbar;
            this.val$seekBar = new Rect();
            this.val$seekBar2 = new Rect();
        }

        @Override
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            switch (this.$r8$classId) {
                case 0:
                    ((SeekBarView) this.val$seekBar).setProgress(BlurSettingsBottomSheet.saturation);
                    ((SeekBarView) this.val$seekBar2).setProgress(BlurSettingsBottomSheet.blurRadius);
                    ((SeekBarView) this.val$seekBar3).setProgress(BlurSettingsBottomSheet.blurAlpha);
                    break;
                default:
                    Rect rect = (Rect) this.val$seekBar;
                    rect.set(i, i2, i3, i4);
                    Rect rect2 = (Rect) this.val$seekBar2;
                    rect2.set(i5, i6, i7, i8);
                    FloatingToolbar floatingToolbar = (FloatingToolbar) this.val$seekBar3;
                    if (floatingToolbar.mPopup.isShowing() && !rect.equals(rect2)) {
                        floatingToolbar.mWidthChanged = true;
                        if (floatingToolbar.mPopup.isShowing()) {
                            floatingToolbar.doShow();
                        }
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass4(SeekBarView seekBarView, SeekBarView seekBarView2, SeekBarView seekBarView3) {
            this.$r8$classId = 0;
            this.val$seekBar = seekBarView;
            this.val$seekBar2 = seekBarView2;
            this.val$seekBar3 = seekBarView3;
        }
    }
}

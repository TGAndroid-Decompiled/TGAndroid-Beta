package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public class GroupCallRecordAlert extends BottomSheet {
    private int currentPage;
    private float pageOffset;
    private TextView positiveButton;
    private TextView[] titles;
    private LinearLayout titlesLayout;
    private ViewPager viewPager;

    public void onStartRecord(int i) {
        throw null;
    }

    public GroupCallRecordAlert(Context context, TLRPC$Chat tLRPC$Chat, boolean z) {
        super(context, false);
        int color = Theme.getColor("voipgroup_inviteMembersBackground");
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        FrameLayout frameLayout = new FrameLayout(context) {
            boolean ignoreLayout;

            @Override
            protected void onMeasure(int i, int i2) {
                boolean z2 = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) GroupCallRecordAlert.this.positiveButton.getLayoutParams();
                if (z2) {
                    int dp = AndroidUtilities.dp(80.0f);
                    marginLayoutParams.leftMargin = dp;
                    marginLayoutParams.rightMargin = dp;
                } else {
                    int dp2 = AndroidUtilities.dp(16.0f);
                    marginLayoutParams.leftMargin = dp2;
                    marginLayoutParams.rightMargin = dp2;
                }
                int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(200.0f)) / 2;
                GroupCallRecordAlert.this.viewPager.setPadding(size, 0, size, 0);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(370.0f), 1073741824));
                measureChildWithMargins(GroupCallRecordAlert.this.titlesLayout, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
            }

            @Override
            protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                super.onLayout(z2, i, i2, i3, i4);
                GroupCallRecordAlert.this.updateTitlesLayout();
            }

            @Override
            public void requestLayout() {
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setBackgroundDrawable(this.shadowDrawable);
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.setPadding(i, 0, i, 0);
        TextView textView = new TextView(getContext());
        if (ChatObject.isChannelOrGiga(tLRPC$Chat)) {
            textView.setText(LocaleController.getString("VoipChannelRecordVoiceChat", R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString("VoipRecordVoiceChat", R.string.VoipRecordVoiceChat));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        int i2 = 5;
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString("VoipRecordVoiceChatInfo", R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (!LocaleController.isRTL ? 3 : i2) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.titles = new TextView[3];
        ViewPager viewPager = new ViewPager(context);
        this.viewPager = viewPager;
        viewPager.setClipChildren(false);
        this.viewPager.setOffscreenPageLimit(4);
        this.viewPager.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(this.viewPager, 2130706432);
        this.viewPager.setAdapter(new Adapter());
        this.viewPager.setPageMargin(0);
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i3) {
            }

            @Override
            public void onPageSelected(int i3) {
            }

            @Override
            public void onPageScrolled(int i3, float f, int i4) {
                GroupCallRecordAlert.this.currentPage = i3;
                GroupCallRecordAlert.this.pageOffset = f;
                GroupCallRecordAlert.this.updateTitlesLayout();
            }
        });
        View view = new View(getContext());
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{color, 0}));
        this.containerView.addView(view, LayoutHelper.createFrame(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, color}));
        this.containerView.addView(view2, LayoutHelper.createFrame(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        TextView textView3 = new TextView(getContext()) {
            private Paint[] gradientPaint;

            {
                this.gradientPaint = new Paint[GroupCallRecordAlert.this.titles.length];
                int i3 = 0;
                while (true) {
                    Paint[] paintArr = this.gradientPaint;
                    if (i3 < paintArr.length) {
                        paintArr[i3] = new Paint(1);
                        i3++;
                    } else {
                        return;
                    }
                }
            }

            @Override
            protected void onSizeChanged(int r26, int r27, int r28, int r29) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.GroupCallRecordAlert.AnonymousClass3.onSizeChanged(int, int, int, int):void");
            }

            @Override
            protected void onDraw(Canvas canvas) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.gradientPaint[GroupCallRecordAlert.this.currentPage].setAlpha(255);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.gradientPaint[GroupCallRecordAlert.this.currentPage]);
                if (GroupCallRecordAlert.this.pageOffset > 0.0f) {
                    int i3 = GroupCallRecordAlert.this.currentPage + 1;
                    Paint[] paintArr = this.gradientPaint;
                    if (i3 < paintArr.length) {
                        paintArr[GroupCallRecordAlert.this.currentPage + 1].setAlpha((int) (GroupCallRecordAlert.this.pageOffset * 255.0f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.gradientPaint[GroupCallRecordAlert.this.currentPage + 1]);
                    }
                }
                super.onDraw(canvas);
            }
        };
        this.positiveButton = textView3;
        textView3.setMinWidth(AndroidUtilities.dp(64.0f));
        this.positiveButton.setTag(-1);
        this.positiveButton.setTextSize(1, 14.0f);
        this.positiveButton.setTextColor(Theme.getColor("voipgroup_nameText"));
        this.positiveButton.setGravity(17);
        this.positiveButton.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.positiveButton.setText(LocaleController.getString("VoipRecordStart", R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            this.positiveButton.setForeground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor("voipgroup_nameText"), 76)));
        }
        this.positiveButton.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        this.positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                GroupCallRecordAlert.this.lambda$new$0(view3);
            }
        });
        this.containerView.addView(this.positiveButton, LayoutHelper.createFrame(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.titlesLayout = linearLayout;
        this.containerView.addView(linearLayout, LayoutHelper.createFrame(-2, 64, 80));
        final int i3 = 0;
        while (true) {
            TextView[] textViewArr = this.titles;
            if (i3 >= textViewArr.length) {
                break;
            }
            textViewArr[i3] = new TextView(context);
            this.titles[i3].setTextSize(1, 12.0f);
            this.titles[i3].setTextColor(-1);
            this.titles[i3].setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.titles[i3].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.titles[i3].setGravity(16);
            this.titles[i3].setSingleLine(true);
            this.titlesLayout.addView(this.titles[i3], LayoutHelper.createLinear(-2, -1));
            if (i3 == 0) {
                this.titles[i3].setText(LocaleController.getString("VoipRecordAudio", R.string.VoipRecordAudio));
            } else if (i3 == 1) {
                this.titles[i3].setText(LocaleController.getString("VoipRecordPortrait", R.string.VoipRecordPortrait));
            } else {
                this.titles[i3].setText(LocaleController.getString("VoipRecordLandscape", R.string.VoipRecordLandscape));
            }
            this.titles[i3].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    GroupCallRecordAlert.this.lambda$new$1(i3, view3);
                }
            });
            i3++;
        }
        if (z) {
            this.viewPager.setCurrentItem(1);
        }
    }

    public void lambda$new$0(View view) {
        onStartRecord(this.currentPage);
        dismiss();
    }

    public void lambda$new$1(int i, View view) {
        this.viewPager.setCurrentItem(i, true);
    }

    public void updateTitlesLayout() {
        TextView[] textViewArr = this.titles;
        int i = this.currentPage;
        TextView textView = textViewArr[i];
        TextView textView2 = i < textViewArr.length + (-1) ? textViewArr[i + 1] : null;
        int measuredWidth = this.containerView.getMeasuredWidth() / 2;
        float left = textView.getLeft() + (textView.getMeasuredWidth() / 2);
        float measuredWidth2 = (this.containerView.getMeasuredWidth() / 2) - left;
        if (textView2 != null) {
            measuredWidth2 -= ((textView2.getLeft() + (textView2.getMeasuredWidth() / 2)) - left) * this.pageOffset;
        }
        int i2 = 0;
        while (true) {
            TextView[] textViewArr2 = this.titles;
            if (i2 < textViewArr2.length) {
                int i3 = this.currentPage;
                float f = 0.9f;
                float f2 = 0.7f;
                if (i2 >= i3 && i2 <= i3 + 1) {
                    if (i2 == i3) {
                        float f3 = this.pageOffset;
                        f2 = 1.0f - (0.3f * f3);
                        f = 1.0f - (f3 * 0.1f);
                    } else {
                        float f4 = this.pageOffset;
                        f2 = 0.7f + (0.3f * f4);
                        f = 0.9f + (f4 * 0.1f);
                    }
                }
                textViewArr2[i2].setAlpha(f2);
                this.titles[i2].setScaleX(f);
                this.titles[i2].setScaleY(f);
                i2++;
            } else {
                this.titlesLayout.setTranslationX(measuredWidth2);
                this.positiveButton.invalidate();
                return;
            }
        }
    }

    private class Adapter extends PagerAdapter {
        @Override
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        }

        @Override
        public Parcelable saveState() {
            return null;
        }

        private Adapter() {
        }

        @Override
        public int getCount() {
            return GroupCallRecordAlert.this.titles.length;
        }

        @Override
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            ImageView imageView = new ImageView(GroupCallRecordAlert.this.getContext());
            imageView.setTag(Integer.valueOf(i));
            imageView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
            SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(RLottieDrawable.readRes(null, i == 0 ? R.raw.record_audio : i == 1 ? R.raw.record_video_p : R.raw.record_video_l));
            drawable.setAspectFill(false);
            imageView.setImageDrawable(drawable);
            if (imageView.getParent() != null) {
                ((ViewGroup) imageView.getParent()).removeView(imageView);
            }
            viewGroup.addView(imageView, 0);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            super.setPrimaryItem(viewGroup, i, obj);
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }
    }
}

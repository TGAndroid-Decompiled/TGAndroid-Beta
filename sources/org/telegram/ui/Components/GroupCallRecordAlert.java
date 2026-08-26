package org.telegram.ui.Components;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class GroupCallRecordAlert extends BottomSheet {
    private int currentPage;
    private float pageOffset;
    private TextView positiveButton;
    private TextView[] titles;
    private LinearLayout titlesLayout;
    private ViewPager viewPager;

    public class Adapter extends PagerAdapter {
        private Adapter() {
        }

        public void lambda$instantiateItem$0(int i, View view) {
            GroupCallRecordAlert.this.onStartRecord(i);
            GroupCallRecordAlert.this.lambda$showGiftOfferSheet$15();
        }

        @Override
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override
        public int getCount() {
            return GroupCallRecordAlert.this.titles.length;
        }

        @Override
        public Object instantiateItem(ViewGroup viewGroup, final int i) {
            int i2;
            ImageView imageView = new ImageView(GroupCallRecordAlert.this.getContext()) {
                @Override
                public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                    super.onInitializeAccessibilityEvent(accessibilityEvent);
                    if (accessibilityEvent.getEventType() == 32768) {
                        GroupCallRecordAlert.this.viewPager.setCurrentItem(i, true);
                    }
                }
            };
            imageView.setOnClickListener(new ReportAlert$$ExternalSyntheticLambda1(this, i, 1));
            imageView.setFocusable(true);
            imageView.setTag(Integer.valueOf(i));
            imageView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
            if (i == 0) {
                imageView.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i == 1) {
                imageView.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                imageView.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            if (i == 0) {
                i2 = R.raw.record_audio;
            } else {
                i2 = i == 1 ? R.raw.record_video_p : R.raw.record_video_l;
            }
            SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i2));
            drawable.setAspectFill(false);
            imageView.setImageDrawable(drawable);
            if (imageView.getParent() != null) {
                ((ViewGroup) imageView.getParent()).removeView(imageView);
            }
            viewGroup.addView(imageView, 0);
            return imageView;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }

        @Override
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        }

        @Override
        public Parcelable saveState() {
            return null;
        }

        @Override
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            super.setPrimaryItem(viewGroup, i, obj);
        }

        @Override
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (dataSetObserver != null) {
                super.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public GroupCallRecordAlert(Context context, TLRPC.Chat chat, boolean z) {
        super(context, false, false, null);
        int color = Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        FrameLayout frameLayout = new FrameLayout(context) {
            boolean ignoreLayout;

            @Override
            public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                super.onLayout(z2, i, i2, i3, i4);
                GroupCallRecordAlert.this.updateTitlesLayout();
            }

            @Override
            public void onMeasure(int i, int i2) {
                boolean z2 = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) GroupCallRecordAlert.this.positiveButton.getLayoutParams();
                if (z2) {
                    int iDp = AndroidUtilities.dp(80.0f);
                    marginLayoutParams.leftMargin = iDp;
                    marginLayoutParams.rightMargin = iDp;
                } else {
                    int iDp2 = AndroidUtilities.dp(16.0f);
                    marginLayoutParams.leftMargin = iDp2;
                    marginLayoutParams.rightMargin = iDp2;
                }
                int iM$2 = OKLCH.m$2(200.0f, View.MeasureSpec.getSize(i), 2);
                GroupCallRecordAlert.this.viewPager.setPadding(iM$2, 0, iM$2, 0);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(370.0f), 1073741824));
                measureChildWithMargins(GroupCallRecordAlert.this.titlesLayout, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
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
        if (ChatObject.isChannelOrGiga(chat)) {
            textView.setText(LocaleController.getString(R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString(R.string.VoipRecordVoiceChat));
        }
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(textView, -1, 1, 20.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.containerView.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
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
            public void onPageScrollStateChanged(int i2) {
            }

            @Override
            public void onPageScrolled(int i2, float f, int i3) {
                GroupCallRecordAlert.this.currentPage = i2;
                GroupCallRecordAlert.this.pageOffset = f;
                GroupCallRecordAlert.this.updateTitlesLayout();
            }

            @Override
            public void onPageSelected(int i2) {
            }
        });
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{color, 0}));
        this.containerView.addView(view, LayoutHelper.createFrame(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, color}));
        this.containerView.addView(view2, LayoutHelper.createFrame(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        TextView textView3 = new TextView(getContext()) {
            private Paint[] gradientPaint;

            {
                this.gradientPaint = new Paint[GroupCallRecordAlert.this.titles.length];
                int i2 = 0;
                while (true) {
                    Paint[] paintArr = this.gradientPaint;
                    if (i2 >= paintArr.length) {
                        return;
                    }
                    paintArr[i2] = new Paint(1);
                    i2++;
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.gradientPaint[GroupCallRecordAlert.this.currentPage].setAlpha(255);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.gradientPaint[GroupCallRecordAlert.this.currentPage]);
                if (GroupCallRecordAlert.this.pageOffset > 0.0f) {
                    int i2 = GroupCallRecordAlert.this.currentPage + 1;
                    Paint[] paintArr = this.gradientPaint;
                    if (i2 < paintArr.length) {
                        paintArr[GroupCallRecordAlert.this.currentPage + 1].setAlpha((int) (GroupCallRecordAlert.this.pageOffset * 255.0f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.gradientPaint[GroupCallRecordAlert.this.currentPage + 1]);
                    }
                }
                super.onDraw(canvas);
            }

            @Override
            public void onSizeChanged(int i2, int i3, int i4, int i5) {
                int i6;
                int i7;
                LinearGradient linearGradient;
                super.onSizeChanged(i2, i3, i4, i5);
                for (int i8 = 0; i8 < this.gradientPaint.length; i8++) {
                    int i9 = -9015575;
                    if (i8 == 0) {
                        i9 = -11033346;
                        i6 = -9015575;
                    } else {
                        if (i8 == 1) {
                            i9 = -8919716;
                            i6 = -11089922;
                        } else {
                            i6 = -1026983;
                            i7 = -1792170;
                        }
                        if (i7 != 0) {
                            linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i9, i6, i7}, (float[]) null, Shader.TileMode.CLAMP);
                        } else {
                            linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i9, i6}, (float[]) null, Shader.TileMode.CLAMP);
                        }
                        this.gradientPaint[i8].setShader(linearGradient);
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i9, i6, i7}, (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i9, i6}, (float[]) null, Shader.TileMode.CLAMP);
                    }
                    this.gradientPaint[i8].setShader(linearGradient);
                }
            }
        };
        this.positiveButton = textView3;
        textView3.setMinWidth(AndroidUtilities.dp(64.0f));
        this.positiveButton.setTag(-1);
        this.positiveButton.setTextSize(1, 14.0f);
        TextView textView4 = this.positiveButton;
        int i2 = Theme.key_voipgroup_nameText;
        textView4.setTextColor(Theme.getColor(null, i2, false));
        this.positiveButton.setGravity(17);
        this.positiveButton.setTypeface(AndroidUtilities.bold());
        this.positiveButton.setText(LocaleController.getString(R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            TextView textView5 = this.positiveButton;
            int iDp = AndroidUtilities.dp(6.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i2, false), 76);
            textView5.setForeground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }
        this.positiveButton.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        this.positiveButton.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 26));
        this.containerView.addView(this.positiveButton, LayoutHelper.createFrame(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.titlesLayout = linearLayout;
        this.containerView.addView(linearLayout, LayoutHelper.createFrame(-2, 64, 80));
        int i3 = 0;
        while (true) {
            TextView[] textViewArr = this.titles;
            if (i3 >= textViewArr.length) {
                break;
            }
            textViewArr[i3] = new TextView(context);
            this.titles[i3].setTextSize(1, 12.0f);
            this.titles[i3].setTextColor(-1);
            this.titles[i3].setTypeface(AndroidUtilities.bold());
            this.titles[i3].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.titles[i3].setGravity(16);
            this.titles[i3].setSingleLine(true);
            this.titlesLayout.addView(this.titles[i3], LayoutHelper.createLinear(-2, -1));
            if (i3 == 0) {
                this.titles[i3].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i3 == 1) {
                this.titles[i3].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.titles[i3].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.titles[i3].setOnClickListener(new ReportAlert$$ExternalSyntheticLambda1(this, i3, 5));
            i3++;
        }
        if (z) {
            this.viewPager.setCurrentItem(1);
        }
    }

    public void lambda$new$0(View view) {
        onStartRecord(this.currentPage);
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1(int i, View view) {
        this.viewPager.setCurrentItem(i, true);
    }

    public void updateTitlesLayout() {
        TextView[] textViewArr = this.titles;
        int i = this.currentPage;
        TextView textView = textViewArr[i];
        TextView textView2 = i < textViewArr.length + (-1) ? textViewArr[i + 1] : null;
        this.containerView.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (this.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.pageOffset;
        }
        int i2 = 0;
        while (true) {
            TextView[] textViewArr2 = this.titles;
            if (i2 >= textViewArr2.length) {
                this.titlesLayout.setTranslationX(measuredWidth2);
                this.positiveButton.invalidate();
                return;
            }
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
        }
    }

    public void onStartRecord(int i) {
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}

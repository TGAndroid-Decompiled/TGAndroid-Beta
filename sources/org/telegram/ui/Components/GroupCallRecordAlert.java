package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
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
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.GroupCallActivity;

public abstract class GroupCallRecordAlert extends BottomSheet {
    public int currentPage;
    public float pageOffset;
    public final AnonymousClass3 positiveButton;
    public final TextView[] titles;
    public final LinearLayout titlesLayout;
    public final ViewPager viewPager;

    public final class Adapter extends PagerAdapter {
        public final GroupCallActivity.AnonymousClass6.AnonymousClass1 this$0;

        public Adapter(GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass1) {
            this.this$0 = anonymousClass1;
        }

        @Override
        public final void destroyItem(ViewPager viewPager, Object obj) {
            viewPager.removeView((View) obj);
        }

        @Override
        public final int getCount() {
            return this.this$0.titles.length;
        }

        @Override
        public final Object instantiateItem(ViewPager viewPager, int i) {
            int i2;
            FiltersSetupActivity.FilterCell.AnonymousClass1 anonymousClass1 = new FiltersSetupActivity.FilterCell.AnonymousClass1(this, this.this$0.getContext(), i, 1);
            anonymousClass1.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i, 5));
            anonymousClass1.setFocusable(true);
            anonymousClass1.setTag(Integer.valueOf(i));
            anonymousClass1.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            anonymousClass1.setScaleType(ImageView.ScaleType.FIT_XY);
            anonymousClass1.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(200.0f), -1));
            if (i == 0) {
                anonymousClass1.setContentDescription(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i == 1) {
                anonymousClass1.setContentDescription(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                anonymousClass1.setContentDescription(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            if (i == 0) {
                i2 = R.raw.record_audio;
            } else {
                i2 = i == 1 ? R.raw.record_video_p : R.raw.record_video_l;
            }
            SvgHelper.SvgDrawable drawable = SvgHelper.getDrawable(AndroidUtilities.readRes(i2));
            drawable.setAspectFill(false);
            anonymousClass1.setImageDrawable(drawable);
            if (anonymousClass1.getParent() != null) {
                ((ViewGroup) anonymousClass1.getParent()).removeView(anonymousClass1);
            }
            viewPager.addView(anonymousClass1, 0);
            return anonymousClass1;
        }

        @Override
        public final boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }
    }

    public GroupCallRecordAlert(Context context, TLRPC.Chat chat, boolean z) {
        super(context, null, false, false);
        int color = Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        final GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass1 = (GroupCallActivity.AnonymousClass6.AnonymousClass1) this;
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                super.onLayout(z2, i, i2, i3, i4);
                GroupCallRecordAlert.access$300(anonymousClass1);
            }

            @Override
            public final void onMeasure(int i, int i2) {
                boolean z2 = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
                GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass2 = anonymousClass1;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass2.positiveButton.getLayoutParams();
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
                anonymousClass2.viewPager.setPadding(iM$2, 0, iM$2, 0);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(370.0f), 1073741824));
                measureChildWithMargins(anonymousClass2.titlesLayout, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), 0);
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
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, -1, 1, textView);
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
        viewPager.setOffscreenPageLimit(4);
        viewPager.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(viewPager, 2130706432);
        viewPager.setAdapter(new Adapter(anonymousClass1));
        viewPager.setPageMargin(0);
        this.containerView.addView(viewPager, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public final void onPageScrollStateChanged(int i2) {
            }

            @Override
            public final void onPageScrolled(float f, int i2, int i3) {
                GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass2 = anonymousClass1;
                anonymousClass2.currentPage = i2;
                anonymousClass2.pageOffset = f;
                GroupCallRecordAlert.access$300(anonymousClass2);
            }

            @Override
            public final void onPageSelected(int i2) {
            }
        });
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{color, 0}));
        this.containerView.addView(view, LayoutHelper.createFrame(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, color}));
        this.containerView.addView(view2, LayoutHelper.createFrame(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        ?? r4 = new TextView(getContext()) {
            public final Paint[] gradientPaint;

            {
                super(context);
                this.gradientPaint = new Paint[this.this$0.titles.length];
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
            public final void onDraw(Canvas canvas) {
                int i2;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass2 = this.this$0;
                int i3 = anonymousClass2.currentPage;
                Paint[] paintArr = this.gradientPaint;
                paintArr[i3].setAlpha(255);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[anonymousClass2.currentPage]);
                float f = anonymousClass2.pageOffset;
                if (f > 0.0f && (i2 = anonymousClass2.currentPage + 1) < paintArr.length) {
                    paintArr[i2].setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[anonymousClass2.currentPage + 1]);
                }
                super.onDraw(canvas);
            }

            @Override
            public final void onSizeChanged(int i2, int i3, int i4, int i5) {
                int i6;
                int i7;
                LinearGradient linearGradient;
                super.onSizeChanged(i2, i3, i4, i5);
                int i8 = 0;
                while (true) {
                    Paint[] paintArr = this.gradientPaint;
                    if (i8 >= paintArr.length) {
                        return;
                    }
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
                        paintArr[i8].setShader(linearGradient);
                        i8++;
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i9, i6, i7}, (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i9, i6}, (float[]) null, Shader.TileMode.CLAMP);
                    }
                    paintArr[i8].setShader(linearGradient);
                    i8++;
                }
            }
        };
        this.positiveButton = r4;
        r4.setMinWidth(AndroidUtilities.dp(64.0f));
        r4.setTag(-1);
        r4.setTextSize(1, 14.0f);
        int i2 = Theme.key_voipgroup_nameText;
        r4.setTextColor(Theme.getColor(null, i2, false));
        r4.setGravity(17);
        r4.setTypeface(AndroidUtilities.bold());
        r4.setText(LocaleController.getString(R.string.VoipRecordStart));
        if (Build.VERSION.SDK_INT >= 23) {
            int iDp = AndroidUtilities.dp(6.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i2, false), 76);
            r4.setForeground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }
        r4.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass2 = (GroupCallActivity.AnonymousClass6.AnonymousClass1) this;
        r4.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(anonymousClass2, 26));
        this.containerView.addView((View) r4, LayoutHelper.createFrame(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
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
            this.titles[i3].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(anonymousClass2, i3, 4));
            i3++;
        }
        if (z) {
            this.viewPager.setCurrentItem(1);
        }
    }

    public static void access$300(GroupCallActivity.AnonymousClass6.AnonymousClass1 anonymousClass1) {
        int i = anonymousClass1.currentPage;
        TextView[] textViewArr = anonymousClass1.titles;
        TextView textView = textViewArr[i];
        TextView textView2 = i < textViewArr.length + (-1) ? textViewArr[i + 1] : null;
        anonymousClass1.containerView.getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (anonymousClass1.containerView.getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * anonymousClass1.pageOffset;
        }
        for (int i2 = 0; i2 < textViewArr.length; i2++) {
            int i3 = anonymousClass1.currentPage;
            float f = 0.9f;
            float f2 = 0.7f;
            if (i2 >= i3 && i2 <= i3 + 1) {
                if (i2 == i3) {
                    float f3 = anonymousClass1.pageOffset;
                    f2 = 1.0f - (0.3f * f3);
                    f = 1.0f - (f3 * 0.1f);
                } else {
                    float f4 = anonymousClass1.pageOffset;
                    f2 = 0.7f + (0.3f * f4);
                    f = 0.9f + (f4 * 0.1f);
                }
            }
            textViewArr[i2].setAlpha(f2);
            textViewArr[i2].setScaleX(f);
            textViewArr[i2].setScaleY(f);
        }
        anonymousClass1.titlesLayout.setTranslationX(measuredWidth2);
        anonymousClass1.positiveButton.invalidate();
    }
}

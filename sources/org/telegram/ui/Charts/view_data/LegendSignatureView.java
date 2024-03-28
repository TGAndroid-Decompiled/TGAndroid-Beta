package org.telegram.ui.Charts.view_data;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
public class LegendSignatureView extends FrameLayout {
    Drawable backgroundDrawable;
    public boolean canGoZoom;
    public ImageView chevron;
    LinearLayout content;
    SimpleDateFormat format;
    SimpleDateFormat format2;
    SimpleDateFormat format3;
    SimpleDateFormat format4;
    private DecimalFormat formatterTON;
    Holder[] holdes;
    SimpleDateFormat hourFormat;
    TextView hourTime;
    public boolean isTopHourChart;
    private RadialProgressView progressView;
    private Theme.ResourcesProvider resourcesProvider;
    Drawable shadowDrawable;
    public boolean showPercentage;
    Runnable showProgressRunnable;
    TextView time;
    public boolean useHour;
    public boolean useWeek;
    public boolean zoomEnabled;

    public LegendSignatureView(Context context) {
        this(context, null);
    }

    public LegendSignatureView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.format = new SimpleDateFormat("E, ");
        this.format2 = new SimpleDateFormat("MMM dd");
        this.format3 = new SimpleDateFormat("d MMM yyyy");
        this.format4 = new SimpleDateFormat("d MMM");
        this.hourFormat = new SimpleDateFormat(" HH:mm");
        this.canGoZoom = true;
        this.showProgressRunnable = new Runnable() {
            @Override
            public void run() {
                LegendSignatureView.this.chevron.animate().setDuration(120L).alpha(0.0f);
                LegendSignatureView.this.progressView.animate().setListener(null).start();
                if (LegendSignatureView.this.progressView.getVisibility() != 0) {
                    LegendSignatureView.this.progressView.setVisibility(0);
                    LegendSignatureView.this.progressView.setAlpha(0.0f);
                }
                LegendSignatureView.this.progressView.animate().setDuration(120L).alpha(1.0f).start();
            }
        };
        this.resourcesProvider = resourcesProvider;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.content = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.time = textView;
        textView.setTextSize(1, 14.0f);
        this.time.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        TextView textView2 = new TextView(context);
        this.hourTime = textView2;
        textView2.setTextSize(1, 14.0f);
        this.hourTime.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        ImageView imageView = new ImageView(context);
        this.chevron = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        this.progressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        this.progressView.setVisibility(8);
        addView(this.content, LayoutHelper.createFrame(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(this.time, LayoutHelper.createFrame(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(this.hourTime, LayoutHelper.createFrame(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(this.chevron, LayoutHelper.createFrame(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(this.progressView, LayoutHelper.createFrame(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        recolor();
    }

    public void recolor() {
        TextView textView = this.time;
        int i = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        this.hourTime.setTextColor(Theme.getColor(i, this.resourcesProvider));
        ImageView imageView = this.chevron;
        int i2 = Theme.key_statisticChartChevronColor;
        imageView.setColorFilter(Theme.getColor(i2, this.resourcesProvider));
        this.progressView.setProgressColor(Theme.getColor(i2, this.resourcesProvider));
        this.shadowDrawable = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        this.backgroundDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider), Theme.getColor(Theme.key_listSelector, this.resourcesProvider), -16777216);
        CombinedDrawable combinedDrawable = new CombinedDrawable(this.shadowDrawable, this.backgroundDrawable, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        combinedDrawable.setFullsize(true);
        setBackground(combinedDrawable);
    }

    public void setSize(int i) {
        this.content.removeAllViews();
        this.holdes = new Holder[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.holdes[i2] = new Holder(this);
            this.content.addView(this.holdes[i2].root);
        }
    }

    public void setData(int i, long j, ArrayList<LineViewData> arrayList, boolean z, int i2) {
        TextView textView;
        int length = this.holdes.length;
        if (z && Build.VERSION.SDK_INT >= 19) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        if (this.isTopHourChart) {
            this.time.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j)));
        } else {
            if (this.useWeek) {
                this.time.setText(String.format("%s — %s", this.format4.format(new Date(j)), this.format3.format(new Date(604800000 + j))));
            } else {
                this.time.setText(formatData(new Date(j)));
            }
            if (this.useHour) {
                this.hourTime.setText(this.hourFormat.format(Long.valueOf(j)));
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (arrayList.get(i4).enabled) {
                i3 += arrayList.get(i4).line.y[i];
            }
        }
        for (int i5 = 0; i5 < length; i5++) {
            Holder holder = this.holdes[i5];
            if (!arrayList.get(i5).enabled) {
                holder.root.setVisibility(8);
            } else {
                ChartData.Line line = arrayList.get(i5).line;
                if (holder.root.getMeasuredHeight() == 0) {
                    holder.root.requestLayout();
                }
                holder.root.setVisibility(0);
                AnimatedEmojiSpan.TextViewEmojis textViewEmojis = holder.value;
                textViewEmojis.setText(formatWholeNumber(line.y[i], i2, textViewEmojis));
                holder.signature.setText(line.name);
                int i6 = line.colorKey;
                if (i6 >= 0 && Theme.hasThemeKey(i6)) {
                    holder.value.setTextColor(Theme.getColor(line.colorKey, this.resourcesProvider));
                } else {
                    holder.value.setTextColor(Theme.getCurrentTheme().isDark() ? line.colorDark : line.color);
                }
                TextView textView2 = holder.signature;
                int i7 = Theme.key_dialogTextBlack;
                textView2.setTextColor(Theme.getColor(i7, this.resourcesProvider));
                if (this.showPercentage && (textView = holder.percentage) != null) {
                    textView.setVisibility(0);
                    holder.percentage.setTextColor(Theme.getColor(i7, this.resourcesProvider));
                    float f = arrayList.get(i5).line.y[i] / i3;
                    if (f < 0.1f && f != 0.0f) {
                        holder.percentage.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f * 100.0f), "%"));
                    } else {
                        holder.percentage.setText(String.format(Locale.ENGLISH, "%d%s", Integer.valueOf(Math.round(f * 100.0f)), "%"));
                    }
                }
            }
        }
        if (this.zoomEnabled) {
            this.canGoZoom = i3 > 0;
            this.chevron.setVisibility(i3 <= 0 ? 8 : 0);
            return;
        }
        this.canGoZoom = false;
        this.chevron.setVisibility(8);
    }

    private String formatData(Date date) {
        if (this.useHour) {
            return capitalize(this.format2.format(date));
        }
        return capitalize(this.format.format(date)) + capitalize(this.format2.format(date));
    }

    private String capitalize(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public CharSequence formatWholeNumber(int i, int i2, TextView textView) {
        if (i2 != 1) {
            float f = i;
            if (i < 10000) {
                return String.format("%d", Integer.valueOf(i));
            }
            int i3 = 0;
            while (f >= 1000.0f && i3 < AndroidUtilities.numbersSignatureArray.length - 1) {
                f /= 1000.0f;
                i3++;
            }
            return String.format("%.2f", Float.valueOf(f)) + AndroidUtilities.numbersSignatureArray[i3];
        }
        if (this.formatterTON == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.formatterTON = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            this.formatterTON.setMaximumFractionDigits(6);
            this.formatterTON.setGroupingUsed(false);
        }
        this.formatterTON.setMaximumFractionDigits(i > 1000000000 ? 2 : 6);
        StringBuilder sb = new StringBuilder();
        sb.append("TON ");
        DecimalFormat decimalFormat2 = this.formatterTON;
        double d = i;
        Double.isNaN(d);
        sb.append(decimalFormat2.format(d / 1.0E9d));
        return ChannelMonetizationLayout.replaceTON(sb.toString(), textView.getPaint(), false);
    }

    public void showProgress(boolean z, boolean z2) {
        if (z) {
            AndroidUtilities.runOnUIThread(this.showProgressRunnable, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showProgressRunnable);
        if (z2) {
            this.progressView.setVisibility(8);
            return;
        }
        this.chevron.animate().setDuration(80L).alpha(1.0f).start();
        if (this.progressView.getVisibility() == 0) {
            this.progressView.animate().setDuration(80L).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    LegendSignatureView.this.progressView.setVisibility(8);
                }
            }).start();
        }
    }

    public void setUseWeek(boolean z) {
        this.useWeek = z;
    }

    public class Holder {
        TextView percentage;
        final LinearLayout root;
        final TextView signature;
        final AnimatedEmojiSpan.TextViewEmojis value;

        Holder(LegendSignatureView legendSignatureView) {
            LinearLayout linearLayout = new LinearLayout(legendSignatureView.getContext());
            this.root = linearLayout;
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            if (legendSignatureView.showPercentage) {
                TextView textView = new TextView(legendSignatureView.getContext());
                this.percentage = textView;
                linearLayout.addView(textView);
                this.percentage.getLayoutParams().width = AndroidUtilities.dp(36.0f);
                this.percentage.setVisibility(8);
                this.percentage.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.percentage.setTextSize(1, 13.0f);
            }
            TextView textView2 = new TextView(legendSignatureView.getContext());
            this.signature = textView2;
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 20.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(legendSignatureView.getContext());
            this.value = textViewEmojis;
            linearLayout.addView(textViewEmojis, LayoutHelper.createLinear(-1, -2));
            textView2.setGravity(8388611);
            textViewEmojis.setGravity(8388613);
            textViewEmojis.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textViewEmojis.setTextSize(1, 13.0f);
            textView2.setTextSize(1, 13.0f);
        }
    }
}

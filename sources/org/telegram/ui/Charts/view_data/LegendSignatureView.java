package org.telegram.ui.Charts.view_data;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import org.commonmark.parser.Parser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Stars.StarsIntroActivity;

public class LegendSignatureView extends FrameLayout {
    public BaseCell.RippleDrawableSafe backgroundDrawable;
    public boolean canGoZoom;
    public final ImageView chevron;
    public final LinearLayout content;
    public final SimpleDateFormat format;
    public final SimpleDateFormat format2;
    public final SimpleDateFormat format3;
    public final SimpleDateFormat format4;
    public DecimalFormat formatterTON;
    public Parser[] holders;
    public final SimpleDateFormat hourFormat;
    public final TextView hourTime;
    public boolean isTopHourChart;
    public final RadialProgressView progressView;
    public final Theme.ResourcesProvider resourcesProvider;
    public Drawable shadowDrawable;
    public boolean showPercentage;
    public final BubbleActivity.AnonymousClass1 showProgressRunnable;
    public final TextView time;
    public boolean useHour;
    public boolean useWeek;
    public boolean zoomEnabled;

    public LegendSignatureView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.format = new SimpleDateFormat("E, ");
        this.format2 = new SimpleDateFormat("MMM dd");
        this.format3 = new SimpleDateFormat("d MMM yyyy");
        this.format4 = new SimpleDateFormat("d MMM");
        this.hourFormat = new SimpleDateFormat(" HH:mm");
        this.canGoZoom = true;
        this.showProgressRunnable = new BubbleActivity.AnonymousClass1(this, 9);
        this.resourcesProvider = resourcesProvider;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.content = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.time = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.hourTime = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.chevron = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.progressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, LayoutHelper.createFrame(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, LayoutHelper.createFrame(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        recolor();
    }

    public void recolor() {
        int i = Theme.key_dialogTextBlack;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.time.setTextColor(Theme.getColor(i, resourcesProvider));
        this.hourTime.setTextColor(Theme.getColor(i, resourcesProvider));
        int i2 = Theme.key_statisticChartChevronColor;
        this.chevron.setColorFilter(Theme.getColor(i2, resourcesProvider));
        this.progressView.setProgressColor(Theme.getColor(i2, resourcesProvider));
        this.shadowDrawable = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int iDp = AndroidUtilities.dp(4.0f);
        this.backgroundDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, Theme.getColor(Theme.key_dialogBackground, resourcesProvider), Theme.getColor(Theme.key_listSelector, resourcesProvider), -16777216);
        CombinedDrawable combinedDrawable = new CombinedDrawable(this.shadowDrawable, this.backgroundDrawable, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        combinedDrawable.fullSize = true;
        setBackground(combinedDrawable);
    }

    public final void setData(int i, long j, ArrayList arrayList, boolean z, int i2, float f) {
        String string;
        CharSequence charSequenceReplaceStarsWithPlain;
        int i3;
        TextView textView;
        int length = this.holders.length;
        int i4 = 2;
        int i5 = 1;
        int i6 = 0;
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z2 = this.isTopHourChart;
        TextView textView2 = this.time;
        if (z2) {
            textView2.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j)));
        } else {
            if (this.useWeek) {
                textView2.setText(this.format4.format(new Date(j)) + " — " + this.format3.format(new Date(604800000 + j)));
            } else {
                Date date = new Date(j);
                boolean z3 = this.useHour;
                SimpleDateFormat simpleDateFormat = this.format2;
                if (z3) {
                    string = simpleDateFormat.format(date);
                    if (string.length() > 0) {
                        string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    String str = this.format.format(date);
                    if (str.length() > 0) {
                        str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                    }
                    sb.append(str);
                    String str2 = simpleDateFormat.format(date);
                    if (str2.length() > 0) {
                        str2 = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
                    }
                    sb.append(str2);
                    string = sb.toString();
                }
                textView2.setText(string);
            }
            if (this.useHour) {
                this.hourTime.setText(this.hourFormat.format(Long.valueOf(j)));
            }
        }
        long j2 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((LineViewData) arrayList.get(i7)).enabled) {
                j2 += ((LineViewData) arrayList.get(i7)).line.y[i];
            }
        }
        int i8 = 0;
        while (i8 < length) {
            Parser parser = this.holders[i8];
            int i9 = i8 % 2;
            LineViewData lineViewData = (LineViewData) arrayList.get((i2 == i5 || i2 == i4) ? i8 / 2 : i8);
            if (lineViewData.enabled) {
                int measuredHeight = ((LinearLayout) parser.inlineParserFactory).getMeasuredHeight();
                LinearLayout linearLayout = (LinearLayout) parser.inlineParserFactory;
                if (measuredHeight == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i6);
                AnimatedEmojiSpan.TextViewEmojis textViewEmojis = (AnimatedEmojiSpan.TextViewEmojis) parser.blockParserFactories;
                ChartData.Line line = lineViewData.line;
                int i10 = i8;
                long j3 = line.y[i];
                if (i2 == i5) {
                    if (i9 == 0) {
                        if (this.formatterTON == null) {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            this.formatterTON = decimalFormat;
                            decimalFormat.setMinimumFractionDigits(2);
                            this.formatterTON.setMaximumFractionDigits(6);
                            this.formatterTON.setGroupingUsed(false);
                        }
                        this.formatterTON.setMaximumFractionDigits(j3 > 1000000000 ? 2 : 6);
                        charSequenceReplaceStarsWithPlain = ChannelMonetizationLayout.replaceTON("TON " + this.formatterTON.format(j3 / 1.0E9d), textViewEmojis.getPaint(), 0.82f, 0.0f, false);
                    } else {
                        charSequenceReplaceStarsWithPlain = "≈" + BillingController.getInstance().formatCurrency((long) (j3 / f), "USD");
                    }
                } else if (i2 != 2) {
                    float f2 = j3;
                    if (j3 < 10000) {
                        charSequenceReplaceStarsWithPlain = String.format("%d", Long.valueOf(j3));
                    } else {
                        int i11 = 0;
                        while (f2 >= 1000.0f && i11 < AndroidUtilities.numbersSignatureArray.length - 1) {
                            f2 /= 1000.0f;
                            i11++;
                        }
                        charSequenceReplaceStarsWithPlain = String.format("%.2f", Float.valueOf(f2)) + AndroidUtilities.numbersSignatureArray[i11];
                    }
                } else if (i9 == 0) {
                    charSequenceReplaceStarsWithPlain = StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(j3, ' ', new StringBuilder("XTR ")), 0.7f, null);
                } else {
                    charSequenceReplaceStarsWithPlain = "≈" + BillingController.getInstance().formatCurrency((long) (j3 / f), "USD");
                }
                textViewEmojis.setText(charSequenceReplaceStarsWithPlain);
                TextView textView3 = (TextView) parser.delimiterProcessors;
                if (i2 == 1) {
                    textView3.setText(LocaleController.formatString(i9 == 0 ? R.string.ChartInTON : R.string.ChartInUSD, line.name));
                } else if (i2 == 2) {
                    textView3.setText(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatString(i9 == 0 ? R.string.ChartInXTR : R.string.ChartInUSD, line.name), 0.7f, null));
                } else {
                    textView3.setText(line.name);
                }
                int i12 = line.colorKey;
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                if (i12 < 0 || !Theme.hasThemeKey(i12)) {
                    Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
                    if (themeInfo == null) {
                        themeInfo = Theme.defaultTheme;
                    }
                    textViewEmojis.setTextColor(themeInfo.isDark() ? line.colorDark : line.color);
                } else {
                    textViewEmojis.setTextColor(Theme.getColor(line.colorKey, resourcesProvider));
                }
                int i13 = Theme.key_dialogTextBlack;
                textView3.setTextColor(Theme.getColor(i13, resourcesProvider));
                if (!this.showPercentage || (textView = (TextView) parser.postProcessors) == null) {
                    i3 = i10;
                } else {
                    textView.setVisibility(0);
                    textView.setTextColor(Theme.getColor(i13, resourcesProvider));
                    i3 = i10;
                    float f3 = ((LineViewData) arrayList.get(i3)).line.y[i] / j2;
                    if (f3 >= 0.1f || f3 == 0.0f) {
                        Locale locale = Locale.ENGLISH;
                        textView.setText(Math.round(f3 * 100.0f) + "%");
                    } else {
                        textView.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f3 * 100.0f), "%"));
                    }
                }
                i8 = i3 + 1;
                i4 = 2;
                i5 = 1;
                i6 = 0;
            } else {
                ((LinearLayout) parser.inlineParserFactory).setVisibility(8);
                i3 = i8;
            }
            i8 = i3 + 1;
            i4 = 2;
            i5 = 1;
            i6 = 0;
        }
        boolean z4 = this.zoomEnabled;
        ImageView imageView = this.chevron;
        if (z4) {
            this.canGoZoom = j2 > 0;
            imageView.setVisibility(j2 > 0 ? 0 : 8);
        } else {
            this.canGoZoom = false;
            imageView.setVisibility(8);
        }
    }

    public void setSize(int i) {
        LinearLayout linearLayout = this.content;
        linearLayout.removeAllViews();
        this.holders = new Parser[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.holders[i2] = new Parser(this);
            linearLayout.addView((LinearLayout) this.holders[i2].inlineParserFactory);
        }
    }

    public void setUseWeek(boolean z) {
        this.useWeek = z;
    }

    public final void showProgress(boolean z, boolean z2) {
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.showProgressRunnable;
        if (z) {
            AndroidUtilities.runOnUIThread(anonymousClass1, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
        RadialProgressView radialProgressView = this.progressView;
        if (z2) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.chevron.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new ArticleViewer.AnonymousClass25(this, 25)).start();
        }
    }
}

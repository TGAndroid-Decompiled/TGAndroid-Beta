package org.telegram.ui.Charts.view_data;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.LayoutHelper;

public class ChartHeaderView extends FrameLayout {
    public final TextView back;
    public final TextView dates;
    public final TextView datesTmp;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean showDate;
    public final int textMargin;
    public final TextView title;
    public boolean useWeekInterval;
    public final Drawable zoomIcon;

    public ChartHeaderView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.showDate = true;
        new SimpleDateFormat("d MMM yyyy");
        this.resourcesProvider = resourcesProvider;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(AndroidUtilities.bold());
        int iMeasureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.textMargin = iMeasureText;
        TextView textView = new TextView(context);
        this.title = textView;
        zzkk.m(15.0f, 1, textView);
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, 8388627, 16.0f, 0.0f, iMeasureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.back = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.dates = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(8388629);
        addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.datesTmp = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setGravity(8388629);
        addView(textView4, LayoutHelper.createFrame(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.ZoomOut));
        Drawable drawable = getContext().getDrawable(R.drawable.msg_zoomout_stats);
        this.zoomIcon = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
        textView2.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(3.0f), Theme.getColor(Theme.key_featuredStickers_removeButtonText, resourcesProvider)));
        textView4.addOnLayoutChangeListener(new ItemOptions$$ExternalSyntheticLambda13(this, 1));
        recolor();
    }

    public final void recolor() {
        int i = Theme.key_dialogTextBlack;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.title.setTextColor(Theme.getColor(i, resourcesProvider));
        this.dates.setTextColor(Theme.getColor(i, resourcesProvider));
        this.datesTmp.setTextColor(Theme.getColor(i, resourcesProvider));
        int i2 = Theme.key_statisticChartBackZoomColor;
        this.back.setTextColor(Theme.getColor(i2, resourcesProvider));
        this.zoomIcon.setColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.SRC_IN);
    }

    public final void setDates(long j, long j2) {
        String str;
        boolean z = this.showDate;
        TextView textView = this.dates;
        if (!z) {
            textView.setVisibility(8);
            this.datesTmp.setVisibility(8);
            return;
        }
        if (this.useWeekInterval) {
            j2 += 604800000;
        }
        if (j2 - j >= 86400000) {
            str = LocaleController.getInstance().getFormatterYear().format(new Date(j)) + " — " + LocaleController.getInstance().getFormatterYear().format(new Date(j2));
        } else {
            str = LocaleController.getInstance().getFormatterYear().format(new Date(j));
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    public void setTitle(String str) {
        this.title.setText(str);
    }

    public void setUseWeekInterval(boolean z) {
        this.useWeekInterval = z;
    }

    public final void showDate(boolean z) {
        this.showDate = z;
        TextView textView = this.title;
        if (z) {
            textView.setLayoutParams(LayoutHelper.createFrame(-2, -2.0f, 8388627, 16.0f, 0.0f, this.textMargin, 0.0f));
            return;
        }
        this.datesTmp.setVisibility(8);
        this.dates.setVisibility(8);
        textView.setLayoutParams(LayoutHelper.createFrame(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
        textView.requestLayout();
    }

    public final void zoomTo(long j, boolean z) {
        setDates(j, j);
        TextView textView = this.back;
        textView.setVisibility(0);
        TextView textView2 = this.title;
        if (!z) {
            textView.setAlpha(1.0f);
            textView.setTranslationX(0.0f);
            textView.setTranslationY(0.0f);
            textView.setScaleX(1.0f);
            textView.setScaleY(1.0f);
            textView2.setAlpha(0.0f);
            return;
        }
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        textView.setPivotX(0.0f);
        textView.setPivotY(AndroidUtilities.dp(40.0f));
        textView.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
        textView2.setAlpha(1.0f);
        textView2.setTranslationX(0.0f);
        textView2.setTranslationY(0.0f);
        textView2.setScaleX(1.0f);
        textView2.setScaleY(1.0f);
        textView2.setPivotX(0.0f);
        textView2.setPivotY(0.0f);
        textView2.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
    }
}

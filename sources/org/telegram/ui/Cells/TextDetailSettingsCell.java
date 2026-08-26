package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.LayoutHelper;

public class TextDetailSettingsCell extends FrameLayout {
    public final ImageView imageView;
    public boolean multiline;
    public boolean needDivider;
    public final TextView textView;
    public final TextView valueTextView;

    public TextDetailSettingsCell(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.textView = textView;
        ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayIcon, false), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        addView(imageView, LayoutHelper.createFrame(52, 52.0f, (LocaleController.isRTL ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public TextView getTextView() {
        return this.textView;
    }

    public TextView getValueTextView() {
        return this.valueTextView;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.textView.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        int iDp;
        if (!this.needDivider || Theme.dividerPaint == null) {
            return;
        }
        boolean z = LocaleController.isRTL;
        ImageView imageView = this.imageView;
        if (z) {
            fDp = 0.0f;
        } else {
            fDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        } else {
            iDp = 0;
        }
        canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, Theme.dividerPaint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.multiline) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }
    }

    public void setMultilineDetail(boolean z) {
        this.multiline = z;
        TextView textView = this.valueTextView;
        if (z) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
            return;
        }
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
    }

    public final void setTextAndValue(String str, String str2, boolean z) {
        this.textView.setText(str);
        this.valueTextView.setText(str2);
        this.needDivider = z;
        this.imageView.setVisibility(8);
        setWillNotDraw(!z);
    }

    public final void setTextAndValueAndIcon(int i, String str, String str2, boolean z) {
        TextView textView = this.textView;
        textView.setText(str);
        TextView textView2 = this.valueTextView;
        textView2.setText(str2);
        ImageView imageView = this.imageView;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(50.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(50.0f) : 0, 0);
        textView2.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(50.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(50.0f) : 0, this.multiline ? AndroidUtilities.dp(12.0f) : 0);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setValue(CharSequence charSequence) {
        this.valueTextView.setText(charSequence);
    }
}

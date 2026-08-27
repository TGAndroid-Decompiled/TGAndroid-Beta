package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class y8 extends FrameLayout {

    public final TextView f26010a;

    public final TextView f26011b;

    public y8(Context context) {
        super(context);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f26010a = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f26011b = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        addView(textView2, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        TextView textView = this.f26010a;
        textView.setText(str);
        TextView textView2 = this.f26011b;
        if (str2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(4);
        }
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            setTag(Integer.valueOf(i10));
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            textView.setTypeface(AndroidUtilities.bold());
            textView2.setTypeface(AndroidUtilities.bold());
        } else {
            int i11 = org.telegram.ui.ActionBar.g6.f23441z6;
            setTag(Integer.valueOf(i11));
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            Typeface typeface = Typeface.DEFAULT;
            textView.setTypeface(typeface);
            textView2.setTypeface(typeface);
        }
        requestLayout();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(40.0f));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        TextView textView = this.f26011b;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f26010a.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - textView.getMeasuredWidth()) - AndroidUtilities.dp(8.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i10) {
        this.f26010a.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.f26011b.setTextColor(i10);
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class c9 extends FrameLayout {
    public final TextView f24208a;
    public final TextView f24209b;

    public c9(Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f24208a = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, g7.e6.d(-2, -1.0f, i10 | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24209b = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        textView2.setGravity(i11 | 16);
        addView(textView2, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        TextView textView = this.f24208a;
        textView.setText(str);
        TextView textView2 = this.f24209b;
        if (str2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(4);
        }
        if (z10) {
            int i9 = org.telegram.ui.ActionBar.f6.G6;
            setTag(Integer.valueOf(i9));
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            textView.setTypeface(AndroidUtilities.bold());
            textView2.setTypeface(AndroidUtilities.bold());
        } else {
            int i10 = org.telegram.ui.ActionBar.f6.f23386z6;
            setTag(Integer.valueOf(i10));
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            Typeface typeface = Typeface.DEFAULT;
            textView.setTypeface(typeface);
            textView2.setTypeface(typeface);
        }
        requestLayout();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(40.0f));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        TextView textView = this.f24209b;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f24208a.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - textView.getMeasuredWidth()) - AndroidUtilities.dp(8.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i9) {
        this.f24208a.setTextColor(i9);
    }

    public void setTextValueColor(int i9) {
        this.f24209b.setTextColor(i9);
    }
}

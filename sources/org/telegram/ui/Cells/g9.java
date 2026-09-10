package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class g9 extends FrameLayout {
    public final TextView f19217a;
    public final TextView f19218b;

    public g9(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f19217a = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.a6.d(-2, -1.0f, i11 | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f19218b = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        textView2.setGravity(i12 | 16);
        addView(textView2, w7.a6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        TextView textView = this.f19217a;
        textView.setText(str);
        TextView textView2 = this.f19218b;
        if (str2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(4);
        }
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            setTag(Integer.valueOf(i10));
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            textView.setTypeface(AndroidUtilities.bold());
            textView2.setTypeface(AndroidUtilities.bold());
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.f18325z6;
            setTag(Integer.valueOf(i11));
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        TextView textView = this.f19218b;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f19217a.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - textView.getMeasuredWidth()) - AndroidUtilities.dp(8.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i10) {
        this.f19217a.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.f19218b.setTextColor(i10);
    }
}

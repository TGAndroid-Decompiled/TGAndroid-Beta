package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
public final class z8 extends FrameLayout {
    public final TextView f32129a;
    public final TextView f32130b;

    public z8(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f32129a = textView;
        i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        if (hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, c8.ja.d(-2, -1.0f, i10 | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f32130b = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (hd.f24104a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        textView2.setGravity(i11 | 16);
        addView(textView2, c8.ja.d(-2, -1.0f, (hd.f24104a0 ? 3 : 5) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        TextView textView = this.f32129a;
        textView.setText(str);
        TextView textView2 = this.f32130b;
        if (str2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(4);
        }
        if (z10) {
            int i7 = org.telegram.ui.ActionBar.j6.G6;
            setTag(Integer.valueOf(i7));
            org.telegram.ui.ActionBar.q6.U(textView, i7, null);
            org.telegram.ui.ActionBar.q6.U(textView2, i7, null);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTypeface(org.telegram.messenger.g0.o());
        } else {
            int i10 = org.telegram.ui.ActionBar.j6.f29260z6;
            setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.q6.U(textView, i10, null);
            org.telegram.ui.ActionBar.q6.U(textView2, i10, null);
            Typeface typeface = Typeface.DEFAULT;
            textView.setTypeface(typeface);
            textView2.setTypeface(typeface);
        }
        requestLayout();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(40.0f));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        TextView textView = this.f32130b;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f32129a.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - textView.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i7) {
        this.f32129a.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        this.f32130b.setTextColor(i7);
    }
}

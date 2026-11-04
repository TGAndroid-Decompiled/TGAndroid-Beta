package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
public final class z8 extends FrameLayout {
    public final TextView f31059a;
    public final TextView f31060b;

    public z8(Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f31059a = textView;
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, mf.d(-2, -1.0f, i10 | 48, 21.0f, 0.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f31060b = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        textView2.setGravity(i11 | 16);
        addView(textView2, mf.d(-2, -1.0f, (bd.f21784a0 ? 3 : 5) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        TextView textView = this.f31059a;
        textView.setText(str);
        TextView textView2 = this.f31060b;
        if (str2 != null) {
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(4);
        }
        if (z10) {
            int i3 = org.telegram.ui.ActionBar.k6.G6;
            setTag(Integer.valueOf(i3));
            org.telegram.ui.ActionBar.r6.V(textView, i3, null);
            org.telegram.ui.ActionBar.r6.V(textView2, i3, null);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTypeface(org.telegram.messenger.g0.o());
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.f28290z6;
            setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.r6.V(textView, i10, null);
            org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
            Typeface typeface = Typeface.DEFAULT;
            textView.setTypeface(typeface);
            textView2.setTypeface(typeface);
        }
        requestLayout();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(40.0f));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        TextView textView = this.f31060b;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f31059a.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - textView.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i3) {
        this.f31059a.setTextColor(i3);
    }

    public void setTextValueColor(int i3) {
        this.f31060b.setTextColor(i3);
    }
}

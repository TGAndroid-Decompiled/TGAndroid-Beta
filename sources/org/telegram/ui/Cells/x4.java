package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f32413a;
    public final org.telegram.ui.ActionBar.n5 f32414b;
    public final ImageView f32415c;
    public boolean d;
    public int f32416e;
    public int f32417f;

    public x4(Context context) {
        super(context);
        int i7;
        this.f32416e = 0;
        this.f32417f = 71;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f32413a = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTextSize(16);
        if (gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        n5Var.setGravity(i7);
        addView(n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f32414b = n5Var2;
        org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.I6, null);
        n5Var2.setTextSize(16);
        n5Var2.setGravity(gd.f24216a0 ? 3 : 5);
        addView(n5Var2);
        ImageView imageView = new ImageView(context);
        this.f32415c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29561m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.n5 n5Var = this.f32413a;
        org.telegram.ui.ActionBar.u6.X(n5Var, i10, null);
        n5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f32415c;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, null, mode);
        imageView.setTag(Integer.valueOf(i7));
    }

    public final void b(int i7, int i10, String str, boolean z10) {
        this.f32413a.l(str, false);
        this.f32414b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.f32415c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i7);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.n5 getTextView() {
        return this.f32413a;
    }

    public org.telegram.ui.ActionBar.n5 getValueTextView() {
        return this.f32414b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i7 = this.f32416e;
            if (i7 != 0) {
                org.telegram.ui.ActionBar.n6.f29538l0.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            }
            float L = org.telegram.messenger.g0.L(this.f32417f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.f32416e != 0) {
                paint = org.telegram.ui.ActionBar.n6.f29538l0;
            } else {
                paint = org.telegram.ui.ActionBar.n6.f29519k0;
            }
            canvas.drawLine(L, measuredHeight, measuredWidth, measuredHeight2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int L;
        int measuredWidth;
        int i14 = i12 - i10;
        int i15 = i11 - i7;
        org.telegram.ui.ActionBar.n5 n5Var = this.f32414b;
        int textHeight = (i14 - n5Var.getTextHeight()) / 2;
        if (gd.f24216a0) {
            i13 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i13 = 0;
        }
        n5Var.layout(i13, textHeight, n5Var.getMeasuredWidth() + i13, n5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f32413a;
        int textHeight2 = (i14 - n5Var2.getTextHeight()) / 2;
        if (!gd.f24216a0) {
            L = org.telegram.messenger.g0.L(this.f32417f);
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        n5Var2.layout(L, textHeight2, n5Var2.getMeasuredWidth() + L, n5Var2.getMeasuredHeight() + textHeight2);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        boolean z11 = gd.f24216a0;
        ImageView imageView = this.f32415c;
        if (!z11) {
            measuredWidth = org.telegram.messenger.g0.L(21.0f);
        } else {
            measuredWidth = (i15 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(21.0f);
        }
        imageView.layout(measuredWidth, L2, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + L2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(48.0f);
        this.f32414b.measure(n10.c(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f32413a.measure(n10.c(this.f32417f + 24, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f32415c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i7) {
        this.f32416e = i7;
    }

    public void setTextColor(int i7) {
        this.f32413a.setTextColor(i7);
    }

    public void setTextLeft(int i7) {
        this.f32417f = i7;
        requestLayout();
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
public class b5 extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 f21724a;
    public final org.telegram.ui.ActionBar.u5 f21725b;
    public final ImageView f21726c;
    public boolean d;
    public int e;

    public b5(Context context) {
        super(context);
        int i10;
        this.e = 0;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f21724a = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(16);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u5Var.setGravity(i10);
        addView(u5Var);
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.f21725b = u5Var2;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.I6, null);
        u5Var2.setTextSize(16);
        u5Var2.setGravity(cd.X ? 3 : 5);
        addView(u5Var2);
        ImageView imageView = new ImageView(context);
        this.f21726c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21095m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.u5 u5Var = this.f21724a;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i11, null);
        u5Var.setTag(Integer.valueOf(i11));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f21726c;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, null, mode);
        imageView.setTag(Integer.valueOf(i10));
    }

    public final void b(int i10, int i11, String str, boolean z10) {
        this.f21724a.l(str, false);
        this.f21725b.setVisibility(4);
        int L = org.telegram.messenger.i0.L(i11);
        ImageView imageView = this.f21726c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i10);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.u5 getTextView() {
        return this.f21724a;
    }

    public org.telegram.ui.ActionBar.u5 getValueTextView() {
        return this.f21725b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i10 = this.e;
            if (i10 != 0) {
                org.telegram.ui.ActionBar.t6.f21072l0.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            }
            float L = org.telegram.messenger.i0.L(71.0f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.e != 0) {
                paint = org.telegram.ui.ActionBar.t6.f21072l0;
            } else {
                paint = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            canvas.drawLine(L, measuredHeight, measuredWidth, measuredHeight2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int L;
        int measuredWidth;
        int i15 = i13 - i11;
        int i16 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.f21725b;
        int textHeight = (i15 - u5Var.getTextHeight()) / 2;
        if (cd.X) {
            i14 = org.telegram.messenger.i0.L(24.0f);
        } else {
            i14 = 0;
        }
        u5Var.layout(i14, textHeight, u5Var.getMeasuredWidth() + i14, u5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f21724a;
        int textHeight2 = (i15 - u5Var2.getTextHeight()) / 2;
        if (!cd.X) {
            L = org.telegram.messenger.i0.L(71.0f);
        } else {
            L = org.telegram.messenger.i0.L(24.0f);
        }
        u5Var2.layout(L, textHeight2, u5Var2.getMeasuredWidth() + L, u5Var2.getMeasuredHeight() + textHeight2);
        int L2 = org.telegram.messenger.i0.L(9.0f);
        boolean z11 = cd.X;
        ImageView imageView = this.f21726c;
        if (!z11) {
            measuredWidth = org.telegram.messenger.i0.L(21.0f);
        } else {
            measuredWidth = (i16 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(21.0f);
        }
        imageView.layout(measuredWidth, L2, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + L2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(48.0f);
        this.f21725b.measure(z20.c(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        this.f21724a.measure(z20.c(95.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), 1073741824));
        this.f21726c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i10) {
        this.e = i10;
    }

    public void setTextColor(int i10) {
        this.f21724a.setTextColor(i10);
    }
}

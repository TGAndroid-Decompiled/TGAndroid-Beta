package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.id;
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f30885a;
    public final org.telegram.ui.ActionBar.l5 f30886b;
    public final ImageView f30887c;
    public boolean d;
    public int f30888e;
    public int f30889f;

    public x4(Context context) {
        super(context);
        int i7;
        this.f30888e = 0;
        this.f30889f = 71;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f30885a = l5Var;
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, null);
        l5Var.setTextSize(16);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        l5Var.setGravity(i7);
        addView(l5Var);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f30886b = l5Var2;
        org.telegram.ui.ActionBar.s6.X(l5Var2, org.telegram.ui.ActionBar.l6.I6, null);
        l5Var2.setTextSize(16);
        l5Var2.setGravity(id.f23157a0 ? 3 : 5);
        addView(l5Var2);
        ImageView imageView = new ImageView(context);
        this.f30887c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.f28030m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.l5 l5Var = this.f30885a;
        org.telegram.ui.ActionBar.s6.X(l5Var, i10, null);
        l5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.f30887c;
        org.telegram.ui.ActionBar.s6.s(imageView, i7, null, mode);
        imageView.setTag(Integer.valueOf(i7));
    }

    public final void b(int i7, int i10, String str, boolean z9) {
        this.f30885a.l(str, false);
        this.f30886b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.f30887c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i7);
        this.d = z9;
        setWillNotDraw(!z9);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.l5 getTextView() {
        return this.f30885a;
    }

    public org.telegram.ui.ActionBar.l5 getValueTextView() {
        return this.f30886b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        if (this.d) {
            int i7 = this.f30888e;
            if (i7 != 0) {
                org.telegram.ui.ActionBar.l6.f28007l0.setColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
            }
            float L = org.telegram.messenger.g0.L(this.f30889f);
            float measuredHeight = getMeasuredHeight() - 1;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight() - 1;
            if (this.f30888e != 0) {
                paint = org.telegram.ui.ActionBar.l6.f28007l0;
            } else {
                paint = org.telegram.ui.ActionBar.l6.f27988k0;
            }
            canvas.drawLine(L, measuredHeight, measuredWidth, measuredHeight2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int L;
        int measuredWidth;
        int i14 = i12 - i10;
        int i15 = i11 - i7;
        org.telegram.ui.ActionBar.l5 l5Var = this.f30886b;
        int textHeight = (i14 - l5Var.getTextHeight()) / 2;
        if (id.f23157a0) {
            i13 = org.telegram.messenger.g0.L(24.0f);
        } else {
            i13 = 0;
        }
        l5Var.layout(i13, textHeight, l5Var.getMeasuredWidth() + i13, l5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f30885a;
        int textHeight2 = (i14 - l5Var2.getTextHeight()) / 2;
        if (!id.f23157a0) {
            L = org.telegram.messenger.g0.L(this.f30889f);
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        l5Var2.layout(L, textHeight2, l5Var2.getMeasuredWidth() + L, l5Var2.getMeasuredHeight() + textHeight2);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        boolean z10 = id.f23157a0;
        ImageView imageView = this.f30887c;
        if (!z10) {
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
        this.f30886b.measure(org.telegram.messenger.camera.q.c(24.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30885a.measure(org.telegram.messenger.camera.q.c(this.f30889f + 24, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), 1073741824));
        this.f30887c.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i7) {
        this.f30888e = i7;
    }

    public void setTextColor(int i7) {
        this.f30885a.setTextColor(i7);
    }

    public void setTextLeft(int i7) {
        this.f30889f = i7;
        requestLayout();
    }
}

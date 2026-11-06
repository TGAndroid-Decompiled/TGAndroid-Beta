package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.s3;
import org.telegram.ui.c40;
import org.telegram.ui.f40;
public abstract class r extends FrameLayout {
    public int f39455a;
    public f40 f39456b;
    public y f39457c;
    public s3 d;
    public boolean f39458e;
    public final boolean f39459f;

    public r(Context context, boolean z9) {
        super(context);
        this.f39459f = z9;
    }

    public float getItemHeight() {
        int measuredHeight;
        f40 f40Var = this.f39456b;
        if (f40Var != null) {
            measuredHeight = f40Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public s3 getParticipant() {
        return this.d;
    }

    public y getRenderer() {
        return this.f39457c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39458e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39458e = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        float f11;
        if (this.f39459f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f39456b.F(), 1073741824));
            return;
        }
        if (c40.f44541w5) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int A = org.telegram.messenger.camera.q.A(14.0f, 2, org.telegram.messenger.g0.f22544q.x);
        if (c40.f44541w5) {
            i11 = -org.telegram.messenger.g0.L(90.0f);
        } else {
            i11 = 0;
        }
        float f12 = A + i11;
        if (c40.f44542x5) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (f11 + org.telegram.messenger.g0.L(4.0f)), 1073741824));
    }

    public void setRenderer(y yVar) {
        this.f39457c = yVar;
    }
}

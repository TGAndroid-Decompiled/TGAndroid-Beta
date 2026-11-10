package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.s3;
import org.telegram.ui.f40;
import org.telegram.ui.i40;
public abstract class r extends FrameLayout {
    public int f39499a;
    public i40 f39500b;
    public y f39501c;
    public s3 d;
    public boolean f39502e;
    public final boolean f39503f;

    public r(Context context, boolean z9) {
        super(context);
        this.f39503f = z9;
    }

    public float getItemHeight() {
        int measuredHeight;
        i40 i40Var = this.f39500b;
        if (i40Var != null) {
            measuredHeight = i40Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public s3 getParticipant() {
        return this.d;
    }

    public y getRenderer() {
        return this.f39501c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39502e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39502e = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        float f11;
        if (this.f39503f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f39500b.F(), 1073741824));
            return;
        }
        if (f40.f45503z5) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int A = org.telegram.messenger.camera.q.A(14.0f, 2, org.telegram.messenger.g0.f22567q.x);
        if (f40.f45503z5) {
            i11 = -org.telegram.messenger.g0.L(90.0f);
        } else {
            i11 = 0;
        }
        float f12 = A + i11;
        if (f40.A5) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (f11 + org.telegram.messenger.g0.L(4.0f)), 1073741824));
    }

    public void setRenderer(y yVar) {
        this.f39501c = yVar;
    }
}

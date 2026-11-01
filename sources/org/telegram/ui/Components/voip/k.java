package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.a30;
import org.telegram.messenger.v3;
import org.telegram.ui.a50;
import org.telegram.ui.d50;
public abstract class k extends FrameLayout {
    public int f31560a;
    public d50 f31561b;
    public r f31562c;
    public v3 d;
    public boolean e;
    public final boolean f31563f;

    public k(Context context, boolean z10) {
        super(context);
        this.f31563f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        d50 d50Var = this.f31561b;
        if (d50Var != null) {
            measuredHeight = d50Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public v3 getParticipant() {
        return this.d;
    }

    public r getRenderer() {
        return this.f31562c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        float f10;
        if (this.f31563f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31561b.F(), 1073741824));
            return;
        }
        if (a50.f35575w5) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int A = a30.A(14.0f, 2, org.telegram.messenger.i0.f16172q.x);
        if (a50.f35575w5) {
            i12 = -org.telegram.messenger.i0.L(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = A + i12;
        if (a50.f35576x5) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + org.telegram.messenger.i0.L(4.0f)), 1073741824));
    }

    public void setRenderer(r rVar) {
        this.f31562c = rVar;
    }
}

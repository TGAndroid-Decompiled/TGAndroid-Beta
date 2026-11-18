package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.n10;
import org.telegram.messenger.u3;
import org.telegram.ui.f40;
import org.telegram.ui.i40;
public abstract class r extends FrameLayout {
    public int f41173a;
    public i40 f41174b;
    public y f41175c;
    public u3 d;
    public boolean f41176e;
    public final boolean f41177f;

    public r(Context context, boolean z10) {
        super(context);
        this.f41177f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        i40 i40Var = this.f41174b;
        if (i40Var != null) {
            measuredHeight = i40Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public u3 getParticipant() {
        return this.d;
    }

    public y getRenderer() {
        return this.f41175c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41176e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41176e = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        float f11;
        if (this.f41177f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f41174b.F(), 1073741824));
            return;
        }
        if (f40.E5) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int B = n10.B(14.0f, 2, org.telegram.messenger.g0.f24121q.x);
        if (f40.E5) {
            i11 = -org.telegram.messenger.g0.L(90.0f);
        } else {
            i11 = 0;
        }
        float f12 = B + i11;
        if (f40.F5) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (f11 + org.telegram.messenger.g0.L(4.0f)), 1073741824));
    }

    public void setRenderer(y yVar) {
        this.f41175c = yVar;
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.m10;
import org.telegram.messenger.u3;
import org.telegram.ui.e40;
import org.telegram.ui.h40;
public abstract class s extends FrameLayout {
    public int f41205a;
    public h40 f41206b;
    public z f41207c;
    public u3 d;
    public boolean f41208e;
    public final boolean f41209f;

    public s(Context context, boolean z10) {
        super(context);
        this.f41209f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        h40 h40Var = this.f41206b;
        if (h40Var != null) {
            measuredHeight = h40Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public u3 getParticipant() {
        return this.d;
    }

    public z getRenderer() {
        return this.f41207c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41208e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41208e = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        float f11;
        if (this.f41209f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f41206b.F(), 1073741824));
            return;
        }
        if (e40.E5) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int B = m10.B(14.0f, 2, org.telegram.messenger.g0.f24226q.x);
        if (e40.E5) {
            i11 = -org.telegram.messenger.g0.L(90.0f);
        } else {
            i11 = 0;
        }
        float f12 = B + i11;
        if (e40.F5) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (f11 + org.telegram.messenger.g0.L(4.0f)), 1073741824));
    }

    public void setRenderer(z zVar) {
        this.f41207c = zVar;
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.v3;
import org.telegram.messenger.z20;
import org.telegram.ui.b50;
import org.telegram.ui.e50;
public abstract class k extends FrameLayout {
    public int f31498a;
    public e50 f31499b;
    public r f31500c;
    public v3 d;
    public boolean e;
    public final boolean f31501f;

    public k(Context context, boolean z10) {
        super(context);
        this.f31501f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        e50 e50Var = this.f31499b;
        if (e50Var != null) {
            measuredHeight = e50Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public v3 getParticipant() {
        return this.d;
    }

    public r getRenderer() {
        return this.f31500c;
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
        if (this.f31501f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f31499b.F(), 1073741824));
            return;
        }
        if (b50.f35991w5) {
            f7 = 3.0f;
        } else {
            f7 = 2.0f;
        }
        int A = z20.A(14.0f, 2, org.telegram.messenger.i0.f16026q.x);
        if (b50.f35991w5) {
            i12 = -org.telegram.messenger.i0.L(90.0f);
        } else {
            i12 = 0;
        }
        float f11 = A + i12;
        if (b50.f35992x5) {
            f10 = f11 / 2.0f;
        } else {
            f10 = f11 / f7;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (f10 + org.telegram.messenger.i0.L(4.0f)), 1073741824));
    }

    public void setRenderer(r rVar) {
        this.f31500c = rVar;
    }
}

package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.s3;
import org.telegram.ui.a40;
import org.telegram.ui.x30;
public abstract class k extends FrameLayout {
    public int f39433a;
    public a40 f39434b;
    public r f39435c;
    public s3 d;
    public boolean f39436e;
    public final boolean f39437f;

    public k(Context context, boolean z10) {
        super(context);
        this.f39437f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        a40 a40Var = this.f39434b;
        if (a40Var != null) {
            measuredHeight = a40Var.F();
        } else {
            measuredHeight = getMeasuredHeight();
        }
        return measuredHeight;
    }

    public s3 getParticipant() {
        return this.d;
    }

    public r getRenderer() {
        return this.f39435c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39436e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39436e = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int i11;
        float f11;
        if (this.f39437f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(this.f39434b.F(), 1073741824));
            return;
        }
        if (x30.f51713x5) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int A = org.telegram.messenger.camera.q.A(14.0f, 2, org.telegram.messenger.g0.f22608q.x);
        if (x30.f51713x5) {
            i11 = -org.telegram.messenger.g0.L(90.0f);
        } else {
            i11 = 0;
        }
        float f12 = A + i11;
        if (x30.f51714y5) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (f11 + org.telegram.messenger.g0.L(4.0f)), 1073741824));
    }

    public void setRenderer(r rVar) {
        this.f39435c = rVar;
    }
}

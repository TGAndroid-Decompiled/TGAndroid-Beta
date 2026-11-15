package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i20;
import org.telegram.messenger.s3;
import org.telegram.ui.c40;
import org.telegram.ui.f40;
public abstract class r extends FrameLayout {
    public int f40883a;
    public f40 f40884b;
    public z f40885c;
    public s3 d;
    public boolean f40886e;
    public final boolean f40887f;

    public r(Context context, boolean z10) {
        super(context);
        this.f40887f = z10;
    }

    public float getItemHeight() {
        int measuredHeight;
        f40 f40Var = this.f40884b;
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

    public z getRenderer() {
        return this.f40885c;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40886e = true;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40886e = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        float f11;
        if (this.f40887f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f40884b.F(), 1073741824));
            return;
        }
        if (c40.E5) {
            f10 = 3.0f;
        } else {
            f10 = 2.0f;
        }
        int A = i20.A(14.0f, 2, org.telegram.messenger.g0.f23609q.x);
        if (c40.E5) {
            i11 = -org.telegram.messenger.g0.L(90.0f);
        } else {
            i11 = 0;
        }
        float f12 = A + i11;
        if (c40.F5) {
            f11 = f12 / 2.0f;
        } else {
            f11 = f12 / f10;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (f11 + org.telegram.messenger.g0.L(4.0f)), 1073741824));
    }

    public void setRenderer(z zVar) {
        this.f40885c = zVar;
    }
}

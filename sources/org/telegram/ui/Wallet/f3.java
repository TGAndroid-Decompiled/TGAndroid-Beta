package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
public class f3 extends org.telegram.ui.Components.ra implements org.telegram.ui.ActionBar.c6 {
    public b51 T1;
    public final ViewGroup U1;
    public final Paint V1;
    public float W1;

    public f3(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, true, false, i6Var);
        this.V1 = new Paint();
        this.f39253v1 = 0.1f;
        this.U1 = viewGroup;
        ek0 ek0Var = this.f39246o1;
        int i7 = this.f30261u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        updateColors();
        this.T1.O(false);
    }

    @Override
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.s3(this, 0, false, null);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.f30223a, 0, true, new e(this, 5), this.J0);
        this.T1 = b51Var;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return null;
    }

    @Override
    public void U0(float f10) {
        this.W1 = f10;
        if (this.F != null) {
            this.F.setTranslationY(Math.max((this.f30226b.getY() + f10) + this.f30260t0, this.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24220m)) - this.F.getBottom());
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        boolean z10;
        float f10;
        float width;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30229c;
        float height = m2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.f24221n, this.f30226b.getY() + this.W1 + this.f30260t0);
        if (max >= height) {
            return;
        }
        if (this.f30226b.getWidth() < m2Var.getWidth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = this.f30226b.getX() + this.f30261u0;
        } else {
            f10 = 0.0f;
        }
        float f11 = f10;
        if (z10) {
            width = (this.f30226b.getX() + this.f30226b.getWidth()) - this.f30261u0;
        } else {
            width = m2Var.getWidth();
        }
        canvas.drawRect(f11, max, width, height, this.V1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394a7));
    }

    public int e1() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0);
    }

    @Override
    public void show() {
        boolean z10;
        if (getWindow() != null) {
            org.telegram.messenger.g0.S(getWindow());
        }
        super.show();
        int e12 = e1();
        E0(e12);
        if (org.telegram.messenger.g0.B(e12) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.m3(this, z10);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final void updateColors() {
        int e12 = e1();
        this.V1.setColor(e12);
        v0(e12);
        P(e12);
        ViewGroup viewGroup = this.U1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}

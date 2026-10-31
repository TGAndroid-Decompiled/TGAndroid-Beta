package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
public class z2 extends org.telegram.ui.Components.ha implements org.telegram.ui.ActionBar.k6 {
    public p51 P1;
    public final ViewGroup Q1;
    public final Paint R1;
    public float S1;

    public z2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, true, false, p6Var);
        this.R1 = new Paint();
        this.f26672r1 = 0.1f;
        this.Q1 = viewGroup;
        tk0 tk0Var = this.f26666k1;
        int i10 = this.f21615t0;
        tk0Var.setPadding(i10, 0, i10, 0);
        updateColors();
        this.P1.O(false);
    }

    @Override
    public final void E0(int i10) {
        super.E0(i10);
        org.telegram.messenger.i0.t3(this, 0, false, null);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.f21583a, 0, true, new d(this, 5), this.I0);
        this.P1 = p51Var;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public void T0(float f7) {
        this.S1 = f7;
        if (this.E != null) {
            this.E.setTranslationY(Math.max((this.f21586b.getY() + f7) + this.f21614s0, this.E.getHeight() + (org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16020m)) - this.E.getBottom());
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        boolean z10;
        float f7;
        float width;
        org.telegram.ui.ActionBar.p2 p2Var = this.f21589c;
        float height = p2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.i0.f16021n, this.f21586b.getY() + this.S1 + this.f21614s0);
        if (max >= height) {
            return;
        }
        if (this.f21586b.getWidth() < p2Var.getWidth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = this.f21586b.getX() + this.f21615t0;
        } else {
            f7 = 0.0f;
        }
        float f10 = f7;
        if (z10) {
            width = (this.f21586b.getX() + this.f21586b.getWidth()) - this.f21615t0;
        } else {
            width = p2Var.getWidth();
        }
        canvas.drawRect(f10, max, width, height, this.R1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20872a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, this.I0);
    }

    @Override
    public void show() {
        boolean z10;
        if (getWindow() != null) {
            org.telegram.messenger.i0.S(getWindow());
        }
        super.show();
        int d12 = d1();
        E0(d12);
        if (org.telegram.messenger.i0.B(d12) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.i0.m3(this, z10);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final void updateColors() {
        int d12 = d1();
        this.R1.setColor(d12);
        v0(d12);
        P(d12);
        ViewGroup viewGroup = this.Q1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}

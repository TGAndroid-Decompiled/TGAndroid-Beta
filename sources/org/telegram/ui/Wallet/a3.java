package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
public class a3 extends org.telegram.ui.Components.ha implements org.telegram.ui.ActionBar.k6 {
    public q51 P1;
    public final ViewGroup Q1;
    public final Paint R1;
    public float S1;

    public a3(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, true, false, p6Var);
        this.R1 = new Paint();
        this.f26730r1 = 0.1f;
        this.Q1 = viewGroup;
        uk0 uk0Var = this.f26724k1;
        int i10 = this.f21616t0;
        uk0Var.setPadding(i10, 0, i10, 0);
        updateColors();
        this.P1.O(false);
    }

    @Override
    public final void E0(int i10) {
        super.E0(i10);
        org.telegram.messenger.i0.t3(this, 0, false, null);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.f21584a, 0, true, new d(this, 5), this.I0);
        this.P1 = q51Var;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public void T0(float f7) {
        this.S1 = f7;
        if (this.E != null) {
            this.E.setTranslationY(Math.max((this.f21587b.getY() + f7) + this.f21615s0, this.E.getHeight() + (org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16166m)) - this.E.getBottom());
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        boolean z10;
        float f7;
        float width;
        org.telegram.ui.ActionBar.p2 p2Var = this.f21590c;
        float height = p2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.i0.f16167n, this.f21587b.getY() + this.S1 + this.f21615s0);
        if (max >= height) {
            return;
        }
        if (this.f21587b.getWidth() < p2Var.getWidth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = this.f21587b.getX() + this.f21616t0;
        } else {
            f7 = 0.0f;
        }
        float f10 = f7;
        if (z10) {
            width = (this.f21587b.getX() + this.f21587b.getWidth()) - this.f21616t0;
        } else {
            width = p2Var.getWidth();
        }
        canvas.drawRect(f10, max, width, height, this.R1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20873a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.I0);
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

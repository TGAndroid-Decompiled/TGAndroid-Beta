package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public class x2 extends org.telegram.ui.Components.ja implements org.telegram.ui.ActionBar.z5 {
    public p41 T1;
    public final ViewGroup U1;
    public final Paint V1;
    public float W1;

    public x2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.V1 = new Paint();
        this.f35943v1 = 0.1f;
        this.U1 = viewGroup;
        uj0 uj0Var = this.f35936o1;
        int i7 = this.f29717u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        updateColors();
        this.T1.O(false);
    }

    @Override
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.t3(this, 0, false, null);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, 0, true, new d(this, 5), this.J0);
        this.T1 = p41Var;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public void T0(float f10) {
        this.W1 = f10;
        if (this.F != null) {
            this.F.setTranslationY(Math.max((this.f29682b.getY() + f10) + this.f29716t0, this.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f23603m)) - this.F.getBottom());
        }
    }

    @Override
    public final void Z(Canvas canvas) {
        boolean z10;
        float f10;
        float width;
        org.telegram.ui.ActionBar.k2 k2Var = this.f29685c;
        float height = k2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.f23604n, this.f29682b.getY() + this.W1 + this.f29716t0);
        if (max >= height) {
            return;
        }
        if (this.f29682b.getWidth() < k2Var.getWidth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = this.f29682b.getX() + this.f29717u0;
        } else {
            f10 = 0.0f;
        }
        float f11 = f10;
        if (z10) {
            width = (this.f29682b.getX() + this.f29682b.getWidth()) - this.f29717u0;
        } else {
            width = k2Var.getWidth();
        }
        canvas.drawRect(f11, max, width, height, this.V1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28792a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0);
    }

    @Override
    public void show() {
        boolean z10;
        if (getWindow() != null) {
            org.telegram.messenger.g0.S(getWindow());
        }
        super.show();
        int d12 = d1();
        E0(d12);
        if (org.telegram.messenger.g0.B(d12) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.n3(this, z10);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override
    public final void updateColors() {
        int d12 = d1();
        this.V1.setColor(d12);
        v0(d12);
        P(d12);
        ViewGroup viewGroup = this.U1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class li extends FrameLayout {
    public final org.telegram.ui.ActionBar.i6 f37134a;
    public final ti f37135b;
    public ek0 f37136c;
    public ek0 d;
    public int f37137e;
    public boolean f37138f;
    public boolean h;

    public li(Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(context);
        this.f37134a = i6Var;
        this.f37135b = tiVar;
    }

    public abstract void B(int i7, int i10);

    public boolean F(int i7) {
        return false;
    }

    public boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        return false;
    }

    public boolean N() {
        return !(this instanceof kl);
    }

    public boolean O() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return this instanceof xk;
    }

    public boolean f() {
        return this instanceof xk;
    }

    public boolean g() {
        return false;
    }

    public int getButtonsHideOffset() {
        float f10;
        if (j() != 0) {
            f10 = 12.0f;
        } else {
            f10 = 17.0f;
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public int getCurrentItemTop() {
        return 0;
    }

    public int getCustomActionBarBackground() {
        return 0;
    }

    public int getCustomBackground() {
        return 0;
    }

    public int getFirstOffset() {
        return 0;
    }

    public int getListTopPadding() {
        return 0;
    }

    public int getSelectedItemsCount() {
        return 0;
    }

    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof xk;
    }

    public boolean i() {
        return false;
    }

    public int j() {
        return 0;
    }

    public boolean k() {
        return false;
    }

    public void n(float f10, float f11) {
        m(f10);
    }

    public boolean o(MotionEvent motionEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean s() {
        return true;
    }

    public void setBlur3Capture(ek0 ek0Var) {
        int i7 = ti.I4;
        this.f37135b.Y0.b(ek0Var);
        this.f37136c = ek0Var;
    }

    public void D(int i7) {
    }

    public void H(li liVar) {
    }

    public void a(CharSequence charSequence) {
    }

    public void m(float f10) {
    }

    public void r(int i7) {
    }

    public void v(float f10) {
    }

    public void w(int i7) {
    }

    public void A() {
    }

    public void C() {
    }

    public void I() {
    }

    public void J() {
    }

    public void d() {
    }

    public void l() {
    }

    public void p() {
    }

    public void t() {
    }

    public void u() {
    }

    public void x() {
    }

    public void y() {
    }

    public void E(float f10, float f11) {
    }

    public void z(int i7, boolean z10) {
    }
}

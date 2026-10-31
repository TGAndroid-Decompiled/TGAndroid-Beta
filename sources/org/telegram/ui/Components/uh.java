package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class uh extends FrameLayout {
    public final org.telegram.ui.ActionBar.p6 f30946a;
    public final bi f30947b;
    public tk0 f30948c;
    public tk0 d;
    public int e;
    public boolean f30949f;
    public boolean h;

    public uh(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(context);
        this.f30946a = p6Var;
        this.f30947b = biVar;
    }

    public abstract void B(int i10, int i11);

    public boolean F(int i10) {
        return false;
    }

    public boolean J(boolean z10, int i10, int i11, long j10, boolean z11) {
        return false;
    }

    public boolean L() {
        return !(this instanceof xh.i3);
    }

    public boolean M() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return this instanceof kk;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this instanceof kk;
    }

    public int getButtonsHideOffset() {
        float f7;
        if (i() != 0) {
            f7 = 12.0f;
        } else {
            f7 = 17.0f;
        }
        return org.telegram.messenger.i0.L(f7);
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

    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public int i() {
        return 0;
    }

    public boolean j() {
        return false;
    }

    public void m(float f7, float f10) {
        l(f7);
    }

    public boolean n(MotionEvent motionEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean r() {
        return true;
    }

    public void setBlur3Capture(tk0 tk0Var) {
        int i10 = bi.E4;
        this.f30947b.X0.b(tk0Var);
        this.f30948c = tk0Var;
    }

    public void D(int i10) {
    }

    public void G(uh uhVar) {
    }

    public void a(CharSequence charSequence) {
    }

    public void l(float f7) {
    }

    public void q(int i10) {
    }

    public void u(float f7) {
    }

    public void w(int i10) {
    }

    public void A() {
    }

    public void C() {
    }

    public void H() {
    }

    public void I() {
    }

    public void d() {
    }

    public void k() {
    }

    public void o() {
    }

    public void s() {
    }

    public void t() {
    }

    public void x() {
    }

    public void y() {
    }

    public void z(int i10, boolean z10) {
    }
}

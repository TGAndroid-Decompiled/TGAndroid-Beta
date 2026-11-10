package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class uh extends FrameLayout {
    public final org.telegram.ui.ActionBar.h6 f38655a;
    public final ci f38656b;
    public pj0 f38657c;
    public pj0 d;
    public int f38658e;
    public boolean f38659f;
    public boolean h;

    public uh(Context context, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar) {
        super(context);
        this.f38655a = h6Var;
        this.f38656b = ciVar;
    }

    public abstract void B(int i7, int i10);

    public boolean G(int i7) {
        return false;
    }

    public boolean L(boolean z9, int i7, int i10, long j3, boolean z10) {
        return false;
    }

    public boolean M() {
        return !(this instanceof vk);
    }

    public boolean N() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return this instanceof hk;
    }

    public boolean f() {
        return this instanceof hk;
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

    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof hk;
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

    public void setBlur3Capture(pj0 pj0Var) {
        int i7 = ci.H4;
        this.f38656b.X0.b(pj0Var);
        this.f38657c = pj0Var;
    }

    public void D(int i7) {
    }

    public void H(uh uhVar) {
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

    public void z(int i7, boolean z9) {
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class vh extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 f39070a;
    public final di f39071b;
    public qj0 f39072c;
    public qj0 d;
    public int f39073e;
    public boolean f39074f;
    public boolean h;

    public vh(Context context, org.telegram.ui.ActionBar.g6 g6Var, di diVar) {
        super(context);
        this.f39070a = g6Var;
        this.f39071b = diVar;
    }

    public abstract void B(int i7, int i10);

    public boolean G(int i7) {
        return false;
    }

    public boolean L(boolean z9, int i7, int i10, long j3, boolean z10) {
        return false;
    }

    public boolean M() {
        return !(this instanceof wk);
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
        return this instanceof ik;
    }

    public boolean f() {
        return this instanceof ik;
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

    public ArrayList<org.telegram.ui.ActionBar.u6> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof ik;
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

    public void setBlur3Capture(qj0 qj0Var) {
        int i7 = di.E4;
        this.f39071b.X0.b(qj0Var);
        this.f39072c = qj0Var;
    }

    public void D(int i7) {
    }

    public void H(vh vhVar) {
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

package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class ci extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f33608a;
    public final ki f33609b;
    public uj0 f33610c;
    public uj0 d;
    public int f33611e;
    public boolean f33612f;
    public boolean h;

    public ci(Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context);
        this.f33608a = e6Var;
        this.f33609b = kiVar;
    }

    public abstract void B(int i7, int i10);

    public boolean H(int i7) {
        return false;
    }

    public boolean M(boolean z10, int i7, int i10, long j3, boolean z11) {
        return false;
    }

    public boolean N() {
        return !(this instanceof dl);
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
        return this instanceof qk;
    }

    public boolean f() {
        return this instanceof qk;
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

    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof qk;
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

    public void setBlur3Capture(uj0 uj0Var) {
        int i7 = ki.I4;
        this.f33609b.Y0.b(uj0Var);
        this.f33610c = uj0Var;
    }

    public void D(int i7) {
    }

    public void I(ci ciVar) {
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

    public void J() {
    }

    public void K() {
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

    public void F(float f10, float f11) {
    }

    public void z(int i7, boolean z10) {
    }
}

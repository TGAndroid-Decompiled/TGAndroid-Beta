package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public abstract class li extends FrameLayout {
    public final org.telegram.ui.ActionBar.u6 f30253a;
    public final ti f30254b;
    public nm0 f30255c;
    public nm0 d;
    public int e;
    public boolean f30256f;
    public boolean h;

    public li(Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(context);
        this.f30253a = u6Var;
        this.f30254b = tiVar;
    }

    public abstract void B(int i10, int i11);

    public boolean F(int i10) {
        return false;
    }

    public boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        return false;
    }

    public boolean L() {
        return !(this instanceof hi.o4);
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
        return this instanceof al;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this instanceof al;
    }

    public int getButtonsHideOffset() {
        float f7;
        if (i() != 0) {
            f7 = 12.0f;
        } else {
            f7 = 17.0f;
        }
        return AndroidUtilities.dp(f7);
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

    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
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

    public void setBlur3Capture(nm0 nm0Var) {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.k3) this.f30254b).glassEngine;
        qVar.b(nm0Var);
        this.f30255c = nm0Var;
    }

    public void A() {
    }

    public void C() {
    }

    public void H() {
    }

    public void J() {
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

    public void w() {
    }

    public void x() {
    }

    public void D(int i10) {
    }

    public void G(li liVar) {
    }

    public void a(CharSequence charSequence) {
    }

    public void l(float f7) {
    }

    public void q(int i10) {
    }

    public void u(float f7) {
    }

    public void v(int i10) {
    }

    public void y(int i10, boolean z10) {
    }
}

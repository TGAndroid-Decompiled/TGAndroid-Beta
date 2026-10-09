package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public abstract class qi extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f30172a;
    public final yi f30173b;
    public qm0 f30174c;
    public qm0 d;
    public int f30175e;
    public boolean f30176f;
    public boolean h;

    public qi(Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(context);
        this.f30172a = e6Var;
        this.f30173b = yiVar;
    }

    public abstract void C(int i10, int i11);

    public boolean F(int i10) {
        return false;
    }

    public boolean K(int i10, boolean z10, int i11, boolean z11, long j3) {
        return false;
    }

    public boolean L() {
        return !(this instanceof ei.p4);
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
        return this instanceof gl;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this instanceof gl;
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

    public bh.a getIBlur3Capture() {
        return null;
    }

    public int getListTopPadding() {
        return 0;
    }

    public int getSelectedItemsCount() {
        return 0;
    }

    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
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

    public boolean o(MotionEvent motionEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean s() {
        return true;
    }

    public void B() {
    }

    public void D() {
    }

    public void E(int i10) {
    }

    public void G(qi qiVar) {
    }

    public void I() {
    }

    public void J() {
    }

    public void a(CharSequence charSequence) {
    }

    public void d() {
    }

    public void k() {
    }

    public void l(float f7) {
    }

    public void p() {
    }

    public void r(int i10) {
    }

    public void t() {
    }

    public void u() {
    }

    public void v(float f7) {
    }

    public void w(int i10) {
    }

    public void x() {
    }

    public void y() {
    }

    public void z(int i10, boolean z10) {
    }
}

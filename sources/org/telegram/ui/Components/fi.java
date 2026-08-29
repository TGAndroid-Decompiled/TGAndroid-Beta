package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public abstract class fi extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 f28402a;
    public final ni f28403b;
    public jl0 f28404c;
    public jl0 d;
    public int f28405e;
    public boolean f28406f;
    public boolean h;

    public fi(Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context);
        this.f28402a = c6Var;
        this.f28403b = niVar;
    }

    public boolean C(int i10) {
        return false;
    }

    public boolean H(int i10, boolean z10, int i11, boolean z11, long j10) {
        return false;
    }

    public boolean I() {
        return !(this instanceof ph.n3);
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public int getButtonsHideOffset() {
        float f9;
        if (h() != 0) {
            f9 = 12.0f;
        } else {
            f9 = 17.0f;
        }
        return AndroidUtilities.dp(f9);
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

    public mg.a getIBlur3Capture() {
        return null;
    }

    public int getListTopPadding() {
        return 0;
    }

    public int getSelectedItemsCount() {
        return 0;
    }

    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        return null;
    }

    public int h() {
        return 0;
    }

    public boolean i() {
        return false;
    }

    public boolean l(MotionEvent motionEvent) {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean p() {
        return true;
    }

    public abstract void y(int i10, int i11);

    public void A() {
    }

    public void B(int i10) {
    }

    public void D(fi fiVar) {
    }

    public void E() {
    }

    public void F() {
    }

    public void a(CharSequence charSequence) {
    }

    public void d() {
    }

    public void j() {
    }

    public void k(float f9) {
    }

    public void m() {
    }

    public void o(int i10) {
    }

    public void q() {
    }

    public void r() {
    }

    public void s(float f9) {
    }

    public void t(int i10) {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void w(int i10, boolean z10) {
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public abstract class ei extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 f26589a;
    public final mi f26590b;
    public sl0 f26591c;
    public sl0 d;
    public int f26592e;
    public boolean f26593f;
    public boolean h;

    public ei(Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context);
        this.f26589a = g6Var;
        this.f26590b = miVar;
    }

    public boolean C(int i10) {
        return false;
    }

    public boolean H(int i10, boolean z4, int i11, boolean z10, long j10) {
        return false;
    }

    public boolean I() {
        return !(this instanceof sh.n3);
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
        float f10;
        if (h() != 0) {
            f10 = 12.0f;
        } else {
            f10 = 17.0f;
        }
        return AndroidUtilities.dp(f10);
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

    public pg.a getIBlur3Capture() {
        return null;
    }

    public int getListTopPadding() {
        return 0;
    }

    public int getSelectedItemsCount() {
        return 0;
    }

    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
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

    public void D(ei eiVar) {
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

    public void k(float f10) {
    }

    public void m() {
    }

    public void o(int i10) {
    }

    public void q() {
    }

    public void r() {
    }

    public void s(float f10) {
    }

    public void t(int i10) {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void w(int i10, boolean z4) {
    }
}

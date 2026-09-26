package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public abstract class oi extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f27086a;
    public final wi f27087b;
    public wl0 f27088c;
    public wl0 d;
    public int e;
    public boolean f27089f;
    public boolean h;

    public oi(Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(context);
        this.f27086a = d6Var;
        this.f27087b = wiVar;
    }

    public boolean B(int i10) {
        return false;
    }

    public boolean I(int i10, boolean z10, int i11, boolean z11, long j3) {
        return false;
    }

    public boolean J() {
        return !(this instanceof ei.q4);
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
        float f7;
        if (h() != 0) {
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

    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
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

    public void A(int i10) {
    }

    public void E(oi oiVar) {
    }

    public void F() {
    }

    public void G() {
    }

    public void a(CharSequence charSequence) {
    }

    public void d() {
    }

    public void j() {
    }

    public void k(float f7) {
    }

    public void m() {
    }

    public void o(int i10) {
    }

    public void q() {
    }

    public void r() {
    }

    public void s(float f7) {
    }

    public void t(int i10) {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void z() {
    }

    public void w(int i10, boolean z10) {
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public abstract class ci extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f27492a;
    public final ki f27493b;
    public wk0 f27494c;
    public wk0 d;
    public int f27495e;
    public boolean f27496f;
    public boolean h;

    public ci(Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context);
        this.f27492a = b6Var;
        this.f27493b = kiVar;
    }

    public boolean C(int i9) {
        return false;
    }

    public boolean H(int i9, boolean z10, int i10, boolean z11, long j10) {
        return false;
    }

    public boolean I() {
        return !(this instanceof mh.g4);
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

    public jg.a getIBlur3Capture() {
        return null;
    }

    public int getListTopPadding() {
        return 0;
    }

    public int getSelectedItemsCount() {
        return 0;
    }

    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
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

    public abstract void y(int i9, int i10);

    public void A(int i9) {
    }

    public void D(ci ciVar) {
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

    public void o(int i9) {
    }

    public void q() {
    }

    public void r() {
    }

    public void s(float f10) {
    }

    public void t(int i9) {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void z() {
    }

    public void w(int i9, boolean z10) {
    }
}

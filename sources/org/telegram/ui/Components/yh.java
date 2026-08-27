package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public abstract class yh extends FrameLayout {

    public final org.telegram.ui.ActionBar.c6 f34899a;

    public final gi f34900b;

    public zk0 f34901c;
    public zk0 d;

    public int f34902e;

    public boolean f34903f;
    public boolean h;

    public yh(Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(context);
        this.f34899a = c6Var;
        this.f34900b = giVar;
    }

    public boolean D(int i10) {
        return false;
    }

    public boolean I(int i10, boolean z10, int i11, boolean z11, long j10) {
        return false;
    }

    public boolean J() {
        return !(this instanceof nh.e4);
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
        return AndroidUtilities.dp(h() != 0 ? 12.0f : 17.0f);
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

    public kg.a getIBlur3Capture() {
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

    public boolean q() {
        return true;
    }

    public abstract void z(int i10, int i11);

    public void B() {
    }

    public void C(int i10) {
    }

    public void E(yh yhVar) {
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

    public void k(float f10) {
    }

    public void m() {
    }

    public void p(int i10) {
    }

    public void r() {
    }

    public void s() {
    }

    public void t(float f10) {
    }

    public void u(int i10) {
    }

    public void v() {
    }

    public void w() {
    }

    public void y() {
    }

    public void x(int i10, boolean z10) {
    }
}

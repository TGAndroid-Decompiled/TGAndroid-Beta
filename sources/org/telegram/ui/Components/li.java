package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public abstract class li extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f28176a;
    public final ti f28177b;
    public jm0 f28178c;
    public jm0 d;
    public int e;
    public boolean f28179f;
    public boolean h;

    public li(Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(context);
        this.f28176a = d6Var;
        this.f28177b = tiVar;
    }

    public abstract void B(int i10, int i11);

    public boolean E(int i10) {
        return false;
    }

    public boolean K(int i10, boolean z10, int i11, boolean z11, long j10) {
        return false;
    }

    public boolean L() {
        return !(this instanceof gi.f4);
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

    public ch.a getIBlur3Capture() {
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

    public boolean s() {
        return true;
    }

    public void A() {
    }

    public void C() {
    }

    public void D(int i10) {
    }

    public void F(li liVar) {
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

    public void o() {
    }

    public void q(int i10) {
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

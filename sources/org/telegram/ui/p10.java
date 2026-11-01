package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
public final class p10 implements org.telegram.ui.ActionBar.o0, org.telegram.ui.Components.jk0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.i1 {
    public final int f40322a;
    public final a50 f40323b;

    public p10(a50 a50Var, int i10) {
        this.f40322a = i10;
        this.f40323b = a50Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int keyboardHeight;
        r0.g1 g1Var = j1Var.f46143a;
        i0.c f7 = g1Var.f(647);
        i0.c f10 = g1Var.f(8);
        a50 a50Var = this.f40323b;
        f30 f30Var = a50Var.f35683y1;
        if (!f30Var.N && !f30Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = f30Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = a50Var.S3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (f30Var.getEmojiView() != null) {
            f30Var.getEmojiView().setBottomInset(f7.d);
        }
        if (a50Var.J4) {
            ViewGroup viewGroup = a50Var.f21587b;
            int i10 = a50Var.f21616t0;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = a50Var.f21587b;
            int i11 = a50Var.f21616t0;
            viewGroup2.setPadding(f7.f7766a + i11, f7.f7767b, i11 + f7.f7768c, f7.d);
        }
        a50Var.f21587b.requestLayout();
        if (max == 0 && !f30Var.N && !f30Var.e && !f30Var.O) {
            f30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.nj0 nj0Var = a50Var.B1;
            if (nj0Var == null) {
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                nj0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.nj0 nj0Var2 = new org.telegram.ui.Components.nj0(1, a50Var.f21584a, a50Var.getContext(), Q, a50Var.I0);
                    a50Var.B1 = nj0Var2;
                    nj0Var2.setDelegate(new d40(a50Var));
                    a50Var.f21587b.addView(a50Var.B1, w7.b6.e(-2, 52, 81));
                    a50Var.B1.p(null, null, false);
                    a50Var.f35679x1.bringToFront();
                    a50Var.f35675w1.bringToFront();
                    nj0Var = a50Var.B1;
                }
            }
            a50Var.B1 = nj0Var;
        }
        f30Var.L(f10.d, false);
        a50Var.f35664t3.j(j1Var);
        return r0.j1.f46142b;
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f40322a) {
            case 1:
                a50 a50Var = this.f40323b;
                if (a50Var.I1(view)) {
                    try {
                        a50Var.H1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                a50 a50Var2 = this.f40323b;
                if (!a50Var2.t1()) {
                    if (view instanceof org.telegram.ui.Components.voip.k) {
                        return a50Var2.I1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.h4) {
                        a50Var2.L1();
                        org.telegram.ui.Components.fi0 fi0Var = ((org.telegram.ui.Cells.h4) view).f21981f;
                        if (fi0Var.isEnabled()) {
                            fi0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void k(int i10) {
        this.f40323b.F1.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void p(KeyEvent keyEvent) {
        a50 a50Var;
        b40 b40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (b40Var = (a50Var = this.f40323b).W4) != null && b40Var.isShowing()) {
            a50Var.W4.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        ArrayList arrayList;
        s4.c1 K;
        a50 a50Var = this.f40323b;
        t20 t20Var = a50Var.f35592d4;
        x20 x20Var = a50Var.R3;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) a50Var.R2.f18372p.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!x20Var.f31792b) {
                    if (a50Var.f35616j2) {
                        arrayList = a50Var.f35668u2;
                    } else {
                        arrayList = a50Var.R2.f18364g;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = a50Var.H1.K(indexOf + a50Var.G1.d)) != null) {
                        View view = K.f47909a;
                        if (view instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == a50Var.O4 && !a50Var.f35588c4) {
                                a50Var.f21587b.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < t20Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) t20Var.getChildAt(i11);
                        if (org.telegram.messenger.kj.C1(y10Var.getParticipant().peer) == org.telegram.messenger.kj.C1(groupCallParticipant.peer)) {
                            y10Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                x20Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }
}

package org.telegram.ui.Cells;

import android.graphics.Path;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_keyboard;
public final class g1 {
    public final r1 f30643a;
    public final HashMap f30644b;
    public final HashMap f30645c;
    public String d;

    public g1(r1 r1Var) {
        new Path();
        this.f30644b = new HashMap();
        this.f30645c = new HashMap();
        this.f30643a = r1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i7;
        float f10;
        int L;
        r1 r1Var = this.f30643a;
        ArrayList arrayList = r1Var.I5;
        ArrayList arrayList2 = r1Var.I5;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int N1 = (int) r1Var.N1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = r1Var.getWidthForButtons();
                if (r1Var.Q5.P3()) {
                    L = (r1Var.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
                } else if (r1Var.u2()) {
                    L = r1Var.getCompactLeft();
                } else {
                    int i10 = r1Var.N6;
                    if (r1Var.C6) {
                        f10 = 1.0f;
                    } else {
                        f10 = 7.0f;
                    }
                    L = i10 + org.telegram.messenger.g0.L(f10);
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    d0 d0Var = (d0) arrayList2.get(i11);
                    int L2 = (d0Var.d + r1Var.f31384e7) - org.telegram.messenger.g0.L(2.0f);
                    float f11 = x10;
                    float f12 = widthForButtons;
                    float f13 = (d0Var.f30500c * f12) + L;
                    if (f11 >= f13 && f11 <= (d0Var.f30501e * f12) + f13 && N1 >= L2 && N1 <= d0Var.f30502f + L2) {
                        r1Var.N5 = i11;
                        r1Var.q2();
                        if (d0Var.f30514s == null) {
                            y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29419ed, r1Var.Qb), 6, 6);
                            d0Var.f30514s = a02;
                            a02.setCallback(r1Var);
                            y yVar = d0Var.f30514s;
                            int i12 = ((int) (d0Var.f30500c * f12)) + L;
                            yVar.setBounds(i12, L2, ((int) (d0Var.f30501e * f12)) + i12, d0Var.f30502f + L2);
                        }
                        d0Var.f30514s.setHotspot(f11, N1);
                        d0Var.f30514s.setState(r1Var.N2);
                        d0Var.b(!d0Var.f30508m);
                        r1Var.postDelayed(new ai.w0(this, r1Var.N5, 23), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (r1Var.N5 != -1) {
                    r1Var.playSoundEffect(0);
                    d0 d0Var2 = (d0) arrayList2.get(r1Var.N5);
                    y yVar2 = d0Var2.f30514s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    d0Var2.b(false);
                    if (r1Var.Q5.f23994r1) {
                        Toast.makeText(r1Var.getContext(), gd.M0(2131748338, null), 1).show();
                    } else {
                        m1 m1Var = r1Var.Sa;
                        if (m1Var != null && !d0Var2.f30508m) {
                            org.telegram.messenger.p2 p2Var = d0Var2.f30505j;
                            if (p2Var != null) {
                                m1Var.I(r1Var, p2Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = d0Var2.f30504i;
                                if (keyboardInlineButton != null) {
                                    m1Var.k1(r1Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    r1Var.N5 = -1;
                    r1Var.q2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i7 = r1Var.N5) != -1) {
                d0 d0Var3 = (d0) arrayList2.get(i7);
                y yVar3 = d0Var3.f30514s;
                if (yVar3 != null) {
                    yVar3.setState(StateSet.NOTHING);
                }
                d0Var3.b(false);
                r1Var.N5 = -1;
                r1Var.q2();
            }
        }
        return false;
    }

    public final void b(android.graphics.Canvas r29, java.util.ArrayList r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g1.b(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final void c(org.telegram.messenger.fj r32, b3.j r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g1.c(org.telegram.messenger.fj, b3.j, int, boolean):void");
    }
}

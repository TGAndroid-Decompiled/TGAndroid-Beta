package org.telegram.ui.Cells;

import android.graphics.Path;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_keyboard;
public final class d1 {
    public final q1 f21804a;
    public final HashMap f21805b;
    public final HashMap f21806c;
    public String d;

    public d1(q1 q1Var) {
        new Path();
        this.f21805b = new HashMap();
        this.f21806c = new HashMap();
        this.f21804a = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i10;
        float f7;
        int L;
        q1 q1Var = this.f21804a;
        ArrayList arrayList = q1Var.G5;
        ArrayList arrayList2 = q1Var.G5;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int K1 = (int) q1Var.K1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = q1Var.getWidthForButtons();
                if (q1Var.O5.P3()) {
                    L = (q1Var.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.i0.L(10.0f);
                } else if (q1Var.r2()) {
                    L = q1Var.getCompactLeft();
                } else {
                    int i11 = q1Var.L6;
                    if (q1Var.A6) {
                        f7 = 1.0f;
                    } else {
                        f7 = 7.0f;
                    }
                    L = i11 + org.telegram.messenger.i0.L(f7);
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    c0 c0Var = (c0) arrayList2.get(i12);
                    int L2 = (c0Var.d + q1Var.f22520c7) - org.telegram.messenger.i0.L(2.0f);
                    float f10 = x10;
                    float f11 = widthForButtons;
                    float f12 = (c0Var.f21756c * f11) + L;
                    if (f10 >= f12 && f10 <= (c0Var.e * f11) + f12 && K1 >= L2 && K1 <= c0Var.f21757f + L2) {
                        q1Var.L5 = i12;
                        q1Var.n2();
                        if (c0Var.f21769s == null) {
                            y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20899bd, q1Var.Ob), 6, 6);
                            c0Var.f21769s = a02;
                            a02.setCallback(q1Var);
                            y yVar = c0Var.f21769s;
                            int i13 = ((int) (c0Var.f21756c * f11)) + L;
                            yVar.setBounds(i13, L2, ((int) (c0Var.e * f11)) + i13, c0Var.f21757f + L2);
                        }
                        c0Var.f21769s.setHotspot(f10, K1);
                        c0Var.f21769s.setState(q1Var.L2);
                        c0Var.b(!c0Var.f21763m);
                        q1Var.postDelayed(new ag.d3(this, q1Var.L5, 14), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (q1Var.L5 != -1) {
                    q1Var.playSoundEffect(0);
                    c0 c0Var2 = (c0) arrayList2.get(q1Var.L5);
                    y yVar2 = c0Var2.f21769s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var2.b(false);
                    if (q1Var.O5.f16710p1) {
                        Toast.makeText(q1Var.getContext(), dd.L0(2131748545, null), 1).show();
                    } else {
                        l1 l1Var = q1Var.Qa;
                        if (l1Var != null && !c0Var2.f21763m) {
                            org.telegram.messenger.s2 s2Var = c0Var2.f21760j;
                            if (s2Var != null) {
                                l1Var.G(q1Var, s2Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var2.f21759i;
                                if (keyboardInlineButton != null) {
                                    l1Var.W0(q1Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    q1Var.L5 = -1;
                    q1Var.n2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i10 = q1Var.L5) != -1) {
                c0 c0Var3 = (c0) arrayList2.get(i10);
                y yVar3 = c0Var3.f21769s;
                if (yVar3 != null) {
                    yVar3.setState(StateSet.NOTHING);
                }
                c0Var3.b(false);
                q1Var.L5 = -1;
                q1Var.n2();
            }
        }
        return false;
    }

    public final void b(android.graphics.Canvas r29, java.util.ArrayList r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d1.b(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final void c(org.telegram.messenger.kj r32, c5.x r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.d1.c(org.telegram.messenger.kj, c5.x, int, boolean):void");
    }
}

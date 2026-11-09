package org.telegram.ui.Cells;

import android.graphics.Path;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_keyboard;
public final class e1 {
    public final q1 f29050a;
    public final HashMap f29051b;
    public final HashMap f29052c;
    public String d;

    public e1(q1 q1Var) {
        new Path();
        this.f29051b = new HashMap();
        this.f29052c = new HashMap();
        this.f29050a = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i7;
        float f10;
        int L;
        q1 q1Var = this.f29050a;
        ArrayList arrayList = q1Var.H5;
        ArrayList arrayList2 = q1Var.H5;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int M1 = (int) q1Var.M1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = q1Var.getWidthForButtons();
                if (q1Var.P5.P3()) {
                    L = (q1Var.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
                } else if (q1Var.t2()) {
                    L = q1Var.getCompactLeft();
                } else {
                    int i10 = q1Var.M6;
                    if (q1Var.B6) {
                        f10 = 1.0f;
                    } else {
                        f10 = 7.0f;
                    }
                    L = i10 + org.telegram.messenger.g0.L(f10);
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    c0 c0Var = (c0) arrayList2.get(i11);
                    int L2 = (c0Var.d + q1Var.f29820d7) - org.telegram.messenger.g0.L(2.0f);
                    float f11 = x10;
                    float f12 = widthForButtons;
                    float f13 = (c0Var.f28957c * f12) + L;
                    if (f11 >= f13 && f11 <= (c0Var.f28958e * f12) + f13 && M1 >= L2 && M1 <= c0Var.f28959f + L2) {
                        q1Var.M5 = i11;
                        q1Var.p2();
                        if (c0Var.f28971s == null) {
                            y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.bd, q1Var.Pb), 6, 6);
                            c0Var.f28971s = a02;
                            a02.setCallback(q1Var);
                            y yVar = c0Var.f28971s;
                            int i12 = ((int) (c0Var.f28957c * f12)) + L;
                            yVar.setBounds(i12, L2, ((int) (c0Var.f28958e * f12)) + i12, c0Var.f28959f + L2);
                        }
                        c0Var.f28971s.setHotspot(f11, M1);
                        c0Var.f28971s.setState(q1Var.M2);
                        c0Var.b(!c0Var.f28965m);
                        q1Var.postDelayed(new bg.m0(this, q1Var.M5, 19), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (q1Var.M5 != -1) {
                    q1Var.playSoundEffect(0);
                    c0 c0Var2 = (c0) arrayList2.get(q1Var.M5);
                    y yVar2 = c0Var2.f28971s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var2.b(false);
                    if (q1Var.P5.f23281p1) {
                        Toast.makeText(q1Var.getContext(), id.M0(2131748530, null), 1).show();
                    } else {
                        l1 l1Var = q1Var.Ra;
                        if (l1Var != null && !c0Var2.f28965m) {
                            org.telegram.messenger.o2 o2Var = c0Var2.f28962j;
                            if (o2Var != null) {
                                l1Var.G(q1Var, o2Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var2.f28961i;
                                if (keyboardInlineButton != null) {
                                    l1Var.b1(q1Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    q1Var.M5 = -1;
                    q1Var.p2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i7 = q1Var.M5) != -1) {
                c0 c0Var3 = (c0) arrayList2.get(i7);
                y yVar3 = c0Var3.f28971s;
                if (yVar3 != null) {
                    yVar3.setState(StateSet.NOTHING);
                }
                c0Var3.b(false);
                q1Var.M5 = -1;
                q1Var.p2();
            }
        }
        return false;
    }

    public final void b(android.graphics.Canvas r29, java.util.ArrayList r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e1.b(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    public final void c(org.telegram.messenger.ij r32, f5.u r33, int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e1.c(org.telegram.messenger.ij, f5.u, int, boolean):void");
    }
}

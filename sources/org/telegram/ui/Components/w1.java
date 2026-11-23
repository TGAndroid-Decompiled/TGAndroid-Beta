package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w1 implements View.OnClickListener {
    public final int f41614a;
    public final KeyEvent.Callback f41615b;
    public final Object f41616c;
    public final Object d;
    public final Object f41617e;
    public final Object f41618f;
    public final Object h;

    public w1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f41614a = i7;
        this.f41615b = callback;
        this.f41617e = obj;
        this.f41618f = obj2;
        this.f41616c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f41614a) {
            case 0:
                tb0 tb0Var = (tb0) this.f41615b;
                j4 j4Var = (j4) this.f41617e;
                k4 k4Var = (k4) this.f41618f;
                Calendar calendar = (Calendar) this.f41616c;
                org.telegram.ui.aj0 aj0Var = (org.telegram.ui.aj0) this.h;
                hi.w4 w4Var = (hi.w4) this.d;
                boolean g10 = c5.g(null, null, 0L, 0L, 0, tb0Var, j4Var, k4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, tb0Var.getValue());
                calendar.set(11, j4Var.getValue());
                calendar.set(12, k4Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                ((boolean[]) aj0Var.f45644c)[0] = true;
                ((org.telegram.ui.i01) aj0Var.f45643b).e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.w2) w4Var.f15708b).f30218y0.run();
                return;
            case 1:
                tb0 tb0Var2 = (tb0) this.f41615b;
                b4 b4Var = (b4) this.f41617e;
                c4 c4Var = (c4) this.f41618f;
                Calendar calendar2 = (Calendar) this.f41616c;
                a5 a5Var = (a5) this.h;
                hi.w4 w4Var2 = (hi.w4) this.d;
                boolean g11 = c5.g(null, null, 0L, 0L, 0, tb0Var2, b4Var, c4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, tb0Var2.getValue());
                calendar2.set(11, b4Var.getValue());
                calendar2.set(12, c4Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                a5Var.O((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) w4Var2.f15708b).f30218y0.run();
                return;
            case 2:
                tb0 tb0Var3 = (tb0) this.f41615b;
                tb0 tb0Var4 = (tb0) this.f41617e;
                tb0 tb0Var5 = (tb0) this.f41618f;
                Calendar calendar3 = (Calendar) this.f41616c;
                c5.b(tb0Var3, tb0Var4, tb0Var5);
                calendar3.set(1, tb0Var5.getValue());
                calendar3.set(2, tb0Var4.getValue());
                calendar3.set(5, tb0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((org.telegram.messenger.or) this.h).a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.w2) ((hi.w4) this.d).f15708b).f30218y0.run();
                return;
            case 3:
                kw0 kw0Var = (kw0) this.f41615b;
                int[] iArr = (int[]) this.f41617e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f41618f;
                TextView textView = (TextView) this.f41616c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i7 = iArr[0];
                if (i7 != 1) {
                    if (i7 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        kw0Var.f37016m2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(kw0Var.f30173a).sendRequest(tL_stickers_suggestShortName, new di.m7(kw0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i7 == 2) {
                        iArr[0] = 3;
                        if (!kw0Var.f37014l2) {
                            org.telegram.messenger.g0.D3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.g0.v1(editTextBoldCursor);
                        org.telegram.messenger.az C = org.telegram.messenger.az.C(kw0Var.f30173a);
                        String str = kw0Var.f37016m2;
                        String str2 = kw0Var.f37012j2;
                        String str3 = kw0Var.V1;
                        ArrayList arrayList = kw0Var.T1;
                        uv0 uv0Var = new uv0(kw0Var);
                        if (C.G.get(str2) != null) {
                            uv0Var.a(null);
                        } else {
                            new Thread(new org.telegram.messenger.uj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) uv0Var, 9)).start();
                        }
                        alertDialog$Builder.f28777a.M0.run();
                        kw0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f41615b;
                ArrayList arrayList2 = (ArrayList) this.f41618f;
                int[] iArr2 = (int[]) this.f41616c;
                b9 b9Var = (b9) this.h;
                q9 q9Var = (q9) this.d;
                a70 G = a70.G(w2Var.f30179c, w2Var.J0, (FrameLayout) this.f41617e);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.k10.i(intValue).f();
                    if (f10 != null) {
                        if (iArr2[0] == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        G.e(intValue, z10, new ai.i1(iArr2, intValue, b9Var, f10, q9Var, 25));
                    }
                    i10 = i11;
                }
                G.f33399t = false;
                G.f33367b0 = true;
                G.f33397s = 0;
                G.f33378i = 3;
                G.b0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                G.a0();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f41616c;
                calendar4.setTimeInMillis((((tb0) this.f41615b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wg.f) this.f41617e).getValue());
                calendar4.set(12, ((wg.g) this.f41618f).getValue() * 5);
                ((wg.u) this.h).O((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) ((hi.w4) this.d).f15708b).f30218y0.run();
                return;
        }
    }

    public w1(Calendar calendar, tb0 tb0Var, wg.f fVar, wg.g gVar, wg.u uVar, hi.w4 w4Var) {
        this.f41614a = 5;
        this.f41616c = calendar;
        this.f41615b = tb0Var;
        this.f41617e = fVar;
        this.f41618f = gVar;
        this.h = uVar;
        this.d = w4Var;
    }
}

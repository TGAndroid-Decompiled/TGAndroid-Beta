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
public final class v1 implements View.OnClickListener {
    public final int f40530a;
    public final KeyEvent.Callback f40531b;
    public final Object f40532c;
    public final Object d;
    public final Object f40533e;
    public final Object f40534f;
    public final Object h;

    public v1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f40530a = i7;
        this.f40531b = callback;
        this.f40533e = obj;
        this.f40534f = obj2;
        this.f40532c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f40530a) {
            case 0:
                qb0 qb0Var = (qb0) this.f40531b;
                i4 i4Var = (i4) this.f40533e;
                j4 j4Var = (j4) this.f40534f;
                Calendar calendar = (Calendar) this.f40532c;
                org.telegram.ui.yi0 yi0Var = (org.telegram.ui.yi0) this.h;
                h6.o oVar = (h6.o) this.d;
                boolean g10 = b5.g(null, null, 0L, 0L, 0, qb0Var, i4Var, j4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, qb0Var.getValue());
                calendar.set(11, i4Var.getValue());
                calendar.set(12, j4Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                ((boolean[]) yi0Var.f54386c)[0] = true;
                ((org.telegram.ui.g01) yi0Var.f54385b).e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30268y0.run();
                return;
            case 1:
                qb0 qb0Var2 = (qb0) this.f40531b;
                a4 a4Var = (a4) this.f40533e;
                b4 b4Var = (b4) this.f40534f;
                Calendar calendar2 = (Calendar) this.f40532c;
                z4 z4Var = (z4) this.h;
                h6.o oVar2 = (h6.o) this.d;
                boolean g11 = b5.g(null, null, 0L, 0L, 0, qb0Var2, a4Var, b4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, qb0Var2.getValue());
                calendar2.set(11, a4Var.getValue());
                calendar2.set(12, b4Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                z4Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) oVar2.f13936b).f30268y0.run();
                return;
            case 2:
                qb0 qb0Var3 = (qb0) this.f40531b;
                qb0 qb0Var4 = (qb0) this.f40533e;
                qb0 qb0Var5 = (qb0) this.f40534f;
                Calendar calendar3 = (Calendar) this.f40532c;
                b5.b(qb0Var3, qb0Var4, qb0Var5);
                calendar3.set(1, qb0Var5.getValue());
                calendar3.set(2, qb0Var4.getValue());
                calendar3.set(5, qb0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((org.telegram.messenger.nr) this.h).a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.w2) ((h6.o) this.d).f13936b).f30268y0.run();
                return;
            case 3:
                jw0 jw0Var = (jw0) this.f40531b;
                int[] iArr = (int[]) this.f40533e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f40534f;
                TextView textView = (TextView) this.f40532c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i7 = iArr[0];
                if (i7 != 1) {
                    if (i7 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        jw0Var.f36539m2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(jw0Var.f30223a).sendRequest(tL_stickers_suggestShortName, new di.m7(jw0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i7 == 2) {
                        iArr[0] = 3;
                        if (!jw0Var.f36537l2) {
                            org.telegram.messenger.g0.D3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.g0.v1(editTextBoldCursor);
                        org.telegram.messenger.zy C = org.telegram.messenger.zy.C(jw0Var.f30223a);
                        String str = jw0Var.f36539m2;
                        String str2 = jw0Var.f36535j2;
                        String str3 = jw0Var.V1;
                        ArrayList arrayList = jw0Var.T1;
                        tv0 tv0Var = new tv0(jw0Var);
                        if (C.G.get(str2) != null) {
                            tv0Var.a(null);
                        } else {
                            new Thread(new org.telegram.messenger.tj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) tv0Var, 9)).start();
                        }
                        alertDialog$Builder.f28835a.M0.run();
                        jw0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f40531b;
                ArrayList arrayList2 = (ArrayList) this.f40534f;
                int[] iArr2 = (int[]) this.f40532c;
                a9 a9Var = (a9) this.h;
                p9 p9Var = (p9) this.d;
                x60 G = x60.G(w2Var.f30229c, w2Var.J0, (FrameLayout) this.f40533e);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.i10.i(intValue).f();
                    if (f10 != null) {
                        if (iArr2[0] == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        G.e(intValue, z10, new ai.d1(iArr2, intValue, a9Var, f10, p9Var, 25));
                    }
                    i10 = i11;
                }
                G.f41894t = false;
                G.f41862b0 = true;
                G.f41892s = 0;
                G.f41873i = 3;
                G.b0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                G.a0();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f40532c;
                calendar4.setTimeInMillis((((qb0) this.f40531b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wg.f) this.f40533e).getValue());
                calendar4.set(12, ((wg.g) this.f40534f).getValue() * 5);
                ((wg.t) this.h).I((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) ((h6.o) this.d).f13936b).f30268y0.run();
                return;
        }
    }

    public v1(Calendar calendar, qb0 qb0Var, wg.f fVar, wg.g gVar, wg.t tVar, h6.o oVar) {
        this.f40530a = 5;
        this.f40532c = calendar;
        this.f40531b = qb0Var;
        this.f40533e = fVar;
        this.f40534f = gVar;
        this.h = tVar;
        this.d = oVar;
    }
}

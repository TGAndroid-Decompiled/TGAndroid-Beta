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
public final class l1 implements View.OnClickListener {
    public final int f36689a;
    public final KeyEvent.Callback f36690b;
    public final Object f36691c;
    public final Object d;
    public final Object f36692e;
    public final Object f36693f;
    public final Object h;

    public l1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f36689a = i7;
        this.f36690b = callback;
        this.f36692e = obj;
        this.f36693f = obj2;
        this.f36691c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36689a) {
            case 0:
                ib0 ib0Var = (ib0) this.f36690b;
                a4 a4Var = (a4) this.f36692e;
                b4 b4Var = (b4) this.f36693f;
                Calendar calendar = (Calendar) this.f36691c;
                org.telegram.ui.xi0 xi0Var = (org.telegram.ui.xi0) this.h;
                org.telegram.messenger.ou ouVar = (org.telegram.messenger.ou) this.d;
                boolean g10 = t4.g(null, null, 0L, 0L, 0, ib0Var, a4Var, b4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, ib0Var.getValue());
                calendar.set(11, a4Var.getValue());
                calendar.set(12, b4Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                ((boolean[]) xi0Var.f53251c)[0] = true;
                ((org.telegram.ui.d01) xi0Var.f53250b).e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.u2) ouVar.f25804b).f29724y0.run();
                return;
            case 1:
                ib0 ib0Var2 = (ib0) this.f36690b;
                s3 s3Var = (s3) this.f36692e;
                t3 t3Var = (t3) this.f36693f;
                Calendar calendar2 = (Calendar) this.f36691c;
                r4 r4Var = (r4) this.h;
                org.telegram.messenger.ou ouVar2 = (org.telegram.messenger.ou) this.d;
                boolean g11 = t4.g(null, null, 0L, 0L, 0, ib0Var2, s3Var, t3Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, ib0Var2.getValue());
                calendar2.set(11, s3Var.getValue());
                calendar2.set(12, t3Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                r4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.u2) ouVar2.f25804b).f29724y0.run();
                return;
            case 2:
                ib0 ib0Var3 = (ib0) this.f36690b;
                ib0 ib0Var4 = (ib0) this.f36692e;
                ib0 ib0Var5 = (ib0) this.f36693f;
                Calendar calendar3 = (Calendar) this.f36691c;
                t4.b(ib0Var3, ib0Var4, ib0Var5);
                calendar3.set(1, ib0Var5.getValue());
                calendar3.set(2, ib0Var4.getValue());
                calendar3.set(5, ib0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((org.telegram.messenger.pr) this.h).a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.u2) ((org.telegram.messenger.ou) this.d).f25804b).f29724y0.run();
                return;
            case 3:
                bw0 bw0Var = (bw0) this.f36690b;
                int[] iArr = (int[]) this.f36692e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f36693f;
                TextView textView = (TextView) this.f36691c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i7 = iArr[0];
                if (i7 != 1) {
                    if (i7 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        bw0Var.f33408m2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(bw0Var.f29679a).sendRequest(tL_stickers_suggestShortName, new di.k7(bw0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i7 == 2) {
                        iArr[0] = 3;
                        if (!bw0Var.f33406l2) {
                            org.telegram.messenger.g0.E3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.g0.v1(editTextBoldCursor);
                        org.telegram.messenger.ez C = org.telegram.messenger.ez.C(bw0Var.f29679a);
                        String str = bw0Var.f33408m2;
                        String str2 = bw0Var.f33404j2;
                        String str3 = bw0Var.V1;
                        ArrayList arrayList = bw0Var.T1;
                        jv0 jv0Var = new jv0(bw0Var);
                        if (C.G.get(str2) != null) {
                            jv0Var.a(null);
                        } else {
                            new Thread(new org.telegram.messenger.wj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) jv0Var, 9)).start();
                        }
                        alertDialog$Builder.f28392a.M0.run();
                        bw0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f36690b;
                ArrayList arrayList2 = (ArrayList) this.f36693f;
                int[] iArr2 = (int[]) this.f36691c;
                t8 t8Var = (t8) this.h;
                i9 i9Var = (i9) this.d;
                m60 F = m60.F(u2Var.f29685c, u2Var.J0, (FrameLayout) this.f36692e);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.m10.i(intValue).f();
                    if (f10 != null) {
                        if (iArr2[0] == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        F.e(intValue, z10, new ai.f1(iArr2, intValue, t8Var, f10, i9Var, 25));
                    }
                    i10 = i11;
                }
                F.f37112t = false;
                F.Y = true;
                F.f37111s = 0;
                F.f37093i = 3;
                F.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f36691c;
                calendar4.setTimeInMillis((((ib0) this.f36690b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wg.f) this.f36692e).getValue());
                calendar4.set(12, ((wg.g) this.f36693f).getValue() * 5);
                ((wg.s) this.h).L((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.u2) ((org.telegram.messenger.ou) this.d).f25804b).f29724y0.run();
                return;
        }
    }

    public l1(Calendar calendar, ib0 ib0Var, wg.f fVar, wg.g gVar, wg.s sVar, org.telegram.messenger.ou ouVar) {
        this.f36689a = 5;
        this.f36691c = calendar;
        this.f36690b = ib0Var;
        this.f36692e = fVar;
        this.f36693f = gVar;
        this.h = sVar;
        this.d = ouVar;
    }
}

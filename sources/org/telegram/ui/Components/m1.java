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
public final class m1 implements View.OnClickListener {
    public final int f35948a;
    public final KeyEvent.Callback f35949b;
    public final Object f35950c;
    public final Object d;
    public final Object f35951e;
    public final Object f35952f;
    public final Object h;

    public m1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.f35948a = i3;
        this.f35949b = callback;
        this.f35951e = obj;
        this.f35952f = obj2;
        this.f35950c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f35948a) {
            case 0:
                cb0 cb0Var = (cb0) this.f35949b;
                a4 a4Var = (a4) this.f35951e;
                b4 b4Var = (b4) this.f35952f;
                Calendar calendar = (Calendar) this.f35950c;
                org.telegram.ui.rb0 rb0Var = (org.telegram.ui.rb0) this.h;
                hi.d dVar = (hi.d) this.d;
                boolean g7 = t4.g(null, null, 0L, 0L, 0, cb0Var, a4Var, b4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, cb0Var.getValue());
                calendar.set(11, a4Var.getValue());
                calendar.set(12, b4Var.getValue());
                if (g7) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                ((boolean[]) rb0Var.f49188c)[0] = true;
                ((org.telegram.ui.wz0) rb0Var.f49187b).e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28625y0.run();
                return;
            case 1:
                cb0 cb0Var2 = (cb0) this.f35949b;
                s3 s3Var = (s3) this.f35951e;
                t3 t3Var = (t3) this.f35952f;
                Calendar calendar2 = (Calendar) this.f35950c;
                r4 r4Var = (r4) this.h;
                hi.d dVar2 = (hi.d) this.d;
                boolean g10 = t4.g(null, null, 0L, 0L, 0, cb0Var2, s3Var, t3Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, cb0Var2.getValue());
                calendar2.set(11, s3Var.getValue());
                calendar2.set(12, t3Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                r4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.t2) dVar2.f14429b).f28625y0.run();
                return;
            case 2:
                cb0 cb0Var3 = (cb0) this.f35949b;
                cb0 cb0Var4 = (cb0) this.f35951e;
                cb0 cb0Var5 = (cb0) this.f35952f;
                Calendar calendar3 = (Calendar) this.f35950c;
                t4.b(cb0Var3, cb0Var4, cb0Var5);
                calendar3.set(1, cb0Var5.getValue());
                calendar3.set(2, cb0Var4.getValue());
                calendar3.set(5, cb0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((org.telegram.messenger.kr) this.h).a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.t2) ((hi.d) this.d).f14429b).f28625y0.run();
                return;
            case 3:
                xv0 xv0Var = (xv0) this.f35949b;
                int[] iArr = (int[]) this.f35951e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f35952f;
                TextView textView = (TextView) this.f35950c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i3 = iArr[0];
                if (i3 != 1) {
                    if (i3 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        xv0Var.f40515j2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(xv0Var.f28583a).sendRequest(tL_stickers_suggestShortName, new ci.s7(xv0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i3 == 2) {
                        iArr[0] = 3;
                        if (!xv0Var.f40513i2) {
                            org.telegram.messenger.g0.F3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.g0.v1(editTextBoldCursor);
                        org.telegram.messenger.yy C = org.telegram.messenger.yy.C(xv0Var.f28583a);
                        String str = xv0Var.f40515j2;
                        String str2 = xv0Var.f40511g2;
                        String str3 = xv0Var.S1;
                        ArrayList arrayList = xv0Var.Q1;
                        gv0 gv0Var = new gv0(xv0Var);
                        if (C.G.get(str2) != null) {
                            gv0Var.a(null);
                        } else {
                            new Thread(new org.telegram.messenger.pj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) gv0Var, 9)).start();
                        }
                        alertDialog$Builder.f27343a.O0.run();
                        xv0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f35949b;
                ArrayList arrayList2 = (ArrayList) this.f35952f;
                int[] iArr2 = (int[]) this.f35950c;
                u8 u8Var = (u8) this.h;
                k9 k9Var = (k9) this.d;
                f60 F = f60.F(t2Var.f28589c, t2Var.J0, (FrameLayout) this.f35951e);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.h10.i(intValue).f();
                    if (f10 != null) {
                        if (iArr2[0] == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        F.e(intValue, z10, new ai.p1(iArr2, intValue, u8Var, f10, k9Var, 25));
                    }
                    i10 = i11;
                }
                F.f33748t = false;
                F.Y = true;
                F.f33747s = 0;
                F.f33729i = 3;
                F.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f35950c;
                calendar4.setTimeInMillis((((cb0) this.f35949b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((xg.h) this.f35951e).getValue());
                calendar4.set(12, ((xg.i) this.f35952f).getValue() * 5);
                ((xg.u) this.h).L((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.t2) ((hi.d) this.d).f14429b).f28625y0.run();
                return;
        }
    }

    public m1(Calendar calendar, cb0 cb0Var, xg.h hVar, xg.i iVar, xg.u uVar, hi.d dVar) {
        this.f35948a = 5;
        this.f35950c = calendar;
        this.f35949b = cb0Var;
        this.f35951e = hVar;
        this.f35952f = iVar;
        this.h = uVar;
        this.d = dVar;
    }
}

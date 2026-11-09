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
public final class n1 implements View.OnClickListener {
    public final int f36189a;
    public final KeyEvent.Callback f36190b;
    public final Object f36191c;
    public final Object d;
    public final Object f36192e;
    public final Object f36193f;
    public final Object h;

    public n1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f36189a = i7;
        this.f36190b = callback;
        this.f36192e = obj;
        this.f36193f = obj2;
        this.f36191c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        switch (this.f36189a) {
            case 0:
                ib0 ib0Var = (ib0) this.f36190b;
                c4 c4Var = (c4) this.f36192e;
                d4 d4Var = (d4) this.f36193f;
                Calendar calendar = (Calendar) this.f36191c;
                org.telegram.ui.nk0 nk0Var = (org.telegram.ui.nk0) this.h;
                h9.f1 f1Var = (h9.f1) this.d;
                boolean g10 = v4.g(null, null, 0L, 0L, 0, ib0Var, c4Var, d4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, ib0Var.getValue());
                calendar.set(11, c4Var.getValue());
                calendar.set(12, d4Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                ((boolean[]) nk0Var.f48202c)[0] = true;
                ((org.telegram.ui.i01) nk0Var.f48201b).e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.v2) f1Var.f14323b).f28660x0.run();
                return;
            case 1:
                ib0 ib0Var2 = (ib0) this.f36190b;
                u3 u3Var = (u3) this.f36192e;
                v3 v3Var = (v3) this.f36193f;
                Calendar calendar2 = (Calendar) this.f36191c;
                t4 t4Var = (t4) this.h;
                h9.f1 f1Var2 = (h9.f1) this.d;
                boolean g11 = v4.g(null, null, 0L, 0L, 0, ib0Var2, u3Var, v3Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, ib0Var2.getValue());
                calendar2.set(11, u3Var.getValue());
                calendar2.set(12, v3Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                t4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.v2) f1Var2.f14323b).f28660x0.run();
                return;
            case 2:
                ib0 ib0Var3 = (ib0) this.f36190b;
                ib0 ib0Var4 = (ib0) this.f36192e;
                ib0 ib0Var5 = (ib0) this.f36193f;
                Calendar calendar3 = (Calendar) this.f36191c;
                v4.b(ib0Var3, ib0Var4, ib0Var5);
                calendar3.set(1, ib0Var5.getValue());
                calendar3.set(2, ib0Var4.getValue());
                calendar3.set(5, ib0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((org.telegram.messenger.sr) this.h).a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) this.d).f14323b).f28660x0.run();
                return;
            case 3:
                zv0 zv0Var = (zv0) this.f36190b;
                int[] iArr = (int[]) this.f36192e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f36193f;
                TextView textView = (TextView) this.f36191c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i7 = iArr[0];
                if (i7 != 1) {
                    if (i7 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        zv0Var.f41152i2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(zv0Var.f28621a).sendRequest(tL_stickers_suggestShortName, new bi.r8(zv0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i7 == 2) {
                        iArr[0] = 3;
                        if (!zv0Var.f41150h2) {
                            org.telegram.messenger.g0.F3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.g0.v1(editTextBoldCursor);
                        org.telegram.messenger.gz C = org.telegram.messenger.gz.C(zv0Var.f28621a);
                        String str = zv0Var.f41152i2;
                        String str2 = zv0Var.f41148f2;
                        String str3 = zv0Var.R1;
                        ArrayList arrayList = zv0Var.P1;
                        jv0 jv0Var = new jv0(zv0Var);
                        if (C.F.get(str2) != null) {
                            jv0Var.a(null);
                        } else {
                            new Thread(new org.telegram.messenger.yj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) jv0Var, 9)).start();
                        }
                        alertDialog$Builder.f27296a.L0.run();
                        zv0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f36190b;
                ArrayList arrayList2 = (ArrayList) this.f36193f;
                int[] iArr2 = (int[]) this.f36191c;
                w8 w8Var = (w8) this.h;
                l9 l9Var = (l9) this.d;
                l60 F = l60.F(v2Var.f28627c, v2Var.I0, (FrameLayout) this.f36192e);
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList2.get(i10)).intValue();
                    TLRPC.User f10 = org.telegram.messenger.p10.i(intValue).f();
                    if (f10 != null) {
                        if (iArr2[0] == intValue) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        F.e(intValue, z9, new bi.ub(iArr2, intValue, w8Var, f10, l9Var, 23));
                    }
                    i10 = i11;
                }
                F.f35618t = false;
                F.Y = true;
                F.f35617s = 0;
                F.f35599i = 3;
                F.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f36191c;
                calendar4.setTimeInMillis((((ib0) this.f36190b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wg.f) this.f36192e).getValue());
                calendar4.set(12, ((wg.g) this.f36193f).getValue() * 5);
                ((wg.t) this.h).L((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) this.d).f14323b).f28660x0.run();
                return;
        }
    }

    public n1(Calendar calendar, ib0 ib0Var, wg.f fVar, wg.g gVar, wg.t tVar, h9.f1 f1Var) {
        this.f36189a = 5;
        this.f36191c = calendar;
        this.f36190b = ib0Var;
        this.f36192e = fVar;
        this.f36193f = gVar;
        this.h = tVar;
        this.d = f1Var;
    }
}

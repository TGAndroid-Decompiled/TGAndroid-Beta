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
    public final int f41588a;
    public final KeyEvent.Callback f41589b;
    public final Object f41590c;
    public final Object d;
    public final Object f41591e;
    public final Object f41592f;
    public final Object h;

    public w1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f41588a = i7;
        this.f41589b = callback;
        this.f41591e = obj;
        this.f41592f = obj2;
        this.f41590c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f41588a) {
            case 0:
                tb0 tb0Var = (tb0) this.f41589b;
                j4 j4Var = (j4) this.f41591e;
                k4 k4Var = (k4) this.f41592f;
                Calendar calendar = (Calendar) this.f41590c;
                org.telegram.ui.aj0 aj0Var = (org.telegram.ui.aj0) this.h;
                hi.x4 x4Var = (hi.x4) this.d;
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
                ((boolean[]) aj0Var.f45612c)[0] = true;
                ((org.telegram.ui.h01) aj0Var.f45611b).e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.w2) x4Var.f15680b).f30184y0.run();
                return;
            case 1:
                tb0 tb0Var2 = (tb0) this.f41589b;
                b4 b4Var = (b4) this.f41591e;
                c4 c4Var = (c4) this.f41592f;
                Calendar calendar2 = (Calendar) this.f41590c;
                a5 a5Var = (a5) this.h;
                hi.x4 x4Var2 = (hi.x4) this.d;
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
                ((org.telegram.ui.ActionBar.w2) x4Var2.f15680b).f30184y0.run();
                return;
            case 2:
                tb0 tb0Var3 = (tb0) this.f41589b;
                tb0 tb0Var4 = (tb0) this.f41591e;
                tb0 tb0Var5 = (tb0) this.f41592f;
                Calendar calendar3 = (Calendar) this.f41590c;
                c5.b(tb0Var3, tb0Var4, tb0Var5);
                calendar3.set(1, tb0Var5.getValue());
                calendar3.set(2, tb0Var4.getValue());
                calendar3.set(5, tb0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((org.telegram.messenger.or) this.h).a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.w2) ((hi.x4) this.d).f15680b).f30184y0.run();
                return;
            case 3:
                kw0 kw0Var = (kw0) this.f41589b;
                int[] iArr = (int[]) this.f41591e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f41592f;
                TextView textView = (TextView) this.f41590c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i7 = iArr[0];
                if (i7 != 1) {
                    if (i7 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        kw0Var.f36973m2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(kw0Var.f30139a).sendRequest(tL_stickers_suggestShortName, new di.m7(kw0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i7 == 2) {
                        iArr[0] = 3;
                        if (!kw0Var.f36971l2) {
                            org.telegram.messenger.g0.D3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.g0.v1(editTextBoldCursor);
                        org.telegram.messenger.az C = org.telegram.messenger.az.C(kw0Var.f30139a);
                        String str = kw0Var.f36973m2;
                        String str2 = kw0Var.f36969j2;
                        String str3 = kw0Var.V1;
                        ArrayList arrayList = kw0Var.T1;
                        uv0 uv0Var = new uv0(kw0Var);
                        if (C.G.get(str2) != null) {
                            uv0Var.a(null);
                        } else {
                            new Thread(new org.telegram.messenger.uj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) uv0Var, 9)).start();
                        }
                        alertDialog$Builder.f28743a.M0.run();
                        kw0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f41589b;
                ArrayList arrayList2 = (ArrayList) this.f41592f;
                int[] iArr2 = (int[]) this.f41590c;
                b9 b9Var = (b9) this.h;
                q9 q9Var = (q9) this.d;
                a70 G = a70.G(w2Var.f30145c, w2Var.J0, (FrameLayout) this.f41591e);
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
                        G.e(intValue, z10, new ai.c1(iArr2, intValue, b9Var, f10, q9Var, 25));
                    }
                    i10 = i11;
                }
                G.f33365t = false;
                G.f33333b0 = true;
                G.f33363s = 0;
                G.f33344i = 3;
                G.b0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                G.a0();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f41590c;
                calendar4.setTimeInMillis((((tb0) this.f41589b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wg.f) this.f41591e).getValue());
                calendar4.set(12, ((wg.g) this.f41592f).getValue() * 5);
                ((wg.u) this.h).O((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) ((hi.x4) this.d).f15680b).f30184y0.run();
                return;
        }
    }

    public w1(Calendar calendar, tb0 tb0Var, wg.f fVar, wg.g gVar, wg.u uVar, hi.x4 x4Var) {
        this.f41588a = 5;
        this.f41590c = calendar;
        this.f41589b = tb0Var;
        this.f41591e = fVar;
        this.f41592f = gVar;
        this.h = uVar;
        this.d = x4Var;
    }
}

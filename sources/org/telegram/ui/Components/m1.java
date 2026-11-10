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
    public final int f35782a;
    public final KeyEvent.Callback f35783b;
    public final Object f35784c;
    public final Object d;
    public final Object f35785e;
    public final Object f35786f;
    public final Object h;

    public m1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f35782a = i7;
        this.f35783b = callback;
        this.f35785e = obj;
        this.f35786f = obj2;
        this.f35784c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        switch (this.f35782a) {
            case 0:
                hb0 hb0Var = (hb0) this.f35783b;
                b4 b4Var = (b4) this.f35785e;
                c4 c4Var = (c4) this.f35786f;
                Calendar calendar = (Calendar) this.f35784c;
                org.telegram.ui.ok0 ok0Var = (org.telegram.ui.ok0) this.h;
                h9.f1 f1Var = (h9.f1) this.d;
                boolean g10 = u4.g(null, null, 0L, 0L, 0, hb0Var, b4Var, c4Var);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, hb0Var.getValue());
                calendar.set(11, b4Var.getValue());
                calendar.set(12, c4Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                ((boolean[]) ok0Var.f48541c)[0] = true;
                ((org.telegram.ui.j01) ok0Var.f48540b).e(Integer.valueOf(timeInMillis));
                ((org.telegram.ui.ActionBar.w2) f1Var.f14325b).f28711x0.run();
                return;
            case 1:
                hb0 hb0Var2 = (hb0) this.f35783b;
                t3 t3Var = (t3) this.f35785e;
                u3 u3Var = (u3) this.f35786f;
                Calendar calendar2 = (Calendar) this.f35784c;
                s4 s4Var = (s4) this.h;
                h9.f1 f1Var2 = (h9.f1) this.d;
                boolean g11 = u4.g(null, null, 0L, 0L, 0, hb0Var2, t3Var, u3Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, hb0Var2.getValue());
                calendar2.set(11, t3Var.getValue());
                calendar2.set(12, u3Var.getValue());
                if (g11) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                s4Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) f1Var2.f14325b).f28711x0.run();
                return;
            case 2:
                hb0 hb0Var3 = (hb0) this.f35783b;
                hb0 hb0Var4 = (hb0) this.f35785e;
                hb0 hb0Var5 = (hb0) this.f35786f;
                Calendar calendar3 = (Calendar) this.f35784c;
                u4.b(hb0Var3, hb0Var4, hb0Var5);
                calendar3.set(1, hb0Var5.getValue());
                calendar3.set(2, hb0Var4.getValue());
                calendar3.set(5, hb0Var3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((org.telegram.messenger.sr) this.h).a((int) (calendar3.getTimeInMillis() / 1000));
                ((org.telegram.ui.ActionBar.w2) ((h9.f1) this.d).f14325b).f28711x0.run();
                return;
            case 3:
                yv0 yv0Var = (yv0) this.f35783b;
                int[] iArr = (int[]) this.f35785e;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f35786f;
                TextView textView = (TextView) this.f35784c;
                TextView textView2 = (TextView) this.h;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                int i7 = iArr[0];
                if (i7 != 1) {
                    if (i7 == 0) {
                        iArr[0] = 1;
                        TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
                        String obj = editTextBoldCursor.getText().toString();
                        yv0Var.f40746l2 = obj;
                        tL_stickers_suggestShortName.title = obj;
                        ConnectionsManager.getInstance(yv0Var.f28669a).sendRequest(tL_stickers_suggestShortName, new bi.r8(yv0Var, editTextBoldCursor, textView, textView2, iArr, 7));
                        return;
                    } else if (i7 == 2) {
                        iArr[0] = 3;
                        if (!yv0Var.f40745k2) {
                            org.telegram.messenger.g0.F3(editTextBoldCursor);
                            try {
                                editTextBoldCursor.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                        org.telegram.messenger.g0.v1(editTextBoldCursor);
                        org.telegram.messenger.gz C = org.telegram.messenger.gz.C(yv0Var.f28669a);
                        String str = yv0Var.f40746l2;
                        String str2 = yv0Var.f40743i2;
                        String str3 = yv0Var.U1;
                        ArrayList arrayList = yv0Var.S1;
                        iv0 iv0Var = new iv0(yv0Var);
                        if (C.F.get(str2) != null) {
                            iv0Var.a(null);
                        } else {
                            new Thread(new org.telegram.messenger.yj((Object) C, str, str2, (Object) str3, (Object) arrayList, (Object) iv0Var, 9)).start();
                        }
                        alertDialog$Builder.f27300a.L0.run();
                        yv0Var.dismiss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f35783b;
                ArrayList arrayList2 = (ArrayList) this.f35786f;
                int[] iArr2 = (int[]) this.f35784c;
                v8 v8Var = (v8) this.h;
                k9 k9Var = (k9) this.d;
                k60 F = k60.F(w2Var.f28675c, w2Var.I0, (FrameLayout) this.f35785e);
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
                        F.e(intValue, z9, new bi.ub(iArr2, intValue, v8Var, f10, k9Var, 23));
                    }
                    i10 = i11;
                }
                F.f35220t = false;
                F.Y = true;
                F.f35219s = 0;
                F.f35201i = 3;
                F.a0(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f35784c;
                calendar4.setTimeInMillis((((hb0) this.f35783b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((wg.f) this.f35785e).getValue());
                calendar4.set(12, ((wg.g) this.f35786f).getValue() * 5);
                ((wg.t) this.h).L((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.w2) ((h9.f1) this.d).f14325b).f28711x0.run();
                return;
        }
    }

    public m1(Calendar calendar, hb0 hb0Var, wg.f fVar, wg.g gVar, wg.t tVar, h9.f1 f1Var) {
        this.f35782a = 5;
        this.f35784c = calendar;
        this.f35783b = hb0Var;
        this.f35785e = fVar;
        this.f35786f = gVar;
        this.h = tVar;
        this.d = f1Var;
    }
}

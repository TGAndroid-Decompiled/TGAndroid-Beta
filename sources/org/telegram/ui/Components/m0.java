package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m0 implements View.OnClickListener {
    public final int f28560a;
    public final KeyEvent.Callback f28561b;
    public final Object f28562c;
    public final Object d;
    public final Object f28563e;
    public final Object f28564f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f28560a = i10;
        this.f28561b = callback;
        this.f28563e = obj;
        this.f28564f = obj2;
        this.f28562c = obj3;
        this.h = obj4;
        this.d = obj5;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        boolean z10;
        Runnable runnable4;
        switch (this.f28560a) {
            case 0:
                vd0 vd0Var = (vd0) this.f28561b;
                vd0 vd0Var2 = (vd0) this.f28563e;
                vd0 vd0Var3 = (vd0) this.f28564f;
                Calendar calendar = (Calendar) this.f28562c;
                g5.a(vd0Var, vd0Var2, vd0Var3);
                calendar.set(1, vd0Var3.getValue());
                calendar.set(2, vd0Var2.getValue());
                calendar.set(5, vd0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20384a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                vd0 vd0Var4 = (vd0) this.f28561b;
                i4 i4Var = (i4) this.f28563e;
                j4 j4Var = (j4) this.f28564f;
                Calendar calendar2 = (Calendar) this.f28562c;
                org.telegram.ui.ls0 ls0Var = (org.telegram.ui.ls0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                boolean f7 = g5.f(null, null, 0L, 0L, 0, vd0Var4, i4Var, j4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, vd0Var4.getValue());
                calendar2.set(11, i4Var.getValue());
                calendar2.set(12, j4Var.getValue());
                if (f7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) ls0Var.f39716c)[0] = true;
                ((org.telegram.ui.z51) ls0Var.f39715b).e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var.f20384a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                vd0 vd0Var5 = (vd0) this.f28561b;
                z3 z3Var = (z3) this.f28563e;
                b4 b4Var = (b4) this.f28564f;
                Calendar calendar3 = (Calendar) this.f28562c;
                f5 f5Var = (f5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean f10 = g5.f(null, null, 0L, 0L, 0, vd0Var5, z3Var, b4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, vd0Var5.getValue());
                calendar3.set(11, z3Var.getValue());
                calendar3.set(12, b4Var.getValue());
                if (f10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                f5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var2.f20384a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                yy0.z((yy0) this.f28561b, (int[]) this.f28563e, (EditTextBoldCursor) this.f28564f, (TextView) this.f28562c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f28561b;
                ArrayList arrayList = (ArrayList) this.f28564f;
                int[] iArr = (int[]) this.f28562c;
                j9 j9Var = (j9) this.h;
                y9 y9Var = (y9) this.d;
                q80 F = q80.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.f28563e);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        if (iArr[0] == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        F.e(intValue, z10, new ei.l3(iArr, intValue, j9Var, currentUser, y9Var));
                    }
                    i10 = i11;
                }
                F.f30121t = false;
                F.Y = true;
                F.f30120s = 0;
                F.f30102i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f28562c;
                calendar4.setTimeInMillis((((vd0) this.f28561b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((tg.g) this.f28563e).getValue());
                calendar4.set(12, ((tg.h) this.f28564f).getValue() * 5);
                ((tg.u) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.a3) this.d).f20384a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, vd0 vd0Var, tg.g gVar, tg.h hVar, tg.u uVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28560a = 5;
        this.f28562c = calendar;
        this.f28561b = vd0Var;
        this.f28563e = gVar;
        this.f28564f = hVar;
        this.h = uVar;
        this.d = a3Var;
    }
}

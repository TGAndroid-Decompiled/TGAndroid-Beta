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
import org.telegram.ui.di1;
public final class m0 implements View.OnClickListener {
    public final int f28455a;
    public final KeyEvent.Callback f28456b;
    public final Object f28457c;
    public final Object d;
    public final Object e;
    public final Object f28458f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f28455a = i10;
        this.f28456b = callback;
        this.e = obj;
        this.f28458f = obj2;
        this.f28457c = obj3;
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
        switch (this.f28455a) {
            case 0:
                qd0 qd0Var = (qd0) this.f28456b;
                qd0 qd0Var2 = (qd0) this.e;
                qd0 qd0Var3 = (qd0) this.f28458f;
                Calendar calendar = (Calendar) this.f28457c;
                f5.b(qd0Var, qd0Var2, qd0Var3);
                calendar.set(1, qd0Var3.getValue());
                calendar.set(2, qd0Var2.getValue());
                calendar.set(5, qd0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f20728a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                qd0 qd0Var4 = (qd0) this.f28456b;
                g4 g4Var = (g4) this.e;
                h4 h4Var = (h4) this.f28458f;
                Calendar calendar2 = (Calendar) this.f28457c;
                org.telegram.ui.ql0 ql0Var = (org.telegram.ui.ql0) this.h;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g10 = f5.g(null, null, 0L, 0L, 0, qd0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, qd0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) ql0Var.f40864c)[0] = true;
                ((org.telegram.ui.q41) ql0Var.f40863b).e(Integer.valueOf(timeInMillis));
                runnable2 = b3Var.f20728a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                qd0 qd0Var5 = (qd0) this.f28456b;
                x3 x3Var = (x3) this.e;
                z3 z3Var = (z3) this.f28458f;
                Calendar calendar3 = (Calendar) this.f28457c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.b3 b3Var2 = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g11 = f5.g(null, null, 0L, 0L, 0, qd0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, qd0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.C((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = b3Var2.f20728a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                ty0.A((ty0) this.f28456b, (int[]) this.e, (EditTextBoldCursor) this.f28458f, (TextView) this.f28457c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f28456b;
                ArrayList arrayList = (ArrayList) this.f28458f;
                int[] iArr = (int[]) this.f28457c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                j80 F = j80.F(h3Var.container, h3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                        F.e(intValue, z10, new di1(iArr, intValue, h9Var, currentUser, w9Var, 0));
                    }
                    i10 = i11;
                }
                F.f27581t = false;
                F.Y = true;
                F.f27580s = 0;
                F.f27562i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f28457c;
                calendar4.setTimeInMillis((((qd0) this.f28456b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((ug.f) this.e).getValue());
                calendar4.set(12, ((ug.g) this.f28458f).getValue() * 5);
                ((ug.s) this.h).C((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.b3) this.d).f20728a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, qd0 qd0Var, ug.f fVar, ug.g gVar, ug.s sVar, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f28455a = 5;
        this.f28457c = calendar;
        this.f28456b = qd0Var;
        this.e = fVar;
        this.f28458f = gVar;
        this.h = sVar;
        this.d = b3Var;
    }
}

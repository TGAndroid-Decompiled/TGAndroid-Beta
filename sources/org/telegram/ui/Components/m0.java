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
    public final int f26047a;
    public final KeyEvent.Callback f26048b;
    public final Object f26049c;
    public final Object d;
    public final Object e;
    public final Object f26050f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f26047a = i10;
        this.f26048b = callback;
        this.e = obj;
        this.f26050f = obj2;
        this.f26049c = obj3;
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
        switch (this.f26047a) {
            case 0:
                tc0 tc0Var = (tc0) this.f26048b;
                tc0 tc0Var2 = (tc0) this.e;
                tc0 tc0Var3 = (tc0) this.f26050f;
                Calendar calendar = (Calendar) this.f26049c;
                e5.b(tc0Var, tc0Var2, tc0Var3);
                calendar.set(1, tc0Var3.getValue());
                calendar.set(2, tc0Var2.getValue());
                calendar.set(5, tc0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f18414a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                tc0 tc0Var4 = (tc0) this.f26048b;
                g4 g4Var = (g4) this.e;
                h4 h4Var = (h4) this.f26050f;
                Calendar calendar2 = (Calendar) this.f26049c;
                org.telegram.ui.kv0 kv0Var = (org.telegram.ui.kv0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g10 = e5.g(null, null, 0L, 0L, 0, tc0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, tc0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) kv0Var.f34813c)[0] = true;
                ((org.telegram.ui.o51) kv0Var.f34812b).e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var.f18414a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                tc0 tc0Var5 = (tc0) this.f26048b;
                x3 x3Var = (x3) this.e;
                z3 z3Var = (z3) this.f26050f;
                Calendar calendar3 = (Calendar) this.f26049c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g11 = e5.g(null, null, 0L, 0L, 0, tc0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, tc0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var2.f18414a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                ux0.x((ux0) this.f26048b, (int[]) this.e, (EditTextBoldCursor) this.f26050f, (TextView) this.f26049c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f26048b;
                ArrayList arrayList = (ArrayList) this.f26050f;
                int[] iArr = (int[]) this.f26049c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                o70 F = o70.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                        F.e(intValue, z10, new ei.l3(iArr, intValue, h9Var, currentUser, w9Var));
                    }
                    i10 = i11;
                }
                F.f26670t = false;
                F.Y = true;
                F.f26669s = 0;
                F.f26651i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f26049c;
                calendar4.setTimeInMillis((((tc0) this.f26048b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((tg.i) this.e).getValue());
                calendar4.set(12, ((tg.j) this.f26050f).getValue() * 5);
                ((tg.v) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.a3) this.d).f18414a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, tc0 tc0Var, tg.i iVar, tg.j jVar, tg.v vVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f26047a = 5;
        this.f26049c = calendar;
        this.f26048b = tc0Var;
        this.e = iVar;
        this.f26050f = jVar;
        this.h = vVar;
        this.d = a3Var;
    }
}

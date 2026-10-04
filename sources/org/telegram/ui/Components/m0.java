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
    public final int f28487a;
    public final KeyEvent.Callback f28488b;
    public final Object f28489c;
    public final Object d;
    public final Object f28490e;
    public final Object f28491f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f28487a = i10;
        this.f28488b = callback;
        this.f28490e = obj;
        this.f28491f = obj2;
        this.f28489c = obj3;
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
        switch (this.f28487a) {
            case 0:
                gd0 gd0Var = (gd0) this.f28488b;
                gd0 gd0Var2 = (gd0) this.f28490e;
                gd0 gd0Var3 = (gd0) this.f28491f;
                Calendar calendar = (Calendar) this.f28489c;
                e5.b(gd0Var, gd0Var2, gd0Var3);
                calendar.set(1, gd0Var3.getValue());
                calendar.set(2, gd0Var2.getValue());
                calendar.set(5, gd0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20378a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                gd0 gd0Var4 = (gd0) this.f28488b;
                g4 g4Var = (g4) this.f28490e;
                h4 h4Var = (h4) this.f28491f;
                Calendar calendar2 = (Calendar) this.f28489c;
                org.telegram.ui.fs0 fs0Var = (org.telegram.ui.fs0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g10 = e5.g(null, null, 0L, 0L, 0, gd0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, gd0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) fs0Var.f36389c)[0] = true;
                ((org.telegram.ui.r51) fs0Var.f36388b).e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var.f20378a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                gd0 gd0Var5 = (gd0) this.f28488b;
                x3 x3Var = (x3) this.f28490e;
                z3 z3Var = (z3) this.f28491f;
                Calendar calendar3 = (Calendar) this.f28489c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g11 = e5.g(null, null, 0L, 0L, 0, gd0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, gd0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.K((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var2.f20378a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                qy0.x((qy0) this.f28488b, (int[]) this.f28490e, (EditTextBoldCursor) this.f28491f, (TextView) this.f28489c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f28488b;
                ArrayList arrayList = (ArrayList) this.f28491f;
                int[] iArr = (int[]) this.f28489c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                b80 F = b80.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.f28490e);
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
                        F.e(intValue, z10, new ei.m3(iArr, intValue, h9Var, currentUser, w9Var));
                    }
                    i10 = i11;
                }
                F.f24850t = false;
                F.Y = true;
                F.f24849s = 0;
                F.f24831i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f28489c;
                calendar4.setTimeInMillis((((gd0) this.f28488b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((tg.g) this.f28490e).getValue());
                calendar4.set(12, ((tg.h) this.f28491f).getValue() * 5);
                ((tg.u) this.h).K((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.a3) this.d).f20378a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, gd0 gd0Var, tg.g gVar, tg.h hVar, tg.u uVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28487a = 5;
        this.f28489c = calendar;
        this.f28488b = gd0Var;
        this.f28490e = gVar;
        this.f28491f = hVar;
        this.h = uVar;
        this.d = a3Var;
    }
}

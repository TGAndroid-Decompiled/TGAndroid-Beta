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
public final class o0 implements View.OnClickListener {
    public final int f25626a;
    public final KeyEvent.Callback f25627b;
    public final Object f25628c;
    public final Object d;
    public final Object e;
    public final Object f25629f;
    public final Object h;

    public o0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f25626a = i10;
        this.f25627b = callback;
        this.e = obj;
        this.f25629f = obj2;
        this.f25628c = obj3;
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
        switch (this.f25626a) {
            case 0:
                dd0 dd0Var = (dd0) this.f25627b;
                dd0 dd0Var2 = (dd0) this.e;
                dd0 dd0Var3 = (dd0) this.f25629f;
                Calendar calendar = (Calendar) this.f25628c;
                d5.b(dd0Var, dd0Var2, dd0Var3);
                calendar.set(1, dd0Var3.getValue());
                calendar.set(2, dd0Var2.getValue());
                calendar.set(5, dd0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.c3) this.d).f17571a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                dd0 dd0Var4 = (dd0) this.f25627b;
                f4 f4Var = (f4) this.e;
                g4 g4Var = (g4) this.f25629f;
                Calendar calendar2 = (Calendar) this.f25628c;
                org.telegram.ui.fz0 fz0Var = (org.telegram.ui.fz0) this.h;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.d;
                boolean g10 = d5.g(null, null, 0L, 0L, 0, dd0Var4, f4Var, g4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, dd0Var4.getValue());
                calendar2.set(11, f4Var.getValue());
                calendar2.set(12, g4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) fz0Var.f32948c)[0] = true;
                ((org.telegram.ui.a61) fz0Var.f32947b).e(Integer.valueOf(timeInMillis));
                runnable2 = c3Var.f17571a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                dd0 dd0Var5 = (dd0) this.f25627b;
                w3 w3Var = (w3) this.e;
                y3 y3Var = (y3) this.f25629f;
                Calendar calendar3 = (Calendar) this.f25628c;
                c5 c5Var = (c5) this.h;
                org.telegram.ui.ActionBar.c3 c3Var2 = (org.telegram.ui.ActionBar.c3) this.d;
                boolean g11 = d5.g(null, null, 0L, 0L, 0, dd0Var5, w3Var, y3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, dd0Var5.getValue());
                calendar3.set(11, w3Var.getValue());
                calendar3.set(12, y3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                c5Var.I((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = c3Var2.f17571a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                hy0.x((hy0) this.f25627b, (int[]) this.e, (EditTextBoldCursor) this.f25629f, (TextView) this.f25628c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f25627b;
                ArrayList arrayList = (ArrayList) this.f25629f;
                int[] iArr = (int[]) this.f25628c;
                g9 g9Var = (g9) this.h;
                w9 w9Var = (w9) this.d;
                w70 F = w70.F(h3Var.container, h3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                        F.e(intValue, z10, new di.o3(iArr, intValue, g9Var, currentUser, w9Var));
                    }
                    i10 = i11;
                }
                F.f28702t = false;
                F.Y = true;
                F.f28701s = 0;
                F.f28683i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f25628c;
                calendar4.setTimeInMillis((((dd0) this.f25627b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((sg.g) this.e).getValue());
                calendar4.set(12, ((sg.h) this.f25629f).getValue() * 5);
                ((sg.u) this.h).I((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.c3) this.d).f17571a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public o0(Calendar calendar, dd0 dd0Var, sg.g gVar, sg.h hVar, sg.u uVar, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f25626a = 5;
        this.f25628c = calendar;
        this.f25627b = dd0Var;
        this.e = gVar;
        this.f25629f = hVar;
        this.h = uVar;
        this.d = c3Var;
    }
}

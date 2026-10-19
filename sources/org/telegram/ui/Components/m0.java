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
import org.telegram.ui.wh1;
public final class m0 implements View.OnClickListener {
    public final int f28339a;
    public final KeyEvent.Callback f28340b;
    public final Object f28341c;
    public final Object d;
    public final Object e;
    public final Object f28342f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f28339a = i10;
        this.f28340b = callback;
        this.e = obj;
        this.f28342f = obj2;
        this.f28341c = obj3;
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
        switch (this.f28339a) {
            case 0:
                od0 od0Var = (od0) this.f28340b;
                od0 od0Var2 = (od0) this.e;
                od0 od0Var3 = (od0) this.f28342f;
                Calendar calendar = (Calendar) this.f28341c;
                f5.a(od0Var, od0Var2, od0Var3);
                calendar.set(1, od0Var3.getValue());
                calendar.set(2, od0Var2.getValue());
                calendar.set(5, od0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20610a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                od0 od0Var4 = (od0) this.f28340b;
                h4 h4Var = (h4) this.e;
                i4 i4Var = (i4) this.f28342f;
                Calendar calendar2 = (Calendar) this.f28341c;
                org.telegram.ui.en0 en0Var = (org.telegram.ui.en0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                boolean f7 = f5.f(null, null, 0L, 0L, 0, od0Var4, h4Var, i4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, od0Var4.getValue());
                calendar2.set(11, h4Var.getValue());
                calendar2.set(12, i4Var.getValue());
                if (f7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) en0Var.f36686c)[0] = true;
                ((org.telegram.ui.m41) en0Var.f36685b).e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var.f20610a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                od0 od0Var5 = (od0) this.f28340b;
                y3 y3Var = (y3) this.e;
                a4 a4Var = (a4) this.f28342f;
                Calendar calendar3 = (Calendar) this.f28341c;
                e5 e5Var = (e5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean f10 = f5.f(null, null, 0L, 0L, 0, od0Var5, y3Var, a4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, od0Var5.getValue());
                calendar3.set(11, y3Var.getValue());
                calendar3.set(12, a4Var.getValue());
                if (f10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                e5Var.C((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var2.f20610a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                py0.z((py0) this.f28340b, (int[]) this.e, (EditTextBoldCursor) this.f28342f, (TextView) this.f28341c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f28340b;
                ArrayList arrayList = (ArrayList) this.f28342f;
                int[] iArr = (int[]) this.f28341c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                i80 F = i80.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                        F.e(intValue, z10, new wh1(iArr, intValue, h9Var, currentUser, w9Var, 0));
                    }
                    i10 = i11;
                }
                F.f27135t = false;
                F.Y = true;
                F.f27134s = 0;
                F.f27116i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f28341c;
                calendar4.setTimeInMillis((((od0) this.f28340b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((ug.g) this.e).getValue());
                calendar4.set(12, ((ug.h) this.f28342f).getValue() * 5);
                ((ug.t) this.h).C((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.a3) this.d).f20610a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, od0 od0Var, ug.g gVar, ug.h hVar, ug.t tVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28339a = 5;
        this.f28341c = calendar;
        this.f28340b = od0Var;
        this.e = gVar;
        this.f28342f = hVar;
        this.h = tVar;
        this.d = a3Var;
    }
}

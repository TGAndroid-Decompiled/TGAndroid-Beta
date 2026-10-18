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
import org.telegram.ui.yh1;
public final class m0 implements View.OnClickListener {
    public final int f28347a;
    public final KeyEvent.Callback f28348b;
    public final Object f28349c;
    public final Object d;
    public final Object e;
    public final Object f28350f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f28347a = i10;
        this.f28348b = callback;
        this.e = obj;
        this.f28350f = obj2;
        this.f28349c = obj3;
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
        switch (this.f28347a) {
            case 0:
                od0 od0Var = (od0) this.f28348b;
                od0 od0Var2 = (od0) this.e;
                od0 od0Var3 = (od0) this.f28350f;
                Calendar calendar = (Calendar) this.f28349c;
                f5.a(od0Var, od0Var2, od0Var3);
                calendar.set(1, od0Var3.getValue());
                calendar.set(2, od0Var2.getValue());
                calendar.set(5, od0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20609a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                od0 od0Var4 = (od0) this.f28348b;
                h4 h4Var = (h4) this.e;
                i4 i4Var = (i4) this.f28350f;
                Calendar calendar2 = (Calendar) this.f28349c;
                org.telegram.ui.gn0 gn0Var = (org.telegram.ui.gn0) this.h;
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
                ((boolean[]) gn0Var.f37209c)[0] = true;
                ((org.telegram.ui.o41) gn0Var.f37208b).e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var.f20609a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                od0 od0Var5 = (od0) this.f28348b;
                y3 y3Var = (y3) this.e;
                a4 a4Var = (a4) this.f28350f;
                Calendar calendar3 = (Calendar) this.f28349c;
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
                runnable3 = a3Var2.f20609a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                oy0.z((oy0) this.f28348b, (int[]) this.e, (EditTextBoldCursor) this.f28350f, (TextView) this.f28349c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f28348b;
                ArrayList arrayList = (ArrayList) this.f28350f;
                int[] iArr = (int[]) this.f28349c;
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
                        F.e(intValue, z10, new yh1(iArr, intValue, h9Var, currentUser, w9Var, 0));
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
                Calendar calendar4 = (Calendar) this.f28349c;
                calendar4.setTimeInMillis((((od0) this.f28348b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((ug.g) this.e).getValue());
                calendar4.set(12, ((ug.h) this.f28350f).getValue() * 5);
                ((ug.t) this.h).C((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.a3) this.d).f20609a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, od0 od0Var, ug.g gVar, ug.h hVar, ug.t tVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28347a = 5;
        this.f28349c = calendar;
        this.f28348b = od0Var;
        this.e = gVar;
        this.f28350f = hVar;
        this.h = tVar;
        this.d = a3Var;
    }
}

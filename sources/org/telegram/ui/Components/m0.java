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
    public final int f28636a;
    public final KeyEvent.Callback f28637b;
    public final Object f28638c;
    public final Object d;
    public final Object f28639e;
    public final Object f28640f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f28636a = i10;
        this.f28637b = callback;
        this.f28639e = obj;
        this.f28640f = obj2;
        this.f28638c = obj3;
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
        switch (this.f28636a) {
            case 0:
                ud0 ud0Var = (ud0) this.f28637b;
                ud0 ud0Var2 = (ud0) this.f28639e;
                ud0 ud0Var3 = (ud0) this.f28640f;
                Calendar calendar = (Calendar) this.f28638c;
                g5.a(ud0Var, ud0Var2, ud0Var3);
                calendar.set(1, ud0Var3.getValue());
                calendar.set(2, ud0Var2.getValue());
                calendar.set(5, ud0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.z2) this.d).f21746a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                ud0 ud0Var4 = (ud0) this.f28637b;
                i4 i4Var = (i4) this.f28639e;
                j4 j4Var = (j4) this.f28640f;
                Calendar calendar2 = (Calendar) this.f28638c;
                org.telegram.ui.js0 js0Var = (org.telegram.ui.js0) this.h;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                boolean f7 = g5.f(null, null, 0L, 0L, 0, ud0Var4, i4Var, j4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, ud0Var4.getValue());
                calendar2.set(11, i4Var.getValue());
                calendar2.set(12, j4Var.getValue());
                if (f7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) js0Var.f39153c)[0] = true;
                ((org.telegram.ui.y51) js0Var.f39152b).e(Integer.valueOf(timeInMillis));
                runnable2 = z2Var.f21746a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                ud0 ud0Var5 = (ud0) this.f28637b;
                z3 z3Var = (z3) this.f28639e;
                b4 b4Var = (b4) this.f28640f;
                Calendar calendar3 = (Calendar) this.f28638c;
                f5 f5Var = (f5) this.h;
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) this.d;
                boolean f10 = g5.f(null, null, 0L, 0L, 0, ud0Var5, z3Var, b4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, ud0Var5.getValue());
                calendar3.set(11, z3Var.getValue());
                calendar3.set(12, b4Var.getValue());
                if (f10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                f5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = z2Var2.f21746a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                yy0.z((yy0) this.f28637b, (int[]) this.f28639e, (EditTextBoldCursor) this.f28640f, (TextView) this.f28638c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f28637b;
                ArrayList arrayList = (ArrayList) this.f28640f;
                int[] iArr = (int[]) this.f28638c;
                j9 j9Var = (j9) this.h;
                y9 y9Var = (y9) this.d;
                p80 F = p80.F(e3Var.container, e3Var.getResourcesProvider(), (FrameLayout) this.f28639e);
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
                F.f29780t = false;
                F.Y = true;
                F.f29779s = 0;
                F.f29761i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f28638c;
                calendar4.setTimeInMillis((((ud0) this.f28637b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((tg.g) this.f28639e).getValue());
                calendar4.set(12, ((tg.h) this.f28640f).getValue() * 5);
                ((tg.t) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.z2) this.d).f21746a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, ud0 ud0Var, tg.g gVar, tg.h hVar, tg.t tVar, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f28636a = 5;
        this.f28638c = calendar;
        this.f28637b = ud0Var;
        this.f28639e = gVar;
        this.f28640f = hVar;
        this.h = tVar;
        this.d = z2Var;
    }
}

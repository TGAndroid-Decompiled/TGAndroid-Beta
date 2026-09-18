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
    public final int f26000a;
    public final KeyEvent.Callback f26001b;
    public final Object f26002c;
    public final Object d;
    public final Object e;
    public final Object f26003f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f26000a = i10;
        this.f26001b = callback;
        this.e = obj;
        this.f26003f = obj2;
        this.f26002c = obj3;
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
        switch (this.f26000a) {
            case 0:
                uc0 uc0Var = (uc0) this.f26001b;
                uc0 uc0Var2 = (uc0) this.e;
                uc0 uc0Var3 = (uc0) this.f26003f;
                Calendar calendar = (Calendar) this.f26002c;
                c5.b(uc0Var, uc0Var2, uc0Var3);
                calendar.set(1, uc0Var3.getValue());
                calendar.set(2, uc0Var2.getValue());
                calendar.set(5, uc0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f18471a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                uc0 uc0Var4 = (uc0) this.f26001b;
                e4 e4Var = (e4) this.e;
                f4 f4Var = (f4) this.f26003f;
                Calendar calendar2 = (Calendar) this.f26002c;
                org.telegram.ui.tv0 tv0Var = (org.telegram.ui.tv0) this.h;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g10 = c5.g(null, null, 0L, 0L, 0, uc0Var4, e4Var, f4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, uc0Var4.getValue());
                calendar2.set(11, e4Var.getValue());
                calendar2.set(12, f4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) tv0Var.f37879c)[0] = true;
                ((org.telegram.ui.x51) tv0Var.f37878b).e(Integer.valueOf(timeInMillis));
                runnable2 = b3Var.f18471a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                uc0 uc0Var5 = (uc0) this.f26001b;
                v3 v3Var = (v3) this.e;
                x3 x3Var = (x3) this.f26003f;
                Calendar calendar3 = (Calendar) this.f26002c;
                b5 b5Var = (b5) this.h;
                org.telegram.ui.ActionBar.b3 b3Var2 = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g11 = c5.g(null, null, 0L, 0L, 0, uc0Var5, v3Var, x3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, uc0Var5.getValue());
                calendar3.set(11, v3Var.getValue());
                calendar3.set(12, x3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                b5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = b3Var2.f18471a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                wx0.x((wx0) this.f26001b, (int[]) this.e, (EditTextBoldCursor) this.f26003f, (TextView) this.f26002c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f26001b;
                ArrayList arrayList = (ArrayList) this.f26003f;
                int[] iArr = (int[]) this.f26002c;
                f9 f9Var = (f9) this.h;
                u9 u9Var = (u9) this.d;
                n70 F = n70.F(g3Var.container, g3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                        F.e(intValue, z10, new ei.l3(iArr, intValue, f9Var, currentUser, u9Var));
                    }
                    i10 = i11;
                }
                F.f26388t = false;
                F.Y = true;
                F.f26387s = 0;
                F.f26369i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f26002c;
                calendar4.setTimeInMillis((((uc0) this.f26001b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((tg.i) this.e).getValue());
                calendar4.set(12, ((tg.j) this.f26003f).getValue() * 5);
                ((tg.v) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.b3) this.d).f18471a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, uc0 uc0Var, tg.i iVar, tg.j jVar, tg.v vVar, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f26000a = 5;
        this.f26002c = calendar;
        this.f26001b = uc0Var;
        this.e = iVar;
        this.f26003f = jVar;
        this.h = vVar;
        this.d = b3Var;
    }
}

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
    public final int f26266a;
    public final KeyEvent.Callback f26267b;
    public final Object f26268c;
    public final Object d;
    public final Object e;
    public final Object f26269f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f26266a = i10;
        this.f26267b = callback;
        this.e = obj;
        this.f26269f = obj2;
        this.f26268c = obj3;
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
        switch (this.f26266a) {
            case 0:
                fd0 fd0Var = (fd0) this.f26267b;
                fd0 fd0Var2 = (fd0) this.e;
                fd0 fd0Var3 = (fd0) this.f26269f;
                Calendar calendar = (Calendar) this.f26268c;
                d5.b(fd0Var, fd0Var2, fd0Var3);
                calendar.set(1, fd0Var3.getValue());
                calendar.set(2, fd0Var2.getValue());
                calendar.set(5, fd0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f18674a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                fd0 fd0Var4 = (fd0) this.f26267b;
                f4 f4Var = (f4) this.e;
                g4 g4Var = (g4) this.f26269f;
                Calendar calendar2 = (Calendar) this.f26268c;
                org.telegram.ui.rv0 rv0Var = (org.telegram.ui.rv0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g10 = d5.g(null, null, 0L, 0L, 0, fd0Var4, f4Var, g4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, fd0Var4.getValue());
                calendar2.set(11, f4Var.getValue());
                calendar2.set(12, g4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) rv0Var.f37258c)[0] = true;
                ((org.telegram.ui.y51) rv0Var.f37257b).e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var.f18674a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                fd0 fd0Var5 = (fd0) this.f26267b;
                w3 w3Var = (w3) this.e;
                y3 y3Var = (y3) this.f26269f;
                Calendar calendar3 = (Calendar) this.f26268c;
                c5 c5Var = (c5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g11 = d5.g(null, null, 0L, 0L, 0, fd0Var5, w3Var, y3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, fd0Var5.getValue());
                calendar3.set(11, w3Var.getValue());
                calendar3.set(12, y3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                c5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var2.f18674a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                iy0.x((iy0) this.f26267b, (int[]) this.e, (EditTextBoldCursor) this.f26269f, (TextView) this.f26268c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f26267b;
                ArrayList arrayList = (ArrayList) this.f26269f;
                int[] iArr = (int[]) this.f26268c;
                g9 g9Var = (g9) this.h;
                v9 v9Var = (v9) this.d;
                y70 F = y70.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                        F.e(intValue, z10, new ei.l3(iArr, intValue, g9Var, currentUser, v9Var));
                    }
                    i10 = i11;
                }
                F.f30569t = false;
                F.Y = true;
                F.f30568s = 0;
                F.f30550i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f26268c;
                calendar4.setTimeInMillis((((fd0) this.f26267b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((tg.g) this.e).getValue());
                calendar4.set(12, ((tg.h) this.f26269f).getValue() * 5);
                ((tg.u) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.a3) this.d).f18674a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, fd0 fd0Var, tg.g gVar, tg.h hVar, tg.u uVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f26266a = 5;
        this.f26268c = calendar;
        this.f26267b = fd0Var;
        this.e = gVar;
        this.f26269f = hVar;
        this.h = uVar;
        this.d = a3Var;
    }
}

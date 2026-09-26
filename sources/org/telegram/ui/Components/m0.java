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
    public final int f26222a;
    public final KeyEvent.Callback f26223b;
    public final Object f26224c;
    public final Object d;
    public final Object e;
    public final Object f26225f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f26222a = i10;
        this.f26223b = callback;
        this.e = obj;
        this.f26225f = obj2;
        this.f26224c = obj3;
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
        switch (this.f26222a) {
            case 0:
                fd0 fd0Var = (fd0) this.f26223b;
                fd0 fd0Var2 = (fd0) this.e;
                fd0 fd0Var3 = (fd0) this.f26225f;
                Calendar calendar = (Calendar) this.f26224c;
                e5.b(fd0Var, fd0Var2, fd0Var3);
                calendar.set(1, fd0Var3.getValue());
                calendar.set(2, fd0Var2.getValue());
                calendar.set(5, fd0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.z2) this.d).f19949a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                fd0 fd0Var4 = (fd0) this.f26223b;
                g4 g4Var = (g4) this.e;
                h4 h4Var = (h4) this.f26225f;
                Calendar calendar2 = (Calendar) this.f26224c;
                org.telegram.ui.ds0 ds0Var = (org.telegram.ui.ds0) this.h;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
                boolean g10 = e5.g(null, null, 0L, 0L, 0, fd0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, fd0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) ds0Var.f33189c)[0] = true;
                ((org.telegram.ui.p51) ds0Var.f33188b).e(Integer.valueOf(timeInMillis));
                runnable2 = z2Var.f19949a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                fd0 fd0Var5 = (fd0) this.f26223b;
                x3 x3Var = (x3) this.e;
                z3 z3Var = (z3) this.f26225f;
                Calendar calendar3 = (Calendar) this.f26224c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) this.d;
                boolean g11 = e5.g(null, null, 0L, 0L, 0, fd0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, fd0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = z2Var2.f19949a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                gy0.x((gy0) this.f26223b, (int[]) this.e, (EditTextBoldCursor) this.f26225f, (TextView) this.f26224c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f26223b;
                ArrayList arrayList = (ArrayList) this.f26225f;
                int[] iArr = (int[]) this.f26224c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                z70 F = z70.F(e3Var.container, e3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                F.f30840t = false;
                F.Y = true;
                F.f30839s = 0;
                F.f30821i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f26224c;
                calendar4.setTimeInMillis((((fd0) this.f26223b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((tg.g) this.e).getValue());
                calendar4.set(12, ((tg.h) this.f26225f).getValue() * 5);
                ((tg.u) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.z2) this.d).f19949a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, fd0 fd0Var, tg.g gVar, tg.h hVar, tg.u uVar, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f26222a = 5;
        this.f26224c = calendar;
        this.f26223b = fd0Var;
        this.e = gVar;
        this.f26225f = hVar;
        this.h = uVar;
        this.d = z2Var;
    }
}

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
public final class n0 implements View.OnClickListener {
    public final int f28578a;
    public final KeyEvent.Callback f28579b;
    public final Object f28580c;
    public final Object d;
    public final Object f28581e;
    public final Object f28582f;
    public final Object h;

    public n0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f28578a = i10;
        this.f28579b = callback;
        this.f28581e = obj;
        this.f28582f = obj2;
        this.f28580c = obj3;
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
        switch (this.f28578a) {
            case 0:
                vc0 vc0Var = (vc0) this.f28579b;
                vc0 vc0Var2 = (vc0) this.f28581e;
                vc0 vc0Var3 = (vc0) this.f28582f;
                Calendar calendar = (Calendar) this.f28580c;
                e5.b(vc0Var, vc0Var2, vc0Var3);
                calendar.set(1, vc0Var3.getValue());
                calendar.set(2, vc0Var2.getValue());
                calendar.set(5, vc0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20204a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                vc0 vc0Var4 = (vc0) this.f28579b;
                g4 g4Var = (g4) this.f28581e;
                h4 h4Var = (h4) this.f28582f;
                Calendar calendar2 = (Calendar) this.f28580c;
                org.telegram.ui.qv0 qv0Var = (org.telegram.ui.qv0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g10 = e5.g(null, null, 0L, 0L, 0, vc0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, vc0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) qv0Var.f39986c)[0] = true;
                ((org.telegram.ui.y51) qv0Var.f39985b).e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var.f20204a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                vc0 vc0Var5 = (vc0) this.f28579b;
                x3 x3Var = (x3) this.f28581e;
                z3 z3Var = (z3) this.f28582f;
                Calendar calendar3 = (Calendar) this.f28580c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g11 = e5.g(null, null, 0L, 0L, 0, vc0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, vc0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = a3Var2.f20204a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                ux0.x((ux0) this.f28579b, (int[]) this.f28581e, (EditTextBoldCursor) this.f28582f, (TextView) this.f28580c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f28579b;
                ArrayList arrayList = (ArrayList) this.f28582f;
                int[] iArr = (int[]) this.f28580c;
                i9 i9Var = (i9) this.h;
                x9 x9Var = (x9) this.d;
                n70 F = n70.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.f28581e);
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
                        F.e(intValue, z10, new fi.l3(iArr, intValue, i9Var, currentUser, x9Var));
                    }
                    i10 = i11;
                }
                F.f28661t = false;
                F.Y = true;
                F.f28660s = 0;
                F.f28642i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f28580c;
                calendar4.setTimeInMillis((((vc0) this.f28579b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((ug.h) this.f28581e).getValue());
                calendar4.set(12, ((ug.i) this.f28582f).getValue() * 5);
                ((ug.v) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.a3) this.d).f20204a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public n0(Calendar calendar, vc0 vc0Var, ug.h hVar, ug.i iVar, ug.v vVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28578a = 5;
        this.f28580c = calendar;
        this.f28579b = vc0Var;
        this.f28581e = hVar;
        this.f28582f = iVar;
        this.h = vVar;
        this.d = a3Var;
    }
}

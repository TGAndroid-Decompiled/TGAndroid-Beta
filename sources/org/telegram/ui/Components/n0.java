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
    public final int f28605a;
    public final KeyEvent.Callback f28606b;
    public final Object f28607c;
    public final Object d;
    public final Object f28608e;
    public final Object f28609f;
    public final Object h;

    public n0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f28605a = i10;
        this.f28606b = callback;
        this.f28608e = obj;
        this.f28609f = obj2;
        this.f28607c = obj3;
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
        switch (this.f28605a) {
            case 0:
                vc0 vc0Var = (vc0) this.f28606b;
                vc0 vc0Var2 = (vc0) this.f28608e;
                vc0 vc0Var3 = (vc0) this.f28609f;
                Calendar calendar = (Calendar) this.f28607c;
                e5.b(vc0Var, vc0Var2, vc0Var3);
                calendar.set(1, vc0Var3.getValue());
                calendar.set(2, vc0Var2.getValue());
                calendar.set(5, vc0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f20231a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                vc0 vc0Var4 = (vc0) this.f28606b;
                g4 g4Var = (g4) this.f28608e;
                h4 h4Var = (h4) this.f28609f;
                Calendar calendar2 = (Calendar) this.f28607c;
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
                ((boolean[]) qv0Var.f40013c)[0] = true;
                ((org.telegram.ui.y51) qv0Var.f40012b).e(Integer.valueOf(timeInMillis));
                runnable2 = a3Var.f20231a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                vc0 vc0Var5 = (vc0) this.f28606b;
                x3 x3Var = (x3) this.f28608e;
                z3 z3Var = (z3) this.f28609f;
                Calendar calendar3 = (Calendar) this.f28607c;
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
                runnable3 = a3Var2.f20231a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                ux0.x((ux0) this.f28606b, (int[]) this.f28608e, (EditTextBoldCursor) this.f28609f, (TextView) this.f28607c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f28606b;
                ArrayList arrayList = (ArrayList) this.f28609f;
                int[] iArr = (int[]) this.f28607c;
                i9 i9Var = (i9) this.h;
                x9 x9Var = (x9) this.d;
                n70 F = n70.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.f28608e);
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
                F.f28688t = false;
                F.Y = true;
                F.f28687s = 0;
                F.f28669i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f28607c;
                calendar4.setTimeInMillis((((vc0) this.f28606b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((ug.h) this.f28608e).getValue());
                calendar4.set(12, ((ug.i) this.f28609f).getValue() * 5);
                ((ug.v) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.a3) this.d).f20231a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public n0(Calendar calendar, vc0 vc0Var, ug.h hVar, ug.i iVar, ug.v vVar, org.telegram.ui.ActionBar.a3 a3Var) {
        this.f28605a = 5;
        this.f28607c = calendar;
        this.f28606b = vc0Var;
        this.f28608e = hVar;
        this.f28609f = iVar;
        this.h = vVar;
        this.d = a3Var;
    }
}

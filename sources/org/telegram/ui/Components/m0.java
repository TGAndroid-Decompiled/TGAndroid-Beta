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
    public final int f27145a;
    public final KeyEvent.Callback f27146b;
    public final Object f27147c;
    public final Object d;
    public final Object e;
    public final Object f27148f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f27145a = i10;
        this.f27146b = callback;
        this.e = obj;
        this.f27148f = obj2;
        this.f27147c = obj3;
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
        switch (this.f27145a) {
            case 0:
                ud0 ud0Var = (ud0) this.f27146b;
                ud0 ud0Var2 = (ud0) this.e;
                ud0 ud0Var3 = (ud0) this.f27148f;
                Calendar calendar = (Calendar) this.f27147c;
                g5.a(ud0Var, ud0Var2, ud0Var3);
                calendar.set(1, ud0Var3.getValue());
                calendar.set(2, ud0Var2.getValue());
                calendar.set(5, ud0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.z2) this.d).f20838a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                ud0 ud0Var4 = (ud0) this.f27146b;
                i4 i4Var = (i4) this.e;
                j4 j4Var = (j4) this.f27148f;
                Calendar calendar2 = (Calendar) this.f27147c;
                org.telegram.ui.cs0 cs0Var = (org.telegram.ui.cs0) this.h;
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
                ((boolean[]) cs0Var.f35069c)[0] = true;
                ((org.telegram.ui.g61) cs0Var.f35068b).e(Integer.valueOf(timeInMillis));
                runnable2 = z2Var.f20838a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                ud0 ud0Var5 = (ud0) this.f27146b;
                z3 z3Var = (z3) this.e;
                b4 b4Var = (b4) this.f27148f;
                Calendar calendar3 = (Calendar) this.f27147c;
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
                runnable3 = z2Var2.f20838a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                ty0.z((ty0) this.f27146b, (int[]) this.e, (EditTextBoldCursor) this.f27148f, (TextView) this.f27147c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f27146b;
                ArrayList arrayList = (ArrayList) this.f27148f;
                int[] iArr = (int[]) this.f27147c;
                k9 k9Var = (k9) this.h;
                z9 z9Var = (z9) this.d;
                m80 F = m80.F(e3Var.container, e3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                        F.e(intValue, z10, new fi.l3(iArr, intValue, k9Var, currentUser, z9Var));
                    }
                    i10 = i11;
                }
                F.f27299t = false;
                F.Y = true;
                F.f27298s = 0;
                F.f27280i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f27147c;
                calendar4.setTimeInMillis((((ud0) this.f27146b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((ug.h) this.e).getValue());
                calendar4.set(12, ((ug.i) this.f27148f).getValue() * 5);
                ((ug.u) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.z2) this.d).f20838a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, ud0 ud0Var, ug.h hVar, ug.i iVar, ug.u uVar, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f27145a = 5;
        this.f27147c = calendar;
        this.f27146b = ud0Var;
        this.e = hVar;
        this.f27148f = iVar;
        this.h = uVar;
        this.d = z2Var;
    }
}

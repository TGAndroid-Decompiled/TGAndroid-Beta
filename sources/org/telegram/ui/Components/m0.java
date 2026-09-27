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
    public final int f26237a;
    public final KeyEvent.Callback f26238b;
    public final Object f26239c;
    public final Object d;
    public final Object e;
    public final Object f26240f;
    public final Object h;

    public m0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f26237a = i10;
        this.f26238b = callback;
        this.e = obj;
        this.f26240f = obj2;
        this.f26239c = obj3;
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
        switch (this.f26237a) {
            case 0:
                ed0 ed0Var = (ed0) this.f26238b;
                ed0 ed0Var2 = (ed0) this.e;
                ed0 ed0Var3 = (ed0) this.f26240f;
                Calendar calendar = (Calendar) this.f26239c;
                e5.b(ed0Var, ed0Var2, ed0Var3);
                calendar.set(1, ed0Var3.getValue());
                calendar.set(2, ed0Var2.getValue());
                calendar.set(5, ed0Var.getValue());
                calendar.set(12, 0);
                calendar.set(11, 0);
                calendar.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar.getTimeInMillis() / 1000));
                runnable = ((org.telegram.ui.ActionBar.b3) this.d).f18683a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                ed0 ed0Var4 = (ed0) this.f26238b;
                g4 g4Var = (g4) this.e;
                h4 h4Var = (h4) this.f26240f;
                Calendar calendar2 = (Calendar) this.f26239c;
                org.telegram.ui.gs0 gs0Var = (org.telegram.ui.gs0) this.h;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g10 = e5.g(null, null, 0L, 0L, 0, ed0Var4, g4Var, h4Var);
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.add(6, ed0Var4.getValue());
                calendar2.set(11, g4Var.getValue());
                calendar2.set(12, h4Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                int timeInMillis = (int) (calendar2.getTimeInMillis() / 1000);
                ((boolean[]) gs0Var.f34037c)[0] = true;
                ((org.telegram.ui.r51) gs0Var.f34036b).e(Integer.valueOf(timeInMillis));
                runnable2 = b3Var.f18683a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                ed0 ed0Var5 = (ed0) this.f26238b;
                x3 x3Var = (x3) this.e;
                z3 z3Var = (z3) this.f26240f;
                Calendar calendar3 = (Calendar) this.f26239c;
                d5 d5Var = (d5) this.h;
                org.telegram.ui.ActionBar.b3 b3Var2 = (org.telegram.ui.ActionBar.b3) this.d;
                boolean g11 = e5.g(null, null, 0L, 0L, 0, ed0Var5, x3Var, z3Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, ed0Var5.getValue());
                calendar3.set(11, x3Var.getValue());
                calendar3.set(12, z3Var.getValue());
                if (g11) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                d5Var.J((int) (calendar3.getTimeInMillis() / 1000), 0, true);
                runnable3 = b3Var2.f18683a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                hy0.x((hy0) this.f26238b, (int[]) this.e, (EditTextBoldCursor) this.f26240f, (TextView) this.f26239c, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            case 4:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f26238b;
                ArrayList arrayList = (ArrayList) this.f26240f;
                int[] iArr = (int[]) this.f26239c;
                h9 h9Var = (h9) this.h;
                w9 w9Var = (w9) this.d;
                a80 F = a80.F(g3Var.container, g3Var.getResourcesProvider(), (FrameLayout) this.e);
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
                F.f22607t = false;
                F.Y = true;
                F.f22606s = 0;
                F.f22588i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
            default:
                Calendar calendar4 = (Calendar) this.f26239c;
                calendar4.setTimeInMillis((((ed0) this.f26238b).getValue() * 86400000) + System.currentTimeMillis());
                calendar4.set(11, ((tg.g) this.e).getValue());
                calendar4.set(12, ((tg.h) this.f26240f).getValue() * 5);
                ((tg.u) this.h).J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = ((org.telegram.ui.ActionBar.b3) this.d).f18683a.dismissRunnable;
                runnable4.run();
                return;
        }
    }

    public m0(Calendar calendar, ed0 ed0Var, tg.g gVar, tg.h hVar, tg.u uVar, org.telegram.ui.ActionBar.b3 b3Var) {
        this.f26237a = 5;
        this.f26239c = calendar;
        this.f26238b = ed0Var;
        this.e = gVar;
        this.f26240f = hVar;
        this.h = uVar;
        this.d = b3Var;
    }
}

package org.telegram.ui.Components;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
public final class z1 implements DialogInterface.OnDismissListener {
    public final int f32865a;
    public final Object f32866b;
    public final Object f32867c;
    public final Object d;

    public z1(Object obj, Object obj2, Object obj3, int i10) {
        this.f32865a = i10;
        this.f32866b = obj;
        this.f32867c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32865a) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f32867c;
                Activity activity = (Activity) this.d;
                org.telegram.messenger.i0.v1((r4) this.f32866b);
                if (k2Var != null) {
                    org.telegram.messenger.i0.Z2(activity, k2Var.getClassGuid());
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.q20) this.f32866b).a(Integer.valueOf(((o3) this.d).getValue() + (((m3) this.f32867c).getValue() * 60)));
                return;
            case 2:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f32866b;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                z0Var.getClass();
                if (!((AtomicBoolean) this.f32867c).get()) {
                    z0Var.y(x0Var, "popup_closed", new JSONObject());
                }
                z0Var.f43262c0 = null;
                z0Var.f43264e0 = System.currentTimeMillis();
                return;
            case 3:
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.f32867c;
                Activity activity2 = (Activity) this.d;
                org.telegram.messenger.i0.v1((ih.b) this.f32866b);
                if (k2Var2 != null) {
                    org.telegram.messenger.i0.Z2(activity2, k2Var2.getClassGuid());
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.i0.v1((ph.t1) this.f32867c);
                org.telegram.messenger.i0.Z2((Activity) this.d, ((ph.j2) this.f32866b).f45128a.getClassGuid());
                return;
            case 5:
                xh.o0 o0Var = (xh.o0) this.f32866b;
                boolean[] zArr = (boolean[]) this.f32867c;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
                o0Var.getClass();
                if (!zArr[0]) {
                    o0Var.d = true;
                    o0Var.e = false;
                    o0Var.k();
                    Iterator it = o0Var.f53934f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zArr[0] = true;
                    oVar.a(Boolean.TRUE, Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr2 = (boolean[]) this.f32867c;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.d;
                if (!((boolean[]) this.f32866b)[0] && !zArr2[0]) {
                    zArr2[0] = true;
                    q20Var.a("USER_DECLINED");
                    return;
                }
                return;
        }
    }
}

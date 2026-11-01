package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class zs implements ws, vs {
    public final int f19758a;
    public final Object f19759b;
    public final Object f19760c;

    public zs(vs vsVar, Object obj, int i10) {
        this.f19758a = i10;
        this.f19760c = vsVar;
        this.f19759b = obj;
    }

    @Override
    public void a() {
        ((xa.n) this.f19759b).a();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        switch (this.f19758a) {
            case 0:
                vs vsVar = (vs) ((WeakReference) this.f19760c).get();
                if (vsVar != null) {
                    vsVar.didReceivedNotification(i10, i11, objArr);
                    return;
                }
                f8.d("MEMORY_LEAK observer " + i10 + " with destroyed WeakReference");
                a();
                return;
            case 1:
                if (i10 == 274) {
                    ((org.telegram.ui.ActionBar.x1) this.f19759b).dismiss();
                    at.e().n(this, i10);
                    i0.h3(new org.telegram.ui.yy(this, 13), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f19760c;
                if (i10 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        at.e().n(this, 306);
                        if (iArr[0] == 0) {
                            Activity activity = z0Var.W;
                            if (activity != null) {
                                z0Var.f43069g0 = org.telegram.ui.u9.j0(activity, 3, new l2.f(z0Var, 21));
                                return;
                            }
                            return;
                        }
                        z0Var.y((org.telegram.ui.web.x0) this.f19759b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zs(at atVar, vs vsVar) {
        this.f19758a = 0;
        this.f19759b = new xa.n(atVar, this);
        this.f19760c = new WeakReference(vsVar);
    }
}

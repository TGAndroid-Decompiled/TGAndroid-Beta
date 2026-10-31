package org.telegram.messenger;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
public final class ys implements vs, us {
    public final int f19430a;
    public final Object f19431b;
    public final Object f19432c;

    public ys(us usVar, Object obj, int i10) {
        this.f19430a = i10;
        this.f19432c = usVar;
        this.f19431b = obj;
    }

    @Override
    public void a() {
        ((xa.n) this.f19431b).a();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        switch (this.f19430a) {
            case 0:
                us usVar = (us) ((WeakReference) this.f19432c).get();
                if (usVar != null) {
                    usVar.didReceivedNotification(i10, i11, objArr);
                    return;
                }
                f8.d("MEMORY_LEAK observer " + i10 + " with destroyed WeakReference");
                a();
                return;
            case 1:
                if (i10 == 274) {
                    ((org.telegram.ui.ActionBar.x1) this.f19431b).dismiss();
                    zs.e().n(this, i10);
                    i0.h3(new org.telegram.ui.zy(this, 13), 100L);
                    return;
                }
                return;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f19432c;
                if (i10 == 306) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        zs.e().n(this, 306);
                        if (iArr[0] == 0) {
                            Activity activity = z0Var.W;
                            if (activity != null) {
                                z0Var.f43267g0 = org.telegram.ui.u9.i0(activity, 3, new l2.f(z0Var, 21));
                                return;
                            }
                            return;
                        }
                        z0Var.y((org.telegram.ui.web.x0) this.f19431b, "scan_qr_popup_closed", new JSONObject());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ys(zs zsVar, us usVar) {
        this.f19430a = 0;
        this.f19431b = new xa.n(zsVar, this);
        this.f19432c = new WeakReference(usVar);
    }
}

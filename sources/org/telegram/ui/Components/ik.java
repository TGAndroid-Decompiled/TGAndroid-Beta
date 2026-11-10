package org.telegram.ui.Components;

import android.location.Location;
import android.view.View;
public final class ik implements Runnable {
    public final int f34690a;
    public final vk f34691b;

    public ik(vk vkVar, int i7) {
        this.f34690a = i7;
        this.f34691b = vkVar;
    }

    @Override
    public final void run() {
        Location location;
        switch (this.f34690a) {
            case 0:
                vk.S(this.f34691b);
                return;
            case 1:
                vk.U(this.f34691b);
                return;
            case 2:
                vk vkVar = this.f34691b;
                double[] dArr = vkVar.f38656b.f32670x4;
                vkVar.h0(dArr[0], dArr[1]);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ik(this.f34691b, 6));
                return;
            case 4:
                vk vkVar2 = this.f34691b;
                jg.r0 r0Var = vkVar2.K;
                if (vkVar2.f39026k0) {
                    vkVar2.f39026k0 = false;
                    return;
                }
                org.telegram.messenger.fa faVar = vkVar2.D;
                if (faVar != null && (location = vkVar2.f39024i0) != null) {
                    location.setLatitude(((org.telegram.messenger.cb) faVar.d().f13162b).f21837a);
                    vkVar2.f39024i0.setLongitude(((org.telegram.messenger.cb) vkVar2.D.d().f13162b).f21838b);
                }
                r0Var.L(vkVar2.f39024i0);
                r0Var.H();
                return;
            case 5:
                View view = this.f34691b.I;
                if (view.getTag() == null) {
                    view.animate().alpha(0.0f).setDuration(180L).start();
                    return;
                }
                return;
            case 6:
                View view2 = this.f34691b.I;
                view2.setTag(1);
                view2.animate().alpha(0.0f).setDuration(180L).start();
                return;
            default:
                this.f34691b.h0(0.0d, 0.0d);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.location.Location;
public final class ok implements q0.a {
    public final int f36625a;
    public final vk f36626b;

    public ok(vk vkVar, int i7) {
        this.f36625a = i7;
        this.f36626b = vkVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36625a) {
            case 0:
                vk.Z(this.f36626b, (org.telegram.messenger.fa) obj);
                return;
            default:
                vk.W(this.f36626b, (Location) obj);
                return;
        }
    }
}

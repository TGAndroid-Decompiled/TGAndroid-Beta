package org.telegram.ui.Components;
public final class mk implements Runnable {
    public final int f35985a;
    public final vk f35986b;
    public final org.telegram.messenger.za f35987c;

    public mk(vk vkVar, org.telegram.messenger.za zaVar, int i7) {
        this.f35985a = i7;
        this.f35986b = vkVar;
        this.f35987c = zaVar;
    }

    @Override
    public final void run() {
        switch (this.f35985a) {
            case 0:
                org.telegram.messenger.za zaVar = this.f35987c;
                try {
                    ((a8.r7) zaVar).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new mk(this.f35986b, zaVar, 1));
                return;
            default:
                vk.R(this.f35986b, this.f35987c);
                return;
        }
    }
}

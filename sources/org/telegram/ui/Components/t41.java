package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class t41 implements Runnable {
    public final int f32844a;
    public final Utilities.Callback2 f32845b;
    public final String f32846c;

    public t41(String str, int i10, Utilities.Callback2 callback2) {
        this.f32844a = i10;
        this.f32845b = callback2;
        this.f32846c = str;
    }

    @Override
    public final void run() {
        switch (this.f32844a) {
            case 0:
                Utilities.Callback2 callback2 = this.f32845b;
                if (callback2 != null) {
                    callback2.run(this.f32846c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f32845b.run(null, this.f32846c);
                return;
            default:
                this.f32845b.run(null, this.f32846c);
                return;
        }
    }
}

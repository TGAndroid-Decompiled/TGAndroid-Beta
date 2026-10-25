package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class s41 implements Runnable {
    public final int f32430a;
    public final Utilities.Callback2 f32431b;
    public final String f32432c;

    public s41(String str, int i10, Utilities.Callback2 callback2) {
        this.f32430a = i10;
        this.f32431b = callback2;
        this.f32432c = str;
    }

    @Override
    public final void run() {
        switch (this.f32430a) {
            case 0:
                Utilities.Callback2 callback2 = this.f32431b;
                if (callback2 != null) {
                    callback2.run(this.f32432c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f32431b.run(null, this.f32432c);
                return;
            default:
                this.f32431b.run(null, this.f32432c);
                return;
        }
    }
}

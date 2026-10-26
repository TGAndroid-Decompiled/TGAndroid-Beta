package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class s41 implements Runnable {
    public final int f32432a;
    public final Utilities.Callback2 f32433b;
    public final String f32434c;

    public s41(String str, int i10, Utilities.Callback2 callback2) {
        this.f32432a = i10;
        this.f32433b = callback2;
        this.f32434c = str;
    }

    @Override
    public final void run() {
        switch (this.f32432a) {
            case 0:
                Utilities.Callback2 callback2 = this.f32433b;
                if (callback2 != null) {
                    callback2.run(this.f32434c, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                this.f32433b.run(null, this.f32434c);
                return;
            default:
                this.f32433b.run(null, this.f32434c);
                return;
        }
    }
}

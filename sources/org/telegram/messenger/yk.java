package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f19971a;
    public final TranslateController f19972b;
    public final Utilities.Callback4 f19973c;
    public final boolean d;
    public final int f19974e;
    public final String f19975f;
    public final long f19976g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19971a = i11;
        this.f19972b = translateController;
        this.f19973c = callback4;
        this.d = z10;
        this.f19974e = i10;
        this.f19975f = str;
        this.f19976g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19971a) {
            case 0:
                this.f19972b.lambda$pushToTranslate$21(this.f19973c, this.d, this.f19974e, this.f19975f, this.f19976g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19972b.lambda$pushToTranslate$20(this.f19973c, this.d, this.f19974e, this.f19975f, this.f19976g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

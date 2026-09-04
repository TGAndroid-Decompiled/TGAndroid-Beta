package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f19755a;
    public final TranslateController f19756b;
    public final Utilities.Callback4 f19757c;
    public final boolean d;
    public final int f19758e;
    public final String f19759f;
    public final long f19760g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19755a = i11;
        this.f19756b = translateController;
        this.f19757c = callback4;
        this.d = z10;
        this.f19758e = i10;
        this.f19759f = str;
        this.f19760g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19755a) {
            case 0:
                this.f19756b.lambda$pushToTranslate$21(this.f19757c, this.d, this.f19758e, this.f19759f, this.f19760g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19756b.lambda$pushToTranslate$20(this.f19757c, this.d, this.f19758e, this.f19759f, this.f19760g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

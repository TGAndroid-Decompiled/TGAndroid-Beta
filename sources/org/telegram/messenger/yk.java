package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f18194a;
    public final TranslateController f18195b;
    public final Utilities.Callback4 f18196c;
    public final boolean d;
    public final int e;
    public final String f18197f;
    public final long f18198g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18194a = i11;
        this.f18195b = translateController;
        this.f18196c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18197f = str;
        this.f18198g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18194a) {
            case 0:
                this.f18195b.lambda$pushToTranslate$21(this.f18196c, this.d, this.e, this.f18197f, this.f18198g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18195b.lambda$pushToTranslate$20(this.f18196c, this.d, this.e, this.f18197f, this.f18198g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

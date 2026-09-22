package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f18250a;
    public final TranslateController f18251b;
    public final Utilities.Callback4 f18252c;
    public final boolean d;
    public final int e;
    public final String f18253f;
    public final long f18254g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18250a = i11;
        this.f18251b = translateController;
        this.f18252c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18253f = str;
        this.f18254g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18250a) {
            case 0:
                this.f18251b.lambda$pushToTranslate$21(this.f18252c, this.d, this.e, this.f18253f, this.f18254g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18251b.lambda$pushToTranslate$20(this.f18252c, this.d, this.e, this.f18253f, this.f18254g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

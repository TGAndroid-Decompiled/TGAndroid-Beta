package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f18006a;
    public final TranslateController f18007b;
    public final Utilities.Callback4 f18008c;
    public final boolean d;
    public final int e;
    public final String f18009f;
    public final long f18010g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18006a = i11;
        this.f18007b = translateController;
        this.f18008c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18009f = str;
        this.f18010g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18006a) {
            case 0:
                this.f18007b.lambda$pushToTranslate$21(this.f18008c, this.d, this.e, this.f18009f, this.f18010g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18007b.lambda$pushToTranslate$20(this.f18008c, this.d, this.e, this.f18009f, this.f18010g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

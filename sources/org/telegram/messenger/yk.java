package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f18010a;
    public final TranslateController f18011b;
    public final Utilities.Callback4 f18012c;
    public final boolean d;
    public final int e;
    public final String f18013f;
    public final long f18014g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18010a = i11;
        this.f18011b = translateController;
        this.f18012c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18013f = str;
        this.f18014g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18010a) {
            case 0:
                this.f18011b.lambda$pushToTranslate$21(this.f18012c, this.d, this.e, this.f18013f, this.f18014g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18011b.lambda$pushToTranslate$20(this.f18012c, this.d, this.e, this.f18013f, this.f18014g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

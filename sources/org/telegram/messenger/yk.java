package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f19938a;
    public final TranslateController f19939b;
    public final Utilities.Callback4 f19940c;
    public final boolean d;
    public final int f19941e;
    public final String f19942f;
    public final long f19943g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19938a = i11;
        this.f19939b = translateController;
        this.f19940c = callback4;
        this.d = z10;
        this.f19941e = i10;
        this.f19942f = str;
        this.f19943g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19938a) {
            case 0:
                this.f19939b.lambda$pushToTranslate$21(this.f19940c, this.d, this.f19941e, this.f19942f, this.f19943g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19939b.lambda$pushToTranslate$20(this.f19940c, this.d, this.f19941e, this.f19942f, this.f19943g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

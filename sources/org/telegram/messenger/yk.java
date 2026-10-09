package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f19934a;
    public final TranslateController f19935b;
    public final Utilities.Callback4 f19936c;
    public final boolean d;
    public final int f19937e;
    public final String f19938f;
    public final long f19939g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19934a = i11;
        this.f19935b = translateController;
        this.f19936c = callback4;
        this.d = z10;
        this.f19937e = i10;
        this.f19938f = str;
        this.f19939g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19934a) {
            case 0:
                this.f19935b.lambda$pushToTranslate$21(this.f19936c, this.d, this.f19937e, this.f19938f, this.f19939g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19935b.lambda$pushToTranslate$20(this.f19936c, this.d, this.f19937e, this.f19938f, this.f19939g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f19935a;
    public final TranslateController f19936b;
    public final Utilities.Callback4 f19937c;
    public final boolean d;
    public final int f19938e;
    public final String f19939f;
    public final long f19940g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19935a = i11;
        this.f19936b = translateController;
        this.f19937c = callback4;
        this.d = z10;
        this.f19938e = i10;
        this.f19939f = str;
        this.f19940g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19935a) {
            case 0:
                this.f19936b.lambda$pushToTranslate$21(this.f19937c, this.d, this.f19938e, this.f19939f, this.f19940g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19936b.lambda$pushToTranslate$20(this.f19937c, this.d, this.f19938e, this.f19939f, this.f19940g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

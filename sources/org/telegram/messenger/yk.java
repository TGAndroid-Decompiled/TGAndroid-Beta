package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f18019a;
    public final TranslateController f18020b;
    public final Utilities.Callback4 f18021c;
    public final boolean d;
    public final int e;
    public final String f18022f;
    public final long f18023g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18019a = i11;
        this.f18020b = translateController;
        this.f18021c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18022f = str;
        this.f18023g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18019a) {
            case 0:
                this.f18020b.lambda$pushToTranslate$21(this.f18021c, this.d, this.e, this.f18022f, this.f18023g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18020b.lambda$pushToTranslate$20(this.f18021c, this.d, this.e, this.f18022f, this.f18023g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

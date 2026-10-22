package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f20182a;
    public final TranslateController f20183b;
    public final Utilities.Callback4 f20184c;
    public final boolean d;
    public final int e;
    public final String f20185f;
    public final long f20186g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f20182a = i11;
        this.f20183b = translateController;
        this.f20184c = callback4;
        this.d = z10;
        this.e = i10;
        this.f20185f = str;
        this.f20186g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20182a) {
            case 0:
                this.f20183b.lambda$pushToTranslate$21(this.f20184c, this.d, this.e, this.f20185f, this.f20186g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f20183b.lambda$pushToTranslate$20(this.f20184c, this.d, this.e, this.f20185f, this.f20186g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

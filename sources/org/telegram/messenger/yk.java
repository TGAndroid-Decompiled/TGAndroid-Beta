package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f19782a;
    public final TranslateController f19783b;
    public final Utilities.Callback4 f19784c;
    public final boolean d;
    public final int f19785e;
    public final String f19786f;
    public final long f19787g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f19782a = i11;
        this.f19783b = translateController;
        this.f19784c = callback4;
        this.d = z10;
        this.f19785e = i10;
        this.f19786f = str;
        this.f19787g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19782a) {
            case 0:
                this.f19783b.lambda$pushToTranslate$21(this.f19784c, this.d, this.f19785e, this.f19786f, this.f19787g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f19783b.lambda$pushToTranslate$20(this.f19784c, this.d, this.f19785e, this.f19786f, this.f19787g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

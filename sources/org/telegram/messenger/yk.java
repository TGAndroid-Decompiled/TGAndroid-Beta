package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class yk implements Utilities.Callback2 {
    public final int f18235a;
    public final TranslateController f18236b;
    public final Utilities.Callback4 f18237c;
    public final boolean d;
    public final int e;
    public final String f18238f;
    public final long f18239g;

    public yk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j3, int i11) {
        this.f18235a = i11;
        this.f18236b = translateController;
        this.f18237c = callback4;
        this.d = z10;
        this.e = i10;
        this.f18238f = str;
        this.f18239g = j3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18235a) {
            case 0:
                this.f18236b.lambda$pushToTranslate$21(this.f18237c, this.d, this.e, this.f18238f, this.f18239g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f18236b.lambda$pushToTranslate$20(this.f18237c, this.d, this.e, this.f18238f, this.f18239g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class zk implements Utilities.Callback2 {
    public final int f22018a;
    public final TranslateController f22019b;
    public final Utilities.Callback4 f22020c;
    public final boolean d;
    public final int e;
    public final String f22021f;
    public final long f22022g;

    public zk(TranslateController translateController, Utilities.Callback4 callback4, boolean z10, int i10, String str, long j10, int i11) {
        this.f22018a = i11;
        this.f22019b = translateController;
        this.f22020c = callback4;
        this.d = z10;
        this.e = i10;
        this.f22021f = str;
        this.f22022g = j10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f22018a) {
            case 0:
                this.f22019b.lambda$pushToTranslate$21(this.f22020c, this.d, this.e, this.f22021f, this.f22022g, (String) obj, (Boolean) obj2);
                return;
            default:
                this.f22019b.lambda$pushToTranslate$20(this.f22020c, this.d, this.e, this.f22021f, this.f22022g, (String) obj, (Boolean) obj2);
                return;
        }
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements Runnable {
    public final int f22320a;
    public final MediaDataController f22321b;
    public final TLRPC.TL_error f22322c;
    public final TLObject d;
    public final SharedPreferences f22323e;
    public final boolean[] f22324f;

    public z6(MediaDataController mediaDataController, TLRPC.TL_error tL_error, TLObject tLObject, SharedPreferences sharedPreferences, boolean[] zArr, int i10) {
        this.f22320a = i10;
        this.f22321b = mediaDataController;
        this.f22322c = tL_error;
        this.d = tLObject;
        this.f22323e = sharedPreferences;
        this.f22324f = zArr;
    }

    @Override
    public final void run() {
        switch (this.f22320a) {
            case 0:
                SharedPreferences sharedPreferences = this.f22323e;
                boolean[] zArr = this.f22324f;
                this.f22321b.lambda$loadRecentAndTopReactions$237(this.f22322c, this.d, sharedPreferences, zArr);
                return;
            default:
                SharedPreferences sharedPreferences2 = this.f22323e;
                boolean[] zArr2 = this.f22324f;
                this.f22321b.lambda$loadRecentAndTopReactions$235(this.f22322c, this.d, sharedPreferences2, zArr2);
                return;
        }
    }
}

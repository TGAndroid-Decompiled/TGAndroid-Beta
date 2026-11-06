package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class zw implements Runnable {
    public final int f26927a;
    public final gz f26928b;
    public final String f26929c;
    public final List d;

    public zw(gz gzVar, String str, List list, int i7) {
        this.f26927a = i7;
        this.f26928b = gzVar;
        this.f26929c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26927a) {
            case 0:
                HashMap hashMap = this.f26928b.f22757r;
                String str = this.f26929c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26928b.f22757r;
                String str2 = this.f26929c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}

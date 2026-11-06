package org.telegram.messenger;

import java.util.HashMap;
import java.util.List;
public final class yw implements Runnable {
    public final int f26751a;
    public final gz f26752b;
    public final String f26753c;
    public final List d;

    public yw(gz gzVar, String str, List list, int i7) {
        this.f26751a = i7;
        this.f26752b = gzVar;
        this.f26753c = str;
        this.d = list;
    }

    @Override
    public final void run() {
        switch (this.f26751a) {
            case 0:
                HashMap hashMap = this.f26752b.f22764r;
                String str = this.f26753c;
                hashMap.remove(str);
                this.d.remove(str);
                return;
            default:
                HashMap hashMap2 = this.f26752b.f22764r;
                String str2 = this.f26753c;
                hashMap2.remove(str2);
                this.d.remove(str2);
                return;
        }
    }
}

package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class zs {
    public final long f27999a;
    public String f28000b;
    public final HashMap f28001c;
    public boolean d;
    public long f28002e;

    public zs(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.f28001c = hashMap;
        this.f27999a = j3;
        this.f28000b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.f28002e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.f28001c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}

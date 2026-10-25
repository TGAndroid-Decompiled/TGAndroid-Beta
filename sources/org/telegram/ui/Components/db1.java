package org.telegram.ui.Components;

import java.util.ArrayList;
public final class db1 {
    public final String f27485a;
    public final int f27486b;
    public final long f27487c;
    public final int d;
    public final int e;
    public final int f27488f;
    public final byte[] f27489g;
    public String h;
    public jb1 f27490i;
    public an0 f27491j;
    public an0 f27493l;
    public int f27494m;
    public long f27495n;
    public boolean f27496o;
    public boolean f27497p;
    public int f27498q;
    public int f27499r;
    public boolean f27500s;
    public int f27501t;
    public boolean f27502u;
    public final ArrayList f27492k = new ArrayList();
    public final s51 v = new s51(this, 11);

    public db1(String str, int i10, long j10, int i11, int i12, int i13, byte[] bArr) {
        this.f27485a = str;
        this.f27486b = i10;
        this.f27487c = j10;
        this.d = i11;
        this.e = Math.max(0, i12);
        this.f27488f = Math.max(0, i13);
        this.f27489g = bArr;
    }

    public final String a() {
        return this.f27486b + "/" + this.f27487c + "/" + this.d;
    }
}

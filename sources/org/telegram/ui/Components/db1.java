package org.telegram.ui.Components;

import java.util.ArrayList;
public final class db1 {
    public final String f27487a;
    public final int f27488b;
    public final long f27489c;
    public final int d;
    public final int e;
    public final int f27490f;
    public final byte[] f27491g;
    public String h;
    public jb1 f27492i;
    public an0 f27493j;
    public an0 f27495l;
    public int f27496m;
    public long f27497n;
    public boolean f27498o;
    public boolean f27499p;
    public int f27500q;
    public int f27501r;
    public boolean f27502s;
    public int f27503t;
    public boolean f27504u;
    public final ArrayList f27494k = new ArrayList();
    public final s51 v = new s51(this, 11);

    public db1(String str, int i10, long j10, int i11, int i12, int i13, byte[] bArr) {
        this.f27487a = str;
        this.f27488b = i10;
        this.f27489c = j10;
        this.d = i11;
        this.e = Math.max(0, i12);
        this.f27490f = Math.max(0, i13);
        this.f27491g = bArr;
    }

    public final String a() {
        return this.f27488b + "/" + this.f27489c + "/" + this.d;
    }
}

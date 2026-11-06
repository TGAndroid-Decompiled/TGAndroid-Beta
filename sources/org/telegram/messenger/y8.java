package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Set;
public final class y8 {
    public byte[] A;
    public final boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public String F;
    public long G;
    public int H;
    public RandomAccessFile I;
    public boolean J;
    public int K;
    public SharedPreferences L;
    public final int M;
    public int N;
    public long O;
    public boolean P;
    public long S;
    public volatile boolean T;
    public final int f26590a;
    public boolean f26591b;
    public boolean f26592c;
    public int d;
    public int f26593e;
    public boolean f26596i;
    public ArrayList f26597j;
    public int f26598k;
    public final String f26599l;
    public int f26600m;
    public byte[] f26601n;
    public t7 f26602o;
    public int f26605r;
    public long f26606s;
    public long f26607t;
    public int f26608u;
    public long v;
    public long f26609w;
    public int f26610x;
    public byte[] f26611y;
    public byte[] f26612z;
    public int f26594f = 4;
    public final int[] f26595g = new int[8];
    public int h = 65536;
    public final SparseIntArray f26603p = new SparseIntArray();
    public final ArrayList f26604q = new ArrayList();
    public final SparseArray Q = new SparseArray();
    public final boolean[] R = {false, false};

    public y8(int i7, int i10, long j3, String str, boolean z9) {
        boolean z10;
        this.f26590a = i7;
        this.f26599l = str;
        this.B = z9;
        this.G = j3;
        this.M = i10;
        if (j3 != 0 && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.P = z10;
    }

    public final void a() {
        if (this.P) {
            if (this.D) {
                long j3 = this.f26607t;
                long j10 = this.h;
                this.f26608u = ((int) ((((j3 - j10) + j10) - 1) / j10)) + 1;
                return;
            }
            long j11 = this.h;
            this.f26608u = ((int) ((((this.f26607t - 1024) + j11) - 1) / j11)) + 1;
            return;
        }
        long j12 = this.f26607t;
        long j13 = this.h;
        this.f26608u = (int) (((j12 + j13) - 1) / j13);
    }

    public final void b() {
        if (this.L == null) {
            this.L = t0.f25563b.getSharedPreferences("uploadinfo", 0);
        }
        SharedPreferences.Editor edit = this.L.edit();
        SharedPreferences.Editor remove = edit.remove(this.F + "_time");
        SharedPreferences.Editor remove2 = remove.remove(this.F + "_size");
        SharedPreferences.Editor remove3 = remove2.remove(this.F + "_uploaded");
        SharedPreferences.Editor remove4 = remove3.remove(this.F + "_id");
        SharedPreferences.Editor remove5 = remove4.remove(this.F + "_iv");
        SharedPreferences.Editor remove6 = remove5.remove(this.F + "_key");
        remove6.remove(this.F + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.I;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.I = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String str = this.f26599l;
        if (str == null) {
            Set set = z0.f26769a;
        } else {
            z0.f26769a.remove(str);
        }
    }

    public final void c() {
        if (this.f26600m != 0) {
            return;
        }
        this.f26600m = 1;
        String str = this.f26599l;
        if (str == null) {
            Set set = z0.f26769a;
        } else {
            z0.f26769a.add(str);
        }
        Utilities.d.c(new u8(this, 0));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y8.d():void");
    }

    public final void e() {
        int i7;
        while (this.f26600m == 1 && (i7 = this.K) < this.f26593e) {
            d();
            if (this.K == i7) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(a8.p0.s(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(a8.p0.s(new StringBuilder(), this.F, "_size"), this.f26607t);
        edit.putLong(a8.p0.s(new StringBuilder(), this.F, "_id"), this.f26606s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(a8.p0.s(new StringBuilder(), this.F, "_iv"), Utilities.f(this.f26612z));
            edit.putString(a8.p0.s(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(a8.p0.s(new StringBuilder(), this.F, "_key"), Utilities.f(this.f26611y));
        }
        edit.commit();
    }
}

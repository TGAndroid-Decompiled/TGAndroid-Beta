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
    public final int f28084a;
    public boolean f28085b;
    public boolean f28086c;
    public int d;
    public int f28087e;
    public boolean f28090i;
    public ArrayList f28091j;
    public int f28092k;
    public final String f28093l;
    public int f28094m;
    public byte[] f28095n;
    public t7 f28096o;
    public int f28099r;
    public long f28100s;
    public long f28101t;
    public int f28102u;
    public long v;
    public long f28103w;
    public int f28104x;
    public byte[] f28105y;
    public byte[] f28106z;
    public int f28088f = 4;
    public final int[] f28089g = new int[8];
    public int h = 65536;
    public final SparseIntArray f28097p = new SparseIntArray();
    public final ArrayList f28098q = new ArrayList();
    public final SparseArray Q = new SparseArray();
    public final boolean[] R = {false, false};

    public y8(int i7, int i10, long j3, String str, boolean z10) {
        boolean z11;
        this.f28084a = i7;
        this.f28093l = str;
        this.B = z10;
        this.G = j3;
        this.M = i10;
        if (j3 != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.P = z11;
    }

    public final void a() {
        if (this.P) {
            if (this.D) {
                long j3 = this.f28101t;
                long j10 = this.h;
                this.f28102u = ((int) ((((j3 - j10) + j10) - 1) / j10)) + 1;
                return;
            }
            long j11 = this.h;
            this.f28102u = ((int) ((((this.f28101t - 1024) + j11) - 1) / j11)) + 1;
            return;
        }
        long j12 = this.f28101t;
        long j13 = this.h;
        this.f28102u = (int) (((j12 + j13) - 1) / j13);
    }

    public final void b() {
        if (this.L == null) {
            this.L = t0.f26913b.getSharedPreferences("uploadinfo", 0);
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
        String str = this.f28093l;
        if (str == null) {
            Set set = z0.f28236a;
        } else {
            z0.f28236a.remove(str);
        }
    }

    public final void c() {
        if (this.f28094m != 0) {
            return;
        }
        this.f28094m = 1;
        String str = this.f28093l;
        if (str == null) {
            Set set = z0.f28236a;
        } else {
            z0.f28236a.add(str);
        }
        Utilities.d.c(new u8(this, 0));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y8.d():void");
    }

    public final void e() {
        int i7;
        while (this.f28094m == 1 && (i7 = this.K) < this.f28087e) {
            d();
            if (this.K == i7) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(a8.p0.s(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(a8.p0.s(new StringBuilder(), this.F, "_size"), this.f28101t);
        edit.putLong(a8.p0.s(new StringBuilder(), this.F, "_id"), this.f28100s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(a8.p0.s(new StringBuilder(), this.F, "_iv"), Utilities.f(this.f28106z));
            edit.putString(a8.p0.s(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(a8.p0.s(new StringBuilder(), this.F, "_key"), Utilities.f(this.f28105y));
        }
        edit.commit();
    }
}

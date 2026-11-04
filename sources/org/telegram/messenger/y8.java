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
    public final int f26534a;
    public boolean f26535b;
    public boolean f26536c;
    public int d;
    public int f26537e;
    public boolean f26540i;
    public ArrayList f26541j;
    public int f26542k;
    public final String f26543l;
    public int f26544m;
    public byte[] f26545n;
    public t7 f26546o;
    public int f26549r;
    public long f26550s;
    public long f26551t;
    public int f26552u;
    public long v;
    public long f26553w;
    public int f26554x;
    public byte[] f26555y;
    public byte[] f26556z;
    public int f26538f = 4;
    public final int[] f26539g = new int[8];
    public int h = 65536;
    public final SparseIntArray f26547p = new SparseIntArray();
    public final ArrayList f26548q = new ArrayList();
    public final SparseArray Q = new SparseArray();
    public final boolean[] R = {false, false};

    public y8(int i3, int i10, long j10, String str, boolean z10) {
        boolean z11;
        this.f26534a = i3;
        this.f26543l = str;
        this.B = z10;
        this.G = j10;
        this.M = i10;
        if (j10 != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.P = z11;
    }

    public final void a() {
        if (this.P) {
            if (this.D) {
                long j10 = this.f26551t;
                long j11 = this.h;
                this.f26552u = ((int) ((((j10 - j11) + j11) - 1) / j11)) + 1;
                return;
            }
            long j12 = this.h;
            this.f26552u = ((int) ((((this.f26551t - 1024) + j12) - 1) / j12)) + 1;
            return;
        }
        long j13 = this.f26551t;
        long j14 = this.h;
        this.f26552u = (int) (((j13 + j14) - 1) / j14);
    }

    public final void b() {
        if (this.L == null) {
            this.L = t0.f25457b.getSharedPreferences("uploadinfo", 0);
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
        String str = this.f26543l;
        if (str == null) {
            Set set = z0.f26694a;
        } else {
            z0.f26694a.remove(str);
        }
    }

    public final void c() {
        if (this.f26544m != 0) {
            return;
        }
        this.f26544m = 1;
        String str = this.f26543l;
        if (str == null) {
            Set set = z0.f26694a;
        } else {
            z0.f26694a.add(str);
        }
        Utilities.d.c(new u8(this, 0));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y8.d():void");
    }

    public final void e() {
        int i3;
        while (this.f26544m == 1 && (i3 = this.K) < this.f26537e) {
            d();
            if (this.K == i3) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(a1.g.s(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(a1.g.s(new StringBuilder(), this.F, "_size"), this.f26551t);
        edit.putLong(a1.g.s(new StringBuilder(), this.F, "_id"), this.f26550s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(a1.g.s(new StringBuilder(), this.F, "_iv"), Utilities.f(this.f26556z));
            edit.putString(a1.g.s(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(a1.g.s(new StringBuilder(), this.F, "_key"), Utilities.f(this.f26555y));
        }
        edit.commit();
    }
}

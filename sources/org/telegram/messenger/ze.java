package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ze {
    public ye A;
    public CharSequence f19506a;
    public boolean f19507b;
    public String f19508c;
    public long d;
    public TLRPC.Photo e;
    public jj f19509f;
    public String f19510g;
    public String h;
    public String f19511i;
    public String f19512j;
    public String f19513k;
    public String f19514l;
    public long f19515m;
    public ArrayList f19516n;
    public ff f19517o;
    public ArrayList f19518p;
    public ArrayList f19519q;
    public ArrayList f19520r;
    public x20 f19521s;
    public long f19522t;
    public boolean f19523u;
    public boolean v;
    public boolean f19524w;
    public int f19525x;
    public long f19526y;
    public Boolean f19527z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f19507b) {
            return false;
        }
        x20 x20Var = this.f19521s;
        if (x20Var != null && (x20Var.f19201t || x20Var.f19183a > 0 || x20Var.f19185b > 0)) {
            return true;
        }
        ye yeVar = this.A;
        if ((yeVar == null || yeVar.b()) && this.f19517o == null && this.f19512j == null && (((arrayList = this.f19518p) == null || arrayList.isEmpty()) && this.f19510g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f19527z;
        if (bool == null) {
            return tz.f18151h1;
        }
        return bool.booleanValue();
    }

    public boolean d() {
        if ((this instanceof ef) && ((ef) this).d()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f19506a = null;
        this.f19510g = null;
        this.e = null;
        this.f19509f = null;
        this.f19508c = null;
        this.f19511i = null;
        this.h = null;
        this.f19512j = null;
        this.f19514l = null;
        this.f19513k = null;
        this.f19523u = false;
        this.v = false;
        this.f19524w = false;
        this.f19525x = 0;
        this.f19518p = null;
        this.f19521s = null;
        this.f19516n = null;
        this.f19517o = null;
        this.f19520r = null;
        this.A = null;
        this.f19527z = null;
    }
}

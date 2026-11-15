package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ye {
    public xe A;
    public CharSequence f27707a;
    public boolean f27708b;
    public String f27709c;
    public long d;
    public TLRPC.Photo f27710e;
    public gj f27711f;
    public String f27712g;
    public String h;
    public String f27713i;
    public String f27714j;
    public String f27715k;
    public String f27716l;
    public long f27717m;
    public ArrayList f27718n;
    public gf f27719o;
    public ArrayList f27720p;
    public ArrayList f27721q;
    public ArrayList f27722r;
    public g20 f27723s;
    public long f27724t;
    public boolean f27725u;
    public boolean v;
    public boolean f27726w;
    public int f27727x;
    public long f27728y;
    public Boolean f27729z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f27708b) {
            return false;
        }
        g20 g20Var = this.f27723s;
        if (g20Var != null && (g20Var.f23651t || g20Var.f23632a > 0 || g20Var.f23634b > 0)) {
            return true;
        }
        xe xeVar = this.A;
        if ((xeVar == null || xeVar.b()) && this.f27719o == null && this.f27714j == null && (((arrayList = this.f27720p) == null || arrayList.isEmpty()) && this.f27712g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f27729z;
        if (bool == null) {
            return gz.f23950h1;
        }
        return bool.booleanValue();
    }

    public boolean d() {
        if ((this instanceof ff) && ((ff) this).d()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f27707a = null;
        this.f27712g = null;
        this.f27710e = null;
        this.f27711f = null;
        this.f27709c = null;
        this.f27713i = null;
        this.h = null;
        this.f27714j = null;
        this.f27716l = null;
        this.f27715k = null;
        this.f27725u = false;
        this.v = false;
        this.f27726w = false;
        this.f27727x = 0;
        this.f27720p = null;
        this.f27723s = null;
        this.f27718n = null;
        this.f27719o = null;
        this.f27722r = null;
        this.A = null;
        this.f27729z = null;
    }
}

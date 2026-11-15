package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ye {
    public xe A;
    public CharSequence f27709a;
    public boolean f27710b;
    public String f27711c;
    public long d;
    public TLRPC.Photo f27712e;
    public gj f27713f;
    public String f27714g;
    public String h;
    public String f27715i;
    public String f27716j;
    public String f27717k;
    public String f27718l;
    public long f27719m;
    public ArrayList f27720n;
    public gf f27721o;
    public ArrayList f27722p;
    public ArrayList f27723q;
    public ArrayList f27724r;
    public g20 f27725s;
    public long f27726t;
    public boolean f27727u;
    public boolean v;
    public boolean f27728w;
    public int f27729x;
    public long f27730y;
    public Boolean f27731z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f27710b) {
            return false;
        }
        g20 g20Var = this.f27725s;
        if (g20Var != null && (g20Var.f23653t || g20Var.f23634a > 0 || g20Var.f23636b > 0)) {
            return true;
        }
        xe xeVar = this.A;
        if ((xeVar == null || xeVar.b()) && this.f27721o == null && this.f27716j == null && (((arrayList = this.f27722p) == null || arrayList.isEmpty()) && this.f27714g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f27731z;
        if (bool == null) {
            return gz.f23953h1;
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
        this.f27709a = null;
        this.f27714g = null;
        this.f27712e = null;
        this.f27713f = null;
        this.f27711c = null;
        this.f27715i = null;
        this.h = null;
        this.f27716j = null;
        this.f27718l = null;
        this.f27717k = null;
        this.f27727u = false;
        this.v = false;
        this.f27728w = false;
        this.f27729x = 0;
        this.f27722p = null;
        this.f27725s = null;
        this.f27720n = null;
        this.f27721o = null;
        this.f27724r = null;
        this.A = null;
        this.f27731z = null;
    }
}

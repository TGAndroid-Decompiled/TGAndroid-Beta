package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ze {
    public ye A;
    public CharSequence f26844a;
    public boolean f26845b;
    public String f26846c;
    public long d;
    public TLRPC.Photo f26847e;
    public ij f26848f;
    public String f26849g;
    public String h;
    public String f26850i;
    public String f26851j;
    public String f26852k;
    public String f26853l;
    public long f26854m;
    public ArrayList f26855n;
    public hf f26856o;
    public ArrayList f26857p;
    public ArrayList f26858q;
    public ArrayList f26859r;
    public j20 f26860s;
    public long f26861t;
    public boolean f26862u;
    public boolean v;
    public boolean f26863w;
    public int f26864x;
    public long f26865y;
    public Boolean f26866z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f26845b) {
            return false;
        }
        j20 j20Var = this.f26860s;
        if (j20Var != null && (j20Var.f23490t || j20Var.f23471a > 0 || j20Var.f23473b > 0)) {
            return true;
        }
        ye yeVar = this.A;
        if ((yeVar == null || yeVar.b()) && this.f26856o == null && this.f26851j == null && (((arrayList = this.f26857p) == null || arrayList.isEmpty()) && this.f26849g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f26866z;
        if (bool == null) {
            return iz.f23406h1;
        }
        return bool.booleanValue();
    }

    public boolean d() {
        if ((this instanceof gf) && ((gf) this).d()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f26844a = null;
        this.f26849g = null;
        this.f26847e = null;
        this.f26848f = null;
        this.f26846c = null;
        this.f26850i = null;
        this.h = null;
        this.f26851j = null;
        this.f26853l = null;
        this.f26852k = null;
        this.f26862u = false;
        this.v = false;
        this.f26863w = false;
        this.f26864x = 0;
        this.f26857p = null;
        this.f26860s = null;
        this.f26855n = null;
        this.f26856o = null;
        this.f26859r = null;
        this.A = null;
        this.f26866z = null;
    }
}

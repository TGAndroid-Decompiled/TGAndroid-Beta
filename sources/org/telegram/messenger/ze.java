package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ze {
    public ye A;
    public CharSequence f26823a;
    public boolean f26824b;
    public String f26825c;
    public long d;
    public TLRPC.Photo f26826e;
    public ij f26827f;
    public String f26828g;
    public String h;
    public String f26829i;
    public String f26830j;
    public String f26831k;
    public String f26832l;
    public long f26833m;
    public ArrayList f26834n;
    public hf f26835o;
    public ArrayList f26836p;
    public ArrayList f26837q;
    public ArrayList f26838r;
    public j20 f26839s;
    public long f26840t;
    public boolean f26841u;
    public boolean v;
    public boolean f26842w;
    public int f26843x;
    public long f26844y;
    public Boolean f26845z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f26824b) {
            return false;
        }
        j20 j20Var = this.f26839s;
        if (j20Var != null && (j20Var.f23469t || j20Var.f23450a > 0 || j20Var.f23452b > 0)) {
            return true;
        }
        ye yeVar = this.A;
        if ((yeVar == null || yeVar.b()) && this.f26835o == null && this.f26830j == null && (((arrayList = this.f26836p) == null || arrayList.isEmpty()) && this.f26828g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f26845z;
        if (bool == null) {
            return iz.f23385h1;
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
        this.f26823a = null;
        this.f26828g = null;
        this.f26826e = null;
        this.f26827f = null;
        this.f26825c = null;
        this.f26829i = null;
        this.h = null;
        this.f26830j = null;
        this.f26832l = null;
        this.f26831k = null;
        this.f26841u = false;
        this.v = false;
        this.f26842w = false;
        this.f26843x = 0;
        this.f26836p = null;
        this.f26839s = null;
        this.f26834n = null;
        this.f26835o = null;
        this.f26838r = null;
        this.A = null;
        this.f26845z = null;
    }
}

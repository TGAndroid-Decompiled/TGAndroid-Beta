package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ze {
    public ye A;
    public CharSequence f26848a;
    public boolean f26849b;
    public String f26850c;
    public long d;
    public TLRPC.Photo f26851e;
    public ij f26852f;
    public String f26853g;
    public String h;
    public String f26854i;
    public String f26855j;
    public String f26856k;
    public String f26857l;
    public long f26858m;
    public ArrayList f26859n;
    public hf f26860o;
    public ArrayList f26861p;
    public ArrayList f26862q;
    public ArrayList f26863r;
    public j20 f26864s;
    public long f26865t;
    public boolean f26866u;
    public boolean v;
    public boolean f26867w;
    public int f26868x;
    public long f26869y;
    public Boolean f26870z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f26849b) {
            return false;
        }
        j20 j20Var = this.f26864s;
        if (j20Var != null && (j20Var.f23494t || j20Var.f23475a > 0 || j20Var.f23477b > 0)) {
            return true;
        }
        ye yeVar = this.A;
        if ((yeVar == null || yeVar.b()) && this.f26860o == null && this.f26855j == null && (((arrayList = this.f26861p) == null || arrayList.isEmpty()) && this.f26853g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f26870z;
        if (bool == null) {
            return iz.f23410h1;
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
        this.f26848a = null;
        this.f26853g = null;
        this.f26851e = null;
        this.f26852f = null;
        this.f26850c = null;
        this.f26854i = null;
        this.h = null;
        this.f26855j = null;
        this.f26857l = null;
        this.f26856k = null;
        this.f26866u = false;
        this.v = false;
        this.f26867w = false;
        this.f26868x = 0;
        this.f26861p = null;
        this.f26864s = null;
        this.f26859n = null;
        this.f26860o = null;
        this.f26863r = null;
        this.A = null;
        this.f26870z = null;
    }
}

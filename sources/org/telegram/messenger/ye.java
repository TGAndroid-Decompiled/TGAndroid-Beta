package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ye {
    public xe A;
    public CharSequence f28022a;
    public boolean f28023b;
    public String f28024c;
    public long d;
    public TLRPC.Photo f28025e;
    public gj f28026f;
    public String f28027g;
    public String h;
    public String f28028i;
    public String f28029j;
    public String f28030k;
    public String f28031l;
    public long f28032m;
    public ArrayList f28033n;
    public gf f28034o;
    public ArrayList f28035p;
    public ArrayList f28036q;
    public ArrayList f28037r;
    public f20 f28038s;
    public long f28039t;
    public boolean f28040u;
    public boolean v;
    public boolean f28041w;
    public int f28042x;
    public long f28043y;
    public Boolean f28044z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f28023b) {
            return false;
        }
        f20 f20Var = this.f28038s;
        if (f20Var != null && (f20Var.f23809t || f20Var.f23790a > 0 || f20Var.f23792b > 0)) {
            return true;
        }
        xe xeVar = this.A;
        if ((xeVar == null || xeVar.b()) && this.f28034o == null && this.f28029j == null && (((arrayList = this.f28035p) == null || arrayList.isEmpty()) && this.f28027g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f28044z;
        if (bool == null) {
            return cz.f23375h1;
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
        this.f28022a = null;
        this.f28027g = null;
        this.f28025e = null;
        this.f28026f = null;
        this.f28024c = null;
        this.f28028i = null;
        this.h = null;
        this.f28029j = null;
        this.f28031l = null;
        this.f28030k = null;
        this.f28040u = false;
        this.v = false;
        this.f28041w = false;
        this.f28042x = 0;
        this.f28035p = null;
        this.f28038s = null;
        this.f28033n = null;
        this.f28034o = null;
        this.f28037r = null;
        this.A = null;
        this.f28044z = null;
    }
}

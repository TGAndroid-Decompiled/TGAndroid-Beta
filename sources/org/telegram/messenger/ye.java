package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class ye {
    public xe A;
    public CharSequence f28058a;
    public boolean f28059b;
    public String f28060c;
    public long d;
    public TLRPC.Photo f28061e;
    public gj f28062f;
    public String f28063g;
    public String h;
    public String f28064i;
    public String f28065j;
    public String f28066k;
    public String f28067l;
    public long f28068m;
    public ArrayList f28069n;
    public gf f28070o;
    public ArrayList f28071p;
    public ArrayList f28072q;
    public ArrayList f28073r;
    public f20 f28074s;
    public long f28075t;
    public boolean f28076u;
    public boolean v;
    public boolean f28077w;
    public int f28078x;
    public long f28079y;
    public Boolean f28080z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f28059b) {
            return false;
        }
        f20 f20Var = this.f28074s;
        if (f20Var != null && (f20Var.f23845t || f20Var.f23826a > 0 || f20Var.f23828b > 0)) {
            return true;
        }
        xe xeVar = this.A;
        if ((xeVar == null || xeVar.b()) && this.f28070o == null && this.f28065j == null && (((arrayList = this.f28071p) == null || arrayList.isEmpty()) && this.f28063g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f28080z;
        if (bool == null) {
            return cz.f23411h1;
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
        this.f28058a = null;
        this.f28063g = null;
        this.f28061e = null;
        this.f28062f = null;
        this.f28060c = null;
        this.f28064i = null;
        this.h = null;
        this.f28065j = null;
        this.f28067l = null;
        this.f28066k = null;
        this.f28076u = false;
        this.v = false;
        this.f28077w = false;
        this.f28078x = 0;
        this.f28071p = null;
        this.f28074s = null;
        this.f28069n = null;
        this.f28070o = null;
        this.f28073r = null;
        this.A = null;
        this.f28080z = null;
    }
}

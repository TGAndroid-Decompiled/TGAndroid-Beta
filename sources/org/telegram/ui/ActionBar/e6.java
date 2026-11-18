package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class e6 {
    public String f28899a = "";
    public String f28900b = "";
    public String f28901c = "";
    public int d;
    public int f28902e;
    public int f28903f;
    public int f28904g;
    public int h;
    public boolean f28905i;
    public boolean f28906j;
    public float f28907k;
    public long f28908l;
    public long f28909m;
    public long f28910n;
    public boolean f28911o;
    public m6 f28912p;
    public k6 f28913q;
    public float f28914r;
    public ArrayList f28915s;
    public TLRPC.WallPaper f28916t;

    public static void a(e6 e6Var) {
        org.telegram.messenger.t0.f26915b.getSharedPreferences("themeconfig", 0).edit().remove(e6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), e6Var.f28899a).delete();
        new File(org.telegram.messenger.t0.h(), e6Var.f28900b).delete();
    }

    public final String b() {
        if (this.f28913q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28912p.f29249a);
            sb2.append("_");
            return a8.p0.n(this.f28913q.f29170a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f28912p.f29249a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f26915b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f28899a);
            jSONObject.put("owall", this.f28900b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f28902e);
            jSONObject.put("pGrColor2", this.f28903f);
            jSONObject.put("pGrColor3", this.f28904g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f28901c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f28905i);
            jSONObject.put("wMotion", this.f28906j);
            jSONObject.put("pIntensity", this.f28907k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

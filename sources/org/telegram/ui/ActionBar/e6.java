package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class e6 {
    public String f28897a = "";
    public String f28898b = "";
    public String f28899c = "";
    public int d;
    public int f28900e;
    public int f28901f;
    public int f28902g;
    public int h;
    public boolean f28903i;
    public boolean f28904j;
    public float f28905k;
    public long f28906l;
    public long f28907m;
    public long f28908n;
    public boolean f28909o;
    public m6 f28910p;
    public k6 f28911q;
    public float f28912r;
    public ArrayList f28913s;
    public TLRPC.WallPaper f28914t;

    public static void a(e6 e6Var) {
        org.telegram.messenger.t0.f26913b.getSharedPreferences("themeconfig", 0).edit().remove(e6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), e6Var.f28897a).delete();
        new File(org.telegram.messenger.t0.h(), e6Var.f28898b).delete();
    }

    public final String b() {
        if (this.f28911q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28910p.f29247a);
            sb2.append("_");
            return a8.p0.n(this.f28911q.f29168a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f28910p.f29247a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f28897a);
            jSONObject.put("owall", this.f28898b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f28900e);
            jSONObject.put("pGrColor2", this.f28901f);
            jSONObject.put("pGrColor3", this.f28902g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f28899c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f28903i);
            jSONObject.put("wMotion", this.f28904j);
            jSONObject.put("pIntensity", this.f28905k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

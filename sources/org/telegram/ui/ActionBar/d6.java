package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public String f28883a = "";
    public String f28884b = "";
    public String f28885c = "";
    public int d;
    public int f28886e;
    public int f28887f;
    public int f28888g;
    public int h;
    public boolean f28889i;
    public boolean f28890j;
    public float f28891k;
    public long f28892l;
    public long f28893m;
    public long f28894n;
    public boolean f28895o;
    public l6 f28896p;
    public j6 f28897q;
    public float f28898r;
    public ArrayList f28899s;
    public TLRPC.WallPaper f28900t;

    public static void a(d6 d6Var) {
        org.telegram.messenger.t0.f26931b.getSharedPreferences("themeconfig", 0).edit().remove(d6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), d6Var.f28883a).delete();
        new File(org.telegram.messenger.t0.h(), d6Var.f28884b).delete();
    }

    public final String b() {
        if (this.f28897q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28896p.f29232a);
            sb2.append("_");
            return a8.p0.n(this.f28897q.f29096a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f28896p.f29232a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f26931b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f28883a);
            jSONObject.put("owall", this.f28884b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f28886e);
            jSONObject.put("pGrColor2", this.f28887f);
            jSONObject.put("pGrColor3", this.f28888g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f28885c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f28889i);
            jSONObject.put("wMotion", this.f28890j);
            jSONObject.put("pIntensity", this.f28891k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

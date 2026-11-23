package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public String f28849a = "";
    public String f28850b = "";
    public String f28851c = "";
    public int d;
    public int f28852e;
    public int f28853f;
    public int f28854g;
    public int h;
    public boolean f28855i;
    public boolean f28856j;
    public float f28857k;
    public long f28858l;
    public long f28859m;
    public long f28860n;
    public boolean f28861o;
    public l6 f28862p;
    public j6 f28863q;
    public float f28864r;
    public ArrayList f28865s;
    public TLRPC.WallPaper f28866t;

    public static void a(d6 d6Var) {
        org.telegram.messenger.t0.f26895b.getSharedPreferences("themeconfig", 0).edit().remove(d6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), d6Var.f28849a).delete();
        new File(org.telegram.messenger.t0.h(), d6Var.f28850b).delete();
    }

    public final String b() {
        if (this.f28863q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28862p.f29198a);
            sb2.append("_");
            return a8.p0.n(this.f28863q.f29062a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f28862p.f29198a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f26895b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f28849a);
            jSONObject.put("owall", this.f28850b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f28852e);
            jSONObject.put("pGrColor2", this.f28853f);
            jSONObject.put("pGrColor3", this.f28854g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f28851c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f28855i);
            jSONObject.put("wMotion", this.f28856j);
            jSONObject.put("pIntensity", this.f28857k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLRPC;
public final class m6 {
    public String f20589a = "";
    public String f20590b = "";
    public String f20591c = "";
    public int d;
    public int e;
    public int f20592f;
    public int f20593g;
    public int h;
    public boolean f20594i;
    public boolean f20595j;
    public float f20596k;
    public long f20597l;
    public long f20598m;
    public long f20599n;
    public boolean f20600o;
    public s6 f20601p;
    public r6 f20602q;
    public float f20603r;
    public ArrayList f20604s;
    public TLRPC.WallPaper f20605t;

    public static void a(m6 m6Var) {
        org.telegram.messenger.w0.f18945b.getSharedPreferences("themeconfig", 0).edit().remove(m6Var.b()).commit();
        new File(org.telegram.messenger.w0.h(), m6Var.f20589a).delete();
        new File(org.telegram.messenger.w0.h(), m6Var.f20590b).delete();
    }

    public final String b() {
        if (this.f20602q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20601p.f20802a);
            sb2.append("_");
            return a1.g.p(sb2, this.f20602q.f20731a, "_owp");
        }
        return a1.g.r(new StringBuilder(), this.f20601p.f20802a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.w0.f18945b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20589a);
            jSONObject.put("owall", this.f20590b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20592f);
            jSONObject.put("pGrColor3", this.f20593g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20591c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20594i);
            jSONObject.put("wMotion", this.f20595j);
            jSONObject.put("pIntensity", this.f20596k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }
}

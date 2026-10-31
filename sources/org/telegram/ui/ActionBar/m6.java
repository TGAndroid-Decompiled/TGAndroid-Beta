package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLRPC;
public final class m6 {
    public String f20588a = "";
    public String f20589b = "";
    public String f20590c = "";
    public int d;
    public int e;
    public int f20591f;
    public int f20592g;
    public int h;
    public boolean f20593i;
    public boolean f20594j;
    public float f20595k;
    public long f20596l;
    public long f20597m;
    public long f20598n;
    public boolean f20599o;
    public s6 f20600p;
    public r6 f20601q;
    public float f20602r;
    public ArrayList f20603s;
    public TLRPC.WallPaper f20604t;

    public static void a(m6 m6Var) {
        org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0).edit().remove(m6Var.b()).commit();
        new File(org.telegram.messenger.w0.h(), m6Var.f20588a).delete();
        new File(org.telegram.messenger.w0.h(), m6Var.f20589b).delete();
    }

    public final String b() {
        if (this.f20601q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20600p.f20801a);
            sb2.append("_");
            return a1.g.p(sb2, this.f20601q.f20730a, "_owp");
        }
        return a1.g.r(new StringBuilder(), this.f20600p.f20801a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20588a);
            jSONObject.put("owall", this.f20589b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20591f);
            jSONObject.put("pGrColor3", this.f20592g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20590c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20593i);
            jSONObject.put("wMotion", this.f20594j);
            jSONObject.put("pIntensity", this.f20595k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }
}

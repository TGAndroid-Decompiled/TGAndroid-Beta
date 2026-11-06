package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class c6 {
    public String f27399a = "";
    public String f27400b = "";
    public String f27401c = "";
    public int d;
    public int f27402e;
    public int f27403f;
    public int f27404g;
    public int h;
    public boolean f27405i;
    public boolean f27406j;
    public float f27407k;
    public long f27408l;
    public long f27409m;
    public long f27410n;
    public boolean f27411o;
    public j6 f27412p;
    public h6 f27413q;
    public float f27414r;
    public ArrayList f27415s;
    public TLRPC.WallPaper f27416t;

    public static void a(c6 c6Var) {
        org.telegram.messenger.t0.f25563b.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), c6Var.f27399a).delete();
        new File(org.telegram.messenger.t0.h(), c6Var.f27400b).delete();
    }

    public final String b() {
        if (this.f27413q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27412p.f27626a);
            sb2.append("_");
            return a8.p0.n(this.f27413q.f27516a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f27412p.f27626a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f25563b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f27399a);
            jSONObject.put("owall", this.f27400b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f27402e);
            jSONObject.put("pGrColor2", this.f27403f);
            jSONObject.put("pGrColor3", this.f27404g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f27401c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f27405i);
            jSONObject.put("wMotion", this.f27406j);
            jSONObject.put("pIntensity", this.f27407k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

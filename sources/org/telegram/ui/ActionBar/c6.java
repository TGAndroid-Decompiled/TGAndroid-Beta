package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class c6 {
    public String f27398a = "";
    public String f27399b = "";
    public String f27400c = "";
    public int d;
    public int f27401e;
    public int f27402f;
    public int f27403g;
    public int h;
    public boolean f27404i;
    public boolean f27405j;
    public float f27406k;
    public long f27407l;
    public long f27408m;
    public long f27409n;
    public boolean f27410o;
    public j6 f27411p;
    public h6 f27412q;
    public float f27413r;
    public ArrayList f27414s;
    public TLRPC.WallPaper f27415t;

    public static void a(c6 c6Var) {
        org.telegram.messenger.t0.f25555b.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), c6Var.f27398a).delete();
        new File(org.telegram.messenger.t0.h(), c6Var.f27399b).delete();
    }

    public final String b() {
        if (this.f27412q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27411p.f27625a);
            sb2.append("_");
            return a8.p0.n(this.f27412q.f27515a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f27411p.f27625a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f27398a);
            jSONObject.put("owall", this.f27399b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f27401e);
            jSONObject.put("pGrColor2", this.f27402f);
            jSONObject.put("pGrColor3", this.f27403g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f27400c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f27404i);
            jSONObject.put("wMotion", this.f27405j);
            jSONObject.put("pIntensity", this.f27406k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

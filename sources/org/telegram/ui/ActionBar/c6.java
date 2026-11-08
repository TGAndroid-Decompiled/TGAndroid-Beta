package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class c6 {
    public String f27402a = "";
    public String f27403b = "";
    public String f27404c = "";
    public int d;
    public int f27405e;
    public int f27406f;
    public int f27407g;
    public int h;
    public boolean f27408i;
    public boolean f27409j;
    public float f27410k;
    public long f27411l;
    public long f27412m;
    public long f27413n;
    public boolean f27414o;
    public j6 f27415p;
    public h6 f27416q;
    public float f27417r;
    public ArrayList f27418s;
    public TLRPC.WallPaper f27419t;

    public static void a(c6 c6Var) {
        org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), c6Var.f27402a).delete();
        new File(org.telegram.messenger.t0.h(), c6Var.f27403b).delete();
    }

    public final String b() {
        if (this.f27416q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27415p.f27629a);
            sb2.append("_");
            return a8.p0.n(this.f27416q.f27519a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f27415p.f27629a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f27402a);
            jSONObject.put("owall", this.f27403b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f27405e);
            jSONObject.put("pGrColor2", this.f27406f);
            jSONObject.put("pGrColor3", this.f27407g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f27404c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f27408i);
            jSONObject.put("wMotion", this.f27409j);
            jSONObject.put("pIntensity", this.f27410k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

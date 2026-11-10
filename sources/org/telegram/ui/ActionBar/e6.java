package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class e6 {
    public String f27448a = "";
    public String f27449b = "";
    public String f27450c = "";
    public int d;
    public int f27451e;
    public int f27452f;
    public int f27453g;
    public int h;
    public boolean f27454i;
    public boolean f27455j;
    public float f27456k;
    public long f27457l;
    public long f27458m;
    public long f27459n;
    public boolean f27460o;
    public l6 f27461p;
    public j6 f27462q;
    public float f27463r;
    public ArrayList f27464s;
    public TLRPC.WallPaper f27465t;

    public static void a(e6 e6Var) {
        org.telegram.messenger.t0.f25570b.getSharedPreferences("themeconfig", 0).edit().remove(e6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), e6Var.f27448a).delete();
        new File(org.telegram.messenger.t0.h(), e6Var.f27449b).delete();
    }

    public final String b() {
        if (this.f27462q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27461p.f27765a);
            sb2.append("_");
            return a8.p0.n(this.f27462q.f27609a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f27461p.f27765a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f25570b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f27448a);
            jSONObject.put("owall", this.f27449b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f27451e);
            jSONObject.put("pGrColor2", this.f27452f);
            jSONObject.put("pGrColor3", this.f27453g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f27450c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f27454i);
            jSONObject.put("wMotion", this.f27455j);
            jSONObject.put("pIntensity", this.f27456k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

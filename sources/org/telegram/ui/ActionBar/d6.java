package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public String f28880a = "";
    public String f28881b = "";
    public String f28882c = "";
    public int d;
    public int f28883e;
    public int f28884f;
    public int f28885g;
    public int h;
    public boolean f28886i;
    public boolean f28887j;
    public float f28888k;
    public long f28889l;
    public long f28890m;
    public long f28891n;
    public boolean f28892o;
    public l6 f28893p;
    public j6 f28894q;
    public float f28895r;
    public ArrayList f28896s;
    public TLRPC.WallPaper f28897t;

    public static void a(d6 d6Var) {
        org.telegram.messenger.t0.f26941b.getSharedPreferences("themeconfig", 0).edit().remove(d6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), d6Var.f28880a).delete();
        new File(org.telegram.messenger.t0.h(), d6Var.f28881b).delete();
    }

    public final String b() {
        if (this.f28894q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28893p.f29229a);
            sb2.append("_");
            return a8.p0.n(this.f28894q.f29093a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f28893p.f29229a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f26941b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f28880a);
            jSONObject.put("owall", this.f28881b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f28883e);
            jSONObject.put("pGrColor2", this.f28884f);
            jSONObject.put("pGrColor3", this.f28885g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f28882c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f28886i);
            jSONObject.put("wMotion", this.f28887j);
            jSONObject.put("pIntensity", this.f28888k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

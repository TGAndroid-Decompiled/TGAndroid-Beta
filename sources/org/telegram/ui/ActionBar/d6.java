package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public String f27428a = "";
    public String f27429b = "";
    public String f27430c = "";
    public int d;
    public int f27431e;
    public int f27432f;
    public int f27433g;
    public int h;
    public boolean f27434i;
    public boolean f27435j;
    public float f27436k;
    public long f27437l;
    public long f27438m;
    public long f27439n;
    public boolean f27440o;
    public k6 f27441p;
    public i6 f27442q;
    public float f27443r;
    public ArrayList f27444s;
    public TLRPC.WallPaper f27445t;

    public static void a(d6 d6Var) {
        org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0).edit().remove(d6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), d6Var.f27428a).delete();
        new File(org.telegram.messenger.t0.h(), d6Var.f27429b).delete();
    }

    public final String b() {
        if (this.f27442q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27441p.f27736a);
            sb2.append("_");
            return a8.p0.n(this.f27442q.f27571a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f27441p.f27736a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f27428a);
            jSONObject.put("owall", this.f27429b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f27431e);
            jSONObject.put("pGrColor2", this.f27432f);
            jSONObject.put("pGrColor3", this.f27433g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f27430c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f27434i);
            jSONObject.put("wMotion", this.f27435j);
            jSONObject.put("pIntensity", this.f27436k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

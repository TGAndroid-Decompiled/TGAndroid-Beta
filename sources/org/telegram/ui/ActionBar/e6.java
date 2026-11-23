package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class e6 {
    public String f28980a = "";
    public String f28981b = "";
    public String f28982c = "";
    public int d;
    public int f28983e;
    public int f28984f;
    public int f28985g;
    public int h;
    public boolean f28986i;
    public boolean f28987j;
    public float f28988k;
    public long f28989l;
    public long f28990m;
    public long f28991n;
    public boolean f28992o;
    public m6 f28993p;
    public k6 f28994q;
    public float f28995r;
    public ArrayList f28996s;
    public TLRPC.WallPaper f28997t;

    public static void a(e6 e6Var) {
        org.telegram.messenger.t0.f27013b.getSharedPreferences("themeconfig", 0).edit().remove(e6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), e6Var.f28980a).delete();
        new File(org.telegram.messenger.t0.h(), e6Var.f28981b).delete();
    }

    public final String b() {
        if (this.f28994q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28993p.f29320a);
            sb2.append("_");
            return a8.p0.n(this.f28994q.f29224a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f28993p.f29320a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f28980a);
            jSONObject.put("owall", this.f28981b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f28983e);
            jSONObject.put("pGrColor2", this.f28984f);
            jSONObject.put("pGrColor3", this.f28985g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f28982c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f28986i);
            jSONObject.put("wMotion", this.f28987j);
            jSONObject.put("pIntensity", this.f28988k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

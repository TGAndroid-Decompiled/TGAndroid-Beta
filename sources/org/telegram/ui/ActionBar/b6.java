package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f27422a = "";
    public String f27423b = "";
    public String f27424c = "";
    public int d;
    public int f27425e;
    public int f27426f;
    public int f27427g;
    public int h;
    public boolean f27428i;
    public boolean f27429j;
    public float f27430k;
    public long f27431l;
    public long f27432m;
    public long f27433n;
    public boolean f27434o;
    public j6 f27435p;
    public g6 f27436q;
    public float f27437r;
    public ArrayList f27438s;
    public TLRPC.WallPaper f27439t;

    public static void a(b6 b6Var) {
        org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), b6Var.f27422a).delete();
        new File(org.telegram.messenger.t0.h(), b6Var.f27423b).delete();
    }

    public final String b() {
        if (this.f27436q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27435p.f27675a);
            sb2.append("_");
            return a1.g.o(this.f27436q.f27525a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f27435p.f27675a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f27422a);
            jSONObject.put("owall", this.f27423b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f27425e);
            jSONObject.put("pGrColor2", this.f27426f);
            jSONObject.put("pGrColor3", this.f27427g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f27424c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f27428i);
            jSONObject.put("wMotion", this.f27429j);
            jSONObject.put("pIntensity", this.f27430k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

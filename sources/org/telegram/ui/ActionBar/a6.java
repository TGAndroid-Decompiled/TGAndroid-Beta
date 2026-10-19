package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20614a = "";
    public String f20615b = "";
    public String f20616c = "";
    public int d;
    public int e;
    public int f20617f;
    public int f20618g;
    public int h;
    public boolean f20619i;
    public boolean f20620j;
    public float f20621k;
    public long f20622l;
    public long f20623m;
    public long f20624n;
    public boolean f20625o;
    public g6 f20626p;
    public f6 f20627q;
    public float f20628r;
    public ArrayList f20629s;
    public TLRPC.WallPaper f20630t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20614a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20615b).delete();
    }

    public final String b() {
        if (this.f20627q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20626p.f20878a);
            sb2.append("_");
            return a1.g.n(this.f20627q.f20829a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20626p.f20878a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20614a);
            jSONObject.put("owall", this.f20615b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20617f);
            jSONObject.put("pGrColor3", this.f20618g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20616c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20619i);
            jSONObject.put("wMotion", this.f20620j);
            jSONObject.put("pIntensity", this.f20621k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

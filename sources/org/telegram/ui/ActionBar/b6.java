package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f20463a = "";
    public String f20464b = "";
    public String f20465c = "";
    public int d;
    public int f20466e;
    public int f20467f;
    public int f20468g;
    public int h;
    public boolean f20469i;
    public boolean f20470j;
    public float f20471k;
    public long f20472l;
    public long f20473m;
    public long f20474n;
    public boolean f20475o;
    public h6 f20476p;
    public g6 f20477q;
    public float f20478r;
    public ArrayList f20479s;
    public TLRPC.WallPaper f20480t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20463a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20464b).delete();
    }

    public final String b() {
        if (this.f20477q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20476p.f20703a);
            sb2.append("_");
            return a1.g.o(this.f20477q.f20653a, "_owp", sb2);
        }
        return a1.g.t(new StringBuilder(), this.f20476p.f20703a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20463a);
            jSONObject.put("owall", this.f20464b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20466e);
            jSONObject.put("pGrColor2", this.f20467f);
            jSONObject.put("pGrColor3", this.f20468g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20465c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20469i);
            jSONObject.put("wMotion", this.f20470j);
            jSONObject.put("pIntensity", this.f20471k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

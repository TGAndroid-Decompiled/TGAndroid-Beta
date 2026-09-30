package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f19975a = "";
    public String f19976b = "";
    public String f19977c = "";
    public int d;
    public int e;
    public int f19978f;
    public int f19979g;
    public int h;
    public boolean f19980i;
    public boolean f19981j;
    public float f19982k;
    public long f19983l;
    public long f19984m;
    public long f19985n;
    public boolean f19986o;
    public g6 f19987p;
    public f6 f19988q;
    public float f19989r;
    public ArrayList f19990s;
    public TLRPC.WallPaper f19991t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19975a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19976b).delete();
    }

    public final String b() {
        if (this.f19988q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19987p.f18949a);
            sb2.append("_");
            return a4.a.o(this.f19988q.f18902a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f19987p.f18949a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f19975a);
            jSONObject.put("owall", this.f19976b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f19978f);
            jSONObject.put("pGrColor3", this.f19979g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f19977c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f19980i);
            jSONObject.put("wMotion", this.f19981j);
            jSONObject.put("pIntensity", this.f19982k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

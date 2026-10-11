package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f21721a = "";
    public String f21722b = "";
    public String f21723c = "";
    public int d;
    public int f21724e;
    public int f21725f;
    public int f21726g;
    public int h;
    public boolean f21727i;
    public boolean f21728j;
    public float f21729k;
    public long f21730l;
    public long f21731m;
    public long f21732n;
    public boolean f21733o;
    public g6 f21734p;
    public f6 f21735q;
    public float f21736r;
    public ArrayList f21737s;
    public TLRPC.WallPaper f21738t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21721a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21722b).delete();
    }

    public final String b() {
        if (this.f21735q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f21734p.f20655a);
            sb2.append("_");
            return a1.g.o(this.f21735q.f20606a, "_owp", sb2);
        }
        return a1.g.t(new StringBuilder(), this.f21734p.f20655a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f21721a);
            jSONObject.put("owall", this.f21722b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f21724e);
            jSONObject.put("pGrColor2", this.f21725f);
            jSONObject.put("pGrColor3", this.f21726g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f21723c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f21727i);
            jSONObject.put("wMotion", this.f21728j);
            jSONObject.put("pIntensity", this.f21729k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

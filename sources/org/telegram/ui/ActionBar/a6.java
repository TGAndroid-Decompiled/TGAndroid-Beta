package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20613a = "";
    public String f20614b = "";
    public String f20615c = "";
    public int d;
    public int e;
    public int f20616f;
    public int f20617g;
    public int h;
    public boolean f20618i;
    public boolean f20619j;
    public float f20620k;
    public long f20621l;
    public long f20622m;
    public long f20623n;
    public boolean f20624o;
    public g6 f20625p;
    public f6 f20626q;
    public float f20627r;
    public ArrayList f20628s;
    public TLRPC.WallPaper f20629t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20613a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20614b).delete();
    }

    public final String b() {
        if (this.f20626q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20625p.f20877a);
            sb2.append("_");
            return a1.g.n(this.f20626q.f20828a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20625p.f20877a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20613a);
            jSONObject.put("owall", this.f20614b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20616f);
            jSONObject.put("pGrColor3", this.f20617g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20615c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20618i);
            jSONObject.put("wMotion", this.f20619j);
            jSONObject.put("pIntensity", this.f20620k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

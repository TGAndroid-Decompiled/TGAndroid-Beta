package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f20547a = "";
    public String f20548b = "";
    public String f20549c = "";
    public int d;
    public int e;
    public int f20550f;
    public int f20551g;
    public int h;
    public boolean f20552i;
    public boolean f20553j;
    public float f20554k;
    public long f20555l;
    public long f20556m;
    public long f20557n;
    public boolean f20558o;
    public f6 f20559p;
    public e6 f20560q;
    public float f20561r;
    public ArrayList f20562s;
    public TLRPC.WallPaper f20563t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f20547a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f20548b).delete();
    }

    public final String b() {
        if (this.f20560q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20559p.f19491a);
            sb2.append("_");
            return a1.g.n(this.f20560q.f19445a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20559p.f19491a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20547a);
            jSONObject.put("owall", this.f20548b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20550f);
            jSONObject.put("pGrColor3", this.f20551g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20549c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20552i);
            jSONObject.put("wMotion", this.f20553j);
            jSONObject.put("pIntensity", this.f20554k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

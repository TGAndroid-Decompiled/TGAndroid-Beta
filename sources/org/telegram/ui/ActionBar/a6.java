package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20617a = "";
    public String f20618b = "";
    public String f20619c = "";
    public int d;
    public int e;
    public int f20620f;
    public int f20621g;
    public int h;
    public boolean f20622i;
    public boolean f20623j;
    public float f20624k;
    public long f20625l;
    public long f20626m;
    public long f20627n;
    public boolean f20628o;
    public g6 f20629p;
    public f6 f20630q;
    public float f20631r;
    public ArrayList f20632s;
    public TLRPC.WallPaper f20633t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20617a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20618b).delete();
    }

    public final String b() {
        if (this.f20630q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20629p.f20881a);
            sb2.append("_");
            return a1.g.n(this.f20630q.f20832a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20629p.f20881a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20617a);
            jSONObject.put("owall", this.f20618b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20620f);
            jSONObject.put("pGrColor3", this.f20621g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20619c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20622i);
            jSONObject.put("wMotion", this.f20623j);
            jSONObject.put("pIntensity", this.f20624k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

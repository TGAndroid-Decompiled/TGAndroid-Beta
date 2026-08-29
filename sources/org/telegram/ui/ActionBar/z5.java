package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f24018a = "";
    public String f24019b = "";
    public String f24020c = "";
    public int d;
    public int f24021e;
    public int f24022f;
    public int f24023g;
    public int h;
    public boolean f24024i;
    public boolean f24025j;
    public float f24026k;
    public long f24027l;
    public long f24028m;
    public long f24029n;
    public boolean f24030o;
    public f6 f24031p;
    public e6 f24032q;
    public float f24033r;
    public ArrayList f24034s;
    public TLRPC.WallPaper f24035t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f24018a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f24019b).delete();
    }

    public final String b() {
        if (this.f24032q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f24031p.f22941a);
            sb2.append("_");
            return a4.w.l(this.f24032q.f22902a, "_owp", sb2);
        }
        return a4.w.q(new StringBuilder(), this.f24031p.f22941a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f24018a);
            jSONObject.put("owall", this.f24019b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f24021e);
            jSONObject.put("pGrColor2", this.f24022f);
            jSONObject.put("pGrColor3", this.f24023g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f24020c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f24024i);
            jSONObject.put("wMotion", this.f24025j);
            jSONObject.put("pIntensity", this.f24026k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

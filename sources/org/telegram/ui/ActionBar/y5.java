package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class y5 {
    public String f23980a = "";
    public String f23981b = "";
    public String f23982c = "";
    public int d;
    public int f23983e;
    public int f23984f;
    public int f23985g;
    public int h;
    public boolean f23986i;
    public boolean f23987j;
    public float f23988k;
    public long f23989l;
    public long f23990m;
    public long f23991n;
    public boolean f23992o;
    public e6 f23993p;
    public d6 f23994q;
    public float f23995r;
    public ArrayList f23996s;
    public TLRPC.WallPaper f23997t;

    public static void a(y5 y5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(y5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), y5Var.f23980a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), y5Var.f23981b).delete();
    }

    public final String b() {
        if (this.f23994q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f23993p.f22906a);
            sb2.append("_");
            return aa.d.l(this.f23994q.f22866a, "_owp", sb2);
        }
        return aa.d.r(new StringBuilder(), this.f23993p.f22906a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f23980a);
            jSONObject.put("owall", this.f23981b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f23983e);
            jSONObject.put("pGrColor2", this.f23984f);
            jSONObject.put("pGrColor3", this.f23985g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f23982c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f23986i);
            jSONObject.put("wMotion", this.f23987j);
            jSONObject.put("pIntensity", this.f23988k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }
}

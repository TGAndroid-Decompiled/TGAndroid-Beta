package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class c6 {
    public String f18537a = "";
    public String f18538b = "";
    public String f18539c = "";
    public int d;
    public int e;
    public int f18540f;
    public int f18541g;
    public int h;
    public boolean f18542i;
    public boolean f18543j;
    public float f18544k;
    public long f18545l;
    public long f18546m;
    public long f18547n;
    public boolean f18548o;
    public i6 f18549p;
    public h6 f18550q;
    public float f18551r;
    public ArrayList f18552s;
    public TLRPC.WallPaper f18553t;

    public static void a(c6 c6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f18537a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f18538b).delete();
    }

    public final String b() {
        if (this.f18550q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18549p.f18756a);
            sb2.append("_");
            return a4.a.n(this.f18550q.f18720a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f18549p.f18756a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18537a);
            jSONObject.put("owall", this.f18538b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18540f);
            jSONObject.put("pGrColor3", this.f18541g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18539c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18542i);
            jSONObject.put("wMotion", this.f18543j);
            jSONObject.put("pIntensity", this.f18544k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f20274a = "";
    public String f20275b = "";
    public String f20276c = "";
    public int d;
    public int f20277e;
    public int f20278f;
    public int f20279g;
    public int h;
    public boolean f20280i;
    public boolean f20281j;
    public float f20282k;
    public long f20283l;
    public long f20284m;
    public long f20285n;
    public boolean f20286o;
    public i6 f20287p;
    public h6 f20288q;
    public float f20289r;
    public ArrayList f20290s;
    public TLRPC.WallPaper f20291t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20274a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20275b).delete();
    }

    public final String b() {
        if (this.f20288q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20287p.f20540a);
            sb2.append("_");
            return a4.a.n(this.f20288q.f20490a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f20287p.f20540a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20274a);
            jSONObject.put("owall", this.f20275b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20277e);
            jSONObject.put("pGrColor2", this.f20278f);
            jSONObject.put("pGrColor3", this.f20279g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20276c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20280i);
            jSONObject.put("wMotion", this.f20281j);
            jSONObject.put("pIntensity", this.f20282k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

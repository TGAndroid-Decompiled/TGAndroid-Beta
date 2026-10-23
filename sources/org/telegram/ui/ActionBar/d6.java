package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public String f20815a = "";
    public String f20816b = "";
    public String f20817c = "";
    public int d;
    public int e;
    public int f20818f;
    public int f20819g;
    public int h;
    public boolean f20820i;
    public boolean f20821j;
    public float f20822k;
    public long f20823l;
    public long f20824m;
    public long f20825n;
    public boolean f20826o;
    public j6 f20827p;
    public i6 f20828q;
    public float f20829r;
    public ArrayList f20830s;
    public TLRPC.WallPaper f20831t;

    public static void a(d6 d6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(d6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), d6Var.f20815a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), d6Var.f20816b).delete();
    }

    public final String b() {
        if (this.f20828q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20827p.f21019a);
            sb2.append("_");
            return a1.g.n(this.f20828q.f20964a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20827p.f21019a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20815a);
            jSONObject.put("owall", this.f20816b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20818f);
            jSONObject.put("pGrColor3", this.f20819g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20817c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20820i);
            jSONObject.put("wMotion", this.f20821j);
            jSONObject.put("pIntensity", this.f20822k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

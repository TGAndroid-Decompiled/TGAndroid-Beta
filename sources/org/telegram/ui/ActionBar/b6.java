package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f18508a = "";
    public String f18509b = "";
    public String f18510c = "";
    public int d;
    public int e;
    public int f18511f;
    public int f18512g;
    public int h;
    public boolean f18513i;
    public boolean f18514j;
    public float f18515k;
    public long f18516l;
    public long f18517m;
    public long f18518n;
    public boolean f18519o;
    public h6 f18520p;
    public g6 f18521q;
    public float f18522r;
    public ArrayList f18523s;
    public TLRPC.WallPaper f18524t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18508a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18509b).delete();
    }

    public final String b() {
        if (this.f18521q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18520p.f18729a);
            sb2.append("_");
            return a4.a.n(this.f18521q.f18692a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f18520p.f18729a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18508a);
            jSONObject.put("owall", this.f18509b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18511f);
            jSONObject.put("pGrColor3", this.f18512g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18510c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18513i);
            jSONObject.put("wMotion", this.f18514j);
            jSONObject.put("pIntensity", this.f18515k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

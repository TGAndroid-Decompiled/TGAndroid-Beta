package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f18692a = "";
    public String f18693b = "";
    public String f18694c = "";
    public int d;
    public int e;
    public int f18695f;
    public int f18696g;
    public int h;
    public boolean f18697i;
    public boolean f18698j;
    public float f18699k;
    public long f18700l;
    public long f18701m;
    public long f18702n;
    public boolean f18703o;
    public h6 f18704p;
    public g6 f18705q;
    public float f18706r;
    public ArrayList f18707s;
    public TLRPC.WallPaper f18708t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18692a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18693b).delete();
    }

    public final String b() {
        if (this.f18705q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18704p.f18951a);
            sb2.append("_");
            return a4.a.n(this.f18705q.f18906a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f18704p.f18951a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18692a);
            jSONObject.put("owall", this.f18693b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18695f);
            jSONObject.put("pGrColor3", this.f18696g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18694c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18697i);
            jSONObject.put("wMotion", this.f18698j);
            jSONObject.put("pIntensity", this.f18699k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f18693a = "";
    public String f18694b = "";
    public String f18695c = "";
    public int d;
    public int e;
    public int f18696f;
    public int f18697g;
    public int h;
    public boolean f18698i;
    public boolean f18699j;
    public float f18700k;
    public long f18701l;
    public long f18702m;
    public long f18703n;
    public boolean f18704o;
    public i6 f18705p;
    public g6 f18706q;
    public float f18707r;
    public ArrayList f18708s;
    public TLRPC.WallPaper f18709t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18693a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18694b).delete();
    }

    public final String b() {
        if (this.f18706q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18705p.f18941a);
            sb2.append("_");
            return a4.a.n(this.f18706q.f18877a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f18705p.f18941a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18693a);
            jSONObject.put("owall", this.f18694b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18696f);
            jSONObject.put("pGrColor3", this.f18697g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18695c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18698i);
            jSONObject.put("wMotion", this.f18699j);
            jSONObject.put("pIntensity", this.f18700k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

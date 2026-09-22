package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f18506a = "";
    public String f18507b = "";
    public String f18508c = "";
    public int d;
    public int e;
    public int f18509f;
    public int f18510g;
    public int h;
    public boolean f18511i;
    public boolean f18512j;
    public float f18513k;
    public long f18514l;
    public long f18515m;
    public long f18516n;
    public boolean f18517o;
    public h6 f18518p;
    public g6 f18519q;
    public float f18520r;
    public ArrayList f18521s;
    public TLRPC.WallPaper f18522t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18506a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18507b).delete();
    }

    public final String b() {
        if (this.f18519q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18518p.f18727a);
            sb2.append("_");
            return a4.a.o(this.f18519q.f18690a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f18518p.f18727a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18506a);
            jSONObject.put("owall", this.f18507b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18509f);
            jSONObject.put("pGrColor3", this.f18510g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18508c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18511i);
            jSONObject.put("wMotion", this.f18512j);
            jSONObject.put("pIntensity", this.f18513k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

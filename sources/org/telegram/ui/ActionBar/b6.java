package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f20467a = "";
    public String f20468b = "";
    public String f20469c = "";
    public int d;
    public int f20470e;
    public int f20471f;
    public int f20472g;
    public int h;
    public boolean f20473i;
    public boolean f20474j;
    public float f20475k;
    public long f20476l;
    public long f20477m;
    public long f20478n;
    public boolean f20479o;
    public h6 f20480p;
    public g6 f20481q;
    public float f20482r;
    public ArrayList f20483s;
    public TLRPC.WallPaper f20484t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20467a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20468b).delete();
    }

    public final String b() {
        if (this.f20481q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20480p.f20707a);
            sb2.append("_");
            return a1.g.o(this.f20481q.f20657a, "_owp", sb2);
        }
        return a1.g.t(new StringBuilder(), this.f20480p.f20707a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20467a);
            jSONObject.put("owall", this.f20468b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20470e);
            jSONObject.put("pGrColor2", this.f20471f);
            jSONObject.put("pGrColor3", this.f20472g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20469c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20473i);
            jSONObject.put("wMotion", this.f20474j);
            jSONObject.put("pIntensity", this.f20475k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

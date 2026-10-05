package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20394a = "";
    public String f20395b = "";
    public String f20396c = "";
    public int d;
    public int f20397e;
    public int f20398f;
    public int f20399g;
    public int h;
    public boolean f20400i;
    public boolean f20401j;
    public float f20402k;
    public long f20403l;
    public long f20404m;
    public long f20405n;
    public boolean f20406o;
    public h6 f20407p;
    public f6 f20408q;
    public float f20409r;
    public ArrayList f20410s;
    public TLRPC.WallPaper f20411t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20394a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20395b).delete();
    }

    public final String b() {
        if (this.f20408q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20407p.f20697a);
            sb2.append("_");
            return a4.a.o(this.f20408q.f20620a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f20407p.f20697a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20394a);
            jSONObject.put("owall", this.f20395b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20397e);
            jSONObject.put("pGrColor2", this.f20398f);
            jSONObject.put("pGrColor3", this.f20399g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20396c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20400i);
            jSONObject.put("wMotion", this.f20401j);
            jSONObject.put("pIntensity", this.f20402k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

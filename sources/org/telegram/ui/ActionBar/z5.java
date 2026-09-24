package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f19944a = "";
    public String f19945b = "";
    public String f19946c = "";
    public int d;
    public int e;
    public int f19947f;
    public int f19948g;
    public int h;
    public boolean f19949i;
    public boolean f19950j;
    public float f19951k;
    public long f19952l;
    public long f19953m;
    public long f19954n;
    public boolean f19955o;
    public g6 f19956p;
    public f6 f19957q;
    public float f19958r;
    public ArrayList f19959s;
    public TLRPC.WallPaper f19960t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19944a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19945b).delete();
    }

    public final String b() {
        if (this.f19957q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19956p.f18918a);
            sb2.append("_");
            return a4.a.o(this.f19957q.f18871a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f19956p.f18918a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f19944a);
            jSONObject.put("owall", this.f19945b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f19947f);
            jSONObject.put("pGrColor3", this.f19948g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f19946c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f19949i);
            jSONObject.put("wMotion", this.f19950j);
            jSONObject.put("pIntensity", this.f19951k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

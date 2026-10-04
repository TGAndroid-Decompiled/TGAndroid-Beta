package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20389a = "";
    public String f20390b = "";
    public String f20391c = "";
    public int d;
    public int f20392e;
    public int f20393f;
    public int f20394g;
    public int h;
    public boolean f20395i;
    public boolean f20396j;
    public float f20397k;
    public long f20398l;
    public long f20399m;
    public long f20400n;
    public boolean f20401o;
    public h6 f20402p;
    public f6 f20403q;
    public float f20404r;
    public ArrayList f20405s;
    public TLRPC.WallPaper f20406t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20389a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20390b).delete();
    }

    public final String b() {
        if (this.f20403q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20402p.f20692a);
            sb2.append("_");
            return a4.a.o(this.f20403q.f20615a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f20402p.f20692a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20389a);
            jSONObject.put("owall", this.f20390b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20392e);
            jSONObject.put("pGrColor2", this.f20393f);
            jSONObject.put("pGrColor3", this.f20394g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20391c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20395i);
            jSONObject.put("wMotion", this.f20396j);
            jSONObject.put("pIntensity", this.f20397k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

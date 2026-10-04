package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20385a = "";
    public String f20386b = "";
    public String f20387c = "";
    public int d;
    public int f20388e;
    public int f20389f;
    public int f20390g;
    public int h;
    public boolean f20391i;
    public boolean f20392j;
    public float f20393k;
    public long f20394l;
    public long f20395m;
    public long f20396n;
    public boolean f20397o;
    public h6 f20398p;
    public f6 f20399q;
    public float f20400r;
    public ArrayList f20401s;
    public TLRPC.WallPaper f20402t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20385a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20386b).delete();
    }

    public final String b() {
        if (this.f20399q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20398p.f20688a);
            sb2.append("_");
            return a4.a.n(this.f20399q.f20611a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f20398p.f20688a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20385a);
            jSONObject.put("owall", this.f20386b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20388e);
            jSONObject.put("pGrColor2", this.f20389f);
            jSONObject.put("pGrColor3", this.f20390g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20387c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20391i);
            jSONObject.put("wMotion", this.f20392j);
            jSONObject.put("pIntensity", this.f20393k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

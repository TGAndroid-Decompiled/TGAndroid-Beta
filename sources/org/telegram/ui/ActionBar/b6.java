package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f20301a = "";
    public String f20302b = "";
    public String f20303c = "";
    public int d;
    public int f20304e;
    public int f20305f;
    public int f20306g;
    public int h;
    public boolean f20307i;
    public boolean f20308j;
    public float f20309k;
    public long f20310l;
    public long f20311m;
    public long f20312n;
    public boolean f20313o;
    public i6 f20314p;
    public h6 f20315q;
    public float f20316r;
    public ArrayList f20317s;
    public TLRPC.WallPaper f20318t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20301a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20302b).delete();
    }

    public final String b() {
        if (this.f20315q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20314p.f20567a);
            sb2.append("_");
            return a4.a.n(this.f20315q.f20517a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f20314p.f20567a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20301a);
            jSONObject.put("owall", this.f20302b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20304e);
            jSONObject.put("pGrColor2", this.f20305f);
            jSONObject.put("pGrColor3", this.f20306g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20303c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20307i);
            jSONObject.put("wMotion", this.f20308j);
            jSONObject.put("pIntensity", this.f20309k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

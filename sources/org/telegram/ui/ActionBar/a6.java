package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20384a = "";
    public String f20385b = "";
    public String f20386c = "";
    public int d;
    public int f20387e;
    public int f20388f;
    public int f20389g;
    public int h;
    public boolean f20390i;
    public boolean f20391j;
    public float f20392k;
    public long f20393l;
    public long f20394m;
    public long f20395n;
    public boolean f20396o;
    public h6 f20397p;
    public f6 f20398q;
    public float f20399r;
    public ArrayList f20400s;
    public TLRPC.WallPaper f20401t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20384a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20385b).delete();
    }

    public final String b() {
        if (this.f20398q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20397p.f20687a);
            sb2.append("_");
            return a4.a.n(this.f20398q.f20610a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f20397p.f20687a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20384a);
            jSONObject.put("owall", this.f20385b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20387e);
            jSONObject.put("pGrColor2", this.f20388f);
            jSONObject.put("pGrColor3", this.f20389g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20386c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20390i);
            jSONObject.put("wMotion", this.f20391j);
            jSONObject.put("pIntensity", this.f20392k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

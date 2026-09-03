package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public String f21284a = "";
    public String f21285b = "";
    public String f21286c = "";
    public int d;
    public int f21287e;
    public int f21288f;
    public int f21289g;
    public int h;
    public boolean f21290i;
    public boolean f21291j;
    public float f21292k;
    public long f21293l;
    public long f21294m;
    public long f21295n;
    public boolean f21296o;
    public j6 f21297p;
    public i6 f21298q;
    public float f21299r;
    public ArrayList f21300s;
    public TLRPC.WallPaper f21301t;

    public static void a(d6 d6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(d6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), d6Var.f21284a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), d6Var.f21285b).delete();
    }

    public final String b() {
        if (this.f21298q != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21297p.f21505a);
            sb.append("_");
            return android.support.v4.media.a.m(this.f21298q.f21469a, "_owp", sb);
        }
        return android.support.v4.media.a.r(new StringBuilder(), this.f21297p.f21505a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f21284a);
            jSONObject.put("owall", this.f21285b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f21287e);
            jSONObject.put("pGrColor2", this.f21288f);
            jSONObject.put("pGrColor3", this.f21289g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f21286c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f21290i);
            jSONObject.put("wMotion", this.f21291j);
            jSONObject.put("pIntensity", this.f21292k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

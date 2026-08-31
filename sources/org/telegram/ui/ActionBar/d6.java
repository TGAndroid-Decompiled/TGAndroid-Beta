package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public String f21282a = "";
    public String f21283b = "";
    public String f21284c = "";
    public int d;
    public int f21285e;
    public int f21286f;
    public int f21287g;
    public int h;
    public boolean f21288i;
    public boolean f21289j;
    public float f21290k;
    public long f21291l;
    public long f21292m;
    public long f21293n;
    public boolean f21294o;
    public j6 f21295p;
    public i6 f21296q;
    public float f21297r;
    public ArrayList f21298s;
    public TLRPC.WallPaper f21299t;

    public static void a(d6 d6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(d6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), d6Var.f21282a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), d6Var.f21283b).delete();
    }

    public final String b() {
        if (this.f21296q != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21295p.f21503a);
            sb.append("_");
            return android.support.v4.media.a.m(this.f21296q.f21467a, "_owp", sb);
        }
        return android.support.v4.media.a.r(new StringBuilder(), this.f21295p.f21503a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f21282a);
            jSONObject.put("owall", this.f21283b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f21285e);
            jSONObject.put("pGrColor2", this.f21286f);
            jSONObject.put("pGrColor3", this.f21287g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f21284c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f21288i);
            jSONObject.put("wMotion", this.f21289j);
            jSONObject.put("pIntensity", this.f21290k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

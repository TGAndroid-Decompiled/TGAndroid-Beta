package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class c6 {
    public String f19529a = "";
    public String f19530b = "";
    public String f19531c = "";
    public int d;
    public int e;
    public int f19532f;
    public int f19533g;
    public int h;
    public boolean f19534i;
    public boolean f19535j;
    public float f19536k;
    public long f19537l;
    public long f19538m;
    public long f19539n;
    public boolean f19540o;
    public i6 f19541p;
    public h6 f19542q;
    public float f19543r;
    public ArrayList f19544s;
    public TLRPC.WallPaper f19545t;

    public static void a(c6 c6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f19529a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f19530b).delete();
    }

    public final String b() {
        if (this.f19542q != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19541p.f19780a);
            sb.append("_");
            return android.support.v4.media.a.m(this.f19542q.f19736a, "_owp", sb);
        }
        return android.support.v4.media.a.r(new StringBuilder(), this.f19541p.f19780a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f19529a);
            jSONObject.put("owall", this.f19530b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f19532f);
            jSONObject.put("pGrColor3", this.f19533g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f19531c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f19534i);
            jSONObject.put("wMotion", this.f19535j);
            jSONObject.put("pIntensity", this.f19536k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

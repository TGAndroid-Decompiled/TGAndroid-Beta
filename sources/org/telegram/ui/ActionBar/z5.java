package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f19958a = "";
    public String f19959b = "";
    public String f19960c = "";
    public int d;
    public int e;
    public int f19961f;
    public int f19962g;
    public int h;
    public boolean f19963i;
    public boolean f19964j;
    public float f19965k;
    public long f19966l;
    public long f19967m;
    public long f19968n;
    public boolean f19969o;
    public g6 f19970p;
    public f6 f19971q;
    public float f19972r;
    public ArrayList f19973s;
    public TLRPC.WallPaper f19974t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19958a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19959b).delete();
    }

    public final String b() {
        if (this.f19971q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19970p.f18932a);
            sb2.append("_");
            return a4.a.o(this.f19971q.f18885a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f19970p.f18932a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f19958a);
            jSONObject.put("owall", this.f19959b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f19961f);
            jSONObject.put("pGrColor3", this.f19962g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f19960c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f19963i);
            jSONObject.put("wMotion", this.f19964j);
            jSONObject.put("pIntensity", this.f19965k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

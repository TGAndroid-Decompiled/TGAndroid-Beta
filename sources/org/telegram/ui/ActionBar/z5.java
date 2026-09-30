package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f19960a = "";
    public String f19961b = "";
    public String f19962c = "";
    public int d;
    public int e;
    public int f19963f;
    public int f19964g;
    public int h;
    public boolean f19965i;
    public boolean f19966j;
    public float f19967k;
    public long f19968l;
    public long f19969m;
    public long f19970n;
    public boolean f19971o;
    public g6 f19972p;
    public f6 f19973q;
    public float f19974r;
    public ArrayList f19975s;
    public TLRPC.WallPaper f19976t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19960a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19961b).delete();
    }

    public final String b() {
        if (this.f19973q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19972p.f18934a);
            sb2.append("_");
            return a4.a.o(this.f19973q.f18887a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f19972p.f18934a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f19960a);
            jSONObject.put("owall", this.f19961b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f19963f);
            jSONObject.put("pGrColor3", this.f19964g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f19962c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f19965i);
            jSONObject.put("wMotion", this.f19966j);
            jSONObject.put("pIntensity", this.f19967k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

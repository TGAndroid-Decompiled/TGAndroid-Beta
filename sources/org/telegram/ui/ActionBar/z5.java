package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f19959a = "";
    public String f19960b = "";
    public String f19961c = "";
    public int d;
    public int e;
    public int f19962f;
    public int f19963g;
    public int h;
    public boolean f19964i;
    public boolean f19965j;
    public float f19966k;
    public long f19967l;
    public long f19968m;
    public long f19969n;
    public boolean f19970o;
    public g6 f19971p;
    public f6 f19972q;
    public float f19973r;
    public ArrayList f19974s;
    public TLRPC.WallPaper f19975t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19959a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f19960b).delete();
    }

    public final String b() {
        if (this.f19972q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19971p.f18933a);
            sb2.append("_");
            return a4.a.o(this.f19972q.f18886a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f19971p.f18933a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f19959a);
            jSONObject.put("owall", this.f19960b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f19962f);
            jSONObject.put("pGrColor3", this.f19963g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f19961c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f19964i);
            jSONObject.put("wMotion", this.f19965j);
            jSONObject.put("pIntensity", this.f19966k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

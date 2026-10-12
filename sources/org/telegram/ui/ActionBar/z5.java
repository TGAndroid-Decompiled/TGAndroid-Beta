package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f20847a = "";
    public String f20848b = "";
    public String f20849c = "";
    public int d;
    public int e;
    public int f20850f;
    public int f20851g;
    public int h;
    public boolean f20852i;
    public boolean f20853j;
    public float f20854k;
    public long f20855l;
    public long f20856m;
    public long f20857n;
    public boolean f20858o;
    public f6 f20859p;
    public e6 f20860q;
    public float f20861r;
    public ArrayList f20862s;
    public TLRPC.WallPaper f20863t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f20847a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f20848b).delete();
    }

    public final String b() {
        if (this.f20860q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20859p.f19791a);
            sb2.append("_");
            return a1.g.n(this.f20860q.f19745a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20859p.f19791a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20847a);
            jSONObject.put("owall", this.f20848b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20850f);
            jSONObject.put("pGrColor3", this.f20851g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20849c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20852i);
            jSONObject.put("wMotion", this.f20853j);
            jSONObject.put("pIntensity", this.f20854k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

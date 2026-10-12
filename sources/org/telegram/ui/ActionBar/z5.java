package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f21495a = "";
    public String f21496b = "";
    public String f21497c = "";
    public int d;
    public int f21498e;
    public int f21499f;
    public int f21500g;
    public int h;
    public boolean f21501i;
    public boolean f21502j;
    public float f21503k;
    public long f21504l;
    public long f21505m;
    public long f21506n;
    public boolean f21507o;
    public g6 f21508p;
    public e6 f21509q;
    public float f21510r;
    public ArrayList f21511s;
    public TLRPC.WallPaper f21512t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21495a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21496b).delete();
    }

    public final String b() {
        if (this.f21509q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f21508p.f20428a);
            sb2.append("_");
            return a1.g.o(this.f21509q.f20349a, "_owp", sb2);
        }
        return a1.g.t(new StringBuilder(), this.f21508p.f20428a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f21495a);
            jSONObject.put("owall", this.f21496b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f21498e);
            jSONObject.put("pGrColor2", this.f21499f);
            jSONObject.put("pGrColor3", this.f21500g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f21497c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f21501i);
            jSONObject.put("wMotion", this.f21502j);
            jSONObject.put("pIntensity", this.f21503k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

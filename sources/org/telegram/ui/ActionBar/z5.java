package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f21496a = "";
    public String f21497b = "";
    public String f21498c = "";
    public int d;
    public int f21499e;
    public int f21500f;
    public int f21501g;
    public int h;
    public boolean f21502i;
    public boolean f21503j;
    public float f21504k;
    public long f21505l;
    public long f21506m;
    public long f21507n;
    public boolean f21508o;
    public g6 f21509p;
    public e6 f21510q;
    public float f21511r;
    public ArrayList f21512s;
    public TLRPC.WallPaper f21513t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21496a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21497b).delete();
    }

    public final String b() {
        if (this.f21510q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f21509p.f20429a);
            sb2.append("_");
            return a1.g.o(this.f21510q.f20350a, "_owp", sb2);
        }
        return a1.g.t(new StringBuilder(), this.f21509p.f20429a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f21496a);
            jSONObject.put("owall", this.f21497b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f21499e);
            jSONObject.put("pGrColor2", this.f21500f);
            jSONObject.put("pGrColor3", this.f21501g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f21498c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f21502i);
            jSONObject.put("wMotion", this.f21503j);
            jSONObject.put("pIntensity", this.f21504k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

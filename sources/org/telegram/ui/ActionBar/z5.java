package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class z5 {
    public String f21757a = "";
    public String f21758b = "";
    public String f21759c = "";
    public int d;
    public int f21760e;
    public int f21761f;
    public int f21762g;
    public int h;
    public boolean f21763i;
    public boolean f21764j;
    public float f21765k;
    public long f21766l;
    public long f21767m;
    public long f21768n;
    public boolean f21769o;
    public g6 f21770p;
    public f6 f21771q;
    public float f21772r;
    public ArrayList f21773s;
    public TLRPC.WallPaper f21774t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21757a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f21758b).delete();
    }

    public final String b() {
        if (this.f21771q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f21770p.f20691a);
            sb2.append("_");
            return a1.g.o(this.f21771q.f20642a, "_owp", sb2);
        }
        return a1.g.t(new StringBuilder(), this.f21770p.f20691a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f21757a);
            jSONObject.put("owall", this.f21758b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f21760e);
            jSONObject.put("pGrColor2", this.f21761f);
            jSONObject.put("pGrColor3", this.f21762g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f21759c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f21763i);
            jSONObject.put("wMotion", this.f21764j);
            jSONObject.put("pIntensity", this.f21765k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

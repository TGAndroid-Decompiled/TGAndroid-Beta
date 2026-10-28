package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class r6 {
    public String f23051a = "";
    public String f23052b = "";
    public String f23053c = "";
    public int d;
    public int e;
    public int f23054f;
    public int f23055g;
    public int h;
    public boolean f23056i;
    public boolean f23057j;
    public float f23058k;
    public long f23059l;
    public long f23060m;
    public long f23061n;
    public boolean f23062o;
    public x6 f23063p;
    public w6 f23064q;
    public float f23065r;
    public ArrayList f23066s;
    public TLRPC.WallPaper f23067t;

    public static void a(r6 r6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(r6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), r6Var.f23051a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), r6Var.f23052b).delete();
    }

    public final String b() {
        if (this.f23064q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f23063p.f23252a);
            sb2.append("_");
            return a1.g.n(this.f23064q.f23216a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f23063p.f23252a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f23051a);
            jSONObject.put("owall", this.f23052b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f23054f);
            jSONObject.put("pGrColor3", this.f23055g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f23053c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f23056i);
            jSONObject.put("wMotion", this.f23057j);
            jSONObject.put("pIntensity", this.f23058k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

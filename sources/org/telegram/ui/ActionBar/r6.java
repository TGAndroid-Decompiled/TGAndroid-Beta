package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class r6 {
    public String f23050a = "";
    public String f23051b = "";
    public String f23052c = "";
    public int d;
    public int e;
    public int f23053f;
    public int f23054g;
    public int h;
    public boolean f23055i;
    public boolean f23056j;
    public float f23057k;
    public long f23058l;
    public long f23059m;
    public long f23060n;
    public boolean f23061o;
    public x6 f23062p;
    public w6 f23063q;
    public float f23064r;
    public ArrayList f23065s;
    public TLRPC.WallPaper f23066t;

    public static void a(r6 r6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(r6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), r6Var.f23050a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), r6Var.f23051b).delete();
    }

    public final String b() {
        if (this.f23063q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f23062p.f23251a);
            sb2.append("_");
            return a1.g.n(this.f23063q.f23215a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f23062p.f23251a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f23050a);
            jSONObject.put("owall", this.f23051b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f23053f);
            jSONObject.put("pGrColor3", this.f23054g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f23052c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f23055i);
            jSONObject.put("wMotion", this.f23056j);
            jSONObject.put("pIntensity", this.f23057k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

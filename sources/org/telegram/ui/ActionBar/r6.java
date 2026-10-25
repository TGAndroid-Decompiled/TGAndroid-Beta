package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class r6 {
    public String f23048a = "";
    public String f23049b = "";
    public String f23050c = "";
    public int d;
    public int e;
    public int f23051f;
    public int f23052g;
    public int h;
    public boolean f23053i;
    public boolean f23054j;
    public float f23055k;
    public long f23056l;
    public long f23057m;
    public long f23058n;
    public boolean f23059o;
    public x6 f23060p;
    public w6 f23061q;
    public float f23062r;
    public ArrayList f23063s;
    public TLRPC.WallPaper f23064t;

    public static void a(r6 r6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(r6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), r6Var.f23048a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), r6Var.f23049b).delete();
    }

    public final String b() {
        if (this.f23061q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f23060p.f23249a);
            sb2.append("_");
            return a1.g.n(this.f23061q.f23213a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f23060p.f23249a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f23048a);
            jSONObject.put("owall", this.f23049b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f23051f);
            jSONObject.put("pGrColor3", this.f23052g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f23050c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f23053i);
            jSONObject.put("wMotion", this.f23054j);
            jSONObject.put("pIntensity", this.f23055k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

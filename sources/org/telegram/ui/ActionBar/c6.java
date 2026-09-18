package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class c6 {
    public String f18538a = "";
    public String f18539b = "";
    public String f18540c = "";
    public int d;
    public int e;
    public int f18541f;
    public int f18542g;
    public int h;
    public boolean f18543i;
    public boolean f18544j;
    public float f18545k;
    public long f18546l;
    public long f18547m;
    public long f18548n;
    public boolean f18549o;
    public i6 f18550p;
    public h6 f18551q;
    public float f18552r;
    public ArrayList f18553s;
    public TLRPC.WallPaper f18554t;

    public static void a(c6 c6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f18538a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f18539b).delete();
    }

    public final String b() {
        if (this.f18551q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18550p.f18757a);
            sb2.append("_");
            return a4.a.n(this.f18551q.f18721a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f18550p.f18757a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18538a);
            jSONObject.put("owall", this.f18539b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18541f);
            jSONObject.put("pGrColor3", this.f18542g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18540c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18543i);
            jSONObject.put("wMotion", this.f18544j);
            jSONObject.put("pIntensity", this.f18545k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

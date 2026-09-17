package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f20275a = "";
    public String f20276b = "";
    public String f20277c = "";
    public int d;
    public int f20278e;
    public int f20279f;
    public int f20280g;
    public int h;
    public boolean f20281i;
    public boolean f20282j;
    public float f20283k;
    public long f20284l;
    public long f20285m;
    public long f20286n;
    public boolean f20287o;
    public i6 f20288p;
    public h6 f20289q;
    public float f20290r;
    public ArrayList f20291s;
    public TLRPC.WallPaper f20292t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20275a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20276b).delete();
    }

    public final String b() {
        if (this.f20289q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20288p.f20541a);
            sb2.append("_");
            return a4.a.n(this.f20289q.f20491a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f20288p.f20541a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20275a);
            jSONObject.put("owall", this.f20276b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20278e);
            jSONObject.put("pGrColor2", this.f20279f);
            jSONObject.put("pGrColor3", this.f20280g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20277c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20281i);
            jSONObject.put("wMotion", this.f20282j);
            jSONObject.put("pIntensity", this.f20283k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

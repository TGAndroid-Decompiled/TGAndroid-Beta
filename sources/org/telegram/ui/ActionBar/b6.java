package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f18740a = "";
    public String f18741b = "";
    public String f18742c = "";
    public int d;
    public int e;
    public int f18743f;
    public int f18744g;
    public int h;
    public boolean f18745i;
    public boolean f18746j;
    public float f18747k;
    public long f18748l;
    public long f18749m;
    public long f18750n;
    public boolean f18751o;
    public i6 f18752p;
    public h6 f18753q;
    public float f18754r;
    public ArrayList f18755s;
    public TLRPC.WallPaper f18756t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18740a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18741b).delete();
    }

    public final String b() {
        if (this.f18753q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18752p.f18988a);
            sb2.append("_");
            return a4.a.n(this.f18753q.f18942a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f18752p.f18988a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18740a);
            jSONObject.put("owall", this.f18741b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18743f);
            jSONObject.put("pGrColor3", this.f18744g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18742c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18745i);
            jSONObject.put("wMotion", this.f18746j);
            jSONObject.put("pIntensity", this.f18747k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

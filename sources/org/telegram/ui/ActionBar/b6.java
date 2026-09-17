package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f20302a = "";
    public String f20303b = "";
    public String f20304c = "";
    public int d;
    public int f20305e;
    public int f20306f;
    public int f20307g;
    public int h;
    public boolean f20308i;
    public boolean f20309j;
    public float f20310k;
    public long f20311l;
    public long f20312m;
    public long f20313n;
    public boolean f20314o;
    public i6 f20315p;
    public h6 f20316q;
    public float f20317r;
    public ArrayList f20318s;
    public TLRPC.WallPaper f20319t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20302a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f20303b).delete();
    }

    public final String b() {
        if (this.f20316q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20315p.f20568a);
            sb2.append("_");
            return a4.a.n(this.f20316q.f20518a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f20315p.f20568a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20302a);
            jSONObject.put("owall", this.f20303b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f20305e);
            jSONObject.put("pGrColor2", this.f20306f);
            jSONObject.put("pGrColor3", this.f20307g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20304c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20308i);
            jSONObject.put("wMotion", this.f20309j);
            jSONObject.put("pIntensity", this.f20310k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

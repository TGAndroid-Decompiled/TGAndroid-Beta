package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20621a = "";
    public String f20622b = "";
    public String f20623c = "";
    public int d;
    public int e;
    public int f20624f;
    public int f20625g;
    public int h;
    public boolean f20626i;
    public boolean f20627j;
    public float f20628k;
    public long f20629l;
    public long f20630m;
    public long f20631n;
    public boolean f20632o;
    public g6 f20633p;
    public f6 f20634q;
    public float f20635r;
    public ArrayList f20636s;
    public TLRPC.WallPaper f20637t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20621a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20622b).delete();
    }

    public final String b() {
        if (this.f20634q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20633p.f20885a);
            sb2.append("_");
            return a1.g.n(this.f20634q.f20836a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20633p.f20885a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20621a);
            jSONObject.put("owall", this.f20622b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20624f);
            jSONObject.put("pGrColor3", this.f20625g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20623c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20626i);
            jSONObject.put("wMotion", this.f20627j);
            jSONObject.put("pIntensity", this.f20628k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

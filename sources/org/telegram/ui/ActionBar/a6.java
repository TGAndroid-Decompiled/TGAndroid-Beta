package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20620a = "";
    public String f20621b = "";
    public String f20622c = "";
    public int d;
    public int e;
    public int f20623f;
    public int f20624g;
    public int h;
    public boolean f20625i;
    public boolean f20626j;
    public float f20627k;
    public long f20628l;
    public long f20629m;
    public long f20630n;
    public boolean f20631o;
    public g6 f20632p;
    public f6 f20633q;
    public float f20634r;
    public ArrayList f20635s;
    public TLRPC.WallPaper f20636t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20620a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20621b).delete();
    }

    public final String b() {
        if (this.f20633q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20632p.f20884a);
            sb2.append("_");
            return a1.g.n(this.f20633q.f20835a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20632p.f20884a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20620a);
            jSONObject.put("owall", this.f20621b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20623f);
            jSONObject.put("pGrColor3", this.f20624g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20622c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20625i);
            jSONObject.put("wMotion", this.f20626j);
            jSONObject.put("pIntensity", this.f20627k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

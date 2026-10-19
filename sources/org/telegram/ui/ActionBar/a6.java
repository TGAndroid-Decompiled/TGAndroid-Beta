package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f20616a = "";
    public String f20617b = "";
    public String f20618c = "";
    public int d;
    public int e;
    public int f20619f;
    public int f20620g;
    public int h;
    public boolean f20621i;
    public boolean f20622j;
    public float f20623k;
    public long f20624l;
    public long f20625m;
    public long f20626n;
    public boolean f20627o;
    public g6 f20628p;
    public f6 f20629q;
    public float f20630r;
    public ArrayList f20631s;
    public TLRPC.WallPaper f20632t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20616a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f20617b).delete();
    }

    public final String b() {
        if (this.f20629q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20628p.f20880a);
            sb2.append("_");
            return a1.g.n(this.f20629q.f20831a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20628p.f20880a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20616a);
            jSONObject.put("owall", this.f20617b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20619f);
            jSONObject.put("pGrColor3", this.f20620g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20618c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20621i);
            jSONObject.put("wMotion", this.f20622j);
            jSONObject.put("pIntensity", this.f20623k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

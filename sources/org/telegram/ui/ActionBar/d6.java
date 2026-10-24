package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public String f20816a = "";
    public String f20817b = "";
    public String f20818c = "";
    public int d;
    public int e;
    public int f20819f;
    public int f20820g;
    public int h;
    public boolean f20821i;
    public boolean f20822j;
    public float f20823k;
    public long f20824l;
    public long f20825m;
    public long f20826n;
    public boolean f20827o;
    public j6 f20828p;
    public i6 f20829q;
    public float f20830r;
    public ArrayList f20831s;
    public TLRPC.WallPaper f20832t;

    public static void a(d6 d6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(d6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), d6Var.f20816a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), d6Var.f20817b).delete();
    }

    public final String b() {
        if (this.f20829q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20828p.f21020a);
            sb2.append("_");
            return a1.g.n(this.f20829q.f20965a, "_owp", sb2);
        }
        return a1.g.s(new StringBuilder(), this.f20828p.f21020a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f20816a);
            jSONObject.put("owall", this.f20817b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f20819f);
            jSONObject.put("pGrColor3", this.f20820g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f20818c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f20821i);
            jSONObject.put("wMotion", this.f20822j);
            jSONObject.put("pIntensity", this.f20823k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

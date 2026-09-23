package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class a6 {
    public String f18423a = "";
    public String f18424b = "";
    public String f18425c = "";
    public int d;
    public int e;
    public int f18426f;
    public int f18427g;
    public int h;
    public boolean f18428i;
    public boolean f18429j;
    public float f18430k;
    public long f18431l;
    public long f18432m;
    public long f18433n;
    public boolean f18434o;
    public g6 f18435p;
    public f6 f18436q;
    public float f18437r;
    public ArrayList f18438s;
    public TLRPC.WallPaper f18439t;

    public static void a(a6 a6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(a6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f18423a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), a6Var.f18424b).delete();
    }

    public final String b() {
        if (this.f18436q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18435p.f18682a);
            sb2.append("_");
            return a4.a.o(this.f18436q.f18636a, "_owp", sb2);
        }
        return a4.a.t(new StringBuilder(), this.f18435p.f18682a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18423a);
            jSONObject.put("owall", this.f18424b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18426f);
            jSONObject.put("pGrColor3", this.f18427g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18425c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18428i);
            jSONObject.put("wMotion", this.f18429j);
            jSONObject.put("pIntensity", this.f18430k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

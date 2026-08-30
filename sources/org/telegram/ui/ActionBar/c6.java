package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class c6 {
    public String f19554a = "";
    public String f19555b = "";
    public String f19556c = "";
    public int d;
    public int e;
    public int f19557f;
    public int f19558g;
    public int h;
    public boolean f19559i;
    public boolean f19560j;
    public float f19561k;
    public long f19562l;
    public long f19563m;
    public long f19564n;
    public boolean f19565o;
    public i6 f19566p;
    public h6 f19567q;
    public float f19568r;
    public ArrayList f19569s;
    public TLRPC.WallPaper f19570t;

    public static void a(c6 c6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f19554a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f19555b).delete();
    }

    public final String b() {
        if (this.f19567q != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19566p.f19805a);
            sb.append("_");
            return android.support.v4.media.a.m(this.f19567q.f19761a, "_owp", sb);
        }
        return android.support.v4.media.a.r(new StringBuilder(), this.f19566p.f19805a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f19554a);
            jSONObject.put("owall", this.f19555b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f19557f);
            jSONObject.put("pGrColor3", this.f19558g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f19556c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f19559i);
            jSONObject.put("wMotion", this.f19560j);
            jSONObject.put("pIntensity", this.f19561k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

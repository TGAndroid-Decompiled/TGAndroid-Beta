package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class c6 {
    public String f17575a = "";
    public String f17576b = "";
    public String f17577c = "";
    public int d;
    public int e;
    public int f17578f;
    public int f17579g;
    public int h;
    public boolean f17580i;
    public boolean f17581j;
    public float f17582k;
    public long f17583l;
    public long f17584m;
    public long f17585n;
    public boolean f17586o;
    public i6 f17587p;
    public h6 f17588q;
    public float f17589r;
    public ArrayList f17590s;
    public TLRPC.WallPaper f17591t;

    public static void a(c6 c6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(c6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f17575a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), c6Var.f17576b).delete();
    }

    public final String b() {
        if (this.f17588q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f17587p.f17834a);
            sb2.append("_");
            return a4.a.n(this.f17588q.f17792a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f17587p.f17834a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f17575a);
            jSONObject.put("owall", this.f17576b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f17578f);
            jSONObject.put("pGrColor3", this.f17579g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f17577c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f17580i);
            jSONObject.put("wMotion", this.f17581j);
            jSONObject.put("pIntensity", this.f17582k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

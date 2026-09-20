package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f18725a = "";
    public String f18726b = "";
    public String f18727c = "";
    public int d;
    public int e;
    public int f18728f;
    public int f18729g;
    public int h;
    public boolean f18730i;
    public boolean f18731j;
    public float f18732k;
    public long f18733l;
    public long f18734m;
    public long f18735n;
    public boolean f18736o;
    public i6 f18737p;
    public h6 f18738q;
    public float f18739r;
    public ArrayList f18740s;
    public TLRPC.WallPaper f18741t;

    public static void a(b6 b6Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18725a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), b6Var.f18726b).delete();
    }

    public final String b() {
        if (this.f18738q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f18737p.f18973a);
            sb2.append("_");
            return a4.a.n(this.f18738q.f18927a, "_owp", sb2);
        }
        return a4.a.s(new StringBuilder(), this.f18737p.f18973a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f18725a);
            jSONObject.put("owall", this.f18726b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.e);
            jSONObject.put("pGrColor2", this.f18728f);
            jSONObject.put("pGrColor3", this.f18729g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f18727c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f18730i);
            jSONObject.put("wMotion", this.f18731j);
            jSONObject.put("pIntensity", this.f18732k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}

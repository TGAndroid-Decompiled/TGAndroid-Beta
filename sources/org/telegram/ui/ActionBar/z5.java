package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

public final class z5 {

    public String f24005a = "";

    public String f24006b = "";

    public String f24007c = "";
    public int d;

    public int f24008e;

    public int f24009f;

    public int f24010g;
    public int h;

    public boolean f24011i;

    public boolean f24012j;

    public float f24013k;

    public long f24014l;

    public long f24015m;

    public long f24016n;

    public boolean f24017o;

    public f6 f24018p;

    public e6 f24019q;

    public float f24020r;

    public ArrayList f24021s;

    public TLRPC.WallPaper f24022t;

    public static void a(z5 z5Var) {
        ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(z5Var.b()).commit();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f24005a).delete();
        new File(ApplicationLoader.getFilesDirFixed(), z5Var.f24006b).delete();
    }

    public final String b() {
        if (this.f24019q == null) {
            return a9.p.p(new StringBuilder(), this.f24018p.f22941a, "_owp");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24018p.f22941a);
        sb2.append("_");
        return a9.p.k(this.f24019q.f22883a, "_owp", sb2);
    }

    public final void c() {
        try {
            String strB = b();
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f24005a);
            jSONObject.put("owall", this.f24006b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f24008e);
            jSONObject.put("pGrColor2", this.f24009f);
            jSONObject.put("pGrColor3", this.f24010g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f24007c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f24011i);
            jSONObject.put("wMotion", this.f24012j);
            jSONObject.put("pIntensity", this.f24013k);
            editorEdit.putString(strB, jSONObject.toString());
            editorEdit.commit();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }
}

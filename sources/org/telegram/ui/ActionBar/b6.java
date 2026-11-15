package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLRPC;
public final class b6 {
    public String f28452a = "";
    public String f28453b = "";
    public String f28454c = "";
    public int d;
    public int f28455e;
    public int f28456f;
    public int f28457g;
    public int h;
    public boolean f28458i;
    public boolean f28459j;
    public float f28460k;
    public long f28461l;
    public long f28462m;
    public long f28463n;
    public boolean f28464o;
    public i6 f28465p;
    public g6 f28466q;
    public float f28467r;
    public ArrayList f28468s;
    public TLRPC.WallPaper f28469t;

    public static void a(b6 b6Var) {
        org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0).edit().remove(b6Var.b()).commit();
        new File(org.telegram.messenger.t0.h(), b6Var.f28452a).delete();
        new File(org.telegram.messenger.t0.h(), b6Var.f28453b).delete();
    }

    public final String b() {
        if (this.f28466q != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28465p.f28698a);
            sb2.append("_");
            return a8.p0.n(this.f28466q.f28602a, "_owp", sb2);
        }
        return a8.p0.s(new StringBuilder(), this.f28465p.f28698a, "_owp");
    }

    public final void c() {
        try {
            String b10 = b();
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wall", this.f28452a);
            jSONObject.put("owall", this.f28453b);
            jSONObject.put("pColor", this.d);
            jSONObject.put("pGrColor", this.f28455e);
            jSONObject.put("pGrColor2", this.f28456f);
            jSONObject.put("pGrColor3", this.f28457g);
            jSONObject.put("pGrAngle", this.h);
            String str = this.f28454c;
            if (str == null) {
                str = "";
            }
            jSONObject.put("wallSlug", str);
            jSONObject.put("wBlur", this.f28458i);
            jSONObject.put("wMotion", this.f28459j);
            jSONObject.put("pIntensity", this.f28460k);
            edit.putString(b10, jSONObject.toString());
            edit.commit();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}

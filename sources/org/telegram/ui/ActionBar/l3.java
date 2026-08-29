package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public class l3 {
    public boolean A;
    public boolean B;
    public String C;
    public Bitmap D;
    public boolean E;
    public String F;
    public float G;
    public org.telegram.ui.m4 H;
    public ph.u0 I;
    public boolean J;
    public ph.y3 f23641a;
    public org.telegram.ui.web.w0 f23642b;
    public org.telegram.ui.q3 f23643c;
    public Object d;
    public int f23644e;
    public int f23645f;
    public int f23646g;
    public boolean h;
    public float f23647i = Float.MAX_VALUE;
    public boolean f23648j = true;
    public Bitmap f23649k;
    public boolean f23650l;
    public boolean f23651m;
    public int f23652n;
    public int f23653o;
    public int f23654p;
    public int f23655q;
    public boolean f23656r;
    public boolean f23657s;
    public boolean f23658t;
    public ag.j2 f23659u;
    public String v;
    public boolean f23660w;
    public boolean f23661x;
    public boolean f23662y;
    public boolean f23663z;

    public final void a() {
        try {
            org.telegram.ui.web.w0 w0Var = this.f23642b;
            if (w0Var != null) {
                w0Var.destroy();
                this.f23642b = null;
            }
            org.telegram.ui.m4 m4Var = this.H;
            if (m4Var != null) {
                m4Var.s();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public String b() {
        if (this.H != null) {
            if (TextUtils.isEmpty(this.C)) {
                return LocaleController.getString(R.string.WebEmpty);
            }
            return this.C;
        }
        ph.y3 y3Var = this.f23641a;
        if (y3Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(y3Var.f46163a).getUser(Long.valueOf(this.f23641a.f46165c)));
    }
}

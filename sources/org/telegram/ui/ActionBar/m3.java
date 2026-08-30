package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public class m3 {
    public boolean A;
    public boolean B;
    public String C;
    public Bitmap D;
    public boolean E;
    public String F;
    public float G;
    public org.telegram.ui.l4 H;
    public rh.v0 I;
    public boolean J;
    public rh.z3 f20448a;
    public org.telegram.ui.web.w0 f20449b;
    public org.telegram.ui.p3 f20450c;
    public Object d;
    public int e;
    public int f20451f;
    public int f20452g;
    public boolean h;
    public float f20453i = Float.MAX_VALUE;
    public boolean f20454j = true;
    public Bitmap f20455k;
    public boolean f20456l;
    public boolean f20457m;
    public int f20458n;
    public int f20459o;
    public int f20460p;
    public int f20461q;
    public boolean f20462r;
    public boolean f20463s;
    public boolean f20464t;
    public b4.e0 f20465u;
    public String v;
    public boolean f20466w;
    public boolean f20467x;
    public boolean f20468y;
    public boolean f20469z;

    public final void a() {
        try {
            org.telegram.ui.web.w0 w0Var = this.f20449b;
            if (w0Var != null) {
                w0Var.destroy();
                this.f20449b = null;
            }
            org.telegram.ui.l4 l4Var = this.H;
            if (l4Var != null) {
                l4Var.s();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public String b() {
        if (this.H != null) {
            if (TextUtils.isEmpty(this.C)) {
                return LocaleController.getString(R.string.WebEmpty);
            }
            return this.C;
        }
        rh.z3 z3Var = this.f20448a;
        if (z3Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(z3Var.f43867a).getUser(Long.valueOf(this.f20448a.f43869c)));
    }
}

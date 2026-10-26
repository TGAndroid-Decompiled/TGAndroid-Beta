package org.telegram.ui.ActionBar;

import a8.ng;
import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public class r3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.j4 J;
    public hi.f1 K;
    public boolean L;
    public hi.c5 f23004a;
    public org.telegram.ui.web.x0 f23005b;
    public org.telegram.ui.m3 f23006c;
    public Object d;
    public boolean e;
    public String f23007f;
    public int f23008g;
    public int h;
    public int f23009i;
    public boolean f23010j;
    public float f23011k = Float.MAX_VALUE;
    public boolean f23012l = true;
    public Bitmap f23013m;
    public boolean f23014n;
    public boolean f23015o;
    public int f23016p;
    public int f23017q;
    public int f23018r;
    public int f23019s;
    public boolean f23020t;
    public boolean f23021u;
    public boolean v;
    public ng f23022w;
    public String f23023x;
    public boolean f23024y;
    public boolean f23025z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f23005b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f23005b = null;
            }
            org.telegram.ui.j4 j4Var = this.J;
            if (j4Var != null) {
                j4Var.s();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public String b() {
        if (this.J != null) {
            if (TextUtils.isEmpty(this.E)) {
                return LocaleController.getString(R.string.WebEmpty);
            }
            return this.E;
        }
        hi.c5 c5Var = this.f23004a;
        if (c5Var == null) {
            return "";
        }
        if (c5Var.f12919g == 6) {
            return c5Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(c5Var.f12915a).getUser(Long.valueOf(this.f23004a.f12917c)));
    }
}

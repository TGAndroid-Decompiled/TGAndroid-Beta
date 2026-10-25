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
    public hi.c5 f23002a;
    public org.telegram.ui.web.x0 f23003b;
    public org.telegram.ui.m3 f23004c;
    public Object d;
    public boolean e;
    public String f23005f;
    public int f23006g;
    public int h;
    public int f23007i;
    public boolean f23008j;
    public float f23009k = Float.MAX_VALUE;
    public boolean f23010l = true;
    public Bitmap f23011m;
    public boolean f23012n;
    public boolean f23013o;
    public int f23014p;
    public int f23015q;
    public int f23016r;
    public int f23017s;
    public boolean f23018t;
    public boolean f23019u;
    public boolean v;
    public ng f23020w;
    public String f23021x;
    public boolean f23022y;
    public boolean f23023z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f23003b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f23003b = null;
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
        hi.c5 c5Var = this.f23002a;
        if (c5Var == null) {
            return "";
        }
        if (c5Var.f12919g == 6) {
            return c5Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(c5Var.f12915a).getUser(Long.valueOf(this.f23002a.f12917c)));
    }
}

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
    public hi.c5 f23005a;
    public org.telegram.ui.web.x0 f23006b;
    public org.telegram.ui.m3 f23007c;
    public Object d;
    public boolean e;
    public String f23008f;
    public int f23009g;
    public int h;
    public int f23010i;
    public boolean f23011j;
    public float f23012k = Float.MAX_VALUE;
    public boolean f23013l = true;
    public Bitmap f23014m;
    public boolean f23015n;
    public boolean f23016o;
    public int f23017p;
    public int f23018q;
    public int f23019r;
    public int f23020s;
    public boolean f23021t;
    public boolean f23022u;
    public boolean v;
    public ng f23023w;
    public String f23024x;
    public boolean f23025y;
    public boolean f23026z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f23006b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f23006b = null;
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
        hi.c5 c5Var = this.f23005a;
        if (c5Var == null) {
            return "";
        }
        if (c5Var.f12918g == 6) {
            return c5Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(c5Var.f12914a).getUser(Long.valueOf(this.f23005a.f12916c)));
    }
}

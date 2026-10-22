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
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.l4 J;
    public gi.y0 K;
    public boolean L;
    public gi.t4 f21585a;
    public org.telegram.ui.web.x0 f21586b;
    public org.telegram.ui.o3 f21587c;
    public Object d;
    public boolean e;
    public String f21588f;
    public int f21589g;
    public int h;
    public int f21590i;
    public boolean f21591j;
    public float f21592k = Float.MAX_VALUE;
    public boolean f21593l = true;
    public Bitmap f21594m;
    public boolean f21595n;
    public boolean f21596o;
    public int f21597p;
    public int f21598q;
    public int f21599r;
    public int f21600s;
    public boolean f21601t;
    public boolean f21602u;
    public boolean v;
    public a5.a f21603w;
    public String f21604x;
    public boolean f21605y;
    public boolean f21606z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f21586b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f21586b = null;
            }
            org.telegram.ui.l4 l4Var = this.J;
            if (l4Var != null) {
                l4Var.s();
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
        gi.t4 t4Var = this.f21585a;
        if (t4Var == null) {
            return "";
        }
        if (t4Var.f11469g == 6) {
            return t4Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(t4Var.f11465a).getUser(Long.valueOf(this.f21585a.f11467c)));
    }
}

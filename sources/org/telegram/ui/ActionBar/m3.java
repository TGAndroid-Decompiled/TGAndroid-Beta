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
    public gi.t4 f21581a;
    public org.telegram.ui.web.x0 f21582b;
    public org.telegram.ui.o3 f21583c;
    public Object d;
    public boolean e;
    public String f21584f;
    public int f21585g;
    public int h;
    public int f21586i;
    public boolean f21587j;
    public float f21588k = Float.MAX_VALUE;
    public boolean f21589l = true;
    public Bitmap f21590m;
    public boolean f21591n;
    public boolean f21592o;
    public int f21593p;
    public int f21594q;
    public int f21595r;
    public int f21596s;
    public boolean f21597t;
    public boolean f21598u;
    public boolean v;
    public a5.a f21599w;
    public String f21600x;
    public boolean f21601y;
    public boolean f21602z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f21582b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f21582b = null;
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
        gi.t4 t4Var = this.f21581a;
        if (t4Var == null) {
            return "";
        }
        if (t4Var.f11471g == 6) {
            return t4Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(t4Var.f11467a).getUser(Long.valueOf(this.f21581a.f11469c)));
    }
}

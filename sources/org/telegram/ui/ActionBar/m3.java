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
    public gi.t4 f21578a;
    public org.telegram.ui.web.y0 f21579b;
    public org.telegram.ui.o3 f21580c;
    public Object d;
    public boolean e;
    public String f21581f;
    public int f21582g;
    public int h;
    public int f21583i;
    public boolean f21584j;
    public float f21585k = Float.MAX_VALUE;
    public boolean f21586l = true;
    public Bitmap f21587m;
    public boolean f21588n;
    public boolean f21589o;
    public int f21590p;
    public int f21591q;
    public int f21592r;
    public int f21593s;
    public boolean f21594t;
    public boolean f21595u;
    public boolean v;
    public a5.a f21596w;
    public String f21597x;
    public boolean f21598y;
    public boolean f21599z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f21579b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f21579b = null;
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
        gi.t4 t4Var = this.f21578a;
        if (t4Var == null) {
            return "";
        }
        if (t4Var.f11470g == 6) {
            return t4Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(t4Var.f11466a).getUser(Long.valueOf(this.f21578a.f11468c)));
    }
}

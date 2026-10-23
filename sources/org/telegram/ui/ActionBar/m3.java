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
    public gi.t4 f21586a;
    public org.telegram.ui.web.x0 f21587b;
    public org.telegram.ui.o3 f21588c;
    public Object d;
    public boolean e;
    public String f21589f;
    public int f21590g;
    public int h;
    public int f21591i;
    public boolean f21592j;
    public float f21593k = Float.MAX_VALUE;
    public boolean f21594l = true;
    public Bitmap f21595m;
    public boolean f21596n;
    public boolean f21597o;
    public int f21598p;
    public int f21599q;
    public int f21600r;
    public int f21601s;
    public boolean f21602t;
    public boolean f21603u;
    public boolean v;
    public a5.a f21604w;
    public String f21605x;
    public boolean f21606y;
    public boolean f21607z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f21587b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f21587b = null;
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
        gi.t4 t4Var = this.f21586a;
        if (t4Var == null) {
            return "";
        }
        if (t4Var.f11469g == 6) {
            return t4Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(t4Var.f11465a).getUser(Long.valueOf(this.f21586a.f11467c)));
    }
}

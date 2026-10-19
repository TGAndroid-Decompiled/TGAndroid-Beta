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
    public gi.t4 f21579a;
    public org.telegram.ui.web.x0 f21580b;
    public org.telegram.ui.o3 f21581c;
    public Object d;
    public boolean e;
    public String f21582f;
    public int f21583g;
    public int h;
    public int f21584i;
    public boolean f21585j;
    public float f21586k = Float.MAX_VALUE;
    public boolean f21587l = true;
    public Bitmap f21588m;
    public boolean f21589n;
    public boolean f21590o;
    public int f21591p;
    public int f21592q;
    public int f21593r;
    public int f21594s;
    public boolean f21595t;
    public boolean f21596u;
    public boolean v;
    public a5.a f21597w;
    public String f21598x;
    public boolean f21599y;
    public boolean f21600z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f21580b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f21580b = null;
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
        gi.t4 t4Var = this.f21579a;
        if (t4Var == null) {
            return "";
        }
        if (t4Var.f11469g == 6) {
            return t4Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(t4Var.f11465a).getUser(Long.valueOf(this.f21579a.f11467c)));
    }
}

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
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.h4 J;
    public ei.a1 K;
    public boolean L;
    public ei.e5 f21330a;
    public org.telegram.ui.web.y0 f21331b;
    public org.telegram.ui.l3 f21332c;
    public Object d;
    public boolean f21333e;
    public String f21334f;
    public int f21335g;
    public int h;
    public int f21336i;
    public boolean f21337j;
    public float f21338k = Float.MAX_VALUE;
    public boolean f21339l = true;
    public Bitmap f21340m;
    public boolean f21341n;
    public boolean f21342o;
    public int f21343p;
    public int f21344q;
    public int f21345r;
    public int f21346s;
    public boolean f21347t;
    public boolean f21348u;
    public boolean v;
    public a5.a f21349w;
    public String f21350x;
    public boolean f21351y;
    public boolean f21352z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f21331b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f21331b = null;
            }
            org.telegram.ui.h4 h4Var = this.J;
            if (h4Var != null) {
                h4Var.s();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public String b() {
        if (this.J != null) {
            if (TextUtils.isEmpty(this.E)) {
                return LocaleController.getString(R.string.WebEmpty);
            }
            return this.E;
        }
        ei.e5 e5Var = this.f21330a;
        if (e5Var == null) {
            return "";
        }
        if (e5Var.f9040g == 6) {
            return e5Var.f9038e;
        }
        return UserObject.getUserName(MessagesController.getInstance(e5Var.f9035a).getUser(Long.valueOf(this.f21330a.f9037c)));
    }
}

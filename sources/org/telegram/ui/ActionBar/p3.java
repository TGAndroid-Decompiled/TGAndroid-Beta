package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public class p3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.k4 J;
    public gi.y0 K;
    public boolean L;
    public gi.t4 f21754a;
    public org.telegram.ui.web.y0 f21755b;
    public org.telegram.ui.n3 f21756c;
    public Object d;
    public boolean e;
    public String f21757f;
    public int f21758g;
    public int h;
    public int f21759i;
    public boolean f21760j;
    public float f21761k = Float.MAX_VALUE;
    public boolean f21762l = true;
    public Bitmap f21763m;
    public boolean f21764n;
    public boolean f21765o;
    public int f21766p;
    public int f21767q;
    public int f21768r;
    public int f21769s;
    public boolean f21770t;
    public boolean f21771u;
    public boolean v;
    public a5.a f21772w;
    public String f21773x;
    public boolean f21774y;
    public boolean f21775z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f21755b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f21755b = null;
            }
            org.telegram.ui.k4 k4Var = this.J;
            if (k4Var != null) {
                k4Var.s();
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
        gi.t4 t4Var = this.f21754a;
        if (t4Var == null) {
            return "";
        }
        if (t4Var.f11495g == 6) {
            return t4Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(t4Var.f11491a).getUser(Long.valueOf(this.f21754a.f11493c)));
    }
}

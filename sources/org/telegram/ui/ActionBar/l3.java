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
    public ei.e5 f21366a;
    public org.telegram.ui.web.y0 f21367b;
    public org.telegram.ui.l3 f21368c;
    public Object d;
    public boolean f21369e;
    public String f21370f;
    public int f21371g;
    public int h;
    public int f21372i;
    public boolean f21373j;
    public float f21374k = Float.MAX_VALUE;
    public boolean f21375l = true;
    public Bitmap f21376m;
    public boolean f21377n;
    public boolean f21378o;
    public int f21379p;
    public int f21380q;
    public int f21381r;
    public int f21382s;
    public boolean f21383t;
    public boolean f21384u;
    public boolean v;
    public a5.a f21385w;
    public String f21386x;
    public boolean f21387y;
    public boolean f21388z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f21367b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f21367b = null;
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
        ei.e5 e5Var = this.f21366a;
        if (e5Var == null) {
            return "";
        }
        if (e5Var.f9040g == 6) {
            return e5Var.f9038e;
        }
        return UserObject.getUserName(MessagesController.getInstance(e5Var.f9035a).getUser(Long.valueOf(this.f21366a.f9037c)));
    }
}

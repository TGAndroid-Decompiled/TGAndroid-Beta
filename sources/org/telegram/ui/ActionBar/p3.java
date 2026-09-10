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
    public org.telegram.ui.j4 J;
    public di.d1 K;
    public boolean L;
    public di.j5 f18540a;
    public org.telegram.ui.web.y0 f18541b;
    public org.telegram.ui.n3 f18542c;
    public Object d;
    public boolean e;
    public String f18543f;
    public int f18544g;
    public int h;
    public int f18545i;
    public boolean f18546j;
    public float f18547k = Float.MAX_VALUE;
    public boolean f18548l = true;
    public Bitmap f18549m;
    public boolean f18550n;
    public boolean f18551o;
    public int f18552p;
    public int f18553q;
    public int f18554r;
    public int f18555s;
    public boolean f18556t;
    public boolean f18557u;
    public boolean v;
    public a5.a f18558w;
    public String f18559x;
    public boolean f18560y;
    public boolean f18561z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f18541b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f18541b = null;
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
        di.j5 j5Var = this.f18540a;
        if (j5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(j5Var.f6705a).getUser(Long.valueOf(this.f18540a.f6707c)));
    }
}

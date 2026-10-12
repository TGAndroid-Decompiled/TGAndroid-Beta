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
    public org.telegram.ui.i4 J;
    public ei.a1 K;
    public boolean L;
    public ei.e5 f21104a;
    public org.telegram.ui.web.y0 f21105b;
    public org.telegram.ui.m3 f21106c;
    public Object d;
    public boolean f21107e;
    public String f21108f;
    public int f21109g;
    public int h;
    public int f21110i;
    public boolean f21111j;
    public float f21112k = Float.MAX_VALUE;
    public boolean f21113l = true;
    public Bitmap f21114m;
    public boolean f21115n;
    public boolean f21116o;
    public int f21117p;
    public int f21118q;
    public int f21119r;
    public int f21120s;
    public boolean f21121t;
    public boolean f21122u;
    public boolean v;
    public a5.a f21123w;
    public String f21124x;
    public boolean f21125y;
    public boolean f21126z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f21105b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f21105b = null;
            }
            org.telegram.ui.i4 i4Var = this.J;
            if (i4Var != null) {
                i4Var.s();
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
        ei.e5 e5Var = this.f21104a;
        if (e5Var == null) {
            return "";
        }
        if (e5Var.f9038g == 6) {
            return e5Var.f9036e;
        }
        return UserObject.getUserName(MessagesController.getInstance(e5Var.f9033a).getUser(Long.valueOf(this.f21104a.f9035c)));
    }
}

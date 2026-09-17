package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public class n3 {
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
    public fi.a1 K;
    public boolean L;
    public fi.f5 f21217a;
    public org.telegram.ui.web.z0 f21218b;
    public org.telegram.ui.m3 f21219c;
    public Object d;
    public boolean f21220e;
    public String f21221f;
    public int f21222g;
    public int h;
    public int f21223i;
    public boolean f21224j;
    public float f21225k = Float.MAX_VALUE;
    public boolean f21226l = true;
    public Bitmap f21227m;
    public boolean f21228n;
    public boolean f21229o;
    public int f21230p;
    public int f21231q;
    public int f21232r;
    public int f21233s;
    public boolean f21234t;
    public boolean f21235u;
    public boolean v;
    public a5.a f21236w;
    public String f21237x;
    public boolean f21238y;
    public boolean f21239z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f21218b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f21218b = null;
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
        fi.f5 f5Var = this.f21217a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f9663a).getUser(Long.valueOf(this.f21217a.f9665c)));
    }
}

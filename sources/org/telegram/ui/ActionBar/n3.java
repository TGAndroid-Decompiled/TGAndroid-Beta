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
    public fi.f5 f21216a;
    public org.telegram.ui.web.z0 f21217b;
    public org.telegram.ui.m3 f21218c;
    public Object d;
    public boolean f21219e;
    public String f21220f;
    public int f21221g;
    public int h;
    public int f21222i;
    public boolean f21223j;
    public float f21224k = Float.MAX_VALUE;
    public boolean f21225l = true;
    public Bitmap f21226m;
    public boolean f21227n;
    public boolean f21228o;
    public int f21229p;
    public int f21230q;
    public int f21231r;
    public int f21232s;
    public boolean f21233t;
    public boolean f21234u;
    public boolean v;
    public a5.a f21235w;
    public String f21236x;
    public boolean f21237y;
    public boolean f21238z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f21217b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f21217b = null;
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
        fi.f5 f5Var = this.f21216a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f9663a).getUser(Long.valueOf(this.f21216a.f9665c)));
    }
}

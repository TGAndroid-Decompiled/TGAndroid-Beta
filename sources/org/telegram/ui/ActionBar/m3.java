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
    public org.telegram.ui.i4 J;
    public ei.b1 K;
    public boolean L;
    public ei.f5 f21373a;
    public org.telegram.ui.web.z0 f21374b;
    public org.telegram.ui.m3 f21375c;
    public Object d;
    public boolean f21376e;
    public String f21377f;
    public int f21378g;
    public int h;
    public int f21379i;
    public boolean f21380j;
    public float f21381k = Float.MAX_VALUE;
    public boolean f21382l = true;
    public Bitmap f21383m;
    public boolean f21384n;
    public boolean f21385o;
    public int f21386p;
    public int f21387q;
    public int f21388r;
    public int f21389s;
    public boolean f21390t;
    public boolean f21391u;
    public boolean v;
    public a5.a f21392w;
    public String f21393x;
    public boolean f21394y;
    public boolean f21395z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f21374b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f21374b = null;
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
        ei.f5 f5Var = this.f21373a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f9037a).getUser(Long.valueOf(this.f21373a.f9039c)));
    }
}

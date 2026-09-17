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
    public fi.f5 f21244a;
    public org.telegram.ui.web.z0 f21245b;
    public org.telegram.ui.m3 f21246c;
    public Object d;
    public boolean f21247e;
    public String f21248f;
    public int f21249g;
    public int h;
    public int f21250i;
    public boolean f21251j;
    public float f21252k = Float.MAX_VALUE;
    public boolean f21253l = true;
    public Bitmap f21254m;
    public boolean f21255n;
    public boolean f21256o;
    public int f21257p;
    public int f21258q;
    public int f21259r;
    public int f21260s;
    public boolean f21261t;
    public boolean f21262u;
    public boolean v;
    public a5.a f21263w;
    public String f21264x;
    public boolean f21265y;
    public boolean f21266z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f21245b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f21245b = null;
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
        fi.f5 f5Var = this.f21244a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f9691a).getUser(Long.valueOf(this.f21244a.f9693c)));
    }
}

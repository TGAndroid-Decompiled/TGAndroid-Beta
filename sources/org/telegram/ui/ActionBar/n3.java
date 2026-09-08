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
    public fi.f5 f21243a;
    public org.telegram.ui.web.z0 f21244b;
    public org.telegram.ui.m3 f21245c;
    public Object d;
    public boolean f21246e;
    public String f21247f;
    public int f21248g;
    public int h;
    public int f21249i;
    public boolean f21250j;
    public float f21251k = Float.MAX_VALUE;
    public boolean f21252l = true;
    public Bitmap f21253m;
    public boolean f21254n;
    public boolean f21255o;
    public int f21256p;
    public int f21257q;
    public int f21258r;
    public int f21259s;
    public boolean f21260t;
    public boolean f21261u;
    public boolean v;
    public a5.a f21262w;
    public String f21263x;
    public boolean f21264y;
    public boolean f21265z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f21244b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f21244b = null;
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
        fi.f5 f5Var = this.f21243a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f9691a).getUser(Long.valueOf(this.f21243a.f9693c)));
    }
}

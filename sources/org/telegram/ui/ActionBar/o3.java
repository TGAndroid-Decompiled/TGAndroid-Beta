package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public class o3 {
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
    public ei.f5 f19454a;
    public org.telegram.ui.web.z0 f19455b;
    public org.telegram.ui.l3 f19456c;
    public Object d;
    public boolean e;
    public String f19457f;
    public int f19458g;
    public int h;
    public int f19459i;
    public boolean f19460j;
    public float f19461k = Float.MAX_VALUE;
    public boolean f19462l = true;
    public Bitmap f19463m;
    public boolean f19464n;
    public boolean f19465o;
    public int f19466p;
    public int f19467q;
    public int f19468r;
    public int f19469s;
    public boolean f19470t;
    public boolean f19471u;
    public boolean v;
    public a5.a f19472w;
    public String f19473x;
    public boolean f19474y;
    public boolean f19475z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f19455b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f19455b = null;
            }
            org.telegram.ui.h4 h4Var = this.J;
            if (h4Var != null) {
                h4Var.s();
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
        ei.f5 f5Var = this.f19454a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8340a).getUser(Long.valueOf(this.f19454a.f8342c)));
    }
}

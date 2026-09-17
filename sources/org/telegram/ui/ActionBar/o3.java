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
    public ei.f5 f19453a;
    public org.telegram.ui.web.z0 f19454b;
    public org.telegram.ui.l3 f19455c;
    public Object d;
    public boolean e;
    public String f19456f;
    public int f19457g;
    public int h;
    public int f19458i;
    public boolean f19459j;
    public float f19460k = Float.MAX_VALUE;
    public boolean f19461l = true;
    public Bitmap f19462m;
    public boolean f19463n;
    public boolean f19464o;
    public int f19465p;
    public int f19466q;
    public int f19467r;
    public int f19468s;
    public boolean f19469t;
    public boolean f19470u;
    public boolean v;
    public a5.a f19471w;
    public String f19472x;
    public boolean f19473y;
    public boolean f19474z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f19454b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f19454b = null;
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
        ei.f5 f5Var = this.f19453a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8340a).getUser(Long.valueOf(this.f19453a.f8342c)));
    }
}

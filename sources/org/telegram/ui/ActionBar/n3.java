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
    public org.telegram.ui.h4 J;
    public ei.a1 K;
    public boolean L;
    public ei.f5 f19614a;
    public org.telegram.ui.web.z0 f19615b;
    public org.telegram.ui.l3 f19616c;
    public Object d;
    public boolean e;
    public String f19617f;
    public int f19618g;
    public int h;
    public int f19619i;
    public boolean f19620j;
    public float f19621k = Float.MAX_VALUE;
    public boolean f19622l = true;
    public Bitmap f19623m;
    public boolean f19624n;
    public boolean f19625o;
    public int f19626p;
    public int f19627q;
    public int f19628r;
    public int f19629s;
    public boolean f19630t;
    public boolean f19631u;
    public boolean v;
    public a5.a f19632w;
    public String f19633x;
    public boolean f19634y;
    public boolean f19635z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f19615b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f19615b = null;
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
        ei.f5 f5Var = this.f19614a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8339a).getUser(Long.valueOf(this.f19614a.f8341c)));
    }
}

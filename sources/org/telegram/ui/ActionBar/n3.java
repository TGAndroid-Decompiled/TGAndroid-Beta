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
    public ei.f5 f19422a;
    public org.telegram.ui.web.z0 f19423b;
    public org.telegram.ui.l3 f19424c;
    public Object d;
    public boolean e;
    public String f19425f;
    public int f19426g;
    public int h;
    public int f19427i;
    public boolean f19428j;
    public float f19429k = Float.MAX_VALUE;
    public boolean f19430l = true;
    public Bitmap f19431m;
    public boolean f19432n;
    public boolean f19433o;
    public int f19434p;
    public int f19435q;
    public int f19436r;
    public int f19437s;
    public boolean f19438t;
    public boolean f19439u;
    public boolean v;
    public a5.a f19440w;
    public String f19441x;
    public boolean f19442y;
    public boolean f19443z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f19423b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f19423b = null;
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
        ei.f5 f5Var = this.f19422a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8337a).getUser(Long.valueOf(this.f19422a.f8339c)));
    }
}

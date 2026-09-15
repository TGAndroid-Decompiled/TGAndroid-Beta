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
    public ei.f5 f19426a;
    public org.telegram.ui.web.z0 f19427b;
    public org.telegram.ui.l3 f19428c;
    public Object d;
    public boolean e;
    public String f19429f;
    public int f19430g;
    public int h;
    public int f19431i;
    public boolean f19432j;
    public float f19433k = Float.MAX_VALUE;
    public boolean f19434l = true;
    public Bitmap f19435m;
    public boolean f19436n;
    public boolean f19437o;
    public int f19438p;
    public int f19439q;
    public int f19440r;
    public int f19441s;
    public boolean f19442t;
    public boolean f19443u;
    public boolean v;
    public a5.a f19444w;
    public String f19445x;
    public boolean f19446y;
    public boolean f19447z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f19427b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f19427b = null;
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
        ei.f5 f5Var = this.f19426a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8335a).getUser(Long.valueOf(this.f19426a.f8337c)));
    }
}

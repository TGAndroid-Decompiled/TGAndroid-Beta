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
    public ei.f5 f21368a;
    public org.telegram.ui.web.z0 f21369b;
    public org.telegram.ui.m3 f21370c;
    public Object d;
    public boolean f21371e;
    public String f21372f;
    public int f21373g;
    public int h;
    public int f21374i;
    public boolean f21375j;
    public float f21376k = Float.MAX_VALUE;
    public boolean f21377l = true;
    public Bitmap f21378m;
    public boolean f21379n;
    public boolean f21380o;
    public int f21381p;
    public int f21382q;
    public int f21383r;
    public int f21384s;
    public boolean f21385t;
    public boolean f21386u;
    public boolean v;
    public a5.a f21387w;
    public String f21388x;
    public boolean f21389y;
    public boolean f21390z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f21369b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f21369b = null;
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
        ei.f5 f5Var = this.f21368a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f9036a).getUser(Long.valueOf(this.f21368a.f9038c)));
    }
}

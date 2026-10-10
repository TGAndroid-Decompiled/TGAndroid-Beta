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
    public ei.a1 K;
    public boolean L;
    public ei.e5 f21379a;
    public org.telegram.ui.web.y0 f21380b;
    public org.telegram.ui.m3 f21381c;
    public Object d;
    public boolean f21382e;
    public String f21383f;
    public int f21384g;
    public int h;
    public int f21385i;
    public boolean f21386j;
    public float f21387k = Float.MAX_VALUE;
    public boolean f21388l = true;
    public Bitmap f21389m;
    public boolean f21390n;
    public boolean f21391o;
    public int f21392p;
    public int f21393q;
    public int f21394r;
    public int f21395s;
    public boolean f21396t;
    public boolean f21397u;
    public boolean v;
    public a5.a f21398w;
    public String f21399x;
    public boolean f21400y;
    public boolean f21401z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f21380b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f21380b = null;
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
        ei.e5 e5Var = this.f21379a;
        if (e5Var == null) {
            return "";
        }
        if (e5Var.f9041g == 6) {
            return e5Var.f9039e;
        }
        return UserObject.getUserName(MessagesController.getInstance(e5Var.f9036a).getUser(Long.valueOf(this.f21379a.f9038c)));
    }
}

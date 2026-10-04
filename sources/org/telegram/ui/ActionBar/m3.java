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
    public ei.f5 f21369a;
    public org.telegram.ui.web.z0 f21370b;
    public org.telegram.ui.m3 f21371c;
    public Object d;
    public boolean f21372e;
    public String f21373f;
    public int f21374g;
    public int h;
    public int f21375i;
    public boolean f21376j;
    public float f21377k = Float.MAX_VALUE;
    public boolean f21378l = true;
    public Bitmap f21379m;
    public boolean f21380n;
    public boolean f21381o;
    public int f21382p;
    public int f21383q;
    public int f21384r;
    public int f21385s;
    public boolean f21386t;
    public boolean f21387u;
    public boolean v;
    public a5.a f21388w;
    public String f21389x;
    public boolean f21390y;
    public boolean f21391z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f21370b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f21370b = null;
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
        ei.f5 f5Var = this.f21369a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f9036a).getUser(Long.valueOf(this.f21369a.f9038c)));
    }
}

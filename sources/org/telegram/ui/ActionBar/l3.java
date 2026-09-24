package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public class l3 {
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
    public ei.f5 f19583a;
    public org.telegram.ui.web.y0 f19584b;
    public org.telegram.ui.m3 f19585c;
    public Object d;
    public boolean e;
    public String f19586f;
    public int f19587g;
    public int h;
    public int f19588i;
    public boolean f19589j;
    public float f19590k = Float.MAX_VALUE;
    public boolean f19591l = true;
    public Bitmap f19592m;
    public boolean f19593n;
    public boolean f19594o;
    public int f19595p;
    public int f19596q;
    public int f19597r;
    public int f19598s;
    public boolean f19599t;
    public boolean f19600u;
    public boolean v;
    public a5.a f19601w;
    public String f19602x;
    public boolean f19603y;
    public boolean f19604z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f19584b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f19584b = null;
            }
            org.telegram.ui.i4 i4Var = this.J;
            if (i4Var != null) {
                i4Var.s();
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
        ei.f5 f5Var = this.f19583a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8322a).getUser(Long.valueOf(this.f19583a.f8324c)));
    }
}

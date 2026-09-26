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
    public ei.f5 f19597a;
    public org.telegram.ui.web.y0 f19598b;
    public org.telegram.ui.m3 f19599c;
    public Object d;
    public boolean e;
    public String f19600f;
    public int f19601g;
    public int h;
    public int f19602i;
    public boolean f19603j;
    public float f19604k = Float.MAX_VALUE;
    public boolean f19605l = true;
    public Bitmap f19606m;
    public boolean f19607n;
    public boolean f19608o;
    public int f19609p;
    public int f19610q;
    public int f19611r;
    public int f19612s;
    public boolean f19613t;
    public boolean f19614u;
    public boolean v;
    public a5.a f19615w;
    public String f19616x;
    public boolean f19617y;
    public boolean f19618z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f19598b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f19598b = null;
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
        ei.f5 f5Var = this.f19597a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8322a).getUser(Long.valueOf(this.f19597a.f8324c)));
    }
}

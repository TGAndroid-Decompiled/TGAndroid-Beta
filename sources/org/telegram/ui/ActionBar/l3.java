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
    public ei.f5 f19598a;
    public org.telegram.ui.web.y0 f19599b;
    public org.telegram.ui.m3 f19600c;
    public Object d;
    public boolean e;
    public String f19601f;
    public int f19602g;
    public int h;
    public int f19603i;
    public boolean f19604j;
    public float f19605k = Float.MAX_VALUE;
    public boolean f19606l = true;
    public Bitmap f19607m;
    public boolean f19608n;
    public boolean f19609o;
    public int f19610p;
    public int f19611q;
    public int f19612r;
    public int f19613s;
    public boolean f19614t;
    public boolean f19615u;
    public boolean v;
    public a5.a f19616w;
    public String f19617x;
    public boolean f19618y;
    public boolean f19619z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f19599b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f19599b = null;
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
        ei.f5 f5Var = this.f19598a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8322a).getUser(Long.valueOf(this.f19598a.f8324c)));
    }
}

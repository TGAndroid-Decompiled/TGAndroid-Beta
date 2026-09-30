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
    public ei.f5 f19599a;
    public org.telegram.ui.web.y0 f19600b;
    public org.telegram.ui.m3 f19601c;
    public Object d;
    public boolean e;
    public String f19602f;
    public int f19603g;
    public int h;
    public int f19604i;
    public boolean f19605j;
    public float f19606k = Float.MAX_VALUE;
    public boolean f19607l = true;
    public Bitmap f19608m;
    public boolean f19609n;
    public boolean f19610o;
    public int f19611p;
    public int f19612q;
    public int f19613r;
    public int f19614s;
    public boolean f19615t;
    public boolean f19616u;
    public boolean v;
    public a5.a f19617w;
    public String f19618x;
    public boolean f19619y;
    public boolean f19620z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f19600b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f19600b = null;
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
        ei.f5 f5Var = this.f19599a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8322a).getUser(Long.valueOf(this.f19599a.f8324c)));
    }
}

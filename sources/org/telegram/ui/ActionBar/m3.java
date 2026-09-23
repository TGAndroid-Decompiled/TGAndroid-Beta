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
    public ei.f5 f19370a;
    public org.telegram.ui.web.y0 f19371b;
    public org.telegram.ui.m3 f19372c;
    public Object d;
    public boolean e;
    public String f19373f;
    public int f19374g;
    public int h;
    public int f19375i;
    public boolean f19376j;
    public float f19377k = Float.MAX_VALUE;
    public boolean f19378l = true;
    public Bitmap f19379m;
    public boolean f19380n;
    public boolean f19381o;
    public int f19382p;
    public int f19383q;
    public int f19384r;
    public int f19385s;
    public boolean f19386t;
    public boolean f19387u;
    public boolean v;
    public a5.a f19388w;
    public String f19389x;
    public boolean f19390y;
    public boolean f19391z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f19371b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f19371b = null;
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
        ei.f5 f5Var = this.f19370a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8323a).getUser(Long.valueOf(this.f19370a.f8325c)));
    }
}

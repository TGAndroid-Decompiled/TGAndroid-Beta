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
    public org.telegram.ui.n4 J;
    public rh.u0 K;
    public boolean L;
    public rh.y3 f20423a;
    public org.telegram.ui.web.y0 f20424b;
    public org.telegram.ui.r3 f20425c;
    public Object d;
    public boolean e;
    public String f20426f;
    public int f20427g;
    public int h;
    public int f20428i;
    public boolean f20429j;
    public float f20430k = Float.MAX_VALUE;
    public boolean f20431l = true;
    public Bitmap f20432m;
    public boolean f20433n;
    public boolean f20434o;
    public int f20435p;
    public int f20436q;
    public int f20437r;
    public int f20438s;
    public boolean f20439t;
    public boolean f20440u;
    public boolean v;
    public b4.e0 f20441w;
    public String f20442x;
    public boolean f20443y;
    public boolean f20444z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f20424b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f20424b = null;
            }
            org.telegram.ui.n4 n4Var = this.J;
            if (n4Var != null) {
                n4Var.s();
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
        rh.y3 y3Var = this.f20423a;
        if (y3Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(y3Var.f43919a).getUser(Long.valueOf(this.f20423a.f43921c)));
    }
}

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
    public String C;
    public Bitmap D;
    public boolean E;
    public String F;
    public float G;
    public org.telegram.ui.l4 H;
    public sh.u0 I;
    public boolean J;
    public sh.y3 f22162a;
    public org.telegram.ui.web.x0 f22163b;
    public org.telegram.ui.p3 f22164c;
    public Object d;
    public int f22165e;
    public int f22166f;
    public int f22167g;
    public boolean h;
    public float f22168i = Float.MAX_VALUE;
    public boolean f22169j = true;
    public Bitmap f22170k;
    public boolean f22171l;
    public boolean f22172m;
    public int f22173n;
    public int f22174o;
    public int f22175p;
    public int f22176q;
    public boolean f22177r;
    public boolean f22178s;
    public boolean f22179t;
    public b4.e0 f22180u;
    public String v;
    public boolean f22181w;
    public boolean f22182x;
    public boolean f22183y;
    public boolean f22184z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f22163b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f22163b = null;
            }
            org.telegram.ui.l4 l4Var = this.H;
            if (l4Var != null) {
                l4Var.s();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public String b() {
        if (this.H != null) {
            if (TextUtils.isEmpty(this.C)) {
                return LocaleController.getString(R.string.WebEmpty);
            }
            return this.C;
        }
        sh.y3 y3Var = this.f22162a;
        if (y3Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(y3Var.f47824a).getUser(Long.valueOf(this.f22162a.f47826c)));
    }
}

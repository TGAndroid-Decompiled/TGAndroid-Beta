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
    public sh.y3 f22160a;
    public org.telegram.ui.web.x0 f22161b;
    public org.telegram.ui.p3 f22162c;
    public Object d;
    public int f22163e;
    public int f22164f;
    public int f22165g;
    public boolean h;
    public float f22166i = Float.MAX_VALUE;
    public boolean f22167j = true;
    public Bitmap f22168k;
    public boolean f22169l;
    public boolean f22170m;
    public int f22171n;
    public int f22172o;
    public int f22173p;
    public int f22174q;
    public boolean f22175r;
    public boolean f22176s;
    public boolean f22177t;
    public b4.e0 f22178u;
    public String v;
    public boolean f22179w;
    public boolean f22180x;
    public boolean f22181y;
    public boolean f22182z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.f22161b;
            if (x0Var != null) {
                x0Var.destroy();
                this.f22161b = null;
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
        sh.y3 y3Var = this.f22160a;
        if (y3Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(y3Var.f47788a).getUser(Long.valueOf(this.f22160a.f47790c)));
    }
}

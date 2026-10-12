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
    public org.telegram.ui.k4 J;
    public fi.z0 K;
    public boolean L;
    public fi.e5 f20485a;
    public org.telegram.ui.web.y0 f20486b;
    public org.telegram.ui.o3 f20487c;
    public Object d;
    public boolean e;
    public String f20488f;
    public int f20489g;
    public int h;
    public int f20490i;
    public boolean f20491j;
    public float f20492k = Float.MAX_VALUE;
    public boolean f20493l = true;
    public Bitmap f20494m;
    public boolean f20495n;
    public boolean f20496o;
    public int f20497p;
    public int f20498q;
    public int f20499r;
    public int f20500s;
    public boolean f20501t;
    public boolean f20502u;
    public boolean v;
    public a5.a f20503w;
    public String f20504x;
    public boolean f20505y;
    public boolean f20506z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.f20486b;
            if (y0Var != null) {
                y0Var.destroy();
                this.f20486b = null;
            }
            org.telegram.ui.k4 k4Var = this.J;
            if (k4Var != null) {
                k4Var.s();
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
        fi.e5 e5Var = this.f20485a;
        if (e5Var == null) {
            return "";
        }
        if (e5Var.f9255g == 6) {
            return e5Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(e5Var.f9251a).getUser(Long.valueOf(this.f20485a.f9253c)));
    }
}

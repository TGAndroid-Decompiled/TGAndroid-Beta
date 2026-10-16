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
    public fi.e5 f20185a;
    public org.telegram.ui.web.z0 f20186b;
    public org.telegram.ui.o3 f20187c;
    public Object d;
    public boolean e;
    public String f20188f;
    public int f20189g;
    public int h;
    public int f20190i;
    public boolean f20191j;
    public float f20192k = Float.MAX_VALUE;
    public boolean f20193l = true;
    public Bitmap f20194m;
    public boolean f20195n;
    public boolean f20196o;
    public int f20197p;
    public int f20198q;
    public int f20199r;
    public int f20200s;
    public boolean f20201t;
    public boolean f20202u;
    public boolean v;
    public a5.a f20203w;
    public String f20204x;
    public boolean f20205y;
    public boolean f20206z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f20186b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f20186b = null;
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
        fi.e5 e5Var = this.f20185a;
        if (e5Var == null) {
            return "";
        }
        if (e5Var.f9258g == 6) {
            return e5Var.e;
        }
        return UserObject.getUserName(MessagesController.getInstance(e5Var.f9254a).getUser(Long.valueOf(this.f20185a.f9256c)));
    }
}

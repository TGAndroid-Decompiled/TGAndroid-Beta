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
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.h4 J;
    public ei.a1 K;
    public boolean L;
    public ei.f5 f19646a;
    public org.telegram.ui.web.z0 f19647b;
    public org.telegram.ui.l3 f19648c;
    public Object d;
    public boolean e;
    public String f19649f;
    public int f19650g;
    public int h;
    public int f19651i;
    public boolean f19652j;
    public float f19653k = Float.MAX_VALUE;
    public boolean f19654l = true;
    public Bitmap f19655m;
    public boolean f19656n;
    public boolean f19657o;
    public int f19658p;
    public int f19659q;
    public int f19660r;
    public int f19661s;
    public boolean f19662t;
    public boolean f19663u;
    public boolean v;
    public a5.a f19664w;
    public String f19665x;
    public boolean f19666y;
    public boolean f19667z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f19647b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f19647b = null;
            }
            org.telegram.ui.h4 h4Var = this.J;
            if (h4Var != null) {
                h4Var.s();
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
        ei.f5 f5Var = this.f19646a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8340a).getUser(Long.valueOf(this.f19646a.f8342c)));
    }
}

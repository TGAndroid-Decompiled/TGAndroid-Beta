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
    public ei.f5 f19661a;
    public org.telegram.ui.web.z0 f19662b;
    public org.telegram.ui.l3 f19663c;
    public Object d;
    public boolean e;
    public String f19664f;
    public int f19665g;
    public int h;
    public int f19666i;
    public boolean f19667j;
    public float f19668k = Float.MAX_VALUE;
    public boolean f19669l = true;
    public Bitmap f19670m;
    public boolean f19671n;
    public boolean f19672o;
    public int f19673p;
    public int f19674q;
    public int f19675r;
    public int f19676s;
    public boolean f19677t;
    public boolean f19678u;
    public boolean v;
    public a5.a f19679w;
    public String f19680x;
    public boolean f19681y;
    public boolean f19682z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f19662b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f19662b = null;
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
        ei.f5 f5Var = this.f19661a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8339a).getUser(Long.valueOf(this.f19661a.f8341c)));
    }
}

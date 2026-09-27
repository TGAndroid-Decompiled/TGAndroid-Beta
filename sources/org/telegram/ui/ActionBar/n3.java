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
    public org.telegram.ui.j4 J;
    public ei.a1 K;
    public boolean L;
    public ei.f5 f19649a;
    public org.telegram.ui.web.z0 f19650b;
    public org.telegram.ui.n3 f19651c;
    public Object d;
    public boolean e;
    public String f19652f;
    public int f19653g;
    public int h;
    public int f19654i;
    public boolean f19655j;
    public float f19656k = Float.MAX_VALUE;
    public boolean f19657l = true;
    public Bitmap f19658m;
    public boolean f19659n;
    public boolean f19660o;
    public int f19661p;
    public int f19662q;
    public int f19663r;
    public int f19664s;
    public boolean f19665t;
    public boolean f19666u;
    public boolean v;
    public a5.a f19667w;
    public String f19668x;
    public boolean f19669y;
    public boolean f19670z;

    public final void a() {
        try {
            org.telegram.ui.web.z0 z0Var = this.f19650b;
            if (z0Var != null) {
                z0Var.destroy();
                this.f19650b = null;
            }
            org.telegram.ui.j4 j4Var = this.J;
            if (j4Var != null) {
                j4Var.s();
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
        ei.f5 f5Var = this.f19649a;
        if (f5Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(f5Var.f8324a).getUser(Long.valueOf(this.f19649a.f8326c)));
    }
}

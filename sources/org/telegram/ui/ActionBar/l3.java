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
    public String C;
    public Bitmap D;
    public boolean E;
    public String F;
    public float G;
    public org.telegram.ui.l4 H;
    public mh.y0 I;
    public boolean J;
    public mh.s4 f23619a;
    public org.telegram.ui.web.v0 f23620b;
    public org.telegram.ui.p3 f23621c;
    public Object d;
    public int f23622e;
    public int f23623f;
    public int f23624g;
    public boolean h;
    public float f23625i = Float.MAX_VALUE;
    public boolean f23626j = true;
    public Bitmap f23627k;
    public boolean f23628l;
    public boolean f23629m;
    public int f23630n;
    public int f23631o;
    public int f23632p;
    public int f23633q;
    public boolean f23634r;
    public boolean f23635s;
    public boolean f23636t;
    public a6.a f23637u;
    public String v;
    public boolean f23638w;
    public boolean f23639x;
    public boolean f23640y;
    public boolean f23641z;

    public final void a() {
        try {
            org.telegram.ui.web.v0 v0Var = this.f23620b;
            if (v0Var != null) {
                v0Var.destroy();
                this.f23620b = null;
            }
            org.telegram.ui.l4 l4Var = this.H;
            if (l4Var != null) {
                l4Var.s();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public String b() {
        if (this.H != null) {
            if (TextUtils.isEmpty(this.C)) {
                return LocaleController.getString(R.string.WebEmpty);
            }
            return this.C;
        }
        mh.s4 s4Var = this.f23619a;
        if (s4Var == null) {
            return "";
        }
        return UserObject.getUserName(MessagesController.getInstance(s4Var.f18105a).getUser(Long.valueOf(this.f23619a.f18107c)));
    }
}

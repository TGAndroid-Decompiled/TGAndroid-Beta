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
    public org.telegram.ui.m4 H;
    public nh.x0 I;
    public boolean J;

    public nh.q4 f23623a;

    public org.telegram.ui.web.w0 f23624b;

    public org.telegram.ui.q3 f23625c;
    public Object d;

    public int f23626e;

    public int f23627f;

    public int f23628g;
    public boolean h;

    public float f23629i = Float.MAX_VALUE;

    public boolean f23630j = true;

    public Bitmap f23631k;

    public boolean f23632l;

    public boolean f23633m;

    public int f23634n;

    public int f23635o;

    public int f23636p;

    public int f23637q;

    public boolean f23638r;

    public boolean f23639s;

    public boolean f23640t;

    public b6.a f23641u;
    public String v;

    public boolean f23642w;

    public boolean f23643x;

    public boolean f23644y;

    public boolean f23645z;

    public final void a() {
        try {
            org.telegram.ui.web.w0 w0Var = this.f23624b;
            if (w0Var != null) {
                w0Var.destroy();
                this.f23624b = null;
            }
            org.telegram.ui.m4 m4Var = this.H;
            if (m4Var != null) {
                m4Var.s();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public String b() {
        if (this.H != null) {
            return TextUtils.isEmpty(this.C) ? LocaleController.getString(R.string.WebEmpty) : this.C;
        }
        nh.q4 q4Var = this.f23623a;
        return q4Var == null ? "" : UserObject.getUserName(MessagesController.getInstance(q4Var.f18905a).getUser(Long.valueOf(this.f23623a.f18907c)));
    }
}

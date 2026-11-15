package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class fh0 extends ImageView {
    public HashMap f34606a;
    public ch0 f34607b;
    public dh0 f34608c;
    public boolean d;
    public boolean f34609e;
    public boolean f34610f;
    public Integer h;
    public boolean f34611n;

    public fh0(Context context) {
        super(context);
    }

    public final void a() {
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null) {
            ch0Var.stop();
        }
        dh0 dh0Var = this.f34608c;
        if (dh0Var != null) {
            dh0Var.R();
            this.f34608c = null;
        }
        this.f34607b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null && ch0Var.f33586l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null || this.f34608c != null) {
            this.f34610f = true;
            if (this.f34609e) {
                if (ch0Var != null) {
                    ch0Var.start();
                }
                dh0 dh0Var = this.f34608c;
                if (dh0Var != null) {
                    dh0Var.P0(false);
                }
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new ch0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fh0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public ch0 getAnimatedDrawable() {
        return this.f34607b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f34608c;
    }

    public final void h(int i7, String str) {
        if (this.f34606a == null) {
            this.f34606a = new HashMap();
        }
        this.f34606a.put(str, Integer.valueOf(i7));
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null) {
            ch0Var.Q(i7, str);
        }
    }

    public final void i() {
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null || this.f34608c != null) {
            this.f34610f = false;
            if (this.f34609e) {
                if (ch0Var != null) {
                    ch0Var.stop();
                }
                dh0 dh0Var = this.f34608c;
                if (dh0Var != null) {
                    dh0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34609e = true;
        dh0 dh0Var = this.f34608c;
        if (dh0Var != null) {
            dh0Var.P();
            if (this.f34610f) {
                this.f34608c.P0(false);
            }
        }
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null) {
            ch0Var.setCallback(this);
            if (this.f34610f) {
                this.f34607b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34609e = false;
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null) {
            ch0Var.stop();
        }
        dh0 dh0Var = this.f34608c;
        if (dh0Var != null) {
            dh0Var.R();
        }
    }

    public void setAnimation(ch0 ch0Var) {
        if (this.f34607b == ch0Var) {
            return;
        }
        dh0 dh0Var = this.f34608c;
        if (dh0Var != null) {
            dh0Var.R();
            this.f34608c = null;
        }
        this.f34607b = ch0Var;
        ch0Var.R(this);
        if (this.d) {
            this.f34607b.K(1);
        }
        HashMap hashMap = this.f34606a;
        if (hashMap != null) {
            this.f34607b.f33571a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ch0 ch0Var2 = this.f34607b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ch0Var2.f33594s.put((String) entry.getKey(), num);
                ch0Var2.G();
            }
            this.f34607b.o();
        }
        this.f34607b.J(true);
        setImageDrawable(this.f34607b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f34607b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        dh0 dh0Var = this.f34608c;
        if (dh0Var != null) {
            dh0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null) {
            ch0Var.f33597u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f34611n = z10;
    }

    public void setProgress(float f10) {
        ch0 ch0Var = this.f34607b;
        if (ch0Var != null) {
            ch0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

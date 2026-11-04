package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class fh0 extends ImageView {
    public HashMap f33797a;
    public ch0 f33798b;
    public dh0 f33799c;
    public boolean d;
    public boolean f33800e;
    public boolean f33801f;
    public Integer h;
    public boolean f33802n;

    public fh0(Context context) {
        super(context);
    }

    public final void a() {
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null) {
            ch0Var.stop();
        }
        dh0 dh0Var = this.f33799c;
        if (dh0Var != null) {
            dh0Var.R();
            this.f33799c = null;
        }
        this.f33798b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null && ch0Var.f32734l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null || this.f33799c != null) {
            this.f33801f = true;
            if (this.f33800e) {
                if (ch0Var != null) {
                    ch0Var.start();
                }
                dh0 dh0Var = this.f33799c;
                if (dh0Var != null) {
                    dh0Var.P0(false);
                }
            }
        }
    }

    public final void e(int i3, int i10, int i11) {
        f(i3, i10, i11, null);
    }

    public final void f(int i3, int i10, int i11, int[] iArr) {
        setAnimation(new ch0(i3, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fh0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public ch0 getAnimatedDrawable() {
        return this.f33798b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f33799c;
    }

    public final void h(int i3, String str) {
        if (this.f33797a == null) {
            this.f33797a = new HashMap();
        }
        this.f33797a.put(str, Integer.valueOf(i3));
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null) {
            ch0Var.Q(i3, str);
        }
    }

    public final void i() {
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null || this.f33799c != null) {
            this.f33801f = false;
            if (this.f33800e) {
                if (ch0Var != null) {
                    ch0Var.stop();
                }
                dh0 dh0Var = this.f33799c;
                if (dh0Var != null) {
                    dh0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33800e = true;
        dh0 dh0Var = this.f33799c;
        if (dh0Var != null) {
            dh0Var.P();
            if (this.f33801f) {
                this.f33799c.P0(false);
            }
        }
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null) {
            ch0Var.setCallback(this);
            if (this.f33801f) {
                this.f33798b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33800e = false;
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null) {
            ch0Var.stop();
        }
        dh0 dh0Var = this.f33799c;
        if (dh0Var != null) {
            dh0Var.R();
        }
    }

    public void setAnimation(ch0 ch0Var) {
        if (this.f33798b == ch0Var) {
            return;
        }
        dh0 dh0Var = this.f33799c;
        if (dh0Var != null) {
            dh0Var.R();
            this.f33799c = null;
        }
        this.f33798b = ch0Var;
        ch0Var.R(this);
        if (this.d) {
            this.f33798b.K(1);
        }
        HashMap hashMap = this.f33797a;
        if (hashMap != null) {
            this.f33798b.f32719a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ch0 ch0Var2 = this.f33798b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ch0Var2.f32742s.put((String) entry.getKey(), num);
                ch0Var2.G();
            }
            this.f33798b.o();
        }
        this.f33798b.J(true);
        setImageDrawable(this.f33798b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i3) {
        super.setImageResource(i3);
        this.f33798b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        dh0 dh0Var = this.f33799c;
        if (dh0Var != null) {
            dh0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null) {
            ch0Var.f32745u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f33802n = z10;
    }

    public void setProgress(float f10) {
        ch0 ch0Var = this.f33798b;
        if (ch0Var != null) {
            ch0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

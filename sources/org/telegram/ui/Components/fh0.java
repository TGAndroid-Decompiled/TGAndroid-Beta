package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class fh0 extends ImageView {
    public HashMap f34610a;
    public ch0 f34611b;
    public dh0 f34612c;
    public boolean d;
    public boolean f34613e;
    public boolean f34614f;
    public Integer h;
    public boolean f34615n;

    public fh0(Context context) {
        super(context);
    }

    public final void a() {
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null) {
            ch0Var.stop();
        }
        dh0 dh0Var = this.f34612c;
        if (dh0Var != null) {
            dh0Var.R();
            this.f34612c = null;
        }
        this.f34611b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null && ch0Var.f33588l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null || this.f34612c != null) {
            this.f34614f = true;
            if (this.f34613e) {
                if (ch0Var != null) {
                    ch0Var.start();
                }
                dh0 dh0Var = this.f34612c;
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
        return this.f34611b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f34612c;
    }

    public final void h(int i7, String str) {
        if (this.f34610a == null) {
            this.f34610a = new HashMap();
        }
        this.f34610a.put(str, Integer.valueOf(i7));
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null) {
            ch0Var.Q(i7, str);
        }
    }

    public final void i() {
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null || this.f34612c != null) {
            this.f34614f = false;
            if (this.f34613e) {
                if (ch0Var != null) {
                    ch0Var.stop();
                }
                dh0 dh0Var = this.f34612c;
                if (dh0Var != null) {
                    dh0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34613e = true;
        dh0 dh0Var = this.f34612c;
        if (dh0Var != null) {
            dh0Var.P();
            if (this.f34614f) {
                this.f34612c.P0(false);
            }
        }
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null) {
            ch0Var.setCallback(this);
            if (this.f34614f) {
                this.f34611b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34613e = false;
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null) {
            ch0Var.stop();
        }
        dh0 dh0Var = this.f34612c;
        if (dh0Var != null) {
            dh0Var.R();
        }
    }

    public void setAnimation(ch0 ch0Var) {
        if (this.f34611b == ch0Var) {
            return;
        }
        dh0 dh0Var = this.f34612c;
        if (dh0Var != null) {
            dh0Var.R();
            this.f34612c = null;
        }
        this.f34611b = ch0Var;
        ch0Var.R(this);
        if (this.d) {
            this.f34611b.K(1);
        }
        HashMap hashMap = this.f34610a;
        if (hashMap != null) {
            this.f34611b.f33573a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ch0 ch0Var2 = this.f34611b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ch0Var2.f33596s.put((String) entry.getKey(), num);
                ch0Var2.G();
            }
            this.f34611b.o();
        }
        this.f34611b.J(true);
        setImageDrawable(this.f34611b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f34611b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        dh0 dh0Var = this.f34612c;
        if (dh0Var != null) {
            dh0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null) {
            ch0Var.f33599u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f34615n = z10;
    }

    public void setProgress(float f10) {
        ch0 ch0Var = this.f34611b;
        if (ch0Var != null) {
            ch0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

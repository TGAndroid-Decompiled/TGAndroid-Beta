package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class qh0 extends ImageView {
    public HashMap f38878a;
    public nh0 f38879b;
    public oh0 f38880c;
    public boolean d;
    public boolean f38881e;
    public boolean f38882f;
    public Integer h;
    public boolean f38883n;

    public qh0(Context context) {
        super(context);
    }

    public final void a() {
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null) {
            nh0Var.stop();
        }
        oh0 oh0Var = this.f38880c;
        if (oh0Var != null) {
            oh0Var.S();
            this.f38880c = null;
        }
        this.f38879b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null && nh0Var.f37814l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null || this.f38880c != null) {
            this.f38882f = true;
            if (this.f38881e) {
                if (nh0Var != null) {
                    nh0Var.start();
                }
                oh0 oh0Var = this.f38880c;
                if (oh0Var != null) {
                    oh0Var.Q0(false);
                }
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new nh0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qh0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public nh0 getAnimatedDrawable() {
        return this.f38879b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f38880c;
    }

    public final void h(int i7, String str) {
        if (this.f38878a == null) {
            this.f38878a = new HashMap();
        }
        this.f38878a.put(str, Integer.valueOf(i7));
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null) {
            nh0Var.Q(i7, str);
        }
    }

    public final void i() {
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null || this.f38880c != null) {
            this.f38882f = false;
            if (this.f38881e) {
                if (nh0Var != null) {
                    nh0Var.stop();
                }
                oh0 oh0Var = this.f38880c;
                if (oh0Var != null) {
                    oh0Var.R0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38881e = true;
        oh0 oh0Var = this.f38880c;
        if (oh0Var != null) {
            oh0Var.Q();
            if (this.f38882f) {
                this.f38880c.Q0(false);
            }
        }
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null) {
            nh0Var.setCallback(this);
            if (this.f38882f) {
                this.f38879b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38881e = false;
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null) {
            nh0Var.stop();
        }
        oh0 oh0Var = this.f38880c;
        if (oh0Var != null) {
            oh0Var.S();
        }
    }

    public void setAnimation(nh0 nh0Var) {
        if (this.f38879b == nh0Var) {
            return;
        }
        oh0 oh0Var = this.f38880c;
        if (oh0Var != null) {
            oh0Var.S();
            this.f38880c = null;
        }
        this.f38879b = nh0Var;
        nh0Var.R(this);
        if (this.d) {
            this.f38879b.K(1);
        }
        HashMap hashMap = this.f38878a;
        if (hashMap != null) {
            this.f38879b.f37799a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                nh0 nh0Var2 = this.f38879b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                nh0Var2.f37822s.put((String) entry.getKey(), num);
                nh0Var2.G();
            }
            this.f38879b.o();
        }
        this.f38879b.J(true);
        setImageDrawable(this.f38879b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f38879b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        oh0 oh0Var = this.f38880c;
        if (oh0Var != null) {
            oh0Var.F0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null) {
            nh0Var.f37825u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f38883n = z10;
    }

    public void setProgress(float f10) {
        nh0 nh0Var = this.f38879b;
        if (nh0Var != null) {
            nh0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

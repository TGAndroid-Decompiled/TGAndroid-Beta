package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class rh0 extends ImageView {
    public HashMap f39230a;
    public oh0 f39231b;
    public ph0 f39232c;
    public boolean d;
    public boolean f39233e;
    public boolean f39234f;
    public Integer h;
    public boolean f39235n;

    public rh0(Context context) {
        super(context);
    }

    public final void a() {
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null) {
            oh0Var.stop();
        }
        ph0 ph0Var = this.f39232c;
        if (ph0Var != null) {
            ph0Var.R();
            this.f39232c = null;
        }
        this.f39231b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null && oh0Var.f38219l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null || this.f39232c != null) {
            this.f39234f = true;
            if (this.f39233e) {
                if (oh0Var != null) {
                    oh0Var.start();
                }
                ph0 ph0Var = this.f39232c;
                if (ph0Var != null) {
                    ph0Var.P0(false);
                }
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new oh0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rh0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public oh0 getAnimatedDrawable() {
        return this.f39231b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f39232c;
    }

    public final void h(int i7, String str) {
        if (this.f39230a == null) {
            this.f39230a = new HashMap();
        }
        this.f39230a.put(str, Integer.valueOf(i7));
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null) {
            oh0Var.Q(i7, str);
        }
    }

    public final void i() {
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null || this.f39232c != null) {
            this.f39234f = false;
            if (this.f39233e) {
                if (oh0Var != null) {
                    oh0Var.stop();
                }
                ph0 ph0Var = this.f39232c;
                if (ph0Var != null) {
                    ph0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39233e = true;
        ph0 ph0Var = this.f39232c;
        if (ph0Var != null) {
            ph0Var.P();
            if (this.f39234f) {
                this.f39232c.P0(false);
            }
        }
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null) {
            oh0Var.setCallback(this);
            if (this.f39234f) {
                this.f39231b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39233e = false;
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null) {
            oh0Var.stop();
        }
        ph0 ph0Var = this.f39232c;
        if (ph0Var != null) {
            ph0Var.R();
        }
    }

    public void setAnimation(oh0 oh0Var) {
        if (this.f39231b == oh0Var) {
            return;
        }
        ph0 ph0Var = this.f39232c;
        if (ph0Var != null) {
            ph0Var.R();
            this.f39232c = null;
        }
        this.f39231b = oh0Var;
        oh0Var.R(this);
        if (this.d) {
            this.f39231b.K(1);
        }
        HashMap hashMap = this.f39230a;
        if (hashMap != null) {
            this.f39231b.f38204a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                oh0 oh0Var2 = this.f39231b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                oh0Var2.f38227s.put((String) entry.getKey(), num);
                oh0Var2.G();
            }
            this.f39231b.o();
        }
        this.f39231b.J(true);
        setImageDrawable(this.f39231b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f39231b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ph0 ph0Var = this.f39232c;
        if (ph0Var != null) {
            ph0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null) {
            oh0Var.f38230u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f39235n = z10;
    }

    public void setProgress(float f10) {
        oh0 oh0Var = this.f39231b;
        if (oh0Var != null) {
            oh0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class rh0 extends ImageView {
    public HashMap f39185a;
    public oh0 f39186b;
    public ph0 f39187c;
    public boolean d;
    public boolean f39188e;
    public boolean f39189f;
    public Integer h;
    public boolean f39190n;

    public rh0(Context context) {
        super(context);
    }

    public final void a() {
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null) {
            oh0Var.stop();
        }
        ph0 ph0Var = this.f39187c;
        if (ph0Var != null) {
            ph0Var.R();
            this.f39187c = null;
        }
        this.f39186b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null && oh0Var.f38188l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null || this.f39187c != null) {
            this.f39189f = true;
            if (this.f39188e) {
                if (oh0Var != null) {
                    oh0Var.start();
                }
                ph0 ph0Var = this.f39187c;
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
        return this.f39186b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f39187c;
    }

    public final void h(int i7, String str) {
        if (this.f39185a == null) {
            this.f39185a = new HashMap();
        }
        this.f39185a.put(str, Integer.valueOf(i7));
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null) {
            oh0Var.Q(i7, str);
        }
    }

    public final void i() {
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null || this.f39187c != null) {
            this.f39189f = false;
            if (this.f39188e) {
                if (oh0Var != null) {
                    oh0Var.stop();
                }
                ph0 ph0Var = this.f39187c;
                if (ph0Var != null) {
                    ph0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39188e = true;
        ph0 ph0Var = this.f39187c;
        if (ph0Var != null) {
            ph0Var.P();
            if (this.f39189f) {
                this.f39187c.P0(false);
            }
        }
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null) {
            oh0Var.setCallback(this);
            if (this.f39189f) {
                this.f39186b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39188e = false;
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null) {
            oh0Var.stop();
        }
        ph0 ph0Var = this.f39187c;
        if (ph0Var != null) {
            ph0Var.R();
        }
    }

    public void setAnimation(oh0 oh0Var) {
        if (this.f39186b == oh0Var) {
            return;
        }
        ph0 ph0Var = this.f39187c;
        if (ph0Var != null) {
            ph0Var.R();
            this.f39187c = null;
        }
        this.f39186b = oh0Var;
        oh0Var.R(this);
        if (this.d) {
            this.f39186b.K(1);
        }
        HashMap hashMap = this.f39185a;
        if (hashMap != null) {
            this.f39186b.f38173a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                oh0 oh0Var2 = this.f39186b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                oh0Var2.f38196s.put((String) entry.getKey(), num);
                oh0Var2.G();
            }
            this.f39186b.o();
        }
        this.f39186b.J(true);
        setImageDrawable(this.f39186b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f39186b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ph0 ph0Var = this.f39187c;
        if (ph0Var != null) {
            ph0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null) {
            oh0Var.f38199u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f39190n = z10;
    }

    public void setProgress(float f10) {
        oh0 oh0Var = this.f39186b;
        if (oh0Var != null) {
            oh0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

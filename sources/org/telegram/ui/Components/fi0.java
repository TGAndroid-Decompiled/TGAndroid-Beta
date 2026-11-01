package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class fi0 extends ImageView {
    public HashMap f26171a;
    public ci0 f26172b;
    public di0 f26173c;
    public boolean d;
    public boolean e;
    public boolean f26174f;
    public Integer h;
    public boolean f26175n;

    public fi0(Context context) {
        super(context);
    }

    public final void a() {
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null) {
            ci0Var.stop();
        }
        di0 di0Var = this.f26173c;
        if (di0Var != null) {
            di0Var.R();
            this.f26173c = null;
        }
        this.f26172b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null && ci0Var.f25144k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null || this.f26173c != null) {
            this.f26174f = true;
            if (this.e) {
                if (ci0Var != null) {
                    ci0Var.start();
                }
                di0 di0Var = this.f26173c;
                if (di0Var != null) {
                    di0Var.P0(false);
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new ci0(i10, org.telegram.messenger.i0.L(i11), org.telegram.messenger.i0.L(i12), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fi0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public ci0 getAnimatedDrawable() {
        return this.f26172b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f26173c;
    }

    public final void h(int i10, String str) {
        if (this.f26171a == null) {
            this.f26171a = new HashMap();
        }
        this.f26171a.put(str, Integer.valueOf(i10));
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null) {
            ci0Var.Q(i10, str);
        }
    }

    public final void i() {
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null || this.f26173c != null) {
            this.f26174f = false;
            if (this.e) {
                if (ci0Var != null) {
                    ci0Var.stop();
                }
                di0 di0Var = this.f26173c;
                if (di0Var != null) {
                    di0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        di0 di0Var = this.f26173c;
        if (di0Var != null) {
            di0Var.P();
            if (this.f26174f) {
                this.f26173c.P0(false);
            }
        }
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null) {
            ci0Var.setCallback(this);
            if (this.f26174f) {
                this.f26172b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null) {
            ci0Var.stop();
        }
        di0 di0Var = this.f26173c;
        if (di0Var != null) {
            di0Var.R();
        }
    }

    public void setAnimation(ci0 ci0Var) {
        if (this.f26172b == ci0Var) {
            return;
        }
        di0 di0Var = this.f26173c;
        if (di0Var != null) {
            di0Var.R();
            this.f26173c = null;
        }
        this.f26172b = ci0Var;
        ci0Var.R(this);
        if (this.d) {
            this.f26172b.K(1);
        }
        HashMap hashMap = this.f26171a;
        if (hashMap != null) {
            this.f26172b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ci0 ci0Var2 = this.f26172b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ci0Var2.f25153s.put((String) entry.getKey(), num);
                ci0Var2.G();
            }
            this.f26172b.o();
        }
        this.f26172b.J(true);
        setImageDrawable(this.f26172b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f26172b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        di0 di0Var = this.f26173c;
        if (di0Var != null) {
            di0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null) {
            ci0Var.f25155t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f26175n = z10;
    }

    public void setProgress(float f7) {
        ci0 ci0Var = this.f26172b;
        if (ci0Var != null) {
            ci0Var.T(true, f7);
        }
    }

    public void c() {
    }
}

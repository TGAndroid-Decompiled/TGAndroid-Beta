package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class ei0 extends ImageView {
    public HashMap f25807a;
    public bi0 f25808b;
    public ci0 f25809c;
    public boolean d;
    public boolean e;
    public boolean f25810f;
    public Integer h;
    public boolean f25811n;

    public ei0(Context context) {
        super(context);
    }

    public final void a() {
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null) {
            bi0Var.stop();
        }
        ci0 ci0Var = this.f25809c;
        if (ci0Var != null) {
            ci0Var.R();
            this.f25809c = null;
        }
        this.f25808b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null && bi0Var.f24765k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null || this.f25809c != null) {
            this.f25810f = true;
            if (this.e) {
                if (bi0Var != null) {
                    bi0Var.start();
                }
                ci0 ci0Var = this.f25809c;
                if (ci0Var != null) {
                    ci0Var.P0(false);
                }
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new bi0(i10, org.telegram.messenger.i0.L(i11), org.telegram.messenger.i0.L(i12), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ei0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public bi0 getAnimatedDrawable() {
        return this.f25808b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f25809c;
    }

    public final void h(int i10, String str) {
        if (this.f25807a == null) {
            this.f25807a = new HashMap();
        }
        this.f25807a.put(str, Integer.valueOf(i10));
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null) {
            bi0Var.Q(i10, str);
        }
    }

    public final void i() {
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null || this.f25809c != null) {
            this.f25810f = false;
            if (this.e) {
                if (bi0Var != null) {
                    bi0Var.stop();
                }
                ci0 ci0Var = this.f25809c;
                if (ci0Var != null) {
                    ci0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        ci0 ci0Var = this.f25809c;
        if (ci0Var != null) {
            ci0Var.P();
            if (this.f25810f) {
                this.f25809c.P0(false);
            }
        }
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null) {
            bi0Var.setCallback(this);
            if (this.f25810f) {
                this.f25808b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null) {
            bi0Var.stop();
        }
        ci0 ci0Var = this.f25809c;
        if (ci0Var != null) {
            ci0Var.R();
        }
    }

    public void setAnimation(bi0 bi0Var) {
        if (this.f25808b == bi0Var) {
            return;
        }
        ci0 ci0Var = this.f25809c;
        if (ci0Var != null) {
            ci0Var.R();
            this.f25809c = null;
        }
        this.f25808b = bi0Var;
        bi0Var.R(this);
        if (this.d) {
            this.f25808b.K(1);
        }
        HashMap hashMap = this.f25807a;
        if (hashMap != null) {
            this.f25808b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                bi0 bi0Var2 = this.f25808b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                bi0Var2.f24774s.put((String) entry.getKey(), num);
                bi0Var2.G();
            }
            this.f25808b.o();
        }
        this.f25808b.J(true);
        setImageDrawable(this.f25808b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f25808b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ci0 ci0Var = this.f25809c;
        if (ci0Var != null) {
            ci0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null) {
            bi0Var.f24776t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f25811n = z10;
    }

    public void setProgress(float f7) {
        bi0 bi0Var = this.f25808b;
        if (bi0Var != null) {
            bi0Var.T(true, f7);
        }
    }

    public void c() {
    }
}

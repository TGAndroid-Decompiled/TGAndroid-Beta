package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class rh0 extends ImageView {
    public HashMap f39221a;
    public oh0 f39222b;
    public ph0 f39223c;
    public boolean d;
    public boolean f39224e;
    public boolean f39225f;
    public Integer h;
    public boolean f39226n;

    public rh0(Context context) {
        super(context);
    }

    public final void a() {
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null) {
            oh0Var.stop();
        }
        ph0 ph0Var = this.f39223c;
        if (ph0Var != null) {
            ph0Var.R();
            this.f39223c = null;
        }
        this.f39222b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null && oh0Var.f38226l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null || this.f39223c != null) {
            this.f39225f = true;
            if (this.f39224e) {
                if (oh0Var != null) {
                    oh0Var.start();
                }
                ph0 ph0Var = this.f39223c;
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
        return this.f39222b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f39223c;
    }

    public final void h(int i7, String str) {
        if (this.f39221a == null) {
            this.f39221a = new HashMap();
        }
        this.f39221a.put(str, Integer.valueOf(i7));
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null) {
            oh0Var.Q(i7, str);
        }
    }

    public final void i() {
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null || this.f39223c != null) {
            this.f39225f = false;
            if (this.f39224e) {
                if (oh0Var != null) {
                    oh0Var.stop();
                }
                ph0 ph0Var = this.f39223c;
                if (ph0Var != null) {
                    ph0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39224e = true;
        ph0 ph0Var = this.f39223c;
        if (ph0Var != null) {
            ph0Var.P();
            if (this.f39225f) {
                this.f39223c.P0(false);
            }
        }
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null) {
            oh0Var.setCallback(this);
            if (this.f39225f) {
                this.f39222b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39224e = false;
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null) {
            oh0Var.stop();
        }
        ph0 ph0Var = this.f39223c;
        if (ph0Var != null) {
            ph0Var.R();
        }
    }

    public void setAnimation(oh0 oh0Var) {
        if (this.f39222b == oh0Var) {
            return;
        }
        ph0 ph0Var = this.f39223c;
        if (ph0Var != null) {
            ph0Var.R();
            this.f39223c = null;
        }
        this.f39222b = oh0Var;
        oh0Var.R(this);
        if (this.d) {
            this.f39222b.K(1);
        }
        HashMap hashMap = this.f39221a;
        if (hashMap != null) {
            this.f39222b.f38211a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                oh0 oh0Var2 = this.f39222b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                oh0Var2.f38234s.put((String) entry.getKey(), num);
                oh0Var2.G();
            }
            this.f39222b.o();
        }
        this.f39222b.J(true);
        setImageDrawable(this.f39222b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f39222b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ph0 ph0Var = this.f39223c;
        if (ph0Var != null) {
            ph0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null) {
            oh0Var.f38237u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f39226n = z10;
    }

    public void setProgress(float f10) {
        oh0 oh0Var = this.f39222b;
        if (oh0Var != null) {
            oh0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

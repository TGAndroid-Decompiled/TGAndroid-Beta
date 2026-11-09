package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class dh0 extends ImageView {
    public HashMap f32981a;
    public ah0 f32982b;
    public bh0 f32983c;
    public boolean d;
    public boolean f32984e;
    public boolean f32985f;
    public Integer h;
    public boolean f32986n;

    public dh0(Context context) {
        super(context);
    }

    public final void a() {
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null) {
            ah0Var.stop();
        }
        bh0 bh0Var = this.f32983c;
        if (bh0Var != null) {
            bh0Var.R();
            this.f32983c = null;
        }
        this.f32982b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null && ah0Var.f31834k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null || this.f32983c != null) {
            this.f32985f = true;
            if (this.f32984e) {
                if (ah0Var != null) {
                    ah0Var.start();
                }
                bh0 bh0Var = this.f32983c;
                if (bh0Var != null) {
                    bh0Var.P0(false);
                }
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new ah0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dh0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public ah0 getAnimatedDrawable() {
        return this.f32982b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f32983c;
    }

    public final void h(int i7, String str) {
        if (this.f32981a == null) {
            this.f32981a = new HashMap();
        }
        this.f32981a.put(str, Integer.valueOf(i7));
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null) {
            ah0Var.Q(i7, str);
        }
    }

    public final void i() {
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null || this.f32983c != null) {
            this.f32985f = false;
            if (this.f32984e) {
                if (ah0Var != null) {
                    ah0Var.stop();
                }
                bh0 bh0Var = this.f32983c;
                if (bh0Var != null) {
                    bh0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32984e = true;
        bh0 bh0Var = this.f32983c;
        if (bh0Var != null) {
            bh0Var.P();
            if (this.f32985f) {
                this.f32983c.P0(false);
            }
        }
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null) {
            ah0Var.setCallback(this);
            if (this.f32985f) {
                this.f32982b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32984e = false;
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null) {
            ah0Var.stop();
        }
        bh0 bh0Var = this.f32983c;
        if (bh0Var != null) {
            bh0Var.R();
        }
    }

    public void setAnimation(ah0 ah0Var) {
        if (this.f32982b == ah0Var) {
            return;
        }
        bh0 bh0Var = this.f32983c;
        if (bh0Var != null) {
            bh0Var.R();
            this.f32983c = null;
        }
        this.f32982b = ah0Var;
        ah0Var.R(this);
        if (this.d) {
            this.f32982b.K(1);
        }
        HashMap hashMap = this.f32981a;
        if (hashMap != null) {
            this.f32982b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ah0 ah0Var2 = this.f32982b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ah0Var2.f31843s.put((String) entry.getKey(), num);
                ah0Var2.G();
            }
            this.f32982b.o();
        }
        this.f32982b.J(true);
        setImageDrawable(this.f32982b);
    }

    public void setAutoRepeat(boolean z9) {
        this.d = z9;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f32982b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        bh0 bh0Var = this.f32983c;
        if (bh0Var != null) {
            bh0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null) {
            ah0Var.f31845t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z9) {
        this.f32986n = z9;
    }

    public void setProgress(float f10) {
        ah0 ah0Var = this.f32982b;
        if (ah0Var != null) {
            ah0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

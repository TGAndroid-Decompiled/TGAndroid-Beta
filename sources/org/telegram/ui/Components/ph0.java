package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class ph0 extends ImageView {
    public HashMap f38437a;
    public mh0 f38438b;
    public nh0 f38439c;
    public boolean d;
    public boolean f38440e;
    public boolean f38441f;
    public Integer h;
    public boolean f38442n;

    public ph0(Context context) {
        super(context);
    }

    public final void a() {
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null) {
            mh0Var.stop();
        }
        nh0 nh0Var = this.f38439c;
        if (nh0Var != null) {
            nh0Var.R();
            this.f38439c = null;
        }
        this.f38438b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null && mh0Var.f37495l0) {
            return true;
        }
        return false;
    }

    public final void d() {
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null || this.f38439c != null) {
            this.f38441f = true;
            if (this.f38440e) {
                if (mh0Var != null) {
                    mh0Var.start();
                }
                nh0 nh0Var = this.f38439c;
                if (nh0Var != null) {
                    nh0Var.P0(false);
                }
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new mh0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ph0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public mh0 getAnimatedDrawable() {
        return this.f38438b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f38439c;
    }

    public final void h(int i7, String str) {
        if (this.f38437a == null) {
            this.f38437a = new HashMap();
        }
        this.f38437a.put(str, Integer.valueOf(i7));
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null) {
            mh0Var.Q(i7, str);
        }
    }

    public final void i() {
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null || this.f38439c != null) {
            this.f38441f = false;
            if (this.f38440e) {
                if (mh0Var != null) {
                    mh0Var.stop();
                }
                nh0 nh0Var = this.f38439c;
                if (nh0Var != null) {
                    nh0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38440e = true;
        nh0 nh0Var = this.f38439c;
        if (nh0Var != null) {
            nh0Var.P();
            if (this.f38441f) {
                this.f38439c.P0(false);
            }
        }
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null) {
            mh0Var.setCallback(this);
            if (this.f38441f) {
                this.f38438b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38440e = false;
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null) {
            mh0Var.stop();
        }
        nh0 nh0Var = this.f38439c;
        if (nh0Var != null) {
            nh0Var.R();
        }
    }

    public void setAnimation(mh0 mh0Var) {
        if (this.f38438b == mh0Var) {
            return;
        }
        nh0 nh0Var = this.f38439c;
        if (nh0Var != null) {
            nh0Var.R();
            this.f38439c = null;
        }
        this.f38438b = mh0Var;
        mh0Var.R(this);
        if (this.d) {
            this.f38438b.K(1);
        }
        HashMap hashMap = this.f38437a;
        if (hashMap != null) {
            this.f38438b.f37480a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                mh0 mh0Var2 = this.f38438b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                mh0Var2.f37503s.put((String) entry.getKey(), num);
                mh0Var2.G();
            }
            this.f38438b.o();
        }
        this.f38438b.J(true);
        setImageDrawable(this.f38438b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f38438b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        nh0 nh0Var = this.f38439c;
        if (nh0Var != null) {
            nh0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null) {
            mh0Var.f37506u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.f38442n = z10;
    }

    public void setProgress(float f10) {
        mh0 mh0Var = this.f38438b;
        if (mh0Var != null) {
            mh0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

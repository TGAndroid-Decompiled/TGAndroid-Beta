package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
public class ch0 extends ImageView {
    public HashMap f32560a;
    public zg0 f32561b;
    public ah0 f32562c;
    public boolean d;
    public boolean f32563e;
    public boolean f32564f;
    public Integer h;
    public boolean f32565n;

    public ch0(Context context) {
        super(context);
    }

    public final void a() {
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null) {
            zg0Var.stop();
        }
        ah0 ah0Var = this.f32562c;
        if (ah0Var != null) {
            ah0Var.R();
            this.f32562c = null;
        }
        this.f32561b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null && zg0Var.f40984k0) {
            return true;
        }
        return false;
    }

    public final void d() {
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null || this.f32562c != null) {
            this.f32564f = true;
            if (this.f32563e) {
                if (zg0Var != null) {
                    zg0Var.start();
                }
                ah0 ah0Var = this.f32562c;
                if (ah0Var != null) {
                    ah0Var.P0(false);
                }
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new zg0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
    }

    public final void g(int r19, int r20, org.telegram.tgnet.TLRPC.Document r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ch0.g(int, int, org.telegram.tgnet.TLRPC$Document):void");
    }

    public zg0 getAnimatedDrawable() {
        return this.f32561b;
    }

    public ImageReceiver getImageReceiver() {
        return this.f32562c;
    }

    public final void h(int i7, String str) {
        if (this.f32560a == null) {
            this.f32560a = new HashMap();
        }
        this.f32560a.put(str, Integer.valueOf(i7));
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null) {
            zg0Var.Q(i7, str);
        }
    }

    public final void i() {
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null || this.f32562c != null) {
            this.f32564f = false;
            if (this.f32563e) {
                if (zg0Var != null) {
                    zg0Var.stop();
                }
                ah0 ah0Var = this.f32562c;
                if (ah0Var != null) {
                    ah0Var.Q0();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32563e = true;
        ah0 ah0Var = this.f32562c;
        if (ah0Var != null) {
            ah0Var.P();
            if (this.f32564f) {
                this.f32562c.P0(false);
            }
        }
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null) {
            zg0Var.setCallback(this);
            if (this.f32564f) {
                this.f32561b.start();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32563e = false;
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null) {
            zg0Var.stop();
        }
        ah0 ah0Var = this.f32562c;
        if (ah0Var != null) {
            ah0Var.R();
        }
    }

    public void setAnimation(zg0 zg0Var) {
        if (this.f32561b == zg0Var) {
            return;
        }
        ah0 ah0Var = this.f32562c;
        if (ah0Var != null) {
            ah0Var.R();
            this.f32562c = null;
        }
        this.f32561b = zg0Var;
        zg0Var.R(this);
        if (this.d) {
            this.f32561b.K(1);
        }
        HashMap hashMap = this.f32560a;
        if (hashMap != null) {
            this.f32561b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                zg0 zg0Var2 = this.f32561b;
                Integer num = (Integer) entry.getValue();
                num.getClass();
                zg0Var2.f40993s.put((String) entry.getKey(), num);
                zg0Var2.G();
            }
            this.f32561b.o();
        }
        this.f32561b.J(true);
        setImageDrawable(this.f32561b);
    }

    public void setAutoRepeat(boolean z9) {
        this.d = z9;
    }

    @Override
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f32561b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ah0 ah0Var = this.f32562c;
        if (ah0Var != null) {
            ah0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null) {
            zg0Var.f40995t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z9) {
        this.f32565n = z9;
    }

    public void setProgress(float f10) {
        zg0 zg0Var = this.f32561b;
        if (zg0Var != null) {
            zg0Var.T(true, f10);
        }
    }

    public void c() {
    }
}

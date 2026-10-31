package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class b2 extends FrameLayout implements org.telegram.messenger.z5, org.telegram.ui.Cells.j9 {
    public int D;
    public boolean E;
    public int F;
    public int G;
    public TLRPC.PhotoSize H;
    public String I;
    public TLRPC.PhotoSize J;
    public String K;
    public TLRPC.Photo L;
    public final int M;
    public TL_iv.pageBlockPhoto N;
    public TLObject O;
    public TL_iv.PageBlock P;
    public boolean Q;
    public org.telegram.messenger.bj R;
    public Drawable S;
    public boolean T;
    public final m60 f35948a;
    public final f4 f35949b;
    public z2 f35950c;
    public z2 d;
    public final ImageReceiver e;
    public final RadialProgress2 f35951f;
    public final c1 h;
    public final int f35952n;
    public boolean f35953r;
    public int f35954s;
    public int f35955w;
    public int f35956x;
    public int f35957y;

    public b2(Context context, m60 m60Var, f4 f4Var, int i10) {
        super(context);
        this.f35948a = m60Var;
        this.f35949b = f4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        c1 c1Var = new c1(context, m60Var, f4Var, 1);
        this.h = c1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f35951f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.M = org.telegram.messenger.b6.q(((h4) m60Var).X).k();
        addView(c1Var, w7.b6.c(-2.0f, -1));
        this.f35952n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        return 4;
    }

    @Override
    public final void C(boolean z10) {
        b(false);
    }

    @Override
    public final void M(String str) {
        this.f35951f.p(true, 1.0f);
        b(true);
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.P = null;
        this.N = pageblockphoto;
        this.O = tLObject;
        this.Q = z10;
        this.f35953r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.N.url)) {
            this.S = getResources().getDrawable(2131232190);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.N;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = e4.d(pageblockphoto2.photo_id, this.O);
            if (d != null) {
                this.H = org.telegram.messenger.b8.w(d.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
            } else {
                this.H = null;
            }
        } else {
            this.H = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        boolean z11;
        int i10 = ((h4) this.f35948a).X;
        String r10 = org.telegram.messenger.b8.r(null, this.H);
        org.telegram.messenger.b8.G(i10);
        File K = org.telegram.messenger.b8.K(this.H, null, true, true);
        org.telegram.messenger.b8.G(i10);
        File K2 = org.telegram.messenger.b8.K(this.H, null, false, true);
        if (!K.exists() && (K2 == null || !K2.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f35951f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.b6.q(i10).v(this);
            this.F = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.b6.q(i10).a(r10, null, this);
            float f7 = 0.0f;
            if (!this.T && !org.telegram.messenger.b8.G(i10).T(r10)) {
                this.F = 0;
            } else {
                this.F = 1;
                Float w9 = org.telegram.messenger.hc.D().w(r10);
                if (w9 != null) {
                    f7 = w9.floatValue();
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.p(false, f7);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.N;
    }

    public TLObject getCurrentPage() {
        return this.O;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.M;
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f35950c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void i(long j10, long j11) {
        this.f35951f.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.F != 1) {
            b(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.P();
        b(false);
        z2 z2Var = this.f35950c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.R();
        org.telegram.messenger.b6.q(((h4) this.f35948a).X).v(this);
        z2 z2Var = this.f35950c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.N == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.I() && imageReceiver.f14384h1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), h4.f37714p1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.Q0) {
            this.f35951f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.N.url) && !(this.L instanceof org.telegram.ui.web.x1)) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(35.0f);
            int L = (int) (imageReceiver.L0 + org.telegram.messenger.i0.L(11.0f));
            this.S.setBounds(measuredWidth, L, org.telegram.messenger.i0.L(24.0f) + measuredWidth, org.telegram.messenger.i0.L(24.0f) + L);
            this.S.draw(canvas2);
        }
        z2 z2Var = this.f35950c;
        m60 m60Var = this.f35948a;
        int i10 = 0;
        if (z2Var != null) {
            canvas2.save();
            canvas2.translate(this.f35954s, this.f35955w);
            h4.t(m60Var, canvas2, this, 0);
            this.f35950c.d(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f35954s, this.f35955w + this.f35956x);
            h4.t(m60Var, canvas2, this, i10);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        h4.s(canvas2, m60Var, this.N, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131753948, null));
        if (this.f35950c != null) {
            sb2.append(", ");
            sb2.append(this.f35950c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.P = pageBlock;
        f4 f4Var = this.f35949b;
        if (f4Var != null && (pageblockchannel = f4Var.F) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            c1 c1Var = this.h;
            c1Var.setBlock(pageblockchannel);
            c1Var.setVisibility(0);
        }
    }

    @Override
    public final void n(long j10, long j11) {
    }
}

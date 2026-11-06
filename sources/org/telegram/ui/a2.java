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
public final class a2 extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.Cells.h9 {
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
    public org.telegram.messenger.aj R;
    public Drawable S;
    public boolean T;
    public final o50 f43541a;
    public final e4 f43542b;
    public z2 f43543c;
    public z2 d;
    public final ImageReceiver f43544e;
    public final RadialProgress2 f43545f;
    public final a1 h;
    public final int f43546n;
    public boolean f43547r;
    public int f43548s;
    public int f43549w;
    public int f43550x;
    public int f43551y;

    public a2(Context context, o50 o50Var, e4 e4Var, int i7) {
        super(context);
        this.f43541a = o50Var;
        this.f43542b = e4Var;
        setWillNotDraw(false);
        this.f43544e = new ImageReceiver(this);
        a1 a1Var = new a1(context, o50Var, e4Var, 1);
        this.h = a1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f43545f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.M = org.telegram.messenger.z5.q(((g4) o50Var).X).k();
        addView(a1Var, c8.ha.c(-2.0f, -1));
        this.f43546n = i7;
    }

    private int getIconForCurrentState() {
        int i7 = this.F;
        if (i7 == 0) {
            return 2;
        }
        if (i7 == 1) {
            return 3;
        }
        return 4;
    }

    @Override
    public final void C(boolean z9) {
        b(false);
    }

    @Override
    public final void M(String str) {
        this.f43545f.p(true, 1.0f);
        b(true);
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z9, boolean z10) {
        this.P = null;
        this.N = pageblockphoto;
        this.O = tLObject;
        this.Q = z9;
        this.f43547r = z10;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.N.url)) {
            this.S = getResources().getDrawable(2131232191);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.N;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = d4.d(pageblockphoto2.photo_id, this.O);
            if (d != null) {
                this.H = org.telegram.messenger.w7.w(d.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            } else {
                this.H = null;
            }
        } else {
            this.H = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z9) {
        boolean z10;
        int i7 = ((g4) this.f43541a).X;
        String r10 = org.telegram.messenger.w7.r(null, this.H);
        org.telegram.messenger.w7.G(i7);
        File K = org.telegram.messenger.w7.K(this.H, null, true, true);
        org.telegram.messenger.w7.G(i7);
        File K2 = org.telegram.messenger.w7.K(this.H, null, false, true);
        if (!K.exists() && (K2 == null || !K2.exists())) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f43545f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z10) {
            org.telegram.messenger.z5.q(i7).v(this);
            this.F = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z9);
        } else {
            org.telegram.messenger.z5.q(i7).a(r10, null, this);
            float f10 = 0.0f;
            if (!this.T && !org.telegram.messenger.w7.G(i7).T(r10)) {
                this.F = 0;
            } else {
                this.F = 1;
                Float w10 = org.telegram.messenger.gc.D().w(r10);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z9);
            radialProgress2.p(false, f10);
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
        return this.f43544e;
    }

    @Override
    public int getObserverTag() {
        return this.M;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f43545f.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.F != 1) {
            b(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f43543c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43544e.P();
        b(false);
        z2 z2Var = this.f43543c;
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
        this.f43544e.R();
        org.telegram.messenger.z5.q(((g4) this.f43541a).X).v(this);
        z2 z2Var = this.f43543c;
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
        ImageReceiver imageReceiver = this.f43544e;
        if (imageReceiver.I() && imageReceiver.f21194h1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), g4.f45811p1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.Q0) {
            this.f43545f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.N.url) && !(this.L instanceof org.telegram.ui.web.w1)) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(35.0f);
            int L = (int) (imageReceiver.L0 + org.telegram.messenger.g0.L(11.0f));
            this.S.setBounds(measuredWidth, L, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + L);
            this.S.draw(canvas2);
        }
        z2 z2Var = this.f43543c;
        o50 o50Var = this.f43541a;
        int i7 = 0;
        if (z2Var != null) {
            canvas2.save();
            canvas2.translate(this.f43548s, this.f43549w);
            g4.t(o50Var, canvas2, this, 0);
            this.f43543c.d(canvas2, this);
            canvas2.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f43548s, this.f43549w + this.f43550x);
            g4.t(o50Var, canvas2, this, i7);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        g4.s(canvas2, o50Var, this.N, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.M0(2131753948, null));
        if (this.f43543c != null) {
            sb2.append(", ");
            sb2.append(this.f43543c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.P = pageBlock;
        e4 e4Var = this.f43542b;
        if (e4Var != null && (pageblockchannel = e4Var.F) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            a1 a1Var = this.h;
            a1Var.setBlock(pageblockchannel);
            a1Var.setVisibility(0);
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}

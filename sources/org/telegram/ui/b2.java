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
public final class b2 extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.Cells.g9 {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public TLRPC.PhotoSize I;
    public String J;
    public TLRPC.PhotoSize K;
    public String L;
    public TLRPC.Photo M;
    public final int N;
    public TL_iv.pageBlockPhoto O;
    public TLObject P;
    public TL_iv.PageBlock Q;
    public boolean R;
    public org.telegram.messenger.ri S;
    public Drawable T;
    public boolean U;
    public final i50 f43890a;
    public final g4 f43891b;
    public a3 f43892c;
    public a3 d;
    public final ImageReceiver f43893e;
    public final RadialProgress2 f43894f;
    public final b1 h;
    public final int f43895n;
    public boolean f43896r;
    public int f43897s;
    public int f43898w;
    public int f43899x;
    public int f43900y;

    public b2(Context context, i50 i50Var, g4 g4Var, int i3) {
        super(context);
        this.f43890a = i50Var;
        this.f43891b = g4Var;
        setWillNotDraw(false);
        this.f43893e = new ImageReceiver(this);
        b1 b1Var = new b1(context, i50Var, g4Var, 1);
        this.h = b1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f43894f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.N = org.telegram.messenger.z5.q(((i4) i50Var).Y).k();
        addView(b1Var, b8.mf.c(-2.0f, -1));
        this.f43895n = i3;
    }

    private int getIconForCurrentState() {
        int i3 = this.G;
        if (i3 == 0) {
            return 2;
        }
        if (i3 == 1) {
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
        this.f43894f.p(true, 1.0f);
        b(true);
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.Q = null;
        this.O = pageblockphoto;
        this.P = tLObject;
        this.R = z10;
        this.f43896r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.O.url)) {
            this.T = getResources().getDrawable(2131232191);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = e4.d(pageblockphoto2.photo_id, this.P);
            if (d != null) {
                this.I = org.telegram.messenger.w7.w(d.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            } else {
                this.I = null;
            }
        } else {
            this.I = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        boolean z11;
        int i3 = ((i4) this.f43890a).Y;
        String r5 = org.telegram.messenger.w7.r(null, this.I);
        org.telegram.messenger.w7.G(i3);
        File K = org.telegram.messenger.w7.K(this.I, null, true, true);
        org.telegram.messenger.w7.G(i3);
        File K2 = org.telegram.messenger.w7.K(this.I, null, false, true);
        if (!K.exists() && (K2 == null || !K2.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r5);
        RadialProgress2 radialProgress2 = this.f43894f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.z5.q(i3).v(this);
            this.G = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.z5.q(i3).a(r5, null, this);
            float f10 = 0.0f;
            if (!this.U && !org.telegram.messenger.w7.G(i3).T(r5)) {
                this.G = 0;
            } else {
                this.G = 1;
                Float w10 = org.telegram.messenger.zb.D().w(r5);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.p(false, f10);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.O;
    }

    public TLObject getCurrentPage() {
        return this.P;
    }

    public ImageReceiver getImageView() {
        return this.f43893e;
    }

    @Override
    public int getObserverTag() {
        return this.N;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f43894f.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.G != 1) {
            b(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f43892c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43893e.P();
        b(false);
        a3 a3Var = this.f43892c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43893e.R();
        org.telegram.messenger.z5.q(((i4) this.f43890a).Y).v(this);
        a3 a3Var = this.f43892c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.O == null) {
            return;
        }
        ImageReceiver imageReceiver = this.f43893e;
        if (imageReceiver.I() && imageReceiver.f21249i1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), i4.f46067q1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.R0) {
            this.f43894f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.O.url) && !(this.M instanceof org.telegram.ui.web.t1)) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(35.0f);
            int L = (int) (imageReceiver.M0 + org.telegram.messenger.g0.L(11.0f));
            this.T.setBounds(measuredWidth, L, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + L);
            this.T.draw(canvas2);
        }
        a3 a3Var = this.f43892c;
        i50 i50Var = this.f43890a;
        int i3 = 0;
        if (a3Var != null) {
            canvas2.save();
            canvas2.translate(this.f43897s, this.f43898w);
            i4.t(i50Var, canvas2, this, 0);
            this.f43892c.d(canvas2, this);
            canvas2.restore();
            i3 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f43897s, this.f43898w + this.f43899x);
            i4.t(i50Var, canvas2, this, i3);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        i4.s(canvas2, i50Var, this.O, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131753948, null));
        if (this.f43892c != null) {
            sb2.append(", ");
            sb2.append(this.f43892c.d.getText());
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
        this.Q = pageBlock;
        g4 g4Var = this.f43891b;
        if (g4Var != null && (pageblockchannel = g4Var.G) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            b1 b1Var = this.h;
            b1Var.setBlock(pageblockchannel);
            b1Var.setVisibility(0);
        }
    }

    @Override
    public final void o(long j10, long j11) {
    }
}

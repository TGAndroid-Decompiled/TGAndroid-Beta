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
public final class a2 extends FrameLayout implements org.telegram.messenger.y5, org.telegram.ui.Cells.i9 {
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
    public org.telegram.messenger.yi S;
    public Drawable T;
    public boolean U;
    public final p50 f45473a;
    public final e4 f45474b;
    public z2 f45475c;
    public z2 d;
    public final ImageReceiver f45476e;
    public final RadialProgress2 f45477f;
    public final a1 h;
    public final int f45478n;
    public boolean f45479r;
    public int f45480s;
    public int f45481w;
    public int f45482x;
    public int f45483y;

    public a2(Context context, p50 p50Var, e4 e4Var, int i7) {
        super(context);
        this.f45473a = p50Var;
        this.f45474b = e4Var;
        setWillNotDraw(false);
        this.f45476e = new ImageReceiver(this);
        a1 a1Var = new a1(context, p50Var, e4Var, 1);
        this.h = a1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f45477f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.N = org.telegram.messenger.a6.q(((g4) p50Var).Y).k();
        addView(a1Var, c8.ma.c(-2.0f, -1));
        this.f45478n = i7;
    }

    private int getIconForCurrentState() {
        int i7 = this.G;
        if (i7 == 0) {
            return 2;
        }
        if (i7 == 1) {
            return 3;
        }
        return 4;
    }

    @Override
    public final void C(boolean z10) {
        b(false);
    }

    @Override
    public final void N(String str) {
        this.f45477f.p(true, 1.0f);
        b(true);
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.Q = null;
        this.O = pageblockphoto;
        this.P = tLObject;
        this.R = z10;
        this.f45479r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.O.url)) {
            this.T = getResources().getDrawable(2131232193);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = d4.d(pageblockphoto2.photo_id, this.P);
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
        int i7 = ((g4) this.f45473a).Y;
        String r10 = org.telegram.messenger.w7.r(null, this.I);
        org.telegram.messenger.w7.G(i7);
        File J = org.telegram.messenger.w7.J(this.I, null, true, true);
        org.telegram.messenger.w7.G(i7);
        File J2 = org.telegram.messenger.w7.J(this.I, null, false, true);
        if (!J.exists() && (J2 == null || !J2.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f45477f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.a6.q(i7).v(this);
            this.G = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.a6.q(i7).a(r10, null, this);
            float f10 = 0.0f;
            if (!this.U && !org.telegram.messenger.w7.G(i7).S(r10)) {
                this.G = 0;
            } else {
                this.G = 1;
                Float w10 = org.telegram.messenger.fc.D().w(r10);
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
        return this.f45476e;
    }

    @Override
    public int getObserverTag() {
        return this.N;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f45477f.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.G != 1) {
            b(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f45475c;
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
        this.f45476e.P();
        b(false);
        z2 z2Var = this.f45475c;
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
        this.f45476e.R();
        org.telegram.messenger.a6.q(((g4) this.f45473a).Y).v(this);
        z2 z2Var = this.f45475c;
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
        if (this.O == null) {
            return;
        }
        ImageReceiver imageReceiver = this.f45476e;
        if (imageReceiver.I() && imageReceiver.f22672i1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), g4.f47940q1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.R0) {
            this.f45477f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.O.url) && !(this.M instanceof org.telegram.ui.web.u1)) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(35.0f);
            int L = (int) (imageReceiver.M0 + org.telegram.messenger.g0.L(11.0f));
            this.T.setBounds(measuredWidth, L, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + L);
            this.T.draw(canvas2);
        }
        z2 z2Var = this.f45475c;
        p50 p50Var = this.f45473a;
        int i7 = 0;
        if (z2Var != null) {
            canvas2.save();
            canvas2.translate(this.f45480s, this.f45481w);
            g4.t(p50Var, canvas2, this, 0);
            this.f45475c.d(canvas2, this);
            canvas2.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f45480s, this.f45481w + this.f45482x);
            g4.t(p50Var, canvas2, this, i7);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        g4.s(canvas2, p50Var, this.O, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.N0(2131753945, null));
        if (this.f45475c != null) {
            sb2.append(", ");
            sb2.append(this.f45475c.d.getText());
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
        this.Q = pageBlock;
        e4 e4Var = this.f45474b;
        if (e4Var != null && (pageblockchannel = e4Var.G) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            a1 a1Var = this.h;
            a1Var.setBlock(pageblockchannel);
            a1Var.setVisibility(0);
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}

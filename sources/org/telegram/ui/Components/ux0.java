package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
public class ux0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public tp0 B;
    public int C;
    public String D;
    public int E;
    public String[] F;
    public Runnable G;
    public long H;
    public Path I;
    public Path J;
    public Paint K;
    public y5 L;
    public y5 M;
    public y5 N;
    public y5 O;
    public Emoji.EmojiSpan P;
    public float Q;
    public Integer R;
    public Integer S;
    public float T;
    public y5 U;
    public y5 V;
    public y5 W;
    public final int f33158a;
    public final org.telegram.ui.ActionBar.b6 f33159b;
    public sx0 f33160c;
    public fh.d2 d;
    public qx0 f33161e;
    public rx0 f33162f;
    public int h;
    public int f33163n;
    public px0 f33164r;
    public boolean f33165s;
    public boolean v;
    public ArrayList f33166w;
    public boolean f33167x;
    public boolean f33168y;

    public ux0(Context context, int i9, org.telegram.ui.ak akVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = 0;
        this.f33163n = AndroidUtilities.dp(10.0f);
        this.H = 0L;
        this.f33158a = i9;
        this.f33160c = akVar;
        this.f33159b = b6Var;
        postDelayed(new mh.k2(i9, 10), 260L);
    }

    public static boolean a(ux0 ux0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.q().s(motionEvent, ux0Var.f33161e, jVar, ux0Var.getPreviewDelegate(), ux0Var.f33159b);
    }

    public org.telegram.ui.ft getPreviewDelegate() {
        if (this.f33164r == null) {
            this.f33164r = new px0(this);
        }
        return this.f33164r;
    }

    public final void c() {
        if (this.f33161e == null) {
            this.I = new Path();
            this.J = new Path();
            fh.d2 d2Var = new fh.d2(this, getContext(), 24);
            this.d = d2Var;
            gr grVar = gr.h;
            this.L = new y5(d2Var, 120L, 350L, grVar);
            this.M = new y5(this.d, 150L, 600L, grVar);
            new OvershootInterpolator(0.4f);
            this.N = new y5(this.d, 300L, grVar);
            this.O = new y5(this.d, 300L, grVar);
            this.U = new y5(this.d, 200L, grVar);
            this.V = new y5(this.d, 350L, grVar);
            this.W = new y5(this.d, 350L, grVar);
            qx0 qx0Var = new qx0(this, getContext());
            this.f33161e = qx0Var;
            rx0 rx0Var = new rx0(this, this);
            this.f33162f = rx0Var;
            qx0Var.setAdapter(rx0Var);
            getContext();
            f2.m0 m0Var = new f2.m0();
            m0Var.j1(0);
            this.f33161e.setLayoutManager(m0Var);
            f2.n nVar = new f2.n();
            nVar.n(45L);
            nVar.f5449o = grVar;
            this.f33161e.setItemAnimator(nVar);
            this.f33161e.setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, this.f33159b));
            qx0 qx0Var2 = this.f33161e;
            j jVar = new j(this, 17);
            qx0Var2.setOnItemClickListener(jVar);
            this.f33161e.setOnTouchListener(new kh.r1(4, this, jVar));
            this.d.addView(this.f33161e, g7.e6.c(52.0f, -1));
            addView(this.d, g7.e6.a(-1.0f, 66.66f, 80));
            sx0 sx0Var = this.f33160c;
            if (sx0Var != null) {
                sx0Var.e(new bh.f(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f33166w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i9 == NotificationCenter.emojiLoaded && this.f33161e != null) {
            for (int i11 = 0; i11 < this.f33161e.getChildCount(); i11++) {
                this.f33161e.getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qx0 qx0Var = this.f33161e;
        if (qx0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.W.f34854c;
        float f11 = this.V.f34854c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = f10 / 2.0f;
        rectF.set(this.f33161e.getTranslationX() + (f11 - f12) + qx0Var.getPaddingLeft(), this.f33161e.getPaddingTop() + this.f33161e.getTop(), Math.min(this.f33161e.getTranslationX() + f11 + f12 + this.f33161e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f33161e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f33165s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        tp0 tp0Var = this.B;
        if (tp0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tp0Var);
        }
        tp0 tp0Var2 = new tp0(this, 11);
        this.B = tp0Var2;
        AndroidUtilities.runOnUIThread(tp0Var2, 16L);
    }

    public final void f() {
        tp0 tp0Var = this.B;
        if (tp0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tp0Var);
            this.B = null;
        }
        this.f33165s = false;
        this.v = true;
        fh.d2 d2Var = this.d;
        if (d2Var != null) {
            d2Var.invalidate();
        }
    }

    public sx0 getDelegate() {
        return this.f33160c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f33165s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f33158a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f33158a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(sx0 sx0Var) {
        this.f33160c = sx0Var;
    }

    public void setDirection(int i9) {
        if (this.h != i9) {
            this.h = i9;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i9) {
        this.f33163n = i9;
    }
}

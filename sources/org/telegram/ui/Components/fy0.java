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
public class fy0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public fq0 B;
    public int C;
    public String D;
    public int E;
    public String[] F;
    public Runnable G;
    public long H;
    public Path I;
    public Path J;
    public Paint K;
    public d6 L;
    public d6 M;
    public d6 N;
    public d6 O;
    public Emoji.EmojiSpan P;
    public float Q;
    public Integer R;
    public Integer S;
    public float T;
    public d6 U;
    public d6 V;
    public d6 W;
    public final int f28563a;
    public final org.telegram.ui.ActionBar.c6 f28564b;
    public dy0 f28565c;
    public bg.x2 d;
    public by0 f28566e;
    public cy0 f28567f;
    public int h;
    public int f28568n;
    public ay0 f28569r;
    public boolean f28570s;
    public boolean v;
    public ArrayList f28571w;
    public boolean f28572x;
    public boolean f28573y;

    public fy0(Context context, int i10, org.telegram.ui.dk dkVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = 0;
        this.f28568n = AndroidUtilities.dp(10.0f);
        this.H = 0L;
        this.f28563a = i10;
        this.f28565c = dkVar;
        this.f28564b = c6Var;
        postDelayed(new org.telegram.messenger.d6(i10, 9), 260L);
    }

    public static boolean a(fy0 fy0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.q().s(motionEvent, fy0Var.f28566e, kVar, fy0Var.getPreviewDelegate(), fy0Var.f28564b);
    }

    public org.telegram.ui.ft getPreviewDelegate() {
        if (this.f28569r == null) {
            this.f28569r = new ay0(this);
        }
        return this.f28569r;
    }

    public final void c() {
        if (this.f28566e == null) {
            this.I = new Path();
            this.J = new Path();
            bg.x2 x2Var = new bg.x2(this, getContext(), 29);
            this.d = x2Var;
            jr jrVar = jr.h;
            this.L = new d6(x2Var, 120L, 350L, jrVar);
            this.M = new d6(this.d, 150L, 600L, jrVar);
            new OvershootInterpolator(0.4f);
            this.N = new d6(this.d, 300L, jrVar);
            this.O = new d6(this.d, 300L, jrVar);
            this.U = new d6(this.d, 200L, jrVar);
            this.V = new d6(this.d, 350L, jrVar);
            this.W = new d6(this.d, 350L, jrVar);
            by0 by0Var = new by0(this, getContext());
            this.f28566e = by0Var;
            cy0 cy0Var = new cy0(this, this);
            this.f28567f = cy0Var;
            by0Var.setAdapter(cy0Var);
            getContext();
            f2.j0 j0Var = new f2.j0();
            j0Var.j1(0);
            this.f28566e.setLayoutManager(j0Var);
            f2.l lVar = new f2.l();
            lVar.n(45L);
            lVar.f6404o = jrVar;
            this.f28566e.setItemAnimator(lVar);
            this.f28566e.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, this.f28564b));
            by0 by0Var2 = this.f28566e;
            k kVar = new k(this, 17);
            by0Var2.setOnItemClickListener(kVar);
            this.f28566e.setOnTouchListener(new nh.o1(4, this, kVar));
            this.d.addView(this.f28566e, i7.f6.c(52.0f, -1));
            addView(this.d, i7.f6.a(-1.0f, 66.66f, 80));
            dy0 dy0Var = this.f28565c;
            if (dy0Var != null) {
                dy0Var.d(new bh.c(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f28571w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f28566e != null) {
            for (int i12 = 0; i12 < this.f28566e.getChildCount(); i12++) {
                this.f28566e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        by0 by0Var = this.f28566e;
        if (by0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f9 = this.W.f27666c;
        float f10 = this.V.f27666c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f9 / 2.0f;
        rectF.set(this.f28566e.getTranslationX() + (f10 - f11) + by0Var.getPaddingLeft(), this.f28566e.getPaddingTop() + this.f28566e.getTop(), Math.min(this.f28566e.getTranslationX() + f10 + f11 + this.f28566e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f28566e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f28570s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        fq0 fq0Var = this.B;
        if (fq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fq0Var);
        }
        fq0 fq0Var2 = new fq0(this, 11);
        this.B = fq0Var2;
        AndroidUtilities.runOnUIThread(fq0Var2, 16L);
    }

    public final void f() {
        fq0 fq0Var = this.B;
        if (fq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fq0Var);
            this.B = null;
        }
        this.f28570s = false;
        this.v = true;
        bg.x2 x2Var = this.d;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    public dy0 getDelegate() {
        return this.f28565c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f28570s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28563a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28563a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(dy0 dy0Var) {
        this.f28565c = dy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f28568n = i10;
    }
}

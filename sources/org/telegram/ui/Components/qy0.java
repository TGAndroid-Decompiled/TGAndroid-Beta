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
public class qy0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public nq0 C;
    public int D;
    public String E;
    public int F;
    public String[] G;
    public Runnable H;
    public long I;
    public Path J;
    public Path K;
    public Paint L;
    public z5 M;
    public z5 N;
    public z5 O;
    public z5 P;
    public Emoji.EmojiSpan Q;
    public float R;
    public Integer S;
    public Integer T;
    public float U;
    public z5 V;
    public z5 W;
    public final int f28317a;
    public z5 f28318a0;
    public final org.telegram.ui.ActionBar.f6 f28319b;
    public oy0 f28320c;
    public dg.u2 d;
    public my0 e;
    public ny0 f28321f;
    public int h;
    public int f28322n;
    public ly0 f28323r;
    public boolean f28324s;
    public boolean v;
    public ArrayList f28325w;
    public boolean f28326x;
    public boolean f28327y;

    public qy0(Context context, int i10, org.telegram.ui.lk lkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.f28322n = AndroidUtilities.dp(10.0f);
        this.I = 0L;
        this.f28317a = i10;
        this.f28320c = lkVar;
        this.f28319b = f6Var;
        postDelayed(new org.telegram.messenger.e6(i10, 9), 260L);
    }

    public static boolean a(qy0 qy0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.rt.q().s(motionEvent, qy0Var.e, kVar, qy0Var.getPreviewDelegate(), qy0Var.f28319b);
    }

    public org.telegram.ui.pt getPreviewDelegate() {
        if (this.f28323r == null) {
            this.f28323r = new ly0(this);
        }
        return this.f28323r;
    }

    public final void c() {
        if (this.e == null) {
            this.J = new Path();
            this.K = new Path();
            dg.u2 u2Var = new dg.u2(this, getContext(), 27);
            this.d = u2Var;
            mr mrVar = mr.h;
            this.M = new z5(u2Var, 120L, 350L, mrVar);
            this.N = new z5(this.d, 150L, 600L, mrVar);
            new OvershootInterpolator(0.4f);
            this.O = new z5(this.d, 300L, mrVar);
            this.P = new z5(this.d, 300L, mrVar);
            this.V = new z5(this.d, 200L, mrVar);
            this.W = new z5(this.d, 350L, mrVar);
            this.f28318a0 = new z5(this.d, 350L, mrVar);
            my0 my0Var = new my0(this, getContext());
            this.e = my0Var;
            ny0 ny0Var = new ny0(this, this);
            this.f28321f = ny0Var;
            my0Var.setAdapter(ny0Var);
            getContext();
            f2.i0 i0Var = new f2.i0();
            i0Var.j1(0);
            this.e.setLayoutManager(i0Var);
            f2.l lVar = new f2.l();
            lVar.n(45L);
            lVar.f5762o = mrVar;
            this.e.setItemAnimator(lVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, this.f28319b));
            my0 my0Var2 = this.e;
            k kVar = new k(this, 17);
            my0Var2.setOnItemClickListener(kVar);
            this.e.setOnTouchListener(new org.telegram.ui.ActionBar.i1(3, this, kVar));
            this.d.addView(this.e, k7.b6.c(52.0f, -1));
            addView(this.d, k7.b6.a(-1.0f, 66.66f, 80));
            oy0 oy0Var = this.f28320c;
            if (oy0Var != null) {
                oy0Var.a(new dh.c(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f28325w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.e != null) {
            for (int i12 = 0; i12 < this.e.getChildCount(); i12++) {
                this.e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        my0 my0Var = this.e;
        if (my0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f28318a0.f31253c;
        float f11 = this.W.f31253c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = f10 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f11 - f12) + my0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f11 + f12 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f28324s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        nq0 nq0Var = this.C;
        if (nq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nq0Var);
        }
        nq0 nq0Var2 = new nq0(this, 11);
        this.C = nq0Var2;
        AndroidUtilities.runOnUIThread(nq0Var2, 16L);
    }

    public final void f() {
        nq0 nq0Var = this.C;
        if (nq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nq0Var);
            this.C = null;
        }
        this.f28324s = false;
        this.v = true;
        dg.u2 u2Var = this.d;
        if (u2Var != null) {
            u2Var.invalidate();
        }
    }

    public oy0 getDelegate() {
        return this.f28320c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f28324s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28317a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28317a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(oy0 oy0Var) {
        this.f28320c = oy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f28322n = i10;
    }
}

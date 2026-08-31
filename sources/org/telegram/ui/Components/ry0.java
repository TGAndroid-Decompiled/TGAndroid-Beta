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
public class ry0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean B;
    public oq0 C;
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
    public final int f30897a;
    public z5 f30898a0;
    public final org.telegram.ui.ActionBar.g6 f30899b;
    public py0 f30900c;
    public eg.s2 d;
    public ny0 f30901e;
    public oy0 f30902f;
    public int h;
    public int f30903n;
    public my0 f30904r;
    public boolean f30905s;
    public boolean v;
    public ArrayList f30906w;
    public boolean f30907x;
    public boolean f30908y;

    public ry0(Context context, int i10, org.telegram.ui.jk jkVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 0;
        this.f30903n = AndroidUtilities.dp(10.0f);
        this.I = 0L;
        this.f30897a = i10;
        this.f30900c = jkVar;
        this.f30899b = g6Var;
        postDelayed(new org.telegram.messenger.e6(i10, 9), 260L);
    }

    public static boolean a(ry0 ry0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.qt.q().s(motionEvent, ry0Var.f30901e, kVar, ry0Var.getPreviewDelegate(), ry0Var.f30899b);
    }

    public org.telegram.ui.ot getPreviewDelegate() {
        if (this.f30904r == null) {
            this.f30904r = new my0(this);
        }
        return this.f30904r;
    }

    public final void c() {
        if (this.f30901e == null) {
            this.J = new Path();
            this.K = new Path();
            eg.s2 s2Var = new eg.s2(this, getContext(), 27);
            this.d = s2Var;
            pr prVar = pr.h;
            this.M = new z5(s2Var, 120L, 350L, prVar);
            this.N = new z5(this.d, 150L, 600L, prVar);
            new OvershootInterpolator(0.4f);
            this.O = new z5(this.d, 300L, prVar);
            this.P = new z5(this.d, 300L, prVar);
            this.V = new z5(this.d, 200L, prVar);
            this.W = new z5(this.d, 350L, prVar);
            this.f30898a0 = new z5(this.d, 350L, prVar);
            ny0 ny0Var = new ny0(this, getContext());
            this.f30901e = ny0Var;
            oy0 oy0Var = new oy0(this, this);
            this.f30902f = oy0Var;
            ny0Var.setAdapter(oy0Var);
            getContext();
            f2.j0 j0Var = new f2.j0();
            j0Var.j1(0);
            this.f30901e.setLayoutManager(j0Var);
            f2.l lVar = new f2.l();
            lVar.n(45L);
            lVar.f5852o = prVar;
            this.f30901e.setItemAnimator(lVar);
            this.f30901e.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, this.f30899b));
            ny0 ny0Var2 = this.f30901e;
            k kVar = new k(this, 17);
            ny0Var2.setOnItemClickListener(kVar);
            this.f30901e.setOnTouchListener(new org.telegram.ui.ActionBar.i1(3, this, kVar));
            this.d.addView(this.f30901e, k7.c6.c(52.0f, -1));
            addView(this.d, k7.c6.a(-1.0f, 66.66f, 80));
            py0 py0Var = this.f30900c;
            if (py0Var != null) {
                py0Var.a(new eh.c(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f30906w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f30901e != null) {
            for (int i12 = 0; i12 < this.f30901e.getChildCount(); i12++) {
                this.f30901e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ny0 ny0Var = this.f30901e;
        if (ny0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f30898a0.f33725c;
        float f11 = this.W.f33725c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = f10 / 2.0f;
        rectF.set(this.f30901e.getTranslationX() + (f11 - f12) + ny0Var.getPaddingLeft(), this.f30901e.getPaddingTop() + this.f30901e.getTop(), Math.min(this.f30901e.getTranslationX() + f11 + f12 + this.f30901e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f30901e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30905s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        oq0 oq0Var = this.C;
        if (oq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(oq0Var);
        }
        oq0 oq0Var2 = new oq0(this, 11);
        this.C = oq0Var2;
        AndroidUtilities.runOnUIThread(oq0Var2, 16L);
    }

    public final void f() {
        oq0 oq0Var = this.C;
        if (oq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(oq0Var);
            this.C = null;
        }
        this.f30905s = false;
        this.v = true;
        eg.s2 s2Var = this.d;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public py0 getDelegate() {
        return this.f30900c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30905s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30897a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30897a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(py0 py0Var) {
        this.f30900c = py0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30903n = i10;
    }
}

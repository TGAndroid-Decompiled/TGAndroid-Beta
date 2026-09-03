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
    public final int f30558a;
    public z5 f30559a0;
    public final org.telegram.ui.ActionBar.g6 f30560b;
    public oy0 f30561c;
    public eg.s2 d;
    public my0 f30562e;
    public ny0 f30563f;
    public int h;
    public int f30564n;
    public ly0 f30565r;
    public boolean f30566s;
    public boolean v;
    public ArrayList f30567w;
    public boolean f30568x;
    public boolean f30569y;

    public qy0(Context context, int i10, org.telegram.ui.jk jkVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 0;
        this.f30564n = AndroidUtilities.dp(10.0f);
        this.I = 0L;
        this.f30558a = i10;
        this.f30561c = jkVar;
        this.f30560b = g6Var;
        postDelayed(new org.telegram.messenger.e6(i10, 9), 260L);
    }

    public static boolean a(qy0 qy0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.qt.q().s(motionEvent, qy0Var.f30562e, kVar, qy0Var.getPreviewDelegate(), qy0Var.f30560b);
    }

    public org.telegram.ui.ot getPreviewDelegate() {
        if (this.f30565r == null) {
            this.f30565r = new ly0(this);
        }
        return this.f30565r;
    }

    public final void c() {
        if (this.f30562e == null) {
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
            this.f30559a0 = new z5(this.d, 350L, prVar);
            my0 my0Var = new my0(this, getContext());
            this.f30562e = my0Var;
            ny0 ny0Var = new ny0(this, this);
            this.f30563f = ny0Var;
            my0Var.setAdapter(ny0Var);
            getContext();
            f2.j0 j0Var = new f2.j0();
            j0Var.j1(0);
            this.f30562e.setLayoutManager(j0Var);
            f2.l lVar = new f2.l();
            lVar.n(45L);
            lVar.f5852o = prVar;
            this.f30562e.setItemAnimator(lVar);
            this.f30562e.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, this.f30560b));
            my0 my0Var2 = this.f30562e;
            k kVar = new k(this, 17);
            my0Var2.setOnItemClickListener(kVar);
            this.f30562e.setOnTouchListener(new org.telegram.ui.ActionBar.i1(3, this, kVar));
            this.d.addView(this.f30562e, k7.c6.c(52.0f, -1));
            addView(this.d, k7.c6.a(-1.0f, 66.66f, 80));
            oy0 oy0Var = this.f30561c;
            if (oy0Var != null) {
                oy0Var.a(new eh.c(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f30567w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f30562e != null) {
            for (int i12 = 0; i12 < this.f30562e.getChildCount(); i12++) {
                this.f30562e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        my0 my0Var = this.f30562e;
        if (my0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f10 = this.f30559a0.f33763c;
        float f11 = this.W.f33763c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = f10 / 2.0f;
        rectF.set(this.f30562e.getTranslationX() + (f11 - f12) + my0Var.getPaddingLeft(), this.f30562e.getPaddingTop() + this.f30562e.getTop(), Math.min(this.f30562e.getTranslationX() + f11 + f12 + this.f30562e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f30562e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30566s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        this.f30566s = false;
        this.v = true;
        eg.s2 s2Var = this.d;
        if (s2Var != null) {
            s2Var.invalidate();
        }
    }

    public oy0 getDelegate() {
        return this.f30561c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30566s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30558a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30558a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(oy0 oy0Var) {
        this.f30561c = oy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30564n = i10;
    }
}

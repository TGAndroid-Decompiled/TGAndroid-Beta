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
public class yy0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public wq0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public d6 P;
    public d6 Q;
    public d6 R;
    public d6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f30638a;
    public float f30639a0;
    public final org.telegram.ui.ActionBar.f6 f30640b;
    public d6 f30641b0;
    public wy0 f30642c;
    public d6 f30643c0;
    public ai.f0 d;
    public d6 f30644d0;
    public uy0 e;
    public vy0 f30645f;
    public int h;
    public int f30646n;
    public ty0 f30647r;
    public boolean f30648s;
    public boolean v;
    public ArrayList f30649w;
    public boolean f30650x;
    public boolean f30651y;

    public yy0(Context context, int i10, org.telegram.ui.lk lkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.f30646n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f30638a = i10;
        this.f30642c = lkVar;
        this.f30640b = f6Var;
        postDelayed(new ei.r2(i10, 10), 260L);
    }

    public static boolean a(yy0 yy0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.st.q().s(motionEvent, yy0Var.e, jVar, yy0Var.getPreviewDelegate(), yy0Var.f30640b);
    }

    public org.telegram.ui.qt getPreviewDelegate() {
        if (this.f30647r == null) {
            this.f30647r = new ty0(this);
        }
        return this.f30647r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 21);
            this.d = f0Var;
            qr qrVar = qr.h;
            this.P = new d6(f0Var, 120L, 350L, qrVar);
            this.Q = new d6(this.d, 150L, 600L, qrVar);
            new OvershootInterpolator(0.4f);
            this.R = new d6(this.d, 300L, qrVar);
            this.S = new d6(this.d, 300L, qrVar);
            this.f30641b0 = new d6(this.d, 200L, qrVar);
            this.f30643c0 = new d6(this.d, 350L, qrVar);
            this.f30644d0 = new d6(this.d, 350L, qrVar);
            uy0 uy0Var = new uy0(this, getContext());
            this.e = uy0Var;
            vy0 vy0Var = new vy0(this, this);
            this.f30645f = vy0Var;
            uy0Var.setAdapter(vy0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f43031o = qrVar;
            this.e.setItemAnimator(jVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, this.f30640b));
            uy0 uy0Var2 = this.e;
            j jVar2 = new j(this, 17);
            uy0Var2.setOnItemClickListener(jVar2);
            this.e.setOnTouchListener(new ci.q1(4, this, jVar2));
            this.d.addView(this.e, w7.y5.c(52.0f, -1));
            addView(this.d, w7.y5.a(-1.0f, 66.66f, 80));
            wy0 wy0Var = this.f30642c;
            if (wy0Var != null) {
                wy0Var.a(new ci.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f30649w;
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
        uy0 uy0Var = this.e;
        if (uy0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f30644d0.f23501c;
        float f10 = this.f30643c0.f23501c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + uy0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30648s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        wq0 wq0Var = this.F;
        if (wq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wq0Var);
        }
        wq0 wq0Var2 = new wq0(this, 11);
        this.F = wq0Var2;
        AndroidUtilities.runOnUIThread(wq0Var2, 16L);
    }

    public final void f() {
        wq0 wq0Var = this.F;
        if (wq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wq0Var);
            this.F = null;
        }
        this.f30648s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public wy0 getDelegate() {
        return this.f30642c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30648s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30638a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30638a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(wy0 wy0Var) {
        this.f30642c = wy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30646n = i10;
    }
}

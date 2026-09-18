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
public class zy0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public xq0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public e6 P;
    public e6 Q;
    public e6 R;
    public e6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f30905a;
    public float f30906a0;
    public final org.telegram.ui.ActionBar.e6 f30907b;
    public e6 f30908b0;
    public xy0 f30909c;
    public e6 f30910c0;
    public ai.f0 d;
    public e6 f30911d0;
    public vy0 e;
    public wy0 f30912f;
    public int h;
    public int f30913n;
    public uy0 f30914r;
    public boolean f30915s;
    public boolean v;
    public ArrayList f30916w;
    public boolean f30917x;
    public boolean f30918y;

    public zy0(Context context, int i10, org.telegram.ui.lk lkVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 0;
        this.f30913n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f30905a = i10;
        this.f30909c = lkVar;
        this.f30907b = e6Var;
        postDelayed(new ei.r2(i10, 10), 260L);
    }

    public static boolean a(zy0 zy0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.st.q().s(motionEvent, zy0Var.e, jVar, zy0Var.getPreviewDelegate(), zy0Var.f30907b);
    }

    public org.telegram.ui.qt getPreviewDelegate() {
        if (this.f30914r == null) {
            this.f30914r = new uy0(this);
        }
        return this.f30914r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 21);
            this.d = f0Var;
            qr qrVar = qr.h;
            this.P = new e6(f0Var, 120L, 350L, qrVar);
            this.Q = new e6(this.d, 150L, 600L, qrVar);
            new OvershootInterpolator(0.4f);
            this.R = new e6(this.d, 300L, qrVar);
            this.S = new e6(this.d, 300L, qrVar);
            this.f30908b0 = new e6(this.d, 200L, qrVar);
            this.f30910c0 = new e6(this.d, 350L, qrVar);
            this.f30911d0 = new e6(this.d, 350L, qrVar);
            vy0 vy0Var = new vy0(this, getContext());
            this.e = vy0Var;
            wy0 wy0Var = new wy0(this, this);
            this.f30912f = wy0Var;
            vy0Var.setAdapter(wy0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f42986o = qrVar;
            this.e.setItemAnimator(jVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19152i6, this.f30907b));
            vy0 vy0Var2 = this.e;
            j jVar2 = new j(this, 17);
            vy0Var2.setOnItemClickListener(jVar2);
            this.e.setOnTouchListener(new ci.q1(4, this, jVar2));
            this.d.addView(this.e, w7.y5.c(52.0f, -1));
            addView(this.d, w7.y5.a(-1.0f, 66.66f, 80));
            xy0 xy0Var = this.f30909c;
            if (xy0Var != null) {
                xy0Var.a(new ci.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f30916w;
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
        vy0 vy0Var = this.e;
        if (vy0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f30911d0.f23794c;
        float f10 = this.f30910c0.f23794c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + vy0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30915s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        xq0 xq0Var = this.F;
        if (xq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xq0Var);
        }
        xq0 xq0Var2 = new xq0(this, 11);
        this.F = xq0Var2;
        AndroidUtilities.runOnUIThread(xq0Var2, 16L);
    }

    public final void f() {
        xq0 xq0Var = this.F;
        if (xq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xq0Var);
            this.F = null;
        }
        this.f30915s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public xy0 getDelegate() {
        return this.f30909c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30915s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30905a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30905a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(xy0 xy0Var) {
        this.f30909c = xy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30913n = i10;
    }
}

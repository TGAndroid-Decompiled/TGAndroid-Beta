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
public class xy0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public e6 P;
    public e6 Q;
    public e6 R;
    public e6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f30425a;
    public float f30426a0;
    public final org.telegram.ui.ActionBar.d6 f30427b;
    public e6 f30428b0;
    public vy0 f30429c;
    public e6 f30430c0;
    public ai.f0 d;
    public e6 f30431d0;
    public ty0 e;
    public uy0 f30432f;
    public int h;
    public int f30433n;
    public sy0 f30434r;
    public boolean f30435s;
    public boolean v;
    public ArrayList f30436w;
    public boolean f30437x;
    public boolean f30438y;

    public xy0(Context context, int i10, org.telegram.ui.jk jkVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f30433n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f30425a = i10;
        this.f30429c = jkVar;
        this.f30427b = d6Var;
        postDelayed(new ei.r2(i10, 10), 260L);
    }

    public static boolean a(xy0 xy0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.nt.q().s(motionEvent, xy0Var.e, jVar, xy0Var.getPreviewDelegate(), xy0Var.f30427b);
    }

    public org.telegram.ui.lt getPreviewDelegate() {
        if (this.f30434r == null) {
            this.f30434r = new sy0(this);
        }
        return this.f30434r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 21);
            this.d = f0Var;
            rr rrVar = rr.h;
            this.P = new e6(f0Var, 120L, 350L, rrVar);
            this.Q = new e6(this.d, 150L, 600L, rrVar);
            new OvershootInterpolator(0.4f);
            this.R = new e6(this.d, 300L, rrVar);
            this.S = new e6(this.d, 300L, rrVar);
            this.f30428b0 = new e6(this.d, 200L, rrVar);
            this.f30430c0 = new e6(this.d, 350L, rrVar);
            this.f30431d0 = new e6(this.d, 350L, rrVar);
            ty0 ty0Var = new ty0(this, getContext());
            this.e = ty0Var;
            uy0 uy0Var = new uy0(this, this);
            this.f30432f = uy0Var;
            ty0Var.setAdapter(uy0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f43017o = rrVar;
            this.e.setItemAnimator(jVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, this.f30427b));
            ty0 ty0Var2 = this.e;
            j jVar2 = new j(this, 17);
            ty0Var2.setOnItemClickListener(jVar2);
            this.e.setOnTouchListener(new ci.q1(4, this, jVar2));
            this.d.addView(this.e, w7.y5.c(52.0f, -1));
            addView(this.d, w7.y5.a(-1.0f, 66.66f, 80));
            vy0 vy0Var = this.f30429c;
            if (vy0Var != null) {
                vy0Var.a(new ci.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f30436w;
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
        ty0 ty0Var = this.e;
        if (ty0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f30431d0.f23844c;
        float f10 = this.f30430c0.f23844c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + ty0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30435s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        wq0 wq0Var2 = new wq0(this, 12);
        this.F = wq0Var2;
        AndroidUtilities.runOnUIThread(wq0Var2, 16L);
    }

    public final void f() {
        wq0 wq0Var = this.F;
        if (wq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wq0Var);
            this.F = null;
        }
        this.f30435s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public vy0 getDelegate() {
        return this.f30429c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30435s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30425a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30425a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(vy0 vy0Var) {
        this.f30429c = vy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30433n = i10;
    }
}

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
public class ny0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public jq0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public c6 P;
    public c6 Q;
    public c6 R;
    public c6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f26614a;
    public float f26615a0;
    public final org.telegram.ui.ActionBar.e6 f26616b;
    public c6 f26617b0;
    public ly0 f26618c;
    public c6 f26619c0;
    public ai.f0 d;
    public c6 f26620d0;
    public jy0 e;
    public ky0 f26621f;
    public int h;
    public int f26622n;
    public iy0 f26623r;
    public boolean f26624s;
    public boolean v;
    public ArrayList f26625w;
    public boolean f26626x;
    public boolean f26627y;

    public ny0(Context context, int i10, org.telegram.ui.mk mkVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 0;
        this.f26622n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f26614a = i10;
        this.f26618c = mkVar;
        this.f26616b = e6Var;
        postDelayed(new ei.r2(i10, 10), 260L);
    }

    public static boolean a(ny0 ny0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.st.q().s(motionEvent, ny0Var.e, jVar, ny0Var.getPreviewDelegate(), ny0Var.f26616b);
    }

    public org.telegram.ui.qt getPreviewDelegate() {
        if (this.f26623r == null) {
            this.f26623r = new iy0(this);
        }
        return this.f26623r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 21);
            this.d = f0Var;
            qr qrVar = qr.h;
            this.P = new c6(f0Var, 120L, 350L, qrVar);
            this.Q = new c6(this.d, 150L, 600L, qrVar);
            new OvershootInterpolator(0.4f);
            this.R = new c6(this.d, 300L, qrVar);
            this.S = new c6(this.d, 300L, qrVar);
            this.f26617b0 = new c6(this.d, 200L, qrVar);
            this.f26619c0 = new c6(this.d, 350L, qrVar);
            this.f26620d0 = new c6(this.d, 350L, qrVar);
            jy0 jy0Var = new jy0(this, getContext());
            this.e = jy0Var;
            ky0 ky0Var = new ky0(this, this);
            this.f26621f = ky0Var;
            jy0Var.setAdapter(ky0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f42732o = qrVar;
            this.e.setItemAnimator(jVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18926i6, this.f26616b));
            jy0 jy0Var2 = this.e;
            j jVar2 = new j(this, 17);
            jy0Var2.setOnItemClickListener(jVar2);
            this.e.setOnTouchListener(new ci.q1(4, this, jVar2));
            this.d.addView(this.e, w7.x5.c(52.0f, -1));
            addView(this.d, w7.x5.a(-1.0f, 66.66f, 80));
            ly0 ly0Var = this.f26618c;
            if (ly0Var != null) {
                ly0Var.a(new ci.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f26625w;
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
        jy0 jy0Var = this.e;
        if (jy0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f26620d0.f22953c;
        float f10 = this.f26619c0.f22953c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + jy0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f26624s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        jq0 jq0Var = this.F;
        if (jq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jq0Var);
        }
        jq0 jq0Var2 = new jq0(this, 11);
        this.F = jq0Var2;
        AndroidUtilities.runOnUIThread(jq0Var2, 16L);
    }

    public final void f() {
        jq0 jq0Var = this.F;
        if (jq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jq0Var);
            this.F = null;
        }
        this.f26624s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public ly0 getDelegate() {
        return this.f26618c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f26624s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26614a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26614a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(ly0 ly0Var) {
        this.f26618c = ly0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f26622n = i10;
    }
}

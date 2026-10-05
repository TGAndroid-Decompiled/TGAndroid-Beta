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
public class jz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public gq0 F;
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
    public final int f27998a;
    public float f27999a0;
    public final org.telegram.ui.ActionBar.d6 f28000b;
    public e6 f28001b0;
    public hz0 f28002c;
    public e6 f28003c0;
    public ai.f0 d;
    public e6 f28004d0;
    public fz0 f28005e;
    public gz0 f28006f;
    public int h;
    public int f28007n;
    public ez0 f28008r;
    public boolean f28009s;
    public boolean v;
    public ArrayList f28010w;
    public boolean f28011x;
    public boolean f28012y;

    public jz0(Context context, int i10, org.telegram.ui.jk jkVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f28007n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f27998a = i10;
        this.f28002c = jkVar;
        this.f28000b = d6Var;
        postDelayed(new ei.s2(i10, 10), 260L);
    }

    public static boolean a(jz0 jz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.rt.q().s(motionEvent, jz0Var.f28005e, jVar, jz0Var.getPreviewDelegate(), jz0Var.f28000b);
    }

    public org.telegram.ui.pt getPreviewDelegate() {
        if (this.f28008r == null) {
            this.f28008r = new ez0(this);
        }
        return this.f28008r;
    }

    public final void c() {
        if (this.f28005e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 22);
            this.d = f0Var;
            tr trVar = tr.h;
            this.P = new e6(f0Var, 120L, 350L, trVar);
            this.Q = new e6(this.d, 150L, 600L, trVar);
            new OvershootInterpolator(0.4f);
            this.R = new e6(this.d, 300L, trVar);
            this.S = new e6(this.d, 300L, trVar);
            this.f28001b0 = new e6(this.d, 200L, trVar);
            this.f28003c0 = new e6(this.d, 350L, trVar);
            this.f28004d0 = new e6(this.d, 350L, trVar);
            fz0 fz0Var = new fz0(this, getContext());
            this.f28005e = fz0Var;
            gz0 gz0Var = new gz0(this, this);
            this.f28006f = gz0Var;
            fz0Var.setAdapter(gz0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.f28005e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f46603o = trVar;
            this.f28005e.setItemAnimator(jVar);
            this.f28005e.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20918i6, this.f28000b));
            fz0 fz0Var2 = this.f28005e;
            j jVar2 = new j(this, 17);
            fz0Var2.setOnItemClickListener(jVar2);
            this.f28005e.setOnTouchListener(new ci.q1(4, this, jVar2));
            this.d.addView(this.f28005e, w7.z5.c(52.0f, -1));
            addView(this.d, w7.z5.a(-1.0f, 66.66f, 80));
            hz0 hz0Var = this.f28002c;
            if (hz0Var != null) {
                hz0Var.a(new ci.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f28010w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f28005e != null) {
            for (int i12 = 0; i12 < this.f28005e.getChildCount(); i12++) {
                this.f28005e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fz0 fz0Var = this.f28005e;
        if (fz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f28004d0.f25987c;
        float f10 = this.f28003c0.f25987c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f28005e.getTranslationX() + (f10 - f11) + fz0Var.getPaddingLeft(), this.f28005e.getPaddingTop() + this.f28005e.getTop(), Math.min(this.f28005e.getTranslationX() + f10 + f11 + this.f28005e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f28005e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f28009s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        gq0 gq0Var = this.F;
        if (gq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gq0Var);
        }
        gq0 gq0Var2 = new gq0(this, 14);
        this.F = gq0Var2;
        AndroidUtilities.runOnUIThread(gq0Var2, 16L);
    }

    public final void f() {
        gq0 gq0Var = this.F;
        if (gq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gq0Var);
            this.F = null;
        }
        this.f28009s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public hz0 getDelegate() {
        return this.f28002c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f28009s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f27998a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f27998a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(hz0 hz0Var) {
        this.f28002c = hz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f28007n = i10;
    }
}

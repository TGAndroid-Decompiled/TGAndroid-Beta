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
public class az0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public zq0 F;
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
    public final int f22744a;
    public float f22745a0;
    public final org.telegram.ui.ActionBar.d6 f22746b;
    public e6 f22747b0;
    public yy0 f22748c;
    public e6 f22749c0;
    public ai.f0 d;
    public e6 f22750d0;
    public wy0 e;
    public xy0 f22751f;
    public int h;
    public int f22752n;
    public vy0 f22753r;
    public boolean f22754s;
    public boolean v;
    public ArrayList f22755w;
    public boolean f22756x;
    public boolean f22757y;

    public az0(Context context, int i10, org.telegram.ui.jk jkVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f22752n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f22744a = i10;
        this.f22748c = jkVar;
        this.f22746b = d6Var;
        postDelayed(new ei.r2(i10, 10), 260L);
    }

    public static boolean a(az0 az0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.nt.q().s(motionEvent, az0Var.e, jVar, az0Var.getPreviewDelegate(), az0Var.f22746b);
    }

    public org.telegram.ui.lt getPreviewDelegate() {
        if (this.f22753r == null) {
            this.f22753r = new vy0(this);
        }
        return this.f22753r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 21);
            this.d = f0Var;
            tr trVar = tr.h;
            this.P = new e6(f0Var, 120L, 350L, trVar);
            this.Q = new e6(this.d, 150L, 600L, trVar);
            new OvershootInterpolator(0.4f);
            this.R = new e6(this.d, 300L, trVar);
            this.S = new e6(this.d, 300L, trVar);
            this.f22747b0 = new e6(this.d, 200L, trVar);
            this.f22749c0 = new e6(this.d, 350L, trVar);
            this.f22750d0 = new e6(this.d, 350L, trVar);
            wy0 wy0Var = new wy0(this, getContext());
            this.e = wy0Var;
            xy0 xy0Var = new xy0(this, this);
            this.f22751f = xy0Var;
            wy0Var.setAdapter(xy0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f43125o = trVar;
            this.e.setItemAnimator(jVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, this.f22746b));
            wy0 wy0Var2 = this.e;
            j jVar2 = new j(this, 17);
            wy0Var2.setOnItemClickListener(jVar2);
            this.e.setOnTouchListener(new ci.q1(4, this, jVar2));
            this.d.addView(this.e, w7.y5.c(52.0f, -1));
            addView(this.d, w7.y5.a(-1.0f, 66.66f, 80));
            yy0 yy0Var = this.f22748c;
            if (yy0Var != null) {
                yy0Var.a(new ci.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f22755w;
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
        wy0 wy0Var = this.e;
        if (wy0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f22750d0.f23852c;
        float f10 = this.f22749c0.f23852c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + wy0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f22754s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        zq0 zq0Var = this.F;
        if (zq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zq0Var);
        }
        zq0 zq0Var2 = new zq0(this, 12);
        this.F = zq0Var2;
        AndroidUtilities.runOnUIThread(zq0Var2, 16L);
    }

    public final void f() {
        zq0 zq0Var = this.F;
        if (zq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zq0Var);
            this.F = null;
        }
        this.f22754s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public yy0 getDelegate() {
        return this.f22748c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f22754s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f22744a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f22744a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(yy0 yy0Var) {
        this.f22748c = yy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f22752n = i10;
    }
}

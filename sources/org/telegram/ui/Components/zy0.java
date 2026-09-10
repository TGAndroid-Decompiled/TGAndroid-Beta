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
    public uq0 F;
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
    public final int f29828a;
    public float f29829a0;
    public final org.telegram.ui.ActionBar.f6 f29830b;
    public d6 f29831b0;
    public xy0 f29832c;
    public d6 f29833c0;
    public bi.ld d;
    public d6 f29834d0;
    public vy0 e;
    public wy0 f29835f;
    public int h;
    public int f29836n;
    public uy0 f29837r;
    public boolean f29838s;
    public boolean v;
    public ArrayList f29839w;
    public boolean f29840x;
    public boolean f29841y;

    public zy0(Context context, int i10, org.telegram.ui.ok okVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.f29836n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f29828a = i10;
        this.f29832c = okVar;
        this.f29830b = f6Var;
        postDelayed(new di.u2(i10, 10), 260L);
    }

    public static boolean a(zy0 zy0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.tt.q().s(motionEvent, zy0Var.e, kVar, zy0Var.getPreviewDelegate(), zy0Var.f29830b);
    }

    public org.telegram.ui.rt getPreviewDelegate() {
        if (this.f29837r == null) {
            this.f29837r = new uy0(this);
        }
        return this.f29837r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            bi.ld ldVar = new bi.ld(this, getContext(), 19);
            this.d = ldVar;
            wr wrVar = wr.h;
            this.P = new d6(ldVar, 120L, 350L, wrVar);
            this.Q = new d6(this.d, 150L, 600L, wrVar);
            new OvershootInterpolator(0.4f);
            this.R = new d6(this.d, 300L, wrVar);
            this.S = new d6(this.d, 300L, wrVar);
            this.f29831b0 = new d6(this.d, 200L, wrVar);
            this.f29833c0 = new d6(this.d, 350L, wrVar);
            this.f29834d0 = new d6(this.d, 350L, wrVar);
            vy0 vy0Var = new vy0(this, getContext());
            this.e = vy0Var;
            wy0 wy0Var = new wy0(this, this);
            this.f29835f = wy0Var;
            vy0Var.setAdapter(wy0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f41667o = wrVar;
            this.e.setItemAnimator(jVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, this.f29830b));
            vy0 vy0Var2 = this.e;
            k kVar = new k(this, 17);
            vy0Var2.setOnItemClickListener(kVar);
            this.e.setOnTouchListener(new bi.x1(4, this, kVar));
            this.d.addView(this.e, w7.a6.c(52.0f, -1));
            addView(this.d, w7.a6.a(-1.0f, 66.66f, 80));
            xy0 xy0Var = this.f29832c;
            if (xy0Var != null) {
                xy0Var.a(new bi.u2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f29839w;
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
        float f7 = this.f29834d0.f22295c;
        float f10 = this.f29833c0.f22295c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + vy0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f29838s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        uq0 uq0Var = this.F;
        if (uq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(uq0Var);
        }
        uq0 uq0Var2 = new uq0(this, 11);
        this.F = uq0Var2;
        AndroidUtilities.runOnUIThread(uq0Var2, 16L);
    }

    public final void f() {
        uq0 uq0Var = this.F;
        if (uq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(uq0Var);
            this.F = null;
        }
        this.f29838s = false;
        this.v = true;
        bi.ld ldVar = this.d;
        if (ldVar != null) {
            ldVar.invalidate();
        }
    }

    public xy0 getDelegate() {
        return this.f29832c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f29838s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f29828a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f29828a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(xy0 xy0Var) {
        this.f29832c = xy0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f29836n = i10;
    }
}

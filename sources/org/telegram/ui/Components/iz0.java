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
public class iz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public hr0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public f6 P;
    public f6 Q;
    public f6 R;
    public f6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f27356a;
    public float f27357a0;
    public final org.telegram.ui.ActionBar.d6 f27358b;
    public f6 f27359b0;
    public gz0 f27360c;
    public f6 f27361c0;
    public ah.x d;
    public f6 f27362d0;
    public ez0 e;
    public fz0 f27363f;
    public int h;
    public int f27364n;
    public dz0 f27365r;
    public boolean f27366s;
    public boolean v;
    public ArrayList f27367w;
    public boolean f27368x;
    public boolean f27369y;

    public iz0(Context context, int i10, org.telegram.ui.fk fkVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f27364n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f27356a = i10;
        this.f27360c = fkVar;
        this.f27358b = d6Var;
        postDelayed(new gi.l2(i10, 11), 260L);
    }

    public static boolean a(iz0 iz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.et.q().s(motionEvent, iz0Var.e, jVar, iz0Var.getPreviewDelegate(), iz0Var.f27358b);
    }

    public org.telegram.ui.ct getPreviewDelegate() {
        if (this.f27365r == null) {
            this.f27365r = new dz0(this);
        }
        return this.f27365r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ah.x xVar = new ah.x(this, getContext(), 24);
            this.d = xVar;
            bs bsVar = bs.h;
            this.P = new f6(xVar, 120L, 350L, bsVar);
            this.Q = new f6(this.d, 150L, 600L, bsVar);
            new OvershootInterpolator(0.4f);
            this.R = new f6(this.d, 300L, bsVar);
            this.S = new f6(this.d, 300L, bsVar);
            this.f27359b0 = new f6(this.d, 200L, bsVar);
            this.f27361c0 = new f6(this.d, 350L, bsVar);
            this.f27362d0 = new f6(this.d, 350L, bsVar);
            ez0 ez0Var = new ez0(this, getContext());
            this.e = ez0Var;
            fz0 fz0Var = new fz0(this, this);
            this.f27363f = fz0Var;
            ez0Var.setAdapter(fz0Var);
            getContext();
            s4.b0 b0Var = new s4.b0();
            b0Var.j1(0);
            this.e.setLayoutManager(b0Var);
            s4.k kVar = new s4.k();
            kVar.n(45L);
            kVar.f45983o = bsVar;
            this.e.setItemAnimator(kVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, this.f27358b));
            ez0 ez0Var2 = this.e;
            j jVar = new j(this, 17);
            ez0Var2.setOnItemClickListener(jVar);
            this.e.setOnTouchListener(new ei.p1(4, this, jVar));
            this.d.addView(this.e, w7.z5.c(52.0f, -1));
            addView(this.d, w7.z5.a(-1.0f, 66.66f, 80));
            gz0 gz0Var = this.f27360c;
            if (gz0Var != null) {
                gz0Var.a(new ai.u(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f27367w;
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
        ez0 ez0Var = this.e;
        if (ez0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f27362d0.f26089c;
        float f10 = this.f27361c0.f26089c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + ez0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f27366s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        hr0 hr0Var = this.F;
        if (hr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(hr0Var);
        }
        hr0 hr0Var2 = new hr0(this, 11);
        this.F = hr0Var2;
        AndroidUtilities.runOnUIThread(hr0Var2, 16L);
    }

    public final void f() {
        hr0 hr0Var = this.F;
        if (hr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(hr0Var);
            this.F = null;
        }
        this.f27366s = false;
        this.v = true;
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public gz0 getDelegate() {
        return this.f27360c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f27366s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f27356a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f27356a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(gz0 gz0Var) {
        this.f27360c = gz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f27364n = i10;
    }
}

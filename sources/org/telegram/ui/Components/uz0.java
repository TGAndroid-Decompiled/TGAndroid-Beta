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
public class uz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public ur0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public g6 P;
    public g6 Q;
    public g6 R;
    public g6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f31293a;
    public float f31294a0;
    public final org.telegram.ui.ActionBar.c6 f31295b;
    public g6 f31296b0;
    public sz0 f31297c;
    public g6 f31298c0;
    public ai.f0 d;
    public g6 f31299d0;
    public qz0 f31300e;
    public rz0 f31301f;
    public int h;
    public int f31302n;
    public pz0 f31303r;
    public boolean f31304s;
    public boolean v;
    public ArrayList f31305w;
    public boolean f31306x;
    public boolean f31307y;

    public uz0(Context context, int i10, org.telegram.ui.sk skVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = 0;
        this.f31302n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f31293a = i10;
        this.f31297c = skVar;
        this.f31295b = c6Var;
        postDelayed(new ei.r2(i10, 11), 260L);
    }

    public static boolean a(uz0 uz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.ut.q().s(motionEvent, uz0Var.f31300e, jVar, uz0Var.getPreviewDelegate(), uz0Var.f31295b);
    }

    public org.telegram.ui.st getPreviewDelegate() {
        if (this.f31303r == null) {
            this.f31303r = new pz0(this);
        }
        return this.f31303r;
    }

    public final void c() {
        if (this.f31300e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 22);
            this.d = f0Var;
            js jsVar = js.h;
            this.P = new g6(f0Var, 120L, 350L, jsVar);
            this.Q = new g6(this.d, 150L, 600L, jsVar);
            new OvershootInterpolator(0.4f);
            this.R = new g6(this.d, 300L, jsVar);
            this.S = new g6(this.d, 300L, jsVar);
            this.f31296b0 = new g6(this.d, 200L, jsVar);
            this.f31298c0 = new g6(this.d, 350L, jsVar);
            this.f31299d0 = new g6(this.d, 350L, jsVar);
            qz0 qz0Var = new qz0(this, getContext());
            this.f31300e = qz0Var;
            rz0 rz0Var = new rz0(this, this);
            this.f31301f = rz0Var;
            qz0Var.setAdapter(rz0Var);
            getContext();
            s4.d0 d0Var = new s4.d0();
            d0Var.j1(0);
            this.f31300e.setLayoutManager(d0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f47949o = jsVar;
            this.f31300e.setItemAnimator(jVar);
            this.f31300e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, this.f31295b));
            qz0 qz0Var2 = this.f31300e;
            j jVar2 = new j(this, 17);
            qz0Var2.setOnItemClickListener(jVar2);
            this.f31300e.setOnTouchListener(new ci.p1(4, this, jVar2));
            this.d.addView(this.f31300e, w7.w5.d(52.0f, -1));
            addView(this.d, w7.w5.b(-1.0f, 66.66f, 80));
            sz0 sz0Var = this.f31297c;
            if (sz0Var != null) {
                sz0Var.a(new ci.h2(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f31305w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f31300e != null) {
            for (int i12 = 0; i12 < this.f31300e.getChildCount(); i12++) {
                this.f31300e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qz0 qz0Var = this.f31300e;
        if (qz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f31299d0.f26303c;
        float f10 = this.f31298c0.f26303c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f31300e.getTranslationX() + (f10 - f11) + qz0Var.getPaddingLeft(), this.f31300e.getPaddingTop() + this.f31300e.getTop(), Math.min(this.f31300e.getTranslationX() + f10 + f11 + this.f31300e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f31300e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f31304s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        ur0 ur0Var = this.F;
        if (ur0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ur0Var);
        }
        ur0 ur0Var2 = new ur0(this, 12);
        this.F = ur0Var2;
        AndroidUtilities.runOnUIThread(ur0Var2, 16L);
    }

    public final void f() {
        ur0 ur0Var = this.F;
        if (ur0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ur0Var);
            this.F = null;
        }
        this.f31304s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public sz0 getDelegate() {
        return this.f31297c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f31304s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f31293a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f31293a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(sz0 sz0Var) {
        this.f31297c = sz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f31302n = i10;
    }
}

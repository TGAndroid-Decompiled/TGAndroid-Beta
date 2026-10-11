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
public class qz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public qr0 F;
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
    public final int f30268a;
    public float f30269a0;
    public final org.telegram.ui.ActionBar.d6 f30270b;
    public g6 f30271b0;
    public oz0 f30272c;
    public g6 f30273c0;
    public ai.f0 d;
    public g6 f30274d0;
    public mz0 f30275e;
    public nz0 f30276f;
    public int h;
    public int f30277n;
    public lz0 f30278r;
    public boolean f30279s;
    public boolean v;
    public ArrayList f30280w;
    public boolean f30281x;
    public boolean f30282y;

    public qz0(Context context, int i10, org.telegram.ui.ok okVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f30277n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f30268a = i10;
        this.f30272c = okVar;
        this.f30270b = d6Var;
        postDelayed(new ei.r2(i10, 11), 260L);
    }

    public static boolean a(qz0 qz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.qt.q().s(motionEvent, qz0Var.f30275e, jVar, qz0Var.getPreviewDelegate(), qz0Var.f30270b);
    }

    public org.telegram.ui.ot getPreviewDelegate() {
        if (this.f30278r == null) {
            this.f30278r = new lz0(this);
        }
        return this.f30278r;
    }

    public final void c() {
        if (this.f30275e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 21);
            this.d = f0Var;
            is isVar = is.h;
            this.P = new g6(f0Var, 120L, 350L, isVar);
            this.Q = new g6(this.d, 150L, 600L, isVar);
            new OvershootInterpolator(0.4f);
            this.R = new g6(this.d, 300L, isVar);
            this.S = new g6(this.d, 300L, isVar);
            this.f30271b0 = new g6(this.d, 200L, isVar);
            this.f30273c0 = new g6(this.d, 350L, isVar);
            this.f30274d0 = new g6(this.d, 350L, isVar);
            mz0 mz0Var = new mz0(this, getContext());
            this.f30275e = mz0Var;
            nz0 nz0Var = new nz0(this, this);
            this.f30276f = nz0Var;
            mz0Var.setAdapter(nz0Var);
            getContext();
            s4.d0 d0Var = new s4.d0();
            d0Var.j1(0);
            this.f30275e.setLayoutManager(d0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f47808o = isVar;
            this.f30275e.setItemAnimator(jVar);
            this.f30275e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, this.f30270b));
            mz0 mz0Var2 = this.f30275e;
            j jVar2 = new j(this, 17);
            mz0Var2.setOnItemClickListener(jVar2);
            this.f30275e.setOnTouchListener(new ci.p1(4, this, jVar2));
            this.d.addView(this.f30275e, w7.x5.d(52.0f, -1));
            addView(this.d, w7.x5.b(-1.0f, 66.66f, 80));
            oz0 oz0Var = this.f30272c;
            if (oz0Var != null) {
                oz0Var.a(new ci.h2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f30280w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f30275e != null) {
            for (int i12 = 0; i12 < this.f30275e.getChildCount(); i12++) {
                this.f30275e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mz0 mz0Var = this.f30275e;
        if (mz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f30274d0.f26613c;
        float f10 = this.f30273c0.f26613c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f30275e.getTranslationX() + (f10 - f11) + mz0Var.getPaddingLeft(), this.f30275e.getPaddingTop() + this.f30275e.getTop(), Math.min(this.f30275e.getTranslationX() + f10 + f11 + this.f30275e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f30275e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30279s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        qr0 qr0Var = this.F;
        if (qr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(qr0Var);
        }
        qr0 qr0Var2 = new qr0(this, 11);
        this.F = qr0Var2;
        AndroidUtilities.runOnUIThread(qr0Var2, 16L);
    }

    public final void f() {
        qr0 qr0Var = this.F;
        if (qr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(qr0Var);
            this.F = null;
        }
        this.f30279s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public oz0 getDelegate() {
        return this.f30272c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30279s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30268a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f30268a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(oz0 oz0Var) {
        this.f30272c = oz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30277n = i10;
    }
}

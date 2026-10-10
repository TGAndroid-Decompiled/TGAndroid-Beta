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
public class pz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public pr0 F;
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
    public final int f29888a;
    public float f29889a0;
    public final org.telegram.ui.ActionBar.e6 f29890b;
    public g6 f29891b0;
    public nz0 f29892c;
    public g6 f29893c0;
    public ai.f0 d;
    public g6 f29894d0;
    public lz0 f29895e;
    public mz0 f29896f;
    public int h;
    public int f29897n;
    public kz0 f29898r;
    public boolean f29899s;
    public boolean v;
    public ArrayList f29900w;
    public boolean f29901x;
    public boolean f29902y;

    public pz0(Context context, int i10, org.telegram.ui.ok okVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 0;
        this.f29897n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f29888a = i10;
        this.f29892c = okVar;
        this.f29890b = e6Var;
        postDelayed(new ei.r2(i10, 11), 260L);
    }

    public static boolean a(pz0 pz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.rt.q().s(motionEvent, pz0Var.f29895e, jVar, pz0Var.getPreviewDelegate(), pz0Var.f29890b);
    }

    public org.telegram.ui.pt getPreviewDelegate() {
        if (this.f29898r == null) {
            this.f29898r = new kz0(this);
        }
        return this.f29898r;
    }

    public final void c() {
        if (this.f29895e == null) {
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
            this.f29891b0 = new g6(this.d, 200L, isVar);
            this.f29893c0 = new g6(this.d, 350L, isVar);
            this.f29894d0 = new g6(this.d, 350L, isVar);
            lz0 lz0Var = new lz0(this, getContext());
            this.f29895e = lz0Var;
            mz0 mz0Var = new mz0(this, this);
            this.f29896f = mz0Var;
            lz0Var.setAdapter(mz0Var);
            getContext();
            s4.d0 d0Var = new s4.d0();
            d0Var.j1(0);
            this.f29895e.setLayoutManager(d0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f47762o = isVar;
            this.f29895e.setItemAnimator(jVar);
            this.f29895e.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, this.f29890b));
            lz0 lz0Var2 = this.f29895e;
            j jVar2 = new j(this, 17);
            lz0Var2.setOnItemClickListener(jVar2);
            this.f29895e.setOnTouchListener(new ci.p1(4, this, jVar2));
            this.d.addView(this.f29895e, w7.x5.d(52.0f, -1));
            addView(this.d, w7.x5.b(-1.0f, 66.66f, 80));
            nz0 nz0Var = this.f29892c;
            if (nz0Var != null) {
                nz0Var.a(new ci.h2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f29900w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f29895e != null) {
            for (int i12 = 0; i12 < this.f29895e.getChildCount(); i12++) {
                this.f29895e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lz0 lz0Var = this.f29895e;
        if (lz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f29894d0.f26616c;
        float f10 = this.f29893c0.f26616c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f29895e.getTranslationX() + (f10 - f11) + lz0Var.getPaddingLeft(), this.f29895e.getPaddingTop() + this.f29895e.getTop(), Math.min(this.f29895e.getTranslationX() + f10 + f11 + this.f29895e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f29895e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f29899s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        pr0 pr0Var = this.F;
        if (pr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(pr0Var);
        }
        pr0 pr0Var2 = new pr0(this, 11);
        this.F = pr0Var2;
        AndroidUtilities.runOnUIThread(pr0Var2, 16L);
    }

    public final void f() {
        pr0 pr0Var = this.F;
        if (pr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(pr0Var);
            this.F = null;
        }
        this.f29899s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public nz0 getDelegate() {
        return this.f29892c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f29899s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f29888a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f29888a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(nz0 nz0Var) {
        this.f29892c = nz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f29897n = i10;
    }
}

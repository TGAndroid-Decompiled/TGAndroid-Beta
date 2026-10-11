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
    public final int f29991a;
    public float f29992a0;
    public final org.telegram.ui.ActionBar.d6 f29993b;
    public g6 f29994b0;
    public nz0 f29995c;
    public g6 f29996c0;
    public ai.f0 d;
    public g6 f29997d0;
    public lz0 f29998e;
    public mz0 f29999f;
    public int h;
    public int f30000n;
    public kz0 f30001r;
    public boolean f30002s;
    public boolean v;
    public ArrayList f30003w;
    public boolean f30004x;
    public boolean f30005y;

    public pz0(Context context, int i10, org.telegram.ui.ok okVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f30000n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f29991a = i10;
        this.f29995c = okVar;
        this.f29993b = d6Var;
        postDelayed(new ei.r2(i10, 11), 260L);
    }

    public static boolean a(pz0 pz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.qt.q().s(motionEvent, pz0Var.f29998e, jVar, pz0Var.getPreviewDelegate(), pz0Var.f29993b);
    }

    public org.telegram.ui.ot getPreviewDelegate() {
        if (this.f30001r == null) {
            this.f30001r = new kz0(this);
        }
        return this.f30001r;
    }

    public final void c() {
        if (this.f29998e == null) {
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
            this.f29994b0 = new g6(this.d, 200L, isVar);
            this.f29996c0 = new g6(this.d, 350L, isVar);
            this.f29997d0 = new g6(this.d, 350L, isVar);
            lz0 lz0Var = new lz0(this, getContext());
            this.f29998e = lz0Var;
            mz0 mz0Var = new mz0(this, this);
            this.f29999f = mz0Var;
            lz0Var.setAdapter(mz0Var);
            getContext();
            s4.d0 d0Var = new s4.d0();
            d0Var.j1(0);
            this.f29998e.setLayoutManager(d0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f47842o = isVar;
            this.f29998e.setItemAnimator(jVar);
            this.f29998e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, this.f29993b));
            lz0 lz0Var2 = this.f29998e;
            j jVar2 = new j(this, 17);
            lz0Var2.setOnItemClickListener(jVar2);
            this.f29998e.setOnTouchListener(new ci.p1(4, this, jVar2));
            this.d.addView(this.f29998e, w7.x5.d(52.0f, -1));
            addView(this.d, w7.x5.b(-1.0f, 66.66f, 80));
            nz0 nz0Var = this.f29995c;
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
            ArrayList arrayList = this.f30003w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f29998e != null) {
            for (int i12 = 0; i12 < this.f29998e.getChildCount(); i12++) {
                this.f29998e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lz0 lz0Var = this.f29998e;
        if (lz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f29997d0.f26665c;
        float f10 = this.f29996c0.f26665c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f29998e.getTranslationX() + (f10 - f11) + lz0Var.getPaddingLeft(), this.f29998e.getPaddingTop() + this.f29998e.getTop(), Math.min(this.f29998e.getTranslationX() + f10 + f11 + this.f29998e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f29998e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f30002s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        pr0 pr0Var2 = new pr0(this, 12);
        this.F = pr0Var2;
        AndroidUtilities.runOnUIThread(pr0Var2, 16L);
    }

    public final void f() {
        pr0 pr0Var = this.F;
        if (pr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(pr0Var);
            this.F = null;
        }
        this.f30002s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public nz0 getDelegate() {
        return this.f29995c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f30002s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f29991a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f29991a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(nz0 nz0Var) {
        this.f29995c = nz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f30000n = i10;
    }
}

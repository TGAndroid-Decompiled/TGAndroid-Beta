package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
public class uz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public np0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public h6 R;
    public h6 S;
    public h6 T;
    public h6 U;
    public Emoji.EmojiSpan V;
    public float W;
    public final int f33485a;
    public Integer f33486a0;
    public final org.telegram.ui.ActionBar.u6 f33487b;
    public Integer f33488b0;
    public sz0 f33489c;
    public float f33490c0;
    public bh.r d;
    public h6 f33491d0;
    public qz0 e;
    public h6 f33492e0;
    public rz0 f33493f;
    public h6 f33494f0;
    public int h;
    public int f33495n;
    public pz0 f33496r;
    public boolean f33497s;
    public boolean v;
    public ArrayList f33498w;
    public boolean f33499x;
    public boolean f33500y;

    public uz0(Context context, int i10, org.telegram.ui.jk jkVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = 0;
        this.f33495n = AndroidUtilities.dp(10.0f);
        this.N = 0L;
        this.f33485a = i10;
        this.f33489c = jkVar;
        this.f33487b = u6Var;
        postDelayed(new hi.t2(i10, 11), 260L);
    }

    public static boolean a(uz0 uz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.o().q(motionEvent, uz0Var.e, jVar, uz0Var.getPreviewDelegate(), uz0Var.f33487b);
    }

    public org.telegram.ui.ft getPreviewDelegate() {
        if (this.f33496r == null) {
            this.f33496r = new pz0(this);
        }
        return this.f33496r;
    }

    public final void c() {
        if (this.e == null) {
            this.O = new Path();
            this.P = new Path();
            bh.r rVar = new bh.r(this, getContext(), 26);
            this.d = rVar;
            ds dsVar = ds.h;
            this.R = new h6(rVar, 120L, 350L, dsVar);
            this.S = new h6(this.d, 150L, 600L, dsVar);
            new OvershootInterpolator(0.4f);
            this.T = new h6(this.d, 300L, dsVar);
            this.U = new h6(this.d, 300L, dsVar);
            this.f33491d0 = new h6(this.d, 200L, dsVar);
            this.f33492e0 = new h6(this.d, 350L, dsVar);
            this.f33494f0 = new h6(this.d, 350L, dsVar);
            qz0 qz0Var = new qz0(this, getContext());
            this.e = qz0Var;
            rz0 rz0Var = new rz0(this, this);
            this.f33493f = rz0Var;
            qz0Var.setAdapter(rz0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.k1(0);
            this.e.setLayoutManager(c0Var);
            s4.l lVar = new s4.l();
            lVar.n(45L);
            lVar.f47822o = dsVar;
            this.e.setItemAnimator(lVar);
            org.telegram.ui.ActionBar.f7.K(this.e, org.telegram.ui.ActionBar.y6.f23449i6, this.f33487b);
            qz0 qz0Var2 = this.e;
            j jVar = new j(this, 17);
            qz0Var2.setOnItemClickListener(jVar);
            this.e.setOnTouchListener(new fi.o1(4, this, jVar));
            this.d.addView(this.e, kb1.g(52.0f, -1));
            addView(this.d, kb1.e(-1.0f, 66.66f, 80));
            sz0 sz0Var = this.f33489c;
            if (sz0Var != null) {
                sz0Var.d(new bi.u(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f33498w;
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
        qz0 qz0Var = this.e;
        if (qz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f33494f0.f28864c;
        float f10 = this.f33492e0.f28864c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + qz0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f33497s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        np0 np0Var = this.H;
        if (np0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(np0Var);
        }
        np0 np0Var2 = new np0(this, 17);
        this.H = np0Var2;
        AndroidUtilities.runOnUIThread(np0Var2, 16L);
    }

    public final void f() {
        np0 np0Var = this.H;
        if (np0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(np0Var);
            this.H = null;
        }
        this.f33497s = false;
        this.v = true;
        bh.r rVar = this.d;
        if (rVar != null) {
            rVar.invalidate();
        }
    }

    public sz0 getDelegate() {
        return this.f33489c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f33497s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f33485a).addWeakObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f33485a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(sz0 sz0Var) {
        this.f33489c = sz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f33495n = i10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.u6 u6Var = this.f33487b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Be, u6Var));
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Be, u6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.y6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.y6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.y6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.y6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bh.r rVar = this.d;
        if (rVar != null) {
            rVar.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

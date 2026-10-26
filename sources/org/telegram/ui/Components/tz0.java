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
public class tz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public mp0 H;
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
    public final int f33172a;
    public Integer f33173a0;
    public final org.telegram.ui.ActionBar.u6 f33174b;
    public Integer f33175b0;
    public rz0 f33176c;
    public float f33177c0;
    public bh.r d;
    public h6 f33178d0;
    public pz0 e;
    public h6 f33179e0;
    public qz0 f33180f;
    public h6 f33181f0;
    public int h;
    public int f33182n;
    public oz0 f33183r;
    public boolean f33184s;
    public boolean v;
    public ArrayList f33185w;
    public boolean f33186x;
    public boolean f33187y;

    public tz0(Context context, int i10, org.telegram.ui.hk hkVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = 0;
        this.f33182n = AndroidUtilities.dp(10.0f);
        this.N = 0L;
        this.f33172a = i10;
        this.f33176c = hkVar;
        this.f33174b = u6Var;
        postDelayed(new hi.t2(i10, 11), 260L);
    }

    public static boolean a(tz0 tz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.ft.o().q(motionEvent, tz0Var.e, jVar, tz0Var.getPreviewDelegate(), tz0Var.f33174b);
    }

    public org.telegram.ui.dt getPreviewDelegate() {
        if (this.f33183r == null) {
            this.f33183r = new oz0(this);
        }
        return this.f33183r;
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
            this.f33178d0 = new h6(this.d, 200L, dsVar);
            this.f33179e0 = new h6(this.d, 350L, dsVar);
            this.f33181f0 = new h6(this.d, 350L, dsVar);
            pz0 pz0Var = new pz0(this, getContext());
            this.e = pz0Var;
            qz0 qz0Var = new qz0(this, this);
            this.f33180f = qz0Var;
            pz0Var.setAdapter(qz0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.k1(0);
            this.e.setLayoutManager(c0Var);
            s4.l lVar = new s4.l();
            lVar.n(45L);
            lVar.f47787o = dsVar;
            this.e.setItemAnimator(lVar);
            org.telegram.ui.ActionBar.f7.K(this.e, org.telegram.ui.ActionBar.y6.f23448i6, this.f33174b);
            pz0 pz0Var2 = this.e;
            j jVar = new j(this, 17);
            pz0Var2.setOnItemClickListener(jVar);
            this.e.setOnTouchListener(new fi.o1(4, this, jVar));
            this.d.addView(this.e, gb1.g(52.0f, -1));
            addView(this.d, gb1.e(-1.0f, 66.66f, 80));
            rz0 rz0Var = this.f33176c;
            if (rz0Var != null) {
                rz0Var.d(new bi.u(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f33185w;
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
        pz0 pz0Var = this.e;
        if (pz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f33181f0.f28811c;
        float f10 = this.f33179e0.f28811c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + pz0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f33184s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        mp0 mp0Var = this.H;
        if (mp0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mp0Var);
        }
        mp0 mp0Var2 = new mp0(this, 17);
        this.H = mp0Var2;
        AndroidUtilities.runOnUIThread(mp0Var2, 16L);
    }

    public final void f() {
        mp0 mp0Var = this.H;
        if (mp0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mp0Var);
            this.H = null;
        }
        this.f33184s = false;
        this.v = true;
        bh.r rVar = this.d;
        if (rVar != null) {
            rVar.invalidate();
        }
    }

    public rz0 getDelegate() {
        return this.f33176c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f33184s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f33172a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f33172a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(rz0 rz0Var) {
        this.f33176c = rz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f33182n = i10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.u6 u6Var = this.f33174b;
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

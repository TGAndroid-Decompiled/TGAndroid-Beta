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
public class lz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public kr0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public f6 R;
    public f6 S;
    public f6 T;
    public f6 U;
    public Emoji.EmojiSpan V;
    public float W;
    public final int f28439a;
    public Integer f28440a0;
    public final org.telegram.ui.ActionBar.g6 f28441b;
    public Integer f28442b0;
    public jz0 f28443c;
    public float f28444c0;
    public ah.x d;
    public f6 f28445d0;
    public hz0 e;
    public f6 f28446e0;
    public iz0 f28447f;
    public f6 f28448f0;
    public int h;
    public int f28449n;
    public gz0 f28450r;
    public boolean f28451s;
    public boolean v;
    public ArrayList f28452w;
    public boolean f28453x;
    public boolean f28454y;

    public lz0(Context context, int i10, org.telegram.ui.gk gkVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 0;
        this.f28449n = AndroidUtilities.dp(10.0f);
        this.N = 0L;
        this.f28439a = i10;
        this.f28443c = gkVar;
        this.f28441b = g6Var;
        postDelayed(new gi.l2(i10, 11), 260L);
    }

    public static boolean a(lz0 lz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.o().q(motionEvent, lz0Var.e, jVar, lz0Var.getPreviewDelegate(), lz0Var.f28441b);
    }

    public org.telegram.ui.ft getPreviewDelegate() {
        if (this.f28450r == null) {
            this.f28450r = new gz0(this);
        }
        return this.f28450r;
    }

    public final void c() {
        if (this.e == null) {
            this.O = new Path();
            this.P = new Path();
            ah.x xVar = new ah.x(this, getContext(), 24);
            this.d = xVar;
            bs bsVar = bs.h;
            this.R = new f6(xVar, 120L, 350L, bsVar);
            this.S = new f6(this.d, 150L, 600L, bsVar);
            new OvershootInterpolator(0.4f);
            this.T = new f6(this.d, 300L, bsVar);
            this.U = new f6(this.d, 300L, bsVar);
            this.f28445d0 = new f6(this.d, 200L, bsVar);
            this.f28446e0 = new f6(this.d, 350L, bsVar);
            this.f28448f0 = new f6(this.d, 350L, bsVar);
            hz0 hz0Var = new hz0(this, getContext());
            this.e = hz0Var;
            iz0 iz0Var = new iz0(this, this);
            this.f28447f = iz0Var;
            hz0Var.setAdapter(iz0Var);
            getContext();
            s4.b0 b0Var = new s4.b0();
            b0Var.j1(0);
            this.e.setLayoutManager(b0Var);
            s4.k kVar = new s4.k();
            kVar.n(45L);
            kVar.f46406o = bsVar;
            this.e.setItemAnimator(kVar);
            org.telegram.ui.ActionBar.r6.L(this.e, org.telegram.ui.ActionBar.k6.f21272i6, this.f28441b);
            hz0 hz0Var2 = this.e;
            j jVar = new j(this, 17);
            hz0Var2.setOnItemClickListener(jVar);
            this.e.setOnTouchListener(new ei.p1(4, this, jVar));
            this.d.addView(this.e, w7.z5.c(52.0f, -1));
            addView(this.d, w7.z5.a(-1.0f, 66.66f, 80));
            jz0 jz0Var = this.f28443c;
            if (jz0Var != null) {
                jz0Var.d(new ai.u(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f28452w;
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
        hz0 hz0Var = this.e;
        if (hz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f28448f0.f26180c;
        float f10 = this.f28446e0.f26180c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + hz0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f28451s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        kr0 kr0Var = this.H;
        if (kr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kr0Var);
        }
        kr0 kr0Var2 = new kr0(this, 12);
        this.H = kr0Var2;
        AndroidUtilities.runOnUIThread(kr0Var2, 16L);
    }

    public final void f() {
        kr0 kr0Var = this.H;
        if (kr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kr0Var);
            this.H = null;
        }
        this.f28451s = false;
        this.v = true;
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public jz0 getDelegate() {
        return this.f28443c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f28451s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28439a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28439a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(jz0 jz0Var) {
        this.f28443c = jz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f28449n = i10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.g6 g6Var = this.f28441b;
        if (paint != null) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Be, g6Var));
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Be, g6Var);
        if (this.F == null || this.G != w02) {
            this.G = w02;
            this.F = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = org.telegram.ui.ActionBar.k6.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.F;
            if (colorFilter != porterDuffColorFilter) {
                org.telegram.ui.ActionBar.k6.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.k6.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.F;
            if (colorFilter2 != porterDuffColorFilter2) {
                org.telegram.ui.ActionBar.k6.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

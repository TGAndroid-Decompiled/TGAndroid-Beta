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
public class kz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public PorterDuffColorFilter F;
    public int G;
    public jr0 H;
    public int I;
    public String J;
    public int K;
    public String[] L;
    public Runnable M;
    public long N;
    public Path O;
    public Path P;
    public Paint Q;
    public d6 R;
    public d6 S;
    public d6 T;
    public d6 U;
    public Emoji.EmojiSpan V;
    public float W;
    public final int f28105a;
    public Integer f28106a0;
    public final org.telegram.ui.ActionBar.g6 f28107b;
    public Integer f28108b0;
    public iz0 f28109c;
    public float f28110c0;
    public ah.x d;
    public d6 f28111d0;
    public gz0 e;
    public d6 f28112e0;
    public hz0 f28113f;
    public d6 f28114f0;
    public int h;
    public int f28115n;
    public fz0 f28116r;
    public boolean f28117s;
    public boolean v;
    public ArrayList f28118w;
    public boolean f28119x;
    public boolean f28120y;

    public kz0(Context context, int i10, org.telegram.ui.gk gkVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = 0;
        this.f28115n = AndroidUtilities.dp(10.0f);
        this.N = 0L;
        this.f28105a = i10;
        this.f28109c = gkVar;
        this.f28107b = g6Var;
        postDelayed(new gi.l2(i10, 11), 260L);
    }

    public static boolean a(kz0 kz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.ht.o().q(motionEvent, kz0Var.e, jVar, kz0Var.getPreviewDelegate(), kz0Var.f28107b);
    }

    public org.telegram.ui.ft getPreviewDelegate() {
        if (this.f28116r == null) {
            this.f28116r = new fz0(this);
        }
        return this.f28116r;
    }

    public final void c() {
        if (this.e == null) {
            this.O = new Path();
            this.P = new Path();
            ah.x xVar = new ah.x(this, getContext(), 24);
            this.d = xVar;
            zr zrVar = zr.h;
            this.R = new d6(xVar, 120L, 350L, zrVar);
            this.S = new d6(this.d, 150L, 600L, zrVar);
            new OvershootInterpolator(0.4f);
            this.T = new d6(this.d, 300L, zrVar);
            this.U = new d6(this.d, 300L, zrVar);
            this.f28111d0 = new d6(this.d, 200L, zrVar);
            this.f28112e0 = new d6(this.d, 350L, zrVar);
            this.f28114f0 = new d6(this.d, 350L, zrVar);
            gz0 gz0Var = new gz0(this, getContext());
            this.e = gz0Var;
            hz0 hz0Var = new hz0(this, this);
            this.f28113f = hz0Var;
            gz0Var.setAdapter(hz0Var);
            getContext();
            s4.b0 b0Var = new s4.b0();
            b0Var.j1(0);
            this.e.setLayoutManager(b0Var);
            s4.k kVar = new s4.k();
            kVar.n(45L);
            kVar.f46405o = zrVar;
            this.e.setItemAnimator(kVar);
            org.telegram.ui.ActionBar.r6.L(this.e, org.telegram.ui.ActionBar.k6.f21273i6, this.f28107b);
            gz0 gz0Var2 = this.e;
            j jVar = new j(this, 17);
            gz0Var2.setOnItemClickListener(jVar);
            this.e.setOnTouchListener(new ei.p1(4, this, jVar));
            this.d.addView(this.e, w7.z5.c(52.0f, -1));
            addView(this.d, w7.z5.a(-1.0f, 66.66f, 80));
            iz0 iz0Var = this.f28109c;
            if (iz0Var != null) {
                iz0Var.d(new ai.u(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f28118w;
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
        gz0 gz0Var = this.e;
        if (gz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f28114f0.f25568c;
        float f10 = this.f28112e0.f25568c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + gz0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f28117s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        jr0 jr0Var = this.H;
        if (jr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jr0Var);
        }
        jr0 jr0Var2 = new jr0(this, 12);
        this.H = jr0Var2;
        AndroidUtilities.runOnUIThread(jr0Var2, 16L);
    }

    public final void f() {
        jr0 jr0Var = this.H;
        if (jr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jr0Var);
            this.H = null;
        }
        this.f28117s = false;
        this.v = true;
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public iz0 getDelegate() {
        return this.f28109c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f28117s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28105a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28105a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(iz0 iz0Var) {
        this.f28109c = iz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f28115n = i10;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.Q;
        org.telegram.ui.ActionBar.g6 g6Var = this.f28107b;
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

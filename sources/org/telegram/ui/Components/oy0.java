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
public class oy0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public kq0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public c6 P;
    public c6 Q;
    public c6 R;
    public c6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f26882a;
    public float f26883a0;
    public final org.telegram.ui.ActionBar.f6 f26884b;
    public c6 f26885b0;
    public my0 f26886c;
    public c6 f26887c0;
    public ai.f0 d;
    public c6 f26888d0;
    public ky0 e;
    public ly0 f26889f;
    public int h;
    public int f26890n;
    public jy0 f26891r;
    public boolean f26892s;
    public boolean v;
    public ArrayList f26893w;
    public boolean f26894x;
    public boolean f26895y;

    public oy0(Context context, int i10, org.telegram.ui.nk nkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.f26890n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f26882a = i10;
        this.f26886c = nkVar;
        this.f26884b = f6Var;
        postDelayed(new ei.r2(i10, 10), 260L);
    }

    public static boolean a(oy0 oy0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.ut.q().s(motionEvent, oy0Var.e, jVar, oy0Var.getPreviewDelegate(), oy0Var.f26884b);
    }

    public org.telegram.ui.st getPreviewDelegate() {
        if (this.f26891r == null) {
            this.f26891r = new jy0(this);
        }
        return this.f26891r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 21);
            this.d = f0Var;
            qr qrVar = qr.h;
            this.P = new c6(f0Var, 120L, 350L, qrVar);
            this.Q = new c6(this.d, 150L, 600L, qrVar);
            new OvershootInterpolator(0.4f);
            this.R = new c6(this.d, 300L, qrVar);
            this.S = new c6(this.d, 300L, qrVar);
            this.f26885b0 = new c6(this.d, 200L, qrVar);
            this.f26887c0 = new c6(this.d, 350L, qrVar);
            this.f26888d0 = new c6(this.d, 350L, qrVar);
            ky0 ky0Var = new ky0(this, getContext());
            this.e = ky0Var;
            ly0 ly0Var = new ly0(this, this);
            this.f26889f = ly0Var;
            ky0Var.setAdapter(ly0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f42754o = qrVar;
            this.e.setItemAnimator(jVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18952i6, this.f26884b));
            ky0 ky0Var2 = this.e;
            j jVar2 = new j(this, 17);
            ky0Var2.setOnItemClickListener(jVar2);
            this.e.setOnTouchListener(new ci.q1(4, this, jVar2));
            this.d.addView(this.e, w7.x5.c(52.0f, -1));
            addView(this.d, w7.x5.a(-1.0f, 66.66f, 80));
            my0 my0Var = this.f26886c;
            if (my0Var != null) {
                my0Var.a(new ci.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f26893w;
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
        ky0 ky0Var = this.e;
        if (ky0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f26888d0.f22937c;
        float f10 = this.f26887c0.f22937c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + ky0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f26892s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        kq0 kq0Var = this.F;
        if (kq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kq0Var);
        }
        kq0 kq0Var2 = new kq0(this, 11);
        this.F = kq0Var2;
        AndroidUtilities.runOnUIThread(kq0Var2, 16L);
    }

    public final void f() {
        kq0 kq0Var = this.F;
        if (kq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(kq0Var);
            this.F = null;
        }
        this.f26892s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public my0 getDelegate() {
        return this.f26886c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f26892s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26882a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26882a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(my0 my0Var) {
        this.f26886c = my0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f26890n = i10;
    }
}

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
public class kz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public lr0 F;
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
    public final int f26827a;
    public float f26828a0;
    public final org.telegram.ui.ActionBar.c6 f26829b;
    public g6 f26830b0;
    public iz0 f26831c;
    public g6 f26832c0;
    public ah.x d;
    public g6 f26833d0;
    public gz0 e;
    public hz0 f26834f;
    public int h;
    public int f26835n;
    public fz0 f26836r;
    public boolean f26837s;
    public boolean v;
    public ArrayList f26838w;
    public boolean f26839x;
    public boolean f26840y;

    public kz0(Context context, int i10, org.telegram.ui.sk skVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = 0;
        this.f26835n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f26827a = i10;
        this.f26831c = skVar;
        this.f26829b = c6Var;
        postDelayed(new fi.r2(i10, 11), 260L);
    }

    public static boolean a(kz0 kz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.xt.q().s(motionEvent, kz0Var.e, jVar, kz0Var.getPreviewDelegate(), kz0Var.f26829b);
    }

    public org.telegram.ui.vt getPreviewDelegate() {
        if (this.f26836r == null) {
            this.f26836r = new fz0(this);
        }
        return this.f26836r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ah.x xVar = new ah.x(this, getContext(), 22);
            this.d = xVar;
            es esVar = es.h;
            this.P = new g6(xVar, 120L, 350L, esVar);
            this.Q = new g6(this.d, 150L, 600L, esVar);
            new OvershootInterpolator(0.4f);
            this.R = new g6(this.d, 300L, esVar);
            this.S = new g6(this.d, 300L, esVar);
            this.f26830b0 = new g6(this.d, 200L, esVar);
            this.f26832c0 = new g6(this.d, 350L, esVar);
            this.f26833d0 = new g6(this.d, 350L, esVar);
            gz0 gz0Var = new gz0(this, getContext());
            this.e = gz0Var;
            hz0 hz0Var = new hz0(this, this);
            this.f26834f = hz0Var;
            gz0Var.setAdapter(hz0Var);
            getContext();
            s4.b0 b0Var = new s4.b0();
            b0Var.j1(0);
            this.e.setLayoutManager(b0Var);
            s4.k kVar = new s4.k();
            kVar.n(45L);
            kVar.f44901o = esVar;
            this.e.setItemAnimator(kVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, this.f26829b));
            gz0 gz0Var2 = this.e;
            j jVar = new j(this, 17);
            gz0Var2.setOnItemClickListener(jVar);
            this.e.setOnTouchListener(new di.p1(4, this, jVar));
            this.d.addView(this.e, w7.a6.d(52.0f, -1));
            addView(this.d, w7.a6.b(-1.0f, 66.66f, 80));
            iz0 iz0Var = this.f26831c;
            if (iz0Var != null) {
                iz0Var.e(new di.h2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f26838w;
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
        float f7 = this.f26833d0.f25190c;
        float f10 = this.f26832c0.f25190c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + gz0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f26837s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        lr0 lr0Var = this.F;
        if (lr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lr0Var);
        }
        lr0 lr0Var2 = new lr0(this, 12);
        this.F = lr0Var2;
        AndroidUtilities.runOnUIThread(lr0Var2, 16L);
    }

    public final void f() {
        lr0 lr0Var = this.F;
        if (lr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(lr0Var);
            this.F = null;
        }
        this.f26837s = false;
        this.v = true;
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public iz0 getDelegate() {
        return this.f26831c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f26837s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26827a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26827a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(iz0 iz0Var) {
        this.f26831c = iz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f26835n = i10;
    }
}

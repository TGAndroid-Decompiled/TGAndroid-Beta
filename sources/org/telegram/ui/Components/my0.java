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
public class my0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public jq0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public e6 P;
    public e6 Q;
    public e6 R;
    public e6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f28583a;
    public float f28584a0;
    public final org.telegram.ui.ActionBar.f6 f28585b;
    public e6 f28586b0;
    public ky0 f28587c;
    public e6 f28588c0;
    public ah.y d;
    public e6 f28589d0;
    public iy0 f28590e;
    public jy0 f28591f;
    public int h;
    public int f28592n;
    public hy0 f28593r;
    public boolean f28594s;
    public boolean v;
    public ArrayList f28595w;
    public boolean f28596x;
    public boolean f28597y;

    public my0(Context context, int i10, org.telegram.ui.mk mkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.f28592n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f28583a = i10;
        this.f28587c = mkVar;
        this.f28585b = f6Var;
        postDelayed(new fi.r2(i10, 10), 260L);
    }

    public static boolean a(my0 my0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.st.q().s(motionEvent, my0Var.f28590e, kVar, my0Var.getPreviewDelegate(), my0Var.f28585b);
    }

    public org.telegram.ui.qt getPreviewDelegate() {
        if (this.f28593r == null) {
            this.f28593r = new hy0(this);
        }
        return this.f28593r;
    }

    public final void c() {
        if (this.f28590e == null) {
            this.M = new Path();
            this.N = new Path();
            ah.y yVar = new ah.y(this, getContext(), 22);
            this.d = yVar;
            pr prVar = pr.h;
            this.P = new e6(yVar, 120L, 350L, prVar);
            this.Q = new e6(this.d, 150L, 600L, prVar);
            new OvershootInterpolator(0.4f);
            this.R = new e6(this.d, 300L, prVar);
            this.S = new e6(this.d, 300L, prVar);
            this.f28586b0 = new e6(this.d, 200L, prVar);
            this.f28588c0 = new e6(this.d, 350L, prVar);
            this.f28589d0 = new e6(this.d, 350L, prVar);
            iy0 iy0Var = new iy0(this, getContext());
            this.f28590e = iy0Var;
            jy0 jy0Var = new jy0(this, this);
            this.f28591f = jy0Var;
            iy0Var.setAdapter(jy0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.f28590e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f45832o = prVar;
            this.f28590e.setItemAnimator(jVar);
            this.f28590e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20781i6, this.f28585b));
            iy0 iy0Var2 = this.f28590e;
            k kVar = new k(this, 17);
            iy0Var2.setOnItemClickListener(kVar);
            this.f28590e.setOnTouchListener(new di.q1(4, this, kVar));
            this.d.addView(this.f28590e, w7.x5.c(52.0f, -1));
            addView(this.d, w7.x5.a(-1.0f, 66.66f, 80));
            ky0 ky0Var = this.f28587c;
            if (ky0Var != null) {
                ky0Var.e(new di.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f28595w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f28590e != null) {
            for (int i12 = 0; i12 < this.f28590e.getChildCount(); i12++) {
                this.f28590e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iy0 iy0Var = this.f28590e;
        if (iy0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f28589d0.f25593c;
        float f10 = this.f28588c0.f25593c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f28590e.getTranslationX() + (f10 - f11) + iy0Var.getPaddingLeft(), this.f28590e.getPaddingTop() + this.f28590e.getTop(), Math.min(this.f28590e.getTranslationX() + f10 + f11 + this.f28590e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f28590e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f28594s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        jq0 jq0Var = this.F;
        if (jq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jq0Var);
        }
        jq0 jq0Var2 = new jq0(this, 11);
        this.F = jq0Var2;
        AndroidUtilities.runOnUIThread(jq0Var2, 16L);
    }

    public final void f() {
        jq0 jq0Var = this.F;
        if (jq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jq0Var);
            this.F = null;
        }
        this.f28594s = false;
        this.v = true;
        ah.y yVar = this.d;
        if (yVar != null) {
            yVar.invalidate();
        }
    }

    public ky0 getDelegate() {
        return this.f28587c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f28594s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28583a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28583a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(ky0 ky0Var) {
        this.f28587c = ky0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f28592n = i10;
    }
}

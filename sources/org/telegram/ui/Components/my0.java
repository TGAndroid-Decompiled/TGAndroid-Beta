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
    public final int f28582a;
    public float f28583a0;
    public final org.telegram.ui.ActionBar.f6 f28584b;
    public e6 f28585b0;
    public ky0 f28586c;
    public e6 f28587c0;
    public ah.y d;
    public e6 f28588d0;
    public iy0 f28589e;
    public jy0 f28590f;
    public int h;
    public int f28591n;
    public hy0 f28592r;
    public boolean f28593s;
    public boolean v;
    public ArrayList f28594w;
    public boolean f28595x;
    public boolean f28596y;

    public my0(Context context, int i10, org.telegram.ui.mk mkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = 0;
        this.f28591n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f28582a = i10;
        this.f28586c = mkVar;
        this.f28584b = f6Var;
        postDelayed(new fi.r2(i10, 10), 260L);
    }

    public static boolean a(my0 my0Var, k kVar, MotionEvent motionEvent) {
        return org.telegram.ui.st.q().s(motionEvent, my0Var.f28589e, kVar, my0Var.getPreviewDelegate(), my0Var.f28584b);
    }

    public org.telegram.ui.qt getPreviewDelegate() {
        if (this.f28592r == null) {
            this.f28592r = new hy0(this);
        }
        return this.f28592r;
    }

    public final void c() {
        if (this.f28589e == null) {
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
            this.f28585b0 = new e6(this.d, 200L, prVar);
            this.f28587c0 = new e6(this.d, 350L, prVar);
            this.f28588d0 = new e6(this.d, 350L, prVar);
            iy0 iy0Var = new iy0(this, getContext());
            this.f28589e = iy0Var;
            jy0 jy0Var = new jy0(this, this);
            this.f28590f = jy0Var;
            iy0Var.setAdapter(jy0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.f28589e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f45831o = prVar;
            this.f28589e.setItemAnimator(jVar);
            this.f28589e.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20780i6, this.f28584b));
            iy0 iy0Var2 = this.f28589e;
            k kVar = new k(this, 17);
            iy0Var2.setOnItemClickListener(kVar);
            this.f28589e.setOnTouchListener(new di.q1(4, this, kVar));
            this.d.addView(this.f28589e, w7.x5.c(52.0f, -1));
            addView(this.d, w7.x5.a(-1.0f, 66.66f, 80));
            ky0 ky0Var = this.f28586c;
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
            ArrayList arrayList = this.f28594w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f28589e != null) {
            for (int i12 = 0; i12 < this.f28589e.getChildCount(); i12++) {
                this.f28589e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iy0 iy0Var = this.f28589e;
        if (iy0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f28588d0.f25592c;
        float f10 = this.f28587c0.f25592c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f28589e.getTranslationX() + (f10 - f11) + iy0Var.getPaddingLeft(), this.f28589e.getPaddingTop() + this.f28589e.getTop(), Math.min(this.f28589e.getTranslationX() + f10 + f11 + this.f28589e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f28589e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f28593s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        this.f28593s = false;
        this.v = true;
        ah.y yVar = this.d;
        if (yVar != null) {
            yVar.invalidate();
        }
    }

    public ky0 getDelegate() {
        return this.f28586c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f28593s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28582a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f28582a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(ky0 ky0Var) {
        this.f28586c = ky0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f28591n = i10;
    }
}

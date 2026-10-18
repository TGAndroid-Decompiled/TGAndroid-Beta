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
public class gz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public fr0 F;
    public int G;
    public String H;
    public int I;
    public String[] J;
    public Runnable K;
    public long L;
    public Path M;
    public Path N;
    public Paint O;
    public f6 P;
    public f6 Q;
    public f6 R;
    public f6 S;
    public Emoji.EmojiSpan T;
    public float U;
    public Integer V;
    public Integer W;
    public final int f26710a;
    public float f26711a0;
    public final org.telegram.ui.ActionBar.d6 f26712b;
    public f6 f26713b0;
    public ez0 f26714c;
    public f6 f26715c0;
    public ah.x d;
    public f6 f26716d0;
    public cz0 e;
    public dz0 f26717f;
    public int h;
    public int f26718n;
    public bz0 f26719r;
    public boolean f26720s;
    public boolean v;
    public ArrayList f26721w;
    public boolean f26722x;
    public boolean f26723y;

    public gz0(Context context, int i10, org.telegram.ui.hk hkVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f26718n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f26710a = i10;
        this.f26714c = hkVar;
        this.f26712b = d6Var;
        postDelayed(new gi.l2(i10, 11), 260L);
    }

    public static boolean a(gz0 gz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.gt.q().s(motionEvent, gz0Var.e, jVar, gz0Var.getPreviewDelegate(), gz0Var.f26712b);
    }

    public org.telegram.ui.et getPreviewDelegate() {
        if (this.f26719r == null) {
            this.f26719r = new bz0(this);
        }
        return this.f26719r;
    }

    public final void c() {
        if (this.e == null) {
            this.M = new Path();
            this.N = new Path();
            ah.x xVar = new ah.x(this, getContext(), 24);
            this.d = xVar;
            bs bsVar = bs.h;
            this.P = new f6(xVar, 120L, 350L, bsVar);
            this.Q = new f6(this.d, 150L, 600L, bsVar);
            new OvershootInterpolator(0.4f);
            this.R = new f6(this.d, 300L, bsVar);
            this.S = new f6(this.d, 300L, bsVar);
            this.f26713b0 = new f6(this.d, 200L, bsVar);
            this.f26715c0 = new f6(this.d, 350L, bsVar);
            this.f26716d0 = new f6(this.d, 350L, bsVar);
            cz0 cz0Var = new cz0(this, getContext());
            this.e = cz0Var;
            dz0 dz0Var = new dz0(this, this);
            this.f26717f = dz0Var;
            cz0Var.setAdapter(dz0Var);
            getContext();
            s4.b0 b0Var = new s4.b0();
            b0Var.j1(0);
            this.e.setLayoutManager(b0Var);
            s4.k kVar = new s4.k();
            kVar.n(45L);
            kVar.f46021o = bsVar;
            this.e.setItemAnimator(kVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, this.f26712b));
            cz0 cz0Var2 = this.e;
            j jVar = new j(this, 17);
            cz0Var2.setOnItemClickListener(jVar);
            this.e.setOnTouchListener(new ei.p1(4, this, jVar));
            this.d.addView(this.e, w7.z5.d(52.0f, -1));
            addView(this.d, w7.z5.b(-1.0f, 66.66f, 80));
            ez0 ez0Var = this.f26714c;
            if (ez0Var != null) {
                ez0Var.a(new ai.u(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f26721w;
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
        cz0 cz0Var = this.e;
        if (cz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f26716d0.f26100c;
        float f10 = this.f26715c0.f26100c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + cz0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f26720s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        fr0 fr0Var = this.F;
        if (fr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fr0Var);
        }
        fr0 fr0Var2 = new fr0(this, 11);
        this.F = fr0Var2;
        AndroidUtilities.runOnUIThread(fr0Var2, 16L);
    }

    public final void f() {
        fr0 fr0Var = this.F;
        if (fr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fr0Var);
            this.F = null;
        }
        this.f26720s = false;
        this.v = true;
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public ez0 getDelegate() {
        return this.f26714c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f26720s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26710a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26710a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(ez0 ez0Var) {
        this.f26714c = ez0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f26718n = i10;
    }
}

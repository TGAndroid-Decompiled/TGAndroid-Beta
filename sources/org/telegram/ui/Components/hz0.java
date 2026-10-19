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
public class hz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public gr0 F;
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
    public final int f26950a;
    public float f26951a0;
    public final org.telegram.ui.ActionBar.d6 f26952b;
    public f6 f26953b0;
    public fz0 f26954c;
    public f6 f26955c0;
    public ah.x d;
    public f6 f26956d0;
    public dz0 e;
    public ez0 f26957f;
    public int h;
    public int f26958n;
    public cz0 f26959r;
    public boolean f26960s;
    public boolean v;
    public ArrayList f26961w;
    public boolean f26962x;
    public boolean f26963y;

    public hz0(Context context, int i10, org.telegram.ui.fk fkVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f26958n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f26950a = i10;
        this.f26954c = fkVar;
        this.f26952b = d6Var;
        postDelayed(new gi.l2(i10, 11), 260L);
    }

    public static boolean a(hz0 hz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.et.q().s(motionEvent, hz0Var.e, jVar, hz0Var.getPreviewDelegate(), hz0Var.f26952b);
    }

    public org.telegram.ui.ct getPreviewDelegate() {
        if (this.f26959r == null) {
            this.f26959r = new cz0(this);
        }
        return this.f26959r;
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
            this.f26953b0 = new f6(this.d, 200L, bsVar);
            this.f26955c0 = new f6(this.d, 350L, bsVar);
            this.f26956d0 = new f6(this.d, 350L, bsVar);
            dz0 dz0Var = new dz0(this, getContext());
            this.e = dz0Var;
            ez0 ez0Var = new ez0(this, this);
            this.f26957f = ez0Var;
            dz0Var.setAdapter(ez0Var);
            getContext();
            s4.b0 b0Var = new s4.b0();
            b0Var.j1(0);
            this.e.setLayoutManager(b0Var);
            s4.k kVar = new s4.k();
            kVar.n(45L);
            kVar.f45973o = bsVar;
            this.e.setItemAnimator(kVar);
            this.e.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21078i6, this.f26952b));
            dz0 dz0Var2 = this.e;
            j jVar = new j(this, 17);
            dz0Var2.setOnItemClickListener(jVar);
            this.e.setOnTouchListener(new ei.p1(4, this, jVar));
            this.d.addView(this.e, w7.z5.c(52.0f, -1));
            addView(this.d, w7.z5.a(-1.0f, 66.66f, 80));
            fz0 fz0Var = this.f26954c;
            if (fz0Var != null) {
                fz0Var.a(new ai.u(this, 14));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f26961w;
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
        dz0 dz0Var = this.e;
        if (dz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f26956d0.f26110c;
        float f10 = this.f26955c0.f26110c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.e.getTranslationX() + (f10 - f11) + dz0Var.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f10 + f11 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f26960s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        gr0 gr0Var = this.F;
        if (gr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gr0Var);
        }
        gr0 gr0Var2 = new gr0(this, 11);
        this.F = gr0Var2;
        AndroidUtilities.runOnUIThread(gr0Var2, 16L);
    }

    public final void f() {
        gr0 gr0Var = this.F;
        if (gr0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(gr0Var);
            this.F = null;
        }
        this.f26960s = false;
        this.v = true;
        ah.x xVar = this.d;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public fz0 getDelegate() {
        return this.f26954c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f26960s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26950a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f26950a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(fz0 fz0Var) {
        this.f26954c = fz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f26958n = i10;
    }
}

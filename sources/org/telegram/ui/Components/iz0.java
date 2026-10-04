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
public class iz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public br0 F;
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
    public final int f27525a;
    public float f27526a0;
    public final org.telegram.ui.ActionBar.d6 f27527b;
    public e6 f27528b0;
    public gz0 f27529c;
    public e6 f27530c0;
    public ai.f0 d;
    public e6 f27531d0;
    public ez0 f27532e;
    public fz0 f27533f;
    public int h;
    public int f27534n;
    public dz0 f27535r;
    public boolean f27536s;
    public boolean v;
    public ArrayList f27537w;
    public boolean f27538x;
    public boolean f27539y;

    public iz0(Context context, int i10, org.telegram.ui.jk jkVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = 0;
        this.f27534n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f27525a = i10;
        this.f27529c = jkVar;
        this.f27527b = d6Var;
        postDelayed(new ei.s2(i10, 10), 260L);
    }

    public static boolean a(iz0 iz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.rt.q().s(motionEvent, iz0Var.f27532e, jVar, iz0Var.getPreviewDelegate(), iz0Var.f27527b);
    }

    public org.telegram.ui.pt getPreviewDelegate() {
        if (this.f27535r == null) {
            this.f27535r = new dz0(this);
        }
        return this.f27535r;
    }

    public final void c() {
        if (this.f27532e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 22);
            this.d = f0Var;
            tr trVar = tr.h;
            this.P = new e6(f0Var, 120L, 350L, trVar);
            this.Q = new e6(this.d, 150L, 600L, trVar);
            new OvershootInterpolator(0.4f);
            this.R = new e6(this.d, 300L, trVar);
            this.S = new e6(this.d, 300L, trVar);
            this.f27528b0 = new e6(this.d, 200L, trVar);
            this.f27530c0 = new e6(this.d, 350L, trVar);
            this.f27531d0 = new e6(this.d, 350L, trVar);
            ez0 ez0Var = new ez0(this, getContext());
            this.f27532e = ez0Var;
            fz0 fz0Var = new fz0(this, this);
            this.f27533f = fz0Var;
            ez0Var.setAdapter(fz0Var);
            getContext();
            s4.c0 c0Var = new s4.c0();
            c0Var.j1(0);
            this.f27532e.setLayoutManager(c0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f46589o = trVar;
            this.f27532e.setItemAnimator(jVar);
            this.f27532e.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20909i6, this.f27527b));
            ez0 ez0Var2 = this.f27532e;
            j jVar2 = new j(this, 17);
            ez0Var2.setOnItemClickListener(jVar2);
            this.f27532e.setOnTouchListener(new ci.q1(4, this, jVar2));
            this.d.addView(this.f27532e, w7.z5.c(52.0f, -1));
            addView(this.d, w7.z5.a(-1.0f, 66.66f, 80));
            gz0 gz0Var = this.f27529c;
            if (gz0Var != null) {
                gz0Var.a(new ci.i2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f27537w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f27532e != null) {
            for (int i12 = 0; i12 < this.f27532e.getChildCount(); i12++) {
                this.f27532e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ez0 ez0Var = this.f27532e;
        if (ez0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f27531d0.f25934c;
        float f10 = this.f27530c0.f25934c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f27532e.getTranslationX() + (f10 - f11) + ez0Var.getPaddingLeft(), this.f27532e.getPaddingTop() + this.f27532e.getTop(), Math.min(this.f27532e.getTranslationX() + f10 + f11 + this.f27532e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f27532e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f27536s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        br0 br0Var = this.F;
        if (br0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(br0Var);
        }
        br0 br0Var2 = new br0(this, 13);
        this.F = br0Var2;
        AndroidUtilities.runOnUIThread(br0Var2, 16L);
    }

    public final void f() {
        br0 br0Var = this.F;
        if (br0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(br0Var);
            this.F = null;
        }
        this.f27536s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public gz0 getDelegate() {
        return this.f27529c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f27536s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f27525a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f27525a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(gz0 gz0Var) {
        this.f27529c = gz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f27534n = i10;
    }
}

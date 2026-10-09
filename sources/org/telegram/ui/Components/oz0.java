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
public class oz0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public or0 F;
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
    public final int f29601a;
    public float f29602a0;
    public final org.telegram.ui.ActionBar.e6 f29603b;
    public g6 f29604b0;
    public mz0 f29605c;
    public g6 f29606c0;
    public ai.f0 d;
    public g6 f29607d0;
    public kz0 f29608e;
    public lz0 f29609f;
    public int h;
    public int f29610n;
    public jz0 f29611r;
    public boolean f29612s;
    public boolean v;
    public ArrayList f29613w;
    public boolean f29614x;
    public boolean f29615y;

    public oz0(Context context, int i10, org.telegram.ui.ok okVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = 0;
        this.f29610n = AndroidUtilities.dp(10.0f);
        this.L = 0L;
        this.f29601a = i10;
        this.f29605c = okVar;
        this.f29603b = e6Var;
        postDelayed(new ei.r2(i10, 11), 260L);
    }

    public static boolean a(oz0 oz0Var, j jVar, MotionEvent motionEvent) {
        return org.telegram.ui.rt.q().s(motionEvent, oz0Var.f29608e, jVar, oz0Var.getPreviewDelegate(), oz0Var.f29603b);
    }

    public org.telegram.ui.pt getPreviewDelegate() {
        if (this.f29611r == null) {
            this.f29611r = new jz0(this);
        }
        return this.f29611r;
    }

    public final void c() {
        if (this.f29608e == null) {
            this.M = new Path();
            this.N = new Path();
            ai.f0 f0Var = new ai.f0(this, getContext(), 21);
            this.d = f0Var;
            hs hsVar = hs.h;
            this.P = new g6(f0Var, 120L, 350L, hsVar);
            this.Q = new g6(this.d, 150L, 600L, hsVar);
            new OvershootInterpolator(0.4f);
            this.R = new g6(this.d, 300L, hsVar);
            this.S = new g6(this.d, 300L, hsVar);
            this.f29604b0 = new g6(this.d, 200L, hsVar);
            this.f29606c0 = new g6(this.d, 350L, hsVar);
            this.f29607d0 = new g6(this.d, 350L, hsVar);
            kz0 kz0Var = new kz0(this, getContext());
            this.f29608e = kz0Var;
            lz0 lz0Var = new lz0(this, this);
            this.f29609f = lz0Var;
            kz0Var.setAdapter(lz0Var);
            getContext();
            s4.d0 d0Var = new s4.d0();
            d0Var.j1(0);
            this.f29608e.setLayoutManager(d0Var);
            s4.j jVar = new s4.j();
            jVar.n(45L);
            jVar.f47716o = hsVar;
            this.f29608e.setItemAnimator(jVar);
            this.f29608e.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, this.f29603b));
            kz0 kz0Var2 = this.f29608e;
            j jVar2 = new j(this, 17);
            kz0Var2.setOnItemClickListener(jVar2);
            this.f29608e.setOnTouchListener(new ci.p1(4, this, jVar2));
            this.d.addView(this.f29608e, w7.x5.d(52.0f, -1));
            addView(this.d, w7.x5.b(-1.0f, 66.66f, 80));
            mz0 mz0Var = this.f29605c;
            if (mz0Var != null) {
                mz0Var.a(new ci.h2(this, 13));
            }
        }
    }

    public int d() {
        return 2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.f29613w;
            if (arrayList != null && !arrayList.isEmpty()) {
                e();
            }
        } else if (i10 == NotificationCenter.emojiLoaded && this.f29608e != null) {
            for (int i12 = 0; i12 < this.f29608e.getChildCount(); i12++) {
                this.f29608e.getChildAt(i12).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kz0 kz0Var = this.f29608e;
        if (kz0Var == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f7 = this.f29607d0.f26599c;
        float f10 = this.f29606c0.f26599c;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = f7 / 2.0f;
        rectF.set(this.f29608e.getTranslationX() + (f10 - f11) + kz0Var.getPaddingLeft(), this.f29608e.getPaddingTop() + this.f29608e.getTop(), Math.min(this.f29608e.getTranslationX() + f10 + f11 + this.f29608e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.f29608e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.f29612s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        or0 or0Var = this.F;
        if (or0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(or0Var);
        }
        or0 or0Var2 = new or0(this, 11);
        this.F = or0Var2;
        AndroidUtilities.runOnUIThread(or0Var2, 16L);
    }

    public final void f() {
        or0 or0Var = this.F;
        if (or0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(or0Var);
            this.F = null;
        }
        this.f29612s = false;
        this.v = true;
        ai.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public mz0 getDelegate() {
        return this.f29605c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.f29612s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f29601a).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.f29601a).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(mz0 mz0Var) {
        this.f29605c = mz0Var;
    }

    public void setDirection(int i10) {
        if (this.h != i10) {
            this.h = i10;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i10) {
        this.f29610n = i10;
    }
}

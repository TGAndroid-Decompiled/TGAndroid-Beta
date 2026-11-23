package org.telegram.ui.Components.voip;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k30;
public final class t0 extends LinearLayout {
    public final ArrayList f41231a;
    public RenderNode f41232b;
    public float f41233c;
    public k30 d;
    public Runnable f41234e;
    public int f41235f;
    public final oi.c2 h;

    public t0(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41231a = new ArrayList();
        this.h = new oi.c2(this, 18);
        setOrientation(1);
        setGravity(80);
        setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        setClipToPadding(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(320L);
        kr krVar = kr.h;
        layoutTransition.setInterpolator(4, krVar);
        layoutTransition.setInterpolator(0, krVar);
        layoutTransition.setInterpolator(1, krVar);
        Property property = View.ALPHA;
        layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat(property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.6f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.6f, 1.0f)));
        layoutTransition.setInterpolator(2, krVar);
        layoutTransition.setAnimator(3, ObjectAnimator.ofFloat((Object) null, property, 1.0f, 0.0f));
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(1, 0L);
        setLayoutTransition(layoutTransition);
    }

    public final void a(int i7, long j3, long j10, String str, boolean z10) {
        s0 s0Var;
        String str2;
        ArrayList arrayList = this.f41231a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                s0Var = (s0) obj;
                if (s0Var.f41210a == j10) {
                    break;
                }
            } else {
                s0Var = null;
                break;
            }
        }
        if (s0Var == null) {
            if (!str.trim().isEmpty()) {
                s0Var = new s0(this, getContext(), j10);
                TLObject g22 = mp.u1(i7).g2(j3);
                if (g22 instanceof TLRPC.User) {
                    str2 = n10.k((TLRPC.User) g22, true);
                } else if (g22 instanceof TLRPC.Chat) {
                    str2 = ((TLRPC.Chat) g22).title;
                } else {
                    str2 = "";
                }
                a9 a9Var = new a9((i6) null);
                a9Var.p(g22);
                s0Var.d.j0(g22, a9Var, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "  ");
                s0Var.f41219x = spannableStringBuilder.length();
                s0Var.f41213e.setText(spannableStringBuilder, TextView.BufferType.EDITABLE);
                arrayList.add(s0Var);
                addView(s0Var, na.k(0.0f, 6.0f, 0.0f, 0.0f, -1, -2));
                while (arrayList.size() > 3) {
                    View view = (s0) arrayList.get(0);
                    arrayList.remove(view);
                    removeView(view);
                }
            } else {
                return;
            }
        }
        s0Var.f41214f.e(s0Var.f41219x, -1, str.trim());
        s0Var.f41211b = z10;
        s0Var.f41212c = SystemClock.uptimeMillis();
        Runnable runnable = this.h;
        removeCallbacks(runnable);
        if (!arrayList.isEmpty()) {
            postDelayed(runnable, 500L);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float height = getHeight();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                height = Math.min(height, childAt.getY() - org.telegram.messenger.g0.L(6.0f));
            }
        }
        int max = Math.max(0, Math.round(getHeight() - height));
        if (max != this.f41235f) {
            this.f41235f = max;
            Runnable runnable = this.f41234e;
            if (runnable != null) {
                post(runnable);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public int getContentHeight() {
        return this.f41235f;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.h);
    }

    public void setOnContentHeightChanged(Runnable runnable) {
        this.f41234e = runnable;
    }
}

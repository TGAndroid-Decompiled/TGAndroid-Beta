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
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i30;
public final class t0 extends LinearLayout {
    public final ArrayList f40954a;
    public RenderNode f40955b;
    public float f40956c;
    public i30 d;
    public Runnable f40957e;
    public int f40958f;
    public final org.telegram.ui.ActionBar.r0 h;

    public t0(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f40954a = new ArrayList();
        this.h = new org.telegram.ui.ActionBar.r0(this, 15);
        setOrientation(1);
        setGravity(80);
        setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        setClipToPadding(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(320L);
        er erVar = er.h;
        layoutTransition.setInterpolator(4, erVar);
        layoutTransition.setInterpolator(0, erVar);
        layoutTransition.setInterpolator(1, erVar);
        Property property = View.ALPHA;
        layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat(property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.6f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.6f, 1.0f)));
        layoutTransition.setInterpolator(2, erVar);
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
        ArrayList arrayList = this.f40954a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                s0Var = (s0) obj;
                if (s0Var.f40933a == j10) {
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
                TLObject e22 = np.s1(i7).e2(j3);
                if (e22 instanceof TLRPC.User) {
                    str2 = q10.j((TLRPC.User) e22, true);
                } else if (e22 instanceof TLRPC.Chat) {
                    str2 = ((TLRPC.Chat) e22).title;
                } else {
                    str2 = "";
                }
                t8 t8Var = new t8((e6) null);
                t8Var.p(e22);
                s0Var.d.i0(e22, t8Var, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "  ");
                s0Var.f40942x = spannableStringBuilder.length();
                s0Var.f40936e.setText(spannableStringBuilder, TextView.BufferType.EDITABLE);
                arrayList.add(s0Var);
                addView(s0Var, ja.k(0.0f, 6.0f, 0.0f, 0.0f, -1, -2));
                while (arrayList.size() > 3) {
                    View view = (s0) arrayList.get(0);
                    arrayList.remove(view);
                    removeView(view);
                }
            } else {
                return;
            }
        }
        s0Var.f40937f.e(s0Var.f40942x, -1, str.trim());
        s0Var.f40934b = z10;
        s0Var.f40935c = SystemClock.uptimeMillis();
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
        if (max != this.f40958f) {
            this.f40958f = max;
            Runnable runnable = this.f40957e;
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
        return this.f40958f;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.h);
    }

    public void setOnContentHeightChanged(Runnable runnable) {
        this.f40957e = runnable;
    }
}

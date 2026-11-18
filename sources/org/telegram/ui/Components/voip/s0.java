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
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l30;
public final class s0 extends LinearLayout {
    public final ArrayList f41199a;
    public RenderNode f41200b;
    public float f41201c;
    public l30 d;
    public Runnable f41202e;
    public int f41203f;
    public final oi.a2 h;

    public s0(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41199a = new ArrayList();
        this.h = new oi.a2(this, 18);
        setOrientation(1);
        setGravity(80);
        setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
        setClipToPadding(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(320L);
        lr lrVar = lr.h;
        layoutTransition.setInterpolator(4, lrVar);
        layoutTransition.setInterpolator(0, lrVar);
        layoutTransition.setInterpolator(1, lrVar);
        Property property = View.ALPHA;
        layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat(property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_X, 0.6f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.6f, 1.0f)));
        layoutTransition.setInterpolator(2, lrVar);
        layoutTransition.setAnimator(3, ObjectAnimator.ofFloat((Object) null, property, 1.0f, 0.0f));
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(1, 0L);
        setLayoutTransition(layoutTransition);
    }

    public final void a(int i7, long j3, long j10, String str, boolean z10) {
        r0 r0Var;
        String str2;
        ArrayList arrayList = this.f41199a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                r0Var = (r0) obj;
                if (r0Var.f41178a == j10) {
                    break;
                }
            } else {
                r0Var = null;
                break;
            }
        }
        if (r0Var == null) {
            if (!str.trim().isEmpty()) {
                r0Var = new r0(this, getContext(), j10);
                TLObject g22 = mp.u1(i7).g2(j3);
                if (g22 instanceof TLRPC.User) {
                    str2 = o10.k((TLRPC.User) g22, true);
                } else if (g22 instanceof TLRPC.Chat) {
                    str2 = ((TLRPC.Chat) g22).title;
                } else {
                    str2 = "";
                }
                b9 b9Var = new b9((i6) null);
                b9Var.p(g22);
                r0Var.d.i0(g22, b9Var, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "  ");
                r0Var.f41187x = spannableStringBuilder.length();
                r0Var.f41181e.setText(spannableStringBuilder, TextView.BufferType.EDITABLE);
                arrayList.add(r0Var);
                addView(r0Var, ma.k(0.0f, 6.0f, 0.0f, 0.0f, -1, -2));
                while (arrayList.size() > 3) {
                    View view = (r0) arrayList.get(0);
                    arrayList.remove(view);
                    removeView(view);
                }
            } else {
                return;
            }
        }
        r0Var.f41182f.e(r0Var.f41187x, -1, str.trim());
        r0Var.f41179b = z10;
        r0Var.f41180c = SystemClock.uptimeMillis();
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
        if (max != this.f41203f) {
            this.f41203f = max;
            Runnable runnable = this.f41202e;
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
        return this.f41203f;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.h);
    }

    public void setOnContentHeightChanged(Runnable runnable) {
        this.f41202e = runnable;
    }
}

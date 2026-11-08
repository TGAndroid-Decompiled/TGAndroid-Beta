package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public ArrayList D;
    public final qe0 E;
    public final l9 f31437a;
    public final org.telegram.ui.ActionBar.k5 f31438b;
    public final TextView f31439c;
    public final TextView d;
    public final w8 f31440e;
    public final nu0 f31441f;
    public TLRPC.User h;
    public TLRPC.Chat f31442n;
    public CharSequence f31443r;
    public boolean f31444s;
    public int f31445w;
    public boolean f31446x;
    public float f31447y;

    public PollVotesAlert$UserCell(qe0 qe0Var, Context context) {
        super(context);
        this.E = qe0Var;
        this.f31447y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.f31440e = new w8((org.telegram.ui.ActionBar.f6) null);
        l9 l9Var = new l9(context);
        this.f31437a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(l9Var, c8.ha.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f31438b = k5Var;
        int i7 = org.telegram.ui.ActionBar.k6.f27960j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i7, null);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setGravity((org.telegram.messenger.id.f23157a0 ? 5 : 3) | 16);
        addView(k5Var, c8.ha.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f31439c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28110r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ha.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.ha.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f31441f = new nu0(20, k5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
    }

    public float getPlaceholderAlpha() {
        return this.f31447y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31441f.f36451a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f31441f.f36451a.b();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        int L;
        int L2;
        int L3;
        int L4;
        int i7;
        float f10 = 0.0f;
        if (this.f31446x || this.f31447y != 0.0f) {
            qe0 qe0Var = this.E;
            qe0Var.f37312x1.setAlpha((int) (this.f31447y * 255.0f));
            l9 l9Var = this.f31437a;
            canvas.drawCircle((l9Var.getMeasuredWidth() / 2) + l9Var.getLeft(), (l9Var.getMeasuredHeight() / 2) + l9Var.getTop(), l9Var.getMeasuredWidth() / 2, qe0Var.f37312x1);
            if (this.f31445w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.id.f23157a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            qe0Var.D1.set(L, measuredHeight - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(qe0Var.D1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), qe0Var.f37312x1);
            if (this.f31445w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.id.f23157a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            qe0Var.D1.set(L3, measuredHeight - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(qe0Var.D1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), qe0Var.f37312x1);
        }
        if (this.f31444s) {
            if (!org.telegram.messenger.id.f23157a0) {
                f10 = org.telegram.messenger.g0.L(64.0f);
            }
            float f11 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.f31444s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f31447y = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z9;
        nu0 nu0Var = this.f31441f;
        if (nu0Var != null) {
            try {
                g5 g5Var = nu0Var.f36451a;
                if (g5Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && g5Var.F != null) {
                    int i7 = org.telegram.ui.ActionBar.k6.z9;
                    qe0 qe0Var = this.E;
                    org.telegram.ui.Cells.o8 o8Var = qe0.I1;
                    g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i7, qe0Var.I0)));
                    org.telegram.ui.ActionBar.k5 k5Var = this.f31438b;
                    if (k5Var != null) {
                        k5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public ArrayList D;
    public final re0 E;
    public final l9 f31442a;
    public final org.telegram.ui.ActionBar.l5 f31443b;
    public final TextView f31444c;
    public final TextView d;
    public final w8 f31445e;
    public final pu0 f31446f;
    public TLRPC.User h;
    public TLRPC.Chat f31447n;
    public CharSequence f31448r;
    public boolean f31449s;
    public int f31450w;
    public boolean f31451x;
    public float f31452y;

    public PollVotesAlert$UserCell(re0 re0Var, Context context) {
        super(context);
        this.E = re0Var;
        this.f31452y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.f31445e = new w8((org.telegram.ui.ActionBar.g6) null);
        l9 l9Var = new l9(context);
        this.f31442a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(l9Var, c8.ha.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f31443b = l5Var;
        int i7 = org.telegram.ui.ActionBar.l6.f27973j5;
        org.telegram.ui.ActionBar.s6.X(l5Var, i7, null);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setTextSize(16);
        l5Var.setGravity((org.telegram.messenger.id.f23157a0 ? 5 : 3) | 16);
        addView(l5Var, c8.ha.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f31444c = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28123r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ha.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.ha.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f31446f = new pu0(20, l5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z9));
    }

    public float getPlaceholderAlpha() {
        return this.f31452y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31446f.f37095a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f31446f.f37095a.b();
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
        if (this.f31451x || this.f31452y != 0.0f) {
            re0 re0Var = this.E;
            re0Var.f37698x1.setAlpha((int) (this.f31452y * 255.0f));
            l9 l9Var = this.f31442a;
            canvas.drawCircle((l9Var.getMeasuredWidth() / 2) + l9Var.getLeft(), (l9Var.getMeasuredHeight() / 2) + l9Var.getTop(), l9Var.getMeasuredWidth() / 2, re0Var.f37698x1);
            if (this.f31450w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.id.f23157a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            re0Var.D1.set(L, measuredHeight - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(re0Var.D1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), re0Var.f37698x1);
            if (this.f31450w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.id.f23157a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            re0Var.D1.set(L3, measuredHeight - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(re0Var.D1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), re0Var.f37698x1);
        }
        if (this.f31449s) {
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
            canvas.drawLine(f11, measuredHeight2, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.f31449s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f31452y = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z9;
        pu0 pu0Var = this.f31446f;
        if (pu0Var != null) {
            try {
                g5 g5Var = pu0Var.f37095a;
                if (g5Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && g5Var.F != null) {
                    int i7 = org.telegram.ui.ActionBar.l6.z9;
                    re0 re0Var = this.E;
                    org.telegram.ui.Cells.o8 o8Var = re0.I1;
                    g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i7, re0Var.I0)));
                    org.telegram.ui.ActionBar.l5 l5Var = this.f31443b;
                    if (l5Var != null) {
                        l5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

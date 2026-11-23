package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public ArrayList E;
    public final ef0 F;
    public final p9 f33112a;
    public final org.telegram.ui.ActionBar.n5 f33113b;
    public final TextView f33114c;
    public final TextView d;
    public final a9 f33115e;
    public final zu0 f33116f;
    public TLRPC.User h;
    public TLRPC.Chat f33117n;
    public CharSequence f33118r;
    public boolean f33119s;
    public int f33120w;
    public boolean f33121x;
    public float f33122y;

    public PollVotesAlert$UserCell(ef0 ef0Var, Context context) {
        super(context);
        this.F = ef0Var;
        this.f33122y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.f33115e = new a9((org.telegram.ui.ActionBar.i6) null);
        p9 p9Var = new p9(context);
        this.f33112a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(p9Var, c8.na.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f33113b = n5Var;
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.X(n5Var, i7, null);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(16);
        n5Var.setGravity((org.telegram.messenger.gd.f24314a0 ? 5 : 3) | 16);
        addView(n5Var, c8.na.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f33114c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29709r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.na.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.na.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f33116f = new zu0(20, n5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29865z9));
    }

    public float getPlaceholderAlpha() {
        return this.f33122y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33116f.f43047a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f33116f.f43047a.b();
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
        if (this.f33121x || this.f33122y != 0.0f) {
            ef0 ef0Var = this.F;
            ef0Var.B1.setAlpha((int) (this.f33122y * 255.0f));
            p9 p9Var = this.f33112a;
            canvas.drawCircle((p9Var.getMeasuredWidth() / 2) + p9Var.getLeft(), (p9Var.getMeasuredHeight() / 2) + p9Var.getTop(), p9Var.getMeasuredWidth() / 2, ef0Var.B1);
            if (this.f33120w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.gd.f24314a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            ef0Var.H1.set(L, measuredHeight - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(ef0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), ef0Var.B1);
            if (this.f33120w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.gd.f24314a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            ef0Var.H1.set(L3, measuredHeight - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(ef0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), ef0Var.B1);
        }
        if (this.f33119s) {
            if (!org.telegram.messenger.gd.f24314a0) {
                f10 = org.telegram.messenger.g0.L(64.0f);
            }
            float f11 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24314a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.f33119s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f33122y = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        zu0 zu0Var = this.f33116f;
        if (zu0Var != null) {
            try {
                m5 m5Var = zu0Var.f43047a;
                if (m5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && m5Var.G != null) {
                    int i7 = org.telegram.ui.ActionBar.n6.f29865z9;
                    ef0 ef0Var = this.F;
                    org.telegram.ui.Cells.o8 o8Var = ef0.M1;
                    m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i7, ef0Var.J0)));
                    org.telegram.ui.ActionBar.n5 n5Var = this.f33113b;
                    if (n5Var != null) {
                        n5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

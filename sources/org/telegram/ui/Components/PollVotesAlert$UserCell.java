package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public ArrayList E;
    public final se0 F;
    public final k9 f31508a;
    public final org.telegram.ui.ActionBar.k5 f31509b;
    public final TextView f31510c;
    public final TextView d;
    public final u8 f31511e;
    public final mu0 f31512f;
    public TLRPC.User h;
    public TLRPC.Chat f31513n;
    public CharSequence f31514r;
    public boolean f31515s;
    public int f31516w;
    public boolean f31517x;
    public float f31518y;

    public PollVotesAlert$UserCell(se0 se0Var, Context context) {
        super(context);
        this.F = se0Var;
        this.f31518y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.f31511e = new u8((org.telegram.ui.ActionBar.e6) null);
        k9 k9Var = new k9(context);
        this.f31508a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(k9Var, b8.mf.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f31509b = k5Var;
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i3, null);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setGravity((org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 16);
        addView(k5Var, b8.mf.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f31510c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, b8.mf.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i3, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, b8.mf.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f31512f = new mu0(20, k5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28293z9));
    }

    public float getPlaceholderAlpha() {
        return this.f31518y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31512f.f36254a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f31512f.f36254a.b();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        int L;
        int L2;
        int L3;
        int L4;
        int i3;
        float f10 = 0.0f;
        if (this.f31517x || this.f31518y != 0.0f) {
            se0 se0Var = this.F;
            se0Var.f38002y1.setAlpha((int) (this.f31518y * 255.0f));
            k9 k9Var = this.f31508a;
            canvas.drawCircle((k9Var.getMeasuredWidth() / 2) + k9Var.getLeft(), (k9Var.getMeasuredHeight() / 2) + k9Var.getTop(), k9Var.getMeasuredWidth() / 2, se0Var.f38002y1);
            if (this.f31516w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.bd.f21784a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            se0Var.E1.set(L, measuredHeight - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(se0Var.E1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), se0Var.f38002y1);
            if (this.f31516w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.bd.f21784a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            se0Var.E1.set(L3, measuredHeight - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(se0Var.E1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), se0Var.f38002y1);
        }
        if (this.f31515s) {
            if (!org.telegram.messenger.bd.f21784a0) {
                f10 = org.telegram.messenger.g0.L(64.0f);
            }
            float f11 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.f31515s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f31518y = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        mu0 mu0Var = this.f31512f;
        if (mu0Var != null) {
            try {
                e5 e5Var = mu0Var.f36254a;
                if (e5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && e5Var.G != null) {
                    int i3 = org.telegram.ui.ActionBar.k6.f28293z9;
                    se0 se0Var = this.F;
                    org.telegram.ui.Cells.n8 n8Var = se0.J1;
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i3, se0Var.J0)));
                    org.telegram.ui.ActionBar.k5 k5Var = this.f31509b;
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

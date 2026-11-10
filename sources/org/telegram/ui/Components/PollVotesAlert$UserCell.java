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
    public ArrayList D;
    public final qe0 E;
    public final k9 f31453a;
    public final org.telegram.ui.ActionBar.m5 f31454b;
    public final TextView f31455c;
    public final TextView d;
    public final v8 f31456e;
    public final ou0 f31457f;
    public TLRPC.User h;
    public TLRPC.Chat f31458n;
    public CharSequence f31459r;
    public boolean f31460s;
    public int f31461w;
    public boolean f31462x;
    public float f31463y;

    public PollVotesAlert$UserCell(qe0 qe0Var, Context context) {
        super(context);
        this.E = qe0Var;
        this.f31463y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.f31456e = new v8((org.telegram.ui.ActionBar.h6) null);
        k9 k9Var = new k9(context);
        this.f31453a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(k9Var, c8.ha.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f31454b = m5Var;
        int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.X(m5Var, i7, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        m5Var.setGravity((org.telegram.messenger.id.f23161a0 ? 5 : 3) | 16);
        addView(m5Var, c8.ha.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f31455c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28148r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ha.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.ha.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f31457f = new ou0(20, m5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
    }

    public float getPlaceholderAlpha() {
        return this.f31463y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31457f.f36694a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f31457f.f36694a.b();
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
        if (this.f31462x || this.f31463y != 0.0f) {
            qe0 qe0Var = this.E;
            qe0Var.A1.setAlpha((int) (this.f31463y * 255.0f));
            k9 k9Var = this.f31453a;
            canvas.drawCircle((k9Var.getMeasuredWidth() / 2) + k9Var.getLeft(), (k9Var.getMeasuredHeight() / 2) + k9Var.getTop(), k9Var.getMeasuredWidth() / 2, qe0Var.A1);
            if (this.f31461w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.id.f23161a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            qe0Var.G1.set(L, measuredHeight - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(qe0Var.G1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), qe0Var.A1);
            if (this.f31461w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.id.f23161a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            qe0Var.G1.set(L3, measuredHeight - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(qe0Var.G1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), qe0Var.A1);
        }
        if (this.f31460s) {
            if (!org.telegram.messenger.id.f23161a0) {
                f10 = org.telegram.messenger.g0.L(64.0f);
            }
            float f11 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.f31460s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f31463y = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z9;
        ou0 ou0Var = this.f31457f;
        if (ou0Var != null) {
            try {
                f5 f5Var = ou0Var.f36694a;
                if (f5Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && f5Var.F != null) {
                    int i7 = org.telegram.ui.ActionBar.m6.z9;
                    qe0 qe0Var = this.E;
                    org.telegram.ui.Cells.o8 o8Var = qe0.L1;
                    f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i7, qe0Var.I0)));
                    org.telegram.ui.ActionBar.m5 m5Var = this.f31454b;
                    if (m5Var != null) {
                        m5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

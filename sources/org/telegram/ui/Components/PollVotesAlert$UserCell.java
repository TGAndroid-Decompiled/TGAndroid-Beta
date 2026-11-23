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
    public ArrayList E;
    public final ff0 F;
    public final q9 f33014a;
    public final org.telegram.ui.ActionBar.m5 f33015b;
    public final TextView f33016c;
    public final TextView d;
    public final b9 f33017e;
    public final av0 f33018f;
    public TLRPC.User h;
    public TLRPC.Chat f33019n;
    public CharSequence f33020r;
    public boolean f33021s;
    public int f33022w;
    public boolean f33023x;
    public float f33024y;

    public PollVotesAlert$UserCell(ff0 ff0Var, Context context) {
        super(context);
        this.F = ff0Var;
        this.f33024y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.f33017e = new b9((org.telegram.ui.ActionBar.h6) null);
        q9 q9Var = new q9(context);
        this.f33014a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(q9Var, c8.na.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f33015b = m5Var;
        int i7 = org.telegram.ui.ActionBar.m6.f29455j5;
        org.telegram.ui.ActionBar.t6.X(m5Var, i7, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        m5Var.setGravity((org.telegram.messenger.hd.f24408a0 ? 5 : 3) | 16);
        addView(m5Var, c8.na.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f33016c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29605r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.na.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.na.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f33018f = new av0(20, m5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29761z9));
    }

    public float getPlaceholderAlpha() {
        return this.f33024y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33018f.f33625a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f33018f.f33625a.b();
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
        if (this.f33023x || this.f33024y != 0.0f) {
            ff0 ff0Var = this.F;
            ff0Var.B1.setAlpha((int) (this.f33024y * 255.0f));
            q9 q9Var = this.f33014a;
            canvas.drawCircle((q9Var.getMeasuredWidth() / 2) + q9Var.getLeft(), (q9Var.getMeasuredHeight() / 2) + q9Var.getTop(), q9Var.getMeasuredWidth() / 2, ff0Var.B1);
            if (this.f33022w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.hd.f24408a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            ff0Var.H1.set(L, measuredHeight - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(ff0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), ff0Var.B1);
            if (this.f33022w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.hd.f24408a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            ff0Var.H1.set(L3, measuredHeight - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(ff0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), ff0Var.B1);
        }
        if (this.f33021s) {
            if (!org.telegram.messenger.hd.f24408a0) {
                f10 = org.telegram.messenger.g0.L(64.0f);
            }
            float f11 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.hd.f24408a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29470k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.f33021s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f33024y = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        av0 av0Var = this.f33018f;
        if (av0Var != null) {
            try {
                n5 n5Var = av0Var.f33625a;
                if (n5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && n5Var.G != null) {
                    int i7 = org.telegram.ui.ActionBar.m6.f29761z9;
                    ff0 ff0Var = this.F;
                    org.telegram.ui.Cells.p8 p8Var = ff0.M1;
                    n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i7, ff0Var.J0)));
                    org.telegram.ui.ActionBar.m5 m5Var = this.f33015b;
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

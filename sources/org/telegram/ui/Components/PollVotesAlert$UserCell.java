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
    public final df0 F;
    public final q9 f33012a;
    public final org.telegram.ui.ActionBar.n5 f33013b;
    public final TextView f33014c;
    public final TextView d;
    public final b9 f33015e;
    public final xu0 f33016f;
    public TLRPC.User h;
    public TLRPC.Chat f33017n;
    public CharSequence f33018r;
    public boolean f33019s;
    public int f33020w;
    public boolean f33021x;
    public float f33022y;

    public PollVotesAlert$UserCell(df0 df0Var, Context context) {
        super(context);
        this.F = df0Var;
        this.f33022y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.f33015e = new b9((org.telegram.ui.ActionBar.i6) null);
        q9 q9Var = new q9(context);
        this.f33012a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(q9Var, c8.ma.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f33013b = n5Var;
        int i7 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.X(n5Var, i7, null);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(16);
        n5Var.setGravity((org.telegram.messenger.gd.f24213a0 ? 5 : 3) | 16);
        addView(n5Var, c8.ma.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f33014c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29652r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ma.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.ma.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f33016f = new xu0(20, n5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29808z9));
    }

    public float getPlaceholderAlpha() {
        return this.f33022y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33016f.f42195a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f33016f.f42195a.b();
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
        if (this.f33021x || this.f33022y != 0.0f) {
            df0 df0Var = this.F;
            df0Var.B1.setAlpha((int) (this.f33022y * 255.0f));
            q9 q9Var = this.f33012a;
            canvas.drawCircle((q9Var.getMeasuredWidth() / 2) + q9Var.getLeft(), (q9Var.getMeasuredHeight() / 2) + q9Var.getTop(), q9Var.getMeasuredWidth() / 2, df0Var.B1);
            if (this.f33020w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.gd.f24213a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            df0Var.H1.set(L, measuredHeight - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(df0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), df0Var.B1);
            if (this.f33020w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.gd.f24213a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            df0Var.H1.set(L3, measuredHeight - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(df0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), df0Var.B1);
        }
        if (this.f33019s) {
            if (!org.telegram.messenger.gd.f24213a0) {
                f10 = org.telegram.messenger.g0.L(64.0f);
            }
            float f11 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24213a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.f33019s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f33022y = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        xu0 xu0Var = this.f33016f;
        if (xu0Var != null) {
            try {
                m5 m5Var = xu0Var.f42195a;
                if (m5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && m5Var.G != null) {
                    int i7 = org.telegram.ui.ActionBar.n6.f29808z9;
                    df0 df0Var = this.F;
                    org.telegram.ui.Cells.p8 p8Var = df0.M1;
                    m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i7, df0Var.J0)));
                    org.telegram.ui.ActionBar.n5 n5Var = this.f33013b;
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

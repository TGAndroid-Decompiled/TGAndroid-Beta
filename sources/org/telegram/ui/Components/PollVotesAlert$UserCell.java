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
    public final te0 F;
    public final i9 f32615a;
    public final org.telegram.ui.ActionBar.j5 f32616b;
    public final TextView f32617c;
    public final TextView d;
    public final t8 f32618e;
    public final pu0 f32619f;
    public TLRPC.User h;
    public TLRPC.Chat f32620n;
    public CharSequence f32621r;
    public boolean f32622s;
    public int f32623w;
    public boolean f32624x;
    public float f32625y;

    public PollVotesAlert$UserCell(te0 te0Var, Context context) {
        super(context);
        this.F = te0Var;
        this.f32625y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.f32618e = new t8((org.telegram.ui.ActionBar.e6) null);
        i9 i9Var = new i9(context);
        this.f32615a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(i9Var, c8.ja.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f32616b = j5Var;
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.X(j5Var, i7, null);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(16);
        j5Var.setGravity((org.telegram.messenger.hd.f24104a0 ? 5 : 3) | 16);
        addView(j5Var, c8.ja.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f32617c = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29107r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ja.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.ja.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f32619f = new pu0(20, j5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29263z9));
    }

    public float getPlaceholderAlpha() {
        return this.f32625y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32619f.f38413a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f32619f.f38413a.b();
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
        if (this.f32624x || this.f32625y != 0.0f) {
            te0 te0Var = this.F;
            te0Var.B1.setAlpha((int) (this.f32625y * 255.0f));
            i9 i9Var = this.f32615a;
            canvas.drawCircle((i9Var.getMeasuredWidth() / 2) + i9Var.getLeft(), (i9Var.getMeasuredHeight() / 2) + i9Var.getTop(), i9Var.getMeasuredWidth() / 2, te0Var.B1);
            if (this.f32623w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.hd.f24104a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            te0Var.H1.set(L, measuredHeight - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(te0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), te0Var.B1);
            if (this.f32623w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.hd.f24104a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            te0Var.H1.set(L3, measuredHeight - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(te0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), te0Var.B1);
        }
        if (this.f32622s) {
            if (!org.telegram.messenger.hd.f24104a0) {
                f10 = org.telegram.messenger.g0.L(64.0f);
            }
            float f11 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.hd.f24104a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.f32622s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f10) {
        this.f32625y = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        pu0 pu0Var = this.f32619f;
        if (pu0Var != null) {
            try {
                e5 e5Var = pu0Var.f38413a;
                if (e5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && e5Var.G != null) {
                    int i7 = org.telegram.ui.ActionBar.j6.f29263z9;
                    te0 te0Var = this.F;
                    org.telegram.ui.Cells.n8 n8Var = te0.M1;
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i7, te0Var.J0)));
                    org.telegram.ui.ActionBar.j5 j5Var = this.f32616b;
                    if (j5Var != null) {
                        j5Var.invalidate();
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

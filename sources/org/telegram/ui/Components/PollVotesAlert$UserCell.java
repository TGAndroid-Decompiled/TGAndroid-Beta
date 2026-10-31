package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public ArrayList D;
    public final tf0 E;
    public final g9 f24086a;
    public final org.telegram.ui.ActionBar.u5 f24087b;
    public final TextView f24088c;
    public final TextView d;
    public final r8 e;
    public final pv0 f24089f;
    public TLRPC.User h;
    public TLRPC.Chat f24090n;
    public CharSequence f24091r;
    public boolean f24092s;
    public int f24093w;
    public boolean f24094x;
    public float f24095y;

    public PollVotesAlert$UserCell(tf0 tf0Var, Context context) {
        super(context);
        this.E = tf0Var;
        this.f24095y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        this.e = new r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var = new g9(context);
        this.f24086a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
        addView(g9Var, w7.b6.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f24087b = u5Var;
        int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i10, null);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        u5Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        addView(u5Var, w7.b6.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f24088c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21185r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.b6.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i10, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.b6.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f24089f = new pv0(20, u5Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21333z9));
    }

    public float getPlaceholderAlpha() {
        return this.f24095y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24089f.f29441a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f24089f.f29441a.b();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        int L;
        int L2;
        int L3;
        int L4;
        int i10;
        float f7 = 0.0f;
        if (this.f24094x || this.f24095y != 0.0f) {
            tf0 tf0Var = this.E;
            tf0Var.f30567x1.setAlpha((int) (this.f24095y * 255.0f));
            g9 g9Var = this.f24086a;
            canvas.drawCircle((g9Var.getMeasuredWidth() / 2) + g9Var.getLeft(), (g9Var.getMeasuredHeight() / 2) + g9Var.getTop(), g9Var.getMeasuredWidth() / 2, tf0Var.f30567x1);
            if (this.f24093w % 2 == 0) {
                L = org.telegram.messenger.i0.L(65.0f);
                L2 = org.telegram.messenger.i0.L(48.0f);
            } else {
                L = org.telegram.messenger.i0.L(65.0f);
                L2 = org.telegram.messenger.i0.L(60.0f);
            }
            if (org.telegram.messenger.cd.X) {
                L = (getMeasuredWidth() - L) - L2;
            }
            tf0Var.D1.set(L, measuredHeight - org.telegram.messenger.i0.L(4.0f), L + L2, org.telegram.messenger.i0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(tf0Var.D1, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), tf0Var.f30567x1);
            if (this.f24093w % 2 == 0) {
                L3 = org.telegram.messenger.i0.L(119.0f);
                L4 = org.telegram.messenger.i0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.i0.L(131.0f);
                L4 = org.telegram.messenger.i0.L(80.0f);
            }
            if (org.telegram.messenger.cd.X) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            tf0Var.D1.set(L3, measuredHeight - org.telegram.messenger.i0.L(4.0f), L3 + L4, org.telegram.messenger.i0.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(tf0Var.D1, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), tf0Var.f30567x1);
        }
        if (this.f24092s) {
            if (!org.telegram.messenger.cd.X) {
                f7 = org.telegram.messenger.i0.L(64.0f);
            }
            float f10 = f7;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.cd.X) {
                i10 = org.telegram.messenger.i0.L(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f10, measuredHeight2, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f) + (this.f24092s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f7) {
        this.f24095y = f7;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z10;
        pv0 pv0Var = this.f24089f;
        if (pv0Var != null) {
            try {
                d5 d5Var = pv0Var.f29441a;
                if (d5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && d5Var.F != null) {
                    int i10 = org.telegram.ui.ActionBar.t6.f21333z9;
                    tf0 tf0Var = this.E;
                    mh.g gVar = tf0.I1;
                    d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i10, tf0Var.I0)));
                    org.telegram.ui.ActionBar.u5 u5Var = this.f24087b;
                    if (u5Var != null) {
                        u5Var.invalidate();
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}

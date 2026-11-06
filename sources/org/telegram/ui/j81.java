package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j81 extends org.telegram.ui.Components.oj0 {
    public int f46900c;
    public int d;
    public int f46901e;
    public int f46902f;
    public int h;
    public int f46903n;
    public final m81 f46904r;

    public j81(m81 m81Var) {
        this.f46904r = m81Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.b() >= this.f46902f && d1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f46901e = -1;
        this.f46902f = -1;
        this.h = -1;
        this.f46903n = -1;
        this.f46900c = 2;
        this.d = 1;
        ArrayList arrayList = this.f46904r.f47730f;
        if (!arrayList.isEmpty()) {
            int i7 = this.f46900c;
            int i10 = i7 + 1;
            this.f46901e = i7;
            int i11 = i7 + 2;
            this.f46900c = i11;
            this.f46902f = i10;
            int size = (arrayList.size() - 1) + i11;
            this.h = size;
            this.f46900c = size + 1;
            this.f46903n = size;
        }
    }

    @Override
    public final int b() {
        return this.f46900c;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == this.d) {
            return 2;
        }
        if (i7 == this.f46901e) {
            return 3;
        }
        if (i7 == this.f46903n) {
            return 5;
        }
        return 4;
    }

    @Override
    public final void f() {
        E();
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.f56952a;
        int i10 = this.f46901e;
        m81 m81Var = this.f46904r;
        if (i7 >= i10 && i10 > 0) {
            view.setAlpha(m81Var.E);
        } else {
            view.setAlpha(1.0f);
        }
        if (d(i7) == 4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            TLRPC.Chat chat = (TLRPC.Chat) m81Var.f47730f.get(i7 - this.f46902f);
            String str = (String) m81Var.h.get(i7 - this.f46902f);
            String str2 = chat.title;
            boolean z9 = true;
            if (i7 == this.h - 1) {
                z9 = false;
            }
            h4Var.e(chat, str2, str, z9);
            h4Var.c(m81Var.f47735x.contains(Long.valueOf(chat.f26952id)), false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        String M0;
        org.telegram.ui.Cells.n4 n4Var;
        org.telegram.ui.Cells.h4 h4Var;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 5) {
                        h4Var = new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        h4Var = new org.telegram.ui.Cells.m3(viewGroup.getContext(), org.telegram.messenger.g0.L(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 8, false, null);
                    n4Var2.setHeight(54);
                    n4Var2.setText(org.telegram.messenger.hd.M0(2131749209, null));
                    n4Var = n4Var2;
                }
            } else {
                View y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = org.telegram.ui.ActionBar.k6.Y0(viewGroup.getContext(), 2131231229, org.telegram.ui.ActionBar.k6.f27812b7);
                int i10 = org.telegram.ui.ActionBar.k6.f27792a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, Y0);
                xpVar.f40324x = true;
                y6Var.setBackground(xpVar);
                org.telegram.ui.ActionBar.r6.y(y6Var, colorDrawable, i10, null, PorterDuff.Mode.SRC_IN);
                h4Var = y6Var;
            }
            n4Var = h4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.k6.f28016m9;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.k5.n(textView, i11, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f29293a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27906g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            bi.s1 s1Var = new bi.s1(context, new Paint(1), textPaint);
            s1Var.setWillNotDraw(false);
            s1Var.addView(imageView, c8.ha.e(-2, -2, 1));
            frameLayout.addView(s1Var, c8.ha.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.hd.M0(2131744041, null));
            imageView.setImageResource(2131231234);
            m81 m81Var = this.f46904r;
            m81Var.f47736y = frameLayout;
            int i12 = m81Var.G;
            if (i12 == 0) {
                M0 = org.telegram.messenger.hd.M0(2131744038, null);
            } else if (i12 == 1) {
                M0 = org.telegram.messenger.hd.M0(2131744039, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131744040, null);
            }
            m81Var.f47736y.setMessageText(M0);
            v4.o0 o0Var = new v4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.g0.L(23.0f);
            m81Var.f47736y.setLayoutParams(o0Var);
            n4Var = frameLayout;
        }
        return new v4.d1(n4Var);
    }
}

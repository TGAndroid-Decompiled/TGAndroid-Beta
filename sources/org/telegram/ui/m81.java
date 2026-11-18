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
public final class m81 extends org.telegram.ui.Components.bk0 {
    public int f49805c;
    public int d;
    public int f49806e;
    public int f49807f;
    public int h;
    public int f49808n;
    public final p81 f49809r;

    public m81(p81 p81Var) {
        this.f49809r = p81Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.b() >= this.f49807f && f1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f49806e = -1;
        this.f49807f = -1;
        this.h = -1;
        this.f49808n = -1;
        this.f49805c = 2;
        this.d = 1;
        ArrayList arrayList = this.f49809r.f50819f;
        if (!arrayList.isEmpty()) {
            int i7 = this.f49805c;
            int i10 = i7 + 1;
            this.f49806e = i7;
            int i11 = i7 + 2;
            this.f49805c = i11;
            this.f49807f = i10;
            int size = (arrayList.size() - 1) + i11;
            this.h = size;
            this.f49805c = size + 1;
            this.f49808n = size;
        }
    }

    @Override
    public final int b() {
        return this.f49805c;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == this.d) {
            return 2;
        }
        if (i7 == this.f49806e) {
            return 3;
        }
        if (i7 == this.f49808n) {
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
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.f59122a;
        int i10 = this.f49806e;
        p81 p81Var = this.f49809r;
        if (i7 >= i10 && i10 > 0) {
            view.setAlpha(p81Var.F);
        } else {
            view.setAlpha(1.0f);
        }
        if (d(i7) == 4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            TLRPC.Chat chat = (TLRPC.Chat) p81Var.f50819f.get(i7 - this.f49807f);
            String str = (String) p81Var.h.get(i7 - this.f49807f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i7 == this.h - 1) {
                z10 = false;
            }
            h4Var.e(chat, str2, str, z10);
            h4Var.c(p81Var.f50824x.contains(Long.valueOf(chat.f28405id)), false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
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
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(viewGroup.getContext(), org.telegram.ui.ActionBar.n6.L6, 21, 8, false, null);
                    n4Var2.setHeight(54);
                    n4Var2.setText(org.telegram.messenger.gd.M0(2131749018, null));
                    n4Var = n4Var2;
                }
            } else {
                View y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                Drawable Y0 = org.telegram.ui.ActionBar.n6.Y0(viewGroup.getContext(), 2131231229, org.telegram.ui.ActionBar.n6.f29360b7);
                int i10 = org.telegram.ui.ActionBar.n6.f29339a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(colorDrawable, Y0);
                mqVar.f37616x = true;
                y6Var.setBackground(mqVar);
                org.telegram.ui.ActionBar.u6.x(y6Var, colorDrawable, i10, null, PorterDuff.Mode.SRC_IN);
                h4Var = y6Var;
            }
            n4Var = h4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.n6.f29564m9;
            org.telegram.ui.ActionBar.u6.s(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.f3.l(textView, i11, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f30839a = textView2;
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29454g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, c8.ma.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            di.d1 d1Var = new di.d1(context, new Paint(1), textPaint);
            d1Var.setWillNotDraw(false);
            d1Var.addView(imageView, c8.ma.e(-2, -2, 1));
            frameLayout.addView(d1Var, c8.ma.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.gd.M0(2131743805, null));
            imageView.setImageResource(2131231234);
            p81 p81Var = this.f49809r;
            p81Var.f50825y = frameLayout;
            int i12 = p81Var.H;
            if (i12 == 0) {
                M0 = org.telegram.messenger.gd.M0(2131743802, null);
            } else if (i12 == 1) {
                M0 = org.telegram.messenger.gd.M0(2131743803, null);
            } else {
                M0 = org.telegram.messenger.gd.M0(2131743804, null);
            }
            p81Var.f50825y.setMessageText(M0);
            v4.q0 q0Var = new v4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(23.0f);
            p81Var.f50825y.setLayoutParams(q0Var);
            n4Var = frameLayout;
        }
        return new v4.f1(n4Var);
    }
}

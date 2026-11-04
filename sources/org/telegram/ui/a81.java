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
public final class a81 extends org.telegram.ui.Components.sj0 {
    public int f43684c;
    public int d;
    public int f43685e;
    public int f43686f;
    public int h;
    public int f43687n;
    public final d81 f43688r;

    public a81(d81 d81Var) {
        this.f43688r = d81Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.b() >= this.f43686f && d1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f43685e = -1;
        this.f43686f = -1;
        this.h = -1;
        this.f43687n = -1;
        this.f43684c = 2;
        this.d = 1;
        ArrayList arrayList = this.f43688r.f44597f;
        if (!arrayList.isEmpty()) {
            int i3 = this.f43684c;
            int i10 = i3 + 1;
            this.f43685e = i3;
            int i11 = i3 + 2;
            this.f43684c = i11;
            this.f43686f = i10;
            int size = (arrayList.size() - 1) + i11;
            this.h = size;
            this.f43684c = size + 1;
            this.f43687n = size;
        }
    }

    @Override
    public final int b() {
        return this.f43684c;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == this.d) {
            return 2;
        }
        if (i3 == this.f43685e) {
            return 3;
        }
        if (i3 == this.f43687n) {
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
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.f55540a;
        int i10 = this.f43685e;
        d81 d81Var = this.f43688r;
        if (i3 >= i10 && i10 > 0) {
            view.setAlpha(d81Var.F);
        } else {
            view.setAlpha(1.0f);
        }
        if (d(i3) == 4) {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            TLRPC.Chat chat = (TLRPC.Chat) d81Var.f44597f.get(i3 - this.f43686f);
            String str = (String) d81Var.h.get(i3 - this.f43686f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i3 == this.h - 1) {
                z10 = false;
            }
            h4Var.e(chat, str2, str, z10);
            h4Var.c(d81Var.f44602x.contains(Long.valueOf(chat.f27001id)), false);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        String M0;
        org.telegram.ui.Cells.n4 n4Var;
        org.telegram.ui.Cells.h4 h4Var;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        h4Var = new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        h4Var = new org.telegram.ui.Cells.m3(viewGroup.getContext(), org.telegram.messenger.g0.L(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 8, false, null);
                    n4Var2.setHeight(54);
                    n4Var2.setText(org.telegram.messenger.bd.M0(2131749218, null));
                    n4Var = n4Var2;
                }
            } else {
                View x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = org.telegram.ui.ActionBar.k6.Y0(viewGroup.getContext(), 2131231229, org.telegram.ui.ActionBar.k6.f27843b7);
                int i10 = org.telegram.ui.ActionBar.k6.f27824a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, Y0);
                xpVar.f40447x = true;
                x6Var.setBackground(xpVar);
                org.telegram.ui.ActionBar.r6.y(x6Var, colorDrawable, i10, null, PorterDuff.Mode.SRC_IN);
                h4Var = x6Var;
            }
            n4Var = h4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.k6.f28046m9;
            org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.k5.n(textView, i11, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f29363a = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27939g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, b8.mf.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            ci.l1 l1Var = new ci.l1(context, new Paint(1), textPaint);
            l1Var.setWillNotDraw(false);
            l1Var.addView(imageView, b8.mf.e(-2, -2, 1));
            frameLayout.addView(l1Var, b8.mf.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.bd.M0(2131744050, null));
            imageView.setImageResource(2131231234);
            d81 d81Var = this.f43688r;
            d81Var.f44603y = frameLayout;
            int i12 = d81Var.H;
            if (i12 == 0) {
                M0 = org.telegram.messenger.bd.M0(2131744047, null);
            } else if (i12 == 1) {
                M0 = org.telegram.messenger.bd.M0(2131744048, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131744049, null);
            }
            d81Var.f44603y.setMessageText(M0);
            u4.p0 p0Var = new u4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = org.telegram.messenger.g0.L(23.0f);
            d81Var.f44603y.setLayoutParams(p0Var);
            n4Var = frameLayout;
        }
        return new u4.d1(n4Var);
    }
}

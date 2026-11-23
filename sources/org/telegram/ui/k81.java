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
public final class k81 extends org.telegram.ui.Components.dk0 {
    public int f49368c;
    public int d;
    public int f49369e;
    public int f49370f;
    public int h;
    public int f49371n;
    public final n81 f49372r;

    public k81(n81 n81Var) {
        this.f49372r = n81Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.b() >= this.f49370f && f1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f49369e = -1;
        this.f49370f = -1;
        this.h = -1;
        this.f49371n = -1;
        this.f49368c = 2;
        this.d = 1;
        ArrayList arrayList = this.f49372r.f50265f;
        if (!arrayList.isEmpty()) {
            int i7 = this.f49368c;
            int i10 = i7 + 1;
            this.f49369e = i7;
            int i11 = i7 + 2;
            this.f49368c = i11;
            this.f49370f = i10;
            int size = (arrayList.size() - 1) + i11;
            this.h = size;
            this.f49368c = size + 1;
            this.f49371n = size;
        }
    }

    @Override
    public final int b() {
        return this.f49368c;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == this.d) {
            return 2;
        }
        if (i7 == this.f49369e) {
            return 3;
        }
        if (i7 == this.f49371n) {
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
        View view = f1Var.f59245a;
        int i10 = this.f49369e;
        n81 n81Var = this.f49372r;
        if (i7 >= i10 && i10 > 0) {
            view.setAlpha(n81Var.F);
        } else {
            view.setAlpha(1.0f);
        }
        if (d(i7) == 4) {
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            TLRPC.Chat chat = (TLRPC.Chat) n81Var.f50265f.get(i7 - this.f49370f);
            String str = (String) n81Var.h.get(i7 - this.f49370f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i7 == this.h - 1) {
                z10 = false;
            }
            i4Var.e(chat, str2, str, z10);
            i4Var.c(n81Var.f50270x.contains(Long.valueOf(chat.f28492id)), false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        String N0;
        org.telegram.ui.Cells.o4 o4Var;
        org.telegram.ui.Cells.i4 i4Var;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 5) {
                        i4Var = new org.telegram.ui.Cells.i4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        i4Var = new org.telegram.ui.Cells.n3(viewGroup.getContext(), org.telegram.messenger.g0.L(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(viewGroup.getContext(), org.telegram.ui.ActionBar.n6.L6, 21, 8, false, null);
                    o4Var2.setHeight(54);
                    o4Var2.setText(org.telegram.messenger.gd.N0(2131749017, null));
                    o4Var = o4Var2;
                }
            } else {
                View y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
                Drawable Y0 = org.telegram.ui.ActionBar.n6.Y0(viewGroup.getContext(), 2131231232, org.telegram.ui.ActionBar.n6.f29415b7);
                int i10 = org.telegram.ui.ActionBar.n6.f29394a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(colorDrawable, Y0);
                lqVar.f37204x = true;
                y6Var.setBackground(lqVar);
                org.telegram.ui.ActionBar.u6.x(y6Var, colorDrawable, i10, null, PorterDuff.Mode.SRC_IN);
                i4Var = y6Var;
            }
            o4Var = i4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.n6.f29619m9;
            org.telegram.ui.ActionBar.u6.s(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.f3.l(textView, i11, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, c8.na.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f31042a = textView2;
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29509g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, c8.na.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            di.d1 d1Var = new di.d1(context, new Paint(1), textPaint);
            d1Var.setWillNotDraw(false);
            d1Var.addView(imageView, c8.na.e(-2, -2, 1));
            frameLayout.addView(d1Var, c8.na.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(org.telegram.messenger.gd.N0(2131743795, null));
            imageView.setImageResource(2131231237);
            n81 n81Var = this.f49372r;
            n81Var.f50271y = frameLayout;
            int i12 = n81Var.H;
            if (i12 == 0) {
                N0 = org.telegram.messenger.gd.N0(2131743792, null);
            } else if (i12 == 1) {
                N0 = org.telegram.messenger.gd.N0(2131743793, null);
            } else {
                N0 = org.telegram.messenger.gd.N0(2131743794, null);
            }
            n81Var.f50271y.setMessageText(N0);
            v4.q0 q0Var = new v4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = org.telegram.messenger.g0.L(23.0f);
            n81Var.f50271y.setLayoutParams(q0Var);
            o4Var = frameLayout;
        }
        return new v4.f1(o4Var);
    }
}

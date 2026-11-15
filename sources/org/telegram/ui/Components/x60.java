package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class x60 extends org.telegram.ui.ActionBar.u2 {
    public boolean f41599m1;

    public x60(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.f29720w0 = false;
        this.f29718v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.O = f10;
        i9 i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        f10.addView(i9Var, c8.ja.t(90, 90, 49, 0, 29, 0, 0));
        i9Var.f(chat, new t8(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
        textView.setGravity(1);
        TextView f11 = org.telegram.messenger.i20.f(f10, textView, c8.ja.t(-2, -2, 49, 17, 24, 17, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(f11, org.telegram.ui.ActionBar.j6.f29107r5, null);
        f11.setGravity(1);
        f10.addView(f11, c8.ja.t(-2, -2, 49, 30, 8, 30, 0));
        org.telegram.messenger.r3 g12 = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(this.f29679a).f22782a).g1(chat.f28051id, false, null);
        if (g12 != null) {
            if (TextUtils.isEmpty(g12.f26216b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(g12.f26216b.title);
            }
            int i7 = g12.f26216b.participants_count;
            if (i7 == 0) {
                f11.setText(org.telegram.messenger.hd.M0(2131748186, null));
            } else {
                f11.setText(org.telegram.messenger.hd.G(i7, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            f11.setText(org.telegram.messenger.hd.M0(2131748186, null));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        frameLayout.f41295a = view;
        view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
        frameLayout.addView(view, c8.ja.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f41296b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.Ji, null, 1, 14.0f);
        frameLayout.addView(textView2, c8.ja.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (org.telegram.messenger.t3.W(chat)) {
            frameLayout.setText(org.telegram.messenger.hd.M0(2131743475, null));
        } else {
            frameLayout.setText(org.telegram.messenger.hd.M0(2131743365, null));
        }
        view.setOnClickListener(new e0(this, 29));
        f10.addView((View) frameLayout, c8.ja.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void I0();

    @Override
    public final void L() {
        super.L();
        if (this.f41599m1) {
            I0();
        }
    }
}

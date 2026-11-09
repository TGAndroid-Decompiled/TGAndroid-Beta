package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class w60 extends org.telegram.ui.ActionBar.v2 {
    public boolean f39946i1;

    public w60(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.f28656v0 = false;
        this.f28655u0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.N = f10;
        l9 l9Var = new l9(context);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        f10.addView(l9Var, c8.ha.t(90, 90, 49, 0, 29, 0, 0));
        l9Var.e(chat, new w8(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, null);
        textView.setGravity(1);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.t(-2, -2, 49, 17, 24, 17, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(f11, org.telegram.ui.ActionBar.l6.f28123r5, null);
        f11.setGravity(1);
        f10.addView(f11, c8.ha.t(-2, -2, 49, 30, 8, 30, 0));
        org.telegram.messenger.r3 g12 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(this.f28621a).f21765a).g1(chat.f26956id, false, null);
        if (g12 != null) {
            if (TextUtils.isEmpty(g12.f25222b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(g12.f25222b.title);
            }
            int i7 = g12.f25222b.participants_count;
            if (i7 == 0) {
                f11.setText(org.telegram.messenger.id.M0(2131748186, null));
            } else {
                f11.setText(org.telegram.messenger.id.G(i7, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            f11.setText(org.telegram.messenger.id.M0(2131748186, null));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        frameLayout.f38958a = view;
        view.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 4.0f));
        frameLayout.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f38959b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.l6.Gi, null, 1, 14.0f);
        frameLayout.addView(textView2, c8.ha.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (org.telegram.messenger.t3.W(chat)) {
            frameLayout.setText(org.telegram.messenger.id.M0(2131743475, null));
        } else {
            frameLayout.setText(org.telegram.messenger.id.M0(2131743365, null));
        }
        view.setOnClickListener(new h0(this, 28));
        f10.addView((View) frameLayout, c8.ha.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void I0();

    @Override
    public final void K() {
        super.K();
        if (this.f39946i1) {
            I0();
        }
    }
}

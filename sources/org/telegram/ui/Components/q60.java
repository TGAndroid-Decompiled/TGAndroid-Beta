package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class q60 extends org.telegram.ui.ActionBar.t2 {
    public boolean f37358j1;

    public q60(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.f28621w0 = false;
        this.f28619v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.O = f10;
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        f10.addView(k9Var, b8.mf.t(90, 90, 49, 0, 29, 0, 0));
        k9Var.e(chat, new u8(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
        textView.setGravity(1);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, b8.mf.t(-2, -2, 49, 17, 24, 17, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.r5, null);
        f11.setGravity(1);
        f10.addView(f11, b8.mf.t(-2, -2, 49, 30, 8, 30, 0));
        org.telegram.messenger.r3 g12 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(this.f28583a).f21919a).g1(chat.f27001id, false, null);
        if (g12 != null) {
            if (TextUtils.isEmpty(g12.f25049b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(g12.f25049b.title);
            }
            int i3 = g12.f25049b.participants_count;
            if (i3 == 0) {
                f11.setText(org.telegram.messenger.bd.M0(2131748194, null));
            } else {
                f11.setText(org.telegram.messenger.bd.G(i3, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            f11.setText(org.telegram.messenger.bd.M0(2131748194, null));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        frameLayout.f37071a = view;
        view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
        frameLayout.addView(view, b8.mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f37072b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
        frameLayout.addView(textView2, b8.mf.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (org.telegram.messenger.t3.W(chat)) {
            frameLayout.setText(org.telegram.messenger.bd.M0(2131743485, null));
        } else {
            frameLayout.setText(org.telegram.messenger.bd.M0(2131743375, null));
        }
        view.setOnClickListener(new f0(this, 28));
        f10.addView((View) frameLayout, b8.mf.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void I0();

    @Override
    public final void K() {
        super.K();
        if (this.f37358j1) {
            I0();
        }
    }
}

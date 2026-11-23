package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public abstract class l70 extends org.telegram.ui.ActionBar.w2 {
    public boolean f37145m1;

    public l70(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.f30214w0 = false;
        this.f30212v0 = false;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        this.O = g10;
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        g10.addView(q9Var, c8.ma.t(90, 90, 49, 0, 29, 0, 0));
        q9Var.f(chat, new b9(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.o10.p(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, null);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.o10.f(g10, textView, c8.ma.t(-2, -2, 49, 17, 24, 17, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(f10, org.telegram.ui.ActionBar.m6.f29639r5, null);
        f10.setGravity(1);
        g10.addView(f10, c8.ma.t(-2, -2, 49, 30, 8, 30, 0));
        org.telegram.messenger.t3 i12 = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(this.f30173a).f23202a).i1(chat.f28434id, false, null);
        if (i12 != null) {
            if (TextUtils.isEmpty(i12.f26950b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(i12.f26950b.title);
            }
            int i7 = i12.f26950b.participants_count;
            if (i7 == 0) {
                f10.setText(org.telegram.messenger.hd.N0(2131747993, null));
            } else {
                f10.setText(org.telegram.messenger.hd.G(i7, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            f10.setText(org.telegram.messenger.hd.N0(2131747993, null));
        }
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        frameLayout.f36845a = view;
        view.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
        frameLayout.addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        frameLayout.f36846b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.m6.Ji, null, 1, 14.0f);
        frameLayout.addView(textView2, c8.ma.e(-2, -2, 17));
        frameLayout.setBackground(null);
        if (org.telegram.messenger.v3.W(chat)) {
            frameLayout.setText(org.telegram.messenger.hd.N0(2131743230, null));
        } else {
            frameLayout.setText(org.telegram.messenger.hd.N0(2131743120, null));
        }
        view.setOnClickListener(new j70(this, 0));
        g10.addView((View) frameLayout, c8.ma.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void J0();

    @Override
    public final void L() {
        super.L();
        if (this.f37145m1) {
            J0();
        }
    }
}

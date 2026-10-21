package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ef extends sp0 {
    public final ChatActivityEnterView H;

    public ef(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.qn qnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.u2 u2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f21576b = true;
        this.f21577c = 150;
        this.f21578f = -1L;
        this.f21581j = new AnimationNotificationsLocker();
        e();
        this.f30339z = new ArrayList();
        this.G = new ArrayList();
        this.f30332r = peer;
        this.f30333s = tL_channels_sendAsPeers;
        ah.x xVar = new ah.x(this, context, 21);
        this.f30334t = xVar;
        xVar.setLayoutParams(w7.z5.c(-2.0f, -2));
        setContentView(xVar);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var), PorterDuff.Mode.MULTIPLY));
        xVar.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        xVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (qnVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = qnVar.X0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        mp0 mp0Var = new mp0(context, i10, dp);
        this.f30329o = mp0Var;
        mp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f30330p = textView;
        org.telegram.messenger.mk.o(org.telegram.ui.ActionBar.h6.f21152m5, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        mp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        jm0 jm0Var = new jm0(context, null);
        this.v = jm0Var;
        s4.b0 b0Var = new s4.b0();
        this.f30336w = b0Var;
        jm0Var.setLayoutManager(b0Var);
        jm0Var.setAdapter(new np0(d6Var, arrayList, messagesController, i10, peer));
        jm0Var.j(new op0(this));
        jm0Var.setOnItemClickListener(new xl0() {
            @Override
            public final void a(int i11, View view) {
                sp0.k(ef.this, arrayList, context, qnVar, z10, u2Var, view, i11);
            }
        });
        jm0Var.setOverScrollMode(2);
        frameLayout.addView(jm0Var);
        View view = new View(context);
        this.f30335u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.z5.c(4.0f, -1));
        mp0Var.addView(frameLayout, w7.z5.c(-2.0f, -1));
        xVar.addView(mp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f30339z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f24003q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f24003q0 = null;
        int i10 = 0;
        if (!this.f30331q) {
            l(new o1.k[0]);
            chatActivityEnterView.f23998p0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        arrayList.clear();
        super.dismiss();
    }
}

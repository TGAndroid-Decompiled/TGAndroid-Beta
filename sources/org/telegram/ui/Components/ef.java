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
public final class ef extends rp0 {
    public final ChatActivityEnterView H;

    public ef(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.qn qnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.u2 u2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f21573b = true;
        this.f21574c = 150;
        this.f21575f = -1L;
        this.f21578j = new AnimationNotificationsLocker();
        e();
        this.f30019z = new ArrayList();
        this.G = new ArrayList();
        this.f30012r = peer;
        this.f30013s = tL_channels_sendAsPeers;
        ah.x xVar = new ah.x(this, context, 21);
        this.f30014t = xVar;
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
        lp0 lp0Var = new lp0(context, i10, dp);
        this.f30009o = lp0Var;
        lp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f30010p = textView;
        org.telegram.messenger.kk.o(org.telegram.ui.ActionBar.h6.f21149m5, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        lp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        im0 im0Var = new im0(context, null);
        this.v = im0Var;
        s4.b0 b0Var = new s4.b0();
        this.f30016w = b0Var;
        im0Var.setLayoutManager(b0Var);
        im0Var.setAdapter(new mp0(d6Var, arrayList, messagesController, i10, peer));
        im0Var.j(new np0(this));
        im0Var.setOnItemClickListener(new wl0() {
            @Override
            public final void a(int i11, View view) {
                rp0.k(ef.this, arrayList, context, qnVar, z10, u2Var, view, i11);
            }
        });
        im0Var.setOverScrollMode(2);
        frameLayout.addView(im0Var);
        View view = new View(context);
        this.f30015u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.z5.c(4.0f, -1));
        lp0Var.addView(frameLayout, w7.z5.c(-2.0f, -1));
        xVar.addView(lp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f30019z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f24000q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f24000q0 = null;
        int i10 = 0;
        if (!this.f30011q) {
            l(new o1.k[0]);
            chatActivityEnterView.f23995p0.a(true, true, 0.0f);
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

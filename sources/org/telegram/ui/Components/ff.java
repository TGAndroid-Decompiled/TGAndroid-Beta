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
public final class ff extends kp0 {
    public final ChatActivityEnterView H;

    public ff(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.xn xnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.q5 q5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f19684b = true;
        this.f19685c = 150;
        this.f19686f = -1L;
        this.f19689j = new AnimationNotificationsLocker();
        e();
        this.f25821z = new ArrayList();
        this.G = new ArrayList();
        this.f25814r = peer;
        this.f25815s = tL_channels_sendAsPeers;
        ai.f0 f0Var = new ai.f0(this, context, 18);
        this.f25816t = f0Var;
        f0Var.setLayoutParams(w7.y5.c(-2.0f, -2));
        setContentView(f0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, e6Var), PorterDuff.Mode.MULTIPLY));
        f0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        f0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (xnVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = xnVar.X0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        ep0 ep0Var = new ep0(context, i10, dp);
        this.f25811o = ep0Var;
        ep0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f25812p = textView;
        org.telegram.messenger.qk.n(org.telegram.ui.ActionBar.i6.f19221m5, e6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        ep0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        yl0 yl0Var = new yl0(context, null);
        this.v = yl0Var;
        s4.c0 c0Var = new s4.c0();
        this.f25818w = c0Var;
        yl0Var.setLayoutManager(c0Var);
        yl0Var.setAdapter(new fp0(e6Var, arrayList, messagesController, i10, peer));
        yl0Var.j(new gp0(this));
        yl0Var.setOnItemClickListener(new ml0() {
            @Override
            public final void d(int i11, View view) {
                kp0.k(ff.this, arrayList, context, xnVar, z10, q5Var, view, i11);
            }
        });
        yl0Var.setOverScrollMode(2);
        frameLayout.addView(yl0Var);
        View view = new View(context);
        this.f25817u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.y5.c(4.0f, -1));
        ep0Var.addView(frameLayout, w7.y5.c(-2.0f, -1));
        f0Var.addView(ep0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f25821z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f22049q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f22049q0 = null;
        int i10 = 0;
        if (!this.f25813q) {
            l(new o1.k[0]);
            chatActivityEnterView.f22044p0.a(true, true, 0.0f);
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

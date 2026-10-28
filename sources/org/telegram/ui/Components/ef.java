package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class ef extends cq0 {
    public final ChatActivityEnterView H;

    public ef(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.wn wnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f22909b = true;
        this.f22910c = 150;
        this.f22911f = -1L;
        this.f22914j = new AnimationNotificationsLocker();
        e();
        this.f27236z = new ArrayList();
        this.G = new ArrayList();
        this.f27229r = peer;
        this.f27230s = tL_channels_sendAsPeers;
        bh.r rVar = new bh.r(this, context, 22);
        this.f27231t = rVar;
        rVar.setLayoutParams(kb1.g(-2.0f, -2));
        setContentView(rVar);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.f7.y(rVar, mutate, org.telegram.ui.ActionBar.y6.G8, u6Var, PorterDuff.Mode.MULTIPLY);
        rVar.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        rVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (wnVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = wnVar.f45163j1.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        wp0 wp0Var = new wp0(context, i10, dp);
        this.f27226o = wp0Var;
        wp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f27227p = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23520m5, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        wp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        nm0 nm0Var = new nm0(context, null);
        this.v = nm0Var;
        s4.c0 c0Var = new s4.c0();
        this.f27233w = c0Var;
        nm0Var.setLayoutManager(c0Var);
        nm0Var.setAdapter(new xp0(u6Var, arrayList, messagesController, i10, peer));
        nm0Var.j(new yp0(this));
        nm0Var.setOnItemClickListener(new am0() {
            @Override
            public final void c(int i11, View view) {
                cq0.k(ef.this, arrayList, context, wnVar, z10, aVar, view, i11);
            }
        });
        nm0Var.setOverScrollMode(2);
        frameLayout.addView(nm0Var);
        View view = new View(context);
        this.f27232u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, kb1.g(4.0f, -1));
        wp0Var.addView(frameLayout, kb1.g(-2.0f, -1));
        rVar.addView(wp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f27236z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f25943q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f25943q0 = null;
        int i10 = 0;
        if (!this.f27228q) {
            l(new o1.j[0]);
            chatActivityEnterView.f25937p0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        super.dismiss();
    }
}

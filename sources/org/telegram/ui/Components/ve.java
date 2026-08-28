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
public final class ve extends eo0 {
    public final ChatActivityEnterView H;

    public ve(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.qn qnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f23688b = true;
        this.f23689c = 150;
        this.f23691f = -1L;
        this.f23694j = new AnimationNotificationsLocker();
        e();
        this.f28101z = new ArrayList();
        this.G = new ArrayList();
        this.f28094r = peer;
        this.f28095s = tL_channels_sendAsPeers;
        fh.d2 d2Var = new fh.d2(this, context, 21);
        this.f28096t = d2Var;
        d2Var.setLayoutParams(g7.e6.c(-2.0f, -2));
        setContentView(d2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var), PorterDuff.Mode.MULTIPLY));
        d2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        d2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (qnVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = qnVar.T0.getWidth();
        }
        int i9 = (int) (width * 0.75f);
        yn0 yn0Var = new yn0(context, i9, dp);
        this.f28091o = yn0Var;
        yn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f28092p = textView;
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.f23161m5, b6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        yn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        wk0 wk0Var = new wk0(context, null);
        this.v = wk0Var;
        f2.m0 m0Var = new f2.m0();
        this.f28098w = m0Var;
        wk0Var.setLayoutManager(m0Var);
        wk0Var.setAdapter(new zn0(b6Var, arrayList, messagesController, i9, peer));
        wk0Var.j(new ao0(this));
        wk0Var.setOnItemClickListener(new mk0() {
            @Override
            public final void a(int i10, View view) {
                eo0.k(ve.this, arrayList, context, qnVar, z10, aVar, view, i10);
            }
        });
        wk0Var.setOverScrollMode(2);
        frameLayout.addView(wk0Var);
        View view = new View(context);
        this.f28097u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, g7.e6.c(4.0f, -1));
        yn0Var.addView(frameLayout, g7.e6.c(-2.0f, -1));
        d2Var.addView(yn0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f28101z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.m0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.m0 = null;
        int i9 = 0;
        if (!this.f28093q) {
            l(new o1.j[0]);
            chatActivityEnterView.f26141l0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        super.dismiss();
    }
}

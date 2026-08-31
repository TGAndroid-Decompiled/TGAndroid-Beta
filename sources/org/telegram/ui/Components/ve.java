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
public final class ve extends ap0 {
    public final ChatActivityEnterView H;

    public ve(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.xn xnVar, MessagesController messagesController, final boolean z4, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f22216b = true;
        this.f22217c = 150;
        this.f22219f = -1L;
        this.f22222j = new AnimationNotificationsLocker();
        e();
        this.f25316z = new ArrayList();
        this.G = new ArrayList();
        this.f25309r = peer;
        this.f25310s = tL_channels_sendAsPeers;
        eg.s2 s2Var = new eg.s2(this, context, 24);
        this.f25311t = s2Var;
        s2Var.setLayoutParams(k7.c6.c(-2.0f, -2));
        setContentView(s2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var), PorterDuff.Mode.MULTIPLY));
        s2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        s2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (xnVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = xnVar.U0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        uo0 uo0Var = new uo0(context, i10, dp);
        this.f25306o = uo0Var;
        uo0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f25307p = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21820m5, g6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        uo0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        tl0 tl0Var = new tl0(context, null);
        this.v = tl0Var;
        f2.j0 j0Var = new f2.j0();
        this.f25313w = j0Var;
        tl0Var.setLayoutManager(j0Var);
        tl0Var.setAdapter(new vo0(g6Var, arrayList, messagesController, i10, peer));
        tl0Var.j(new wo0(this));
        tl0Var.setOnItemClickListener(new jl0() {
            @Override
            public final void f(int i11, View view) {
                ap0.k(ve.this, arrayList, context, xnVar, z4, aVar, view, i11);
            }
        });
        tl0Var.setOverScrollMode(2);
        frameLayout.addView(tl0Var);
        View view = new View(context);
        this.f25312u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, k7.c6.c(4.0f, -1));
        uo0Var.addView(frameLayout, k7.c6.c(-2.0f, -1));
        s2Var.addView(uo0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f25316z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f24645n0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f24645n0 = null;
        int i10 = 0;
        if (!this.f25308q) {
            l(new o1.j[0]);
            chatActivityEnterView.m0.a(true, true, 0.0f);
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

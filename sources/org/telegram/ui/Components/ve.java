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
public final class ve extends zo0 {
    public final ChatActivityEnterView H;

    public ve(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.xn xnVar, MessagesController messagesController, final boolean z4, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f22218b = true;
        this.f22219c = 150;
        this.f22221f = -1L;
        this.f22224j = new AnimationNotificationsLocker();
        e();
        this.f33991z = new ArrayList();
        this.G = new ArrayList();
        this.f33984r = peer;
        this.f33985s = tL_channels_sendAsPeers;
        eg.s2 s2Var = new eg.s2(this, context, 24);
        this.f33986t = s2Var;
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
        to0 to0Var = new to0(context, i10, dp);
        this.f33981o = to0Var;
        to0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f33982p = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21822m5, g6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        to0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        sl0 sl0Var = new sl0(context, null);
        this.v = sl0Var;
        f2.j0 j0Var = new f2.j0();
        this.f33988w = j0Var;
        sl0Var.setLayoutManager(j0Var);
        sl0Var.setAdapter(new uo0(g6Var, arrayList, messagesController, i10, peer));
        sl0Var.j(new vo0(this));
        sl0Var.setOnItemClickListener(new il0() {
            @Override
            public final void f(int i11, View view) {
                zo0.k(ve.this, arrayList, context, xnVar, z4, aVar, view, i11);
            }
        });
        sl0Var.setOverScrollMode(2);
        frameLayout.addView(sl0Var);
        View view = new View(context);
        this.f33987u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, k7.c6.c(4.0f, -1));
        to0Var.addView(frameLayout, k7.c6.c(-2.0f, -1));
        s2Var.addView(to0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f33991z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f24647n0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f24647n0 = null;
        int i10 = 0;
        if (!this.f33983q) {
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

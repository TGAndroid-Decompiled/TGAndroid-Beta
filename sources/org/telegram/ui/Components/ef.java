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
public final class ef extends wp0 {
    public final ChatActivityEnterView H;

    public ef(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.sn snVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.u2 u2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f21630b = true;
        this.f21631c = 150;
        this.f21632f = -1L;
        this.f21635j = new AnimationNotificationsLocker();
        e();
        this.f32313z = new ArrayList();
        this.G = new ArrayList();
        this.f32306r = peer;
        this.f32307s = tL_channels_sendAsPeers;
        ah.x xVar = new ah.x(this, context, 21);
        this.f32308t = xVar;
        xVar.setLayoutParams(w7.z5.c(-2.0f, -2));
        setContentView(xVar);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.r6.z(xVar, mutate, org.telegram.ui.ActionBar.k6.G8, g6Var, PorterDuff.Mode.MULTIPLY);
        xVar.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        xVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (snVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = snVar.f41561j1.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        qp0 qp0Var = new qp0(context, i10, dp);
        this.f32303o = qp0Var;
        qp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f32304p = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21345m5, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        qp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        mm0 mm0Var = new mm0(context, null);
        this.v = mm0Var;
        s4.b0 b0Var = new s4.b0();
        this.f32310w = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setAdapter(new rp0(g6Var, arrayList, messagesController, i10, peer));
        mm0Var.j(new sp0(this));
        mm0Var.setOnItemClickListener(new am0() {
            @Override
            public final void d(int i11, View view) {
                wp0.k(ef.this, arrayList, context, snVar, z10, u2Var, view, i11);
            }
        });
        mm0Var.setOverScrollMode(2);
        frameLayout.addView(mm0Var);
        View view = new View(context);
        this.f32309u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.z5.c(4.0f, -1));
        qp0Var.addView(frameLayout, w7.z5.c(-2.0f, -1));
        xVar.addView(qp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f32313z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f24147q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f24147q0 = null;
        int i10 = 0;
        if (!this.f32305q) {
            l(new o1.k[0]);
            chatActivityEnterView.f24142p0.a(true, true, 0.0f);
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

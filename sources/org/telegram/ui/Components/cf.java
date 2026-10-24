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
public final class cf extends vp0 {
    public final ChatActivityEnterView H;

    public cf(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.sn snVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.u2 u2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f21631b = true;
        this.f21632c = 150;
        this.f21633f = -1L;
        this.f21636j = new AnimationNotificationsLocker();
        e();
        this.f32018z = new ArrayList();
        this.G = new ArrayList();
        this.f32011r = peer;
        this.f32012s = tL_channels_sendAsPeers;
        ah.x xVar = new ah.x(this, context, 21);
        this.f32013t = xVar;
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
            width = snVar.f41558j1.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        pp0 pp0Var = new pp0(context, i10, dp);
        this.f32008o = pp0Var;
        pp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f32009p = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21346m5, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        pp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        lm0 lm0Var = new lm0(context, null);
        this.v = lm0Var;
        s4.b0 b0Var = new s4.b0();
        this.f32015w = b0Var;
        lm0Var.setLayoutManager(b0Var);
        lm0Var.setAdapter(new qp0(g6Var, arrayList, messagesController, i10, peer));
        lm0Var.j(new rp0(this));
        lm0Var.setOnItemClickListener(new zl0() {
            @Override
            public final void d(int i11, View view) {
                vp0.k(cf.this, arrayList, context, snVar, z10, u2Var, view, i11);
            }
        });
        lm0Var.setOverScrollMode(2);
        frameLayout.addView(lm0Var);
        View view = new View(context);
        this.f32014u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.z5.c(4.0f, -1));
        pp0Var.addView(frameLayout, w7.z5.c(-2.0f, -1));
        xVar.addView(pp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f32018z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f24148q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f24148q0 = null;
        int i10 = 0;
        if (!this.f32010q) {
            l(new o1.k[0]);
            chatActivityEnterView.f24143p0.a(true, true, 0.0f);
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

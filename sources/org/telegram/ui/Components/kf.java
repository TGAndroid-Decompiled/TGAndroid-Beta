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
public final class kf extends gq0 {
    public final ChatActivityEnterView H;

    public kf(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.eo eoVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.r5 r5Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f21144b = true;
        this.f21145c = 150;
        this.f21147f = -1L;
        this.f21150j = new AnimationNotificationsLocker();
        e();
        this.f26496z = new ArrayList();
        this.G = new ArrayList();
        this.f26489r = peer;
        this.f26490s = tL_channels_sendAsPeers;
        ai.f0 f0Var = new ai.f0(this, context, 19);
        this.f26491t = f0Var;
        f0Var.setLayoutParams(w7.w5.d(-2.0f, -2));
        setContentView(f0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
        f0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        f0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (eoVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = eoVar.X0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        aq0 aq0Var = new aq0(context, i10, dp);
        this.f26486o = aq0Var;
        aq0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f26487p = textView;
        org.telegram.messenger.am.o(org.telegram.ui.ActionBar.h6.f20723m5, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        aq0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        wm0 wm0Var = new wm0(context, null);
        this.v = wm0Var;
        s4.d0 d0Var = new s4.d0();
        this.f26493w = d0Var;
        wm0Var.setLayoutManager(d0Var);
        wm0Var.setAdapter(new bq0(c6Var, arrayList, messagesController, i10, peer));
        wm0Var.j(new cq0(this));
        wm0Var.setOnItemClickListener(new km0() {
            @Override
            public final void d(int i11, View view) {
                gq0.k(kf.this, arrayList, context, eoVar, z10, r5Var, view, i11);
            }
        });
        wm0Var.setOverScrollMode(2);
        frameLayout.addView(wm0Var);
        View view = new View(context);
        this.f26492u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.w5.d(4.0f, -1));
        aq0Var.addView(frameLayout, w7.w5.d(-2.0f, -1));
        f0Var.addView(aq0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f26496z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f23712q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f23712q0 = null;
        int i10 = 0;
        if (!this.f26488q) {
            l(new o1.k[0]);
            chatActivityEnterView.f23707p0.a(true, true, 0.0f);
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

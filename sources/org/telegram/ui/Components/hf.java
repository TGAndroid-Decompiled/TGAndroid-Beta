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
public final class hf extends cq0 {
    public final ChatActivityEnterView H;

    public hf(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.zn znVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.r5 r5Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f21370b = true;
        this.f21371c = 150;
        this.f21373f = -1L;
        this.f21376j = new AnimationNotificationsLocker();
        e();
        this.f25289z = new ArrayList();
        this.G = new ArrayList();
        this.f25282r = peer;
        this.f25283s = tL_channels_sendAsPeers;
        ai.f0 f0Var = new ai.f0(this, context, 18);
        this.f25284t = f0Var;
        f0Var.setLayoutParams(w7.x5.d(-2.0f, -2));
        setContentView(f0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var), PorterDuff.Mode.MULTIPLY));
        f0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        f0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (znVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = znVar.X0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        wp0 wp0Var = new wp0(context, i10, dp);
        this.f25279o = wp0Var;
        wp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f25280p = textView;
        org.telegram.messenger.ai.o(org.telegram.ui.ActionBar.h6.f20950m5, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        wp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        sm0 sm0Var = new sm0(context, null);
        this.v = sm0Var;
        s4.d0 d0Var = new s4.d0();
        this.f25286w = d0Var;
        sm0Var.setLayoutManager(d0Var);
        sm0Var.setAdapter(new xp0(d6Var, arrayList, messagesController, i10, peer));
        sm0Var.j(new yp0(this));
        sm0Var.setOnItemClickListener(new gm0() {
            @Override
            public final void d(int i11, View view) {
                cq0.k(hf.this, arrayList, context, znVar, z10, r5Var, view, i11);
            }
        });
        sm0Var.setOverScrollMode(2);
        frameLayout.addView(sm0Var);
        View view = new View(context);
        this.f25285u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.x5.d(4.0f, -1));
        wp0Var.addView(frameLayout, w7.x5.d(-2.0f, -1));
        f0Var.addView(wp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f25289z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f23937q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f23937q0 = null;
        int i10 = 0;
        if (!this.f25281q) {
            l(new o1.k[0]);
            chatActivityEnterView.f23932p0.a(true, true, 0.0f);
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

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
public final class ff extends jp0 {
    public final ChatActivityEnterView H;

    public ff(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.wn wnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.q5 q5Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f19634b = true;
        this.f19635c = 150;
        this.f19636f = -1L;
        this.f19639j = new AnimationNotificationsLocker();
        e();
        this.f25500z = new ArrayList();
        this.G = new ArrayList();
        this.f25493r = peer;
        this.f25494s = tL_channels_sendAsPeers;
        ai.f0 f0Var = new ai.f0(this, context, 18);
        this.f25495t = f0Var;
        f0Var.setLayoutParams(w7.y5.c(-2.0f, -2));
        setContentView(f0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, d6Var), PorterDuff.Mode.MULTIPLY));
        f0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        f0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (wnVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = wnVar.X0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        dp0 dp0Var = new dp0(context, i10, dp);
        this.f25490o = dp0Var;
        dp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f25491p = textView;
        org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.h6.f19222m5, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        dp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        xl0 xl0Var = new xl0(context, null);
        this.v = xl0Var;
        s4.c0 c0Var = new s4.c0();
        this.f25497w = c0Var;
        xl0Var.setLayoutManager(c0Var);
        xl0Var.setAdapter(new ep0(d6Var, arrayList, messagesController, i10, peer));
        xl0Var.j(new fp0(this));
        xl0Var.setOnItemClickListener(new ll0() {
            @Override
            public final void d(int i11, View view) {
                jp0.k(ff.this, arrayList, context, wnVar, z10, q5Var, view, i11);
            }
        });
        xl0Var.setOverScrollMode(2);
        frameLayout.addView(xl0Var);
        View view = new View(context);
        this.f25496u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.y5.c(4.0f, -1));
        dp0Var.addView(frameLayout, w7.y5.c(-2.0f, -1));
        f0Var.addView(dp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f25500z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f22046q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f22046q0 = null;
        int i10 = 0;
        if (!this.f25492q) {
            l(new o1.k[0]);
            chatActivityEnterView.f22041p0.a(true, true, 0.0f);
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

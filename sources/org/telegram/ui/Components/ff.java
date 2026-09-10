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
public final class ff extends fp0 {
    public final ChatActivityEnterView H;

    public ff(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.eo eoVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f18534b = true;
        this.f18535c = 150;
        this.f18536f = -1L;
        this.f18539j = new AnimationNotificationsLocker();
        e();
        this.f23064z = new ArrayList();
        this.G = new ArrayList();
        this.f23057r = peer;
        this.f23058s = tL_channels_sendAsPeers;
        bi.ld ldVar = new bi.ld(this, context, 16);
        this.f23059t = ldVar;
        ldVar.setLayoutParams(w7.a6.c(-2.0f, -2));
        setContentView(ldVar);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
        ldVar.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        ldVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (eoVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = eoVar.X0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        zo0 zo0Var = new zo0(context, i10, dp);
        this.f23054o = zo0Var;
        zo0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f23055p = textView;
        org.telegram.messenger.em.n(org.telegram.ui.ActionBar.j6.f18090m5, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        zo0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        vl0 vl0Var = new vl0(context, null);
        this.v = vl0Var;
        s4.c0 c0Var = new s4.c0();
        this.f23061w = c0Var;
        vl0Var.setLayoutManager(c0Var);
        vl0Var.setAdapter(new ap0(f6Var, arrayList, messagesController, i10, peer));
        vl0Var.j(new bp0(this));
        vl0Var.setOnItemClickListener(new jl0() {
            @Override
            public final void d(int i11, View view) {
                fp0.k(ff.this, arrayList, context, eoVar, z10, aVar, view, i11);
            }
        });
        vl0Var.setOverScrollMode(2);
        frameLayout.addView(vl0Var);
        View view = new View(context);
        this.f23060u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.a6.c(4.0f, -1));
        zo0Var.addView(frameLayout, w7.a6.c(-2.0f, -1));
        ldVar.addView(zo0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f23064z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f20909q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f20909q0 = null;
        int i10 = 0;
        if (!this.f23056q) {
            l(new o1.k[0]);
            chatActivityEnterView.f20904p0.a(true, true, 0.0f);
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

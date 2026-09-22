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
public final class cf extends vo0 {
    public final ChatActivityEnterView H;

    public cf(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.bo boVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.r5 r5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f19416b = true;
        this.f19417c = 150;
        this.f19418f = -1L;
        this.f19421j = new AnimationNotificationsLocker();
        e();
        this.f28857z = new ArrayList();
        this.G = new ArrayList();
        this.f28850r = peer;
        this.f28851s = tL_channels_sendAsPeers;
        ai.f0 f0Var = new ai.f0(this, context, 18);
        this.f28852t = f0Var;
        f0Var.setLayoutParams(w7.x5.c(-2.0f, -2));
        setContentView(f0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, e6Var), PorterDuff.Mode.MULTIPLY));
        f0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        f0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (boVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = boVar.X0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        po0 po0Var = new po0(context, i10, dp);
        this.f28847o = po0Var;
        po0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f28848p = textView;
        org.telegram.messenger.vl.o(org.telegram.ui.ActionBar.i6.f18997m5, e6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        po0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        ll0 ll0Var = new ll0(context, null);
        this.v = ll0Var;
        s4.c0 c0Var = new s4.c0();
        this.f28854w = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setAdapter(new qo0(e6Var, arrayList, messagesController, i10, peer));
        ll0Var.j(new ro0(this));
        ll0Var.setOnItemClickListener(new zk0() {
            @Override
            public final void d(int i11, View view) {
                vo0.k(cf.this, arrayList, context, boVar, z10, r5Var, view, i11);
            }
        });
        ll0Var.setOverScrollMode(2);
        frameLayout.addView(ll0Var);
        View view = new View(context);
        this.f28853u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.x5.c(4.0f, -1));
        po0Var.addView(frameLayout, w7.x5.c(-2.0f, -1));
        f0Var.addView(po0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f28857z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f21821q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f21821q0 = null;
        int i10 = 0;
        if (!this.f28849q) {
            l(new o1.k[0]);
            chatActivityEnterView.f21816p0.a(true, true, 0.0f);
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

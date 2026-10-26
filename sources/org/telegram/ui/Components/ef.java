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
public final class ef extends bq0 {
    public final ChatActivityEnterView H;

    public ef(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.un unVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f22908b = true;
        this.f22909c = 150;
        this.f22910f = -1L;
        this.f22913j = new AnimationNotificationsLocker();
        e();
        this.f26950z = new ArrayList();
        this.G = new ArrayList();
        this.f26943r = peer;
        this.f26944s = tL_channels_sendAsPeers;
        bh.r rVar = new bh.r(this, context, 22);
        this.f26945t = rVar;
        rVar.setLayoutParams(gb1.g(-2.0f, -2));
        setContentView(rVar);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.f7.y(rVar, mutate, org.telegram.ui.ActionBar.y6.G8, u6Var, PorterDuff.Mode.MULTIPLY);
        rVar.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        rVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (unVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = unVar.f44295j1.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        vp0 vp0Var = new vp0(context, i10, dp);
        this.f26940o = vp0Var;
        vp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f26941p = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23519m5, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        vp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        mm0 mm0Var = new mm0(context, null);
        this.v = mm0Var;
        s4.c0 c0Var = new s4.c0();
        this.f26947w = c0Var;
        mm0Var.setLayoutManager(c0Var);
        mm0Var.setAdapter(new wp0(u6Var, arrayList, messagesController, i10, peer));
        mm0Var.j(new xp0(this));
        mm0Var.setOnItemClickListener(new zl0() {
            @Override
            public final void c(int i11, View view) {
                bq0.k(ef.this, arrayList, context, unVar, z10, aVar, view, i11);
            }
        });
        mm0Var.setOverScrollMode(2);
        frameLayout.addView(mm0Var);
        View view = new View(context);
        this.f26946u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, gb1.g(4.0f, -1));
        vp0Var.addView(frameLayout, gb1.g(-2.0f, -1));
        rVar.addView(vp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f26950z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f25941q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f25941q0 = null;
        int i10 = 0;
        if (!this.f26942q) {
            l(new o1.j[0]);
            chatActivityEnterView.f25935p0.a(true, true, 0.0f);
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

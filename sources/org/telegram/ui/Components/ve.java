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

    public ve(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.xn xnVar, MessagesController messagesController, final boolean z4, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f20516b = true;
        this.f20517c = 150;
        this.f20518f = -1L;
        this.f20521j = new AnimationNotificationsLocker();
        e();
        this.f31423z = new ArrayList();
        this.G = new ArrayList();
        this.f31416r = peer;
        this.f31417s = tL_channels_sendAsPeers;
        dg.u2 u2Var = new dg.u2(this, context, 24);
        this.f31418t = u2Var;
        u2Var.setLayoutParams(k7.b6.c(-2.0f, -2));
        setContentView(u2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
        u2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        u2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (xnVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = xnVar.U0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        to0 to0Var = new to0(context, i10, dp);
        this.f31413o = to0Var;
        to0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f31414p = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20066m5, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        to0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        sl0 sl0Var = new sl0(context, null);
        this.v = sl0Var;
        f2.i0 i0Var = new f2.i0();
        this.f31420w = i0Var;
        sl0Var.setLayoutManager(i0Var);
        sl0Var.setAdapter(new uo0(f6Var, arrayList, messagesController, i10, peer));
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
        this.f31419u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, k7.b6.c(4.0f, -1));
        to0Var.addView(frameLayout, k7.b6.c(-2.0f, -1));
        u2Var.addView(to0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f31423z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f22805n0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f22805n0 = null;
        int i10 = 0;
        if (!this.f31415q) {
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

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
public final class ye extends po0 {
    public final ChatActivityEnterView H;

    public ye(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.tn tnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f23710b = true;
        this.f23711c = 150;
        this.f23713f = -1L;
        this.f23716j = new AnimationNotificationsLocker();
        e();
        this.f31729z = new ArrayList();
        this.G = new ArrayList();
        this.f31722r = peer;
        this.f31723s = tL_channels_sendAsPeers;
        bg.x2 x2Var = new bg.x2(this, context, 26);
        this.f31724t = x2Var;
        x2Var.setLayoutParams(i7.f6.c(-2.0f, -2));
        setContentView(x2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
        x2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        x2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (tnVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = tnVar.T0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        jo0 jo0Var = new jo0(context, i10, dp);
        this.f31719o = jo0Var;
        jo0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f31720p = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23222m5, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        jo0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        jl0 jl0Var = new jl0(context, null);
        this.v = jl0Var;
        f2.j0 j0Var = new f2.j0();
        this.f31726w = j0Var;
        jl0Var.setLayoutManager(j0Var);
        jl0Var.setAdapter(new ko0(c6Var, arrayList, messagesController, i10, peer));
        jl0Var.j(new lo0(this));
        jl0Var.setOnItemClickListener(new zk0() {
            @Override
            public final void c(int i11, View view) {
                po0.k(ye.this, arrayList, context, tnVar, z10, aVar, view, i11);
            }
        });
        jl0Var.setOverScrollMode(2);
        frameLayout.addView(jl0Var);
        View view = new View(context);
        this.f31725u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, i7.f6.c(4.0f, -1));
        jo0Var.addView(frameLayout, i7.f6.c(-2.0f, -1));
        x2Var.addView(jo0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f31729z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.m0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.m0 = null;
        int i10 = 0;
        if (!this.f31721q) {
            l(new o1.k[0]);
            chatActivityEnterView.f26152l0.a(true, true, 0.0f);
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

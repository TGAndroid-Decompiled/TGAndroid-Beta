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
public final class gf extends wp0 {
    public final ChatActivityEnterView H;

    public gf(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.fo foVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f20520b = true;
        this.f20521c = 150;
        this.f20522f = -1L;
        this.f20525j = new AnimationNotificationsLocker();
        e();
        this.f30943z = new ArrayList();
        this.G = new ArrayList();
        this.f30936r = peer;
        this.f30937s = tL_channels_sendAsPeers;
        ah.x xVar = new ah.x(this, context, 19);
        this.f30938t = xVar;
        xVar.setLayoutParams(w7.a6.d(-2.0f, -2));
        setContentView(xVar);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
        xVar.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        xVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int dp = AndroidUtilities.dp(450.0f);
        if (foVar == null) {
            width = AndroidUtilities.displaySize.x;
        } else {
            width = foVar.X0.getWidth();
        }
        int i10 = (int) (width * 0.75f);
        qp0 qp0Var = new qp0(context, i10, dp);
        this.f30933o = qp0Var;
        qp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f30934p = textView;
        org.telegram.messenger.yh.n(org.telegram.ui.ActionBar.g6.f20063m5, c6Var, textView, 1, 16.0f);
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
        this.f30940w = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setAdapter(new rp0(c6Var, arrayList, messagesController, i10, peer));
        mm0Var.j(new sp0(this));
        mm0Var.setOnItemClickListener(new am0() {
            @Override
            public final void a(int i11, View view) {
                wp0.k(gf.this, arrayList, context, foVar, z10, aVar, view, i11);
            }
        });
        mm0Var.setOverScrollMode(2);
        frameLayout.addView(mm0Var);
        View view = new View(context);
        this.f30939u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.a6.d(4.0f, -1));
        qp0Var.addView(frameLayout, w7.a6.d(-2.0f, -1));
        xVar.addView(qp0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f30943z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f22944q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f22944q0 = null;
        int i10 = 0;
        if (!this.f30935q) {
            l(new o1.k[0]);
            chatActivityEnterView.f22939p0.a(true, true, 0.0f);
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

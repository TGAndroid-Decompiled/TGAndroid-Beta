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
public final class hf extends aq0 {
    public final ChatActivityEnterView H;

    public hf(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.zn znVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.r5 r5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.f21413b = true;
        this.f21414c = 150;
        this.f21416f = -1L;
        this.f21419j = new AnimationNotificationsLocker();
        e();
        this.f24748z = new ArrayList();
        this.G = new ArrayList();
        this.f24741r = peer;
        this.f24742s = tL_channels_sendAsPeers;
        ai.f0 f0Var = new ai.f0(this, context, 18);
        this.f24743t = f0Var;
        f0Var.setLayoutParams(w7.x5.d(-2.0f, -2));
        setContentView(f0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, e6Var), PorterDuff.Mode.MULTIPLY));
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
        up0 up0Var = new up0(context, i10, dp);
        this.f24738o = up0Var;
        up0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.f24739p = textView;
        org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.f20961m5, e6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp2 = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp2, AndroidUtilities.dp(12.0f), dp2, AndroidUtilities.dp(12.0f));
        up0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        qm0 qm0Var = new qm0(context, null);
        this.v = qm0Var;
        s4.d0 d0Var = new s4.d0();
        this.f24745w = d0Var;
        qm0Var.setLayoutManager(d0Var);
        qm0Var.setAdapter(new vp0(e6Var, arrayList, messagesController, i10, peer));
        qm0Var.j(new wp0(this));
        qm0Var.setOnItemClickListener(new em0() {
            @Override
            public final void d(int i11, View view) {
                aq0.k(hf.this, arrayList, context, znVar, z10, r5Var, view, i11);
            }
        });
        qm0Var.setOverScrollMode(2);
        frameLayout.addView(qm0Var);
        View view = new View(context);
        this.f24744u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.x5.d(4.0f, -1));
        up0Var.addView(frameLayout, w7.x5.d(-2.0f, -1));
        f0Var.addView(up0Var);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.f24748z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.f23945q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.f23945q0 = null;
        int i10 = 0;
        if (!this.f24740q) {
            l(new o1.k[0]);
            chatActivityEnterView.f23940p0.a(true, true, 0.0f);
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

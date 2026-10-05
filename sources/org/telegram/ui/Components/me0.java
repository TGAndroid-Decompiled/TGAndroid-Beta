package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class me0 extends org.telegram.ui.ActionBar.f3 {
    public final TextView f28681b;
    public final TextView f28682c;
    public final TextView d;
    public final nj0 f28683e;
    public final kj0 f28684f;
    public final j90 h;
    public final long f28685n;
    public boolean f28686r;
    public TLRPC.TL_chatInviteExported f28687s;

    public me0(Context context, org.telegram.ui.d70 d70Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f28685n = j3;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.f20918i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new l80(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        j90 j90Var = new j90(context, d70Var, this, true, z10);
        this.h = j90Var;
        j90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f28683e = imageView2;
        kj0 kj0Var = new kj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f28684f = kj0Var;
        kj0Var.P(42);
        imageView2.setAnimation(kj0Var);
        j90Var.d(0, null, false);
        j90Var.b(true);
        j90Var.setDelegate(new pv(this, 10));
        TextView textView = new TextView(context);
        this.f28681b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        TextView textView2 = new TextView(context);
        this.f28682c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.bi.k(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i11, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.i6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ai.d0(this, chatFull, d70Var, 25));
        linearLayout.addView((View) imageView2, w7.z5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(j90Var, w7.z5.n(-1, -2));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j3));
        if (chat != null && ChatObject.isPublic(chat)) {
            j90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            j90Var.setLink(tL_chatInviteExported.link);
        } else {
            p(false);
        }
        q();
    }

    public static void m(me0 me0Var) {
        super.dismiss();
    }

    public static void n(me0 me0Var, TLRPC.ChatFull chatFull, org.telegram.ui.d70 d70Var) {
        org.telegram.ui.wh0 wh0Var = new org.telegram.ui.wh0(chatFull.f20048id, 0L, 0);
        wh0Var.g0(chatFull, chatFull.exported_invite);
        d70Var.presentFragment(wh0Var);
        super.dismiss();
    }

    public static void o(me0 me0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            me0Var.f28687s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(me0Var.currentAccount).getChatFull(me0Var.f28685n);
            if (chatFull != null) {
                chatFull.exported_invite = me0Var.f28687s;
            }
            me0Var.h.setLink(me0Var.f28687s.link);
        }
        me0Var.f28686r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        y6 y6Var = new y6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f28681b, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f28682c, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20935j5));
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.f21013n6));
        return arrayList;
    }

    public final void p(boolean z10) {
        if (this.f28686r) {
            return;
        }
        this.f28686r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f28685n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.t3(7, this, z10));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        this.f28683e.setBackground(org.telegram.ui.ActionBar.i6.K(dp, org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.i6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        kj0 kj0Var = this.f28684f;
        kj0Var.Q(w02, "Top");
        kj0Var.Q(w02, "Bottom");
        kj0Var.Q(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20899h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new lc0(this, 6), 50L);
    }
}

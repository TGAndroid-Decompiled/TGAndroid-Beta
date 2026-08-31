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
public final class fe0 extends org.telegram.ui.ActionBar.h3 {
    public final TextView f26898b;
    public final TextView f26899c;
    public final TextView d;
    public final lj0 f26900e;
    public final ij0 f26901f;
    public final y80 h;
    public final long f26902n;
    public boolean f26903r;
    public TLRPC.TL_chatInviteExported f26904s;

    public fe0(Context context, org.telegram.ui.z60 z60Var, TLRPC.ChatFull chatFull, long j10, boolean z4) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f26902n = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.f21750i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new b80(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, k7.c6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        y80 y80Var = new y80(context, z60Var, this, true, z4);
        this.h = y80Var;
        y80Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f26900e = imageView2;
        int i11 = R.raw.shared_link_enter;
        ij0 ij0Var = new ij0(i11, "" + R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f26901f = ij0Var;
        ij0Var.N(42);
        imageView2.setAnimation(ij0Var);
        y80Var.d(0, null, false);
        y80Var.b(true);
        y80Var.setDelegate(new hv(this, 9));
        TextView textView = new TextView(context);
        this.f26898b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        TextView textView2 = new TextView(context);
        this.f26899c = textView2;
        if (z4) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.y3.r(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i12, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new eg.o(this, chatFull, z60Var, 28));
        linearLayout.addView((View) imageView2, k7.c6.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, k7.c6.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, k7.c6.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(y80Var, k7.c6.n(-1, -2));
        linearLayout.addView(textView3, k7.c6.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            y80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            y80Var.setLink(tL_chatInviteExported.link);
        } else {
            p(false);
        }
        q();
    }

    public static void m(fe0 fe0Var) {
        super.dismiss();
    }

    public static void n(fe0 fe0Var, TLRPC.ChatFull chatFull, org.telegram.ui.z60 z60Var) {
        org.telegram.ui.qh0 qh0Var = new org.telegram.ui.qh0(chatFull.f20844id, 0L, 0);
        qh0Var.g0(chatFull, chatFull.exported_invite);
        z60Var.presentFragment(qh0Var);
        super.dismiss();
    }

    public static void o(fe0 fe0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            fe0Var.f26904s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(fe0Var.currentAccount).getChatFull(fe0Var.f26902n);
            if (chatFull != null) {
                chatFull.exported_invite = fe0Var.f26904s;
            }
            fe0Var.h.setLink(fe0Var.f26904s.link);
        }
        fe0Var.f26903r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t6 t6Var = new t6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f26898b, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f26899c, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21766j5));
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.f21839n6));
        return arrayList;
    }

    public final void p(boolean z4) {
        if (this.f26903r) {
            return;
        }
        this.f26903r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f26902n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.zd(6, this, z4));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        this.f26900e.setBackground(org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false);
        ij0 ij0Var = this.f26901f;
        ij0Var.O(w02, "Top");
        ij0Var.O(w02, "Bottom");
        ij0Var.O(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new ec0(this, 5), 50L);
    }
}

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
public final class ue0 extends org.telegram.ui.ActionBar.f3 {
    public final TextView f30910b;
    public final TextView f30911c;
    public final TextView d;
    public final yj0 e;
    public final vj0 f30912f;
    public final q90 h;
    public final long f30913n;
    public boolean f30914r;
    public TLRPC.TL_chatInviteExported f30915s;

    public ue0(Context context, org.telegram.ui.l60 l60Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f30913n = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21082i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new u80(this, 4));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        q90 q90Var = new q90(context, l60Var, this, true, z10);
        this.h = q90Var;
        q90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.e = imageView2;
        vj0 vj0Var = new vj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f30912f = vj0Var;
        vj0Var.P(42);
        imageView2.setAnimation(vj0Var);
        q90Var.d(0, null, false);
        q90Var.b(true);
        q90Var.setDelegate(new tv(this, 10));
        TextView textView = new TextView(context);
        this.f30910b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        TextView textView2 = new TextView(context);
        this.f30911c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21099j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.ok.m(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i11, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, o10, o10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ai.v0(this, chatFull, l60Var, 28));
        linearLayout.addView((View) imageView2, w7.z5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(q90Var, w7.z5.n(-1, -2));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            q90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            q90Var.setLink(tL_chatInviteExported.link);
        } else {
            q(false);
        }
        s();
    }

    public static void n(ue0 ue0Var) {
        super.dismiss();
    }

    public static void o(ue0 ue0Var, TLRPC.ChatFull chatFull, org.telegram.ui.l60 l60Var) {
        org.telegram.ui.ih0 ih0Var = new org.telegram.ui.ih0(chatFull.f20280id, 0L, 0);
        ih0Var.g0(chatFull, chatFull.exported_invite);
        l60Var.presentFragment(ih0Var);
        super.dismiss();
    }

    public static void p(ue0 ue0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            ue0Var.f30915s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(ue0Var.currentAccount).getChatFull(ue0Var.f30913n);
            if (chatFull != null) {
                chatFull.exported_invite = ue0Var.f30915s;
            }
            ue0Var.h.setLink(ue0Var.f30915s.link);
        }
        ue0Var.f30914r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        z6 z6Var = new z6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f30910b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f30911c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21099j5));
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.f21176n6));
        return arrayList;
    }

    public final void q(boolean z10) {
        if (this.f30914r) {
            return;
        }
        this.f30914r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f30913n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ei.o3(7, this, z10));
    }

    public final void s() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        this.e.setBackground(org.telegram.ui.ActionBar.h6.K(dp, org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, o10, o10));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false);
        vj0 vj0Var = this.f30912f;
        vj0Var.Q(x02, "Top");
        vj0Var.Q(x02, "Bottom");
        vj0Var.Q(x02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21064h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new rc0(this, 5), 50L);
    }
}

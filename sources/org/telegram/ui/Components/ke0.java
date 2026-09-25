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
public final class ke0 extends org.telegram.ui.ActionBar.e3 {
    public final TextView f25767b;
    public final TextView f25768c;
    public final TextView d;
    public final lj0 e;
    public final ij0 f25769f;
    public final g90 h;
    public final long f25770n;
    public boolean f25771r;
    public TLRPC.TL_chatInviteExported f25772s;

    public ke0(Context context, org.telegram.ui.z60 z60Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f25770n = j3;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(org.telegram.ui.ActionBar.h6.f19149i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new i80(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.y5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        g90 g90Var = new g90(context, z60Var, this, true, z10);
        this.h = g90Var;
        g90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.e = imageView2;
        ij0 ij0Var = new ij0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f25769f = ij0Var;
        ij0Var.P(42);
        imageView2.setAnimation(ij0Var);
        g90Var.d(0, null, false);
        g90Var.b(true);
        g90Var.setDelegate(new mv(this, 10));
        TextView textView = new TextView(context);
        this.f25767b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        TextView textView2 = new TextView(context);
        this.f25768c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.ok.l(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i11, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ai.d0(this, chatFull, z60Var, 25));
        linearLayout.addView((View) imageView2, w7.y5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.y5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.y5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(g90Var, w7.y5.n(-1, -2));
        linearLayout.addView(textView3, w7.y5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j3));
        if (chat != null && ChatObject.isPublic(chat)) {
            g90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            g90Var.setLink(tL_chatInviteExported.link);
        } else {
            p(false);
        }
        q();
    }

    public static void m(ke0 ke0Var) {
        super.dismiss();
    }

    public static void n(ke0 ke0Var, TLRPC.ChatFull chatFull, org.telegram.ui.z60 z60Var) {
        org.telegram.ui.sh0 sh0Var = new org.telegram.ui.sh0(chatFull.f18337id, 0L, 0);
        sh0Var.g0(chatFull, chatFull.exported_invite);
        z60Var.presentFragment(sh0Var);
        super.dismiss();
    }

    public static void o(ke0 ke0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            ke0Var.f25772s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(ke0Var.currentAccount).getChatFull(ke0Var.f25770n);
            if (chatFull != null) {
                chatFull.exported_invite = ke0Var.f25772s;
            }
            ke0Var.h.setLink(ke0Var.f25772s.link);
        }
        ke0Var.f25771r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        y6 y6Var = new y6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25767b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25768c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19166j5));
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.f19244n6));
        return arrayList;
    }

    public final void p(boolean z10) {
        if (this.f25771r) {
            return;
        }
        this.f25771r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f25770n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.t3(7, this, z10));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        this.e.setBackground(org.telegram.ui.ActionBar.h6.K(dp, org.telegram.ui.ActionBar.h6.w0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.h6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false);
        ij0 ij0Var = this.f25769f;
        ij0Var.Q(w02, "Top");
        ij0Var.Q(w02, "Bottom");
        ij0Var.Q(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19130h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new ic0(this, 6), 50L);
    }
}

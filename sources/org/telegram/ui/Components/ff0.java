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
public final class ff0 extends org.telegram.ui.ActionBar.e3 {
    public final TextView f26053b;
    public final TextView f26054c;
    public final TextView d;
    public final ik0 f26055e;
    public final fk0 f26056f;
    public final ba0 h;
    public final long f26057n;
    public boolean f26058r;
    public TLRPC.TL_chatInviteExported f26059s;

    public ff0(Context context, org.telegram.ui.e70 e70Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f26057n = j3;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f20560d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f20651i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new f90(this, 4));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.w5.a(36.0f, 6.0f, 8.0f, 8.0f, 0.0f, 36, 8388661));
        ba0 ba0Var = new ba0(context, e70Var, this, true, z10);
        this.h = ba0Var;
        ba0Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f26055e = imageView2;
        fk0 fk0Var = new fk0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f26056f = fk0Var;
        fk0Var.P(42);
        imageView2.setAnimation(fk0Var);
        ba0Var.d(0, null, false);
        ba0Var.b(true);
        ba0Var.setDelegate(new ew(this, 10));
        TextView textView = new TextView(context);
        this.f26053b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        TextView textView2 = new TextView(context);
        this.f26054c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.am.m(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i11, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ai.d0(this, chatFull, e70Var, 25));
        linearLayout.addView((View) imageView2, w7.w5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.w5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.w5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(ba0Var, w7.w5.n(-1, -2));
        linearLayout.addView(textView3, w7.w5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j3));
        if (chat != null && ChatObject.isPublic(chat)) {
            ba0Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            ba0Var.setLink(tL_chatInviteExported.link);
        } else {
            r(false);
        }
        s();
    }

    public static void o(ff0 ff0Var) {
        super.dismiss();
    }

    public static void p(ff0 ff0Var, TLRPC.ChatFull chatFull, org.telegram.ui.e70 e70Var) {
        org.telegram.ui.ai0 ai0Var = new org.telegram.ui.ai0(chatFull.f19804id, 0L, 0);
        ai0Var.g0(chatFull, chatFull.exported_invite);
        e70Var.presentFragment(ai0Var);
        super.dismiss();
    }

    public static void q(ff0 ff0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            ff0Var.f26059s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(ff0Var.currentAccount).getChatFull(ff0Var.f26057n);
            if (chatFull != null) {
                chatFull.exported_invite = ff0Var.f26059s;
            }
            ff0Var.h.setLink(ff0Var.f26059s.link);
        }
        ff0Var.f26058r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        a7 a7Var = new a7(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f26053b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f26054c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20668j5));
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.f20745n6));
        return arrayList;
    }

    public final void r(boolean z10) {
        if (this.f26058r) {
            return;
        }
        this.f26058r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f26057n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.s3(7, this, z10));
    }

    public final void s() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        this.f26055e.setBackground(org.telegram.ui.ActionBar.h6.K(dp, org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false);
        fk0 fk0Var = this.f26056f;
        fk0Var.Q(x02, "Top");
        fk0Var.Q(x02, "Bottom");
        fk0Var.Q(x02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20631h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new cd0(this, 6), 50L);
    }
}

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
public final class de0 extends org.telegram.ui.ActionBar.g3 {
    public final TextView f24258b;
    public final TextView f24259c;
    public final TextView d;
    public final jj0 e;
    public final gj0 f24260f;
    public final x80 h;
    public final long f24261n;
    public boolean f24262r;
    public TLRPC.TL_chatInviteExported f24263s;

    public de0(Context context, org.telegram.ui.y60 y60Var, TLRPC.ChatFull chatFull, long j10, boolean z4) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f24261n = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f19996i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new z70(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, k7.b6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        x80 x80Var = new x80(context, y60Var, this, true, z4);
        this.h = x80Var;
        x80Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.e = imageView2;
        int i11 = R.raw.shared_link_enter;
        gj0 gj0Var = new gj0(i11, "" + R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f24260f = gj0Var;
        gj0Var.N(42);
        imageView2.setAnimation(gj0Var);
        x80Var.d(0, null, false);
        x80Var.b(true);
        x80Var.setDelegate(new fv(this, 9));
        TextView textView = new TextView(context);
        this.f24258b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        TextView textView2 = new TextView(context);
        this.f24259c = textView2;
        if (z4) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.y3.r(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new dg.p(this, chatFull, y60Var, 28));
        linearLayout.addView((View) imageView2, k7.b6.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, k7.b6.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, k7.b6.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(x80Var, k7.b6.n(-1, -2));
        linearLayout.addView(textView3, k7.b6.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            x80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            x80Var.setLink(tL_chatInviteExported.link);
        } else {
            p(false);
        }
        q();
    }

    public static void m(de0 de0Var) {
        super.dismiss();
    }

    public static void n(de0 de0Var, TLRPC.ChatFull chatFull, org.telegram.ui.y60 y60Var) {
        org.telegram.ui.ph0 ph0Var = new org.telegram.ui.ph0(chatFull.f19185id, 0L, 0);
        ph0Var.g0(chatFull, chatFull.exported_invite);
        y60Var.presentFragment(ph0Var);
        super.dismiss();
    }

    public static void o(de0 de0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            de0Var.f24263s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(de0Var.currentAccount).getChatFull(de0Var.f24261n);
            if (chatFull != null) {
                chatFull.exported_invite = de0Var.f24263s;
            }
            de0Var.h.setLink(de0Var.f24263s.link);
        }
        de0Var.f24262r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t6 t6Var = new t6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f24258b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f24259c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20012j5));
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.f20085n6));
        return arrayList;
    }

    public final void p(boolean z4) {
        if (this.f24262r) {
            return;
        }
        this.f24262r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f24261n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.zd(6, this, z4));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        this.e.setBackground(org.telegram.ui.ActionBar.j6.K(dp, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        gj0 gj0Var = this.f24260f;
        gj0Var.O(w02, "Top");
        gj0Var.O(w02, "Bottom");
        gj0Var.O(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new cc0(this, 5), 50L);
    }
}

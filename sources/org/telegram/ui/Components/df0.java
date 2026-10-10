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
public final class df0 extends org.telegram.ui.ActionBar.f3 {
    public final TextView f25684b;
    public final TextView f25685c;
    public final TextView d;
    public final gk0 f25686e;
    public final dk0 f25687f;
    public final y90 h;
    public final long f25688n;
    public boolean f25689r;
    public TLRPC.TL_chatInviteExported f25690s;

    public df0(Context context, org.telegram.ui.c70 c70Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f25688n = j3;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.f20892i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new c90(this, 4));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.x5.a(36.0f, 6.0f, 8.0f, 8.0f, 0.0f, 36, 8388661));
        y90 y90Var = new y90(context, c70Var, this, true, z10);
        this.h = y90Var;
        y90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f25686e = imageView2;
        dk0 dk0Var = new dk0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f25687f = dk0Var;
        dk0Var.P(42);
        imageView2.setAnimation(dk0Var);
        y90Var.d(0, null, false);
        y90Var.b(true);
        y90Var.setDelegate(new cw(this, 10));
        TextView textView = new TextView(context);
        this.f25684b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        TextView textView2 = new TextView(context);
        this.f25685c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.bi.m(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i11, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.i6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ai.d0(this, chatFull, c70Var, 25));
        linearLayout.addView((View) imageView2, w7.x5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(y90Var, w7.x5.n(-1, -2));
        linearLayout.addView(textView3, w7.x5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j3));
        if (chat != null && ChatObject.isPublic(chat)) {
            y90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            y90Var.setLink(tL_chatInviteExported.link);
        } else {
            r(false);
        }
        s();
    }

    public static void o(df0 df0Var) {
        super.dismiss();
    }

    public static void p(df0 df0Var, TLRPC.ChatFull chatFull, org.telegram.ui.c70 c70Var) {
        org.telegram.ui.zh0 zh0Var = new org.telegram.ui.zh0(chatFull.f20043id, 0L, 0);
        zh0Var.g0(chatFull, chatFull.exported_invite);
        c70Var.presentFragment(zh0Var);
        super.dismiss();
    }

    public static void q(df0 df0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            df0Var.f25690s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(df0Var.currentAccount).getChatFull(df0Var.f25688n);
            if (chatFull != null) {
                chatFull.exported_invite = df0Var.f25690s;
            }
            df0Var.h.setLink(df0Var.f25690s.link);
        }
        df0Var.f25689r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        a7 a7Var = new a7(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f25684b, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f25685c, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20909j5));
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.f20986n6));
        return arrayList;
    }

    public final void r(boolean z10) {
        if (this.f25689r) {
            return;
        }
        this.f25689r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f25688n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.s3(7, this, z10));
    }

    public final void s() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        this.f25686e.setBackground(org.telegram.ui.ActionBar.i6.K(dp, org.telegram.ui.ActionBar.i6.x0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.i6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
        dk0 dk0Var = this.f25687f;
        dk0Var.Q(x02, "Top");
        dk0Var.Q(x02, "Bottom");
        dk0Var.Q(x02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new cd0(this, 5), 50L);
    }
}

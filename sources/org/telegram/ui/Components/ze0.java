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
public final class ze0 extends org.telegram.ui.ActionBar.e3 {
    public final TextView f31845b;
    public final TextView f31846c;
    public final TextView d;
    public final bk0 e;
    public final yj0 f31847f;
    public final w90 h;
    public final long f31848n;
    public boolean f31849r;
    public TLRPC.TL_chatInviteExported f31850s;

    public ze0(Context context, org.telegram.ui.j70 j70Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f31848n = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f19990i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new z80(this, 4));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.a6.a(36.0f, 6.0f, 8.0f, 8.0f, 0.0f, 36, 8388661));
        w90 w90Var = new w90(context, j70Var, this, true, z10);
        this.h = w90Var;
        w90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.e = imageView2;
        yj0 yj0Var = new yj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f31847f = yj0Var;
        yj0Var.P(42);
        imageView2.setAnimation(yj0Var);
        w90Var.d(0, null, false);
        w90Var.b(true);
        w90Var.setDelegate(new xv(this, 10));
        TextView textView = new TextView(context);
        this.f31845b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        TextView textView2 = new TextView(context);
        this.f31846c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.yh.l(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i11, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new bi.x(this, chatFull, j70Var, 25));
        linearLayout.addView((View) imageView2, w7.a6.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.a6.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.a6.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(w90Var, w7.a6.n(-1, -2));
        linearLayout.addView(textView3, w7.a6.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            w90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            w90Var.setLink(tL_chatInviteExported.link);
        } else {
            r(false);
        }
        s();
    }

    public static void n(ze0 ze0Var) {
        super.dismiss();
    }

    public static void o(ze0 ze0Var, TLRPC.ChatFull chatFull, org.telegram.ui.j70 j70Var) {
        org.telegram.ui.ei0 ei0Var = new org.telegram.ui.ei0(chatFull.f19217id, 0L, 0);
        ei0Var.g0(chatFull, chatFull.exported_invite);
        j70Var.presentFragment(ei0Var);
        super.dismiss();
    }

    public static void q(ze0 ze0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            ze0Var.f31850s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(ze0Var.currentAccount).getChatFull(ze0Var.f31848n);
            if (chatFull != null) {
                chatFull.exported_invite = ze0Var.f31850s;
            }
            ze0Var.h.setLink(ze0Var.f31850s.link);
        }
        ze0Var.f31849r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        b7 b7Var = new b7(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31845b, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31846c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f20007j5));
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.f20084n6));
        return arrayList;
    }

    public final void r(boolean z10) {
        if (this.f31849r) {
            return;
        }
        this.f31849r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f31848n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new di.s3(7, this, z10));
    }

    public final void s() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        this.e.setBackground(org.telegram.ui.ActionBar.g6.K(dp, org.telegram.ui.ActionBar.g6.x0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        yj0 yj0Var = this.f31847f;
        yj0Var.Q(x02, "Top");
        yj0Var.Q(x02, "Bottom");
        yj0Var.Q(x02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new yc0(this, 6), 50L);
    }
}

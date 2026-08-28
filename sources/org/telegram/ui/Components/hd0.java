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
public final class hd0 extends org.telegram.ui.ActionBar.f3 {
    public final TextView f29046b;
    public final TextView f29047c;
    public final TextView d;
    public final pi0 f29048e;
    public final mi0 f29049f;
    public final e80 h;
    public final long f29050n;
    public boolean f29051r;
    public TLRPC.TL_chatInviteExported f29052s;

    public hd0(Context context, org.telegram.ui.k60 k60Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i9;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f29050n = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new h70(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, g7.e6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        e80 e80Var = new e80(context, k60Var, this, true, z10);
        this.h = e80Var;
        e80Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f29048e = imageView2;
        int i10 = R.raw.shared_link_enter;
        mi0 mi0Var = new mi0(i10, "" + R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f29049f = mi0Var;
        mi0Var.N(42);
        imageView2.setAnimation(mi0Var);
        e80Var.d(0, null, false);
        e80Var.b(true);
        e80Var.setDelegate(new wu(this, 9));
        TextView textView = new TextView(context);
        this.f29046b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        TextView textView2 = new TextView(context);
        this.f29047c = textView2;
        if (z10) {
            i9 = R.string.LinkInfoChannel;
        } else {
            i9 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i9));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.ll.l(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new gd0(this, chatFull, k60Var, 0));
        linearLayout.addView((View) imageView2, g7.e6.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, g7.e6.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, g7.e6.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(e80Var, g7.e6.n(-1, -2));
        linearLayout.addView(textView3, g7.e6.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            e80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            e80Var.setLink(tL_chatInviteExported.link);
        } else {
            p(false);
        }
        q();
    }

    public static void m(hd0 hd0Var) {
        super.dismiss();
    }

    public static void n(hd0 hd0Var, TLRPC.ChatFull chatFull, org.telegram.ui.k60 k60Var) {
        org.telegram.ui.hh0 hh0Var = new org.telegram.ui.hh0(chatFull.f22381id, 0L, 0);
        hh0Var.f0(chatFull, chatFull.exported_invite);
        k60Var.presentFragment(hh0Var);
        super.dismiss();
    }

    public static void o(hd0 hd0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            hd0Var.f29052s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(hd0Var.currentAccount).getChatFull(hd0Var.f29050n);
            if (chatFull != null) {
                chatFull.exported_invite = hd0Var.f29052s;
            }
            hd0Var.h.setLink(hd0Var.f29052s.link);
        }
        hd0Var.f29051r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f29046b, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f29047c, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23108j5));
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.f23179n6));
        return arrayList;
    }

    public final void p(boolean z10) {
        if (this.f29051r) {
            return;
        }
        this.f29051r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f29050n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new kh.o3(7, this, z10));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        this.f29048e.setBackground(org.telegram.ui.ActionBar.f6.K(dp, org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false);
        mi0 mi0Var = this.f29049f;
        mi0Var.O(w02, "Top");
        mi0Var.O(w02, "Bottom");
        mi0Var.O(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new ib0(this, 5), 50L);
    }
}

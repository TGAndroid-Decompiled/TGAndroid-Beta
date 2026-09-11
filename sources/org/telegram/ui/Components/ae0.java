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
public final class ae0 extends org.telegram.ui.ActionBar.f3 {
    public final TextView f24344b;
    public final TextView f24345c;
    public final TextView d;
    public final aj0 f24346e;
    public final xi0 f24347f;
    public final w80 h;
    public final long f24348n;
    public boolean f24349r;
    public TLRPC.TL_chatInviteExported f24350s;

    public ae0(Context context, org.telegram.ui.f70 f70Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f24348n = j3;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f20753i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new x70(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.x5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        w80 w80Var = new w80(context, f70Var, this, true, z10);
        this.h = w80Var;
        w80Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f24346e = imageView2;
        xi0 xi0Var = new xi0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f24347f = xi0Var;
        xi0Var.N(42);
        imageView2.setAnimation(xi0Var);
        w80Var.d(0, null, false);
        w80Var.b(true);
        w80Var.setDelegate(new kv(this, 9));
        TextView textView = new TextView(context);
        this.f24344b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        TextView textView2 = new TextView(context);
        this.f24345c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.vl.k(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new bi.x(this, chatFull, f70Var, 25));
        linearLayout.addView((View) imageView2, w7.x5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(w80Var, w7.x5.n(-1, -2));
        linearLayout.addView(textView3, w7.x5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j3));
        if (chat != null && ChatObject.isPublic(chat)) {
            w80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            w80Var.setLink(tL_chatInviteExported.link);
        } else {
            p(false);
        }
        q();
    }

    public static void m(ae0 ae0Var) {
        super.dismiss();
    }

    public static void n(ae0 ae0Var, TLRPC.ChatFull chatFull, org.telegram.ui.f70 f70Var) {
        org.telegram.ui.yh0 yh0Var = new org.telegram.ui.yh0(chatFull.f19870id, 0L, 0);
        yh0Var.g0(chatFull, chatFull.exported_invite);
        f70Var.presentFragment(yh0Var);
        super.dismiss();
    }

    public static void o(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            ae0Var.f24350s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(ae0Var.currentAccount).getChatFull(ae0Var.f24348n);
            if (chatFull != null) {
                chatFull.exported_invite = ae0Var.f24350s;
            }
            ae0Var.h.setLink(ae0Var.f24350s.link);
        }
        ae0Var.f24349r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        z6 z6Var = new z6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f24344b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f24345c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20770j5));
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.f20846n6));
        return arrayList;
    }

    public final void p(boolean z10) {
        if (this.f24349r) {
            return;
        }
        this.f24349r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f24348n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new di.u3(7, this, z10));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        this.f24346e.setBackground(org.telegram.ui.ActionBar.j6.K(dp, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        xi0 xi0Var = this.f24347f;
        xi0Var.O(w02, "Top");
        xi0Var.O(w02, "Bottom");
        xi0Var.O(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new cc0(this, 5), 50L);
    }
}

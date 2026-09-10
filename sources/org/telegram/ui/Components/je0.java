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
public final class je0 extends org.telegram.ui.ActionBar.h3 {
    public final TextView f24380b;
    public final TextView f24381c;
    public final TextView d;
    public final kj0 e;
    public final hj0 f24382f;
    public final f90 h;
    public final long f24383n;
    public boolean f24384r;
    public TLRPC.TL_chatInviteExported f24385s;

    public je0(Context context, org.telegram.ui.e70 e70Var, TLRPC.ChatFull chatFull, long j3, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f24383n = j3;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new g80(this, 5));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.a6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        f90 f90Var = new f90(context, e70Var, this, true, z10);
        this.h = f90Var;
        f90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.e = imageView2;
        hj0 hj0Var = new hj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f24382f = hj0Var;
        hj0Var.P(42);
        imageView2.setAnimation(hj0Var);
        f90Var.d(0, null, false);
        f90Var.b(true);
        f90Var.setDelegate(new pv(this, 9));
        TextView textView = new TextView(context);
        this.f24380b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        TextView textView2 = new TextView(context);
        this.f24381c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.em.k(R.string.ManageInviteLinks, textView3, 17);
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
        textView3.setOnClickListener(new bi.q(this, chatFull, e70Var, 21));
        linearLayout.addView((View) imageView2, w7.a6.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.a6.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.a6.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(f90Var, w7.a6.n(-1, -2));
        linearLayout.addView(textView3, w7.a6.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j3));
        if (chat != null && ChatObject.isPublic(chat)) {
            f90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            f90Var.setLink(tL_chatInviteExported.link);
        } else {
            p(false);
        }
        q();
    }

    public static void m(je0 je0Var) {
        super.dismiss();
    }

    public static void n(je0 je0Var, TLRPC.ChatFull chatFull, org.telegram.ui.e70 e70Var) {
        org.telegram.ui.zh0 zh0Var = new org.telegram.ui.zh0(chatFull.f17196id, 0L, 0);
        zh0Var.g0(chatFull, chatFull.exported_invite);
        e70Var.presentFragment(zh0Var);
        super.dismiss();
    }

    public static void o(je0 je0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            je0Var.f24385s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(je0Var.currentAccount).getChatFull(je0Var.f24383n);
            if (chatFull != null) {
                chatFull.exported_invite = je0Var.f24385s;
            }
            je0Var.h.setLink(je0Var.f24385s.link);
        }
        je0Var.f24384r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f24380b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f24381c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18034j5));
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.f18110n6));
        return arrayList;
    }

    public final void p(boolean z10) {
        if (this.f24384r) {
            return;
        }
        this.f24384r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f24383n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new bi.m4(7, this, z10));
    }

    public final void q() {
        int dp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        this.e.setBackground(org.telegram.ui.ActionBar.j6.K(dp, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
        hj0 hj0Var = this.f24382f;
        hj0Var.Q(w02, "Top");
        hj0Var.Q(w02, "Bottom");
        hj0Var.Q(w02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new kc0(this, 5), 50L);
    }
}

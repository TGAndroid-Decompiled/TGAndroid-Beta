package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 extends org.telegram.ui.ActionBar.h3 {
    public final TextView f32534b;
    public final bk0 f32535c;
    public final yj0 d;
    public final r90 e;
    public final long f32536f;
    public boolean h;
    public TLRPC.TL_chatInviteExported f32537n;
    public int f32538r;
    public int f32539s;
    public int v;

    public xe0(Context context, org.telegram.ui.p60 p60Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i10;
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f32536f = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21183d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i11 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i11), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ji, this.resourcesProvider, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new v80(this, 4));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        r90 r90Var = new r90(context, p60Var, this, true, z10);
        this.e = r90Var;
        r90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f32535c = imageView2;
        yj0 yj0Var = new yj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.d = yj0Var;
        yj0Var.P(42);
        imageView2.setAnimation(yj0Var);
        r90Var.d(0, null, false);
        r90Var.b(true);
        r90Var.setDelegate(new tv(this, 10));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
        TextView textView2 = new TextView(context);
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21289j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f32534b = textView3;
        org.telegram.messenger.sl.m(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.W(textView3, i12, null);
        int dp2 = AndroidUtilities.dp(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 120);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, 0, o10, o10);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 120);
        textView3.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(textView3, j02, null, h, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ai.v0(this, chatFull, p60Var, 28));
        linearLayout.addView((View) imageView2, w7.z5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(r90Var, w7.z5.n(-1, -2));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            r90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            r90Var.setLink(tL_chatInviteExported.link);
        } else {
            z11 = false;
            q(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, z11)));
            int dp3 = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, z11), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, z11);
            yj0Var.Q(x02, "Top");
            yj0Var.Q(x02, "Bottom");
            yj0Var.Q(x02, "Center");
            r90Var.f();
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, z11);
            this.f32539s = x03;
            setBackgroundColor(x03);
            this.f32538r = x02;
        }
        z11 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, z11)));
        int dp32 = AndroidUtilities.dp(8.0f);
        int o112 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.j0(dp32, dp32, dp32, dp32, 0, o112, o112));
        int x022 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, z11);
        yj0Var.Q(x022, "Top");
        yj0Var.Q(x022, "Bottom");
        yj0Var.Q(x022, "Center");
        r90Var.f();
        int x032 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, z11);
        this.f32539s = x032;
        setBackgroundColor(x032);
        this.f32538r = x022;
    }

    public static void m(xe0 xe0Var) {
        super.dismiss();
    }

    public static void n(xe0 xe0Var, TLRPC.ChatFull chatFull, org.telegram.ui.p60 p60Var) {
        org.telegram.ui.mh0 mh0Var = new org.telegram.ui.mh0(chatFull.f20344id, 0L, 0);
        mh0Var.h0(chatFull, chatFull.exported_invite);
        p60Var.presentFragment(mh0Var);
        super.dismiss();
    }

    public static void p(xe0 xe0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            xe0Var.f32537n = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(xe0Var.currentAccount).getChatFull(xe0Var.f32536f);
            if (chatFull != null) {
                chatFull.exported_invite = xe0Var.f32537n;
            }
            xe0Var.e.setLink(xe0Var.f32537n.link);
        }
        xe0Var.h = false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21366n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sh));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            bk0 bk0Var = this.f32535c;
            if (bk0Var != null) {
                org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false), bk0Var.getBackground());
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false), 120);
            TextView textView = this.f32534b;
            if (textView != null && o10 != this.v) {
                this.v = o10;
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), o10, true);
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
            yj0 yj0Var = this.d;
            if (yj0Var != null && x02 != this.f32538r) {
                this.f32538r = x02;
                yj0Var.Q(x02, "Top");
                yj0Var.Q(x02, "Bottom");
                yj0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false);
            if (x03 != this.f32539s) {
                this.f32539s = x03;
                setBackgroundColor(x03);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f32536f);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ei.o3(7, this, z10));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new yb0(this, 6), 50L);
    }
}

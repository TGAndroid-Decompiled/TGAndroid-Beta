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
public final class ve0 extends org.telegram.ui.ActionBar.h3 {
    public final TextView f31433b;
    public final ak0 f31434c;
    public final xj0 d;
    public final p90 e;
    public final long f31435f;
    public boolean h;
    public TLRPC.TL_chatInviteExported f31436n;
    public int f31437r;
    public int f31438s;
    public int v;

    public ve0(Context context, org.telegram.ui.p60 p60Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i10;
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f31435f = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21184d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i11 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(getThemedColor(i11), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ji, this.resourcesProvider, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new t80(this, 4));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        p90 p90Var = new p90(context, p60Var, this, true, z10);
        this.e = p90Var;
        p90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f31434c = imageView2;
        xj0 xj0Var = new xj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.d = xj0Var;
        xj0Var.P(42);
        imageView2.setAnimation(xj0Var);
        p90Var.d(0, null, false);
        p90Var.b(true);
        p90Var.setDelegate(new rv(this, 10));
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
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21290j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f31433b = textView3;
        org.telegram.messenger.tl.m(R.string.ManageInviteLinks, textView3, 17);
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
        linearLayout.addView(p90Var, w7.z5.n(-1, -2));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            p90Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
            p90Var.setLink(tL_chatInviteExported.link);
        } else {
            z11 = false;
            q(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, z11)));
            int dp3 = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, z11), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, z11);
            xj0Var.Q(x02, "Top");
            xj0Var.Q(x02, "Bottom");
            xj0Var.Q(x02, "Center");
            p90Var.f();
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, z11);
            this.f31438s = x03;
            setBackgroundColor(x03);
            this.f31437r = x02;
        }
        z11 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(90.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, z11)));
        int dp32 = AndroidUtilities.dp(8.0f);
        int o112 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i12, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.j0(dp32, dp32, dp32, dp32, 0, o112, o112));
        int x022 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, z11);
        xj0Var.Q(x022, "Top");
        xj0Var.Q(x022, "Bottom");
        xj0Var.Q(x022, "Center");
        p90Var.f();
        int x032 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, z11);
        this.f31438s = x032;
        setBackgroundColor(x032);
        this.f31437r = x022;
    }

    public static void m(ve0 ve0Var) {
        super.dismiss();
    }

    public static void n(ve0 ve0Var, TLRPC.ChatFull chatFull, org.telegram.ui.p60 p60Var) {
        org.telegram.ui.lh0 lh0Var = new org.telegram.ui.lh0(chatFull.f20345id, 0L, 0);
        lh0Var.h0(chatFull, chatFull.exported_invite);
        p60Var.presentFragment(lh0Var);
        super.dismiss();
    }

    public static void p(ve0 ve0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            ve0Var.f31436n = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(ve0Var.currentAccount).getChatFull(ve0Var.f31435f);
            if (chatFull != null) {
                chatFull.exported_invite = ve0Var.f31436n;
            }
            ve0Var.e.setLink(ve0Var.f31436n.link);
        }
        ve0Var.h = false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21367n6));
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
            ak0 ak0Var = this.f31434c;
            if (ak0Var != null) {
                org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false), ak0Var.getBackground());
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false), 120);
            TextView textView = this.f31433b;
            if (textView != null && o10 != this.v) {
                this.v = o10;
                org.telegram.ui.ActionBar.k6.E1(textView.getBackground(), o10, true);
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
            xj0 xj0Var = this.d;
            if (xj0Var != null && x02 != this.f31437r) {
                this.f31437r = x02;
                xj0Var.Q(x02, "Top");
                xj0Var.Q(x02, "Bottom");
                xj0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
            if (x03 != this.f31438s) {
                this.f31438s = x03;
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
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f31435f);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ei.o3(7, this, z10));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new wb0(this, 6), 50L);
    }
}

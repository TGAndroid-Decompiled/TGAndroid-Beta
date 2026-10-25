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
public final class te0 extends org.telegram.ui.ActionBar.k3 {
    public final TextView f32979b;
    public final ak0 f32980c;
    public final xj0 d;
    public final r90 e;
    public final long f32981f;
    public boolean h;
    public TLRPC.TL_chatInviteExported f32982n;
    public int f32983r;
    public int f32984s;
    public int v;

    public te0(Context context, org.telegram.ui.r60 r60Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i10;
        boolean z11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f32981f = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23354d6);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        int i11 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i11), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Ji, this.resourcesProvider, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new w80(this, 3));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, gb1.h(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        r90 r90Var = new r90(context, r60Var, this, true, z10);
        this.e = r90Var;
        r90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.f32980c = imageView2;
        xj0 xj0Var = new xj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.d = xj0Var;
        xj0Var.P(42);
        imageView2.setAnimation(xj0Var);
        r90Var.d(0, null, false);
        r90Var.b(true);
        r90Var.setDelegate(new tv(this, 11));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        TextView textView2 = new TextView(context);
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23462j5, null);
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.f32979b = textView3;
        org.telegram.messenger.vh.k(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.V(textView3, i12, null);
        int dp2 = AndroidUtilities.dp(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 120);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, o10, o10);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i12, 120);
        textView3.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView3, j02, null, h, null);
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new bi.w0(this, chatFull, r60Var, 28));
        linearLayout.addView((View) imageView2, gb1.x(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, gb1.x(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, gb1.x(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(r90Var, gb1.r(-1, -2));
        linearLayout.addView(textView3, gb1.x(-1, 48, 1, 14, -2, 14, 6));
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
            p(false);
            imageView2.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(90.0f), org.telegram.ui.ActionBar.y6.x0(null, i12, z11)));
            int dp3 = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, z11), 120);
            textView3.setBackground(org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, z11);
            xj0Var.Q(x02, "Top");
            xj0Var.Q(x02, "Bottom");
            xj0Var.Q(x02, "Center");
            r90Var.f();
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, z11);
            this.f32984s = x03;
            setBackgroundColor(x03);
            this.f32983r = x02;
        }
        z11 = false;
        imageView2.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(90.0f), org.telegram.ui.ActionBar.y6.x0(null, i12, z11)));
        int dp32 = AndroidUtilities.dp(8.0f);
        int o112 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i12, z11), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.y6.j0(dp32, dp32, dp32, dp32, 0, o112, o112));
        int x022 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, z11);
        xj0Var.Q(x022, "Top");
        xj0Var.Q(x022, "Bottom");
        xj0Var.Q(x022, "Center");
        r90Var.f();
        int x032 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, z11);
        this.f32984s = x032;
        setBackgroundColor(x032);
        this.f32983r = x022;
    }

    public static void m(te0 te0Var) {
        super.dismiss();
    }

    public static void n(te0 te0Var, TLRPC.ChatFull chatFull, org.telegram.ui.r60 r60Var) {
        org.telegram.ui.jh0 jh0Var = new org.telegram.ui.jh0(chatFull.f22028id, 0L, 0);
        jh0Var.i0(chatFull, chatFull.exported_invite);
        r60Var.presentFragment(jh0Var);
        super.dismiss();
    }

    public static void o(te0 te0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            te0Var.f32982n = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(te0Var.currentAccount).getChatFull(te0Var.f32981f);
            if (chatFull != null) {
                chatFull.exported_invite = te0Var.f32982n;
            }
            te0Var.e.setLink(te0Var.f32982n.link);
        }
        te0Var.h = false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23538n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sh));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ak0 ak0Var = this.f32980c;
            if (ak0Var != null) {
                org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false), ak0Var.getBackground());
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false), 120);
            TextView textView = this.f32979b;
            if (textView != null && o10 != this.v) {
                this.v = o10;
                org.telegram.ui.ActionBar.y6.E1(textView.getBackground(), o10, true);
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false);
            xj0 xj0Var = this.d;
            if (xj0Var != null && x02 != this.f32983r) {
                this.f32983r = x02;
                xj0Var.Q(x02, "Top");
                xj0Var.Q(x02, "Bottom");
                xj0Var.Q(x02, "Center");
            }
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false);
            if (x03 != this.f32984s) {
                this.f32984s = x03;
                setBackgroundColor(x03);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p(boolean z10) {
        if (this.h) {
            return;
        }
        this.h = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f32981f);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new fi.m3(7, this, z10));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new wa0(this, 7), 50L);
    }
}

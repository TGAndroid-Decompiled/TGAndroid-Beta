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
public final class af0 extends org.telegram.ui.ActionBar.e3 {
    public final TextView f23227b;
    public final TextView f23228c;
    public final TextView d;
    public final bk0 e;
    public final yj0 f23229f;
    public final w90 h;
    public final long f23230n;
    public boolean f23231r;
    public TLRPC.TL_chatInviteExported f23232s;

    public af0(Context context, org.telegram.ui.j70 j70Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        super(context, false);
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.f23230n = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new y80(this, 4));
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, w7.z5.a(36.0f, 6.0f, 8.0f, 8.0f, 0.0f, 36, 8388661));
        w90 w90Var = new w90(context, j70Var, this, true, z10);
        this.h = w90Var;
        w90Var.setPermanent(true);
        ?? imageView2 = new ImageView(context);
        this.e = imageView2;
        yj0 yj0Var = new yj0(R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f23229f = yj0Var;
        yj0Var.P(42);
        imageView2.setAnimation(yj0Var);
        w90Var.d(0, null, false);
        w90Var.b(true);
        w90Var.setDelegate(new xv(this, 10));
        TextView textView = new TextView(context);
        this.f23227b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        TextView textView2 = new TextView(context);
        this.f23228c = textView2;
        if (z10) {
            i10 = R.string.LinkInfoChannel;
        } else {
            i10 = R.string.LinkInfo;
        }
        textView2.setText(LocaleController.getString(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.sk.m(R.string.ManageInviteLinks, textView3, 17);
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
        linearLayout.addView((View) imageView2, w7.z5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(w90Var, w7.z5.n(-1, -2));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 1, 14, -2, 14, 6));
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

    public static void n(af0 af0Var) {
        super.dismiss();
    }

    public static void o(af0 af0Var, TLRPC.ChatFull chatFull, org.telegram.ui.j70 j70Var) {
        org.telegram.ui.di0 di0Var = new org.telegram.ui.di0(chatFull.f18917id, 0L, 0);
        di0Var.g0(chatFull, chatFull.exported_invite);
        j70Var.presentFragment(di0Var);
        super.dismiss();
    }

    public static void q(af0 af0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            af0Var.f23232s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(af0Var.currentAccount).getChatFull(af0Var.f23230n);
            if (chatFull != null) {
                chatFull.exported_invite = af0Var.f23232s;
            }
            af0Var.h.setLink(af0Var.f23232s.link);
        }
        af0Var.f23231r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        b7 b7Var = new b7(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f23227b, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f23228c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19707j5));
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.f19784n6));
        return arrayList;
    }

    public final void r(boolean z10) {
        if (this.f23231r) {
            return;
        }
        this.f23231r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f23230n);
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
        yj0 yj0Var = this.f23229f;
        yj0Var.Q(x02, "Top");
        yj0Var.Q(x02, "Bottom");
        yj0Var.Q(x02, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new yc0(this, 6), 50L);
    }
}

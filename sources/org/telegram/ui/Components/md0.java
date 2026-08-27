package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
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

public final class md0 extends org.telegram.ui.ActionBar.e3 {

    public final TextView f30647b;

    public final TextView f30648c;
    public final TextView d;

    public final ri0 f30649e;

    public final oi0 f30650f;
    public final i80 h;

    public final long f30651n;

    public boolean f30652r;

    public TLRPC.TL_chatInviteExported f30653s;

    public md0(Context context, org.telegram.ui.o60 o60Var, TLRPC.ChatFull chatFull, long j10, boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        super(context, false);
        this.f30651n = j10;
        setAllowNestedScroll(true);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new l70(this, 5));
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        frameLayout.addView(imageView, h7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        i80 i80Var = new i80(context, o60Var, this, true, z10);
        this.h = i80Var;
        i80Var.setPermanent(true);
        ri0 ri0Var = new ri0(context);
        this.f30649e = ri0Var;
        oi0 oi0Var = new oi0(R.raw.shared_link_enter, "" + R.raw.shared_link_enter, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f), false, null);
        this.f30650f = oi0Var;
        oi0Var.N(42);
        ri0Var.setAnimation(oi0Var);
        i80Var.d(0, null, false);
        i80Var.b(true);
        i80Var.setDelegate(new vu(this, 9));
        TextView textView = new TextView(context);
        this.f30647b = textView;
        textView.setText(LocaleController.getString(R.string.InviteLink));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        TextView textView2 = new TextView(context);
        this.f30648c = textView2;
        textView2.setText(LocaleController.getString(z10 ? R.string.LinkInfoChannel : R.string.LinkInfo));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        org.telegram.messenger.rl.i(R.string.ManageInviteLinks, textView3, 17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setSingleLine(true);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, 0, iK, iK));
        textView3.setLetterSpacing(0.025f);
        textView3.setOnClickListener(new ld0(this, chatFull, o60Var, 0));
        linearLayout.addView(ri0Var, h7.z5.t(90, 90, 1, 0, 33, 0, 0));
        linearLayout.addView(textView, h7.z5.t(-1, -2, 1, 60, 10, 60, 0));
        linearLayout.addView(textView2, h7.z5.t(-1, -2, 1, 28, 7, 28, 2));
        linearLayout.addView(i80Var, h7.z5.n(-1, -2));
        linearLayout.addView(textView3, h7.z5.t(-1, 48, 1, 14, -2, 14, 6));
        NestedScrollView nestedScrollView = new NestedScrollView(context, null);
        nestedScrollView.setVerticalScrollBarEnabled(false);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(j10));
        if (chat != null && ChatObject.isPublic(chat)) {
            i80Var.setLink("https://t.me/" + ChatObject.getPublicUsername(chat));
            textView3.setVisibility(8);
        } else if (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) {
            q(false);
        } else {
            i80Var.setLink(tL_chatInviteExported.link);
        }
        r();
    }

    public static void m(md0 md0Var) {
        super.dismiss();
    }

    public static void n(md0 md0Var, TLRPC.ChatFull chatFull, org.telegram.ui.o60 o60Var) {
        org.telegram.ui.kh0 kh0Var = new org.telegram.ui.kh0(chatFull.f22381id, 0L, 0);
        kh0Var.g0(chatFull, chatFull.exported_invite);
        o60Var.presentFragment(kh0Var);
        super.dismiss();
    }

    public static void p(md0 md0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            md0Var.f30653s = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(md0Var.currentAccount).getChatFull(md0Var.f30651n);
            if (chatFull != null) {
                chatFull.exported_invite = md0Var.f30653s;
            }
            md0Var.h.setLink(md0Var.f30653s.link);
        }
        md0Var.f30652r = false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30647b, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f30648c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23161j5));
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.f23234n6));
        return arrayList;
    }

    public final void q(boolean z10) {
        if (this.f30652r) {
            return;
        }
        this.f30652r = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(-this.f30651n);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new lh.n3(7, this, z10));
    }

    public final void r() {
        int iDp = AndroidUtilities.dp(90.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        this.f30649e.setBackground(org.telegram.ui.ActionBar.g6.K(iDp, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
        this.d.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, 0, iK, iK));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false);
        oi0 oi0Var = this.f30650f;
        oi0Var.O(iW0, "Top");
        oi0Var.O(iW0, "Bottom");
        oi0Var.O(iW0, "Center");
        this.h.f();
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new mb0(this, 5), 50L);
    }
}

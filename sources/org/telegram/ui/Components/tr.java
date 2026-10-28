package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tr extends bb {
    public final s80 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean f33124a0;
    public final boolean f33125b0;
    public boolean f33126c0;
    public TLRPC.Peer f33127d0;
    public TLRPC.InputPeer f33128e0;
    public final org.telegram.ui.ActionBar.r2 f33129f0;
    public final long f33130g0;

    public tr(org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList, long j10, s80 s80Var) {
        super(r2Var, false);
        boolean z10;
        String formatString;
        boolean z11;
        String formatString2;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f33129f0 = r2Var;
        this.f33130g0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = s80Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.f33125b0 = isChannelOrGiga;
        this.f33127d0 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
        this.f33124a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new bi.cc(this, context, 16), kb1.h(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        if (isChannelOrGiga) {
            formatString = LocaleController.formatString(R.string.VoipChannelStartVoiceChat, new Object[0]);
        } else {
            formatString = LocaleController.formatString(R.string.VoipGroupStartVoiceChat, new Object[0]);
        }
        textView.setText(formatString);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.y6.f23357d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, o10, o10);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 120);
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView, j02, N, h, null);
        this.containerView.addView(textView, kb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        if (isChannelOrGiga) {
            z11 = false;
            formatString2 = LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]);
        } else {
            z11 = false;
            formatString2 = LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]);
        }
        textView2.setText(formatString2);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
        int dp2 = AndroidUtilities.dp(8.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, z11), 120);
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, o11, o11);
        org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(i10, 120);
        textView2.setBackground(j03);
        org.telegram.ui.ActionBar.f7.k(textView2, j03, null, h10, null);
        this.containerView.addView(textView2, kb1.h(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final tr f32009b;

            {
                this.f32009b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        tr.P(this.f32009b);
                        return;
                    default:
                        tr.Q(this.f32009b);
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final tr f32009b;

            {
                this.f32009b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        tr.P(this.f32009b);
                        return;
                    default:
                        tr.Q(this.f32009b);
                        return;
                }
            }
        });
        nm0 nm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        N();
    }

    public static void P(tr trVar) {
        trVar.f33128e0 = MessagesController.getInstance(trVar.currentAccount).getInputPeer(MessageObject.getPeerId(trVar.f33127d0));
        trVar.dismiss();
    }

    public static void Q(tr trVar) {
        trVar.f33128e0 = MessagesController.getInstance(trVar.currentAccount).getInputPeer(MessageObject.getPeerId(trVar.f33127d0));
        trVar.f33126c0 = true;
        trVar.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f33128e0;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.Y.size() <= 1) {
                z10 = false;
            }
            this.X.a(inputPeer, z10, this.f33126c0, false);
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        return new rr(this);
    }

    @Override
    public final CharSequence y() {
        if (this.f33125b0) {
            return LocaleController.getString(R.string.StartVoipChannelTitle);
        }
        return LocaleController.getString(R.string.StartVoipChatTitle);
    }
}

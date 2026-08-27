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

public final class uq extends qa {
    public final i70 T;
    public final ArrayList U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public boolean Y;
    public TLRPC.Peer Z;

    public TLRPC.InputPeer f33166a0;

    public final org.telegram.ui.ActionBar.n2 f33167b0;

    public final long f33168c0;

    public uq(org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, long j10, i70 i70Var) {
        super(n2Var, false);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f33167b0 = n2Var;
        this.f33168c0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U = arrayList2;
        this.T = i70Var;
        boolean zIsChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.X = zIsChannelOrGiga;
        this.Z = (TLRPC.Peer) arrayList2.get(0);
        this.V = arrayList2.size() > 1;
        this.W = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new ag.s0(this, context, 15), h7.z5.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(zIsChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelStartVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStartVoiceChat, new Object[0]));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int iDp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW0, iK, iK));
        this.containerView.addView(textView, h7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(zIsChannelOrGiga ? LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]) : LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]));
        textView2.setLetterSpacing(0.025f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int iK2 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, 0, iK2, iK2));
        this.containerView.addView(textView2, h7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i11 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final uq f32254b;

            {
                this.f32254b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        uq.P(this.f32254b);
                        break;
                    default:
                        uq.Q(this.f32254b);
                        break;
                }
            }
        });
        final int i12 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) {

            public final uq f32254b;

            {
                this.f32254b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        uq.P(this.f32254b);
                        break;
                    default:
                        uq.Q(this.f32254b);
                        break;
                }
            }
        });
        zk0 zk0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        N();
    }

    public static void P(uq uqVar) {
        uqVar.f33166a0 = MessagesController.getInstance(uqVar.currentAccount).getInputPeer(MessageObject.getPeerId(uqVar.Z));
        uqVar.dismiss();
    }

    public static void Q(uq uqVar) {
        uqVar.f33166a0 = MessagesController.getInstance(uqVar.currentAccount).getInputPeer(MessageObject.getPeerId(uqVar.Z));
        uqVar.Y = true;
        uqVar.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f33166a0;
        if (inputPeer != null) {
            this.T.a(inputPeer, this.U.size() > 1, this.Y, false);
        }
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        return new sq(this);
    }

    @Override
    public final CharSequence z() {
        return this.X ? LocaleController.getString(R.string.StartVoipChannelTitle) : LocaleController.getString(R.string.StartVoipChatTitle);
    }
}

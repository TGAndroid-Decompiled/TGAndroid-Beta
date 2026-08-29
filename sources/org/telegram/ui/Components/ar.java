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
public final class ar extends xa {
    public final r70 T;
    public final ArrayList U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public boolean Y;
    public TLRPC.Peer Z;
    public TLRPC.InputPeer f26836a0;
    public final org.telegram.ui.ActionBar.o2 f26837b0;
    public final long f26838c0;

    public ar(org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, long j10, r70 r70Var) {
        super(o2Var, false);
        boolean z10;
        String formatString;
        String formatString2;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f26837b0 = o2Var;
        this.f26838c0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U = arrayList2;
        this.T = r70Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.X = isChannelOrGiga;
        this.Z = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
        this.W = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new cg.h0(this, context, 13), i7.f6.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
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
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w02, k9, k9));
        this.containerView.addView(textView, i7.f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        if (isChannelOrGiga) {
            formatString2 = LocaleController.formatString(R.string.VoipChannelScheduleVoiceChat, new Object[0]);
        } else {
            formatString2 = LocaleController.formatString(R.string.VoipGroupScheduleVoiceChat, new Object[0]);
        }
        textView2.setText(formatString2);
        textView2.setLetterSpacing(0.025f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        this.containerView.addView(textView2, i7.f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ar f34818b;

            {
                this.f34818b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ar.P(this.f34818b);
                        return;
                    default:
                        ar.Q(this.f34818b);
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ar f34818b;

            {
                this.f34818b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ar.P(this.f34818b);
                        return;
                    default:
                        ar.Q(this.f34818b);
                        return;
                }
            }
        });
        jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new k(this, 4));
        fixNavigationBar();
        M();
    }

    public static void P(ar arVar) {
        arVar.f26836a0 = MessagesController.getInstance(arVar.currentAccount).getInputPeer(MessageObject.getPeerId(arVar.Z));
        arVar.dismiss();
    }

    public static void Q(ar arVar) {
        arVar.f26836a0 = MessagesController.getInstance(arVar.currentAccount).getInputPeer(MessageObject.getPeerId(arVar.Z));
        arVar.Y = true;
        arVar.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f26836a0;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.U.size() <= 1) {
                z10 = false;
            }
            this.T.a(inputPeer, z10, this.Y, false);
        }
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        return new yq(this);
    }

    @Override
    public final CharSequence y() {
        if (this.X) {
            return LocaleController.getString(R.string.StartVoipChannelTitle);
        }
        return LocaleController.getString(R.string.StartVoipChatTitle);
    }
}

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
public final class gr extends ab {
    public final c80 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean f24439a0;
    public final boolean f24440b0;
    public boolean f24441c0;
    public TLRPC.Peer f24442d0;
    public TLRPC.InputPeer f24443e0;
    public final org.telegram.ui.ActionBar.n2 f24444f0;
    public final long f24445g0;

    public gr(org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, long j3, c80 c80Var) {
        super(n2Var, false);
        boolean z10;
        String formatString;
        String formatString2;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f24444f0 = n2Var;
        this.f24445g0 = j3;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = c80Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.f24440b0 = isChannelOrGiga;
        this.f24442d0 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
        this.f24439a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new ci.eb(this, context, 16), w7.y5.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
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
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        this.containerView.addView(textView2, w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final gr f23632b;

            {
                this.f23632b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gr.P(this.f23632b);
                        return;
                    default:
                        gr.Q(this.f23632b);
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final gr f23632b;

            {
                this.f23632b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gr.P(this.f23632b);
                        return;
                    default:
                        gr.Q(this.f23632b);
                        return;
                }
            }
        });
        vl0 vl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        N();
    }

    public static void P(gr grVar) {
        grVar.f24443e0 = MessagesController.getInstance(grVar.currentAccount).getInputPeer(MessageObject.getPeerId(grVar.f24442d0));
        grVar.dismiss();
    }

    public static void Q(gr grVar) {
        grVar.f24443e0 = MessagesController.getInstance(grVar.currentAccount).getInputPeer(MessageObject.getPeerId(grVar.f24442d0));
        grVar.f24441c0 = true;
        grVar.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f24443e0;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.Y.size() <= 1) {
                z10 = false;
            }
            this.X.a(inputPeer, z10, this.f24441c0, false);
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        return new er(this);
    }

    @Override
    public final CharSequence y() {
        if (this.f24440b0) {
            return LocaleController.getString(R.string.StartVoipChannelTitle);
        }
        return LocaleController.getString(R.string.StartVoipChatTitle);
    }
}

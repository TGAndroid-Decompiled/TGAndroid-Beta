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
public final class gr extends sa {
    public final y70 U;
    public final ArrayList V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public boolean Z;
    public TLRPC.Peer f27233a0;
    public TLRPC.InputPeer f27234b0;
    public final org.telegram.ui.ActionBar.p2 f27235c0;
    public final long f27236d0;

    public gr(org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, long j10, y70 y70Var) {
        super(p2Var, false);
        boolean z4;
        String formatString;
        String formatString2;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f27235c0 = p2Var;
        this.f27236d0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.V = arrayList2;
        this.U = y70Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.Y = isChannelOrGiga;
        this.f27233a0 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.W = z4;
        this.X = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new fg.h0(this, context, 11), k7.c6.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
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
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, w02, k10, k10));
        this.containerView.addView(textView, k7.c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        this.containerView.addView(textView2, k7.c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final gr f26355b;

            {
                this.f26355b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gr.P(this.f26355b);
                        return;
                    default:
                        gr.Q(this.f26355b);
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final gr f26355b;

            {
                this.f26355b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gr.P(this.f26355b);
                        return;
                    default:
                        gr.Q(this.f26355b);
                        return;
                }
            }
        });
        sl0 sl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new k(this, 4));
        fixNavigationBar();
        N();
    }

    public static void P(gr grVar) {
        grVar.f27234b0 = MessagesController.getInstance(grVar.currentAccount).getInputPeer(MessageObject.getPeerId(grVar.f27233a0));
        grVar.dismiss();
    }

    public static void Q(gr grVar) {
        grVar.f27234b0 = MessagesController.getInstance(grVar.currentAccount).getInputPeer(MessageObject.getPeerId(grVar.f27233a0));
        grVar.Z = true;
        grVar.dismiss();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f27234b0;
        if (inputPeer != null) {
            boolean z4 = true;
            if (this.V.size() <= 1) {
                z4 = false;
            }
            this.U.a(inputPeer, z4, this.Z, false);
        }
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        return new er(this);
    }

    @Override
    public final CharSequence y() {
        if (this.Y) {
            return LocaleController.getString(R.string.StartVoipChannelTitle);
        }
        return LocaleController.getString(R.string.StartVoipChatTitle);
    }
}

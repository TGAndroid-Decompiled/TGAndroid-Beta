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
public final class rr extends bb {
    public final p80 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean f30021a0;
    public final boolean f30022b0;
    public boolean f30023c0;
    public TLRPC.Peer f30024d0;
    public TLRPC.InputPeer f30025e0;
    public final org.telegram.ui.ActionBar.n2 f30026f0;
    public final long f30027g0;

    public rr(org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, long j10, p80 p80Var) {
        super(n2Var, false);
        boolean z10;
        String formatString;
        String formatString2;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.f30026f0 = n2Var;
        this.f30027g0 = j10;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = p80Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.f30022b0 = isChannelOrGiga;
        this.f30024d0 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
        this.f30021a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new ai.ic(this, context, 17), w7.z5.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
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
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, o10, o10));
        this.containerView.addView(textView, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int dp2 = AndroidUtilities.dp(8.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        this.containerView.addView(textView2, w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final rr f29053b;

            {
                this.f29053b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        rr.Q(this.f29053b);
                        return;
                    default:
                        rr.R(this.f29053b);
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final rr f29053b;

            {
                this.f29053b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        rr.Q(this.f29053b);
                        return;
                    default:
                        rr.R(this.f29053b);
                        return;
                }
            }
        });
        im0 im0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        im0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        O();
    }

    public static void Q(rr rrVar) {
        rrVar.f30025e0 = MessagesController.getInstance(rrVar.currentAccount).getInputPeer(MessageObject.getPeerId(rrVar.f30024d0));
        rrVar.dismiss();
    }

    public static void R(rr rrVar) {
        rrVar.f30025e0 = MessagesController.getInstance(rrVar.currentAccount).getInputPeer(MessageObject.getPeerId(rrVar.f30024d0));
        rrVar.f30023c0 = true;
        rrVar.dismiss();
    }

    @Override
    public final CharSequence A() {
        if (this.f30022b0) {
            return LocaleController.getString(R.string.StartVoipChannelTitle);
        }
        return LocaleController.getString(R.string.StartVoipChatTitle);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f30025e0;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.Y.size() <= 1) {
                z10 = false;
            }
            this.X.a(inputPeer, z10, this.f30023c0, false);
        }
    }

    @Override
    public final hm0 x(im0 im0Var) {
        return new pr(this);
    }
}

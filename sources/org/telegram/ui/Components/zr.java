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
public final class zr extends db {
    public final a90 X;
    public final ArrayList Y;
    public final boolean Z;
    public final boolean f33477a0;
    public final boolean f33478b0;
    public boolean f33479c0;
    public TLRPC.Peer f33480d0;
    public TLRPC.InputPeer f33481e0;
    public final org.telegram.ui.ActionBar.m2 f33482f0;
    public final long f33483g0;

    public zr(org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, long j3, a90 a90Var) {
        super(m2Var, false);
        boolean z10;
        String formatString;
        String formatString2;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.f33482f0 = m2Var;
        this.f33483g0 = j3;
        this.v = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Y = arrayList2;
        this.X = a90Var;
        boolean isChannelOrGiga = ChatObject.isChannelOrGiga(chat);
        this.f33478b0 = isChannelOrGiga;
        this.f33480d0 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
        this.f33477a0 = ChatObject.canManageCalls(chat);
        Context context = this.containerView.getContext();
        this.containerView.addView(new ci.bb(this, context, 16), w7.w5.a(120.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
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
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false), 120);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, k10, k10));
        this.containerView.addView(textView, w7.w5.a(48.0f, 16.0f, 0.0f, 16.0f, 60.0f, -1, 80));
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
        int k11 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 120);
        textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        this.containerView.addView(textView2, w7.w5.a(48.0f, 16.0f, 0.0f, 16.0f, 6.0f, -1, 80));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final zr f32537b;

            {
                this.f32537b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        zr.Q(this.f32537b);
                        return;
                    default:
                        zr.R(this.f32537b);
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final zr f32537b;

            {
                this.f32537b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        zr.Q(this.f32537b);
                        return;
                    default:
                        zr.R(this.f32537b);
                        return;
                }
            }
        });
        wm0 wm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(120.0f));
        this.d.setOnItemClickListener(new j(this, 4));
        fixNavigationBar();
        O();
    }

    public static void Q(zr zrVar) {
        zrVar.f33481e0 = MessagesController.getInstance(zrVar.currentAccount).getInputPeer(MessageObject.getPeerId(zrVar.f33480d0));
        zrVar.dismiss();
    }

    public static void R(zr zrVar) {
        zrVar.f33481e0 = MessagesController.getInstance(zrVar.currentAccount).getInputPeer(MessageObject.getPeerId(zrVar.f33480d0));
        zrVar.f33479c0 = true;
        zrVar.dismiss();
    }

    @Override
    public final CharSequence A() {
        if (this.f33478b0) {
            return LocaleController.getString(R.string.StartVoipChannelTitle);
        }
        return LocaleController.getString(R.string.StartVoipChatTitle);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.f33481e0;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.Y.size() <= 1) {
                z10 = false;
            }
            this.X.a(inputPeer, z10, this.f33479c0, false);
        }
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        return new xr(this);
    }
}

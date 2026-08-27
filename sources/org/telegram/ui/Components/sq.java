package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class sq extends yk0 {

    public final uq f32554c;

    public sq(uq uqVar) {
        this.f32554c = uqVar;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 3;
    }

    @Override
    public final int h() {
        uq uqVar = this.f32554c;
        if (uqVar.V) {
            return uqVar.U.size() + 3;
        }
        return uqVar.W ? 2 : 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLObject chat;
        String string;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 3) {
            if (i11 != 2) {
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.x8) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.g6.L6, 0, new lp(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            } else {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                j4Var.setTextSize(15.0f);
                j4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                j4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
                return;
            }
        }
        uq uqVar = this.f32554c;
        TLRPC.Peer peer = (TLRPC.Peer) uqVar.U.get(i10 - 3);
        long peerId = MessageObject.getPeerId(peer);
        if (peerId > 0) {
            chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) uqVar).currentAccount).getUser(Long.valueOf(peerId));
            string = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) uqVar).currentAccount).getChat(Long.valueOf(-peerId));
            string = null;
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        d4Var.e(chat, null, string, i10 != h() - 1);
        d4Var.c(peer == uqVar.Z, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        Context context = viewGroup.getContext();
        uq uqVar = this.f32554c;
        if (i10 == 1) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, ((org.telegram.ui.ActionBar.e3) uqVar).resourcesProvider));
            x8Var.setTopPadding(17);
            x8Var.setBottomPadding(17);
            j4Var = x8Var;
        } else if (i10 == 2) {
            j4Var = new org.telegram.ui.Cells.j4(context, 22);
        } else if (i10 != 3) {
            boolean z10 = uqVar.X;
            tq tqVar = new tq(context);
            tqVar.setOrientation(1);
            ri0 ri0Var = new ri0(context);
            ri0Var.setAutoRepeat(true);
            ri0Var.f(R.raw.utyan_schedule, 112, 112, null);
            ri0Var.d();
            tqVar.addView(ri0Var, h7.z5.t(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z10 ? LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]) : LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            tqVar.addView(textView, h7.z5.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
            textView2.setText(z10 ? LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]) : LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            tqVar.addView(textView2, h7.z5.t(-2, -2, 1, 28, 0, 28, 17));
            j4Var = tqVar;
        } else {
            j4Var = new org.telegram.ui.Cells.d4(context, 1, 0, false);
        }
        j4Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(j4Var);
    }
}

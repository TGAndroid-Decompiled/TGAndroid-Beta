package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uq extends vk0 {
    public final wq f33114c;

    public uq(wq wqVar) {
        this.f33114c = wqVar;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        wq wqVar = this.f33114c;
        if (wqVar.V) {
            return wqVar.U.size() + 3;
        }
        if (wqVar.W) {
            return 2;
        }
        return 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 != 0) {
            int i10 = 1;
            if (i9 != 1) {
                i10 = 2;
                if (i9 != 2) {
                    return 3;
                }
            }
            return i10;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLObject chat;
        String str;
        boolean z10;
        int i11;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z11 = true;
        if (i12 == 3) {
            wq wqVar = this.f33114c;
            TLRPC.Peer peer = (TLRPC.Peer) wqVar.U.get(i9 - 3);
            long peerId = MessageObject.getPeerId(peer);
            if (peerId > 0) {
                i11 = ((org.telegram.ui.ActionBar.f3) wqVar).currentAccount;
                chat = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
            } else {
                i10 = ((org.telegram.ui.ActionBar.f3) wqVar).currentAccount;
                chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                str = null;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (i9 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.e(chat, null, str, z10);
            if (peer != wqVar.Z) {
                z11 = false;
            }
            g4Var.c(z11, false);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
        } else if (i12 == 1) {
            ((org.telegram.ui.Cells.b9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.f6.L6, 0, new np(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        FrameLayout frameLayout;
        String formatString;
        String formatString2;
        Context context = viewGroup.getContext();
        wq wqVar = this.f33114c;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    boolean z10 = wqVar.X;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(R.raw.utyan_schedule, 112, 112, null);
                    imageView.d();
                    linearLayout.addView((View) imageView, g7.e6.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(AndroidUtilities.bold());
                    if (z10) {
                        formatString = LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]);
                    } else {
                        formatString = LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]);
                    }
                    textView.setText(formatString);
                    textView.setTextSize(1, 20.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                    linearLayout.addView(textView, g7.e6.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
                    if (z10) {
                        formatString2 = LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]);
                    }
                    textView2.setText(formatString2);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    linearLayout.addView(textView2, g7.e6.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = linearLayout;
                } else {
                    frameLayout = new org.telegram.ui.Cells.g4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.m4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
            b6Var = ((org.telegram.ui.ActionBar.f3) wqVar).resourcesProvider;
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            b9Var.setTopPadding(17);
            b9Var.setBottomPadding(17);
            frameLayout = b9Var;
        }
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(frameLayout);
    }
}

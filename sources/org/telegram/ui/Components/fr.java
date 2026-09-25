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
public final class fr extends vl0 {
    public final hr f24261c;

    public fr(hr hrVar) {
        this.f24261c = hrVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42964f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        hr hrVar = this.f24261c;
        if (hrVar.Z) {
            return hrVar.Y.size() + 3;
        }
        if (hrVar.f24852a0) {
            return 2;
        }
        return 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    return 3;
                }
            }
            return i11;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        boolean z10;
        int i12;
        int i13 = c1Var.f42964f;
        View view = c1Var.f42961a;
        boolean z11 = true;
        if (i13 == 3) {
            hr hrVar = this.f24261c;
            TLRPC.Peer peer = (TLRPC.Peer) hrVar.Y.get(i10 - 3);
            long peerId = MessageObject.getPeerId(peer);
            if (peerId > 0) {
                i12 = ((org.telegram.ui.ActionBar.e3) hrVar).currentAccount;
                chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
            } else {
                i11 = ((org.telegram.ui.ActionBar.e3) hrVar).currentAccount;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                str = null;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.e(chat, null, str, z10);
            if (peer != hrVar.f24855d0) {
                z11 = false;
            }
            g4Var.c(z11, false);
        } else if (i13 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
        } else if (i13 == 1) {
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.h6.L6, 0, new yp(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        FrameLayout frameLayout;
        String formatString;
        String formatString2;
        Context context = viewGroup.getContext();
        hr hrVar = this.f24261c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    boolean z10 = hrVar.f24853b0;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(R.raw.utyan_schedule, 112, 112, null);
                    imageView.d();
                    linearLayout.addView((View) imageView, w7.y5.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(AndroidUtilities.bold());
                    if (z10) {
                        formatString = LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]);
                    } else {
                        formatString = LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]);
                    }
                    textView.setText(formatString);
                    textView.setTextSize(1, 20.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
                    linearLayout.addView(textView, w7.y5.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false));
                    if (z10) {
                        formatString2 = LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]);
                    }
                    textView2.setText(formatString2);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    linearLayout.addView(textView2, w7.y5.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = linearLayout;
                } else {
                    frameLayout = new org.telegram.ui.Cells.g4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.m4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            int i11 = org.telegram.ui.ActionBar.h6.f19004a7;
            d6Var = ((org.telegram.ui.ActionBar.e3) hrVar).resourcesProvider;
            e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            e9Var.setTopPadding(17);
            e9Var.setBottomPadding(17);
            frameLayout = e9Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}

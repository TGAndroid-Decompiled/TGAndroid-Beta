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
public final class cr extends rl0 {
    public final er f24041c;

    public cr(er erVar) {
        this.f24041c = erVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        er erVar = this.f24041c;
        if (erVar.W) {
            return erVar.V.size() + 3;
        }
        if (erVar.X) {
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
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        boolean z4;
        int i12;
        int i13 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z10 = true;
        if (i13 == 3) {
            er erVar = this.f24041c;
            TLRPC.Peer peer = (TLRPC.Peer) erVar.V.get(i10 - 3);
            long peerId = MessageObject.getPeerId(peer);
            if (peerId > 0) {
                i12 = ((org.telegram.ui.ActionBar.g3) erVar).currentAccount;
                chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
            } else {
                i11 = ((org.telegram.ui.ActionBar.g3) erVar).currentAccount;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                str = null;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (i10 != h() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            g4Var.e(chat, null, str, z4);
            if (peer != erVar.f24633a0) {
                z10 = false;
            }
            g4Var.c(z10, false);
        } else if (i13 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
        } else if (i13 == 1) {
            ((org.telegram.ui.Cells.a9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.j6.L6, 0, new vp(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        FrameLayout frameLayout;
        String formatString;
        String formatString2;
        Context context = viewGroup.getContext();
        er erVar = this.f24041c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    boolean z4 = erVar.Y;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(R.raw.utyan_schedule, 112, 112, null);
                    imageView.d();
                    linearLayout.addView((View) imageView, k7.b6.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(AndroidUtilities.bold());
                    if (z4) {
                        formatString = LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]);
                    } else {
                        formatString = LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]);
                    }
                    textView.setText(formatString);
                    textView.setTextSize(1, 20.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                    linearLayout.addView(textView, k7.b6.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
                    if (z4) {
                        formatString2 = LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]);
                    }
                    textView2.setText(formatString2);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    linearLayout.addView(textView2, k7.b6.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = linearLayout;
                } else {
                    frameLayout = new org.telegram.ui.Cells.g4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.m4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            int i11 = org.telegram.ui.ActionBar.j6.f19852a7;
            f6Var = ((org.telegram.ui.ActionBar.g3) erVar).resourcesProvider;
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            a9Var.setTopPadding(17);
            a9Var.setBottomPadding(17);
            frameLayout = a9Var;
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(frameLayout);
    }
}

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
public final class yq extends il0 {
    public final ar f35119c;

    public yq(ar arVar) {
        this.f35119c = arVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        ar arVar = this.f35119c;
        if (arVar.V) {
            return arVar.U.size() + 3;
        }
        if (arVar.W) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        boolean z10;
        int i12;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z11 = true;
        if (i13 == 3) {
            ar arVar = this.f35119c;
            TLRPC.Peer peer = (TLRPC.Peer) arVar.U.get(i10 - 3);
            long peerId = MessageObject.getPeerId(peer);
            if (peerId > 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) arVar).currentAccount;
                chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
            } else {
                i11 = ((org.telegram.ui.ActionBar.f3) arVar).currentAccount;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                str = null;
            }
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            e4Var.e(chat, null, str, z10);
            if (peer != arVar.Z) {
                z11 = false;
            }
            e4Var.c(z11, false);
        } else if (i13 == 2) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            k4Var.setTextSize(15.0f);
            k4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            k4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
        } else if (i13 == 1) {
            ((org.telegram.ui.Cells.y8) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.g6.L6, 0, new rp(this, 3)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        FrameLayout frameLayout;
        String formatString;
        String formatString2;
        Context context = viewGroup.getContext();
        ar arVar = this.f35119c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    boolean z10 = arVar.X;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(R.raw.utyan_schedule, 112, 112, null);
                    imageView.d();
                    linearLayout.addView((View) imageView, i7.f6.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(AndroidUtilities.bold());
                    if (z10) {
                        formatString = LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]);
                    } else {
                        formatString = LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]);
                    }
                    textView.setText(formatString);
                    textView.setTextSize(1, 20.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                    linearLayout.addView(textView, i7.f6.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                    if (z10) {
                        formatString2 = LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]);
                    }
                    textView2.setText(formatString2);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    linearLayout.addView(textView2, i7.f6.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = linearLayout;
                } else {
                    frameLayout = new org.telegram.ui.Cells.e4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.k4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
            c6Var = ((org.telegram.ui.ActionBar.f3) arVar).resourcesProvider;
            y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            y8Var.setTopPadding(17);
            y8Var.setBottomPadding(17);
            frameLayout = y8Var;
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(frameLayout);
    }
}

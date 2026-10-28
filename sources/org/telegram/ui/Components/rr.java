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
public final class rr extends mm0 {
    public final tr f32325c;

    public rr(tr trVar) {
        this.f32325c = trVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        tr trVar = this.f32325c;
        if (trVar.Z) {
            return trVar.Y.size() + 3;
        }
        if (trVar.f33124a0) {
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        boolean z10;
        int i12;
        int i13 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z11 = true;
        if (i13 == 3) {
            tr trVar = this.f32325c;
            TLRPC.Peer peer = (TLRPC.Peer) trVar.Y.get(i10 - 3);
            long peerId = MessageObject.getPeerId(peer);
            if (peerId > 0) {
                i12 = ((org.telegram.ui.ActionBar.k3) trVar).currentAccount;
                chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
            } else {
                i11 = ((org.telegram.ui.ActionBar.k3) trVar).currentAccount;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                str = null;
            }
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k4Var.e(chat, null, str, z10);
            if (peer != trVar.f33127d0) {
                z11 = false;
            }
            k4Var.c(z11, false);
        } else if (i13 == 2) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            q4Var.setTextSize(15.0f);
            q4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            q4Var.setText(LocaleController.getString(R.string.VoipChatDisplayedAs).replace(":", ""));
        } else if (i13 == 1) {
            ((org.telegram.ui.Cells.i9) view).setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.VoipChatStreamWithAnotherApp), org.telegram.ui.ActionBar.y6.L6, 0, new cp(this, 5)), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        FrameLayout frameLayout;
        String formatString;
        String formatString2;
        Context context = viewGroup.getContext();
        tr trVar = this.f32325c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    boolean z10 = trVar.f33125b0;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(R.raw.utyan_schedule, 112, 112, null);
                    imageView.d();
                    linearLayout.addView((View) imageView, kb1.x(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(AndroidUtilities.bold());
                    if (z10) {
                        formatString = LocaleController.formatString(R.string.StartVoipChannelTitle, new Object[0]);
                    } else {
                        formatString = LocaleController.formatString(R.string.StartVoipChatTitle, new Object[0]);
                    }
                    textView.setText(formatString);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                    linearLayout.addView(textView, kb1.x(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23465j5, null);
                    if (z10) {
                        formatString2 = LocaleController.formatString(R.string.VoipChannelStart2, new Object[0]);
                    } else {
                        formatString2 = LocaleController.formatString(R.string.VoipGroupStart2, new Object[0]);
                    }
                    textView2.setText(formatString2);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    linearLayout.addView(textView2, kb1.x(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = linearLayout;
                } else {
                    frameLayout = new org.telegram.ui.Cells.k4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.q4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            int i11 = org.telegram.ui.ActionBar.y6.f23300a7;
            u6Var = ((org.telegram.ui.ActionBar.k3) trVar).resourcesProvider;
            org.telegram.ui.ActionBar.f7.i(i11, i9Var, u6Var);
            i9Var.setTopPadding(17);
            i9Var.setBottomPadding(17);
            frameLayout = i9Var;
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(frameLayout);
    }
}

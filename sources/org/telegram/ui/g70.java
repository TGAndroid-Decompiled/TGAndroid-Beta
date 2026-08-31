package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g70 extends org.telegram.ui.Components.sl0 {
    public final Context f37108c;
    public final h70 d;

    public g70(h70 h70Var, Context context) {
        this.d = h70Var;
        this.f37108c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        h70 h70Var = this.d;
        if (b10 != h70Var.f37346r && b10 != h70Var.f37345n && b10 != h70Var.f37347s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        h70 h70Var = this.d;
        if (h70Var.f37343e) {
            return 0;
        }
        return h70Var.f37348w;
    }

    @Override
    public final int j(int i10) {
        h70 h70Var = this.d;
        if (i10 != h70Var.f37345n && i10 != h70Var.f37347s && i10 != h70Var.f37346r) {
            if (i10 != h70Var.v && i10 != h70Var.h) {
                if (i10 == 0) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        h70 h70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = h70Var.f37344f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    n8Var.f23232a.setText(str);
                    n8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            int i12 = h70Var.v;
            Context context = this.f37108c;
            if (i10 == i12) {
                a9Var.setText("");
                a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                return;
            } else if (i10 == h70Var.h) {
                TLRPC.Chat chat = h70Var.getMessagesController().getChat(Long.valueOf(h70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    a9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    a9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21624b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
        if (i10 == h70Var.f37345n) {
            aaVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == h70Var.f37347s) {
            aaVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == h70Var.f37346r) {
            aaVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f37108c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f23232a = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                textView.setTextSize(1, 16.0f);
                int i12 = 3;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11 | 16);
                if (LocaleController.isRTL) {
                    i12 = 5;
                }
                frameLayout2.addView(textView, k7.c6.d(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            FrameLayout aaVar = new org.telegram.ui.Cells.aa(context);
            aaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
            frameLayout = aaVar;
        }
        return new f2.m1(frameLayout);
    }
}

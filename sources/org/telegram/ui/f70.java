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
public final class f70 extends org.telegram.ui.Components.rl0 {
    public final Context f34179c;
    public final g70 d;

    public f70(g70 g70Var, Context context) {
        this.d = g70Var;
        this.f34179c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        g70 g70Var = this.d;
        if (b10 != g70Var.f34465r && b10 != g70Var.f34464n && b10 != g70Var.f34466s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        g70 g70Var = this.d;
        if (g70Var.e) {
            return 0;
        }
        return g70Var.f34467w;
    }

    @Override
    public final int j(int i10) {
        g70 g70Var = this.d;
        if (i10 != g70Var.f34464n && i10 != g70Var.f34466s && i10 != g70Var.f34465r) {
            if (i10 != g70Var.v && i10 != g70Var.h) {
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
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        g70 g70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = g70Var.f34463f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    n8Var.f21454a.setText(str);
                    n8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            int i12 = g70Var.v;
            Context context = this.f34179c;
            if (i10 == i12) {
                a9Var.setText("");
                a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
                return;
            } else if (i10 == g70Var.h) {
                TLRPC.Chat chat = g70Var.getMessagesController().getChat(Long.valueOf(g70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    a9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    a9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19871b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
        if (i10 == g70Var.f34464n) {
            aaVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == g70Var.f34466s) {
            aaVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == g70Var.f34465r) {
            aaVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f34179c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f21454a = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
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
                frameLayout2.addView(textView, k7.b6.d(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            FrameLayout aaVar = new org.telegram.ui.Cells.aa(context);
            aaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            frameLayout = aaVar;
        }
        return new f2.l1(frameLayout);
    }
}

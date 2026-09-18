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
public final class o70 extends org.telegram.ui.Components.ll0 {
    public final Context f36245c;
    public final p70 d;

    public o70(p70 p70Var, Context context) {
        this.d = p70Var;
        this.f36245c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        p70 p70Var = this.d;
        if (b10 != p70Var.f36554r && b10 != p70Var.f36553n && b10 != p70Var.f36555s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        p70 p70Var = this.d;
        if (p70Var.e) {
            return 0;
        }
        return p70Var.f36556w;
    }

    @Override
    public final int j(int i10) {
        p70 p70Var = this.d;
        if (i10 != p70Var.f36553n && i10 != p70Var.f36555s && i10 != p70Var.f36554r) {
            if (i10 != p70Var.v && i10 != p70Var.h) {
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
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        int i11 = c1Var.f42705f;
        View view = c1Var.f42702a;
        p70 p70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = p70Var.f36552f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    p8Var.f20604a.setText(str);
                    p8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            int i12 = p70Var.v;
            Context context = this.f36245c;
            if (i10 == i12) {
                e9Var.setText("");
                e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f18827b7));
                return;
            } else if (i10 == p70Var.h) {
                TLRPC.Chat chat = p70Var.getMessagesController().getChat(Long.valueOf(p70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    e9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    e9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f18827b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
        if (i10 == p70Var.f36553n) {
            eaVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == p70Var.f36555s) {
            eaVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == p70Var.f36554r) {
            eaVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f36245c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f20604a = textView;
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
                frameLayout2.addView(textView, w7.x5.d(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            FrameLayout eaVar = new org.telegram.ui.Cells.ea(context);
            eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
            frameLayout = eaVar;
        }
        return new s4.c1(frameLayout);
    }
}

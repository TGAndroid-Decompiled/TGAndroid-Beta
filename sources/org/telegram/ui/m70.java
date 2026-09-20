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
public final class m70 extends org.telegram.ui.Components.ul0 {
    public final Context f35623c;
    public final n70 d;

    public m70(n70 n70Var, Context context) {
        this.d = n70Var;
        this.f35623c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        n70 n70Var = this.d;
        if (b10 != n70Var.f35906r && b10 != n70Var.f35905n && b10 != n70Var.f35907s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        n70 n70Var = this.d;
        if (n70Var.e) {
            return 0;
        }
        return n70Var.f35908w;
    }

    @Override
    public final int j(int i10) {
        n70 n70Var = this.d;
        if (i10 != n70Var.f35905n && i10 != n70Var.f35907s && i10 != n70Var.f35906r) {
            if (i10 != n70Var.v && i10 != n70Var.h) {
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
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        n70 n70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = n70Var.f35904f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    q8Var.f20853a.setText(str);
                    q8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            int i12 = n70Var.v;
            Context context = this.f35623c;
            if (i10 == i12) {
                f9Var.setText("");
                f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19058b7));
                return;
            } else if (i10 == n70Var.h) {
                TLRPC.Chat chat = n70Var.getMessagesController().getChat(Long.valueOf(n70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    f9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    f9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19058b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
        if (i10 == n70Var.f35905n) {
            faVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == n70Var.f35907s) {
            faVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == n70Var.f35906r) {
            faVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f35623c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f20853a = textView;
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
                frameLayout2.addView(textView, w7.y5.d(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.f9(context);
            }
        } else {
            FrameLayout faVar = new org.telegram.ui.Cells.fa(context);
            faVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
            frameLayout = faVar;
        }
        return new s4.c1(frameLayout);
    }
}

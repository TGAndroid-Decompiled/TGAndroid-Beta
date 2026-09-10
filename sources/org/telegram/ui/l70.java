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
public final class l70 extends org.telegram.ui.Components.ul0 {
    public final Context f34549c;
    public final m70 d;

    public l70(m70 m70Var, Context context) {
        this.d = m70Var;
        this.f34549c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        m70 m70Var = this.d;
        if (b10 != m70Var.f34857r && b10 != m70Var.f34856n && b10 != m70Var.f34858s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        m70 m70Var = this.d;
        if (m70Var.e) {
            return 0;
        }
        return m70Var.f34859w;
    }

    @Override
    public final int j(int i10) {
        m70 m70Var = this.d;
        if (i10 != m70Var.f34856n && i10 != m70Var.f34858s && i10 != m70Var.f34857r) {
            if (i10 != m70Var.v && i10 != m70Var.h) {
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
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        m70 m70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = m70Var.f34855f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    q8Var.f19722a.setText(str);
                    q8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            int i12 = m70Var.v;
            Context context = this.f34549c;
            if (i10 == i12) {
                f9Var.setText("");
                f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
                return;
            } else if (i10 == m70Var.h) {
                TLRPC.Chat chat = m70Var.getMessagesController().getChat(Long.valueOf(m70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    f9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    f9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f17892b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        if (i10 == m70Var.f34856n) {
            gaVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == m70Var.f34858s) {
            gaVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == m70Var.f34857r) {
            gaVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f34549c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f19722a = textView;
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
                frameLayout2.addView(textView, w7.a6.d(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.f9(context);
            }
        } else {
            FrameLayout gaVar = new org.telegram.ui.Cells.ga(context);
            gaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            frameLayout = gaVar;
        }
        return new s4.c1(frameLayout);
    }
}

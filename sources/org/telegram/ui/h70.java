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
public final class h70 extends org.telegram.ui.Components.ql0 {
    public final Context f34590c;
    public final i70 d;

    public h70(i70 i70Var, Context context) {
        this.d = i70Var;
        this.f34590c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        i70 i70Var = this.d;
        if (b10 != i70Var.f34818r && b10 != i70Var.f34817n && b10 != i70Var.f34819s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        i70 i70Var = this.d;
        if (i70Var.e) {
            return 0;
        }
        return i70Var.f34820w;
    }

    @Override
    public final int j(int i10) {
        i70 i70Var = this.d;
        if (i10 != i70Var.f34817n && i10 != i70Var.f34819s && i10 != i70Var.f34818r) {
            if (i10 != i70Var.v && i10 != i70Var.h) {
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
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        i70 i70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = i70Var.f34816f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    m8Var.f21373a.setText(str);
                    m8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            int i12 = i70Var.v;
            Context context = this.f34590c;
            if (i10 == i12) {
                z8Var.setText("");
                z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
                return;
            } else if (i10 == i70Var.h) {
                TLRPC.Chat chat = i70Var.getMessagesController().getChat(Long.valueOf(i70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z8Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    z8Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19846b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view;
        if (i10 == i70Var.f34817n) {
            z9Var.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == i70Var.f34819s) {
            z9Var.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == i70Var.f34818r) {
            z9Var.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f34590c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f21373a = textView;
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
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            FrameLayout z9Var = new org.telegram.ui.Cells.z9(context);
            z9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            frameLayout = z9Var;
        }
        return new f2.l1(frameLayout);
    }
}

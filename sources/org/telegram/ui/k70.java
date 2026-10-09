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
public final class k70 extends org.telegram.ui.Components.pm0 {
    public final Context f39108c;
    public final l70 d;

    public k70(l70 l70Var, Context context) {
        this.d = l70Var;
        this.f39108c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        l70 l70Var = this.d;
        if (b10 != l70Var.f39453r && b10 != l70Var.f39452n && b10 != l70Var.f39454s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        l70 l70Var = this.d;
        if (l70Var.f39450e) {
            return 0;
        }
        return l70Var.f39455w;
    }

    @Override
    public final int j(int i10) {
        l70 l70Var = this.d;
        if (i10 != l70Var.f39452n && i10 != l70Var.f39454s && i10 != l70Var.f39453r) {
            if (i10 != l70Var.v && i10 != l70Var.h) {
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
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        int i11 = d1Var.f47660f;
        View view = d1Var.f47656a;
        l70 l70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = l70Var.f39451f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    p8Var.f22660a.setText(str);
                    p8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            int i12 = l70Var.v;
            Context context = this.f39108c;
            if (i10 == i12) {
                e9Var.setText("");
                e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20761b7));
                return;
            } else if (i10 == l70Var.h) {
                TLRPC.Chat chat = l70Var.getMessagesController().getChat(Long.valueOf(l70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    e9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                } else {
                    e9Var.setText(LocaleController.getString(R.string.LinkInfo));
                }
                e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20761b7));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
        if (i10 == l70Var.f39452n) {
            caVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == l70Var.f39454s) {
            caVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == l70Var.f39453r) {
            caVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f39108c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f22660a = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
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
                frameLayout2.addView(textView, w7.x5.a(-2.0f, 23.0f, 10.0f, 23.0f, 10.0f, -1, i12 | 48));
                frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            FrameLayout caVar = new org.telegram.ui.Cells.ca(context);
            caVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
            frameLayout = caVar;
        }
        return new s4.d1(frameLayout);
    }
}

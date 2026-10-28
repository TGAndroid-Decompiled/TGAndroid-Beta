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
public final class a70 extends org.telegram.ui.Components.mm0 {
    public final Context f37703c;
    public final b70 d;

    public a70(b70 b70Var, Context context) {
        this.d = b70Var;
        this.f37703c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        b70 b70Var = this.d;
        if (b10 != b70Var.f37914r && b10 != b70Var.f37913n && b10 != b70Var.f37915s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        b70 b70Var = this.d;
        if (b70Var.e) {
            return 0;
        }
        return b70Var.f37916w;
    }

    @Override
    public final int j(int i10) {
        b70 b70Var = this.d;
        if (i10 != b70Var.f37913n && i10 != b70Var.f37915s && i10 != b70Var.f37914r) {
            if (i10 != b70Var.v && i10 != b70Var.h) {
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
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        b70 b70Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = b70Var.f37912f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    t8Var.f25460a.setText(str);
                    t8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == b70Var.v) {
                i9Var.setText("");
                return;
            } else if (i10 == b70Var.h) {
                TLRPC.Chat chat = b70Var.getMessagesController().getChat(Long.valueOf(b70Var.d));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    i9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
                    return;
                } else {
                    i9Var.setText(LocaleController.getString(R.string.LinkInfo));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        if (i10 == b70Var.f37913n) {
            gaVar.b(LocaleController.getString(R.string.CopyLink), true);
        } else if (i10 == b70Var.f37915s) {
            gaVar.b(LocaleController.getString(R.string.ShareLink), false);
        } else if (i10 == b70Var.f37914r) {
            gaVar.b(LocaleController.getString(R.string.RevokeLink), true);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f37703c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f25460a = textView;
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
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
                frameLayout2.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.i9(context);
            }
        } else {
            FrameLayout gaVar = new org.telegram.ui.Cells.ga(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, gaVar, null);
            frameLayout = gaVar;
        }
        return new s4.e1(frameLayout);
    }
}

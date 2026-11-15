package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class d50 extends org.telegram.ui.Components.tj0 {
    public final Context f46300c;
    public final e50 d;

    public d50(e50 e50Var, Context context) {
        this.d = e50Var;
        this.f46300c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int b10 = e1Var.b();
        e50 e50Var = this.d;
        if (b10 != e50Var.f46571r && b10 != e50Var.f46570n && b10 != e50Var.f46572s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        e50 e50Var = this.d;
        if (e50Var.f46568e) {
            return 0;
        }
        return e50Var.f46574x;
    }

    @Override
    public final int d(int i7) {
        e50 e50Var = this.d;
        if (i7 != e50Var.f46570n && i7 != e50Var.f46572s && i7 != e50Var.f46571r) {
            if (i7 != e50Var.f46573w && i7 != e50Var.h) {
                if (i7 == 0) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        String str;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        e50 e50Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = e50Var.f46569f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    j8Var.f30518a.setText(str);
                    j8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 == e50Var.f46573w) {
                y8Var.setText("");
                return;
            } else if (i7 == e50Var.h) {
                TLRPC.Chat M0 = e50Var.getMessagesController().M0(Long.valueOf(e50Var.d));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131752386, null));
                    return;
                } else {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131748911, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
        if (i7 == e50Var.f46570n) {
            v9Var.b(org.telegram.messenger.hd.M0(2131751762, null), true);
        } else if (i7 == e50Var.f46572s) {
            v9Var.b(org.telegram.messenger.hd.M0(2131745458, null), false);
        } else if (i7 == e50Var.f46571r) {
            v9Var.b(org.telegram.messenger.hd.M0(2131746023, null), true);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        int i10;
        Context context = this.f46300c;
        if (i7 != 0) {
            if (i7 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f30518a = textView;
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                textView.setTextSize(1, 16.0f);
                int i11 = 3;
                if (org.telegram.messenger.hd.f24101a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                if (org.telegram.messenger.hd.f24101a0) {
                    i11 = 5;
                }
                frameLayout2.addView(textView, c8.ja.d(-1, -2.0f, i11 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            FrameLayout v9Var = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, v9Var, null);
            frameLayout = v9Var;
        }
        return new v4.e1(frameLayout);
    }
}

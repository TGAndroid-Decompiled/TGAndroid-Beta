package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class d60 extends org.telegram.ui.Components.sk0 {
    public final Context f36626c;
    public final e60 d;

    public d60(e60 e60Var, Context context) {
        this.d = e60Var;
        this.f36626c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        e60 e60Var = this.d;
        if (b10 != e60Var.f36955r && b10 != e60Var.f36954n && b10 != e60Var.f36956s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        e60 e60Var = this.d;
        if (e60Var.e) {
            return 0;
        }
        return e60Var.f36958x;
    }

    @Override
    public final int d(int i10) {
        e60 e60Var = this.d;
        if (i10 != e60Var.f36954n && i10 != e60Var.f36956s && i10 != e60Var.f36955r) {
            if (i10 != e60Var.f36957w && i10 != e60Var.h) {
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
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        e60 e60Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = e60Var.f36953f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    o8Var.f22407a.setText(str);
                    o8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == e60Var.f36957w) {
                b9Var.setText("");
                return;
            } else if (i10 == e60Var.h) {
                TLRPC.Chat L0 = e60Var.getMessagesController().L0(Long.valueOf(e60Var.d));
                if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131752386, null));
                    return;
                } else {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131748921, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        if (i10 == e60Var.f36954n) {
            x9Var.b(org.telegram.messenger.cd.L0(2131751762, null), true);
        } else if (i10 == e60Var.f36956s) {
            x9Var.b(org.telegram.messenger.cd.L0(2131745476, null), false);
        } else if (i10 == e60Var.f36955r) {
            x9Var.b(org.telegram.messenger.cd.L0(2131746040, null), true);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        int i11;
        Context context = this.f36626c;
        if (i10 != 0) {
            if (i10 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f22407a = textView;
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                textView.setTextSize(1, 16.0f);
                int i12 = 3;
                if (org.telegram.messenger.cd.X) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11 | 16);
                if (org.telegram.messenger.cd.X) {
                    i12 = 5;
                }
                frameLayout2.addView(textView, w7.b6.d(-1, -2.0f, i12 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            FrameLayout x9Var = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, x9Var, null);
            frameLayout = x9Var;
        }
        return new s4.c1(frameLayout);
    }
}

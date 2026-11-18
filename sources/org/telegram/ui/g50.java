package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class g50 extends org.telegram.ui.Components.bk0 {
    public final Context f47905c;
    public final h50 d;

    public g50(h50 h50Var, Context context) {
        this.d = h50Var;
        this.f47905c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        h50 h50Var = this.d;
        if (b10 != h50Var.f48161r && b10 != h50Var.f48160n && b10 != h50Var.f48162s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        h50 h50Var = this.d;
        if (h50Var.f48158e) {
            return 0;
        }
        return h50Var.f48164x;
    }

    @Override
    public final int d(int i7) {
        h50 h50Var = this.d;
        if (i7 != h50Var.f48160n && i7 != h50Var.f48162s && i7 != h50Var.f48161r) {
            if (i7 != h50Var.f48163w && i7 != h50Var.h) {
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
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        h50 h50Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = h50Var.f48159f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    l8Var.f31018a.setText(str);
                    l8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 == h50Var.f48163w) {
                a9Var.setText("");
                return;
            } else if (i7 == h50Var.h) {
                TLRPC.Chat O0 = h50Var.getMessagesController().O0(Long.valueOf(h50Var.d));
                if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131752375, null));
                    return;
                } else {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131748719, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        if (i7 == h50Var.f48160n) {
            x9Var.b(org.telegram.messenger.gd.M0(2131751751, null), true);
        } else if (i7 == h50Var.f48162s) {
            x9Var.b(org.telegram.messenger.gd.M0(2131745263, null), false);
        } else if (i7 == h50Var.f48161r) {
            x9Var.b(org.telegram.messenger.gd.M0(2131745828, null), true);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        int i10;
        Context context = this.f47905c;
        if (i7 != 0) {
            if (i7 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f31018a = textView;
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                textView.setTextSize(1, 16.0f);
                int i11 = 3;
                if (org.telegram.messenger.gd.f24213a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                if (org.telegram.messenger.gd.f24213a0) {
                    i11 = 5;
                }
                frameLayout2.addView(textView, c8.ma.d(-1, -2.0f, i11 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            FrameLayout x9Var = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, x9Var, null);
            frameLayout = x9Var;
        }
        return new v4.f1(frameLayout);
    }
}

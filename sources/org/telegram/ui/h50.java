package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class h50 extends org.telegram.ui.Components.oj0 {
    public final Context f46220c;
    public final i50 d;

    public h50(i50 i50Var, Context context) {
        this.d = i50Var;
        this.f46220c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        i50 i50Var = this.d;
        if (b10 != i50Var.f46506r && b10 != i50Var.f46505n && b10 != i50Var.f46507s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        i50 i50Var = this.d;
        if (i50Var.f46503e) {
            return 0;
        }
        return i50Var.f46509x;
    }

    @Override
    public final int d(int i7) {
        i50 i50Var = this.d;
        if (i7 != i50Var.f46505n && i7 != i50Var.f46507s && i7 != i50Var.f46506r) {
            if (i7 != i50Var.f46508w && i7 != i50Var.h) {
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
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        i50 i50Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = i50Var.f46504f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    k8Var.f29470a.setText(str);
                    k8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == i50Var.f46508w) {
                z8Var.setText("");
                return;
            } else if (i7 == i50Var.h) {
                TLRPC.Chat M0 = i50Var.getMessagesController().M0(Long.valueOf(i50Var.d));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131752386, null));
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131748911, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        if (i7 == i50Var.f46505n) {
            w9Var.b(org.telegram.messenger.id.M0(2131751762, null), true);
        } else if (i7 == i50Var.f46507s) {
            w9Var.b(org.telegram.messenger.id.M0(2131745458, null), false);
        } else if (i7 == i50Var.f46506r) {
            w9Var.b(org.telegram.messenger.id.M0(2131746023, null), true);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        int i10;
        Context context = this.f46220c;
        if (i7 != 0) {
            if (i7 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f29470a = textView;
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                textView.setTextSize(1, 16.0f);
                int i11 = 3;
                if (org.telegram.messenger.id.f23161a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                if (org.telegram.messenger.id.f23161a0) {
                    i11 = 5;
                }
                frameLayout2.addView(textView, c8.ha.d(-1, -2.0f, i11 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            FrameLayout w9Var = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, w9Var, null);
            frameLayout = w9Var;
        }
        return new v4.d1(frameLayout);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class np extends org.telegram.ui.Components.sk0 {
    public final Context f40015c;
    public final qp d;

    public np(qp qpVar, Context context) {
        this.d = qpVar;
        this.f40015c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        qp qpVar = this.d;
        if (qpVar.f41028x && !qpVar.f41029y) {
            return 0;
        }
        return qpVar.M;
    }

    @Override
    public final int d(int i10) {
        qp qpVar = this.d;
        qpVar.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 != qpVar.F && i10 != qpVar.I) {
            if (i10 >= qpVar.G && i10 < qpVar.H) {
                return 0;
            }
            if (i10 == qpVar.K) {
                return 4;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String h;
        qp qpVar = this.d;
        boolean z10 = qpVar.f41026s;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (z10) {
                        if (qpVar.h.linked_chat_id != 0) {
                            int i12 = org.telegram.ui.ActionBar.t6.f21153p7;
                            b5Var.a(i12, i12);
                            b5Var.b(2131232327, 5, org.telegram.messenger.cd.L0(2131751372, null), false);
                            return;
                        }
                        b5Var.a(org.telegram.ui.ActionBar.t6.f21259v6, org.telegram.ui.ActionBar.t6.f21242u6);
                        b5Var.b(2131232174, 5, org.telegram.messenger.cd.L0(2131751386, null), true);
                        return;
                    }
                    int i13 = org.telegram.ui.ActionBar.t6.f21153p7;
                    b5Var.a(i13, i13);
                    b5Var.b(2131232327, 5, org.telegram.messenger.cd.L0(2131751374, null), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == qpVar.L) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131752303, null));
                return;
            } else if (i10 == qpVar.J) {
                if (z10) {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131751388, null));
                    return;
                } else {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131751384, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
        e5Var.setTag(Integer.valueOf(i10));
        TLRPC.Chat chat = (TLRPC.Chat) qpVar.f41027w.get(i10 - qpVar.G);
        String K = org.telegram.messenger.w3.K(chat, false);
        if (TextUtils.isEmpty(K)) {
            h = null;
        } else {
            h = sc.e.h("@", K);
        }
        if (i10 != qpVar.H - 1 || qpVar.h.linked_chat_id != 0) {
            z11 = true;
        }
        e5Var.c(chat, null, h, z11);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout e5Var;
        TLRPC.Chat chat;
        qp qpVar = this.d;
        boolean z10 = qpVar.f41026s;
        if (i10 != 0) {
            Context context = this.f40015c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ?? linearLayout = new LinearLayout(context);
                        linearLayout.f38288c = org.telegram.messenger.d20.f15147s0;
                        linearLayout.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                        linearLayout.f38286a = g9Var;
                        org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(g9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", org.telegram.messenger.i0.L(104.0f), org.telegram.messenger.i0.L(104.0f));
                        linearLayout.f38287b = v80Var;
                        g9Var.setImageDrawable(v80Var);
                        linearLayout.addView(g9Var, w7.b6.t(104, 104, 49, 0, 2, 0, 0));
                        frameLayout.addView((View) linearLayout, w7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20988g9, null);
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z10) {
                            TLRPC.ChatFull chatFull = qpVar.h;
                            if (chatFull != null && chatFull.linked_chat_id != 0) {
                                TLRPC.Chat L0 = qpVar.getMessagesController().L0(Long.valueOf(qpVar.h.linked_chat_id));
                                if (L0 != null) {
                                    org.telegram.messenger.m5.q("DiscussionChannelGroupSetHelp2", null, 2131751389, new Object[]{L0.title}, textView);
                                }
                            } else {
                                textView.setText(org.telegram.messenger.cd.L0(2131751387, null));
                            }
                        } else {
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(qpVar.h.linked_chat_id));
                            if (L02 != null) {
                                org.telegram.messenger.m5.q("DiscussionGroupHelp", null, 2131751385, new Object[]{L02.title}, textView);
                            }
                        }
                        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        frameLayout.setTag(-33024);
                        e5Var = frameLayout;
                    } else {
                        if (z10) {
                            chat = (TLRPC.Chat) qpVar.f41027w.get(0);
                        } else {
                            chat = qpVar.f41023f;
                        }
                        mp mpVar = new mp(this, context, chat, chat);
                        qpVar.D = mpVar;
                        e5Var = mpVar;
                    }
                } else {
                    e5Var = new org.telegram.ui.Cells.b5(context);
                }
            } else {
                e5Var = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            e5Var = new org.telegram.ui.Cells.e5(6, 2, this.f40015c, null, false);
        }
        return new s4.c1(e5Var);
    }
}

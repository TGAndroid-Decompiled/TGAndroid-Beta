package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class no extends org.telegram.ui.Components.sj0 {
    public final Context f48035c;
    public final qo d;

    public no(qo qoVar, Context context) {
        this.d = qoVar;
        this.f48035c = context;
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 0 && i3 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        qo qoVar = this.d;
        if (qoVar.f48929x && !qoVar.f48930y) {
            return 0;
        }
        return qoVar.N;
    }

    @Override
    public final int d(int i3) {
        qo qoVar = this.d;
        qoVar.getClass();
        if (i3 == 0) {
            return 3;
        }
        if (i3 != qoVar.G && i3 != qoVar.J) {
            if (i3 >= qoVar.H && i3 < qoVar.I) {
                return 0;
            }
            if (i3 == qoVar.L) {
                return 4;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String f10;
        qo qoVar = this.d;
        boolean z10 = qoVar.f48927s;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z11 = false;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (z10) {
                        if (qoVar.h.linked_chat_id != 0) {
                            int i11 = org.telegram.ui.ActionBar.k6.f28102p7;
                            x4Var.a(i11, i11);
                            x4Var.b(2131232328, 5, org.telegram.messenger.bd.M0(2131751372, null), false);
                            return;
                        }
                        x4Var.a(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                        x4Var.b(2131232175, 5, org.telegram.messenger.bd.M0(2131751386, null), true);
                        return;
                    }
                    int i12 = org.telegram.ui.ActionBar.k6.f28102p7;
                    x4Var.a(i12, i12);
                    x4Var.b(2131232328, 5, org.telegram.messenger.bd.M0(2131751374, null), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == qoVar.M) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131752303, null));
                return;
            } else if (i3 == qoVar.K) {
                if (z10) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131751388, null));
                    return;
                } else {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131751384, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i3));
        TLRPC.Chat chat = (TLRPC.Chat) qoVar.f48928w.get(i3 - qoVar.H);
        String K = org.telegram.messenger.t3.K(chat, false);
        if (TextUtils.isEmpty(K)) {
            f10 = null;
        } else {
            f10 = t4.c.f("@", K);
        }
        if (i3 != qoVar.I - 1 || qoVar.h.linked_chat_id != 0) {
            z11 = true;
        }
        a5Var.c(chat, null, f10, z11);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout a5Var;
        TLRPC.Chat chat;
        qo qoVar = this.d;
        boolean z10 = qoVar.f48927s;
        if (i3 != 0) {
            Context context = this.f48035c;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ?? linearLayout = new LinearLayout(context);
                        linearLayout.f45957c = org.telegram.messenger.h10.f22829t0;
                        linearLayout.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                        linearLayout.f45955a = k9Var;
                        org.telegram.ui.Components.y70 y70Var = new org.telegram.ui.Components.y70(k9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(104.0f));
                        linearLayout.f45956b = y70Var;
                        k9Var.setImageDrawable(y70Var);
                        linearLayout.addView(k9Var, b8.mf.t(104, 104, 49, 0, 2, 0, 0));
                        frameLayout.addView((View) linearLayout, b8.mf.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27939g9, null);
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z10) {
                            TLRPC.ChatFull chatFull = qoVar.h;
                            if (chatFull != null && chatFull.linked_chat_id != 0) {
                                TLRPC.Chat M0 = qoVar.getMessagesController().M0(Long.valueOf(qoVar.h.linked_chat_id));
                                if (M0 != null) {
                                    org.telegram.messenger.k5.r("DiscussionChannelGroupSetHelp2", null, 2131751389, new Object[]{M0.title}, textView);
                                }
                            } else {
                                textView.setText(org.telegram.messenger.bd.M0(2131751387, null));
                            }
                        } else {
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(qoVar.h.linked_chat_id));
                            if (M02 != null) {
                                org.telegram.messenger.k5.r("DiscussionGroupHelp", null, 2131751385, new Object[]{M02.title}, textView);
                            }
                        }
                        frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        frameLayout.setTag(-33024);
                        a5Var = frameLayout;
                    } else {
                        if (z10) {
                            chat = (TLRPC.Chat) qoVar.f48928w.get(0);
                        } else {
                            chat = qoVar.f48924f;
                        }
                        mo moVar = new mo(this, context, chat, chat);
                        qoVar.E = moVar;
                        a5Var = moVar;
                    }
                } else {
                    a5Var = new org.telegram.ui.Cells.x4(context);
                }
            } else {
                a5Var = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            a5Var = new org.telegram.ui.Cells.a5(this.f48035c, 6, 2, false, null);
        }
        return new u4.d1(a5Var);
    }
}

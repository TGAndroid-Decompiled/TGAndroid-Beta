package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class e50 extends org.telegram.ui.Components.oj0 {
    public final Context f45201c;
    public final f50 d;

    public e50(f50 f50Var, Context context) {
        this.d = f50Var;
        this.f45201c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        f50 f50Var = this.d;
        if (b10 != f50Var.f45495r && b10 != f50Var.f45494n && b10 != f50Var.f45496s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        f50 f50Var = this.d;
        if (f50Var.f45492e) {
            return 0;
        }
        return f50Var.f45498x;
    }

    @Override
    public final int d(int i7) {
        f50 f50Var = this.d;
        if (i7 != f50Var.f45494n && i7 != f50Var.f45496s && i7 != f50Var.f45495r) {
            if (i7 != f50Var.f45497w && i7 != f50Var.h) {
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
        int i10 = d1Var.f56955f;
        View view = d1Var.f56951a;
        f50 f50Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = f50Var.f45493f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    k8Var.f29452a.setText(str);
                    k8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == f50Var.f45497w) {
                z8Var.setText("");
                return;
            } else if (i7 == f50Var.h) {
                TLRPC.Chat M0 = f50Var.getMessagesController().M0(Long.valueOf(f50Var.d));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131752386, null));
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131748910, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        if (i7 == f50Var.f45494n) {
            w9Var.b(org.telegram.messenger.hd.M0(2131751762, null), true);
        } else if (i7 == f50Var.f45496s) {
            w9Var.b(org.telegram.messenger.hd.M0(2131745459, null), false);
        } else if (i7 == f50Var.f45495r) {
            w9Var.b(org.telegram.messenger.hd.M0(2131746024, null), true);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        int i10;
        Context context = this.f45201c;
        if (i7 != 0) {
            if (i7 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f29452a = textView;
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                textView.setTextSize(1, 16.0f);
                int i11 = 3;
                if (org.telegram.messenger.hd.f22878a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                if (org.telegram.messenger.hd.f22878a0) {
                    i11 = 5;
                }
                frameLayout2.addView(textView, c8.ha.d(-1, -2.0f, i11 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            FrameLayout w9Var = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, w9Var, null);
            frameLayout = w9Var;
        }
        return new v4.d1(frameLayout);
    }
}

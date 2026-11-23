package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xo0 extends dk0 {
    public final Context f42130c;
    public boolean d;
    public boolean f42131e;
    public ArrayList f42132f;
    public final zo0 h;

    public xo0(zo0 zo0Var, Context context) {
        this.h = zo0Var;
        this.f42130c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i7) {
        int i10 = i7 - 1;
        if (this.d) {
            i10 = i7 - 2;
        }
        ArrayList arrayList = this.f42132f;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f42132f.get(i10);
        }
        return null;
    }

    @Override
    public final int b() {
        int i7;
        ArrayList arrayList = this.f42132f;
        if (arrayList != null) {
            i7 = arrayList.size() + 1;
        } else {
            i7 = 0;
        }
        return i7 + (this.d ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        long j3;
        int L;
        if (f1Var.f59249f == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) f1Var.f59245a;
            if (i7 == 1 && this.d) {
                e7Var.setAsNewBotForumTopic(this.f42131e);
            } else if (this.f42132f != null) {
                TLRPC.TL_forumTopic E = E(i7);
                zo0 zo0Var = this.h;
                TLRPC.Dialog dialog = zo0Var.f43005y2;
                if (E != null && zo0Var.Q1.h(E.f28544id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.b7 b7Var = e7Var.f30665b;
                int i10 = e7Var.f30668f;
                p9 p9Var = e7Var.f30664a;
                TextView textView = e7Var.f30666c;
                if (dialog != null) {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-dialog.f28496id));
                    String str = "";
                    if (dialog.f28496id > 0) {
                        textView.setText(E.title);
                        j3 = 0;
                    } else if (O0 != null) {
                        if (O0.monoforum) {
                            j3 = 0;
                            textView.setText(org.telegram.messenger.mp.u1(i10).D1(org.telegram.messenger.n5.o(E.from_id), false));
                        } else {
                            j3 = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j3 = 0;
                        textView.setText("");
                    }
                    if (org.telegram.messenger.v3.p0(O0)) {
                        p9Var.setAnimatedEmojiDrawable(null);
                        p9Var.setImageDrawable(null);
                        long o4 = org.telegram.messenger.n5.o(E.from_id);
                        if (org.telegram.messenger.n5.E(o4)) {
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(o4));
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, e7Var.h);
                            b7Var.r(c22);
                            if (c22 != null) {
                                textView.setText(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                            } else {
                                textView.setText("");
                            }
                            p9Var.f(c22, b7Var);
                            p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                        } else {
                            TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(o4));
                            if (O02 != null) {
                                textView.setText(O02.title);
                            } else {
                                textView.setText("");
                            }
                            b7Var.q(O02);
                            p9Var.f(O0, b7Var);
                        }
                    } else if (E.icon_emoji_id != j3) {
                        p9Var.setImageDrawable(null);
                        p9Var.setAnimatedEmojiDrawable(new o5(13, org.telegram.messenger.i10.f24637t0, E.icon_emoji_id));
                    } else {
                        p9Var.setAnimatedEmojiDrawable(null);
                        qg.a aVar = new qg.a(E.icon_color);
                        t70 t70Var = new t70(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        t70Var.a(str);
                        t70Var.f39850i = 1.8f;
                        lq lqVar = new lq(aVar, t70Var, 0, 0);
                        lqVar.f37204x = true;
                        p9Var.setImageDrawable(lqVar);
                    }
                    if (O0 != null && O0.forum && !z10) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(28.0f);
                    }
                    p9Var.setRoundRadius(L);
                    e7Var.d = dialog.f28496id;
                    e7Var.f30667e = E.f28544id;
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View e7Var;
        Context context = this.f42130c;
        if (i7 != 0 && i7 != 2) {
            e7Var = new View(context);
            e7Var.setLayoutParams(new v4.q0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            e7Var = new org.telegram.ui.Cells.e7(context, this.h.J0);
            e7Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new v4.f1(e7Var);
    }
}

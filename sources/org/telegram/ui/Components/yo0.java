package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yo0 extends dk0 {
    public final Context f42491c;
    public boolean d;
    public boolean f42492e;
    public ArrayList f42493f;
    public final ap0 h;

    public yo0(ap0 ap0Var, Context context) {
        this.h = ap0Var;
        this.f42491c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59165f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i7) {
        int i10 = i7 - 1;
        if (this.d) {
            i10 = i7 - 2;
        }
        ArrayList arrayList = this.f42493f;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f42493f.get(i10);
        }
        return null;
    }

    @Override
    public final int b() {
        int i7;
        ArrayList arrayList = this.f42493f;
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
        if (f1Var.f59165f == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) f1Var.f59161a;
            if (i7 == 1 && this.d) {
                f7Var.setAsNewBotForumTopic(this.f42492e);
            } else if (this.f42493f != null) {
                TLRPC.TL_forumTopic E = E(i7);
                ap0 ap0Var = this.h;
                TLRPC.Dialog dialog = ap0Var.f33584y2;
                if (E != null && ap0Var.Q1.h(E.f28483id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.c7 c7Var = f7Var.f30648b;
                int i10 = f7Var.f30651f;
                q9 q9Var = f7Var.f30647a;
                TextView textView = f7Var.f30649c;
                if (dialog != null) {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-dialog.f28435id));
                    String str = "";
                    if (dialog.f28435id > 0) {
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
                        q9Var.setAnimatedEmojiDrawable(null);
                        q9Var.setImageDrawable(null);
                        long o4 = org.telegram.messenger.n5.o(E.from_id);
                        if (org.telegram.messenger.n5.E(o4)) {
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(o4));
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29486j5, f7Var.h);
                            c7Var.r(c22);
                            if (c22 != null) {
                                textView.setText(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                            } else {
                                textView.setText("");
                            }
                            q9Var.f(c22, c7Var);
                            q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                        } else {
                            TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(o4));
                            if (O02 != null) {
                                textView.setText(O02.title);
                            } else {
                                textView.setText("");
                            }
                            c7Var.q(O02);
                            q9Var.f(O0, c7Var);
                        }
                    } else if (E.icon_emoji_id != j3) {
                        q9Var.setImageDrawable(null);
                        q9Var.setAnimatedEmojiDrawable(new p5(13, org.telegram.messenger.j10.f24798t0, E.icon_emoji_id));
                    } else {
                        q9Var.setAnimatedEmojiDrawable(null);
                        qg.a aVar = new qg.a(E.icon_color);
                        w70 w70Var = new w70(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        w70Var.a(str);
                        w70Var.f41695i = 1.8f;
                        oq oqVar = new oq(aVar, w70Var, 0, 0);
                        oqVar.f38345x = true;
                        q9Var.setImageDrawable(oqVar);
                    }
                    if (O0 != null && O0.forum && !z10) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(28.0f);
                    }
                    q9Var.setRoundRadius(L);
                    f7Var.d = dialog.f28435id;
                    f7Var.f30650e = E.f28483id;
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View f7Var;
        Context context = this.f42491c;
        if (i7 != 0 && i7 != 2) {
            f7Var = new View(context);
            f7Var.setLayoutParams(new v4.q0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            f7Var = new org.telegram.ui.Cells.f7(context, this.h.J0);
            f7Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new v4.f1(f7Var);
    }
}

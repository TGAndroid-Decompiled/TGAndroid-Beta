package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lo0 extends pj0 {
    public final Context f35778c;
    public boolean d;
    public boolean f35779e;
    public ArrayList f35780f;
    public final no0 h;

    public lo0(no0 no0Var, Context context) {
        this.h = no0Var;
        this.f35778c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i7) {
        int i10 = i7 - 1;
        if (this.d) {
            i10 = i7 - 2;
        }
        ArrayList arrayList = this.f35780f;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f35780f.get(i10);
        }
        return null;
    }

    @Override
    public final int b() {
        int i7;
        ArrayList arrayList = this.f35780f;
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        long j3;
        int L;
        if (d1Var.f57060f == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) d1Var.f57056a;
            if (i7 == 1 && this.d) {
                e7Var.setAsNewBotForumTopic(this.f35779e);
            } else if (this.f35780f != null) {
                TLRPC.TL_forumTopic E = E(i7);
                no0 no0Var = this.h;
                TLRPC.Dialog dialog = no0Var.f36460u2;
                if (E != null && no0Var.M1.h(E.f27008id) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Cells.b7 b7Var = e7Var.f29078b;
                int i10 = e7Var.f29081f;
                l9 l9Var = e7Var.f29077a;
                TextView textView = e7Var.f29079c;
                if (dialog != null) {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-dialog.f26960id));
                    String str = "";
                    if (dialog.f26960id > 0) {
                        textView.setText(E.title);
                        j3 = 0;
                    } else if (M0 != null) {
                        if (M0.monoforum) {
                            j3 = 0;
                            textView.setText(org.telegram.messenger.qp.s1(i10).B1(org.telegram.messenger.m5.o(E.from_id), false));
                        } else {
                            j3 = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j3 = 0;
                        textView.setText("");
                    }
                    if (org.telegram.messenger.t3.p0(M0)) {
                        l9Var.setAnimatedEmojiDrawable(null);
                        l9Var.setImageDrawable(null);
                        long o4 = org.telegram.messenger.m5.o(E.from_id);
                        if (org.telegram.messenger.m5.E(o4)) {
                            TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(o4));
                            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, e7Var.h);
                            b7Var.r(a22);
                            if (a22 != null) {
                                textView.setText(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            } else {
                                textView.setText("");
                            }
                            l9Var.e(a22, b7Var);
                            l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                        } else {
                            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(o4));
                            if (M02 != null) {
                                textView.setText(M02.title);
                            } else {
                                textView.setText("");
                            }
                            b7Var.q(M02);
                            l9Var.e(M0, b7Var);
                        }
                    } else if (E.icon_emoji_id != j3) {
                        l9Var.setImageDrawable(null);
                        l9Var.setAnimatedEmojiDrawable(new i5(13, org.telegram.messenger.p10.f24470s0, E.icon_emoji_id));
                    } else {
                        l9Var.setAnimatedEmojiDrawable(null);
                        qg.a aVar = new qg.a(E.icon_color);
                        h70 h70Var = new h70(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        h70Var.a(str);
                        h70Var.f34226i = 1.8f;
                        xp xpVar = new xp(aVar, h70Var, 0, 0);
                        xpVar.f40453x = true;
                        l9Var.setImageDrawable(xpVar);
                    }
                    if (M0 != null && M0.forum && !z9) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(28.0f);
                    }
                    l9Var.setRoundRadius(L);
                    e7Var.d = dialog.f26960id;
                    e7Var.f29080e = E.f27008id;
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View e7Var;
        Context context = this.f35778c;
        if (i7 != 0 && i7 != 2) {
            e7Var = new View(context);
            e7Var.setLayoutParams(new v4.o0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            e7Var = new org.telegram.ui.Cells.e7(context, this.h.I0);
            e7Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new v4.d1(e7Var);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class no0 extends tj0 {
    public final Context f37655c;
    public boolean d;
    public boolean f37656e;
    public ArrayList f37657f;
    public final po0 h;

    public no0(po0 po0Var, Context context) {
        this.h = po0Var;
        this.f37655c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i7) {
        int i10 = i7 - 1;
        if (this.d) {
            i10 = i7 - 2;
        }
        ArrayList arrayList = this.f37657f;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f37657f.get(i10);
        }
        return null;
    }

    @Override
    public final int b() {
        int i7;
        ArrayList arrayList = this.f37657f;
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
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        long j3;
        int L;
        if (e1Var.f58539f == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) e1Var.f58535a;
            if (i7 == 1 && this.d) {
                d7Var.setAsNewBotForumTopic(this.f37656e);
            } else if (this.f37657f != null) {
                TLRPC.TL_forumTopic E = E(i7);
                po0 po0Var = this.h;
                TLRPC.Dialog dialog = po0Var.f38375y2;
                if (E != null && po0Var.Q1.h(E.f28103id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a7 a7Var = d7Var.f30147b;
                int i10 = d7Var.f30150f;
                i9 i9Var = d7Var.f30146a;
                TextView textView = d7Var.f30148c;
                if (dialog != null) {
                    TLRPC.Chat M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-dialog.f28055id));
                    String str = "";
                    if (dialog.f28055id > 0) {
                        textView.setText(E.title);
                        j3 = 0;
                    } else if (M0 != null) {
                        if (M0.monoforum) {
                            j3 = 0;
                            textView.setText(org.telegram.messenger.np.s1(i10).B1(org.telegram.messenger.m5.o(E.from_id), false));
                        } else {
                            j3 = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j3 = 0;
                        textView.setText("");
                    }
                    if (org.telegram.messenger.t3.p0(M0)) {
                        i9Var.setAnimatedEmojiDrawable(null);
                        i9Var.setImageDrawable(null);
                        long o4 = org.telegram.messenger.m5.o(E.from_id);
                        if (org.telegram.messenger.m5.E(o4)) {
                            TLRPC.User a22 = org.telegram.messenger.np.s1(i10).a2(Long.valueOf(o4));
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, d7Var.h);
                            a7Var.r(a22);
                            if (a22 != null) {
                                textView.setText(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            } else {
                                textView.setText("");
                            }
                            i9Var.f(a22, a7Var);
                            i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                        } else {
                            TLRPC.Chat M02 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(o4));
                            if (M02 != null) {
                                textView.setText(M02.title);
                            } else {
                                textView.setText("");
                            }
                            a7Var.q(M02);
                            i9Var.f(M0, a7Var);
                        }
                    } else if (E.icon_emoji_id != j3) {
                        i9Var.setImageDrawable(null);
                        i9Var.setAnimatedEmojiDrawable(new g5(13, org.telegram.messenger.m10.f24940t0, E.icon_emoji_id));
                    } else {
                        i9Var.setAnimatedEmojiDrawable(null);
                        qg.a aVar = new qg.a(E.icon_color);
                        j70 j70Var = new j70(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        j70Var.a(str);
                        j70Var.f35897i = 1.8f;
                        fq fqVar = new fq(aVar, j70Var, 0, 0);
                        fqVar.f34682x = true;
                        i9Var.setImageDrawable(fqVar);
                    }
                    if (M0 != null && M0.forum && !z10) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(28.0f);
                    }
                    i9Var.setRoundRadius(L);
                    d7Var.d = dialog.f28055id;
                    d7Var.f30149e = E.f28103id;
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View d7Var;
        Context context = this.f37655c;
        if (i7 != 0 && i7 != 2) {
            d7Var = new View(context);
            d7Var.setLayoutParams(new v4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            d7Var = new org.telegram.ui.Cells.d7(context, this.h.J0);
            d7Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new v4.e1(d7Var);
    }
}

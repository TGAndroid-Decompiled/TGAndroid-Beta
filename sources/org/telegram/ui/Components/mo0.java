package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mo0 extends sj0 {
    public final Context f36221c;
    public boolean d;
    public boolean f36222e;
    public ArrayList f36223f;
    public final oo0 h;

    public mo0(oo0 oo0Var, Context context) {
        this.h = oo0Var;
        this.f36221c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i3) {
        int i10 = i3 - 1;
        if (this.d) {
            i10 = i3 - 2;
        }
        ArrayList arrayList = this.f36223f;
        if (arrayList != null && i10 >= 0 && i10 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f36223f.get(i10);
        }
        return null;
    }

    @Override
    public final int b() {
        int i3;
        ArrayList arrayList = this.f36223f;
        if (arrayList != null) {
            i3 = arrayList.size() + 1;
        } else {
            i3 = 0;
        }
        return i3 + (this.d ? 1 : 0);
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        long j10;
        int L;
        if (d1Var.f55544f == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) d1Var.f55540a;
            if (i3 == 1 && this.d) {
                d7Var.setAsNewBotForumTopic(this.f36222e);
            } else if (this.f36223f != null) {
                TLRPC.TL_forumTopic E = E(i3);
                oo0 oo0Var = this.h;
                TLRPC.Dialog dialog = oo0Var.f36906v2;
                if (E != null && oo0Var.N1.h(E.f27053id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.a7 a7Var = d7Var.f29089b;
                int i10 = d7Var.f29092f;
                k9 k9Var = d7Var.f29088a;
                TextView textView = d7Var.f29090c;
                if (dialog != null) {
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-dialog.f27005id));
                    String str = "";
                    if (dialog.f27005id > 0) {
                        textView.setText(E.title);
                        j10 = 0;
                    } else if (M0 != null) {
                        if (M0.monoforum) {
                            j10 = 0;
                            textView.setText(org.telegram.messenger.hp.s1(i10).B1(org.telegram.messenger.m5.o(E.from_id), false));
                        } else {
                            j10 = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j10 = 0;
                        textView.setText("");
                    }
                    if (org.telegram.messenger.t3.p0(M0)) {
                        k9Var.setAnimatedEmojiDrawable(null);
                        k9Var.setImageDrawable(null);
                        long o10 = org.telegram.messenger.m5.o(E.from_id);
                        if (org.telegram.messenger.m5.E(o10)) {
                            TLRPC.User a22 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(o10));
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, d7Var.h);
                            a7Var.r(a22);
                            if (a22 != null) {
                                textView.setText(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            } else {
                                textView.setText("");
                            }
                            k9Var.e(a22, a7Var);
                            k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                        } else {
                            TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(o10));
                            if (M02 != null) {
                                textView.setText(M02.title);
                            } else {
                                textView.setText("");
                            }
                            a7Var.q(M02);
                            k9Var.e(M0, a7Var);
                        }
                    } else if (E.icon_emoji_id != j10) {
                        k9Var.setImageDrawable(null);
                        k9Var.setAnimatedEmojiDrawable(new g5(13, org.telegram.messenger.h10.f22829t0, E.icon_emoji_id));
                    } else {
                        k9Var.setAnimatedEmojiDrawable(null);
                        rg.a aVar = new rg.a(E.icon_color);
                        c70 c70Var = new c70(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        c70Var.a(str);
                        c70Var.f32584i = 1.8f;
                        xp xpVar = new xp(aVar, c70Var, 0, 0);
                        xpVar.f40447x = true;
                        k9Var.setImageDrawable(xpVar);
                    }
                    if (M0 != null && M0.forum && !z10) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(28.0f);
                    }
                    k9Var.setRoundRadius(L);
                    d7Var.d = dialog.f27005id;
                    d7Var.f29091e = E.f27053id;
                }
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View d7Var;
        Context context = this.f36221c;
        if (i3 != 0 && i3 != 2) {
            d7Var = new View(context);
            d7Var.setLayoutParams(new u4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            d7Var = new org.telegram.ui.Cells.d7(context, this.h.J0);
            d7Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new u4.d1(d7Var);
    }
}

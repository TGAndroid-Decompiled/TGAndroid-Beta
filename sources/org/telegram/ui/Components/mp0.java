package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mp0 extends sk0 {
    public final Context f28568c;
    public boolean d;
    public boolean e;
    public ArrayList f28569f;
    public final op0 h;

    public mp0(op0 op0Var, Context context) {
        this.h = op0Var;
        this.f28568c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f != 1) {
            return true;
        }
        return false;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f28569f;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (TLRPC.TL_forumTopic) this.f28569f.get(i11);
        }
        return null;
    }

    @Override
    public final int b() {
        int i10;
        ArrayList arrayList = this.f28569f;
        if (arrayList != null) {
            i10 = arrayList.size() + 1;
        } else {
            i10 = 0;
        }
        return i10 + (this.d ? 1 : 0);
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        long j10;
        int L;
        if (c1Var.f47901f == 0) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) c1Var.f47898a;
            if (i10 == 1 && this.d) {
                i7Var.setAsNewBotForumTopic(this.e);
            } else if (this.f28569f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                op0 op0Var = this.h;
                TLRPC.Dialog dialog = op0Var.f29144u2;
                if (E != null && op0Var.M1.h(E.f19845id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Cells.f7 f7Var = i7Var.f22043b;
                int i11 = i7Var.f22045f;
                g9 g9Var = i7Var.f22042a;
                TextView textView = i7Var.f22044c;
                if (dialog != null) {
                    TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-dialog.f19797id));
                    String str = "";
                    if (dialog.f19797id > 0) {
                        textView.setText(E.title);
                        j10 = 0;
                    } else if (L0 != null) {
                        if (L0.monoforum) {
                            j10 = 0;
                            textView.setText(org.telegram.messenger.vp.r1(i11).A1(org.telegram.messenger.o5.o(E.from_id), false));
                        } else {
                            j10 = 0;
                            textView.setText(E.title);
                        }
                    } else {
                        j10 = 0;
                        textView.setText("");
                    }
                    if (org.telegram.messenger.w3.p0(L0)) {
                        g9Var.setAnimatedEmojiDrawable(null);
                        g9Var.setImageDrawable(null);
                        long o10 = org.telegram.messenger.o5.o(E.from_id);
                        if (org.telegram.messenger.o5.E(o10)) {
                            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(o10));
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, i7Var.h);
                            f7Var.r(Z1);
                            if (Z1 != null) {
                                textView.setText(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                            } else {
                                textView.setText("");
                            }
                            g9Var.e(Z1, f7Var);
                            g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
                        } else {
                            TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(o10));
                            if (L02 != null) {
                                textView.setText(L02.title);
                            } else {
                                textView.setText("");
                            }
                            f7Var.q(L02);
                            g9Var.e(L0, f7Var);
                        }
                    } else if (E.icon_emoji_id != j10) {
                        g9Var.setImageDrawable(null);
                        g9Var.setAnimatedEmojiDrawable(new f5(13, org.telegram.messenger.d20.f15147s0, E.icon_emoji_id));
                    } else {
                        g9Var.setAnimatedEmojiDrawable(null);
                        gg.a aVar = new gg.a(E.icon_color);
                        z70 z70Var = new z70(1, null);
                        String upperCase = E.title.trim().toUpperCase();
                        if (upperCase.length() >= 1) {
                            str = upperCase.substring(0, 1);
                        }
                        z70Var.a(str);
                        z70Var.f32963i = 1.8f;
                        eq eqVar = new eq(aVar, z70Var, 0, 0);
                        eqVar.f25847x = true;
                        g9Var.setImageDrawable(eqVar);
                    }
                    if (L0 != null && L0.forum && !z10) {
                        L = org.telegram.messenger.i0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(28.0f);
                    }
                    g9Var.setRoundRadius(L);
                    i7Var.d = dialog.f19797id;
                    i7Var.e = E.f19845id;
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View i7Var;
        Context context = this.f28568c;
        if (i10 != 0 && i10 != 2) {
            i7Var = new View(context);
            i7Var.setLayoutParams(new s4.o0(-1, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
        } else {
            i7Var = new org.telegram.ui.Cells.i7(context, this.h.I0);
            i7Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(100.0f)));
        }
        return new s4.c1(i7Var);
    }
}

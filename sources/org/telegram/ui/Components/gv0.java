package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class gv0 extends dv0 {
    public boolean E;
    public final jv0 F;
    public final boolean h;
    public final int f24458n;
    public final ArrayList f24459r;
    public ai.d9 f24460s;
    public final int v;
    public final ev0 f24461w;
    public boolean f24462x;
    public final ArrayList f24463y;

    public gv0(jv0 jv0Var, Context context, boolean z10) {
        this(jv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f24460s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f721i.size() || (messageObject = (MessageObject) this.f24460s.f721i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void I() {
        int i10;
        if (this.h) {
            i10 = 9;
        } else {
            i10 = 8;
        }
        this.F.c1(i10, true);
    }

    public final boolean M(int i10) {
        ai.d9 d9Var;
        if (!this.h && (d9Var = this.f24460s) != null) {
            if (d9Var instanceof ai.t8) {
                jv0 jv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(jv0Var.f25528v1.getCurrentAccount()).getUser(Long.valueOf(jv0Var.f25503j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f721i.size()) {
                MessageObject messageObject = (MessageObject) this.f24460s.f721i.get(i10);
                ai.d9 d9Var2 = this.f24460s;
                if (d9Var2.f719f > 0) {
                    return true;
                }
                return d9Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        cu0 cu0Var;
        cu0 cu0Var2;
        cu0 cu0Var3;
        cu0 cu0Var4;
        ai.d9 d9Var = this.f24460s;
        if (d9Var != null && !this.h) {
            jv0 jv0Var = this.F;
            boolean z10 = jv0Var.l1;
            cu0[] cu0VarArr = jv0Var.f25504k0;
            int[] iArr = jv0Var.f25507m1;
            if ((!z10 || (jv0Var.f25505k1 && d9Var.g() > 1)) && this.f24460s.g() > 0 && !jv0Var.v0()) {
                boolean z11 = false;
                if (this.f24460s.g() < 5) {
                    iArr[1] = this.f24460s.g();
                    if (cu0VarArr != null && (cu0Var3 = cu0VarArr[0]) != null && (cu0Var4 = cu0VarArr[1]) != null && cu0Var3.h != null && cu0Var4.h != null) {
                        jv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    jv0Var.f25505k1 = z11;
                } else if (jv0Var.f25505k1) {
                    jv0Var.f25505k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (cu0VarArr != null && (cu0Var = cu0VarArr[0]) != null && (cu0Var2 = cu0VarArr[1]) != null && cu0Var.h != null && cu0Var2.h != null) {
                        jv0Var.m1(false);
                    }
                }
                jv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        jv0 jv0Var = this.F;
        ot0 ot0Var = jv0Var.H;
        int[] iArr = jv0Var.f25507m1;
        if (this == ot0Var) {
            return iArr[0];
        }
        if (jv0.u(jv0Var, this) != -1) {
            return iArr[1];
        }
        return jv0Var.f25516q1;
    }

    public final void P() {
        if (this.f24460s == null) {
            return;
        }
        int O = O();
        this.f24460s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f24460s == null) {
            return 0;
        }
        int size = this.f24459r.size();
        if (!this.f24460s.l() || !this.F.i0()) {
            i10 = this.f24460s.g();
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        return 19;
    }

    @Override
    public final int k() {
        return h();
    }

    @Override
    public void l() {
        if (this.f24460s != null) {
            jv0 jv0Var = this.F;
            if (jv0Var.r0()) {
                ArrayList arrayList = this.f24459r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f24460s.f718c).getStoriesController().E(jv0Var.f25503j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f24460s != null && c1Var.f42977f == 19) {
            View view = c1Var.f42974a;
            if (view instanceof org.telegram.ui.Cells.u7) {
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                u7Var.f21625d0 = true;
                ArrayList arrayList = this.f24459r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    u7Var.f21628f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1141a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f18563id = i11;
                        tL_storyItem.attachPath = k9Var.f1144f;
                        MessageObject messageObject = new MessageObject(this.f24460s.f718c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    u7Var.k(k9Var.K, O(), false);
                    u7Var.f21625d0 = true;
                    u7Var.setReorder(false);
                    u7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f24460s.f721i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f24460s.f721i.get(size);
                    if (messageObject2 != null && this.f24460s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u7Var.f21628f0 = z10;
                    jv0 jv0Var = this.F;
                    if (!jv0Var.r0() && !u7Var.f21628f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u7Var.setReorder(z11);
                    u7Var.h = jv0Var.t0();
                    u7Var.k(messageObject2, O(), false);
                    if (jv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = jv0Var.Z0;
                        if (messageObject2.getDialogId() == jv0Var.f25503j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        u7Var.i(z12, true);
                    } else {
                        u7Var.i(false, false);
                    }
                    u7Var.l(this.f24462x, false);
                    return;
                }
                u7Var.f21628f0 = false;
                u7Var.k(null, O(), false);
                u7Var.f21625d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f42974a;
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).f21625d0 = true;
        }
        return x10;
    }

    public gv0(jv0 jv0Var, Context context, int i10, boolean z10) {
        super(jv0Var, context);
        TLRPC.User user;
        this.F = jv0Var;
        this.f24459r = new ArrayList();
        this.f24463y = new ArrayList();
        this.h = z10;
        this.f24458n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
        long j3 = jv0Var.f25503j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(jv0Var.getStoriesHashtag())) {
            if (jv0Var.T1 == null) {
                jv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(jv0Var.getStoriesHashtagUsername()) ? null : jv0Var.getStoriesHashtagUsername(), jv0Var.getStoriesHashtag());
            }
            this.f24460s = jv0Var.T1;
        } else if (jv0Var.getStoriesArea() != null) {
            if (jv0Var.T1 == null) {
                jv0Var.T1 = new ai.v8(currentAccount, jv0Var.getStoriesArea());
            }
            this.f24460s = jv0Var.T1;
        } else if ((z10 && !jv0Var.v0()) || (!z10 && jv0Var.q0())) {
            this.f24460s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f24460s = n2Var.getMessagesController().getStoriesController().A(jv0Var.f25503j1, 0, i10, true);
            } else {
                this.f24460s = n2Var.getMessagesController().getStoriesController().A(jv0Var.f25503j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f24460s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f24461w = new ev0(this, n2Var.getMessagesController().getStoriesController(), jv0Var.f25503j1, this.f24460s.f718c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

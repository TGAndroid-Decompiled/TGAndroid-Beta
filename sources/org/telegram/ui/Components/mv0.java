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
public class mv0 extends jv0 {
    public boolean E;
    public final pv0 F;
    public final boolean h;
    public final int f28733n;
    public final ArrayList f28734r;
    public ai.d9 f28735s;
    public final int v;
    public final kv0 f28736w;
    public boolean f28737x;
    public final ArrayList f28738y;

    public mv0(pv0 pv0Var, Context context, boolean z10) {
        this(pv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f28735s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f789i.size() || (messageObject = (MessageObject) this.f28735s.f789i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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

    public final boolean L(int i10) {
        ai.d9 d9Var;
        if (!this.h && (d9Var = this.f28735s) != null) {
            if (d9Var instanceof ai.u8) {
                pv0 pv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(pv0Var.f29806v1.getCurrentAccount()).getUser(Long.valueOf(pv0Var.f29781j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f789i.size()) {
                MessageObject messageObject = (MessageObject) this.f28735s.f789i.get(i10);
                ai.d9 d9Var2 = this.f28735s;
                if (d9Var2.f787f > 0) {
                    return true;
                }
                return d9Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        iu0 iu0Var;
        iu0 iu0Var2;
        iu0 iu0Var3;
        iu0 iu0Var4;
        ai.d9 d9Var = this.f28735s;
        if (d9Var != null && !this.h) {
            pv0 pv0Var = this.F;
            boolean z10 = pv0Var.l1;
            iu0[] iu0VarArr = pv0Var.f29782k0;
            int[] iArr = pv0Var.f29785m1;
            if ((!z10 || (pv0Var.f29783k1 && d9Var.g() > 1)) && this.f28735s.g() > 0 && !pv0Var.v0()) {
                boolean z11 = false;
                if (this.f28735s.g() < 5) {
                    iArr[1] = this.f28735s.g();
                    if (iu0VarArr != null && (iu0Var3 = iu0VarArr[0]) != null && (iu0Var4 = iu0VarArr[1]) != null && iu0Var3.h != null && iu0Var4.h != null) {
                        pv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    pv0Var.f29783k1 = z11;
                } else if (pv0Var.f29783k1) {
                    pv0Var.f29783k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (iu0VarArr != null && (iu0Var = iu0VarArr[0]) != null && (iu0Var2 = iu0VarArr[1]) != null && iu0Var.h != null && iu0Var2.h != null) {
                        pv0Var.m1(false);
                    }
                }
                pv0Var.l1 = true;
            }
        }
    }

    public final int N() {
        pv0 pv0Var = this.F;
        ut0 ut0Var = pv0Var.H;
        int[] iArr = pv0Var.f29785m1;
        if (this == ut0Var) {
            return iArr[0];
        }
        if (pv0.u(pv0Var, this) != -1) {
            return iArr[1];
        }
        return pv0Var.f29794q1;
    }

    public final void O() {
        if (this.f28735s == null) {
            return;
        }
        int N = N();
        this.f28735s.p(Math.min(100, Math.max(1, N / 2) * N * N), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f28735s == null) {
            return 0;
        }
        int size = this.f28734r.size();
        if (!this.f28735s.l() || !this.F.i0()) {
            i10 = this.f28735s.g();
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
        if (this.f28735s != null) {
            pv0 pv0Var = this.F;
            if (pv0Var.r0()) {
                ArrayList arrayList = this.f28734r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f28735s.f785c).getStoriesController().E(pv0Var.f29781j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        M();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f28735s != null && c1Var.f46535f == 19) {
            View view = c1Var.f46531a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f23078d0 = true;
                ArrayList arrayList = this.f28734r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    t7Var.f23082f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1230a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20279id = i11;
                        tL_storyItem.attachPath = k9Var.f1234f;
                        MessageObject messageObject = new MessageObject(this.f28735s.f785c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, N(), false);
                    t7Var.f23078d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f28735s.f789i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f28735s.f789i.get(size);
                    if (messageObject2 != null && this.f28735s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f23082f0 = z10;
                    pv0 pv0Var = this.F;
                    if (!pv0Var.r0() && !t7Var.f23082f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = pv0Var.t0();
                    t7Var.k(messageObject2, N(), false);
                    if (pv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = pv0Var.Z0;
                        if (messageObject2.getDialogId() == pv0Var.f29781j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        t7Var.i(z12, true);
                    } else {
                        t7Var.i(false, false);
                    }
                    t7Var.l(this.f28737x, false);
                    return;
                }
                t7Var.f23082f0 = false;
                t7Var.k(null, N(), false);
                t7Var.f23078d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f46531a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f23078d0 = true;
        }
        return x10;
    }

    public mv0(pv0 pv0Var, Context context, int i10, boolean z10) {
        super(pv0Var, context);
        TLRPC.User user;
        this.F = pv0Var;
        this.f28734r = new ArrayList();
        this.f28738y = new ArrayList();
        this.h = z10;
        this.f28733n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29806v1;
        long j3 = pv0Var.f29781j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(pv0Var.getStoriesHashtag())) {
            if (pv0Var.T1 == null) {
                pv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(pv0Var.getStoriesHashtagUsername()) ? null : pv0Var.getStoriesHashtagUsername(), pv0Var.getStoriesHashtag());
            }
            this.f28735s = pv0Var.T1;
        } else if (pv0Var.getStoriesArea() != null) {
            if (pv0Var.T1 == null) {
                pv0Var.T1 = new ai.v8(currentAccount, pv0Var.getStoriesArea());
            }
            this.f28735s = pv0Var.T1;
        } else if ((z10 && !pv0Var.v0()) || (!z10 && pv0Var.q0())) {
            this.f28735s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f28735s = n2Var.getMessagesController().getStoriesController().A(pv0Var.f29781j1, 0, i10, true);
            } else {
                this.f28735s = n2Var.getMessagesController().getStoriesController().A(pv0Var.f29781j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f28735s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f28736w = new kv0(this, n2Var.getMessagesController().getStoriesController(), pv0Var.f29781j1, this.f28735s.f785c);
        }
        M();
    }
}

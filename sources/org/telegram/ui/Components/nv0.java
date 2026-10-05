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
public class nv0 extends kv0 {
    public boolean E;
    public final qv0 F;
    public final boolean h;
    public final int f29156n;
    public final ArrayList f29157r;
    public ai.d9 f29158s;
    public final int v;
    public final lv0 f29159w;
    public boolean f29160x;
    public final ArrayList f29161y;

    public nv0(qv0 qv0Var, Context context, boolean z10) {
        this(qv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f29158s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f789i.size() || (messageObject = (MessageObject) this.f29158s.f789i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (d9Var = this.f29158s) != null) {
            if (d9Var instanceof ai.u8) {
                qv0 qv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(qv0Var.f30263v1.getCurrentAccount()).getUser(Long.valueOf(qv0Var.f30238j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f789i.size()) {
                MessageObject messageObject = (MessageObject) this.f29158s.f789i.get(i10);
                ai.d9 d9Var2 = this.f29158s;
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
        ju0 ju0Var;
        ju0 ju0Var2;
        ju0 ju0Var3;
        ju0 ju0Var4;
        ai.d9 d9Var = this.f29158s;
        if (d9Var != null && !this.h) {
            qv0 qv0Var = this.F;
            boolean z10 = qv0Var.l1;
            ju0[] ju0VarArr = qv0Var.f30239k0;
            int[] iArr = qv0Var.f30242m1;
            if ((!z10 || (qv0Var.f30240k1 && d9Var.g() > 1)) && this.f29158s.g() > 0 && !qv0Var.v0()) {
                boolean z11 = false;
                if (this.f29158s.g() < 5) {
                    iArr[1] = this.f29158s.g();
                    if (ju0VarArr != null && (ju0Var3 = ju0VarArr[0]) != null && (ju0Var4 = ju0VarArr[1]) != null && ju0Var3.h != null && ju0Var4.h != null) {
                        qv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    qv0Var.f30240k1 = z11;
                } else if (qv0Var.f30240k1) {
                    qv0Var.f30240k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (ju0VarArr != null && (ju0Var = ju0VarArr[0]) != null && (ju0Var2 = ju0VarArr[1]) != null && ju0Var.h != null && ju0Var2.h != null) {
                        qv0Var.m1(false);
                    }
                }
                qv0Var.l1 = true;
            }
        }
    }

    public final int N() {
        qv0 qv0Var = this.F;
        vt0 vt0Var = qv0Var.H;
        int[] iArr = qv0Var.f30242m1;
        if (this == vt0Var) {
            return iArr[0];
        }
        if (qv0.u(qv0Var, this) != -1) {
            return iArr[1];
        }
        return qv0Var.f30251q1;
    }

    public final void O() {
        if (this.f29158s == null) {
            return;
        }
        int N = N();
        this.f29158s.p(Math.min(100, Math.max(1, N / 2) * N * N), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f29158s == null) {
            return 0;
        }
        int size = this.f29157r.size();
        if (!this.f29158s.l() || !this.F.i0()) {
            i10 = this.f29158s.g();
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
        if (this.f29158s != null) {
            qv0 qv0Var = this.F;
            if (qv0Var.r0()) {
                ArrayList arrayList = this.f29157r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f29158s.f785c).getStoriesController().E(qv0Var.f30238j1);
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
        if (this.f29158s != null && c1Var.f46542f == 19) {
            View view = c1Var.f46538a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f23081d0 = true;
                ArrayList arrayList = this.f29157r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    t7Var.f23085f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1230a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20284id = i11;
                        tL_storyItem.attachPath = k9Var.f1234f;
                        MessageObject messageObject = new MessageObject(this.f29158s.f785c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, N(), false);
                    t7Var.f23081d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f29158s.f789i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f29158s.f789i.get(size);
                    if (messageObject2 != null && this.f29158s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f23085f0 = z10;
                    qv0 qv0Var = this.F;
                    if (!qv0Var.r0() && !t7Var.f23085f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = qv0Var.t0();
                    t7Var.k(messageObject2, N(), false);
                    if (qv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = qv0Var.Z0;
                        if (messageObject2.getDialogId() == qv0Var.f30238j1) {
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
                    t7Var.l(this.f29160x, false);
                    return;
                }
                t7Var.f23085f0 = false;
                t7Var.k(null, N(), false);
                t7Var.f23081d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f46538a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f23081d0 = true;
        }
        return x10;
    }

    public nv0(qv0 qv0Var, Context context, int i10, boolean z10) {
        super(qv0Var, context);
        TLRPC.User user;
        this.F = qv0Var;
        this.f29157r = new ArrayList();
        this.f29161y = new ArrayList();
        this.h = z10;
        this.f29156n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
        long j3 = qv0Var.f30238j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(qv0Var.getStoriesHashtag())) {
            if (qv0Var.T1 == null) {
                qv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(qv0Var.getStoriesHashtagUsername()) ? null : qv0Var.getStoriesHashtagUsername(), qv0Var.getStoriesHashtag());
            }
            this.f29158s = qv0Var.T1;
        } else if (qv0Var.getStoriesArea() != null) {
            if (qv0Var.T1 == null) {
                qv0Var.T1 = new ai.v8(currentAccount, qv0Var.getStoriesArea());
            }
            this.f29158s = qv0Var.T1;
        } else if ((z10 && !qv0Var.v0()) || (!z10 && qv0Var.q0())) {
            this.f29158s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f29158s = n2Var.getMessagesController().getStoriesController().A(qv0Var.f30238j1, 0, i10, true);
            } else {
                this.f29158s = n2Var.getMessagesController().getStoriesController().A(qv0Var.f30238j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f29158s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f29159w = new lv0(this, n2Var.getMessagesController().getStoriesController(), qv0Var.f30238j1, this.f29158s.f785c);
        }
        M();
    }
}

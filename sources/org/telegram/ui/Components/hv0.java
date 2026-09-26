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
public class hv0 extends ev0 {
    public boolean E;
    public final kv0 F;
    public final boolean h;
    public final int f24872n;
    public final ArrayList f24873r;
    public ai.d9 f24874s;
    public final int v;
    public final fv0 f24875w;
    public boolean f24876x;
    public final ArrayList f24877y;

    public hv0(kv0 kv0Var, Context context, boolean z10) {
        this(kv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f24874s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f725i.size() || (messageObject = (MessageObject) this.f24874s.f725i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (d9Var = this.f24874s) != null) {
            if (d9Var instanceof ai.u8) {
                kv0 kv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(kv0Var.f25866v1.getCurrentAccount()).getUser(Long.valueOf(kv0Var.f25841j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f725i.size()) {
                MessageObject messageObject = (MessageObject) this.f24874s.f725i.get(i10);
                ai.d9 d9Var2 = this.f24874s;
                if (d9Var2.f723f > 0) {
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
        du0 du0Var;
        du0 du0Var2;
        du0 du0Var3;
        du0 du0Var4;
        ai.d9 d9Var = this.f24874s;
        if (d9Var != null && !this.h) {
            kv0 kv0Var = this.F;
            boolean z10 = kv0Var.l1;
            du0[] du0VarArr = kv0Var.f25842k0;
            int[] iArr = kv0Var.f25845m1;
            if ((!z10 || (kv0Var.f25843k1 && d9Var.g() > 1)) && this.f24874s.g() > 0 && !kv0Var.v0()) {
                boolean z11 = false;
                if (this.f24874s.g() < 5) {
                    iArr[1] = this.f24874s.g();
                    if (du0VarArr != null && (du0Var3 = du0VarArr[0]) != null && (du0Var4 = du0VarArr[1]) != null && du0Var3.h != null && du0Var4.h != null) {
                        kv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    kv0Var.f25843k1 = z11;
                } else if (kv0Var.f25843k1) {
                    kv0Var.f25843k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (du0VarArr != null && (du0Var = du0VarArr[0]) != null && (du0Var2 = du0VarArr[1]) != null && du0Var.h != null && du0Var2.h != null) {
                        kv0Var.m1(false);
                    }
                }
                kv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        kv0 kv0Var = this.F;
        pt0 pt0Var = kv0Var.H;
        int[] iArr = kv0Var.f25845m1;
        if (this == pt0Var) {
            return iArr[0];
        }
        if (kv0.u(kv0Var, this) != -1) {
            return iArr[1];
        }
        return kv0Var.f25854q1;
    }

    public final void P() {
        if (this.f24874s == null) {
            return;
        }
        int O = O();
        this.f24874s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f24874s == null) {
            return 0;
        }
        int size = this.f24873r.size();
        if (!this.f24874s.l() || !this.F.i0()) {
            i10 = this.f24874s.g();
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
        if (this.f24874s != null) {
            kv0 kv0Var = this.F;
            if (kv0Var.r0()) {
                ArrayList arrayList = this.f24873r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f24874s.f722c).getStoriesController().E(kv0Var.f25841j1);
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
        if (this.f24874s != null && c1Var.f42962f == 19) {
            View view = c1Var.f42959a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f21216d0 = true;
                ArrayList arrayList = this.f24873r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    t7Var.f21219f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1141a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f18570id = i11;
                        tL_storyItem.attachPath = k9Var.f1144f;
                        MessageObject messageObject = new MessageObject(this.f24874s.f722c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, O(), false);
                    t7Var.f21216d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f24874s.f725i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f24874s.f725i.get(size);
                    if (messageObject2 != null && this.f24874s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f21219f0 = z10;
                    kv0 kv0Var = this.F;
                    if (!kv0Var.r0() && !t7Var.f21219f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = kv0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (kv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = kv0Var.Z0;
                        if (messageObject2.getDialogId() == kv0Var.f25841j1) {
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
                    t7Var.l(this.f24876x, false);
                    return;
                }
                t7Var.f21219f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f21216d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f42959a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f21216d0 = true;
        }
        return x10;
    }

    public hv0(kv0 kv0Var, Context context, int i10, boolean z10) {
        super(kv0Var, context);
        TLRPC.User user;
        this.F = kv0Var;
        this.f24873r = new ArrayList();
        this.f24877y = new ArrayList();
        this.h = z10;
        this.f24872n = i10;
        org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
        long j3 = kv0Var.f25841j1;
        int currentAccount = m2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(kv0Var.getStoriesHashtag())) {
            if (kv0Var.T1 == null) {
                kv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(kv0Var.getStoriesHashtagUsername()) ? null : kv0Var.getStoriesHashtagUsername(), kv0Var.getStoriesHashtag());
            }
            this.f24874s = kv0Var.T1;
        } else if (kv0Var.getStoriesArea() != null) {
            if (kv0Var.T1 == null) {
                kv0Var.T1 = new ai.v8(currentAccount, kv0Var.getStoriesArea());
            }
            this.f24874s = kv0Var.T1;
        } else if ((z10 && !kv0Var.v0()) || (!z10 && kv0Var.q0())) {
            this.f24874s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f24874s = m2Var.getMessagesController().getStoriesController().A(kv0Var.f25841j1, 0, i10, true);
            } else {
                this.f24874s = m2Var.getMessagesController().getStoriesController().A(kv0Var.f25841j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f24874s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f24875w = new fv0(this, m2Var.getMessagesController().getStoriesController(), kv0Var.f25841j1, this.f24874s.f722c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

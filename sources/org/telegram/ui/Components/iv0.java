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
public class iv0 extends fv0 {
    public boolean E;
    public final lv0 F;
    public final boolean h;
    public final int f25182n;
    public final ArrayList f25183r;
    public ai.d9 f25184s;
    public final int v;
    public final gv0 f25185w;
    public boolean f25186x;
    public final ArrayList f25187y;

    public iv0(lv0 lv0Var, Context context, boolean z10) {
        this(lv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f25184s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f718i.size() || (messageObject = (MessageObject) this.f25184s.f718i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (d9Var = this.f25184s) != null) {
            if (d9Var instanceof ai.t8) {
                lv0 lv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(lv0Var.f26234v1.getCurrentAccount()).getUser(Long.valueOf(lv0Var.f26209j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f718i.size()) {
                MessageObject messageObject = (MessageObject) this.f25184s.f718i.get(i10);
                ai.d9 d9Var2 = this.f25184s;
                if (d9Var2.f716f > 0) {
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
        eu0 eu0Var;
        eu0 eu0Var2;
        eu0 eu0Var3;
        eu0 eu0Var4;
        ai.d9 d9Var = this.f25184s;
        if (d9Var != null && !this.h) {
            lv0 lv0Var = this.F;
            boolean z10 = lv0Var.l1;
            eu0[] eu0VarArr = lv0Var.f26210k0;
            int[] iArr = lv0Var.f26213m1;
            if ((!z10 || (lv0Var.f26211k1 && d9Var.g() > 1)) && this.f25184s.g() > 0 && !lv0Var.v0()) {
                boolean z11 = false;
                if (this.f25184s.g() < 5) {
                    iArr[1] = this.f25184s.g();
                    if (eu0VarArr != null && (eu0Var3 = eu0VarArr[0]) != null && (eu0Var4 = eu0VarArr[1]) != null && eu0Var3.h != null && eu0Var4.h != null) {
                        lv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    lv0Var.f26211k1 = z11;
                } else if (lv0Var.f26211k1) {
                    lv0Var.f26211k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (eu0VarArr != null && (eu0Var = eu0VarArr[0]) != null && (eu0Var2 = eu0VarArr[1]) != null && eu0Var.h != null && eu0Var2.h != null) {
                        lv0Var.m1(false);
                    }
                }
                lv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        lv0 lv0Var = this.F;
        qt0 qt0Var = lv0Var.H;
        int[] iArr = lv0Var.f26213m1;
        if (this == qt0Var) {
            return iArr[0];
        }
        if (lv0.u(lv0Var, this) != -1) {
            return iArr[1];
        }
        return lv0Var.f26222q1;
    }

    public final void P() {
        if (this.f25184s == null) {
            return;
        }
        int O = O();
        this.f25184s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f25184s == null) {
            return 0;
        }
        int size = this.f25183r.size();
        if (!this.f25184s.l() || !this.F.i0()) {
            i10 = this.f25184s.g();
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
        if (this.f25184s != null) {
            lv0 lv0Var = this.F;
            if (lv0Var.r0()) {
                ArrayList arrayList = this.f25183r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f25184s.f715c).getStoriesController().E(lv0Var.f26209j1);
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
        if (this.f25184s != null && c1Var.f42998f == 19) {
            View view = c1Var.f42995a;
            if (view instanceof org.telegram.ui.Cells.u7) {
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                u7Var.f21640d0 = true;
                ArrayList arrayList = this.f25183r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    u7Var.f21643f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1138a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f18578id = i11;
                        tL_storyItem.attachPath = k9Var.f1141f;
                        MessageObject messageObject = new MessageObject(this.f25184s.f715c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    u7Var.k(k9Var.K, O(), false);
                    u7Var.f21640d0 = true;
                    u7Var.setReorder(false);
                    u7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f25184s.f718i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f25184s.f718i.get(size);
                    if (messageObject2 != null && this.f25184s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u7Var.f21643f0 = z10;
                    lv0 lv0Var = this.F;
                    if (!lv0Var.r0() && !u7Var.f21643f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u7Var.setReorder(z11);
                    u7Var.h = lv0Var.t0();
                    u7Var.k(messageObject2, O(), false);
                    if (lv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = lv0Var.Z0;
                        if (messageObject2.getDialogId() == lv0Var.f26209j1) {
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
                    u7Var.l(this.f25186x, false);
                    return;
                }
                u7Var.f21643f0 = false;
                u7Var.k(null, O(), false);
                u7Var.f21640d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f42995a;
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).f21640d0 = true;
        }
        return x10;
    }

    public iv0(lv0 lv0Var, Context context, int i10, boolean z10) {
        super(lv0Var, context);
        TLRPC.User user;
        this.F = lv0Var;
        this.f25183r = new ArrayList();
        this.f25187y = new ArrayList();
        this.h = z10;
        this.f25182n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
        long j3 = lv0Var.f26209j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(lv0Var.getStoriesHashtag())) {
            if (lv0Var.T1 == null) {
                lv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(lv0Var.getStoriesHashtagUsername()) ? null : lv0Var.getStoriesHashtagUsername(), lv0Var.getStoriesHashtag());
            }
            this.f25184s = lv0Var.T1;
        } else if (lv0Var.getStoriesArea() != null) {
            if (lv0Var.T1 == null) {
                lv0Var.T1 = new ai.v8(currentAccount, lv0Var.getStoriesArea());
            }
            this.f25184s = lv0Var.T1;
        } else if ((z10 && !lv0Var.v0()) || (!z10 && lv0Var.q0())) {
            this.f25184s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f25184s = n2Var.getMessagesController().getStoriesController().A(lv0Var.f26209j1, 0, i10, true);
            } else {
                this.f25184s = n2Var.getMessagesController().getStoriesController().A(lv0Var.f26209j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f25184s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f25185w = new gv0(this, n2Var.getMessagesController().getStoriesController(), lv0Var.f26209j1, this.f25184s.f715c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

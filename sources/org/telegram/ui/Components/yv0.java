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
public class yv0 extends vv0 {
    public boolean E;
    public final bw0 F;
    public final boolean h;
    public final int f33367n;
    public final ArrayList f33368r;
    public ai.e9 f33369s;
    public final int v;
    public final wv0 f33370w;
    public boolean f33371x;
    public final ArrayList f33372y;

    public yv0(bw0 bw0Var, Context context, boolean z10) {
        this(bw0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.f33369s;
        if (e9Var == null || i10 < 0 || i10 >= e9Var.f899i.size() || (messageObject = (MessageObject) this.f33369s.f899i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        ai.e9 e9Var;
        if (!this.h && (e9Var = this.f33369s) != null) {
            if (e9Var instanceof ai.v8) {
                bw0 bw0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(bw0Var.f25166v1.getCurrentAccount()).getUser(Long.valueOf(bw0Var.f25141j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < e9Var.f899i.size()) {
                MessageObject messageObject = (MessageObject) this.f33369s.f899i.get(i10);
                ai.e9 e9Var2 = this.f33369s;
                if (e9Var2.f897f > 0) {
                    return true;
                }
                return e9Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        uu0 uu0Var;
        uu0 uu0Var2;
        uu0 uu0Var3;
        uu0 uu0Var4;
        ai.e9 e9Var = this.f33369s;
        if (e9Var != null && !this.h) {
            bw0 bw0Var = this.F;
            boolean z10 = bw0Var.l1;
            uu0[] uu0VarArr = bw0Var.f25142k0;
            int[] iArr = bw0Var.f25145m1;
            if ((!z10 || (bw0Var.f25143k1 && e9Var.g() > 1)) && this.f33369s.g() > 0 && !bw0Var.v0()) {
                boolean z11 = false;
                if (this.f33369s.g() < 5) {
                    iArr[1] = this.f33369s.g();
                    if (uu0VarArr != null && (uu0Var3 = uu0VarArr[0]) != null && (uu0Var4 = uu0VarArr[1]) != null && uu0Var3.h != null && uu0Var4.h != null) {
                        bw0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    bw0Var.f25143k1 = z11;
                } else if (bw0Var.f25143k1) {
                    bw0Var.f25143k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (uu0VarArr != null && (uu0Var = uu0VarArr[0]) != null && (uu0Var2 = uu0VarArr[1]) != null && uu0Var.h != null && uu0Var2.h != null) {
                        bw0Var.m1(false);
                    }
                }
                bw0Var.l1 = true;
            }
        }
    }

    public final int O() {
        bw0 bw0Var = this.F;
        gu0 gu0Var = bw0Var.H;
        int[] iArr = bw0Var.f25145m1;
        if (this == gu0Var) {
            return iArr[0];
        }
        if (bw0.u(bw0Var, this) != -1) {
            return iArr[1];
        }
        return bw0Var.f25154q1;
    }

    public final void P() {
        if (this.f33369s == null) {
            return;
        }
        int O = O();
        this.f33369s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f33369s == null) {
            return 0;
        }
        int size = this.f33368r.size();
        if (!this.f33369s.l() || !this.F.i0()) {
            i10 = this.f33369s.g();
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
        if (this.f33369s != null) {
            bw0 bw0Var = this.F;
            if (bw0Var.r0()) {
                ArrayList arrayList = this.f33368r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f33369s.f895c).getStoriesController().E(bw0Var.f25141j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f33369s != null && d1Var.f47662f == 19) {
            View view = d1Var.f47658a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f23067d0 = true;
                ArrayList arrayList = this.f33368r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.l9 l9Var = (ai.l9) arrayList.get(i10);
                    t7Var.f23071f0 = false;
                    if (l9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = l9Var.f1349a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20275id = i11;
                        tL_storyItem.attachPath = l9Var.f1353f;
                        MessageObject messageObject = new MessageObject(this.f33369s.f895c, tL_storyItem);
                        l9Var.K = messageObject;
                        messageObject.uploadingStory = l9Var;
                    }
                    t7Var.k(l9Var.K, O(), false);
                    t7Var.f23067d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f33369s.f899i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f33369s.f899i.get(size);
                    if (messageObject2 != null && this.f33369s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f23071f0 = z10;
                    bw0 bw0Var = this.F;
                    if (!bw0Var.r0() && !t7Var.f23071f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = bw0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (bw0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = bw0Var.Z0;
                        if (messageObject2.getDialogId() == bw0Var.f25141j1) {
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
                    t7Var.l(this.f33371x, false);
                    return;
                }
                t7Var.f23071f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f23067d0 = true;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        s4.d1 x10 = super.x(viewGroup, i10);
        View view = x10.f47658a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f23067d0 = true;
        }
        return x10;
    }

    public yv0(bw0 bw0Var, Context context, int i10, boolean z10) {
        super(bw0Var, context);
        int i11;
        TLRPC.User user;
        this.F = bw0Var;
        this.f33368r = new ArrayList();
        this.f33372y = new ArrayList();
        this.h = z10;
        this.f33367n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
        long j3 = bw0Var.f25141j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(bw0Var.getStoriesHashtag())) {
            if (bw0Var.T1 == null) {
                bw0Var.T1 = new ai.w8(currentAccount, TextUtils.isEmpty(bw0Var.getStoriesHashtagUsername()) ? null : bw0Var.getStoriesHashtagUsername(), bw0Var.getStoriesHashtag());
            }
            this.f33369s = bw0Var.T1;
        } else if (bw0Var.getStoriesArea() != null) {
            if (bw0Var.T1 == null) {
                bw0Var.T1 = new ai.w8(currentAccount, bw0Var.getStoriesArea());
            }
            this.f33369s = bw0Var.T1;
        } else if ((z10 && !bw0Var.v0()) || (!z10 && bw0Var.q0())) {
            this.f33369s = null;
        } else {
            int i12 = 1;
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f33369s = n2Var.getMessagesController().getStoriesController().A(bw0Var.f25141j1, 0, i10, true);
            } else {
                ai.m9 storiesController = n2Var.getMessagesController().getStoriesController();
                long j10 = bw0Var.f25141j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f33369s = storiesController.A(j10, i11, -1, true);
                }
                i11 = i12;
                this.f33369s = storiesController.A(j10, i11, -1, true);
            }
        }
        ai.e9 e9Var = this.f33369s;
        if (e9Var != null) {
            this.v = e9Var.o();
            this.f33370w = new wv0(this, n2Var.getMessagesController().getStoriesController(), bw0Var.f25141j1, this.f33369s.f895c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

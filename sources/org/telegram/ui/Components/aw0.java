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
public class aw0 extends xv0 {
    public boolean E;
    public final dw0 F;
    public final boolean h;
    public final int f24606n;
    public final ArrayList f24607r;
    public ai.e9 f24608s;
    public final int v;
    public final yv0 f24609w;
    public boolean f24610x;
    public final ArrayList f24611y;

    public aw0(dw0 dw0Var, Context context, boolean z10) {
        this(dw0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.f24608s;
        if (e9Var == null || i10 < 0 || i10 >= e9Var.f899i.size() || (messageObject = (MessageObject) this.f24608s.f899i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (e9Var = this.f24608s) != null) {
            if (e9Var instanceof ai.v8) {
                dw0 dw0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(dw0Var.f25735v1.getCurrentAccount()).getUser(Long.valueOf(dw0Var.f25710j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < e9Var.f899i.size()) {
                MessageObject messageObject = (MessageObject) this.f24608s.f899i.get(i10);
                ai.e9 e9Var2 = this.f24608s;
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
        wu0 wu0Var;
        wu0 wu0Var2;
        wu0 wu0Var3;
        wu0 wu0Var4;
        ai.e9 e9Var = this.f24608s;
        if (e9Var != null && !this.h) {
            dw0 dw0Var = this.F;
            boolean z10 = dw0Var.l1;
            wu0[] wu0VarArr = dw0Var.f25711k0;
            int[] iArr = dw0Var.f25714m1;
            if ((!z10 || (dw0Var.f25712k1 && e9Var.g() > 1)) && this.f24608s.g() > 0 && !dw0Var.v0()) {
                boolean z11 = false;
                if (this.f24608s.g() < 5) {
                    iArr[1] = this.f24608s.g();
                    if (wu0VarArr != null && (wu0Var3 = wu0VarArr[0]) != null && (wu0Var4 = wu0VarArr[1]) != null && wu0Var3.h != null && wu0Var4.h != null) {
                        dw0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    dw0Var.f25712k1 = z11;
                } else if (dw0Var.f25712k1) {
                    dw0Var.f25712k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (wu0VarArr != null && (wu0Var = wu0VarArr[0]) != null && (wu0Var2 = wu0VarArr[1]) != null && wu0Var.h != null && wu0Var2.h != null) {
                        dw0Var.m1(false);
                    }
                }
                dw0Var.l1 = true;
            }
        }
    }

    public final int O() {
        dw0 dw0Var = this.F;
        iu0 iu0Var = dw0Var.H;
        int[] iArr = dw0Var.f25714m1;
        if (this == iu0Var) {
            return iArr[0];
        }
        if (dw0.u(dw0Var, this) != -1) {
            return iArr[1];
        }
        return dw0Var.f25723q1;
    }

    public final void P() {
        if (this.f24608s == null) {
            return;
        }
        int O = O();
        this.f24608s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f24608s == null) {
            return 0;
        }
        int size = this.f24607r.size();
        if (!this.f24608s.l() || !this.F.i0()) {
            i10 = this.f24608s.g();
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
        if (this.f24608s != null) {
            dw0 dw0Var = this.F;
            if (dw0Var.r0()) {
                ArrayList arrayList = this.f24607r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f24608s.f895c).getStoriesController().E(dw0Var.f25710j1);
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
        if (this.f24608s != null && d1Var.f47752f == 19) {
            View view = d1Var.f47748a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f23059d0 = true;
                ArrayList arrayList = this.f24607r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.l9 l9Var = (ai.l9) arrayList.get(i10);
                    t7Var.f23063f0 = false;
                    if (l9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = l9Var.f1349a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20269id = i11;
                        tL_storyItem.attachPath = l9Var.f1353f;
                        MessageObject messageObject = new MessageObject(this.f24608s.f895c, tL_storyItem);
                        l9Var.K = messageObject;
                        messageObject.uploadingStory = l9Var;
                    }
                    t7Var.k(l9Var.K, O(), false);
                    t7Var.f23059d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f24608s.f899i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f24608s.f899i.get(size);
                    if (messageObject2 != null && this.f24608s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f23063f0 = z10;
                    dw0 dw0Var = this.F;
                    if (!dw0Var.r0() && !t7Var.f23063f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = dw0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (dw0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = dw0Var.Z0;
                        if (messageObject2.getDialogId() == dw0Var.f25710j1) {
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
                    t7Var.l(this.f24610x, false);
                    return;
                }
                t7Var.f23063f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f23059d0 = true;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        s4.d1 x10 = super.x(viewGroup, i10);
        View view = x10.f47748a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f23059d0 = true;
        }
        return x10;
    }

    public aw0(dw0 dw0Var, Context context, int i10, boolean z10) {
        super(dw0Var, context);
        int i11;
        TLRPC.User user;
        this.F = dw0Var;
        this.f24607r = new ArrayList();
        this.f24611y = new ArrayList();
        this.h = z10;
        this.f24606n = i10;
        org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
        long j3 = dw0Var.f25710j1;
        int currentAccount = m2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(dw0Var.getStoriesHashtag())) {
            if (dw0Var.T1 == null) {
                dw0Var.T1 = new ai.w8(currentAccount, TextUtils.isEmpty(dw0Var.getStoriesHashtagUsername()) ? null : dw0Var.getStoriesHashtagUsername(), dw0Var.getStoriesHashtag());
            }
            this.f24608s = dw0Var.T1;
        } else if (dw0Var.getStoriesArea() != null) {
            if (dw0Var.T1 == null) {
                dw0Var.T1 = new ai.w8(currentAccount, dw0Var.getStoriesArea());
            }
            this.f24608s = dw0Var.T1;
        } else if ((z10 && !dw0Var.v0()) || (!z10 && dw0Var.q0())) {
            this.f24608s = null;
        } else {
            int i12 = 1;
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f24608s = m2Var.getMessagesController().getStoriesController().A(dw0Var.f25710j1, 0, i10, true);
            } else {
                ai.m9 storiesController = m2Var.getMessagesController().getStoriesController();
                long j10 = dw0Var.f25710j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f24608s = storiesController.A(j10, i11, -1, true);
                }
                i11 = i12;
                this.f24608s = storiesController.A(j10, i11, -1, true);
            }
        }
        ai.e9 e9Var = this.f24608s;
        if (e9Var != null) {
            this.v = e9Var.o();
            this.f24609w = new yv0(this, m2Var.getMessagesController().getStoriesController(), dw0Var.f25710j1, this.f24608s.f895c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

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
public class ew0 extends bw0 {
    public boolean E;
    public final hw0 F;
    public final boolean h;
    public final int f25793n;
    public final ArrayList f25794r;
    public ai.e9 f25795s;
    public final int v;
    public final cw0 f25796w;
    public boolean f25797x;
    public final ArrayList f25798y;

    public ew0(hw0 hw0Var, Context context, boolean z10) {
        this(hw0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.f25795s;
        if (e9Var == null || i10 < 0 || i10 >= e9Var.f897i.size() || (messageObject = (MessageObject) this.f25795s.f897i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (e9Var = this.f25795s) != null) {
            if (e9Var instanceof ai.v8) {
                hw0 hw0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(hw0Var.f26972v1.getCurrentAccount()).getUser(Long.valueOf(hw0Var.f26947j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < e9Var.f897i.size()) {
                MessageObject messageObject = (MessageObject) this.f25795s.f897i.get(i10);
                ai.e9 e9Var2 = this.f25795s;
                if (e9Var2.f895f > 0) {
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
        av0 av0Var;
        av0 av0Var2;
        av0 av0Var3;
        av0 av0Var4;
        ai.e9 e9Var = this.f25795s;
        if (e9Var != null && !this.h) {
            hw0 hw0Var = this.F;
            boolean z10 = hw0Var.l1;
            av0[] av0VarArr = hw0Var.f26948k0;
            int[] iArr = hw0Var.f26951m1;
            if ((!z10 || (hw0Var.f26949k1 && e9Var.g() > 1)) && this.f25795s.g() > 0 && !hw0Var.v0()) {
                boolean z11 = false;
                if (this.f25795s.g() < 5) {
                    iArr[1] = this.f25795s.g();
                    if (av0VarArr != null && (av0Var3 = av0VarArr[0]) != null && (av0Var4 = av0VarArr[1]) != null && av0Var3.h != null && av0Var4.h != null) {
                        hw0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    hw0Var.f26949k1 = z11;
                } else if (hw0Var.f26949k1) {
                    hw0Var.f26949k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (av0VarArr != null && (av0Var = av0VarArr[0]) != null && (av0Var2 = av0VarArr[1]) != null && av0Var.h != null && av0Var2.h != null) {
                        hw0Var.m1(false);
                    }
                }
                hw0Var.l1 = true;
            }
        }
    }

    public final int O() {
        hw0 hw0Var = this.F;
        mu0 mu0Var = hw0Var.H;
        int[] iArr = hw0Var.f26951m1;
        if (this == mu0Var) {
            return iArr[0];
        }
        if (hw0.u(hw0Var, this) != -1) {
            return iArr[1];
        }
        return hw0Var.f26960q1;
    }

    public final void P() {
        if (this.f25795s == null) {
            return;
        }
        int O = O();
        this.f25795s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f25795s == null) {
            return 0;
        }
        int size = this.f25794r.size();
        if (!this.f25795s.l() || !this.F.i0()) {
            i10 = this.f25795s.g();
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
        if (this.f25795s != null) {
            hw0 hw0Var = this.F;
            if (hw0Var.r0()) {
                ArrayList arrayList = this.f25794r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f25795s.f893c).getStoriesController().E(hw0Var.f26947j1);
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
        if (this.f25795s != null && d1Var.f47893f == 19) {
            View view = d1Var.f47889a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f22839d0 = true;
                ArrayList arrayList = this.f25794r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.l9 l9Var = (ai.l9) arrayList.get(i10);
                    t7Var.f22843f0 = false;
                    if (l9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = l9Var.f1347a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20041id = i11;
                        tL_storyItem.attachPath = l9Var.f1351f;
                        MessageObject messageObject = new MessageObject(this.f25795s.f893c, tL_storyItem);
                        l9Var.K = messageObject;
                        messageObject.uploadingStory = l9Var;
                    }
                    t7Var.k(l9Var.K, O(), false);
                    t7Var.f22839d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f25795s.f897i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f25795s.f897i.get(size);
                    if (messageObject2 != null && this.f25795s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f22843f0 = z10;
                    hw0 hw0Var = this.F;
                    if (!hw0Var.r0() && !t7Var.f22843f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = hw0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (hw0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = hw0Var.Z0;
                        if (messageObject2.getDialogId() == hw0Var.f26947j1) {
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
                    t7Var.l(this.f25797x, false);
                    return;
                }
                t7Var.f22843f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f22839d0 = true;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        s4.d1 x10 = super.x(viewGroup, i10);
        View view = x10.f47889a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f22839d0 = true;
        }
        return x10;
    }

    public ew0(hw0 hw0Var, Context context, int i10, boolean z10) {
        super(hw0Var, context);
        int i11;
        TLRPC.User user;
        this.F = hw0Var;
        this.f25794r = new ArrayList();
        this.f25798y = new ArrayList();
        this.h = z10;
        this.f25793n = i10;
        org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26972v1;
        long j3 = hw0Var.f26947j1;
        int currentAccount = m2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(hw0Var.getStoriesHashtag())) {
            if (hw0Var.T1 == null) {
                hw0Var.T1 = new ai.w8(currentAccount, TextUtils.isEmpty(hw0Var.getStoriesHashtagUsername()) ? null : hw0Var.getStoriesHashtagUsername(), hw0Var.getStoriesHashtag());
            }
            this.f25795s = hw0Var.T1;
        } else if (hw0Var.getStoriesArea() != null) {
            if (hw0Var.T1 == null) {
                hw0Var.T1 = new ai.w8(currentAccount, hw0Var.getStoriesArea());
            }
            this.f25795s = hw0Var.T1;
        } else if ((z10 && !hw0Var.v0()) || (!z10 && hw0Var.q0())) {
            this.f25795s = null;
        } else {
            int i12 = 1;
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f25795s = m2Var.getMessagesController().getStoriesController().A(hw0Var.f26947j1, 0, i10, true);
            } else {
                ai.m9 storiesController = m2Var.getMessagesController().getStoriesController();
                long j10 = hw0Var.f26947j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f25795s = storiesController.A(j10, i11, -1, true);
                }
                i11 = i12;
                this.f25795s = storiesController.A(j10, i11, -1, true);
            }
        }
        ai.e9 e9Var = this.f25795s;
        if (e9Var != null) {
            this.v = e9Var.o();
            this.f25796w = new cw0(this, m2Var.getMessagesController().getStoriesController(), hw0Var.f26947j1, this.f25795s.f893c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

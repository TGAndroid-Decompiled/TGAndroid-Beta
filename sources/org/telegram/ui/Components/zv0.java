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
public class zv0 extends wv0 {
    public boolean E;
    public final cw0 F;
    public final boolean h;
    public final int f33690n;
    public final ArrayList f33691r;
    public ai.e9 f33692s;
    public final int v;
    public final xv0 f33693w;
    public boolean f33694x;
    public final ArrayList f33695y;

    public zv0(cw0 cw0Var, Context context, boolean z10) {
        this(cw0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.f33692s;
        if (e9Var == null || i10 < 0 || i10 >= e9Var.f899i.size() || (messageObject = (MessageObject) this.f33692s.f899i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (e9Var = this.f33692s) != null) {
            if (e9Var instanceof ai.v8) {
                cw0 cw0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(cw0Var.f25474v1.getCurrentAccount()).getUser(Long.valueOf(cw0Var.f25449j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < e9Var.f899i.size()) {
                MessageObject messageObject = (MessageObject) this.f33692s.f899i.get(i10);
                ai.e9 e9Var2 = this.f33692s;
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
        vu0 vu0Var;
        vu0 vu0Var2;
        vu0 vu0Var3;
        vu0 vu0Var4;
        ai.e9 e9Var = this.f33692s;
        if (e9Var != null && !this.h) {
            cw0 cw0Var = this.F;
            boolean z10 = cw0Var.l1;
            vu0[] vu0VarArr = cw0Var.f25450k0;
            int[] iArr = cw0Var.f25453m1;
            if ((!z10 || (cw0Var.f25451k1 && e9Var.g() > 1)) && this.f33692s.g() > 0 && !cw0Var.v0()) {
                boolean z11 = false;
                if (this.f33692s.g() < 5) {
                    iArr[1] = this.f33692s.g();
                    if (vu0VarArr != null && (vu0Var3 = vu0VarArr[0]) != null && (vu0Var4 = vu0VarArr[1]) != null && vu0Var3.h != null && vu0Var4.h != null) {
                        cw0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    cw0Var.f25451k1 = z11;
                } else if (cw0Var.f25451k1) {
                    cw0Var.f25451k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (vu0VarArr != null && (vu0Var = vu0VarArr[0]) != null && (vu0Var2 = vu0VarArr[1]) != null && vu0Var.h != null && vu0Var2.h != null) {
                        cw0Var.m1(false);
                    }
                }
                cw0Var.l1 = true;
            }
        }
    }

    public final int O() {
        cw0 cw0Var = this.F;
        hu0 hu0Var = cw0Var.H;
        int[] iArr = cw0Var.f25453m1;
        if (this == hu0Var) {
            return iArr[0];
        }
        if (cw0.u(cw0Var, this) != -1) {
            return iArr[1];
        }
        return cw0Var.f25462q1;
    }

    public final void P() {
        if (this.f33692s == null) {
            return;
        }
        int O = O();
        this.f33692s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f33692s == null) {
            return 0;
        }
        int size = this.f33691r.size();
        if (!this.f33692s.l() || !this.F.i0()) {
            i10 = this.f33692s.g();
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
        if (this.f33692s != null) {
            cw0 cw0Var = this.F;
            if (cw0Var.r0()) {
                ArrayList arrayList = this.f33691r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f33692s.f895c).getStoriesController().E(cw0Var.f25449j1);
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
        if (this.f33692s != null && d1Var.f47706f == 19) {
            View view = d1Var.f47702a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f23071d0 = true;
                ArrayList arrayList = this.f33691r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.l9 l9Var = (ai.l9) arrayList.get(i10);
                    t7Var.f23075f0 = false;
                    if (l9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = l9Var.f1349a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20279id = i11;
                        tL_storyItem.attachPath = l9Var.f1353f;
                        MessageObject messageObject = new MessageObject(this.f33692s.f895c, tL_storyItem);
                        l9Var.K = messageObject;
                        messageObject.uploadingStory = l9Var;
                    }
                    t7Var.k(l9Var.K, O(), false);
                    t7Var.f23071d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f33692s.f899i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f33692s.f899i.get(size);
                    if (messageObject2 != null && this.f33692s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f23075f0 = z10;
                    cw0 cw0Var = this.F;
                    if (!cw0Var.r0() && !t7Var.f23075f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = cw0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (cw0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = cw0Var.Z0;
                        if (messageObject2.getDialogId() == cw0Var.f25449j1) {
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
                    t7Var.l(this.f33694x, false);
                    return;
                }
                t7Var.f23075f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f23071d0 = true;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        s4.d1 x10 = super.x(viewGroup, i10);
        View view = x10.f47702a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f23071d0 = true;
        }
        return x10;
    }

    public zv0(cw0 cw0Var, Context context, int i10, boolean z10) {
        super(cw0Var, context);
        int i11;
        TLRPC.User user;
        this.F = cw0Var;
        this.f33691r = new ArrayList();
        this.f33695y = new ArrayList();
        this.h = z10;
        this.f33690n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
        long j3 = cw0Var.f25449j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(cw0Var.getStoriesHashtag())) {
            if (cw0Var.T1 == null) {
                cw0Var.T1 = new ai.w8(currentAccount, TextUtils.isEmpty(cw0Var.getStoriesHashtagUsername()) ? null : cw0Var.getStoriesHashtagUsername(), cw0Var.getStoriesHashtag());
            }
            this.f33692s = cw0Var.T1;
        } else if (cw0Var.getStoriesArea() != null) {
            if (cw0Var.T1 == null) {
                cw0Var.T1 = new ai.w8(currentAccount, cw0Var.getStoriesArea());
            }
            this.f33692s = cw0Var.T1;
        } else if ((z10 && !cw0Var.v0()) || (!z10 && cw0Var.q0())) {
            this.f33692s = null;
        } else {
            int i12 = 1;
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f33692s = n2Var.getMessagesController().getStoriesController().A(cw0Var.f25449j1, 0, i10, true);
            } else {
                ai.m9 storiesController = n2Var.getMessagesController().getStoriesController();
                long j10 = cw0Var.f25449j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f33692s = storiesController.A(j10, i11, -1, true);
                }
                i11 = i12;
                this.f33692s = storiesController.A(j10, i11, -1, true);
            }
        }
        ai.e9 e9Var = this.f33692s;
        if (e9Var != null) {
            this.v = e9Var.o();
            this.f33693w = new xv0(this, n2Var.getMessagesController().getStoriesController(), cw0Var.f25449j1, this.f33692s.f895c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

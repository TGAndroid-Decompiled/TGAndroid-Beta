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
public class uu0 extends ru0 {
    public boolean E;
    public final xu0 F;
    public final boolean h;
    public final int f30982n;
    public final ArrayList f30983r;
    public bi.l8 f30984s;
    public final int v;
    public final su0 f30985w;
    public boolean f30986x;
    public final ArrayList f30987y;

    public uu0(xu0 xu0Var, Context context, boolean z10) {
        this(xu0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        bi.l8 l8Var = this.f30984s;
        if (l8Var == null || i10 < 0 || i10 >= l8Var.f3275i.size() || (messageObject = (MessageObject) this.f30984s.f3275i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        bi.l8 l8Var;
        if (!this.h && (l8Var = this.f30984s) != null) {
            if (l8Var instanceof bi.b8) {
                xu0 xu0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(xu0Var.f32726v1.getCurrentAccount()).getUser(Long.valueOf(xu0Var.f32701j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < l8Var.f3275i.size()) {
                MessageObject messageObject = (MessageObject) this.f30984s.f3275i.get(i10);
                bi.l8 l8Var2 = this.f30984s;
                if (l8Var2.f3273f > 0) {
                    return true;
                }
                return l8Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        qt0 qt0Var;
        qt0 qt0Var2;
        qt0 qt0Var3;
        qt0 qt0Var4;
        bi.l8 l8Var = this.f30984s;
        if (l8Var != null && !this.h) {
            xu0 xu0Var = this.F;
            boolean z10 = xu0Var.l1;
            qt0[] qt0VarArr = xu0Var.f32702k0;
            int[] iArr = xu0Var.f32705m1;
            if ((!z10 || (xu0Var.f32703k1 && l8Var.g() > 1)) && this.f30984s.g() > 0 && !xu0Var.v0()) {
                boolean z11 = false;
                if (this.f30984s.g() < 5) {
                    iArr[1] = this.f30984s.g();
                    if (qt0VarArr != null && (qt0Var3 = qt0VarArr[0]) != null && (qt0Var4 = qt0VarArr[1]) != null && qt0Var3.h != null && qt0Var4.h != null) {
                        xu0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    xu0Var.f32703k1 = z11;
                } else if (xu0Var.f32703k1) {
                    xu0Var.f32703k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (qt0VarArr != null && (qt0Var = qt0VarArr[0]) != null && (qt0Var2 = qt0VarArr[1]) != null && qt0Var.h != null && qt0Var2.h != null) {
                        xu0Var.m1(false);
                    }
                }
                xu0Var.l1 = true;
            }
        }
    }

    public final int O() {
        xu0 xu0Var = this.F;
        ct0 ct0Var = xu0Var.H;
        int[] iArr = xu0Var.f32705m1;
        if (this == ct0Var) {
            return iArr[0];
        }
        if (xu0.u(xu0Var, this) != -1) {
            return iArr[1];
        }
        return xu0Var.f32714q1;
    }

    public final void P() {
        if (this.f30984s == null) {
            return;
        }
        int O = O();
        this.f30984s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f30984s == null) {
            return 0;
        }
        int size = this.f30983r.size();
        if (!this.f30984s.l() || !this.F.i0()) {
            i10 = this.f30984s.g();
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
        if (this.f30984s != null) {
            xu0 xu0Var = this.F;
            if (xu0Var.r0()) {
                ArrayList arrayList = this.f30983r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f30984s.f3271c).getStoriesController().E(xu0Var.f32701j1);
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
        if (this.f30984s != null && c1Var.f45742f == 19) {
            View view = c1Var.f45738a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f23264d0 = true;
                ArrayList arrayList = this.f30983r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    bi.t8 t8Var = (bi.t8) arrayList.get(i10);
                    t7Var.f23268f0 = false;
                    if (t8Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = t8Var.f3738a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20107id = i11;
                        tL_storyItem.attachPath = t8Var.f3742f;
                        MessageObject messageObject = new MessageObject(this.f30984s.f3271c, tL_storyItem);
                        t8Var.K = messageObject;
                        messageObject.uploadingStory = t8Var;
                    }
                    t7Var.k(t8Var.K, O(), false);
                    t7Var.f23264d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f30984s.f3275i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f30984s.f3275i.get(size);
                    if (messageObject2 != null && this.f30984s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f23268f0 = z10;
                    xu0 xu0Var = this.F;
                    if (!xu0Var.r0() && !t7Var.f23268f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = xu0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (xu0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = xu0Var.Z0;
                        if (messageObject2.getDialogId() == xu0Var.f32701j1) {
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
                    t7Var.l(this.f30986x, false);
                    return;
                }
                t7Var.f23268f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f23264d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f45738a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f23264d0 = true;
        }
        return x10;
    }

    public uu0(xu0 xu0Var, Context context, int i10, boolean z10) {
        super(xu0Var, context);
        TLRPC.User user;
        this.F = xu0Var;
        this.f30983r = new ArrayList();
        this.f30987y = new ArrayList();
        this.h = z10;
        this.f30982n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32726v1;
        long j3 = xu0Var.f32701j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(xu0Var.getStoriesHashtag())) {
            if (xu0Var.T1 == null) {
                xu0Var.T1 = new bi.d8(currentAccount, TextUtils.isEmpty(xu0Var.getStoriesHashtagUsername()) ? null : xu0Var.getStoriesHashtagUsername(), xu0Var.getStoriesHashtag());
            }
            this.f30984s = xu0Var.T1;
        } else if (xu0Var.getStoriesArea() != null) {
            if (xu0Var.T1 == null) {
                xu0Var.T1 = new bi.d8(currentAccount, xu0Var.getStoriesArea());
            }
            this.f30984s = xu0Var.T1;
        } else if ((z10 && !xu0Var.v0()) || (!z10 && xu0Var.q0())) {
            this.f30984s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f30984s = n2Var.getMessagesController().getStoriesController().A(xu0Var.f32701j1, 0, i10, true);
            } else {
                this.f30984s = n2Var.getMessagesController().getStoriesController().A(xu0Var.f32701j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        bi.l8 l8Var = this.f30984s;
        if (l8Var != null) {
            this.v = l8Var.o();
            this.f30985w = new su0(this, n2Var.getMessagesController().getStoriesController(), xu0Var.f32701j1, this.f30984s.f3271c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

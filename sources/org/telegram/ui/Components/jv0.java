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
public class jv0 extends gv0 {
    public boolean E;
    public final mv0 F;
    public final boolean h;
    public final int f25551n;
    public final ArrayList f25552r;
    public ai.d9 f25553s;
    public final int v;
    public final hv0 f25554w;
    public boolean f25555x;
    public final ArrayList f25556y;

    public jv0(mv0 mv0Var, Context context, boolean z10) {
        this(mv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f25553s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f725i.size() || (messageObject = (MessageObject) this.f25553s.f725i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (d9Var = this.f25553s) != null) {
            if (d9Var instanceof ai.u8) {
                mv0 mv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(mv0Var.f26449v1.getCurrentAccount()).getUser(Long.valueOf(mv0Var.f26424j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f725i.size()) {
                MessageObject messageObject = (MessageObject) this.f25553s.f725i.get(i10);
                ai.d9 d9Var2 = this.f25553s;
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

    public final void M() {
        fu0 fu0Var;
        fu0 fu0Var2;
        fu0 fu0Var3;
        fu0 fu0Var4;
        ai.d9 d9Var = this.f25553s;
        if (d9Var != null && !this.h) {
            mv0 mv0Var = this.F;
            boolean z10 = mv0Var.l1;
            fu0[] fu0VarArr = mv0Var.f26425k0;
            int[] iArr = mv0Var.f26428m1;
            if ((!z10 || (mv0Var.f26426k1 && d9Var.g() > 1)) && this.f25553s.g() > 0 && !mv0Var.v0()) {
                boolean z11 = false;
                if (this.f25553s.g() < 5) {
                    iArr[1] = this.f25553s.g();
                    if (fu0VarArr != null && (fu0Var3 = fu0VarArr[0]) != null && (fu0Var4 = fu0VarArr[1]) != null && fu0Var3.h != null && fu0Var4.h != null) {
                        mv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    mv0Var.f26426k1 = z11;
                } else if (mv0Var.f26426k1) {
                    mv0Var.f26426k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (fu0VarArr != null && (fu0Var = fu0VarArr[0]) != null && (fu0Var2 = fu0VarArr[1]) != null && fu0Var.h != null && fu0Var2.h != null) {
                        mv0Var.m1(false);
                    }
                }
                mv0Var.l1 = true;
            }
        }
    }

    public final int N() {
        mv0 mv0Var = this.F;
        rt0 rt0Var = mv0Var.H;
        int[] iArr = mv0Var.f26428m1;
        if (this == rt0Var) {
            return iArr[0];
        }
        if (mv0.u(mv0Var, this) != -1) {
            return iArr[1];
        }
        return mv0Var.f26437q1;
    }

    public final void O() {
        if (this.f25553s == null) {
            return;
        }
        int N = N();
        this.f25553s.p(Math.min(100, Math.max(1, N / 2) * N * N), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f25553s == null) {
            return 0;
        }
        int size = this.f25552r.size();
        if (!this.f25553s.l() || !this.F.i0()) {
            i10 = this.f25553s.g();
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
        if (this.f25553s != null) {
            mv0 mv0Var = this.F;
            if (mv0Var.r0()) {
                ArrayList arrayList = this.f25552r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f25553s.f722c).getStoriesController().E(mv0Var.f26424j1);
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
        if (this.f25553s != null && c1Var.f43071f == 19) {
            View view = c1Var.f43068a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f21238d0 = true;
                ArrayList arrayList = this.f25552r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    t7Var.f21241f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1143a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f18587id = i11;
                        tL_storyItem.attachPath = k9Var.f1146f;
                        MessageObject messageObject = new MessageObject(this.f25553s.f722c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, N(), false);
                    t7Var.f21238d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f25553s.f725i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f25553s.f725i.get(size);
                    if (messageObject2 != null && this.f25553s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f21241f0 = z10;
                    mv0 mv0Var = this.F;
                    if (!mv0Var.r0() && !t7Var.f21241f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = mv0Var.t0();
                    t7Var.k(messageObject2, N(), false);
                    if (mv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = mv0Var.Z0;
                        if (messageObject2.getDialogId() == mv0Var.f26424j1) {
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
                    t7Var.l(this.f25555x, false);
                    return;
                }
                t7Var.f21241f0 = false;
                t7Var.k(null, N(), false);
                t7Var.f21238d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f43068a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f21238d0 = true;
        }
        return x10;
    }

    public jv0(mv0 mv0Var, Context context, int i10, boolean z10) {
        super(mv0Var, context);
        TLRPC.User user;
        this.F = mv0Var;
        this.f25552r = new ArrayList();
        this.f25556y = new ArrayList();
        this.h = z10;
        this.f25551n = i10;
        org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
        long j3 = mv0Var.f26424j1;
        int currentAccount = m2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(mv0Var.getStoriesHashtag())) {
            if (mv0Var.T1 == null) {
                mv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(mv0Var.getStoriesHashtagUsername()) ? null : mv0Var.getStoriesHashtagUsername(), mv0Var.getStoriesHashtag());
            }
            this.f25553s = mv0Var.T1;
        } else if (mv0Var.getStoriesArea() != null) {
            if (mv0Var.T1 == null) {
                mv0Var.T1 = new ai.v8(currentAccount, mv0Var.getStoriesArea());
            }
            this.f25553s = mv0Var.T1;
        } else if ((z10 && !mv0Var.v0()) || (!z10 && mv0Var.q0())) {
            this.f25553s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f25553s = m2Var.getMessagesController().getStoriesController().A(mv0Var.f26424j1, 0, i10, true);
            } else {
                this.f25553s = m2Var.getMessagesController().getStoriesController().A(mv0Var.f26424j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f25553s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f25554w = new hv0(this, m2Var.getMessagesController().getStoriesController(), mv0Var.f26424j1, this.f25553s.f722c);
        }
        M();
    }
}

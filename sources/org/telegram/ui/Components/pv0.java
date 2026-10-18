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
public class pv0 extends mv0 {
    public boolean E;
    public final sv0 F;
    public final boolean h;
    public final int f29440n;
    public final ArrayList f29441r;
    public ci.a7 f29442s;
    public final int v;
    public final nv0 f29443w;
    public boolean f29444x;
    public final ArrayList f29445y;

    public pv0(sv0 sv0Var, Context context, boolean z10) {
        this(sv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ci.a7 a7Var = this.f29442s;
        if (a7Var == null || i10 < 0 || i10 >= a7Var.f5152i.size() || (messageObject = (MessageObject) this.f29442s.f5152i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        this.F.e1(i10, true);
    }

    public final boolean M(int i10) {
        ci.a7 a7Var;
        if (!this.h && (a7Var = this.f29442s) != null) {
            if (a7Var instanceof ci.t6) {
                sv0 sv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(sv0Var.f30395v1.getCurrentAccount()).getUser(Long.valueOf(sv0Var.f30370j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < a7Var.f5152i.size()) {
                MessageObject messageObject = (MessageObject) this.f29442s.f5152i.get(i10);
                ci.a7 a7Var2 = this.f29442s;
                if (a7Var2.f5150f > 0) {
                    return true;
                }
                return a7Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        lu0 lu0Var;
        lu0 lu0Var2;
        lu0 lu0Var3;
        lu0 lu0Var4;
        ci.a7 a7Var = this.f29442s;
        if (a7Var != null && !this.h) {
            sv0 sv0Var = this.F;
            boolean z10 = sv0Var.l1;
            lu0[] lu0VarArr = sv0Var.f30371k0;
            int[] iArr = sv0Var.f30374m1;
            if ((!z10 || (sv0Var.f30372k1 && a7Var.g() > 1)) && this.f29442s.g() > 0 && !sv0Var.x0()) {
                boolean z11 = false;
                if (this.f29442s.g() < 5) {
                    iArr[1] = this.f29442s.g();
                    if (lu0VarArr != null && (lu0Var3 = lu0VarArr[0]) != null && (lu0Var4 = lu0VarArr[1]) != null && lu0Var3.h != null && lu0Var4.h != null) {
                        sv0Var.o1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    sv0Var.f30372k1 = z11;
                } else if (sv0Var.f30372k1) {
                    sv0Var.f30372k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (lu0VarArr != null && (lu0Var = lu0VarArr[0]) != null && (lu0Var2 = lu0VarArr[1]) != null && lu0Var.h != null && lu0Var2.h != null) {
                        sv0Var.o1(false);
                    }
                }
                sv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        sv0 sv0Var = this.F;
        xt0 xt0Var = sv0Var.H;
        int[] iArr = sv0Var.f30374m1;
        if (this == xt0Var) {
            return iArr[0];
        }
        if (sv0.v(sv0Var, this) != -1) {
            return iArr[1];
        }
        return sv0Var.f30383q1;
    }

    public final void P() {
        if (this.f29442s == null) {
            return;
        }
        int O = O();
        this.f29442s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f29442s == null) {
            return 0;
        }
        int size = this.f29441r.size();
        if (!this.f29442s.l() || !this.F.j0()) {
            i10 = this.f29442s.g();
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
        if (this.f29442s != null) {
            sv0 sv0Var = this.F;
            if (sv0Var.s0()) {
                ArrayList arrayList = this.f29441r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f29442s.f5149c).getStoriesController().E(sv0Var.f30370j1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f29442s != null && b1Var.f45961f == 19) {
            View view = b1Var.f45958a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.f23032d0 = true;
                ArrayList arrayList = this.f29441r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ci.h7 h7Var = (ci.h7) arrayList.get(i10);
                    s7Var.f23035f0 = false;
                    if (h7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = h7Var.f5469a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20513id = i11;
                        tL_storyItem.attachPath = h7Var.f5472f;
                        MessageObject messageObject = new MessageObject(this.f29442s.f5149c, tL_storyItem);
                        h7Var.K = messageObject;
                        messageObject.uploadingStory = h7Var;
                    }
                    s7Var.k(h7Var.K, O(), false);
                    s7Var.f23032d0 = true;
                    s7Var.setReorder(false);
                    s7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f29442s.f5152i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f29442s.f5152i.get(size);
                    if (messageObject2 != null && this.f29442s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s7Var.f23035f0 = z10;
                    sv0 sv0Var = this.F;
                    if (!sv0Var.s0() && !s7Var.f23035f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s7Var.setReorder(z11);
                    s7Var.h = sv0Var.v0();
                    s7Var.k(messageObject2, O(), false);
                    if (sv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = sv0Var.Z0;
                        if (messageObject2.getDialogId() == sv0Var.f30370j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        s7Var.i(z12, true);
                    } else {
                        s7Var.i(false, false);
                    }
                    s7Var.l(this.f29444x, false);
                    return;
                }
                s7Var.f23035f0 = false;
                s7Var.k(null, O(), false);
                s7Var.f23032d0 = true;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s4.b1 x10 = super.x(viewGroup, i10);
        View view = x10.f45958a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).f23032d0 = true;
        }
        return x10;
    }

    public pv0(sv0 sv0Var, Context context, int i10, boolean z10) {
        super(sv0Var, context);
        int i11;
        TLRPC.User user;
        this.F = sv0Var;
        this.f29441r = new ArrayList();
        this.f29445y = new ArrayList();
        this.h = z10;
        this.f29440n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30395v1;
        long j10 = sv0Var.f30370j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(sv0Var.getStoriesHashtag())) {
            if (sv0Var.T1 == null) {
                sv0Var.T1 = new ci.u6(currentAccount, TextUtils.isEmpty(sv0Var.getStoriesHashtagUsername()) ? null : sv0Var.getStoriesHashtagUsername(), sv0Var.getStoriesHashtag());
            }
            this.f29442s = sv0Var.T1;
        } else if (sv0Var.getStoriesArea() != null) {
            if (sv0Var.T1 == null) {
                sv0Var.T1 = new ci.u6(currentAccount, sv0Var.getStoriesArea());
            }
            this.f29442s = sv0Var.T1;
        } else if ((z10 && !sv0Var.x0()) || (!z10 && sv0Var.r0())) {
            this.f29442s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f29442s = n2Var.getMessagesController().getStoriesController().A(sv0Var.f30370j1, 0, i10, true);
            } else {
                ci.i7 storiesController = n2Var.getMessagesController().getStoriesController();
                long j11 = sv0Var.f30370j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f29442s = storiesController.A(j11, i11, -1, true);
                }
                i11 = i12;
                this.f29442s = storiesController.A(j11, i11, -1, true);
            }
        }
        ci.a7 a7Var = this.f29442s;
        if (a7Var != null) {
            this.v = a7Var.o();
            this.f29443w = new nv0(this, n2Var.getMessagesController().getStoriesController(), sv0Var.f30370j1, this.f29442s.f5149c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

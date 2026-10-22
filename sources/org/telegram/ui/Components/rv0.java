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
public class rv0 extends ov0 {
    public boolean E;
    public final uv0 F;
    public final boolean h;
    public final int f30027n;
    public final ArrayList f30028r;
    public ci.a7 f30029s;
    public final int v;
    public final pv0 f30030w;
    public boolean f30031x;
    public final ArrayList f30032y;

    public rv0(uv0 uv0Var, Context context, boolean z10) {
        this(uv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ci.a7 a7Var = this.f30029s;
        if (a7Var == null || i10 < 0 || i10 >= a7Var.f5149i.size() || (messageObject = (MessageObject) this.f30029s.f5149i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (a7Var = this.f30029s) != null) {
            if (a7Var instanceof ci.t6) {
                uv0 uv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(uv0Var.f31074v1.getCurrentAccount()).getUser(Long.valueOf(uv0Var.f31049j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < a7Var.f5149i.size()) {
                MessageObject messageObject = (MessageObject) this.f30029s.f5149i.get(i10);
                ci.a7 a7Var2 = this.f30029s;
                if (a7Var2.f5147f > 0) {
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
        nu0 nu0Var;
        nu0 nu0Var2;
        nu0 nu0Var3;
        nu0 nu0Var4;
        ci.a7 a7Var = this.f30029s;
        if (a7Var != null && !this.h) {
            uv0 uv0Var = this.F;
            boolean z10 = uv0Var.l1;
            nu0[] nu0VarArr = uv0Var.f31050k0;
            int[] iArr = uv0Var.f31053m1;
            if ((!z10 || (uv0Var.f31051k1 && a7Var.g() > 1)) && this.f30029s.g() > 0 && !uv0Var.x0()) {
                boolean z11 = false;
                if (this.f30029s.g() < 5) {
                    iArr[1] = this.f30029s.g();
                    if (nu0VarArr != null && (nu0Var3 = nu0VarArr[0]) != null && (nu0Var4 = nu0VarArr[1]) != null && nu0Var3.h != null && nu0Var4.h != null) {
                        uv0Var.o1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    uv0Var.f31051k1 = z11;
                } else if (uv0Var.f31051k1) {
                    uv0Var.f31051k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (nu0VarArr != null && (nu0Var = nu0VarArr[0]) != null && (nu0Var2 = nu0VarArr[1]) != null && nu0Var.h != null && nu0Var2.h != null) {
                        uv0Var.o1(false);
                    }
                }
                uv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        uv0 uv0Var = this.F;
        zt0 zt0Var = uv0Var.H;
        int[] iArr = uv0Var.f31053m1;
        if (this == zt0Var) {
            return iArr[0];
        }
        if (uv0.v(uv0Var, this) != -1) {
            return iArr[1];
        }
        return uv0Var.f31062q1;
    }

    public final void P() {
        if (this.f30029s == null) {
            return;
        }
        int O = O();
        this.f30029s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f30029s == null) {
            return 0;
        }
        int size = this.f30028r.size();
        if (!this.f30029s.l() || !this.F.j0()) {
            i10 = this.f30029s.g();
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
        if (this.f30029s != null) {
            uv0 uv0Var = this.F;
            if (uv0Var.s0()) {
                ArrayList arrayList = this.f30028r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f30029s.f5146c).getStoriesController().E(uv0Var.f31049j1);
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
        if (this.f30029s != null && b1Var.f45923f == 19) {
            View view = b1Var.f45920a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.f23032d0 = true;
                ArrayList arrayList = this.f30028r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ci.h7 h7Var = (ci.h7) arrayList.get(i10);
                    s7Var.f23035f0 = false;
                    if (h7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = h7Var.f5466a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20513id = i11;
                        tL_storyItem.attachPath = h7Var.f5469f;
                        MessageObject messageObject = new MessageObject(this.f30029s.f5146c, tL_storyItem);
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
                if (size >= 0 && size < this.f30029s.f5149i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f30029s.f5149i.get(size);
                    if (messageObject2 != null && this.f30029s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s7Var.f23035f0 = z10;
                    uv0 uv0Var = this.F;
                    if (!uv0Var.s0() && !s7Var.f23035f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s7Var.setReorder(z11);
                    s7Var.h = uv0Var.v0();
                    s7Var.k(messageObject2, O(), false);
                    if (uv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = uv0Var.Z0;
                        if (messageObject2.getDialogId() == uv0Var.f31049j1) {
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
                    s7Var.l(this.f30031x, false);
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
        View view = x10.f45920a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).f23032d0 = true;
        }
        return x10;
    }

    public rv0(uv0 uv0Var, Context context, int i10, boolean z10) {
        super(uv0Var, context);
        int i11;
        TLRPC.User user;
        this.F = uv0Var;
        this.f30028r = new ArrayList();
        this.f30032y = new ArrayList();
        this.h = z10;
        this.f30027n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31074v1;
        long j10 = uv0Var.f31049j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(uv0Var.getStoriesHashtag())) {
            if (uv0Var.T1 == null) {
                uv0Var.T1 = new ci.u6(currentAccount, TextUtils.isEmpty(uv0Var.getStoriesHashtagUsername()) ? null : uv0Var.getStoriesHashtagUsername(), uv0Var.getStoriesHashtag());
            }
            this.f30029s = uv0Var.T1;
        } else if (uv0Var.getStoriesArea() != null) {
            if (uv0Var.T1 == null) {
                uv0Var.T1 = new ci.u6(currentAccount, uv0Var.getStoriesArea());
            }
            this.f30029s = uv0Var.T1;
        } else if ((z10 && !uv0Var.x0()) || (!z10 && uv0Var.r0())) {
            this.f30029s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f30029s = n2Var.getMessagesController().getStoriesController().A(uv0Var.f31049j1, 0, i10, true);
            } else {
                ci.i7 storiesController = n2Var.getMessagesController().getStoriesController();
                long j11 = uv0Var.f31049j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f30029s = storiesController.A(j11, i11, -1, true);
                }
                i11 = i12;
                this.f30029s = storiesController.A(j11, i11, -1, true);
            }
        }
        ci.a7 a7Var = this.f30029s;
        if (a7Var != null) {
            this.v = a7Var.o();
            this.f30030w = new pv0(this, n2Var.getMessagesController().getStoriesController(), uv0Var.f31049j1, this.f30029s.f5146c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

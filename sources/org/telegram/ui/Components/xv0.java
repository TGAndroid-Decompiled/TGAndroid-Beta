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
public class xv0 extends uv0 {
    public boolean E;
    public final aw0 F;
    public final boolean h;
    public final int f34828n;
    public final ArrayList f34829r;
    public di.z6 f34830s;
    public final int v;
    public final vv0 f34831w;
    public boolean f34832x;
    public final ArrayList f34833y;

    public xv0(aw0 aw0Var, Context context, boolean z10) {
        this(aw0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        di.z6 z6Var = this.f34830s;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.f9493i.size() || (messageObject = (MessageObject) this.f34830s.f9493i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        this.F.l1(i10, true);
    }

    public final boolean M(int i10) {
        di.z6 z6Var;
        if (!this.h && (z6Var = this.f34830s) != null) {
            if (z6Var instanceof di.s6) {
                aw0 aw0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(aw0Var.f26702x1.getCurrentAccount()).getUser(Long.valueOf(aw0Var.l1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < z6Var.f9493i.size()) {
                MessageObject messageObject = (MessageObject) this.f34830s.f9493i.get(i10);
                di.z6 z6Var2 = this.f34830s;
                if (z6Var2.f9491f > 0) {
                    return true;
                }
                return z6Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        tu0 tu0Var;
        tu0 tu0Var2;
        tu0 tu0Var3;
        tu0 tu0Var4;
        di.z6 z6Var = this.f34830s;
        if (z6Var != null && !this.h) {
            aw0 aw0Var = this.F;
            boolean z10 = aw0Var.f26676n1;
            tu0[] tu0VarArr = aw0Var.m0;
            int[] iArr = aw0Var.f26679o1;
            if ((!z10 || (aw0Var.f26672m1 && z6Var.g() > 1)) && this.f34830s.g() > 0 && !aw0Var.D0()) {
                boolean z11 = false;
                if (this.f34830s.g() < 5) {
                    iArr[1] = this.f34830s.g();
                    if (tu0VarArr != null && (tu0Var3 = tu0VarArr[0]) != null && (tu0Var4 = tu0VarArr[1]) != null && tu0Var3.h != null && tu0Var4.h != null) {
                        aw0Var.v1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    aw0Var.f26672m1 = z11;
                } else if (aw0Var.f26672m1) {
                    aw0Var.f26672m1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (tu0VarArr != null && (tu0Var = tu0VarArr[0]) != null && (tu0Var2 = tu0VarArr[1]) != null && tu0Var.h != null && tu0Var2.h != null) {
                        aw0Var.v1(false);
                    }
                }
                aw0Var.f26676n1 = true;
            }
        }
    }

    public final int O() {
        aw0 aw0Var = this.F;
        eu0 eu0Var = aw0Var.J;
        int[] iArr = aw0Var.f26679o1;
        if (this == eu0Var) {
            return iArr[0];
        }
        if (aw0.w(aw0Var, this) != -1) {
            return iArr[1];
        }
        return aw0Var.f26690s1;
    }

    public final void P() {
        if (this.f34830s == null) {
            return;
        }
        int O = O();
        this.f34830s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f34830s == null) {
            return 0;
        }
        int size = this.f34829r.size();
        if (!this.f34830s.l() || !this.F.q0()) {
            i10 = this.f34830s.g();
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
        if (this.f34830s != null) {
            aw0 aw0Var = this.F;
            if (aw0Var.y0()) {
                ArrayList arrayList = this.f34829r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f34830s.f9490c).getStoriesController().E(aw0Var.l1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f34830s != null && e1Var.f47738f == 19) {
            View view = e1Var.f47735a;
            if (view instanceof org.telegram.ui.Cells.w7) {
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                w7Var.f25638d0 = true;
                ArrayList arrayList = this.f34829r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    di.g7 g7Var = (di.g7) arrayList.get(i10);
                    w7Var.f25641f0 = false;
                    if (g7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = g7Var.f8583a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f22264id = i11;
                        tL_storyItem.attachPath = g7Var.f8586f;
                        MessageObject messageObject = new MessageObject(this.f34830s.f9490c, tL_storyItem);
                        g7Var.K = messageObject;
                        messageObject.uploadingStory = g7Var;
                    }
                    w7Var.k(g7Var.K, O(), false);
                    w7Var.f25638d0 = true;
                    w7Var.setReorder(false);
                    w7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f34830s.f9493i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f34830s.f9493i.get(size);
                    if (messageObject2 != null && this.f34830s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w7Var.f25641f0 = z10;
                    aw0 aw0Var = this.F;
                    if (!aw0Var.y0() && !w7Var.f25641f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    w7Var.setReorder(z11);
                    w7Var.h = aw0Var.B0();
                    w7Var.k(messageObject2, O(), false);
                    if (aw0Var.E1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = aw0Var.f26639b1;
                        if (messageObject2.getDialogId() == aw0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w7Var.i(z12, true);
                    } else {
                        w7Var.i(false, false);
                    }
                    w7Var.l(this.f34832x, false);
                    return;
                }
                w7Var.f25641f0 = false;
                w7Var.k(null, O(), false);
                w7Var.f25638d0 = true;
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        s4.e1 x9 = super.x(viewGroup, i10);
        View view = x9.f47735a;
        if (view instanceof org.telegram.ui.Cells.w7) {
            ((org.telegram.ui.Cells.w7) view).f25638d0 = true;
        }
        return x9;
    }

    public xv0(aw0 aw0Var, Context context, int i10, boolean z10) {
        super(aw0Var, context);
        int i11;
        TLRPC.User user;
        this.F = aw0Var;
        this.f34829r = new ArrayList();
        this.f34833y = new ArrayList();
        this.h = z10;
        this.f34828n = i10;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26702x1;
        long j10 = aw0Var.l1;
        int currentAccount = r2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(aw0Var.getStoriesHashtag())) {
            if (aw0Var.W1 == null) {
                aw0Var.W1 = new di.t6(currentAccount, TextUtils.isEmpty(aw0Var.getStoriesHashtagUsername()) ? null : aw0Var.getStoriesHashtagUsername(), aw0Var.getStoriesHashtag());
            }
            this.f34830s = aw0Var.W1;
        } else if (aw0Var.getStoriesArea() != null) {
            if (aw0Var.W1 == null) {
                aw0Var.W1 = new di.t6(currentAccount, aw0Var.getStoriesArea());
            }
            this.f34830s = aw0Var.W1;
        } else if ((z10 && !aw0Var.D0()) || (!z10 && aw0Var.x0())) {
            this.f34830s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f34830s = r2Var.getMessagesController().getStoriesController().A(aw0Var.l1, 0, i10, true);
            } else {
                di.h7 storiesController = r2Var.getMessagesController().getStoriesController();
                long j11 = aw0Var.l1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f34830s = storiesController.A(j11, i11, -1, true);
                }
                i11 = i12;
                this.f34830s = storiesController.A(j11, i11, -1, true);
            }
        }
        di.z6 z6Var = this.f34830s;
        if (z6Var != null) {
            this.v = z6Var.o();
            this.f34831w = new vv0(this, r2Var.getMessagesController().getStoriesController(), aw0Var.l1, this.f34830s.f9490c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

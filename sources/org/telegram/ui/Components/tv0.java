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
public class tv0 extends qv0 {
    public boolean E;
    public final wv0 F;
    public final boolean h;
    public final int f30900n;
    public final ArrayList f30901r;
    public ci.z6 f30902s;
    public final int v;
    public final rv0 f30903w;
    public boolean f30904x;
    public final ArrayList f30905y;

    public tv0(wv0 wv0Var, Context context, boolean z10) {
        this(wv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ci.z6 z6Var = this.f30902s;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.f6193i.size() || (messageObject = (MessageObject) this.f30902s.f6193i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        this.F.f1(i10, true);
    }

    public final boolean M(int i10) {
        ci.z6 z6Var;
        if (!this.h && (z6Var = this.f30902s) != null) {
            if (z6Var instanceof ci.s6) {
                wv0 wv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(wv0Var.f32410v1.getCurrentAccount()).getUser(Long.valueOf(wv0Var.f32385j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < z6Var.f6193i.size()) {
                MessageObject messageObject = (MessageObject) this.f30902s.f6193i.get(i10);
                ci.z6 z6Var2 = this.f30902s;
                if (z6Var2.f6191f > 0) {
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
        pu0 pu0Var;
        pu0 pu0Var2;
        pu0 pu0Var3;
        pu0 pu0Var4;
        ci.z6 z6Var = this.f30902s;
        if (z6Var != null && !this.h) {
            wv0 wv0Var = this.F;
            boolean z10 = wv0Var.l1;
            pu0[] pu0VarArr = wv0Var.f32386k0;
            int[] iArr = wv0Var.f32389m1;
            if ((!z10 || (wv0Var.f32387k1 && z6Var.g() > 1)) && this.f30902s.g() > 0 && !wv0Var.y0()) {
                boolean z11 = false;
                if (this.f30902s.g() < 5) {
                    iArr[1] = this.f30902s.g();
                    if (pu0VarArr != null && (pu0Var3 = pu0VarArr[0]) != null && (pu0Var4 = pu0VarArr[1]) != null && pu0Var3.h != null && pu0Var4.h != null) {
                        wv0Var.p1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    wv0Var.f32387k1 = z11;
                } else if (wv0Var.f32387k1) {
                    wv0Var.f32387k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (pu0VarArr != null && (pu0Var = pu0VarArr[0]) != null && (pu0Var2 = pu0VarArr[1]) != null && pu0Var.h != null && pu0Var2.h != null) {
                        wv0Var.p1(false);
                    }
                }
                wv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        wv0 wv0Var = this.F;
        bu0 bu0Var = wv0Var.H;
        int[] iArr = wv0Var.f32389m1;
        if (this == bu0Var) {
            return iArr[0];
        }
        if (wv0.v(wv0Var, this) != -1) {
            return iArr[1];
        }
        return wv0Var.f32398q1;
    }

    public final void P() {
        if (this.f30902s == null) {
            return;
        }
        int O = O();
        this.f30902s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f30902s == null) {
            return 0;
        }
        int size = this.f30901r.size();
        if (!this.f30902s.l() || !this.F.k0()) {
            i10 = this.f30902s.g();
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
        if (this.f30902s != null) {
            wv0 wv0Var = this.F;
            if (wv0Var.t0()) {
                ArrayList arrayList = this.f30901r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f30902s.f6190c).getStoriesController().E(wv0Var.f32385j1);
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
        if (this.f30902s != null && b1Var.f46345f == 19) {
            View view = b1Var.f46342a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.f23266d0 = true;
                ArrayList arrayList = this.f30901r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ci.g7 g7Var = (ci.g7) arrayList.get(i10);
                    s7Var.f23269f0 = false;
                    if (g7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = g7Var.f5364a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20578id = i11;
                        tL_storyItem.attachPath = g7Var.f5367f;
                        MessageObject messageObject = new MessageObject(this.f30902s.f6190c, tL_storyItem);
                        g7Var.K = messageObject;
                        messageObject.uploadingStory = g7Var;
                    }
                    s7Var.k(g7Var.K, O(), false);
                    s7Var.f23266d0 = true;
                    s7Var.setReorder(false);
                    s7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f30902s.f6193i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f30902s.f6193i.get(size);
                    if (messageObject2 != null && this.f30902s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s7Var.f23269f0 = z10;
                    wv0 wv0Var = this.F;
                    if (!wv0Var.t0() && !s7Var.f23269f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s7Var.setReorder(z11);
                    s7Var.h = wv0Var.w0();
                    s7Var.k(messageObject2, O(), false);
                    if (wv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = wv0Var.Z0;
                        if (messageObject2.getDialogId() == wv0Var.f32385j1) {
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
                    s7Var.l(this.f30904x, false);
                    return;
                }
                s7Var.f23269f0 = false;
                s7Var.k(null, O(), false);
                s7Var.f23266d0 = true;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s4.b1 x10 = super.x(viewGroup, i10);
        View view = x10.f46342a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).f23266d0 = true;
        }
        return x10;
    }

    public tv0(wv0 wv0Var, Context context, int i10, boolean z10) {
        super(wv0Var, context);
        int i11;
        TLRPC.User user;
        this.F = wv0Var;
        this.f30901r = new ArrayList();
        this.f30905y = new ArrayList();
        this.h = z10;
        this.f30900n = i10;
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        long j10 = wv0Var.f32385j1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(wv0Var.getStoriesHashtag())) {
            if (wv0Var.U1 == null) {
                wv0Var.U1 = new ci.t6(currentAccount, TextUtils.isEmpty(wv0Var.getStoriesHashtagUsername()) ? null : wv0Var.getStoriesHashtagUsername(), wv0Var.getStoriesHashtag());
            }
            this.f30902s = wv0Var.U1;
        } else if (wv0Var.getStoriesArea() != null) {
            if (wv0Var.U1 == null) {
                wv0Var.U1 = new ci.t6(currentAccount, wv0Var.getStoriesArea());
            }
            this.f30902s = wv0Var.U1;
        } else if ((z10 && !wv0Var.y0()) || (!z10 && wv0Var.s0())) {
            this.f30902s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f30902s = o2Var.getMessagesController().getStoriesController().A(wv0Var.f32385j1, 0, i10, true);
            } else {
                ci.h7 storiesController = o2Var.getMessagesController().getStoriesController();
                long j11 = wv0Var.f32385j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f30902s = storiesController.A(j11, i11, -1, true);
                }
                i11 = i12;
                this.f30902s = storiesController.A(j11, i11, -1, true);
            }
        }
        ci.z6 z6Var = this.f30902s;
        if (z6Var != null) {
            this.v = z6Var.o();
            this.f30903w = new rv0(this, o2Var.getMessagesController().getStoriesController(), wv0Var.f32385j1, this.f30902s.f6190c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

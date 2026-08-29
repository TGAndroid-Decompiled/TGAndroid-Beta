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
public class nu0 extends ku0 {
    public boolean A;
    public final qu0 B;
    public final boolean h;
    public final int f31149n;
    public final ArrayList f31150r;
    public lh.k6 f31151s;
    public final int v;
    public final lu0 f31152w;
    public boolean f31153x;
    public final ArrayList f31154y;

    public nu0(qu0 qu0Var, Context context, boolean z10) {
        this(qu0Var, context, 0, z10);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        lh.k6 k6Var = this.f31151s;
        if (k6Var == null || i10 < 0 || i10 >= k6Var.f15838i.size() || (messageObject = (MessageObject) this.f31151s.f15838i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        this.B.c1(i10, true);
    }

    public final boolean M(int i10) {
        lh.k6 k6Var;
        if (!this.h && (k6Var = this.f31151s) != null) {
            if (k6Var instanceof lh.c6) {
                qu0 qu0Var = this.B;
                TLRPC.User user = MessagesController.getInstance(qu0Var.f32093r1.getCurrentAccount()).getUser(Long.valueOf(qu0Var.f32069f1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < k6Var.f15838i.size()) {
                MessageObject messageObject = (MessageObject) this.f31151s.f15838i.get(i10);
                lh.k6 k6Var2 = this.f31151s;
                if (k6Var2.f15836f > 0) {
                    return true;
                }
                return k6Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        it0 it0Var;
        it0 it0Var2;
        it0 it0Var3;
        it0 it0Var4;
        lh.k6 k6Var = this.f31151s;
        if (k6Var != null && !this.h) {
            qu0 qu0Var = this.B;
            boolean z10 = qu0Var.f32073h1;
            it0[] it0VarArr = qu0Var.f32070g0;
            int[] iArr = qu0Var.f32075i1;
            if ((!z10 || (qu0Var.f32071g1 && k6Var.g() > 1)) && this.f31151s.g() > 0 && !qu0Var.v0()) {
                boolean z11 = false;
                if (this.f31151s.g() < 5) {
                    iArr[1] = this.f31151s.g();
                    if (it0VarArr != null && (it0Var3 = it0VarArr[0]) != null && (it0Var4 = it0VarArr[1]) != null && it0Var3.h != null && it0Var4.h != null) {
                        qu0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    qu0Var.f32071g1 = z11;
                } else if (qu0Var.f32071g1) {
                    qu0Var.f32071g1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (it0VarArr != null && (it0Var = it0VarArr[0]) != null && (it0Var2 = it0VarArr[1]) != null && it0Var.h != null && it0Var2.h != null) {
                        qu0Var.m1(false);
                    }
                }
                qu0Var.f32073h1 = true;
            }
        }
    }

    public final int O() {
        qu0 qu0Var = this.B;
        us0 us0Var = qu0Var.D;
        int[] iArr = qu0Var.f32075i1;
        if (this == us0Var) {
            return iArr[0];
        }
        if (qu0.u(qu0Var, this) != -1) {
            return iArr[1];
        }
        return qu0Var.f32081m1;
    }

    public final void P() {
        if (this.f31151s == null) {
            return;
        }
        int O = O();
        this.f31151s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f31151s == null) {
            return 0;
        }
        int size = this.f31150r.size();
        if (!this.f31151s.l() || !this.B.i0()) {
            i10 = this.f31151s.g();
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
        if (this.f31151s != null) {
            qu0 qu0Var = this.B;
            if (qu0Var.r0()) {
                ArrayList arrayList = this.f31150r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f31151s.f15834c).getStoriesController().E(qu0Var.f32069f1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        char c3;
        boolean z12;
        if (this.f31151s != null && n1Var.f6436f == 19) {
            View view = n1Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                p7Var.W = true;
                ArrayList arrayList = this.f31150r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    lh.r6 r6Var = (lh.r6) arrayList.get(i10);
                    p7Var.f24977b0 = false;
                    if (r6Var.G == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = r6Var.f16167a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f22629id = i11;
                        tL_storyItem.attachPath = r6Var.f16171f;
                        MessageObject messageObject = new MessageObject(this.f31151s.f15834c, tL_storyItem);
                        r6Var.G = messageObject;
                        messageObject.uploadingStory = r6Var;
                    }
                    p7Var.k(r6Var.G, O(), false);
                    p7Var.W = true;
                    p7Var.setReorder(false);
                    p7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f31151s.f15838i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f31151s.f15838i.get(size);
                    if (messageObject2 != null && this.f31151s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p7Var.f24977b0 = z10;
                    qu0 qu0Var = this.B;
                    if (!qu0Var.r0() && !p7Var.f24977b0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    p7Var.setReorder(z11);
                    p7Var.h = qu0Var.t0();
                    p7Var.k(messageObject2, O(), false);
                    if (qu0Var.f32111y1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = qu0Var.V0;
                        if (messageObject2.getDialogId() == qu0Var.f32069f1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject2.getId()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        p7Var.i(z12, true);
                    } else {
                        p7Var.i(false, false);
                    }
                    p7Var.l(this.f31153x, false);
                    return;
                }
                p7Var.f24977b0 = false;
                p7Var.k(null, O(), false);
                p7Var.W = true;
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        f2.n1 x4 = super.x(viewGroup, i10);
        View view = x4.f6432a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).W = true;
        }
        return x4;
    }

    public nu0(qu0 qu0Var, Context context, int i10, boolean z10) {
        super(qu0Var, context);
        TLRPC.User user;
        this.B = qu0Var;
        this.f31150r = new ArrayList();
        this.f31154y = new ArrayList();
        this.h = z10;
        this.f31149n = i10;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        long j10 = qu0Var.f32069f1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(qu0Var.getStoriesHashtag())) {
            if (qu0Var.P1 == null) {
                qu0Var.P1 = new lh.e6(currentAccount, TextUtils.isEmpty(qu0Var.getStoriesHashtagUsername()) ? null : qu0Var.getStoriesHashtagUsername(), qu0Var.getStoriesHashtag());
            }
            this.f31151s = qu0Var.P1;
        } else if (qu0Var.getStoriesArea() != null) {
            if (qu0Var.P1 == null) {
                qu0Var.P1 = new lh.e6(currentAccount, qu0Var.getStoriesArea());
            }
            this.f31151s = qu0Var.P1;
        } else if ((z10 && !qu0Var.v0()) || (!z10 && qu0Var.q0())) {
            this.f31151s = null;
        } else {
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f31151s = o2Var.getMessagesController().getStoriesController().A(qu0Var.f32069f1, 0, i10, true);
            } else {
                this.f31151s = o2Var.getMessagesController().getStoriesController().A(qu0Var.f32069f1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        lh.k6 k6Var = this.f31151s;
        if (k6Var != null) {
            this.v = k6Var.o();
            this.f31152w = new lu0(this, o2Var.getMessagesController().getStoriesController(), qu0Var.f32069f1, this.f31151s.f15834c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

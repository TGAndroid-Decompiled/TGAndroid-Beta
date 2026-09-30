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
public class iv0 extends fv0 {
    public boolean E;
    public final lv0 F;
    public final boolean h;
    public final int f25190n;
    public final ArrayList f25191r;
    public ai.d9 f25192s;
    public final int v;
    public final gv0 f25193w;
    public boolean f25194x;
    public final ArrayList f25195y;

    public iv0(lv0 lv0Var, Context context, boolean z10) {
        this(lv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f25192s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f725i.size() || (messageObject = (MessageObject) this.f25192s.f725i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        ai.d9 d9Var;
        if (!this.h && (d9Var = this.f25192s) != null) {
            if (d9Var instanceof ai.u8) {
                lv0 lv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(lv0Var.f26154v1.getCurrentAccount()).getUser(Long.valueOf(lv0Var.f26129j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f725i.size()) {
                MessageObject messageObject = (MessageObject) this.f25192s.f725i.get(i10);
                ai.d9 d9Var2 = this.f25192s;
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

    public final void N() {
        eu0 eu0Var;
        eu0 eu0Var2;
        eu0 eu0Var3;
        eu0 eu0Var4;
        ai.d9 d9Var = this.f25192s;
        if (d9Var != null && !this.h) {
            lv0 lv0Var = this.F;
            boolean z10 = lv0Var.l1;
            eu0[] eu0VarArr = lv0Var.f26130k0;
            int[] iArr = lv0Var.f26133m1;
            if ((!z10 || (lv0Var.f26131k1 && d9Var.g() > 1)) && this.f25192s.g() > 0 && !lv0Var.v0()) {
                boolean z11 = false;
                if (this.f25192s.g() < 5) {
                    iArr[1] = this.f25192s.g();
                    if (eu0VarArr != null && (eu0Var3 = eu0VarArr[0]) != null && (eu0Var4 = eu0VarArr[1]) != null && eu0Var3.h != null && eu0Var4.h != null) {
                        lv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    lv0Var.f26131k1 = z11;
                } else if (lv0Var.f26131k1) {
                    lv0Var.f26131k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (eu0VarArr != null && (eu0Var = eu0VarArr[0]) != null && (eu0Var2 = eu0VarArr[1]) != null && eu0Var.h != null && eu0Var2.h != null) {
                        lv0Var.m1(false);
                    }
                }
                lv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        lv0 lv0Var = this.F;
        qt0 qt0Var = lv0Var.H;
        int[] iArr = lv0Var.f26133m1;
        if (this == qt0Var) {
            return iArr[0];
        }
        if (lv0.u(lv0Var, this) != -1) {
            return iArr[1];
        }
        return lv0Var.f26142q1;
    }

    public final void P() {
        if (this.f25192s == null) {
            return;
        }
        int O = O();
        this.f25192s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f25192s == null) {
            return 0;
        }
        int size = this.f25191r.size();
        if (!this.f25192s.l() || !this.F.i0()) {
            i10 = this.f25192s.g();
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
        if (this.f25192s != null) {
            lv0 lv0Var = this.F;
            if (lv0Var.r0()) {
                ArrayList arrayList = this.f25191r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f25192s.f722c).getStoriesController().E(lv0Var.f26129j1);
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
        if (this.f25192s != null && c1Var.f42965f == 19) {
            View view = c1Var.f42962a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f21218d0 = true;
                ArrayList arrayList = this.f25191r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    t7Var.f21221f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1141a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f18572id = i11;
                        tL_storyItem.attachPath = k9Var.f1144f;
                        MessageObject messageObject = new MessageObject(this.f25192s.f722c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, O(), false);
                    t7Var.f21218d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f25192s.f725i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f25192s.f725i.get(size);
                    if (messageObject2 != null && this.f25192s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f21221f0 = z10;
                    lv0 lv0Var = this.F;
                    if (!lv0Var.r0() && !t7Var.f21221f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = lv0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (lv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = lv0Var.Z0;
                        if (messageObject2.getDialogId() == lv0Var.f26129j1) {
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
                    t7Var.l(this.f25194x, false);
                    return;
                }
                t7Var.f21221f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f21218d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f42962a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f21218d0 = true;
        }
        return x10;
    }

    public iv0(lv0 lv0Var, Context context, int i10, boolean z10) {
        super(lv0Var, context);
        TLRPC.User user;
        this.F = lv0Var;
        this.f25191r = new ArrayList();
        this.f25195y = new ArrayList();
        this.h = z10;
        this.f25190n = i10;
        org.telegram.ui.ActionBar.m2 m2Var = lv0Var.f26154v1;
        long j3 = lv0Var.f26129j1;
        int currentAccount = m2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(lv0Var.getStoriesHashtag())) {
            if (lv0Var.T1 == null) {
                lv0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(lv0Var.getStoriesHashtagUsername()) ? null : lv0Var.getStoriesHashtagUsername(), lv0Var.getStoriesHashtag());
            }
            this.f25192s = lv0Var.T1;
        } else if (lv0Var.getStoriesArea() != null) {
            if (lv0Var.T1 == null) {
                lv0Var.T1 = new ai.v8(currentAccount, lv0Var.getStoriesArea());
            }
            this.f25192s = lv0Var.T1;
        } else if ((z10 && !lv0Var.v0()) || (!z10 && lv0Var.q0())) {
            this.f25192s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f25192s = m2Var.getMessagesController().getStoriesController().A(lv0Var.f26129j1, 0, i10, true);
            } else {
                this.f25192s = m2Var.getMessagesController().getStoriesController().A(lv0Var.f26129j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f25192s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f25193w = new gv0(this, m2Var.getMessagesController().getStoriesController(), lv0Var.f26129j1, this.f25192s.f722c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

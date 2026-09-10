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
public class fv0 extends cv0 {
    public boolean E;
    public final iv0 F;
    public final boolean h;
    public final int f23087n;
    public final ArrayList f23088r;
    public zh.a5 f23089s;
    public final int v;
    public final dv0 f23090w;
    public boolean f23091x;
    public final ArrayList f23092y;

    public fv0(iv0 iv0Var, Context context, boolean z10) {
        this(iv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        zh.a5 a5Var = this.f23089s;
        if (a5Var == null || i10 < 0 || i10 >= a5Var.f48240i.size() || (messageObject = (MessageObject) this.f23089s.f48240i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        zh.a5 a5Var;
        if (!this.h && (a5Var = this.f23089s) != null) {
            if (a5Var instanceof zh.s4) {
                iv0 iv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(iv0Var.f24131v1.getCurrentAccount()).getUser(Long.valueOf(iv0Var.f24106j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < a5Var.f48240i.size()) {
                MessageObject messageObject = (MessageObject) this.f23089s.f48240i.get(i10);
                zh.a5 a5Var2 = this.f23089s;
                if (a5Var2.f48238f > 0) {
                    return true;
                }
                return a5Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        au0 au0Var;
        au0 au0Var2;
        au0 au0Var3;
        au0 au0Var4;
        zh.a5 a5Var = this.f23089s;
        if (a5Var != null && !this.h) {
            iv0 iv0Var = this.F;
            boolean z10 = iv0Var.l1;
            au0[] au0VarArr = iv0Var.f24107k0;
            int[] iArr = iv0Var.f24110m1;
            if ((!z10 || (iv0Var.f24108k1 && a5Var.g() > 1)) && this.f23089s.g() > 0 && !iv0Var.v0()) {
                boolean z11 = false;
                if (this.f23089s.g() < 5) {
                    iArr[1] = this.f23089s.g();
                    if (au0VarArr != null && (au0Var3 = au0VarArr[0]) != null && (au0Var4 = au0VarArr[1]) != null && au0Var3.h != null && au0Var4.h != null) {
                        iv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    iv0Var.f24108k1 = z11;
                } else if (iv0Var.f24108k1) {
                    iv0Var.f24108k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (au0VarArr != null && (au0Var = au0VarArr[0]) != null && (au0Var2 = au0VarArr[1]) != null && au0Var.h != null && au0Var2.h != null) {
                        iv0Var.m1(false);
                    }
                }
                iv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        iv0 iv0Var = this.F;
        mt0 mt0Var = iv0Var.H;
        int[] iArr = iv0Var.f24110m1;
        if (this == mt0Var) {
            return iArr[0];
        }
        if (iv0.u(iv0Var, this) != -1) {
            return iArr[1];
        }
        return iv0Var.f24119q1;
    }

    public final void P() {
        if (this.f23089s == null) {
            return;
        }
        int O = O();
        this.f23089s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f23089s == null) {
            return 0;
        }
        int size = this.f23088r.size();
        if (!this.f23089s.l() || !this.F.i0()) {
            i10 = this.f23089s.g();
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
        if (this.f23089s != null) {
            iv0 iv0Var = this.F;
            if (iv0Var.r0()) {
                ArrayList arrayList = this.f23088r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f23089s.f48237c).getStoriesController().E(iv0Var.f24106j1);
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
        if (this.f23089s != null && c1Var.f41613f == 19) {
            View view = c1Var.f41610a;
            if (view instanceof org.telegram.ui.Cells.u7) {
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                u7Var.f20499d0 = true;
                ArrayList arrayList = this.f23088r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    zh.h5 h5Var = (zh.h5) arrayList.get(i10);
                    u7Var.f20502f0 = false;
                    if (h5Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = h5Var.f48471a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f17435id = i11;
                        tL_storyItem.attachPath = h5Var.f48474f;
                        MessageObject messageObject = new MessageObject(this.f23089s.f48237c, tL_storyItem);
                        h5Var.K = messageObject;
                        messageObject.uploadingStory = h5Var;
                    }
                    u7Var.k(h5Var.K, O(), false);
                    u7Var.f20499d0 = true;
                    u7Var.setReorder(false);
                    u7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f23089s.f48240i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f23089s.f48240i.get(size);
                    if (messageObject2 != null && this.f23089s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u7Var.f20502f0 = z10;
                    iv0 iv0Var = this.F;
                    if (!iv0Var.r0() && !u7Var.f20502f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    u7Var.setReorder(z11);
                    u7Var.h = iv0Var.t0();
                    u7Var.k(messageObject2, O(), false);
                    if (iv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = iv0Var.Z0;
                        if (messageObject2.getDialogId() == iv0Var.f24106j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        u7Var.i(z12, true);
                    } else {
                        u7Var.i(false, false);
                    }
                    u7Var.l(this.f23091x, false);
                    return;
                }
                u7Var.f20502f0 = false;
                u7Var.k(null, O(), false);
                u7Var.f20499d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f41610a;
        if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).f20499d0 = true;
        }
        return x10;
    }

    public fv0(iv0 iv0Var, Context context, int i10, boolean z10) {
        super(iv0Var, context);
        TLRPC.User user;
        this.F = iv0Var;
        this.f23088r = new ArrayList();
        this.f23092y = new ArrayList();
        this.h = z10;
        this.f23087n = i10;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        long j3 = iv0Var.f24106j1;
        int currentAccount = p2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(iv0Var.getStoriesHashtag())) {
            if (iv0Var.T1 == null) {
                iv0Var.T1 = new zh.u4(currentAccount, TextUtils.isEmpty(iv0Var.getStoriesHashtagUsername()) ? null : iv0Var.getStoriesHashtagUsername(), iv0Var.getStoriesHashtag());
            }
            this.f23089s = iv0Var.T1;
        } else if (iv0Var.getStoriesArea() != null) {
            if (iv0Var.T1 == null) {
                iv0Var.T1 = new zh.u4(currentAccount, iv0Var.getStoriesArea());
            }
            this.f23089s = iv0Var.T1;
        } else if ((z10 && !iv0Var.v0()) || (!z10 && iv0Var.q0())) {
            this.f23089s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f23089s = p2Var.getMessagesController().getStoriesController().A(iv0Var.f24106j1, 0, i10, true);
            } else {
                this.f23089s = p2Var.getMessagesController().getStoriesController().A(iv0Var.f24106j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        zh.a5 a5Var = this.f23089s;
        if (a5Var != null) {
            this.v = a5Var.o();
            this.f23090w = new dv0(this, p2Var.getMessagesController().getStoriesController(), iv0Var.f24106j1, this.f23089s.f48237c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

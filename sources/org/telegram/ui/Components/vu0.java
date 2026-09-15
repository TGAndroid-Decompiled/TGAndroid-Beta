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
public class vu0 extends su0 {
    public boolean E;
    public final yu0 F;
    public final boolean h;
    public final int f29439n;
    public final ArrayList f29440r;
    public ai.d9 f29441s;
    public final int v;
    public final tu0 f29442w;
    public boolean f29443x;
    public final ArrayList f29444y;

    public vu0(yu0 yu0Var, Context context, boolean z10) {
        this(yu0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f29441s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f716i.size() || (messageObject = (MessageObject) this.f29441s.f716i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (d9Var = this.f29441s) != null) {
            if (d9Var instanceof ai.t8) {
                yu0 yu0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(yu0Var.f30392v1.getCurrentAccount()).getUser(Long.valueOf(yu0Var.f30367j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f716i.size()) {
                MessageObject messageObject = (MessageObject) this.f29441s.f716i.get(i10);
                ai.d9 d9Var2 = this.f29441s;
                if (d9Var2.f714f > 0) {
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
        rt0 rt0Var;
        rt0 rt0Var2;
        rt0 rt0Var3;
        rt0 rt0Var4;
        ai.d9 d9Var = this.f29441s;
        if (d9Var != null && !this.h) {
            yu0 yu0Var = this.F;
            boolean z10 = yu0Var.l1;
            rt0[] rt0VarArr = yu0Var.f30368k0;
            int[] iArr = yu0Var.f30371m1;
            if ((!z10 || (yu0Var.f30369k1 && d9Var.g() > 1)) && this.f29441s.g() > 0 && !yu0Var.v0()) {
                boolean z11 = false;
                if (this.f29441s.g() < 5) {
                    iArr[1] = this.f29441s.g();
                    if (rt0VarArr != null && (rt0Var3 = rt0VarArr[0]) != null && (rt0Var4 = rt0VarArr[1]) != null && rt0Var3.h != null && rt0Var4.h != null) {
                        yu0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    yu0Var.f30369k1 = z11;
                } else if (yu0Var.f30369k1) {
                    yu0Var.f30369k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (rt0VarArr != null && (rt0Var = rt0VarArr[0]) != null && (rt0Var2 = rt0VarArr[1]) != null && rt0Var.h != null && rt0Var2.h != null) {
                        yu0Var.m1(false);
                    }
                }
                yu0Var.l1 = true;
            }
        }
    }

    public final int O() {
        yu0 yu0Var = this.F;
        dt0 dt0Var = yu0Var.H;
        int[] iArr = yu0Var.f30371m1;
        if (this == dt0Var) {
            return iArr[0];
        }
        if (yu0.u(yu0Var, this) != -1) {
            return iArr[1];
        }
        return yu0Var.f30380q1;
    }

    public final void P() {
        if (this.f29441s == null) {
            return;
        }
        int O = O();
        this.f29441s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f29441s == null) {
            return 0;
        }
        int size = this.f29440r.size();
        if (!this.f29441s.l() || !this.F.i0()) {
            i10 = this.f29441s.g();
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
        if (this.f29441s != null) {
            yu0 yu0Var = this.F;
            if (yu0Var.r0()) {
                ArrayList arrayList = this.f29440r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f29441s.f713c).getStoriesController().E(yu0Var.f30367j1);
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
        if (this.f29441s != null && c1Var.f42678f == 19) {
            View view = c1Var.f42675a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f21377d0 = true;
                ArrayList arrayList = this.f29440r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    t7Var.f21380f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1136a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f18348id = i11;
                        tL_storyItem.attachPath = k9Var.f1139f;
                        MessageObject messageObject = new MessageObject(this.f29441s.f713c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, O(), false);
                    t7Var.f21377d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f29441s.f716i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f29441s.f716i.get(size);
                    if (messageObject2 != null && this.f29441s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f21380f0 = z10;
                    yu0 yu0Var = this.F;
                    if (!yu0Var.r0() && !t7Var.f21380f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = yu0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (yu0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = yu0Var.Z0;
                        if (messageObject2.getDialogId() == yu0Var.f30367j1) {
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
                    t7Var.l(this.f29443x, false);
                    return;
                }
                t7Var.f21380f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f21377d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f42675a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f21377d0 = true;
        }
        return x10;
    }

    public vu0(yu0 yu0Var, Context context, int i10, boolean z10) {
        super(yu0Var, context);
        TLRPC.User user;
        this.F = yu0Var;
        this.f29440r = new ArrayList();
        this.f29444y = new ArrayList();
        this.h = z10;
        this.f29439n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
        long j3 = yu0Var.f30367j1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(yu0Var.getStoriesHashtag())) {
            if (yu0Var.T1 == null) {
                yu0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(yu0Var.getStoriesHashtagUsername()) ? null : yu0Var.getStoriesHashtagUsername(), yu0Var.getStoriesHashtag());
            }
            this.f29441s = yu0Var.T1;
        } else if (yu0Var.getStoriesArea() != null) {
            if (yu0Var.T1 == null) {
                yu0Var.T1 = new ai.v8(currentAccount, yu0Var.getStoriesArea());
            }
            this.f29441s = yu0Var.T1;
        } else if ((z10 && !yu0Var.v0()) || (!z10 && yu0Var.q0())) {
            this.f29441s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f29441s = n2Var.getMessagesController().getStoriesController().A(yu0Var.f30367j1, 0, i10, true);
            } else {
                this.f29441s = n2Var.getMessagesController().getStoriesController().A(yu0Var.f30367j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f29441s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f29442w = new tu0(this, n2Var.getMessagesController().getStoriesController(), yu0Var.f30367j1, this.f29441s.f713c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

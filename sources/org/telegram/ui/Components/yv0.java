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
public class yv0 extends vv0 {
    public boolean E;
    public final bw0 F;
    public final boolean h;
    public final int f35171n;
    public final ArrayList f35172r;
    public di.z6 f35173s;
    public final int v;
    public final wv0 f35174w;
    public boolean f35175x;
    public final ArrayList f35176y;

    public yv0(bw0 bw0Var, Context context, boolean z10) {
        this(bw0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        di.z6 z6Var = this.f35173s;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.f9492i.size() || (messageObject = (MessageObject) this.f35173s.f9492i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (z6Var = this.f35173s) != null) {
            if (z6Var instanceof di.s6) {
                bw0 bw0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(bw0Var.f26992x1.getCurrentAccount()).getUser(Long.valueOf(bw0Var.l1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < z6Var.f9492i.size()) {
                MessageObject messageObject = (MessageObject) this.f35173s.f9492i.get(i10);
                di.z6 z6Var2 = this.f35173s;
                if (z6Var2.f9490f > 0) {
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
        uu0 uu0Var;
        uu0 uu0Var2;
        uu0 uu0Var3;
        uu0 uu0Var4;
        di.z6 z6Var = this.f35173s;
        if (z6Var != null && !this.h) {
            bw0 bw0Var = this.F;
            boolean z10 = bw0Var.f26966n1;
            uu0[] uu0VarArr = bw0Var.m0;
            int[] iArr = bw0Var.f26969o1;
            if ((!z10 || (bw0Var.f26962m1 && z6Var.g() > 1)) && this.f35173s.g() > 0 && !bw0Var.D0()) {
                boolean z11 = false;
                if (this.f35173s.g() < 5) {
                    iArr[1] = this.f35173s.g();
                    if (uu0VarArr != null && (uu0Var3 = uu0VarArr[0]) != null && (uu0Var4 = uu0VarArr[1]) != null && uu0Var3.h != null && uu0Var4.h != null) {
                        bw0Var.v1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    bw0Var.f26962m1 = z11;
                } else if (bw0Var.f26962m1) {
                    bw0Var.f26962m1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (uu0VarArr != null && (uu0Var = uu0VarArr[0]) != null && (uu0Var2 = uu0VarArr[1]) != null && uu0Var.h != null && uu0Var2.h != null) {
                        bw0Var.v1(false);
                    }
                }
                bw0Var.f26966n1 = true;
            }
        }
    }

    public final int O() {
        bw0 bw0Var = this.F;
        fu0 fu0Var = bw0Var.J;
        int[] iArr = bw0Var.f26969o1;
        if (this == fu0Var) {
            return iArr[0];
        }
        if (bw0.w(bw0Var, this) != -1) {
            return iArr[1];
        }
        return bw0Var.f26980s1;
    }

    public final void P() {
        if (this.f35173s == null) {
            return;
        }
        int O = O();
        this.f35173s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f35173s == null) {
            return 0;
        }
        int size = this.f35172r.size();
        if (!this.f35173s.l() || !this.F.q0()) {
            i10 = this.f35173s.g();
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
        if (this.f35173s != null) {
            bw0 bw0Var = this.F;
            if (bw0Var.y0()) {
                ArrayList arrayList = this.f35172r;
                arrayList.clear();
                ArrayList F = MessagesController.getInstance(this.f35173s.f9489c).getStoriesController().F(bw0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
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
        if (this.f35173s != null && e1Var.f47776f == 19) {
            View view = e1Var.f47773a;
            if (view instanceof org.telegram.ui.Cells.w7) {
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                w7Var.f25642d0 = true;
                ArrayList arrayList = this.f35172r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    di.g7 g7Var = (di.g7) arrayList.get(i10);
                    w7Var.f25645f0 = false;
                    if (g7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = g7Var.f8582a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f22267id = i11;
                        tL_storyItem.attachPath = g7Var.f8585f;
                        MessageObject messageObject = new MessageObject(this.f35173s.f9489c, tL_storyItem);
                        g7Var.K = messageObject;
                        messageObject.uploadingStory = g7Var;
                    }
                    w7Var.k(g7Var.K, O(), false);
                    w7Var.f25642d0 = true;
                    w7Var.setReorder(false);
                    w7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f35173s.f9492i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f35173s.f9492i.get(size);
                    if (messageObject2 != null && this.f35173s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w7Var.f25645f0 = z10;
                    bw0 bw0Var = this.F;
                    if (!bw0Var.y0() && !w7Var.f25645f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    w7Var.setReorder(z11);
                    w7Var.h = bw0Var.B0();
                    w7Var.k(messageObject2, O(), false);
                    if (bw0Var.E1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = bw0Var.f26929b1;
                        if (messageObject2.getDialogId() == bw0Var.l1) {
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
                    w7Var.l(this.f35175x, false);
                    return;
                }
                w7Var.f25645f0 = false;
                w7Var.k(null, O(), false);
                w7Var.f25642d0 = true;
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        s4.e1 x9 = super.x(viewGroup, i10);
        View view = x9.f47773a;
        if (view instanceof org.telegram.ui.Cells.w7) {
            ((org.telegram.ui.Cells.w7) view).f25642d0 = true;
        }
        return x9;
    }

    public yv0(bw0 bw0Var, Context context, int i10, boolean z10) {
        super(bw0Var, context);
        int i11;
        TLRPC.User user;
        this.F = bw0Var;
        this.f35172r = new ArrayList();
        this.f35176y = new ArrayList();
        this.h = z10;
        this.f35171n = i10;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        long j10 = bw0Var.l1;
        int currentAccount = r2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(bw0Var.getStoriesHashtag())) {
            if (bw0Var.W1 == null) {
                bw0Var.W1 = new di.t6(currentAccount, TextUtils.isEmpty(bw0Var.getStoriesHashtagUsername()) ? null : bw0Var.getStoriesHashtagUsername(), bw0Var.getStoriesHashtag());
            }
            this.f35173s = bw0Var.W1;
        } else if (bw0Var.getStoriesArea() != null) {
            if (bw0Var.W1 == null) {
                bw0Var.W1 = new di.t6(currentAccount, bw0Var.getStoriesArea());
            }
            this.f35173s = bw0Var.W1;
        } else if ((z10 && !bw0Var.D0()) || (!z10 && bw0Var.x0())) {
            this.f35173s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f35173s = r2Var.getMessagesController().getStoriesController().A(bw0Var.l1, 0, i10, true);
            } else {
                di.h7 storiesController = r2Var.getMessagesController().getStoriesController();
                long j11 = bw0Var.l1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f35173s = storiesController.A(j11, i11, -1, true);
                }
                i11 = i12;
                this.f35173s = storiesController.A(j11, i11, -1, true);
            }
        }
        di.z6 z6Var = this.f35173s;
        if (z6Var != null) {
            this.v = z6Var.o();
            this.f35174w = new wv0(this, r2Var.getMessagesController().getStoriesController(), bw0Var.l1, this.f35173s.f9489c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

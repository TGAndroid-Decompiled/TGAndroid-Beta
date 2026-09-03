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
    public boolean B;
    public final yu0 C;
    public final boolean h;
    public final int f30053n;
    public final ArrayList f30054r;
    public nh.l6 f30055s;
    public final int v;
    public final tu0 f30056w;
    public boolean f30057x;
    public final ArrayList f30058y;

    public vu0(yu0 yu0Var, Context context, boolean z4) {
        this(yu0Var, context, 0, z4);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        nh.l6 l6Var = this.f30055s;
        if (l6Var == null || i10 < 0 || i10 >= l6Var.f15560i.size() || (messageObject = (MessageObject) this.f30055s.f15560i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        this.C.c1(i10, true);
    }

    public final boolean M(int i10) {
        nh.l6 l6Var;
        if (!this.h && (l6Var = this.f30055s) != null) {
            if (l6Var instanceof nh.d6) {
                yu0 yu0Var = this.C;
                TLRPC.User user = MessagesController.getInstance(yu0Var.f31155s1.getCurrentAccount()).getUser(Long.valueOf(yu0Var.f31130g1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < l6Var.f15560i.size()) {
                MessageObject messageObject = (MessageObject) this.f30055s.f15560i.get(i10);
                nh.l6 l6Var2 = this.f30055s;
                if (l6Var2.f15558f > 0) {
                    return true;
                }
                return l6Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        qt0 qt0Var;
        qt0 qt0Var2;
        qt0 qt0Var3;
        qt0 qt0Var4;
        nh.l6 l6Var = this.f30055s;
        if (l6Var != null && !this.h) {
            yu0 yu0Var = this.C;
            boolean z4 = yu0Var.f31134i1;
            qt0[] qt0VarArr = yu0Var.f31131h0;
            int[] iArr = yu0Var.f31136j1;
            if ((!z4 || (yu0Var.f31132h1 && l6Var.g() > 1)) && this.f30055s.g() > 0 && !yu0Var.v0()) {
                boolean z10 = false;
                if (this.f30055s.g() < 5) {
                    iArr[1] = this.f30055s.g();
                    if (qt0VarArr != null && (qt0Var3 = qt0VarArr[0]) != null && (qt0Var4 = qt0VarArr[1]) != null && qt0Var3.h != null && qt0Var4.h != null) {
                        yu0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z10 = true;
                    }
                    yu0Var.f31132h1 = z10;
                } else if (yu0Var.f31132h1) {
                    yu0Var.f31132h1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (qt0VarArr != null && (qt0Var = qt0VarArr[0]) != null && (qt0Var2 = qt0VarArr[1]) != null && qt0Var.h != null && qt0Var2.h != null) {
                        yu0Var.m1(false);
                    }
                }
                yu0Var.f31134i1 = true;
            }
        }
    }

    public final int O() {
        yu0 yu0Var = this.C;
        ct0 ct0Var = yu0Var.E;
        int[] iArr = yu0Var.f31136j1;
        if (this == ct0Var) {
            return iArr[0];
        }
        if (yu0.u(yu0Var, this) != -1) {
            return iArr[1];
        }
        return yu0Var.f31143n1;
    }

    public final void P() {
        if (this.f30055s == null) {
            return;
        }
        int O = O();
        this.f30055s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f30055s == null) {
            return 0;
        }
        int size = this.f30054r.size();
        if (!this.f30055s.l() || !this.C.i0()) {
            i10 = this.f30055s.g();
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
        if (this.f30055s != null) {
            yu0 yu0Var = this.C;
            if (yu0Var.r0()) {
                ArrayList arrayList = this.f30054r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f30055s.f15557c).getStoriesController().E(yu0Var.f31130g1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        char c3;
        boolean z11;
        if (this.f30055s != null && l1Var.f5777f == 19) {
            View view = l1Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.q7) {
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                q7Var.f21699a0 = true;
                ArrayList arrayList = this.f30054r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    nh.s6 s6Var = (nh.s6) arrayList.get(i10);
                    q7Var.f21703c0 = false;
                    if (s6Var.H == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = s6Var.f15861a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f19394id = i11;
                        tL_storyItem.attachPath = s6Var.f15864f;
                        MessageObject messageObject = new MessageObject(this.f30055s.f15557c, tL_storyItem);
                        s6Var.H = messageObject;
                        messageObject.uploadingStory = s6Var;
                    }
                    q7Var.k(s6Var.H, O(), false);
                    q7Var.f21699a0 = true;
                    q7Var.setReorder(false);
                    q7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f30055s.f15560i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f30055s.f15560i.get(size);
                    if (messageObject2 != null && this.f30055s.m(messageObject2.getId())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    q7Var.f21703c0 = z4;
                    yu0 yu0Var = this.C;
                    if (!yu0Var.r0() && !q7Var.f21703c0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    q7Var.setReorder(z10);
                    q7Var.h = yu0Var.t0();
                    q7Var.k(messageObject2, O(), false);
                    if (yu0Var.f31172z1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = yu0Var.W0;
                        if (messageObject2.getDialogId() == yu0Var.f31130g1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject2.getId()) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        q7Var.i(z11, true);
                    } else {
                        q7Var.i(false, false);
                    }
                    q7Var.l(this.f30057x, false);
                    return;
                }
                q7Var.f21703c0 = false;
                q7Var.k(null, O(), false);
                q7Var.f21699a0 = true;
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f2.l1 x10 = super.x(viewGroup, i10);
        View view = x10.f5774a;
        if (view instanceof org.telegram.ui.Cells.q7) {
            ((org.telegram.ui.Cells.q7) view).f21699a0 = true;
        }
        return x10;
    }

    public vu0(yu0 yu0Var, Context context, int i10, boolean z4) {
        super(yu0Var, context);
        TLRPC.User user;
        this.C = yu0Var;
        this.f30054r = new ArrayList();
        this.f30058y = new ArrayList();
        this.h = z4;
        this.f30053n = i10;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
        long j10 = yu0Var.f31130g1;
        int currentAccount = p2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(yu0Var.getStoriesHashtag())) {
            if (yu0Var.Q1 == null) {
                yu0Var.Q1 = new nh.f6(currentAccount, TextUtils.isEmpty(yu0Var.getStoriesHashtagUsername()) ? null : yu0Var.getStoriesHashtagUsername(), yu0Var.getStoriesHashtag());
            }
            this.f30055s = yu0Var.Q1;
        } else if (yu0Var.getStoriesArea() != null) {
            if (yu0Var.Q1 == null) {
                yu0Var.Q1 = new nh.f6(currentAccount, yu0Var.getStoriesArea());
            }
            this.f30055s = yu0Var.Q1;
        } else if ((z4 && !yu0Var.v0()) || (!z4 && yu0Var.q0())) {
            this.f30055s = null;
        } else {
            boolean z10 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f30055s = p2Var.getMessagesController().getStoriesController().A(yu0Var.f31130g1, 0, i10, true);
            } else {
                this.f30055s = p2Var.getMessagesController().getStoriesController().A(yu0Var.f31130g1, z10 ? 4 : z4 ? 1 : 0, -1, true);
            }
        }
        nh.l6 l6Var = this.f30055s;
        if (l6Var != null) {
            this.v = l6Var.o();
            this.f30056w = new tu0(this, p2Var.getMessagesController().getStoriesController(), yu0Var.f31130g1, this.f30055s.f15557c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

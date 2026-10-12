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
public class uv0 extends rv0 {
    public boolean E;
    public final xv0 F;
    public final boolean h;
    public final int f29782n;
    public final ArrayList f29783r;
    public bi.o8 f29784s;
    public final int v;
    public final sv0 f29785w;
    public boolean f29786x;
    public final ArrayList f29787y;

    public uv0(xv0 xv0Var, Context context, boolean z10) {
        this(xv0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        bi.o8 o8Var = this.f29784s;
        if (o8Var == null || i10 < 0 || i10 >= o8Var.f3429i.size() || (messageObject = (MessageObject) this.f29784s.f3429i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        bi.o8 o8Var;
        if (!this.h && (o8Var = this.f29784s) != null) {
            if (o8Var instanceof bi.f8) {
                xv0 xv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(xv0Var.f31388v1.getCurrentAccount()).getUser(Long.valueOf(xv0Var.f31363j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < o8Var.f3429i.size()) {
                MessageObject messageObject = (MessageObject) this.f29784s.f3429i.get(i10);
                bi.o8 o8Var2 = this.f29784s;
                if (o8Var2.f3427f > 0) {
                    return true;
                }
                return o8Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        qu0 qu0Var;
        qu0 qu0Var2;
        qu0 qu0Var3;
        qu0 qu0Var4;
        bi.o8 o8Var = this.f29784s;
        if (o8Var != null && !this.h) {
            xv0 xv0Var = this.F;
            boolean z10 = xv0Var.l1;
            qu0[] qu0VarArr = xv0Var.f31364k0;
            int[] iArr = xv0Var.f31367m1;
            if ((!z10 || (xv0Var.f31365k1 && o8Var.g() > 1)) && this.f29784s.g() > 0 && !xv0Var.v0()) {
                boolean z11 = false;
                if (this.f29784s.g() < 5) {
                    iArr[1] = this.f29784s.g();
                    if (qu0VarArr != null && (qu0Var3 = qu0VarArr[0]) != null && (qu0Var4 = qu0VarArr[1]) != null && qu0Var3.h != null && qu0Var4.h != null) {
                        xv0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    xv0Var.f31365k1 = z11;
                } else if (xv0Var.f31365k1) {
                    xv0Var.f31365k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (qu0VarArr != null && (qu0Var = qu0VarArr[0]) != null && (qu0Var2 = qu0VarArr[1]) != null && qu0Var.h != null && qu0Var2.h != null) {
                        xv0Var.m1(false);
                    }
                }
                xv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        xv0 xv0Var = this.F;
        cu0 cu0Var = xv0Var.H;
        int[] iArr = xv0Var.f31367m1;
        if (this == cu0Var) {
            return iArr[0];
        }
        if (xv0.u(xv0Var, this) != -1) {
            return iArr[1];
        }
        return xv0Var.f31376q1;
    }

    public final void P() {
        if (this.f29784s == null) {
            return;
        }
        int O = O();
        this.f29784s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f29784s == null) {
            return 0;
        }
        int size = this.f29783r.size();
        if (!this.f29784s.l() || !this.F.i0()) {
            i10 = this.f29784s.g();
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
        if (this.f29784s != null) {
            xv0 xv0Var = this.F;
            if (xv0Var.r0()) {
                ArrayList arrayList = this.f29783r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f29784s.f3426c).getStoriesController().E(xv0Var.f31363j1);
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
        if (this.f29784s != null && b1Var.f44841f == 19) {
            View view = b1Var.f44838a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f22103d0 = true;
                ArrayList arrayList = this.f29783r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    bi.w8 w8Var = (bi.w8) arrayList.get(i10);
                    t7Var.f22106f0 = false;
                    if (w8Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = w8Var.f3913a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f19451id = i11;
                        tL_storyItem.attachPath = w8Var.f3916f;
                        MessageObject messageObject = new MessageObject(this.f29784s.f3426c, tL_storyItem);
                        w8Var.K = messageObject;
                        messageObject.uploadingStory = w8Var;
                    }
                    t7Var.k(w8Var.K, O(), false);
                    t7Var.f22103d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f29784s.f3429i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f29784s.f3429i.get(size);
                    if (messageObject2 != null && this.f29784s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f22106f0 = z10;
                    xv0 xv0Var = this.F;
                    if (!xv0Var.r0() && !t7Var.f22106f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = xv0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (xv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = xv0Var.Z0;
                        if (messageObject2.getDialogId() == xv0Var.f31363j1) {
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
                    t7Var.l(this.f29786x, false);
                    return;
                }
                t7Var.f22106f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f22103d0 = true;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s4.b1 x10 = super.x(viewGroup, i10);
        View view = x10.f44838a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f22103d0 = true;
        }
        return x10;
    }

    public uv0(xv0 xv0Var, Context context, int i10, boolean z10) {
        super(xv0Var, context);
        int i11;
        TLRPC.User user;
        this.F = xv0Var;
        this.f29783r = new ArrayList();
        this.f29787y = new ArrayList();
        this.h = z10;
        this.f29782n = i10;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
        long j10 = xv0Var.f31363j1;
        int currentAccount = m2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(xv0Var.getStoriesHashtag())) {
            if (xv0Var.T1 == null) {
                xv0Var.T1 = new bi.g8(currentAccount, TextUtils.isEmpty(xv0Var.getStoriesHashtagUsername()) ? null : xv0Var.getStoriesHashtagUsername(), xv0Var.getStoriesHashtag());
            }
            this.f29784s = xv0Var.T1;
        } else if (xv0Var.getStoriesArea() != null) {
            if (xv0Var.T1 == null) {
                xv0Var.T1 = new bi.g8(currentAccount, xv0Var.getStoriesArea());
            }
            this.f29784s = xv0Var.T1;
        } else if ((z10 && !xv0Var.v0()) || (!z10 && xv0Var.q0())) {
            this.f29784s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f29784s = m2Var.getMessagesController().getStoriesController().A(xv0Var.f31363j1, 0, i10, true);
            } else {
                bi.x8 storiesController = m2Var.getMessagesController().getStoriesController();
                long j11 = xv0Var.f31363j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f29784s = storiesController.A(j11, i11, -1, true);
                }
                i11 = i12;
                this.f29784s = storiesController.A(j11, i11, -1, true);
            }
        }
        bi.o8 o8Var = this.f29784s;
        if (o8Var != null) {
            this.v = o8Var.o();
            this.f29785w = new sv0(this, m2Var.getMessagesController().getStoriesController(), xv0Var.f31363j1, this.f29784s.f3426c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

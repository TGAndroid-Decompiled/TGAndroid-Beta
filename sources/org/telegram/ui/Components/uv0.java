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
    public final int f31221n;
    public final ArrayList f31222r;
    public ci.z6 f31223s;
    public final int v;
    public final sv0 f31224w;
    public boolean f31225x;
    public final ArrayList f31226y;

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
        ci.z6 z6Var = this.f31223s;
        if (z6Var == null || i10 < 0 || i10 >= z6Var.f6193i.size() || (messageObject = (MessageObject) this.f31223s.f6193i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (z6Var = this.f31223s) != null) {
            if (z6Var instanceof ci.s6) {
                xv0 xv0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(xv0Var.f32711v1.getCurrentAccount()).getUser(Long.valueOf(xv0Var.f32686j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < z6Var.f6193i.size()) {
                MessageObject messageObject = (MessageObject) this.f31223s.f6193i.get(i10);
                ci.z6 z6Var2 = this.f31223s;
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
        qu0 qu0Var;
        qu0 qu0Var2;
        qu0 qu0Var3;
        qu0 qu0Var4;
        ci.z6 z6Var = this.f31223s;
        if (z6Var != null && !this.h) {
            xv0 xv0Var = this.F;
            boolean z10 = xv0Var.l1;
            qu0[] qu0VarArr = xv0Var.f32687k0;
            int[] iArr = xv0Var.f32690m1;
            if ((!z10 || (xv0Var.f32688k1 && z6Var.g() > 1)) && this.f31223s.g() > 0 && !xv0Var.y0()) {
                boolean z11 = false;
                if (this.f31223s.g() < 5) {
                    iArr[1] = this.f31223s.g();
                    if (qu0VarArr != null && (qu0Var3 = qu0VarArr[0]) != null && (qu0Var4 = qu0VarArr[1]) != null && qu0Var3.h != null && qu0Var4.h != null) {
                        xv0Var.p1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    xv0Var.f32688k1 = z11;
                } else if (xv0Var.f32688k1) {
                    xv0Var.f32688k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (qu0VarArr != null && (qu0Var = qu0VarArr[0]) != null && (qu0Var2 = qu0VarArr[1]) != null && qu0Var.h != null && qu0Var2.h != null) {
                        xv0Var.p1(false);
                    }
                }
                xv0Var.l1 = true;
            }
        }
    }

    public final int O() {
        xv0 xv0Var = this.F;
        cu0 cu0Var = xv0Var.H;
        int[] iArr = xv0Var.f32690m1;
        if (this == cu0Var) {
            return iArr[0];
        }
        if (xv0.v(xv0Var, this) != -1) {
            return iArr[1];
        }
        return xv0Var.f32699q1;
    }

    public final void P() {
        if (this.f31223s == null) {
            return;
        }
        int O = O();
        this.f31223s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f31223s == null) {
            return 0;
        }
        int size = this.f31222r.size();
        if (!this.f31223s.l() || !this.F.k0()) {
            i10 = this.f31223s.g();
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
        if (this.f31223s != null) {
            xv0 xv0Var = this.F;
            if (xv0Var.t0()) {
                ArrayList arrayList = this.f31222r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f31223s.f6190c).getStoriesController().E(xv0Var.f32686j1);
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
        if (this.f31223s != null && b1Var.f46346f == 19) {
            View view = b1Var.f46343a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.f23265d0 = true;
                ArrayList arrayList = this.f31222r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ci.g7 g7Var = (ci.g7) arrayList.get(i10);
                    s7Var.f23268f0 = false;
                    if (g7Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = g7Var.f5364a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20577id = i11;
                        tL_storyItem.attachPath = g7Var.f5367f;
                        MessageObject messageObject = new MessageObject(this.f31223s.f6190c, tL_storyItem);
                        g7Var.K = messageObject;
                        messageObject.uploadingStory = g7Var;
                    }
                    s7Var.k(g7Var.K, O(), false);
                    s7Var.f23265d0 = true;
                    s7Var.setReorder(false);
                    s7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f31223s.f6193i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f31223s.f6193i.get(size);
                    if (messageObject2 != null && this.f31223s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s7Var.f23268f0 = z10;
                    xv0 xv0Var = this.F;
                    if (!xv0Var.t0() && !s7Var.f23268f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s7Var.setReorder(z11);
                    s7Var.h = xv0Var.w0();
                    s7Var.k(messageObject2, O(), false);
                    if (xv0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = xv0Var.Z0;
                        if (messageObject2.getDialogId() == xv0Var.f32686j1) {
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
                    s7Var.l(this.f31225x, false);
                    return;
                }
                s7Var.f23268f0 = false;
                s7Var.k(null, O(), false);
                s7Var.f23265d0 = true;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s4.b1 x10 = super.x(viewGroup, i10);
        View view = x10.f46343a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).f23265d0 = true;
        }
        return x10;
    }

    public uv0(xv0 xv0Var, Context context, int i10, boolean z10) {
        super(xv0Var, context);
        int i11;
        TLRPC.User user;
        this.F = xv0Var;
        this.f31222r = new ArrayList();
        this.f31226y = new ArrayList();
        this.h = z10;
        this.f31221n = i10;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
        long j10 = xv0Var.f32686j1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(xv0Var.getStoriesHashtag())) {
            if (xv0Var.U1 == null) {
                xv0Var.U1 = new ci.t6(currentAccount, TextUtils.isEmpty(xv0Var.getStoriesHashtagUsername()) ? null : xv0Var.getStoriesHashtagUsername(), xv0Var.getStoriesHashtag());
            }
            this.f31223s = xv0Var.U1;
        } else if (xv0Var.getStoriesArea() != null) {
            if (xv0Var.U1 == null) {
                xv0Var.U1 = new ci.t6(currentAccount, xv0Var.getStoriesArea());
            }
            this.f31223s = xv0Var.U1;
        } else if ((z10 && !xv0Var.y0()) || (!z10 && xv0Var.s0())) {
            this.f31223s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f31223s = o2Var.getMessagesController().getStoriesController().A(xv0Var.f32686j1, 0, i10, true);
            } else {
                ci.h7 storiesController = o2Var.getMessagesController().getStoriesController();
                long j11 = xv0Var.f32686j1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f31223s = storiesController.A(j11, i11, -1, true);
                }
                i11 = i12;
                this.f31223s = storiesController.A(j11, i11, -1, true);
            }
        }
        ci.z6 z6Var = this.f31223s;
        if (z6Var != null) {
            this.v = z6Var.o();
            this.f31224w = new sv0(this, o2Var.getMessagesController().getStoriesController(), xv0Var.f32686j1, this.f31223s.f6190c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

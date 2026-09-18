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
public class wu0 extends tu0 {
    public boolean E;
    public final zu0 F;
    public final boolean h;
    public final int f29753n;
    public final ArrayList f29754r;
    public ai.d9 f29755s;
    public final int v;
    public final uu0 f29756w;
    public boolean f29757x;
    public final ArrayList f29758y;

    public wu0(zu0 zu0Var, Context context, boolean z10) {
        this(zu0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.f29755s;
        if (d9Var == null || i10 < 0 || i10 >= d9Var.f721i.size() || (messageObject = (MessageObject) this.f29755s.f721i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        if (!this.h && (d9Var = this.f29755s) != null) {
            if (d9Var instanceof ai.t8) {
                zu0 zu0Var = this.F;
                TLRPC.User user = MessagesController.getInstance(zu0Var.f30659v1.getCurrentAccount()).getUser(Long.valueOf(zu0Var.f30634j1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < d9Var.f721i.size()) {
                MessageObject messageObject = (MessageObject) this.f29755s.f721i.get(i10);
                ai.d9 d9Var2 = this.f29755s;
                if (d9Var2.f719f > 0) {
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
        st0 st0Var;
        st0 st0Var2;
        st0 st0Var3;
        st0 st0Var4;
        ai.d9 d9Var = this.f29755s;
        if (d9Var != null && !this.h) {
            zu0 zu0Var = this.F;
            boolean z10 = zu0Var.l1;
            st0[] st0VarArr = zu0Var.f30635k0;
            int[] iArr = zu0Var.f30638m1;
            if ((!z10 || (zu0Var.f30636k1 && d9Var.g() > 1)) && this.f29755s.g() > 0 && !zu0Var.v0()) {
                boolean z11 = false;
                if (this.f29755s.g() < 5) {
                    iArr[1] = this.f29755s.g();
                    if (st0VarArr != null && (st0Var3 = st0VarArr[0]) != null && (st0Var4 = st0VarArr[1]) != null && st0Var3.h != null && st0Var4.h != null) {
                        zu0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    zu0Var.f30636k1 = z11;
                } else if (zu0Var.f30636k1) {
                    zu0Var.f30636k1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (st0VarArr != null && (st0Var = st0VarArr[0]) != null && (st0Var2 = st0VarArr[1]) != null && st0Var.h != null && st0Var2.h != null) {
                        zu0Var.m1(false);
                    }
                }
                zu0Var.l1 = true;
            }
        }
    }

    public final int O() {
        zu0 zu0Var = this.F;
        et0 et0Var = zu0Var.H;
        int[] iArr = zu0Var.f30638m1;
        if (this == et0Var) {
            return iArr[0];
        }
        if (zu0.u(zu0Var, this) != -1) {
            return iArr[1];
        }
        return zu0Var.f30647q1;
    }

    public final void P() {
        if (this.f29755s == null) {
            return;
        }
        int O = O();
        this.f29755s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f29755s == null) {
            return 0;
        }
        int size = this.f29754r.size();
        if (!this.f29755s.l() || !this.F.i0()) {
            i10 = this.f29755s.g();
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
        if (this.f29755s != null) {
            zu0 zu0Var = this.F;
            if (zu0Var.r0()) {
                ArrayList arrayList = this.f29754r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f29755s.f718c).getStoriesController().E(zu0Var.f30634j1);
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
        if (this.f29755s != null && c1Var.f42705f == 19) {
            View view = c1Var.f42702a;
            if (view instanceof org.telegram.ui.Cells.t7) {
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                t7Var.f21388d0 = true;
                ArrayList arrayList = this.f29754r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ai.k9 k9Var = (ai.k9) arrayList.get(i10);
                    t7Var.f21391f0 = false;
                    if (k9Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = k9Var.f1141a;
                        int i11 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f18356id = i11;
                        tL_storyItem.attachPath = k9Var.f1144f;
                        MessageObject messageObject = new MessageObject(this.f29755s.f718c, tL_storyItem);
                        k9Var.K = messageObject;
                        messageObject.uploadingStory = k9Var;
                    }
                    t7Var.k(k9Var.K, O(), false);
                    t7Var.f21388d0 = true;
                    t7Var.setReorder(false);
                    t7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f29755s.f721i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f29755s.f721i.get(size);
                    if (messageObject2 != null && this.f29755s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t7Var.f21391f0 = z10;
                    zu0 zu0Var = this.F;
                    if (!zu0Var.r0() && !t7Var.f21391f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    t7Var.setReorder(z11);
                    t7Var.h = zu0Var.t0();
                    t7Var.k(messageObject2, O(), false);
                    if (zu0Var.C1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = zu0Var.Z0;
                        if (messageObject2.getDialogId() == zu0Var.f30634j1) {
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
                    t7Var.l(this.f29757x, false);
                    return;
                }
                t7Var.f21391f0 = false;
                t7Var.k(null, O(), false);
                t7Var.f21388d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        s4.c1 x10 = super.x(viewGroup, i10);
        View view = x10.f42702a;
        if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).f21388d0 = true;
        }
        return x10;
    }

    public wu0(zu0 zu0Var, Context context, int i10, boolean z10) {
        super(zu0Var, context);
        TLRPC.User user;
        this.F = zu0Var;
        this.f29754r = new ArrayList();
        this.f29758y = new ArrayList();
        this.h = z10;
        this.f29753n = i10;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
        long j3 = zu0Var.f30634j1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(zu0Var.getStoriesHashtag())) {
            if (zu0Var.T1 == null) {
                zu0Var.T1 = new ai.v8(currentAccount, TextUtils.isEmpty(zu0Var.getStoriesHashtagUsername()) ? null : zu0Var.getStoriesHashtagUsername(), zu0Var.getStoriesHashtag());
            }
            this.f29755s = zu0Var.T1;
        } else if (zu0Var.getStoriesArea() != null) {
            if (zu0Var.T1 == null) {
                zu0Var.T1 = new ai.v8(currentAccount, zu0Var.getStoriesArea());
            }
            this.f29755s = zu0Var.T1;
        } else if ((z10 && !zu0Var.v0()) || (!z10 && zu0Var.q0())) {
            this.f29755s = null;
        } else {
            boolean z11 = j3 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j3))) != null && user.bot;
            if (i10 > 0) {
                this.f29755s = o2Var.getMessagesController().getStoriesController().A(zu0Var.f30634j1, 0, i10, true);
            } else {
                this.f29755s = o2Var.getMessagesController().getStoriesController().A(zu0Var.f30634j1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ai.d9 d9Var = this.f29755s;
        if (d9Var != null) {
            this.v = d9Var.o();
            this.f29756w = new uu0(this, o2Var.getMessagesController().getStoriesController(), zu0Var.f30634j1, this.f29755s.f718c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

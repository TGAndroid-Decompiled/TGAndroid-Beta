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
    public boolean B;
    public final zu0 C;
    public final boolean h;
    public final int f32855n;
    public final ArrayList f32856r;
    public oh.l6 f32857s;
    public final int v;
    public final uu0 f32858w;
    public boolean f32859x;
    public final ArrayList f32860y;

    public wu0(zu0 zu0Var, Context context, boolean z4) {
        this(zu0Var, context, 0, z4);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        oh.l6 l6Var = this.f32857s;
        if (l6Var == null || i10 < 0 || i10 >= l6Var.f17402i.size() || (messageObject = (MessageObject) this.f32857s.f17402i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
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
        oh.l6 l6Var;
        if (!this.h && (l6Var = this.f32857s) != null) {
            if (l6Var instanceof oh.d6) {
                zu0 zu0Var = this.C;
                TLRPC.User user = MessagesController.getInstance(zu0Var.f34004s1.getCurrentAccount()).getUser(Long.valueOf(zu0Var.f33979g1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < l6Var.f17402i.size()) {
                MessageObject messageObject = (MessageObject) this.f32857s.f17402i.get(i10);
                oh.l6 l6Var2 = this.f32857s;
                if (l6Var2.f17400f > 0) {
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
        rt0 rt0Var;
        rt0 rt0Var2;
        rt0 rt0Var3;
        rt0 rt0Var4;
        oh.l6 l6Var = this.f32857s;
        if (l6Var != null && !this.h) {
            zu0 zu0Var = this.C;
            boolean z4 = zu0Var.f33983i1;
            rt0[] rt0VarArr = zu0Var.f33980h0;
            int[] iArr = zu0Var.f33985j1;
            if ((!z4 || (zu0Var.f33981h1 && l6Var.g() > 1)) && this.f32857s.g() > 0 && !zu0Var.v0()) {
                boolean z10 = false;
                if (this.f32857s.g() < 5) {
                    iArr[1] = this.f32857s.g();
                    if (rt0VarArr != null && (rt0Var3 = rt0VarArr[0]) != null && (rt0Var4 = rt0VarArr[1]) != null && rt0Var3.h != null && rt0Var4.h != null) {
                        zu0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z10 = true;
                    }
                    zu0Var.f33981h1 = z10;
                } else if (zu0Var.f33981h1) {
                    zu0Var.f33981h1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (rt0VarArr != null && (rt0Var = rt0VarArr[0]) != null && (rt0Var2 = rt0VarArr[1]) != null && rt0Var.h != null && rt0Var2.h != null) {
                        zu0Var.m1(false);
                    }
                }
                zu0Var.f33983i1 = true;
            }
        }
    }

    public final int O() {
        zu0 zu0Var = this.C;
        dt0 dt0Var = zu0Var.E;
        int[] iArr = zu0Var.f33985j1;
        if (this == dt0Var) {
            return iArr[0];
        }
        if (zu0.u(zu0Var, this) != -1) {
            return iArr[1];
        }
        return zu0Var.f33992n1;
    }

    public final void P() {
        if (this.f32857s == null) {
            return;
        }
        int O = O();
        this.f32857s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i10 = 0;
        if (this.f32857s == null) {
            return 0;
        }
        int size = this.f32856r.size();
        if (!this.f32857s.l() || !this.C.i0()) {
            i10 = this.f32857s.g();
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
        if (this.f32857s != null) {
            zu0 zu0Var = this.C;
            if (zu0Var.r0()) {
                ArrayList arrayList = this.f32856r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f32857s.f17398c).getStoriesController().E(zu0Var.f33979g1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        boolean z10;
        char c3;
        boolean z11;
        if (this.f32857s != null && m1Var.f5879f == 19) {
            View view = m1Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                r7Var.f23558a0 = true;
                ArrayList arrayList = this.f32856r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    oh.s6 s6Var = (oh.s6) arrayList.get(i10);
                    r7Var.f23562c0 = false;
                    if (s6Var.H == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = s6Var.f17735a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f21080id = i11;
                        tL_storyItem.attachPath = s6Var.f17739f;
                        MessageObject messageObject = new MessageObject(this.f32857s.f17398c, tL_storyItem);
                        s6Var.H = messageObject;
                        messageObject.uploadingStory = s6Var;
                    }
                    r7Var.k(s6Var.H, O(), false);
                    r7Var.f23558a0 = true;
                    r7Var.setReorder(false);
                    r7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f32857s.f17402i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f32857s.f17402i.get(size);
                    if (messageObject2 != null && this.f32857s.m(messageObject2.getId())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    r7Var.f23562c0 = z4;
                    zu0 zu0Var = this.C;
                    if (!zu0Var.r0() && !r7Var.f23562c0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    r7Var.setReorder(z10);
                    r7Var.h = zu0Var.t0();
                    r7Var.k(messageObject2, O(), false);
                    if (zu0Var.f34021z1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = zu0Var.W0;
                        if (messageObject2.getDialogId() == zu0Var.f33979g1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject2.getId()) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        r7Var.i(z11, true);
                    } else {
                        r7Var.i(false, false);
                    }
                    r7Var.l(this.f32859x, false);
                    return;
                }
                r7Var.f23562c0 = false;
                r7Var.k(null, O(), false);
                r7Var.f23558a0 = true;
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        f2.m1 x10 = super.x(viewGroup, i10);
        View view = x10.f5875a;
        if (view instanceof org.telegram.ui.Cells.r7) {
            ((org.telegram.ui.Cells.r7) view).f23558a0 = true;
        }
        return x10;
    }

    public wu0(zu0 zu0Var, Context context, int i10, boolean z4) {
        super(zu0Var, context);
        TLRPC.User user;
        this.C = zu0Var;
        this.f32856r = new ArrayList();
        this.f32860y = new ArrayList();
        this.h = z4;
        this.f32855n = i10;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        long j10 = zu0Var.f33979g1;
        int currentAccount = p2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(zu0Var.getStoriesHashtag())) {
            if (zu0Var.Q1 == null) {
                zu0Var.Q1 = new oh.f6(currentAccount, TextUtils.isEmpty(zu0Var.getStoriesHashtagUsername()) ? null : zu0Var.getStoriesHashtagUsername(), zu0Var.getStoriesHashtag());
            }
            this.f32857s = zu0Var.Q1;
        } else if (zu0Var.getStoriesArea() != null) {
            if (zu0Var.Q1 == null) {
                zu0Var.Q1 = new oh.f6(currentAccount, zu0Var.getStoriesArea());
            }
            this.f32857s = zu0Var.Q1;
        } else if ((z4 && !zu0Var.v0()) || (!z4 && zu0Var.q0())) {
            this.f32857s = null;
        } else {
            boolean z10 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f32857s = p2Var.getMessagesController().getStoriesController().A(zu0Var.f33979g1, 0, i10, true);
            } else {
                this.f32857s = p2Var.getMessagesController().getStoriesController().A(zu0Var.f33979g1, z10 ? 4 : z4 ? 1 : 0, -1, true);
            }
        }
        oh.l6 l6Var = this.f32857s;
        if (l6Var != null) {
            this.v = l6Var.o();
            this.f32858w = new uu0(this, p2Var.getMessagesController().getStoriesController(), zu0Var.f33979g1, this.f32857s.f17398c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

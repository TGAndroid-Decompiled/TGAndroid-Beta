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
public class bu0 extends yt0 {
    public boolean A;
    public final eu0 B;
    public final boolean h;
    public final int f27279n;
    public final ArrayList f27280r;
    public ih.n6 f27281s;
    public final int v;
    public final zt0 f27282w;
    public boolean f27283x;
    public final ArrayList f27284y;

    public bu0(eu0 eu0Var, Context context, boolean z10) {
        this(eu0Var, context, 0, z10);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final String F(int i9) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        ih.n6 n6Var = this.f27281s;
        if (n6Var == null || i9 < 0 || i9 >= n6Var.f11851i.size() || (messageObject = (MessageObject) this.f27281s.f11851i.get(i9)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void I() {
        int i9;
        if (this.h) {
            i9 = 9;
        } else {
            i9 = 8;
        }
        this.B.c1(i9, true);
    }

    public final boolean M(int i9) {
        ih.n6 n6Var;
        if (!this.h && (n6Var = this.f27281s) != null) {
            if (n6Var instanceof ih.f6) {
                eu0 eu0Var = this.B;
                TLRPC.User user = MessagesController.getInstance(eu0Var.f28160r1.getCurrentAccount()).getUser(Long.valueOf(eu0Var.f28136f1));
                if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i9 >= 0 && i9 < n6Var.f11851i.size()) {
                MessageObject messageObject = (MessageObject) this.f27281s.f11851i.get(i9);
                ih.n6 n6Var2 = this.f27281s;
                if (n6Var2.f11849f > 0) {
                    return true;
                }
                return n6Var2.m(messageObject.getId());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        xs0 xs0Var;
        xs0 xs0Var2;
        xs0 xs0Var3;
        xs0 xs0Var4;
        ih.n6 n6Var = this.f27281s;
        if (n6Var != null && !this.h) {
            eu0 eu0Var = this.B;
            boolean z10 = eu0Var.f28140h1;
            xs0[] xs0VarArr = eu0Var.f28137g0;
            int[] iArr = eu0Var.f28142i1;
            if ((!z10 || (eu0Var.f28138g1 && n6Var.g() > 1)) && this.f27281s.g() > 0 && !eu0Var.v0()) {
                boolean z11 = false;
                if (this.f27281s.g() < 5) {
                    iArr[1] = this.f27281s.g();
                    if (xs0VarArr != null && (xs0Var3 = xs0VarArr[0]) != null && (xs0Var4 = xs0VarArr[1]) != null && xs0Var3.h != null && xs0Var4.h != null) {
                        eu0Var.m1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    eu0Var.f28138g1 = z11;
                } else if (eu0Var.f28138g1) {
                    eu0Var.f28138g1 = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (xs0VarArr != null && (xs0Var = xs0VarArr[0]) != null && (xs0Var2 = xs0VarArr[1]) != null && xs0Var.h != null && xs0Var2.h != null) {
                        eu0Var.m1(false);
                    }
                }
                eu0Var.f28140h1 = true;
            }
        }
    }

    public final int O() {
        eu0 eu0Var = this.B;
        js0 js0Var = eu0Var.D;
        int[] iArr = eu0Var.f28142i1;
        if (this == js0Var) {
            return iArr[0];
        }
        if (eu0.u(eu0Var, this) != -1) {
            return iArr[1];
        }
        return eu0Var.f28148m1;
    }

    public final void P() {
        if (this.f27281s == null) {
            return;
        }
        int O = O();
        this.f27281s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int h() {
        int i9 = 0;
        if (this.f27281s == null) {
            return 0;
        }
        int size = this.f27280r.size();
        if (!this.f27281s.l() || !this.B.i0()) {
            i9 = this.f27281s.g();
        }
        return size + i9;
    }

    @Override
    public final int j(int i9) {
        return 19;
    }

    @Override
    public final int k() {
        return h();
    }

    @Override
    public void l() {
        if (this.f27281s != null) {
            eu0 eu0Var = this.B;
            if (eu0Var.r0()) {
                ArrayList arrayList = this.f27280r;
                arrayList.clear();
                ArrayList E = MessagesController.getInstance(this.f27281s.f11847c).getStoriesController().E(eu0Var.f28136f1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f27281s != null && q1Var.f5505f == 19) {
            View view = q1Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.r7) {
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                r7Var.W = true;
                ArrayList arrayList = this.f27280r;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    ih.u6 u6Var = (ih.u6) arrayList.get(i9);
                    r7Var.f25093b0 = false;
                    if (u6Var.G == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = u6Var.f12191a;
                        int i10 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f22617id = i10;
                        tL_storyItem.attachPath = u6Var.f12195f;
                        MessageObject messageObject = new MessageObject(this.f27281s.f11847c, tL_storyItem);
                        u6Var.G = messageObject;
                        messageObject.uploadingStory = u6Var;
                    }
                    r7Var.k(u6Var.G, O(), false);
                    r7Var.W = true;
                    r7Var.setReorder(false);
                    r7Var.i(false, false);
                    return;
                }
                int size = i9 - arrayList.size();
                if (size >= 0 && size < this.f27281s.f11851i.size()) {
                    MessageObject messageObject2 = (MessageObject) this.f27281s.f11851i.get(size);
                    if (messageObject2 != null && this.f27281s.m(messageObject2.getId())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r7Var.f25093b0 = z10;
                    eu0 eu0Var = this.B;
                    if (!eu0Var.r0() && !r7Var.f25093b0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    r7Var.setReorder(z11);
                    r7Var.h = eu0Var.t0();
                    r7Var.k(messageObject2, O(), false);
                    if (eu0Var.f28178y1 && messageObject2 != null) {
                        SparseArray[] sparseArrayArr = eu0Var.V0;
                        if (messageObject2.getDialogId() == eu0Var.f28136f1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        r7Var.i(z12, true);
                    } else {
                        r7Var.i(false, false);
                    }
                    r7Var.l(this.f27283x, false);
                    return;
                }
                r7Var.f25093b0 = false;
                r7Var.k(null, O(), false);
                r7Var.W = true;
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        f2.q1 x10 = super.x(viewGroup, i9);
        View view = x10.f5501a;
        if (view instanceof org.telegram.ui.Cells.r7) {
            ((org.telegram.ui.Cells.r7) view).W = true;
        }
        return x10;
    }

    public bu0(eu0 eu0Var, Context context, int i9, boolean z10) {
        super(eu0Var, context);
        TLRPC.User user;
        this.B = eu0Var;
        this.f27280r = new ArrayList();
        this.f27284y = new ArrayList();
        this.h = z10;
        this.f27279n = i9;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        long j10 = eu0Var.f28136f1;
        int currentAccount = o2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(eu0Var.getStoriesHashtag())) {
            if (eu0Var.P1 == null) {
                eu0Var.P1 = new ih.h6(currentAccount, TextUtils.isEmpty(eu0Var.getStoriesHashtagUsername()) ? null : eu0Var.getStoriesHashtagUsername(), eu0Var.getStoriesHashtag());
            }
            this.f27281s = eu0Var.P1;
        } else if (eu0Var.getStoriesArea() != null) {
            if (eu0Var.P1 == null) {
                eu0Var.P1 = new ih.h6(currentAccount, eu0Var.getStoriesArea());
            }
            this.f27281s = eu0Var.P1;
        } else if ((z10 && !eu0Var.v0()) || (!z10 && eu0Var.q0())) {
            this.f27281s = null;
        } else {
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i9 > 0) {
                this.f27281s = o2Var.getMessagesController().getStoriesController().A(eu0Var.f28136f1, 0, i9, true);
            } else {
                this.f27281s = o2Var.getMessagesController().getStoriesController().A(eu0Var.f28136f1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        }
        ih.n6 n6Var = this.f27281s;
        if (n6Var != null) {
            this.v = n6Var.o();
            this.f27282w = new zt0(this, o2Var.getMessagesController().getStoriesController(), eu0Var.f28136f1, this.f27281s.f11847c);
        }
        N();
    }

    @Override
    public final int L(int i9) {
        return i9;
    }
}

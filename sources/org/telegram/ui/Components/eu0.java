package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public class eu0 extends bu0 {
    public boolean A;
    public final hu0 B;
    public final boolean h;

    public final int f28153n;

    public final ArrayList f28154r;

    public jh.j6 f28155s;
    public final int v;

    public final cu0 f28156w;

    public boolean f28157x;

    public final ArrayList f28158y;

    public eu0(hu0 hu0Var, Context context, boolean z10) {
        this(hu0Var, context, 0, z10);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        jh.j6 j6Var = this.f28155s;
        if (j6Var == null || i10 < 0 || i10 >= j6Var.f13540i.size() || (messageObject = (MessageObject) this.f28155s.f13540i.get(i10)) == null || (storyItem = messageObject.storyItem) == null) {
            return null;
        }
        return LocaleController.formatYearMont(storyItem.date, true);
    }

    @Override
    public final void I() {
        this.B.c1(this.h ? 9 : 8, true);
    }

    public final boolean M(int i10) {
        jh.j6 j6Var;
        if (this.h || (j6Var = this.f28155s) == null) {
            return false;
        }
        if (j6Var instanceof jh.b6) {
            hu0 hu0Var = this.B;
            TLRPC.User user = MessagesController.getInstance(hu0Var.f29145r1.getCurrentAccount()).getUser(Long.valueOf(hu0Var.f29121f1));
            return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        }
        if (i10 < 0 || i10 >= j6Var.f13540i.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) this.f28155s.f13540i.get(i10);
        jh.j6 j6Var2 = this.f28155s;
        if (j6Var2.f13538f > 0) {
            return true;
        }
        return j6Var2.m(messageObject.getId());
    }

    public final void N() {
        zs0 zs0Var;
        zs0 zs0Var2;
        zs0 zs0Var3;
        zs0 zs0Var4;
        jh.j6 j6Var = this.f28155s;
        if (j6Var == null || this.h) {
            return;
        }
        hu0 hu0Var = this.B;
        boolean z10 = hu0Var.f29125h1;
        zs0[] zs0VarArr = hu0Var.f29122g0;
        int[] iArr = hu0Var.f29127i1;
        if ((!z10 || (hu0Var.f29123g1 && j6Var.g() > 1)) && this.f28155s.g() > 0 && !hu0Var.v0()) {
            if (this.f28155s.g() < 5) {
                iArr[1] = this.f28155s.g();
                if (zs0VarArr != null && (zs0Var3 = zs0VarArr[0]) != null && (zs0Var4 = zs0VarArr[1]) != null && zs0Var3.h != null && zs0Var4.h != null) {
                    hu0Var.m1(false);
                }
                hu0Var.f29123g1 = iArr[1] == 1;
            } else if (hu0Var.f29123g1) {
                hu0Var.f29123g1 = false;
                iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                if (zs0VarArr != null && (zs0Var = zs0VarArr[0]) != null && (zs0Var2 = zs0VarArr[1]) != null && zs0Var.h != null && zs0Var2.h != null) {
                    hu0Var.m1(false);
                }
            }
            hu0Var.f29125h1 = true;
        }
    }

    public final int O() {
        hu0 hu0Var = this.B;
        ls0 ls0Var = hu0Var.D;
        int[] iArr = hu0Var.f29127i1;
        if (this == ls0Var) {
            return iArr[0];
        }
        return hu0.u(hu0Var, this) != -1 ? iArr[1] : hu0Var.f29133m1;
    }

    public final void P() {
        if (this.f28155s == null) {
            return;
        }
        int iO = O();
        this.f28155s.p(Math.min(100, Math.max(1, iO / 2) * iO * iO), false);
    }

    @Override
    public final int h() {
        if (this.f28155s == null) {
            return 0;
        }
        return this.f28154r.size() + ((this.f28155s.l() && this.B.i0()) ? 0 : this.f28155s.g());
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
        if (this.f28155s != null) {
            hu0 hu0Var = this.B;
            if (hu0Var.r0()) {
                ArrayList arrayList = this.f28154r;
                arrayList.clear();
                ArrayList arrayListE = MessagesController.getInstance(this.f28155s.f13536c).getStoriesController().E(hu0Var.f29121f1);
                if (arrayListE != null) {
                    arrayList.addAll(arrayListE);
                }
            }
        }
        super.l();
        N();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (this.f28155s != null && o1Var.f5793f == 19) {
            View view = o1Var.f5789a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.W = true;
                ArrayList arrayList = this.f28154r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    jh.r6 r6Var = (jh.r6) arrayList.get(i10);
                    o7Var.f24785b0 = false;
                    if (r6Var.G == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = r6Var.f13905a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f22617id = i11;
                        tL_storyItem.attachPath = r6Var.f13909f;
                        du0 du0Var = new du0(this.f28155s.f13536c, tL_storyItem);
                        r6Var.G = du0Var;
                        du0Var.uploadingStory = r6Var;
                    }
                    o7Var.k(r6Var.G, O(), false);
                    o7Var.W = true;
                    o7Var.setReorder(false);
                    o7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size < 0 || size >= this.f28155s.f13540i.size()) {
                    o7Var.f24785b0 = false;
                    o7Var.k(null, O(), false);
                    o7Var.W = true;
                    return;
                }
                MessageObject messageObject = (MessageObject) this.f28155s.f13540i.get(size);
                o7Var.f24785b0 = messageObject != null && this.f28155s.m(messageObject.getId());
                hu0 hu0Var = this.B;
                o7Var.setReorder(hu0Var.r0() || o7Var.f24785b0);
                o7Var.h = hu0Var.t0();
                o7Var.k(messageObject, O(), false);
                if (!hu0Var.f29163y1 || messageObject == null) {
                    o7Var.i(false, false);
                } else {
                    o7Var.i(hu0Var.V0[(messageObject.getDialogId() > hu0Var.f29121f1 ? 1 : (messageObject.getDialogId() == hu0Var.f29121f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                }
                o7Var.l(this.f28157x, false);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        f2.o1 o1VarX = super.x(viewGroup, i10);
        View view = o1VarX.f5789a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).W = true;
        }
        return o1VarX;
    }

    public eu0(hu0 hu0Var, Context context, int i10, boolean z10) {
        TLRPC.User user;
        super(hu0Var, context);
        this.B = hu0Var;
        this.f28154r = new ArrayList();
        this.f28158y = new ArrayList();
        this.h = z10;
        this.f28153n = i10;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        long j10 = hu0Var.f29121f1;
        int currentAccount = n2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(hu0Var.getStoriesHashtag())) {
            if (hu0Var.P1 == null) {
                hu0Var.P1 = new jh.d6(currentAccount, TextUtils.isEmpty(hu0Var.getStoriesHashtagUsername()) ? null : hu0Var.getStoriesHashtagUsername(), hu0Var.getStoriesHashtag());
            }
            this.f28155s = hu0Var.P1;
        } else if (hu0Var.getStoriesArea() != null) {
            if (hu0Var.P1 == null) {
                hu0Var.P1 = new jh.d6(currentAccount, hu0Var.getStoriesArea());
            }
            this.f28155s = hu0Var.P1;
        } else if ((!z10 || hu0Var.v0()) && (z10 || !hu0Var.q0())) {
            boolean z11 = j10 > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j10))) != null && user.bot;
            if (i10 > 0) {
                this.f28155s = n2Var.getMessagesController().getStoriesController().A(hu0Var.f29121f1, 0, i10, true);
            } else {
                this.f28155s = n2Var.getMessagesController().getStoriesController().A(hu0Var.f29121f1, z11 ? 4 : z10 ? 1 : 0, -1, true);
            }
        } else {
            this.f28155s = null;
        }
        jh.j6 j6Var = this.f28155s;
        if (j6Var != null) {
            this.v = j6Var.o();
            this.f28156w = new cu0(this, n2Var.getMessagesController().getStoriesController(), hu0Var.f29121f1, this.f28155s.f13536c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}

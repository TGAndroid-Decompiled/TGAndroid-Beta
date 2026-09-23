package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class op0 extends FrameLayout {
    public static final int f35918q0 = 0;
    public final tp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public xh.v3 J;
    public TL_stars.StarGift K;
    public final ArrayList L;
    public final HashMap M;
    public final SpannableStringBuilder N;
    public final String O;
    public final String P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public final sp0 f35919a;
    public int f35920a0;
    public final fp0 f35921b;
    public int f35922b0;
    public final s4.s f35923c;
    public int f35924c0;
    public final hp0 d;
    public int f35925d0;
    public final n7.a1 e;
    public int f35926e0;
    public rp0 f35927f;
    public int f35928f0;
    public int f35929g0;
    public int h;
    public int f35930h0;
    public int f35931i0;
    public int f35932j0;
    public int f35933k0;
    public final ArrayList f35934l0;
    public final int m0;
    public long f35935n;
    public int f35936n0;
    public lp0 f35937o0;
    public final up0 f35938p0;
    public TLRPC.TL_emojiStatusCollectible f35939r;
    public TLRPC.TL_peerColorCollectible f35940s;
    public final jp0 v;
    public final View f35941w;
    public final View f35942x;
    public np0 f35943y;

    public op0(up0 up0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f35938p0 = up0Var;
        this.e = new n7.a1(7);
        this.h = -1;
        this.f35935n = 0L;
        this.f35939r = null;
        this.f35940s = null;
        this.K = null;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f35920a0 = -1;
        this.f35922b0 = -1;
        this.f35924c0 = -1;
        this.f35925d0 = -1;
        this.f35926e0 = -1;
        this.f35928f0 = 0;
        this.f35929g0 = -1;
        this.f35930h0 = -1;
        this.f35931i0 = -1;
        this.f35932j0 = -1;
        this.f35934l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = up0Var.getResourceProvider();
        ah.c cVar = up0Var.G;
        fp0 fp0Var = new fp0(this, context2, resourceProvider, i10);
        this.f35921b = fp0Var;
        fp0Var.setClipToPadding(false);
        fp0Var.setSections(true);
        ((s4.j) fp0Var.getItemAnimator()).f42662m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f35923c = sVar;
        sVar.O = new ci.x1(this, 6);
        fp0Var.i(new ci.r1(this, 7));
        fp0Var.setLayoutManager(sVar);
        hp0 hp0Var = new hp0(this, context, i10);
        this.d = hp0Var;
        fp0Var.setAdapter(hp0Var);
        fp0Var.setOnItemClickListener(new org.telegram.ui.Components.qm0(this, i10, 1));
        fp0Var.j(new ip0(this, i10));
        addView(fp0Var, w7.x5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.pq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (up0Var.f38143a) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.C = false;
        jVar.f42662m = false;
        fp0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f35941w = view;
        ah.d dVar = new ah.d(cVar.c(view, null, false));
        dVar.b(-AndroidUtilities.dp(24.0f), true);
        dVar.f441q = 220;
        view.setBackground(dVar);
        addView(view, w7.x5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f35919a = new sp0(up0.f0(up0Var), 0L, getContext(), up0.g0(up0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f35942x = view2;
            ah.d dVar2 = new ah.d(cVar.c(view2, null, false));
            dVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, w7.x5.e(-1, 16, 55));
            ?? kaVar = new org.telegram.ui.Cells.ka(getContext(), up0.h0(up0Var), 3, 0L, up0.i0(up0Var));
            this.v = kaVar;
            kaVar.setImportantForAccessibility(4);
            kaVar.f20348r = up0Var;
            kaVar.setClipToOutline(true);
            ai.k2 k2Var = yf.i0.f46786a;
            kaVar.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(16.0f)));
            addView((View) kaVar, w7.x5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        tp0 tp0Var = new tp0(up0Var, getContext(), up0.j0(up0Var));
        this.E = tp0Var;
        ch.d c10 = up0Var.E.c(tp0Var, null, false);
        dh.e eVar = new dh.e(up0.k0(up0Var));
        eVar.e = new d2.c(8);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f4280j.e = true;
        tp0Var.H = c10;
        tp0Var.G = c10;
        tp0Var.F = new ep0(this, 0);
        tp0Var.setVisibility(4);
        addView(tp0Var, w7.x5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        sp0 sp0Var = this.f35919a;
        if (sp0Var != null) {
            addView(sp0Var, w7.x5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(op0 op0Var) {
        int i10;
        fp0 fp0Var = op0Var.f35921b;
        boolean z10 = op0Var.H;
        if (z10) {
            fp0Var.B0();
        }
        op0Var.e();
        if (z10 && (i10 = op0Var.f35930h0) >= 0) {
            op0Var.f35923c.h1(i10, op0Var.f35938p0.f38151f);
            fp0Var.post(new ep0(op0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.op0.b():boolean");
    }

    public final boolean c() {
        fp0 fp0Var = this.f35921b;
        if (fp0Var != null) {
            for (int i10 = 0; i10 < fp0Var.getChildCount(); i10++) {
                if (fp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.u00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        up0 up0Var = this.f35938p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = up0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f35935n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f35939r = tL_emojiStatusCollectible;
                    this.f35940s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f35939r = tL_emojiStatusCollectible;
            this.f35940s = null;
        } else {
            TLRPC.User currentUser2 = up0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f35935n = UserObject.getEmojiId(currentUser2);
            this.f35939r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f35940s = tL_peerColorCollectible;
        }
        if (this.f35939r == null && this.f35940s == null) {
            return;
        }
        this.h = -1;
        this.f35935n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.E && !this.H) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        k();
        this.d.l();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        up0 up0Var = this.f35938p0;
        n7.a1 a1Var = this.e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f48898a);
            if (tL_starGiftUnique.resale_ton_only) {
                a1Var.f15083b = yh.w7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f48899b).d()), true);
                a1Var.f15084c = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                a1Var.f15083b = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                a1Var.f15084c = null;
            }
        } else {
            if (!up0Var.getUserConfig().isPremium() && !up0Var.f38143a) {
                obj = this.N;
            } else if (this.f35939r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            a1Var.f15083b = obj;
            a1Var.f15084c = null;
        }
        if (up0Var.C0() == this) {
            up0Var.R = this;
            up0Var.Q.g((CharSequence) a1Var.f15083b, z10, true);
            up0Var.Q.f((SpannableStringBuilder) a1Var.f15084c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.f35938p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        jp0 jp0Var = this.v;
        if (jp0Var != null) {
            jp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f35921b, (Utilities.Callback<View>) new t3(this, 14));
        tp0 tp0Var = this.E;
        if (tp0Var != null) {
            l(tp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f35938p0.f38151f;
        float f7 = 0.0f;
        View view = this.f35941w;
        tp0 tp0Var = this.E;
        if (tp0Var != null && (i10 = this.f35930h0) >= 0) {
            s4.s sVar = this.f35923c;
            this.F = sVar.m(i10);
            fp0 fp0Var = this.f35921b;
            int paddingTop = fp0Var.getPaddingTop() + i11;
            int L0 = sVar.L0();
            View view2 = this.F;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.H = z10;
                this.G = !z10;
                tp0Var.setVisibility(0);
                tp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + fp0Var.getTop()) - tp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f35930h0) {
                this.H = true;
                this.G = false;
                tp0Var.setVisibility(0);
                tp0Var.setTranslationY((fp0Var.getTop() + paddingTop) - tp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                tp0Var.setVisibility(0);
                tp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - tp0Var.getTop());
            }
            boolean z11 = this.G;
            if (tp0Var.I != z11) {
                tp0Var.I = z11;
                tp0Var.L.D0(2);
                tp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            fp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (tp0Var != null) {
            tp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (tp0Var.I != z12) {
                tp0Var.I = z12;
                tp0Var.L.D0(2);
                tp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        jp0 jp0Var = this.v;
        if (jp0Var != null) {
            org.telegram.ui.Cells.t1[] cells = jp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    rp0 rp0Var = this.f35927f;
                    if (rp0Var != null) {
                        messageObject.overrideLinkColor = rp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f35935n;
                    messageObject.overrideLinkPeerColor = this.f35940s;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z12;
        int i10;
        up0 up0Var;
        xo0 xo0Var;
        rp0 rp0Var = this.f35927f;
        if (rp0Var != null) {
            rp0Var.a(this.h, z10);
        }
        sp0 sp0Var = this.f35919a;
        if (sp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f35939r;
            if (tL_emojiStatusCollectible != null) {
                sp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                sp0Var.c(MessagesController.PeerColor.fromCollectible(this.f35939r), z10);
                sp0Var.d(this.f35939r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    sp0Var.e(0L, false, z10);
                } else {
                    sp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                sp0Var.b(this.h, z10);
                sp0Var.d(this.f35935n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (xo0Var = (up0Var = this.f35938p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f35939r;
            if (tL_emojiStatusCollectible2 != null) {
                xo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                xo0Var.b(up0.v0(up0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            hp0 hp0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                hp0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                hp0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            fp0 fp0Var = this.f35921b;
            if (i13 < fp0Var.getChildCount()) {
                View childAt = fp0Var.getChildAt(i13);
                if (childAt instanceof cp0) {
                    cp0 cp0Var = (cp0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f35939r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == cp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f35940s) != null && tL_peerColorCollectible2.collectible_id == cp0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cp0Var.b(z12, true);
                } else if (childAt instanceof xh.j1) {
                    xh.j1 j1Var = (xh.j1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f35939r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == j1Var.getGiftId()) || ((tL_peerColorCollectible = this.f35940s) != null && tL_peerColorCollectible.collectible_id == j1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j1Var.e(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        yh.l5 l5Var;
        up0 up0Var = this.f35938p0;
        yh.l5 l5Var2 = up0Var.f38145b;
        this.V = -1;
        this.W = -1;
        this.f35920a0 = -1;
        this.f35922b0 = -1;
        this.f35925d0 = -1;
        this.f35926e0 = -1;
        this.f35924c0 = -1;
        this.f35929g0 = -1;
        this.f35930h0 = -1;
        this.f35931i0 = -1;
        this.f35932j0 = -1;
        this.f35928f0 = 0;
        ArrayList arrayList = this.f35934l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f35933k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f35939r != null || this.f35940s != null)) {
            this.V = 3;
            this.f35933k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            l5Var = up0Var.f38147c;
        } else {
            l5Var = l5Var2;
        }
        if ((i11 == 0 || i11 == 1) && l5Var != null) {
            ArrayList arrayList2 = l5Var.f47337l;
            int i12 = this.f35933k0;
            this.f35933k0 = i12 + 1;
            this.f35930h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f35933k0;
                this.f35922b0 = i14;
                this.f35933k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f35928f0;
                this.f35928f0 = size;
                int i15 = this.f35933k0;
                this.f35924c0 = i15;
                if (!l5Var2.f47334i && l5Var2.f47335j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f35933k0;
                        this.f35932j0 = i16;
                        this.f35933k0 = i16 + 2;
                        this.f35931i0 = i16 + 1;
                    }
                } else {
                    this.f35925d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f35933k0 = i18;
                    this.f35928f0 = size + i10;
                    this.f35926e0 = i18;
                }
                if (c()) {
                    l5Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(up0.u0(up0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f35933k0;
                this.f35922b0 = i20;
                this.f35933k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f35928f0;
                this.f35928f0 = size2;
                int i21 = this.f35933k0;
                this.f35924c0 = i21;
                xh.v3 v3Var = this.J;
                if (v3Var.f46138t || !v3Var.f46139u) {
                    this.f35925d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f35933k0 = i23;
                    this.f35928f0 = size2 + i10;
                    this.f35926e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f35933k0;
            this.f35933k0 = i24 + 1;
            this.f35929g0 = i24;
        }
        int i25 = this.f35933k0;
        this.f35933k0 = i25 + 1;
        this.U = i25;
        tp0 tp0Var = this.E;
        if (tp0Var != null) {
            tp0Var.post(new ep0(this, 1));
        }
    }

    public final void l(tp0 tp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f18789d6;
        up0 up0Var = this.f35938p0;
        int themedColor = up0Var.getThemedColor(i11);
        up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7);
        int themedColor2 = up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19189z6);
        int themedColor3 = up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        tp0Var.v.setColor(themedColor);
        tp0Var.f37739x = org.telegram.ui.ActionBar.h6.l1(0.06f, themedColor3);
        tp0Var.f37740y = themedColor2;
        tp0Var.E = themedColor3;
        n60 n60Var = tp0Var.f37731a;
        for (int i12 = 0; i12 < n60Var.getChildCount(); i12++) {
            View childAt = n60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == tp0Var.d) {
                    i10 = tp0Var.E;
                } else {
                    i10 = tp0Var.f37740y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        n60Var.invalidate();
        tp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f35941w;
        fp0 fp0Var = this.f35921b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            jp0 jp0Var = this.v;
            this.f35936n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + jp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) jp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) fp0Var.getLayoutParams()).topMargin = this.f35936n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f35936n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f35942x.getLayoutParams()).topMargin = this.f35936n0 - AndroidUtilities.dp(16.0f);
            fp0Var.setPadding(fp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), fp0Var.getPaddingRight(), fp0Var.getPaddingBottom());
        } else {
            this.f35936n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) fp0Var.getLayoutParams()).topMargin = this.f35936n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f35936n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f35919a.getLayoutParams()).height = this.f35936n0;
        }
        super.onMeasure(i10, i11);
    }
}

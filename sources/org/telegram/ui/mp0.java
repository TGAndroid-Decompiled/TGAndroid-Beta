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
public final class mp0 extends FrameLayout {
    public static final int f35731q0 = 0;
    public final rp0 E;
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
    public final qp0 f35732a;
    public int f35733a0;
    public final dp0 f35734b;
    public int f35735b0;
    public final s4.s f35736c;
    public int f35737c0;
    public final fp0 d;
    public int f35738d0;
    public final n7.z0 e;
    public int f35739e0;
    public pp0 f35740f;
    public int f35741f0;
    public int f35742g0;
    public int h;
    public int f35743h0;
    public int f35744i0;
    public int f35745j0;
    public int f35746k0;
    public final ArrayList f35747l0;
    public final int m0;
    public long f35748n;
    public int f35749n0;
    public jp0 f35750o0;
    public final sp0 f35751p0;
    public TLRPC.TL_emojiStatusCollectible f35752r;
    public TLRPC.TL_peerColorCollectible f35753s;
    public final hp0 v;
    public final View f35754w;
    public final View f35755x;
    public lp0 f35756y;

    public mp0(sp0 sp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f35751p0 = sp0Var;
        this.e = new n7.z0(7);
        this.h = -1;
        this.f35748n = 0L;
        this.f35752r = null;
        this.f35753s = null;
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
        this.f35733a0 = -1;
        this.f35735b0 = -1;
        this.f35737c0 = -1;
        this.f35738d0 = -1;
        this.f35739e0 = -1;
        this.f35741f0 = 0;
        this.f35742g0 = -1;
        this.f35743h0 = -1;
        this.f35744i0 = -1;
        this.f35745j0 = -1;
        this.f35747l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = sp0Var.getResourceProvider();
        ah.c cVar = sp0Var.G;
        dp0 dp0Var = new dp0(this, context2, resourceProvider, i10);
        this.f35734b = dp0Var;
        dp0Var.setClipToPadding(false);
        dp0Var.setSections(true);
        ((s4.j) dp0Var.getItemAnimator()).f43103m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f35736c = sVar;
        sVar.O = new ci.x1(this, 6);
        dp0Var.i(new ci.r1(this, 7));
        dp0Var.setLayoutManager(sVar);
        fp0 fp0Var = new fp0(this, context, i10);
        this.d = fp0Var;
        dp0Var.setAdapter(fp0Var);
        dp0Var.setOnItemClickListener(new org.telegram.ui.Components.en0(this, i10, 1));
        dp0Var.j(new gp0(this, i10));
        addView(dp0Var, w7.y5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.rq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (sp0Var.f37935a) {
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
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f43103m = false;
        dp0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f35754w = view;
        ah.d dVar = new ah.d(cVar.c(view, null, false));
        dVar.b(-AndroidUtilities.dp(24.0f), true);
        dVar.f441q = 220;
        view.setBackground(dVar);
        addView(view, w7.y5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f35732a = new qp0(sp0.f0(sp0Var), 0L, getContext(), sp0.g0(sp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f35755x = view2;
            ah.d dVar2 = new ah.d(cVar.c(view2, null, false));
            dVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, w7.y5.e(-1, 16, 55));
            ?? iaVar = new org.telegram.ui.Cells.ia(getContext(), sp0.h0(sp0Var), 3, 0L, sp0.i0(sp0Var));
            this.v = iaVar;
            iaVar.setImportantForAccessibility(4);
            iaVar.f20487r = sp0Var;
            iaVar.setClipToOutline(true);
            ai.k2 k2Var = yf.i0.f47219a;
            iaVar.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(16.0f)));
            addView((View) iaVar, w7.y5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        rp0 rp0Var = new rp0(sp0Var, getContext(), sp0.j0(sp0Var));
        this.E = rp0Var;
        ch.d c10 = sp0Var.E.c(rp0Var, null, false);
        dh.e eVar = new dh.e(sp0.k0(sp0Var));
        eVar.e = new d2.c(8);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f4287j.e = true;
        rp0Var.H = c10;
        rp0Var.G = c10;
        rp0Var.F = new cp0(this, 0);
        rp0Var.setVisibility(4);
        addView(rp0Var, w7.y5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        qp0 qp0Var = this.f35732a;
        if (qp0Var != null) {
            addView(qp0Var, w7.y5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(mp0 mp0Var) {
        int i10;
        dp0 dp0Var = mp0Var.f35734b;
        boolean z10 = mp0Var.H;
        if (z10) {
            dp0Var.C0();
        }
        mp0Var.e();
        if (z10 && (i10 = mp0Var.f35743h0) >= 0) {
            mp0Var.f35736c.h1(i10, mp0Var.f35751p0.f37943f);
            dp0Var.post(new cp0(mp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mp0.b():boolean");
    }

    public final boolean c() {
        dp0 dp0Var = this.f35734b;
        if (dp0Var != null) {
            for (int i10 = 0; i10 < dp0Var.getChildCount(); i10++) {
                if (dp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.w00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        sp0 sp0Var = this.f35751p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = sp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f35748n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f35752r = tL_emojiStatusCollectible;
                    this.f35753s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f35752r = tL_emojiStatusCollectible;
            this.f35753s = null;
        } else {
            TLRPC.User currentUser2 = sp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f35748n = UserObject.getEmojiId(currentUser2);
            this.f35752r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f35753s = tL_peerColorCollectible;
        }
        if (this.f35752r == null && this.f35753s == null) {
            return;
        }
        this.h = -1;
        this.f35748n = 0L;
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
        sp0 sp0Var = this.f35751p0;
        n7.z0 z0Var = this.e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f49335a);
            if (tL_starGiftUnique.resale_ton_only) {
                z0Var.f15426b = yh.w7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f49336b).d()), true);
                z0Var.f15427c = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                z0Var.f15426b = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                z0Var.f15427c = null;
            }
        } else {
            if (!sp0Var.getUserConfig().isPremium() && !sp0Var.f37935a) {
                obj = this.N;
            } else if (this.f35752r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            z0Var.f15426b = obj;
            z0Var.f15427c = null;
        }
        if (sp0Var.C0() == this) {
            sp0Var.R = this;
            sp0Var.Q.g((CharSequence) z0Var.f15426b, z10, true);
            sp0Var.Q.f((SpannableStringBuilder) z0Var.f15427c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.f35751p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        hp0 hp0Var = this.v;
        if (hp0Var != null) {
            hp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f35734b, (Utilities.Callback<View>) new t3(this, 14));
        rp0 rp0Var = this.E;
        if (rp0Var != null) {
            l(rp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f35751p0.f37943f;
        float f7 = 0.0f;
        View view = this.f35754w;
        rp0 rp0Var = this.E;
        if (rp0Var != null && (i10 = this.f35743h0) >= 0) {
            s4.s sVar = this.f35736c;
            this.F = sVar.m(i10);
            dp0 dp0Var = this.f35734b;
            int paddingTop = dp0Var.getPaddingTop() + i11;
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
                rp0Var.setVisibility(0);
                rp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + dp0Var.getTop()) - rp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f35743h0) {
                this.H = true;
                this.G = false;
                rp0Var.setVisibility(0);
                rp0Var.setTranslationY((dp0Var.getTop() + paddingTop) - rp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                rp0Var.setVisibility(0);
                rp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - rp0Var.getTop());
            }
            boolean z11 = this.G;
            if (rp0Var.I != z11) {
                rp0Var.I = z11;
                rp0Var.L.D0(2);
                rp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            dp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (rp0Var != null) {
            rp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (rp0Var.I != z12) {
                rp0Var.I = z12;
                rp0Var.L.D0(2);
                rp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        hp0 hp0Var = this.v;
        if (hp0Var != null) {
            org.telegram.ui.Cells.u1[] cells = hp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    pp0 pp0Var = this.f35740f;
                    if (pp0Var != null) {
                        messageObject.overrideLinkColor = pp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f35748n;
                    messageObject.overrideLinkPeerColor = this.f35753s;
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
        sp0 sp0Var;
        uo0 uo0Var;
        pp0 pp0Var = this.f35740f;
        if (pp0Var != null) {
            pp0Var.a(this.h, z10);
        }
        qp0 qp0Var = this.f35732a;
        if (qp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f35752r;
            if (tL_emojiStatusCollectible != null) {
                qp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                qp0Var.c(MessagesController.PeerColor.fromCollectible(this.f35752r), z10);
                qp0Var.d(this.f35752r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    qp0Var.e(0L, false, z10);
                } else {
                    qp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                qp0Var.b(this.h, z10);
                qp0Var.d(this.f35748n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (uo0Var = (sp0Var = this.f35751p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f35752r;
            if (tL_emojiStatusCollectible2 != null) {
                uo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                uo0Var.b(sp0.v0(sp0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            fp0 fp0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                fp0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                fp0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            dp0 dp0Var = this.f35734b;
            if (i13 < dp0Var.getChildCount()) {
                View childAt = dp0Var.getChildAt(i13);
                if (childAt instanceof ap0) {
                    ap0 ap0Var = (ap0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f35752r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ap0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f35753s) != null && tL_peerColorCollectible2.collectible_id == ap0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ap0Var.b(z12, true);
                } else if (childAt instanceof xh.j1) {
                    xh.j1 j1Var = (xh.j1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f35752r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == j1Var.getGiftId()) || ((tL_peerColorCollectible = this.f35753s) != null && tL_peerColorCollectible.collectible_id == j1Var.getGiftId())) {
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
        yh.k5 k5Var;
        sp0 sp0Var = this.f35751p0;
        yh.k5 k5Var2 = sp0Var.f37937b;
        this.V = -1;
        this.W = -1;
        this.f35733a0 = -1;
        this.f35735b0 = -1;
        this.f35738d0 = -1;
        this.f35739e0 = -1;
        this.f35737c0 = -1;
        this.f35742g0 = -1;
        this.f35743h0 = -1;
        this.f35744i0 = -1;
        this.f35745j0 = -1;
        this.f35741f0 = 0;
        ArrayList arrayList = this.f35747l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f35746k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f35752r != null || this.f35753s != null)) {
            this.V = 3;
            this.f35746k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            k5Var = sp0Var.f37939c;
        } else {
            k5Var = k5Var2;
        }
        if ((i11 == 0 || i11 == 1) && k5Var != null) {
            ArrayList arrayList2 = k5Var.f47720l;
            int i12 = this.f35746k0;
            this.f35746k0 = i12 + 1;
            this.f35743h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f35746k0;
                this.f35735b0 = i14;
                this.f35746k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f35741f0;
                this.f35741f0 = size;
                int i15 = this.f35746k0;
                this.f35737c0 = i15;
                if (!k5Var2.f47717i && k5Var2.f47718j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f35746k0;
                        this.f35745j0 = i16;
                        this.f35746k0 = i16 + 2;
                        this.f35744i0 = i16 + 1;
                    }
                } else {
                    this.f35738d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f35746k0 = i18;
                    this.f35741f0 = size + i10;
                    this.f35739e0 = i18;
                }
                if (c()) {
                    k5Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(sp0.u0(sp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f35746k0;
                this.f35735b0 = i20;
                this.f35746k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f35741f0;
                this.f35741f0 = size2;
                int i21 = this.f35746k0;
                this.f35737c0 = i21;
                xh.v3 v3Var = this.J;
                if (v3Var.f46574t || !v3Var.f46575u) {
                    this.f35738d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f35746k0 = i23;
                    this.f35741f0 = size2 + i10;
                    this.f35739e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f35746k0;
            this.f35746k0 = i24 + 1;
            this.f35742g0 = i24;
        }
        int i25 = this.f35746k0;
        this.f35746k0 = i25 + 1;
        this.U = i25;
        rp0 rp0Var = this.E;
        if (rp0Var != null) {
            rp0Var.post(new cp0(this, 1));
        }
    }

    public final void l(rp0 rp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f19076d6;
        sp0 sp0Var = this.f35751p0;
        int themedColor = sp0Var.getThemedColor(i11);
        sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19020a7);
        int themedColor2 = sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19478z6);
        int themedColor3 = sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        rp0Var.v.setColor(themedColor);
        rp0Var.f37537x = org.telegram.ui.ActionBar.h6.l1(0.06f, themedColor3);
        rp0Var.f37538y = themedColor2;
        rp0Var.E = themedColor3;
        l60 l60Var = rp0Var.f37529a;
        for (int i12 = 0; i12 < l60Var.getChildCount(); i12++) {
            View childAt = l60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == rp0Var.d) {
                    i10 = rp0Var.E;
                } else {
                    i10 = rp0Var.f37538y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        l60Var.invalidate();
        rp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f35754w;
        dp0 dp0Var = this.f35734b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            hp0 hp0Var = this.v;
            this.f35749n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + hp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) hp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) dp0Var.getLayoutParams()).topMargin = this.f35749n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f35749n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f35755x.getLayoutParams()).topMargin = this.f35749n0 - AndroidUtilities.dp(16.0f);
            dp0Var.setPadding(dp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), dp0Var.getPaddingRight(), dp0Var.getPaddingBottom());
        } else {
            this.f35749n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) dp0Var.getLayoutParams()).topMargin = this.f35749n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f35749n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f35732a.getLayoutParams()).height = this.f35749n0;
        }
        super.onMeasure(i10, i11);
    }
}

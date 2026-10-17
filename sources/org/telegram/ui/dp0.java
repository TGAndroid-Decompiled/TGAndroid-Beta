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
public final class dp0 extends FrameLayout {
    public static final int f36241q0 = 0;
    public final ip0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public yh.t3 J;
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
    public final hp0 f36242a;
    public int f36243a0;
    public final uo0 f36244b;
    public int f36245b0;
    public final s4.s f36246c;
    public int f36247c0;
    public final wo0 d;
    public int f36248d0;
    public final n2.e e;
    public int f36249e0;
    public gp0 f36250f;
    public int f36251f0;
    public int f36252g0;
    public int h;
    public int f36253h0;
    public int f36254i0;
    public int f36255j0;
    public int f36256k0;
    public final ArrayList f36257l0;
    public final int m0;
    public long f36258n;
    public int f36259n0;
    public ap0 f36260o0;
    public final jp0 f36261p0;
    public TLRPC.TL_emojiStatusCollectible f36262r;
    public TLRPC.TL_peerColorCollectible f36263s;
    public final yo0 v;
    public final View f36264w;
    public final View f36265x;
    public cp0 f36266y;

    public dp0(jp0 jp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f36261p0 = jp0Var;
        this.e = new n2.e(10, false);
        this.h = -1;
        this.f36258n = 0L;
        this.f36262r = null;
        this.f36263s = null;
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
        this.f36243a0 = -1;
        this.f36245b0 = -1;
        this.f36247c0 = -1;
        this.f36248d0 = -1;
        this.f36249e0 = -1;
        this.f36251f0 = 0;
        this.f36252g0 = -1;
        this.f36253h0 = -1;
        this.f36254i0 = -1;
        this.f36255j0 = -1;
        this.f36257l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = jp0Var.getResourceProvider();
        bh.b bVar = jp0Var.G;
        uo0 uo0Var = new uo0(this, context2, resourceProvider, i10);
        this.f36244b = uo0Var;
        uo0Var.setClipToPadding(false);
        uo0Var.setSections(true);
        ((s4.k) uo0Var.getItemAnimator()).f45972m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f36246c = sVar;
        sVar.O = new ai.q1(this, 7);
        uo0Var.i(new ei.q1(this, 7));
        uo0Var.setLayoutManager(sVar);
        wo0 wo0Var = new wo0(this, context, i10);
        this.d = wo0Var;
        uo0Var.setAdapter(wo0Var);
        uo0Var.setOnItemClickListener(new org.telegram.ui.Components.nn0(this, i10, 1));
        uo0Var.j(new xo0(this, i10));
        addView(uo0Var, w7.z5.d(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (jp0Var.f38239a) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.f45972m = false;
        uo0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f36264w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.f4377q = 220;
        view.setBackground(cVar);
        addView(view, w7.z5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f36242a = new hp0(jp0.f0(jp0Var), 0L, getContext(), jp0.g0(jp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f36265x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.z5.e(-1, 16, 55));
            ?? faVar = new org.telegram.ui.Cells.fa(getContext(), jp0.h0(jp0Var), 3, 0L, jp0.i0(jp0Var));
            this.v = faVar;
            faVar.setImportantForAccessibility(4);
            faVar.f22271r = jp0Var;
            faVar.setClipToOutline(true);
            ci.o1 o1Var = zf.i0.f51593a;
            faVar.setOutlineProvider(new zf.h0(0, AndroidUtilities.dp(16.0f)));
            addView((View) faVar, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        }
        ip0 ip0Var = new ip0(jp0Var, getContext(), jp0.j0(jp0Var));
        this.E = ip0Var;
        dh.d c10 = jp0Var.E.c(ip0Var, null, false);
        eh.e eVar = new eh.e(jp0.k0(jp0Var));
        eVar.e = new ci.i1(24);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f8016j.e = true;
        ip0Var.H = c10;
        ip0Var.G = c10;
        ip0Var.F = new to0(this, 0);
        ip0Var.setVisibility(4);
        addView(ip0Var, w7.z5.a(36.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        hp0 hp0Var = this.f36242a;
        if (hp0Var != null) {
            addView(hp0Var, w7.z5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(dp0 dp0Var) {
        int i10;
        uo0 uo0Var = dp0Var.f36244b;
        boolean z10 = dp0Var.H;
        if (z10) {
            uo0Var.B0();
        }
        dp0Var.e();
        if (z10 && (i10 = dp0Var.f36253h0) >= 0) {
            dp0Var.f36246c.h1(i10, dp0Var.f36261p0.f38247f);
            uo0Var.post(new to0(dp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dp0.b():boolean");
    }

    public final boolean c() {
        uo0 uo0Var = this.f36244b;
        if (uo0Var != null) {
            for (int i10 = 0; i10 < uo0Var.getChildCount(); i10++) {
                if (uo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.b10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        jp0 jp0Var = this.f36261p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = jp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f36258n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f36262r = tL_emojiStatusCollectible;
                    this.f36263s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f36262r = tL_emojiStatusCollectible;
            this.f36263s = null;
        } else {
            TLRPC.User currentUser2 = jp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f36258n = UserObject.getEmojiId(currentUser2);
            this.f36262r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f36263s = tL_peerColorCollectible;
        }
        if (this.f36262r == null && this.f36263s == null) {
            return;
        }
        this.h = -1;
        this.f36258n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.E && !this.H) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        k();
        this.d.l();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        jp0 jp0Var = this.f36261p0;
        n2.e eVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.c.f635a);
            if (tL_starGiftUnique.resale_ton_only) {
                eVar.f17035b = ai.ld.n1(ai.ld.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.c.f636b).d()), true), true);
                eVar.f17036c = ai.ld.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                eVar.f17035b = ai.ld.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                eVar.f17036c = null;
            }
        } else {
            if (!jp0Var.getUserConfig().isPremium() && !jp0Var.f38239a) {
                obj = this.N;
            } else if (this.f36262r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            eVar.f17035b = obj;
            eVar.f17036c = null;
        }
        if (jp0Var.C0() == this) {
            jp0Var.R = this;
            jp0Var.Q.g((CharSequence) eVar.f17035b, z10, true);
            jp0Var.Q.f((SpannableStringBuilder) eVar.f17036c, z10);
        }
    }

    public final void g() {
        ei.d dVar = this.f36261p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        yo0 yo0Var = this.v;
        if (yo0Var != null) {
            yo0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f36244b, (Utilities.Callback<View>) new v3(this, 14));
        ip0 ip0Var = this.E;
        if (ip0Var != null) {
            l(ip0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f36261p0.f38247f;
        float f7 = 0.0f;
        View view = this.f36264w;
        ip0 ip0Var = this.E;
        if (ip0Var != null && (i10 = this.f36253h0) >= 0) {
            s4.s sVar = this.f36246c;
            this.F = sVar.m(i10);
            uo0 uo0Var = this.f36244b;
            int paddingTop = uo0Var.getPaddingTop() + i11;
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
                ip0Var.setVisibility(0);
                ip0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + uo0Var.getTop()) - ip0Var.getTop());
            } else if (L0 != -1 && L0 > this.f36253h0) {
                this.H = true;
                this.G = false;
                ip0Var.setVisibility(0);
                ip0Var.setTranslationY((uo0Var.getTop() + paddingTop) - ip0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                ip0Var.setVisibility(0);
                ip0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - ip0Var.getTop());
            }
            boolean z11 = this.G;
            if (ip0Var.I != z11) {
                ip0Var.I = z11;
                ip0Var.L.D0(2);
                ip0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            uo0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (ip0Var != null) {
            ip0Var.setVisibility(4);
            boolean z12 = this.G;
            if (ip0Var.I != z12) {
                ip0Var.I = z12;
                ip0Var.L.D0(2);
                ip0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        yo0 yo0Var = this.v;
        if (yo0Var != null) {
            org.telegram.ui.Cells.u1[] cells = yo0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    gp0 gp0Var = this.f36250f;
                    if (gp0Var != null) {
                        messageObject.overrideLinkColor = gp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f36258n;
                    messageObject.overrideLinkPeerColor = this.f36263s;
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
        jp0 jp0Var;
        mo0 mo0Var;
        gp0 gp0Var = this.f36250f;
        if (gp0Var != null) {
            gp0Var.a(this.h, z10);
        }
        hp0 hp0Var = this.f36242a;
        if (hp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f36262r;
            if (tL_emojiStatusCollectible != null) {
                hp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                hp0Var.c(MessagesController.PeerColor.fromCollectible(this.f36262r), z10);
                hp0Var.d(this.f36262r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    hp0Var.e(0L, false, z10);
                } else {
                    hp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                hp0Var.b(this.h, z10);
                hp0Var.d(this.f36258n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (mo0Var = (jp0Var = this.f36261p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f36262r;
            if (tL_emojiStatusCollectible2 != null) {
                mo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                mo0Var.b(jp0.v0(jp0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            wo0 wo0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                wo0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                wo0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            uo0 uo0Var = this.f36244b;
            if (i13 < uo0Var.getChildCount()) {
                View childAt = uo0Var.getChildAt(i13);
                if (childAt instanceof ro0) {
                    ro0 ro0Var = (ro0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f36262r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ro0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f36263s) != null && tL_peerColorCollectible2.collectible_id == ro0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ro0Var.b(z12, true);
                } else if (childAt instanceof yh.h1) {
                    yh.h1 h1Var = (yh.h1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f36262r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == h1Var.getGiftId()) || ((tL_peerColorCollectible = this.f36263s) != null && tL_peerColorCollectible.collectible_id == h1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h1Var.e(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        ai.x9 x9Var;
        jp0 jp0Var = this.f36261p0;
        ai.x9 x9Var2 = jp0Var.f38241b;
        this.V = -1;
        this.W = -1;
        this.f36243a0 = -1;
        this.f36245b0 = -1;
        this.f36248d0 = -1;
        this.f36249e0 = -1;
        this.f36247c0 = -1;
        this.f36252g0 = -1;
        this.f36253h0 = -1;
        this.f36254i0 = -1;
        this.f36255j0 = -1;
        this.f36251f0 = 0;
        ArrayList arrayList = this.f36257l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f36256k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f36262r != null || this.f36263s != null)) {
            this.V = 3;
            this.f36256k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            x9Var = jp0Var.f38243c;
        } else {
            x9Var = x9Var2;
        }
        if ((i11 == 0 || i11 == 1) && x9Var != null) {
            ArrayList arrayList2 = x9Var.f2448l;
            int i12 = this.f36256k0;
            this.f36256k0 = i12 + 1;
            this.f36253h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f36256k0;
                this.f36245b0 = i14;
                this.f36256k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f36251f0;
                this.f36251f0 = size;
                int i15 = this.f36256k0;
                this.f36247c0 = i15;
                if (!x9Var2.f2445i && x9Var2.f2446j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f36256k0;
                        this.f36255j0 = i16;
                        this.f36256k0 = i16 + 2;
                        this.f36254i0 = i16 + 1;
                    }
                } else {
                    this.f36248d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f36256k0 = i18;
                    this.f36251f0 = size + i10;
                    this.f36249e0 = i18;
                }
                if (c()) {
                    x9Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(jp0.u0(jp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f36256k0;
                this.f36245b0 = i20;
                this.f36256k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f36251f0;
                this.f36251f0 = size2;
                int i21 = this.f36256k0;
                this.f36247c0 = i21;
                yh.t3 t3Var = this.J;
                if (t3Var.f50549t || !t3Var.f50550u) {
                    this.f36248d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f36256k0 = i23;
                    this.f36251f0 = size2 + i10;
                    this.f36249e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f36256k0;
            this.f36256k0 = i24 + 1;
            this.f36252g0 = i24;
        }
        int i25 = this.f36256k0;
        this.f36256k0 = i25 + 1;
        this.U = i25;
        ip0 ip0Var = this.E;
        if (ip0Var != null) {
            ip0Var.post(new to0(this, 1));
        }
    }

    public final void l(ip0 ip0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
        jp0 jp0Var = this.f36261p0;
        int themedColor = jp0Var.getThemedColor(i11);
        jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20928a7);
        int themedColor2 = jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21391z6);
        int themedColor3 = jp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        ip0Var.v.setColor(themedColor);
        ip0Var.f37952x = org.telegram.ui.ActionBar.h6.m1(0.06f, themedColor3);
        ip0Var.f37953y = themedColor2;
        ip0Var.E = themedColor3;
        i10 i10Var = ip0Var.f37944a;
        for (int i12 = 0; i12 < i10Var.getChildCount(); i12++) {
            View childAt = i10Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == ip0Var.d) {
                    i10 = ip0Var.E;
                } else {
                    i10 = ip0Var.f37953y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        i10Var.invalidate();
        ip0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f36264w;
        uo0 uo0Var = this.f36244b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            yo0 yo0Var = this.v;
            this.f36259n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + yo0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) yo0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) uo0Var.getLayoutParams()).topMargin = this.f36259n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f36259n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f36265x.getLayoutParams()).topMargin = this.f36259n0 - AndroidUtilities.dp(16.0f);
            uo0Var.setPadding(uo0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), uo0Var.getPaddingRight(), uo0Var.getPaddingBottom());
        } else {
            this.f36259n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) uo0Var.getLayoutParams()).topMargin = this.f36259n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f36259n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f36242a.getLayoutParams()).height = this.f36259n0;
        }
        super.onMeasure(i10, i11);
    }
}

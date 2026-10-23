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
public final class fp0 extends FrameLayout {
    public static final int f37382q0 = 0;
    public final kp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public yh.s3 J;
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
    public final jp0 f37383a;
    public int f37384a0;
    public final wo0 f37385b;
    public int f37386b0;
    public final s4.s f37387c;
    public int f37388c0;
    public final yo0 d;
    public int f37389d0;
    public final mi.q e;
    public int f37390e0;
    public ip0 f37391f;
    public int f37392f0;
    public int f37393g0;
    public int h;
    public int f37394h0;
    public int f37395i0;
    public int f37396j0;
    public int f37397k0;
    public final ArrayList f37398l0;
    public final int m0;
    public long f37399n;
    public int f37400n0;
    public cp0 f37401o0;
    public final lp0 f37402p0;
    public TLRPC.TL_emojiStatusCollectible f37403r;
    public TLRPC.TL_peerColorCollectible f37404s;
    public final ap0 v;
    public final View f37405w;
    public final View f37406x;
    public ep0 f37407y;

    public fp0(lp0 lp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f37402p0 = lp0Var;
        this.e = new mi.q(12, (byte) 0);
        this.h = -1;
        this.f37399n = 0L;
        this.f37403r = null;
        this.f37404s = null;
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
        this.f37384a0 = -1;
        this.f37386b0 = -1;
        this.f37388c0 = -1;
        this.f37389d0 = -1;
        this.f37390e0 = -1;
        this.f37392f0 = 0;
        this.f37393g0 = -1;
        this.f37394h0 = -1;
        this.f37395i0 = -1;
        this.f37396j0 = -1;
        this.f37398l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.g6 resourceProvider = lp0Var.getResourceProvider();
        bh.b bVar = lp0Var.G;
        wo0 wo0Var = new wo0(this, context2, resourceProvider, i10);
        this.f37385b = wo0Var;
        wo0Var.setClipToPadding(false);
        wo0Var.setSections(true);
        ((s4.k) wo0Var.getItemAnimator()).f46377m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f37387c = sVar;
        sVar.O = new ai.q1(this, 7);
        wo0Var.i(new ei.q1(this, 7));
        wo0Var.setLayoutManager(sVar);
        yo0 yo0Var = new yo0(this, context, i10);
        this.d = yo0Var;
        wo0Var.setAdapter(yo0Var);
        wo0Var.setOnItemClickListener(new org.telegram.ui.Components.rn0(this, i10, 1));
        wo0Var.j(new zo0(this, i10));
        addView(wo0Var, w7.z5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (lp0Var.f39290a) {
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
        kVar.f46377m = false;
        wo0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f37405w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.G = 220;
        view.setBackground(cVar);
        addView(view, w7.z5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f37383a = new jp0(lp0.f0(lp0Var), 0L, getContext(), lp0.g0(lp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f37406x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.z5.e(-1, 16, 55));
            ?? gaVar = new org.telegram.ui.Cells.ga(getContext(), lp0.h0(lp0Var), 3, 0L, lp0.i0(lp0Var));
            this.v = gaVar;
            gaVar.setImportantForAccessibility(4);
            gaVar.f22439r = lp0Var;
            gaVar.setClipToOutline(true);
            ci.n1 n1Var = zf.j0.f52047a;
            gaVar.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(16.0f)));
            addView((View) gaVar, w7.z5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        kp0 kp0Var = new kp0(lp0Var, getContext(), lp0.j0(lp0Var));
        this.E = kp0Var;
        dh.d c10 = lp0Var.E.c(kp0Var, null, false);
        eh.e eVar = new eh.e(lp0.k0(lp0Var));
        eVar.e = new c3.m(26);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.v.e = true;
        kp0Var.H = c10;
        kp0Var.G = c10;
        kp0Var.F = new vo0(this, 0);
        kp0Var.setVisibility(4);
        addView(kp0Var, w7.z5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        jp0 jp0Var = this.f37383a;
        if (jp0Var != null) {
            addView(jp0Var, w7.z5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(fp0 fp0Var) {
        int i10;
        wo0 wo0Var = fp0Var.f37385b;
        boolean z10 = fp0Var.H;
        if (z10) {
            wo0Var.B0();
        }
        fp0Var.e();
        if (z10 && (i10 = fp0Var.f37394h0) >= 0) {
            fp0Var.f37387c.h1(i10, fp0Var.f37402p0.f39298f);
            wo0Var.post(new vo0(fp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fp0.b():boolean");
    }

    public final boolean c() {
        wo0 wo0Var = this.f37385b;
        if (wo0Var != null) {
            for (int i10 = 0; i10 < wo0Var.getChildCount(); i10++) {
                if (wo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.b10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        lp0 lp0Var = this.f37402p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = lp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f37399n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f37403r = tL_emojiStatusCollectible;
                    this.f37404s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f37403r = tL_emojiStatusCollectible;
            this.f37404s = null;
        } else {
            TLRPC.User currentUser2 = lp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f37399n = UserObject.getEmojiId(currentUser2);
            this.f37403r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f37404s = tL_peerColorCollectible;
        }
        if (this.f37403r == null && this.f37404s == null) {
            return;
        }
        this.h = -1;
        this.f37399n = 0L;
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
        lp0 lp0Var = this.f37402p0;
        mi.q qVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.f633a);
            if (tL_starGiftUnique.resale_ton_only) {
                qVar.f17036b = ai.nd.n1(ai.nd.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.f634b).d()), true), true);
                qVar.f17037c = ai.nd.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                qVar.f17036b = ai.nd.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                qVar.f17037c = null;
            }
        } else {
            if (!lp0Var.getUserConfig().isPremium() && !lp0Var.f39290a) {
                obj = this.N;
            } else if (this.f37403r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            qVar.f17036b = obj;
            qVar.f17037c = null;
        }
        if (lp0Var.C0() == this) {
            lp0Var.R = this;
            lp0Var.Q.i((CharSequence) qVar.f17036b, z10, true);
            lp0Var.Q.g((SpannableStringBuilder) qVar.f17037c, z10);
        }
    }

    public final void g() {
        ei.d dVar = this.f37402p0.Q;
        if (dVar != null) {
            dVar.updateColors();
        }
        ap0 ap0Var = this.v;
        if (ap0Var != null) {
            ap0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f37385b, (Utilities.Callback<View>) new u3(this, 14));
        kp0 kp0Var = this.E;
        if (kp0Var != null) {
            l(kp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f37402p0.f39298f;
        float f7 = 0.0f;
        View view = this.f37405w;
        kp0 kp0Var = this.E;
        if (kp0Var != null && (i10 = this.f37394h0) >= 0) {
            s4.s sVar = this.f37387c;
            this.F = sVar.m(i10);
            wo0 wo0Var = this.f37385b;
            int paddingTop = wo0Var.getPaddingTop() + i11;
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
                kp0Var.setVisibility(0);
                kp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + wo0Var.getTop()) - kp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f37394h0) {
                this.H = true;
                this.G = false;
                kp0Var.setVisibility(0);
                kp0Var.setTranslationY((wo0Var.getTop() + paddingTop) - kp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                kp0Var.setVisibility(0);
                kp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - kp0Var.getTop());
            }
            boolean z11 = this.G;
            if (kp0Var.I != z11) {
                kp0Var.I = z11;
                kp0Var.L.D0(2);
                kp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            wo0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (kp0Var != null) {
            kp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (kp0Var.I != z12) {
                kp0Var.I = z12;
                kp0Var.L.D0(2);
                kp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        ap0 ap0Var = this.v;
        if (ap0Var != null) {
            org.telegram.ui.Cells.t1[] cells = ap0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    ip0 ip0Var = this.f37391f;
                    if (ip0Var != null) {
                        messageObject.overrideLinkColor = ip0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f37399n;
                    messageObject.overrideLinkPeerColor = this.f37404s;
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
        lp0 lp0Var;
        oo0 oo0Var;
        ip0 ip0Var = this.f37391f;
        if (ip0Var != null) {
            ip0Var.a(this.h, z10);
        }
        jp0 jp0Var = this.f37383a;
        if (jp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f37403r;
            if (tL_emojiStatusCollectible != null) {
                jp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                jp0Var.c(MessagesController.PeerColor.fromCollectible(this.f37403r), z10);
                jp0Var.d(this.f37403r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    jp0Var.e(0L, false, z10);
                } else {
                    jp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                jp0Var.b(this.h, z10);
                jp0Var.d(this.f37399n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (oo0Var = (lp0Var = this.f37402p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f37403r;
            if (tL_emojiStatusCollectible2 != null) {
                oo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                oo0Var.b(lp0.v0(lp0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            yo0 yo0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                yo0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                yo0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            wo0 wo0Var = this.f37385b;
            if (i13 < wo0Var.getChildCount()) {
                View childAt = wo0Var.getChildAt(i13);
                if (childAt instanceof to0) {
                    to0 to0Var = (to0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f37403r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == to0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f37404s) != null && tL_peerColorCollectible2.collectible_id == to0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    to0Var.b(z12, true);
                } else if (childAt instanceof yh.g1) {
                    yh.g1 g1Var = (yh.g1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f37403r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == g1Var.getGiftId()) || ((tL_peerColorCollectible = this.f37404s) != null && tL_peerColorCollectible.collectible_id == g1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g1Var.f(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        ai.y9 y9Var;
        lp0 lp0Var = this.f37402p0;
        ai.y9 y9Var2 = lp0Var.f39292b;
        this.V = -1;
        this.W = -1;
        this.f37384a0 = -1;
        this.f37386b0 = -1;
        this.f37389d0 = -1;
        this.f37390e0 = -1;
        this.f37388c0 = -1;
        this.f37393g0 = -1;
        this.f37394h0 = -1;
        this.f37395i0 = -1;
        this.f37396j0 = -1;
        this.f37392f0 = 0;
        ArrayList arrayList = this.f37398l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f37397k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f37403r != null || this.f37404s != null)) {
            this.V = 3;
            this.f37397k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            y9Var = lp0Var.f39294c;
        } else {
            y9Var = y9Var2;
        }
        if ((i11 == 0 || i11 == 1) && y9Var != null) {
            ArrayList arrayList2 = y9Var.f2511l;
            int i12 = this.f37397k0;
            this.f37397k0 = i12 + 1;
            this.f37394h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f37397k0;
                this.f37386b0 = i14;
                this.f37397k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f37392f0;
                this.f37392f0 = size;
                int i15 = this.f37397k0;
                this.f37388c0 = i15;
                if (!y9Var2.f2508i && y9Var2.f2509j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f37397k0;
                        this.f37396j0 = i16;
                        this.f37397k0 = i16 + 2;
                        this.f37395i0 = i16 + 1;
                    }
                } else {
                    this.f37389d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f37397k0 = i18;
                    this.f37392f0 = size + i10;
                    this.f37390e0 = i18;
                }
                if (c()) {
                    y9Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(lp0.u0(lp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f37397k0;
                this.f37386b0 = i20;
                this.f37397k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f37392f0;
                this.f37392f0 = size2;
                int i21 = this.f37397k0;
                this.f37388c0 = i21;
                yh.s3 s3Var = this.J;
                if (s3Var.f50982t || !s3Var.f50983u) {
                    this.f37389d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f37397k0 = i23;
                    this.f37392f0 = size2 + i10;
                    this.f37390e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f37397k0;
            this.f37397k0 = i24 + 1;
            this.f37393g0 = i24;
        }
        int i25 = this.f37397k0;
        this.f37397k0 = i25 + 1;
        this.U = i25;
        kp0 kp0Var = this.E;
        if (kp0Var != null) {
            kp0Var.post(new vo0(this, 1));
        }
    }

    public final void l(kp0 kp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.f21183d6;
        lp0 lp0Var = this.f37402p0;
        int themedColor = lp0Var.getThemedColor(i11);
        lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7);
        int themedColor2 = lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21588z6);
        int themedColor3 = lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        kp0Var.v.setColor(themedColor);
        kp0Var.f39038x = org.telegram.ui.ActionBar.k6.o1(0.06f, themedColor3);
        kp0Var.f39039y = themedColor2;
        kp0Var.E = themedColor3;
        k10 k10Var = kp0Var.f39030a;
        for (int i12 = 0; i12 < k10Var.getChildCount(); i12++) {
            View childAt = k10Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == kp0Var.d) {
                    i10 = kp0Var.E;
                } else {
                    i10 = kp0Var.f39039y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        k10Var.invalidate();
        kp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f37405w;
        wo0 wo0Var = this.f37385b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            ap0 ap0Var = this.v;
            this.f37400n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ap0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) ap0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) wo0Var.getLayoutParams()).topMargin = this.f37400n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f37400n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f37406x.getLayoutParams()).topMargin = this.f37400n0 - AndroidUtilities.dp(16.0f);
            wo0Var.setPadding(wo0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), wo0Var.getPaddingRight(), wo0Var.getPaddingBottom());
        } else {
            this.f37400n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) wo0Var.getLayoutParams()).topMargin = this.f37400n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f37400n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f37383a.getLayoutParams()).height = this.f37400n0;
        }
        super.onMeasure(i10, i11);
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g50 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.ActionBar.f5 M;
    public boolean N;
    public final boolean O;
    public d50 P;
    public FrameLayout f45533a;
    public org.telegram.ui.Components.zu0 f45534b;
    public org.telegram.ui.Components.iz f45535c;
    public org.telegram.ui.Components.tj0 d;
    public e50 f45536e;
    public f50 f45537f;
    public u4.b0 h;
    public int f45538n;
    public TLRPC.TL_messages_stickerSet f45539r;
    public boolean f45540s;
    public TLRPC.ChatFull f45541w;
    public final long f45542x;
    public int f45543y;

    public g50(long j10) {
        super(null);
        this.f45538n = -1;
        this.f45542x = j10;
    }

    public static void Z(g50 g50Var, View view, int i3) {
        if (g50Var.getParentActivity() != null) {
            if (g50Var.N) {
                if (i3 > g50Var.f45537f.d.size()) {
                    boolean a10 = ((org.telegram.ui.Cells.f8) view).a();
                    f50 f50Var = g50Var.f45537f;
                    g50Var.i0((TLRPC.TL_messages_stickerSet) f50Var.f45147e.get((i3 - f50Var.d.size()) - 1), a10, false);
                    return;
                } else if (i3 != g50Var.f45537f.d.size()) {
                    g50Var.i0((TLRPC.TL_messages_stickerSet) g50Var.f45537f.d.get(i3), ((org.telegram.ui.Cells.f8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i3 >= g50Var.F && i3 < g50Var.G) {
                g50Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.li.b0(g50Var.currentAccount).s0(g50Var.h0()).get(i3 - g50Var.F), ((org.telegram.ui.Cells.f8) view).a(), false);
            }
            if (i3 == g50Var.K) {
                g50Var.i0(g50Var.f45539r, true, false);
            }
        }
    }

    public static void a0(g50 g50Var, TLRPC.TL_error tL_error) {
        boolean z10 = g50Var.O;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = g50Var.f45539r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    g50Var.f45541w.emojiset = null;
                } else {
                    g50Var.f45541w.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    g50Var.f45541w.emojiset = stickerSet;
                } else {
                    g50Var.f45541w.stickerset = stickerSet;
                }
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(g50Var.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = g50Var.f45539r;
                b02.N.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.f27028id);
            }
            g50Var.m0();
            if (z10) {
                TLRPC.ChatFull chatFull = g50Var.f45541w;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = g50Var.f45541w;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            org.telegram.messenger.qr.a0(g50Var.currentAccount).N1(g50Var.f45541w, false);
            org.telegram.messenger.hs.f(g50Var.currentAccount).k(org.telegram.messenger.hs.T, g50Var.f45541w, 0, Boolean.TRUE, Boolean.FALSE);
            org.telegram.messenger.hs.f(g50Var.currentAccount).k(org.telegram.messenger.hs.f23289q3, Long.valueOf(g50Var.f45541w.f27002id), Boolean.valueOf(z10));
            g50Var.finishFragment();
        } else if (g50Var.getParentActivity() != null) {
            Activity parentActivity = g50Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int c0(g50 g50Var) {
        return g50Var.currentAccount;
    }

    public static void f0(g50 g50Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i3 = g50Var.f45538n;
        if (tL_messages_stickerSet == null) {
            if (g50Var.f45539r != null) {
                org.telegram.messenger.k5.o(null, 2131749386, org.telegram.ui.Components.fc.a0(g50Var), 2131623999, 36);
            }
            g50Var.f45539r = null;
            g50Var.f45540s = true;
        } else {
            g50Var.f45539r = tL_messages_stickerSet;
            g50Var.f45540s = false;
            org.telegram.messenger.k5.o(null, 2131749386, org.telegram.ui.Components.fc.a0(g50Var), 2131623999, 36);
        }
        g50Var.m0();
        g50Var.k0(g50Var.f45539r, false);
        if (i3 != -1) {
            if (!g50Var.N) {
                for (int i10 = 0; i10 < g50Var.d.getChildCount(); i10++) {
                    View childAt = g50Var.d.getChildAt(i10);
                    if (g50Var.d.T(childAt).b() == g50Var.F + i3) {
                        ((org.telegram.ui.Cells.f8) childAt).b(false, true);
                        break;
                    }
                }
            }
            g50Var.f45536e.g(g50Var.F + i3);
        }
        if (g50Var.f45538n != -1) {
            if (!g50Var.N) {
                for (int i11 = 0; i11 < g50Var.d.getChildCount(); i11++) {
                    View childAt2 = g50Var.d.getChildAt(i11);
                    if (g50Var.d.T(childAt2).b() == g50Var.F + g50Var.f45538n) {
                        ((org.telegram.ui.Cells.f8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            g50Var.f45536e.g(g50Var.F + g50Var.f45538n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (this.O) {
            i3 = 2131749451;
        } else {
            i3 = 2131749405;
        }
        y4Var.setTitle(org.telegram.messenger.bd.M0(i3, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 8));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
        this.M = b10;
        b10.N();
        b10.C0 = new lg.w1(this, 12);
        this.M.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.f45536e = new e50(this, context);
        this.f45537f = new f50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.d = tj0Var;
        tj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.n(200L);
        kVar.f55567m = true;
        this.d.setItemAnimator(kVar);
        u4.b0 b0Var = new u4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f45533a = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, frameLayout2, null);
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, getResourceProvider());
        this.f45535c = izVar;
        izVar.setViewType(19);
        this.f45535c.setIsSingleCell(true);
        this.f45535c.setItemsCount((int) Math.ceil(org.telegram.messenger.g0.f22608q.y / org.telegram.messenger.g0.N(58.0f)));
        this.f45533a.addView(this.f45535c, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, this.f45535c, 1, null);
        this.f45534b = zu0Var;
        k4.j.k(zu0Var);
        this.f45533a.addView(this.f45534b);
        this.f45533a.setVisibility(8);
        this.d.setEmptyView(this.f45533a);
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.f45533a);
        this.d.setAdapter(this.f45536e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new h3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23333x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
            }
        } else if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f27002id == this.f45542x) {
                if (this.f45541w == null && g0(chatFull) != null) {
                    this.f45539r = org.telegram.messenger.li.b0(this.currentAccount).Y(g0(chatFull));
                }
                this.f45541w = chatFull;
                l0(true);
            }
        } else if (i3 == org.telegram.messenger.hs.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (g0(this.f45541w) != null && g0(this.f45541w).f27028id == longValue) {
                l0(true);
            }
        }
    }

    public final TLRPC.StickerSet g0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.O) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h0() {
        if (this.O) {
            return 5;
        }
        return 0;
    }

    public final void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        Activity parentActivity = getParentActivity();
        if (!z11) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
        } else {
            tL_messages_stickerSet2 = null;
        }
        org.telegram.ui.Components.xv0 xv0Var = new org.telegram.ui.Components.xv0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        xv0Var.V1 = new b50(this, z10, tL_messages_stickerSet);
        xv0Var.Z0();
        org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
        xv0Var.show();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.f45541w = chatFull;
        if (g0(chatFull) != null) {
            this.f45539r = org.telegram.messenger.li.b0(this.currentAccount).Y(g0(this.f45541w));
        }
    }

    public final void k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        boolean z11;
        if (!this.O) {
            return;
        }
        boolean z12 = true;
        if (tL_messages_stickerSet != null) {
            if (this.K == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f45539r = tL_messages_stickerSet;
            l0(false);
            if (z11) {
                this.f45536e.i(this.K);
            } else {
                this.f45536e.g(this.K);
            }
            if (z10) {
                this.f45536e.g(this.J);
            }
            d50 d50Var = this.P;
            d50Var.f44563b = true;
            d50Var.invalidate();
            return;
        }
        int i3 = this.K;
        if (i3 <= 0) {
            z12 = false;
        }
        this.f45539r = null;
        if (z12) {
            this.f45536e.s(i3);
            if (z10) {
                this.f45536e.g(this.J);
            }
        }
        l0(false);
        d50 d50Var2 = this.P;
        d50Var2.f44563b = false;
        d50Var2.invalidate();
    }

    public final void l0(boolean z10) {
        e50 e50Var;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.H = 0;
        if (this.O) {
            this.I = 0;
            this.H = 2;
            this.J = 1;
            if (this.f45539r != null) {
                this.H = 3;
                this.K = 2;
            }
            int i3 = this.H;
            this.H = i3 + 1;
            this.L = i3;
        }
        ArrayList s02 = org.telegram.messenger.li.b0(this.currentAccount).s0(h0());
        if (!s02.isEmpty()) {
            int i10 = this.H;
            int i11 = i10 + 1;
            this.H = i11;
            this.E = i10;
            this.F = i11;
            this.G = s02.size() + i11;
            this.H = s02.size() + this.H;
        } else {
            this.E = -1;
            this.F = -1;
            this.G = -1;
        }
        int i12 = this.H;
        this.H = i12 + 1;
        this.f45543y = i12;
        m0();
        if (z10 && (e50Var = this.f45536e) != null) {
            e50Var.f();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g50.m0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.li.b0(this.currentAccount).B(h0());
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23333x0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.B0);
        l0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23333x0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.B0);
        if ((this.f45539r != null || this.f45540s) && (chatFull = this.f45541w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.f45539r) == null || tL_messages_stickerSet.set.f27028id != g0(this.f45541w).f27028id) {
                if (g0(this.f45541w) != null || this.f45539r != null) {
                    boolean z10 = this.O;
                    long j10 = this.f45542x;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = org.telegram.messenger.hp.s1(this.currentAccount).h1(j10);
                        if (this.f45540s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f45539r.set;
                            tL_inputStickerSetID.f27021id = stickerSet.f27028id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = org.telegram.messenger.hp.s1(this.currentAccount).h1(j10);
                        if (this.f45540s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.currentAccount).f23009f7.edit();
                            edit.remove("group_hide_stickers_" + this.f45541w.f27002id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f45539r.set;
                            tL_inputStickerSetID2.f27021id = stickerSet2.f27028id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new l(this, 10));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public g50(long j10, int i3) {
        super(null);
        this.f45538n = -1;
        this.f45542x = j10;
        this.O = true;
    }
}

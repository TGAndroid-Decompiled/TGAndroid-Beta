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
public final class j60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.p5 L;
    public boolean M;
    public final boolean N;
    public g60 O;
    public FrameLayout f38282a;
    public org.telegram.ui.Components.ew0 f38283b;
    public org.telegram.ui.Components.zz f38284c;
    public org.telegram.ui.Components.uk0 d;
    public h60 e;
    public i60 f38285f;
    public s4.a0 h;
    public int f38286n;
    public TLRPC.TL_messages_stickerSet f38287r;
    public boolean f38288s;
    public TLRPC.ChatFull f38289w;
    public final long f38290x;
    public int f38291y;

    public j60(long j10) {
        super(null);
        this.f38286n = -1;
        this.f38290x = j10;
    }

    public static void Z(j60 j60Var, View view, int i10) {
        if (j60Var.getParentActivity() != null) {
            if (j60Var.M) {
                if (i10 > j60Var.f38285f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.k8) view).a();
                    i60 i60Var = j60Var.f38285f;
                    j60Var.i0((TLRPC.TL_messages_stickerSet) i60Var.e.get((i10 - i60Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != j60Var.f38285f.d.size()) {
                    j60Var.i0((TLRPC.TL_messages_stickerSet) j60Var.f38285f.d.get(i10), ((org.telegram.ui.Cells.k8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= j60Var.E && i10 < j60Var.F) {
                j60Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.vi.b0(j60Var.currentAccount).s0(j60Var.h0()).get(i10 - j60Var.E), ((org.telegram.ui.Cells.k8) view).a(), false);
            }
            if (i10 == j60Var.J) {
                j60Var.i0(j60Var.f38287r, true, false);
            }
        }
    }

    public static void a0(j60 j60Var, TLRPC.TL_error tL_error) {
        boolean z10 = j60Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = j60Var.f38287r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    j60Var.f38289w.emojiset = null;
                } else {
                    j60Var.f38289w.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    j60Var.f38289w.emojiset = stickerSet;
                } else {
                    j60Var.f38289w.stickerset = stickerSet;
                }
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(j60Var.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = j60Var.f38287r;
                b02.M.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.f19821id);
            }
            j60Var.m0();
            if (z10) {
                TLRPC.ChatFull chatFull = j60Var.f38289w;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = j60Var.f38289w;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            org.telegram.messenger.is.a0(j60Var.currentAccount).N1(j60Var.f38289w, false);
            org.telegram.messenger.at.f(j60Var.currentAccount).k(org.telegram.messenger.at.T, j60Var.f38289w, 0, Boolean.TRUE, Boolean.FALSE);
            org.telegram.messenger.at.f(j60Var.currentAccount).k(org.telegram.messenger.at.f14769q3, Long.valueOf(j60Var.f38289w.f19795id), Boolean.valueOf(z10));
            j60Var.finishFragment();
        } else if (j60Var.getParentActivity() != null) {
            Activity parentActivity = j60Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.a30.q(null, 2131751106, sb2, "\n");
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static org.telegram.ui.ActionBar.i5 b0(j60 j60Var) {
        return j60Var.simpleActionBar;
    }

    public static int c0(j60 j60Var) {
        return j60Var.currentAccount;
    }

    public static int d0(j60 j60Var) {
        return j60Var.currentAccount;
    }

    public static int e0(j60 j60Var) {
        return j60Var.currentAccount;
    }

    public static void f0(j60 j60Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = j60Var.f38286n;
        if (tL_messages_stickerSet == null) {
            if (j60Var.f38287r != null) {
                org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(j60Var), 2131623999, 36);
            }
            j60Var.f38287r = null;
            j60Var.f38288s = true;
        } else {
            j60Var.f38287r = tL_messages_stickerSet;
            j60Var.f38288s = false;
            org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(j60Var), 2131623999, 36);
        }
        j60Var.m0();
        j60Var.k0(j60Var.f38287r, false);
        if (i10 != -1) {
            if (!j60Var.M) {
                for (int i11 = 0; i11 < j60Var.d.getChildCount(); i11++) {
                    View childAt = j60Var.d.getChildAt(i11);
                    if (j60Var.d.T(childAt).b() == j60Var.E + i10) {
                        ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                        break;
                    }
                }
            }
            j60Var.e.g(j60Var.E + i10);
        }
        if (j60Var.f38286n != -1) {
            if (!j60Var.M) {
                for (int i12 = 0; i12 < j60Var.d.getChildCount(); i12++) {
                    View childAt2 = j60Var.d.getChildAt(i12);
                    if (j60Var.d.T(childAt2).b() == j60Var.E + j60Var.f38286n) {
                        ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            j60Var.e.g(j60Var.E + j60Var.f38286n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (this.N) {
            i10 = 2131749452;
        } else {
            i10 = 2131749406;
        }
        i5Var.setTitle(org.telegram.messenger.dd.L0(i10, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 28));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131232485);
        this.L = b10;
        b10.N();
        b10.B0 = new ag.l3(this, 12);
        this.L.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        this.e = new h60(this, context);
        this.f38285f = new i60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.d = uk0Var;
        uk0Var.r1();
        this.d.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(200L);
        jVar.f47938m = true;
        this.d.setItemAnimator(jVar);
        s4.a0 a0Var = new s4.a0();
        this.h = a0Var;
        a0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f38282a = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, frameLayout2, null);
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, getResourceProvider());
        this.f38284c = zzVar;
        zzVar.setViewType(19);
        this.f38284c.setIsSingleCell(true);
        this.f38284c.setItemsCount((int) Math.ceil(org.telegram.messenger.i0.f16172q.y / org.telegram.messenger.i0.N(58.0f)));
        this.f38282a.addView(this.f38284c, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, this.f38284c, 1, null);
        this.f38283b = ew0Var;
        li.k.i(ew0Var);
        this.f38282a.addView(this.f38283b);
        this.f38282a.setVisibility(8);
        this.d.setEmptyView(this.f38282a);
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f38282a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new g(this, 14));
        this.d.setOnScrollListener(new h3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14814x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
            }
        } else if (i10 == org.telegram.messenger.at.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19795id == this.f38290x) {
                if (this.f38289w == null && g0(chatFull) != null) {
                    this.f38287r = org.telegram.messenger.vi.b0(this.currentAccount).Y(g0(chatFull));
                }
                this.f38289w = chatFull;
                l0(true);
            }
        } else if (i10 == org.telegram.messenger.at.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (g0(this.f38289w) != null && g0(this.f38289w).f19821id == longValue) {
                l0(true);
            }
        }
    }

    public final TLRPC.StickerSet g0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.N) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h0() {
        if (this.N) {
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
        org.telegram.ui.Components.dx0 dx0Var = new org.telegram.ui.Components.dx0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        dx0Var.U1 = new e60(this, z10, tL_messages_stickerSet);
        dx0Var.Z0();
        org.telegram.messenger.i0.v1(getParentActivity().getCurrentFocus());
        dx0Var.show();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.f38289w = chatFull;
        if (g0(chatFull) != null) {
            this.f38287r = org.telegram.messenger.vi.b0(this.currentAccount).Y(g0(this.f38289w));
        }
    }

    public final void k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        boolean z11;
        if (!this.N) {
            return;
        }
        boolean z12 = true;
        if (tL_messages_stickerSet != null) {
            if (this.J == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f38287r = tL_messages_stickerSet;
            l0(false);
            if (z11) {
                this.e.i(this.J);
            } else {
                this.e.g(this.J);
            }
            if (z10) {
                this.e.g(this.I);
            }
            g60 g60Var = this.O;
            g60Var.f37360b = true;
            g60Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f38287r = null;
        if (z12) {
            this.e.s(i10);
            if (z10) {
                this.e.g(this.I);
            }
        }
        l0(false);
        g60 g60Var2 = this.O;
        g60Var2.f37360b = false;
        g60Var2.invalidate();
    }

    public final void l0(boolean z10) {
        h60 h60Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f38287r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList s02 = org.telegram.messenger.vi.b0(this.currentAccount).s0(h0());
        if (!s02.isEmpty()) {
            int i11 = this.G;
            int i12 = i11 + 1;
            this.G = i12;
            this.D = i11;
            this.E = i12;
            this.F = s02.size() + i12;
            this.G = s02.size() + this.G;
        } else {
            this.D = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f38291y = i13;
        m0();
        if (z10 && (h60Var = this.e) != null) {
            h60Var.f();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j60.m0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.vi.b0(this.currentAccount).B(h0());
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14814x0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.T);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.B0);
        l0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14814x0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.T);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.B0);
        if ((this.f38287r != null || this.f38288s) && (chatFull = this.f38289w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.f38287r) == null || tL_messages_stickerSet.set.f19821id != g0(this.f38289w).f19821id) {
                if (g0(this.f38289w) != null || this.f38287r != null) {
                    boolean z10 = this.N;
                    long j10 = this.f38290x;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = org.telegram.messenger.wp.r1(this.currentAccount).g1(j10);
                        if (this.f38288s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f38287r.set;
                            tL_inputStickerSetID.f19814id = stickerSet.f19821id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = org.telegram.messenger.wp.r1(this.currentAccount).g1(j10);
                        if (this.f38288s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(this.currentAccount).f19138g7.edit();
                            edit.remove("group_hide_stickers_" + this.f38289w.f19795id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f38287r.set;
                            tL_inputStickerSetID2.f19814id = stickerSet2.f19821id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new k(this, 10));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public j60(long j10, int i10) {
        super(null);
        this.f38286n = -1;
        this.f38290x = j10;
        this.N = true;
    }
}

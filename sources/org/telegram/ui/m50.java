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
public final class m50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.f5 L;
    public boolean M;
    public final boolean N;
    public j50 O;
    public FrameLayout f47666a;
    public org.telegram.ui.Components.av0 f47667b;
    public org.telegram.ui.Components.lz f47668c;
    public org.telegram.ui.Components.pj0 d;
    public k50 f47669e;
    public l50 f47670f;
    public v4.b0 h;
    public int f47671n;
    public TLRPC.TL_messages_stickerSet f47672r;
    public boolean f47673s;
    public TLRPC.ChatFull f47674w;
    public final long f47675x;
    public int f47676y;

    public m50(long j3) {
        super(null);
        this.f47671n = -1;
        this.f47675x = j3;
    }

    public static void Z(m50 m50Var, View view, int i7) {
        if (m50Var.getParentActivity() != null) {
            if (m50Var.M) {
                if (i7 > m50Var.f47670f.d.size()) {
                    boolean a10 = ((org.telegram.ui.Cells.g8) view).a();
                    l50 l50Var = m50Var.f47670f;
                    m50Var.i0((TLRPC.TL_messages_stickerSet) l50Var.f47420e.get((i7 - l50Var.d.size()) - 1), a10, false);
                    return;
                } else if (i7 != m50Var.f47670f.d.size()) {
                    m50Var.i0((TLRPC.TL_messages_stickerSet) m50Var.f47670f.d.get(i7), ((org.telegram.ui.Cells.g8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i7 >= m50Var.E && i7 < m50Var.F) {
                m50Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.ui.b0(m50Var.currentAccount).s0(m50Var.h0()).get(i7 - m50Var.E), ((org.telegram.ui.Cells.g8) view).a(), false);
            }
            if (i7 == m50Var.J) {
                m50Var.i0(m50Var.f47672r, true, false);
            }
        }
    }

    public static void a0(m50 m50Var, TLRPC.TL_error tL_error) {
        boolean z9 = m50Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m50Var.f47672r;
            if (tL_messages_stickerSet == null) {
                if (z9) {
                    m50Var.f47674w.emojiset = null;
                } else {
                    m50Var.f47674w.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z9) {
                    m50Var.f47674w.emojiset = stickerSet;
                } else {
                    m50Var.f47674w.stickerset = stickerSet;
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(m50Var.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = m50Var.f47672r;
                b02.M.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.f26979id);
            }
            m50Var.m0();
            if (z9) {
                TLRPC.ChatFull chatFull = m50Var.f47674w;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = m50Var.f47674w;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            org.telegram.messenger.yr.a0(m50Var.currentAccount).N1(m50Var.f47674w, false);
            org.telegram.messenger.qs.f(m50Var.currentAccount).k(org.telegram.messenger.qs.T, m50Var.f47674w, 0, Boolean.TRUE, Boolean.FALSE);
            org.telegram.messenger.qs.f(m50Var.currentAccount).k(org.telegram.messenger.qs.f25043q3, Long.valueOf(m50Var.f47674w.f26953id), Boolean.valueOf(z9));
            m50Var.finishFragment();
        } else if (m50Var.getParentActivity() != null) {
            Activity parentActivity = m50Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int c0(m50 m50Var) {
        return m50Var.currentAccount;
    }

    public static void f0(m50 m50Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7 = m50Var.f47671n;
        if (tL_messages_stickerSet == null) {
            if (m50Var.f47672r != null) {
                org.telegram.messenger.k5.o(null, 2131749377, org.telegram.ui.Components.hc.a0(m50Var), 2131623999, 36);
            }
            m50Var.f47672r = null;
            m50Var.f47673s = true;
        } else {
            m50Var.f47672r = tL_messages_stickerSet;
            m50Var.f47673s = false;
            org.telegram.messenger.k5.o(null, 2131749377, org.telegram.ui.Components.hc.a0(m50Var), 2131623999, 36);
        }
        m50Var.m0();
        m50Var.k0(m50Var.f47672r, false);
        if (i7 != -1) {
            if (!m50Var.M) {
                for (int i10 = 0; i10 < m50Var.d.getChildCount(); i10++) {
                    View childAt = m50Var.d.getChildAt(i10);
                    if (m50Var.d.T(childAt).b() == m50Var.E + i7) {
                        ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                        break;
                    }
                }
            }
            m50Var.f47669e.g(m50Var.E + i7);
        }
        if (m50Var.f47671n != -1) {
            if (!m50Var.M) {
                for (int i11 = 0; i11 < m50Var.d.getChildCount(); i11++) {
                    View childAt2 = m50Var.d.getChildAt(i11);
                    if (m50Var.d.T(childAt2).b() == m50Var.E + m50Var.f47671n) {
                        ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            m50Var.f47669e.g(m50Var.E + m50Var.f47671n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (this.N) {
            i7 = 2131749442;
        } else {
            i7 = 2131749396;
        }
        y4Var.setTitle(org.telegram.messenger.hd.M0(i7, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 7));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
        this.L = b10;
        b10.N();
        b10.B0 = new kg.v1(this, 12);
        this.L.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        this.f47669e = new k50(this, context);
        this.f47670f = new l50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.d = pj0Var;
        pj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(200L);
        kVar.f56979m = true;
        this.d.setItemAnimator(kVar);
        v4.b0 b0Var = new v4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f47666a = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, frameLayout2, null);
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, getResourceProvider());
        this.f47668c = lzVar;
        lzVar.setViewType(19);
        this.f47668c.setIsSingleCell(true);
        this.f47668c.setItemsCount((int) Math.ceil(org.telegram.messenger.g0.f22537q.y / org.telegram.messenger.g0.N(58.0f)));
        this.f47666a.addView(this.f47668c, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, this.f47668c, 1, null);
        this.f47667b = av0Var;
        h6.m.g(av0Var);
        this.f47666a.addView(this.f47667b);
        this.f47666a.setVisibility(8);
        this.d.setEmptyView(this.f47666a);
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f47666a);
        this.d.setAdapter(this.f47669e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new g3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25087x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
            }
        } else if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f26953id == this.f47675x) {
                if (this.f47674w == null && g0(chatFull) != null) {
                    this.f47672r = org.telegram.messenger.ui.b0(this.currentAccount).Y(g0(chatFull));
                }
                this.f47674w = chatFull;
                l0(true);
            }
        } else if (i7 == org.telegram.messenger.qs.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (g0(this.f47674w) != null && g0(this.f47674w).f26979id == longValue) {
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
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
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

    public final void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z9, boolean z10) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        if (z10) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        Activity parentActivity = getParentActivity();
        if (!z10) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
        } else {
            tL_messages_stickerSet2 = null;
        }
        org.telegram.ui.Components.yv0 yv0Var = new org.telegram.ui.Components.yv0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        yv0Var.U1 = new g50(this, z9, tL_messages_stickerSet);
        yv0Var.Z0();
        org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
        yv0Var.show();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.f47674w = chatFull;
        if (g0(chatFull) != null) {
            this.f47672r = org.telegram.messenger.ui.b0(this.currentAccount).Y(g0(this.f47674w));
        }
    }

    public final void k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z9) {
        boolean z10;
        if (!this.N) {
            return;
        }
        boolean z11 = true;
        if (tL_messages_stickerSet != null) {
            if (this.J == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f47672r = tL_messages_stickerSet;
            l0(false);
            if (z10) {
                this.f47669e.i(this.J);
            } else {
                this.f47669e.g(this.J);
            }
            if (z9) {
                this.f47669e.g(this.I);
            }
            j50 j50Var = this.O;
            j50Var.f46844b = true;
            j50Var.invalidate();
            return;
        }
        int i7 = this.J;
        if (i7 <= 0) {
            z11 = false;
        }
        this.f47672r = null;
        if (z11) {
            this.f47669e.s(i7);
            if (z9) {
                this.f47669e.g(this.I);
            }
        }
        l0(false);
        j50 j50Var2 = this.O;
        j50Var2.f46844b = false;
        j50Var2.invalidate();
    }

    public final void l0(boolean z9) {
        k50 k50Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f47672r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i7 = this.G;
            this.G = i7 + 1;
            this.K = i7;
        }
        ArrayList s02 = org.telegram.messenger.ui.b0(this.currentAccount).s0(h0());
        if (!s02.isEmpty()) {
            int i10 = this.G;
            int i11 = i10 + 1;
            this.G = i11;
            this.D = i10;
            this.E = i11;
            this.F = s02.size() + i11;
            this.G = s02.size() + this.G;
        } else {
            this.D = -1;
            this.E = -1;
            this.F = -1;
        }
        int i12 = this.G;
        this.G = i12 + 1;
        this.f47676y = i12;
        m0();
        if (z9 && (k50Var = this.f47669e) != null) {
            k50Var.f();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m50.m0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ui.b0(this.currentAccount).B(h0());
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25087x0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.B0);
        l0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25087x0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.B0);
        if ((this.f47672r != null || this.f47673s) && (chatFull = this.f47674w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.f47672r) == null || tL_messages_stickerSet.set.f26979id != g0(this.f47674w).f26979id) {
                if (g0(this.f47674w) != null || this.f47672r != null) {
                    boolean z9 = this.N;
                    long j3 = this.f47675x;
                    if (z9) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
                        if (this.f47673s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f47672r.set;
                            tL_inputStickerSetID.f26972id = stickerSet.f26979id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
                        if (this.f47673s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24769f7.edit();
                            edit.remove("group_hide_stickers_" + this.f47674w.f26953id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f47672r.set;
                            tL_inputStickerSetID2.f26972id = stickerSet2.f26979id;
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

    public m50(long j3, int i7) {
        super(null);
        this.f47671n = -1;
        this.f47675x = j3;
        this.N = true;
    }
}

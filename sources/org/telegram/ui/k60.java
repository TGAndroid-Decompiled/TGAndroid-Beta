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
public final class k60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public h60 O;
    public FrameLayout f38695a;
    public org.telegram.ui.Components.dw0 f38696b;
    public org.telegram.ui.Components.zz f38697c;
    public org.telegram.ui.Components.tk0 d;
    public i60 e;
    public j60 f38698f;
    public s4.a0 h;
    public int f38699n;
    public TLRPC.TL_messages_stickerSet f38700r;
    public boolean f38701s;
    public TLRPC.ChatFull f38702w;
    public final long f38703x;
    public int f38704y;

    public k60(long j10) {
        super(null);
        this.f38699n = -1;
        this.f38703x = j10;
    }

    public static void Y(k60 k60Var, View view, int i10) {
        if (k60Var.getParentActivity() != null) {
            if (k60Var.M) {
                if (i10 > k60Var.f38698f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.k8) view).a();
                    j60 j60Var = k60Var.f38698f;
                    k60Var.h0((TLRPC.TL_messages_stickerSet) j60Var.e.get((i10 - j60Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != k60Var.f38698f.d.size()) {
                    k60Var.h0((TLRPC.TL_messages_stickerSet) k60Var.f38698f.d.get(i10), ((org.telegram.ui.Cells.k8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= k60Var.E && i10 < k60Var.F) {
                k60Var.h0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.ui.b0(k60Var.currentAccount).s0(k60Var.g0()).get(i10 - k60Var.E), ((org.telegram.ui.Cells.k8) view).a(), false);
            }
            if (i10 == k60Var.J) {
                k60Var.h0(k60Var.f38700r, true, false);
            }
        }
    }

    public static void Z(k60 k60Var, TLRPC.TL_error tL_error) {
        boolean z10 = k60Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = k60Var.f38700r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    k60Var.f38702w.emojiset = null;
                } else {
                    k60Var.f38702w.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    k60Var.f38702w.emojiset = stickerSet;
                } else {
                    k60Var.f38702w.stickerset = stickerSet;
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(k60Var.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = k60Var.f38700r;
                b02.M.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.f19820id);
            }
            k60Var.l0();
            if (z10) {
                TLRPC.ChatFull chatFull = k60Var.f38702w;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = k60Var.f38702w;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            org.telegram.messenger.hs.a0(k60Var.currentAccount).N1(k60Var.f38702w, false);
            org.telegram.messenger.zs.f(k60Var.currentAccount).k(org.telegram.messenger.zs.T, k60Var.f38702w, 0, Boolean.TRUE, Boolean.FALSE);
            org.telegram.messenger.zs.f(k60Var.currentAccount).k(org.telegram.messenger.zs.f19673q3, Long.valueOf(k60Var.f38702w.f19794id), Boolean.valueOf(z10));
            k60Var.finishFragment();
        } else if (k60Var.getParentActivity() != null) {
            Activity parentActivity = k60Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static org.telegram.ui.ActionBar.i5 a0(k60 k60Var) {
        return k60Var.simpleActionBar;
    }

    public static int b0(k60 k60Var) {
        return k60Var.currentAccount;
    }

    public static int c0(k60 k60Var) {
        return k60Var.currentAccount;
    }

    public static int d0(k60 k60Var) {
        return k60Var.currentAccount;
    }

    public static void e0(k60 k60Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = k60Var.f38699n;
        if (tL_messages_stickerSet == null) {
            if (k60Var.f38700r != null) {
                org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(k60Var), 2131623999, 36);
            }
            k60Var.f38700r = null;
            k60Var.f38701s = true;
        } else {
            k60Var.f38700r = tL_messages_stickerSet;
            k60Var.f38701s = false;
            org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(k60Var), 2131623999, 36);
        }
        k60Var.l0();
        k60Var.j0(k60Var.f38700r, false);
        if (i10 != -1) {
            if (!k60Var.M) {
                for (int i11 = 0; i11 < k60Var.d.getChildCount(); i11++) {
                    View childAt = k60Var.d.getChildAt(i11);
                    if (k60Var.d.T(childAt).b() == k60Var.E + i10) {
                        ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                        break;
                    }
                }
            }
            k60Var.e.g(k60Var.E + i10);
        }
        if (k60Var.f38699n != -1) {
            if (!k60Var.M) {
                for (int i12 = 0; i12 < k60Var.d.getChildCount(); i12++) {
                    View childAt2 = k60Var.d.getChildAt(i12);
                    if (k60Var.d.T(childAt2).b() == k60Var.E + k60Var.f38699n) {
                        ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            k60Var.e.g(k60Var.E + k60Var.f38699n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
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
        i5Var.setTitle(org.telegram.messenger.cd.L0(i10, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 28));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131232485);
        this.L = b10;
        b10.N();
        b10.B0 = new ag.l3(this, 12);
        this.L.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.e = new i60(this, context);
        this.f38698f = new j60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.d = tk0Var;
        tk0Var.r1();
        this.d.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(200L);
        jVar.f47927m = true;
        this.d.setItemAnimator(jVar);
        s4.a0 a0Var = new s4.a0();
        this.h = a0Var;
        a0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f38695a = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, frameLayout2, null);
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, getResourceProvider());
        this.f38697c = zzVar;
        zzVar.setViewType(19);
        this.f38697c.setIsSingleCell(true);
        this.f38697c.setItemsCount((int) Math.ceil(org.telegram.messenger.i0.f16026q.y / org.telegram.messenger.i0.N(58.0f)));
        this.f38695a.addView(this.f38697c, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, this.f38697c, 1, null);
        this.f38696b = dw0Var;
        li.k.i(dw0Var);
        this.f38695a.addView(this.f38696b);
        this.f38695a.setVisibility(8);
        this.d.setEmptyView(this.f38695a);
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f38695a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new g(this, 14));
        this.d.setOnScrollListener(new h3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19718x0) {
            if (((Integer) objArr[0]).intValue() == g0()) {
                k0(true);
            }
        } else if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19794id == this.f38703x) {
                if (this.f38702w == null && f0(chatFull) != null) {
                    this.f38700r = org.telegram.messenger.ui.b0(this.currentAccount).Y(f0(chatFull));
                }
                this.f38702w = chatFull;
                k0(true);
            }
        } else if (i10 == org.telegram.messenger.zs.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (f0(this.f38702w) != null && f0(this.f38702w).f19820id == longValue) {
                k0(true);
            }
        }
    }

    public final TLRPC.StickerSet f0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.N) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    public final int g0() {
        if (this.N) {
            return 5;
        }
        return 0;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
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
        org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        cx0Var.U1 = new f60(this, z10, tL_messages_stickerSet);
        cx0Var.Z0();
        org.telegram.messenger.i0.v1(getParentActivity().getCurrentFocus());
        cx0Var.show();
    }

    public final void i0(TLRPC.ChatFull chatFull) {
        this.f38702w = chatFull;
        if (f0(chatFull) != null) {
            this.f38700r = org.telegram.messenger.ui.b0(this.currentAccount).Y(f0(this.f38702w));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
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
            this.f38700r = tL_messages_stickerSet;
            k0(false);
            if (z11) {
                this.e.i(this.J);
            } else {
                this.e.g(this.J);
            }
            if (z10) {
                this.e.g(this.I);
            }
            h60 h60Var = this.O;
            h60Var.f37763b = true;
            h60Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f38700r = null;
        if (z12) {
            this.e.s(i10);
            if (z10) {
                this.e.g(this.I);
            }
        }
        k0(false);
        h60 h60Var2 = this.O;
        h60Var2.f37763b = false;
        h60Var2.invalidate();
    }

    public final void k0(boolean z10) {
        i60 i60Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f38700r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList s02 = org.telegram.messenger.ui.b0(this.currentAccount).s0(g0());
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
        this.f38704y = i13;
        l0();
        if (z10 && (i60Var = this.e) != null) {
            i60Var.f();
        }
    }

    public final void l0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k60.l0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ui.b0(this.currentAccount).B(g0());
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19718x0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.B0);
        k0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19718x0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.B0);
        if ((this.f38700r != null || this.f38701s) && (chatFull = this.f38702w) != null) {
            if (f0(chatFull) == null || (tL_messages_stickerSet = this.f38700r) == null || tL_messages_stickerSet.set.f19820id != f0(this.f38702w).f19820id) {
                if (f0(this.f38702w) != null || this.f38700r != null) {
                    boolean z10 = this.N;
                    long j10 = this.f38703x;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = org.telegram.messenger.vp.r1(this.currentAccount).g1(j10);
                        if (this.f38701s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f38700r.set;
                            tL_inputStickerSetID.f19813id = stickerSet.f19820id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = org.telegram.messenger.vp.r1(this.currentAccount).g1(j10);
                        if (this.f38701s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.currentAccount).f18795g7.edit();
                            edit.remove("group_hide_stickers_" + this.f38702w.f19794id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f38700r.set;
                            tL_inputStickerSetID2.f19813id = stickerSet2.f19820id;
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

    public k60(long j10, int i10) {
        super(null);
        this.f38699n = -1;
        this.f38703x = j10;
        this.N = true;
    }
}

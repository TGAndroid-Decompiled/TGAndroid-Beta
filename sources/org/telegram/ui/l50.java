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
public final class l50 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.ActionBar.d5 M;
    public boolean N;
    public final boolean O;
    public i50 P;
    public FrameLayout f48845a;
    public org.telegram.ui.Components.cv0 f48846b;
    public org.telegram.ui.Components.pz f48847c;
    public org.telegram.ui.Components.uj0 d;
    public j50 f48848e;
    public k50 f48849f;
    public v4.b0 h;
    public int f48850n;
    public TLRPC.TL_messages_stickerSet f48851r;
    public boolean f48852s;
    public TLRPC.ChatFull f48853w;
    public final long f48854x;
    public int f48855y;

    public l50(long j3) {
        super(null);
        this.f48850n = -1;
        this.f48854x = j3;
    }

    public static void Z(l50 l50Var, View view, int i7) {
        if (l50Var.getParentActivity() != null) {
            if (l50Var.N) {
                if (i7 > l50Var.f48849f.d.size()) {
                    boolean a10 = ((org.telegram.ui.Cells.f8) view).a();
                    k50 k50Var = l50Var.f48849f;
                    l50Var.i0((TLRPC.TL_messages_stickerSet) k50Var.f48588e.get((i7 - k50Var.d.size()) - 1), a10, false);
                    return;
                } else if (i7 != l50Var.f48849f.d.size()) {
                    l50Var.i0((TLRPC.TL_messages_stickerSet) l50Var.f48849f.d.get(i7), ((org.telegram.ui.Cells.f8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i7 >= l50Var.F && i7 < l50Var.G) {
                l50Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.si.b0(l50Var.currentAccount).s0(l50Var.h0()).get(i7 - l50Var.F), ((org.telegram.ui.Cells.f8) view).a(), false);
            }
            if (i7 == l50Var.K) {
                l50Var.i0(l50Var.f48851r, true, false);
            }
        }
    }

    public static void a0(l50 l50Var, TLRPC.TL_error tL_error) {
        boolean z10 = l50Var.O;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = l50Var.f48851r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    l50Var.f48853w.emojiset = null;
                } else {
                    l50Var.f48853w.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    l50Var.f48853w.emojiset = stickerSet;
                } else {
                    l50Var.f48853w.stickerset = stickerSet;
                }
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(l50Var.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = l50Var.f48851r;
                b02.N.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.f28078id);
            }
            l50Var.m0();
            if (z10) {
                TLRPC.ChatFull chatFull = l50Var.f48853w;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = l50Var.f48853w;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            org.telegram.messenger.vr.a0(l50Var.currentAccount).N1(l50Var.f48853w, false);
            org.telegram.messenger.ns.f(l50Var.currentAccount).k(org.telegram.messenger.ns.T, l50Var.f48853w, 0, Boolean.TRUE, Boolean.FALSE);
            org.telegram.messenger.ns.f(l50Var.currentAccount).k(org.telegram.messenger.ns.f25556q3, Long.valueOf(l50Var.f48853w.f28052id), Boolean.valueOf(z10));
            l50Var.finishFragment();
        } else if (l50Var.getParentActivity() != null) {
            Activity parentActivity = l50Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int c0(l50 l50Var) {
        return l50Var.currentAccount;
    }

    public static void f0(l50 l50Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7 = l50Var.f48850n;
        if (tL_messages_stickerSet == null) {
            if (l50Var.f48851r != null) {
                org.telegram.messenger.k5.n(null, 2131749378, org.telegram.ui.Components.cc.a0(l50Var), 2131624000, 36);
            }
            l50Var.f48851r = null;
            l50Var.f48852s = true;
        } else {
            l50Var.f48851r = tL_messages_stickerSet;
            l50Var.f48852s = false;
            org.telegram.messenger.k5.n(null, 2131749378, org.telegram.ui.Components.cc.a0(l50Var), 2131624000, 36);
        }
        l50Var.m0();
        l50Var.k0(l50Var.f48851r, false);
        if (i7 != -1) {
            if (!l50Var.N) {
                for (int i10 = 0; i10 < l50Var.d.getChildCount(); i10++) {
                    View childAt = l50Var.d.getChildAt(i10);
                    if (l50Var.d.T(childAt).b() == l50Var.F + i7) {
                        ((org.telegram.ui.Cells.f8) childAt).b(false, true);
                        break;
                    }
                }
            }
            l50Var.f48848e.g(l50Var.F + i7);
        }
        if (l50Var.f48850n != -1) {
            if (!l50Var.N) {
                for (int i11 = 0; i11 < l50Var.d.getChildCount(); i11++) {
                    View childAt2 = l50Var.d.getChildAt(i11);
                    if (l50Var.d.T(childAt2).b() == l50Var.F + l50Var.f48850n) {
                        ((org.telegram.ui.Cells.f8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            l50Var.f48848e.g(l50Var.F + l50Var.f48850n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (this.O) {
            i7 = 2131749443;
        } else {
            i7 = 2131749397;
        }
        w4Var.setTitle(org.telegram.messenger.hd.M0(i7, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 8));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, 2131232487);
        this.M = b10;
        b10.O();
        b10.C0 = new kg.x1(this, 12);
        this.M.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.f48848e = new j50(this, context);
        this.f48849f = new k50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.d = uj0Var;
        uj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(200L);
        kVar.f58564m = true;
        this.d.setItemAnimator(kVar);
        v4.b0 b0Var = new v4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48845a = frameLayout2;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, frameLayout2, null);
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, getResourceProvider());
        this.f48847c = pzVar;
        pzVar.setViewType(19);
        this.f48847c.setIsSingleCell(true);
        this.f48847c.setItemsCount((int) Math.ceil(org.telegram.messenger.g0.f23609q.y / org.telegram.messenger.g0.N(58.0f)));
        this.f48845a.addView(this.f48847c, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, this.f48847c, 1, null);
        this.f48846b = cv0Var;
        h6.m.g(cv0Var);
        this.f48845a.addView(this.f48846b);
        this.f48845a.setVisibility(8);
        this.d.setEmptyView(this.f48845a);
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.f48845a);
        this.d.setAdapter(this.f48848e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new g3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25600x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
            }
        } else if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28052id == this.f48854x) {
                if (this.f48853w == null && g0(chatFull) != null) {
                    this.f48851r = org.telegram.messenger.si.b0(this.currentAccount).Y(g0(chatFull));
                }
                this.f48853w = chatFull;
                l0(true);
            }
        } else if (i7 == org.telegram.messenger.ns.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (g0(this.f48853w) != null && g0(this.f48853w).f28078id == longValue) {
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
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
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
        org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        bw0Var.Y1 = new f50(this, z10, tL_messages_stickerSet);
        bw0Var.Z0();
        org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
        bw0Var.show();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.f48853w = chatFull;
        if (g0(chatFull) != null) {
            this.f48851r = org.telegram.messenger.si.b0(this.currentAccount).Y(g0(this.f48853w));
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
            this.f48851r = tL_messages_stickerSet;
            l0(false);
            if (z11) {
                this.f48848e.i(this.K);
            } else {
                this.f48848e.g(this.K);
            }
            if (z10) {
                this.f48848e.g(this.J);
            }
            i50 i50Var = this.P;
            i50Var.f47906b = true;
            i50Var.invalidate();
            return;
        }
        int i7 = this.K;
        if (i7 <= 0) {
            z12 = false;
        }
        this.f48851r = null;
        if (z12) {
            this.f48848e.s(i7);
            if (z10) {
                this.f48848e.g(this.J);
            }
        }
        l0(false);
        i50 i50Var2 = this.P;
        i50Var2.f47906b = false;
        i50Var2.invalidate();
    }

    public final void l0(boolean z10) {
        j50 j50Var;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.H = 0;
        if (this.O) {
            this.I = 0;
            this.H = 2;
            this.J = 1;
            if (this.f48851r != null) {
                this.H = 3;
                this.K = 2;
            }
            int i7 = this.H;
            this.H = i7 + 1;
            this.L = i7;
        }
        ArrayList s02 = org.telegram.messenger.si.b0(this.currentAccount).s0(h0());
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
        this.f48855y = i12;
        m0();
        if (z10 && (j50Var = this.f48848e) != null) {
            j50Var.f();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l50.m0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.si.b0(this.currentAccount).B(h0());
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25600x0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.B0);
        l0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25600x0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.B0);
        if ((this.f48851r != null || this.f48852s) && (chatFull = this.f48853w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.f48851r) == null || tL_messages_stickerSet.set.f28078id != g0(this.f48853w).f28078id) {
                if (g0(this.f48853w) != null || this.f48851r != null) {
                    boolean z10 = this.O;
                    long j3 = this.f48854x;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(j3);
                        if (this.f48852s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f48851r.set;
                            tL_inputStickerSetID.f28071id = stickerSet.f28078id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(j3);
                        if (this.f48852s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(this.currentAccount).f25289g7.edit();
                            edit.remove("group_hide_stickers_" + this.f48853w.f28052id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f48851r.set;
                            tL_inputStickerSetID2.f28071id = stickerSet2.f28078id;
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

    public l50(long j3, int i7) {
        super(null);
        this.f48850n = -1;
        this.f48854x = j3;
        this.O = true;
    }
}

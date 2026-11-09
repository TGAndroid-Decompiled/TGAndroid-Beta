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
public final class o50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public l50 O;
    public FrameLayout f48340a;
    public org.telegram.ui.Components.cv0 f48341b;
    public org.telegram.ui.Components.mz f48342c;
    public org.telegram.ui.Components.qj0 d;
    public m50 f48343e;
    public n50 f48344f;
    public v4.b0 h;
    public int f48345n;
    public TLRPC.TL_messages_stickerSet f48346r;
    public boolean f48347s;
    public TLRPC.ChatFull f48348w;
    public final long f48349x;
    public int f48350y;

    public o50(long j3) {
        super(null);
        this.f48345n = -1;
        this.f48349x = j3;
    }

    public static void Z(o50 o50Var, View view, int i7) {
        if (o50Var.getParentActivity() != null) {
            if (o50Var.M) {
                if (i7 > o50Var.f48344f.d.size()) {
                    boolean a10 = ((org.telegram.ui.Cells.g8) view).a();
                    n50 n50Var = o50Var.f48344f;
                    o50Var.i0((TLRPC.TL_messages_stickerSet) n50Var.f48096e.get((i7 - n50Var.d.size()) - 1), a10, false);
                    return;
                } else if (i7 != o50Var.f48344f.d.size()) {
                    o50Var.i0((TLRPC.TL_messages_stickerSet) o50Var.f48344f.d.get(i7), ((org.telegram.ui.Cells.g8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i7 >= o50Var.E && i7 < o50Var.F) {
                o50Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.ui.b0(o50Var.currentAccount).s0(o50Var.h0()).get(i7 - o50Var.E), ((org.telegram.ui.Cells.g8) view).a(), false);
            }
            if (i7 == o50Var.J) {
                o50Var.i0(o50Var.f48346r, true, false);
            }
        }
    }

    public static void a0(o50 o50Var, TLRPC.TL_error tL_error) {
        boolean z9 = o50Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = o50Var.f48346r;
            if (tL_messages_stickerSet == null) {
                if (z9) {
                    o50Var.f48348w.emojiset = null;
                } else {
                    o50Var.f48348w.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z9) {
                    o50Var.f48348w.emojiset = stickerSet;
                } else {
                    o50Var.f48348w.stickerset = stickerSet;
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(o50Var.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = o50Var.f48346r;
                b02.M.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.f26983id);
            }
            o50Var.m0();
            if (z9) {
                TLRPC.ChatFull chatFull = o50Var.f48348w;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = o50Var.f48348w;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            org.telegram.messenger.yr.a0(o50Var.currentAccount).N1(o50Var.f48348w, false);
            org.telegram.messenger.qs.f(o50Var.currentAccount).k(org.telegram.messenger.qs.T, o50Var.f48348w, 0, Boolean.TRUE, Boolean.FALSE);
            org.telegram.messenger.qs.f(o50Var.currentAccount).k(org.telegram.messenger.qs.f25060q3, Long.valueOf(o50Var.f48348w.f26957id), Boolean.valueOf(z9));
            o50Var.finishFragment();
        } else if (o50Var.getParentActivity() != null) {
            Activity parentActivity = o50Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int c0(o50 o50Var) {
        return o50Var.currentAccount;
    }

    public static void f0(o50 o50Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7 = o50Var.f48345n;
        if (tL_messages_stickerSet == null) {
            if (o50Var.f48346r != null) {
                org.telegram.messenger.k5.o(null, 2131749378, org.telegram.ui.Components.hc.a0(o50Var), 2131623999, 36);
            }
            o50Var.f48346r = null;
            o50Var.f48347s = true;
        } else {
            o50Var.f48346r = tL_messages_stickerSet;
            o50Var.f48347s = false;
            org.telegram.messenger.k5.o(null, 2131749378, org.telegram.ui.Components.hc.a0(o50Var), 2131623999, 36);
        }
        o50Var.m0();
        o50Var.k0(o50Var.f48346r, false);
        if (i7 != -1) {
            if (!o50Var.M) {
                for (int i10 = 0; i10 < o50Var.d.getChildCount(); i10++) {
                    View childAt = o50Var.d.getChildAt(i10);
                    if (o50Var.d.T(childAt).b() == o50Var.E + i7) {
                        ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                        break;
                    }
                }
            }
            o50Var.f48343e.g(o50Var.E + i7);
        }
        if (o50Var.f48345n != -1) {
            if (!o50Var.M) {
                for (int i11 = 0; i11 < o50Var.d.getChildCount(); i11++) {
                    View childAt2 = o50Var.d.getChildAt(i11);
                    if (o50Var.d.T(childAt2).b() == o50Var.E + o50Var.f48345n) {
                        ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            o50Var.f48343e.g(o50Var.E + o50Var.f48345n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (this.N) {
            i7 = 2131749443;
        } else {
            i7 = 2131749397;
        }
        y4Var.setTitle(org.telegram.messenger.id.M0(i7, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 7));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.p().b(0, 2131232486);
        this.L = b10;
        b10.N();
        b10.B0 = new kg.v1(this, 12);
        this.L.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.f48343e = new m50(this, context);
        this.f48344f = new n50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.d = qj0Var;
        qj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(200L);
        kVar.f57083m = true;
        this.d.setItemAnimator(kVar);
        v4.b0 b0Var = new v4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f48340a = frameLayout2;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, frameLayout2, null);
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, getResourceProvider());
        this.f48342c = mzVar;
        mzVar.setViewType(19);
        this.f48342c.setIsSingleCell(true);
        this.f48342c.setItemsCount((int) Math.ceil(org.telegram.messenger.g0.f22563q.y / org.telegram.messenger.g0.N(58.0f)));
        this.f48340a.addView(this.f48342c, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, this.f48342c, 1, null);
        this.f48341b = cv0Var;
        h6.m.g(cv0Var);
        this.f48340a.addView(this.f48341b);
        this.f48340a.setVisibility(8);
        this.d.setEmptyView(this.f48340a);
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f48340a);
        this.d.setAdapter(this.f48343e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new g3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25104x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
            }
        } else if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f26957id == this.f48349x) {
                if (this.f48348w == null && g0(chatFull) != null) {
                    this.f48346r = org.telegram.messenger.ui.b0(this.currentAccount).Y(g0(chatFull));
                }
                this.f48348w = chatFull;
                l0(true);
            }
        } else if (i7 == org.telegram.messenger.qs.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (g0(this.f48348w) != null && g0(this.f48348w).f26983id == longValue) {
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
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
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
        org.telegram.ui.Components.zv0 zv0Var = new org.telegram.ui.Components.zv0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        zv0Var.U1 = new i50(this, z9, tL_messages_stickerSet);
        zv0Var.Z0();
        org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
        zv0Var.show();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.f48348w = chatFull;
        if (g0(chatFull) != null) {
            this.f48346r = org.telegram.messenger.ui.b0(this.currentAccount).Y(g0(this.f48348w));
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
            this.f48346r = tL_messages_stickerSet;
            l0(false);
            if (z10) {
                this.f48343e.i(this.J);
            } else {
                this.f48343e.g(this.J);
            }
            if (z9) {
                this.f48343e.g(this.I);
            }
            l50 l50Var = this.O;
            l50Var.f47466b = true;
            l50Var.invalidate();
            return;
        }
        int i7 = this.J;
        if (i7 <= 0) {
            z11 = false;
        }
        this.f48346r = null;
        if (z11) {
            this.f48343e.s(i7);
            if (z9) {
                this.f48343e.g(this.I);
            }
        }
        l0(false);
        l50 l50Var2 = this.O;
        l50Var2.f47466b = false;
        l50Var2.invalidate();
    }

    public final void l0(boolean z9) {
        m50 m50Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f48346r != null) {
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
        this.f48350y = i12;
        m0();
        if (z9 && (m50Var = this.f48343e) != null) {
            m50Var.f();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o50.m0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ui.b0(this.currentAccount).B(h0());
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25104x0);
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
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25104x0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.B0);
        if ((this.f48346r != null || this.f48347s) && (chatFull = this.f48348w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.f48346r) == null || tL_messages_stickerSet.set.f26983id != g0(this.f48348w).f26983id) {
                if (g0(this.f48348w) != null || this.f48346r != null) {
                    boolean z9 = this.N;
                    long j3 = this.f48349x;
                    if (z9) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
                        if (this.f48347s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f48346r.set;
                            tL_inputStickerSetID.f26976id = stickerSet.f26983id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
                        if (this.f48347s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(this.currentAccount).f24784f7.edit();
                            edit.remove("group_hide_stickers_" + this.f48348w.f26957id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f48346r.set;
                            tL_inputStickerSetID2.f26976id = stickerSet2.f26983id;
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

    public o50(long j3, int i7) {
        super(null);
        this.f48345n = -1;
        this.f48349x = j3;
        this.N = true;
    }
}

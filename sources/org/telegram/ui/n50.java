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
public final class n50 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.ActionBar.h5 M;
    public boolean N;
    public final boolean O;
    public k50 P;
    public FrameLayout f50057a;
    public org.telegram.ui.Components.kv0 f50058b;
    public org.telegram.ui.Components.wz f50059c;
    public org.telegram.ui.Components.ck0 d;
    public l50 f50060e;
    public m50 f50061f;
    public v4.c0 h;
    public int f50062n;
    public TLRPC.TL_messages_stickerSet f50063r;
    public boolean f50064s;
    public TLRPC.ChatFull f50065w;
    public final long f50066x;
    public int f50067y;

    public n50(long j3) {
        super(null);
        this.f50062n = -1;
        this.f50066x = j3;
    }

    public static void Z(n50 n50Var, View view, int i7) {
        if (n50Var.getParentActivity() != null) {
            if (n50Var.N) {
                if (i7 > n50Var.f50061f.d.size()) {
                    boolean a10 = ((org.telegram.ui.Cells.h8) view).a();
                    m50 m50Var = n50Var.f50061f;
                    n50Var.i0((TLRPC.TL_messages_stickerSet) m50Var.f49715e.get((i7 - m50Var.d.size()) - 1), a10, false);
                    return;
                } else if (i7 != n50Var.f50061f.d.size()) {
                    n50Var.i0((TLRPC.TL_messages_stickerSet) n50Var.f50061f.d.get(i7), ((org.telegram.ui.Cells.h8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i7 >= n50Var.F && i7 < n50Var.G) {
                n50Var.i0((TLRPC.TL_messages_stickerSet) org.telegram.messenger.ri.d0(n50Var.currentAccount).u0(n50Var.h0()).get(i7 - n50Var.F), ((org.telegram.ui.Cells.h8) view).a(), false);
            }
            if (i7 == n50Var.K) {
                n50Var.i0(n50Var.f50063r, true, false);
            }
        }
    }

    public static void a0(n50 n50Var, TLRPC.TL_error tL_error) {
        boolean z10 = n50Var.O;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = n50Var.f50063r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    n50Var.f50065w.emojiset = null;
                } else {
                    n50Var.f50065w.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    n50Var.f50065w.emojiset = stickerSet;
                } else {
                    n50Var.f50065w.stickerset = stickerSet;
                }
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(n50Var.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = n50Var.f50063r;
                d02.N.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.f28430id);
            }
            n50Var.m0();
            if (z10) {
                TLRPC.ChatFull chatFull = n50Var.f50065w;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = n50Var.f50065w;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            org.telegram.messenger.tr.a0(n50Var.currentAccount).N1(n50Var.f50065w, false);
            org.telegram.messenger.ks.f(n50Var.currentAccount).k(org.telegram.messenger.ks.T, n50Var.f50065w, 0, Boolean.TRUE, Boolean.FALSE);
            org.telegram.messenger.ks.f(n50Var.currentAccount).k(org.telegram.messenger.ks.f25188s3, Long.valueOf(n50Var.f50065w.f28404id), Boolean.valueOf(z10));
            n50Var.finishFragment();
        } else if (n50Var.getParentActivity() != null) {
            Activity parentActivity = n50Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static org.telegram.ui.ActionBar.a5 b0(n50 n50Var) {
        return n50Var.simpleActionBar;
    }

    public static int c0(n50 n50Var) {
        return n50Var.currentAccount;
    }

    public static int d0(n50 n50Var) {
        return n50Var.currentAccount;
    }

    public static int e0(n50 n50Var) {
        return n50Var.currentAccount;
    }

    public static void f0(n50 n50Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i7 = n50Var.f50062n;
        if (tL_messages_stickerSet == null) {
            if (n50Var.f50063r != null) {
                org.telegram.messenger.f3.n(null, 2131749186, org.telegram.ui.Components.lc.b0(n50Var), 2131624000, 36);
            }
            n50Var.f50063r = null;
            n50Var.f50064s = true;
        } else {
            n50Var.f50063r = tL_messages_stickerSet;
            n50Var.f50064s = false;
            org.telegram.messenger.f3.n(null, 2131749186, org.telegram.ui.Components.lc.b0(n50Var), 2131624000, 36);
        }
        n50Var.m0();
        n50Var.k0(n50Var.f50063r, false);
        if (i7 != -1) {
            if (!n50Var.N) {
                for (int i10 = 0; i10 < n50Var.d.getChildCount(); i10++) {
                    View childAt = n50Var.d.getChildAt(i10);
                    if (n50Var.d.T(childAt).b() == n50Var.F + i7) {
                        ((org.telegram.ui.Cells.h8) childAt).b(false, true);
                        break;
                    }
                }
            }
            n50Var.f50060e.g(n50Var.F + i7);
        }
        if (n50Var.f50062n != -1) {
            if (!n50Var.N) {
                for (int i11 = 0; i11 < n50Var.d.getChildCount(); i11++) {
                    View childAt2 = n50Var.d.getChildAt(i11);
                    if (n50Var.d.T(childAt2).b() == n50Var.F + n50Var.f50062n) {
                        ((org.telegram.ui.Cells.h8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            n50Var.f50060e.g(n50Var.F + n50Var.f50062n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (this.O) {
            i7 = 2131749251;
        } else {
            i7 = 2131749205;
        }
        a5Var.setTitle(org.telegram.messenger.gd.M0(i7, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 10));
        org.telegram.ui.ActionBar.h5 b10 = this.simpleActionBar.t().b(0, 2131232488);
        this.M = b10;
        b10.O();
        b10.C0 = new bi.s1(this, 13);
        this.M.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        this.f50060e = new l50(this, context);
        this.f50061f = new m50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.d = ck0Var;
        ck0Var.r1();
        this.d.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(200L);
        kVar.f59152m = true;
        this.d.setItemAnimator(kVar);
        v4.c0 c0Var = new v4.c0();
        this.h = c0Var;
        c0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f50057a = frameLayout2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, frameLayout2, null);
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, getResourceProvider());
        this.f50059c = wzVar;
        wzVar.setViewType(19);
        this.f50059c.setIsSingleCell(true);
        this.f50059c.setItemsCount((int) Math.ceil(org.telegram.messenger.g0.f24118q.y / org.telegram.messenger.g0.N(58.0f)));
        this.f50057a.addView(this.f50059c, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.kv0 kv0Var = new org.telegram.ui.Components.kv0(context, this.f50059c, 1, null);
        this.f50058b = kv0Var;
        h6.m.i(kv0Var);
        this.f50057a.addView(this.f50058b);
        this.f50057a.setVisibility(8);
        this.d.setEmptyView(this.f50057a);
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.f50057a);
        this.d.setAdapter(this.f50060e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new g3(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25218x0) {
            if (((Integer) objArr[0]).intValue() == h0()) {
                l0(true);
            }
        } else if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28404id == this.f50066x) {
                if (this.f50065w == null && g0(chatFull) != null) {
                    this.f50063r = org.telegram.messenger.ri.d0(this.currentAccount).a0(g0(chatFull));
                }
                this.f50065w = chatFull;
                l0(true);
            }
        } else if (i7 == org.telegram.messenger.ks.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (g0(this.f50065w) != null && g0(this.f50065w).f28430id == longValue) {
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
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
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
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        iw0Var.Y1 = new i50(this, z10, tL_messages_stickerSet);
        iw0Var.a1();
        org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
        iw0Var.show();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.f50065w = chatFull;
        if (g0(chatFull) != null) {
            this.f50063r = org.telegram.messenger.ri.d0(this.currentAccount).a0(g0(this.f50065w));
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
            this.f50063r = tL_messages_stickerSet;
            l0(false);
            if (z11) {
                this.f50060e.i(this.K);
            } else {
                this.f50060e.g(this.K);
            }
            if (z10) {
                this.f50060e.g(this.J);
            }
            k50 k50Var = this.P;
            k50Var.f49156b = true;
            k50Var.invalidate();
            return;
        }
        int i7 = this.K;
        if (i7 <= 0) {
            z12 = false;
        }
        this.f50063r = null;
        if (z12) {
            this.f50060e.s(i7);
            if (z10) {
                this.f50060e.g(this.J);
            }
        }
        l0(false);
        k50 k50Var2 = this.P;
        k50Var2.f49156b = false;
        k50Var2.invalidate();
    }

    public final void l0(boolean z10) {
        l50 l50Var;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.H = 0;
        if (this.O) {
            this.I = 0;
            this.H = 2;
            this.J = 1;
            if (this.f50063r != null) {
                this.H = 3;
                this.K = 2;
            }
            int i7 = this.H;
            this.H = i7 + 1;
            this.L = i7;
        }
        ArrayList u02 = org.telegram.messenger.ri.d0(this.currentAccount).u0(h0());
        if (!u02.isEmpty()) {
            int i10 = this.H;
            int i11 = i10 + 1;
            this.H = i11;
            this.E = i10;
            this.F = i11;
            this.G = u02.size() + i11;
            this.H = u02.size() + this.H;
        } else {
            this.E = -1;
            this.F = -1;
            this.G = -1;
        }
        int i12 = this.H;
        this.H = i12 + 1;
        this.f50067y = i12;
        m0();
        if (z10 && (l50Var = this.f50060e) != null) {
            l50Var.f();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n50.m0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ri.d0(this.currentAccount).D(h0());
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25218x0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.B0);
        l0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25218x0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.B0);
        if ((this.f50063r != null || this.f50064s) && (chatFull = this.f50065w) != null) {
            if (g0(chatFull) == null || (tL_messages_stickerSet = this.f50063r) == null || tL_messages_stickerSet.set.f28430id != g0(this.f50065w).f28430id) {
                if (g0(this.f50065w) != null || this.f50063r != null) {
                    boolean z10 = this.O;
                    long j3 = this.f50066x;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(j3);
                        if (this.f50064s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f50063r.set;
                            tL_inputStickerSetID.f28423id = stickerSet.f28430id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(j3);
                        if (this.f50064s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(this.currentAccount).i7.edit();
                            edit.remove("group_hide_stickers_" + this.f50065w.f28404id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f50063r.set;
                            tL_inputStickerSetID2.f28423id = stickerSet2.f28430id;
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

    public n50(long j3, int i7) {
        super(null);
        this.f50062n = -1;
        this.f50066x = j3;
        this.O = true;
    }
}

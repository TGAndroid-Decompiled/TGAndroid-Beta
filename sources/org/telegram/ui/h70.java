package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h70 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.y5 L;
    public boolean M;
    public final boolean N;
    public e70 O;
    public FrameLayout f39803a;
    public org.telegram.ui.Components.fy0 f39804b;
    public org.telegram.ui.Components.c10 f39805c;
    public org.telegram.ui.Components.nm0 d;
    public f70 e;
    public g70 f39806f;
    public s4.c0 h;
    public int f39807n;
    public TLRPC.TL_messages_stickerSet f39808r;
    public boolean f39809s;
    public TLRPC.ChatFull v;
    public final long f39810w;
    public int f39811x;
    public int f39812y;

    public h70(long j10) {
        super(null);
        this.f39807n = -1;
        this.f39810w = j10;
    }

    public static void V(h70 h70Var, View view, int i10) {
        if (h70Var.getParentActivity() != null) {
            if (h70Var.M) {
                if (i10 > h70Var.f39806f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.p8) view).a();
                    g70 g70Var = h70Var.f39806f;
                    h70Var.e0((TLRPC.TL_messages_stickerSet) g70Var.e.get((i10 - g70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != h70Var.f39806f.d.size()) {
                    h70Var.e0((TLRPC.TL_messages_stickerSet) h70Var.f39806f.d.get(i10), ((org.telegram.ui.Cells.p8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= h70Var.E && i10 < h70Var.F) {
                h70Var.e0(MediaDataController.getInstance(h70Var.currentAccount).getStickerSets(h70Var.d0()).get(i10 - h70Var.E), ((org.telegram.ui.Cells.p8) view).a(), false);
            }
            if (i10 == h70Var.J) {
                h70Var.e0(h70Var.f39808r, true, false);
            }
        }
    }

    public static void W(h70 h70Var, TLRPC.TL_error tL_error) {
        boolean z10 = h70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = h70Var.f39808r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    h70Var.v.emojiset = null;
                } else {
                    h70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    h70Var.v.emojiset = stickerSet;
                } else {
                    h70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(h70Var.currentAccount).putGroupStickerSet(h70Var.f39808r);
            }
            h70Var.i0();
            if (z10) {
                TLRPC.ChatFull chatFull = h70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = h70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(h70Var.currentAccount).updateChatInfo(h70Var.v, false);
            NotificationCenter.getInstance(h70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, h70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(h70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(h70Var.v.f22029id), Boolean.valueOf(z10));
            h70Var.finishFragment();
        } else if (h70Var.getParentActivity() != null) {
            Activity parentActivity = h70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            d3.p(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int Y(h70 h70Var) {
        return h70Var.currentAccount;
    }

    public static void b0(h70 h70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = h70Var.f39807n;
        if (tL_messages_stickerSet == null) {
            if (h70Var.f39808r != null) {
                org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(h70Var), R.raw.done, 36);
            }
            h70Var.f39808r = null;
            h70Var.f39809s = true;
        } else {
            h70Var.f39808r = tL_messages_stickerSet;
            h70Var.f39809s = false;
            org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(h70Var), R.raw.done, 36);
        }
        h70Var.i0();
        h70Var.g0(h70Var.f39808r, false);
        if (i10 != -1) {
            if (!h70Var.M) {
                for (int i11 = 0; i11 < h70Var.d.getChildCount(); i11++) {
                    View childAt = h70Var.d.getChildAt(i11);
                    if (h70Var.d.T(childAt).b() == h70Var.E + i10) {
                        ((org.telegram.ui.Cells.p8) childAt).b(false, true);
                        break;
                    }
                }
            }
            h70Var.e.m(h70Var.E + i10);
        }
        if (h70Var.f39807n != -1) {
            if (!h70Var.M) {
                for (int i12 = 0; i12 < h70Var.d.getChildCount(); i12++) {
                    View childAt2 = h70Var.d.getChildAt(i12);
                    if (h70Var.d.T(childAt2).b() == h70Var.E + h70Var.f39807n) {
                        ((org.telegram.ui.Cells.p8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            h70Var.e.m(h70Var.E + h70Var.f39807n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    public final TLRPC.StickerSet c0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.N) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (this.N) {
            i10 = R.string.GroupEmojiPack;
        } else {
            i10 = R.string.GroupStickers;
        }
        r5Var.setTitle(LocaleController.getString(i10));
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 4));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.N();
        a2.f23292z0 = new jg.e2(this, 11);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new f70(this, context);
        this.f39806f = new g70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.d = nm0Var;
        nm0Var.u1();
        this.d.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.n(200L);
        lVar.f47798m = true;
        this.d.setItemAnimator(lVar);
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        c0Var.k1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39803a = frameLayout2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, frameLayout2, null);
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, getResourceProvider());
        this.f39805c = c10Var;
        c10Var.setViewType(19);
        this.f39805c.setIsSingleCell(true);
        this.f39805c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f39803a.addView(this.f39805c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, this.f39805c, 1, null);
        this.f39804b = fy0Var;
        k6.c.h(fy0Var);
        this.f39803a.addView(this.f39804b);
        this.f39803a.setVisibility(8);
        this.d.setEmptyView(this.f39803a);
        frameLayout.addView(this.d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.f39803a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new i3(this, 16));
        return this.fragmentView;
    }

    public final int d0() {
        if (this.N) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == d0()) {
                h0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22029id == this.f39810w) {
                if (this.v == null && c0(chatFull) != null) {
                    this.f39808r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(c0(chatFull));
                }
                this.v = chatFull;
                h0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (c0(this.v) != null && c0(this.v).f22055id == longValue) {
                h0(true);
            }
        }
    }

    public final void e0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
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
        org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        dz0Var.f27583d0 = new c70(this, z10, tL_messages_stickerSet);
        dz0Var.D0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        dz0Var.show();
    }

    public final void f0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (c0(chatFull) != null) {
            this.f39808r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(c0(this.v));
        }
    }

    public final void g0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
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
            this.f39808r = tL_messages_stickerSet;
            h0(false);
            if (z11) {
                this.e.o(this.J);
            } else {
                this.e.m(this.J);
            }
            if (z10) {
                this.e.m(this.I);
            }
            e70 e70Var = this.O;
            e70Var.f38770b = true;
            e70Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f39808r = null;
        if (z12) {
            this.e.u(i10);
            if (z10) {
                this.e.m(this.I);
            }
        }
        h0(false);
        e70 e70Var2 = this.O;
        e70Var2.f38770b = false;
        e70Var2.invalidate();
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(boolean z10) {
        f70 f70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f39808r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(d0());
        if (!stickerSets.isEmpty()) {
            int i11 = this.G;
            int i12 = i11 + 1;
            this.G = i12;
            this.f39812y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f39812y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f39811x = i13;
        i0();
        if (z10 && (f70Var = this.e) != null) {
            f70Var.l();
        }
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h70.i0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(d0());
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.groupStickersDidLoad);
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.f39808r != null || this.f39809s) && (chatFull = this.v) != null) {
            if (c0(chatFull) == null || (tL_messages_stickerSet = this.f39808r) == null || tL_messages_stickerSet.set.f22055id != c0(this.v).f22055id) {
                if (c0(this.v) != null || this.f39808r != null) {
                    boolean z10 = this.N;
                    long j10 = this.f39810w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f39809s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f39808r.set;
                            tL_inputStickerSetID.f22048id = stickerSet.f22055id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f39809s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f22029id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f39808r.set;
                            tL_inputStickerSetID2.f22048id = stickerSet2.f22055id;
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

    public h70(long j10, int i10) {
        super(null);
        this.f39807n = -1;
        this.f39810w = j10;
        this.N = true;
    }
}

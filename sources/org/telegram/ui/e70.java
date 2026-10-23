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
public final class e70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.u0 L;
    public boolean M;
    public final boolean N;
    public b70 O;
    public FrameLayout f36834a;
    public org.telegram.ui.Components.wx0 f36835b;
    public org.telegram.ui.Components.b10 f36836c;
    public org.telegram.ui.Components.mm0 d;
    public c70 e;
    public d70 f36837f;
    public s4.b0 h;
    public int f36838n;
    public TLRPC.TL_messages_stickerSet f36839r;
    public boolean f36840s;
    public TLRPC.ChatFull v;
    public final long f36841w;
    public int f36842x;
    public int f36843y;

    public e70(long j10) {
        super(null);
        this.f36838n = -1;
        this.f36841w = j10;
    }

    public static void U(e70 e70Var, View view, int i10) {
        if (e70Var.getParentActivity() != null) {
            if (e70Var.M) {
                if (i10 > e70Var.f36837f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.l8) view).a();
                    d70 d70Var = e70Var.f36837f;
                    e70Var.d0((TLRPC.TL_messages_stickerSet) d70Var.e.get((i10 - d70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != e70Var.f36837f.d.size()) {
                    e70Var.d0((TLRPC.TL_messages_stickerSet) e70Var.f36837f.d.get(i10), ((org.telegram.ui.Cells.l8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= e70Var.E && i10 < e70Var.F) {
                e70Var.d0(MediaDataController.getInstance(e70Var.currentAccount).getStickerSets(e70Var.c0()).get(i10 - e70Var.E), ((org.telegram.ui.Cells.l8) view).a(), false);
            }
            if (i10 == e70Var.J) {
                e70Var.d0(e70Var.f36839r, true, false);
            }
        }
    }

    public static void V(e70 e70Var, TLRPC.TL_error tL_error) {
        boolean z10 = e70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = e70Var.f36839r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    e70Var.v.emojiset = null;
                } else {
                    e70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    e70Var.v.emojiset = stickerSet;
                } else {
                    e70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(e70Var.currentAccount).putGroupStickerSet(e70Var.f36839r);
            }
            e70Var.h0();
            if (z10) {
                TLRPC.ChatFull chatFull = e70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = e70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(e70Var.currentAccount).updateChatInfo(e70Var.v, false);
            NotificationCenter.getInstance(e70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, e70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(e70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(e70Var.v.f20344id), Boolean.valueOf(z10));
            e70Var.finishFragment();
        } else if (e70Var.getParentActivity() != null) {
            Activity parentActivity = e70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int X(e70 e70Var) {
        return e70Var.currentAccount;
    }

    public static void a0(e70 e70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = e70Var.f36838n;
        if (tL_messages_stickerSet == null) {
            if (e70Var.f36839r != null) {
                org.telegram.messenger.v0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(e70Var), R.raw.done, 36);
            }
            e70Var.f36839r = null;
            e70Var.f36840s = true;
        } else {
            e70Var.f36839r = tL_messages_stickerSet;
            e70Var.f36840s = false;
            org.telegram.messenger.v0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(e70Var), R.raw.done, 36);
        }
        e70Var.h0();
        e70Var.f0(e70Var.f36839r, false);
        if (i10 != -1) {
            if (!e70Var.M) {
                for (int i11 = 0; i11 < e70Var.d.getChildCount(); i11++) {
                    View childAt = e70Var.d.getChildAt(i11);
                    if (e70Var.d.T(childAt).b() == e70Var.E + i10) {
                        ((org.telegram.ui.Cells.l8) childAt).b(false, true);
                        break;
                    }
                }
            }
            e70Var.e.m(e70Var.E + i10);
        }
        if (e70Var.f36838n != -1) {
            if (!e70Var.M) {
                for (int i12 = 0; i12 < e70Var.d.getChildCount(); i12++) {
                    View childAt2 = e70Var.d.getChildAt(i12);
                    if (e70Var.d.T(childAt2).b() == e70Var.E + e70Var.f36838n) {
                        ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            e70Var.e.m(e70Var.E + e70Var.f36838n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21145b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.N) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    public final int c0() {
        if (this.N) {
            return 5;
        }
        return 0;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (this.N) {
            i10 = R.string.GroupEmojiPack;
        } else {
            i10 = R.string.GroupStickers;
        }
        kVar.setTitle(LocaleController.getString(i10));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 2));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.F();
        a2.H = new ig.b2(this, 10);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new c70(this, context);
        this.f36837f = new d70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        this.d = new org.telegram.ui.Components.mm0(context, null);
        s4.k kVar2 = new s4.k();
        kVar2.n(200L);
        kVar2.f46377m = true;
        this.d.setItemAnimator(kVar2);
        s4.b0 b0Var = new s4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36834a = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, frameLayout2, null);
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, getResourceProvider());
        this.f36836c = b10Var;
        b10Var.setViewType(19);
        this.f36836c.setIsSingleCell(true);
        this.f36836c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f36834a.addView(this.f36836c, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, this.f36836c, 1, null);
        this.f36835b = wx0Var;
        m.g3.p(wx0Var);
        this.f36834a.addView(this.f36835b);
        frameLayout.addView(this.f36834a);
        this.f36834a.setVisibility(8);
        this.d.setEmptyView(this.f36834a);
        frameLayout.addView(this.d, w7.z5.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new h(this, 14));
        this.d.setOnScrollListener(new j3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
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
        org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        ty0Var.f30932d0 = new z60(this, z10, tL_messages_stickerSet);
        ty0Var.D0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        ty0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20344id == this.f36841w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f36839r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f20370id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f36839r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
        }
    }

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
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
            this.f36839r = tL_messages_stickerSet;
            g0(false);
            if (z11) {
                this.e.o(this.J);
            } else {
                this.e.m(this.J);
            }
            if (z10) {
                this.e.m(this.I);
            }
            b70 b70Var = this.O;
            b70Var.f35953b = true;
            b70Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f36839r = null;
        if (z12) {
            this.e.u(i10);
            if (z10) {
                this.e.m(this.I);
            }
        }
        g0(false);
        b70 b70Var2 = this.O;
        b70Var2.f35953b = false;
        b70Var2.invalidate();
    }

    public final void g0(boolean z10) {
        c70 c70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f36839r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (!stickerSets.isEmpty()) {
            int i11 = this.G;
            int i12 = i11 + 1;
            this.G = i12;
            this.f36843y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f36843y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f36842x = i13;
        h0();
        if (z10 && (c70Var = this.e) != null) {
            c70Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e70.h0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(c0());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        g0(true);
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
        if ((this.f36839r != null || this.f36840s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f36839r) == null || tL_messages_stickerSet.set.f20370id != b0(this.v).f20370id) {
                if (b0(this.v) != null || this.f36839r != null) {
                    boolean z10 = this.N;
                    long j10 = this.f36841w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f36840s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f36839r.set;
                            tL_inputStickerSetID.f20363id = stickerSet.f20370id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f36840s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f20344id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f36839r.set;
                            tL_inputStickerSetID2.f20363id = stickerSet2.f20370id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new l(this, 10));
                }
            }
        }
    }

    public e70(long j10, int i10) {
        super(null);
        this.f36838n = -1;
        this.f36841w = j10;
        this.N = true;
    }
}

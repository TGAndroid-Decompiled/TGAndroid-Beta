package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public x60 O;
    public FrameLayout f35282a;
    public org.telegram.ui.Components.sx0 f35283b;
    public org.telegram.ui.Components.b10 f35284c;
    public org.telegram.ui.Components.im0 d;
    public y60 e;
    public z60 f35285f;
    public s4.b0 h;
    public int f35286n;
    public TLRPC.TL_messages_stickerSet f35287r;
    public boolean f35288s;
    public TLRPC.ChatFull v;
    public final long f35289w;
    public int f35290x;
    public int f35291y;

    public a70(long j10) {
        super(null);
        this.f35286n = -1;
        this.f35289w = j10;
    }

    public static void U(a70 a70Var, View view, int i10) {
        if (a70Var.getParentActivity() != null) {
            if (a70Var.M) {
                if (i10 > a70Var.f35285f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.l8) view).a();
                    z60 z60Var = a70Var.f35285f;
                    a70Var.d0((TLRPC.TL_messages_stickerSet) z60Var.e.get((i10 - z60Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != a70Var.f35285f.d.size()) {
                    a70Var.d0((TLRPC.TL_messages_stickerSet) a70Var.f35285f.d.get(i10), ((org.telegram.ui.Cells.l8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= a70Var.E && i10 < a70Var.F) {
                a70Var.d0(MediaDataController.getInstance(a70Var.currentAccount).getStickerSets(a70Var.c0()).get(i10 - a70Var.E), ((org.telegram.ui.Cells.l8) view).a(), false);
            }
            if (i10 == a70Var.J) {
                a70Var.d0(a70Var.f35287r, true, false);
            }
        }
    }

    public static void V(a70 a70Var, TLRPC.TL_error tL_error) {
        boolean z10 = a70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = a70Var.f35287r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    a70Var.v.emojiset = null;
                } else {
                    a70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    a70Var.v.emojiset = stickerSet;
                } else {
                    a70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(a70Var.currentAccount).putGroupStickerSet(a70Var.f35287r);
            }
            a70Var.h0();
            if (z10) {
                TLRPC.ChatFull chatFull = a70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = a70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(a70Var.currentAccount).updateChatInfo(a70Var.v, false);
            NotificationCenter.getInstance(a70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, a70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(a70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(a70Var.v.f20276id), Boolean.valueOf(z10));
            a70Var.finishFragment();
        } else if (a70Var.getParentActivity() != null) {
            Activity parentActivity = a70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int X(a70 a70Var) {
        return a70Var.currentAccount;
    }

    public static void a0(a70 a70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = a70Var.f35286n;
        if (tL_messages_stickerSet == null) {
            if (a70Var.f35287r != null) {
                org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(a70Var), R.raw.done, 36);
            }
            a70Var.f35287r = null;
            a70Var.f35288s = true;
        } else {
            a70Var.f35287r = tL_messages_stickerSet;
            a70Var.f35288s = false;
            org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(a70Var), R.raw.done, 36);
        }
        a70Var.h0();
        a70Var.f0(a70Var.f35287r, false);
        if (i10 != -1) {
            if (!a70Var.M) {
                for (int i11 = 0; i11 < a70Var.d.getChildCount(); i11++) {
                    View childAt = a70Var.d.getChildAt(i11);
                    if (a70Var.d.T(childAt).b() == a70Var.E + i10) {
                        ((org.telegram.ui.Cells.l8) childAt).b(false, true);
                        break;
                    }
                }
            }
            a70Var.e.m(a70Var.E + i10);
        }
        if (a70Var.f35286n != -1) {
            if (!a70Var.M) {
                for (int i12 = 0; i12 < a70Var.d.getChildCount(); i12++) {
                    View childAt2 = a70Var.d.getChildAt(i12);
                    if (a70Var.d.T(childAt2).b() == a70Var.E + a70Var.f35286n) {
                        ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            a70Var.e.m(a70Var.E + a70Var.f35286n);
        }
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
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 2));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.F();
        a2.H = new ig.c2(this, 10);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new y60(this, context);
        this.f35285f = new z60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20931a7, false));
        this.d = new org.telegram.ui.Components.im0(context, null);
        s4.k kVar2 = new s4.k();
        kVar2.n(200L);
        kVar2.f45944m = true;
        this.d.setItemAnimator(kVar2);
        s4.b0 b0Var = new s4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f35282a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, getResourceProvider());
        this.f35284c = b10Var;
        b10Var.setViewType(19);
        this.f35284c.setIsSingleCell(true);
        this.f35284c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f35282a.addView(this.f35284c, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.sx0 sx0Var = new org.telegram.ui.Components.sx0(context, this.f35284c, 1, null);
        this.f35283b = sx0Var;
        m.g3.p(sx0Var);
        this.f35282a.addView(this.f35283b);
        frameLayout.addView(this.f35282a);
        this.f35282a.setVisibility(8);
        this.d.setEmptyView(this.f35282a);
        frameLayout.addView(this.d, w7.z5.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new i(this, 14));
        this.d.setOnScrollListener(new k3(this, 15));
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
        org.telegram.ui.Components.py0 py0Var = new org.telegram.ui.Components.py0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        py0Var.f29422d0 = new v60(this, z10, tL_messages_stickerSet);
        py0Var.C0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        py0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20276id == this.f35289w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f35287r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f20302id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f35287r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
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
            this.f35287r = tL_messages_stickerSet;
            g0(false);
            if (z11) {
                this.e.o(this.J);
            } else {
                this.e.m(this.J);
            }
            if (z10) {
                this.e.m(this.I);
            }
            x60 x60Var = this.O;
            x60Var.f43104b = true;
            x60Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f35287r = null;
        if (z12) {
            this.e.u(i10);
            if (z10) {
                this.e.m(this.I);
            }
        }
        g0(false);
        x60 x60Var2 = this.O;
        x60Var2.f43104b = false;
        x60Var2.invalidate();
    }

    public final void g0(boolean z10) {
        y60 y60Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f35287r != null) {
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
            this.f35291y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f35291y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f35290x = i13;
        h0();
        if (z10 && (y60Var = this.e) != null) {
            y60Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 16, new Class[]{org.telegram.ui.Cells.l8.class, org.telegram.ui.Cells.ba.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20989d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20931a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21268s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21324v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21287t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21078i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21110k0, null, null, org.telegram.ui.ActionBar.h6.f20990d7));
        int i11 = org.telegram.ui.ActionBar.h6.f20951b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 2, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21394z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 196608, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Uh));
        return arrayList;
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a70.h0():void");
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
        if ((this.f35287r != null || this.f35288s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f35287r) == null || tL_messages_stickerSet.set.f20302id != b0(this.v).f20302id) {
                if (b0(this.v) != null || this.f35287r != null) {
                    boolean z10 = this.N;
                    long j10 = this.f35289w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f35288s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f35287r.set;
                            tL_inputStickerSetID.f20295id = stickerSet.f20302id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f35288s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f20276id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f35287r.set;
                            tL_inputStickerSetID2.f20295id = stickerSet2.f20302id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new m(this, 9));
                }
            }
        }
    }

    public a70(long j10, int i10) {
        super(null);
        this.f35286n = -1;
        this.f35289w = j10;
        this.N = true;
    }
}

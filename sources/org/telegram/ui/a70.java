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
    public FrameLayout f35294a;
    public org.telegram.ui.Components.tx0 f35295b;
    public org.telegram.ui.Components.b10 f35296c;
    public org.telegram.ui.Components.jm0 d;
    public y60 e;
    public z60 f35297f;
    public s4.b0 h;
    public int f35298n;
    public TLRPC.TL_messages_stickerSet f35299r;
    public boolean f35300s;
    public TLRPC.ChatFull v;
    public final long f35301w;
    public int f35302x;
    public int f35303y;

    public a70(long j10) {
        super(null);
        this.f35298n = -1;
        this.f35301w = j10;
    }

    public static void U(a70 a70Var, View view, int i10) {
        if (a70Var.getParentActivity() != null) {
            if (a70Var.M) {
                if (i10 > a70Var.f35297f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.l8) view).a();
                    z60 z60Var = a70Var.f35297f;
                    a70Var.d0((TLRPC.TL_messages_stickerSet) z60Var.e.get((i10 - z60Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != a70Var.f35297f.d.size()) {
                    a70Var.d0((TLRPC.TL_messages_stickerSet) a70Var.f35297f.d.get(i10), ((org.telegram.ui.Cells.l8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= a70Var.E && i10 < a70Var.F) {
                a70Var.d0(MediaDataController.getInstance(a70Var.currentAccount).getStickerSets(a70Var.c0()).get(i10 - a70Var.E), ((org.telegram.ui.Cells.l8) view).a(), false);
            }
            if (i10 == a70Var.J) {
                a70Var.d0(a70Var.f35299r, true, false);
            }
        }
    }

    public static void V(a70 a70Var, TLRPC.TL_error tL_error) {
        boolean z10 = a70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = a70Var.f35299r;
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
                MediaDataController.getInstance(a70Var.currentAccount).putGroupStickerSet(a70Var.f35299r);
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
            NotificationCenter.getInstance(a70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(a70Var.v.f20280id), Boolean.valueOf(z10));
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
        int i10 = a70Var.f35298n;
        if (tL_messages_stickerSet == null) {
            if (a70Var.f35299r != null) {
                org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(a70Var), R.raw.done, 36);
            }
            a70Var.f35299r = null;
            a70Var.f35300s = true;
        } else {
            a70Var.f35299r = tL_messages_stickerSet;
            a70Var.f35300s = false;
            org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(a70Var), R.raw.done, 36);
        }
        a70Var.h0();
        a70Var.f0(a70Var.f35299r, false);
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
        if (a70Var.f35298n != -1) {
            if (!a70Var.M) {
                for (int i12 = 0; i12 < a70Var.d.getChildCount(); i12++) {
                    View childAt2 = a70Var.d.getChildAt(i12);
                    if (a70Var.d.T(childAt2).b() == a70Var.E + a70Var.f35298n) {
                        ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            a70Var.e.m(a70Var.E + a70Var.f35298n);
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
        this.f35297f = new z60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        this.d = new org.telegram.ui.Components.jm0(context, null);
        s4.k kVar2 = new s4.k();
        kVar2.n(200L);
        kVar2.f45954m = true;
        this.d.setItemAnimator(kVar2);
        s4.b0 b0Var = new s4.b0();
        this.h = b0Var;
        b0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f35294a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, getResourceProvider());
        this.f35296c = b10Var;
        b10Var.setViewType(19);
        this.f35296c.setIsSingleCell(true);
        this.f35296c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f35294a.addView(this.f35296c, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, this.f35296c, 1, null);
        this.f35295b = tx0Var;
        m.g3.p(tx0Var);
        this.f35294a.addView(this.f35295b);
        frameLayout.addView(this.f35294a);
        this.f35294a.setVisibility(8);
        this.d.setEmptyView(this.f35294a);
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
        org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        qy0Var.f29752d0 = new v60(this, z10, tL_messages_stickerSet);
        qy0Var.C0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        qy0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20280id == this.f35301w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f35299r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f20306id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f35299r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
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
            this.f35299r = tL_messages_stickerSet;
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
            x60Var.f43112b = true;
            x60Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f35299r = null;
        if (z12) {
            this.e.u(i10);
            if (z10) {
                this.e.m(this.I);
            }
        }
        g0(false);
        x60 x60Var2 = this.O;
        x60Var2.f43112b = false;
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
            if (this.f35299r != null) {
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
            this.f35303y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f35303y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f35302x = i13;
        h0();
        if (z10 && (y60Var = this.e) != null) {
            y60Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 16, new Class[]{org.telegram.ui.Cells.l8.class, org.telegram.ui.Cells.ba.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20993d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20935a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21272s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21082i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21114k0, null, null, org.telegram.ui.ActionBar.h6.f20994d7));
        int i11 = org.telegram.ui.ActionBar.h6.f20955b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 2, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21398z6));
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
        if ((this.f35299r != null || this.f35300s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f35299r) == null || tL_messages_stickerSet.set.f20306id != b0(this.v).f20306id) {
                if (b0(this.v) != null || this.f35299r != null) {
                    boolean z10 = this.N;
                    long j10 = this.f35301w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f35300s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f35299r.set;
                            tL_inputStickerSetID.f20299id = stickerSet.f20306id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f35300s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f20280id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f35299r.set;
                            tL_inputStickerSetID2.f20299id = stickerSet2.f20306id;
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
        this.f35298n = -1;
        this.f35301w = j10;
        this.N = true;
    }
}

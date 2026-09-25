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
public final class o70 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public l70 O;
    public FrameLayout f36067a;
    public org.telegram.ui.Components.ix0 f36068b;
    public org.telegram.ui.Components.u00 f36069c;
    public org.telegram.ui.Components.wl0 d;
    public m70 e;
    public n70 f36070f;
    public s4.c0 h;
    public int f36071n;
    public TLRPC.TL_messages_stickerSet f36072r;
    public boolean f36073s;
    public TLRPC.ChatFull v;
    public final long f36074w;
    public int f36075x;
    public int f36076y;

    public o70(long j3) {
        super(null);
        this.f36071n = -1;
        this.f36074w = j3;
    }

    public static void U(o70 o70Var, View view, int i10) {
        if (o70Var.getParentActivity() != null) {
            if (o70Var.M) {
                if (i10 > o70Var.f36070f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.m8) view).a();
                    n70 n70Var = o70Var.f36070f;
                    o70Var.d0((TLRPC.TL_messages_stickerSet) n70Var.e.get((i10 - n70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != o70Var.f36070f.d.size()) {
                    o70Var.d0((TLRPC.TL_messages_stickerSet) o70Var.f36070f.d.get(i10), ((org.telegram.ui.Cells.m8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= o70Var.E && i10 < o70Var.F) {
                o70Var.d0(MediaDataController.getInstance(o70Var.currentAccount).getStickerSets(o70Var.c0()).get(i10 - o70Var.E), ((org.telegram.ui.Cells.m8) view).a(), false);
            }
            if (i10 == o70Var.J) {
                o70Var.d0(o70Var.f36072r, true, false);
            }
        }
    }

    public static void V(o70 o70Var, TLRPC.TL_error tL_error) {
        boolean z10 = o70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = o70Var.f36072r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    o70Var.v.emojiset = null;
                } else {
                    o70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    o70Var.v.emojiset = stickerSet;
                } else {
                    o70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(o70Var.currentAccount).putGroupStickerSet(o70Var.f36072r);
            }
            o70Var.h0();
            if (z10) {
                TLRPC.ChatFull chatFull = o70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = o70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(o70Var.currentAccount).updateChatInfo(o70Var.v, false);
            NotificationCenter.getInstance(o70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, o70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(o70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(o70Var.v.f18337id), Boolean.valueOf(z10));
            o70Var.finishFragment();
        } else if (o70Var.getParentActivity() != null) {
            Activity parentActivity = o70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int X(o70 o70Var) {
        return o70Var.currentAccount;
    }

    public static void a0(o70 o70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = o70Var.f36071n;
        if (tL_messages_stickerSet == null) {
            if (o70Var.f36072r != null) {
                org.telegram.messenger.f0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(o70Var), R.raw.done, 36);
            }
            o70Var.f36072r = null;
            o70Var.f36073s = true;
        } else {
            o70Var.f36072r = tL_messages_stickerSet;
            o70Var.f36073s = false;
            org.telegram.messenger.f0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(o70Var), R.raw.done, 36);
        }
        o70Var.h0();
        o70Var.f0(o70Var.f36072r, false);
        if (i10 != -1) {
            if (!o70Var.M) {
                for (int i11 = 0; i11 < o70Var.d.getChildCount(); i11++) {
                    View childAt = o70Var.d.getChildAt(i11);
                    if (o70Var.d.T(childAt).b() == o70Var.E + i10) {
                        ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                        break;
                    }
                }
            }
            o70Var.e.m(o70Var.E + i10);
        }
        if (o70Var.f36071n != -1) {
            if (!o70Var.M) {
                for (int i12 = 0; i12 < o70Var.d.getChildCount(); i12++) {
                    View childAt2 = o70Var.d.getChildAt(i12);
                    if (o70Var.d.T(childAt2).b() == o70Var.E + o70Var.f36071n) {
                        ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            o70Var.e.m(o70Var.E + o70Var.f36071n);
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
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 29));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.F();
        a2.H = new hg.e2(this, 10);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new m70(this, context);
        this.f36070f = new n70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
        this.d = new org.telegram.ui.Components.wl0(context, null);
        s4.j jVar = new s4.j();
        jVar.n(200L);
        jVar.f42996m = true;
        this.d.setItemAnimator(jVar);
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        c0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36067a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, getResourceProvider());
        this.f36069c = u00Var;
        u00Var.setViewType(19);
        this.f36069c.setIsSingleCell(true);
        this.f36069c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f36067a.addView(this.f36069c, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.ix0 ix0Var = new org.telegram.ui.Components.ix0(context, this.f36069c, 1, null);
        this.f36068b = ix0Var;
        n7.z0.k(ix0Var);
        this.f36067a.addView(this.f36068b);
        frameLayout.addView(this.f36067a);
        this.f36067a.setVisibility(8);
        this.d.setEmptyView(this.f36067a);
        frameLayout.addView(this.d, w7.y5.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new i(this, 13));
        this.d.setOnScrollListener(new i3(this, 15));
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
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        fy0Var.f24291d0 = new j70(this, z10, tL_messages_stickerSet);
        fy0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        fy0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18337id == this.f36074w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f36072r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f18363id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f36072r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
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
            this.f36072r = tL_messages_stickerSet;
            g0(false);
            if (z11) {
                this.e.o(this.J);
            } else {
                this.e.m(this.J);
            }
            if (z10) {
                this.e.m(this.I);
            }
            l70 l70Var = this.O;
            l70Var.f35235b = true;
            l70Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f36072r = null;
        if (z12) {
            this.e.u(i10);
            if (z10) {
                this.e.m(this.I);
            }
        }
        g0(false);
        l70 l70Var2 = this.O;
        l70Var2.f35235b = false;
        l70Var2.invalidate();
    }

    public final void g0(boolean z10) {
        m70 m70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f36072r != null) {
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
            this.f36076y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f36076y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f36075x = i13;
        h0();
        if (z10 && (m70Var = this.e) != null) {
            m70Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 16, new Class[]{org.telegram.ui.Cells.m8.class, org.telegram.ui.Cells.ea.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19060d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19004a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19338s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19393v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19357t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19149i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19181k0, null, null, org.telegram.ui.ActionBar.h6.f19061d7));
        int i11 = org.telegram.ui.ActionBar.h6.f19024b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19462z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 196608, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Uh));
        return arrayList;
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o70.h0():void");
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
        if ((this.f36072r != null || this.f36073s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f36072r) == null || tL_messages_stickerSet.set.f18363id != b0(this.v).f18363id) {
                if (b0(this.v) != null || this.f36072r != null) {
                    boolean z10 = this.N;
                    long j3 = this.f36074w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
                        if (this.f36073s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f36072r.set;
                            tL_inputStickerSetID.f18356id = stickerSet.f18363id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
                        if (this.f36073s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f18337id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f36072r.set;
                            tL_inputStickerSetID2.f18356id = stickerSet2.f18363id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new m(this, 9));
                }
            }
        }
    }

    public o70(long j3, int i10) {
        super(null);
        this.f36071n = -1;
        this.f36074w = j3;
        this.N = true;
    }
}

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
public final class f70 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public c70 O;
    public FrameLayout f39288a;
    public org.telegram.ui.Components.ey0 f39289b;
    public org.telegram.ui.Components.c10 f39290c;
    public org.telegram.ui.Components.mm0 d;
    public d70 e;
    public e70 f39291f;
    public s4.c0 h;
    public int f39292n;
    public TLRPC.TL_messages_stickerSet f39293r;
    public boolean f39294s;
    public TLRPC.ChatFull v;
    public final long f39295w;
    public int f39296x;
    public int f39297y;

    public f70(long j10) {
        super(null);
        this.f39292n = -1;
        this.f39295w = j10;
    }

    public static void V(f70 f70Var, View view, int i10) {
        if (f70Var.getParentActivity() != null) {
            if (f70Var.M) {
                if (i10 > f70Var.f39291f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.p8) view).a();
                    e70 e70Var = f70Var.f39291f;
                    f70Var.e0((TLRPC.TL_messages_stickerSet) e70Var.e.get((i10 - e70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != f70Var.f39291f.d.size()) {
                    f70Var.e0((TLRPC.TL_messages_stickerSet) f70Var.f39291f.d.get(i10), ((org.telegram.ui.Cells.p8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= f70Var.E && i10 < f70Var.F) {
                f70Var.e0(MediaDataController.getInstance(f70Var.currentAccount).getStickerSets(f70Var.d0()).get(i10 - f70Var.E), ((org.telegram.ui.Cells.p8) view).a(), false);
            }
            if (i10 == f70Var.J) {
                f70Var.e0(f70Var.f39293r, true, false);
            }
        }
    }

    public static void W(f70 f70Var, TLRPC.TL_error tL_error) {
        boolean z10 = f70Var.N;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = f70Var.f39293r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    f70Var.v.emojiset = null;
                } else {
                    f70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    f70Var.v.emojiset = stickerSet;
                } else {
                    f70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(f70Var.currentAccount).putGroupStickerSet(f70Var.f39293r);
            }
            f70Var.i0();
            if (z10) {
                TLRPC.ChatFull chatFull = f70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = f70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(f70Var.currentAccount).updateChatInfo(f70Var.v, false);
            NotificationCenter.getInstance(f70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, f70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(f70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(f70Var.v.f22028id), Boolean.valueOf(z10));
            f70Var.finishFragment();
        } else if (f70Var.getParentActivity() != null) {
            Activity parentActivity = f70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            d3.p(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int Y(f70 f70Var) {
        return f70Var.currentAccount;
    }

    public static void b0(f70 f70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = f70Var.f39292n;
        if (tL_messages_stickerSet == null) {
            if (f70Var.f39293r != null) {
                org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(f70Var), R.raw.done, 36);
            }
            f70Var.f39293r = null;
            f70Var.f39294s = true;
        } else {
            f70Var.f39293r = tL_messages_stickerSet;
            f70Var.f39294s = false;
            org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(f70Var), R.raw.done, 36);
        }
        f70Var.i0();
        f70Var.g0(f70Var.f39293r, false);
        if (i10 != -1) {
            if (!f70Var.M) {
                for (int i11 = 0; i11 < f70Var.d.getChildCount(); i11++) {
                    View childAt = f70Var.d.getChildAt(i11);
                    if (f70Var.d.T(childAt).b() == f70Var.E + i10) {
                        ((org.telegram.ui.Cells.p8) childAt).b(false, true);
                        break;
                    }
                }
            }
            f70Var.e.m(f70Var.E + i10);
        }
        if (f70Var.f39292n != -1) {
            if (!f70Var.M) {
                for (int i12 = 0; i12 < f70Var.d.getChildCount(); i12++) {
                    View childAt2 = f70Var.d.getChildAt(i12);
                    if (f70Var.d.T(childAt2).b() == f70Var.E + f70Var.f39292n) {
                        ((org.telegram.ui.Cells.p8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            f70Var.e.m(f70Var.E + f70Var.f39292n);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23318b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 4));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.N();
        a2.f23291z0 = new jg.e2(this, 11);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new d70(this, context);
        this.f39291f = new e70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.d = mm0Var;
        mm0Var.u1();
        this.d.setSectionsDrawBackground(true);
        s4.l lVar = new s4.l();
        lVar.n(200L);
        lVar.f47763m = true;
        this.d.setItemAnimator(lVar);
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        c0Var.k1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39288a = frameLayout2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, frameLayout2, null);
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, getResourceProvider());
        this.f39290c = c10Var;
        c10Var.setViewType(19);
        this.f39290c.setIsSingleCell(true);
        this.f39290c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f39288a.addView(this.f39290c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(context, this.f39290c, 1, null);
        this.f39289b = ey0Var;
        k6.c.h(ey0Var);
        this.f39288a.addView(this.f39289b);
        this.f39288a.setVisibility(8);
        this.d.setEmptyView(this.f39288a);
        frameLayout.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.f39288a);
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
            if (chatFull.f22028id == this.f39295w) {
                if (this.v == null && c0(chatFull) != null) {
                    this.f39293r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(c0(chatFull));
                }
                this.v = chatFull;
                h0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (c0(this.v) != null && c0(this.v).f22054id == longValue) {
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
        org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        cz0Var.f27293d0 = new a70(this, z10, tL_messages_stickerSet);
        cz0Var.D0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        cz0Var.show();
    }

    public final void f0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (c0(chatFull) != null) {
            this.f39293r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(c0(this.v));
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
            this.f39293r = tL_messages_stickerSet;
            h0(false);
            if (z11) {
                this.e.o(this.J);
            } else {
                this.e.m(this.J);
            }
            if (z10) {
                this.e.m(this.I);
            }
            c70 c70Var = this.O;
            c70Var.f38364b = true;
            c70Var.invalidate();
            return;
        }
        int i10 = this.J;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f39293r = null;
        if (z12) {
            this.e.u(i10);
            if (z10) {
                this.e.m(this.I);
            }
        }
        h0(false);
        c70 c70Var2 = this.O;
        c70Var2.f38364b = false;
        c70Var2.invalidate();
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(boolean z10) {
        d70 d70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.f39293r != null) {
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
            this.f39297y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        } else {
            this.f39297y = -1;
            this.E = -1;
            this.F = -1;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.f39296x = i13;
        i0();
        if (z10 && (d70Var = this.e) != null) {
            d70Var.l();
        }
    }

    public final void i0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f70.i0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(d0());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
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
        if ((this.f39293r != null || this.f39294s) && (chatFull = this.v) != null) {
            if (c0(chatFull) == null || (tL_messages_stickerSet = this.f39293r) == null || tL_messages_stickerSet.set.f22054id != c0(this.v).f22054id) {
                if (c0(this.v) != null || this.f39293r != null) {
                    boolean z10 = this.N;
                    long j10 = this.f39295w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f39294s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f39293r.set;
                            tL_inputStickerSetID.f22047id = stickerSet.f22054id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f39294s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f22028id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f39293r.set;
                            tL_inputStickerSetID2.f22047id = stickerSet2.f22054id;
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

    public f70(long j10, int i10) {
        super(null);
        this.f39292n = -1;
        this.f39295w = j10;
        this.N = true;
    }
}

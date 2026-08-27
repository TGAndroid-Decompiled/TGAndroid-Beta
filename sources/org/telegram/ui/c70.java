package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class c70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public org.telegram.ui.ActionBar.v0 H;
    public boolean I;
    public final boolean J;
    public z60 K;

    public FrameLayout f36978a;

    public org.telegram.ui.Components.iw0 f36979b;

    public org.telegram.ui.Components.h00 f36980c;
    public org.telegram.ui.Components.zk0 d;

    public a70 f36981e;

    public b70 f36982f;
    public f2.k0 h;

    public int f36983n;

    public TLRPC.TL_messages_stickerSet f36984r;

    public boolean f36985s;
    public TLRPC.ChatFull v;

    public final long f36986w;

    public int f36987x;

    public int f36988y;

    public c70(long j10) {
        super(null);
        this.f36983n = -1;
        this.f36986w = j10;
    }

    public static void U(c70 c70Var, View view, int i10) {
        if (c70Var.getParentActivity() == null) {
            return;
        }
        if (!c70Var.I) {
            if (i10 >= c70Var.A && i10 < c70Var.B) {
                c70Var.d0(MediaDataController.getInstance(c70Var.currentAccount).getStickerSets(c70Var.c0()).get(i10 - c70Var.A), ((org.telegram.ui.Cells.h8) view).a(), false);
            }
            if (i10 == c70Var.F) {
                c70Var.d0(c70Var.f36984r, true, false);
                return;
            }
            return;
        }
        if (i10 > c70Var.f36982f.d.size()) {
            boolean zA = ((org.telegram.ui.Cells.h8) view).a();
            b70 b70Var = c70Var.f36982f;
            c70Var.d0((TLRPC.TL_messages_stickerSet) b70Var.f36713e.get((i10 - b70Var.d.size()) - 1), zA, false);
        } else if (i10 != c70Var.f36982f.d.size()) {
            c70Var.d0((TLRPC.TL_messages_stickerSet) c70Var.f36982f.d.get(i10), ((org.telegram.ui.Cells.h8) view).a(), true);
        }
    }

    public static void V(c70 c70Var, TLRPC.TL_error tL_error) {
        boolean z10 = c70Var.J;
        if (tL_error != null) {
            if (c70Var.getParentActivity() != null) {
                Activity parentActivity = c70Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = c70Var.f36984r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                c70Var.v.emojiset = stickerSet;
            } else {
                c70Var.v.stickerset = stickerSet;
            }
            MediaDataController.getInstance(c70Var.currentAccount).putGroupStickerSet(c70Var.f36984r);
        } else if (z10) {
            c70Var.v.emojiset = null;
        } else {
            c70Var.v.stickerset = null;
        }
        c70Var.h0();
        if (z10) {
            TLRPC.ChatFull chatFull = c70Var.v;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = c70Var.v;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        MessagesStorage.getInstance(c70Var.currentAccount).updateChatInfo(c70Var.v, false);
        NotificationCenter.getInstance(c70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, c70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
        NotificationCenter.getInstance(c70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(c70Var.v.f22381id), Boolean.valueOf(z10));
        c70Var.finishFragment();
    }

    public static void a0(c70 c70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = c70Var.f36983n;
        if (tL_messages_stickerSet == null) {
            if (c70Var.f36984r != null) {
                org.telegram.messenger.y1.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.mc.a0(c70Var), R.raw.done, 36);
            }
            c70Var.f36984r = null;
            c70Var.f36985s = true;
        } else {
            c70Var.f36984r = tL_messages_stickerSet;
            c70Var.f36985s = false;
            org.telegram.messenger.y1.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.mc.a0(c70Var), R.raw.done, 36);
        }
        c70Var.h0();
        c70Var.f0(c70Var.f36984r, false);
        if (i10 != -1) {
            if (c70Var.I) {
                c70Var.f36981e.m(c70Var.A + i10);
                break;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= c70Var.d.getChildCount()) {
                    c70Var.f36981e.m(c70Var.A + i10);
                    break;
                }
                View childAt = c70Var.d.getChildAt(i11);
                if (c70Var.d.T(childAt).b() == c70Var.A + i10) {
                    ((org.telegram.ui.Cells.h8) childAt).b(false, true);
                    break;
                }
                i11++;
            }
        }
        if (c70Var.f36983n != -1) {
            if (!c70Var.I) {
                for (int i12 = 0; i12 < c70Var.d.getChildCount(); i12++) {
                    View childAt2 = c70Var.d.getChildAt(i12);
                    if (c70Var.d.T(childAt2).b() == c70Var.A + c70Var.f36983n) {
                        ((org.telegram.ui.Cells.h8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            c70Var.f36981e.m(c70Var.A + c70Var.f36983n);
        }
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.J ? chatFull.emojiset : chatFull.stickerset;
    }

    public final int c0() {
        return this.J ? 5 : 0;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.J ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 25));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.H = v0VarA;
        v0VarA.F();
        v0VarA.D = new db(this, 9);
        this.H.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f36981e = new a70(this, context);
        this.f36982f = new b70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        this.d = new org.telegram.ui.Components.zk0(context, null);
        f2.l lVar = new f2.l();
        lVar.n(200L);
        lVar.f5819m = true;
        this.d.setItemAnimator(lVar);
        f2.k0 k0Var = new f2.k0();
        this.h = k0Var;
        k0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36978a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, getResourceProvider());
        this.f36980c = h00Var;
        h00Var.setViewType(19);
        this.f36980c.setIsSingleCell(true);
        this.f36980c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f36978a.addView(this.f36980c, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context, this.f36980c, 1, null);
        this.f36979b = iw0Var;
        i6.q2(iw0Var);
        this.f36978a.addView(this.f36979b);
        frameLayout.addView(this.f36978a);
        this.f36978a.setVisibility(8);
        this.d.setEmptyView(this.f36978a);
        frameLayout.addView(this.d, h7.z5.c(-1.0f, -1));
        this.d.setAdapter(this.f36981e);
        this.d.setOnItemClickListener(new i(this, 13));
        this.d.setOnScrollListener(new m3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.ex0 ex0Var = new org.telegram.ui.Components.ex0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        ex0Var.Z = new x60(this, z10, tL_messages_stickerSet);
        ex0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        ex0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.groupStickersDidLoad) {
                long jLongValue = ((Long) objArr[0]).longValue();
                if (b0(this.v) == null || b0(this.v).f22407id != jLongValue) {
                    return;
                }
                g0(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.f22381id == this.f36986w) {
            if (this.v == null && b0(chatFull) != null) {
                this.f36984r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
            }
            this.v = chatFull;
            g0(true);
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f36984r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
        }
    }

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        if (this.J) {
            if (tL_messages_stickerSet != null) {
                boolean z11 = this.F == -1;
                this.f36984r = tL_messages_stickerSet;
                g0(false);
                if (z11) {
                    this.f36981e.o(this.F);
                } else {
                    this.f36981e.m(this.F);
                }
                if (z10) {
                    this.f36981e.m(this.E);
                }
                z60 z60Var = this.K;
                z60Var.f45055b = true;
                z60Var.invalidate();
                return;
            }
            int i10 = this.F;
            boolean z12 = i10 > 0;
            this.f36984r = null;
            if (z12) {
                this.f36981e.u(i10);
                if (z10) {
                    this.f36981e.m(this.E);
                }
            }
            g0(false);
            z60 z60Var2 = this.K;
            z60Var2.f45055b = false;
            z60Var2.invalidate();
        }
    }

    public final void g0(boolean z10) {
        a70 a70Var;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.C = 0;
        if (this.J) {
            this.D = 0;
            this.C = 2;
            this.E = 1;
            if (this.f36984r != null) {
                this.C = 3;
                this.F = 2;
            }
            int i10 = this.C;
            this.C = i10 + 1;
            this.G = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (stickerSets.isEmpty()) {
            this.f36988y = -1;
            this.A = -1;
            this.B = -1;
        } else {
            int i11 = this.C;
            int i12 = i11 + 1;
            this.C = i12;
            this.f36988y = i11;
            this.A = i12;
            this.B = stickerSets.size() + i12;
            this.C = stickerSets.size() + this.C;
        }
        int i13 = this.C;
        this.C = i13 + 1;
        this.f36987x = i13;
        h0();
        if (!z10 || (a70Var = this.f36981e) == null) {
            return;
        }
        a70Var.l();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.h8.class, org.telegram.ui.Cells.x9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        int i11 = org.telegram.ui.ActionBar.g6.f23018b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 2, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 196608, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.h8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Uh));
        return arrayList;
    }

    public final void h0() {
        long j10;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        this.f36983n = -1;
        if (this.f36985s) {
            j10 = 0;
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f36984r;
            if (tL_messages_stickerSet != null) {
                j10 = tL_messages_stickerSet.set.f22407id;
            } else if (b0(this.v) != null) {
                j10 = b0(this.v).f22407id;
            } else {
                j10 = 0;
            }
        }
        if (j10 != 0) {
            for (int i10 = 0; i10 < stickerSets.size(); i10++) {
                if (stickerSets.get(i10).set.f22407id == j10) {
                    this.f36983n = i10;
                    return;
                }
            }
        }
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
        TLObject tLObject;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.f36984r != null || this.f36985s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f36984r) == null || tL_messages_stickerSet.set.f22407id != b0(this.v).f22407id) {
                if (b0(this.v) == null && this.f36984r == null) {
                    return;
                }
                boolean z10 = this.J;
                long j10 = this.f36986w;
                if (z10) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                    if (this.f36985s) {
                        tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tLObject = tL_channels_setEmojiStickers;
                    } else {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet = this.f36984r.set;
                        tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tLObject = tL_channels_setEmojiStickers;
                    }
                } else {
                    TLRPC.TL_channels_setStickers tL_channels_setStickers = new TLRPC.TL_channels_setStickers();
                    tL_channels_setStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                    if (this.f36985s) {
                        tL_channels_setStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tLObject = tL_channels_setStickers;
                    } else {
                        MessagesController.getEmojiSettings(this.currentAccount).edit().remove("group_hide_stickers_" + this.v.f22381id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.f36984r.set;
                        tL_inputStickerSetID2.f22400id = stickerSet2.f22407id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tLObject = tL_channels_setStickers;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new n(this, 9));
            }
        }
    }

    public c70(long j10, int i10) {
        super(null);
        this.f36983n = -1;
        this.f36986w = j10;
        this.J = true;
    }
}

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
public final class c70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public org.telegram.ui.ActionBar.w0 H;
    public boolean I;
    public final boolean J;
    public z60 K;
    public FrameLayout f37012a;
    public org.telegram.ui.Components.qw0 f37013b;
    public org.telegram.ui.Components.p00 f37014c;
    public org.telegram.ui.Components.jl0 d;
    public a70 f37015e;
    public b70 f37016f;
    public f2.j0 h;
    public int f37017n;
    public TLRPC.TL_messages_stickerSet f37018r;
    public boolean f37019s;
    public TLRPC.ChatFull v;
    public final long f37020w;
    public int f37021x;
    public int f37022y;

    public c70(long j10) {
        super(null);
        this.f37017n = -1;
        this.f37020w = j10;
    }

    public static void U(c70 c70Var, View view, int i10) {
        if (c70Var.getParentActivity() != null) {
            if (c70Var.I) {
                if (i10 > c70Var.f37016f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.i8) view).a();
                    b70 b70Var = c70Var.f37016f;
                    c70Var.d0((TLRPC.TL_messages_stickerSet) b70Var.f36703e.get((i10 - b70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != c70Var.f37016f.d.size()) {
                    c70Var.d0((TLRPC.TL_messages_stickerSet) c70Var.f37016f.d.get(i10), ((org.telegram.ui.Cells.i8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= c70Var.A && i10 < c70Var.B) {
                c70Var.d0(MediaDataController.getInstance(c70Var.currentAccount).getStickerSets(c70Var.c0()).get(i10 - c70Var.A), ((org.telegram.ui.Cells.i8) view).a(), false);
            }
            if (i10 == c70Var.F) {
                c70Var.d0(c70Var.f37018r, true, false);
            }
        }
    }

    public static void V(c70 c70Var, TLRPC.TL_error tL_error) {
        boolean z10 = c70Var.J;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = c70Var.f37018r;
            if (tL_messages_stickerSet == null) {
                if (z10) {
                    c70Var.v.emojiset = null;
                } else {
                    c70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z10) {
                    c70Var.v.emojiset = stickerSet;
                } else {
                    c70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(c70Var.currentAccount).putGroupStickerSet(c70Var.f37018r);
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
            NotificationCenter.getInstance(c70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(c70Var.v.f22393id), Boolean.valueOf(z10));
            c70Var.finishFragment();
        } else if (c70Var.getParentActivity() != null) {
            Activity parentActivity = c70Var.getParentActivity();
            StringBuilder sb2 = new StringBuilder();
            b.j(R.string.ErrorOccurred, "\n", sb2);
            sb2.append(tL_error.text);
            Toast.makeText(parentActivity, sb2.toString(), 0).show();
        }
    }

    public static int X(c70 c70Var) {
        return c70Var.currentAccount;
    }

    public static void a0(c70 c70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = c70Var.f37017n;
        if (tL_messages_stickerSet == null) {
            if (c70Var.f37018r != null) {
                j7.l1.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.tc.a0(c70Var), R.raw.done, 36);
            }
            c70Var.f37018r = null;
            c70Var.f37019s = true;
        } else {
            c70Var.f37018r = tL_messages_stickerSet;
            c70Var.f37019s = false;
            j7.l1.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.tc.a0(c70Var), R.raw.done, 36);
        }
        c70Var.h0();
        c70Var.f0(c70Var.f37018r, false);
        if (i10 != -1) {
            if (!c70Var.I) {
                for (int i11 = 0; i11 < c70Var.d.getChildCount(); i11++) {
                    View childAt = c70Var.d.getChildAt(i11);
                    if (c70Var.d.T(childAt).b() == c70Var.A + i10) {
                        ((org.telegram.ui.Cells.i8) childAt).b(false, true);
                        break;
                    }
                }
            }
            c70Var.f37015e.m(c70Var.A + i10);
        }
        if (c70Var.f37017n != -1) {
            if (!c70Var.I) {
                for (int i12 = 0; i12 < c70Var.d.getChildCount(); i12++) {
                    View childAt2 = c70Var.d.getChildAt(i12);
                    if (c70Var.d.T(childAt2).b() == c70Var.A + c70Var.f37017n) {
                        ((org.telegram.ui.Cells.i8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            c70Var.f37015e.m(c70Var.A + c70Var.f37017n);
        }
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.J) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    public final int c0() {
        if (this.J) {
            return 5;
        }
        return 0;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (this.J) {
            i10 = R.string.GroupEmojiPack;
        } else {
            i10 = R.string.GroupStickers;
        }
        lVar.setTitle(LocaleController.getString(i10));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 16));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.H = a2;
        a2.F();
        a2.D = new bb(this, 9);
        this.H.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f37015e = new a70(this, context);
        this.f37016f = new b70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        this.d = new org.telegram.ui.Components.jl0(context, null);
        f2.l lVar2 = new f2.l();
        lVar2.n(200L);
        lVar2.f6463m = true;
        this.d.setItemAnimator(lVar2);
        f2.j0 j0Var = new f2.j0();
        this.h = j0Var;
        j0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f37012a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, getResourceProvider());
        this.f37014c = p00Var;
        p00Var.setViewType(19);
        this.f37014c.setIsSingleCell(true);
        this.f37014c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f37012a.addView(this.f37014c, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, this.f37014c, 1, null);
        this.f37013b = qw0Var;
        oc.i.K1(qw0Var);
        this.f37012a.addView(this.f37013b);
        frameLayout.addView(this.f37012a);
        this.f37012a.setVisibility(8);
        this.d.setEmptyView(this.f37012a);
        frameLayout.addView(this.d, i7.f6.c(-1.0f, -1));
        this.d.setAdapter(this.f37015e);
        this.d.setOnItemClickListener(new j(this, 13));
        this.d.setOnScrollListener(new m3(this, 15));
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
        org.telegram.ui.Components.nx0 nx0Var = new org.telegram.ui.Components.nx0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        nx0Var.Z = new w60(this, z10, tL_messages_stickerSet);
        nx0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        nx0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22393id == this.f37020w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f37018r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f22419id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f37018r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
        }
    }

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        boolean z11;
        if (!this.J) {
            return;
        }
        boolean z12 = true;
        if (tL_messages_stickerSet != null) {
            if (this.F == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f37018r = tL_messages_stickerSet;
            g0(false);
            if (z11) {
                this.f37015e.o(this.F);
            } else {
                this.f37015e.m(this.F);
            }
            if (z10) {
                this.f37015e.m(this.E);
            }
            z60 z60Var = this.K;
            z60Var.f45089b = true;
            z60Var.invalidate();
            return;
        }
        int i10 = this.F;
        if (i10 <= 0) {
            z12 = false;
        }
        this.f37018r = null;
        if (z12) {
            this.f37015e.u(i10);
            if (z10) {
                this.f37015e.m(this.E);
            }
        }
        g0(false);
        z60 z60Var2 = this.K;
        z60Var2.f45089b = false;
        z60Var2.invalidate();
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
            if (this.f37018r != null) {
                this.C = 3;
                this.F = 2;
            }
            int i10 = this.C;
            this.C = i10 + 1;
            this.G = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (!stickerSets.isEmpty()) {
            int i11 = this.C;
            int i12 = i11 + 1;
            this.C = i12;
            this.f37022y = i11;
            this.A = i12;
            this.B = stickerSets.size() + i12;
            this.C = stickerSets.size() + this.C;
        } else {
            this.f37022y = -1;
            this.A = -1;
            this.B = -1;
        }
        int i13 = this.C;
        this.C = i13 + 1;
        this.f37021x = i13;
        h0();
        if (z10 && (a70Var = this.f37015e) != null) {
            a70Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.i8.class, org.telegram.ui.Cells.y9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        int i11 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 2, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 196608, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Uh));
        return arrayList;
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c70.h0():void");
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
        if ((this.f37018r != null || this.f37019s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f37018r) == null || tL_messages_stickerSet.set.f22419id != b0(this.v).f22419id) {
                if (b0(this.v) != null || this.f37018r != null) {
                    boolean z10 = this.J;
                    long j10 = this.f37020w;
                    if (z10) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f37019s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f37018r.set;
                            tL_inputStickerSetID.f22412id = stickerSet.f22419id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f37019s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f22393id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f37018r.set;
                            tL_inputStickerSetID2.f22412id = stickerSet2.f22419id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new o(this, 9));
                }
            }
        }
    }

    public c70(long j10, int i10) {
        super(null);
        this.f37017n = -1;
        this.f37020w = j10;
        this.J = true;
    }
}

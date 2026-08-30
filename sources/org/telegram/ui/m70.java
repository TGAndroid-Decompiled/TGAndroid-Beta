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
public final class m70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public org.telegram.ui.ActionBar.w0 I;
    public boolean J;
    public final boolean K;
    public j70 L;
    public FrameLayout f36216a;
    public org.telegram.ui.Components.zw0 f36217b;
    public org.telegram.ui.Components.t00 f36218c;
    public org.telegram.ui.Components.sl0 d;
    public k70 e;
    public l70 f36219f;
    public f2.i0 h;
    public int f36220n;
    public TLRPC.TL_messages_stickerSet f36221r;
    public boolean f36222s;
    public TLRPC.ChatFull v;
    public final long f36223w;
    public int f36224x;
    public int f36225y;

    public m70(long j10) {
        super(null);
        this.f36220n = -1;
        this.f36223w = j10;
    }

    public static void U(m70 m70Var, View view, int i10) {
        if (m70Var.getParentActivity() != null) {
            if (m70Var.J) {
                if (i10 > m70Var.f36219f.d.size()) {
                    boolean a2 = ((org.telegram.ui.Cells.k8) view).a();
                    l70 l70Var = m70Var.f36219f;
                    m70Var.d0((TLRPC.TL_messages_stickerSet) l70Var.e.get((i10 - l70Var.d.size()) - 1), a2, false);
                    return;
                } else if (i10 != m70Var.f36219f.d.size()) {
                    m70Var.d0((TLRPC.TL_messages_stickerSet) m70Var.f36219f.d.get(i10), ((org.telegram.ui.Cells.k8) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i10 >= m70Var.B && i10 < m70Var.C) {
                m70Var.d0(MediaDataController.getInstance(m70Var.currentAccount).getStickerSets(m70Var.c0()).get(i10 - m70Var.B), ((org.telegram.ui.Cells.k8) view).a(), false);
            }
            if (i10 == m70Var.G) {
                m70Var.d0(m70Var.f36221r, true, false);
            }
        }
    }

    public static void V(m70 m70Var, TLRPC.TL_error tL_error) {
        boolean z4 = m70Var.K;
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m70Var.f36221r;
            if (tL_messages_stickerSet == null) {
                if (z4) {
                    m70Var.v.emojiset = null;
                } else {
                    m70Var.v.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                if (z4) {
                    m70Var.v.emojiset = stickerSet;
                } else {
                    m70Var.v.stickerset = stickerSet;
                }
                MediaDataController.getInstance(m70Var.currentAccount).putGroupStickerSet(m70Var.f36221r);
            }
            m70Var.h0();
            if (z4) {
                TLRPC.ChatFull chatFull = m70Var.v;
                if (chatFull.emojiset != null) {
                    chatFull.flags2 |= 1024;
                } else {
                    chatFull.flags2 &= -1025;
                }
            } else {
                TLRPC.ChatFull chatFull2 = m70Var.v;
                if (chatFull2.stickerset == null) {
                    chatFull2.flags |= 256;
                } else {
                    chatFull2.flags &= -257;
                }
            }
            MessagesStorage.getInstance(m70Var.currentAccount).updateChatInfo(m70Var.v, false);
            NotificationCenter.getInstance(m70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, m70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
            NotificationCenter.getInstance(m70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(m70Var.v.f19185id), Boolean.valueOf(z4));
            m70Var.finishFragment();
        } else if (m70Var.getParentActivity() != null) {
            Activity parentActivity = m70Var.getParentActivity();
            StringBuilder sb = new StringBuilder();
            b.i(R.string.ErrorOccurred, "\n", sb);
            sb.append(tL_error.text);
            Toast.makeText(parentActivity, sb.toString(), 0).show();
        }
    }

    public static int X(m70 m70Var) {
        return m70Var.currentAccount;
    }

    public static void a0(m70 m70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = m70Var.f36220n;
        if (tL_messages_stickerSet == null) {
            if (m70Var.f36221r != null) {
                kh.a2.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(m70Var), R.raw.done, 36);
            }
            m70Var.f36221r = null;
            m70Var.f36222s = true;
        } else {
            m70Var.f36221r = tL_messages_stickerSet;
            m70Var.f36222s = false;
            kh.a2.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(m70Var), R.raw.done, 36);
        }
        m70Var.h0();
        m70Var.f0(m70Var.f36221r, false);
        if (i10 != -1) {
            if (!m70Var.J) {
                for (int i11 = 0; i11 < m70Var.d.getChildCount(); i11++) {
                    View childAt = m70Var.d.getChildAt(i11);
                    if (m70Var.d.T(childAt).b() == m70Var.B + i10) {
                        ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                        break;
                    }
                }
            }
            m70Var.e.m(m70Var.B + i10);
        }
        if (m70Var.f36220n != -1) {
            if (!m70Var.J) {
                for (int i12 = 0; i12 < m70Var.d.getChildCount(); i12++) {
                    View childAt2 = m70Var.d.getChildAt(i12);
                    if (m70Var.d.T(childAt2).b() == m70Var.B + m70Var.f36220n) {
                        ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            m70Var.e.m(m70Var.B + m70Var.f36220n);
        }
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.K) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    public final int c0() {
        if (this.K) {
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
        if (this.K) {
            i10 = R.string.GroupEmojiPack;
        } else {
            i10 = R.string.GroupStickers;
        }
        kVar.setTitle(LocaleController.getString(i10));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 16));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.I = a2;
        a2.F();
        a2.E = new fb(this, 9);
        this.I.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new k70(this, context);
        this.f36219f = new l70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        this.d = new org.telegram.ui.Components.sl0(context, null);
        f2.l lVar = new f2.l();
        lVar.n(200L);
        lVar.f5818m = true;
        this.d.setItemAnimator(lVar);
        f2.i0 i0Var = new f2.i0();
        this.h = i0Var;
        i0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36216a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, getResourceProvider());
        this.f36218c = t00Var;
        t00Var.setViewType(19);
        this.f36218c.setIsSingleCell(true);
        this.f36218c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.f36216a.addView(this.f36218c, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, this.f36218c, 1, null);
        this.f36217b = zw0Var;
        n7.qa.N0(zw0Var);
        this.f36216a.addView(this.f36217b);
        frameLayout.addView(this.f36216a);
        this.f36216a.setVisibility(8);
        this.d.setEmptyView(this.f36216a);
        frameLayout.addView(this.d, k7.b6.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new j(this, 13));
        this.d.setOnScrollListener(new l3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z4, boolean z10) {
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
        org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        xx0Var.f30767a0 = new h70(this, z4, tL_messages_stickerSet);
        xx0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        xx0Var.show();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19185id == this.f36223w) {
                if (this.v == null && b0(chatFull) != null) {
                    this.f36221r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
                }
                this.v = chatFull;
                g0(true);
            }
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            if (b0(this.v) != null && b0(this.v).f19211id == longValue) {
                g0(true);
            }
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.f36221r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
        }
    }

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z4) {
        boolean z10;
        if (!this.K) {
            return;
        }
        boolean z11 = true;
        if (tL_messages_stickerSet != null) {
            if (this.G == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f36221r = tL_messages_stickerSet;
            g0(false);
            if (z10) {
                this.e.o(this.G);
            } else {
                this.e.m(this.G);
            }
            if (z4) {
                this.e.m(this.F);
            }
            j70 j70Var = this.L;
            j70Var.f35250b = true;
            j70Var.invalidate();
            return;
        }
        int i10 = this.G;
        if (i10 <= 0) {
            z11 = false;
        }
        this.f36221r = null;
        if (z11) {
            this.e.u(i10);
            if (z4) {
                this.e.m(this.F);
            }
        }
        g0(false);
        j70 j70Var2 = this.L;
        j70Var2.f35250b = false;
        j70Var2.invalidate();
    }

    public final void g0(boolean z4) {
        k70 k70Var;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.D = 0;
        if (this.K) {
            this.E = 0;
            this.D = 2;
            this.F = 1;
            if (this.f36221r != null) {
                this.D = 3;
                this.G = 2;
            }
            int i10 = this.D;
            this.D = i10 + 1;
            this.H = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (!stickerSets.isEmpty()) {
            int i11 = this.D;
            int i12 = i11 + 1;
            this.D = i12;
            this.f36225y = i11;
            this.B = i12;
            this.C = stickerSets.size() + i12;
            this.D = stickerSets.size() + this.D;
        } else {
            this.f36225y = -1;
            this.B = -1;
            this.C = -1;
        }
        int i13 = this.D;
        this.D = i13 + 1;
        this.f36224x = i13;
        h0();
        if (z4 && (k70Var = this.e) != null) {
            k70Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.aa.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20176s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        int i11 = org.telegram.ui.ActionBar.j6.f19871b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20298z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 196608, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    public final void h0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m70.h0():void");
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
        if ((this.f36221r != null || this.f36222s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.f36221r) == null || tL_messages_stickerSet.set.f19211id != b0(this.v).f19211id) {
                if (b0(this.v) != null || this.f36221r != null) {
                    boolean z4 = this.K;
                    long j10 = this.f36223w;
                    if (z4) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f36222s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.f36221r.set;
                            tL_inputStickerSetID.f19204id = stickerSet.f19211id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                        if (this.f36222s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(this.currentAccount).edit();
                            edit.remove("group_hide_stickers_" + this.v.f19185id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.f36221r.set;
                            tL_inputStickerSetID2.f19204id = stickerSet2.f19211id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new o(this, 9));
                }
            }
        }
    }

    public m70(long j10, int i10) {
        super(null);
        this.f36220n = -1;
        this.f36223w = j10;
        this.K = true;
    }
}

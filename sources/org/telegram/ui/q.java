package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.i f39650a;
    public p f39651b;
    public org.telegram.ui.Components.pz f39652c;
    public s4.c0 d;
    public org.telegram.ui.Components.zl0 f39653e;
    public final HashSet f39654f;
    public final ArrayList h;
    public boolean f39655n;
    public boolean f39656r;
    public boolean f39657s;
    public org.telegram.ui.ActionBar.g6 v;
    public int f39658w;
    public int f39659x;
    public int f39660y;

    public q(int i10) {
        super(null);
        this.f39650a = new a0.i();
        this.f39654f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int T(q qVar) {
        return qVar.currentAccount;
    }

    public final void U() {
        long j3;
        boolean z10;
        if (!this.I && !this.f39656r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.pz pzVar = this.f39652c;
            if (pzVar != null && !this.f39655n) {
                pzVar.b();
            }
            p pVar = this.f39651b;
            if (pVar != null) {
                pVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j3 = 0;
            } else {
                j3 = ((TLRPC.StickerSetCovered) hg.c.g(1, arrayList)).set.f20074id;
            }
            tL_messages_getArchivedStickers.offset_id = j3;
            tL_messages_getArchivedStickers.limit = 15;
            int i10 = this.H;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_getArchivedStickers.masks = z10;
            if (i10 != 5) {
                z11 = false;
            }
            tL_messages_getArchivedStickers.emojis = z11;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new m(this, 0)), this.classGuid);
        }
    }

    public final void W(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f39657s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f20074id);
                HashSet hashSet = this.f39654f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f20074id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39656r = z10;
            this.I = false;
            this.f39655n = true;
            org.telegram.ui.Components.pz pzVar = this.f39652c;
            if (pzVar != null) {
                pzVar.c();
            }
            X();
            p pVar = this.f39651b;
            if (pVar != null) {
                pVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.ui.ActionBar.g6(1, this, tL_messages_archivedStickers);
    }

    public final void X() {
        int i10;
        this.G = 0;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int i11 = this.H;
            if (i11 != 0 && i11 != 5) {
                i10 = -1;
            } else {
                i10 = this.G;
                this.G = i10 + 1;
            }
            this.f39658w = i10;
            int i12 = this.G;
            this.f39659x = i12;
            this.f39660y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f39656r) {
                this.G = size + 1;
                this.E = size;
                this.F = -1;
                return;
            }
            this.G = size + 1;
            this.F = size;
            this.E = -1;
            return;
        }
        this.f39658w = -1;
        this.f39659x = -1;
        this.f39660y = -1;
        this.E = -1;
        this.F = -1;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.H;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 19));
        this.f39651b = new p(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.f39652c = pzVar;
        if (i10 == 0) {
            pzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            pzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        if (this.I) {
            this.f39652c.b();
        } else {
            this.f39652c.c();
        }
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f39653e = zl0Var;
        zl0Var.setFocusable(true);
        this.f39653e.setEmptyView(this.f39652c);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f39653e;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        zl0Var2.setLayoutManager(c0Var);
        this.f39653e.r1();
        this.f39653e.setSectionsDrawBackground(true);
        frameLayout.addView(this.f39653e, w7.z5.c(-1.0f, -1));
        frameLayout.addView(this.f39652c, w7.z5.c(-1.0f, -1));
        this.f39653e.setAdapter(this.f39651b);
        this.f39653e.setOnItemClickListener(new i(this, 1));
        this.f39653e.setOnScrollListener(new i3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.zl0 zl0Var;
        org.telegram.ui.Cells.w wVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i10 == NotificationCenter.needAddArchivedStickers) {
            ArrayList arrayList2 = new ArrayList((List) objArr[0]);
            int size = arrayList2.size() - 1;
            while (true) {
                arrayList = this.h;
                if (size < 0) {
                    break;
                }
                int size2 = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f20074id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f20074id) {
                        arrayList2.remove(size);
                        break;
                    } else {
                        i12++;
                    }
                }
                size--;
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(0, arrayList2);
                X();
                p pVar = this.f39651b;
                if (pVar != null) {
                    pVar.s(this.f39659x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (zl0Var = this.f39653e) != null) {
            int childCount = zl0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.f39653e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f20074id);
                    if (isStickerPackInstalled) {
                        this.f39650a.l(stickersSet.set.f20074id);
                        org.telegram.ui.Components.ki0 ki0Var = wVar.f23593f;
                        if (ki0Var != null) {
                            ki0Var.a(false, true);
                        }
                    }
                    wVar.a(isStickerPackInstalled, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f39653e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39652c, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20810c7));
        org.telegram.ui.Components.pz pzVar = this.f39652c;
        int i10 = org.telegram.ui.ActionBar.i6.f20900h6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(pzVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21233z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39653e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Qh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        U();
        X();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void onResume() {
        super.onResume();
        p pVar = this.f39651b;
        if (pVar != null) {
            pVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f39657s = false;
        org.telegram.ui.ActionBar.g6 g6Var = this.v;
        if (g6Var != null) {
            g6Var.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f39657s = true;
    }
}

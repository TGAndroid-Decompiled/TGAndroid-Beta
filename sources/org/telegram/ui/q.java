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
    public int A;
    public int B;
    public int C;
    public final int D;
    public boolean E;

    public final a0.h f41457a;

    public p f41458b;

    public org.telegram.ui.Components.az f41459c;
    public f2.k0 d;

    public org.telegram.ui.Components.zk0 f41460e;

    public final HashSet f41461f;
    public final ArrayList h;

    public boolean f41462n;

    public boolean f41463r;

    public boolean f41464s;
    public org.telegram.messenger.voip.l0 v;

    public int f41465w;

    public int f41466x;

    public int f41467y;

    public q(int i10) {
        super(null);
        this.f41457a = new a0.h();
        this.f41461f = new HashSet();
        this.h = new ArrayList();
        this.D = i10;
    }

    public final void W() {
        if (this.E || this.f41463r) {
            return;
        }
        this.E = true;
        org.telegram.ui.Components.az azVar = this.f41459c;
        if (azVar != null && !this.f41462n) {
            azVar.b();
        }
        p pVar = this.f41458b;
        if (pVar != null) {
            pVar.l();
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        ArrayList arrayList = this.h;
        tL_messages_getArchivedStickers.offset_id = arrayList.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) i0.a.i(1, arrayList)).set.f22407id;
        tL_messages_getArchivedStickers.limit = 15;
        int i10 = this.D;
        tL_messages_getArchivedStickers.masks = i10 == 1;
        tL_messages_getArchivedStickers.emojis = i10 == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new n(this, 0)), this.classGuid);
    }

    public final void X(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.f41464s) {
            this.v = new org.telegram.messenger.voip.l0(9, this, tL_messages_archivedStickers);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
            i11++;
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
            Long lValueOf = Long.valueOf(stickerSetCovered2.set.f22407id);
            HashSet hashSet = this.f41461f;
            if (!hashSet.contains(lValueOf)) {
                hashSet.add(Long.valueOf(stickerSetCovered2.set.f22407id));
                this.h.add(stickerSetCovered2);
                i10++;
            }
        }
        this.f41463r = i10 <= 0;
        this.E = false;
        this.f41462n = true;
        org.telegram.ui.Components.az azVar = this.f41459c;
        if (azVar != null) {
            azVar.c();
        }
        Y();
        p pVar = this.f41458b;
        if (pVar != null) {
            pVar.l();
        }
    }

    public final void Y() {
        int i10;
        this.C = 0;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.f41465w = -1;
            this.f41466x = -1;
            this.f41467y = -1;
            this.A = -1;
            this.B = -1;
            return;
        }
        int i11 = this.D;
        if (i11 == 0 || i11 == 5) {
            i10 = this.C;
            this.C = i10 + 1;
        } else {
            i10 = -1;
        }
        this.f41465w = i10;
        int i12 = this.C;
        this.f41466x = i12;
        this.f41467y = arrayList.size() + i12;
        int size = arrayList.size() + this.C;
        this.C = size;
        if (this.f41463r) {
            this.C = size + 1;
            this.B = size;
            this.A = -1;
        } else {
            this.C = size + 1;
            this.A = size;
            this.B = -1;
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.D;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 15));
        this.f41458b = new p(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.f41459c = azVar;
        if (i10 == 0) {
            azVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            azVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f41459c, h7.z5.c(-1.0f, -1));
        if (this.E) {
            this.f41459c.b();
        } else {
            this.f41459c.c();
        }
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f41460e = zk0Var;
        zk0Var.setFocusable(true);
        this.f41460e.setEmptyView(this.f41459c);
        org.telegram.ui.Components.zk0 zk0Var2 = this.f41460e;
        f2.k0 k0Var = new f2.k0(1, false);
        this.d = k0Var;
        zk0Var2.setLayoutManager(k0Var);
        this.f41460e.p1();
        this.actionBar.setAdaptiveBackground(this.f41460e);
        frameLayout.addView(this.f41460e, h7.z5.c(-1.0f, -1));
        this.f41460e.setAdapter(this.f41458b);
        int i11 = 1;
        this.f41460e.setOnItemClickListener(new i(this, i11));
        this.f41460e.setOnScrollListener(new m3(this, i11));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.zk0 zk0Var;
        org.telegram.ui.Cells.w wVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i10 != NotificationCenter.needAddArchivedStickers) {
            if (i10 != NotificationCenter.stickersDidLoad || (zk0Var = this.f41460e) == null) {
                return;
            }
            int childCount = zk0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f41460e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean zIsStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f22407id);
                    if (zIsStickerPackInstalled) {
                        this.f41457a.l(stickersSet.set.f22407id);
                        org.telegram.ui.Components.lh0 lh0Var = wVar.f25837f;
                        if (lh0Var != null) {
                            lh0Var.a(false, true);
                        }
                    }
                    wVar.a(zIsStickerPackInstalled, true, false);
                }
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList((List) objArr[0]);
        int size = arrayList2.size() - 1;
        while (true) {
            arrayList = this.h;
            if (size < 0) {
                break;
            }
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                if (((TLRPC.StickerSetCovered) arrayList.get(i13)).set.f22407id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f22407id) {
                    arrayList2.remove(size);
                    break;
                }
            }
            size--;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.addAll(0, arrayList2);
        Y();
        p pVar = this.f41458b;
        if (pVar != null) {
            pVar.s(this.f41466x, arrayList2.size());
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41459c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        org.telegram.ui.Components.az azVar = this.f41459c;
        int i10 = org.telegram.ui.ActionBar.g6.f23125h6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(azVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41460e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        W();
        Y();
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f41460e.setPadding(0, 0, 0, i13);
        this.f41460e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        p pVar = this.f41458b;
        if (pVar != null) {
            pVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f41464s = false;
        org.telegram.messenger.voip.l0 l0Var = this.v;
        if (l0Var != null) {
            l0Var.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f41464s = true;
    }
}

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
public final class q extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.i f41123a;
    public p f41124b;
    public org.telegram.ui.Components.f00 f41125c;
    public s4.d0 d;
    public org.telegram.ui.Components.wm0 f41126e;
    public final HashSet f41127f;
    public final ArrayList h;
    public boolean f41128n;
    public boolean f41129r;
    public boolean f41130s;
    public org.telegram.ui.ActionBar.f6 v;
    public int f41131w;
    public int f41132x;
    public int f41133y;

    public q(int i10) {
        super(null);
        this.f41123a = new a0.i();
        this.f41127f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int V(q qVar) {
        return qVar.currentAccount;
    }

    public final void W() {
        long j3;
        boolean z10;
        if (!this.I && !this.f41129r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.f00 f00Var = this.f41125c;
            if (f00Var != null && !this.f41128n) {
                f00Var.b();
            }
            p pVar = this.f41124b;
            if (pVar != null) {
                pVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j3 = 0;
            } else {
                j3 = ((TLRPC.StickerSetCovered) hg.c.h(1, arrayList)).set.f19830id;
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

    public final void X(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f41130s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f19830id);
                HashSet hashSet = this.f41127f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f19830id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41129r = z10;
            this.I = false;
            this.f41128n = true;
            org.telegram.ui.Components.f00 f00Var = this.f41125c;
            if (f00Var != null) {
                f00Var.c();
            }
            Y();
            p pVar = this.f41124b;
            if (pVar != null) {
                pVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.ui.ActionBar.f6(1, this, tL_messages_archivedStickers);
    }

    public final void Y() {
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
            this.f41131w = i10;
            int i12 = this.G;
            this.f41132x = i12;
            this.f41133y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f41129r) {
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
        this.f41131w = -1;
        this.f41132x = -1;
        this.f41133y = -1;
        this.E = -1;
        this.F = -1;
    }

    @Override
    public final View createView(Context context) {
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
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 19));
        this.f41124b = new p(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(context, null);
        this.f41125c = f00Var;
        if (i10 == 0) {
            f00Var.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            f00Var.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f41125c, w7.w5.d(-1.0f, -1));
        if (this.I) {
            this.f41125c.b();
        } else {
            this.f41125c.c();
        }
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f41126e = wm0Var;
        wm0Var.setFocusable(true);
        this.f41126e.setEmptyView(this.f41125c);
        org.telegram.ui.Components.wm0 wm0Var2 = this.f41126e;
        s4.d0 d0Var = new s4.d0(1, false);
        this.d = d0Var;
        wm0Var2.setLayoutManager(d0Var);
        this.f41126e.p1();
        this.actionBar.setAdaptiveBackground(this.f41126e);
        frameLayout.addView(this.f41126e, w7.w5.d(-1.0f, -1));
        this.f41126e.setAdapter(this.f41124b);
        this.f41126e.setOnItemClickListener(new i(this, 1));
        this.f41126e.setOnScrollListener(new i3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.wm0 wm0Var;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f19830id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f19830id) {
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
                Y();
                p pVar = this.f41124b;
                if (pVar != null) {
                    pVar.s(this.f41132x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (wm0Var = this.f41126e) != null) {
            int childCount = wm0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.f41126e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f19830id);
                    if (isStickerPackInstalled) {
                        this.f41123a.l(stickersSet.set.f19830id);
                        org.telegram.ui.Components.fj0 fj0Var = wVar.f23337f;
                        if (fj0Var != null) {
                            fj0Var.a(false, true);
                        }
                    }
                    wVar.a(isStickerPackInstalled, true, false);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20840s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41125c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20544c7));
        org.telegram.ui.Components.f00 f00Var = this.f41125c;
        int i10 = org.telegram.ui.ActionBar.h6.f20632h6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(f00Var, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20964z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41126e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Qh));
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
        this.f41126e.setPadding(0, 0, 0, i13);
        this.f41126e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        p pVar = this.f41124b;
        if (pVar != null) {
            pVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f41130s = false;
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (f6Var != null) {
            f6Var.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f41130s = true;
    }
}

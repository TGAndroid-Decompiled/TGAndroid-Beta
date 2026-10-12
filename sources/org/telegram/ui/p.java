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
public final class p extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.h f39067a;
    public o f39068b;
    public org.telegram.ui.Components.yz f39069c;
    public s4.b0 d;
    public org.telegram.ui.Components.mm0 e;
    public final HashSet f39070f;
    public final ArrayList h;
    public boolean f39071n;
    public boolean f39072r;
    public boolean f39073s;
    public org.telegram.messenger.voip.j v;
    public int f39074w;
    public int f39075x;
    public int f39076y;

    public p(int i10) {
        super(null);
        this.f39067a = new a0.h();
        this.f39070f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int V(p pVar) {
        return pVar.currentAccount;
    }

    public final void W() {
        long j10;
        boolean z10;
        if (!this.I && !this.f39072r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.yz yzVar = this.f39069c;
            if (yzVar != null && !this.f39071n) {
                yzVar.b();
            }
            o oVar = this.f39068b;
            if (oVar != null) {
                oVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) i2.d.g(1, arrayList)).set.f19243id;
            }
            tL_messages_getArchivedStickers.offset_id = j10;
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
        if (!this.f39073s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f19243id);
                HashSet hashSet = this.f39070f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f19243id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39072r = z10;
            this.I = false;
            this.f39071n = true;
            org.telegram.ui.Components.yz yzVar = this.f39069c;
            if (yzVar != null) {
                yzVar.c();
            }
            Y();
            o oVar = this.f39068b;
            if (oVar != null) {
                oVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.messenger.voip.j(15, this, tL_messages_archivedStickers);
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
            this.f39074w = i10;
            int i12 = this.G;
            this.f39075x = i12;
            this.f39076y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f39072r) {
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
        this.f39074w = -1;
        this.f39075x = -1;
        this.f39076y = -1;
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 20));
        this.f39068b = new o(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.f39069c = yzVar;
        if (i10 == 0) {
            yzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            yzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f39069c, w7.a6.d(-1.0f, -1));
        if (this.I) {
            this.f39069c.b();
        } else {
            this.f39069c.c();
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.e = mm0Var;
        mm0Var.setFocusable(true);
        this.e.setEmptyView(this.f39069c);
        org.telegram.ui.Components.mm0 mm0Var2 = this.e;
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        mm0Var2.setLayoutManager(b0Var);
        this.e.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.a6.d(-1.0f, -1));
        this.e.setAdapter(this.f39068b);
        this.e.setOnItemClickListener(new i(this, 1));
        this.e.setOnScrollListener(new k3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.mm0 mm0Var;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f19243id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f19243id) {
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
                o oVar = this.f39068b;
                if (oVar != null) {
                    oVar.s(this.f39075x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (mm0Var = this.e) != null) {
            int childCount = mm0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f19243id);
                    if (isStickerPackInstalled) {
                        this.f39067a.l(stickersSet.set.f19243id);
                        org.telegram.ui.Components.yi0 yi0Var = wVar.f22594f;
                        if (yi0Var != null) {
                            yi0Var.a(false, true);
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39069c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19883c7));
        org.telegram.ui.Components.yz yzVar = this.f39069c;
        int i10 = org.telegram.ui.ActionBar.g6.f19973h6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(yzVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20305z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
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
        this.e.setPadding(0, 0, 0, i13);
        this.e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        o oVar = this.f39068b;
        if (oVar != null) {
            oVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f39073s = false;
        org.telegram.messenger.voip.j jVar = this.v;
        if (jVar != null) {
            jVar.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f39073s = true;
    }
}

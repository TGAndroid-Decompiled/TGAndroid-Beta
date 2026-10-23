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
public final class p extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.h f40025a;
    public o f40026b;
    public org.telegram.ui.Components.vz f40027c;
    public s4.b0 d;
    public org.telegram.ui.Components.jm0 e;
    public final HashSet f40028f;
    public final ArrayList h;
    public boolean f40029n;
    public boolean f40030r;
    public boolean f40031s;
    public m4.z v;
    public int f40032w;
    public int f40033x;
    public int f40034y;

    public p(int i10) {
        super(null);
        this.f40025a = new a0.h();
        this.f40028f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int V(p pVar) {
        return pVar.currentAccount;
    }

    public final void W() {
        long j10;
        boolean z10;
        if (!this.I && !this.f40030r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.vz vzVar = this.f40027c;
            if (vzVar != null && !this.f40029n) {
                vzVar.b();
            }
            o oVar = this.f40026b;
            if (oVar != null) {
                oVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) i2.e.h(1, arrayList)).set.f20307id;
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
        if (!this.f40031s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f20307id);
                HashSet hashSet = this.f40028f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f20307id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f40030r = z10;
            this.I = false;
            this.f40029n = true;
            org.telegram.ui.Components.vz vzVar = this.f40027c;
            if (vzVar != null) {
                vzVar.c();
            }
            Y();
            o oVar = this.f40026b;
            if (oVar != null) {
                oVar.l();
                return;
            }
            return;
        }
        this.v = new m4.z(29, this, tL_messages_archivedStickers);
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
            this.f40032w = i10;
            int i12 = this.G;
            this.f40033x = i12;
            this.f40034y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f40030r) {
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
        this.f40032w = -1;
        this.f40033x = -1;
        this.f40034y = -1;
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 21));
        this.f40026b = new o(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20936a7, false));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f40027c = vzVar;
        if (i10 == 0) {
            vzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            vzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f40027c, w7.z5.c(-1.0f, -1));
        if (this.I) {
            this.f40027c.b();
        } else {
            this.f40027c.c();
        }
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.e = jm0Var;
        jm0Var.setFocusable(true);
        this.e.setEmptyView(this.f40027c);
        org.telegram.ui.Components.jm0 jm0Var2 = this.e;
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        jm0Var2.setLayoutManager(b0Var);
        this.e.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.z5.c(-1.0f, -1));
        this.e.setAdapter(this.f40026b);
        this.e.setOnItemClickListener(new i(this, 1));
        this.e.setOnScrollListener(new k3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.jm0 jm0Var;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f20307id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f20307id) {
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
                o oVar = this.f40026b;
                if (oVar != null) {
                    oVar.s(this.f40033x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (jm0Var = this.e) != null) {
            int childCount = jm0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f20307id);
                    if (isStickerPackInstalled) {
                        this.f40025a.l(stickersSet.set.f20307id);
                        org.telegram.ui.Components.ui0 ui0Var = wVar.f23679f;
                        if (ui0Var != null) {
                            ui0Var.a(false, true);
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20994d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20936a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21273s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21083i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21115k0, null, null, org.telegram.ui.ActionBar.h6.f20995d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40027c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20976c7));
        org.telegram.ui.Components.vz vzVar = this.f40027c;
        int i10 = org.telegram.ui.ActionBar.h6.f21066h6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(vzVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21399z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Qh));
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
        o oVar = this.f40026b;
        if (oVar != null) {
            oVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f40031s = false;
        m4.z zVar = this.v;
        if (zVar != null) {
            zVar.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f40031s = true;
    }
}

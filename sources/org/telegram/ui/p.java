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
    public final a0.h f38772a;
    public o f38773b;
    public org.telegram.ui.Components.yz f38774c;
    public s4.b0 d;
    public org.telegram.ui.Components.mm0 e;
    public final HashSet f38775f;
    public final ArrayList h;
    public boolean f38776n;
    public boolean f38777r;
    public boolean f38778s;
    public org.telegram.messenger.voip.p0 v;
    public int f38779w;
    public int f38780x;
    public int f38781y;

    public p(int i10) {
        super(null);
        this.f38772a = new a0.h();
        this.f38775f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int V(p pVar) {
        return pVar.currentAccount;
    }

    public final void W() {
        long j10;
        boolean z10;
        if (!this.I && !this.f38777r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.yz yzVar = this.f38774c;
            if (yzVar != null && !this.f38776n) {
                yzVar.b();
            }
            o oVar = this.f38773b;
            if (oVar != null) {
                oVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) i2.d.h(1, arrayList)).set.f18943id;
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
        if (!this.f38778s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f18943id);
                HashSet hashSet = this.f38775f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f18943id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f38777r = z10;
            this.I = false;
            this.f38776n = true;
            org.telegram.ui.Components.yz yzVar = this.f38774c;
            if (yzVar != null) {
                yzVar.c();
            }
            Y();
            o oVar = this.f38773b;
            if (oVar != null) {
                oVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.messenger.voip.p0(10, this, tL_messages_archivedStickers);
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
            this.f38779w = i10;
            int i12 = this.G;
            this.f38780x = i12;
            this.f38781y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f38777r) {
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
        this.f38779w = -1;
        this.f38780x = -1;
        this.f38781y = -1;
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
        this.f38773b = new o(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.f38774c = yzVar;
        if (i10 == 0) {
            yzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            yzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f38774c, w7.z5.d(-1.0f, -1));
        if (this.I) {
            this.f38774c.b();
        } else {
            this.f38774c.c();
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.e = mm0Var;
        mm0Var.setFocusable(true);
        this.e.setEmptyView(this.f38774c);
        org.telegram.ui.Components.mm0 mm0Var2 = this.e;
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        mm0Var2.setLayoutManager(b0Var);
        this.e.p1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, w7.z5.d(-1.0f, -1));
        this.e.setAdapter(this.f38773b);
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f18943id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f18943id) {
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
                o oVar = this.f38773b;
                if (oVar != null) {
                    oVar.s(this.f38780x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (mm0Var = this.e) != null) {
            int childCount = mm0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f18943id);
                    if (isStickerPackInstalled) {
                        this.f38772a.l(stickersSet.set.f18943id);
                        org.telegram.ui.Components.yi0 yi0Var = wVar.f22291f;
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38774c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19583c7));
        org.telegram.ui.Components.yz yzVar = this.f38774c;
        int i10 = org.telegram.ui.ActionBar.g6.f19673h6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(yzVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20005z6));
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
        o oVar = this.f38773b;
        if (oVar != null) {
            oVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f38778s = false;
        org.telegram.messenger.voip.p0 p0Var = this.v;
        if (p0Var != null) {
            p0Var.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f38778s = true;
    }
}

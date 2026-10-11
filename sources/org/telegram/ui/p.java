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
    public final a0.i f40668a;
    public o f40669b;
    public org.telegram.ui.Components.d00 f40670c;
    public s4.d0 d;
    public org.telegram.ui.Components.sm0 f40671e;
    public final HashSet f40672f;
    public final ArrayList h;
    public boolean f40673n;
    public boolean f40674r;
    public boolean f40675s;
    public org.telegram.ui.ActionBar.a6 v;
    public int f40676w;
    public int f40677x;
    public int f40678y;

    public p(int i10) {
        super(null);
        this.f40668a = new a0.i();
        this.f40672f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int V(p pVar) {
        return pVar.currentAccount;
    }

    public final void W() {
        long j3;
        boolean z10;
        if (!this.I && !this.f40674r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.d00 d00Var = this.f40670c;
            if (d00Var != null && !this.f40673n) {
                d00Var.b();
            }
            o oVar = this.f40669b;
            if (oVar != null) {
                oVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j3 = 0;
            } else {
                j3 = ((TLRPC.StickerSetCovered) hg.c.g(1, arrayList)).set.f20059id;
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
        if (!this.f40675s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f20059id);
                HashSet hashSet = this.f40672f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f20059id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f40674r = z10;
            this.I = false;
            this.f40673n = true;
            org.telegram.ui.Components.d00 d00Var = this.f40670c;
            if (d00Var != null) {
                d00Var.c();
            }
            Y();
            o oVar = this.f40669b;
            if (oVar != null) {
                oVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.ui.ActionBar.a6(3, this, tL_messages_archivedStickers);
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
            this.f40676w = i10;
            int i12 = this.G;
            this.f40677x = i12;
            this.f40678y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f40674r) {
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
        this.f40676w = -1;
        this.f40677x = -1;
        this.f40678y = -1;
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
        this.f40669b = new o(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        org.telegram.ui.Components.d00 d00Var = new org.telegram.ui.Components.d00(context, null);
        this.f40670c = d00Var;
        if (i10 == 0) {
            d00Var.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            d00Var.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f40670c, w7.x5.d(-1.0f, -1));
        if (this.I) {
            this.f40670c.b();
        } else {
            this.f40670c.c();
        }
        org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(context, null);
        this.f40671e = sm0Var;
        sm0Var.setFocusable(true);
        this.f40671e.setEmptyView(this.f40670c);
        org.telegram.ui.Components.sm0 sm0Var2 = this.f40671e;
        s4.d0 d0Var = new s4.d0(1, false);
        this.d = d0Var;
        sm0Var2.setLayoutManager(d0Var);
        this.f40671e.p1();
        this.actionBar.setAdaptiveBackground(this.f40671e);
        frameLayout.addView(this.f40671e, w7.x5.d(-1.0f, -1));
        this.f40671e.setAdapter(this.f40669b);
        this.f40671e.setOnItemClickListener(new i(this, 1));
        this.f40671e.setOnScrollListener(new h3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.sm0 sm0Var;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f20059id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f20059id) {
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
                o oVar = this.f40669b;
                if (oVar != null) {
                    oVar.s(this.f40677x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (sm0Var = this.f40671e) != null) {
            int childCount = sm0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.f40671e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f20059id);
                    if (isStickerPackInstalled) {
                        this.f40668a.l(stickersSet.set.f20059id);
                        org.telegram.ui.Components.ej0 ej0Var = wVar.f23566f;
                        if (ej0Var != null) {
                            ej0Var.a(false, true);
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20730a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20877i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20908k0, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40670c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20770c7));
        org.telegram.ui.Components.d00 d00Var = this.f40670c;
        int i10 = org.telegram.ui.ActionBar.h6.f20858h6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(d00Var, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40671e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Qh));
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
        this.f40671e.setPadding(0, 0, 0, i13);
        this.f40671e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        o oVar = this.f40669b;
        if (oVar != null) {
            oVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f40675s = false;
        org.telegram.ui.ActionBar.a6 a6Var = this.v;
        if (a6Var != null) {
            a6Var.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f40675s = true;
    }
}

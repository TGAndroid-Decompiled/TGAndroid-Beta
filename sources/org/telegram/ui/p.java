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
public final class p extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public final int D;
    public boolean E;
    public final a0.h f41286a;
    public o f41287b;
    public org.telegram.ui.Components.yy f41288c;
    public f2.m0 d;
    public org.telegram.ui.Components.wk0 f41289e;
    public final HashSet f41290f;
    public final ArrayList h;
    public boolean f41291n;
    public boolean f41292r;
    public boolean f41293s;
    public org.telegram.messenger.voip.l0 v;
    public int f41294w;
    public int f41295x;
    public int f41296y;

    public p(int i9) {
        super(null);
        this.f41286a = new a0.h();
        this.f41290f = new HashSet();
        this.h = new ArrayList();
        this.D = i9;
    }

    public static int U(p pVar) {
        return pVar.currentAccount;
    }

    public final void V() {
        long j10;
        boolean z10;
        if (!this.E && !this.f41292r) {
            boolean z11 = true;
            this.E = true;
            org.telegram.ui.Components.yy yyVar = this.f41288c;
            if (yyVar != null && !this.f41291n) {
                yyVar.b();
            }
            o oVar = this.f41287b;
            if (oVar != null) {
                oVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) j3.r0.j(1, arrayList)).set.f22407id;
            }
            tL_messages_getArchivedStickers.offset_id = j10;
            tL_messages_getArchivedStickers.limit = 15;
            int i9 = this.D;
            if (i9 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_getArchivedStickers.masks = z10;
            if (i9 != 5) {
                z11 = false;
            }
            tL_messages_getArchivedStickers.emojis = z11;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new m(this, 0)), this.classGuid);
        }
    }

    public final void W(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f41293s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i9 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f22407id);
                HashSet hashSet = this.f41290f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f22407id));
                    this.h.add(stickerSetCovered2);
                    i9++;
                }
            }
            if (i9 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41292r = z10;
            this.E = false;
            this.f41291n = true;
            org.telegram.ui.Components.yy yyVar = this.f41288c;
            if (yyVar != null) {
                yyVar.c();
            }
            X();
            o oVar = this.f41287b;
            if (oVar != null) {
                oVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.messenger.voip.l0(9, this, tL_messages_archivedStickers);
    }

    public final void X() {
        int i9;
        this.C = 0;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int i10 = this.D;
            if (i10 != 0 && i10 != 5) {
                i9 = -1;
            } else {
                i9 = this.C;
                this.C = i9 + 1;
            }
            this.f41294w = i9;
            int i11 = this.C;
            this.f41295x = i11;
            this.f41296y = arrayList.size() + i11;
            int size = arrayList.size() + this.C;
            this.C = size;
            if (!this.f41292r) {
                this.C = size + 1;
                this.A = size;
                this.B = -1;
                return;
            }
            this.C = size + 1;
            this.B = size;
            this.A = -1;
            return;
        }
        this.f41294w = -1;
        this.f41295x = -1;
        this.f41296y = -1;
        this.A = -1;
        this.B = -1;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = this.D;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i9 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 14));
        this.f41287b = new o(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.f41288c = yyVar;
        if (i9 == 0) {
            yyVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            yyVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f41288c, g7.e6.c(-1.0f, -1));
        if (this.E) {
            this.f41288c.b();
        } else {
            this.f41288c.c();
        }
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f41289e = wk0Var;
        wk0Var.setFocusable(true);
        this.f41289e.setEmptyView(this.f41288c);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f41289e;
        f2.m0 m0Var = new f2.m0(1, false);
        this.d = m0Var;
        wk0Var2.setLayoutManager(m0Var);
        this.f41289e.p1();
        this.actionBar.setAdaptiveBackground(this.f41289e);
        frameLayout.addView(this.f41289e, g7.e6.c(-1.0f, -1));
        this.f41289e.setAdapter(this.f41287b);
        this.f41289e.setOnItemClickListener(new i(this, 1));
        this.f41289e.setOnScrollListener(new l3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.wk0 wk0Var;
        org.telegram.ui.Cells.w wVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i9 == NotificationCenter.needAddArchivedStickers) {
            ArrayList arrayList2 = new ArrayList((List) objArr[0]);
            int size = arrayList2.size() - 1;
            while (true) {
                arrayList = this.h;
                if (size < 0) {
                    break;
                }
                int size2 = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i11)).set.f22407id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f22407id) {
                        arrayList2.remove(size);
                        break;
                    } else {
                        i11++;
                    }
                }
                size--;
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(0, arrayList2);
                X();
                o oVar = this.f41287b;
                if (oVar != null) {
                    oVar.s(this.f41295x, arrayList2.size());
                }
            }
        } else if (i9 == NotificationCenter.stickersDidLoad && (wk0Var = this.f41289e) != null) {
            int childCount = wk0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f41289e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f22407id);
                    if (isStickerPackInstalled) {
                        this.f41286a.l(stickersSet.set.f22407id);
                        org.telegram.ui.Components.jh0 jh0Var = wVar.f25819f;
                        if (jh0Var != null) {
                            jh0Var.a(false, true);
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
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41288c, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        org.telegram.ui.Components.yy yyVar = this.f41288c;
        int i9 = org.telegram.ui.ActionBar.f6.f23073h6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(yyVar, 2048, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41289e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Qh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        V();
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f41289e.setPadding(0, 0, 0, i12);
        this.f41289e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        o oVar = this.f41287b;
        if (oVar != null) {
            oVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f41293s = false;
        org.telegram.messenger.voip.l0 l0Var = this.v;
        if (l0Var != null) {
            l0Var.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f41293s = true;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.h f41928a;
    public n f41929b;
    public org.telegram.ui.Components.uz f41930c;
    public s4.c0 d;
    public org.telegram.ui.Components.nm0 e;
    public final HashSet f41931f;
    public final ArrayList h;
    public boolean f41932n;
    public boolean f41933r;
    public boolean f41934s;
    public org.telegram.messenger.voip.m0 v;
    public int f41935w;
    public int f41936x;
    public int f41937y;

    public o(int i10) {
        super(null);
        this.f41928a = new a0.h();
        this.f41931f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int W(o oVar) {
        return oVar.currentAccount;
    }

    public final void X() {
        long j10;
        boolean z10;
        if (!this.I && !this.f41933r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.uz uzVar = this.f41930c;
            if (uzVar != null && !this.f41932n) {
                uzVar.b();
            }
            n nVar = this.f41929b;
            if (nVar != null) {
                nVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) ic.a.g(1, arrayList)).set.f22055id;
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
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new l(this, 0)), this.classGuid);
        }
    }

    public final void Y(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f41934s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f22055id);
                HashSet hashSet = this.f41931f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f22055id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41933r = z10;
            this.I = false;
            this.f41932n = true;
            org.telegram.ui.Components.uz uzVar = this.f41930c;
            if (uzVar != null) {
                uzVar.c();
            }
            Z();
            n nVar = this.f41929b;
            if (nVar != null) {
                nVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.messenger.voip.m0(10, this, tL_messages_archivedStickers);
    }

    public final void Z() {
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
            this.f41935w = i10;
            int i12 = this.G;
            this.f41936x = i12;
            this.f41937y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f41933r) {
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
        this.f41935w = -1;
        this.f41936x = -1;
        this.f41937y = -1;
        this.E = -1;
        this.F = -1;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.H;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 21));
        this.f41929b = new n(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.f41930c = uzVar;
        if (i10 == 0) {
            uzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            uzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        if (this.I) {
            this.f41930c.b();
        } else {
            this.f41930c.c();
        }
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.e = nm0Var;
        nm0Var.setFocusable(true);
        this.e.setEmptyView(this.f41930c);
        org.telegram.ui.Components.nm0 nm0Var2 = this.e;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        nm0Var2.setLayoutManager(c0Var);
        this.e.u1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.f41930c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.e.setAdapter(this.f41929b);
        this.e.setOnItemClickListener(new h(this, 1));
        this.e.setOnScrollListener(new i3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.nm0 nm0Var;
        org.telegram.ui.Cells.v vVar;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f22055id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f22055id) {
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
                Z();
                n nVar = this.f41929b;
                if (nVar != null) {
                    nVar.s(this.f41936x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (nm0Var = this.e) != null) {
            int childCount = nm0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f22055id);
                    if (isStickerPackInstalled) {
                        this.f41928a.l(stickersSet.set.f22055id);
                        org.telegram.ui.Components.xi0 xi0Var = vVar.f25496f;
                        if (xi0Var != null) {
                            xi0Var.a(false, true);
                        }
                    }
                    vVar.a(isStickerPackInstalled, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41930c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
        org.telegram.ui.Components.uz uzVar = this.f41930c;
        int i10 = org.telegram.ui.ActionBar.y6.f23429h6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(uzVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        X();
        Z();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.stickersDidLoad);
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
        n nVar = this.f41929b;
        if (nVar != null) {
            nVar.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.uz uzVar = this.f41930c;
            if (uzVar != null) {
                uzVar.setProgressBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23429h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f41934s = false;
        org.telegram.messenger.voip.m0 m0Var = this.v;
        if (m0Var != null) {
            m0Var.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f41934s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

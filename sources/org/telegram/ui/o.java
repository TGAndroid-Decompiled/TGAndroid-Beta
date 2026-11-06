package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class o extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.h f48181a;
    public n f48182b;
    public org.telegram.ui.Components.iy f48183c;
    public v4.b0 d;
    public org.telegram.ui.Components.pj0 f48184e;
    public final HashSet f48185f;
    public final ArrayList h;
    public boolean f48186n;
    public boolean f48187r;
    public boolean f48188s;
    public org.telegram.ui.ActionBar.p f48189w;
    public int f48190x;
    public int f48191y;

    public o(int i7) {
        super(null);
        this.f48181a = new a0.h();
        this.f48185f = new HashSet();
        this.h = new ArrayList();
        this.H = i7;
    }

    public static int a0(o oVar) {
        return oVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848d6));
    }

    public final void b0() {
        long j3;
        boolean z9;
        if (!this.I && !this.f48187r) {
            boolean z10 = true;
            this.I = true;
            org.telegram.ui.Components.iy iyVar = this.f48183c;
            if (iyVar != null && !this.f48186n) {
                iyVar.b();
            }
            n nVar = this.f48182b;
            if (nVar != null) {
                nVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j3 = 0;
            } else {
                j3 = ((TLRPC.StickerSetCovered) jg.g.i(1, arrayList)).set.f26979id;
            }
            tL_messages_getArchivedStickers.offset_id = j3;
            tL_messages_getArchivedStickers.limit = 15;
            int i7 = this.H;
            if (i7 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            tL_messages_getArchivedStickers.masks = z9;
            if (i7 != 5) {
                z10 = false;
            }
            tL_messages_getArchivedStickers.emojis = z10;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new l(this, 0)), this.classGuid);
        }
    }

    public final void c0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z9;
        if (!this.f48188s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f26979id);
                HashSet hashSet = this.f48185f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f26979id));
                    this.h.add(stickerSetCovered2);
                    i7++;
                }
            }
            if (i7 <= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f48187r = z9;
            this.I = false;
            this.f48186n = true;
            org.telegram.ui.Components.iy iyVar = this.f48183c;
            if (iyVar != null) {
                iyVar.c();
            }
            d0();
            n nVar = this.f48182b;
            if (nVar != null) {
                nVar.f();
                return;
            }
            return;
        }
        this.f48189w = new org.telegram.ui.ActionBar.p(5, this, tL_messages_archivedStickers);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.H;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131754128, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131754134, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131754133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 22));
        this.f48182b = new n(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.f48183c = iyVar;
        if (i7 == 0) {
            iyVar.setText(org.telegram.messenger.hd.M0(2131754125, null));
        } else {
            iyVar.setText(org.telegram.messenger.hd.M0(2131754130, null));
        }
        if (this.I) {
            this.f48183c.b();
        } else {
            this.f48183c.c();
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f48184e = pj0Var;
        pj0Var.setFocusable(true);
        this.f48184e.setEmptyView(this.f48183c);
        org.telegram.ui.Components.pj0 pj0Var2 = this.f48184e;
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        pj0Var2.setLayoutManager(b0Var);
        this.f48184e.r1();
        this.f48184e.setSectionsDrawBackground(true);
        frameLayout.addView(this.f48184e, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f48183c, c8.ha.c(-1.0f, -1));
        this.f48184e.setAdapter(this.f48182b);
        this.f48184e.setOnItemClickListener(new h(this, 1));
        this.f48184e.setOnScrollListener(new g3(this, 1));
        return this.fragmentView;
    }

    public final void d0() {
        int i7;
        this.G = 0;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int i10 = this.H;
            if (i10 != 0 && i10 != 5) {
                i7 = -1;
            } else {
                i7 = this.G;
                this.G = i7 + 1;
            }
            this.f48190x = i7;
            int i11 = this.G;
            this.f48191y = i11;
            this.D = arrayList.size() + i11;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f48187r) {
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
        this.f48190x = -1;
        this.f48191y = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.pj0 pj0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i7 == org.telegram.messenger.qs.Y0) {
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i11)).set.f26979id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f26979id) {
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
                d0();
                n nVar = this.f48182b;
                if (nVar != null) {
                    nVar.o(this.f48191y, arrayList2.size());
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25087x0 && (pj0Var = this.f48184e) != null) {
            int childCount = pj0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f48184e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean B0 = org.telegram.messenger.ui.b0(this.currentAccount).B0(stickersSet.set.f26979id, true);
                    if (B0) {
                        this.f48181a.l(stickersSet.set.f26979id);
                        org.telegram.ui.Components.ag0 ag0Var = vVar.f30601f;
                        if (ag0Var != null) {
                            ag0Var.a(false, true);
                        }
                    }
                    vVar.a(B0, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f48184e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48183c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27831c7));
        org.telegram.ui.Components.iy iyVar = this.f48183c;
        int i7 = org.telegram.ui.ActionBar.k6.f27922h6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(iyVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48184e, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48184e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        b0();
        d0();
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.Y0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25087x0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.Y0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25087x0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        n nVar = this.f48182b;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.iy iyVar = this.f48183c;
            if (iyVar != null) {
                iyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        this.f48188s = false;
        org.telegram.ui.ActionBar.p pVar = this.f48189w;
        if (pVar != null) {
            pVar.run();
            this.f48189w = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        this.f48188s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

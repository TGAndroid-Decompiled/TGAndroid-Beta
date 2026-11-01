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
public final class n extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.h f39648a;
    public m f39649b;
    public org.telegram.ui.Components.xy f39650c;
    public s4.a0 d;
    public org.telegram.ui.Components.uk0 e;
    public final HashSet f39651f;
    public final ArrayList h;
    public boolean f39652n;
    public boolean f39653r;
    public boolean f39654s;
    public mh.k f39655w;
    public int f39656x;
    public int f39657y;

    public n(int i10) {
        super(null);
        this.f39648a = new a0.h();
        this.f39651f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int a0(n nVar) {
        return nVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    public final void b0() {
        long j10;
        boolean z10;
        if (!this.I && !this.f39653r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.xy xyVar = this.f39650c;
            if (xyVar != null && !this.f39652n) {
                xyVar.b();
            }
            m mVar = this.f39649b;
            if (mVar != null) {
                mVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) i0.a.g(1, arrayList)).set.f19821id;
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
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new k(this, 0)), this.classGuid);
        }
    }

    public final void c0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f39654s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f19821id);
                HashSet hashSet = this.f39651f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f19821id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39653r = z10;
            this.I = false;
            this.f39652n = true;
            org.telegram.ui.Components.xy xyVar = this.f39650c;
            if (xyVar != null) {
                xyVar.c();
            }
            d0();
            m mVar = this.f39649b;
            if (mVar != null) {
                mVar.f();
                return;
            }
            return;
        }
        this.f39655w = new mh.k(29, this, tL_messages_archivedStickers);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = this.H;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131754128, null));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131754134, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131754133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 12));
        this.f39649b = new m(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f39650c = xyVar;
        if (i10 == 0) {
            xyVar.setText(org.telegram.messenger.dd.L0(2131754125, null));
        } else {
            xyVar.setText(org.telegram.messenger.dd.L0(2131754130, null));
        }
        if (this.I) {
            this.f39650c.b();
        } else {
            this.f39650c.c();
        }
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.e = uk0Var;
        uk0Var.setFocusable(true);
        this.e.setEmptyView(this.f39650c);
        org.telegram.ui.Components.uk0 uk0Var2 = this.e;
        s4.a0 a0Var = new s4.a0(1, false);
        this.d = a0Var;
        uk0Var2.setLayoutManager(a0Var);
        this.e.r1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f39650c, w7.b6.c(-1.0f, -1));
        this.e.setAdapter(this.f39649b);
        this.e.setOnItemClickListener(new g(this, 1));
        this.e.setOnScrollListener(new h3(this, 1));
        return this.fragmentView;
    }

    public final void d0() {
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
            this.f39656x = i10;
            int i12 = this.G;
            this.f39657y = i12;
            this.D = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f39653r) {
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
        this.f39656x = -1;
        this.f39657y = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.uk0 uk0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i10 == org.telegram.messenger.at.Y0) {
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f19821id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f19821id) {
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
                d0();
                m mVar = this.f39649b;
                if (mVar != null) {
                    mVar.o(this.f39657y, arrayList2.size());
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14814x0 && (uk0Var = this.e) != null) {
            int childCount = uk0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean B0 = org.telegram.messenger.vi.b0(this.currentAccount).B0(stickersSet.set.f19821id, true);
                    if (B0) {
                        this.f39648a.l(stickersSet.set.f19821id);
                        org.telegram.ui.Components.dh0 dh0Var = vVar.f23162f;
                        if (dh0Var != null) {
                            dh0Var.a(false, true);
                        }
                    }
                    vVar.a(B0, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39650c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        org.telegram.ui.Components.xy xyVar = this.f39650c;
        int i10 = org.telegram.ui.ActionBar.t6.f21003h6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(xyVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
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
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.Y0);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14814x0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.Y0);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14814x0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        m mVar = this.f39649b;
        if (mVar != null) {
            mVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.xy xyVar = this.f39650c;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21003h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f39654s = false;
        mh.k kVar = this.f39655w;
        if (kVar != null) {
            kVar.run();
            this.f39655w = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f39654s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

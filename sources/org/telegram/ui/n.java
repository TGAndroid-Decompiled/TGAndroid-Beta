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
public final class n extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int D;
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.h f39798a;
    public m f39799b;
    public org.telegram.ui.Components.xy f39800c;
    public s4.a0 d;
    public org.telegram.ui.Components.tk0 e;
    public final HashSet f39801f;
    public final ArrayList h;
    public boolean f39802n;
    public boolean f39803r;
    public boolean f39804s;
    public mh.k f39805w;
    public int f39806x;
    public int f39807y;

    public n(int i10) {
        super(null);
        this.f39798a = new a0.h();
        this.f39801f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int Z(n nVar) {
        return nVar.currentAccount;
    }

    public final void a0() {
        long j10;
        boolean z10;
        if (!this.I && !this.f39803r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.xy xyVar = this.f39800c;
            if (xyVar != null && !this.f39802n) {
                xyVar.b();
            }
            m mVar = this.f39799b;
            if (mVar != null) {
                mVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) i0.a.g(1, arrayList)).set.f19820id;
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

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    public final void b0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f39804s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f19820id);
                HashSet hashSet = this.f39801f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f19820id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39803r = z10;
            this.I = false;
            this.f39802n = true;
            org.telegram.ui.Components.xy xyVar = this.f39800c;
            if (xyVar != null) {
                xyVar.c();
            }
            c0();
            m mVar = this.f39799b;
            if (mVar != null) {
                mVar.f();
                return;
            }
            return;
        }
        this.f39805w = new mh.k(29, this, tL_messages_archivedStickers);
    }

    public final void c0() {
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
            this.f39806x = i10;
            int i12 = this.G;
            this.f39807y = i12;
            this.D = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f39803r) {
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
        this.f39806x = -1;
        this.f39807y = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = this.H;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754128, null));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754134, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 12));
        this.f39799b = new m(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f39800c = xyVar;
        if (i10 == 0) {
            xyVar.setText(org.telegram.messenger.cd.L0(2131754125, null));
        } else {
            xyVar.setText(org.telegram.messenger.cd.L0(2131754130, null));
        }
        if (this.I) {
            this.f39800c.b();
        } else {
            this.f39800c.c();
        }
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.e = tk0Var;
        tk0Var.setFocusable(true);
        this.e.setEmptyView(this.f39800c);
        org.telegram.ui.Components.tk0 tk0Var2 = this.e;
        s4.a0 a0Var = new s4.a0(1, false);
        this.d = a0Var;
        tk0Var2.setLayoutManager(a0Var);
        this.e.r1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f39800c, w7.b6.c(-1.0f, -1));
        this.e.setAdapter(this.f39799b);
        this.e.setOnItemClickListener(new g(this, 1));
        this.e.setOnScrollListener(new h3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tk0 tk0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i10 == org.telegram.messenger.zs.Y0) {
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f19820id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f19820id) {
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
                c0();
                m mVar = this.f39799b;
                if (mVar != null) {
                    mVar.o(this.f39807y, arrayList2.size());
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19718x0 && (tk0Var = this.e) != null) {
            int childCount = tk0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean B0 = org.telegram.messenger.ui.b0(this.currentAccount).B0(stickersSet.set.f19820id, true);
                    if (B0) {
                        this.f39798a.l(stickersSet.set.f19820id);
                        org.telegram.ui.Components.ch0 ch0Var = vVar.f23161f;
                        if (ch0Var != null) {
                            ch0Var.a(false, true);
                        }
                    }
                    vVar.a(B0, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39800c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20911c7));
        org.telegram.ui.Components.xy xyVar = this.f39800c;
        int i10 = org.telegram.ui.ActionBar.t6.f21002h6;
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
        a0();
        c0();
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.Y0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19718x0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.Y0);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19718x0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        m mVar = this.f39799b;
        if (mVar != null) {
            mVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.xy xyVar = this.f39800c;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f39804s = false;
        mh.k kVar = this.f39805w;
        if (kVar != null) {
            kVar.run();
            this.f39805w = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f39804s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

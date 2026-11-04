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
public final class o extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public int G;
    public int H;
    public final int I;
    public boolean J;
    public final a0.h f48149a;
    public n f48150b;
    public org.telegram.ui.Components.gy f48151c;
    public u4.b0 d;
    public org.telegram.ui.Components.tj0 f48152e;
    public final HashSet f48153f;
    public final ArrayList h;
    public boolean f48154n;
    public boolean f48155r;
    public boolean f48156s;
    public org.telegram.messenger.voip.l0 f48157w;
    public int f48158x;
    public int f48159y;

    public o(int i3) {
        super(null);
        this.f48149a = new a0.h();
        this.f48153f = new HashSet();
        this.h = new ArrayList();
        this.I = i3;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    public final void b0() {
        long j10;
        boolean z10;
        if (!this.J && !this.f48155r) {
            boolean z11 = true;
            this.J = true;
            org.telegram.ui.Components.gy gyVar = this.f48151c;
            if (gyVar != null && !this.f48154n) {
                gyVar.b();
            }
            n nVar = this.f48150b;
            if (nVar != null) {
                nVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) k2.p1.h(1, arrayList)).set.f27028id;
            }
            tL_messages_getArchivedStickers.offset_id = j10;
            tL_messages_getArchivedStickers.limit = 15;
            int i3 = this.I;
            if (i3 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_getArchivedStickers.masks = z10;
            if (i3 != 5) {
                z11 = false;
            }
            tL_messages_getArchivedStickers.emojis = z11;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new l(this, 0)), this.classGuid);
        }
    }

    public final void c0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f48156s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i3 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f27028id);
                HashSet hashSet = this.f48153f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f27028id));
                    this.h.add(stickerSetCovered2);
                    i3++;
                }
            }
            if (i3 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f48155r = z10;
            this.J = false;
            this.f48154n = true;
            org.telegram.ui.Components.gy gyVar = this.f48151c;
            if (gyVar != null) {
                gyVar.c();
            }
            d0();
            n nVar = this.f48150b;
            if (nVar != null) {
                nVar.f();
                return;
            }
            return;
        }
        this.f48157w = new org.telegram.messenger.voip.l0(10, this, tL_messages_archivedStickers);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i3 = this.I;
        if (i3 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754128, null));
        } else if (i3 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754134, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 23));
        this.f48150b = new n(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.f48151c = gyVar;
        if (i3 == 0) {
            gyVar.setText(org.telegram.messenger.bd.M0(2131754125, null));
        } else {
            gyVar.setText(org.telegram.messenger.bd.M0(2131754130, null));
        }
        if (this.J) {
            this.f48151c.b();
        } else {
            this.f48151c.c();
        }
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f48152e = tj0Var;
        tj0Var.setFocusable(true);
        this.f48152e.setEmptyView(this.f48151c);
        org.telegram.ui.Components.tj0 tj0Var2 = this.f48152e;
        u4.b0 b0Var = new u4.b0(1, false);
        this.d = b0Var;
        tj0Var2.setLayoutManager(b0Var);
        this.f48152e.r1();
        this.f48152e.setSectionsDrawBackground(true);
        frameLayout.addView(this.f48152e, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.f48151c, b8.mf.c(-1.0f, -1));
        this.f48152e.setAdapter(this.f48150b);
        this.f48152e.setOnItemClickListener(new h(this, 1));
        this.f48152e.setOnScrollListener(new h3(this, 1));
        return this.fragmentView;
    }

    public final void d0() {
        int i3;
        this.H = 0;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int i10 = this.I;
            if (i10 != 0 && i10 != 5) {
                i3 = -1;
            } else {
                i3 = this.H;
                this.H = i3 + 1;
            }
            this.f48158x = i3;
            int i11 = this.H;
            this.f48159y = i11;
            this.E = arrayList.size() + i11;
            int size = arrayList.size() + this.H;
            this.H = size;
            if (!this.f48155r) {
                this.H = size + 1;
                this.F = size;
                this.G = -1;
                return;
            }
            this.H = size + 1;
            this.G = size;
            this.F = -1;
            return;
        }
        this.f48158x = -1;
        this.f48159y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Components.tj0 tj0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i3 == org.telegram.messenger.hs.Y0) {
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i11)).set.f27028id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f27028id) {
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
                n nVar = this.f48150b;
                if (nVar != null) {
                    nVar.o(this.f48159y, arrayList2.size());
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23333x0 && (tj0Var = this.f48152e) != null) {
            int childCount = tj0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f48152e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean B0 = org.telegram.messenger.li.b0(this.currentAccount).B0(stickersSet.set.f27028id, true);
                    if (B0) {
                        this.f48149a.l(stickersSet.set.f27028id);
                        org.telegram.ui.Components.dg0 dg0Var = vVar.f30700f;
                        if (dg0Var != null) {
                            dg0Var.a(false, true);
                        }
                    }
                    vVar.a(B0, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f48152e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48151c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        org.telegram.ui.Components.gy gyVar = this.f48151c;
        int i3 = org.telegram.ui.ActionBar.k6.f27955h6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(gyVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48152e, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48152e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
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
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.Y0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23333x0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.Y0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23333x0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        n nVar = this.f48150b;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.gy gyVar = this.f48151c;
            if (gyVar != null) {
                gyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27955h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f48156s = false;
        org.telegram.messenger.voip.l0 l0Var = this.f48157w;
        if (l0Var != null) {
            l0Var.run();
            this.f48157w = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f48156s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

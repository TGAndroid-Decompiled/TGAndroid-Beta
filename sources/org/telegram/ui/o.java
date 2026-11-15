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
public final class o extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public int E;
    public int F;
    public int G;
    public int H;
    public final int I;
    public boolean J;
    public final a0.h f49726a;
    public n f49727b;
    public org.telegram.ui.Components.ny f49728c;
    public v4.b0 d;
    public org.telegram.ui.Components.uj0 f49729e;
    public final HashSet f49730f;
    public final ArrayList h;
    public boolean f49731n;
    public boolean f49732r;
    public boolean f49733s;
    public oi.u4 f49734w;
    public int f49735x;
    public int f49736y;

    public o(int i7) {
        super(null);
        this.f49726a = new a0.h();
        this.f49730f = new HashSet();
        this.h = new ArrayList();
        this.I = i7;
    }

    public static int a0(o oVar) {
        return oVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    public final void b0() {
        long j3;
        boolean z10;
        if (!this.J && !this.f49732r) {
            boolean z11 = true;
            this.J = true;
            org.telegram.ui.Components.ny nyVar = this.f49728c;
            if (nyVar != null && !this.f49731n) {
                nyVar.b();
            }
            n nVar = this.f49727b;
            if (nVar != null) {
                nVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j3 = 0;
            } else {
                j3 = ((TLRPC.StickerSetCovered) i5.c.h(1, arrayList)).set.f28078id;
            }
            tL_messages_getArchivedStickers.offset_id = j3;
            tL_messages_getArchivedStickers.limit = 15;
            int i7 = this.I;
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_messages_getArchivedStickers.masks = z10;
            if (i7 != 5) {
                z11 = false;
            }
            tL_messages_getArchivedStickers.emojis = z11;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new l(this, 0)), this.classGuid);
        }
    }

    public final void c0(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        boolean z10;
        if (!this.f49733s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f28078id);
                HashSet hashSet = this.f49730f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f28078id));
                    this.h.add(stickerSetCovered2);
                    i7++;
                }
            }
            if (i7 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f49732r = z10;
            this.J = false;
            this.f49731n = true;
            org.telegram.ui.Components.ny nyVar = this.f49728c;
            if (nyVar != null) {
                nyVar.c();
            }
            d0();
            n nVar = this.f49727b;
            if (nVar != null) {
                nVar.f();
                return;
            }
            return;
        }
        this.f49734w = new oi.u4(24, this, tL_messages_archivedStickers);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.I;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131754128, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131754134, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131754133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 23));
        this.f49727b = new n(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.f49728c = nyVar;
        if (i7 == 0) {
            nyVar.setText(org.telegram.messenger.hd.M0(2131754125, null));
        } else {
            nyVar.setText(org.telegram.messenger.hd.M0(2131754130, null));
        }
        if (this.J) {
            this.f49728c.b();
        } else {
            this.f49728c.c();
        }
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f49729e = uj0Var;
        uj0Var.setFocusable(true);
        this.f49729e.setEmptyView(this.f49728c);
        org.telegram.ui.Components.uj0 uj0Var2 = this.f49729e;
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        uj0Var2.setLayoutManager(b0Var);
        this.f49729e.r1();
        this.f49729e.setSectionsDrawBackground(true);
        frameLayout.addView(this.f49729e, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.f49728c, c8.ja.c(-1.0f, -1));
        this.f49729e.setAdapter(this.f49727b);
        this.f49729e.setOnItemClickListener(new h(this, 1));
        this.f49729e.setOnScrollListener(new g3(this, 1));
        return this.fragmentView;
    }

    public final void d0() {
        int i7;
        this.H = 0;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            int i10 = this.I;
            if (i10 != 0 && i10 != 5) {
                i7 = -1;
            } else {
                i7 = this.H;
                this.H = i7 + 1;
            }
            this.f49735x = i7;
            int i11 = this.H;
            this.f49736y = i11;
            this.E = arrayList.size() + i11;
            int size = arrayList.size() + this.H;
            this.H = size;
            if (!this.f49732r) {
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
        this.f49735x = -1;
        this.f49736y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.uj0 uj0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i7 == org.telegram.messenger.ns.Y0) {
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i11)).set.f28078id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f28078id) {
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
                n nVar = this.f49727b;
                if (nVar != null) {
                    nVar.o(this.f49736y, arrayList2.size());
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25601x0 && (uj0Var = this.f49729e) != null) {
            int childCount = uj0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f49729e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean B0 = org.telegram.messenger.si.b0(this.currentAccount).B0(stickersSet.set.f28078id, true);
                    if (B0) {
                        this.f49726a.l(stickersSet.set.f28078id);
                        org.telegram.ui.Components.dg0 dg0Var = vVar.f31776f;
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
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f49729e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f49728c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        org.telegram.ui.Components.ny nyVar = this.f49728c;
        int i7 = org.telegram.ui.ActionBar.j6.f28923h6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(nyVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f49729e, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f49729e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Hi));
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
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.Y0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25601x0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.Y0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25601x0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        n nVar = this.f49727b;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.ny nyVar = this.f49728c;
            if (nyVar != null) {
                nyVar.setProgressBarColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28923h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f49733s = false;
        oi.u4 u4Var = this.f49734w;
        if (u4Var != null) {
            u4Var.run();
            this.f49734w = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f49733s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

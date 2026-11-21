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
public final class o extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public int E;
    public int F;
    public int G;
    public int H;
    public final int I;
    public boolean J;
    public final a0.h f50373a;
    public n f50374b;
    public org.telegram.ui.Components.vy f50375c;
    public v4.c0 d;
    public org.telegram.ui.Components.ek0 f50376e;
    public final HashSet f50377f;
    public final ArrayList h;
    public boolean f50378n;
    public boolean f50379r;
    public boolean f50380s;
    public oi.t f50381w;
    public int f50382x;
    public int f50383y;

    public o(int i7) {
        super(null);
        this.f50373a = new a0.h();
        this.f50377f = new HashSet();
        this.h = new ArrayList();
        this.I = i7;
    }

    public static int a0(o oVar) {
        return oVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29789z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29379d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29715v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29378d6));
    }

    public final void b0() {
        long j3;
        boolean z10;
        if (!this.J && !this.f50379r) {
            boolean z11 = true;
            this.J = true;
            org.telegram.ui.Components.vy vyVar = this.f50375c;
            if (vyVar != null && !this.f50378n) {
                vyVar.b();
            }
            n nVar = this.f50374b;
            if (nVar != null) {
                nVar.f();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j3 = 0;
            } else {
                j3 = ((TLRPC.StickerSetCovered) i5.c.h(1, arrayList)).set.f28458id;
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
        if (!this.f50380s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i10);
                i10++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f28458id);
                HashSet hashSet = this.f50377f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f28458id));
                    this.h.add(stickerSetCovered2);
                    i7++;
                }
            }
            if (i7 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f50379r = z10;
            this.J = false;
            this.f50378n = true;
            org.telegram.ui.Components.vy vyVar = this.f50375c;
            if (vyVar != null) {
                vyVar.c();
            }
            d0();
            n nVar = this.f50374b;
            if (nVar != null) {
                nVar.f();
                return;
            }
            return;
        }
        this.f50381w = new oi.t(22, this, tL_messages_archivedStickers);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.I;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131754125, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131754131, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131754130, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 25));
        this.f50374b = new n(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.f50375c = vyVar;
        if (i7 == 0) {
            vyVar.setText(org.telegram.messenger.gd.N0(2131754122, null));
        } else {
            vyVar.setText(org.telegram.messenger.gd.N0(2131754127, null));
        }
        if (this.J) {
            this.f50375c.b();
        } else {
            this.f50375c.c();
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f50376e = ek0Var;
        ek0Var.setFocusable(true);
        this.f50376e.setEmptyView(this.f50375c);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f50376e;
        v4.c0 c0Var = new v4.c0(1, false);
        this.d = c0Var;
        ek0Var2.setLayoutManager(c0Var);
        this.f50376e.r1();
        this.f50376e.setSectionsDrawBackground(true);
        frameLayout.addView(this.f50376e, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.f50375c, c8.ma.c(-1.0f, -1));
        this.f50376e.setAdapter(this.f50374b);
        this.f50376e.setOnItemClickListener(new h(this, 1));
        this.f50376e.setOnScrollListener(new g3(this, 1));
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
            this.f50382x = i7;
            int i11 = this.H;
            this.f50383y = i11;
            this.E = arrayList.size() + i11;
            int size = arrayList.size() + this.H;
            this.H = size;
            if (!this.f50379r) {
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
        this.f50382x = -1;
        this.f50383y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.ek0 ek0Var;
        org.telegram.ui.Cells.v vVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i7 == org.telegram.messenger.ks.Y0) {
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i11)).set.f28458id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f28458id) {
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
                n nVar = this.f50374b;
                if (nVar != null) {
                    nVar.o(this.f50383y, arrayList2.size());
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25246x0 && (ek0Var = this.f50376e) != null) {
            int childCount = ek0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f50376e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean E0 = org.telegram.messenger.ri.d0(this.currentAccount).E0(stickersSet.set.f28458id, true);
                    if (E0) {
                        this.f50373a.l(stickersSet.set.f28458id);
                        org.telegram.ui.Components.pg0 pg0Var = vVar.f32085f;
                        if (pg0Var != null) {
                            pg0Var.a(false, true);
                        }
                    }
                    vVar.a(E0, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f50376e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50375c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29361c7));
        org.telegram.ui.Components.vy vyVar = this.f50375c;
        int i7 = org.telegram.ui.ActionBar.m6.f29452h6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(vyVar, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50376e, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50376e, 196608, new Class[]{org.telegram.ui.Cells.v.class}, new String[]{"addButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Hi));
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
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.Y0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25246x0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.Y0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25246x0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        n nVar = this.f50374b;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.vy vyVar = this.f50375c;
            if (vyVar != null) {
                vyVar.setProgressBarColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29452h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f50380s = false;
        oi.t tVar = this.f50381w;
        if (tVar != null) {
            tVar.run();
            this.f50381w = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f50380s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

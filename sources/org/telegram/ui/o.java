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
    public final a0.h f42040a;
    public n f42041b;
    public org.telegram.ui.Components.uz f42042c;
    public s4.c0 d;
    public org.telegram.ui.Components.mm0 e;
    public final HashSet f42043f;
    public final ArrayList h;
    public boolean f42044n;
    public boolean f42045r;
    public boolean f42046s;
    public org.telegram.messenger.voip.m0 v;
    public int f42047w;
    public int f42048x;
    public int f42049y;

    public o(int i10) {
        super(null);
        this.f42040a = new a0.h();
        this.f42043f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int W(o oVar) {
        return oVar.currentAccount;
    }

    public final void X() {
        long j10;
        boolean z10;
        if (!this.I && !this.f42045r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.uz uzVar = this.f42042c;
            if (uzVar != null && !this.f42044n) {
                uzVar.b();
            }
            n nVar = this.f42041b;
            if (nVar != null) {
                nVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.StickerSetCovered) ic.a.g(1, arrayList)).set.f22054id;
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
        if (!this.f42046s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f22054id);
                HashSet hashSet = this.f42043f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f22054id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f42045r = z10;
            this.I = false;
            this.f42044n = true;
            org.telegram.ui.Components.uz uzVar = this.f42042c;
            if (uzVar != null) {
                uzVar.c();
            }
            Z();
            n nVar = this.f42041b;
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
            this.f42047w = i10;
            int i12 = this.G;
            this.f42048x = i12;
            this.f42049y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f42045r) {
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
        this.f42047w = -1;
        this.f42048x = -1;
        this.f42049y = -1;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
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
        this.f42041b = new n(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.f42042c = uzVar;
        if (i10 == 0) {
            uzVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            uzVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        if (this.I) {
            this.f42042c.b();
        } else {
            this.f42042c.c();
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.e = mm0Var;
        mm0Var.setFocusable(true);
        this.e.setEmptyView(this.f42042c);
        org.telegram.ui.Components.mm0 mm0Var2 = this.e;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        mm0Var2.setLayoutManager(c0Var);
        this.e.u1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.f42042c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.e.setAdapter(this.f42041b);
        this.e.setOnItemClickListener(new h(this, 1));
        this.e.setOnScrollListener(new i3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.mm0 mm0Var;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f22054id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f22054id) {
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
                n nVar = this.f42041b;
                if (nVar != null) {
                    nVar.s(this.f42048x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (mm0Var = this.e) != null) {
            int childCount = mm0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.v) && (stickersSet = (vVar = (org.telegram.ui.Cells.v) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f22054id);
                    if (isStickerPackInstalled) {
                        this.f42040a.l(stickersSet.set.f22054id);
                        org.telegram.ui.Components.wi0 wi0Var = vVar.f25492f;
                        if (wi0Var != null) {
                            wi0Var.a(false, true);
                        }
                    }
                    vVar.a(isStickerPackInstalled, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42042c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23336c7));
        org.telegram.ui.Components.uz uzVar = this.f42042c;
        int i10 = org.telegram.ui.ActionBar.y6.f23426h6;
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
    public final void onResume() {
        super.onResume();
        n nVar = this.f42041b;
        if (nVar != null) {
            nVar.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.uz uzVar = this.f42042c;
            if (uzVar != null) {
                uzVar.setProgressBarColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23426h6, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f42046s = false;
        org.telegram.messenger.voip.m0 m0Var = this.v;
        if (m0Var != null) {
            m0Var.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f42046s = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

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
public final class q extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public final int H;
    public boolean I;
    public final a0.i f40936a;
    public p f40937b;
    public org.telegram.ui.Components.c00 f40938c;
    public s4.d0 d;
    public org.telegram.ui.Components.qm0 f40939e;
    public final HashSet f40940f;
    public final ArrayList h;
    public boolean f40941n;
    public boolean f40942r;
    public boolean f40943s;
    public org.telegram.ui.ActionBar.p v;
    public int f40944w;
    public int f40945x;
    public int f40946y;

    public q(int i10) {
        super(null);
        this.f40936a = new a0.i();
        this.f40940f = new HashSet();
        this.h = new ArrayList();
        this.H = i10;
    }

    public static int V(q qVar) {
        return qVar.currentAccount;
    }

    public final void W() {
        long j3;
        boolean z10;
        if (!this.I && !this.f40942r) {
            boolean z11 = true;
            this.I = true;
            org.telegram.ui.Components.c00 c00Var = this.f40938c;
            if (c00Var != null && !this.f40941n) {
                c00Var.b();
            }
            p pVar = this.f40937b;
            if (pVar != null) {
                pVar.l();
            }
            TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
            ArrayList arrayList = this.h;
            if (arrayList.isEmpty()) {
                j3 = 0;
            } else {
                j3 = ((TLRPC.StickerSetCovered) hg.c.g(1, arrayList)).set.f20065id;
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
        if (!this.f40943s) {
            ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
                i11++;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                Long valueOf = Long.valueOf(stickerSetCovered2.set.f20065id);
                HashSet hashSet = this.f40940f;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Long.valueOf(stickerSetCovered2.set.f20065id));
                    this.h.add(stickerSetCovered2);
                    i10++;
                }
            }
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f40942r = z10;
            this.I = false;
            this.f40941n = true;
            org.telegram.ui.Components.c00 c00Var = this.f40938c;
            if (c00Var != null) {
                c00Var.c();
            }
            Y();
            p pVar = this.f40937b;
            if (pVar != null) {
                pVar.l();
                return;
            }
            return;
        }
        this.v = new org.telegram.ui.ActionBar.p(4, this, tL_messages_archivedStickers);
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
            this.f40944w = i10;
            int i12 = this.G;
            this.f40945x = i12;
            this.f40946y = arrayList.size() + i12;
            int size = arrayList.size() + this.G;
            this.G = size;
            if (!this.f40942r) {
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
        this.f40944w = -1;
        this.f40945x = -1;
        this.f40946y = -1;
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
        this.f40937b = new p(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        org.telegram.ui.Components.c00 c00Var = new org.telegram.ui.Components.c00(context, null);
        this.f40938c = c00Var;
        if (i10 == 0) {
            c00Var.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            c00Var.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.f40938c, w7.x5.d(-1.0f, -1));
        if (this.I) {
            this.f40938c.b();
        } else {
            this.f40938c.c();
        }
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f40939e = qm0Var;
        qm0Var.setFocusable(true);
        this.f40939e.setEmptyView(this.f40938c);
        org.telegram.ui.Components.qm0 qm0Var2 = this.f40939e;
        s4.d0 d0Var = new s4.d0(1, false);
        this.d = d0Var;
        qm0Var2.setLayoutManager(d0Var);
        this.f40939e.p1();
        this.actionBar.setAdaptiveBackground(this.f40939e);
        frameLayout.addView(this.f40939e, w7.x5.d(-1.0f, -1));
        this.f40939e.setAdapter(this.f40937b);
        this.f40939e.setOnItemClickListener(new i(this, 1));
        this.f40939e.setOnScrollListener(new i3(this, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.qm0 qm0Var;
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
                    } else if (((TLRPC.StickerSetCovered) arrayList.get(i12)).set.f20065id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.f20065id) {
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
                p pVar = this.f40937b;
                if (pVar != null) {
                    pVar.s(this.f40945x, arrayList2.size());
                }
            }
        } else if (i10 == NotificationCenter.stickersDidLoad && (qm0Var = this.f40939e) != null) {
            int childCount = qm0Var.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = this.f40939e.getChildAt(i13);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.f20065id);
                    if (isStickerPackInstalled) {
                        this.f40936a.l(stickersSet.set.f20065id);
                        org.telegram.ui.Components.cj0 cj0Var = wVar.f23574f;
                        if (cj0Var != null) {
                            cj0Var.a(false, true);
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40938c, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20781c7));
        org.telegram.ui.Components.c00 c00Var = this.f40938c;
        int i10 = org.telegram.ui.ActionBar.i6.f20869h6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(c00Var, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21199z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40939e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Qh));
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
        this.f40939e.setPadding(0, 0, 0, i13);
        this.f40939e.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        p pVar = this.f40937b;
        if (pVar != null) {
            pVar.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.f40943s = false;
        org.telegram.ui.ActionBar.p pVar = this.v;
        if (pVar != null) {
            pVar.run();
            this.v = null;
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.f40943s = true;
    }
}

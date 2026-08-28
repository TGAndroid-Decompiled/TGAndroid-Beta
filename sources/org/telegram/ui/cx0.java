package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class cx0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.wk0 f37339a;
    public f2.m0 f37340b;
    public bx0 f37341c;
    public org.telegram.ui.Components.yy d;
    public int f37342e;
    public int f37343f;
    public int h;
    public int f37344n;
    public int f37345r;
    public int f37346s;
    public int v;
    public int f37347w;
    public final boolean f37348x;
    public final int f37349y;

    public cx0() {
        super(null);
        this.f37349y = 1;
        this.f37348x = true;
    }

    public final void T(Long l10, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
        int i9 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false)));
        int i10 = this.f37349y;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, LocaleController.getString(R.string.Unblock), new ys0(10, this, l10), z10);
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            i9 = R.drawable.msg_user_remove;
        }
        H.m(z11, i9, LocaleController.getString(R.string.Remove), true, new ax0(this, l10));
        H.S = 190;
        H.Z();
    }

    public final void U() {
        this.f37342e = 0;
        this.f37343f = -1;
        this.f37344n = -1;
        this.h = -1;
        this.f37347w = -1;
        if (!this.f37348x || getMessagesController().totalBlockedCount >= 0) {
            int i9 = this.f37342e;
            int i10 = i9 + 1;
            this.f37342e = i10;
            this.f37343f = i9;
            int i11 = this.f37349y;
            if (i11 == 1) {
                this.f37342e = i9 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().blockePeers.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f37342e;
                        this.f37342e = i12 + 1;
                        this.f37344n = i12;
                    }
                    int i13 = this.f37342e;
                    this.f37345r = i13;
                    int i14 = i13 + size;
                    this.f37346s = i14;
                    int i15 = i14 + 1;
                    this.f37342e = i15;
                    this.v = i14;
                    if (i11 != 1) {
                        this.f37342e = i14 + 2;
                        this.f37347w = i15;
                    }
                } else {
                    this.f37344n = -1;
                    this.f37345r = -1;
                    this.f37346s = -1;
                    this.v = -1;
                    this.f37347w = -1;
                }
            } else {
                throw null;
            }
        }
        bx0 bx0Var = this.f37341c;
        if (bx0Var != null) {
            bx0Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = 2;
        int i10 = this.f37349y;
        if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.BlockedUsers));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.d = yyVar;
        if (i10 == 1) {
            yyVar.setText(LocaleController.getString(R.string.NoBlocked));
        } else {
            yyVar.setText(LocaleController.getString(R.string.NoContacts));
        }
        frameLayout.addView(this.d, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f37339a = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f37339a);
        this.f37339a.setItemSelectorColorProvider(new zw0(this));
        this.f37339a.setEmptyView(this.d);
        org.telegram.ui.Components.wk0 wk0Var2 = this.f37339a;
        f2.m0 m0Var = new f2.m0(1, false);
        this.f37340b = m0Var;
        wk0Var2.setLayoutManager(m0Var);
        this.f37339a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.wk0 wk0Var3 = this.f37339a;
        bx0 bx0Var = new bx0(this, context);
        this.f37341c = bx0Var;
        wk0Var3.setAdapter(bx0Var);
        org.telegram.ui.Components.wk0 wk0Var4 = this.f37339a;
        if (LocaleController.isRTL) {
            i9 = 1;
        }
        wk0Var4.setVerticalScrollbarPosition(i9);
        frameLayout.addView(this.f37339a, g7.e6.c(-1.0f, -1));
        this.f37339a.setOnItemClickListener(new i(this, 26));
        this.f37339a.setOnItemLongClickListener(new zw0(this));
        if (i10 == 1) {
            this.f37339a.setOnScrollListener(new l3(this, 26));
            if (getMessagesController().totalBlockedCount < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        U();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.wk0 wk0Var;
        if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) && (wk0Var = this.f37339a) != null) {
                int childCount = wk0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f37339a.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        ((org.telegram.ui.Cells.b5) childAt).c(intValue);
                    }
                }
            }
        } else if (i9 == NotificationCenter.blockedUsersDidLoad) {
            this.d.c();
            U();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 29);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23303u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f37339a, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23319v6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (this.f37349y == 1) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (this.f37349y == 1) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f37339a.setPadding(0, 0, 0, i12);
        this.f37339a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        bx0 bx0Var = this.f37341c;
        if (bx0Var != null) {
            bx0Var.l();
        }
    }
}

package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class nv extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.as0 f39050x = new org.telegram.ui.Components.as0(2);
    public uy f39051a;
    public ContactsActivity f39052b;
    public org.telegram.ui.ActionBar.v0 f39053c;
    public Paint d;
    public ScrollSlidingTextTabStrip f39054e;
    public mv[] f39055f;
    public AnimatorSet h;
    public boolean f39056n;
    public boolean f39057r;
    public boolean f39058s;
    public int v;
    public boolean f39059w;

    public static void S(nv nvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.e5.w0(nvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(nvVar.currentAccount).blockPeer(user.f20189id);
            org.telegram.ui.Components.e5.w0(nvVar, LocaleController.getString(R.string.UserBlocked));
        }
        nvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(nv nvVar) {
        return nvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(nv nvVar) {
        return nvVar.actionBar;
    }

    public static void j0(nv nvVar, float f7) {
        mv[] mvVarArr = nvVar.f39055f;
        nvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < mvVarArr.length; i10++) {
            int i11 = (int) f7;
            mvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = mvVarArr[i10].f38769e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        nvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.zl0 zl0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f39052b;
        uy uyVar = this.f39051a;
        mv[] mvVarArr = this.f39055f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        boolean z10 = false;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 10);
        this.f39053c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f39054e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f39054e, w7.z5.e(-1, 44, 83));
        this.f39054e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        lv lvVar = new lv(this, context);
        this.fragmentView = lvVar;
        lvVar.setWillNotDraw(false);
        uyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < mvVarArr.length; i10++) {
            mv mvVar = new mv(this, context);
            mvVarArr[i10] = mvVar;
            lvVar.addView(mvVar, w7.z5.c(-1.0f, -1));
            if (i10 == 0) {
                mv mvVar2 = mvVarArr[i10];
                mvVar2.f38766a = uyVar;
                mvVar2.d = uyVar.f41400e0[0].f40990a;
                uyVar.V3();
                dy dyVar = uyVar.C0;
                if (dyVar != null) {
                    w0Var = dyVar.f30122a0;
                } else {
                    w0Var = null;
                }
                mvVar2.f38769e = w0Var;
            } else if (i10 == 1) {
                mv mvVar3 = mvVarArr[i10];
                mvVar3.f38766a = contactsActivity;
                mvVar3.d = contactsActivity.f33697f;
                mvVar3.setVisibility(8);
            }
            mvVarArr[i10].d.setScrollingTouchSlop(1);
            mv mvVar4 = mvVarArr[i10];
            mvVar4.f38767b = (FrameLayout) mvVar4.f38766a.getFragmentView();
            mv mvVar5 = mvVarArr[i10];
            mvVar5.f38768c = mvVar5.f38766a.getActionBar();
            mv mvVar6 = mvVarArr[i10];
            mvVar6.addView(mvVar6.f38767b, w7.z5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(mvVarArr[i10].f38768c);
            mv mvVar7 = mvVarArr[i10];
            mvVar7.addView(mvVar7.f38768c, w7.z5.c(-2.0f, -1));
            mvVarArr[i10].f38768c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    zl0Var = mvVarArr[i10].d;
                } else {
                    zl0Var = mvVarArr[i10].f38769e;
                }
                if (zl0Var != null) {
                    zl0Var.setClipToPadding(false);
                    zl0Var.setOnScrollListener(new ii.n3(5, this, zl0Var.getOnScrollListener()));
                }
            }
        }
        lvVar.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f39054e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.f39054e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.f39054e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.f39054e.getCurrentTabId();
            if (currentTabId >= 0) {
                mvVarArr[0].f38770f = currentTabId;
            }
            this.f39054e.c();
        }
        m0(false);
        if (this.f39054e.getCurrentTabId() == this.f39054e.getFirstTabId()) {
            z10 = true;
        }
        this.f39059w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39054e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39054e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39054e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, new Drawable[]{this.f39054e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.i6.L8));
        arrayList.addAll(this.f39051a.getThemeDescriptions());
        arrayList.addAll(this.f39052b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f39059w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.w2(27, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.zl0 zl0Var;
        mv[] mvVarArr = this.f39055f;
        for (int i10 = 0; i10 < mvVarArr.length; i10++) {
            mvVarArr[i10].d.C0();
            ai.w0 w0Var = mvVarArr[i10].f38769e;
            if (w0Var != null) {
                w0Var.C0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                zl0Var = mvVarArr[z10 ? 1 : 0].d;
            } else {
                zl0Var = mvVarArr[z10 ? 1 : 0].f38769e;
            }
            if (zl0Var != null) {
                zl0Var.getAdapter();
                zl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) zl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        uy uyVar = this.f39051a;
        if (uyVar != null) {
            uyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f39052b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        uy uyVar = this.f39051a;
        if (uyVar != null) {
            uyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f39052b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        uy uyVar = this.f39051a;
        if (uyVar != null) {
            uyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f39052b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

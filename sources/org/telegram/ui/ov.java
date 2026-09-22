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
public final class ov extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.wr0 f36409x = new org.telegram.ui.Components.wr0(2);
    public uy f36410a;
    public ContactsActivity f36411b;
    public org.telegram.ui.ActionBar.v0 f36412c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public nv[] f36413f;
    public AnimatorSet h;
    public boolean f36414n;
    public boolean f36415r;
    public boolean f36416s;
    public int v;
    public boolean f36417w;

    public static void U(ov ovVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.d5.w0(ovVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(ovVar.currentAccount).blockPeer(user.f18490id);
            org.telegram.ui.Components.d5.w0(ovVar, LocaleController.getString(R.string.UserBlocked));
        }
        ovVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(ov ovVar) {
        return ovVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(ov ovVar) {
        return ovVar.actionBar;
    }

    public static void j0(ov ovVar, float f7) {
        nv[] nvVarArr = ovVar.f36413f;
        ovVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < nvVarArr.length; i10++) {
            int i11 = (int) f7;
            nvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = nvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        ovVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.yl0 yl0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f36411b;
        uy uyVar = this.f36410a;
        nv[] nvVarArr = this.f36413f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        boolean z10 = false;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 10);
        this.f36412c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.y5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        mv mvVar = new mv(this, context);
        this.fragmentView = mvVar;
        mvVar.setWillNotDraw(false);
        uyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < nvVarArr.length; i10++) {
            nv nvVar = new nv(this, context);
            nvVarArr[i10] = nvVar;
            mvVar.addView(nvVar, w7.y5.c(-1.0f, -1));
            if (i10 == 0) {
                nv nvVar2 = nvVarArr[i10];
                nvVar2.f36152a = uyVar;
                nvVar2.d = uyVar.f38277e0[0].f37905a;
                uyVar.M3();
                ey eyVar = uyVar.C0;
                if (eyVar != null) {
                    w0Var = eyVar.W;
                } else {
                    w0Var = null;
                }
                nvVar2.e = w0Var;
            } else if (i10 == 1) {
                nv nvVar3 = nvVarArr[i10];
                nvVar3.f36152a = contactsActivity;
                nvVar3.d = contactsActivity.f31047f;
                nvVar3.setVisibility(8);
            }
            nvVarArr[i10].d.setScrollingTouchSlop(1);
            nv nvVar4 = nvVarArr[i10];
            nvVar4.f36153b = (FrameLayout) nvVar4.f36152a.getFragmentView();
            nv nvVar5 = nvVarArr[i10];
            nvVar5.f36154c = nvVar5.f36152a.getActionBar();
            nv nvVar6 = nvVarArr[i10];
            nvVar6.addView(nvVar6.f36153b, w7.y5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(nvVarArr[i10].f36154c);
            nv nvVar7 = nvVarArr[i10];
            nvVar7.addView(nvVar7.f36154c, w7.y5.c(-2.0f, -1));
            nvVarArr[i10].f36154c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    yl0Var = nvVarArr[i10].d;
                } else {
                    yl0Var = nvVarArr[i10].e;
                }
                if (yl0Var != null) {
                    yl0Var.setClipToPadding(false);
                    yl0Var.setOnScrollListener(new ii.m3(5, this, yl0Var.getOnScrollListener()));
                }
            }
        }
        mvVar.addView(this.actionBar, w7.y5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                nvVarArr[0].f36155f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f36417w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19109d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19387s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.j6.L8));
        arrayList.addAll(this.f36410a.getThemeDescriptions());
        arrayList.addAll(this.f36411b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f36417w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.a3(25, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.yl0 yl0Var;
        nv[] nvVarArr = this.f36413f;
        for (int i10 = 0; i10 < nvVarArr.length; i10++) {
            nvVarArr[i10].d.C0();
            ai.w0 w0Var = nvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.C0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                yl0Var = nvVarArr[z10 ? 1 : 0].d;
            } else {
                yl0Var = nvVarArr[z10 ? 1 : 0].e;
            }
            if (yl0Var != null) {
                yl0Var.getAdapter();
                yl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) yl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        uy uyVar = this.f36410a;
        if (uyVar != null) {
            uyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f36411b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        uy uyVar = this.f36410a;
        if (uyVar != null) {
            uyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f36411b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        uy uyVar = this.f36410a;
        if (uyVar != null) {
            uyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f36411b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

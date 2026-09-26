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
public final class jv extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.ur0 f34873x = new org.telegram.ui.Components.ur0(2);
    public qy f34874a;
    public ContactsActivity f34875b;
    public org.telegram.ui.ActionBar.u0 f34876c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public iv[] f34877f;
    public AnimatorSet h;
    public boolean f34878n;
    public boolean f34879r;
    public boolean f34880s;
    public int v;
    public boolean f34881w;

    public static void U(jv jvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.e5.w0(jvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(jvVar.currentAccount).blockPeer(user.f18482id);
            org.telegram.ui.Components.e5.w0(jvVar, LocaleController.getString(R.string.UserBlocked));
        }
        jvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(jv jvVar) {
        return jvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(jv jvVar) {
        return jvVar.actionBar;
    }

    public static void j0(jv jvVar, float f7) {
        iv[] ivVarArr = jvVar.f34877f;
        jvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < ivVarArr.length; i10++) {
            int i11 = (int) f7;
            ivVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = ivVarArr[i10].e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        jvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.wl0 wl0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f34875b;
        qy qyVar = this.f34874a;
        iv[] ivVarArr = this.f34877f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        boolean z10 = false;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 9);
        this.f34876c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.y5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        hv hvVar = new hv(this, context);
        this.fragmentView = hvVar;
        hvVar.setWillNotDraw(false);
        qyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < ivVarArr.length; i10++) {
            iv ivVar = new iv(this, context);
            ivVarArr[i10] = ivVar;
            hvVar.addView(ivVar, w7.y5.c(-1.0f, -1));
            if (i10 == 0) {
                iv ivVar2 = ivVarArr[i10];
                ivVar2.f34583a = qyVar;
                ivVar2.d = qyVar.f37033e0[0].f36694a;
                qyVar.M3();
                zx zxVar = qyVar.C0;
                if (zxVar != null) {
                    w0Var = zxVar.V;
                } else {
                    w0Var = null;
                }
                ivVar2.e = w0Var;
            } else if (i10 == 1) {
                iv ivVar3 = ivVarArr[i10];
                ivVar3.f34583a = contactsActivity;
                ivVar3.d = contactsActivity.f31028f;
                ivVar3.setVisibility(8);
            }
            ivVarArr[i10].d.setScrollingTouchSlop(1);
            iv ivVar4 = ivVarArr[i10];
            ivVar4.f34584b = (FrameLayout) ivVar4.f34583a.getFragmentView();
            iv ivVar5 = ivVarArr[i10];
            ivVar5.f34585c = ivVar5.f34583a.getActionBar();
            iv ivVar6 = ivVarArr[i10];
            ivVar6.addView(ivVar6.f34584b, w7.y5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(ivVarArr[i10].f34585c);
            iv ivVar7 = ivVarArr[i10];
            ivVar7.addView(ivVar7.f34585c, w7.y5.c(-2.0f, -1));
            ivVarArr[i10].f34585c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    wl0Var = ivVarArr[i10].d;
                } else {
                    wl0Var = ivVarArr[i10].e;
                }
                if (wl0Var != null) {
                    wl0Var.setClipToPadding(false);
                    wl0Var.setOnScrollListener(new ii.n3(5, this, wl0Var.getOnScrollListener()));
                }
            }
        }
        hvVar.addView(this.actionBar, w7.y5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                ivVarArr[0].f34586f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f34881w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19059d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.h6.L8));
        arrayList.addAll(this.f34874a.getThemeDescriptions());
        arrayList.addAll(this.f34875b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f34881w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
            a2Var.R = string;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.w2(26, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.wl0 wl0Var;
        iv[] ivVarArr = this.f34877f;
        for (int i10 = 0; i10 < ivVarArr.length; i10++) {
            ivVarArr[i10].d.B0();
            ai.w0 w0Var = ivVarArr[i10].e;
            if (w0Var != null) {
                w0Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                wl0Var = ivVarArr[z10 ? 1 : 0].d;
            } else {
                wl0Var = ivVarArr[z10 ? 1 : 0].e;
            }
            if (wl0Var != null) {
                wl0Var.getAdapter();
                wl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) wl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        qy qyVar = this.f34874a;
        if (qyVar != null) {
            qyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f34875b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        qy qyVar = this.f34874a;
        if (qyVar != null) {
            qyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f34875b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        qy qyVar = this.f34874a;
        if (qyVar != null) {
            qyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f34875b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

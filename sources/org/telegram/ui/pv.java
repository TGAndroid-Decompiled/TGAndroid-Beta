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
public final class pv extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.kr0 f36738x = new org.telegram.ui.Components.kr0(2);
    public wy f36739a;
    public ContactsActivity f36740b;
    public org.telegram.ui.ActionBar.w0 f36741c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public ov[] f36742f;
    public AnimatorSet h;
    public boolean f36743n;
    public boolean f36744r;
    public boolean f36745s;
    public int v;
    public boolean f36746w;

    public static void U(pv pvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.c5.w0(pvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(pvVar.currentAccount).blockPeer(user.f18268id);
            org.telegram.ui.Components.c5.w0(pvVar, LocaleController.getString(R.string.UserBlocked));
        }
        pvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(pv pvVar) {
        return pvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(pv pvVar) {
        return pvVar.actionBar;
    }

    public static void j0(pv pvVar, float f7) {
        ov[] ovVarArr = pvVar.f36742f;
        pvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            int i11 = (int) f7;
            ovVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = ovVarArr[i10].e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        pvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.ml0 ml0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f36740b;
        wy wyVar = this.f36739a;
        ov[] ovVarArr = this.f36742f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        boolean z10 = false;
        if (e5Var != null && ((ActionBarLayout) e5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 10);
        this.f36741c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.x5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        nv nvVar = new nv(this, context);
        this.fragmentView = nvVar;
        nvVar.setWillNotDraw(false);
        wyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            ov ovVar = new ov(this, context);
            ovVarArr[i10] = ovVar;
            nvVar.addView(ovVar, w7.x5.c(-1.0f, -1));
            if (i10 == 0) {
                ov ovVar2 = ovVarArr[i10];
                ovVar2.f36433a = wyVar;
                ovVar2.d = wyVar.f39221e0[0].f38527a;
                wyVar.M3();
                gy gyVar = wyVar.C0;
                if (gyVar != null) {
                    w0Var = gyVar.W;
                } else {
                    w0Var = null;
                }
                ovVar2.e = w0Var;
            } else if (i10 == 1) {
                ov ovVar3 = ovVarArr[i10];
                ovVar3.f36433a = contactsActivity;
                ovVar3.d = contactsActivity.f30759f;
                ovVar3.setVisibility(8);
            }
            ovVarArr[i10].d.setScrollingTouchSlop(1);
            ov ovVar4 = ovVarArr[i10];
            ovVar4.f36434b = (FrameLayout) ovVar4.f36433a.getFragmentView();
            ov ovVar5 = ovVarArr[i10];
            ovVar5.f36435c = ovVar5.f36433a.getActionBar();
            ov ovVar6 = ovVarArr[i10];
            ovVar6.addView(ovVar6.f36434b, w7.x5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(ovVarArr[i10].f36435c);
            ov ovVar7 = ovVarArr[i10];
            ovVar7.addView(ovVar7.f36435c, w7.x5.c(-2.0f, -1));
            ovVarArr[i10].f36435c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    ml0Var = ovVarArr[i10].d;
                } else {
                    ml0Var = ovVarArr[i10].e;
                }
                if (ml0Var != null) {
                    ml0Var.setClipToPadding(false);
                    ml0Var.setOnScrollListener(new ii.m3(5, this, ml0Var.getOnScrollListener()));
                }
            }
        }
        nvVar.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                ovVarArr[0].f36436f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f36746w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f18863d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19140s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19195v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19159t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.j6.L8));
        arrayList.addAll(this.f36739a.getThemeDescriptions());
        arrayList.addAll(this.f36740b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f36746w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
            c2Var.R = string;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.mf(24, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.ml0 ml0Var;
        ov[] ovVarArr = this.f36742f;
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            ovVarArr[i10].d.C0();
            ai.w0 w0Var = ovVarArr[i10].e;
            if (w0Var != null) {
                w0Var.C0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                ml0Var = ovVarArr[z10 ? 1 : 0].d;
            } else {
                ml0Var = ovVarArr[z10 ? 1 : 0].e;
            }
            if (ml0Var != null) {
                ml0Var.getAdapter();
                ml0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) ml0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        wy wyVar = this.f36739a;
        if (wyVar != null) {
            wyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f36740b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        wy wyVar = this.f36739a;
        if (wyVar != null) {
            wyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f36740b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        wy wyVar = this.f36739a;
        if (wyVar != null) {
            wyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f36740b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

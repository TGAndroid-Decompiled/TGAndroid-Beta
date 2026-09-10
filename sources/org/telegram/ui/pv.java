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
public final class pv extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.sr0 f35906x = new org.telegram.ui.Components.sr0(2);
    public wy f35907a;
    public ContactsActivity f35908b;
    public org.telegram.ui.ActionBar.w0 f35909c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public ov[] f35910f;
    public AnimatorSet h;
    public boolean f35911n;
    public boolean f35912r;
    public boolean f35913s;
    public int v;
    public boolean f35914w;

    public static void U(pv pvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.d5.w0(pvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(pvVar.currentAccount).blockPeer(user.f17342id);
            org.telegram.ui.Components.d5.w0(pvVar, LocaleController.getString(R.string.UserBlocked));
        }
        pvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.l h0(pv pvVar) {
        return pvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l i0(pv pvVar) {
        return pvVar.actionBar;
    }

    public static void j0(pv pvVar, float f7) {
        ov[] ovVarArr = pvVar.f35910f;
        pvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            int i11 = (int) f7;
            ovVarArr[i10].d.setPinnedSectionOffsetY(i11);
            bi.y1 y1Var = ovVarArr[i10].e;
            if (y1Var != null) {
                y1Var.setPinnedSectionOffsetY(i11);
            }
        }
        pvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.vl0 vl0Var;
        bi.y1 y1Var;
        ContactsActivity contactsActivity = this.f35908b;
        wy wyVar = this.f35907a;
        ov[] ovVarArr = this.f35910f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        boolean z10 = false;
        if (f5Var != null && ((ActionBarLayout) f5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 9);
        this.f35909c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.a6.e(-1, 44, 83));
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
            nvVar.addView(ovVar, w7.a6.c(-1.0f, -1));
            if (i10 == 0) {
                ov ovVar2 = ovVarArr[i10];
                ovVar2.f35616a = wyVar;
                ovVar2.d = wyVar.f38431e0[0].f37645a;
                wyVar.M3();
                gy gyVar = wyVar.C0;
                if (gyVar != null) {
                    y1Var = gyVar.V;
                } else {
                    y1Var = null;
                }
                ovVar2.e = y1Var;
            } else if (i10 == 1) {
                ov ovVar3 = ovVarArr[i10];
                ovVar3.f35616a = contactsActivity;
                ovVar3.d = contactsActivity.f29855f;
                ovVar3.setVisibility(8);
            }
            ovVarArr[i10].d.setScrollingTouchSlop(1);
            ov ovVar4 = ovVarArr[i10];
            ovVar4.f35617b = (FrameLayout) ovVar4.f35616a.getFragmentView();
            ov ovVar5 = ovVarArr[i10];
            ovVar5.f35618c = ovVar5.f35616a.getActionBar();
            ov ovVar6 = ovVarArr[i10];
            ovVar6.addView(ovVar6.f35617b, w7.a6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(ovVarArr[i10].f35618c);
            ov ovVar7 = ovVarArr[i10];
            ovVar7.addView(ovVar7.f35618c, w7.a6.c(-2.0f, -1));
            ovVarArr[i10].f35618c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    vl0Var = ovVarArr[i10].d;
                } else {
                    vl0Var = ovVarArr[i10].e;
                }
                if (vl0Var != null) {
                    vl0Var.setClipToPadding(false);
                    vl0Var.setOnScrollListener(new hi.p3(5, this, vl0Var.getOnScrollListener()));
                }
            }
        }
        nvVar.addView(this.actionBar, w7.a6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                ovVarArr[0].f35619f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f35914w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.j6.L8));
        arrayList.addAll(this.f35907a.getThemeDescriptions());
        arrayList.addAll(this.f35908b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f35914w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.km(20, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.vl0 vl0Var;
        ov[] ovVarArr = this.f35910f;
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            ovVarArr[i10].d.B0();
            bi.y1 y1Var = ovVarArr[i10].e;
            if (y1Var != null) {
                y1Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                vl0Var = ovVarArr[z10 ? 1 : 0].d;
            } else {
                vl0Var = ovVarArr[z10 ? 1 : 0].e;
            }
            if (vl0Var != null) {
                vl0Var.getAdapter();
                vl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) vl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        wy wyVar = this.f35907a;
        if (wyVar != null) {
            wyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f35908b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        wy wyVar = this.f35907a;
        if (wyVar != null) {
            wyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f35908b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        wy wyVar = this.f35907a;
        if (wyVar != null) {
            wyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f35908b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

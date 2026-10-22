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
public final class av extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.gs0 f35430x = new org.telegram.ui.Components.gs0(2);
    public cy f35431a;
    public ContactsActivity f35432b;
    public org.telegram.ui.ActionBar.u0 f35433c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public zu[] f35434f;
    public AnimatorSet h;
    public boolean f35435n;
    public boolean f35436r;
    public boolean f35437s;
    public int v;
    public boolean f35438w;

    public static void U(av avVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.f5.v0(avVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(avVar.currentAccount).blockPeer(user.f20426id);
            org.telegram.ui.Components.f5.v0(avVar, LocaleController.getString(R.string.UserBlocked));
        }
        avVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(av avVar) {
        return avVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(av avVar) {
        return avVar.actionBar;
    }

    public static void j0(av avVar, float f7) {
        zu[] zuVarArr = avVar.f35434f;
        avVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < zuVarArr.length; i10++) {
            int i11 = (int) f7;
            zuVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.u1 u1Var = zuVarArr[i10].e;
            if (u1Var != null) {
                u1Var.setPinnedSectionOffsetY(i11);
            }
        }
        avVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.jm0 jm0Var;
        ai.u1 u1Var;
        ContactsActivity contactsActivity = this.f35432b;
        cy cyVar = this.f35431a;
        zu[] zuVarArr = this.f35434f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        boolean z10 = false;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 23));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 9);
        this.f35433c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.z5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        yu yuVar = new yu(this, context);
        this.fragmentView = yuVar;
        yuVar.setWillNotDraw(false);
        cyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < zuVarArr.length) {
            zu zuVar = new zu(this, context);
            zuVarArr[i10] = zuVar;
            yuVar.addView(zuVar, w7.z5.c(-1.0f, -1));
            if (i10 == 0) {
                zu zuVar2 = zuVarArr[i10];
                zuVar2.f43807a = cyVar;
                f7 = f10;
                zuVar2.d = cyVar.f36095e0[0].f35446a;
                cyVar.K3();
                lx lxVar = cyVar.C0;
                if (lxVar != null) {
                    u1Var = lxVar.V;
                } else {
                    u1Var = null;
                }
                zuVar2.e = u1Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    zu zuVar3 = zuVarArr[i10];
                    zuVar3.f43807a = contactsActivity;
                    zuVar3.d = contactsActivity.f33087f;
                    zuVar3.setVisibility(8);
                }
            }
            zuVarArr[i10].d.setScrollingTouchSlop(1);
            zu zuVar4 = zuVarArr[i10];
            zuVar4.f43808b = (FrameLayout) zuVar4.f43807a.getFragmentView();
            zu zuVar5 = zuVarArr[i10];
            zuVar5.f43809c = zuVar5.f43807a.getActionBar();
            zu zuVar6 = zuVarArr[i10];
            zuVar6.addView(zuVar6.f43808b, w7.z5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(zuVarArr[i10].f43809c);
            zu zuVar7 = zuVarArr[i10];
            zuVar7.addView(zuVar7.f43809c, w7.z5.c(-2.0f, -1));
            zuVarArr[i10].f43809c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    jm0Var = zuVarArr[i10].d;
                } else {
                    jm0Var = zuVarArr[i10].e;
                }
                if (jm0Var != null) {
                    jm0Var.setClipToPadding(false);
                    jm0Var.setOnScrollListener(new ki.m3(5, this, jm0Var.getOnScrollListener()));
                }
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        yuVar.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                zuVarArr[0].f43810f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f35438w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20993d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21272s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.h6.L8));
        arrayList.addAll(this.f35431a.getThemeDescriptions());
        arrayList.addAll(this.f35432b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f35438w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new xu(0, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.jm0 jm0Var;
        zu[] zuVarArr = this.f35434f;
        for (int i10 = 0; i10 < zuVarArr.length; i10++) {
            zuVarArr[i10].d.B0();
            ai.u1 u1Var = zuVarArr[i10].e;
            if (u1Var != null) {
                u1Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                jm0Var = zuVarArr[z10 ? 1 : 0].d;
            } else {
                jm0Var = zuVarArr[z10 ? 1 : 0].e;
            }
            if (jm0Var != null) {
                jm0Var.getAdapter();
                jm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.b0) jm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        cy cyVar = this.f35431a;
        if (cyVar != null) {
            cyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f35432b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        cy cyVar = this.f35431a;
        if (cyVar != null) {
            cyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f35432b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        cy cyVar = this.f35431a;
        if (cyVar != null) {
            cyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f35432b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

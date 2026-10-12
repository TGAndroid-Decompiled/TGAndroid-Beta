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
public final class pv extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.ts0 f41098x = new org.telegram.ui.Components.ts0(2);
    public vy f41099a;
    public ContactsActivity f41100b;
    public org.telegram.ui.ActionBar.u0 f41101c;
    public Paint d;
    public ScrollSlidingTextTabStrip f41102e;
    public ov[] f41103f;
    public AnimatorSet h;
    public boolean f41104n;
    public boolean f41105r;
    public boolean f41106s;
    public int v;
    public boolean f41107w;

    public static void U(pv pvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(pvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(pvVar.currentAccount).blockPeer(user.f19950id);
            org.telegram.ui.Components.g5.v0(pvVar, LocaleController.getString(R.string.UserBlocked));
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
        ov[] ovVarArr = pvVar.f41103f;
        pvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            int i11 = (int) f7;
            ovVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = ovVarArr[i10].f40783e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        pvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.wm0 wm0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f41100b;
        vy vyVar = this.f41099a;
        ov[] ovVarArr = this.f41103f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        boolean z10 = false;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 21));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 9);
        this.f41101c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f41102e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f41102e, w7.w5.e(-1, 44, 83));
        this.f41102e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        nv nvVar = new nv(this, context);
        this.fragmentView = nvVar;
        nvVar.setWillNotDraw(false);
        vyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < ovVarArr.length) {
            ov ovVar = new ov(this, context);
            ovVarArr[i10] = ovVar;
            nvVar.addView(ovVar, w7.w5.d(-1.0f, -1));
            if (i10 == 0) {
                ov ovVar2 = ovVarArr[i10];
                ovVar2.f40780a = vyVar;
                f7 = f10;
                ovVar2.d = vyVar.f42905e0[0].f42613a;
                vyVar.J3();
                fy fyVar = vyVar.C0;
                if (fyVar != null) {
                    w0Var = fyVar.V;
                } else {
                    w0Var = null;
                }
                ovVar2.f40783e = w0Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    ov ovVar3 = ovVarArr[i10];
                    ovVar3.f40780a = contactsActivity;
                    ovVar3.d = contactsActivity.f33539f;
                    ovVar3.setVisibility(8);
                }
            }
            ovVarArr[i10].d.setScrollingTouchSlop(1);
            ov ovVar4 = ovVarArr[i10];
            ovVar4.f40781b = (FrameLayout) ovVar4.f40780a.getFragmentView();
            ov ovVar5 = ovVarArr[i10];
            ovVar5.f40782c = ovVar5.f40780a.getActionBar();
            ov ovVar6 = ovVarArr[i10];
            ovVar6.addView(ovVar6.f40781b, w7.w5.d(-1.0f, -1));
            AndroidUtilities.removeFromParent(ovVarArr[i10].f40782c);
            ov ovVar7 = ovVarArr[i10];
            ovVar7.addView(ovVar7.f40782c, w7.w5.d(-2.0f, -1));
            ovVarArr[i10].f40782c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    wm0Var = ovVarArr[i10].d;
                } else {
                    wm0Var = ovVarArr[i10].f40783e;
                }
                if (wm0Var != null) {
                    wm0Var.setClipToPadding(false);
                    wm0Var.setOnScrollListener(new ii.n3(5, this, wm0Var.getOnScrollListener()));
                }
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        nvVar.addView(this.actionBar, w7.w5.d(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f41102e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.f41102e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.f41102e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.f41102e.getCurrentTabId();
            if (currentTabId >= 0) {
                ovVarArr[0].f40784f = currentTabId;
            }
            this.f41102e.c();
        }
        m0(false);
        if (this.f41102e.getCurrentTabId() == this.f41102e.getFirstTabId()) {
            z10 = true;
        }
        this.f41107w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20840s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41102e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41102e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41102e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.f41102e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.h6.L8));
        arrayList.addAll(this.f41099a.getThemeDescriptions());
        arrayList.addAll(this.f41100b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f41107w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
            a2Var.R = string;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.y2(26, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.wm0 wm0Var;
        ov[] ovVarArr = this.f41103f;
        for (int i10 = 0; i10 < ovVarArr.length; i10++) {
            ovVarArr[i10].d.B0();
            ai.w0 w0Var = ovVarArr[i10].f40783e;
            if (w0Var != null) {
                w0Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                wm0Var = ovVarArr[z10 ? 1 : 0].d;
            } else {
                wm0Var = ovVarArr[z10 ? 1 : 0].f40783e;
            }
            if (wm0Var != null) {
                wm0Var.getAdapter();
                wm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.d0) wm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        vy vyVar = this.f41099a;
        if (vyVar != null) {
            vyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f41100b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        vy vyVar = this.f41099a;
        if (vyVar != null) {
            vyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f41100b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        vy vyVar = this.f41099a;
        if (vyVar != null) {
            vyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f41100b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

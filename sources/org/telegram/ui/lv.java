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
public final class lv extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.kr0 f38783x = new org.telegram.ui.Components.kr0(2);
    public py f38784a;
    public ContactsActivity f38785b;
    public org.telegram.ui.ActionBar.w0 f38786c;
    public Paint d;
    public ScrollSlidingTextTabStrip f38787e;
    public kv[] f38788f;
    public AnimatorSet h;
    public boolean f38789n;
    public boolean f38790r;
    public boolean f38791s;
    public int v;
    public boolean f38792w;

    public static void U(lv lvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.z4.w0(lvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(lvVar.currentAccount).blockPeer(user.f20992id);
            org.telegram.ui.Components.z4.w0(lvVar, LocaleController.getString(R.string.UserBlocked));
        }
        lvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(lv lvVar) {
        return lvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(lv lvVar) {
        return lvVar.actionBar;
    }

    public static void j0(lv lvVar, float f10) {
        kv[] kvVarArr = lvVar.f38788f;
        lvVar.actionBar.setTranslationY(f10);
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            int i11 = (int) f10;
            kvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            mh.d1 d1Var = kvVarArr[i10].f38430e;
            if (d1Var != null) {
                d1Var.setPinnedSectionOffsetY(i11);
            }
        }
        lvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.sl0 sl0Var;
        mh.d1 d1Var;
        ContactsActivity contactsActivity = this.f38785b;
        py pyVar = this.f38784a;
        kv[] kvVarArr = this.f38788f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        boolean z4 = false;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 7));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 8);
        this.f38786c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f38787e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f38787e, k7.c6.e(-1, 44, 83));
        this.f38787e.setDelegate(new h(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        jv jvVar = new jv(this, context);
        this.fragmentView = jvVar;
        jvVar.setWillNotDraw(false);
        pyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            kv kvVar = new kv(this, context);
            kvVarArr[i10] = kvVar;
            jvVar.addView(kvVar, k7.c6.c(-1.0f, -1));
            if (i10 == 0) {
                kv kvVar2 = kvVarArr[i10];
                kvVar2.f38427a = pyVar;
                kvVar2.d = pyVar.f40155b0[0].f39822a;
                pyVar.M3();
                yx yxVar = pyVar.f40276z0;
                if (yxVar != null) {
                    d1Var = yxVar.S;
                } else {
                    d1Var = null;
                }
                kvVar2.f38430e = d1Var;
            } else if (i10 == 1) {
                kv kvVar3 = kvVarArr[i10];
                kvVar3.f38427a = contactsActivity;
                kvVar3.d = contactsActivity.f34060f;
                kvVar3.setVisibility(8);
            }
            kvVarArr[i10].d.setScrollingTouchSlop(1);
            kv kvVar4 = kvVarArr[i10];
            kvVar4.f38428b = (FrameLayout) kvVar4.f38427a.getFragmentView();
            kv kvVar5 = kvVarArr[i10];
            kvVar5.f38429c = kvVar5.f38427a.getActionBar();
            kv kvVar6 = kvVarArr[i10];
            kvVar6.addView(kvVar6.f38428b, k7.c6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(kvVarArr[i10].f38429c);
            kv kvVar7 = kvVarArr[i10];
            kvVar7.addView(kvVar7.f38429c, k7.c6.c(-2.0f, -1));
            kvVarArr[i10].f38429c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    sl0Var = kvVarArr[i10].d;
                } else {
                    sl0Var = kvVarArr[i10].f38430e;
                }
                if (sl0Var != null) {
                    sl0Var.setClipToPadding(false);
                    sl0Var.setOnScrollListener(new kh.l(6, this, sl0Var.getOnScrollListener()));
                }
            }
        }
        jvVar.addView(this.actionBar, k7.c6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f38787e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.f38787e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.f38787e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.f38787e.getCurrentTabId();
            if (currentTabId >= 0) {
                kvVarArr[0].f38431f = currentTabId;
            }
            this.f38787e.c();
        }
        m0(false);
        if (this.f38787e.getCurrentTabId() == this.f38787e.getFirstTabId()) {
            z4 = true;
        }
        this.f38792w = z4;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38787e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38787e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38787e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.k6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, new Drawable[]{this.f38787e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.k6.L8));
        arrayList.addAll(this.f38784a.getThemeDescriptions());
        arrayList.addAll(this.f38785b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f38792w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new rs(3, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
            }
        }
    }

    public final void m0(boolean z4) {
        org.telegram.ui.Components.sl0 sl0Var;
        kv[] kvVarArr = this.f38788f;
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            kvVarArr[i10].d.B0();
            mh.d1 d1Var = kvVarArr[i10].f38430e;
            if (d1Var != null) {
                d1Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                sl0Var = kvVarArr[z4 ? 1 : 0].d;
            } else {
                sl0Var = kvVarArr[z4 ? 1 : 0].f38430e;
            }
            if (sl0Var != null) {
                sl0Var.getAdapter();
                sl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.j0) sl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        py pyVar = this.f38784a;
        if (pyVar != null) {
            pyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f38785b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        py pyVar = this.f38784a;
        if (pyVar != null) {
            pyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f38785b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        py pyVar = this.f38784a;
        if (pyVar != null) {
            pyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f38785b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

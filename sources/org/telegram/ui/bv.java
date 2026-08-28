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
public final class bv extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.rq0 f36995x = new org.telegram.ui.Components.rq0(2);
    public dy f36996a;
    public ContactsActivity f36997b;
    public org.telegram.ui.ActionBar.w0 f36998c;
    public Paint d;
    public ScrollSlidingTextTabStrip f36999e;
    public av[] f37000f;
    public AnimatorSet h;
    public boolean f37001n;
    public boolean f37002r;
    public boolean f37003s;
    public int v;
    public boolean f37004w;

    public static void T(bv bvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.y4.w0(bvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(bvVar.currentAccount).blockPeer(user.f22527id);
            org.telegram.ui.Components.y4.w0(bvVar, LocaleController.getString(R.string.UserBlocked));
        }
        bvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k g0(bv bvVar) {
        return bvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h0(bv bvVar) {
        return bvVar.actionBar;
    }

    public static void i0(bv bvVar, float f10) {
        av[] avVarArr = bvVar.f37000f;
        bvVar.actionBar.setTranslationY(f10);
        for (int i9 = 0; i9 < avVarArr.length; i9++) {
            int i10 = (int) f10;
            avVarArr[i9].d.setPinnedSectionOffsetY(i10);
            gh.f1 f1Var = avVarArr[i9].f36559e;
            if (f1Var != null) {
                f1Var.setPinnedSectionOffsetY(i10);
            }
        }
        bvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.wk0 wk0Var;
        gh.f1 f1Var;
        ContactsActivity contactsActivity = this.f36997b;
        dy dyVar = this.f36996a;
        av[] avVarArr = this.f37000f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        boolean z10 = false;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 15));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 8);
        this.f36998c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f36999e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f36999e, g7.e6.e(-1, 44, 83));
        this.f36999e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zu zuVar = new zu(this, context);
        this.fragmentView = zuVar;
        zuVar.setWillNotDraw(false);
        dyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i9 = 0; i9 < avVarArr.length; i9++) {
            av avVar = new av(this, context);
            avVarArr[i9] = avVar;
            zuVar.addView(avVar, g7.e6.c(-1.0f, -1));
            if (i9 == 0) {
                av avVar2 = avVarArr[i9];
                avVar2.f36556a = dyVar;
                avVar2.d = dyVar.f37629a0[0].f37350a;
                dyVar.M3();
                mx mxVar = dyVar.f37750y0;
                if (mxVar != null) {
                    f1Var = mxVar.R;
                } else {
                    f1Var = null;
                }
                avVar2.f36559e = f1Var;
            } else if (i9 == 1) {
                av avVar3 = avVarArr[i9];
                avVar3.f36556a = contactsActivity;
                avVar3.d = contactsActivity.f35420f;
                avVar3.setVisibility(8);
            }
            avVarArr[i9].d.setScrollingTouchSlop(1);
            av avVar4 = avVarArr[i9];
            avVar4.f36557b = (FrameLayout) avVar4.f36556a.getFragmentView();
            av avVar5 = avVarArr[i9];
            avVar5.f36558c = avVar5.f36556a.getActionBar();
            av avVar6 = avVarArr[i9];
            avVar6.addView(avVar6.f36557b, g7.e6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(avVarArr[i9].f36558c);
            av avVar7 = avVarArr[i9];
            avVar7.addView(avVar7.f36558c, g7.e6.c(-2.0f, -1));
            avVarArr[i9].f36558c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    wk0Var = avVarArr[i9].d;
                } else {
                    wk0Var = avVarArr[i9].f36559e;
                }
                if (wk0Var != null) {
                    wk0Var.setClipToPadding(false);
                    wk0Var.setOnScrollListener(new eh.n(6, this, wk0Var.getOnScrollListener()));
                }
            }
        }
        zuVar.addView(this.actionBar, g7.e6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f36999e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.f36999e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.f36999e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.f36999e.getCurrentTabId();
            if (currentTabId >= 0) {
                avVarArr[0].f36560f = currentTabId;
            }
            this.f36999e.c();
        }
        l0(false);
        if (this.f36999e.getCurrentTabId() == this.f36999e.getFirstTabId()) {
            z10 = true;
        }
        this.f37004w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36999e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36999e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36999e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.f6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, new Drawable[]{this.f36999e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.f6.L8));
        arrayList.addAll(this.f36996a.getThemeDescriptions());
        arrayList.addAll(this.f36997b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f37004w;
    }

    public final void k0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new yr(4, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            }
        }
    }

    public final void l0(boolean z10) {
        org.telegram.ui.Components.wk0 wk0Var;
        av[] avVarArr = this.f37000f;
        for (int i9 = 0; i9 < avVarArr.length; i9++) {
            avVarArr[i9].d.B0();
            gh.f1 f1Var = avVarArr[i9].f36559e;
            if (f1Var != null) {
                f1Var.B0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                wk0Var = avVarArr[z10 ? 1 : 0].d;
            } else {
                wk0Var = avVarArr[z10 ? 1 : 0].f36559e;
            }
            if (wk0Var != null) {
                wk0Var.getAdapter();
                wk0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.m0) wk0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        dy dyVar = this.f36996a;
        if (dyVar != null) {
            dyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f36997b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        dy dyVar = this.f36996a;
        if (dyVar != null) {
            dyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f36997b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        dy dyVar = this.f36996a;
        if (dyVar != null) {
            dyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f36997b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

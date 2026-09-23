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
public final class kv extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.jr0 f34802x = new org.telegram.ui.Components.jr0(2);
    public ry f34803a;
    public ContactsActivity f34804b;
    public org.telegram.ui.ActionBar.v0 f34805c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public jv[] f34806f;
    public AnimatorSet h;
    public boolean f34807n;
    public boolean f34808r;
    public boolean f34809s;
    public int v;
    public boolean f34810w;

    public static void U(kv kvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.e5.w0(kvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(kvVar.currentAccount).blockPeer(user.f18230id);
            org.telegram.ui.Components.e5.w0(kvVar, LocaleController.getString(R.string.UserBlocked));
        }
        kvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(kv kvVar) {
        return kvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(kv kvVar) {
        return kvVar.actionBar;
    }

    public static void j0(kv kvVar, float f7) {
        jv[] jvVarArr = kvVar.f34806f;
        kvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            int i11 = (int) f7;
            jvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = jvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        kvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.ml0 ml0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f34804b;
        ry ryVar = this.f34803a;
        jv[] jvVarArr = this.f34806f;
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
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 9);
        this.f34805c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.x5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        iv ivVar = new iv(this, context);
        this.fragmentView = ivVar;
        ivVar.setWillNotDraw(false);
        ryVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            jv jvVar = new jv(this, context);
            jvVarArr[i10] = jvVar;
            ivVar.addView(jvVar, w7.x5.c(-1.0f, -1));
            if (i10 == 0) {
                jv jvVar2 = jvVarArr[i10];
                jvVar2.f34514a = ryVar;
                jvVar2.d = ryVar.f36978e0[0].f36629a;
                ryVar.M3();
                ay ayVar = ryVar.C0;
                if (ayVar != null) {
                    w0Var = ayVar.V;
                } else {
                    w0Var = null;
                }
                jvVar2.e = w0Var;
            } else if (i10 == 1) {
                jv jvVar3 = jvVarArr[i10];
                jvVar3.f34514a = contactsActivity;
                jvVar3.d = contactsActivity.f30713f;
                jvVar3.setVisibility(8);
            }
            jvVarArr[i10].d.setScrollingTouchSlop(1);
            jv jvVar4 = jvVarArr[i10];
            jvVar4.f34515b = (FrameLayout) jvVar4.f34514a.getFragmentView();
            jv jvVar5 = jvVarArr[i10];
            jvVar5.f34516c = jvVar5.f34514a.getActionBar();
            jv jvVar6 = jvVarArr[i10];
            jvVar6.addView(jvVar6.f34515b, w7.x5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(jvVarArr[i10].f34516c);
            jv jvVar7 = jvVarArr[i10];
            jvVar7.addView(jvVar7.f34516c, w7.x5.c(-2.0f, -1));
            jvVarArr[i10].f34516c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    ml0Var = jvVarArr[i10].d;
                } else {
                    ml0Var = jvVarArr[i10].e;
                }
                if (ml0Var != null) {
                    ml0Var.setClipToPadding(false);
                    ml0Var.setOnScrollListener(new ii.n3(5, this, ml0Var.getOnScrollListener()));
                }
            }
        }
        ivVar.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                jvVarArr[0].f34517f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f34810w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.h6.L8));
        arrayList.addAll(this.f34803a.getThemeDescriptions());
        arrayList.addAll(this.f34804b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f34810w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.b3(25, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.ml0 ml0Var;
        jv[] jvVarArr = this.f34806f;
        for (int i10 = 0; i10 < jvVarArr.length; i10++) {
            jvVarArr[i10].d.B0();
            ai.w0 w0Var = jvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                ml0Var = jvVarArr[z10 ? 1 : 0].d;
            } else {
                ml0Var = jvVarArr[z10 ? 1 : 0].e;
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
        ry ryVar = this.f34803a;
        if (ryVar != null) {
            ryVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f34804b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ry ryVar = this.f34803a;
        if (ryVar != null) {
            ryVar.onPause();
        }
        ContactsActivity contactsActivity = this.f34804b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ry ryVar = this.f34803a;
        if (ryVar != null) {
            ryVar.onResume();
        }
        ContactsActivity contactsActivity = this.f34804b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

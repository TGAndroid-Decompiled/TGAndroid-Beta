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
public final class cv extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.cr0 f37217x = new org.telegram.ui.Components.cr0(2);
    public fy f37218a;
    public ContactsActivity f37219b;
    public org.telegram.ui.ActionBar.w0 f37220c;
    public Paint d;
    public ScrollSlidingTextTabStrip f37221e;
    public bv[] f37222f;
    public AnimatorSet h;
    public boolean f37223n;
    public boolean f37224r;
    public boolean f37225s;
    public int v;
    public boolean f37226w;

    public static void U(cv cvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.c5.w0(cvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(cvVar.currentAccount).blockPeer(user.f22539id);
            org.telegram.ui.Components.c5.w0(cvVar, LocaleController.getString(R.string.UserBlocked));
        }
        cvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.l h0(cv cvVar) {
        return cvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l i0(cv cvVar) {
        return cvVar.actionBar;
    }

    public static void j0(cv cvVar, float f9) {
        bv[] bvVarArr = cvVar.f37222f;
        cvVar.actionBar.setTranslationY(f9);
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            int i11 = (int) f9;
            bvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            jh.e1 e1Var = bvVarArr[i10].f36926e;
            if (e1Var != null) {
                e1Var.setPinnedSectionOffsetY(i11);
            }
        }
        cvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.jl0 jl0Var;
        jh.e1 e1Var;
        ContactsActivity contactsActivity = this.f37219b;
        fy fyVar = this.f37218a;
        bv[] bvVarArr = this.f37222f;
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
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 7));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 8);
        this.f37220c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f37221e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f37221e, i7.f6.e(-1, 44, 83));
        this.f37221e.setDelegate(new h(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        av avVar = new av(this, context);
        this.fragmentView = avVar;
        avVar.setWillNotDraw(false);
        fyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            bv bvVar = new bv(this, context);
            bvVarArr[i10] = bvVar;
            avVar.addView(bvVar, i7.f6.c(-1.0f, -1));
            if (i10 == 0) {
                bv bvVar2 = bvVarArr[i10];
                bvVar2.f36923a = fyVar;
                bvVar2.d = fyVar.f38256a0[0].f37921a;
                fyVar.M3();
                ox oxVar = fyVar.f38377y0;
                if (oxVar != null) {
                    e1Var = oxVar.R;
                } else {
                    e1Var = null;
                }
                bvVar2.f36926e = e1Var;
            } else if (i10 == 1) {
                bv bvVar3 = bvVarArr[i10];
                bvVar3.f36923a = contactsActivity;
                bvVar3.d = contactsActivity.f35487f;
                bvVar3.setVisibility(8);
            }
            bvVarArr[i10].d.setScrollingTouchSlop(1);
            bv bvVar4 = bvVarArr[i10];
            bvVar4.f36924b = (FrameLayout) bvVar4.f36923a.getFragmentView();
            bv bvVar5 = bvVarArr[i10];
            bvVar5.f36925c = bvVar5.f36923a.getActionBar();
            bv bvVar6 = bvVarArr[i10];
            bvVar6.addView(bvVar6.f36924b, i7.f6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(bvVarArr[i10].f36925c);
            bv bvVar7 = bvVarArr[i10];
            bvVar7.addView(bvVar7.f36925c, i7.f6.c(-2.0f, -1));
            bvVarArr[i10].f36925c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    jl0Var = bvVarArr[i10].d;
                } else {
                    jl0Var = bvVarArr[i10].f36926e;
                }
                if (jl0Var != null) {
                    jl0Var.setClipToPadding(false);
                    jl0Var.setOnScrollListener(new hh.l(6, this, jl0Var.getOnScrollListener()));
                }
            }
        }
        avVar.addView(this.actionBar, i7.f6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f37221e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.f37221e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.f37221e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.f37221e.getCurrentTabId();
            if (currentTabId >= 0) {
                bvVarArr[0].f36927f = currentTabId;
            }
            this.f37221e.c();
        }
        m0(false);
        if (this.f37221e.getCurrentTabId() == this.f37221e.getFirstTabId()) {
            z10 = true;
        }
        this.f37226w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37221e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37221e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37221e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.f37221e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.g6.L8));
        arrayList.addAll(this.f37218a.getThemeDescriptions());
        arrayList.addAll(this.f37219b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f37226w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new xr(4, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.jl0 jl0Var;
        bv[] bvVarArr = this.f37222f;
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            bvVarArr[i10].d.B0();
            jh.e1 e1Var = bvVarArr[i10].f36926e;
            if (e1Var != null) {
                e1Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                jl0Var = bvVarArr[z10 ? 1 : 0].d;
            } else {
                jl0Var = bvVarArr[z10 ? 1 : 0].f36926e;
            }
            if (jl0Var != null) {
                jl0Var.getAdapter();
                jl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.j0) jl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        fy fyVar = this.f37218a;
        if (fyVar != null) {
            fyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f37219b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        fy fyVar = this.f37218a;
        if (fyVar != null) {
            fyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f37219b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        fy fyVar = this.f37218a;
        if (fyVar != null) {
            fyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f37219b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

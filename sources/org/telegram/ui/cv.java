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
public final class cv extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.es0 f35981x = new org.telegram.ui.Components.es0(2);
    public ey f35982a;
    public ContactsActivity f35983b;
    public org.telegram.ui.ActionBar.u0 f35984c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public bv[] f35985f;
    public AnimatorSet h;
    public boolean f35986n;
    public boolean f35987r;
    public boolean f35988s;
    public int v;
    public boolean f35989w;

    public static void U(cv cvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.f5.v0(cvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(cvVar.currentAccount).blockPeer(user.f20419id);
            org.telegram.ui.Components.f5.v0(cvVar, LocaleController.getString(R.string.UserBlocked));
        }
        cvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(cv cvVar) {
        return cvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(cv cvVar) {
        return cvVar.actionBar;
    }

    public static void j0(cv cvVar, float f7) {
        bv[] bvVarArr = cvVar.f35985f;
        cvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            int i11 = (int) f7;
            bvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.u1 u1Var = bvVarArr[i10].e;
            if (u1Var != null) {
                u1Var.setPinnedSectionOffsetY(i11);
            }
        }
        cvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.im0 im0Var;
        ai.u1 u1Var;
        ContactsActivity contactsActivity = this.f35983b;
        ey eyVar = this.f35982a;
        bv[] bvVarArr = this.f35985f;
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
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 23));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 9);
        this.f35984c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.z5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        av avVar = new av(this, context);
        this.fragmentView = avVar;
        avVar.setWillNotDraw(false);
        eyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < bvVarArr.length) {
            bv bvVar = new bv(this, context);
            bvVarArr[i10] = bvVar;
            avVar.addView(bvVar, w7.z5.c(-1.0f, -1));
            if (i10 == 0) {
                bv bvVar2 = bvVarArr[i10];
                bvVar2.f35715a = eyVar;
                f7 = f10;
                bvVar2.d = eyVar.f36637e0[0].f36300a;
                eyVar.K3();
                nx nxVar = eyVar.C0;
                if (nxVar != null) {
                    u1Var = nxVar.V;
                } else {
                    u1Var = null;
                }
                bvVar2.e = u1Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    bv bvVar3 = bvVarArr[i10];
                    bvVar3.f35715a = contactsActivity;
                    bvVar3.d = contactsActivity.f33071f;
                    bvVar3.setVisibility(8);
                }
            }
            bvVarArr[i10].d.setScrollingTouchSlop(1);
            bv bvVar4 = bvVarArr[i10];
            bvVar4.f35716b = (FrameLayout) bvVar4.f35715a.getFragmentView();
            bv bvVar5 = bvVarArr[i10];
            bvVar5.f35717c = bvVar5.f35715a.getActionBar();
            bv bvVar6 = bvVarArr[i10];
            bvVar6.addView(bvVar6.f35716b, w7.z5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(bvVarArr[i10].f35717c);
            bv bvVar7 = bvVarArr[i10];
            bvVar7.addView(bvVar7.f35717c, w7.z5.c(-2.0f, -1));
            bvVarArr[i10].f35717c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    im0Var = bvVarArr[i10].d;
                } else {
                    im0Var = bvVarArr[i10].e;
                }
                if (im0Var != null) {
                    im0Var.setClipToPadding(false);
                    im0Var.setOnScrollListener(new ki.m3(5, this, im0Var.getOnScrollListener()));
                }
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        avVar.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                bvVarArr[0].f35718f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f35989w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20986d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21265s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.h6.L8));
        arrayList.addAll(this.f35982a.getThemeDescriptions());
        arrayList.addAll(this.f35983b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f35989w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new zu(0, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.im0 im0Var;
        bv[] bvVarArr = this.f35985f;
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            bvVarArr[i10].d.B0();
            ai.u1 u1Var = bvVarArr[i10].e;
            if (u1Var != null) {
                u1Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                im0Var = bvVarArr[z10 ? 1 : 0].d;
            } else {
                im0Var = bvVarArr[z10 ? 1 : 0].e;
            }
            if (im0Var != null) {
                im0Var.getAdapter();
                im0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.b0) im0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        ey eyVar = this.f35982a;
        if (eyVar != null) {
            eyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f35983b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ey eyVar = this.f35982a;
        if (eyVar != null) {
            eyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f35983b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ey eyVar = this.f35982a;
        if (eyVar != null) {
            eyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f35983b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

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
public final class bv extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.es0 f35743x = new org.telegram.ui.Components.es0(2);
    public ey f35744a;
    public ContactsActivity f35745b;
    public org.telegram.ui.ActionBar.u0 f35746c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public av[] f35747f;
    public AnimatorSet h;
    public boolean f35748n;
    public boolean f35749r;
    public boolean f35750s;
    public int v;
    public boolean f35751w;

    public static void U(bv bvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.f5.v0(bvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(bvVar.currentAccount).blockPeer(user.f20419id);
            org.telegram.ui.Components.f5.v0(bvVar, LocaleController.getString(R.string.UserBlocked));
        }
        bvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(bv bvVar) {
        return bvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(bv bvVar) {
        return bvVar.actionBar;
    }

    public static void j0(bv bvVar, float f7) {
        av[] avVarArr = bvVar.f35747f;
        bvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < avVarArr.length; i10++) {
            int i11 = (int) f7;
            avVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.u1 u1Var = avVarArr[i10].e;
            if (u1Var != null) {
                u1Var.setPinnedSectionOffsetY(i11);
            }
        }
        bvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.im0 im0Var;
        ai.u1 u1Var;
        ContactsActivity contactsActivity = this.f35745b;
        ey eyVar = this.f35744a;
        av[] avVarArr = this.f35747f;
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
        a2.H = new ig.a2(this, 9);
        this.f35746c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.z5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zu zuVar = new zu(this, context);
        this.fragmentView = zuVar;
        zuVar.setWillNotDraw(false);
        eyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < avVarArr.length) {
            av avVar = new av(this, context);
            avVarArr[i10] = avVar;
            zuVar.addView(avVar, w7.z5.d(-1.0f, -1));
            if (i10 == 0) {
                av avVar2 = avVarArr[i10];
                avVar2.f35500a = eyVar;
                f7 = f10;
                avVar2.d = eyVar.f36630e0[0].f36333a;
                eyVar.K3();
                nx nxVar = eyVar.C0;
                if (nxVar != null) {
                    u1Var = nxVar.V;
                } else {
                    u1Var = null;
                }
                avVar2.e = u1Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    av avVar3 = avVarArr[i10];
                    avVar3.f35500a = contactsActivity;
                    avVar3.d = contactsActivity.f33071f;
                    avVar3.setVisibility(8);
                }
            }
            avVarArr[i10].d.setScrollingTouchSlop(1);
            av avVar4 = avVarArr[i10];
            avVar4.f35501b = (FrameLayout) avVar4.f35500a.getFragmentView();
            av avVar5 = avVarArr[i10];
            avVar5.f35502c = avVar5.f35500a.getActionBar();
            av avVar6 = avVarArr[i10];
            avVar6.addView(avVar6.f35501b, w7.z5.d(-1.0f, -1));
            AndroidUtilities.removeFromParent(avVarArr[i10].f35502c);
            av avVar7 = avVarArr[i10];
            avVar7.addView(avVar7.f35502c, w7.z5.d(-2.0f, -1));
            avVarArr[i10].f35502c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    im0Var = avVarArr[i10].d;
                } else {
                    im0Var = avVarArr[i10].e;
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
        zuVar.addView(this.actionBar, w7.z5.d(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                avVarArr[0].f35503f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f35751w = z10;
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
        arrayList.addAll(this.f35744a.getThemeDescriptions());
        arrayList.addAll(this.f35745b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f35751w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.s2(29, this, user));
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
        av[] avVarArr = this.f35747f;
        for (int i10 = 0; i10 < avVarArr.length; i10++) {
            avVarArr[i10].d.B0();
            ai.u1 u1Var = avVarArr[i10].e;
            if (u1Var != null) {
                u1Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                im0Var = avVarArr[z10 ? 1 : 0].d;
            } else {
                im0Var = avVarArr[z10 ? 1 : 0].e;
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
        ey eyVar = this.f35744a;
        if (eyVar != null) {
            eyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f35745b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ey eyVar = this.f35744a;
        if (eyVar != null) {
            eyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f35745b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ey eyVar = this.f35744a;
        if (eyVar != null) {
            eyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f35745b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class cv extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.js0 f36428x = new org.telegram.ui.Components.js0(2);
    public ey f36429a;
    public ContactsActivity f36430b;
    public org.telegram.ui.ActionBar.u0 f36431c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public bv[] f36432f;
    public AnimatorSet h;
    public boolean f36433n;
    public boolean f36434r;
    public boolean f36435s;
    public int v;
    public boolean f36436w;

    public static void U(cv cvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.f5.w0(cvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(cvVar.currentAccount).blockPeer(user.f20490id);
            org.telegram.ui.Components.f5.w0(cvVar, LocaleController.getString(R.string.UserBlocked));
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
        bv[] bvVarArr = cvVar.f36432f;
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
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
        ey eyVar = this.f36429a;
        if (eyVar != null) {
            eyVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f36430b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.mm0 mm0Var;
        ai.u1 u1Var;
        ContactsActivity contactsActivity = this.f36430b;
        ey eyVar = this.f36429a;
        bv[] bvVarArr = this.f36432f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        boolean z10 = false;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 23));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 9);
        this.f36431c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.z5.e(-1, 44, 83));
        this.e.setDelegate(new f(this, 14));
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
                bvVar2.f36172a = eyVar;
                f7 = f10;
                bvVar2.d = eyVar.f37059e0[0].f36750a;
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
                    bvVar3.f36172a = contactsActivity;
                    bvVar3.d = contactsActivity.f33385f;
                    bvVar3.setVisibility(8);
                }
            }
            bvVarArr[i10].d.setScrollingTouchSlop(1);
            bv bvVar4 = bvVarArr[i10];
            bvVar4.f36173b = (FrameLayout) bvVar4.f36172a.getFragmentView();
            bv bvVar5 = bvVarArr[i10];
            bvVar5.f36174c = bvVar5.f36172a.getActionBar();
            bv bvVar6 = bvVarArr[i10];
            bvVar6.addView(bvVar6.f36173b, w7.z5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(bvVarArr[i10].f36174c);
            bv bvVar7 = bvVarArr[i10];
            bvVar7.addView(bvVar7.f36174c, w7.z5.c(-2.0f, -1));
            bvVarArr[i10].f36174c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    mm0Var = bvVarArr[i10].d;
                } else {
                    mm0Var = bvVarArr[i10].e;
                }
                if (mm0Var != null) {
                    mm0Var.setClipToPadding(false);
                    mm0Var.setOnScrollListener(new ki.m3(5, this, mm0Var.getOnScrollListener()));
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
                bvVarArr[0].f36175f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f36436w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L8));
        arrayList.addAll(this.f36429a.getThemeDescriptions());
        arrayList.addAll(this.f36430b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f36436w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.R = string;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new ks(2, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, null);
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.mm0 mm0Var;
        bv[] bvVarArr = this.f36432f;
        for (int i10 = 0; i10 < bvVarArr.length; i10++) {
            bvVarArr[i10].d.B0();
            ai.u1 u1Var = bvVarArr[i10].e;
            if (u1Var != null) {
                u1Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                mm0Var = bvVarArr[z10 ? 1 : 0].d;
            } else {
                mm0Var = bvVarArr[z10 ? 1 : 0].e;
            }
            if (mm0Var != null) {
                mm0Var.getAdapter();
                mm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.b0) mm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        ey eyVar = this.f36429a;
        if (eyVar != null) {
            eyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f36430b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ey eyVar = this.f36429a;
        if (eyVar != null) {
            eyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f36430b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ey eyVar = this.f36429a;
        if (eyVar != null) {
            eyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f36430b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ey eyVar = this.f36429a;
            if (eyVar != null && eyVar.fragmentView != null) {
                eyVar.onThemeColorsChanged();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            ContactsActivity contactsActivity = this.f36430b;
            if (contactsActivity != null && contactsActivity.fragmentView != null) {
                contactsActivity.onThemeColorsChanged();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}

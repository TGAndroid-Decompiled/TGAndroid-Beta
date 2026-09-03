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
public final class mv extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.kr0 f36220x = new org.telegram.ui.Components.kr0(2);
    public qy f36221a;
    public ContactsActivity f36222b;
    public org.telegram.ui.ActionBar.w0 f36223c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public lv[] f36224f;
    public AnimatorSet h;
    public boolean f36225n;
    public boolean f36226r;
    public boolean f36227s;
    public int v;
    public boolean f36228w;

    public static void U(mv mvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.z4.w0(mvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(mvVar.currentAccount).blockPeer(user.f19306id);
            org.telegram.ui.Components.z4.w0(mvVar, LocaleController.getString(R.string.UserBlocked));
        }
        mvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(mv mvVar) {
        return mvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(mv mvVar) {
        return mvVar.actionBar;
    }

    public static void j0(mv mvVar, float f10) {
        lv[] lvVarArr = mvVar.f36224f;
        mvVar.actionBar.setTranslationY(f10);
        for (int i10 = 0; i10 < lvVarArr.length; i10++) {
            int i11 = (int) f10;
            lvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            lh.e1 e1Var = lvVarArr[i10].e;
            if (e1Var != null) {
                e1Var.setPinnedSectionOffsetY(i11);
            }
        }
        mvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.rl0 rl0Var;
        lh.e1 e1Var;
        ContactsActivity contactsActivity = this.f36222b;
        qy qyVar = this.f36221a;
        lv[] lvVarArr = this.f36224f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        boolean z4 = false;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
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
        a2.E = new hb(this, 8);
        this.f36223c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, k7.b6.e(-1, 44, 83));
        this.e.setDelegate(new h(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        kv kvVar = new kv(this, context);
        this.fragmentView = kvVar;
        kvVar.setWillNotDraw(false);
        qyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < lvVarArr.length; i10++) {
            lv lvVar = new lv(this, context);
            lvVarArr[i10] = lvVar;
            kvVar.addView(lvVar, k7.b6.c(-1.0f, -1));
            if (i10 == 0) {
                lv lvVar2 = lvVarArr[i10];
                lvVar2.f35928a = qyVar;
                lvVar2.d = qyVar.f37527b0[0].f37246a;
                qyVar.M3();
                zx zxVar = qyVar.f37647z0;
                if (zxVar != null) {
                    e1Var = zxVar.S;
                } else {
                    e1Var = null;
                }
                lvVar2.e = e1Var;
            } else if (i10 == 1) {
                lv lvVar3 = lvVarArr[i10];
                lvVar3.f35928a = contactsActivity;
                lvVar3.d = contactsActivity.f31517f;
                lvVar3.setVisibility(8);
            }
            lvVarArr[i10].d.setScrollingTouchSlop(1);
            lv lvVar4 = lvVarArr[i10];
            lvVar4.f35929b = (FrameLayout) lvVar4.f35928a.getFragmentView();
            lv lvVar5 = lvVarArr[i10];
            lvVar5.f35930c = lvVar5.f35928a.getActionBar();
            lv lvVar6 = lvVarArr[i10];
            lvVar6.addView(lvVar6.f35929b, k7.b6.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(lvVarArr[i10].f35930c);
            lv lvVar7 = lvVarArr[i10];
            lvVar7.addView(lvVar7.f35930c, k7.b6.c(-2.0f, -1));
            lvVarArr[i10].f35930c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    rl0Var = lvVarArr[i10].d;
                } else {
                    rl0Var = lvVarArr[i10].e;
                }
                if (rl0Var != null) {
                    rl0Var.setClipToPadding(false);
                    rl0Var.setOnScrollListener(new jh.l(6, this, rl0Var.getOnScrollListener()));
                }
            }
        }
        kvVar.addView(this.actionBar, k7.b6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                lvVarArr[0].f35931f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z4 = true;
        }
        this.f36228w = z4;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.j6.L8));
        arrayList.addAll(this.f36221a.getThemeDescriptions());
        arrayList.addAll(this.f36222b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f36228w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            d2Var.O = string;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new ss(3, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
            }
        }
    }

    public final void m0(boolean z4) {
        org.telegram.ui.Components.rl0 rl0Var;
        lv[] lvVarArr = this.f36224f;
        for (int i10 = 0; i10 < lvVarArr.length; i10++) {
            lvVarArr[i10].d.B0();
            lh.e1 e1Var = lvVarArr[i10].e;
            if (e1Var != null) {
                e1Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                rl0Var = lvVarArr[z4 ? 1 : 0].d;
            } else {
                rl0Var = lvVarArr[z4 ? 1 : 0].e;
            }
            if (rl0Var != null) {
                rl0Var.getAdapter();
                rl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.i0) rl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        qy qyVar = this.f36221a;
        if (qyVar != null) {
            qyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f36222b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        qy qyVar = this.f36221a;
        if (qyVar != null) {
            qyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f36222b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        qy qyVar = this.f36221a;
        if (qyVar != null) {
            qyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f36222b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

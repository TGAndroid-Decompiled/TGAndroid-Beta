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

public final class ev extends org.telegram.ui.ActionBar.n2 {

    public static final org.telegram.ui.Components.sq0 f37852x = new org.telegram.ui.Components.sq0(2);

    public gy f37853a;

    public ContactsActivity f37854b;

    public org.telegram.ui.ActionBar.v0 f37855c;
    public Paint d;

    public ScrollSlidingTextTabStrip f37856e;

    public dv[] f37857f;
    public AnimatorSet h;

    public boolean f37858n;

    public boolean f37859r;

    public boolean f37860s;
    public int v;

    public boolean f37861w;

    public static void U(ev evVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.y4.w0(evVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(evVar.currentAccount).blockPeer(user.f22527id);
            org.telegram.ui.Components.y4.w0(evVar, LocaleController.getString(R.string.UserBlocked));
        }
        evVar.finishFragment();
    }

    public static void j0(ev evVar, float f10) {
        dv[] dvVarArr = evVar.f37857f;
        evVar.actionBar.setTranslationY(f10);
        for (int i10 = 0; i10 < dvVarArr.length; i10++) {
            int i11 = (int) f10;
            dvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            hh.f1 f1Var = dvVarArr[i10].f37556e;
            if (f1Var != null) {
                f1Var.setPinnedSectionOffsetY(i11);
            }
        }
        evVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        ContactsActivity contactsActivity = this.f37854b;
        gy gyVar = this.f37853a;
        dv[] dvVarArr = this.f37857f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 8);
        this.f37855c = v0VarA;
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f37856e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f37856e, h7.z5.e(-1, 44, 83));
        this.f37856e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        cv cvVar = new cv(this, context);
        this.fragmentView = cvVar;
        cvVar.setWillNotDraw(false);
        gyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < dvVarArr.length; i10++) {
            dv dvVar = new dv(this, context);
            dvVarArr[i10] = dvVar;
            cvVar.addView(dvVar, h7.z5.c(-1.0f, -1));
            if (i10 == 0) {
                dv dvVar2 = dvVarArr[i10];
                dvVar2.f37553a = gyVar;
                dvVar2.d = gyVar.f38498a0[0].f38225a;
                gyVar.M3();
                px pxVar = gyVar.f38619y0;
                dvVar2.f37556e = pxVar != null ? pxVar.R : null;
            } else if (i10 == 1) {
                dv dvVar3 = dvVarArr[i10];
                dvVar3.f37553a = contactsActivity;
                dvVar3.d = contactsActivity.f35423f;
                dvVar3.setVisibility(8);
            }
            dvVarArr[i10].d.setScrollingTouchSlop(1);
            dv dvVar4 = dvVarArr[i10];
            dvVar4.f37554b = (FrameLayout) dvVar4.f37553a.getFragmentView();
            dv dvVar5 = dvVarArr[i10];
            dvVar5.f37555c = dvVar5.f37553a.getActionBar();
            dv dvVar6 = dvVarArr[i10];
            dvVar6.addView(dvVar6.f37554b, h7.z5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(dvVarArr[i10].f37555c);
            dv dvVar7 = dvVarArr[i10];
            dvVar7.addView(dvVar7.f37555c, h7.z5.c(-2.0f, -1));
            dvVarArr[i10].f37555c.setVisibility(8);
            int i11 = 0;
            while (i11 < 2) {
                org.telegram.ui.Components.zk0 zk0Var = i11 == 0 ? dvVarArr[i10].d : dvVarArr[i10].f37556e;
                if (zk0Var != null) {
                    zk0Var.setClipToPadding(false);
                    zk0Var.setOnScrollListener(new fh.l(6, this, zk0Var.getOnScrollListener()));
                }
                i11++;
            }
        }
        cvVar.addView(this.actionBar, h7.z5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f37856e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.f37856e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.f37856e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.f37856e.getCurrentTabId();
            if (currentTabId >= 0) {
                dvVarArr[0].f37557f = currentTabId;
            }
            this.f37856e.c();
        }
        m0(false);
        this.f37861w = this.f37856e.getCurrentTabId() == this.f37856e.getFirstTabId();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37856e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37856e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37856e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.f37856e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.g6.L8));
        arrayList.addAll(this.f37853a.getThemeDescriptions());
        arrayList.addAll(this.f37854b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f37861w;
    }

    public final void l0(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.BlockUser);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new zr(4, this, user));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public final void m0(boolean z10) {
        dv[] dvVarArr = this.f37857f;
        for (int i10 = 0; i10 < dvVarArr.length; i10++) {
            dvVarArr[i10].d.B0();
            hh.f1 f1Var = dvVarArr[i10].f37556e;
            if (f1Var != null) {
                f1Var.B0();
            }
        }
        int i11 = 0;
        while (i11 < 2) {
            org.telegram.ui.Components.zk0 zk0Var = i11 == 0 ? dvVarArr[z10 ? 1 : 0].d : dvVarArr[z10 ? 1 : 0].f37556e;
            if (zk0Var != null) {
                zk0Var.getAdapter();
                zk0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((f2.k0) zk0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
            i11++;
        }
    }

    @Override
    public final void onFragmentDestroy() {
        gy gyVar = this.f37853a;
        if (gyVar != null) {
            gyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f37854b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        gy gyVar = this.f37853a;
        if (gyVar != null) {
            gyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f37854b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        gy gyVar = this.f37853a;
        if (gyVar != null) {
            gyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f37854b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

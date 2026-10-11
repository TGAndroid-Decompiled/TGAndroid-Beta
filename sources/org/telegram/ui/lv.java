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
public final class lv extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.os0 f39766x = new org.telegram.ui.Components.os0(2);
    public sy f39767a;
    public ContactsActivity f39768b;
    public org.telegram.ui.ActionBar.u0 f39769c;
    public Paint d;
    public ScrollSlidingTextTabStrip f39770e;
    public kv[] f39771f;
    public AnimatorSet h;
    public boolean f39772n;
    public boolean f39773r;
    public boolean f39774s;
    public int v;
    public boolean f39775w;

    public static void U(lv lvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(lvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(lvVar.currentAccount).blockPeer(user.f20215id);
            org.telegram.ui.Components.g5.v0(lvVar, LocaleController.getString(R.string.UserBlocked));
        }
        lvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(lv lvVar) {
        return lvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(lv lvVar) {
        return lvVar.actionBar;
    }

    public static void j0(lv lvVar, float f7) {
        kv[] kvVarArr = lvVar.f39771f;
        lvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            int i11 = (int) f7;
            kvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = kvVarArr[i10].f39459e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        lvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.rm0 rm0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f39768b;
        sy syVar = this.f39767a;
        kv[] kvVarArr = this.f39771f;
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
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 9);
        this.f39769c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f39770e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f39770e, w7.x5.e(-1, 44, 83));
        this.f39770e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        jv jvVar = new jv(this, context);
        this.fragmentView = jvVar;
        jvVar.setWillNotDraw(false);
        syVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < kvVarArr.length) {
            kv kvVar = new kv(this, context);
            kvVarArr[i10] = kvVar;
            jvVar.addView(kvVar, w7.x5.d(-1.0f, -1));
            if (i10 == 0) {
                kv kvVar2 = kvVarArr[i10];
                kvVar2.f39456a = syVar;
                f7 = f10;
                kvVar2.d = syVar.f41941e0[0].f41564a;
                syVar.J3();
                cy cyVar = syVar.C0;
                if (cyVar != null) {
                    w0Var = cyVar.V;
                } else {
                    w0Var = null;
                }
                kvVar2.f39459e = w0Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    kv kvVar3 = kvVarArr[i10];
                    kvVar3.f39456a = contactsActivity;
                    kvVar3.d = contactsActivity.f33762f;
                    kvVar3.setVisibility(8);
                }
            }
            kvVarArr[i10].d.setScrollingTouchSlop(1);
            kv kvVar4 = kvVarArr[i10];
            kvVar4.f39457b = (FrameLayout) kvVar4.f39456a.getFragmentView();
            kv kvVar5 = kvVarArr[i10];
            kvVar5.f39458c = kvVar5.f39456a.getActionBar();
            kv kvVar6 = kvVarArr[i10];
            kvVar6.addView(kvVar6.f39457b, w7.x5.d(-1.0f, -1));
            AndroidUtilities.removeFromParent(kvVarArr[i10].f39458c);
            kv kvVar7 = kvVarArr[i10];
            kvVar7.addView(kvVar7.f39458c, w7.x5.d(-2.0f, -1));
            kvVarArr[i10].f39458c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    rm0Var = kvVarArr[i10].d;
                } else {
                    rm0Var = kvVarArr[i10].f39459e;
                }
                if (rm0Var != null) {
                    rm0Var.setClipToPadding(false);
                    rm0Var.setOnScrollListener(new ii.n3(5, this, rm0Var.getOnScrollListener()));
                }
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        jvVar.addView(this.actionBar, w7.x5.d(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f39770e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.f39770e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.f39770e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.f39770e.getCurrentTabId();
            if (currentTabId >= 0) {
                kvVarArr[0].f39460f = currentTabId;
            }
            this.f39770e.c();
        }
        m0(false);
        if (this.f39770e.getCurrentTabId() == this.f39770e.getFirstTabId()) {
            z10 = true;
        }
        this.f39775w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21101s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21156v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39770e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39770e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39770e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.f39770e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.h6.L8));
        arrayList.addAll(this.f39767a.getThemeDescriptions());
        arrayList.addAll(this.f39768b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f39775w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.R = string;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.y2(27, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.rm0 rm0Var;
        kv[] kvVarArr = this.f39771f;
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            kvVarArr[i10].d.B0();
            ai.w0 w0Var = kvVarArr[i10].f39459e;
            if (w0Var != null) {
                w0Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                rm0Var = kvVarArr[z10 ? 1 : 0].d;
            } else {
                rm0Var = kvVarArr[z10 ? 1 : 0].f39459e;
            }
            if (rm0Var != null) {
                rm0Var.getAdapter();
                rm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.d0) rm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        sy syVar = this.f39767a;
        if (syVar != null) {
            syVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f39768b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        sy syVar = this.f39767a;
        if (syVar != null) {
            syVar.onPause();
        }
        ContactsActivity contactsActivity = this.f39768b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        sy syVar = this.f39767a;
        if (syVar != null) {
            syVar.onResume();
        }
        ContactsActivity contactsActivity = this.f39768b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

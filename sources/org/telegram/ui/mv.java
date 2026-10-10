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
public final class mv extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.os0 f40034x = new org.telegram.ui.Components.os0(2);
    public ty f40035a;
    public ContactsActivity f40036b;
    public org.telegram.ui.ActionBar.v0 f40037c;
    public Paint d;
    public ScrollSlidingTextTabStrip f40038e;
    public lv[] f40039f;
    public AnimatorSet h;
    public boolean f40040n;
    public boolean f40041r;
    public boolean f40042s;
    public int v;
    public boolean f40043w;

    public static void U(mv mvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(mvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(mvVar.currentAccount).blockPeer(user.f20189id);
            org.telegram.ui.Components.g5.v0(mvVar, LocaleController.getString(R.string.UserBlocked));
        }
        mvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(mv mvVar) {
        return mvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(mv mvVar) {
        return mvVar.actionBar;
    }

    public static void j0(mv mvVar, float f7) {
        lv[] lvVarArr = mvVar.f40039f;
        mvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < lvVarArr.length; i10++) {
            int i11 = (int) f7;
            lvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = lvVarArr[i10].f39728e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        mvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.rm0 rm0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f40036b;
        ty tyVar = this.f40035a;
        lv[] lvVarArr = this.f40039f;
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
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 9);
        this.f40037c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f40038e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f40038e, w7.x5.e(-1, 44, 83));
        this.f40038e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        kv kvVar = new kv(this, context);
        this.fragmentView = kvVar;
        kvVar.setWillNotDraw(false);
        tyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < lvVarArr.length) {
            lv lvVar = new lv(this, context);
            lvVarArr[i10] = lvVar;
            kvVar.addView(lvVar, w7.x5.d(-1.0f, -1));
            if (i10 == 0) {
                lv lvVar2 = lvVarArr[i10];
                lvVar2.f39725a = tyVar;
                f7 = f10;
                lvVar2.d = tyVar.f42218e0[0].f41834a;
                tyVar.J3();
                dy dyVar = tyVar.C0;
                if (dyVar != null) {
                    w0Var = dyVar.V;
                } else {
                    w0Var = null;
                }
                lvVar2.f39728e = w0Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    lv lvVar3 = lvVarArr[i10];
                    lvVar3.f39725a = contactsActivity;
                    lvVar3.d = contactsActivity.f33738f;
                    lvVar3.setVisibility(8);
                }
            }
            lvVarArr[i10].d.setScrollingTouchSlop(1);
            lv lvVar4 = lvVarArr[i10];
            lvVar4.f39726b = (FrameLayout) lvVar4.f39725a.getFragmentView();
            lv lvVar5 = lvVarArr[i10];
            lvVar5.f39727c = lvVar5.f39725a.getActionBar();
            lv lvVar6 = lvVarArr[i10];
            lvVar6.addView(lvVar6.f39726b, w7.x5.d(-1.0f, -1));
            AndroidUtilities.removeFromParent(lvVarArr[i10].f39727c);
            lv lvVar7 = lvVarArr[i10];
            lvVar7.addView(lvVar7.f39727c, w7.x5.d(-2.0f, -1));
            lvVarArr[i10].f39727c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    rm0Var = lvVarArr[i10].d;
                } else {
                    rm0Var = lvVarArr[i10].f39728e;
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
        kvVar.addView(this.actionBar, w7.x5.d(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f40038e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.f40038e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.f40038e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.f40038e.getCurrentTabId();
            if (currentTabId >= 0) {
                lvVarArr[0].f39729f = currentTabId;
            }
            this.f40038e.c();
        }
        m0(false);
        if (this.f40038e.getCurrentTabId() == this.f40038e.getFirstTabId()) {
            z10 = true;
        }
        this.f40043w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20801d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21079s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21098t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40038e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40038e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40038e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, new Drawable[]{this.f40038e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.i6.L8));
        arrayList.addAll(this.f40035a.getThemeDescriptions());
        arrayList.addAll(this.f40036b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f40043w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.y2(26, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.rm0 rm0Var;
        lv[] lvVarArr = this.f40039f;
        for (int i10 = 0; i10 < lvVarArr.length; i10++) {
            lvVarArr[i10].d.B0();
            ai.w0 w0Var = lvVarArr[i10].f39728e;
            if (w0Var != null) {
                w0Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                rm0Var = lvVarArr[z10 ? 1 : 0].d;
            } else {
                rm0Var = lvVarArr[z10 ? 1 : 0].f39728e;
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
        ty tyVar = this.f40035a;
        if (tyVar != null) {
            tyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f40036b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ty tyVar = this.f40035a;
        if (tyVar != null) {
            tyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f40036b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ty tyVar = this.f40035a;
        if (tyVar != null) {
            tyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f40036b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

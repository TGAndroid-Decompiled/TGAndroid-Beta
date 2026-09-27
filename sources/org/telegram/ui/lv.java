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
public final class lv extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.wr0 f35452x = new org.telegram.ui.Components.wr0(2);
    public ty f35453a;
    public ContactsActivity f35454b;
    public org.telegram.ui.ActionBar.w0 f35455c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public kv[] f35456f;
    public AnimatorSet h;
    public boolean f35457n;
    public boolean f35458r;
    public boolean f35459s;
    public int v;
    public boolean f35460w;

    public static void U(lv lvVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.e5.w0(lvVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(lvVar.currentAccount).blockPeer(user.f18476id);
            org.telegram.ui.Components.e5.w0(lvVar, LocaleController.getString(R.string.UserBlocked));
        }
        lvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.l h0(lv lvVar) {
        return lvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l i0(lv lvVar) {
        return lvVar.actionBar;
    }

    public static void j0(lv lvVar, float f7) {
        kv[] kvVarArr = lvVar.f35456f;
        lvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            int i11 = (int) f7;
            kvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ai.w0 w0Var = kvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.setPinnedSectionOffsetY(i11);
            }
        }
        lvVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.yl0 yl0Var;
        ai.w0 w0Var;
        ContactsActivity contactsActivity = this.f35454b;
        ty tyVar = this.f35453a;
        kv[] kvVarArr = this.f35456f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        boolean z10 = false;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 20));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 10);
        this.f35455c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.y5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        jv jvVar = new jv(this, context);
        this.fragmentView = jvVar;
        jvVar.setWillNotDraw(false);
        tyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            kv kvVar = new kv(this, context);
            kvVarArr[i10] = kvVar;
            jvVar.addView(kvVar, w7.y5.c(-1.0f, -1));
            if (i10 == 0) {
                kv kvVar2 = kvVarArr[i10];
                kvVar2.f35160a = tyVar;
                kvVar2.d = tyVar.f37976e0[0].f37593a;
                tyVar.V3();
                ay ayVar = tyVar.C0;
                if (ayVar != null) {
                    w0Var = ayVar.W;
                } else {
                    w0Var = null;
                }
                kvVar2.e = w0Var;
            } else if (i10 == 1) {
                kv kvVar3 = kvVarArr[i10];
                kvVar3.f35160a = contactsActivity;
                kvVar3.d = contactsActivity.f31030f;
                kvVar3.setVisibility(8);
            }
            kvVarArr[i10].d.setScrollingTouchSlop(1);
            kv kvVar4 = kvVarArr[i10];
            kvVar4.f35161b = (FrameLayout) kvVar4.f35160a.getFragmentView();
            kv kvVar5 = kvVarArr[i10];
            kvVar5.f35162c = kvVar5.f35160a.getActionBar();
            kv kvVar6 = kvVarArr[i10];
            kvVar6.addView(kvVar6.f35161b, w7.y5.c(-1.0f, -1));
            AndroidUtilities.removeFromParent(kvVarArr[i10].f35162c);
            kv kvVar7 = kvVarArr[i10];
            kvVar7.addView(kvVar7.f35162c, w7.y5.c(-2.0f, -1));
            kvVarArr[i10].f35162c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    yl0Var = kvVarArr[i10].d;
                } else {
                    yl0Var = kvVarArr[i10].e;
                }
                if (yl0Var != null) {
                    yl0Var.setClipToPadding(false);
                    yl0Var.setOnScrollListener(new ii.n3(5, this, yl0Var.getOnScrollListener()));
                }
            }
        }
        jvVar.addView(this.actionBar, w7.y5.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                kvVarArr[0].f35163f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f35460w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.i6.L8));
        arrayList.addAll(this.f35453a.getThemeDescriptions());
        arrayList.addAll(this.f35454b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f35460w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            c2Var.R = string;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.w2(26, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.yl0 yl0Var;
        kv[] kvVarArr = this.f35456f;
        for (int i10 = 0; i10 < kvVarArr.length; i10++) {
            kvVarArr[i10].d.C0();
            ai.w0 w0Var = kvVarArr[i10].e;
            if (w0Var != null) {
                w0Var.C0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                yl0Var = kvVarArr[z10 ? 1 : 0].d;
            } else {
                yl0Var = kvVarArr[z10 ? 1 : 0].e;
            }
            if (yl0Var != null) {
                yl0Var.getAdapter();
                yl0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) yl0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        ty tyVar = this.f35453a;
        if (tyVar != null) {
            tyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f35454b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ty tyVar = this.f35453a;
        if (tyVar != null) {
            tyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f35454b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ty tyVar = this.f35453a;
        if (tyVar != null) {
            tyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f35454b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}

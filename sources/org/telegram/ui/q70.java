package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class q70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, td.b, xg.d {
    public boolean A;
    public final HashMap B;
    public final ArrayList C;
    public org.telegram.ui.Components.w20 D;
    public int E;
    public int F;
    public int G;
    public final ig.e H;
    public final ng.d I;
    public ig.k J;
    public final ArrayList K;
    public final RectF L;
    public final int f41700a;
    public final td.c f41701b;
    public org.telegram.ui.Components.j10 f41702c;
    public o70 d;
    public org.telegram.ui.ActionBar.w1 f41703e;
    public p70 f41704f;
    public org.telegram.ui.Components.wk0 h;
    public f2.m0 f41705n;
    public org.telegram.ui.Components.gw0 f41706r;
    public m70 f41707s;
    public boolean v;
    public ArrayList f41708w;
    public int f41709x;
    public boolean f41710y;

    public q70() {
        super(null);
        int i9;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            i9 = 48;
        } else {
            i9 = 0;
        }
        this.f41700a = i9;
        this.f41701b = new td.c(3, this, org.telegram.ui.Components.gr.h, 350L, AndroidUtilities.dp(37.0f));
        this.B = new HashMap();
        this.C = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        RectF rectF = new RectF();
        this.L = rectF;
        arrayList.add(rectF);
        if (i10 >= 31) {
            this.H = new ig.e(false);
            this.I = new ng.d(null);
            return;
        }
        this.H = null;
        this.I = null;
    }

    public static void T(q70 q70Var, View view, int i9) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i9 == 0 && !q70Var.A) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(q70Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                q70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) q70Var.B.get(contact.key);
            if (w20Var != null) {
                q70Var.f41704f.a(w20Var);
            } else {
                org.telegram.ui.Components.w20 w20Var2 = new org.telegram.ui.Components.w20(q70Var.getParentActivity(), null, contact, true, q70Var.resourceProvider);
                p70 p70Var = q70Var.f41704f;
                ArrayList arrayList = p70Var.f41353c;
                q70 q70Var2 = p70Var.h;
                q70Var2.C.add(w20Var2);
                q70Var2.B.put(w20Var2.getKey(), w20Var2);
                AnimatorSet animatorSet = p70Var.f41351a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    p70Var.f41351a.cancel();
                }
                p70Var.f41352b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                p70Var.f41351a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.y11(p70Var, 29));
                p70Var.f41351a.setInterpolator(org.telegram.ui.Components.gr.h);
                p70Var.f41351a.setDuration(320L);
                p70Var.d = w20Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(p70Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p70Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(p70Var.d, View.ALPHA, 0.0f, 1.0f));
                p70Var.addView(w20Var2);
                w20Var2.setOnClickListener(q70Var);
            }
            q70Var.f41702c.e(!q70Var.C.isEmpty(), true);
            if (!q70Var.A && !q70Var.f41710y) {
                if (w20Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.dp dpVar = p4Var.f24870e;
                if (dpVar != null) {
                    dpVar.a(z10, true);
                }
            }
        }
    }

    public static void U(q70 q70Var) {
        ArrayList arrayList = q70Var.C;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i9 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.w20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i9 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(q70Var.currentAccount).getInviteText(i9));
            q70Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        q70Var.finishFragment();
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            Z();
            a0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final View M() {
        return this.fragmentView;
    }

    public final void X() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.H) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.L.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f41709x);
            eVar.g(1, this.K);
            eVar.e(this.J, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Y() {
        org.telegram.ui.Components.j10 j10Var = this.f41702c;
        if (j10Var != null) {
            j10Var.setTranslationY(-Math.max(this.F, this.G));
        }
    }

    public final void Z() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f41700a) + ((int) this.f41701b.f47780e), 0, this.F);
        this.f41706r.setPadding(0, 0, 0, this.F);
    }

    public final void a0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void b0() {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.h.getChildAt(i9);
            if ((childAt instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) childAt).getContact()) != null) {
                boolean containsKey = this.B.containsKey(contact.key);
                org.telegram.ui.Components.dp dpVar = p4Var.f24870e;
                if (dpVar != null) {
                    dpVar.a(containsKey, true);
                }
            }
        }
    }

    public final void c0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f41708w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(8));
        org.telegram.ui.Components.gw0 gw0Var = this.f41706r;
        if (gw0Var != null) {
            gw0Var.e(false, true);
        }
        m70 m70Var = this.f41707s;
        if (m70Var != null) {
            m70Var.l();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i9 = 0;
        this.A = false;
        this.f41710y = false;
        this.C.clear();
        this.B.clear();
        this.D = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 26));
        m0 m0Var = new m0(this, context, 9);
        this.fragmentView = m0Var;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 3);
        this.f41703e = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        p70 p70Var = new p70(this, context);
        this.f41704f = p70Var;
        this.f41703e.addView(p70Var, g7.e6.c(108.0f, -1));
        this.d = new o70(this, context, this.f41703e);
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(6);
        e00Var.f27885w = false;
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, e00Var, 0, null);
        this.f41706r = gw0Var;
        gw0Var.addView(e00Var, 0);
        this.f41706r.setAnimateLayoutChange(true);
        this.f41706r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f41706r.f28885e.setText("");
        this.f41706r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i11 = org.telegram.ui.ActionBar.f6.f22947a7;
        m0Var.setBackgroundColor(getThemedColor(i11));
        m0Var.addView(this.f41706r);
        this.f41705n = new f2.m0(1, false);
        this.f41707s = new m70(this, context);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.h = wk0Var;
        wk0Var.setSections(true);
        this.h.setEmptyView(this.f41706r);
        this.h.setAdapter(this.f41707s);
        this.h.setLayoutManager(this.f41705n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.wk0 wk0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        wk0Var2.setVerticalScrollbarPosition(i10);
        this.h.setClipToPadding(false);
        m0Var.addView(this.h, g7.e6.d(-1, -1.0f, 119, 0.0f, -this.f41700a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new l3(this, 16));
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.f23456l = 180;
        h2Var.invalidateSelf();
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.f41702c = j10Var;
        j10Var.f29579c.setImageDrawable(h2Var);
        this.f41702c.e(false, false);
        this.f41702c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f41702c.setOnClickListener(new q50(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.wk0 wk0Var3 = this.h;
        Objects.requireNonNull(wk0Var3);
        this.J = new ig.k(wk0Var3, m0Var, new ns(wk0Var3, 0));
        this.h.C0(new j70(this, 0));
        m70 m70Var = this.f41707s;
        if (m70Var != null && !this.A) {
            int h = m70Var.h();
            org.telegram.ui.Components.gw0 gw0Var2 = this.f41706r;
            if (h != 2) {
                i9 = 4;
            }
            gw0Var2.setVisibility(i9);
        }
        m0Var.addView(this.f41702c, org.telegram.ui.Components.j10.b());
        m0Var.addView(this.actionBar);
        m0Var.addView(this.d, g7.e6.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35501c1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.gw0 gw0Var;
        if (i9 == NotificationCenter.contactsImported) {
            c0();
        } else if (i9 == NotificationCenter.contactsDidLoad && (gw0Var = this.f41706r) != null) {
            gw0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23145l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23163m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.f23180n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23020e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Zh));
        int i9 = org.telegram.ui.ActionBar.f6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23093i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23128k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        int i10 = org.telegram.ui.ActionBar.f6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41704f, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41704f, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41704f, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.di));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41704f, 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.G = m1Var.f46929a.f(8).d;
        Y();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) view;
        if (w20Var.f34088y) {
            this.D = null;
            this.f41704f.a(w20Var);
            this.f41702c.e(!this.C.isEmpty(), true);
            b0();
            return;
        }
        org.telegram.ui.Components.w20 w20Var2 = this.D;
        if (w20Var2 != null) {
            w20Var2.a();
        }
        this.D = w20Var;
        w20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        c0();
        if (!UserConfig.getInstance(this.currentAccount).contactsReimported) {
            ContactsController.getInstance(this.currentAccount).forceImportContacts();
            UserConfig.getInstance(this.currentAccount).contactsReimported = true;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.F = i12;
        Z();
        Y();
    }

    @Override
    public final void K() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void B(float f10, int i9) {
    }
}

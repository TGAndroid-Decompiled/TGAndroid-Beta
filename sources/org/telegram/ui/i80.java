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
public final class i80 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, le.e, ph.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.n30 H;
    public int I;
    public int J;
    public int K;
    public final ah.h L;
    public final fh.d M;
    public ah.n N;
    public final ArrayList O;
    public final RectF P;
    public final int f34063a;
    public final le.f f34064b;
    public org.telegram.ui.Components.z10 f34065c;
    public g80 d;
    public org.telegram.ui.ActionBar.v1 e;
    public h80 f34066f;
    public org.telegram.ui.Components.ml0 h;
    public s4.c0 f34067n;
    public org.telegram.ui.Components.xw0 f34068r;
    public e80 f34069s;
    public boolean v;
    public ArrayList f34070w;
    public int f34071x;
    public boolean f34072y;

    public i80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f34063a = i10;
        this.f34064b = new le.f(3, this, org.telegram.ui.Components.rr.h, 350L, AndroidUtilities.dp(37.0f));
        this.F = new HashMap();
        this.G = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        RectF rectF = new RectF();
        this.P = rectF;
        arrayList.add(rectF);
        if (i11 >= 31) {
            this.L = new ah.h(false);
            this.M = new fh.d(null);
            return;
        }
        this.L = null;
        this.M = null;
    }

    public static void U(i80 i80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !i80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(i80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                i80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) i80Var.F.get(contact.key);
            if (n30Var != null) {
                i80Var.f34066f.a(n30Var);
            } else {
                org.telegram.ui.Components.n30 n30Var2 = new org.telegram.ui.Components.n30(i80Var.getParentActivity(), null, contact, true, i80Var.resourceProvider);
                h80 h80Var = i80Var.f34066f;
                ArrayList arrayList = h80Var.f33774c;
                i80 i80Var2 = h80Var.h;
                i80Var2.G.add(n30Var2);
                i80Var2.F.put(n30Var2.getKey(), n30Var2);
                AnimatorSet animatorSet = h80Var.f33772a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    h80Var.f33772a.cancel();
                }
                h80Var.f33773b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                h80Var.f33772a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.u81(h80Var, 23));
                h80Var.f33772a.setInterpolator(org.telegram.ui.Components.rr.h);
                h80Var.f33772a.setDuration(320L);
                h80Var.d = n30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(h80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(h80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(h80Var.d, View.ALPHA, 0.0f, 1.0f));
                h80Var.addView(n30Var2);
                n30Var2.setOnClickListener(i80Var);
            }
            i80Var.f34065c.e(!i80Var.G.isEmpty(), true);
            if (!i80Var.E && !i80Var.f34072y) {
                if (n30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.op opVar = p4Var.e;
                if (opVar != null) {
                    opVar.a(z10, true);
                }
            }
        }
    }

    public static void V(i80 i80Var) {
        ArrayList arrayList = i80Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.n30) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(i80Var.currentAccount).getInviteText(i10));
            i80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        i80Var.finishFragment();
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            a0();
            b0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f34071x);
            hVar.g(1, this.O);
            hVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.z10 z10Var = this.f34065c;
        if (z10Var != null) {
            z10Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f34063a) + ((int) this.f34064b.e), 0, this.J);
        this.f34068r.setPadding(0, 0, 0, this.J);
    }

    public final void b0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void c0() {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) childAt).getContact()) != null) {
                boolean containsKey = this.F.containsKey(contact.key);
                org.telegram.ui.Components.op opVar = p4Var.e;
                if (opVar != null) {
                    opVar.a(containsKey, true);
                }
            }
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
        int i10 = 0;
        this.E = false;
        this.f34072y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 1));
        k0 k0Var = new k0(this, context, 9);
        this.fragmentView = k0Var;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 3);
        this.e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        h80 h80Var = new h80(this, context);
        this.f34066f = h80Var;
        this.e.addView(h80Var, w7.x5.c(108.0f, -1));
        this.d = new g80(this, context, this.e);
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(6);
        u00Var.f28353w = false;
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, u00Var, 0, null);
        this.f34068r = xw0Var;
        xw0Var.addView(u00Var, 0);
        this.f34068r.setAnimateLayoutChange(true);
        this.f34068r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f34068r.e.setText("");
        this.f34068r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.h6.f18733a7;
        k0Var.setBackgroundColor(getThemedColor(i12));
        k0Var.addView(this.f34068r);
        this.f34067n = new s4.c0(1, false);
        this.f34069s = new e80(this, context);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.h = ml0Var;
        ml0Var.setSections(true);
        this.h.setEmptyView(this.f34068r);
        this.h.setAdapter(this.f34069s);
        this.h.setLayoutManager(this.f34067n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.ml0 ml0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        ml0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        k0Var.addView(this.h, w7.x5.d(-1, -1.0f, 119, 0.0f, -this.f34063a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new i3(this, 16));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.f18673l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.f34065c = z10Var;
        z10Var.f30506c.setImageDrawable(g2Var);
        this.f34065c.e(false, false);
        this.f34065c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f34065c.setOnClickListener(new h60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.ml0 ml0Var3 = this.h;
        Objects.requireNonNull(ml0Var3);
        this.N = new ah.n(ml0Var3, k0Var, new ts(ml0Var3, 0));
        this.h.C0(new b80(this, 0));
        e80 e80Var = this.f34069s;
        if (e80Var != null && !this.E) {
            int h = e80Var.h();
            org.telegram.ui.Components.xw0 xw0Var2 = this.f34068r;
            if (h != 2) {
                i10 = 4;
            }
            xw0Var2.setVisibility(i10);
        }
        k0Var.addView(this.f34065c, org.telegram.ui.Components.z10.b());
        k0Var.addView(this.actionBar);
        k0Var.addView(this.d, w7.x5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f30798g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f34070w = arrayList;
        Collections.sort(arrayList, new df(22));
        org.telegram.ui.Components.xw0 xw0Var = this.f34068r;
        if (xw0Var != null) {
            xw0Var.e(false, true);
        }
        e80 e80Var = this.f34069s;
        if (e80Var != null) {
            e80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.xw0 xw0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (xw0Var = this.f34068r) != null) {
            xw0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18935l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18954m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f18974n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Zh));
        int i10 = org.telegram.ui.ActionBar.h6.f18744ai;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18879i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18917k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18973n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19170y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.h6.f19038r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        int i11 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34066f, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18782ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34066f, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18763bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34066f, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18801di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34066f, 0, new Class[]{org.telegram.ui.Components.n30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.K = l1Var.f41807a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) view;
        if (n30Var.f26339y) {
            this.H = null;
            this.f34066f.a(n30Var);
            this.f34065c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.n30 n30Var2 = this.H;
        if (n30Var2 != null) {
            n30Var2.a();
        }
        this.H = n30Var;
        n30Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsImported);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        d0();
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.J = i13;
        a0();
        Z();
    }

    @Override
    public final void J() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}

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
public final class g80 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, le.e, ph.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.q30 H;
    public int I;
    public int J;
    public int K;
    public final ah.h L;
    public final fh.d M;
    public ah.n N;
    public final ArrayList O;
    public final RectF P;
    public final int f33990a;
    public final le.f f33991b;
    public org.telegram.ui.Components.c20 f33992c;
    public e80 d;
    public org.telegram.ui.ActionBar.u1 e;
    public f80 f33993f;
    public org.telegram.ui.Components.zl0 h;
    public s4.c0 f33994n;
    public org.telegram.ui.Components.lx0 f33995r;
    public c80 f33996s;
    public boolean v;
    public ArrayList f33997w;
    public int f33998x;
    public boolean f33999y;

    public g80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f33990a = i10;
        this.f33991b = new le.f(3, this, org.telegram.ui.Components.tr.h, 350L, AndroidUtilities.dp(37.0f));
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

    public static void U(g80 g80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !g80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(g80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                g80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) g80Var.F.get(contact.key);
            if (q30Var != null) {
                g80Var.f33993f.a(q30Var);
            } else {
                org.telegram.ui.Components.q30 q30Var2 = new org.telegram.ui.Components.q30(g80Var.getParentActivity(), null, contact, true, g80Var.resourceProvider);
                f80 f80Var = g80Var.f33993f;
                ArrayList arrayList = f80Var.f33662c;
                g80 g80Var2 = f80Var.h;
                g80Var2.G.add(q30Var2);
                g80Var2.F.put(q30Var2.getKey(), q30Var2);
                AnimatorSet animatorSet = f80Var.f33660a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    f80Var.f33660a.cancel();
                }
                f80Var.f33661b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                f80Var.f33660a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.s81(f80Var, 24));
                f80Var.f33660a.setInterpolator(org.telegram.ui.Components.tr.h);
                f80Var.f33660a.setDuration(320L);
                f80Var.d = q30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(f80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f80Var.d, View.ALPHA, 0.0f, 1.0f));
                f80Var.addView(q30Var2);
                q30Var2.setOnClickListener(g80Var);
            }
            g80Var.f33992c.e(!g80Var.G.isEmpty(), true);
            if (!g80Var.E && !g80Var.f33999y) {
                if (q30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.qp qpVar = p4Var.e;
                if (qpVar != null) {
                    qpVar.a(z10, true);
                }
            }
        }
    }

    public static void V(g80 g80Var) {
        ArrayList arrayList = g80Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.q30) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(g80Var.currentAccount).getInviteText(i10));
            g80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        g80Var.finishFragment();
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
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f33998x);
            hVar.g(1, this.O);
            hVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.c20 c20Var = this.f33992c;
        if (c20Var != null) {
            c20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f33990a) + ((int) this.f33991b.e), 0, this.J);
        this.f33995r.setPadding(0, 0, 0, this.J);
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
                org.telegram.ui.Components.qp qpVar = p4Var.e;
                if (qpVar != null) {
                    qpVar.a(containsKey, true);
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
        this.f33999y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 1));
        k0 k0Var = new k0(this, context, 9);
        this.fragmentView = k0Var;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 3);
        this.e = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        f80 f80Var = new f80(this, context);
        this.f33993f = f80Var;
        this.e.addView(f80Var, w7.y5.c(108.0f, -1));
        this.d = new e80(this, context, this.e);
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(6);
        w00Var.f29763w = false;
        org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(context, w00Var, 0, null);
        this.f33995r = lx0Var;
        lx0Var.addView(w00Var, 0);
        this.f33995r.setAnimateLayoutChange(true);
        this.f33995r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f33995r.e.setText("");
        this.f33995r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.h6.f19020a7;
        k0Var.setBackgroundColor(getThemedColor(i12));
        k0Var.addView(this.f33995r);
        this.f33994n = new s4.c0(1, false);
        this.f33996s = new c80(this, context);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.h = zl0Var;
        zl0Var.setSections(true);
        this.h.setEmptyView(this.f33995r);
        this.h.setAdapter(this.f33996s);
        this.h.setLayoutManager(this.f33994n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.zl0 zl0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        zl0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        k0Var.addView(this.h, w7.y5.d(-1, -1.0f, 119, 0.0f, -this.f33990a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new i3(this, 16));
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        f2Var.f18893l = 180;
        f2Var.invalidateSelf();
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, this.resourceProvider, false);
        this.f33992c = c20Var;
        c20Var.f23130c.setImageDrawable(f2Var);
        this.f33992c.e(false, false);
        this.f33992c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f33992c.setOnClickListener(new f60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.zl0 zl0Var3 = this.h;
        Objects.requireNonNull(zl0Var3);
        this.N = new ah.n(zl0Var3, k0Var, new rs(zl0Var3, 0));
        this.h.D0(new z70(this, 0));
        c80 c80Var = this.f33996s;
        if (c80Var != null && !this.E) {
            int h = c80Var.h();
            org.telegram.ui.Components.lx0 lx0Var2 = this.f33995r;
            if (h != 2) {
                i10 = 4;
            }
            lx0Var2.setVisibility(i10);
        }
        k0Var.addView(this.f33992c, org.telegram.ui.Components.c20.b());
        k0Var.addView(this.actionBar);
        k0Var.addView(this.d, w7.y5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31187g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f33997w = arrayList;
        Collections.sort(arrayList, new cf(22));
        org.telegram.ui.Components.lx0 lx0Var = this.f33995r;
        if (lx0Var != null) {
            lx0Var.e(false, true);
        }
        c80 c80Var = this.f33996s;
        if (c80Var != null) {
            c80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.lx0 lx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (lx0Var = this.f33995r) != null) {
            lx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19020a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19354s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19409v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19373t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19222l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19241m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f19261n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19197k0, null, null, org.telegram.ui.ActionBar.h6.f19077d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Zh));
        int i10 = org.telegram.ui.ActionBar.h6.f19031ai;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19166i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19204k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19260n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19459y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.h6.f19327r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        int i11 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33993f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19069ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33993f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19050bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33993f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19088di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33993f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.K = l1Var.f42245a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) view;
        if (q30Var.f27535y) {
            this.H = null;
            this.f33993f.a(q30Var);
            this.f33992c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.q30 q30Var2 = this.H;
        if (q30Var2 != null) {
            q30Var2.a();
        }
        this.H = q30Var;
        q30Var.b();
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

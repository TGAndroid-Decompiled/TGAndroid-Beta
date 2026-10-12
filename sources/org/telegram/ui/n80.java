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
public final class n80 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, me.d, ph.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.g40 H;
    public int I;
    public int J;
    public int K;
    public final ah.h L;
    public final fh.d M;
    public ah.n N;
    public final ArrayList O;
    public final RectF P;
    public final int f40315a;
    public final me.e f40316b;
    public org.telegram.ui.Components.s20 f40317c;
    public l80 d;
    public org.telegram.ui.ActionBar.u1 f40318e;
    public m80 f40319f;
    public org.telegram.ui.Components.wm0 h;
    public s4.d0 f40320n;
    public org.telegram.ui.Components.gy0 f40321r;
    public j80 f40322s;
    public boolean v;
    public ArrayList f40323w;
    public int f40324x;
    public boolean f40325y;

    public n80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f40315a = i10;
        this.f40316b = new me.e(3, this, org.telegram.ui.Components.js.h, 350L, AndroidUtilities.dp(37.0f));
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

    public static void U(n80 n80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !n80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(n80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                n80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) n80Var.F.get(contact.key);
            if (g40Var != null) {
                n80Var.f40319f.a(g40Var);
            } else {
                org.telegram.ui.Components.g40 g40Var2 = new org.telegram.ui.Components.g40(n80Var.getParentActivity(), null, contact, true, n80Var.resourceProvider);
                m80 m80Var = n80Var.f40319f;
                ArrayList arrayList = m80Var.f39941c;
                n80 n80Var2 = m80Var.h;
                n80Var2.G.add(g40Var2);
                n80Var2.F.put(g40Var2.getKey(), g40Var2);
                AnimatorSet animatorSet = m80Var.f39939a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    m80Var.f39939a.cancel();
                }
                m80Var.f39940b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                m80Var.f39939a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.o91(m80Var, 24));
                m80Var.f39939a.setInterpolator(org.telegram.ui.Components.js.h);
                m80Var.f39939a.setDuration(320L);
                m80Var.d = g40Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(m80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(m80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(m80Var.d, View.ALPHA, 0.0f, 1.0f));
                m80Var.addView(g40Var2);
                g40Var2.setOnClickListener(n80Var);
            }
            n80Var.f40317c.e(!n80Var.G.isEmpty(), true);
            if (!n80Var.E && !n80Var.f40325y) {
                if (g40Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.fq fqVar = p4Var.f22417e;
                if (fqVar != null) {
                    fqVar.a(z10, true);
                }
            }
        }
    }

    public static void V(n80 n80Var) {
        ArrayList arrayList = n80Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.g40) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(n80Var.currentAccount).getInviteText(i10));
            n80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        n80Var.finishFragment();
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f40324x);
            hVar.g(1, this.O);
            hVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.s20 s20Var = this.f40317c;
        if (s20Var != null) {
            s20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f40315a) + ((int) this.f40316b.f16095e), 0, this.J);
        this.f40321r.setPadding(0, 0, 0, this.J);
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
                org.telegram.ui.Components.fq fqVar = p4Var.f22417e;
                if (fqVar != null) {
                    fqVar.a(containsKey, true);
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
        this.f40325y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 2));
        k0 k0Var = new k0(this, context, 9);
        this.fragmentView = k0Var;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 3);
        this.f40318e = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        m80 m80Var = new m80(this, context);
        this.f40319f = m80Var;
        this.f40318e.addView(m80Var, w7.w5.d(108.0f, -1));
        this.d = new l80(this, context, this.f40318e);
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, null);
        m10Var.setViewType(6);
        m10Var.f28355w = false;
        org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(context, m10Var, 0, null);
        this.f40321r = gy0Var;
        gy0Var.addView(m10Var, 0);
        this.f40321r.setAnimateLayoutChange(true);
        this.f40321r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f40321r.f26557e.setText("");
        this.f40321r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.h6.f20503a7;
        k0Var.setBackgroundColor(getThemedColor(i12));
        k0Var.addView(this.f40321r);
        this.f40320n = new s4.d0(1, false);
        this.f40322s = new j80(this, context);
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.h = wm0Var;
        wm0Var.setSections(true);
        this.h.setEmptyView(this.f40321r);
        this.h.setAdapter(this.f40322s);
        this.h.setLayoutManager(this.f40320n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.wm0 wm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        wm0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        k0Var.addView(this.h, w7.w5.a(-1.0f, 0.0f, -this.f40315a, 0.0f, 0.0f, -1, 119));
        this.h.setOnItemClickListener(new i(this, 15));
        this.h.setOnScrollListener(new i3(this, 16));
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        f2Var.f20389l = 180;
        f2Var.invalidateSelf();
        org.telegram.ui.Components.s20 s20Var = new org.telegram.ui.Components.s20(context, this.resourceProvider, false);
        this.f40317c = s20Var;
        s20Var.f30371c.setImageDrawable(f2Var);
        this.f40317c.e(false, false);
        this.f40317c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f40317c.setOnClickListener(new o60(this, 3));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.wm0 wm0Var3 = this.h;
        Objects.requireNonNull(wm0Var3);
        this.N = new ah.n(wm0Var3, k0Var, new ys(wm0Var3, 0));
        this.h.C0(new g80(this, 0));
        j80 j80Var = this.f40322s;
        if (j80Var != null && !this.E) {
            int h = j80Var.h();
            org.telegram.ui.Components.gy0 gy0Var2 = this.f40321r;
            if (h != 2) {
                i10 = 4;
            }
            gy0Var2.setVisibility(i10);
        }
        k0Var.addView(this.f40317c, org.telegram.ui.Components.s20.b());
        k0Var.addView(this.actionBar);
        k0Var.addView(this.d, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33627g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f40323w = arrayList;
        Collections.sort(arrayList, new lf(22));
        org.telegram.ui.Components.gy0 gy0Var = this.f40321r;
        if (gy0Var != null) {
            gy0Var.e(false, true);
        }
        j80 j80Var = this.f40322s;
        if (j80Var != null) {
            j80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.gy0 gy0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (gy0Var = this.f40321r) != null) {
            gy0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20503a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20839s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20858t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20706l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20725m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20745n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20681k0, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Zh));
        int i10 = org.telegram.ui.ActionBar.h6.f20514ai;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20651i7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20688k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20744n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20945y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.h6.f20812r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        int i11 = org.telegram.ui.ActionBar.h6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40319f, 0, new Class[]{org.telegram.ui.Components.g40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20552ci));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40319f, 0, new Class[]{org.telegram.ui.Components.g40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20534bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40319f, 0, new Class[]{org.telegram.ui.Components.g40.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20571di));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40319f, 0, new Class[]{org.telegram.ui.Components.g40.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.k1 k1Var) {
        this.K = k1Var.f46992a.f(8).d;
        Z();
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
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
    public final void onClick(View view) {
        org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) view;
        if (g40Var.f26268y) {
            this.H = null;
            this.f40319f.a(g40Var);
            this.f40317c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.g40 g40Var2 = this.H;
        if (g40Var2 != null) {
            g40Var2.a();
        }
        this.H = g40Var;
        g40Var.b();
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
    public final void t() {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}

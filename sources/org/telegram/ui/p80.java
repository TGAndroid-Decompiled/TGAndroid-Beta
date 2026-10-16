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
public final class p80 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, ne.d, qh.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.z30 H;
    public int I;
    public int J;
    public int K;
    public final bh.f L;
    public final gh.d M;
    public bh.l N;
    public final ArrayList O;
    public final RectF P;
    public final int f38836a;
    public final ne.e f38837b;
    public org.telegram.ui.Components.l20 f38838c;
    public n80 d;
    public org.telegram.ui.ActionBar.u1 e;
    public o80 f38839f;
    public org.telegram.ui.Components.mm0 h;
    public s4.b0 f38840n;
    public org.telegram.ui.Components.wx0 f38841r;
    public l80 f38842s;
    public boolean v;
    public ArrayList f38843w;
    public int f38844x;
    public boolean f38845y;

    public p80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f38836a = i10;
        this.f38837b = new ne.e(3, this, org.telegram.ui.Components.es.h, 350L, AndroidUtilities.dp(37.0f));
        this.F = new HashMap();
        this.G = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        RectF rectF = new RectF();
        this.P = rectF;
        arrayList.add(rectF);
        if (i11 >= 31) {
            this.L = new bh.f(false);
            this.M = new gh.d(null);
            return;
        }
        this.L = null;
        this.M = null;
    }

    public static void U(p80 p80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !p80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(p80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                p80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.z30 z30Var = (org.telegram.ui.Components.z30) p80Var.F.get(contact.key);
            if (z30Var != null) {
                p80Var.f38839f.a(z30Var);
            } else {
                org.telegram.ui.Components.z30 z30Var2 = new org.telegram.ui.Components.z30(p80Var.getParentActivity(), null, contact, true, p80Var.resourceProvider);
                o80 o80Var = p80Var.f38839f;
                ArrayList arrayList = o80Var.f38567c;
                p80 p80Var2 = o80Var.h;
                p80Var2.G.add(z30Var2);
                p80Var2.F.put(z30Var2.getKey(), z30Var2);
                AnimatorSet animatorSet = o80Var.f38565a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    o80Var.f38565a.cancel();
                }
                o80Var.f38566b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                o80Var.f38565a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.v61(o80Var, 27));
                o80Var.f38565a.setInterpolator(org.telegram.ui.Components.es.h);
                o80Var.f38565a.setDuration(320L);
                o80Var.d = z30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(o80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(o80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(o80Var.d, View.ALPHA, 0.0f, 1.0f));
                o80Var.addView(z30Var2);
                z30Var2.setOnClickListener(p80Var);
            }
            p80Var.f38838c.e(!p80Var.G.isEmpty(), true);
            if (!p80Var.E && !p80Var.f38845y) {
                if (z30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.aq aqVar = p4Var.e;
                if (aqVar != null) {
                    aqVar.a(z10, true);
                }
            }
        }
    }

    public static void V(p80 p80Var) {
        ArrayList arrayList = p80Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.z30) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(p80Var.currentAccount).getInviteText(i10));
            p80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        p80Var.finishFragment();
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f38844x);
            fVar.g(1, this.O);
            fVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.l20 l20Var = this.f38838c;
        if (l20Var != null) {
            l20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f38836a) + ((int) this.f38837b.e), 0, this.J);
        this.f38841r.setPadding(0, 0, 0, this.J);
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
                org.telegram.ui.Components.aq aqVar = p4Var.e;
                if (aqVar != null) {
                    aqVar.a(containsKey, true);
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
        this.f38845y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 3));
        l0 l0Var = new l0(this, context, 9);
        this.fragmentView = l0Var;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(this, context, 3);
        this.e = u1Var;
        u1Var.setVerticalScrollBarEnabled(false);
        o80 o80Var = new o80(this, context);
        this.f38839f = o80Var;
        this.e.addView(o80Var, w7.z5.d(108.0f, -1));
        this.d = new n80(this, context, this.e);
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        f10Var.setViewType(6);
        f10Var.f24549w = false;
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, f10Var, 0, null);
        this.f38841r = wx0Var;
        wx0Var.addView(f10Var, 0);
        this.f38841r.setAnimateLayoutChange(true);
        this.f38841r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f38841r.e.setText("");
        this.f38841r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.g6.f19543a7;
        l0Var.setBackgroundColor(getThemedColor(i12));
        l0Var.addView(this.f38841r);
        this.f38840n = new s4.b0(1, false);
        this.f38842s = new l80(this, context);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.h = mm0Var;
        mm0Var.setSections(true);
        this.h.setEmptyView(this.f38841r);
        this.h.setAdapter(this.f38842s);
        this.h.setLayoutManager(this.f38840n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.mm0 mm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        mm0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        l0Var.addView(this.h, w7.z5.a(-1.0f, 0.0f, -this.f38836a, 0.0f, 0.0f, -1, 119));
        this.h.setOnItemClickListener(new i(this, 15));
        this.h.setOnScrollListener(new k3(this, 16));
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        f2Var.f19482l = 180;
        f2Var.invalidateSelf();
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(context, this.resourceProvider, false);
        this.f38838c = l20Var;
        l20Var.f26585c.setImageDrawable(f2Var);
        this.f38838c.e(false, false);
        this.f38838c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f38838c.setOnClickListener(new t60(this, 3));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.mm0 mm0Var3 = this.h;
        Objects.requireNonNull(mm0Var3);
        this.N = new bh.l(mm0Var3, l0Var, new bt(mm0Var3, 0));
        this.h.C0(new i80(this, 0));
        l80 l80Var = this.f38842s;
        if (l80Var != null && !this.E) {
            int h = l80Var.h();
            org.telegram.ui.Components.wx0 wx0Var2 = this.f38841r;
            if (h != 2) {
                i10 = 4;
            }
            wx0Var2.setVisibility(i10);
        }
        l0Var.addView(this.f38838c, org.telegram.ui.Components.l20.b());
        l0Var.addView(this.actionBar);
        l0Var.addView(this.d, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31818g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f38843w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(26));
        org.telegram.ui.Components.wx0 wx0Var = this.f38841r;
        if (wx0Var != null) {
            wx0Var.e(false, true);
        }
        l80 l80Var = this.f38842s;
        if (l80Var != null) {
            l80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.wx0 wx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (wx0Var = this.f38841r) != null) {
            wx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19746l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19765m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19785n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Zh));
        int i10 = org.telegram.ui.ActionBar.g6.f19554ai;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19691i7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19729k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19784n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19988y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.g6.f19852r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        int i11 = org.telegram.ui.ActionBar.g6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38839f, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19594ci));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38839f, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19574bi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38839f, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19611di));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38839f, 0, new Class[]{org.telegram.ui.Components.z30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.l1 l1Var) {
        this.K = l1Var.f43497a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.z30 z30Var = (org.telegram.ui.Components.z30) view;
        if (z30Var.f31447y) {
            this.H = null;
            this.f38839f.a(z30Var);
            this.f38838c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.z30 z30Var2 = this.H;
        if (z30Var2 != null) {
            z30Var2.a();
        }
        this.H = z30Var;
        z30Var.b();
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
    public final void p(int i10, float f7, float f10, ne.e eVar) {
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
    public final void J() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void A(float f7, int i10) {
    }
}

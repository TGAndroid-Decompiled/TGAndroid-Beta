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
public final class l80 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, me.d, ph.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.e40 H;
    public int I;
    public int J;
    public int K;
    public final ah.h L;
    public final fh.d M;
    public ah.n N;
    public final ArrayList O;
    public final RectF P;
    public final int f39506a;
    public final me.e f39507b;
    public org.telegram.ui.Components.q20 f39508c;
    public j80 d;
    public org.telegram.ui.ActionBar.v1 f39509e;
    public k80 f39510f;
    public org.telegram.ui.Components.rm0 h;
    public s4.d0 f39511n;
    public org.telegram.ui.Components.by0 f39512r;
    public h80 f39513s;
    public boolean v;
    public ArrayList f39514w;
    public int f39515x;
    public boolean f39516y;

    public l80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f39506a = i10;
        this.f39507b = new me.e(3, this, org.telegram.ui.Components.is.h, 350L, AndroidUtilities.dp(37.0f));
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

    public static void U(l80 l80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !l80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(l80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                l80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.e40 e40Var = (org.telegram.ui.Components.e40) l80Var.F.get(contact.key);
            if (e40Var != null) {
                l80Var.f39510f.a(e40Var);
            } else {
                org.telegram.ui.Components.e40 e40Var2 = new org.telegram.ui.Components.e40(l80Var.getParentActivity(), null, contact, true, l80Var.resourceProvider);
                k80 k80Var = l80Var.f39510f;
                ArrayList arrayList = k80Var.f39221c;
                l80 l80Var2 = k80Var.h;
                l80Var2.G.add(e40Var2);
                l80Var2.F.put(e40Var2.getKey(), e40Var2);
                AnimatorSet animatorSet = k80Var.f39219a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    k80Var.f39219a.cancel();
                }
                k80Var.f39220b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                k80Var.f39219a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.j91(k80Var, 24));
                k80Var.f39219a.setInterpolator(org.telegram.ui.Components.is.h);
                k80Var.f39219a.setDuration(320L);
                k80Var.d = e40Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.ALPHA, 0.0f, 1.0f));
                k80Var.addView(e40Var2);
                e40Var2.setOnClickListener(l80Var);
            }
            l80Var.f39508c.e(!l80Var.G.isEmpty(), true);
            if (!l80Var.E && !l80Var.f39516y) {
                if (e40Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.dq dqVar = p4Var.f22658e;
                if (dqVar != null) {
                    dqVar.a(z10, true);
                }
            }
        }
    }

    public static void V(l80 l80Var) {
        ArrayList arrayList = l80Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.e40) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(l80Var.currentAccount).getInviteText(i10));
            l80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        l80Var.finishFragment();
    }

    @Override
    public final View N() {
        return this.fragmentView;
    }

    public final void Y() {
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f39515x);
            hVar.g(1, this.O);
            hVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.q20 q20Var = this.f39508c;
        if (q20Var != null) {
            q20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f39506a) + ((int) this.f39507b.f16349e), 0, this.J);
        this.f39512r.setPadding(0, 0, 0, this.J);
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
                org.telegram.ui.Components.dq dqVar = p4Var.f22658e;
                if (dqVar != null) {
                    dqVar.a(containsKey, true);
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
        this.f39516y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 1));
        k0 k0Var = new k0(this, context, 9);
        this.fragmentView = k0Var;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 3);
        this.f39509e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        k80 k80Var = new k80(this, context);
        this.f39510f = k80Var;
        this.f39509e.addView(k80Var, w7.x5.d(108.0f, -1));
        this.d = new j80(this, context, this.f39509e);
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        k10Var.setViewType(6);
        k10Var.f27857w = false;
        org.telegram.ui.Components.by0 by0Var = new org.telegram.ui.Components.by0(context, k10Var, 0, null);
        this.f39512r = by0Var;
        by0Var.addView(k10Var, 0);
        this.f39512r.setAnimateLayoutChange(true);
        this.f39512r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f39512r.f25085e.setText("");
        this.f39512r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.i6.f20745a7;
        k0Var.setBackgroundColor(getThemedColor(i12));
        k0Var.addView(this.f39512r);
        this.f39511n = new s4.d0(1, false);
        this.f39513s = new h80(this, context);
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.h = rm0Var;
        rm0Var.setSections(true);
        this.h.setEmptyView(this.f39512r);
        this.h.setAdapter(this.f39513s);
        this.h.setLayoutManager(this.f39511n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.rm0 rm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        rm0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        k0Var.addView(this.h, w7.x5.a(-1.0f, 0.0f, -this.f39506a, 0.0f, 0.0f, -1, 119));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new i3(this, 16));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.f20645l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.q20 q20Var = new org.telegram.ui.Components.q20(context, this.resourceProvider, false);
        this.f39508c = q20Var;
        q20Var.f29985c.setImageDrawable(g2Var);
        this.f39508c.e(false, false);
        this.f39508c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f39508c.setOnClickListener(new m60(this, 3));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.rm0 rm0Var3 = this.h;
        Objects.requireNonNull(rm0Var3);
        this.N = new ah.n(rm0Var3, k0Var, new vs(rm0Var3, 0));
        this.h.C0(new e80(this, 0));
        h80 h80Var = this.f39513s;
        if (h80Var != null && !this.E) {
            int h = h80Var.h();
            org.telegram.ui.Components.by0 by0Var2 = this.f39512r;
            if (h != 2) {
                i10 = 4;
            }
            by0Var2.setVisibility(i10);
        }
        k0Var.addView(this.f39508c, org.telegram.ui.Components.q20.b());
        k0Var.addView(this.actionBar);
        k0Var.addView(this.d, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33828g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f39514w = arrayList;
        Collections.sort(arrayList, new gf(22));
        org.telegram.ui.Components.by0 by0Var = this.f39512r;
        if (by0Var != null) {
            by0Var.e(false, true);
        }
        h80 h80Var = this.f39513s;
        if (h80Var != null) {
            h80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.by0 by0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (by0Var = this.f39512r) != null) {
            by0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20745a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21079s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21098t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20892i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20948l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20967m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20987n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20923k0, null, null, org.telegram.ui.ActionBar.i6.f20802d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Zh));
        int i10 = org.telegram.ui.ActionBar.i6.f20756ai;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20893i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20930k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20986n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21185y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.i6.f21053r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        int i11 = org.telegram.ui.ActionBar.i6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39510f, 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20794ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39510f, 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20776bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39510f, 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20813di));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39510f, 0, new Class[]{org.telegram.ui.Components.e40.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.k1 k1Var) {
        this.K = k1Var.f46821a.f(8).d;
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
        org.telegram.ui.Components.e40 e40Var = (org.telegram.ui.Components.e40) view;
        if (e40Var.f25904y) {
            this.H = null;
            this.f39510f.a(e40Var);
            this.f39508c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.e40 e40Var2 = this.H;
        if (e40Var2 != null) {
            e40Var2.a();
        }
        this.H = e40Var;
        e40Var.b();
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
    public final void A(float f7, int i10) {
    }
}

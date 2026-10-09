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
    public org.telegram.ui.Components.d40 H;
    public int I;
    public int J;
    public int K;
    public final ah.h L;
    public final fh.d M;
    public ah.n N;
    public final ArrayList O;
    public final RectF P;
    public final int f39460a;
    public final me.e f39461b;
    public org.telegram.ui.Components.p20 f39462c;
    public j80 d;
    public org.telegram.ui.ActionBar.v1 f39463e;
    public k80 f39464f;
    public org.telegram.ui.Components.qm0 h;
    public s4.d0 f39465n;
    public org.telegram.ui.Components.ay0 f39466r;
    public h80 f39467s;
    public boolean v;
    public ArrayList f39468w;
    public int f39469x;
    public boolean f39470y;

    public l80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f39460a = i10;
        this.f39461b = new me.e(3, this, org.telegram.ui.Components.hs.h, 350L, AndroidUtilities.dp(37.0f));
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
            org.telegram.ui.Components.d40 d40Var = (org.telegram.ui.Components.d40) l80Var.F.get(contact.key);
            if (d40Var != null) {
                l80Var.f39464f.a(d40Var);
            } else {
                org.telegram.ui.Components.d40 d40Var2 = new org.telegram.ui.Components.d40(l80Var.getParentActivity(), null, contact, true, l80Var.resourceProvider);
                k80 k80Var = l80Var.f39464f;
                ArrayList arrayList = k80Var.f39175c;
                l80 l80Var2 = k80Var.h;
                l80Var2.G.add(d40Var2);
                l80Var2.F.put(d40Var2.getKey(), d40Var2);
                AnimatorSet animatorSet = k80Var.f39173a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    k80Var.f39173a.cancel();
                }
                k80Var.f39174b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                k80Var.f39173a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.i91(k80Var, 24));
                k80Var.f39173a.setInterpolator(org.telegram.ui.Components.hs.h);
                k80Var.f39173a.setDuration(320L);
                k80Var.d = d40Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.ALPHA, 0.0f, 1.0f));
                k80Var.addView(d40Var2);
                d40Var2.setOnClickListener(l80Var);
            }
            l80Var.f39462c.e(!l80Var.G.isEmpty(), true);
            if (!l80Var.E && !l80Var.f39470y) {
                if (d40Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.dq dqVar = p4Var.f22654e;
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
                ContactsController.Contact contact = ((org.telegram.ui.Components.d40) arrayList.get(i11)).getContact();
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
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f39469x);
            hVar.g(1, this.O);
            hVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.p20 p20Var = this.f39462c;
        if (p20Var != null) {
            p20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f39460a) + ((int) this.f39461b.f16345e), 0, this.J);
        this.f39466r.setPadding(0, 0, 0, this.J);
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
                org.telegram.ui.Components.dq dqVar = p4Var.f22654e;
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
        this.f39470y = false;
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
        this.f39463e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        k80 k80Var = new k80(this, context);
        this.f39464f = k80Var;
        this.f39463e.addView(k80Var, w7.x5.d(108.0f, -1));
        this.d = new j80(this, context, this.f39463e);
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, null);
        j10Var.setViewType(6);
        j10Var.f27555w = false;
        org.telegram.ui.Components.ay0 ay0Var = new org.telegram.ui.Components.ay0(context, j10Var, 0, null);
        this.f39466r = ay0Var;
        ay0Var.addView(j10Var, 0);
        this.f39466r.setAnimateLayoutChange(true);
        this.f39466r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f39466r.f24802e.setText("");
        this.f39466r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.i6.f20741a7;
        k0Var.setBackgroundColor(getThemedColor(i12));
        k0Var.addView(this.f39466r);
        this.f39465n = new s4.d0(1, false);
        this.f39467s = new h80(this, context);
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.h = qm0Var;
        qm0Var.setSections(true);
        this.h.setEmptyView(this.f39466r);
        this.h.setAdapter(this.f39467s);
        this.h.setLayoutManager(this.f39465n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.qm0 qm0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        qm0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        k0Var.addView(this.h, w7.x5.a(-1.0f, 0.0f, -this.f39460a, 0.0f, 0.0f, -1, 119));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new i3(this, 16));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.f20641l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(context, this.resourceProvider, false);
        this.f39462c = p20Var;
        p20Var.f29695c.setImageDrawable(g2Var);
        this.f39462c.e(false, false);
        this.f39462c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f39462c.setOnClickListener(new m60(this, 3));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.qm0 qm0Var3 = this.h;
        Objects.requireNonNull(qm0Var3);
        this.N = new ah.n(qm0Var3, k0Var, new vs(qm0Var3, 0));
        this.h.C0(new e80(this, 0));
        h80 h80Var = this.f39467s;
        if (h80Var != null && !this.E) {
            int h = h80Var.h();
            org.telegram.ui.Components.ay0 ay0Var2 = this.f39466r;
            if (h != 2) {
                i10 = 4;
            }
            ay0Var2.setVisibility(i10);
        }
        k0Var.addView(this.f39462c, org.telegram.ui.Components.p20.b());
        k0Var.addView(this.actionBar);
        k0Var.addView(this.d, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33790g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f39468w = arrayList;
        Collections.sort(arrayList, new gf(22));
        org.telegram.ui.Components.ay0 ay0Var = this.f39466r;
        if (ay0Var != null) {
            ay0Var.e(false, true);
        }
        h80 h80Var = this.f39467s;
        if (h80Var != null) {
            h80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.ay0 ay0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (ay0Var = this.f39466r) != null) {
            ay0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20944l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20963m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20983n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Zh));
        int i10 = org.telegram.ui.ActionBar.i6.f20752ai;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20889i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20926k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20982n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21181y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.i6.f21049r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        int i11 = org.telegram.ui.ActionBar.i6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39464f, 0, new Class[]{org.telegram.ui.Components.d40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20790ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39464f, 0, new Class[]{org.telegram.ui.Components.d40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20772bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39464f, 0, new Class[]{org.telegram.ui.Components.d40.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20809di));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39464f, 0, new Class[]{org.telegram.ui.Components.d40.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.k1 k1Var) {
        this.K = k1Var.f46775a.f(8).d;
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
        org.telegram.ui.Components.d40 d40Var = (org.telegram.ui.Components.d40) view;
        if (d40Var.f25593y) {
            this.H = null;
            this.f39464f.a(d40Var);
            this.f39462c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.d40 d40Var2 = this.H;
        if (d40Var2 != null) {
            d40Var2.a();
        }
        this.H = d40Var;
        d40Var.b();
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

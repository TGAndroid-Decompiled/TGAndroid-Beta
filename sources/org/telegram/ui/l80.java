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
public final class l80 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, le.d, ph.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.m30 H;
    public int I;
    public int J;
    public int K;
    public final ah.i L;
    public final fh.d M;
    public ah.o N;
    public final ArrayList O;
    public final RectF P;
    public final int f35363a;
    public final le.e f35364b;
    public org.telegram.ui.Components.y10 f35365c;
    public j80 d;
    public org.telegram.ui.ActionBar.v1 e;
    public k80 f35366f;
    public org.telegram.ui.Components.yl0 h;
    public s4.c0 f35367n;
    public org.telegram.ui.Components.lx0 f35368r;
    public h80 f35369s;
    public boolean v;
    public ArrayList f35370w;
    public int f35371x;
    public boolean f35372y;

    public l80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f35363a = i10;
        this.f35364b = new le.e(3, this, org.telegram.ui.Components.qr.h, 350L, AndroidUtilities.dp(37.0f));
        this.F = new HashMap();
        this.G = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        RectF rectF = new RectF();
        this.P = rectF;
        arrayList.add(rectF);
        if (i11 >= 31) {
            this.L = new ah.i(false);
            this.M = new fh.d(null);
            return;
        }
        this.L = null;
        this.M = null;
    }

    public static void U(l80 l80Var, View view, int i10) {
        org.telegram.ui.Cells.q4 q4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !l80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(l80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                l80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) l80Var.F.get(contact.key);
            if (m30Var != null) {
                l80Var.f35366f.a(m30Var);
            } else {
                org.telegram.ui.Components.m30 m30Var2 = new org.telegram.ui.Components.m30(l80Var.getParentActivity(), null, contact, true, l80Var.resourceProvider);
                k80 k80Var = l80Var.f35366f;
                ArrayList arrayList = k80Var.f35082c;
                l80 l80Var2 = k80Var.h;
                l80Var2.G.add(m30Var2);
                l80Var2.F.put(m30Var2.getKey(), m30Var2);
                AnimatorSet animatorSet = k80Var.f35080a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    k80Var.f35080a.cancel();
                }
                k80Var.f35081b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                k80Var.f35080a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.t81(k80Var, 24));
                k80Var.f35080a.setInterpolator(org.telegram.ui.Components.qr.h);
                k80Var.f35080a.setDuration(320L);
                k80Var.d = m30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(k80Var.d, View.ALPHA, 0.0f, 1.0f));
                k80Var.addView(m30Var2);
                m30Var2.setOnClickListener(l80Var);
            }
            l80Var.f35365c.e(!l80Var.G.isEmpty(), true);
            if (!l80Var.E && !l80Var.f35372y) {
                if (m30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.np npVar = q4Var.e;
                if (npVar != null) {
                    npVar.a(z10, true);
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
                ContactsController.Contact contact = ((org.telegram.ui.Components.m30) arrayList.get(i11)).getContact();
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        l80Var.finishFragment();
    }

    @Override
    public final void H(int i10, float f7, float f10, le.e eVar) {
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
        ah.i iVar;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f35371x);
            iVar.g(1, this.O);
            iVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.y10 y10Var = this.f35365c;
        if (y10Var != null) {
            y10Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f35363a) + ((int) this.f35364b.e), 0, this.J);
        this.f35368r.setPadding(0, 0, 0, this.J);
    }

    public final void b0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void c0() {
        org.telegram.ui.Cells.q4 q4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) childAt).getContact()) != null) {
                boolean containsKey = this.F.containsKey(contact.key);
                org.telegram.ui.Components.np npVar = q4Var.e;
                if (npVar != null) {
                    npVar.a(containsKey, true);
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
        this.f35372y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 1));
        j0 j0Var = new j0(this, context, 8);
        this.fragmentView = j0Var;
        org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context, 3);
        this.e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        k80 k80Var = new k80(this, context);
        this.f35366f = k80Var;
        this.e.addView(k80Var, w7.y5.c(108.0f, -1));
        this.d = new j80(this, context, this.e);
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(6);
        t00Var.f28362w = false;
        org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(context, t00Var, 0, null);
        this.f35368r = lx0Var;
        lx0Var.addView(t00Var, 0);
        this.f35368r.setAnimateLayoutChange(true);
        this.f35368r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f35368r.e.setText("");
        this.f35368r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.j6.f19053a7;
        j0Var.setBackgroundColor(getThemedColor(i12));
        j0Var.addView(this.f35368r);
        this.f35367n = new s4.c0(1, false);
        this.f35369s = new h80(this, context);
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.h = yl0Var;
        yl0Var.setSections(true);
        this.h.setEmptyView(this.f35368r);
        this.h.setAdapter(this.f35369s);
        this.h.setLayoutManager(this.f35367n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.yl0 yl0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        yl0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        j0Var.addView(this.h, w7.y5.d(-1, -1.0f, 119, 0.0f, -this.f35363a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new h3(this, 16));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.f18917l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.f35365c = y10Var;
        y10Var.f30484c.setImageDrawable(g2Var);
        this.f35365c.e(false, false);
        this.f35365c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f35365c.setOnClickListener(new k60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.yl0 yl0Var3 = this.h;
        Objects.requireNonNull(yl0Var3);
        this.N = new ah.o(yl0Var3, j0Var, new xs(yl0Var3, 0));
        this.h.D0(new e80(this, 0));
        h80 h80Var = this.f35369s;
        if (h80Var != null && !this.E) {
            int h = h80Var.h();
            org.telegram.ui.Components.lx0 lx0Var2 = this.f35368r;
            if (h != 2) {
                i10 = 4;
            }
            lx0Var2.setVisibility(i10);
        }
        j0Var.addView(this.f35365c, org.telegram.ui.Components.y10.b());
        j0Var.addView(this.actionBar);
        j0Var.addView(this.d, w7.y5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31132g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f35370w = arrayList;
        Collections.sort(arrayList, new df(22));
        org.telegram.ui.Components.lx0 lx0Var = this.f35368r;
        if (lx0Var != null) {
            lx0Var.e(false, true);
        }
        h80 h80Var = this.f35369s;
        if (h80Var != null) {
            h80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.lx0 lx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (lx0Var = this.f35368r) != null) {
            lx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19053a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19387s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19199i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19256l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19275m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19295n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 16, new Class[]{org.telegram.ui.Cells.g4.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Zh));
        int i10 = org.telegram.ui.ActionBar.j6.f19064ai;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19200i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19238k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19294n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19492y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.q4.class}, null, org.telegram.ui.ActionBar.j6.f19360r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        int i11 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35366f, 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19102ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35366f, 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19083bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35366f, 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19121di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35366f, 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.K = l1Var.f42175a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) view;
        if (m30Var.f26305y) {
            this.H = null;
            this.f35366f.a(m30Var);
            this.f35365c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.m30 m30Var2 = this.H;
        if (m30Var2 != null) {
            m30Var2.a();
        }
        this.H = m30Var;
        m30Var.b();
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

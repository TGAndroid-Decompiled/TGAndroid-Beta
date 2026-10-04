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
public final class k80 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, le.d, ph.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.q30 H;
    public int I;
    public int J;
    public int K;
    public final ah.i L;
    public final fh.d M;
    public ah.n N;
    public final ArrayList O;
    public final RectF P;
    public final int f37878a;
    public final le.e f37879b;
    public org.telegram.ui.Components.c20 f37880c;
    public i80 d;
    public org.telegram.ui.ActionBar.v1 f37881e;
    public j80 f37882f;
    public org.telegram.ui.Components.zl0 h;
    public s4.c0 f37883n;
    public org.telegram.ui.Components.tx0 f37884r;
    public g80 f37885s;
    public boolean v;
    public ArrayList f37886w;
    public int f37887x;
    public boolean f37888y;

    public k80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f37878a = i10;
        this.f37879b = new le.e(3, this, org.telegram.ui.Components.tr.h, 350L, AndroidUtilities.dp(37.0f));
        this.F = new HashMap();
        this.G = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        RectF rectF = new RectF();
        this.P = rectF;
        arrayList.add(rectF);
        if (i11 >= 31) {
            this.L = new ah.i();
            this.M = new fh.d(null);
            return;
        }
        this.L = null;
        this.M = null;
    }

    public static void S(k80 k80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !k80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(k80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                k80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) k80Var.F.get(contact.key);
            if (q30Var != null) {
                k80Var.f37882f.a(q30Var);
            } else {
                org.telegram.ui.Components.q30 q30Var2 = new org.telegram.ui.Components.q30(k80Var.getParentActivity(), null, contact, true, k80Var.resourceProvider);
                j80 j80Var = k80Var.f37882f;
                ArrayList arrayList = j80Var.f37598c;
                k80 k80Var2 = j80Var.h;
                k80Var2.G.add(q30Var2);
                k80Var2.F.put(q30Var2.getKey(), q30Var2);
                AnimatorSet animatorSet = j80Var.f37596a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    j80Var.f37596a.cancel();
                }
                j80Var.f37597b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                j80Var.f37596a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.a91(j80Var, 24));
                j80Var.f37596a.setInterpolator(org.telegram.ui.Components.tr.h);
                j80Var.f37596a.setDuration(320L);
                j80Var.d = q30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, View.ALPHA, 0.0f, 1.0f));
                j80Var.addView(q30Var2);
                q30Var2.setOnClickListener(k80Var);
            }
            k80Var.f37880c.e(!k80Var.G.isEmpty(), true);
            if (!k80Var.E && !k80Var.f37888y) {
                if (q30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.qp qpVar = p4Var.f22653e;
                if (qpVar != null) {
                    qpVar.a(z10, true);
                }
            }
        }
    }

    public static void T(k80 k80Var) {
        ArrayList arrayList = k80Var.G;
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
            intent.putExtra("sms_body", ContactsController.getInstance(k80Var.currentAccount).getInviteText(i10));
            k80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        k80Var.finishFragment();
    }

    @Override
    public final View L() {
        return this.fragmentView;
    }

    public final void X() {
        ah.i iVar;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f37887x);
            iVar.g(1, this.O);
            iVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Y() {
        org.telegram.ui.Components.c20 c20Var = this.f37880c;
        if (c20Var != null) {
            c20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void Z() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f37878a) + ((int) this.f37879b.f15443e), 0, this.J);
        this.f37884r.setPadding(0, 0, 0, this.J);
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            Z();
            b0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
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
                org.telegram.ui.Components.qp qpVar = p4Var.f22653e;
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
        this.f37888y = false;
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
        this.f37881e = v1Var;
        v1Var.setVerticalScrollBarEnabled(false);
        j80 j80Var = new j80(this, context);
        this.f37882f = j80Var;
        this.f37881e.addView(j80Var, w7.z5.c(108.0f, -1));
        this.d = new i80(this, context, this.f37881e);
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(6);
        w00Var.f32417w = false;
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, w00Var, 0, null);
        this.f37884r = tx0Var;
        tx0Var.addView(w00Var, 0);
        this.f37884r.setAnimateLayoutChange(true);
        this.f37884r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f37884r.f31195e.setText("");
        this.f37884r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.i6.f20762a7;
        k0Var.setBackgroundColor(getThemedColor(i12));
        k0Var.addView(this.f37884r);
        this.f37883n = new s4.c0(1, false);
        this.f37885s = new g80(this, context);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.h = zl0Var;
        zl0Var.setSections(true);
        this.h.setEmptyView(this.f37884r);
        this.h.setAdapter(this.f37885s);
        this.h.setLayoutManager(this.f37883n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.zl0 zl0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        zl0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        k0Var.addView(this.h, w7.z5.d(-1, -1.0f, 119, 0.0f, -this.f37878a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new i3(this, 17));
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        g2Var.f20650l = 180;
        g2Var.invalidateSelf();
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, this.resourceProvider, false);
        this.f37880c = c20Var;
        c20Var.f25165c.setImageDrawable(g2Var);
        this.f37880c.e(false, false);
        this.f37880c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f37880c.setOnClickListener(new j60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.zl0 zl0Var3 = this.h;
        Objects.requireNonNull(zl0Var3);
        this.N = new ah.n(zl0Var3, k0Var, new vs(zl0Var3, 0));
        this.h.D0(new d80(this, 0));
        g80 g80Var = this.f37885s;
        if (g80Var != null && !this.E) {
            int h = g80Var.h();
            org.telegram.ui.Components.tx0 tx0Var2 = this.f37884r;
            if (h != 2) {
                i10 = 4;
            }
            tx0Var2.setVisibility(i10);
        }
        k0Var.addView(this.f37880c, org.telegram.ui.Components.c20.b());
        k0Var.addView(this.actionBar);
        k0Var.addView(this.d, w7.z5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f33781g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f37886w = arrayList;
        Collections.sort(arrayList, new ff(22));
        org.telegram.ui.Components.tx0 tx0Var = this.f37884r;
        if (tx0Var != null) {
            tx0Var.e(false, true);
        }
        g80 g80Var = this.f37885s;
        if (g80Var != null) {
            g80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tx0 tx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (tx0Var = this.f37884r) != null) {
            tx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20762a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21100s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21155v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21119t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20909i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20966l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20985m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f21005n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20941k0, null, null, org.telegram.ui.ActionBar.i6.f20819d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Zh));
        int i10 = org.telegram.ui.ActionBar.i6.f20773ai;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20910i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20948k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21004n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21205y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.i6.f21072r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        int i11 = org.telegram.ui.ActionBar.i6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37882f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20811ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37882f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20792bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37882f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20830di));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37882f, 0, new Class[]{org.telegram.ui.Components.q30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.K = l1Var.f45610a.f(8).d;
        Y();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.q30 q30Var = (org.telegram.ui.Components.q30) view;
        if (q30Var.f29880y) {
            this.H = null;
            this.f37882f.a(q30Var);
            this.f37880c.e(!this.G.isEmpty(), true);
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
        Z();
        Y();
    }

    @Override
    public final void J() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void V(float f7, int i10) {
    }
}

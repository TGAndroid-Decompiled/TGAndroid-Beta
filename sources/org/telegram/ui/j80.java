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
public final class j80 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, le.e, ph.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.p30 H;
    public int I;
    public int J;
    public int K;
    public final ah.i L;
    public final fh.d M;
    public ah.n N;
    public final ArrayList O;
    public final RectF P;
    public final int f34658a;
    public final le.f f34659b;
    public org.telegram.ui.Components.b20 f34660c;
    public h80 d;
    public org.telegram.ui.ActionBar.w1 e;
    public i80 f34661f;
    public org.telegram.ui.Components.yl0 h;
    public s4.c0 f34662n;
    public org.telegram.ui.Components.kx0 f34663r;
    public f80 f34664s;
    public boolean v;
    public ArrayList f34665w;
    public int f34666x;
    public boolean f34667y;

    public j80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f34658a = i10;
        this.f34659b = new le.f(3, this, org.telegram.ui.Components.sr.h, 350L, AndroidUtilities.dp(37.0f));
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

    public static void U(j80 j80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z10 = false;
        if (i10 == 0 && !j80Var.E) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(j80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                j80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) j80Var.F.get(contact.key);
            if (p30Var != null) {
                j80Var.f34661f.a(p30Var);
            } else {
                org.telegram.ui.Components.p30 p30Var2 = new org.telegram.ui.Components.p30(j80Var.getParentActivity(), null, contact, true, j80Var.resourceProvider);
                i80 i80Var = j80Var.f34661f;
                ArrayList arrayList = i80Var.f34390c;
                j80 j80Var2 = i80Var.h;
                j80Var2.G.add(p30Var2);
                j80Var2.F.put(p30Var2.getKey(), p30Var2);
                AnimatorSet animatorSet = i80Var.f34388a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    i80Var.f34388a.cancel();
                }
                i80Var.f34389b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                i80Var.f34388a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.s81(i80Var, 24));
                i80Var.f34388a.setInterpolator(org.telegram.ui.Components.sr.h);
                i80Var.f34388a.setDuration(320L);
                i80Var.d = p30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(i80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(i80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(i80Var.d, View.ALPHA, 0.0f, 1.0f));
                i80Var.addView(p30Var2);
                p30Var2.setOnClickListener(j80Var);
            }
            j80Var.f34660c.e(!j80Var.G.isEmpty(), true);
            if (!j80Var.E && !j80Var.f34667y) {
                if (p30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.pp ppVar = p4Var.e;
                if (ppVar != null) {
                    ppVar.a(z10, true);
                }
            }
        }
    }

    public static void V(j80 j80Var) {
        ArrayList arrayList = j80Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.p30) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(j80Var.currentAccount).getInviteText(i10));
            j80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        j80Var.finishFragment();
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
        ah.i iVar;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f34666x);
            iVar.g(1, this.O);
            iVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.b20 b20Var = this.f34660c;
        if (b20Var != null) {
            b20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f34658a) + ((int) this.f34659b.e), 0, this.J);
        this.f34663r.setPadding(0, 0, 0, this.J);
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
                org.telegram.ui.Components.pp ppVar = p4Var.e;
                if (ppVar != null) {
                    ppVar.a(containsKey, true);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        int i10 = 0;
        this.E = false;
        this.f34667y = false;
        this.G.clear();
        this.F.clear();
        this.H = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new t70(this, 1));
        l0 l0Var = new l0(this, context, 8);
        this.fragmentView = l0Var;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 3);
        this.e = w1Var;
        w1Var.setVerticalScrollBarEnabled(false);
        i80 i80Var = new i80(this, context);
        this.f34661f = i80Var;
        this.e.addView(i80Var, w7.y5.c(108.0f, -1));
        this.d = new h80(this, context, this.e);
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
        v00Var.setViewType(6);
        v00Var.f28982w = false;
        org.telegram.ui.Components.kx0 kx0Var = new org.telegram.ui.Components.kx0(context, v00Var, 0, null);
        this.f34663r = kx0Var;
        kx0Var.addView(v00Var, 0);
        this.f34663r.setAnimateLayoutChange(true);
        this.f34663r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f34663r.e.setText("");
        this.f34663r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.i6.f19001a7;
        l0Var.setBackgroundColor(getThemedColor(i12));
        l0Var.addView(this.f34663r);
        this.f34662n = new s4.c0(1, false);
        this.f34664s = new f80(this, context);
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.h = yl0Var;
        yl0Var.setSections(true);
        this.h.setEmptyView(this.f34663r);
        this.h.setAdapter(this.f34664s);
        this.h.setLayoutManager(this.f34662n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.yl0 yl0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        yl0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        l0Var.addView(this.h, w7.y5.d(-1, -1.0f, 119, 0.0f, -this.f34658a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new j3(this, 16));
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        h2Var.f18942l = 180;
        h2Var.invalidateSelf();
        org.telegram.ui.Components.b20 b20Var = new org.telegram.ui.Components.b20(context, this.resourceProvider, false);
        this.f34660c = b20Var;
        b20Var.f22881c.setImageDrawable(h2Var);
        this.f34660c.e(false, false);
        this.f34660c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f34660c.setOnClickListener(new i60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.yl0 yl0Var3 = this.h;
        Objects.requireNonNull(yl0Var3);
        this.N = new ah.n(yl0Var3, l0Var, new us(yl0Var3, 0));
        this.h.D0(new c80(this, 0));
        f80 f80Var = this.f34664s;
        if (f80Var != null && !this.E) {
            int h = f80Var.h();
            org.telegram.ui.Components.kx0 kx0Var2 = this.f34663r;
            if (h != 2) {
                i10 = 4;
            }
            kx0Var2.setVisibility(i10);
        }
        l0Var.addView(this.f34660c, org.telegram.ui.Components.b20.b());
        l0Var.addView(this.actionBar);
        l0Var.addView(this.d, w7.y5.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f31115g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f34665w = arrayList;
        Collections.sort(arrayList, new ff(22));
        org.telegram.ui.Components.kx0 kx0Var = this.f34663r;
        if (kx0Var != null) {
            kx0Var.e(false, true);
        }
        f80 f80Var = this.f34664s;
        if (f80Var != null) {
            f80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.kx0 kx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (kx0Var = this.f34663r) != null) {
            kx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19204l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19223m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19243n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Zh));
        int i10 = org.telegram.ui.ActionBar.i6.f19012ai;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19148i7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19186k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19242n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19442y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.i6.f19310r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        int i11 = org.telegram.ui.ActionBar.i6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34661f, 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19050ci));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34661f, 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19031bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34661f, 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19069di));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34661f, 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.K = l1Var.f42185a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) view;
        if (p30Var.f27264y) {
            this.H = null;
            this.f34661f.a(p30Var);
            this.f34660c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.p30 p30Var2 = this.H;
        if (p30Var2 != null) {
            p30Var2.a();
        }
        this.H = p30Var;
        p30Var.b();
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

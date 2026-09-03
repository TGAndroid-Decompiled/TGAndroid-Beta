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
public final class e80 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, xd.b, ch.d {
    public boolean B;
    public final HashMap C;
    public final ArrayList D;
    public org.telegram.ui.Components.o30 E;
    public int F;
    public int G;
    public int H;
    public final ng.e I;
    public final sg.d J;
    public ng.k K;
    public final ArrayList L;
    public final RectF M;
    public final int f33733a;
    public final xd.c f33734b;
    public org.telegram.ui.Components.a20 f33735c;
    public c80 d;
    public org.telegram.ui.ActionBar.x1 e;
    public d80 f33736f;
    public org.telegram.ui.Components.rl0 h;
    public f2.i0 f33737n;
    public org.telegram.ui.Components.zw0 f33738r;
    public a80 f33739s;
    public boolean v;
    public ArrayList f33740w;
    public int f33741x;
    public boolean f33742y;

    public e80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f33733a = i10;
        this.f33734b = new xd.c(3, this, org.telegram.ui.Components.mr.h, 350L, AndroidUtilities.dp(37.0f));
        this.C = new HashMap();
        this.D = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.L = arrayList;
        RectF rectF = new RectF();
        this.M = rectF;
        arrayList.add(rectF);
        if (i11 >= 31) {
            this.I = new ng.e(false);
            this.J = new sg.d(null);
            return;
        }
        this.I = null;
        this.J = null;
    }

    public static void U(e80 e80Var, View view, int i10) {
        org.telegram.ui.Cells.o4 o4Var;
        ContactsController.Contact contact;
        boolean z4 = false;
        if (i10 == 0 && !e80Var.B) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(e80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                e80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.o4) && (contact = (o4Var = (org.telegram.ui.Cells.o4) view).getContact()) != null) {
            org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) e80Var.C.get(contact.key);
            if (o30Var != null) {
                e80Var.f33736f.a(o30Var);
            } else {
                org.telegram.ui.Components.o30 o30Var2 = new org.telegram.ui.Components.o30(e80Var.getParentActivity(), null, contact, true, e80Var.resourceProvider);
                d80 d80Var = e80Var.f33736f;
                ArrayList arrayList = d80Var.f33370c;
                e80 e80Var2 = d80Var.h;
                e80Var2.D.add(o30Var2);
                e80Var2.C.put(o30Var2.getKey(), o30Var2);
                AnimatorSet animatorSet = d80Var.f33368a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    d80Var.f33368a.cancel();
                }
                d80Var.f33369b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                d80Var.f33368a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.f91(d80Var, 22));
                d80Var.f33368a.setInterpolator(org.telegram.ui.Components.mr.h);
                d80Var.f33368a.setDuration(320L);
                d80Var.d = o30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(d80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(d80Var.d, View.ALPHA, 0.0f, 1.0f));
                d80Var.addView(o30Var2);
                o30Var2.setOnClickListener(e80Var);
            }
            e80Var.f33735c.e(!e80Var.D.isEmpty(), true);
            if (!e80Var.B && !e80Var.f33742y) {
                if (o30Var == null) {
                    z4 = true;
                }
                org.telegram.ui.Components.kp kpVar = o4Var.e;
                if (kpVar != null) {
                    kpVar.a(z4, true);
                }
            }
        }
    }

    public static void V(e80 e80Var) {
        ArrayList arrayList = e80Var.D;
        try {
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.o30) arrayList.get(i11)).getContact();
                if (sb.length() != 0) {
                    sb.append(';');
                }
                sb.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(e80Var.currentAccount).getInviteText(i10));
            e80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
        e80Var.finishFragment();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
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
        ng.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.I) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.M.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f33741x);
            eVar.g(1, this.L);
            eVar.e(this.K, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.a20 a20Var = this.f33735c;
        if (a20Var != null) {
            a20Var.setTranslationY(-Math.max(this.G, this.H));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f33733a) + ((int) this.f33734b.e), 0, this.G);
        this.f33738r.setPadding(0, 0, 0, this.G);
    }

    public final void b0() {
        this.d.setTranslationY(this.actionBar.getMeasuredHeight());
    }

    public final void c0() {
        org.telegram.ui.Cells.o4 o4Var;
        ContactsController.Contact contact;
        int childCount = this.h.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.h.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.o4) && (contact = (o4Var = (org.telegram.ui.Cells.o4) childAt).getContact()) != null) {
                boolean containsKey = this.C.containsKey(contact.key);
                org.telegram.ui.Components.kp kpVar = o4Var.e;
                if (kpVar != null) {
                    kpVar.a(containsKey, true);
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
        this.B = false;
        this.f33742y = false;
        this.D.clear();
        this.C.clear();
        this.E = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 18));
        n0 n0Var = new n0(this, context, 9);
        this.fragmentView = n0Var;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 3);
        this.e = x1Var;
        x1Var.setVerticalScrollBarEnabled(false);
        d80 d80Var = new d80(this, context);
        this.f33736f = d80Var;
        this.e.addView(d80Var, k7.b6.c(108.0f, -1));
        this.d = new c80(this, context, this.e);
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(6);
        u00Var.f29071w = false;
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, u00Var, 0, null);
        this.f33738r = zw0Var;
        zw0Var.addView(u00Var, 0);
        this.f33738r.setAnimateLayoutChange(true);
        this.f33738r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f33738r.e.setText("");
        this.f33738r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.j6.f19827a7;
        n0Var.setBackgroundColor(getThemedColor(i12));
        n0Var.addView(this.f33738r);
        this.f33737n = new f2.i0(1, false);
        this.f33739s = new a80(this, context);
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.h = rl0Var;
        rl0Var.setSections(true);
        this.h.setEmptyView(this.f33738r);
        this.h.setAdapter(this.f33739s);
        this.h.setLayoutManager(this.f33737n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.rl0 rl0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        rl0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        n0Var.addView(this.h, k7.b6.d(-1, -1.0f, 119, 0.0f, -this.f33733a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new j(this, 14));
        this.h.setOnScrollListener(new n3(this, 16));
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        i2Var.f19771l = 180;
        i2Var.invalidateSelf();
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.f33735c = a20Var;
        a20Var.f23293c.setImageDrawable(i2Var);
        this.f33735c.e(false, false);
        this.f33735c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f33735c.setOnClickListener(new g60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.rl0 rl0Var3 = this.h;
        Objects.requireNonNull(rl0Var3);
        this.K = new ng.k(rl0Var3, n0Var, new vs(rl0Var3, 0));
        this.h.C0(new x70(this, 0));
        a80 a80Var = this.f33739s;
        if (a80Var != null && !this.B) {
            int h = a80Var.h();
            org.telegram.ui.Components.zw0 zw0Var2 = this.f33738r;
            if (h != 2) {
                i10 = 4;
            }
            zw0Var2.setVisibility(i10);
        }
        n0Var.addView(this.f33735c, org.telegram.ui.Components.a20.b());
        n0Var.addView(this.actionBar);
        n0Var.addView(this.d, k7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.f31595d1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f33740w = arrayList;
        Collections.sort(arrayList, new eu(3));
        org.telegram.ui.Components.zw0 zw0Var = this.f33738r;
        if (zw0Var != null) {
            zw0Var.e(false, true);
        }
        a80 a80Var = this.f33739s;
        if (a80Var != null) {
            a80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.zw0 zw0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (zw0Var = this.f33738r) != null) {
            zw0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20025l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20043m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20061n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 16, new Class[]{org.telegram.ui.Cells.e4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19899e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Zh));
        int i10 = org.telegram.ui.ActionBar.j6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19972i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20007k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20060n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 262148, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20256y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.o4.class}, null, org.telegram.ui.ActionBar.j6.f20126r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        int i11 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33736f, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33736f, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33736f, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, org.telegram.ui.ActionBar.j6.di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33736f, 0, new Class[]{org.telegram.ui.Components.o30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.H = m1Var.f43154a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.o30 o30Var = (org.telegram.ui.Components.o30) view;
        if (o30Var.f27451y) {
            this.E = null;
            this.f33736f.a(o30Var);
            this.f33735c.e(!this.D.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.o30 o30Var2 = this.E;
        if (o30Var2 != null) {
            o30Var2.a();
        }
        this.E = o30Var;
        o30Var.b();
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
        this.G = i13;
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
    public final void z(float f10, int i10) {
    }
}

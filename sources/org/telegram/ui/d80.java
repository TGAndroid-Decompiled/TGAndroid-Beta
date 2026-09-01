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
public final class d80 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, xd.b, dh.d {
    public boolean B;
    public final HashMap C;
    public final ArrayList D;
    public org.telegram.ui.Components.p30 E;
    public int F;
    public int G;
    public int H;
    public final og.e I;
    public final tg.d J;
    public og.k K;
    public final ArrayList L;
    public final RectF M;
    public final int f36132a;
    public final xd.c f36133b;
    public org.telegram.ui.Components.a20 f36134c;
    public b80 d;
    public org.telegram.ui.ActionBar.x1 f36135e;
    public c80 f36136f;
    public org.telegram.ui.Components.tl0 h;
    public f2.j0 f36137n;
    public org.telegram.ui.Components.ax0 f36138r;
    public z70 f36139s;
    public boolean v;
    public ArrayList f36140w;
    public int f36141x;
    public boolean f36142y;

    public d80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f36132a = i10;
        this.f36133b = new xd.c(3, this, org.telegram.ui.Components.pr.h, 350L, AndroidUtilities.dp(37.0f));
        this.C = new HashMap();
        this.D = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.L = arrayList;
        RectF rectF = new RectF();
        this.M = rectF;
        arrayList.add(rectF);
        if (i11 >= 31) {
            this.I = new og.e(false);
            this.J = new tg.d(null);
            return;
        }
        this.I = null;
        this.J = null;
    }

    public static void U(d80 d80Var, View view, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        ContactsController.Contact contact;
        boolean z4 = false;
        if (i10 == 0 && !d80Var.B) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String inviteText = ContactsController.getInstance(d80Var.currentAccount).getInviteText(0);
                intent.putExtra("android.intent.extra.TEXT", inviteText);
                d80Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, inviteText), 500);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) d80Var.C.get(contact.key);
            if (p30Var != null) {
                d80Var.f36136f.a(p30Var);
            } else {
                org.telegram.ui.Components.p30 p30Var2 = new org.telegram.ui.Components.p30(d80Var.getParentActivity(), null, contact, true, d80Var.resourceProvider);
                c80 c80Var = d80Var.f36136f;
                ArrayList arrayList = c80Var.f35707c;
                d80 d80Var2 = c80Var.h;
                d80Var2.D.add(p30Var2);
                d80Var2.C.put(p30Var2.getKey(), p30Var2);
                AnimatorSet animatorSet = c80Var.f35705a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    c80Var.f35705a.cancel();
                }
                c80Var.f35706b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                c80Var.f35705a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.g91(c80Var, 22));
                c80Var.f35705a.setInterpolator(org.telegram.ui.Components.pr.h);
                c80Var.f35705a.setDuration(320L);
                c80Var.d = p30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(c80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(c80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(c80Var.d, View.ALPHA, 0.0f, 1.0f));
                c80Var.addView(p30Var2);
                p30Var2.setOnClickListener(d80Var);
            }
            d80Var.f36134c.e(!d80Var.D.isEmpty(), true);
            if (!d80Var.B && !d80Var.f36142y) {
                if (p30Var == null) {
                    z4 = true;
                }
                org.telegram.ui.Components.np npVar = p4Var.f23333e;
                if (npVar != null) {
                    npVar.a(z4, true);
                }
            }
        }
    }

    public static void V(d80 d80Var) {
        ArrayList arrayList = d80Var.D;
        try {
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.p30) arrayList.get(i11)).getContact();
                if (sb.length() != 0) {
                    sb.append(';');
                }
                sb.append(contact.phones.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.imported;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb.toString()));
            intent.putExtra("sms_body", ContactsController.getInstance(d80Var.currentAccount).getInviteText(i10));
            d80Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        d80Var.finishFragment();
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
        og.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.I) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.M.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f36141x);
            eVar.g(1, this.L);
            eVar.e(this.K, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.a20 a20Var = this.f36134c;
        if (a20Var != null) {
            a20Var.setTranslationY(-Math.max(this.G, this.H));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f36132a) + ((int) this.f36133b.f50510e), 0, this.G);
        this.f36138r.setPadding(0, 0, 0, this.G);
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
                boolean containsKey = this.C.containsKey(contact.key);
                org.telegram.ui.Components.np npVar = p4Var.f23333e;
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
        this.B = false;
        this.f36142y = false;
        this.D.clear();
        this.C.clear();
        this.E = null;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteFriends));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 18));
        l0 l0Var = new l0(this, context, 9);
        this.fragmentView = l0Var;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 3);
        this.f36135e = x1Var;
        x1Var.setVerticalScrollBarEnabled(false);
        c80 c80Var = new c80(this, context);
        this.f36136f = c80Var;
        this.f36135e.addView(c80Var, k7.c6.c(108.0f, -1));
        this.d = new b80(this, context, this.f36135e);
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(6);
        u00Var.f31509w = false;
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, u00Var, 0, null);
        this.f36138r = ax0Var;
        ax0Var.addView(u00Var, 0);
        this.f36138r.setAnimateLayoutChange(true);
        this.f36138r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f36138r.f25364e.setText("");
        this.f36138r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.k6.f21605a7;
        l0Var.setBackgroundColor(getThemedColor(i12));
        l0Var.addView(this.f36138r);
        this.f36137n = new f2.j0(1, false);
        this.f36139s = new z70(this, context);
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.h = tl0Var;
        tl0Var.setSections(true);
        this.h.setEmptyView(this.f36138r);
        this.h.setAdapter(this.f36139s);
        this.h.setLayoutManager(this.f36137n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.tl0 tl0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        tl0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        l0Var.addView(this.h, k7.c6.d(-1, -1.0f, 119, 0.0f, -this.f36132a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new j(this, 14));
        this.h.setOnScrollListener(new l3(this, 16));
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        i2Var.f21459l = 180;
        i2Var.invalidateSelf();
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.f36134c = a20Var;
        a20Var.f25128c.setImageDrawable(i2Var);
        this.f36134c.e(false, false);
        this.f36134c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f36134c.setOnClickListener(new f60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.tl0 tl0Var3 = this.h;
        Objects.requireNonNull(tl0Var3);
        this.K = new og.k(tl0Var3, l0Var, new us(tl0Var3, 0));
        this.h.C0(new w70(this, 0));
        z70 z70Var = this.f36139s;
        if (z70Var != null && !this.B) {
            int h = z70Var.h();
            org.telegram.ui.Components.ax0 ax0Var2 = this.f36138r;
            if (h != 2) {
                i10 = 4;
            }
            ax0Var2.setVisibility(i10);
        }
        l0Var.addView(this.f36134c, org.telegram.ui.Components.a20.b());
        l0Var.addView(this.actionBar);
        l0Var.addView(this.d, k7.c6.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.f34143d1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f36140w = arrayList;
        Collections.sort(arrayList, new du(3));
        org.telegram.ui.Components.ax0 ax0Var = this.f36138r;
        if (ax0Var != null) {
            ax0Var.e(false, true);
        }
        z70 z70Var = this.f36139s;
        if (z70Var != null) {
            z70Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.ax0 ax0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (ax0Var = this.f36138r) != null) {
            ax0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21804l7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21822m7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21840n7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21678e7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Zh));
        int i10 = org.telegram.ui.ActionBar.k6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21751i7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21786k7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21839n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22036y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        int i11 = org.telegram.ui.ActionBar.k6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36136f, 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.k6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36136f, 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.k6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36136f, 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, org.telegram.ui.ActionBar.k6.di));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36136f, 0, new Class[]{org.telegram.ui.Components.p30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void k(r0.m1 m1Var) {
        this.H = m1Var.f46452a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) view;
        if (p30Var.f29949y) {
            this.E = null;
            this.f36136f.a(p30Var);
            this.f36134c.e(!this.D.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.p30 p30Var2 = this.E;
        if (p30Var2 != null) {
            p30Var2.a();
        }
        this.E = p30Var;
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
        this.G = i13;
        a0();
        Z();
    }

    @Override
    public final void I() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}

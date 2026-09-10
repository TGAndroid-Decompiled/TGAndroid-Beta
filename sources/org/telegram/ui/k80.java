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
public final class k80 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, View.OnClickListener, le.d, oh.d {
    public boolean E;
    public final HashMap F;
    public final ArrayList G;
    public org.telegram.ui.Components.w30 H;
    public int I;
    public int J;
    public int K;
    public final zg.e L;
    public final eh.d M;
    public zg.k N;
    public final ArrayList O;
    public final RectF P;
    public final int f34258a;
    public final le.e f34259b;
    public org.telegram.ui.Components.h20 f34260c;
    public i80 d;
    public org.telegram.ui.ActionBar.x1 e;
    public j80 f34261f;
    public org.telegram.ui.Components.vl0 h;
    public s4.c0 f34262n;
    public org.telegram.ui.Components.jx0 f34263r;
    public g80 f34264s;
    public boolean v;
    public ArrayList f34265w;
    public int f34266x;
    public boolean f34267y;

    public k80() {
        super(null);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f34258a = i10;
        this.f34259b = new le.e(3, this, org.telegram.ui.Components.wr.h, 350L, AndroidUtilities.dp(37.0f));
        this.F = new HashMap();
        this.G = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        RectF rectF = new RectF();
        this.P = rectF;
        arrayList.add(rectF);
        if (i11 >= 31) {
            this.L = new zg.e(false);
            this.M = new eh.d(null);
            return;
        }
        this.L = null;
        this.M = null;
    }

    public static void U(k80 k80Var, View view, int i10) {
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if ((view instanceof org.telegram.ui.Cells.p4) && (contact = (p4Var = (org.telegram.ui.Cells.p4) view).getContact()) != null) {
            org.telegram.ui.Components.w30 w30Var = (org.telegram.ui.Components.w30) k80Var.F.get(contact.key);
            if (w30Var != null) {
                k80Var.f34261f.a(w30Var);
            } else {
                org.telegram.ui.Components.w30 w30Var2 = new org.telegram.ui.Components.w30(k80Var.getParentActivity(), null, contact, true, k80Var.resourceProvider);
                j80 j80Var = k80Var.f34261f;
                ArrayList arrayList = j80Var.f34051c;
                k80 k80Var2 = j80Var.h;
                k80Var2.G.add(w30Var2);
                k80Var2.F.put(w30Var2.getKey(), w30Var2);
                AnimatorSet animatorSet = j80Var.f34049a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    j80Var.f34049a.cancel();
                }
                j80Var.f34050b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                j80Var.f34049a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.voip.v2(j80Var, 13));
                j80Var.f34049a.setInterpolator(org.telegram.ui.Components.wr.h);
                j80Var.f34049a.setDuration(320L);
                j80Var.d = w30Var2;
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(j80Var.d, View.ALPHA, 0.0f, 1.0f));
                j80Var.addView(w30Var2);
                w30Var2.setOnClickListener(k80Var);
            }
            k80Var.f34260c.e(!k80Var.G.isEmpty(), true);
            if (!k80Var.E && !k80Var.f34267y) {
                if (w30Var == null) {
                    z10 = true;
                }
                org.telegram.ui.Components.tp tpVar = p4Var.e;
                if (tpVar != null) {
                    tpVar.a(z10, true);
                }
            }
        }
    }

    public static void V(k80 k80Var) {
        ArrayList arrayList = k80Var.G;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ContactsController.Contact contact = ((org.telegram.ui.Components.w30) arrayList.get(i11)).getContact();
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        k80Var.finishFragment();
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
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
        zg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.L) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            this.P.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp + AndroidUtilities.dp(48.0f) + this.f34266x);
            eVar.g(1, this.O);
            eVar.e(this.N, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void Z() {
        org.telegram.ui.Components.h20 h20Var = this.f34260c;
        if (h20Var != null) {
            h20Var.setTranslationY(-Math.max(this.J, this.K));
        }
    }

    public final void a0() {
        this.h.setPadding(0, AndroidUtilities.dp(4.0f) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f34258a) + ((int) this.f34259b.e), 0, this.J);
        this.f34263r.setPadding(0, 0, 0, this.J);
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
                org.telegram.ui.Components.tp tpVar = p4Var.e;
                if (tpVar != null) {
                    tpVar.a(containsKey, true);
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
        this.f34267y = false;
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
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 3);
        this.e = x1Var;
        x1Var.setVerticalScrollBarEnabled(false);
        j80 j80Var = new j80(this, context);
        this.f34261f = j80Var;
        this.e.addView(j80Var, w7.a6.c(108.0f, -1));
        this.d = new i80(this, context, this.e);
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        a10Var.setViewType(6);
        a10Var.f21345w = false;
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, a10Var, 0, null);
        this.f34263r = jx0Var;
        jx0Var.addView(a10Var, 0);
        this.f34263r.setAnimateLayoutChange(true);
        this.f34263r.d.setText(LocaleController.getString(R.string.NoContacts));
        this.f34263r.e.setText("");
        this.f34263r.e(ContactsController.getInstance(this.currentAccount).isLoadingContacts(), true);
        int i12 = org.telegram.ui.ActionBar.j6.f17872a7;
        k0Var.setBackgroundColor(getThemedColor(i12));
        k0Var.addView(this.f34263r);
        this.f34262n = new s4.c0(1, false);
        this.f34264s = new g80(this, context);
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.h = vl0Var;
        vl0Var.setSections(true);
        this.h.setEmptyView(this.f34263r);
        this.h.setAdapter(this.f34264s);
        this.h.setLayoutManager(this.f34262n);
        this.h.setVerticalScrollBarEnabled(true);
        org.telegram.ui.Components.vl0 vl0Var2 = this.h;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        vl0Var2.setVerticalScrollbarPosition(i11);
        this.h.setClipToPadding(false);
        k0Var.addView(this.h, w7.a6.d(-1, -1.0f, 119, 0.0f, -this.f34258a, 0.0f, 0.0f));
        this.h.setOnItemClickListener(new i(this, 14));
        this.h.setOnScrollListener(new j3(this, 16));
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        i2Var.f17827l = 180;
        i2Var.invalidateSelf();
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f34260c = h20Var;
        h20Var.f23496c.setImageDrawable(i2Var);
        this.f34260c.e(false, false);
        this.f34260c.setContentDescription(LocaleController.getString(R.string.Next));
        this.f34260c.setOnClickListener(new l60(this, 4));
        this.actionBar.setBackgroundColor(getThemedColor(i12));
        org.telegram.ui.Components.vl0 vl0Var3 = this.h;
        Objects.requireNonNull(vl0Var3);
        this.N = new zg.k(vl0Var3, k0Var, new ys(vl0Var3, 0));
        this.h.C0(new d80(this, 0));
        g80 g80Var = this.f34264s;
        if (g80Var != null && !this.E) {
            int h = g80Var.h();
            org.telegram.ui.Components.jx0 jx0Var2 = this.f34263r;
            if (h != 2) {
                i10 = 4;
            }
            jx0Var2.setVisibility(i10);
        }
        k0Var.addView(this.f34260c, org.telegram.ui.Components.h20.b());
        k0Var.addView(this.actionBar);
        k0Var.addView(this.d, w7.a6.d(-1, -2.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f29940g1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = new ArrayList(ContactsController.getInstance(this.currentAccount).phoneBookContacts);
        this.f34265w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.Components.m9(15));
        org.telegram.ui.Components.jx0 jx0Var = this.f34263r;
        if (jx0Var != null) {
            jx0Var.e(false, true);
        }
        g80 g80Var = this.f34264s;
        if (g80Var != null) {
            g80Var.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.jx0 jx0Var;
        if (i10 == NotificationCenter.contactsImported) {
            d0();
        } else if (i10 == NotificationCenter.contactsDidLoad && (jx0Var = this.f34263r) != null) {
            jx0Var.e(false, true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 19);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18074l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18092m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18111n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 16, new Class[]{org.telegram.ui.Cells.e4.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Zh));
        int i10 = org.telegram.ui.ActionBar.j6.f17883ai;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18018i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18056k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 262148, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.p4.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        int i11 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34261f, 0, new Class[]{org.telegram.ui.Components.w30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17921ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34261f, 0, new Class[]{org.telegram.ui.Components.w30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17902bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34261f, 0, new Class[]{org.telegram.ui.Components.w30.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17939di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34261f, 0, new Class[]{org.telegram.ui.Components.w30.class}, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void j(r0.l1 l1Var) {
        this.K = l1Var.f41074a.f(8).d;
        Z();
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.w30 w30Var = (org.telegram.ui.Components.w30) view;
        if (w30Var.f28653y) {
            this.H = null;
            this.f34261f.a(w30Var);
            this.f34260c.e(!this.G.isEmpty(), true);
            c0();
            return;
        }
        org.telegram.ui.Components.w30 w30Var2 = this.H;
        if (w30Var2 != null) {
            w30Var2.a();
        }
        this.H = w30Var;
        w30Var.b();
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
    public final void L() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void B(float f7, int i10) {
    }
}

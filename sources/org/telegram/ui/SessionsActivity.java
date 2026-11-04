package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public class SessionsActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public dt0 Y;
    public o21 f41984a;
    public xs f41985b;
    public org.telegram.ui.Components.gy f41986c;
    public final ArrayList d;
    public final ArrayList f41987e;
    public ArrayList f41988f;
    public TLRPC.TL_authorization h;
    public boolean f41989n;
    public j21 f41990r;
    public int f41991s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int f41992w;
    public int f41993x;
    public int f41994y;

    public SessionsActivity(int i3) {
        super(null);
        this.d = new ArrayList();
        this.f41987e = new ArrayList();
        this.f41988f = new ArrayList();
        this.V = 0;
        this.f41992w = i3;
    }

    public static void Z(org.telegram.ui.SessionsActivity r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SessionsActivity.Z(org.telegram.ui.SessionsActivity, int):void");
    }

    public static void a0(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f41988f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.hp.s1(sessionsActivity.currentAccount).o1(((TL_account.TL_connectedBot) sessionsActivity.f41988f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new e21(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new e21(sessionsActivity, 1));
    }

    public static void b0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f41992w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new e21(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new e21(sessionsActivity, 3));
    }

    public static void c0(SessionsActivity sessionsActivity, int i3, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, sessionsActivity.getParentActivity(), null);
            s1Var.f28546j0 = false;
            s1Var.show();
            if (sessionsActivity.f41992w == 0) {
                int i10 = sessionsActivity.K;
                if (i3 >= i10 && i3 < sessionsActivity.L) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i3 - i10);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f41987e.get(i3 - sessionsActivity.G);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new co0(sessionsActivity, s1Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i3 - sessionsActivity.K);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new co0(sessionsActivity, s1Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                org.telegram.messenger.hp.s1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void d0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.f41989n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.hp.s1(sessionsActivity.currentAccount).Y3(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.r0();
        }
        o21 o21Var = sessionsActivity.f41984a;
        if (o21Var != null) {
            o21Var.f();
        }
        dt0 dt0Var = sessionsActivity.Y;
        if (dt0Var != null) {
            dt0Var.a();
        }
        int i3 = sessionsActivity.V;
        if (i3 > 0) {
            int i10 = i3 - 1;
            sessionsActivity.V = i10;
            if (i10 > 0) {
                org.telegram.messenger.g0.i3(new f21(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28102p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new org.telegram.ui.Components.iz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i3 = this.f41992w;
        if (i3 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751456, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131742921, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 11));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f41984a = new o21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.f41986c = gyVar;
        gyVar.b();
        xs xsVar = new xs(7, context, this);
        this.f41985b = xsVar;
        xsVar.r1();
        this.f41985b.setLayoutManager(new kg.y(1, false, 18));
        this.f41985b.setSectionsDrawBackground(true);
        this.f41985b.setVerticalScrollBarEnabled(false);
        this.f41985b.setEmptyView(this.f41986c);
        xs xsVar2 = this.f41985b;
        xsVar2.X1 = true;
        xsVar2.Y1 = 0;
        frameLayout.addView(xsVar2, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.f41986c, b8.mf.e(-1, -1, 17));
        this.f41985b.setAdapter(this.f41984a);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        this.f41985b.setItemAnimator(kVar);
        this.f41985b.setOnItemClickListener(new nx0(this, 5));
        if (i3 == 0) {
            j21 j21Var = new j21(this, context);
            this.f41990r = j21Var;
            frameLayout.addView(j21Var, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        r0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23313u0) {
            p0(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41985b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41985b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41986c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        int i3 = org.telegram.ui.ActionBar.k6.f28102p7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41985b, 262148, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41985b, 262148, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28121q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41985b, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41990r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int o0() {
        ArrayList arrayList = this.d;
        int i3 = 0;
        if (arrayList.size() == 0 && this.f41989n) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f41992w == 0) {
            i3 = 1;
        }
        return size + i3;
    }

    @Override
    public final void onBecomeFullyHidden() {
        j21 j21Var = this.f41990r;
        if (j21Var != null) {
            j21Var.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        p0(false);
        if (this.f41992w == 0) {
            lg.f.a(this.currentAccount).c(new h21(this, 0));
        }
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23313u0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23313u0);
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        j21 j21Var = this.f41990r;
        if (j21Var != null) {
            j21Var.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        j21 j21Var = this.f41990r;
        if (j21Var != null) {
            j21Var.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i3 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.j0(getParentActivity(), 2, new n21(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746511, null));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new i21(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        o21 o21Var = this.f41984a;
        if (o21Var != null) {
            o21Var.f();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.X = true;
            for (int i3 = 0; i3 < this.f41985b.getChildCount(); i3++) {
                View childAt = this.f41985b.getChildAt(i3);
                if (childAt instanceof p21) {
                    ((p21) childAt).f48426b.invalidate();
                }
            }
        }
    }

    public final void p0(final boolean z10) {
        if (this.f41989n) {
            return;
        }
        if (!z10) {
            this.f41989n = true;
        }
        if (this.f41992w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f44203b;

                {
                    this.f44203b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f44203b;
                            final boolean z11 = z10;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f41987e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.f41989n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i3 = 0; i3 < size; i3++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i3);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.f41991s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.r0();
                                                dt0 dt0Var = sessionsActivity2.Y;
                                                if (dt0Var != null) {
                                                    dt0Var.a();
                                                }
                                            }
                                            o21 o21Var = sessionsActivity2.f41984a;
                                            if (o21Var != null) {
                                                o21Var.f();
                                            }
                                            dt0 dt0Var2 = sessionsActivity2.Y;
                                            if (dt0Var2 != null) {
                                                dt0Var2.a();
                                            }
                                            int i10 = sessionsActivity2.V;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity2.V = i11;
                                                if (i11 > 0) {
                                                    org.telegram.messenger.g0.i3(new f21(sessionsActivity2, z11, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z11);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f44203b;
                            final boolean z12 = z10;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f41987e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.f41989n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i3 = 0; i3 < size; i3++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i3);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.f41991s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.r0();
                                                dt0 dt0Var = sessionsActivity22.Y;
                                                if (dt0Var != null) {
                                                    dt0Var.a();
                                                }
                                            }
                                            o21 o21Var = sessionsActivity22.f41984a;
                                            if (o21Var != null) {
                                                o21Var.f();
                                            }
                                            dt0 dt0Var2 = sessionsActivity22.Y;
                                            if (dt0Var2 != null) {
                                                dt0Var2.a();
                                            }
                                            int i10 = sessionsActivity22.V;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity22.V = i11;
                                                if (i11 > 0) {
                                                    org.telegram.messenger.g0.i3(new f21(sessionsActivity22, z12, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z12);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            }), this.classGuid);
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) {
            public final SessionsActivity f44203b;

            {
                this.f44203b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f44203b;
                        final boolean z11 = z10;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f41987e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f41989n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i3 = 0; i3 < size; i3++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i3);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.f41991s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            dt0 dt0Var = sessionsActivity22.Y;
                                            if (dt0Var != null) {
                                                dt0Var.a();
                                            }
                                        }
                                        o21 o21Var = sessionsActivity22.f41984a;
                                        if (o21Var != null) {
                                            o21Var.f();
                                        }
                                        dt0 dt0Var2 = sessionsActivity22.Y;
                                        if (dt0Var2 != null) {
                                            dt0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.V;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.V = i11;
                                            if (i11 > 0) {
                                                org.telegram.messenger.g0.i3(new f21(sessionsActivity22, z11, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z11);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f44203b;
                        final boolean z12 = z10;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f41987e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f41989n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i3 = 0; i3 < size; i3++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i3);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.f41991s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            dt0 dt0Var = sessionsActivity22.Y;
                                            if (dt0Var != null) {
                                                dt0Var.a();
                                            }
                                        }
                                        o21 o21Var = sessionsActivity22.f41984a;
                                        if (o21Var != null) {
                                            o21Var.f();
                                        }
                                        dt0 dt0Var2 = sessionsActivity22.Y;
                                        if (dt0Var2 != null) {
                                            dt0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.V;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.V = i11;
                                            if (i11 > 0) {
                                                org.telegram.messenger.g0.i3(new f21(sessionsActivity22, z12, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z12);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }), this.classGuid);
    }

    public final void q0() {
        this.W = true;
    }

    public final void r0() {
        this.S = 0;
        this.f41993x = -1;
        this.f41994y = -1;
        this.terminateAllSessionsRow = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.T = -1;
        this.ttlRow = -1;
        this.U = -1;
        int i3 = this.f41992w;
        if (i3 == 0 && getMessagesController().Q3) {
            int i10 = this.S;
            this.Q = i10;
            this.S = i10 + 2;
            this.R = i10 + 1;
        }
        if (this.f41989n) {
            if (i3 == 0) {
                int i11 = this.S;
                this.f41993x = i11;
                this.S = i11 + 2;
                this.f41994y = i11 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i12 = this.S;
            this.f41993x = i12;
            this.S = i12 + 2;
            this.f41994y = i12 + 1;
        }
        ArrayList arrayList = this.f41987e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (i3 != 1 && this.h == null) {
                this.P = -1;
            } else {
                int i13 = this.S;
                this.S = i13 + 1;
                this.P = i13;
            }
        } else {
            int i14 = this.S;
            this.terminateAllSessionsRow = i14;
            this.S = i14 + 2;
            this.E = i14 + 1;
            this.P = -1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.S;
            int i16 = i15 + 1;
            this.S = i16;
            this.F = i15;
            this.G = i16;
            int size = arrayList.size() + i16;
            this.H = size;
            this.S = size + 1;
            this.I = size;
        }
        if (!arrayList2.isEmpty()) {
            int i17 = this.S;
            this.S = i17 + 1;
            this.J = i17;
            ArrayList arrayList3 = this.f41988f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i18 = this.S;
                this.M = i18;
                int size2 = this.f41988f.size() + i18;
                this.S = size2;
                this.N = size2;
            }
            int i19 = this.S;
            this.K = i19;
            this.L = arrayList2.size() + i19;
            int size3 = arrayList2.size() + this.S;
            this.S = size3 + 1;
            this.O = size3;
        } else {
            ArrayList arrayList4 = this.f41988f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i20 = this.S;
                int i21 = i20 + 1;
                this.S = i21;
                this.J = i20;
                this.M = i21;
                int size4 = this.f41988f.size() + i21;
                this.N = size4;
                this.S = size4 + 1;
                this.O = size4;
            }
        }
        if (this.f41991s > 0) {
            int i22 = this.S;
            this.T = i22;
            this.ttlRow = i22 + 1;
            this.S = i22 + 3;
            this.U = i22 + 2;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

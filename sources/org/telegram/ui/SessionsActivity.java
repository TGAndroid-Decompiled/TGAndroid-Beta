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
public class SessionsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
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
    public boolean V;
    public boolean W;
    public uu0 X;
    public n41 f34041a;
    public mb0 f34042b;
    public org.telegram.ui.Components.xy f34043c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f34044f;
    public TLRPC.TL_authorization h;
    public boolean f34045n;
    public j41 f34046r;
    public int f34047s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int f34048w;
    public int f34049x;
    public int f34050y;

    public SessionsActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f34044f = new ArrayList();
        this.U = 0;
        this.f34048w = i10;
    }

    public static void Z(org.telegram.ui.SessionsActivity r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SessionsActivity.Z(org.telegram.ui.SessionsActivity, int):void");
    }

    public static void a0(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f34044f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.wp.r1(sessionsActivity.currentAccount).n1(((TL_account.TL_connectedBot) sessionsActivity.f34044f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new d41(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new d41(sessionsActivity, 1));
    }

    public static void b0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f34048w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new d41(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new d41(sessionsActivity, 3));
    }

    public static void c0(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, sessionsActivity.getParentActivity(), null);
            x1Var.f21489i0 = false;
            x1Var.show();
            if (sessionsActivity.f34048w == 0) {
                int i11 = sessionsActivity.J;
                if (i10 >= i11 && i10 < sessionsActivity.K) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new tp0(sessionsActivity, x1Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.J);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new tp0(sessionsActivity, x1Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                org.telegram.messenger.wp.r1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void d0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.f34045n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.wp.r1(sessionsActivity.currentAccount).V3(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.r0();
        }
        n41 n41Var = sessionsActivity.f34041a;
        if (n41Var != null) {
            n41Var.f();
        }
        uu0 uu0Var = sessionsActivity.X;
        if (uu0Var != null) {
            uu0Var.a();
        }
        int i10 = sessionsActivity.U;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.U = i11;
            if (i11 > 0) {
                org.telegram.messenger.i0.h3(new e41(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21154p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new org.telegram.ui.Components.zz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = this.f34048w;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131751456, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131742937, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new z01(this, 1));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.f34041a = new n41(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f34043c = xyVar;
        xyVar.b();
        mb0 mb0Var = new mb0(this, context, 2);
        this.f34042b = mb0Var;
        mb0Var.r1();
        this.f34042b.setLayoutManager(new dh.f(1, false, 17));
        this.f34042b.setSectionsDrawBackground(true);
        this.f34042b.setVerticalScrollBarEnabled(false);
        this.f34042b.setEmptyView(this.f34043c);
        mb0 mb0Var2 = this.f34042b;
        mb0Var2.W1 = true;
        mb0Var2.X1 = 0;
        frameLayout.addView(mb0Var2, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f34043c, w7.b6.e(-1, -1, 17));
        this.f34042b.setAdapter(this.f34041a);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        this.f34042b.setItemAnimator(jVar);
        this.f34042b.setOnItemClickListener(new jz0(this, 5));
        if (i10 == 0) {
            j41 j41Var = new j41(this, context);
            this.f34046r = j41Var;
            frameLayout.addView(j41Var, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        r0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14794u0) {
            p0(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f34042b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34042b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.w6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34043c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        int i10 = org.telegram.ui.ActionBar.t6.f21154p7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34042b, 262148, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34042b, 262148, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34042b, 262144, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34046r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int o0() {
        ArrayList arrayList = this.d;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f34045n) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f34048w == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final void onBecomeFullyHidden() {
        j41 j41Var = this.f34046r;
        if (j41Var != null) {
            j41Var.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        p0(false);
        if (this.f34048w == 0) {
            ag.k.a(this.currentAccount).c(new g41(this, 0));
        }
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14794u0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14794u0);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        j41 j41Var = this.f34046r;
        if (j41Var != null) {
            j41Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        j41 j41Var = this.f34046r;
        if (j41Var != null) {
            j41Var.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.j0(getParentActivity(), 2, new m41(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20135a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131746518, null));
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747316, null), new h41(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751772, null), null);
            int i11 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder.m(2131624114, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        n41 n41Var = this.f34041a;
        if (n41Var != null) {
            n41Var.f();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.W = true;
            for (int i10 = 0; i10 < this.f34042b.getChildCount(); i10++) {
                View childAt = this.f34042b.getChildAt(i10);
                if (childAt instanceof o41) {
                    ((o41) childAt).f40041b.invalidate();
                }
            }
        }
    }

    public final void p0(final boolean z10) {
        if (this.f34045n) {
            return;
        }
        if (!z10) {
            this.f34045n = true;
        }
        if (this.f34048w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f35938b;

                {
                    this.f35938b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f35938b;
                            final boolean z11 = z10;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.f34045n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.f34047s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.r0();
                                                uu0 uu0Var = sessionsActivity2.X;
                                                if (uu0Var != null) {
                                                    uu0Var.a();
                                                }
                                            }
                                            n41 n41Var = sessionsActivity2.f34041a;
                                            if (n41Var != null) {
                                                n41Var.f();
                                            }
                                            uu0 uu0Var2 = sessionsActivity2.X;
                                            if (uu0Var2 != null) {
                                                uu0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.U;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.U = i12;
                                                if (i12 > 0) {
                                                    org.telegram.messenger.i0.h3(new e41(sessionsActivity2, z11, 1), 2500L);
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
                            final SessionsActivity sessionsActivity2 = this.f35938b;
                            final boolean z12 = z10;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.f34045n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.f34047s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.r0();
                                                uu0 uu0Var = sessionsActivity22.X;
                                                if (uu0Var != null) {
                                                    uu0Var.a();
                                                }
                                            }
                                            n41 n41Var = sessionsActivity22.f34041a;
                                            if (n41Var != null) {
                                                n41Var.f();
                                            }
                                            uu0 uu0Var2 = sessionsActivity22.X;
                                            if (uu0Var2 != null) {
                                                uu0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.U;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.U = i12;
                                                if (i12 > 0) {
                                                    org.telegram.messenger.i0.h3(new e41(sessionsActivity22, z12, 1), 2500L);
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
            public final SessionsActivity f35938b;

            {
                this.f35938b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f35938b;
                        final boolean z11 = z10;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f34045n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.f34047s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            uu0 uu0Var = sessionsActivity22.X;
                                            if (uu0Var != null) {
                                                uu0Var.a();
                                            }
                                        }
                                        n41 n41Var = sessionsActivity22.f34041a;
                                        if (n41Var != null) {
                                            n41Var.f();
                                        }
                                        uu0 uu0Var2 = sessionsActivity22.X;
                                        if (uu0Var2 != null) {
                                            uu0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.U;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.U = i12;
                                            if (i12 > 0) {
                                                org.telegram.messenger.i0.h3(new e41(sessionsActivity22, z11, 1), 2500L);
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
                        final SessionsActivity sessionsActivity2 = this.f35938b;
                        final boolean z12 = z10;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f34045n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.f34047s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            uu0 uu0Var = sessionsActivity22.X;
                                            if (uu0Var != null) {
                                                uu0Var.a();
                                            }
                                        }
                                        n41 n41Var = sessionsActivity22.f34041a;
                                        if (n41Var != null) {
                                            n41Var.f();
                                        }
                                        uu0 uu0Var2 = sessionsActivity22.X;
                                        if (uu0Var2 != null) {
                                            uu0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.U;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.U = i12;
                                            if (i12 > 0) {
                                                org.telegram.messenger.i0.h3(new e41(sessionsActivity22, z12, 1), 2500L);
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
        this.V = true;
    }

    public final void r0() {
        this.R = 0;
        this.f34049x = -1;
        this.f34050y = -1;
        this.terminateAllSessionsRow = -1;
        this.D = -1;
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
        this.S = -1;
        this.ttlRow = -1;
        this.T = -1;
        int i10 = this.f34048w;
        if (i10 == 0 && getMessagesController().R3) {
            int i11 = this.R;
            this.P = i11;
            this.R = i11 + 2;
            this.Q = i11 + 1;
        }
        if (this.f34045n) {
            if (i10 == 0) {
                int i12 = this.R;
                this.f34049x = i12;
                this.R = i12 + 2;
                this.f34050y = i12 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i13 = this.R;
            this.f34049x = i13;
            this.R = i13 + 2;
            this.f34050y = i13 + 1;
        }
        ArrayList arrayList = this.e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.D = -1;
            if (i10 != 1 && this.h == null) {
                this.O = -1;
            } else {
                int i14 = this.R;
                this.R = i14 + 1;
                this.O = i14;
            }
        } else {
            int i15 = this.R;
            this.terminateAllSessionsRow = i15;
            this.R = i15 + 2;
            this.D = i15 + 1;
            this.O = -1;
        }
        if (!arrayList.isEmpty()) {
            int i16 = this.R;
            int i17 = i16 + 1;
            this.R = i17;
            this.E = i16;
            this.F = i17;
            int size = arrayList.size() + i17;
            this.G = size;
            this.R = size + 1;
            this.H = size;
        }
        if (!arrayList2.isEmpty()) {
            int i18 = this.R;
            this.R = i18 + 1;
            this.I = i18;
            ArrayList arrayList3 = this.f34044f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i19 = this.R;
                this.L = i19;
                int size2 = this.f34044f.size() + i19;
                this.R = size2;
                this.M = size2;
            }
            int i20 = this.R;
            this.J = i20;
            this.K = arrayList2.size() + i20;
            int size3 = arrayList2.size() + this.R;
            this.R = size3 + 1;
            this.N = size3;
        } else {
            ArrayList arrayList4 = this.f34044f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.R;
                int i22 = i21 + 1;
                this.R = i22;
                this.I = i21;
                this.L = i22;
                int size4 = this.f34044f.size() + i22;
                this.M = size4;
                this.R = size4 + 1;
                this.N = size4;
            }
        }
        if (this.f34047s > 0) {
            int i23 = this.R;
            this.S = i23;
            this.ttlRow = i23 + 1;
            this.R = i23 + 3;
            this.T = i23 + 2;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

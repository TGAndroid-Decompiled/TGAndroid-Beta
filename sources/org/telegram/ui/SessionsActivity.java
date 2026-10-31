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
public class SessionsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public vu0 X;
    public p41 f34034a;
    public nb0 f34035b;
    public org.telegram.ui.Components.xy f34036c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f34037f;
    public TLRPC.TL_authorization h;
    public boolean f34038n;
    public l41 f34039r;
    public int f34040s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int f34041w;
    public int f34042x;
    public int f34043y;

    public SessionsActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f34037f = new ArrayList();
        this.U = 0;
        this.f34041w = i10;
    }

    public static void Y(org.telegram.ui.SessionsActivity r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SessionsActivity.Y(org.telegram.ui.SessionsActivity, int):void");
    }

    public static void Z(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f34037f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.vp.r1(sessionsActivity.currentAccount).n1(((TL_account.TL_connectedBot) sessionsActivity.f34037f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new f41(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new f41(sessionsActivity, 1));
    }

    public static void a0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f34041w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new f41(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new f41(sessionsActivity, 3));
    }

    public static void b0(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, sessionsActivity.getParentActivity(), null);
            x1Var.f21488i0 = false;
            x1Var.show();
            if (sessionsActivity.f34041w == 0) {
                int i11 = sessionsActivity.J;
                if (i10 >= i11 && i10 < sessionsActivity.K) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new vp0(sessionsActivity, x1Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.J);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new vp0(sessionsActivity, x1Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                org.telegram.messenger.vp.r1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void c0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.f34038n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.vp.r1(sessionsActivity.currentAccount).V3(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.q0();
        }
        p41 p41Var = sessionsActivity.f34034a;
        if (p41Var != null) {
            p41Var.f();
        }
        vu0 vu0Var = sessionsActivity.X;
        if (vu0Var != null) {
            vu0Var.a();
        }
        int i10 = sessionsActivity.U;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.U = i11;
            if (i11 > 0) {
                org.telegram.messenger.i0.h3(new g41(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21153p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new org.telegram.ui.Components.zz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = this.f34041w;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751456, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131742937, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 1));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.f34034a = new p41(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f34036c = xyVar;
        xyVar.b();
        nb0 nb0Var = new nb0(this, context, 2);
        this.f34035b = nb0Var;
        nb0Var.r1();
        this.f34035b.setLayoutManager(new dh.f(1, false, 17));
        this.f34035b.setSectionsDrawBackground(true);
        this.f34035b.setVerticalScrollBarEnabled(false);
        this.f34035b.setEmptyView(this.f34036c);
        nb0 nb0Var2 = this.f34035b;
        nb0Var2.W1 = true;
        nb0Var2.X1 = 0;
        frameLayout.addView(nb0Var2, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.f34036c, w7.b6.e(-1, -1, 17));
        this.f34035b.setAdapter(this.f34034a);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        this.f34035b.setItemAnimator(jVar);
        this.f34035b.setOnItemClickListener(new kz0(this, 5));
        if (i10 == 0) {
            l41 l41Var = new l41(this, context);
            this.f34039r = l41Var;
            frameLayout.addView(l41Var, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        q0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19698u0) {
            o0(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f34035b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34035b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.w6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34036c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        int i10 = org.telegram.ui.ActionBar.t6.f21153p7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34035b, 262148, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34035b, 262148, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34035b, 262144, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f34039r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int n0() {
        ArrayList arrayList = this.d;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f34038n) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f34041w == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void o0(final boolean z10) {
        if (this.f34038n) {
            return;
        }
        if (!z10) {
            this.f34038n = true;
        }
        if (this.f34041w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f36615b;

                {
                    this.f36615b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f36615b;
                            final boolean z11 = z10;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.f34038n = false;
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
                                                sessionsActivity2.f34040s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.q0();
                                                vu0 vu0Var = sessionsActivity2.X;
                                                if (vu0Var != null) {
                                                    vu0Var.a();
                                                }
                                            }
                                            p41 p41Var = sessionsActivity2.f34034a;
                                            if (p41Var != null) {
                                                p41Var.f();
                                            }
                                            vu0 vu0Var2 = sessionsActivity2.X;
                                            if (vu0Var2 != null) {
                                                vu0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.U;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.U = i12;
                                                if (i12 > 0) {
                                                    org.telegram.messenger.i0.h3(new g41(sessionsActivity2, z11, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.c0(sessionsActivity, tL_error, tLObject, z11);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f36615b;
                            final boolean z12 = z10;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.f34038n = false;
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
                                                sessionsActivity22.f34040s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.q0();
                                                vu0 vu0Var = sessionsActivity22.X;
                                                if (vu0Var != null) {
                                                    vu0Var.a();
                                                }
                                            }
                                            p41 p41Var = sessionsActivity22.f34034a;
                                            if (p41Var != null) {
                                                p41Var.f();
                                            }
                                            vu0 vu0Var2 = sessionsActivity22.X;
                                            if (vu0Var2 != null) {
                                                vu0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.U;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.U = i12;
                                                if (i12 > 0) {
                                                    org.telegram.messenger.i0.h3(new g41(sessionsActivity22, z12, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.c0(sessionsActivity2, tL_error, tLObject, z12);
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
            public final SessionsActivity f36615b;

            {
                this.f36615b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f36615b;
                        final boolean z11 = z10;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f34038n = false;
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
                                            sessionsActivity22.f34040s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.q0();
                                            vu0 vu0Var = sessionsActivity22.X;
                                            if (vu0Var != null) {
                                                vu0Var.a();
                                            }
                                        }
                                        p41 p41Var = sessionsActivity22.f34034a;
                                        if (p41Var != null) {
                                            p41Var.f();
                                        }
                                        vu0 vu0Var2 = sessionsActivity22.X;
                                        if (vu0Var2 != null) {
                                            vu0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.U;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.U = i12;
                                            if (i12 > 0) {
                                                org.telegram.messenger.i0.h3(new g41(sessionsActivity22, z11, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.c0(sessionsActivity, tL_error, tLObject, z11);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f36615b;
                        final boolean z12 = z10;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f34038n = false;
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
                                            sessionsActivity22.f34040s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.q0();
                                            vu0 vu0Var = sessionsActivity22.X;
                                            if (vu0Var != null) {
                                                vu0Var.a();
                                            }
                                        }
                                        p41 p41Var = sessionsActivity22.f34034a;
                                        if (p41Var != null) {
                                            p41Var.f();
                                        }
                                        vu0 vu0Var2 = sessionsActivity22.X;
                                        if (vu0Var2 != null) {
                                            vu0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.U;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.U = i12;
                                            if (i12 > 0) {
                                                org.telegram.messenger.i0.h3(new g41(sessionsActivity22, z12, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.c0(sessionsActivity2, tL_error, tLObject, z12);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }), this.classGuid);
    }

    @Override
    public final void onBecomeFullyHidden() {
        l41 l41Var = this.f34039r;
        if (l41Var != null) {
            l41Var.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        o0(false);
        if (this.f34041w == 0) {
            ag.k.a(this.currentAccount).c(new i41(this, 0));
        }
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19698u0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19698u0);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        l41 l41Var = this.f34039r;
        if (l41Var != null) {
            l41Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        l41 l41Var = this.f34039r;
        if (l41Var != null) {
            l41Var.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.i0(getParentActivity(), 2, new o41(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131746518, null));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new j41(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
            int i11 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder.m(2131624114, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        p41 p41Var = this.f34034a;
        if (p41Var != null) {
            p41Var.f();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.W = true;
            for (int i10 = 0; i10 < this.f34035b.getChildCount(); i10++) {
                View childAt = this.f34035b.getChildAt(i10);
                if (childAt instanceof q41) {
                    ((q41) childAt).f40867b.invalidate();
                }
            }
        }
    }

    public final void p0() {
        this.V = true;
    }

    public final void q0() {
        this.R = 0;
        this.f34042x = -1;
        this.f34043y = -1;
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
        int i10 = this.f34041w;
        if (i10 == 0 && getMessagesController().R3) {
            int i11 = this.R;
            this.P = i11;
            this.R = i11 + 2;
            this.Q = i11 + 1;
        }
        if (this.f34038n) {
            if (i10 == 0) {
                int i12 = this.R;
                this.f34042x = i12;
                this.R = i12 + 2;
                this.f34043y = i12 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i13 = this.R;
            this.f34042x = i13;
            this.R = i13 + 2;
            this.f34043y = i13 + 1;
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
            ArrayList arrayList3 = this.f34037f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i19 = this.R;
                this.L = i19;
                int size2 = this.f34037f.size() + i19;
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
            ArrayList arrayList4 = this.f34037f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.R;
                int i22 = i21 + 1;
                this.R = i22;
                this.I = i21;
                this.L = i22;
                int size4 = this.f34037f.size() + i22;
                this.M = size4;
                this.R = size4 + 1;
                this.N = size4;
            }
        }
        if (this.f34040s > 0) {
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

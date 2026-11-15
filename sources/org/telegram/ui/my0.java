package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
public final class my0 extends org.telegram.ui.ActionBar.u2 {
    public static final int f49339w1 = 0;
    public final hi.i1 f49340m1;
    public final Paint n1;
    public int f49341o1;
    public final boolean f49342p1;
    public final boolean f49343q1;
    public final boolean f49344r1;
    public final ArrayList f49345s1;
    public final byte[] f49346t1;
    public final long f49347u1;
    public hy0 f49348v1;

    public my0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, byte[] bArr) {
        this(true, context, e6Var, j3, false, false, null, bArr);
    }

    public static void I0(my0 my0Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = my0Var.f49347u1;
        ArrayList arrayList = my0Var.f49345s1;
        if (my0Var.f49342p1) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = my0Var.f49346t1;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (my0Var.f49343q1) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.np.s1(my0Var.f29679a).j1(j3);
                if (arrayList != null) {
                    tL_stories_report.f28302id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (my0Var.f49344r1) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.np.s1(my0Var.f29679a).j1(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f28270id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = org.telegram.messenger.np.s1(my0Var.f29679a).j1(j3);
                if (arrayList != null) {
                    tL_messages_report2.f28157id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_messages_report2.message = str2;
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(my0Var.f29679a).sendRequest(r02, new bi.l1(my0Var, charSequence, bArr, str, 18));
    }

    public static void J0(int i7, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.cc ccVar, final org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, String str, final org.telegram.messenger.z10 z10Var) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.np.s1(i7).j1(j3);
                tL_stories_report.f28302id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z11) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.np.s1(i7).j1(j3);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f28270id = ((Integer) arrayList.get(0)).intValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
                ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(1), new org.telegram.messenger.s10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                        boolean[] zArr2 = zArr;
                        org.telegram.messenger.z10 z10Var2 = z10Var;
                        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                            org.telegram.messenger.g0.i3(new di.c8(1, z10Var2, zArr2), 200L);
                            return;
                        }
                        my0 my0Var = new my0(false, context, e6Var, j3, z10, z11, arrayList, null);
                        if (z12) {
                            my0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                            View[] viewPages = my0Var.f49340m1.getViewPages();
                            View view = viewPages[0];
                            if (view instanceof ly0) {
                                ((ly0) view).a(0);
                                my0Var.f29682b.post(new mp0(28, viewPages, tL_reportResultAddComment));
                            }
                            View view2 = viewPages[1];
                            if (view2 instanceof ly0) {
                                ((ly0) view2).a(1);
                            }
                        }
                        my0Var.f49348v1 = new ld0(zArr2, z10Var2, ccVar, 1);
                        my0Var.n(new di.c8(2, z10Var2, zArr2));
                        my0Var.show();
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = org.telegram.messenger.np.s1(i7).j1(j3);
                tL_messages_report3.f28157id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report3.message = str2;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(1), new org.telegram.messenger.s10() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    org.telegram.messenger.z10 z10Var2 = z10Var;
                    if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        org.telegram.messenger.g0.i3(new di.c8(1, z10Var2, zArr2), 200L);
                        return;
                    }
                    my0 my0Var = new my0(false, context, e6Var, j3, z10, z11, arrayList, null);
                    if (z12) {
                        my0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = my0Var.f49340m1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof ly0) {
                            ((ly0) view).a(0);
                            my0Var.f29682b.post(new mp0(28, viewPages, tL_reportResultAddComment));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof ly0) {
                            ((ly0) view2).a(1);
                        }
                    }
                    my0Var.f49348v1 = new ld0(zArr2, z10Var2, ccVar, 1);
                    my0Var.n(new di.c8(2, z10Var2, zArr2));
                    my0Var.show();
                }
            });
        }
    }

    public static void K0(long j3, org.telegram.ui.ActionBar.e2 e2Var) {
        int currentAccount = e2Var.getCurrentAccount();
        Context context = e2Var.getContext();
        if (context == null) {
            return;
        }
        J0(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void L0(an anVar, org.telegram.messenger.gj gjVar) {
        int e12;
        int currentAccount = anVar.getCurrentAccount();
        Activity parentActivity = anVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (org.telegram.messenger.gj.c3(gjVar.f23819k)) {
            e12 = gjVar.P0();
        } else {
            e12 = gjVar.e1();
        }
        J0(currentAccount, parentActivity, org.telegram.messenger.gj.B0(gjVar.f23819k), false, org.telegram.messenger.gj.c3(gjVar.f23819k), new ArrayList(Collections.singleton(Integer.valueOf(e12))), org.telegram.ui.Components.cc.a0(anVar), anVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void M0(an anVar, org.telegram.messenger.gj gjVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int currentAccount = anVar.getCurrentAccount();
        Activity parentActivity = anVar.getParentActivity();
        long a10 = anVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = gjVar.R0;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ki.x0(parentActivity, e6Var, a10, bArr, anVar, gjVar, currentAccount));
    }

    @Override
    public final boolean H() {
        View currentView = this.f49340m1.getCurrentView();
        if (!(currentView instanceof ly0)) {
            return true;
        }
        return !((ly0) currentView).f49061f.canScrollVertically(-1);
    }

    public final void N0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f49340m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ly0) {
            ((ly0) view).a(0);
            this.f29682b.post(new mp0(27, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ly0) {
            ((ly0) view2).a(1);
        }
    }

    public final void O0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f49340m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ly0) {
            ((ly0) view).a(0);
            this.f29682b.post(new mp0(29, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ly0) {
            ((ly0) view2).a(1);
        }
    }

    @Override
    public final void onBackPressed() {
        jy0 jy0Var;
        hi.i1 i1Var = this.f49340m1;
        if ((i1Var.getCurrentView() instanceof ly0) && (jy0Var = ((ly0) i1Var.getCurrentView()).f49062n) != null) {
            org.telegram.messenger.g0.v1(jy0Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.C(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        int i7;
        Paint paint = this.n1;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.f29682b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.G0 < 0 && (i7 = this.H0) == this.f49341o1 && w02 != i7) {
                this.H0 = w02;
                this.f49341o1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public my0(boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, e6Var, true);
        Paint paint = new Paint(1);
        this.n1 = paint;
        this.f49342p1 = z10;
        this.f49345s1 = arrayList;
        this.f49343q1 = z11;
        this.f49344r1 = z12;
        this.f49346t1 = bArr;
        this.f49347u1 = j3;
        int i7 = org.telegram.ui.ActionBar.j6.f28922h5;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        Q(i7);
        this.f49341o1 = this.H0;
        this.Q0 = true;
        this.R0 = true;
        this.f29682b = new w50(this, context);
        hi.i1 i1Var = new hi.i1(6, context, this);
        this.f49340m1 = i1Var;
        int i10 = this.f29717u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.f29682b.addView(i1Var, c8.ja.e(-1, -1, 119));
        i1Var.setAdapter(new di.f4(5, context, this));
        if (arrayList == null && bArr == null) {
            if (z10) {
                N0(null);
            } else {
                O0(null);
            }
        }
    }
}

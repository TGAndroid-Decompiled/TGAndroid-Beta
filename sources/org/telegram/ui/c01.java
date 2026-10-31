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
public final class c01 extends org.telegram.ui.ActionBar.z2 {
    public static final int f36350s1 = 0;
    public final hk f36351i1;
    public final Paint f36352j1;
    public int f36353k1;
    public final boolean l1;
    public final boolean f36354m1;
    public final boolean f36355n1;
    public final ArrayList f36356o1;
    public final byte[] f36357p1;
    public final long f36358q1;
    public xz0 f36359r1;

    public c01(Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, byte[] bArr) {
        this(true, context, p6Var, j10, false, false, null, bArr);
    }

    public static void I0(c01 c01Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = c01Var.f36358q1;
        ArrayList arrayList = c01Var.f36356o1;
        if (c01Var.l1) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = c01Var.f36357p1;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (c01Var.f36354m1) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.vp.r1(c01Var.f21583a).i1(j10);
                if (arrayList != null) {
                    tL_stories_report.f20043id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (c01Var.f36355n1) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.vp.r1(c01Var.f21583a).i1(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f20011id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = org.telegram.messenger.vp.r1(c01Var.f21583a).i1(j10);
                if (arrayList != null) {
                    tL_messages_report2.f19899id.addAll(arrayList);
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
        ConnectionsManager.getInstance(c01Var.f21583a).sendRequest(r02, new mb(c01Var, charSequence, bArr, str, 8));
    }

    public static void J0(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.cc ccVar, final org.telegram.ui.ActionBar.p6 p6Var, byte[] bArr, String str, final org.telegram.messenger.q20 q20Var) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
                tL_stories_report.f20043id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z11) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f20011id = ((Integer) arrayList.get(0)).intValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
                ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new a3.b(1), new org.telegram.messenger.j20() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                        boolean[] zArr2 = zArr;
                        org.telegram.messenger.q20 q20Var2 = q20Var;
                        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                            org.telegram.messenger.i0.h3(new qz0(0, q20Var2, zArr2), 200L);
                            return;
                        }
                        c01 c01Var = new c01(false, context, p6Var, j10, z10, z11, arrayList, null);
                        if (z12) {
                            c01Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                            View[] viewPages = c01Var.f36351i1.getViewPages();
                            View view = viewPages[0];
                            if (view instanceof b01) {
                                ((b01) view).a(0);
                                c01Var.f21586b.post(new et0(24, viewPages, tL_reportResultAddComment));
                            }
                            View view2 = viewPages[1];
                            if (view2 instanceof b01) {
                                ((b01) view2).a(1);
                            }
                        }
                        c01Var.f36359r1 = new li.k(zArr2, q20Var2, ccVar, 25);
                        c01Var.o(new qz0(1, q20Var2, zArr2));
                        c01Var.show();
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = org.telegram.messenger.vp.r1(i10).i1(j10);
                tL_messages_report3.f19899id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report3.message = str2;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new a3.b(1), new org.telegram.messenger.j20() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    org.telegram.messenger.q20 q20Var2 = q20Var;
                    if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        org.telegram.messenger.i0.h3(new qz0(0, q20Var2, zArr2), 200L);
                        return;
                    }
                    c01 c01Var = new c01(false, context, p6Var, j10, z10, z11, arrayList, null);
                    if (z12) {
                        c01Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = c01Var.f36351i1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof b01) {
                            ((b01) view).a(0);
                            c01Var.f21586b.post(new et0(24, viewPages, tL_reportResultAddComment));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof b01) {
                            ((b01) view2).a(1);
                        }
                    }
                    c01Var.f36359r1 = new li.k(zArr2, q20Var2, ccVar, 25);
                    c01Var.o(new qz0(1, q20Var2, zArr2));
                    c01Var.show();
                }
            });
        }
    }

    public static void K0(long j10, org.telegram.ui.ActionBar.k2 k2Var) {
        int currentAccount = k2Var.getCurrentAccount();
        Context context = k2Var.getContext();
        if (context == null) {
            return;
        }
        J0(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void L0(un unVar, org.telegram.messenger.jj jjVar) {
        int f12;
        int currentAccount = unVar.getCurrentAccount();
        Activity parentActivity = unVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (org.telegram.messenger.jj.c3(jjVar.f16337k)) {
            f12 = jjVar.P0();
        } else {
            f12 = jjVar.f1();
        }
        J0(currentAccount, parentActivity, org.telegram.messenger.jj.B0(jjVar.f16337k), false, org.telegram.messenger.jj.c3(jjVar.f16337k), new ArrayList(Collections.singleton(Integer.valueOf(f12))), org.telegram.ui.Components.cc.a0(unVar), unVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void M0(un unVar, org.telegram.messenger.jj jjVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int currentAccount = unVar.getCurrentAccount();
        Activity parentActivity = unVar.getParentActivity();
        long a2 = unVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = jjVar.P0;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new b20(parentActivity, p6Var, a2, bArr, unVar, jjVar, currentAccount));
    }

    @Override
    public final boolean H() {
        View currentView = this.f36351i1.getCurrentView();
        if (!(currentView instanceof b01)) {
            return true;
        }
        return !((b01) currentView).f35922f.canScrollVertically(-1);
    }

    public final void N0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f36351i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof b01) {
            ((b01) view).a(0);
            this.f21586b.post(new et0(23, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof b01) {
            ((b01) view2).a(1);
        }
    }

    public final void O0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f36351i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof b01) {
            ((b01) view).a(0);
            this.f21586b.post(new et0(25, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof b01) {
            ((b01) view2).a(1);
        }
    }

    @Override
    public final void onBackPressed() {
        zz0 zz0Var;
        hk hkVar = this.f36351i1;
        if ((hkVar.getCurrentView() instanceof b01) && (zz0Var = ((b01) hkVar.getCurrentView()).f35923n) != null) {
            org.telegram.messenger.i0.v1(zz0Var);
        }
        if (hkVar.getCurrentPosition() > 0) {
            hkVar.E(hkVar.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        int i10;
        Paint paint = this.f36352j1;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.f21586b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.F0 < 0 && (i10 = this.G0) == this.f36353k1 && w02 != i10) {
                this.G0 = w02;
                this.f36353k1 = w02;
                E0(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public c01(boolean z10, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, p6Var, true);
        Paint paint = new Paint(1);
        this.f36352j1 = paint;
        this.l1 = z10;
        this.f36356o1 = arrayList;
        this.f36354m1 = z11;
        this.f36355n1 = z12;
        this.f36357p1 = bArr;
        this.f36358q1 = j10;
        int i10 = org.telegram.ui.ActionBar.t6.f21001h5;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        Q(i10);
        this.f36353k1 = this.G0;
        this.P0 = true;
        this.Q0 = true;
        this.f21586b = new w60(this, context);
        hk hkVar = new hk(this, context, 3);
        this.f36351i1 = hkVar;
        int i11 = this.f21615t0;
        hkVar.setPadding(i11, 0, i11, 0);
        this.f21586b.addView(hkVar, w7.b6.e(-1, -1, 119));
        hkVar.setAdapter(new mg.s(this, context, 4));
        if (arrayList == null && bArr == null) {
            if (z10) {
                N0(null);
            } else {
                O0(null);
            }
        }
    }
}

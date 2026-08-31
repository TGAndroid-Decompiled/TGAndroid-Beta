package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
public final class m31 extends org.telegram.ui.ActionBar.h3 {
    public static final int v = 0;
    public final ek f38955b;
    public final Paint f38956c;
    public final boolean d;
    public final boolean f38957e;
    public final boolean f38958f;
    public final ArrayList h;
    public final byte[] f38959n;
    public final long f38960r;
    public h31 f38961s;

    public m31(Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, byte[] bArr) {
        this(true, context, g6Var, j10, false, false, null, bArr);
    }

    public static void G(m31 m31Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = m31Var.f38960r;
        ArrayList arrayList = m31Var.h;
        if (m31Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = m31Var.f38959n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (m31Var.f38957e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(m31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f21092id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (m31Var.f38958f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(m31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f21060id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(m31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f20947id.addAll(arrayList);
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
        ConnectionsManager.getInstance(m31Var.currentAccount).sendRequest(r02, new lh.b1(m31Var, charSequence, bArr, str, 15));
    }

    public static void J(int i10, final Context context, final long j10, final boolean z4, final boolean z10, final ArrayList arrayList, final org.telegram.ui.Components.qc qcVar, final org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z4) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.f21092id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z10) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f21060id = ((Integer) arrayList.get(0)).intValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
                ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new Object(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        m31.m(context, g6Var, z4, z10, j10, arrayList, zArr, callback, qcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f20947id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report3.message = str2;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    m31.m(context, g6Var, z4, z10, j10, arrayList, zArr, callback, qcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void K(long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        int currentAccount = p2Var.getCurrentAccount();
        Context context = p2Var.getContext();
        if (context == null) {
            return;
        }
        J(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M(xn xnVar, MessageObject messageObject) {
        int id2;
        int currentAccount = xnVar.getCurrentAccount();
        Activity parentActivity = xnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        J(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.qc.a0(xnVar), xnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(xn xnVar, MessageObject messageObject, org.telegram.ui.ActionBar.g6 g6Var) {
        int currentAccount = xnVar.getCurrentAccount();
        Activity parentActivity = xnVar.getParentActivity();
        long a2 = xnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new y20(parentActivity, g6Var, a2, bArr, xnVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar, TLRPC.ReportResult reportResult) {
        boolean z11 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z11 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new mh.l6(zArr, callback, 1), 200L);
            return;
        }
        m31 m31Var = new m31(false, context, g6Var, j10, z4, z10, arrayList, null);
        if (z11) {
            m31Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = m31Var.f38955b.getViewPages();
            View view = viewPages[0];
            if (view instanceof l31) {
                ((l31) view).a(0);
                m31Var.containerView.post(new w01(4, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof l31) {
                ((l31) view2).a(1);
            }
        }
        m31Var.f38961s = new c31(zArr, callback, qcVar);
        m31Var.setOnDismissListener(new mh.l6(zArr, callback, 2));
        m31Var.show();
    }

    public static void n(m31 m31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        h31 h31Var;
        h31 h31Var2;
        qh.d dVar;
        ek ekVar = m31Var.f38955b;
        if ((ekVar.getCurrentView() instanceof l31) && (dVar = ((l31) ekVar.getCurrentView()).f38578s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z4 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z4 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(m31Var.currentAccount).disableAds(false);
                    h31 h31Var3 = m31Var.f38961s;
                    if (h31Var3 != null) {
                        h31Var3.b();
                        m31Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (h31Var2 = m31Var.f38961s) != null) {
                    h31Var2.a();
                    m31Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            ekVar.D(ekVar.f28985b + 1);
            l31 l31Var = (l31) ekVar.getViewPages()[1];
            if (l31Var != null) {
                org.telegram.ui.Components.i61 i61Var = l31Var.f38575f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    l31Var.f38572b = null;
                    l31Var.f38573c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    l31Var.d = null;
                    i61Var.V2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    l31Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z4) {
                    l31Var.f38572b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    l31Var.f38573c = null;
                    l31Var.d = null;
                    i61Var.V2.N(false);
                }
                if (charSequence != null) {
                    eg.q1 q1Var = l31Var.h;
                    ((TextView) q1Var.f5445c).setText(charSequence);
                    ((TextView) q1Var.f5445c).getText();
                    q1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (i61Var != null) {
                        i61Var.V2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!m31Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = m31Var.f38960r;
                String charSequence2 = charSequence.toString();
                int i10 = xn.Ec;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    Bundle bundle = new Bundle();
                    if (DialogObject.isUserDialog(j10)) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    bundle.putString("reportTitle", charSequence2);
                    bundle.putByteArray("reportOption", bArr);
                    bundle.putString("reportMessage", str);
                    U.presentFragment(new xn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                h31 h31Var4 = m31Var.f38961s;
                if (h31Var4 != null) {
                    h31Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (h31Var = m31Var.f38961s) != null) {
                h31Var.a();
            }
            m31Var.dismiss();
        }
    }

    public static ViewGroup t(m31 m31Var) {
        return m31Var.containerView;
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f38955b.getViewPages();
        View view = viewPages[0];
        if (view instanceof l31) {
            ((l31) view).a(0);
            this.containerView.post(new w01(3, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof l31) {
            ((l31) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f38955b.getViewPages();
        View view = viewPages[0];
        if (view instanceof l31) {
            ((l31) view).a(0);
            this.containerView.post(new w01(5, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof l31) {
            ((l31) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f38955b.getCurrentView();
        if (!(currentView instanceof l31)) {
            return true;
        }
        return !((l31) currentView).f38575f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        j31 j31Var;
        ek ekVar = this.f38955b;
        if ((ekVar.getCurrentView() instanceof l31) && (j31Var = ((l31) ekVar.getCurrentView()).f38576n) != null) {
            AndroidUtilities.hideKeyboard(j31Var);
        }
        if (ekVar.getCurrentPosition() > 0) {
            ekVar.D(ekVar.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public m31(boolean z4, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, boolean z10, boolean z11, ArrayList arrayList, byte[] bArr) {
        super(context, g6Var, true, false);
        Paint paint = new Paint(1);
        this.f38956c = paint;
        this.d = z4;
        this.h = arrayList;
        this.f38957e = z10;
        this.f38958f = z11;
        this.f38959n = bArr;
        this.f38960r = j10;
        int i10 = org.telegram.ui.ActionBar.k6.f21731h5;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new g31(this, context);
        ek ekVar = new ek(this, context, 3);
        this.f38955b = ekVar;
        int i11 = this.backgroundPaddingLeft;
        ekVar.setPadding(i11, 0, i11, 0);
        this.containerView.addView(ekVar, k7.c6.e(-1, -1, 119));
        ekVar.setAdapter(new hg.u(this, context, 3));
        if (arrayList == null && bArr == null) {
            if (z4) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}

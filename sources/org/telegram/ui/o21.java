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
public final class o21 extends org.telegram.ui.ActionBar.f3 {
    public static final int v = 0;
    public final ei.h1 f39746b;
    public final Paint f39747c;
    public final boolean d;
    public final boolean e;
    public final boolean f39748f;
    public final ArrayList h;
    public final byte[] f39749n;
    public final long f39750r;
    public k21 f39751s;

    public o21(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, byte[] bArr) {
        this(true, context, d6Var, j10, false, false, null, bArr);
    }

    public static void I(o21 o21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = o21Var.f39750r;
        ArrayList arrayList = o21Var.h;
        if (o21Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = o21Var.f39749n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (o21Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(o21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f20522id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (o21Var.f39748f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(o21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f20490id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(o21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f20380id.addAll(arrayList);
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
        ConnectionsManager.getInstance(o21Var.currentAccount).sendRequest(r02, new ai.k2(o21Var, charSequence, bArr, str, 17));
    }

    public static void L(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.xc xcVar, final org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.f20522id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z11) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f20490id = ((Integer) arrayList.get(0)).intValue();
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
                        o21.n(context, d6Var, z10, z11, j10, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f20380id.addAll(arrayList);
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
                    o21.n(context, d6Var, z10, z11, j10, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void M(long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        int currentAccount = n2Var.getCurrentAccount();
        Context context = n2Var.getContext();
        if (context == null) {
            return;
        }
        L(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void N(qn qnVar, MessageObject messageObject) {
        int id2;
        int currentAccount = qnVar.getCurrentAccount();
        Activity parentActivity = qnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        L(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.xc.a0(qnVar), qnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void O(qn qnVar, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        int currentAccount = qnVar.getCurrentAccount();
        Activity parentActivity = qnVar.getParentActivity();
        long a2 = qnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new gi.z0(parentActivity, d6Var, a2, bArr, qnVar, messageObject, currentAccount));
    }

    public static void n(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new ai.x8(1, callback, zArr), 200L);
            return;
        }
        o21 o21Var = new o21(false, context, d6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            o21Var.Q((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = o21Var.f39746b.getViewPages();
            View view = viewPages[0];
            if (view instanceof n21) {
                ((n21) view).a(0);
                o21Var.containerView.post(new jv0(23, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof n21) {
                ((n21) view2).a(1);
            }
        }
        o21Var.f39751s = new f21(zArr, callback, xcVar);
        o21Var.setOnDismissListener(new ai.x8(2, callback, zArr));
        o21Var.show();
    }

    public static void o(o21 o21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        k21 k21Var;
        k21 k21Var2;
        ei.d dVar;
        ei.h1 h1Var = o21Var.f39746b;
        if ((h1Var.getCurrentView() instanceof n21) && (dVar = ((n21) h1Var.getCurrentView()).f39400s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(o21Var.currentAccount).disableAds(false);
                    k21 k21Var3 = o21Var.f39751s;
                    if (k21Var3 != null) {
                        k21Var3.b();
                        o21Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (k21Var2 = o21Var.f39751s) != null) {
                    k21Var2.a();
                    o21Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            h1Var.D(h1Var.f25862b + 1);
            n21 n21Var = (n21) h1Var.getViewPages()[1];
            if (n21Var != null) {
                org.telegram.ui.Components.c71 c71Var = n21Var.f39397f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    n21Var.f39395b = null;
                    n21Var.f39396c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    n21Var.d = null;
                    c71Var.W2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    n21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    n21Var.f39395b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    n21Var.f39396c = null;
                    n21Var.d = null;
                    c71Var.W2.N(false);
                }
                if (charSequence != null) {
                    ai.o5 o5Var = n21Var.h;
                    ((TextView) o5Var.f1935c).setText(charSequence);
                    ((TextView) o5Var.f1935c).getText();
                    o5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (c71Var != null) {
                        c71Var.W2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!o21Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = o21Var.f39750r;
                String charSequence2 = charSequence.toString();
                int i10 = qn.Ic;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
                    U.presentFragment(new qn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                k21 k21Var4 = o21Var.f39751s;
                if (k21Var4 != null) {
                    k21Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (k21Var = o21Var.f39751s) != null) {
                k21Var.a();
            }
            o21Var.dismiss();
        }
    }

    public static ViewGroup v(o21 o21Var) {
        return o21Var.containerView;
    }

    public final void P(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f39746b.getViewPages();
        View view = viewPages[0];
        if (view instanceof n21) {
            ((n21) view).a(0);
            this.containerView.post(new jv0(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof n21) {
            ((n21) view2).a(1);
        }
    }

    public final void Q(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f39746b.getViewPages();
        View view = viewPages[0];
        if (view instanceof n21) {
            ((n21) view).a(0);
            this.containerView.post(new jv0(24, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof n21) {
            ((n21) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f39746b.getCurrentView();
        if (!(currentView instanceof n21)) {
            return true;
        }
        return !((n21) currentView).f39397f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        m21 m21Var;
        ei.h1 h1Var = this.f39746b;
        if ((h1Var.getCurrentView() instanceof n21) && (m21Var = ((n21) h1Var.getCurrentView()).f39398n) != null) {
            AndroidUtilities.hideKeyboard(m21Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.D(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public o21(boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, d6Var, true);
        Paint paint = new Paint(1);
        this.f39747c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f39748f = z12;
        this.f39749n = bArr;
        this.f39750r = j10;
        int i10 = org.telegram.ui.ActionBar.h6.f21061h5;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new j21(this, context);
        ei.h1 h1Var = new ei.h1(this, context, 6);
        this.f39746b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, w7.z5.e(-1, -1, 119));
        h1Var.setAdapter(new ai.j5(this, context, 2));
        if (arrayList == null && bArr == null) {
            if (z10) {
                P(null);
            } else {
                Q(null);
            }
        }
    }
}

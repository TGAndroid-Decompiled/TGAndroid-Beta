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
public final class q21 extends org.telegram.ui.ActionBar.f3 {
    public static final int v = 0;
    public final ei.h1 f40260b;
    public final Paint f40261c;
    public final boolean d;
    public final boolean e;
    public final boolean f40262f;
    public final ArrayList h;
    public final byte[] f40263n;
    public final long f40264r;
    public m21 f40265s;

    public q21(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, byte[] bArr) {
        this(true, context, d6Var, j10, false, false, null, bArr);
    }

    public static void I(q21 q21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = q21Var.f40264r;
        ArrayList arrayList = q21Var.h;
        if (q21Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = q21Var.f40263n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (q21Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(q21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f20518id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (q21Var.f40262f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(q21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f20486id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(q21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f20376id.addAll(arrayList);
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
        ConnectionsManager.getInstance(q21Var.currentAccount).sendRequest(r02, new ai.w2(q21Var, charSequence, bArr, str, 17));
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
                tL_stories_report.f20518id.addAll(arrayList);
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
                    tL_reportMessage.f20486id = ((Integer) arrayList.get(0)).intValue();
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
                        q21.n(context, d6Var, z10, z11, j10, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f20376id.addAll(arrayList);
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
                    q21.n(context, d6Var, z10, z11, j10, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
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

    public static void N(sn snVar, MessageObject messageObject) {
        int id2;
        int currentAccount = snVar.getCurrentAccount();
        Activity parentActivity = snVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        L(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.xc.a0(snVar), snVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void O(sn snVar, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        int currentAccount = snVar.getCurrentAccount();
        Activity parentActivity = snVar.getParentActivity();
        long a2 = snVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new gi.z0(parentActivity, d6Var, a2, bArr, snVar, messageObject, currentAccount));
    }

    public static void n(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new ai.w8(1, callback, zArr), 200L);
            return;
        }
        q21 q21Var = new q21(false, context, d6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            q21Var.Q((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = q21Var.f40260b.getViewPages();
            View view = viewPages[0];
            if (view instanceof p21) {
                ((p21) view).a(0);
                q21Var.containerView.post(new lv0(23, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof p21) {
                ((p21) view2).a(1);
            }
        }
        q21Var.f40265s = new h21(zArr, callback, xcVar);
        q21Var.setOnDismissListener(new ai.w8(2, callback, zArr));
        q21Var.show();
    }

    public static void o(q21 q21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        m21 m21Var;
        m21 m21Var2;
        ei.d dVar;
        ei.h1 h1Var = q21Var.f40260b;
        if ((h1Var.getCurrentView() instanceof p21) && (dVar = ((p21) h1Var.getCurrentView()).f39927s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(q21Var.currentAccount).disableAds(false);
                    m21 m21Var3 = q21Var.f40265s;
                    if (m21Var3 != null) {
                        m21Var3.b();
                        q21Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (m21Var2 = q21Var.f40265s) != null) {
                    m21Var2.a();
                    q21Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            h1Var.D(h1Var.f25167b + 1);
            p21 p21Var = (p21) h1Var.getViewPages()[1];
            if (p21Var != null) {
                org.telegram.ui.Components.a71 a71Var = p21Var.f39924f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    p21Var.f39922b = null;
                    p21Var.f39923c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    p21Var.d = null;
                    a71Var.W2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    p21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    p21Var.f39922b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    p21Var.f39923c = null;
                    p21Var.d = null;
                    a71Var.W2.N(false);
                }
                if (charSequence != null) {
                    ai.n5 n5Var = p21Var.h;
                    ((TextView) n5Var.f1893c).setText(charSequence);
                    ((TextView) n5Var.f1893c).getText();
                    n5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (a71Var != null) {
                        a71Var.W2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!q21Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = q21Var.f40264r;
                String charSequence2 = charSequence.toString();
                int i10 = sn.Ic;
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
                    U.presentFragment(new sn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                m21 m21Var4 = q21Var.f40265s;
                if (m21Var4 != null) {
                    m21Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (m21Var = q21Var.f40265s) != null) {
                m21Var.a();
            }
            q21Var.dismiss();
        }
    }

    public static ViewGroup v(q21 q21Var) {
        return q21Var.containerView;
    }

    public final void P(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f40260b.getViewPages();
        View view = viewPages[0];
        if (view instanceof p21) {
            ((p21) view).a(0);
            this.containerView.post(new lv0(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof p21) {
            ((p21) view2).a(1);
        }
    }

    public final void Q(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f40260b.getViewPages();
        View view = viewPages[0];
        if (view instanceof p21) {
            ((p21) view).a(0);
            this.containerView.post(new lv0(24, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof p21) {
            ((p21) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f40260b.getCurrentView();
        if (!(currentView instanceof p21)) {
            return true;
        }
        return !((p21) currentView).f39924f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        o21 o21Var;
        ei.h1 h1Var = this.f40260b;
        if ((h1Var.getCurrentView() instanceof p21) && (o21Var = ((p21) h1Var.getCurrentView()).f39925n) != null) {
            AndroidUtilities.hideKeyboard(o21Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.D(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public q21(boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, d6Var, true);
        Paint paint = new Paint(1);
        this.f40261c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f40262f = z12;
        this.f40263n = bArr;
        this.f40264r = j10;
        int i10 = org.telegram.ui.ActionBar.h6.f21057h5;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new l21(this, context);
        ei.h1 h1Var = new ei.h1(this, context, 6);
        this.f40260b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, w7.z5.e(-1, -1, 119));
        h1Var.setAdapter(new ai.i5(this, context, 2));
        if (arrayList == null && bArr == null) {
            if (z10) {
                P(null);
            } else {
                Q(null);
            }
        }
    }
}

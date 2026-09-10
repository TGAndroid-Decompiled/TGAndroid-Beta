package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
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
public final class h41 extends org.telegram.ui.ActionBar.h3 {
    public static final int v = 0;
    public final bi.p1 f33269b;
    public final Paint f33270c;
    public final boolean d;
    public final boolean e;
    public final boolean f33271f;
    public final ArrayList h;
    public final byte[] f33272n;
    public final long f33273r;
    public d41 f33274s;

    public h41(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, byte[] bArr) {
        this(true, context, f6Var, j3, false, false, null, bArr);
    }

    public static void H(h41 h41Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = h41Var.f33273r;
        ArrayList arrayList = h41Var.h;
        if (h41Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = h41Var.f33272n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (h41Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(h41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.f17447id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (h41Var.f33271f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(h41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f17415id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(h41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.f17299id.addAll(arrayList);
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
        ConnectionsManager.getInstance(h41Var.currentAccount).sendRequest(r02, new bi.l9(h41Var, charSequence, bArr, str, 11));
    }

    public static void K(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.wc wcVar, final org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.f17447id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z11) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f17415id = ((Integer) arrayList.get(0)).intValue();
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
                        h41.m(context, f6Var, z10, z11, j3, arrayList, zArr, callback, wcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.f17299id.addAll(arrayList);
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
                    h41.m(context, f6Var, z10, z11, j3, arrayList, zArr, callback, wcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void L(long j3, org.telegram.ui.ActionBar.p2 p2Var) {
        int currentAccount = p2Var.getCurrentAccount();
        Context context = p2Var.getContext();
        if (context == null) {
            return;
        }
        K(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M(eo eoVar, MessageObject messageObject) {
        int id2;
        int currentAccount = eoVar.getCurrentAccount();
        Activity parentActivity = eoVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        K(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.wc.a0(eoVar), eoVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(eo eoVar, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        int currentAccount = eoVar.getCurrentAccount();
        Activity parentActivity = eoVar.getParentActivity();
        long a2 = eoVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new di.e1(parentActivity, f6Var, a2, bArr, eoVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new s31(zArr, callback, 0), 200L);
            return;
        }
        h41 h41Var = new h41(false, context, f6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            h41Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = h41Var.f33269b.getViewPages();
            View view = viewPages[0];
            if (view instanceof g41) {
                ((g41) view).a(0);
                h41Var.containerView.post(new ey0(20, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof g41) {
                ((g41) view2).a(1);
            }
        }
        h41Var.f33274s = new y31(zArr, callback, wcVar);
        h41Var.setOnDismissListener(new s31(zArr, callback, 1));
        h41Var.show();
    }

    public static void n(h41 h41Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        d41 d41Var;
        d41 d41Var2;
        bi.d dVar;
        bi.p1 p1Var = h41Var.f33269b;
        if ((p1Var.getCurrentView() instanceof g41) && (dVar = ((g41) p1Var.getCurrentView()).f32994s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(h41Var.currentAccount).disableAds(false);
                    d41 d41Var3 = h41Var.f33274s;
                    if (d41Var3 != null) {
                        d41Var3.b();
                        h41Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (d41Var2 = h41Var.f33274s) != null) {
                    d41Var2.a();
                    h41Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            p1Var.D(p1Var.f27886b + 1);
            g41 g41Var = (g41) p1Var.getViewPages()[1];
            if (g41Var != null) {
                org.telegram.ui.Components.r61 r61Var = g41Var.f32991f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    g41Var.f32989b = null;
                    g41Var.f32990c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    g41Var.d = null;
                    r61Var.Y2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    g41Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    g41Var.f32989b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    g41Var.f32990c = null;
                    g41Var.d = null;
                    r61Var.Y2.N(false);
                }
                if (charSequence != null) {
                    u5 u5Var = g41Var.h;
                    ((TextView) u5Var.d).setText(charSequence);
                    ((TextView) u5Var.d).getText();
                    u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (r61Var != null) {
                        r61Var.Y2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!h41Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j3 = h41Var.f33273r;
                String charSequence2 = charSequence.toString();
                int i10 = eo.Hc;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    Bundle bundle = new Bundle();
                    if (DialogObject.isUserDialog(j3)) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    bundle.putString("reportTitle", charSequence2);
                    bundle.putByteArray("reportOption", bArr);
                    bundle.putString("reportMessage", str);
                    U.presentFragment(new eo(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                d41 d41Var4 = h41Var.f33274s;
                if (d41Var4 != null) {
                    d41Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (d41Var = h41Var.f33274s) != null) {
                d41Var.a();
            }
            h41Var.dismiss();
        }
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f33269b.getViewPages();
        View view = viewPages[0];
        if (view instanceof g41) {
            ((g41) view).a(0);
            this.containerView.post(new ey0(19, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof g41) {
            ((g41) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f33269b.getViewPages();
        View view = viewPages[0];
        if (view instanceof g41) {
            ((g41) view).a(0);
            this.containerView.post(new ey0(21, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof g41) {
            ((g41) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f33269b.getCurrentView();
        if (!(currentView instanceof g41)) {
            return true;
        }
        return !((g41) currentView).f32991f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        f41 f41Var;
        bi.p1 p1Var = this.f33269b;
        if ((p1Var.getCurrentView() instanceof g41) && (f41Var = ((g41) p1Var.getCurrentView()).f32992n) != null) {
            AndroidUtilities.hideKeyboard(f41Var);
        }
        if (p1Var.getCurrentPosition() > 0) {
            p1Var.D(p1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public h41(boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, f6Var, true);
        Paint paint = new Paint(1);
        this.f33270c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f33271f = z12;
        this.f33272n = bArr;
        this.f33273r = j3;
        int i10 = org.telegram.ui.ActionBar.j6.f17998h5;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new c41(this, context);
        bi.p1 p1Var = new bi.p1(this, context, 6);
        this.f33269b = p1Var;
        int i11 = this.backgroundPaddingLeft;
        p1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(p1Var, w7.a6.e(-1, -1, 119));
        p1Var.setAdapter(new kw0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}

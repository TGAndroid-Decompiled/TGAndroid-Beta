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
public final class c41 extends org.telegram.ui.ActionBar.f3 {
    public static final int v = 0;
    public final ci.i1 f32636b;
    public final Paint f32637c;
    public final boolean d;
    public final boolean e;
    public final boolean f32638f;
    public final ArrayList h;
    public final byte[] f32639n;
    public final long f32640r;
    public y31 f32641s;

    public c41(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, byte[] bArr) {
        this(true, context, f6Var, j3, false, false, null, bArr);
    }

    public static void G(c41 c41Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = c41Var.f32640r;
        ArrayList arrayList = c41Var.h;
        if (c41Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = c41Var.f32639n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (c41Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(c41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.f18590id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (c41Var.f32638f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(c41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f18558id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(c41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.f18447id.addAll(arrayList);
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
        ConnectionsManager.getInstance(c41Var.currentAccount).sendRequest(r02, new ai.p3(c41Var, charSequence, bArr, str, 12));
    }

    public static void K(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.xc xcVar, final org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.f18590id.addAll(arrayList);
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
                    tL_reportMessage.f18558id = ((Integer) arrayList.get(0)).intValue();
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
                        c41.m(context, f6Var, z10, z11, j3, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.f18447id.addAll(arrayList);
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
                    c41.m(context, f6Var, z10, z11, j3, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void L(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        int currentAccount = n2Var.getCurrentAccount();
        Context context = n2Var.getContext();
        if (context == null) {
            return;
        }
        K(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M(zn znVar, MessageObject messageObject) {
        int id2;
        int currentAccount = znVar.getCurrentAccount();
        Activity parentActivity = znVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        K(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.xc.a0(znVar), znVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(zn znVar, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        int currentAccount = znVar.getCurrentAccount();
        Activity parentActivity = znVar.getParentActivity();
        long a2 = znVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ei.b1(parentActivity, f6Var, a2, bArr, znVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new n31(zArr, callback, 0), 200L);
            return;
        }
        c41 c41Var = new c41(false, context, f6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            c41Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = c41Var.f32636b.getViewPages();
            View view = viewPages[0];
            if (view instanceof b41) {
                ((b41) view).a(0);
                c41Var.containerView.post(new rx0(23, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof b41) {
                ((b41) view2).a(1);
            }
        }
        c41Var.f32641s = new t31(zArr, callback, xcVar);
        c41Var.setOnDismissListener(new n31(zArr, callback, 1));
        c41Var.show();
    }

    public static void n(c41 c41Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        y31 y31Var;
        y31 y31Var2;
        ci.d dVar;
        ci.i1 i1Var = c41Var.f32636b;
        if ((i1Var.getCurrentView() instanceof b41) && (dVar = ((b41) i1Var.getCurrentView()).f32275s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(c41Var.currentAccount).disableAds(false);
                    y31 y31Var3 = c41Var.f32641s;
                    if (y31Var3 != null) {
                        y31Var3.b();
                        c41Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (y31Var2 = c41Var.f32641s) != null) {
                    y31Var2.a();
                    c41Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            i1Var.E(i1Var.f30849b + 1);
            b41 b41Var = (b41) i1Var.getViewPages()[1];
            if (b41Var != null) {
                org.telegram.ui.Components.u61 u61Var = b41Var.f32272f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    b41Var.f32270b = null;
                    b41Var.f32271c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    b41Var.d = null;
                    u61Var.Y2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    b41Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    b41Var.f32270b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    b41Var.f32271c = null;
                    b41Var.d = null;
                    u61Var.Y2.N(false);
                }
                if (charSequence != null) {
                    t5 t5Var = b41Var.h;
                    ((TextView) t5Var.d).setText(charSequence);
                    ((TextView) t5Var.d).getText();
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (u61Var != null) {
                        u61Var.Y2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!c41Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j3 = c41Var.f32640r;
                String charSequence2 = charSequence.toString();
                int i10 = zn.Gc;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
                    U.presentFragment(new zn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                y31 y31Var4 = c41Var.f32641s;
                if (y31Var4 != null) {
                    y31Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (y31Var = c41Var.f32641s) != null) {
                y31Var.a();
            }
            c41Var.dismiss();
        }
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f32636b.getViewPages();
        View view = viewPages[0];
        if (view instanceof b41) {
            ((b41) view).a(0);
            this.containerView.post(new rx0(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof b41) {
            ((b41) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f32636b.getViewPages();
        View view = viewPages[0];
        if (view instanceof b41) {
            ((b41) view).a(0);
            this.containerView.post(new rx0(24, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof b41) {
            ((b41) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f32636b.getCurrentView();
        if (!(currentView instanceof b41)) {
            return true;
        }
        return !((b41) currentView).f32272f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        a41 a41Var;
        ci.i1 i1Var = this.f32636b;
        if ((i1Var.getCurrentView() instanceof b41) && (a41Var = ((b41) i1Var.getCurrentView()).f32273n) != null) {
            AndroidUtilities.hideKeyboard(a41Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.E(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public c41(boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, f6Var, true);
        Paint paint = new Paint(1);
        this.f32637c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f32638f = z12;
        this.f32639n = bArr;
        this.f32640r = j3;
        int i10 = org.telegram.ui.ActionBar.j6.f19180h5;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new x31(this, context);
        ci.i1 i1Var = new ci.i1(this, context, 6);
        this.f32636b = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(i1Var, w7.y5.e(-1, -1, 119));
        i1Var.setAdapter(new iw0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}

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
public final class b41 extends org.telegram.ui.ActionBar.f3 {
    public static final int v = 0;
    public final ci.i1 f32044b;
    public final Paint f32045c;
    public final boolean d;
    public final boolean e;
    public final boolean f32046f;
    public final ArrayList h;
    public final byte[] f32047n;
    public final long f32048r;
    public x31 f32049s;

    public b41(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, byte[] bArr) {
        this(true, context, e6Var, j3, false, false, null, bArr);
    }

    public static void H(b41 b41Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = b41Var.f32048r;
        ArrayList arrayList = b41Var.h;
        if (b41Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = b41Var.f32047n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (b41Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(b41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.f18360id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (b41Var.f32046f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(b41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f18328id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(b41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.f18216id.addAll(arrayList);
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
        ConnectionsManager.getInstance(b41Var.currentAccount).sendRequest(r02, new ai.p3(b41Var, charSequence, bArr, str, 12));
    }

    public static void K(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.vc vcVar, final org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.f18360id.addAll(arrayList);
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
                    tL_reportMessage.f18328id = ((Integer) arrayList.get(0)).intValue();
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
                        b41.m(context, e6Var, z10, z11, j3, arrayList, zArr, callback, vcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.f18216id.addAll(arrayList);
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
                    b41.m(context, e6Var, z10, z11, j3, arrayList, zArr, callback, vcVar, (TLRPC.ReportResult) obj);
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

    public static void M(bo boVar, MessageObject messageObject) {
        int id2;
        int currentAccount = boVar.getCurrentAccount();
        Activity parentActivity = boVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        K(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.vc.a0(boVar), boVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(bo boVar, MessageObject messageObject, org.telegram.ui.ActionBar.e6 e6Var) {
        int currentAccount = boVar.getCurrentAccount();
        Activity parentActivity = boVar.getParentActivity();
        long a2 = boVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ei.b1(parentActivity, e6Var, a2, bArr, boVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new m31(zArr, callback, 0), 200L);
            return;
        }
        b41 b41Var = new b41(false, context, e6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            b41Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = b41Var.f32044b.getViewPages();
            View view = viewPages[0];
            if (view instanceof a41) {
                ((a41) view).a(0);
                b41Var.containerView.post(new iy0(17, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof a41) {
                ((a41) view2).a(1);
            }
        }
        b41Var.f32049s = new s31(zArr, callback, vcVar);
        b41Var.setOnDismissListener(new m31(zArr, callback, 1));
        b41Var.show();
    }

    public static void n(b41 b41Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        x31 x31Var;
        x31 x31Var2;
        ci.d dVar;
        ci.i1 i1Var = b41Var.f32044b;
        if ((i1Var.getCurrentView() instanceof a41) && (dVar = ((a41) i1Var.getCurrentView()).f31695s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(b41Var.currentAccount).disableAds(false);
                    x31 x31Var3 = b41Var.f32049s;
                    if (x31Var3 != null) {
                        x31Var3.b();
                        b41Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (x31Var2 = b41Var.f32049s) != null) {
                    x31Var2.a();
                    b41Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            i1Var.D(i1Var.f24957b + 1);
            a41 a41Var = (a41) i1Var.getViewPages()[1];
            if (a41Var != null) {
                org.telegram.ui.Components.e61 e61Var = a41Var.f31692f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    a41Var.f31690b = null;
                    a41Var.f31691c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    a41Var.d = null;
                    e61Var.Y2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    a41Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    a41Var.f31690b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    a41Var.f31691c = null;
                    a41Var.d = null;
                    e61Var.Y2.N(false);
                }
                if (charSequence != null) {
                    t5 t5Var = a41Var.h;
                    ((TextView) t5Var.d).setText(charSequence);
                    ((TextView) t5Var.d).getText();
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (e61Var != null) {
                        e61Var.Y2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!b41Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j3 = b41Var.f32048r;
                String charSequence2 = charSequence.toString();
                int i10 = bo.Hc;
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
                    U.presentFragment(new bo(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                x31 x31Var4 = b41Var.f32049s;
                if (x31Var4 != null) {
                    x31Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (x31Var = b41Var.f32049s) != null) {
                x31Var.a();
            }
            b41Var.dismiss();
        }
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f32044b.getViewPages();
        View view = viewPages[0];
        if (view instanceof a41) {
            ((a41) view).a(0);
            this.containerView.post(new iy0(16, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof a41) {
            ((a41) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f32044b.getViewPages();
        View view = viewPages[0];
        if (view instanceof a41) {
            ((a41) view).a(0);
            this.containerView.post(new iy0(18, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof a41) {
            ((a41) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f32044b.getCurrentView();
        if (!(currentView instanceof a41)) {
            return true;
        }
        return !((a41) currentView).f31692f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        z31 z31Var;
        ci.i1 i1Var = this.f32044b;
        if ((i1Var.getCurrentView() instanceof a41) && (z31Var = ((a41) i1Var.getCurrentView()).f31693n) != null) {
            AndroidUtilities.hideKeyboard(z31Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.D(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public b41(boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, e6Var, true);
        Paint paint = new Paint(1);
        this.f32045c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f32046f = z12;
        this.f32047n = bArr;
        this.f32048r = j3;
        int i10 = org.telegram.ui.ActionBar.i6.f18907h5;
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new w31(this, context);
        ci.i1 i1Var = new ci.i1(this, context, 6);
        this.f32044b = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(i1Var, w7.x5.e(-1, -1, 119));
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

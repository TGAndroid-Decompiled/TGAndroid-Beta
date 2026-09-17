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
public final class d41 extends org.telegram.ui.ActionBar.g3 {
    public static final int v = 0;
    public final ci.i1 f32995b;
    public final Paint f32996c;
    public final boolean d;
    public final boolean e;
    public final boolean f32997f;
    public final ArrayList h;
    public final byte[] f32998n;
    public final long f32999r;
    public z31 f33000s;

    public d41(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, byte[] bArr) {
        this(true, context, f6Var, j3, false, false, null, bArr);
    }

    public static void H(d41 d41Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = d41Var.f32999r;
        ArrayList arrayList = d41Var.h;
        if (d41Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = d41Var.f32998n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (d41Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(d41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.f18369id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (d41Var.f32997f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(d41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f18337id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(d41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.f18225id.addAll(arrayList);
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
        ConnectionsManager.getInstance(d41Var.currentAccount).sendRequest(r02, new ai.p3(d41Var, charSequence, bArr, str, 12));
    }

    public static void K(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.vc vcVar, final org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.f18369id.addAll(arrayList);
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
                    tL_reportMessage.f18337id = ((Integer) arrayList.get(0)).intValue();
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
                        d41.m(context, f6Var, z10, z11, j3, arrayList, zArr, callback, vcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.f18225id.addAll(arrayList);
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
                    d41.m(context, f6Var, z10, z11, j3, arrayList, zArr, callback, vcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void L(long j3, org.telegram.ui.ActionBar.o2 o2Var) {
        int currentAccount = o2Var.getCurrentAccount();
        Context context = o2Var.getContext();
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

    public static void N(bo boVar, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
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
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ei.b1(parentActivity, f6Var, a2, bArr, boVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new o31(zArr, callback, 0), 200L);
            return;
        }
        d41 d41Var = new d41(false, context, f6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            d41Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = d41Var.f32995b.getViewPages();
            View view = viewPages[0];
            if (view instanceof c41) {
                ((c41) view).a(0);
                d41Var.containerView.post(new ky0(17, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof c41) {
                ((c41) view2).a(1);
            }
        }
        d41Var.f33000s = new u31(zArr, callback, vcVar);
        d41Var.setOnDismissListener(new o31(zArr, callback, 1));
        d41Var.show();
    }

    public static void n(d41 d41Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        z31 z31Var;
        z31 z31Var2;
        ci.d dVar;
        ci.i1 i1Var = d41Var.f32995b;
        if ((i1Var.getCurrentView() instanceof c41) && (dVar = ((c41) i1Var.getCurrentView()).f32666s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(d41Var.currentAccount).disableAds(false);
                    z31 z31Var3 = d41Var.f33000s;
                    if (z31Var3 != null) {
                        z31Var3.b();
                        d41Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (z31Var2 = d41Var.f33000s) != null) {
                    z31Var2.a();
                    d41Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            i1Var.E(i1Var.f25179b + 1);
            c41 c41Var = (c41) i1Var.getViewPages()[1];
            if (c41Var != null) {
                org.telegram.ui.Components.f61 f61Var = c41Var.f32663f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    c41Var.f32661b = null;
                    c41Var.f32662c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    c41Var.d = null;
                    f61Var.Y2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    c41Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    c41Var.f32661b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    c41Var.f32662c = null;
                    c41Var.d = null;
                    f61Var.Y2.N(false);
                }
                if (charSequence != null) {
                    t5 t5Var = c41Var.h;
                    ((TextView) t5Var.d).setText(charSequence);
                    ((TextView) t5Var.d).getText();
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (f61Var != null) {
                        f61Var.Y2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!d41Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j3 = d41Var.f32999r;
                String charSequence2 = charSequence.toString();
                int i10 = bo.Hc;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
                z31 z31Var4 = d41Var.f33000s;
                if (z31Var4 != null) {
                    z31Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (z31Var = d41Var.f33000s) != null) {
                z31Var.a();
            }
            d41Var.dismiss();
        }
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f32995b.getViewPages();
        View view = viewPages[0];
        if (view instanceof c41) {
            ((c41) view).a(0);
            this.containerView.post(new ky0(16, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof c41) {
            ((c41) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f32995b.getViewPages();
        View view = viewPages[0];
        if (view instanceof c41) {
            ((c41) view).a(0);
            this.containerView.post(new ky0(18, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof c41) {
            ((c41) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f32995b.getCurrentView();
        if (!(currentView instanceof c41)) {
            return true;
        }
        return !((c41) currentView).f32663f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        b41 b41Var;
        ci.i1 i1Var = this.f32995b;
        if ((i1Var.getCurrentView() instanceof c41) && (b41Var = ((c41) i1Var.getCurrentView()).f32664n) != null) {
            AndroidUtilities.hideKeyboard(b41Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.E(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public d41(boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, f6Var, true);
        Paint paint = new Paint(1);
        this.f32996c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f32997f = z12;
        this.f32998n = bArr;
        this.f32999r = j3;
        int i10 = org.telegram.ui.ActionBar.j6.f18933h5;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new y31(this, context);
        ci.i1 i1Var = new ci.i1(this, context, 6);
        this.f32995b = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(i1Var, w7.x5.e(-1, -1, 119));
        i1Var.setAdapter(new kw0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}

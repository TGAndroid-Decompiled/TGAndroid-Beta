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
public final class e41 extends org.telegram.ui.ActionBar.f3 {
    public static final int v = 0;
    public final di.i1 f35951b;
    public final Paint f35952c;
    public final boolean d;
    public final boolean f35953e;
    public final boolean f35954f;
    public final ArrayList h;
    public final byte[] f35955n;
    public final long f35956r;
    public a41 f35957s;

    public e41(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, byte[] bArr) {
        this(true, context, f6Var, j3, false, false, null, bArr);
    }

    public static void H(e41 e41Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = e41Var.f35956r;
        ArrayList arrayList = e41Var.h;
        if (e41Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = e41Var.f35955n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (e41Var.f35953e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(e41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.f20146id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (e41Var.f35954f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(e41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f20114id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(e41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.f20000id.addAll(arrayList);
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
        ConnectionsManager.getInstance(e41Var.currentAccount).sendRequest(r02, new bi.c3(e41Var, charSequence, bArr, str, 12));
    }

    public static void K(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.yc ycVar, final org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.f20146id.addAll(arrayList);
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
                    tL_reportMessage.f20114id = ((Integer) arrayList.get(0)).intValue();
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
                        e41.m(context, f6Var, z10, z11, j3, arrayList, zArr, callback, ycVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.f20000id.addAll(arrayList);
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
                    e41.m(context, f6Var, z10, z11, j3, arrayList, zArr, callback, ycVar, (TLRPC.ReportResult) obj);
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

    public static void M(co coVar, MessageObject messageObject) {
        int id2;
        int currentAccount = coVar.getCurrentAccount();
        Activity parentActivity = coVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        K(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.yc.a0(coVar), coVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(co coVar, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        int currentAccount = coVar.getCurrentAccount();
        Activity parentActivity = coVar.getParentActivity();
        long a2 = coVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new fi.b1(parentActivity, f6Var, a2, bArr, coVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new o31(zArr, callback, 0), 200L);
            return;
        }
        e41 e41Var = new e41(false, context, f6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            e41Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = e41Var.f35951b.getViewPages();
            View view = viewPages[0];
            if (view instanceof d41) {
                ((d41) view).a(0);
                e41Var.containerView.post(new rx0(23, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof d41) {
                ((d41) view2).a(1);
            }
        }
        e41Var.f35957s = new v31(zArr, callback, ycVar);
        e41Var.setOnDismissListener(new o31(zArr, callback, 1));
        e41Var.show();
    }

    public static void n(e41 e41Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        a41 a41Var;
        a41 a41Var2;
        di.d dVar;
        di.i1 i1Var = e41Var.f35951b;
        if ((i1Var.getCurrentView() instanceof d41) && (dVar = ((d41) i1Var.getCurrentView()).f35679s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(e41Var.currentAccount).disableAds(false);
                    a41 a41Var3 = e41Var.f35957s;
                    if (a41Var3 != null) {
                        a41Var3.b();
                        e41Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (a41Var2 = e41Var.f35957s) != null) {
                    a41Var2.a();
                    e41Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            i1Var.D(i1Var.f27042b + 1);
            d41 d41Var = (d41) i1Var.getViewPages()[1];
            if (d41Var != null) {
                org.telegram.ui.Components.d61 d61Var = d41Var.f35676f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    d41Var.f35673b = null;
                    d41Var.f35674c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    d41Var.d = null;
                    d61Var.Y2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    d41Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    d41Var.f35673b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    d41Var.f35674c = null;
                    d41Var.d = null;
                    d61Var.Y2.N(false);
                }
                if (charSequence != null) {
                    t5 t5Var = d41Var.h;
                    ((TextView) t5Var.d).setText(charSequence);
                    ((TextView) t5Var.d).getText();
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (d61Var != null) {
                        d61Var.Y2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!e41Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j3 = e41Var.f35956r;
                String charSequence2 = charSequence.toString();
                int i10 = co.Hc;
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
                    U.presentFragment(new co(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                a41 a41Var4 = e41Var.f35957s;
                if (a41Var4 != null) {
                    a41Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (a41Var = e41Var.f35957s) != null) {
                a41Var.a();
            }
            e41Var.dismiss();
        }
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f35951b.getViewPages();
        View view = viewPages[0];
        if (view instanceof d41) {
            ((d41) view).a(0);
            this.containerView.post(new rx0(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof d41) {
            ((d41) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f35951b.getViewPages();
        View view = viewPages[0];
        if (view instanceof d41) {
            ((d41) view).a(0);
            this.containerView.post(new rx0(24, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof d41) {
            ((d41) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f35951b.getCurrentView();
        if (!(currentView instanceof d41)) {
            return true;
        }
        return !((d41) currentView).f35676f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        c41 c41Var;
        di.i1 i1Var = this.f35951b;
        if ((i1Var.getCurrentView() instanceof d41) && (c41Var = ((d41) i1Var.getCurrentView()).f35677n) != null) {
            AndroidUtilities.hideKeyboard(c41Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.D(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public e41(boolean z10, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, f6Var, true);
        Paint paint = new Paint(1);
        this.f35952c = paint;
        this.d = z10;
        this.h = arrayList;
        this.f35953e = z11;
        this.f35954f = z12;
        this.f35955n = bArr;
        this.f35956r = j3;
        int i10 = org.telegram.ui.ActionBar.j6.f20761h5;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new z31(this, context);
        di.i1 i1Var = new di.i1(this, context, 6);
        this.f35951b = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(i1Var, w7.x5.e(-1, -1, 119));
        i1Var.setAdapter(new hw0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}

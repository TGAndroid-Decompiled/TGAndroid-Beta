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
public final class e41 extends org.telegram.ui.ActionBar.e3 {
    public static final int v = 0;
    public final ci.h1 f36976b;
    public final Paint f36977c;
    public final boolean d;
    public final boolean f36978e;
    public final boolean f36979f;
    public final ArrayList h;
    public final byte[] f36980n;
    public final long f36981r;
    public a41 f36982s;

    public e41(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, byte[] bArr) {
        this(true, context, c6Var, j3, false, false, null, bArr);
    }

    public static void I(e41 e41Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = e41Var.f36981r;
        ArrayList arrayList = e41Var.h;
        if (e41Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = e41Var.f36980n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (e41Var.f36978e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(e41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.f20054id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (e41Var.f36979f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(e41Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f20022id = ((Integer) arrayList.get(0)).intValue();
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
                    tL_messages_report2.f19907id.addAll(arrayList);
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
        ConnectionsManager.getInstance(e41Var.currentAccount).sendRequest(r02, new ai.q3(e41Var, charSequence, bArr, str, 12));
    }

    public static void L(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.zc zcVar, final org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.f20054id.addAll(arrayList);
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
                    tL_reportMessage.f20022id = ((Integer) arrayList.get(0)).intValue();
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
                        e41.o(context, c6Var, z10, z11, j3, arrayList, zArr, callback, zcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.f19907id.addAll(arrayList);
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
                    e41.o(context, c6Var, z10, z11, j3, arrayList, zArr, callback, zcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void M(long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        int currentAccount = m2Var.getCurrentAccount();
        Context context = m2Var.getContext();
        if (context == null) {
            return;
        }
        L(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void N(eo eoVar, MessageObject messageObject) {
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
        L(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.zc.a0(eoVar), eoVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void O(eo eoVar, MessageObject messageObject, org.telegram.ui.ActionBar.c6 c6Var) {
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
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ei.b1(parentActivity, c6Var, a2, bArr, eoVar, messageObject, currentAccount));
    }

    public static void o(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.zc zcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new o31(0, callback, zArr), 200L);
            return;
        }
        e41 e41Var = new e41(false, context, c6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            e41Var.Q((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = e41Var.f36976b.getViewPages();
            View view = viewPages[0];
            if (view instanceof d41) {
                ((d41) view).a(0);
                e41Var.containerView.post(new du0(29, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof d41) {
                ((d41) view2).a(1);
            }
        }
        e41Var.f36982s = new v31(zArr, callback, zcVar);
        e41Var.setOnDismissListener(new o31(1, callback, zArr));
        e41Var.show();
    }

    public static void p(e41 e41Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        a41 a41Var;
        a41 a41Var2;
        ci.d dVar;
        ci.h1 h1Var = e41Var.f36976b;
        if ((h1Var.getCurrentView() instanceof d41) && (dVar = ((d41) h1Var.getCurrentView()).f36647s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(e41Var.currentAccount).disableAds(false);
                    a41 a41Var3 = e41Var.f36982s;
                    if (a41Var3 != null) {
                        a41Var3.b();
                        e41Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (a41Var2 = e41Var.f36982s) != null) {
                    a41Var2.a();
                    e41Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            h1Var.D(h1Var.f31107b + 1);
            d41 d41Var = (d41) h1Var.getViewPages()[1];
            if (d41Var != null) {
                org.telegram.ui.Components.p71 p71Var = d41Var.f36644f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    d41Var.f36641b = null;
                    d41Var.f36642c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    d41Var.d = null;
                    p71Var.W2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    d41Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    d41Var.f36641b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    d41Var.f36642c = null;
                    d41Var.d = null;
                    p71Var.W2.N(false);
                }
                if (charSequence != null) {
                    w5 w5Var = d41Var.h;
                    ((TextView) w5Var.d).setText(charSequence);
                    ((TextView) w5Var.d).getText();
                    w5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (p71Var != null) {
                        p71Var.W2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!e41Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j3 = e41Var.f36981r;
                String charSequence2 = charSequence.toString();
                int i10 = eo.Hc;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
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
                a41 a41Var4 = e41Var.f36982s;
                if (a41Var4 != null) {
                    a41Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (a41Var = e41Var.f36982s) != null) {
                a41Var.a();
            }
            e41Var.dismiss();
        }
    }

    public final void P(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f36976b.getViewPages();
        View view = viewPages[0];
        if (view instanceof d41) {
            ((d41) view).a(0);
            this.containerView.post(new du0(28, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof d41) {
            ((d41) view2).a(1);
        }
    }

    public final void Q(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f36976b.getViewPages();
        View view = viewPages[0];
        if (view instanceof d41) {
            ((d41) view).a(0);
            this.containerView.post(new u31(0, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof d41) {
            ((d41) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f36976b.getCurrentView();
        if (!(currentView instanceof d41)) {
            return true;
        }
        return !((d41) currentView).f36644f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        c41 c41Var;
        ci.h1 h1Var = this.f36976b;
        if ((h1Var.getCurrentView() instanceof d41) && (c41Var = ((d41) h1Var.getCurrentView()).f36645n) != null) {
            AndroidUtilities.hideKeyboard(c41Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.D(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public e41(boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, c6Var, true);
        Paint paint = new Paint(1);
        this.f36977c = paint;
        this.d = z10;
        this.h = arrayList;
        this.f36978e = z11;
        this.f36979f = z12;
        this.f36980n = bArr;
        this.f36981r = j3;
        int i10 = org.telegram.ui.ActionBar.h6.f20631h5;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new z31(this, context);
        ci.h1 h1Var = new ci.h1(this, context, 6);
        this.f36976b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, w7.w5.e(-1, -1, 119));
        h1Var.setAdapter(new kw0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                P(null);
            } else {
                Q(null);
            }
        }
    }
}

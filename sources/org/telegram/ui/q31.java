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
public final class q31 extends org.telegram.ui.ActionBar.g3 {
    public static final int v = 0;
    public final gk f37288b;
    public final Paint f37289c;
    public final boolean d;
    public final boolean e;
    public final boolean f37290f;
    public final ArrayList h;
    public final byte[] f37291n;
    public final long f37292r;
    public m31 f37293s;

    public q31(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, byte[] bArr) {
        this(true, context, f6Var, j10, false, false, null, bArr);
    }

    public static void G(q31 q31Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = q31Var.f37292r;
        ArrayList arrayList = q31Var.h;
        if (q31Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = q31Var.f37291n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (q31Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(q31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f19406id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (q31Var.f37290f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(q31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f19374id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(q31Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f19263id.addAll(arrayList);
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
        ConnectionsManager.getInstance(q31Var.currentAccount).sendRequest(r02, new kh.b1(q31Var, charSequence, bArr, str, 15));
    }

    public static void J(int i10, final Context context, final long j10, final boolean z4, final boolean z10, final ArrayList arrayList, final org.telegram.ui.Components.qc qcVar, final org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z4) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.f19406id.addAll(arrayList);
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
                    tL_reportMessage.f19374id = ((Integer) arrayList.get(0)).intValue();
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
                        q31.m(context, f6Var, z4, z10, j10, arrayList, zArr, callback, qcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f19263id.addAll(arrayList);
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
                    q31.m(context, f6Var, z4, z10, j10, arrayList, zArr, callback, qcVar, (TLRPC.ReportResult) obj);
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
        J(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.qc.a0(znVar), znVar.getResourceProvider(), new byte[0], null, null);
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
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new z20(parentActivity, f6Var, a2, bArr, znVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.qc qcVar, TLRPC.ReportResult reportResult) {
        boolean z11 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z11 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new lh.l6(zArr, callback, 1), 200L);
            return;
        }
        q31 q31Var = new q31(false, context, f6Var, j10, z4, z10, arrayList, null);
        if (z11) {
            q31Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = q31Var.f37288b.getViewPages();
            View view = viewPages[0];
            if (view instanceof p31) {
                ((p31) view).a(0);
                q31Var.containerView.post(new b11(4, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof p31) {
                ((p31) view2).a(1);
            }
        }
        q31Var.f37293s = new h31(zArr, callback, qcVar);
        q31Var.setOnDismissListener(new lh.l6(zArr, callback, 2));
        q31Var.show();
    }

    public static void n(q31 q31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        m31 m31Var;
        m31 m31Var2;
        ph.d dVar;
        gk gkVar = q31Var.f37288b;
        if ((gkVar.getCurrentView() instanceof p31) && (dVar = ((p31) gkVar.getCurrentView()).f36935s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z4 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z4 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(q31Var.currentAccount).disableAds(false);
                    m31 m31Var3 = q31Var.f37293s;
                    if (m31Var3 != null) {
                        m31Var3.b();
                        q31Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (m31Var2 = q31Var.f37293s) != null) {
                    m31Var2.a();
                    q31Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            gkVar.D(gkVar.f26617b + 1);
            p31 p31Var = (p31) gkVar.getViewPages()[1];
            if (p31Var != null) {
                org.telegram.ui.Components.g61 g61Var = p31Var.f36932f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    p31Var.f36930b = null;
                    p31Var.f36931c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    p31Var.d = null;
                    g61Var.V2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    p31Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z4) {
                    p31Var.f36930b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    p31Var.f36931c = null;
                    p31Var.d = null;
                    g61Var.V2.N(false);
                }
                if (charSequence != null) {
                    dg.s1 s1Var = p31Var.h;
                    ((TextView) s1Var.f4788c).setText(charSequence);
                    ((TextView) s1Var.f4788c).getText();
                    s1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (g61Var != null) {
                        g61Var.V2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!q31Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = q31Var.f37292r;
                String charSequence2 = charSequence.toString();
                int i10 = zn.Ec;
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
                    U.presentFragment(new zn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                m31 m31Var4 = q31Var.f37293s;
                if (m31Var4 != null) {
                    m31Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (m31Var = q31Var.f37293s) != null) {
                m31Var.a();
            }
            q31Var.dismiss();
        }
    }

    public static ViewGroup t(q31 q31Var) {
        return q31Var.containerView;
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f37288b.getViewPages();
        View view = viewPages[0];
        if (view instanceof p31) {
            ((p31) view).a(0);
            this.containerView.post(new b11(3, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof p31) {
            ((p31) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f37288b.getViewPages();
        View view = viewPages[0];
        if (view instanceof p31) {
            ((p31) view).a(0);
            this.containerView.post(new b11(5, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof p31) {
            ((p31) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f37288b.getCurrentView();
        if (!(currentView instanceof p31)) {
            return true;
        }
        return !((p31) currentView).f36932f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        o31 o31Var;
        gk gkVar = this.f37288b;
        if ((gkVar.getCurrentView() instanceof p31) && (o31Var = ((p31) gkVar.getCurrentView()).f36933n) != null) {
            AndroidUtilities.hideKeyboard(o31Var);
        }
        if (gkVar.getCurrentPosition() > 0) {
            gkVar.D(gkVar.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public q31(boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, boolean z10, boolean z11, ArrayList arrayList, byte[] bArr) {
        super(context, f6Var, true, false);
        Paint paint = new Paint(1);
        this.f37289c = paint;
        this.d = z4;
        this.h = arrayList;
        this.e = z10;
        this.f37290f = z11;
        this.f37291n = bArr;
        this.f37292r = j10;
        int i10 = org.telegram.ui.ActionBar.j6.f19952h5;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new l31(this, context);
        gk gkVar = new gk(this, context, 3);
        this.f37288b = gkVar;
        int i11 = this.backgroundPaddingLeft;
        gkVar.setPadding(i11, 0, i11, 0);
        this.containerView.addView(gkVar, k7.b6.e(-1, -1, 119));
        gkVar.setAdapter(new gg.u(this, context, 3));
        if (arrayList == null && bArr == null) {
            if (z4) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}

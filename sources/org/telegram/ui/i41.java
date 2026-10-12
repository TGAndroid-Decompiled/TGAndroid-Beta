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
public final class i41 extends org.telegram.ui.ActionBar.e3 {
    public static final int v = 0;
    public final di.h1 f37030b;
    public final Paint f37031c;
    public final boolean d;
    public final boolean e;
    public final boolean f37032f;
    public final ArrayList h;
    public final byte[] f37033n;
    public final long f37034r;
    public e41 f37035s;

    public i41(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, byte[] bArr) {
        this(true, context, c6Var, j10, false, false, null, bArr);
    }

    public static void I(i41 i41Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = i41Var.f37034r;
        ArrayList arrayList = i41Var.h;
        if (i41Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = i41Var.f37033n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (i41Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i41Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f19463id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (i41Var.f37032f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(i41Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f19431id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(i41Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f19320id.addAll(arrayList);
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
        ConnectionsManager.getInstance(i41Var.currentAccount).sendRequest(r02, new bi.f3(i41Var, charSequence, bArr, str, 12));
    }

    public static void L(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.zc zcVar, final org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.f19463id.addAll(arrayList);
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
                    tL_reportMessage.f19431id = ((Integer) arrayList.get(0)).intValue();
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
                        i41.n(context, c6Var, z10, z11, j10, arrayList, zArr, callback, zcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f19320id.addAll(arrayList);
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
                    i41.n(context, c6Var, z10, z11, j10, arrayList, zArr, callback, zcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void M(long j10, org.telegram.ui.ActionBar.m2 m2Var) {
        int currentAccount = m2Var.getCurrentAccount();
        Context context = m2Var.getContext();
        if (context == null) {
            return;
        }
        L(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void N(fo foVar, MessageObject messageObject) {
        int id2;
        int currentAccount = foVar.getCurrentAccount();
        Activity parentActivity = foVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        L(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.zc.a0(foVar), foVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void O(fo foVar, MessageObject messageObject, org.telegram.ui.ActionBar.c6 c6Var) {
        int currentAccount = foVar.getCurrentAccount();
        Activity parentActivity = foVar.getParentActivity();
        long a2 = foVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new fi.a1(parentActivity, c6Var, a2, bArr, foVar, messageObject, currentAccount));
    }

    public static void n(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.zc zcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new t31(0, callback, zArr), 200L);
            return;
        }
        i41 i41Var = new i41(false, context, c6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            i41Var.Q((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = i41Var.f37030b.getViewPages();
            View view = viewPages[0];
            if (view instanceof h41) {
                ((h41) view).a(0);
                i41Var.containerView.post(new hz0(12, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof h41) {
                ((h41) view2).a(1);
            }
        }
        i41Var.f37035s = new z31(zArr, callback, zcVar);
        i41Var.setOnDismissListener(new t31(1, callback, zArr));
        i41Var.show();
    }

    public static void o(i41 i41Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        e41 e41Var;
        e41 e41Var2;
        di.d dVar;
        di.h1 h1Var = i41Var.f37030b;
        if ((h1Var.getCurrentView() instanceof h41) && (dVar = ((h41) h1Var.getCurrentView()).f36605s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(i41Var.currentAccount).disableAds(false);
                    e41 e41Var3 = i41Var.f37035s;
                    if (e41Var3 != null) {
                        e41Var3.b();
                        i41Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (e41Var2 = i41Var.f37035s) != null) {
                    e41Var2.a();
                    i41Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            h1Var.D(h1Var.f26640b + 1);
            h41 h41Var = (h41) h1Var.getViewPages()[1];
            if (h41Var != null) {
                org.telegram.ui.Components.h71 h71Var = h41Var.f36602f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    h41Var.f36600b = null;
                    h41Var.f36601c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    h41Var.d = null;
                    h71Var.W2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    h41Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    h41Var.f36600b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    h41Var.f36601c = null;
                    h41Var.d = null;
                    h71Var.W2.N(false);
                }
                if (charSequence != null) {
                    x5 x5Var = h41Var.h;
                    ((TextView) x5Var.d).setText(charSequence);
                    ((TextView) x5Var.d).getText();
                    x5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (h71Var != null) {
                        h71Var.W2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!i41Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = i41Var.f37034r;
                String charSequence2 = charSequence.toString();
                int i10 = fo.Hc;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
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
                    U.presentFragment(new fo(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                e41 e41Var4 = i41Var.f37035s;
                if (e41Var4 != null) {
                    e41Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (e41Var = i41Var.f37035s) != null) {
                e41Var.a();
            }
            i41Var.dismiss();
        }
    }

    public final void P(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f37030b.getViewPages();
        View view = viewPages[0];
        if (view instanceof h41) {
            ((h41) view).a(0);
            this.containerView.post(new hz0(11, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof h41) {
            ((h41) view2).a(1);
        }
    }

    public final void Q(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f37030b.getViewPages();
        View view = viewPages[0];
        if (view instanceof h41) {
            ((h41) view).a(0);
            this.containerView.post(new hz0(13, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof h41) {
            ((h41) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f37030b.getCurrentView();
        if (!(currentView instanceof h41)) {
            return true;
        }
        return !((h41) currentView).f36602f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        g41 g41Var;
        di.h1 h1Var = this.f37030b;
        if ((h1Var.getCurrentView() instanceof h41) && (g41Var = ((h41) h1Var.getCurrentView()).f36603n) != null) {
            AndroidUtilities.hideKeyboard(g41Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.D(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public i41(boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, c6Var, true);
        Paint paint = new Paint(1);
        this.f37031c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f37032f = z12;
        this.f37033n = bArr;
        this.f37034r = j10;
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new d41(this, context);
        di.h1 h1Var = new di.h1(this, context, 6);
        this.f37030b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, w7.a6.e(-1, -1, 119));
        h1Var.setAdapter(new ow0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                P(null);
            } else {
                Q(null);
            }
        }
    }
}

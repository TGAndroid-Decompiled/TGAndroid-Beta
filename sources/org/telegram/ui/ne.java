package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class ne implements View.OnClickListener {
    public final int f40785a;
    public final tn f40786b;

    public ne(tn tnVar, int i10) {
        this.f40785a = i10;
        this.f40786b = tnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f40785a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        tn tnVar = this.f40786b;
        switch (i11) {
            case 0:
                tn tnVar2 = this.f40786b;
                cg.v0.C1(tnVar2, tnVar2.f43051z1, tnVar2.A1, tnVar2.P5, false);
                return;
            case 1:
                tnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tnVar.f42947r);
                tnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (tnVar.G3 != null) {
                    tnVar.Lb(!tnVar.f42998uc.f49506f);
                    return;
                }
                return;
            case 3:
                tnVar.kb(!tnVar.f43013w0.J);
                return;
            case 4:
                wj wjVar = tnVar.E1;
                if (wjVar != null) {
                    wjVar.setReversed(true);
                    tnVar.E1.getAdapter().f47371g0 = true;
                    tnVar.m7();
                }
                tnVar.O2.setVisibility(8);
                tnVar.P2.setVisibility(8);
                tnVar.f42854j3 = true;
                tnVar.f42867k3 = null;
                tnVar.f42878l3 = null;
                tnVar.f42802f0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                tnVar.f42802f0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(tnVar.f42802f0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42802f0;
                w0Var.f23935r = null;
                ig.f fVar = w0Var.f23920e;
                if (fVar != null) {
                    fVar.setText("");
                    return;
                }
                return;
            case 5:
                if (tnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = tnVar.f42802f0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    tnVar.showDialog(org.telegram.ui.Components.c5.p(tnVar.getParentActivity(), new wk(tnVar), tnVar.f42746aa).f22729a);
                    return;
                }
                return;
            case 6:
                tnVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = tnVar.Z4;
                if (messageObject2 != null) {
                    tnVar.J9(messageObject2, false, false);
                    ye.d.r(tnVar.getParentActivity(), Uri.parse(tnVar.Z4.sponsoredUrl), true, false, false, null, null, false, tnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(tnVar.Z4.sponsoredInfo)) {
                    b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.f42746aa));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(tnVar.Z4.sponsoredAdditionalInfo)) {
                    b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.f42746aa));
                    return;
                }
                return;
            case 10:
                if (tnVar.T0 != null && tnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(tnVar.T0.getContext(), null, false, false);
                    Activity parentActivity = tnVar.getParentActivity();
                    rn rnVar = tnVar.f42746aa;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f9 = org.telegram.messenger.x3.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i13 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, rnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(parentActivity, rnVar);
                    y80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), rnVar));
                    y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, rnVar));
                    y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, rnVar));
                    y80Var.setTextSize(1, 14.0f);
                    y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y80Var.setOnLinkPressListener(new org.telegram.ui.Components.x80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                case 1:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                default:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.y80 y80Var2 = new org.telegram.ui.Components.y80(parentActivity, null);
                    y80Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), rnVar));
                    y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, rnVar));
                    y80Var2.setTextSize(1, 14.0f);
                    y80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y80Var2.setOnLinkPressListener(new org.telegram.ui.Components.x80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                case 1:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                default:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Components.y80 y80Var3 = new org.telegram.ui.Components.y80(parentActivity, null);
                    y80Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), rnVar));
                    y80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, rnVar));
                    y80Var3.setTextSize(1, 14.0f);
                    y80Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y80Var3.setOnLinkPressListener(new org.telegram.ui.Components.x80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (r2) {
                                case 0:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                case 1:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                                default:
                                    clickableSpan.onClick(frameLayout);
                                    return;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i14 = org.telegram.ui.ActionBar.g6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(i14, rnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    jk jkVar = new jk(parentActivity, paint);
                    jkVar.setOnClickListener(new f81(parentActivity));
                    jkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    jkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    jkVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, rnVar));
                    jkVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, rnVar)));
                    jkVar.setTextSize(1, 14.0f);
                    jkVar.setGravity(16);
                    org.telegram.ui.Components.y80 y80Var4 = new org.telegram.ui.Components.y80(parentActivity, null);
                    y80Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), rnVar));
                    y80Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, rnVar));
                    y80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(textView);
                    y80Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(y80Var, i7.f6.t(-1, -2, 0, 0, 18, 0, 0));
                    y80Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(y80Var2, i7.f6.t(-1, -2, 0, 0, 24, 0, 0));
                    y80Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(y80Var3, i7.f6.t(-1, -2, 0, 0, 24, 0, 0));
                    f9.addView(jkVar, i7.f6.t(-2, 34, 1, 22, 14, 22, 0));
                    y80Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f9.addView(y80Var4, i7.f6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f9);
                    frameLayout.addView(scrollView, i7.f6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    q6.customView = frameLayout;
                    q6.show();
                    return;
                }
                return;
            case 11:
                tnVar.finishPreviewFragment();
                return;
            case 12:
                tnVar.getClass();
                tnVar.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 28, true));
                return;
            case 13:
                tn tnVar3 = this.f40786b;
                long j10 = tnVar3.P5;
                TLRPC.User user = tnVar3.f42801f;
                TLRPC.Chat chat = tnVar3.f42787e;
                TLRPC.EncryptedChat encryptedChat = tnVar3.h;
                if (tnVar3.J1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.c5.j0(tnVar3, j10, user, chat, encryptedChat, z10, tnVar3.V7, new qg(tnVar3, 2), tnVar3.f42746aa);
                return;
            case 14:
                tn.j0(tnVar);
                return;
            case 15:
                if (tnVar.Y3 != null) {
                    TopicsController topicsController = tnVar.getMessagesController().getTopicsController();
                    long j11 = tnVar.f42787e.f22392id;
                    TLRPC.TL_forumTopic tL_forumTopic = tnVar.Y3;
                    int i15 = tL_forumTopic.f22444id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i15, false);
                }
                tnVar.Rc();
                tnVar.hc(false);
                tnVar.Qc(true);
                return;
            case 16:
                long j12 = tnVar.P5;
                if (tnVar.h != null) {
                    j12 = tnVar.f42801f.f22539id;
                }
                tnVar.Ub = false;
                tnVar.getMessagesController().hidePeerSettingsBar(j12, tnVar.f42801f, tnVar.f42787e);
                tnVar.Qc(true);
                tnVar.oc(true);
                return;
            case 17:
                tn tnVar4 = this.f40786b;
                tnVar4.f43054z4 = true;
                if (tnVar4.F9() && !tnVar4.f42779d4) {
                    tnVar4.j((int) tnVar4.Z3, 0, true, 0, true, 0);
                    return;
                }
                int i16 = tnVar4.H4;
                if (i16 != 0) {
                    if (!tnVar4.D4.isEmpty()) {
                        if (i16 == ((Integer) j7.l1.i(1, tnVar4.D4)).intValue()) {
                            i12 = ((Integer) tnVar4.D4.get(0)).intValue() + 1;
                            tnVar4.K4 = true;
                        } else {
                            tnVar4.K4 = false;
                            i12 = i16 - 1;
                        }
                    }
                    tnVar4.J4 = i12;
                    if (!tnVar4.K4) {
                        i12 = -i12;
                    }
                    tnVar4.j(i16, 0, true, 0, true, i12);
                    tnVar4.uc();
                    return;
                }
                return;
            case 18:
                tnVar.ia(false);
                return;
            case 19:
                tn.Z(tnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", tnVar.a());
                tnVar.presentFragment(new ko(bundle2));
                return;
            case 21:
                tn.C0(tnVar);
                return;
            case 22:
                tn.L0(tnVar);
                return;
            case 23:
                tn.b1(tnVar);
                return;
            case 24:
                tnVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = tnVar.S5;
                for (int i17 = 1; i17 >= 0; i17--) {
                    if (messageObject == null && sparseArrayArr[i17].size() != 0) {
                        messageObject = (MessageObject) tnVar.f42870k6[i17].get(sparseArrayArr[i17].keyAt(0));
                    }
                    sparseArrayArr[i17].clear();
                    tnVar.T5[i17].clear();
                    tnVar.U5[i17].clear();
                }
                tnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f22413id) > 0 || (i10 < 0 && tnVar.h != null))) {
                    tnVar.Bb(messageObject);
                }
                tnVar.yc(0, true);
                tnVar.Wc(false);
                tnVar.Lc();
                return;
            case 26:
                tn.f1(tnVar);
                return;
            case 27:
                tn tnVar5 = this.f40786b;
                MessageObject messageObject3 = tnVar5.f42880l5;
                if (messageObject3 != null) {
                    tnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (!tnVar.E9()) {
                    str = null;
                }
                tnVar.la(str);
                return;
            default:
                tnVar.Q7();
                tnVar.f42989u3.m(tnVar.P5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}

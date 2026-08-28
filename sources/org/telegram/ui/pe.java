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
public final class pe implements View.OnClickListener {
    public final int f41496a;
    public final qn f41497b;

    public pe(qn qnVar, int i9) {
        this.f41496a = i9;
        this.f41497b = qnVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i9;
        int i10 = this.f41496a;
        String str = "";
        MessageObject messageObject = null;
        int i11 = 0;
        qn qnVar = this.f41497b;
        switch (i10) {
            case 0:
                qn qnVar2 = this.f41497b;
                zf.j0.C1(qnVar2, qnVar2.f42154z1, qnVar2.A1, qnVar2.P5, false);
                return;
            case 1:
                qnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", qnVar.f42049r);
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (qnVar.G3 != null) {
                    qnVar.Lb(!qnVar.f42102uc.f47776f);
                    return;
                }
                return;
            case 3:
                qnVar.kb(!qnVar.f42114w0.J);
                return;
            case 4:
                tj tjVar = qnVar.E1;
                if (tjVar != null) {
                    tjVar.setReversed(true);
                    qnVar.E1.getAdapter().f19329g0 = true;
                    qnVar.m7();
                }
                qnVar.O2.setVisibility(8);
                qnVar.P2.setVisibility(8);
                qnVar.f41957j3 = true;
                qnVar.f41969k3 = null;
                qnVar.f41980l3 = null;
                qnVar.f41904f0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                qnVar.f41904f0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(qnVar.f41904f0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41904f0;
                w0Var.f23921r = null;
                fg.g gVar = w0Var.f23906e;
                if (gVar != null) {
                    gVar.setText("");
                    return;
                }
                return;
            case 5:
                if (qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = qnVar.f41904f0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    qnVar.showDialog(org.telegram.ui.Components.y4.p(qnVar.getParentActivity(), new tk(qnVar), qnVar.f41848aa).f22713a);
                    return;
                }
                return;
            case 6:
                qnVar.A7(true);
                return;
            case 7:
                MessageObject messageObject2 = qnVar.Z4;
                if (messageObject2 != null) {
                    qnVar.J9(messageObject2, false, false);
                    ve.e.r(qnVar.getParentActivity(), Uri.parse(qnVar.Z4.sponsoredUrl), true, false, false, null, null, false, qnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(qnVar.Z4.sponsoredInfo)) {
                    org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.f41848aa));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(qnVar.Z4.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.f41848aa));
                    return;
                }
                return;
            case 10:
                if (qnVar.T0 != null && qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(qnVar.T0.getContext(), null, false, false);
                    Activity parentActivity = qnVar.getParentActivity();
                    on onVar = qnVar.f41848aa;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f10 = org.telegram.messenger.l0.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i12 = org.telegram.ui.ActionBar.f6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, onVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(parentActivity, onVar);
                    l80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), onVar));
                    l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, onVar));
                    l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, onVar));
                    l80Var.setTextSize(1, 14.0f);
                    l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    l80Var.setOnLinkPressListener(new org.telegram.ui.Components.k80() {
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
                    org.telegram.ui.Components.l80 l80Var2 = new org.telegram.ui.Components.l80(parentActivity, null);
                    l80Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), onVar));
                    l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, onVar));
                    l80Var2.setTextSize(1, 14.0f);
                    l80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    l80Var2.setOnLinkPressListener(new org.telegram.ui.Components.k80() {
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
                    org.telegram.ui.Components.l80 l80Var3 = new org.telegram.ui.Components.l80(parentActivity, null);
                    l80Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), onVar));
                    l80Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, onVar));
                    l80Var3.setTextSize(1, 14.0f);
                    l80Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    l80Var3.setOnLinkPressListener(new org.telegram.ui.Components.k80() {
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
                    int i13 = org.telegram.ui.ActionBar.f6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.f6.v0(i13, onVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    gk gkVar = new gk(parentActivity, paint);
                    gkVar.setOnClickListener(new e81(parentActivity));
                    gkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    gkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    gkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, onVar));
                    gkVar.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, onVar)));
                    gkVar.setTextSize(1, 14.0f);
                    gkVar.setGravity(16);
                    org.telegram.ui.Components.l80 l80Var4 = new org.telegram.ui.Components.l80(parentActivity, null);
                    l80Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), onVar));
                    l80Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    l80Var4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, onVar));
                    l80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(textView);
                    l80Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(l80Var, g7.e6.t(-1, -2, 0, 0, 18, 0, 0));
                    l80Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(l80Var2, g7.e6.t(-1, -2, 0, 0, 24, 0, 0));
                    l80Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(l80Var3, g7.e6.t(-1, -2, 0, 0, 24, 0, 0));
                    f10.addView(gkVar, g7.e6.t(-2, 34, 1, 22, 14, 22, 0));
                    l80Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f10.addView(l80Var4, g7.e6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f10);
                    frameLayout.addView(scrollView, g7.e6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j10.customView = frameLayout;
                    j10.show();
                    return;
                }
                return;
            case 11:
                qnVar.finishPreviewFragment();
                return;
            case 12:
                qnVar.getClass();
                qnVar.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 28, true));
                return;
            case 13:
                qn qnVar3 = this.f41497b;
                long j11 = qnVar3.P5;
                TLRPC.User user = qnVar3.f41903f;
                TLRPC.Chat chat = qnVar3.f41890e;
                TLRPC.EncryptedChat encryptedChat = qnVar3.h;
                if (qnVar3.J1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.y4.j0(qnVar3, j11, user, chat, encryptedChat, z10, qnVar3.V7, new rg(qnVar3, 2), qnVar3.f41848aa);
                return;
            case 14:
                qn.i0(qnVar);
                return;
            case 15:
                if (qnVar.Y3 != null) {
                    TopicsController topicsController = qnVar.getMessagesController().getTopicsController();
                    long j12 = qnVar.f41890e.f22380id;
                    TLRPC.TL_forumTopic tL_forumTopic = qnVar.Y3;
                    int i14 = tL_forumTopic.f22432id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j12, i14, false);
                }
                qnVar.Rc();
                qnVar.hc(false);
                qnVar.Qc(true);
                return;
            case 16:
                long j13 = qnVar.P5;
                if (qnVar.h != null) {
                    j13 = qnVar.f41903f.f22527id;
                }
                qnVar.Ub = false;
                qnVar.getMessagesController().hidePeerSettingsBar(j13, qnVar.f41903f, qnVar.f41890e);
                qnVar.Qc(true);
                qnVar.oc(true);
                return;
            case 17:
                qn qnVar4 = this.f41497b;
                qnVar4.f42157z4 = true;
                if (qnVar4.F9() && !qnVar4.f41882d4) {
                    qnVar4.j((int) qnVar4.Z3, 0, true, 0, true, 0);
                    return;
                }
                int i15 = qnVar4.H4;
                if (i15 != 0) {
                    if (!qnVar4.D4.isEmpty()) {
                        if (i15 == ((Integer) j3.r0.j(1, qnVar4.D4)).intValue()) {
                            i11 = ((Integer) qnVar4.D4.get(0)).intValue() + 1;
                            qnVar4.K4 = true;
                        } else {
                            qnVar4.K4 = false;
                            i11 = i15 - 1;
                        }
                    }
                    qnVar4.J4 = i11;
                    if (!qnVar4.K4) {
                        i11 = -i11;
                    }
                    qnVar4.j(i15, 0, true, 0, true, i11);
                    qnVar4.uc();
                    return;
                }
                return;
            case 18:
                qnVar.ia(false);
                return;
            case 19:
                qn.Y(qnVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", qnVar.a());
                qnVar.presentFragment(new ho(bundle2));
                return;
            case 21:
                qn.B0(qnVar);
                return;
            case 22:
                qn.L0(qnVar);
                return;
            case 23:
                qn.b1(qnVar);
                return;
            case 24:
                qnVar.ba(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = qnVar.S5;
                for (int i16 = 1; i16 >= 0; i16--) {
                    if (messageObject == null && sparseArrayArr[i16].size() != 0) {
                        messageObject = (MessageObject) qnVar.f41972k6[i16].get(sparseArrayArr[i16].keyAt(0));
                    }
                    sparseArrayArr[i16].clear();
                    qnVar.T5[i16].clear();
                    qnVar.U5[i16].clear();
                }
                qnVar.c9();
                if (messageObject != null && ((i9 = messageObject.messageOwner.f22401id) > 0 || (i9 < 0 && qnVar.h != null))) {
                    qnVar.Bb(messageObject);
                }
                qnVar.yc(0, true);
                qnVar.Wc(false);
                qnVar.Lc();
                return;
            case 26:
                qn.f1(qnVar);
                return;
            case 27:
                qn qnVar5 = this.f41497b;
                MessageObject messageObject3 = qnVar5.f41982l5;
                if (messageObject3 != null) {
                    qnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (!qnVar.E9()) {
                    str = null;
                }
                qnVar.la(str);
                return;
            default:
                qnVar.Q7();
                qnVar.f42093u3.m(qnVar.P5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}

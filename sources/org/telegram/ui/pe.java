package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
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

    public final int f41333a;

    public final rn f41334b;

    public pe(rn rnVar, int i10) {
        this.f41333a = i10;
        this.f41334b = rnVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11 = this.f41333a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int iIntValue = 0;
        final int i13 = 1;
        rn rnVar = this.f41334b;
        switch (i11) {
            case 0:
                rn rnVar2 = this.f41334b;
                ag.i1.C1(rnVar2, rnVar2.f42291z1, rnVar2.A1, rnVar2.P5, false);
                break;
            case 1:
                rnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", rnVar.f42185r);
                rnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (rnVar.G3 != null) {
                    rnVar.Lb(!rnVar.f42238uc.f48498f);
                }
                break;
            case 3:
                rnVar.kb(!rnVar.f42252w0.J);
                break;
            case 4:
                vj vjVar = rnVar.E1;
                if (vjVar != null) {
                    vjVar.setReversed(true);
                    rnVar.E1.getAdapter().f45930g0 = true;
                    rnVar.m7();
                }
                rnVar.O2.setVisibility(8);
                rnVar.P2.setVisibility(8);
                rnVar.f42093j3 = true;
                rnVar.f42106k3 = null;
                rnVar.f42117l3 = null;
                rnVar.f42040f0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                rnVar.f42040f0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(rnVar.f42040f0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42040f0;
                v0Var.f23874r = null;
                gg.g gVar = v0Var.f23859e;
                if (gVar != null) {
                    gVar.setText("");
                    break;
                }
                break;
            case 5:
                if (rnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = rnVar.f42040f0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    rnVar.showDialog(org.telegram.ui.Components.y4.p(rnVar.getParentActivity(), new vk(rnVar), rnVar.f41983aa).f23994a);
                    break;
                }
                break;
            case 6:
                rnVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = rnVar.Z4;
                if (messageObject2 != null) {
                    rnVar.J9(messageObject2, false, false);
                    we.e.r(rnVar.getParentActivity(), Uri.parse(rnVar.Z4.sponsoredUrl), true, false, false, null, null, false, rnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(rnVar.Z4.sponsoredInfo)) {
                    org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(rnVar.getParentActivity()), rnVar.f41983aa));
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(rnVar.Z4.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(rnVar.getParentActivity()), rnVar.f41983aa));
                }
                break;
            case 10:
                if (rnVar.T0 != null && rnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(rnVar.T0.getContext(), null, false, false);
                    Activity parentActivity = rnVar.getParentActivity();
                    pn pnVar = rnVar.f41983aa;
                    final d81 d81Var = new d81(parentActivity);
                    LinearLayout linearLayoutF = org.telegram.messenger.y1.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, pnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(parentActivity, pnVar);
                    p80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), pnVar));
                    p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, pnVar));
                    p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, pnVar));
                    p80Var.setTextSize(1, 14.0f);
                    p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p80Var.setOnLinkPressListener(new org.telegram.ui.Components.o80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (iIntValue) {
                                case 0:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(d81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.p80 p80Var2 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), pnVar));
                    p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, pnVar));
                    p80Var2.setTextSize(1, 14.0f);
                    p80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p80Var2.setOnLinkPressListener(new org.telegram.ui.Components.o80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(d81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.p80 p80Var3 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), pnVar));
                    p80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, pnVar));
                    p80Var3.setTextSize(1, 14.0f);
                    p80Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p80Var3.setOnLinkPressListener(new org.telegram.ui.Components.o80() {
                        @Override
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(d81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(d81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i15 = org.telegram.ui.ActionBar.g6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(i15, pnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    ik ikVar = new ik(parentActivity, paint);
                    ikVar.setOnClickListener(new c81(parentActivity));
                    ikVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    ikVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    ikVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, pnVar));
                    ikVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, pnVar)));
                    ikVar.setTextSize(1, 14.0f);
                    ikVar.setGravity(16);
                    org.telegram.ui.Components.p80 p80Var4 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), pnVar));
                    p80Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    p80Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, pnVar));
                    p80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutF.addView(textView);
                    p80Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutF.addView(p80Var, h7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    p80Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutF.addView(p80Var2, h7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    p80Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutF.addView(p80Var3, h7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    linearLayoutF.addView(ikVar, h7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    p80Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayoutF.addView(p80Var4, h7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(d81Var.getContext());
                    scrollView.addView(linearLayoutF);
                    d81Var.addView(scrollView, h7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    e3VarO.customView = d81Var;
                    e3VarO.show();
                    break;
                }
                break;
            case 11:
                rnVar.finishPreviewFragment();
                break;
            case 12:
                rnVar.getClass();
                rnVar.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 28, true));
                break;
            case 13:
                rn rnVar3 = this.f41334b;
                org.telegram.ui.Components.y4.j0(rnVar3, rnVar3.P5, rnVar3.f42039f, rnVar3.f42026e, rnVar3.h, rnVar3.J1.getTag(R.id.object_tag) != null, rnVar3.V7, new tg(rnVar3, i12), rnVar3.f41983aa);
                break;
            case 14:
                rn.j0(rnVar);
                break;
            case 15:
                if (rnVar.Y3 != null) {
                    TopicsController topicsController = rnVar.getMessagesController().getTopicsController();
                    long j10 = rnVar.f42026e.f22380id;
                    TLRPC.TL_forumTopic tL_forumTopic = rnVar.Y3;
                    int i16 = tL_forumTopic.f22432id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i16, false);
                }
                rnVar.Rc();
                rnVar.hc(false);
                rnVar.Qc(true);
                break;
            case 16:
                long j11 = rnVar.P5;
                if (rnVar.h != null) {
                    j11 = rnVar.f42039f.f22527id;
                }
                rnVar.Ub = false;
                rnVar.getMessagesController().hidePeerSettingsBar(j11, rnVar.f42039f, rnVar.f42026e);
                rnVar.Qc(true);
                rnVar.oc(true);
                break;
            case 17:
                rn rnVar4 = this.f41334b;
                rnVar4.f42294z4 = true;
                if (!rnVar4.F9() || rnVar4.f42017d4) {
                    int i17 = rnVar4.H4;
                    if (i17 != 0) {
                        if (!rnVar4.D4.isEmpty()) {
                            if (i17 == ((Integer) i0.a.i(1, rnVar4.D4)).intValue()) {
                                iIntValue = ((Integer) rnVar4.D4.get(0)).intValue() + 1;
                                rnVar4.K4 = true;
                            } else {
                                rnVar4.K4 = false;
                                iIntValue = i17 - 1;
                            }
                        }
                        rnVar4.J4 = iIntValue;
                        if (!rnVar4.K4) {
                            iIntValue = -iIntValue;
                        }
                        rnVar4.j(i17, 0, true, 0, true, iIntValue);
                        rnVar4.uc();
                    }
                } else {
                    rnVar4.j((int) rnVar4.Z3, 0, true, 0, true, 0);
                }
                break;
            case 18:
                rnVar.ia(false);
                break;
            case 19:
                rn.Z(rnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", rnVar.a());
                rnVar.presentFragment(new qk(bundle2));
                break;
            case 21:
                rn.C0(rnVar);
                break;
            case 22:
                rn.L0(rnVar);
                break;
            case 23:
                rn.b1(rnVar);
                break;
            case 24:
                rnVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = rnVar.S5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) rnVar.f42109k6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    rnVar.T5[i18].clear();
                    rnVar.U5[i18].clear();
                }
                rnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f22401id) > 0 || (i10 < 0 && rnVar.h != null))) {
                    rnVar.Bb(messageObject);
                }
                rnVar.yc(0, true);
                rnVar.Wc(false);
                rnVar.Lc();
                break;
            case 26:
                rn.f1(rnVar);
                break;
            case 27:
                rn rnVar5 = this.f41334b;
                MessageObject messageObject3 = rnVar5.f42119l5;
                if (messageObject3 != null) {
                    rnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                }
                break;
            case 28:
                rnVar.la(rnVar.E9() ? "" : null);
                break;
            default:
                rnVar.Q7();
                rnVar.f42229u3.m(rnVar.P5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}

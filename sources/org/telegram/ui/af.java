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
public final class af implements View.OnClickListener {
    public final int f35915a;
    public final zn f35916b;

    public af(zn znVar, int i10) {
        this.f35915a = i10;
        this.f35916b = znVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f35915a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        zn znVar = this.f35916b;
        switch (i11) {
            case 0:
                zn znVar2 = this.f35916b;
                rg.j0.D1(znVar2, znVar2.D1, znVar2.E1, znVar2.T5, false);
                return;
            case 1:
                znVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", znVar.f44910r);
                znVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (znVar.K3 != null) {
                    znVar.Pb(!znVar.yc.f16338f);
                    return;
                }
                return;
            case 3:
                znVar.ob(!znVar.A0.N);
                return;
            case 4:
                gk gkVar = znVar.I1;
                if (gkVar != null) {
                    gkVar.setReversed(true);
                    znVar.I1.getAdapter().f10679k0 = true;
                    znVar.p7();
                }
                znVar.S2.setVisibility(8);
                znVar.T2.setVisibility(8);
                znVar.f44866n3 = true;
                znVar.f44877o3 = null;
                znVar.f44889p3 = null;
                znVar.f44814j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                znVar.f44814j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(znVar.f44814j0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = znVar.f44814j0;
                v0Var.f21599r = null;
                ci.g2 g2Var = v0Var.f21584e;
                if (g2Var != null) {
                    g2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = znVar.f44814j0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    znVar.showDialog(org.telegram.ui.Components.g5.o(znVar.getParentActivity(), new hl(znVar), znVar.f44763ea).f20380a);
                    return;
                }
                return;
            case 6:
                znVar.D7(true);
                return;
            case 7:
                MessageObject messageObject2 = znVar.f44745d5;
                if (messageObject2 != null) {
                    znVar.O9(messageObject2, false, false);
                    of.f.r(znVar.getParentActivity(), Uri.parse(znVar.f44745d5.sponsoredUrl), true, false, false, null, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(znVar.f44745d5.sponsoredInfo)) {
                    org.telegram.messenger.bi.p(R.string.TextCopied, new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(znVar.getParentActivity()), znVar.f44763ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(znVar.f44745d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.bi.p(R.string.TextCopied, new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(znVar.getParentActivity()), znVar.f44763ea));
                    return;
                }
                return;
            case 10:
                if (znVar.X0 != null && znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i13 = org.telegram.messenger.bi.i(1, znVar.X0.getContext(), null, false);
                    Activity parentActivity = znVar.getParentActivity();
                    xn xnVar = znVar.f44763ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout e7 = org.telegram.messenger.q.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, xnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(parentActivity, xnVar);
                    ea0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), xnVar));
                    ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, xnVar));
                    ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, xnVar));
                    ea0Var.setTextSize(1, 14.0f);
                    ea0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ea0Var.setOnLinkPressListener(new org.telegram.ui.Components.da0() {
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
                    org.telegram.ui.Components.ea0 ea0Var2 = new org.telegram.ui.Components.ea0(parentActivity, null);
                    ea0Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), xnVar));
                    ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, xnVar));
                    ea0Var2.setTextSize(1, 14.0f);
                    ea0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ea0Var2.setOnLinkPressListener(new org.telegram.ui.Components.da0() {
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
                    org.telegram.ui.Components.ea0 ea0Var3 = new org.telegram.ui.Components.ea0(parentActivity, null);
                    ea0Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), xnVar));
                    ea0Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, xnVar));
                    ea0Var3.setTextSize(1, 14.0f);
                    ea0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ea0Var3.setOnLinkPressListener(new org.telegram.ui.Components.da0() {
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
                    int i15 = org.telegram.ui.ActionBar.i6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.i6.w0(i15, xnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    tk tkVar = new tk(parentActivity, paint);
                    tkVar.setOnClickListener(new m91(parentActivity));
                    tkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    tkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    tkVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i15, xnVar));
                    tkVar.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, xnVar)));
                    tkVar.setTextSize(1, 14.0f);
                    tkVar.setGravity(16);
                    org.telegram.ui.Components.ea0 ea0Var4 = new org.telegram.ui.Components.ea0(parentActivity, null);
                    ea0Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), xnVar));
                    ea0Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ea0Var4.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, xnVar));
                    ea0Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(textView);
                    ea0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(ea0Var, w7.x5.t(-1, -2, 0, 0, 18, 0, 0));
                    ea0Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(ea0Var2, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    ea0Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(ea0Var3, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    e7.addView(tkVar, w7.x5.t(-2, 34, 1, 22, 14, 22, 0));
                    ea0Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(ea0Var4, w7.x5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(e7);
                    frameLayout.addView(scrollView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 22.0f, -1, 0));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                znVar.finishPreviewFragment();
                return;
            case 12:
                znVar.getClass();
                znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 28, true));
                return;
            case 13:
                zn znVar3 = this.f35916b;
                long j3 = znVar3.T5;
                TLRPC.User user = znVar3.f44765f;
                TLRPC.Chat chat = znVar3.f44753e;
                TLRPC.EncryptedChat encryptedChat = znVar3.h;
                if (znVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.g5.i0(znVar3, j3, user, chat, encryptedChat, z10, znVar3.Z7, new bh(znVar3, 2), znVar3.f44763ea);
                return;
            case 14:
                zn.k0(znVar);
                return;
            case 15:
                if (znVar.f44732c4 != null) {
                    TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                    long j10 = znVar.f44753e.f20038id;
                    TLRPC.TL_forumTopic tL_forumTopic = znVar.f44732c4;
                    int i16 = tL_forumTopic.f20090id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i16, false);
                }
                znVar.Vc();
                znVar.lc(false);
                znVar.Uc(true);
                return;
            case 16:
                long j11 = znVar.T5;
                if (znVar.h != null) {
                    j11 = znVar.f44765f.f20185id;
                }
                znVar.Yb = false;
                znVar.getMessagesController().hidePeerSettingsBar(j11, znVar.f44765f, znVar.f44753e);
                znVar.Uc(true);
                znVar.sc(true);
                return;
            case 17:
                zn znVar4 = this.f35916b;
                znVar4.D4 = true;
                if (znVar4.K9() && !znVar4.f44793h4) {
                    znVar4.F((int) znVar4.f44744d4, 0, 0, 0, true, true);
                    return;
                }
                int i17 = znVar4.L4;
                if (i17 != 0) {
                    if (!znVar4.H4.isEmpty()) {
                        if (i17 == ((Integer) hg.c.g(1, znVar4.H4)).intValue()) {
                            i12 = ((Integer) znVar4.H4.get(0)).intValue() + 1;
                            znVar4.O4 = true;
                        } else {
                            znVar4.O4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    znVar4.N4 = i12;
                    if (!znVar4.O4) {
                        i12 = -i12;
                    }
                    znVar4.F(i17, 0, 0, i12, true, true);
                    znVar4.yc();
                    return;
                }
                return;
            case 18:
                znVar.na(false);
                return;
            case 19:
                zn.b1(znVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", znVar.a());
                znVar.presentFragment(new uo(bundle2));
                return;
            case 21:
                zn.m0(znVar);
                return;
            case 22:
                zn.Y0(znVar);
                return;
            case 23:
                zn.i0(znVar);
                return;
            case 24:
                znVar.ga(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = znVar.W5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) znVar.f44880o6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    znVar.X5[i18].clear();
                    znVar.Y5[i18].clear();
                }
                znVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f20059id) > 0 || (i10 < 0 && znVar.h != null))) {
                    znVar.Fb(messageObject);
                }
                znVar.Cc(0, true);
                znVar.ad(false);
                znVar.Pc();
                return;
            case 26:
                zn.c1(znVar);
                return;
            case 27:
                zn znVar5 = this.f35916b;
                MessageObject messageObject3 = znVar5.p5;
                if (messageObject3 != null) {
                    znVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!znVar.J9()) {
                    str = null;
                }
                znVar.qa(str);
                return;
            default:
                znVar.T7();
                znVar.y3.m(znVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}

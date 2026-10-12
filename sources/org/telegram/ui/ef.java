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
public final class ef implements View.OnClickListener {
    public final int f37084a;
    public final eo f37085b;

    public ef(eo eoVar, int i10) {
        this.f37084a = i10;
        this.f37085b = eoVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f37084a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        eo eoVar = this.f37085b;
        switch (i11) {
            case 0:
                eo eoVar2 = this.f37085b;
                rg.j0.D1(eoVar2, eoVar2.D1, eoVar2.E1, eoVar2.T5, false);
                return;
            case 1:
                eoVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", eoVar.f37403r);
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (eoVar.K3 != null) {
                    eoVar.Pb(!eoVar.yc.f16089f);
                    return;
                }
                return;
            case 3:
                eoVar.ob(!eoVar.A0.N);
                return;
            case 4:
                kk kkVar = eoVar.I1;
                if (kkVar != null) {
                    kkVar.setReversed(true);
                    eoVar.I1.getAdapter().f10677k0 = true;
                    eoVar.p7();
                }
                eoVar.S2.setVisibility(8);
                eoVar.T2.setVisibility(8);
                eoVar.f37359n3 = true;
                eoVar.f37370o3 = null;
                eoVar.f37382p3 = null;
                eoVar.f37307j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                eoVar.f37307j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(eoVar.f37307j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = eoVar.f37307j0;
                u0Var.f21330r = null;
                ci.g2 g2Var = u0Var.f21315e;
                if (g2Var != null) {
                    g2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (eoVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = eoVar.f37307j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    eoVar.showDialog(org.telegram.ui.Components.g5.o(eoVar.getParentActivity(), new ll(eoVar), eoVar.f37256ea).f21485a);
                    return;
                }
                return;
            case 6:
                eoVar.D7(true);
                return;
            case 7:
                MessageObject messageObject2 = eoVar.f37238d5;
                if (messageObject2 != null) {
                    eoVar.O9(messageObject2, false, false);
                    of.f.r(eoVar.getParentActivity(), Uri.parse(eoVar.f37238d5.sponsoredUrl), true, false, false, null, null, false, eoVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(eoVar.f37238d5.sponsoredInfo)) {
                    org.telegram.messenger.am.p(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(eoVar.getParentActivity()), eoVar.f37256ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(eoVar.f37238d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.am.p(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(eoVar.getParentActivity()), eoVar.f37256ea));
                    return;
                }
                return;
            case 10:
                if (eoVar.X0 != null && eoVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 i13 = org.telegram.messenger.am.i(1, eoVar.X0.getContext(), null, false);
                    Activity parentActivity = eoVar.getParentActivity();
                    bo boVar = eoVar.f37256ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, boVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(parentActivity, boVar);
                    ia0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), boVar));
                    ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, boVar));
                    ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, boVar));
                    ia0Var.setTextSize(1, 14.0f);
                    ia0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ia0Var.setOnLinkPressListener(new org.telegram.ui.Components.ha0() {
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
                    org.telegram.ui.Components.ia0 ia0Var2 = new org.telegram.ui.Components.ia0(parentActivity, null);
                    ia0Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), boVar));
                    ia0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, boVar));
                    ia0Var2.setTextSize(1, 14.0f);
                    ia0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ia0Var2.setOnLinkPressListener(new org.telegram.ui.Components.ha0() {
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
                    org.telegram.ui.Components.ia0 ia0Var3 = new org.telegram.ui.Components.ia0(parentActivity, null);
                    ia0Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), boVar));
                    ia0Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, boVar));
                    ia0Var3.setTextSize(1, 14.0f);
                    ia0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ia0Var3.setOnLinkPressListener(new org.telegram.ui.Components.ha0() {
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
                    int i15 = org.telegram.ui.ActionBar.h6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(i15, boVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    xk xkVar = new xk(parentActivity, paint);
                    xkVar.setOnClickListener(new o91(parentActivity));
                    xkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    xkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    xkVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, boVar));
                    xkVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20631h5, boVar)));
                    xkVar.setTextSize(1, 14.0f);
                    xkVar.setGravity(16);
                    org.telegram.ui.Components.ia0 ia0Var4 = new org.telegram.ui.Components.ia0(parentActivity, null);
                    ia0Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), boVar));
                    ia0Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    ia0Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, boVar));
                    ia0Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    ia0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(ia0Var, w7.w5.t(-1, -2, 0, 0, 18, 0, 0));
                    ia0Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(ia0Var2, w7.w5.t(-1, -2, 0, 0, 24, 0, 0));
                    ia0Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(ia0Var3, w7.w5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(xkVar, w7.w5.t(-2, 34, 1, 22, 14, 22, 0));
                    ia0Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(ia0Var4, w7.w5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, w7.w5.a(-2.0f, 0.0f, 12.0f, 0.0f, 22.0f, -1, 0));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                eoVar.finishPreviewFragment();
                return;
            case 12:
                eoVar.getClass();
                eoVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) eoVar, 28, true));
                return;
            case 13:
                eo eoVar3 = this.f37085b;
                long j3 = eoVar3.T5;
                TLRPC.User user = eoVar3.f37258f;
                TLRPC.Chat chat = eoVar3.f37246e;
                TLRPC.EncryptedChat encryptedChat = eoVar3.h;
                if (eoVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.g5.i0(eoVar3, j3, user, chat, encryptedChat, z10, eoVar3.Z7, new eh(eoVar3, 2), eoVar3.f37256ea);
                return;
            case 14:
                eo.k0(eoVar);
                return;
            case 15:
                if (eoVar.f37225c4 != null) {
                    TopicsController topicsController = eoVar.getMessagesController().getTopicsController();
                    long j10 = eoVar.f37246e.f19803id;
                    TLRPC.TL_forumTopic tL_forumTopic = eoVar.f37225c4;
                    int i16 = tL_forumTopic.f19855id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i16, false);
                }
                eoVar.Vc();
                eoVar.lc(false);
                eoVar.Uc(true);
                return;
            case 16:
                long j11 = eoVar.T5;
                if (eoVar.h != null) {
                    j11 = eoVar.f37258f.f19950id;
                }
                eoVar.Yb = false;
                eoVar.getMessagesController().hidePeerSettingsBar(j11, eoVar.f37258f, eoVar.f37246e);
                eoVar.Uc(true);
                eoVar.sc(true);
                return;
            case 17:
                eo eoVar4 = this.f37085b;
                eoVar4.D4 = true;
                if (eoVar4.K9() && !eoVar4.f37286h4) {
                    eoVar4.F((int) eoVar4.f37237d4, 0, 0, 0, true, true);
                    return;
                }
                int i17 = eoVar4.L4;
                if (i17 != 0) {
                    if (!eoVar4.H4.isEmpty()) {
                        if (i17 == ((Integer) hg.c.h(1, eoVar4.H4)).intValue()) {
                            i12 = ((Integer) eoVar4.H4.get(0)).intValue() + 1;
                            eoVar4.O4 = true;
                        } else {
                            eoVar4.O4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    eoVar4.N4 = i12;
                    if (!eoVar4.O4) {
                        i12 = -i12;
                    }
                    eoVar4.F(i17, 0, 0, i12, true, true);
                    eoVar4.yc();
                    return;
                }
                return;
            case 18:
                eoVar.na(false);
                return;
            case 19:
                eo.b1(eoVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", eoVar.a());
                eoVar.presentFragment(new xo(bundle2));
                return;
            case 21:
                eo.m0(eoVar);
                return;
            case 22:
                eo.Y0(eoVar);
                return;
            case 23:
                eo.i0(eoVar);
                return;
            case 24:
                eoVar.ga(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = eoVar.W5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) eoVar.f37373o6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    eoVar.X5[i18].clear();
                    eoVar.Y5[i18].clear();
                }
                eoVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f19824id) > 0 || (i10 < 0 && eoVar.h != null))) {
                    eoVar.Fb(messageObject);
                }
                eoVar.Cc(0, true);
                eoVar.ad(false);
                eoVar.Pc();
                return;
            case 26:
                eo.c1(eoVar);
                return;
            case 27:
                eo eoVar5 = this.f37085b;
                MessageObject messageObject3 = eoVar5.p5;
                if (messageObject3 != null) {
                    eoVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    return;
                }
                return;
            case 28:
                if (!eoVar.J9()) {
                    str = null;
                }
                eoVar.qa(str);
                return;
            default:
                eoVar.T7();
                eoVar.y3.m(eoVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}

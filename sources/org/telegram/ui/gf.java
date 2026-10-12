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
public final class gf implements View.OnClickListener {
    public final int f36384a;
    public final fo f36385b;

    public gf(fo foVar, int i10) {
        this.f36384a = i10;
        this.f36385b = foVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f36384a;
        String str = "";
        MessageObject messageObject = null;
        int i12 = 0;
        fo foVar = this.f36385b;
        switch (i11) {
            case 0:
                fo foVar2 = this.f36385b;
                sg.j0.D1(foVar2, foVar2.D1, foVar2.E1, foVar2.T5, false);
                return;
            case 1:
                foVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", foVar.f36080r);
                foVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                if (foVar.K3 != null) {
                    foVar.Pb(!foVar.yc.f16293f);
                    return;
                }
                return;
            case 3:
                foVar.ob(!foVar.A0.N);
                return;
            case 4:
                kk kkVar = foVar.I1;
                if (kkVar != null) {
                    kkVar.setReversed(true);
                    foVar.I1.getAdapter().f10623k0 = true;
                    foVar.p7();
                }
                foVar.S2.setVisibility(8);
                foVar.T2.setVisibility(8);
                foVar.f36036n3 = true;
                foVar.f36049o3 = null;
                foVar.f36060p3 = null;
                foVar.f35983j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                foVar.f35983j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(foVar.f35983j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = foVar.f35983j0;
                u0Var.f20694r = null;
                di.g2 g2Var = u0Var.e;
                if (g2Var != null) {
                    g2Var.setText("");
                    return;
                }
                return;
            case 5:
                if (foVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = foVar.f35983j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    foVar.showDialog(org.telegram.ui.Components.g5.o(foVar.getParentActivity(), new ll(foVar), foVar.f35932ea).f20838a);
                    return;
                }
                return;
            case 6:
                foVar.D7(true);
                return;
            case 7:
                MessageObject messageObject2 = foVar.f35916d5;
                if (messageObject2 != null) {
                    foVar.O9(messageObject2, false, false);
                    pf.d.r(foVar.getParentActivity(), Uri.parse(foVar.f35916d5.sponsoredUrl), true, false, false, null, null, false, foVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 8:
                if (AndroidUtilities.addToClipboard(foVar.f35916d5.sponsoredInfo)) {
                    org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(foVar.getParentActivity()), foVar.f35932ea));
                    return;
                }
                return;
            case 9:
                if (AndroidUtilities.addToClipboard(foVar.f35916d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.yh.o(R.string.TextCopied, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(foVar.getParentActivity()), foVar.f35932ea));
                    return;
                }
                return;
            case 10:
                if (foVar.X0 != null && foVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 i13 = org.telegram.messenger.yh.i(1, foVar.X0.getContext(), null, false);
                    Activity parentActivity = foVar.getParentActivity();
                    co coVar = foVar.f35932ea;
                    final ?? frameLayout = new FrameLayout(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.q.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, coVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(parentActivity, coVar);
                    da0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), coVar));
                    da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, coVar));
                    da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, coVar));
                    da0Var.setTextSize(1, 14.0f);
                    da0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    da0Var.setOnLinkPressListener(new org.telegram.ui.Components.ca0() {
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
                    org.telegram.ui.Components.da0 da0Var2 = new org.telegram.ui.Components.da0(parentActivity, null);
                    da0Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), coVar));
                    da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, coVar));
                    da0Var2.setTextSize(1, 14.0f);
                    da0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    da0Var2.setOnLinkPressListener(new org.telegram.ui.Components.ca0() {
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
                    org.telegram.ui.Components.da0 da0Var3 = new org.telegram.ui.Components.da0(parentActivity, null);
                    da0Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), coVar));
                    da0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, coVar));
                    da0Var3.setTextSize(1, 14.0f);
                    da0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    da0Var3.setOnLinkPressListener(new org.telegram.ui.Components.ca0() {
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
                    int i15 = org.telegram.ui.ActionBar.g6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(i15, coVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    xk xkVar = new xk(parentActivity, paint);
                    xkVar.setOnClickListener(new s91(parentActivity));
                    xkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    xkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    xkVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, coVar));
                    xkVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, coVar)));
                    xkVar.setTextSize(1, 14.0f);
                    xkVar.setGravity(16);
                    org.telegram.ui.Components.da0 da0Var4 = new org.telegram.ui.Components.da0(parentActivity, null);
                    da0Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), coVar));
                    da0Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    da0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, coVar));
                    da0Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    da0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(da0Var, w7.a6.t(-1, -2, 0, 0, 18, 0, 0));
                    da0Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(da0Var2, w7.a6.t(-1, -2, 0, 0, 24, 0, 0));
                    da0Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(da0Var3, w7.a6.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(xkVar, w7.a6.t(-2, 34, 1, 22, 14, 22, 0));
                    da0Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(da0Var4, w7.a6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(frameLayout.getContext());
                    scrollView.addView(f7);
                    frameLayout.addView(scrollView, w7.a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 22.0f, -1, 0));
                    i13.customView = frameLayout;
                    i13.show();
                    return;
                }
                return;
            case 11:
                foVar.finishPreviewFragment();
                return;
            case 12:
                foVar.getClass();
                foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 28, true));
                return;
            case 13:
                fo foVar3 = this.f36385b;
                long j10 = foVar3.T5;
                TLRPC.User user = foVar3.f35935f;
                TLRPC.Chat chat = foVar3.e;
                TLRPC.EncryptedChat encryptedChat = foVar3.h;
                if (foVar3.N1.getTag(R.id.object_tag) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.g5.i0(foVar3, j10, user, chat, encryptedChat, z10, foVar3.Z7, new fh(foVar3, 2), foVar3.f35932ea);
                return;
            case 14:
                fo.k0(foVar);
                return;
            case 15:
                if (foVar.f35902c4 != null) {
                    TopicsController topicsController = foVar.getMessagesController().getTopicsController();
                    long j11 = foVar.e.f19216id;
                    TLRPC.TL_forumTopic tL_forumTopic = foVar.f35902c4;
                    int i16 = tL_forumTopic.f19268id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i16, false);
                }
                foVar.Vc();
                foVar.lc(false);
                foVar.Uc(true);
                return;
            case 16:
                long j12 = foVar.T5;
                if (foVar.h != null) {
                    j12 = foVar.f35935f.f19363id;
                }
                foVar.Yb = false;
                foVar.getMessagesController().hidePeerSettingsBar(j12, foVar.f35935f, foVar.e);
                foVar.Uc(true);
                foVar.sc(true);
                return;
            case 17:
                fo foVar4 = this.f36385b;
                foVar4.D4 = true;
                if (foVar4.K9() && !foVar4.f35964h4) {
                    foVar4.j((int) foVar4.f35915d4, 0, true, 0, true, 0);
                    return;
                }
                int i17 = foVar4.L4;
                if (i17 != 0) {
                    if (!foVar4.H4.isEmpty()) {
                        if (i17 == ((Integer) i2.d.g(1, foVar4.H4)).intValue()) {
                            i12 = ((Integer) foVar4.H4.get(0)).intValue() + 1;
                            foVar4.O4 = true;
                        } else {
                            foVar4.O4 = false;
                            i12 = i17 - 1;
                        }
                    }
                    foVar4.N4 = i12;
                    if (!foVar4.O4) {
                        i12 = -i12;
                    }
                    foVar4.j(i17, 0, true, 0, true, i12);
                    foVar4.yc();
                    return;
                }
                return;
            case 18:
                foVar.na(false);
                return;
            case 19:
                fo.b1(foVar);
                return;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", foVar.a());
                foVar.presentFragment(new zo(bundle2));
                return;
            case 21:
                fo.m0(foVar);
                return;
            case 22:
                fo.Y0(foVar);
                return;
            case 23:
                fo.i0(foVar);
                return;
            case 24:
                foVar.ga(false);
                return;
            case 25:
                SparseArray[] sparseArrayArr = foVar.W5;
                for (int i18 = 1; i18 >= 0; i18--) {
                    if (messageObject == null && sparseArrayArr[i18].size() != 0) {
                        messageObject = (MessageObject) foVar.f36052o6[i18].get(sparseArrayArr[i18].keyAt(0));
                    }
                    sparseArrayArr[i18].clear();
                    foVar.X5[i18].clear();
                    foVar.Y5[i18].clear();
                }
                foVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.f19237id) > 0 || (i10 < 0 && foVar.h != null))) {
                    foVar.Fb(messageObject);
                }
                foVar.Cc(0, true);
                foVar.ad(false);
                foVar.Pc();
                return;
            case 26:
                fo.c1(foVar);
                return;
            case 27:
                fo foVar5 = this.f36385b;
                MessageObject messageObject3 = foVar5.p5;
                if (messageObject3 != null) {
                    foVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    return;
                }
                return;
            case 28:
                if (!foVar.J9()) {
                    str = null;
                }
                foVar.qa(str);
                return;
            default:
                foVar.T7();
                foVar.y3.m(foVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                return;
        }
    }
}

package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class gg implements Runnable {
    public final int f23356a = 0;
    public final boolean f23357b;
    public final long f23358c;
    public final Object d;
    public final Object e;
    public final Object f23359f;
    public final Object h;

    public gg(jg jgVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.d = jgVar;
        this.e = editTextBoldCursor;
        this.f23359f = str;
        this.h = document;
        this.f23358c = j3;
        this.f23357b = z10;
    }

    @Override
    public final void run() {
        y5 y5Var;
        SpannableStringBuilder replaceTags;
        int i10 = this.f23356a;
        long j3 = this.f23358c;
        boolean z10 = this.f23357b;
        Object obj = this.h;
        Object obj2 = this.f23359f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((jg) obj4).f24397a;
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.R2 = 2;
                            if (str == null) {
                                str = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str);
                            if (document != null) {
                                y5Var = new y5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                y5Var = new y5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                y5Var.fromEmojiKeyboard = true;
                            }
                            y5Var.cacheType = p5.g();
                            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        chatActivityEnterView.R2 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.R2 = 0;
                        throw th2;
                    }
                }
                return;
            case 1:
                org.telegram.ui.j60.y((org.telegram.ui.j60) obj4, (org.telegram.ui.ActionBar.d2[]) obj3, this.f23357b, (TLRPC.TL_error) obj2, this.f23358c, (TL_phone.inviteToGroupCall) obj);
                return;
            case 2:
                org.telegram.ui.n01 n01Var = (org.telegram.ui.n01) obj4;
                ProfileActivity profileActivity = n01Var.f35089b;
                org.telegram.ui.rq rqVar = new org.telegram.ui.rq(profileActivity.f30381e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                rqVar.X0 = new org.telegram.ui.m01(n01Var, (org.telegram.ui.wy) obj);
                profileActivity.presentFragment(rqVar);
                return;
            case 3:
                xh.h hVar = (xh.h) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    hVar.h0(this.f23357b, this.f23358c, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 4:
                zh.a3 a3Var = (zh.a3) obj4;
                final MessagesController messagesController = (MessagesController) obj3;
                String str2 = (String) obj2;
                TLObject tLObject2 = (TLObject) obj;
                zh.i5 storiesController = messagesController.getStoriesController();
                final long j10 = this.f23358c;
                final boolean z11 = this.f23357b;
                storiesController.i0(j10, z11, false);
                n7.a1 a1Var = new n7.a1(5, (byte) 0);
                a1Var.f13938b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                messagesController.getStoriesController().i0(j10, !z11, false);
                                return;
                            default:
                                messagesController.getStoriesController().i0(j10, z11, true);
                                return;
                        }
                    }
                };
                a1Var.f13939c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                messagesController.getStoriesController().i0(j10, !z11, false);
                                return;
                            default:
                                messagesController.getStoriesController().i0(j10, z11, true);
                                return;
                        }
                    }
                };
                if (!z11) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str2, null, 10)));
                } else {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str2, null, 10)));
                }
                pc V = new wc(a3Var.f48164d1, a3Var.B0).V(Arrays.asList(tLObject2), replaceTags, null, a1Var);
                V.f26075a = 2;
                V.k(true);
                return;
            default:
                zh.i5 i5Var = (zh.i5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                e2.h hVar2 = (e2.h) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            MessagesController messagesController2 = MessagesController.getInstance(i5Var.f48499a);
                            ChannelBoostsController boostsController = messagesController2.getBoostsController();
                            long j11 = this.f23358c;
                            boostsController.getBoostsStats(j11, new org.telegram.ui.to(i5Var, hVar2, messagesController2, j11, 3));
                            return;
                        }
                        hVar2.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (z10 && R != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, f6Var);
                            String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            d2Var.R = string;
                            d2Var.T = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                            hc.b.A(R.string.OK, alertDialog$Builder, null);
                        }
                        hVar2.accept(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                        if (z10 && R2 != null) {
                            R2.showDialog(new qg.a1(R2, 14, true));
                        }
                        hVar2.accept(Boolean.FALSE);
                        return;
                    } else {
                        wc X = wc.X();
                        if (X != null) {
                            X.d0(tL_error, false);
                        }
                        hVar2.accept(Boolean.FALSE);
                        return;
                    }
                }
                hVar2.accept(Boolean.TRUE);
                return;
        }
    }

    public gg(org.telegram.ui.j60 j60Var, org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = j60Var;
        this.e = d2VarArr;
        this.f23357b = z10;
        this.f23359f = tL_error;
        this.f23358c = j3;
        this.h = invitetogroupcall;
    }

    public gg(org.telegram.ui.n01 n01Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, org.telegram.ui.wy wyVar) {
        this.d = n01Var;
        this.f23358c = j3;
        this.e = tL_chatAdminRights;
        this.f23359f = str;
        this.f23357b = z10;
        this.h = wyVar;
    }

    public gg(xh.h hVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = hVar;
        this.e = tL_error;
        this.f23359f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f23357b = z10;
        this.f23358c = j3;
    }

    public gg(zh.a3 a3Var, MessagesController messagesController, long j3, boolean z10, String str, TLObject tLObject) {
        this.d = a3Var;
        this.e = messagesController;
        this.f23358c = j3;
        this.f23357b = z10;
        this.f23359f = str;
        this.h = tLObject;
    }

    public gg(zh.i5 i5Var, TLRPC.TL_error tL_error, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = i5Var;
        this.e = tL_error;
        this.f23357b = z10;
        this.f23358c = j3;
        this.f23359f = hVar;
        this.h = f6Var;
    }
}

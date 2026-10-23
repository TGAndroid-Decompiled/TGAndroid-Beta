package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ae0 implements View.OnClickListener {
    public final int f35659a;
    public final Object f35660b;
    public final Object f35661c;

    public ae0(int i10, Object obj, Object obj2) {
        this.f35659a = i10;
        this.f35661c = obj;
        this.f35660b = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        int i18;
        long j10;
        com.google.android.gms.internal.cast.z5 z5Var;
        int i19 = 8;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.b3 b3Var = null;
        int i20 = 0;
        switch (this.f35659a) {
            case 0:
                be0 be0Var = (be0) this.f35661c;
                Context context = (Context) this.f35660b;
                ig0 ig0Var = be0Var.f36068y;
                if (ig0Var.V.getTag() == null) {
                    if (be0Var.f36063n.has_recovery) {
                        ig0Var.r1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_requestPasswordRecovery, new yd0(be0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(be0Var.f36059a);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder.h(LocaleController.getString(R.string.ResetAccount), new xt(be0Var, 18));
                    alertDialog$Builder.p();
                    return;
                }
                return;
            case 1:
                mf0 mf0Var = (mf0) this.f35661c;
                Context context2 = (Context) this.f35660b;
                Bundle bundle = mf0Var.f39556q0;
                if (bundle != null && (tL_auth_sentCode = mf0Var.f39558r0) != null) {
                    mf0Var.f39562u0.k1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!mf0Var.f39545f0) {
                    kf0 kf0Var = mf0Var.v;
                    if ((kf0Var == null || kf0Var.getVisibility() == 8) && !mf0Var.f39550k0) {
                        if (mf0Var.f39548i0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = mf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = mf0Var.f39540c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            mf0Var.f39562u0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                            alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder2.f20678a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, mf0Var.f39538b));
                            alertDialog$Builder2.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new ks(26, mf0Var, context2));
                            alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder2.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new bf0(mf0Var, 1));
                            alertDialog$Builder2.p();
                            return;
                        } else if (mf0Var.f39562u0.V.getTag() == null) {
                            mf0Var.w();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                hg0 hg0Var = (hg0) this.f35661c;
                Context context3 = (Context) this.f35660b;
                Toast toast = hg0Var.Q;
                if (toast != null) {
                    toast.cancel();
                    hg0Var.Q = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (hg0Var.O > 0 && currentTimeMillis - hg0Var.P > 1500) {
                    i11 = 0;
                    hg0Var.O = 0;
                } else {
                    i11 = 0;
                }
                int i21 = hg0Var.O + 1;
                hg0Var.O = i21;
                hg0Var.P = currentTimeMillis;
                if (i21 >= 5) {
                    hg0Var.O = i11;
                    hg0Var.P = 0L;
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hg0Var.getContext());
                    alertDialog$Builder3.f20678a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i12 = R.string.DebugMenuDisableLogs;
                    } else {
                        i12 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder3.f(new String[]{LocaleController.getString(i12), LocaleController.getString(R.string.DebugSendLogs)}, new o4(hg0Var, 2));
                    alertDialog$Builder3.p();
                    return;
                } else if (i21 > 1) {
                    Toast makeText = Toast.makeText(context3, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i21, new Object[0]), 0);
                    hg0Var.Q = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 3:
                MessageObject messageObject = (MessageObject) this.f35660b;
                yi0 yi0Var = ((wi0) this.f35661c).d;
                if (!yi0Var.b0(messageObject)) {
                    yi0Var.getOrCreateStoryViewer().F(yi0Var.getParentActivity(), messageObject.storyItem, ci.q7.a(yi0Var.f43881f));
                    return;
                }
                return;
            case 4:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35661c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f35660b;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i13 = 144;
                } else {
                    i13 = 128;
                }
                editTextBoldCursor.setInputType(i13 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f33533s;
                if (atomicBoolean.get()) {
                    i14 = org.telegram.ui.ActionBar.k6.f21327l6;
                } else {
                    i14 = org.telegram.ui.ActionBar.k6.H6;
                }
                org.telegram.ui.ActionBar.r6.t(imageView, i14, null, PorterDuff.Mode.SRC_ATOP);
                return;
            case 5:
                io0.h0((io0) this.f35661c, (String) this.f35660b, view);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.f35661c;
                org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) this.f35660b;
                if (photoViewer.T4 != null) {
                    j80Var.u();
                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer.f33652m4;
                    if (o2Var instanceof sn) {
                        ((sn) o2Var).O9(photoViewer.T4, false, true);
                    }
                    pf.d.q(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f35661c;
                Activity activity = (Activity) this.f35660b;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.J1() && !photoViewer2.f33692r) {
                    int i22 = photoViewer2.P4;
                    if (i22 >= 0 && i22 < photoViewer2.f33604g7.size()) {
                        Object obj = photoViewer2.f33604g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f33625j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ei.x3 x3Var = photoViewer2.f33634k1;
                                if (x3Var != null) {
                                    x3Var.e(true);
                                    photoViewer2.f33634k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f33634k1 = new ei.x3(photoViewer2.E, 3);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i15 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i15 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) LocaleController.getString(i15));
                                    if (isHighQuality) {
                                        i16 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i16 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.xq(i16, 0), 0, 1, 33);
                                    photoViewer2.f33634k1.s(append);
                                    photoViewer2.f33580e0.addView(photoViewer2.f33634k1, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f33634k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f33634k1.m(0.0f, (photoViewer2.f33625j1.getWidth() / 2.0f) + photoViewer2.f33625j1.getX() + photoViewer2.H0.getX());
                                    ei.x3 x3Var2 = photoViewer2.f33634k1;
                                    x3Var2.f10097l0 = new dh(2, x3Var2);
                                    x3Var2.d = 3500L;
                                    x3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f33625j1.getTag() == null) {
                        if (photoViewer2.f33641k8) {
                            if (photoViewer2.f33649m1 == null) {
                                eu0 eu0Var = photoViewer2.f33580e0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.kr0(textView, 18);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                eu0Var.addView((View) textView, w7.z5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f33649m1 = textView;
                            }
                            photoViewer2.f33649m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.z21 z21Var = photoViewer2.f33649m1;
                            org.telegram.ui.Components.w71 w71Var = photoViewer2.f33625j1;
                            org.telegram.ui.Components.kr0 kr0Var = z21Var.d;
                            if (w71Var != null) {
                                z21Var.f33128a = w71Var;
                                z21Var.a();
                                z21Var.f33130c = true;
                                AndroidUtilities.cancelRunOnUIThread(kr0Var);
                                AndroidUtilities.runOnUIThread(kr0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = z21Var.f33129b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    z21Var.f33129b.cancel();
                                    z21Var.f33129b = null;
                                }
                                if (z21Var.getVisibility() != 0) {
                                    z21Var.setAlpha(0.0f);
                                    z21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = z21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    z21Var.f33129b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.a3(true);
                    photoViewer2.r2(1);
                    return;
                }
                return;
            case 8:
                ((org.telegram.ui.Components.j80) this.f35661c).K((org.telegram.ui.Components.j80) this.f35660b);
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35661c;
                ((AlertDialog$Builder) this.f35660b).f20678a.N0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i17 = 30;
                } else if (num.intValue() == 1) {
                    i17 = 90;
                } else if (num.intValue() == 2) {
                    i17 = 182;
                } else if (num.intValue() == 3) {
                    i17 = 365;
                } else if (num.intValue() == 4) {
                    i17 = 548;
                } else if (num.intValue() == 5) {
                    i17 = 730;
                } else {
                    i17 = 0;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.f20762i0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i17;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new wr0(privacySettingsActivity, c2Var, setaccountttl, 2));
                return;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.f35661c;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                pf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f35660b).url);
                return;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f35661c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f35660b;
                long j12 = profileActivity2.f33921f1;
                long j13 = profileActivity2.F1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                dq dqVar = new dq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                dqVar.Y0 = new uy0(profileActivity2, chat, dqVar);
                profileActivity2.presentFragment(dqVar);
                return;
            case 12:
                w11 w11Var = (w11) this.f35661c;
                Context context4 = (Context) this.f35660b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = w11Var.f42891a[0].getText().toString();
                String obj3 = w11Var.f42891a[3].getText().toString();
                String obj4 = w11Var.f42891a[2].getText().toString();
                String obj5 = w11Var.f42891a[1].getText().toString();
                String obj6 = w11Var.f42891a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj2)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj5)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    }
                    if (w11Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                        str = "https://t.me/socks?";
                    }
                    if (sb2.length() != 0) {
                        StringBuilder u10 = a1.g.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context4, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        jj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        w11Var.showDialog(jj0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 13:
                q41 q41Var = (q41) this.f35661c;
                Context context5 = (Context) this.f35660b;
                if (q41Var.f43506w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    ql0 ql0Var = new ql0(15, q41Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.f5.f26167a;
                    if (context5 != null) {
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21289j5, false);
                        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ji, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ni, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                        org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21272i6, false);
                        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                        org.telegram.ui.ActionBar.b3 b3Var2 = new org.telegram.ui.ActionBar.b3(context5, null);
                        b3Var2.a();
                        org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(context5, null);
                        qd0Var.setTextColor(x02);
                        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        qd0Var.setItemCount(5);
                        org.telegram.ui.Components.qd0 qd0Var2 = new org.telegram.ui.Components.qd0(context5, null);
                        qd0Var2.setItemCount(5);
                        qd0Var2.setTextColor(x02);
                        qd0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.qd0 qd0Var3 = new org.telegram.ui.Components.qd0(context5, null);
                        qd0Var3.setItemCount(5);
                        qd0Var3.setTextColor(x02);
                        qd0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context5, qd0Var, qd0Var2, qd0Var3, 3);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context5);
                        w3Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context5);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(x02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new di.d(10));
                        LinearLayout linearLayout = new LinearLayout(context5);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.wd wdVar = new ai.wd(context5, 17);
                        linearLayout.addView(qd0Var, w7.z5.l(0.5f, 0, 270));
                        qd0Var.setMinValue(0);
                        qd0Var.setMaxValue(365);
                        qd0Var.setWrapSelectorWheel(false);
                        qd0Var.setFormatter(new tr(15));
                        ai.u2 u2Var = new ai.u2(qd0Var, qd0Var2, qd0Var3, 18);
                        qd0Var.setOnValueChangedListener(u2Var);
                        qd0Var2.setMinValue(0);
                        qd0Var2.setMaxValue(23);
                        linearLayout.addView(qd0Var2, w7.z5.l(0.2f, 0, 270));
                        qd0Var2.setFormatter(new tr(16));
                        qd0Var2.setOnValueChangedListener(u2Var);
                        qd0Var3.setMinValue(0);
                        qd0Var3.setMaxValue(59);
                        qd0Var3.setValue(0);
                        qd0Var3.setFormatter(new tr(17));
                        linearLayout.addView(qd0Var3, w7.z5.l(0.3f, 0, 270));
                        qd0Var3.setOnValueChangedListener(u2Var);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j14 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j14 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j14);
                            if (timeInMillis >= 0) {
                                qd0Var3.setValue(calendar.get(12));
                                qd0Var2.setValue(calendar.get(11));
                                qd0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.f5.g(null, null, 0L, 0L, 0, qd0Var, qd0Var2, qd0Var3);
                        wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        wdVar.setGravity(17);
                        wdVar.setTextColor(x04);
                        wdVar.setTextSize(1, 14.0f);
                        wdVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        wdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, x05, x06, x06));
                        wdVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(wdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(qd0Var, qd0Var2, qd0Var3, calendar, ql0Var, b3Var2, 1);
                        b3Var = b3Var2;
                        wdVar.setOnClickListener(m0Var);
                        b3Var.b(w3Var);
                        org.telegram.ui.ActionBar.h3 h3Var = b3Var.f20728a;
                        h3Var.show();
                        h3Var.setBackgroundColor(x03);
                        h3Var.fixNavigationBar(x03);
                    }
                    b3Var.f20728a.setOnHideListener(new ai.z3(q41Var, zArr, 13));
                    org.telegram.ui.ActionBar.h3 h3Var2 = b3Var.f20728a;
                    h3Var2.show();
                    q41Var.f43506w = h3Var2;
                    q41Var.c(false);
                    return;
                }
                return;
            case 14:
                o61 o61Var = (o61) this.f35661c;
                ai.k4 k4Var = (ai.k4) this.f35660b;
                if (o61Var.Z.g() != 0) {
                    k4Var.run(new ArrayList(o61Var.f40082a0.values()));
                    o61Var.dismiss();
                    return;
                }
                return;
            case 15:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f35661c;
                ((AlertDialog$Builder) this.f35660b).f20678a.N0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i18 = 7;
                } else if (num2.intValue() == 1) {
                    i18 = 90;
                } else if (num2.intValue() == 2) {
                    i18 = 183;
                } else if (num2.intValue() == 3) {
                    i18 = 365;
                } else {
                    i18 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i18;
                sessionsActivity.f34151s = i18;
                l71 l71Var = sessionsActivity.f34145a;
                if (l71Var != null) {
                    l71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ci.d6(8));
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f35661c;
                editTextBoldCursor2.setText(ai.nd.N0(((Long) this.f35660b).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 17:
                u91 u91Var = ((z81) this.f35661c).f44081d0;
                u91Var.getOrCreateStoryViewer().C(u91Var.getParentActivity(), ((r91) this.f35660b).b(), u91Var.f42344z0, ci.q7.a(u91Var.S));
                return;
            case 18:
                d91 d91Var = (d91) this.f35661c;
                lg.f fVar = (lg.f) this.f35660b;
                int i23 = d91Var.f36575c;
                e91 e91Var = d91Var.d;
                org.telegram.ui.Components.a10 a10Var = d91Var.f36573a;
                if (a10Var.f24586c) {
                    ArrayList arrayList = e91Var.f36882n;
                    jg.g gVar = e91Var.f36880c;
                    int size = arrayList.size();
                    int i24 = 0;
                    while (true) {
                        if (i24 < size) {
                            if (i24 == i23 || !((d91) arrayList.get(i24)).f36573a.f24586c || !((d91) arrayList.get(i24)).f36573a.f24585b) {
                                i24++;
                            }
                        } else {
                            i20 = 1;
                        }
                    }
                    e91Var.f();
                    if (i20 != 0) {
                        AndroidUtilities.shakeView(a10Var);
                        return;
                    }
                    a10Var.setChecked(!a10Var.f24585b);
                    fVar.f16126n = a10Var.f24585b;
                    e91Var.f36879b.z();
                    if (e91Var.f36883r.f37533c > 0 && i23 < gVar.d.size()) {
                        ((lg.f) gVar.d.get(i23)).f16126n = a10Var.f24585b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ey eyVar = (ey) this.f35660b;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eyVar.getParentActivity());
                alertDialog$Builder4.f20678a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder4.f20678a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder4.k(LocaleController.getString(R.string.CacheClear), new ql0(17, (ca1) this.f35661c, eyVar));
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder4.f20678a;
                eyVar.showDialog(c2Var2);
                TextView textView3 = (TextView) c2Var2.d(-1);
                if (textView3 != null) {
                    org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.f21421q7, null);
                    return;
                }
                return;
            case 20:
                uc1 uc1Var = (uc1) this.f35661c;
                Context context6 = (Context) this.f35660b;
                if (uc1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b3 b3Var3 = new org.telegram.ui.ActionBar.b3(uc1Var.getParentActivity(), null);
                    b3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context6);
                    linearLayout2.setOrientation(1);
                    TextView textView4 = new TextView(context6);
                    textView4.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.v0.q(textView4, org.telegram.ui.ActionBar.k6.f21289j5, null, 1, 20.0f);
                    linearLayout2.addView(textView4, w7.z5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView4.setOnTouchListener(new di.d(2));
                    b3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.k6.F.size();
                    while (i20 < size2) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i20);
                        TLRPC.TL_theme tL_theme = j6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(j6Var);
                        }
                        i20++;
                    }
                    wa1 wa1Var = new wa1(context6, uc1Var, arrayList2, new ArrayList(), b3Var3);
                    linearLayout2.addView(wa1Var, w7.z5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    wa1Var.D1(uc1Var.fragmentView.getMeasuredWidth());
                    uc1Var.showDialog(b3Var3.f20728a);
                    return;
                }
                return;
            case 21:
                oh1 oh1Var = (oh1) this.f35661c;
                Context context7 = (Context) this.f35660b;
                ug.l1 l1Var = oh1Var.M;
                if (l1Var != null) {
                    l1Var.dismiss();
                    oh1Var.M = null;
                }
                ug.l1 l1Var2 = new ug.l1(context7, oh1Var.f40163a, null, 4, new ci.k0());
                TLRPC.User user = oh1Var.f40169c;
                if (user != null) {
                    j10 = user.f20490id;
                } else {
                    j10 = 0;
                }
                TLRPC.User user2 = oh1Var.d;
                if (user2 != null) {
                    j11 = user2.f20490id;
                }
                long[] jArr = {j10, j11};
                for (int i25 = 0; i25 < 2; i25++) {
                    l1Var2.C0.add(Long.valueOf(jArr[i25]));
                }
                l1Var2.h0(false, true);
                l1Var2.D0 = new ih.b(2);
                oh1Var.M = l1Var2;
                l1Var2.show();
                return;
            case 22:
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.f35660b;
                if (!((ei.d) this.f35661c).Q) {
                    j2Var.dismiss();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.f35660b;
                if (!((org.telegram.ui.Wallet.a2) this.f35661c).f34281m) {
                    i2Var.dismiss();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.f35661c;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f35660b;
                if (y2Var.e && !y2Var.R) {
                    org.telegram.ui.Wallet.o5.E0(y2Var.getContext(), o2Var2.getCurrentAccount(), o2Var2.getResourceProvider());
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Wallet.j4 j4Var = (org.telegram.ui.Wallet.j4) this.f35661c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f35660b;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    j4Var.dismiss();
                    org.telegram.ui.Wallet.s9 s9Var = new org.telegram.ui.Wallet.s9();
                    s9Var.i0(nftitem);
                    U.presentFragment(s9Var);
                    return;
                }
                return;
            case 26:
                ((Runnable) this.f35661c).run();
                ((org.telegram.ui.Wallet.j2[]) this.f35660b)[0].dismiss();
                return;
            case 27:
                org.telegram.ui.Wallet.o5.g0((org.telegram.ui.Wallet.o5) this.f35661c, (Context) this.f35660b, view);
                return;
            case 28:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.f35661c;
                TextView textView5 = (TextView) this.f35660b;
                z1Var.c(!z1Var.b(), true);
                if (z1Var.b()) {
                    i19 = 0;
                }
                textView5.setVisibility(i19);
                return;
            default:
                ei.d dVar = (ei.d) this.f35661c;
                int[] iArr = (int[]) this.f35660b;
                if (!dVar.Q && (z5Var = gi1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = z5Var.h();
                        com.google.android.gms.common.api.internal.s0 s0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6368c).h;
                        b8.e eVar = new b8.e(s0Var, (String) z5Var.f6892a, "/tg-wear-auth/answer", h);
                        s0Var.f6503b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f50460a).addOnSuccessListener(new e7(z5Var, dVar, iArr, 24)).addOnFailureListener(new ei1(dVar, 0));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
        }
    }
}

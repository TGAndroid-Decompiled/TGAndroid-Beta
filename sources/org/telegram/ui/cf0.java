package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cf0 implements View.OnClickListener {
    public final int f35954a;
    public final Object f35955b;
    public final Object f35956c;

    public cf0(int i10, Object obj, Object obj2) {
        this.f35954a = i10;
        this.f35956c = obj;
        this.f35955b = obj2;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        int i17;
        long j10;
        com.google.android.gms.internal.cast.z5 z5Var;
        int i18 = 8;
        long j11 = 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i19 = 0;
        switch (this.f35954a) {
            case 0:
                gf0 gf0Var = (gf0) this.f35956c;
                Context context = (Context) this.f35955b;
                Bundle bundle = gf0Var.f37329o0;
                if (bundle != null && (tL_auth_sentCode = gf0Var.f37330p0) != null) {
                    gf0Var.f37335s0.g1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!gf0Var.f37317d0) {
                    ef0 ef0Var = gf0Var.v;
                    if ((ef0Var == null || ef0Var.getVisibility() == 8) && !gf0Var.f37323i0) {
                        if (gf0Var.f37321g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = gf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = gf0Var.f37315c;
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
                            gf0Var.f37335s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                            alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder.f20604a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, gf0Var.f37313b));
                            alertDialog$Builder.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new xu(24, gf0Var, context));
                            alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new ue0(gf0Var, 1));
                            alertDialog$Builder.o();
                            return;
                        } else if (gf0Var.f37335s0.V.getTag() == null) {
                            gf0Var.x();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                bg0 bg0Var = (bg0) this.f35956c;
                Context context2 = (Context) this.f35955b;
                Toast toast = bg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    bg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (bg0Var.M > 0 && currentTimeMillis - bg0Var.N > 1500) {
                    i10 = 0;
                    bg0Var.M = 0;
                } else {
                    i10 = 0;
                }
                int i20 = bg0Var.M + 1;
                bg0Var.M = i20;
                bg0Var.N = currentTimeMillis;
                if (i20 >= 5) {
                    bg0Var.M = i10;
                    bg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bg0Var.getContext());
                    alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i11 = R.string.DebugMenuDisableLogs;
                    } else {
                        i11 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder2.f(new String[]{LocaleController.getString(i11), LocaleController.getString(R.string.DebugSendLogs)}, new p4(bg0Var, 2));
                    alertDialog$Builder2.o();
                    return;
                } else if (i20 > 1) {
                    Toast makeText = Toast.makeText(context2, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i20, new Object[0]), 0);
                    bg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 2:
                MessageObject messageObject = (MessageObject) this.f35955b;
                ti0 ti0Var = ((ri0) this.f35956c).d;
                if (!ti0Var.a0(messageObject)) {
                    ti0Var.getOrCreateStoryViewer().F(ti0Var.getParentActivity(), messageObject.storyItem, ci.r7.a(ti0Var.f41692f));
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35956c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f35955b;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i12 = 144;
                } else {
                    i12 = 128;
                }
                editTextBoldCursor.setInputType(i12 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f33225s;
                if (atomicBoolean.get()) {
                    i13 = org.telegram.ui.ActionBar.h6.f21133l6;
                } else {
                    i13 = org.telegram.ui.ActionBar.h6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                return;
            case 4:
                eo0.h0((eo0) this.f35956c, (String) this.f35955b, view);
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f35956c;
                org.telegram.ui.Components.i80 i80Var = (org.telegram.ui.Components.i80) this.f35955b;
                if (photoViewer.T4 != null) {
                    i80Var.u();
                    org.telegram.ui.ActionBar.n2 n2Var = photoViewer.f33344m4;
                    if (n2Var instanceof qn) {
                        ((qn) n2Var).O9(photoViewer.T4, false, true);
                    }
                    pf.d.q(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f35956c;
                Activity activity = (Activity) this.f35955b;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.I1() && !photoViewer2.f33384r) {
                    int i21 = photoViewer2.P4;
                    if (i21 >= 0 && i21 < photoViewer2.f33296g7.size()) {
                        Object obj = photoViewer2.f33296g7.get(photoViewer2.P4);
                        if (obj instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f33317j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ei.x3 x3Var = photoViewer2.f33326k1;
                                if (x3Var != null) {
                                    x3Var.e(true);
                                    photoViewer2.f33326k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f33326k1 = new ei.x3(photoViewer2.E, 3);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i14 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i14 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) LocaleController.getString(i14));
                                    if (isHighQuality) {
                                        i15 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i15 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.yq(i15, 0), 0, 1, 33);
                                    photoViewer2.f33326k1.s(append);
                                    photoViewer2.f33272e0.addView(photoViewer2.f33326k1, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f33326k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f33326k1.m(0.0f, (photoViewer2.f33317j1.getWidth() / 2.0f) + photoViewer2.f33317j1.getX() + photoViewer2.H0.getX());
                                    ei.x3 x3Var2 = photoViewer2.f33326k1;
                                    x3Var2.f10082l0 = new dh(2, x3Var2);
                                    x3Var2.d = 3500L;
                                    x3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f33317j1.getTag() == null) {
                        if (photoViewer2.f33333k8) {
                            if (photoViewer2.f33341m1 == null) {
                                bu0 bu0Var = photoViewer2.f33272e0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.gr0(textView, 17);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                bu0Var.addView((View) textView, w7.z5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f33341m1 = textView;
                            }
                            photoViewer2.f33341m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.u21 u21Var = photoViewer2.f33341m1;
                            org.telegram.ui.Components.o71 o71Var = photoViewer2.f33317j1;
                            org.telegram.ui.Components.gr0 gr0Var = u21Var.d;
                            if (o71Var != null) {
                                u21Var.f30869a = o71Var;
                                u21Var.a();
                                u21Var.f30871c = true;
                                AndroidUtilities.cancelRunOnUIThread(gr0Var);
                                AndroidUtilities.runOnUIThread(gr0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = u21Var.f30870b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    u21Var.f30870b.cancel();
                                    u21Var.f30870b = null;
                                }
                                if (u21Var.getVisibility() != 0) {
                                    u21Var.setAlpha(0.0f);
                                    u21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = u21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    u21Var.f30870b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.Y2(true);
                    photoViewer2.p2(1);
                    return;
                }
                return;
            case 7:
                ((org.telegram.ui.Components.i80) this.f35956c).K((org.telegram.ui.Components.i80) this.f35955b);
                return;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35956c;
                ((AlertDialog$Builder) this.f35955b).f20604a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i16 = 30;
                } else if (num.intValue() == 1) {
                    i16 = 90;
                } else if (num.intValue() == 2) {
                    i16 = 182;
                } else if (num.intValue() == 3) {
                    i16 = 365;
                } else if (num.intValue() == 4) {
                    i16 = 548;
                } else if (num.intValue() == 5) {
                    i16 = 730;
                } else {
                    i16 = 0;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(privacySettingsActivity.getParentActivity(), 3, null);
                b2Var.f20664g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i16;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new tr0(privacySettingsActivity, b2Var, setaccountttl, 2));
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f35956c;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                pf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f35955b).url);
                return;
            case 10:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f35956c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f35955b;
                long j12 = profileActivity2.f33613f1;
                long j13 = profileActivity2.F1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.H2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                bq bqVar = new bq(j12, j13, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                bqVar.X0 = new py0(profileActivity2, chat, bqVar);
                profileActivity2.presentFragment(bqVar);
                return;
            case 11:
                s11 s11Var = (s11) this.f35956c;
                Context context3 = (Context) this.f35955b;
                StringBuilder sb2 = new StringBuilder();
                String obj2 = s11Var.f41311a[0].getText().toString();
                String obj3 = s11Var.f41311a[3].getText().toString();
                String obj4 = s11Var.f41311a[2].getText().toString();
                String obj5 = s11Var.f41311a[1].getText().toString();
                String obj6 = s11Var.f41311a[4].getText().toString();
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
                    if (s11Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
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
                    }
                    if (sb2.length() != 0) {
                        StringBuilder u10 = a1.g.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.fj0 fj0Var = new org.telegram.ui.Components.fj0(context3, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        fj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        s11Var.showDialog(fj0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                m41 m41Var = (m41) this.f35956c;
                Context context4 = (Context) this.f35955b;
                if (m41Var.f41597w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    en0 en0Var = new en0(13, m41Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.f5.f26101a;
                    if (context4 != null) {
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21095j5, false);
                        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21060h5, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                        org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21078i6, false);
                        int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context4, null);
                        a3Var2.a();
                        org.telegram.ui.Components.od0 od0Var = new org.telegram.ui.Components.od0(context4, null);
                        od0Var.setTextColor(x02);
                        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        od0Var.setItemCount(5);
                        org.telegram.ui.Components.od0 od0Var2 = new org.telegram.ui.Components.od0(context4, null);
                        od0Var2.setItemCount(5);
                        od0Var2.setTextColor(x02);
                        od0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.od0 od0Var3 = new org.telegram.ui.Components.od0(context4, null);
                        od0Var3.setItemCount(5);
                        od0Var3.setTextColor(x02);
                        od0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.x3 x3Var3 = new org.telegram.ui.Components.x3(context4, od0Var, od0Var2, od0Var3, 3);
                        x3Var3.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context4);
                        x3Var3.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context4);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(x02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new di.d(10));
                        LinearLayout linearLayout = new LinearLayout(context4);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        x3Var3.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.vd vdVar = new ai.vd(context4, 18);
                        linearLayout.addView(od0Var, w7.z5.l(0.5f, 0, 270));
                        od0Var.setMinValue(0);
                        od0Var.setMaxValue(365);
                        od0Var.setWrapSelectorWheel(false);
                        od0Var.setFormatter(new rr(11));
                        ai.v2 v2Var = new ai.v2(od0Var, od0Var2, od0Var3, 18);
                        od0Var.setOnValueChangedListener(v2Var);
                        od0Var2.setMinValue(0);
                        od0Var2.setMaxValue(23);
                        linearLayout.addView(od0Var2, w7.z5.l(0.2f, 0, 270));
                        od0Var2.setFormatter(new rr(12));
                        od0Var2.setOnValueChangedListener(v2Var);
                        od0Var3.setMinValue(0);
                        od0Var3.setMaxValue(59);
                        od0Var3.setValue(0);
                        od0Var3.setFormatter(new rr(13));
                        linearLayout.addView(od0Var3, w7.z5.l(0.3f, 0, 270));
                        od0Var3.setOnValueChangedListener(v2Var);
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
                                od0Var3.setValue(calendar.get(12));
                                od0Var2.setValue(calendar.get(11));
                                od0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.f5.f(null, null, 0L, 0L, 0, od0Var, od0Var2, od0Var3);
                        vdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        vdVar.setGravity(17);
                        vdVar.setTextColor(x04);
                        vdVar.setTextSize(1, 14.0f);
                        vdVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        vdVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x05, x06, x06));
                        vdVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        x3Var3.addView(vdVar, w7.z5.t(-1, 48, 83, 16, 15, 16, 16));
                        vdVar.setOnClickListener(new org.telegram.ui.Components.m0(od0Var, od0Var2, od0Var3, calendar, en0Var, a3Var2, 1));
                        a3Var2.b(x3Var3);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.f20612a;
                        f3Var.show();
                        f3Var.setBackgroundColor(x03);
                        f3Var.fixNavigationBar(x03);
                        a3Var = a3Var2;
                    }
                    a3Var.f20612a.setOnHideListener(new ai.y3(m41Var, zArr, 13));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.f20612a;
                    f3Var2.show();
                    m41Var.f41597w = f3Var2;
                    m41Var.c(false);
                    return;
                }
                return;
            case 13:
                k61 k61Var = (k61) this.f35956c;
                ai.k4 k4Var = (ai.k4) this.f35955b;
                if (k61Var.Z.g() != 0) {
                    k4Var.run(new ArrayList(k61Var.f38421a0.values()));
                    k61Var.dismiss();
                    return;
                }
                return;
            case 14:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f35956c;
                ((AlertDialog$Builder) this.f35955b).f20604a.L0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i17 = 7;
                } else if (num2.intValue() == 1) {
                    i17 = 90;
                } else if (num2.intValue() == 2) {
                    i17 = 183;
                } else if (num2.intValue() == 3) {
                    i17 = 365;
                } else {
                    i17 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i17;
                sessionsActivity.v = i17;
                h71 h71Var = sessionsActivity.f33835a;
                if (h71Var != null) {
                    h71Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ci.e6(8));
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f35956c;
                editTextBoldCursor2.setText(ai.md.N0(((Long) this.f35955b).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 16:
                p91 p91Var = ((u81) this.f35956c).f41883d0;
                p91Var.getOrCreateStoryViewer().C(p91Var.getParentActivity(), ((m91) this.f35955b).b(), p91Var.f40164z0, ci.r7.a(p91Var.S));
                return;
            case 17:
                y81 y81Var = (y81) this.f35956c;
                lg.f fVar = (lg.f) this.f35955b;
                int i22 = y81Var.f43387c;
                z81 z81Var = y81Var.d;
                org.telegram.ui.Components.a10 a10Var = y81Var.f43385a;
                if (a10Var.f24449c) {
                    ArrayList arrayList = z81Var.f43673n;
                    jg.g gVar = z81Var.f43671c;
                    int size = arrayList.size();
                    int i23 = 0;
                    while (true) {
                        if (i23 < size) {
                            if (i23 == i22 || !((y81) arrayList.get(i23)).f43385a.f24449c || !((y81) arrayList.get(i23)).f43385a.f24448b) {
                                i23++;
                            }
                        } else {
                            i19 = 1;
                        }
                    }
                    z81Var.f();
                    if (i19 != 0) {
                        AndroidUtilities.shakeView(a10Var);
                        return;
                    }
                    a10Var.setChecked(true ^ a10Var.f24448b);
                    fVar.f16065n = a10Var.f24448b;
                    z81Var.f43670b.z();
                    if (z81Var.f43674r.f35553c > 0 && i22 < gVar.d.size()) {
                        ((lg.f) gVar.d.get(i22)).f16065n = a10Var.f24448b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                cy cyVar = (cy) this.f35955b;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(cyVar.getParentActivity());
                alertDialog$Builder3.f20604a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder3.f20604a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder3.k(LocaleController.getString(R.string.CacheClear), new en0(15, (x91) this.f35956c, cyVar));
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder3.f20604a;
                cyVar.showDialog(b2Var2);
                TextView textView3 = (TextView) b2Var2.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                    return;
                }
                return;
            case 19:
                oc1 oc1Var = (oc1) this.f35956c;
                Context context5 = (Context) this.f35955b;
                if (oc1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(oc1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context5);
                    linearLayout2.setOrientation(1);
                    TextView textView4 = new TextView(context5);
                    textView4.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.g0.m(20.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21095j5, false), 1, textView4);
                    linearLayout2.addView(textView4, w7.z5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView4.setOnTouchListener(new di.d(2));
                    a3Var3.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.h6.F.size();
                    while (i19 < size2) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) org.telegram.ui.ActionBar.h6.F.get(i19);
                        TLRPC.TL_theme tL_theme = g6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(g6Var);
                        }
                        i19++;
                    }
                    ra1 ra1Var = new ra1(context5, oc1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(ra1Var, w7.z5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ra1Var.y1(oc1Var.fragmentView.getMeasuredWidth());
                    oc1Var.showDialog(a3Var3.f20612a);
                    return;
                }
                return;
            case 20:
                hh1 hh1Var = (hh1) this.f35956c;
                Context context6 = (Context) this.f35955b;
                ug.m1 m1Var = hh1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    hh1Var.M = null;
                }
                ug.m1 m1Var2 = new ug.m1(context6, hh1Var.f37652a, null, 4, new ci.k0());
                TLRPC.User user = hh1Var.f37658c;
                if (user != null) {
                    j10 = user.f20422id;
                } else {
                    j10 = 0;
                }
                TLRPC.User user2 = hh1Var.d;
                if (user2 != null) {
                    j11 = user2.f20422id;
                }
                long[] jArr = {j10, j11};
                for (int i24 = 0; i24 < 2; i24++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i24]));
                }
                m1Var2.i0(false, true);
                m1Var2.D0 = new ih.b(2);
                hh1Var.M = m1Var2;
                m1Var2.show();
                return;
            case 21:
                org.telegram.ui.Wallet.k2 k2Var = (org.telegram.ui.Wallet.k2) this.f35955b;
                if (!((ei.d) this.f35956c).N) {
                    k2Var.dismiss();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) this.f35955b;
                if (!((org.telegram.ui.Wallet.b2) this.f35956c).f34016m) {
                    j2Var.dismiss();
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.f35956c;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f35955b;
                if (z2Var.e && !z2Var.R) {
                    org.telegram.ui.Wallet.o5.E0(z2Var.getContext(), n2Var2.getCurrentAccount(), n2Var2.getResourceProvider());
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.l4 l4Var = (org.telegram.ui.Wallet.l4) this.f35956c;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.f35955b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    l4Var.dismiss();
                    org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9();
                    r9Var.i0(nftitem);
                    U.presentFragment(r9Var);
                    return;
                }
                return;
            case 25:
                ((Runnable) this.f35956c).run();
                ((org.telegram.ui.Wallet.k2[]) this.f35955b)[0].dismiss();
                return;
            case 26:
                org.telegram.ui.Wallet.o5.g0((org.telegram.ui.Wallet.o5) this.f35956c, (Context) this.f35955b, view);
                return;
            case 27:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f35956c;
                TextView textView5 = (TextView) this.f35955b;
                a2Var.c(!a2Var.b(), true);
                if (a2Var.b()) {
                    i18 = 0;
                }
                textView5.setVisibility(i18);
                return;
            case 28:
                ei.d dVar = (ei.d) this.f35956c;
                int[] iArr = (int[]) this.f35955b;
                if (!dVar.N && (z5Var = yh1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = z5Var.h();
                        com.google.android.gms.common.api.internal.s0 s0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.f6358c).h;
                        b8.e eVar = new b8.e(s0Var, (String) z5Var.f6882a, "/tg-wear-auth/answer", h);
                        s0Var.f6493b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.f50009a).addOnSuccessListener(new e7(z5Var, dVar, iArr, 24)).addOnFailureListener(new xh1(dVar, 0));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f35956c;
                kVar.f42688b = true;
                ((y) this.f35955b).run();
                kVar.f42694w.W2.N(true);
                return;
        }
    }
}

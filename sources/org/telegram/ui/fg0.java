package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class fg0 extends org.telegram.ui.Components.fw0 {
    public final ImageView f32812a;
    public final bi.d f32813b;
    public final xh.s[] f32814c;
    public Bundle d;
    public String e;
    public boolean f32815f;
    public String h;
    public String f32816n;
    public long f32817r;
    public int f32818s;
    public final xg0 v;

    public fg0(xg0 xg0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.v = xg0Var;
        this.f32814c = r3;
        this.f32818s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.a6.n(-1, 200));
        di.f fVar = new di.f(context, 3);
        frameLayout.addView(fVar, w7.a6.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f32812a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        f6Var = ((org.telegram.ui.ActionBar.p2) xg0Var).resourceProvider;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 1, -1));
        frameLayout.addView(imageView, w7.a6.d(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
        eg0 eg0Var = new eg0(context, 1, 1, 0);
        eg0Var.setStarParticlesView(fVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false)));
        eg0Var.setBackgroundBitmap(createBitmap);
        rg.a aVar = eg0Var.f41485b;
        aVar.f41471w = i11;
        aVar.f41472x = org.telegram.ui.ActionBar.j6.Lj;
        aVar.b();
        frameLayout.addView(eg0Var, w7.a6.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
        f6Var2 = ((org.telegram.ui.ActionBar.p2) xg0Var).resourceProvider;
        xh.s sVar = new xh.s(context, 1, f6Var2);
        sVar.a(LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text), R.drawable.menu_high_price);
        addView(r3[0], w7.a6.t(-1, -2, 55, 0, 0, 0, 6));
        f6Var3 = ((org.telegram.ui.ActionBar.p2) xg0Var).resourceProvider;
        xh.s sVar2 = new xh.s(context, 1, f6Var3);
        sVar2.a(LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text), R.drawable.menu_feature_code);
        addView(r3[1], w7.a6.t(-1, -2, 55, 0, 0, 0, 6));
        f6Var4 = ((org.telegram.ui.ActionBar.p2) xg0Var).resourceProvider;
        xh.s sVar3 = new xh.s(context, 1, f6Var4);
        xh.s[] sVarArr = {sVar, sVar2, sVar3};
        sVar3.a(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new bg0(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text), R.drawable.menu_feature_hands);
        addView(sVarArr[2], w7.a6.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), w7.a6.o(0, 0, 1.0f, 119));
        bi.d g10 = org.telegram.messenger.em.g(24, context, null, true);
        this.f32813b = g10;
        g10.setLoading(true);
        addView(g10, w7.a6.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void o(fg0 fg0Var, String str, String str2, String str3) {
        String str4;
        List<SubscriptionInfo> list;
        CharSequence carrierName;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str5 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            } else {
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("android.intent.extra.SUBJECT", str2);
            } else {
                intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
            sb2.append("Device: ");
            sb2.append(Build.MANUFACTURER);
            sb2.append(" ");
            sb2.append(Build.MODEL);
            sb2.append("\n");
            sb2.append("OS version: SDK ");
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(i10);
            sb2.append("\n");
            sb2.append("Locale: ");
            sb2.append(Locale.getDefault());
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Target Phone: +");
            sb2.append(str3);
            sb2.append("\n");
            sb2.append("\n");
            try {
                if (i10 >= 22) {
                    SubscriptionManager from = SubscriptionManager.from(fg0Var.getContext());
                    if (i10 >= 30) {
                        list = from.getCompleteActiveSubscriptionInfoList();
                    } else {
                        list = null;
                    }
                    if ((list == null || list.isEmpty()) && i10 >= 28) {
                        list = from.getAccessibleSubscriptionInfoList();
                    }
                    if (list == null || list.isEmpty()) {
                        list = from.getActiveSubscriptionInfoList();
                    }
                    if (list != null) {
                        for (SubscriptionInfo subscriptionInfo : list) {
                            String number = subscriptionInfo.getNumber();
                            if (!TextUtils.isEmpty(number)) {
                                String str6 = "SIM" + subscriptionInfo.getSimSlotIndex();
                                sb2.append(str6);
                                sb2.append(".Phone: ");
                                sb2.append(number);
                                sb2.append("\n");
                                sb2.append(str6);
                                sb2.append(".MCC: ");
                                sb2.append(subscriptionInfo.getMcc());
                                sb2.append("\n");
                                sb2.append(str6);
                                sb2.append(".MNC: ");
                                sb2.append(subscriptionInfo.getMnc());
                                sb2.append("\n");
                                sb2.append(str6);
                                sb2.append(".Carrier: ");
                                if (TextUtils.isEmpty(subscriptionInfo.getCarrierName())) {
                                    carrierName = "unknown";
                                } else {
                                    carrierName = subscriptionInfo.getCarrierName();
                                }
                                sb2.append(carrierName);
                                sb2.append("\n\n");
                            }
                        }
                    }
                } else {
                    try {
                        String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                        if (!TextUtils.isEmpty(line1Number)) {
                            sb2.append("SIM0.Phone: ");
                            sb2.append(line1Number);
                            sb2.append("\n");
                            sb2.append("SIM0.MCC: unknown\n");
                            sb2.append("SIM0.MNC: unknown\n");
                            sb2.append("SIM0.Carrier: unknown\n\n");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) fg0Var.getContext().getSystemService(ConnectivityManager.class);
                    SignalStrength signalStrength = ((TelephonyManager) fg0Var.getContext().getSystemService(TelephonyManager.class)).getSignalStrength();
                    if (signalStrength != null) {
                        sb2.append("Signal: ");
                        sb2.append(signalStrength.getLevel());
                        sb2.append("/4\n");
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            sb2.append(AndroidUtilities.isWifiEnabled(fg0Var.getContext()));
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            sb2.append(AndroidUtilities.isInAirplaneMode(fg0Var.getContext()));
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("App: ");
            sb2.append(BuildVars.APP_ID);
            sb2.append("\n");
            int i11 = packageInfo.versionCode % 10;
            if (i11 != 1 && i11 != 2) {
                if (ApplicationLoader.isStandaloneBuild()) {
                    str4 = "direct";
                } else if (ApplicationLoader.isBetaBuild()) {
                    str4 = "beta";
                } else if (ApplicationLoader.isHuaweiStoreBuild()) {
                    str4 = "huawei";
                } else {
                    str4 = "universal";
                }
            } else {
                str4 = "store";
            }
            sb2.append("App version: ");
            sb2.append(str5);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append("\n");
            sb2.append("\n");
            sb2.append("Issue: ");
            sb2.append("billing_issue");
            sb2.append("\n");
            if (!TextUtils.isEmpty(fg0Var.e)) {
                sb2.append("Error: ");
                sb2.append(fg0Var.e);
                sb2.append("\n");
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            fg0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            fg0Var.v.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    @Override
    public final void g() {
        int i10;
        if (this.f32818s >= 0) {
            i10 = ((org.telegram.ui.ActionBar.p2) this.v).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(this.f32818s, true);
            this.f32818s = -1;
        }
        this.f32815f = false;
        this.f32813b.setLoading(false);
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        long j3;
        int i10;
        String formatPluralStringComma;
        String formatPluralStringComma2;
        this.d = bundle;
        if (bundle == null) {
            string = null;
        } else {
            string = bundle.getString("country");
        }
        String countryName = LocaleController.getCountryName(string);
        if (bundle == null) {
            string2 = null;
        } else {
            string2 = bundle.getString("product");
        }
        if (bundle == null) {
            string3 = null;
        } else {
            string3 = bundle.getString("phoneFormated");
        }
        if (bundle == null) {
            string4 = null;
        } else {
            string4 = bundle.getString("phoneHash");
        }
        if (bundle == null) {
            string5 = null;
        } else {
            string5 = bundle.getString("support_email_email");
        }
        if (bundle == null) {
            string6 = null;
        } else {
            string6 = bundle.getString("support_email_subject");
        }
        if (bundle == null) {
            string7 = null;
        } else {
            string7 = bundle.getString("currency");
        }
        if (bundle == null) {
            j3 = 0;
        } else {
            j3 = bundle.getLong("amount");
        }
        if (bundle == null) {
            i10 = 0;
        } else {
            i10 = bundle.getInt("premium_days");
        }
        boolean isEmpty = TextUtils.isEmpty(countryName);
        xh.s[] sVarArr = this.f32814c;
        if (isEmpty) {
            sVarArr[0].f45999c.setText(LocaleController.getString(R.string.SMSFee1Text));
        } else {
            sVarArr[0].f45999c.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
        }
        xh.s sVar = sVarArr[2];
        if (i10 == 7) {
            formatPluralStringComma = LocaleController.getString(R.string.SMSFee3Text);
        } else {
            formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFee3TextDays", i10);
        }
        sVar.setSubtitle(formatPluralStringComma);
        this.f32812a.setOnClickListener(new di.o(this, string5, string6, string3));
        bi.d dVar = this.f32813b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (BuildVars.useInvoiceBilling()) {
            if (!TextUtils.isEmpty(string7) && j3 > 0) {
                dVar.setVisibility(0);
                dVar.setLoading(false);
                dVar.g(LocaleController.formatString(R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j3, string7)), false, true);
                if (i10 == 7) {
                    formatPluralStringComma2 = LocaleController.getString(R.string.SMSFeePurchaseText);
                } else {
                    formatPluralStringComma2 = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i10);
                }
                dVar.f(formatPluralStringComma2, false);
                dVar.setOnClickListener(new di.f1(this, string7, j3, string4, string3, i10));
                return;
            }
            dVar.setVisibility(0);
            dVar.setLoading(false);
            dVar.setEnabled(false);
            dVar.g(LocaleController.getString(R.string.Unavailable), false, true);
            return;
        }
        int i11 = i10;
        String str = string4;
        if (TextUtils.isEmpty(string2)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(0);
        dVar.setLoading(true);
        di.o3 o3Var = new di.o3(this, string2, str, string3, i11, 26);
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(o3Var);
        } else {
            o3Var.run();
        }
    }

    public final void p() {
        int i10;
        if (!this.f32815f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f32817r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f32816n;
        i10 = ((org.telegram.ui.ActionBar.p2) this.v).currentAccount;
        this.f32818s = ConnectionsManager.getInstance(i10).sendRequest(tL_checkPaidAuth, new m(this, 14), 1096);
    }
}

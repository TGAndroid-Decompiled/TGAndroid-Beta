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
public final class of0 extends org.telegram.ui.Components.ow0 {
    public final ImageView f39763a;
    public final ei.d f39764b;
    public final ai.n0[] f39765c;
    public Bundle d;
    public String e;
    public boolean f39766f;
    public String h;
    public String f39767n;
    public long f39768r;
    public int f39769s;
    public final fg0 v;

    public of0(fg0 fg0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = fg0Var;
        this.f39765c = r3;
        this.f39769s = -1;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.z5.n(-1, 200));
        gi.f fVar = new gi.f(context, 3);
        frameLayout.addView(fVar, w7.z5.e(-1, 200, 119));
        ImageView imageView = new ImageView(context);
        this.f39763a = imageView;
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        d6Var = ((org.telegram.ui.ActionBar.n2) fg0Var).resourceProvider;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21075i6, false), 1, -1));
        frameLayout.addView(imageView, w7.z5.a(32.0f, 0.0f, 16.0f, -2.0f, 0.0f, 32, 53));
        ai.yd ydVar = new ai.yd(context, 1, 1, 1);
        ydVar.setStarParticlesView(fVar);
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i11 = org.telegram.ui.ActionBar.h6.Mj;
        canvas.drawColor(i0.b.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false)));
        ydVar.setBackgroundBitmap(createBitmap);
        tg.g gVar = ydVar.f47127b;
        gVar.f47111z = i11;
        gVar.A = org.telegram.ui.ActionBar.h6.Lj;
        gVar.b();
        frameLayout.addView(ydVar, w7.z5.e(160, 160, 1));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 16.0f, 152.0f, 16.0f, 0.0f, -1, 49));
        d6Var2 = ((org.telegram.ui.ActionBar.n2) fg0Var).resourceProvider;
        ai.n0 n0Var = new ai.n0(context, 1, d6Var2);
        n0Var.a(LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text), R.drawable.menu_high_price);
        addView(r3[0], w7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        d6Var3 = ((org.telegram.ui.ActionBar.n2) fg0Var).resourceProvider;
        ai.n0 n0Var2 = new ai.n0(context, 1, d6Var3);
        n0Var2.a(LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text), R.drawable.menu_feature_code);
        addView(r3[1], w7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        d6Var4 = ((org.telegram.ui.ActionBar.n2) fg0Var).resourceProvider;
        ai.n0 n0Var3 = new ai.n0(context, 1, d6Var4);
        ai.n0[] n0VarArr = {n0Var, n0Var2, n0Var3};
        n0Var3.a(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new lf0(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text), R.drawable.menu_feature_hands);
        addView(n0VarArr[2], w7.z5.t(-1, -2, 55, 0, 0, 0, 6));
        addView(new Space(context), w7.z5.o(0, 0, 1.0f, 119));
        ei.d f7 = org.telegram.messenger.wh.f(24, context, null, true);
        this.f39764b = f7;
        f7.setLoading(true);
        addView(f7, w7.z5.t(-1, 48, 7, 0, 16, 0, 16));
    }

    public static void o(of0 of0Var, String str, String str2, String str3) {
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
                SubscriptionManager from = SubscriptionManager.from(of0Var.getContext());
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
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) of0Var.getContext().getSystemService(ConnectivityManager.class);
                    SignalStrength signalStrength = ((TelephonyManager) of0Var.getContext().getSystemService(TelephonyManager.class)).getSignalStrength();
                    if (signalStrength != null) {
                        sb2.append("Signal: ");
                        sb2.append(signalStrength.getLevel());
                        sb2.append("/4\n");
                    } else {
                        sb2.append("Signal: unknown\n");
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else {
                sb2.append("Signal: unknown\n");
            }
            sb2.append("Wi-Fi: ");
            sb2.append(AndroidUtilities.isWifiEnabled(of0Var.getContext()));
            sb2.append("\n");
            sb2.append("Airplane Mode: ");
            sb2.append(AndroidUtilities.isInAirplaneMode(of0Var.getContext()));
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
            if (!TextUtils.isEmpty(of0Var.e)) {
                sb2.append("Error: ");
                sb2.append(of0Var.e);
                sb2.append("\n");
            }
            sb2.append("\n\n================================================\n");
            sb2.append("WRITE YOUR COMMENT HERE:\n");
            sb2.append("\n");
            sb2.append("\n");
            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
            of0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            of0Var.v.l1(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
        }
    }

    @Override
    public final void g() {
        int i10;
        if (this.f39769s >= 0) {
            i10 = ((org.telegram.ui.ActionBar.n2) this.v).currentAccount;
            ConnectionsManager.getInstance(i10).cancelRequest(this.f39769s, true);
            this.f39769s = -1;
        }
        this.f39766f = false;
        this.f39764b.setLoading(false);
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
        long j10;
        int i10;
        int i11;
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
            j10 = 0;
        } else {
            j10 = bundle.getLong("amount");
        }
        if (bundle == null) {
            i10 = 0;
        } else {
            i10 = bundle.getInt("premium_days");
        }
        boolean isEmpty = TextUtils.isEmpty(countryName);
        ai.n0[] n0VarArr = this.f39765c;
        if (isEmpty) {
            n0VarArr[0].f1881c.setText(LocaleController.getString(R.string.SMSFee1Text));
            i11 = 0;
        } else {
            i11 = 0;
            n0VarArr[0].f1881c.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
        }
        ai.n0 n0Var = n0VarArr[2];
        if (i10 == 7) {
            formatPluralStringComma = LocaleController.getString(R.string.SMSFee3Text);
        } else {
            formatPluralStringComma = LocaleController.formatPluralStringComma("SMSFee3TextDays", i10);
        }
        n0Var.setSubtitle(formatPluralStringComma);
        this.f39763a.setOnClickListener(new ci.c4(this, string5, string6, string3, 14));
        ei.d dVar = this.f39764b;
        dVar.setEnabled(true);
        dVar.setOnClickListener(null);
        if (BuildVars.useInvoiceBilling()) {
            if (!TextUtils.isEmpty(string7) && j10 > 0) {
                boolean z11 = i11;
                dVar.setVisibility(z11 ? 1 : 0);
                dVar.setLoading(z11);
                int i12 = R.string.SMSFeePurchaseTitle;
                Object[] objArr = new Object[1];
                objArr[z11 ? 1 : 0] = BillingController.getInstance().formatCurrency(j10, string7);
                dVar.g(LocaleController.formatString(i12, objArr), z11, true);
                if (i10 == 7) {
                    formatPluralStringComma2 = LocaleController.getString(R.string.SMSFeePurchaseText);
                } else {
                    formatPluralStringComma2 = LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i10);
                }
                dVar.f(formatPluralStringComma2, z11);
                dVar.setOnClickListener(new ai.e1(this, string7, j10, string4, string3, i10));
                return;
            }
            boolean z12 = i11;
            dVar.setVisibility(z12 ? 1 : 0);
            dVar.setLoading(z12);
            dVar.setEnabled(z12);
            dVar.g(LocaleController.getString(R.string.Unavailable), z12, true);
            return;
        }
        int i13 = i11;
        String str = string4;
        int i14 = i10;
        if (TextUtils.isEmpty(string2)) {
            dVar.setVisibility(8);
            return;
        }
        dVar.setVisibility(i13);
        dVar.setLoading(true);
        ai.tb tbVar = new ai.tb((Object) this, string2, str, string3, i14, 29);
        if (!BillingController.getInstance().isReady()) {
            BillingController.getInstance().whenSetuped(tbVar);
        } else {
            tbVar.run();
        }
    }

    public final void p() {
        int i10;
        if (!this.f39766f) {
            return;
        }
        TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
        tL_checkPaidAuth.form_id = this.f39768r;
        tL_checkPaidAuth.phone_number = this.h;
        tL_checkPaidAuth.phone_code_hash = this.f39767n;
        i10 = ((org.telegram.ui.ActionBar.n2) this.v).currentAccount;
        this.f39769s = ConnectionsManager.getInstance(i10).sendRequest(tL_checkPaidAuth, new m(this, 14), 1096);
    }
}

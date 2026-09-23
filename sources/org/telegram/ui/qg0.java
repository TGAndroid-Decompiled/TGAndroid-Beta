package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
public final class qg0 extends org.telegram.ui.Components.uv0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public final HashMap F;
    public final HashMap G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public long N;
    public Toast O;
    public String P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Runnable U;
    public final rg0 V;
    public final uj0 f36422a;
    public final ng0 f36423b;
    public final TextView f36424c;
    public final org.telegram.ui.Components.p01 d;
    public final org.telegram.ui.Components.yc0 e;
    public final org.telegram.ui.Components.yc0 f36425f;
    public final TextView h;
    public final org.telegram.ui.Components.d90 f36426n;
    public final View f36427r;
    public final ImageView f36428s;
    public final org.telegram.ui.Cells.z1 v;
    public final org.telegram.ui.Cells.z1 f36429w;
    public int f36430x;
    public st f36431y;

    public qg0(rg0 rg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.V = rg0Var;
        this.f36430x = 0;
        this.E = new ArrayList();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = 0;
        this.N = 0L;
        this.Q = -1;
        this.S = false;
        this.T = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f36424c = textView;
        com.google.android.gms.internal.vision.e2.l(18.0f, 1, textView);
        if (rg0Var.F == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.x5.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new pv(21, this, context));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        this.f36426n = d90Var;
        if (rg0Var.F == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        d90Var.setText(LocaleController.getString(i11));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(17);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(d90Var, w7.x5.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new mg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.lt.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f36428s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, w7.x5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context, null);
        this.e = yc0Var;
        yc0Var.setText(LocaleController.getString(R.string.Country));
        yc0Var.addView(linearLayout, w7.x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        yc0Var.setForceUseCenter(true);
        yc0Var.setFocusable(true);
        yc0Var.setContentDescription(LocaleController.getString(R.string.Country));
        yc0Var.setOnFocusChangeListener(new od(this, 9));
        addView(yc0Var, w7.x5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        yc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final qg0 f34136b;

            {
                this.f34136b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        rg0 rg0Var2 = this.f34136b.V;
                        if (rg0Var2.getParentActivity() != null) {
                            boolean z11 = !rg0Var2.f36845y;
                            rg0Var2.f36845y = z11;
                            ((org.telegram.ui.Cells.z1) view).c(z11, true);
                            if (rg0Var2.f36845y) {
                                new org.telegram.ui.Components.xc(rg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.xc(rg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        qg0 qg0Var = this.f34136b;
                        xt xtVar = new xt(qg0Var.E, true);
                        xtVar.f39660r = new eu(qg0Var, 20);
                        qg0Var.V.presentFragment(xtVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(context, null);
        this.f36425f = yc0Var2;
        yc0Var2.addView(linearLayout2, w7.x5.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        yc0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(yc0Var2, w7.x5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.x5.n(-2, -2));
        uj0 uj0Var = new uj0(this, context, 2);
        this.f36422a = uj0Var;
        uj0Var.setInputType(3);
        uj0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        uj0Var.setCursorWidth(1.5f);
        uj0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        uj0Var.setTextSize(1, 16.0f);
        uj0Var.setMaxLines(1);
        uj0Var.setGravity(19);
        uj0Var.setImeOptions(268435461);
        uj0Var.setBackground(null);
        uj0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        uj0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(uj0Var, w7.x5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        uj0Var.addTextChangedListener(new m0(this, 10));
        uj0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qg0 f33849b;

            {
                this.f33849b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        qg0 qg0Var = this.f33849b;
                        if (i14 == 5) {
                            fg0 fg0Var = qg0Var.V.f36821b0;
                            if (fg0Var != null) {
                                fg0Var.h.callOnClick();
                                return true;
                            }
                            qg0Var.h(null);
                            return true;
                        }
                        qg0Var.getClass();
                        return false;
                    default:
                        ng0 ng0Var = this.f33849b.f36423b;
                        if (i14 == 5) {
                            ng0Var.requestFocus();
                            ng0Var.setSelection(ng0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f36427r = view;
        LinearLayout.LayoutParams k10 = w7.x5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        ng0 ng0Var = new ng0(this, context);
        this.f36423b = ng0Var;
        ng0Var.setInputType(3);
        ng0Var.setPadding(0, 0, 0, 0);
        ng0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        ng0Var.setCursorWidth(1.5f);
        ng0Var.setTextSize(1, 16.0f);
        ng0Var.setMaxLines(1);
        ng0Var.setGravity(19);
        ng0Var.setImeOptions(268435461);
        ng0Var.setBackground(null);
        ng0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        ng0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(ng0Var, w7.x5.c(36.0f, -1));
        ng0Var.addTextChangedListener(new yr(this, 1));
        ng0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qg0 f33849b;

            {
                this.f33849b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        qg0 qg0Var = this.f33849b;
                        if (i14 == 5) {
                            fg0 fg0Var = qg0Var.V.f36821b0;
                            if (fg0Var != null) {
                                fg0Var.h.callOnClick();
                                return true;
                            }
                            qg0Var.h(null);
                            return true;
                        }
                        qg0Var.getClass();
                        return false;
                    default:
                        ng0 ng0Var2 = this.f33849b.f36423b;
                        if (i14 == 5) {
                            ng0Var2.requestFocus();
                            ng0Var2.setSelection(ng0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (rg0Var.f36844x && rg0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.v = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", rg0Var.f36845y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(z1Var, w7.x5.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            z1Var.setOnClickListener(new View.OnClickListener(this) {
                public final qg0 f34136b;

                {
                    this.f34136b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            rg0 rg0Var2 = this.f34136b.V;
                            if (rg0Var2.getParentActivity() != null) {
                                boolean z11 = !rg0Var2.f36845y;
                                rg0Var2.f36845y = z11;
                                ((org.telegram.ui.Cells.z1) view2).c(z11, true);
                                if (rg0Var2.f36845y) {
                                    new org.telegram.ui.Components.xc(rg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.xc(rg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            qg0 qg0Var = this.f34136b;
                            xt xtVar = new xt(qg0Var.E, true);
                            xtVar.f39660r = new eu(qg0Var, 20);
                            qg0Var.V.presentFragment(xtVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !rg0Var.getConnectionsManager().isTestBackend()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && rg0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.f36429w = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = rg0Var.getConnectionsManager().isTestBackend();
            rg0Var.E = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, w7.x5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 0 : 0), 0));
            i12 -= 24;
            z1Var2.setOnClickListener(new ai.j3(8, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, w7.x5.n(-2, -2));
        }
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                ?? obj = new Object();
                obj.f37415a = split[2];
                String str = split[0];
                obj.f37417c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f37416b = obj.f37415a;
                        obj.f37415a = countryName;
                    }
                }
                this.E.add(0, obj);
                List list = (List) this.F.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.F;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(obj);
                if (split.length > 3) {
                    this.G.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.E, Comparator$CC.comparing(new l8(6)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        rg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new wb0(4, this, hashMap), 10);
        if (this.f36422a.length() == 0) {
            setCountryButtonText(null);
            this.f36423b.setHintText((String) null);
            this.f36430x = 1;
        }
        if (this.f36422a.length() != 0) {
            this.f36423b.requestFocus();
            ng0 ng0Var2 = this.f36423b;
            ng0Var2.setSelection(ng0Var2.length());
        } else {
            this.f36422a.requestFocus();
        }
        s();
    }

    public static void o(qg0 qg0Var, ArrayList arrayList) {
        rg0 rg0Var = qg0Var.V;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !rg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            rg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        b2Var.T = string;
        rg0Var.f36834n = rg0Var.showDialog(b2Var, true, null);
        rg0Var.f36823c0 = true;
    }

    public void setCountryButtonText(CharSequence charSequence) {
        int i10;
        boolean z10;
        float f7;
        Context context = ApplicationLoader.applicationContext;
        if (this.d.getCurrentView().getText() != null && charSequence == null) {
            i10 = R.anim.text_out_down;
        } else {
            i10 = R.anim.text_out;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i10);
        loadAnimation.setInterpolator(org.telegram.ui.Components.lt.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.p01 p01Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        p01Var.a(charSequence, z10, false);
        org.telegram.ui.Components.yc0 yc0Var = this.e;
        if (charSequence != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        yc0Var.b(f7, f7, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void d() {
        this.K = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override
    public final void f() {
        Runnable runnable = this.U;
        if (runnable != null) {
            runnable.run();
            this.U = null;
        }
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("YourPhone", R.string.YourPhone);
    }

    @Override
    public final void h(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        boolean z17;
        int i10;
        if (this.V.getParentActivity() != null && !this.K && !this.V.f36836o0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f36422a.length() != 0 && this.f36423b.length() != 0) {
                String str2 = "+" + ((Object) this.f36422a.getText()) + " " + ((Object) this.f36423b.getText());
                if (!this.L) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.V.h1() && this.V.S.R() > AndroidUtilities.dp(20.0f)) {
                        rg0 rg0Var = this.V;
                        rg0Var.T = new gg0(this, 1);
                        AndroidUtilities.hideKeyboard(rg0Var.fragmentView);
                        return;
                    }
                    rg0 rg0Var2 = this.V;
                    Context context = this.V.fragmentView.getContext();
                    rg0 rg0Var3 = this.V;
                    rg0Var2.f36821b0 = new fg0(context, (ViewGroup) rg0Var3.fragmentView, rg0Var3.N, str2, new pg0(this));
                    fg0 fg0Var = this.V.f36821b0;
                    fg0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new eg0(fg0Var, 0));
                    duration.addUpdateListener(new bg0(fg0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                    duration.start();
                    return;
                }
                this.L = false;
                fg0 fg0Var2 = this.V.f36821b0;
                if (fg0Var2 != null) {
                    int i11 = fg0.E;
                    fg0Var2.a();
                }
                boolean isSimAvailable = AndroidUtilities.isSimAvailable();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && isSimAvailable) {
                    if (this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.V.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 >= 28 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i12 >= 26 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    rg0 rg0Var4 = this.V;
                    z10 = isSimAvailable;
                    if (rg0Var4.v) {
                        rg0Var4.f36839r.clear();
                        if (!z12) {
                            this.V.f36839r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.V.f36839r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.V.f36839r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.V.f36839r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.V.f36839r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.V.getParentActivity().requestPermissions((String[]) this.V.f36839r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.V.getParentActivity());
                            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f18409a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f18409a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f18409a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                            rg0 rg0Var5 = this.V;
                            rg0Var5.h = rg0Var5.showDialog(alertDialog$Builder.f18409a);
                            this.L = true;
                            return;
                        }
                    }
                    z11 = true;
                } else {
                    z10 = isSimAvailable;
                    z11 = true;
                    z12 = true;
                    z13 = true;
                    z14 = true;
                }
                int i13 = this.f36430x;
                if (i13 == z11) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.V.k1(false, z11);
                    return;
                } else if (i13 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.V.k1(false, true);
                    return;
                } else {
                    String d = gf.b.d("" + ((Object) this.f36422a.getText()) + ((Object) this.f36423b.getText()), false);
                    rg0 rg0Var6 = this.V;
                    if (rg0Var6.F == 0 && (rg0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i14 = 0; i14 < 4; i14++) {
                            UserConfig userConfig = UserConfig.getInstance(i14);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                                rg0 rg0Var7 = this.V;
                                if (isTestBackend == rg0Var7.E) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rg0Var7.getParentActivity());
                                    alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f18409a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.s(this, i14, 14));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.V.showDialog(alertDialog$Builder2.f18409a);
                                    this.V.k1(false, true);
                                    return;
                                }
                            }
                        }
                    }
                    TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
                    if (z10 && z12 && z13 && z14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    tL_codeSettings.allow_flashcall = z15;
                    if (z10 && z12) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    tL_codeSettings.allow_missed_call = z16;
                    boolean hasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
                    tL_codeSettings.allow_firebase = hasServices;
                    tL_codeSettings.allow_app_hash = hasServices;
                    if (this.V.f36833l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
                        tL_codeSettings.allow_firebase = false;
                    }
                    ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
                    if (savedLogInTokens != null) {
                        for (int i15 = 0; i15 < savedLogInTokens.size(); i15++) {
                            if (savedLogInTokens.get(i15).future_auth_token != null) {
                                if (tL_codeSettings.logout_tokens == null) {
                                    tL_codeSettings.logout_tokens = new ArrayList<>();
                                }
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i15).future_auth_token, StandardCharsets.UTF_8)));
                                }
                                tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i15).future_auth_token);
                                if (tL_codeSettings.logout_tokens.size() >= 20) {
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
                    if (savedLogOutTokens != null) {
                        for (int i16 = 0; i16 < savedLogOutTokens.size(); i16++) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i16).future_auth_token);
                            if (tL_codeSettings.logout_tokens.size() >= 20) {
                                break;
                            }
                        }
                        AuthTokensHelper.saveLogOutTokens(savedLogOutTokens);
                    }
                    if (tL_codeSettings.logout_tokens != null) {
                        tL_codeSettings.flags |= 64;
                    }
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                    sharedPreferences.edit().remove("sms_hash_code").apply();
                    if (tL_codeSettings.allow_app_hash) {
                        sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).apply();
                    } else {
                        sharedPreferences.edit().remove("sms_hash").apply();
                    }
                    if (tL_codeSettings.allow_flashcall) {
                        try {
                            HashSet V0 = rg0.V0(this.V);
                            if (!V0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(V0).anyMatch(new o80(d, 1));
                            } else {
                                tL_codeSettings.unknown_number = true;
                                if (UserConfig.getActivatedAccountsCount() > 0) {
                                    tL_codeSettings.allow_flashcall = false;
                                } else {
                                    tL_codeSettings.current_number = false;
                                }
                            }
                        } catch (Exception e7) {
                            tL_codeSettings.unknown_number = true;
                            FileLog.e(e7);
                        }
                    }
                    rg0 rg0Var8 = this.V;
                    if (rg0Var8.F == 2) {
                        TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                        sendchangephonecode.phone_number = d;
                        sendchangephonecode.settings = tL_codeSettings;
                        tL_auth_sendCode = sendchangephonecode;
                    } else {
                        ConnectionsManager.getInstance(rg0.W0(rg0Var8)).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                        tL_auth_sendCode2.phone_number = d;
                        tL_auth_sendCode2.settings = tL_codeSettings;
                        tL_auth_sendCode = tL_auth_sendCode2;
                    }
                    TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", "+" + ((Object) this.f36422a.getText()) + " " + ((Object) this.f36423b.getText()));
                    try {
                        bundle.putString("ephone", "+" + gf.b.d(this.f36422a.getText().toString(), false) + " " + gf.b.d(this.f36423b.getText().toString(), false));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    st stVar = this.f36431y;
                    if (stVar != null) {
                        bundle.putString("country", stVar.f37417c);
                    }
                    this.K = true;
                    lf.i iVar = new lf.i(16, false);
                    iVar.d = "+" + ((Object) this.f36422a.getText()) + " " + ((Object) this.f36423b.getText());
                    iVar.f14011b = this.f36431y;
                    iVar.f14012c = (List) this.G.get(this.f36422a.getText().toString());
                    this.V.n1(ConnectionsManager.getInstance(rg0.X0(this.V)).sendRequest(tL_auth_sendCode3, new ci.hd(this, bundle, d, iVar, tL_auth_sendCode3, 9), 27), true);
                    return;
                }
            }
            rg0.U0(this.V, this.f36425f, false);
        }
    }

    @Override
    public final void j() {
        q();
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            z1Var.c(this.V.f36845y, false);
        }
        AndroidUtilities.runOnUIThread(new gg0(this, 0), rg0.f36817t0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f36422a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f36423b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f36422a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f36423b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override
    public final void n() {
        this.f36424c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.d90 d90Var = this.f36426n;
        d90Var.setTextColor(w02);
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.p01 p01Var = this.d;
            if (i10 >= p01Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) p01Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        ImageView imageView = this.f36428s;
        imageView.setColorFilter(w03);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(this.V.getThemedColor(org.telegram.ui.ActionBar.h6.f18878i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        int w04 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        uj0 uj0Var = this.f36422a;
        uj0Var.setTextColor(w04);
        int i13 = org.telegram.ui.ActionBar.h6.f18934l6;
        uj0Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.f36427r.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18916k6, false));
        int w05 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        ng0 ng0Var = this.f36423b;
        ng0Var.setTextColor(w05);
        ng0Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        ng0Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            int i14 = org.telegram.ui.ActionBar.h6.Y6;
            int i15 = org.telegram.ui.ActionBar.h6.W6;
            int i16 = org.telegram.ui.ActionBar.h6.X6;
            CheckBoxSquare checkBoxSquare = z1Var.f21658n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f21958s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f21959w = i16;
                checkBoxSquare.invalidate();
            }
            z1Var.g();
        }
        org.telegram.ui.Cells.z1 z1Var2 = this.f36429w;
        if (z1Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.h6.Y6;
            int i18 = org.telegram.ui.ActionBar.h6.W6;
            int i19 = org.telegram.ui.ActionBar.h6.X6;
            CheckBoxSquare checkBoxSquare2 = z1Var2.f21658n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f21958s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f21959w = i19;
                checkBoxSquare2.invalidate();
            }
            z1Var2.g();
        }
        this.f36425f.f();
        this.e.f();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        if (this.H) {
            this.H = false;
            return;
        }
        this.I = true;
        this.f36422a.setText(((st) this.E.get(i10)).f37417c);
        this.I = false;
    }

    public final void q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qg0.q():void");
    }

    public final void r() {
        String str;
        int i10;
        String str2 = this.P;
        ng0 ng0Var = this.f36423b;
        if (ng0Var.getText() == null) {
            str = "";
        } else {
            str = ng0Var.getText().toString().replace(" ", "");
        }
        HashMap hashMap = this.G;
        String str3 = null;
        if (hashMap.get(str2) != null && !((List) hashMap.get(str2)).isEmpty()) {
            List list = (List) hashMap.get(str2);
            if (!str.isEmpty()) {
                i10 = 0;
                while (i10 < list.size()) {
                    if (str.startsWith(((String) list.get(i10)).replace(" ", "").replace("X", "").replace("0", ""))) {
                        break;
                    }
                    i10++;
                }
            }
            i10 = -1;
            if (i10 == -1) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    String str4 = (String) list.get(i11);
                    if (str4.startsWith("X") || str4.startsWith("0")) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 == -1) {
                    i10 = 0;
                }
            }
            if (this.Q != i10) {
                String str5 = (String) ((List) hashMap.get(str2)).get(i10);
                int selectionStart = ng0Var.getSelectionStart();
                int selectionEnd = ng0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                ng0Var.setHintText(str3);
                ng0Var.setSelection(Math.max(0, Math.min(ng0Var.length(), selectionStart)), Math.max(0, Math.min(ng0Var.length(), selectionEnd)));
                this.Q = i10;
            }
        } else if (this.Q != -1) {
            int selectionStart2 = ng0Var.getSelectionStart();
            int selectionEnd2 = ng0Var.getSelectionEnd();
            ng0Var.setHintText((String) null);
            ng0Var.setSelection(selectionStart2, selectionEnd2);
            this.Q = -1;
        }
    }

    public final void s() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.V.getConnectionsManager().sendRequest(tL_help_getCountriesList, new kg0(this, 0), 10);
    }

    public final void u(boolean z10) {
        rg0 rg0Var = this.V;
        if (rg0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.T) {
            if (z10 || !this.S) {
                this.T = true;
                this.S = true;
                this.U = PasskeysController.login(getContext(), rg0.Y0(rg0Var), z10, new jg0(this, 0));
            }
        }
    }

    public final void v(String str, st stVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(stVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.mz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) stVar.f37415a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        r();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

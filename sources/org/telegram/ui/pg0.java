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
public final class pg0 extends org.telegram.ui.Components.fw0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
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
    public final qg0 V;
    public final uj0 f36521a;
    public final mg0 f36522b;
    public final TextView f36523c;
    public final org.telegram.ui.Components.d11 d;
    public final org.telegram.ui.Components.jd0 e;
    public final org.telegram.ui.Components.jd0 f36524f;
    public final TextView h;
    public final org.telegram.ui.Components.n90 f36525n;
    public final View f36526r;
    public final ImageView f36527s;
    public final org.telegram.ui.Cells.a2 v;
    public final org.telegram.ui.Cells.a2 f36528w;
    public int f36529x;
    public qt f36530y;

    public pg0(qg0 qg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.V = qg0Var;
        this.f36529x = 0;
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
        this.f36523c = textView;
        com.google.android.gms.internal.vision.e2.l(18.0f, 1, textView);
        if (qg0Var.F == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.y5.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new ov(21, this, context));
        org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(context, null);
        this.f36525n = n90Var;
        if (qg0Var.F == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        n90Var.setText(LocaleController.getString(i11));
        n90Var.setTextSize(1, 14.0f);
        n90Var.setGravity(17);
        n90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(n90Var, w7.y5.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new lg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.lt.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f36527s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, w7.y5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.y5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.jd0 jd0Var = new org.telegram.ui.Components.jd0(context, null);
        this.e = jd0Var;
        jd0Var.setText(LocaleController.getString(R.string.Country));
        jd0Var.addView(linearLayout, w7.y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        jd0Var.setForceUseCenter(true);
        jd0Var.setFocusable(true);
        jd0Var.setContentDescription(LocaleController.getString(R.string.Country));
        jd0Var.setOnFocusChangeListener(new od(this, 9));
        addView(jd0Var, w7.y5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        jd0Var.setOnClickListener(new View.OnClickListener(this) {
            public final pg0 f34220b;

            {
                this.f34220b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        qg0 qg0Var2 = this.f34220b.V;
                        if (qg0Var2.getParentActivity() != null) {
                            boolean z11 = !qg0Var2.f36913y;
                            qg0Var2.f36913y = z11;
                            ((org.telegram.ui.Cells.a2) view).c(z11, true);
                            if (qg0Var2.f36913y) {
                                new org.telegram.ui.Components.xc(qg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.xc(qg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        pg0 pg0Var = this.f34220b;
                        wt wtVar = new wt(pg0Var.E, true);
                        wtVar.f39759r = new du(pg0Var, 20);
                        pg0Var.V.presentFragment(wtVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.jd0 jd0Var2 = new org.telegram.ui.Components.jd0(context, null);
        this.f36524f = jd0Var2;
        jd0Var2.addView(linearLayout2, w7.y5.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        jd0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(jd0Var2, w7.y5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.y5.n(-2, -2));
        uj0 uj0Var = new uj0(this, context, 2);
        this.f36521a = uj0Var;
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
        linearLayout2.addView(uj0Var, w7.y5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        uj0Var.addTextChangedListener(new m0(this, 10));
        uj0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pg0 f33937b;

            {
                this.f33937b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        pg0 pg0Var = this.f33937b;
                        if (i14 == 5) {
                            eg0 eg0Var = pg0Var.V.f36889b0;
                            if (eg0Var != null) {
                                eg0Var.h.callOnClick();
                                return true;
                            }
                            pg0Var.h(null);
                            return true;
                        }
                        pg0Var.getClass();
                        return false;
                    default:
                        mg0 mg0Var = this.f33937b.f36522b;
                        if (i14 == 5) {
                            mg0Var.requestFocus();
                            mg0Var.setSelection(mg0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f36526r = view;
        LinearLayout.LayoutParams k10 = w7.y5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        mg0 mg0Var = new mg0(this, context);
        this.f36522b = mg0Var;
        mg0Var.setInputType(3);
        mg0Var.setPadding(0, 0, 0, 0);
        mg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        mg0Var.setCursorWidth(1.5f);
        mg0Var.setTextSize(1, 16.0f);
        mg0Var.setMaxLines(1);
        mg0Var.setGravity(19);
        mg0Var.setImeOptions(268435461);
        mg0Var.setBackground(null);
        mg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        mg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(mg0Var, w7.y5.c(36.0f, -1));
        mg0Var.addTextChangedListener(new xr(this, 1));
        mg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pg0 f33937b;

            {
                this.f33937b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        pg0 pg0Var = this.f33937b;
                        if (i14 == 5) {
                            eg0 eg0Var = pg0Var.V.f36889b0;
                            if (eg0Var != null) {
                                eg0Var.h.callOnClick();
                                return true;
                            }
                            pg0Var.h(null);
                            return true;
                        }
                        pg0Var.getClass();
                        return false;
                    default:
                        mg0 mg0Var2 = this.f33937b.f36522b;
                        if (i14 == 5) {
                            mg0Var2.requestFocus();
                            mg0Var2.setSelection(mg0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (qg0Var.f36912x && qg0Var.F == 0) {
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 2);
            this.v = a2Var;
            a2Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", qg0Var.f36913y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(a2Var, w7.y5.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            a2Var.setOnClickListener(new View.OnClickListener(this) {
                public final pg0 f34220b;

                {
                    this.f34220b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            qg0 qg0Var2 = this.f34220b.V;
                            if (qg0Var2.getParentActivity() != null) {
                                boolean z11 = !qg0Var2.f36913y;
                                qg0Var2.f36913y = z11;
                                ((org.telegram.ui.Cells.a2) view2).c(z11, true);
                                if (qg0Var2.f36913y) {
                                    new org.telegram.ui.Components.xc(qg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.xc(qg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            pg0 pg0Var = this.f34220b;
                            wt wtVar = new wt(pg0Var.E, true);
                            wtVar.f39759r = new du(pg0Var, 20);
                            pg0Var.V.presentFragment(wtVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !qg0Var.getConnectionsManager().isTestBackend()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && qg0Var.F == 0) {
            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context, 2);
            this.f36528w = a2Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = qg0Var.getConnectionsManager().isTestBackend();
            qg0Var.E = isTestBackend;
            a2Var2.e(string, "", isTestBackend, false, false);
            addView(a2Var2, w7.y5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 0 : 0), 0));
            i12 -= 24;
            a2Var2.setOnClickListener(new ai.j3(8, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, w7.y5.n(-2, -2));
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
                obj.f36982a = split[2];
                String str = split[0];
                obj.f36984c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f36983b = obj.f36982a;
                        obj.f36982a = countryName;
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
        qg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new vb0(4, this, hashMap), 10);
        if (this.f36521a.length() == 0) {
            setCountryButtonText(null);
            this.f36522b.setHintText((String) null);
            this.f36529x = 1;
        }
        if (this.f36521a.length() != 0) {
            this.f36522b.requestFocus();
            mg0 mg0Var2 = this.f36522b;
            mg0Var2.setSelection(mg0Var2.length());
        } else {
            this.f36521a.requestFocus();
        }
        s();
    }

    public static void o(pg0 pg0Var, ArrayList arrayList) {
        qg0 qg0Var = pg0Var.V;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !qg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            qg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
        a2Var.T = string;
        qg0Var.f36902n = qg0Var.showDialog(a2Var, true, null);
        qg0Var.f36891c0 = true;
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
        org.telegram.ui.Components.d11 d11Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        d11Var.a(charSequence, z10, false);
        org.telegram.ui.Components.jd0 jd0Var = this.e;
        if (charSequence != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        jd0Var.b(f7, f7, true);
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
        if (this.V.getParentActivity() != null && !this.K && !this.V.f36904o0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f36521a.length() != 0 && this.f36522b.length() != 0) {
                String str2 = "+" + ((Object) this.f36521a.getText()) + " " + ((Object) this.f36522b.getText());
                if (!this.L) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.V.h1() && this.V.S.R() > AndroidUtilities.dp(20.0f)) {
                        qg0 qg0Var = this.V;
                        qg0Var.T = new fg0(this, 1);
                        AndroidUtilities.hideKeyboard(qg0Var.fragmentView);
                        return;
                    }
                    qg0 qg0Var2 = this.V;
                    Context context = this.V.fragmentView.getContext();
                    qg0 qg0Var3 = this.V;
                    qg0Var2.f36889b0 = new eg0(context, (ViewGroup) qg0Var3.fragmentView, qg0Var3.N, str2, new og0(this));
                    eg0 eg0Var = this.V.f36889b0;
                    eg0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new dg0(eg0Var, 0));
                    duration.addUpdateListener(new ag0(eg0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.rr.f28031f);
                    duration.start();
                    return;
                }
                this.L = false;
                eg0 eg0Var2 = this.V.f36889b0;
                if (eg0Var2 != null) {
                    int i11 = eg0.E;
                    eg0Var2.a();
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
                    qg0 qg0Var4 = this.V;
                    z10 = isSimAvailable;
                    if (qg0Var4.v) {
                        qg0Var4.f36907r.clear();
                        if (!z12) {
                            this.V.f36907r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.V.f36907r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.V.f36907r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.V.f36907r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.V.f36907r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.V.getParentActivity().requestPermissions((String[]) this.V.f36907r.toArray(new String[0]), 6);
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
                                alertDialog$Builder.f18662a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f18662a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f18662a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                            qg0 qg0Var5 = this.V;
                            qg0Var5.h = qg0Var5.showDialog(alertDialog$Builder.f18662a);
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
                int i13 = this.f36529x;
                if (i13 == z11) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.V.k1(false, z11);
                    return;
                } else if (i13 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.V.k1(false, true);
                    return;
                } else {
                    String d = gf.b.d("" + ((Object) this.f36521a.getText()) + ((Object) this.f36522b.getText()), false);
                    qg0 qg0Var6 = this.V;
                    if (qg0Var6.F == 0 && (qg0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i14 = 0; i14 < 4; i14++) {
                            UserConfig userConfig = UserConfig.getInstance(i14);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                                qg0 qg0Var7 = this.V;
                                if (isTestBackend == qg0Var7.E) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qg0Var7.getParentActivity());
                                    alertDialog$Builder2.f18662a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f18662a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.s(this, i14, 14));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.V.showDialog(alertDialog$Builder2.f18662a);
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
                    if (this.V.f36901l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
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
                            HashSet V0 = qg0.V0(this.V);
                            if (!V0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(V0).anyMatch(new m80(d, 1));
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
                    qg0 qg0Var8 = this.V;
                    if (qg0Var8.F == 2) {
                        TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                        sendchangephonecode.phone_number = d;
                        sendchangephonecode.settings = tL_codeSettings;
                        tL_auth_sendCode = sendchangephonecode;
                    } else {
                        ConnectionsManager.getInstance(qg0.W0(qg0Var8)).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                        tL_auth_sendCode2.phone_number = d;
                        tL_auth_sendCode2.settings = tL_codeSettings;
                        tL_auth_sendCode = tL_auth_sendCode2;
                    }
                    TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", "+" + ((Object) this.f36521a.getText()) + " " + ((Object) this.f36522b.getText()));
                    try {
                        bundle.putString("ephone", "+" + gf.b.d(this.f36521a.getText().toString(), false) + " " + gf.b.d(this.f36522b.getText().toString(), false));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    qt qtVar = this.f36530y;
                    if (qtVar != null) {
                        bundle.putString("country", qtVar.f36984c);
                    }
                    this.K = true;
                    la.h hVar = new la.h(17, false);
                    hVar.d = "+" + ((Object) this.f36521a.getText()) + " " + ((Object) this.f36522b.getText());
                    hVar.f14166b = this.f36530y;
                    hVar.f14167c = (List) this.G.get(this.f36521a.getText().toString());
                    this.V.n1(ConnectionsManager.getInstance(qg0.X0(this.V)).sendRequest(tL_auth_sendCode3, new ci.hd(this, bundle, d, hVar, tL_auth_sendCode3, 9), 27), true);
                    return;
                }
            }
            qg0.U0(this.V, this.f36524f, false);
        }
    }

    @Override
    public final void j() {
        q();
        org.telegram.ui.Cells.a2 a2Var = this.v;
        if (a2Var != null) {
            a2Var.c(this.V.f36913y, false);
        }
        AndroidUtilities.runOnUIThread(new fg0(this, 0), qg0.f36885t0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f36521a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f36522b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f36521a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f36522b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override
    public final void n() {
        this.f36523c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.n90 n90Var = this.f36525n;
        n90Var.setTextColor(w02);
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.d11 d11Var = this.d;
            if (i10 >= d11Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) d11Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        ImageView imageView = this.f36527s;
        imageView.setColorFilter(w03);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(this.V.getThemedColor(org.telegram.ui.ActionBar.h6.f19149i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        int w04 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        uj0 uj0Var = this.f36521a;
        uj0Var.setTextColor(w04);
        int i13 = org.telegram.ui.ActionBar.h6.f19205l6;
        uj0Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        this.f36526r.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19187k6, false));
        int w05 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        mg0 mg0Var = this.f36522b;
        mg0Var.setTextColor(w05);
        mg0Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        mg0Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        org.telegram.ui.Cells.a2 a2Var = this.v;
        if (a2Var != null) {
            int i14 = org.telegram.ui.ActionBar.h6.Y6;
            int i15 = org.telegram.ui.ActionBar.h6.W6;
            int i16 = org.telegram.ui.ActionBar.h6.X6;
            CheckBoxSquare checkBoxSquare = a2Var.f20010n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f22210s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f22211w = i16;
                checkBoxSquare.invalidate();
            }
            a2Var.g();
        }
        org.telegram.ui.Cells.a2 a2Var2 = this.f36528w;
        if (a2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.h6.Y6;
            int i18 = org.telegram.ui.ActionBar.h6.W6;
            int i19 = org.telegram.ui.ActionBar.h6.X6;
            CheckBoxSquare checkBoxSquare2 = a2Var2.f20010n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f22210s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f22211w = i19;
                checkBoxSquare2.invalidate();
            }
            a2Var2.g();
        }
        this.f36524f.f();
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
        this.f36521a.setText(((qt) this.E.get(i10)).f36984c);
        this.I = false;
    }

    public final void q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pg0.q():void");
    }

    public final void r() {
        String str;
        int i10;
        String str2 = this.P;
        mg0 mg0Var = this.f36522b;
        if (mg0Var.getText() == null) {
            str = "";
        } else {
            str = mg0Var.getText().toString().replace(" ", "");
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
                int selectionStart = mg0Var.getSelectionStart();
                int selectionEnd = mg0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                mg0Var.setHintText(str3);
                mg0Var.setSelection(Math.max(0, Math.min(mg0Var.length(), selectionStart)), Math.max(0, Math.min(mg0Var.length(), selectionEnd)));
                this.Q = i10;
            }
        } else if (this.Q != -1) {
            int selectionStart2 = mg0Var.getSelectionStart();
            int selectionEnd2 = mg0Var.getSelectionEnd();
            mg0Var.setHintText((String) null);
            mg0Var.setSelection(selectionStart2, selectionEnd2);
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
        this.V.getConnectionsManager().sendRequest(tL_help_getCountriesList, new jg0(this, 0), 10);
    }

    public final void u(boolean z10) {
        qg0 qg0Var = this.V;
        if (qg0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.T) {
            if (z10 || !this.S) {
                this.T = true;
                this.S = true;
                this.U = PasskeysController.login(getContext(), qg0.Y0(qg0Var), z10, new ig0(this, 0));
            }
        }
    }

    public final void v(String str, qt qtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(qtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.mz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) qtVar.f36982a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        r();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

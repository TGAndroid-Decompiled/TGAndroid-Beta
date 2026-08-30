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
public final class mg0 extends org.telegram.ui.Components.vv0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public final ArrayList B;
    public final HashMap C;
    public final HashMap D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public Toast L;
    public String M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Runnable R;
    public final ng0 S;
    public final qj0 f36293a;
    public final jg0 f36294b;
    public final TextView f36295c;
    public final org.telegram.ui.Components.u01 d;
    public final org.telegram.ui.Components.ad0 e;
    public final org.telegram.ui.Components.ad0 f36296f;
    public final TextView h;
    public final org.telegram.ui.Components.e90 f36297n;
    public final View f36298r;
    public final ImageView f36299s;
    public final org.telegram.ui.Cells.z1 v;
    public final org.telegram.ui.Cells.z1 f36300w;
    public int f36301x;
    public st f36302y;

    public mg0(ng0 ng0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        this.S = ng0Var;
        this.f36301x = 0;
        this.B = new ArrayList();
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = 0L;
        this.N = -1;
        this.P = false;
        this.Q = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f36295c = textView;
        yh.p(18.0f, 1, textView);
        if (ng0Var.C == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, k7.b6.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new gb0(6, this, context));
        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(context, null);
        this.f36297n = e90Var;
        if (ng0Var.C == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        e90Var.setText(LocaleController.getString(i11));
        e90Var.setTextSize(1, 14.0f);
        e90Var.setGravity(17);
        e90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(e90Var, k7.b6.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new ig0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.gt.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f36299s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, k7.b6.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, k7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.ad0 ad0Var = new org.telegram.ui.Components.ad0(context, null);
        this.e = ad0Var;
        ad0Var.setText(LocaleController.getString(R.string.Country));
        ad0Var.addView(linearLayout, k7.b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        ad0Var.setForceUseCenter(true);
        ad0Var.setFocusable(true);
        ad0Var.setContentDescription(LocaleController.getString(R.string.Country));
        ad0Var.setOnFocusChangeListener(new qd(this, 9));
        addView(ad0Var, k7.b6.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        ad0Var.setOnClickListener(new View.OnClickListener(this) {
            public final mg0 f34015b;

            {
                this.f34015b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ng0 ng0Var2 = this.f34015b.S;
                        if (ng0Var2.getParentActivity() != null) {
                            boolean z10 = !ng0Var2.f36646y;
                            ng0Var2.f36646y = z10;
                            ((org.telegram.ui.Cells.z1) view).c(z10, true);
                            if (ng0Var2.f36646y) {
                                new org.telegram.ui.Components.qc(ng0Var2.W, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.qc(ng0Var2.W, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        mg0 mg0Var = this.f34015b;
                        yt ytVar = new yt(mg0Var.B, true);
                        ytVar.f40576r = new fu(mg0Var, 20);
                        mg0Var.S.presentFragment(ytVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.ad0 ad0Var2 = new org.telegram.ui.Components.ad0(context, null);
        this.f36296f = ad0Var2;
        ad0Var2.addView(linearLayout2, k7.b6.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        ad0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(ad0Var2, k7.b6.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, k7.b6.n(-2, -2));
        qj0 qj0Var = new qj0(this, context, 2);
        this.f36293a = qj0Var;
        qj0Var.setInputType(3);
        qj0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        qj0Var.setCursorWidth(1.5f);
        qj0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        qj0Var.setTextSize(1, 16.0f);
        qj0Var.setMaxLines(1);
        qj0Var.setGravity(19);
        qj0Var.setImeOptions(268435461);
        qj0Var.setBackground(null);
        qj0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        qj0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(qj0Var, k7.b6.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        qj0Var.addTextChangedListener(new n0(this, 10));
        qj0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final mg0 f33634b;

            {
                this.f33634b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        mg0 mg0Var = this.f33634b;
                        if (i14 == 5) {
                            bg0 bg0Var = mg0Var.S.Y;
                            if (bg0Var != null) {
                                bg0Var.h.callOnClick();
                                return true;
                            }
                            mg0Var.h(null);
                            return true;
                        }
                        mg0Var.getClass();
                        return false;
                    default:
                        jg0 jg0Var = this.f33634b.f36294b;
                        if (i14 == 5) {
                            jg0Var.requestFocus();
                            jg0Var.setSelection(jg0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f36298r = view;
        LinearLayout.LayoutParams k10 = k7.b6.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        jg0 jg0Var = new jg0(this, context);
        this.f36294b = jg0Var;
        jg0Var.setInputType(3);
        jg0Var.setPadding(0, 0, 0, 0);
        jg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        jg0Var.setCursorWidth(1.5f);
        jg0Var.setTextSize(1, 16.0f);
        jg0Var.setMaxLines(1);
        jg0Var.setGravity(19);
        jg0Var.setImeOptions(268435461);
        jg0Var.setBackground(null);
        jg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        jg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(jg0Var, k7.b6.c(36.0f, -1));
        jg0Var.addTextChangedListener(new xr(this, 1));
        jg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final mg0 f33634b;

            {
                this.f33634b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        mg0 mg0Var = this.f33634b;
                        if (i14 == 5) {
                            bg0 bg0Var = mg0Var.S.Y;
                            if (bg0Var != null) {
                                bg0Var.h.callOnClick();
                                return true;
                            }
                            mg0Var.h(null);
                            return true;
                        }
                        mg0Var.getClass();
                        return false;
                    default:
                        jg0 jg0Var2 = this.f33634b.f36294b;
                        if (i14 == 5) {
                            jg0Var2.requestFocus();
                            jg0Var2.setSelection(jg0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (ng0Var.f36645x && ng0Var.C == 0) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.v = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", ng0Var.f36646y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(z1Var, k7.b6.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            z1Var.setOnClickListener(new View.OnClickListener(this) {
                public final mg0 f34015b;

                {
                    this.f34015b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            ng0 ng0Var2 = this.f34015b.S;
                            if (ng0Var2.getParentActivity() != null) {
                                boolean z10 = !ng0Var2.f36646y;
                                ng0Var2.f36646y = z10;
                                ((org.telegram.ui.Cells.z1) view2).c(z10, true);
                                if (ng0Var2.f36646y) {
                                    new org.telegram.ui.Components.qc(ng0Var2.W, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.qc(ng0Var2.W, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            mg0 mg0Var = this.f34015b;
                            yt ytVar = new yt(mg0Var.B, true);
                            ytVar.f40576r = new fu(mg0Var, 20);
                            mg0Var.S.presentFragment(ytVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !ng0Var.getConnectionsManager().isTestBackend()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 && ng0Var.C == 0) {
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.f36300w = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = ng0Var.getConnectionsManager().isTestBackend();
            ng0Var.B = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, k7.b6.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 0 : 0), 0));
            i12 -= 24;
            z1Var2.setOnClickListener(new nh.a2(8, this, z4));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, k7.b6.n(-2, -2));
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
                obj.f38435a = split[2];
                String str = split[0];
                obj.f38437c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f38436b = obj.f38435a;
                        obj.f38435a = countryName;
                    }
                }
                this.B.add(0, obj);
                List list = (List) this.C.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.C;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(obj);
                if (split.length > 3) {
                    this.D.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.B, Comparator$CC.comparing(new n8(6)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        ng0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new sb0(4, this, hashMap), 10);
        if (this.f36293a.length() == 0) {
            setCountryButtonText(null);
            this.f36294b.setHintText((String) null);
            this.f36301x = 1;
        }
        if (this.f36293a.length() != 0) {
            this.f36294b.requestFocus();
            jg0 jg0Var2 = this.f36294b;
            jg0Var2.setSelection(jg0Var2.length());
        } else {
            this.f36293a.requestFocus();
        }
        s();
    }

    public static void o(mg0 mg0Var, ArrayList arrayList) {
        ng0 ng0Var = mg0Var.S;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !ng0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            ng0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.Q = string;
        ng0Var.f36638n = ng0Var.showDialog(d2Var, true, null);
        ng0Var.Z = true;
    }

    public void setCountryButtonText(CharSequence charSequence) {
        int i10;
        boolean z4;
        float f10;
        Context context = ApplicationLoader.applicationContext;
        if (this.d.getCurrentView().getText() != null && charSequence == null) {
            i10 = R.anim.text_out_down;
        } else {
            i10 = R.anim.text_out;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i10);
        loadAnimation.setInterpolator(org.telegram.ui.Components.gt.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.u01 u01Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z4 = true;
        } else {
            z4 = false;
        }
        u01Var.a(charSequence, z4, false);
        org.telegram.ui.Components.ad0 ad0Var = this.e;
        if (charSequence != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ad0Var.b(f10, f10, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void d() {
        this.H = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override
    public final void f() {
        Runnable runnable = this.R;
        if (runnable != null) {
            runnable.run();
            this.R = null;
        }
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("YourPhone", R.string.YourPhone);
    }

    @Override
    public final void h(String str) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        boolean z16;
        int i10;
        if (this.S.getParentActivity() != null && !this.H && !this.S.f36637l0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f36293a.length() != 0 && this.f36294b.length() != 0) {
                String str2 = "+" + ((Object) this.f36293a.getText()) + " " + ((Object) this.f36294b.getText());
                if (!this.I) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.S.h1() && this.S.P.R() > AndroidUtilities.dp(20.0f)) {
                        ng0 ng0Var = this.S;
                        ng0Var.Q = new cg0(this, 1);
                        AndroidUtilities.hideKeyboard(ng0Var.fragmentView);
                        return;
                    }
                    ng0 ng0Var2 = this.S;
                    Context context = this.S.fragmentView.getContext();
                    ng0 ng0Var3 = this.S;
                    ng0Var2.Y = new bg0(context, (ViewGroup) ng0Var3.fragmentView, ng0Var3.K, str2, new lg0(this));
                    bg0 bg0Var = this.S.Y;
                    bg0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new ag0(bg0Var, 0));
                    duration.addUpdateListener(new xf0(bg0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                    duration.start();
                    return;
                }
                this.I = false;
                bg0 bg0Var2 = this.S.Y;
                if (bg0Var2 != null) {
                    int i11 = bg0.B;
                    bg0Var2.a();
                }
                boolean isSimAvailable = AndroidUtilities.isSimAvailable();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && isSimAvailable) {
                    if (this.S.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.S.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i12 >= 28 && this.S.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (i12 >= 26 && this.S.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    ng0 ng0Var4 = this.S;
                    z4 = isSimAvailable;
                    if (ng0Var4.v) {
                        ng0Var4.f36642r.clear();
                        if (!z11) {
                            this.S.f36642r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z12) {
                            this.S.f36642r.add("android.permission.CALL_PHONE");
                        }
                        if (!z13) {
                            this.S.f36642r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z16 && i12 >= 26) {
                            this.S.f36642r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.S.f36642r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.S.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.S.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.S.getParentActivity().requestPermissions((String[]) this.S.f36642r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.S.getParentActivity());
                            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z11 && (!z12 || !z13)) {
                                alertDialog$Builder.f19503a.Q = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z12 && z13) {
                                alertDialog$Builder.f19503a.Q = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f19503a.Q = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                            ng0 ng0Var5 = this.S;
                            ng0Var5.h = ng0Var5.showDialog(alertDialog$Builder.f19503a);
                            this.I = true;
                            return;
                        }
                    }
                    z10 = true;
                } else {
                    z4 = isSimAvailable;
                    z10 = true;
                    z11 = true;
                    z12 = true;
                    z13 = true;
                }
                int i13 = this.f36301x;
                if (i13 == z10) {
                    this.S.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.S.k1(false, z10);
                    return;
                } else if (i13 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.S.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.S.k1(false, true);
                    return;
                } else {
                    String d = se.b.d("" + ((Object) this.f36293a.getText()) + ((Object) this.f36294b.getText()), false);
                    ng0 ng0Var6 = this.S;
                    if (ng0Var6.C == 0 && (ng0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i14 = 0; i14 < 4; i14++) {
                            UserConfig userConfig = UserConfig.getInstance(i14);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                                ng0 ng0Var7 = this.S;
                                if (isTestBackend == ng0Var7.B) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ng0Var7.getParentActivity());
                                    alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f19503a.Q = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new gg.m2(this, i14, 13));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.S.showDialog(alertDialog$Builder2.f19503a);
                                    this.S.k1(false, true);
                                    return;
                                }
                            }
                        }
                    }
                    TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
                    if (z4 && z11 && z12 && z13) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    tL_codeSettings.allow_flashcall = z14;
                    if (z4 && z11) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    tL_codeSettings.allow_missed_call = z15;
                    boolean hasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
                    tL_codeSettings.allow_firebase = hasServices;
                    tL_codeSettings.allow_app_hash = hasServices;
                    if (this.S.f36634i0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
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
                            HashSet V0 = ng0.V0(this.S);
                            if (!V0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(V0).anyMatch(new i80(d, 1));
                            } else {
                                tL_codeSettings.unknown_number = true;
                                if (UserConfig.getActivatedAccountsCount() > 0) {
                                    tL_codeSettings.allow_flashcall = false;
                                } else {
                                    tL_codeSettings.current_number = false;
                                }
                            }
                        } catch (Exception e6) {
                            tL_codeSettings.unknown_number = true;
                            FileLog.e(e6);
                        }
                    }
                    ng0 ng0Var8 = this.S;
                    if (ng0Var8.C == 2) {
                        TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                        sendchangephonecode.phone_number = d;
                        sendchangephonecode.settings = tL_codeSettings;
                        tL_auth_sendCode = sendchangephonecode;
                    } else {
                        ConnectionsManager.getInstance(ng0.W0(ng0Var8)).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                        tL_auth_sendCode2.phone_number = d;
                        tL_auth_sendCode2.settings = tL_codeSettings;
                        tL_auth_sendCode = tL_auth_sendCode2;
                    }
                    TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", "+" + ((Object) this.f36293a.getText()) + " " + ((Object) this.f36294b.getText()));
                    try {
                        bundle.putString("ephone", "+" + se.b.d(this.f36293a.getText().toString(), false) + " " + se.b.d(this.f36294b.getText().toString(), false));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    st stVar = this.f36302y;
                    if (stVar != null) {
                        bundle.putString("country", stVar.f38437c);
                    }
                    this.H = true;
                    l7.w0 w0Var = new l7.w0(22, false);
                    w0Var.d = "+" + ((Object) this.f36293a.getText()) + " " + ((Object) this.f36294b.getText());
                    w0Var.f11676b = this.f36302y;
                    w0Var.f11677c = (List) this.D.get(this.f36293a.getText().toString());
                    this.S.n1(ConnectionsManager.getInstance(ng0.X0(this.S)).sendRequest(tL_auth_sendCode3, new gg.e0(this, bundle, d, w0Var, tL_auth_sendCode3, 11), 27), true);
                    return;
                }
            }
            ng0.U0(this.S, this.f36296f, false);
        }
    }

    @Override
    public final void j() {
        q();
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            z1Var.c(this.S.f36646y, false);
        }
        AndroidUtilities.runOnUIThread(new cg0(this, 0), ng0.f36621q0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f36293a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f36294b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f36293a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f36294b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override
    public final void n() {
        this.f36295c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.e90 e90Var = this.f36297n;
        e90Var.setTextColor(w02);
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19966gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.u01 u01Var = this.d;
            if (i10 >= u01Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) u01Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        ImageView imageView = this.f36299s;
        imageView.setColorFilter(w03);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(this.S.getThemedColor(org.telegram.ui.ActionBar.j6.f19996i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        qj0 qj0Var = this.f36293a;
        qj0Var.setTextColor(w04);
        int i13 = org.telegram.ui.ActionBar.j6.f20049l6;
        qj0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f36298r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20031k6, false));
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        jg0 jg0Var = this.f36294b;
        jg0Var.setTextColor(w05);
        jg0Var.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        jg0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            int i14 = org.telegram.ui.ActionBar.j6.Y6;
            int i15 = org.telegram.ui.ActionBar.j6.W6;
            int i16 = org.telegram.ui.ActionBar.j6.X6;
            CheckBoxSquare checkBoxSquare = z1Var.f22643n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f22980s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f22981w = i16;
                checkBoxSquare.invalidate();
            }
            z1Var.g();
        }
        org.telegram.ui.Cells.z1 z1Var2 = this.f36300w;
        if (z1Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.j6.Y6;
            int i18 = org.telegram.ui.ActionBar.j6.W6;
            int i19 = org.telegram.ui.ActionBar.j6.X6;
            CheckBoxSquare checkBoxSquare2 = z1Var2.f22643n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f22980s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f22981w = i19;
                checkBoxSquare2.invalidate();
            }
            z1Var2.g();
        }
        this.f36296f.f();
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
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.E) {
            this.E = false;
            return;
        }
        this.F = true;
        this.f36293a.setText(((st) this.B.get(i10)).f38437c);
        this.F = false;
    }

    public final void q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mg0.q():void");
    }

    public final void r() {
        String str;
        int i10;
        String str2 = this.M;
        jg0 jg0Var = this.f36294b;
        if (jg0Var.getText() == null) {
            str = "";
        } else {
            str = jg0Var.getText().toString().replace(" ", "");
        }
        HashMap hashMap = this.D;
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
            if (this.N != i10) {
                String str5 = (String) ((List) hashMap.get(str2)).get(i10);
                int selectionStart = jg0Var.getSelectionStart();
                int selectionEnd = jg0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                jg0Var.setHintText(str3);
                jg0Var.setSelection(Math.max(0, Math.min(jg0Var.length(), selectionStart)), Math.max(0, Math.min(jg0Var.length(), selectionEnd)));
                this.N = i10;
            }
        } else if (this.N != -1) {
            int selectionStart2 = jg0Var.getSelectionStart();
            int selectionEnd2 = jg0Var.getSelectionEnd();
            jg0Var.setHintText((String) null);
            jg0Var.setSelection(selectionStart2, selectionEnd2);
            this.N = -1;
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
        this.S.getConnectionsManager().sendRequest(tL_help_getCountriesList, new gg0(this, 0), 10);
    }

    public final void t(boolean z4) {
        ng0 ng0Var = this.S;
        if (ng0Var.C == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.Q) {
            if (z4 || !this.P) {
                this.Q = true;
                this.P = true;
                this.R = PasskeysController.login(getContext(), ng0.Y0(ng0Var), z4, new fg0(this, 0));
            }
        }
    }

    public final void v(String str, st stVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(stVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) stVar.f38435a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.M = str;
        this.N = -1;
        r();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

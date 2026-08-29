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
public final class eg0 extends org.telegram.ui.Components.mv0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public final ArrayList A;
    public final HashMap B;
    public final HashMap C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public Toast K;
    public String L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Runnable Q;
    public final fg0 R;
    public final ij0 f37810a;
    public final bg0 f37811b;
    public final TextView f37812c;
    public final org.telegram.ui.Components.j01 d;
    public final org.telegram.ui.Components.uc0 f37813e;
    public final org.telegram.ui.Components.uc0 f37814f;
    public final TextView h;
    public final org.telegram.ui.Components.y80 f37815n;
    public final View f37816r;
    public final ImageView f37817s;
    public final org.telegram.ui.Cells.y1 v;
    public final org.telegram.ui.Cells.y1 f37818w;
    public int f37819x;
    public lt f37820y;

    public eg0(fg0 fg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.R = fg0Var;
        this.f37819x = 0;
        this.A = new ArrayList();
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0L;
        this.M = -1;
        this.O = false;
        this.P = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f37812c = textView;
        th.n(18.0f, 1, textView);
        if (fg0Var.B == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, i7.f6.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new t70(9, this, context));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, null);
        this.f37815n = y80Var;
        if (fg0Var.B == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        y80Var.setText(LocaleController.getString(i11));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setGravity(17);
        y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(y80Var, i7.f6.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new ag0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ct.f27567e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f37817s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, i7.f6.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, i7.f6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(context, null);
        this.f37813e = uc0Var;
        uc0Var.setText(LocaleController.getString(R.string.Country));
        uc0Var.addView(linearLayout, i7.f6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        uc0Var.setForceUseCenter(true);
        uc0Var.setFocusable(true);
        uc0Var.setContentDescription(LocaleController.getString(R.string.Country));
        uc0Var.setOnFocusChangeListener(new kd(this, 9));
        addView(uc0Var, i7.f6.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        uc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final eg0 f44300b;

            {
                this.f44300b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        fg0 fg0Var2 = this.f44300b.R;
                        if (fg0Var2.getParentActivity() != null) {
                            boolean z11 = !fg0Var2.f38175y;
                            fg0Var2.f38175y = z11;
                            ((org.telegram.ui.Cells.y1) view).c(z11, true);
                            if (fg0Var2.f38175y) {
                                new org.telegram.ui.Components.tc(fg0Var2.V, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.tc(fg0Var2.V, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        eg0 eg0Var = this.f44300b;
                        rt rtVar = new rt(eg0Var.A, true);
                        rtVar.f42203r = new xt(eg0Var, 20);
                        eg0Var.R.presentFragment(rtVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.uc0 uc0Var2 = new org.telegram.ui.Components.uc0(context, null);
        this.f37814f = uc0Var2;
        uc0Var2.addView(linearLayout2, i7.f6.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        uc0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(uc0Var2, i7.f6.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, i7.f6.n(-2, -2));
        ij0 ij0Var = new ij0(this, context, 2);
        this.f37810a = ij0Var;
        ij0Var.setInputType(3);
        ij0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        ij0Var.setCursorWidth(1.5f);
        ij0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        ij0Var.setTextSize(1, 16.0f);
        ij0Var.setMaxLines(1);
        ij0Var.setGravity(19);
        ij0Var.setImeOptions(268435461);
        ij0Var.setBackground(null);
        ij0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        ij0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(ij0Var, i7.f6.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ij0Var.addTextChangedListener(new p0(this, 10));
        ij0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final eg0 f43579b;

            {
                this.f43579b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        eg0 eg0Var = this.f43579b;
                        if (i14 == 5) {
                            tf0 tf0Var = eg0Var.R.X;
                            if (tf0Var != null) {
                                tf0Var.h.callOnClick();
                                return true;
                            }
                            eg0Var.h(null);
                            return true;
                        }
                        eg0Var.getClass();
                        return false;
                    default:
                        bg0 bg0Var = this.f43579b.f37811b;
                        if (i14 == 5) {
                            bg0Var.requestFocus();
                            bg0Var.setSelection(bg0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f37816r = view;
        LinearLayout.LayoutParams k9 = i7.f6.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k9.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k9);
        bg0 bg0Var = new bg0(this, context);
        this.f37811b = bg0Var;
        bg0Var.setInputType(3);
        bg0Var.setPadding(0, 0, 0, 0);
        bg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        bg0Var.setCursorWidth(1.5f);
        bg0Var.setTextSize(1, 16.0f);
        bg0Var.setMaxLines(1);
        bg0Var.setGravity(19);
        bg0Var.setImeOptions(268435461);
        bg0Var.setBackground(null);
        bg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        bg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(bg0Var, i7.f6.c(36.0f, -1));
        bg0Var.addTextChangedListener(new rr(this, 1));
        bg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final eg0 f43579b;

            {
                this.f43579b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        eg0 eg0Var = this.f43579b;
                        if (i14 == 5) {
                            tf0 tf0Var = eg0Var.R.X;
                            if (tf0Var != null) {
                                tf0Var.h.callOnClick();
                                return true;
                            }
                            eg0Var.h(null);
                            return true;
                        }
                        eg0Var.getClass();
                        return false;
                    default:
                        bg0 bg0Var2 = this.f43579b.f37811b;
                        if (i14 == 5) {
                            bg0Var2.requestFocus();
                            bg0Var2.setSelection(bg0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (fg0Var.f38174x && fg0Var.B == 0) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 2);
            this.v = y1Var;
            y1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", fg0Var.f38175y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(y1Var, i7.f6.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            y1Var.setOnClickListener(new View.OnClickListener(this) {
                public final eg0 f44300b;

                {
                    this.f44300b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            fg0 fg0Var2 = this.f44300b.R;
                            if (fg0Var2.getParentActivity() != null) {
                                boolean z11 = !fg0Var2.f38175y;
                                fg0Var2.f38175y = z11;
                                ((org.telegram.ui.Cells.y1) view2).c(z11, true);
                                if (fg0Var2.f38175y) {
                                    new org.telegram.ui.Components.tc(fg0Var2.V, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.tc(fg0Var2.V, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            eg0 eg0Var = this.f44300b;
                            rt rtVar = new rt(eg0Var.A, true);
                            rtVar.f42203r = new xt(eg0Var, 20);
                            eg0Var.R.presentFragment(rtVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !fg0Var.getConnectionsManager().isTestBackend()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && fg0Var.B == 0) {
            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(context, 2);
            this.f37818w = y1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = fg0Var.getConnectionsManager().isTestBackend();
            fg0Var.A = isTestBackend;
            y1Var2.e(string, "", isTestBackend, false, false);
            addView(y1Var2, i7.f6.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 0 : 0), 0));
            i12 -= 24;
            y1Var2.setOnClickListener(new lh.z1(8, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, i7.f6.n(-2, -2));
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
                obj.f40272a = split[2];
                String str = split[0];
                obj.f40274c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f40273b = obj.f40272a;
                        obj.f40272a = countryName;
                    }
                }
                this.A.add(0, obj);
                List list = (List) this.B.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.B;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(obj);
                if (split.length > 3) {
                    this.C.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Collections.sort(this.A, Comparator$CC.comparing(new j8(6)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        fg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new u80(7, this, hashMap), 10);
        if (this.f37810a.length() == 0) {
            setCountryButtonText(null);
            this.f37811b.setHintText((String) null);
            this.f37819x = 1;
        }
        if (this.f37810a.length() != 0) {
            this.f37811b.requestFocus();
            bg0 bg0Var2 = this.f37811b;
            bg0Var2.setSelection(bg0Var2.length());
        } else {
            this.f37810a.requestFocus();
        }
        s();
    }

    public static void o(eg0 eg0Var, ArrayList arrayList) {
        fg0 fg0Var = eg0Var.R;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !fg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            fg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.P = string;
        fg0Var.f38168n = fg0Var.showDialog(c2Var, true, null);
        fg0Var.Y = true;
    }

    public void setCountryButtonText(CharSequence charSequence) {
        int i10;
        boolean z10;
        float f9;
        Context context = ApplicationLoader.applicationContext;
        if (this.d.getCurrentView().getText() != null && charSequence == null) {
            i10 = R.anim.text_out_down;
        } else {
            i10 = R.anim.text_out;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i10);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ct.f27567e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.j01 j01Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        j01Var.a(charSequence, z10, false);
        org.telegram.ui.Components.uc0 uc0Var = this.f37813e;
        if (charSequence != null) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        uc0Var.b(f9, f9, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void d() {
        this.G = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override
    public final void f() {
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
            this.Q = null;
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
        if (this.R.getParentActivity() != null && !this.G && !this.R.f38166k0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f37810a.length() != 0 && this.f37811b.length() != 0) {
                String str2 = "+" + ((Object) this.f37810a.getText()) + " " + ((Object) this.f37811b.getText());
                if (!this.H) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.R.h1() && this.R.O.R() > AndroidUtilities.dp(20.0f)) {
                        fg0 fg0Var = this.R;
                        fg0Var.P = new uf0(this, 1);
                        AndroidUtilities.hideKeyboard(fg0Var.fragmentView);
                        return;
                    }
                    fg0 fg0Var2 = this.R;
                    Context context = this.R.fragmentView.getContext();
                    fg0 fg0Var3 = this.R;
                    fg0Var2.X = new tf0(context, (ViewGroup) fg0Var3.fragmentView, fg0Var3.J, str2, new dg0(this));
                    tf0 tf0Var = this.R.X;
                    tf0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new sf0(tf0Var, 0));
                    duration.addUpdateListener(new pf0(tf0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                    duration.start();
                    return;
                }
                this.H = false;
                tf0 tf0Var2 = this.R.X;
                if (tf0Var2 != null) {
                    int i11 = tf0.A;
                    tf0Var2.a();
                }
                boolean isSimAvailable = AndroidUtilities.isSimAvailable();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && isSimAvailable) {
                    if (this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.R.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 >= 28 && this.R.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i12 >= 26 && this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    fg0 fg0Var4 = this.R;
                    z10 = isSimAvailable;
                    if (fg0Var4.v) {
                        fg0Var4.f38171r.clear();
                        if (!z12) {
                            this.R.f38171r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.R.f38171r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.R.f38171r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.R.f38171r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.R.f38171r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.R.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.R.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.R.getParentActivity().requestPermissions((String[]) this.R.f38171r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.R.getParentActivity());
                            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f22714a.P = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f22714a.P = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f22714a.P = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                            fg0 fg0Var5 = this.R;
                            fg0Var5.h = fg0Var5.showDialog(alertDialog$Builder.f22714a);
                            this.H = true;
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
                int i13 = this.f37819x;
                if (i13 == z11) {
                    this.R.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.R.k1(false, z11);
                    return;
                } else if (i13 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.R.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.R.k1(false, true);
                    return;
                } else {
                    String d = qe.b.d("" + ((Object) this.f37810a.getText()) + ((Object) this.f37811b.getText()), false);
                    fg0 fg0Var6 = this.R;
                    if (fg0Var6.B == 0 && (fg0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i14 = 0; i14 < 4; i14++) {
                            UserConfig userConfig = UserConfig.getInstance(i14);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                                fg0 fg0Var7 = this.R;
                                if (isTestBackend == fg0Var7.A) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fg0Var7.getParentActivity());
                                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f22714a.P = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new eg.n2(this, i14, 12));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.R.showDialog(alertDialog$Builder2.f22714a);
                                    this.R.k1(false, true);
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
                    if (this.R.f38163h0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
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
                            HashSet V0 = fg0.V0(this.R);
                            if (!V0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(V0).anyMatch(new z70(d, 1));
                            } else {
                                tL_codeSettings.unknown_number = true;
                                if (UserConfig.getActivatedAccountsCount() > 0) {
                                    tL_codeSettings.allow_flashcall = false;
                                } else {
                                    tL_codeSettings.current_number = false;
                                }
                            }
                        } catch (Exception e11) {
                            tL_codeSettings.unknown_number = true;
                            FileLog.e(e11);
                        }
                    }
                    fg0 fg0Var8 = this.R;
                    if (fg0Var8.B == 2) {
                        TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                        sendchangephonecode.phone_number = d;
                        sendchangephonecode.settings = tL_codeSettings;
                        tL_auth_sendCode = sendchangephonecode;
                    } else {
                        ConnectionsManager.getInstance(fg0.W0(fg0Var8)).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                        tL_auth_sendCode2.phone_number = d;
                        tL_auth_sendCode2.settings = tL_codeSettings;
                        tL_auth_sendCode = tL_auth_sendCode2;
                    }
                    TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", "+" + ((Object) this.f37810a.getText()) + " " + ((Object) this.f37811b.getText()));
                    try {
                        bundle.putString("ephone", "+" + qe.b.d(this.f37810a.getText().toString(), false) + " " + qe.b.d(this.f37811b.getText().toString(), false));
                    } catch (Exception e12) {
                        FileLog.e(e12);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    lt ltVar = this.f37820y;
                    if (ltVar != null) {
                        bundle.putString("country", ltVar.f40274c);
                    }
                    this.G = true;
                    l3.g0 g0Var = new l3.g0(19, false);
                    g0Var.d = "+" + ((Object) this.f37810a.getText()) + " " + ((Object) this.f37811b.getText());
                    g0Var.f14096b = this.f37820y;
                    g0Var.f14097c = (List) this.C.get(this.f37810a.getText().toString());
                    this.R.n1(ConnectionsManager.getInstance(fg0.X0(this.R)).sendRequest(tL_auth_sendCode3, new eg.f0(this, bundle, d, g0Var, tL_auth_sendCode3, 12), 27), true);
                    return;
                }
            }
            fg0.U0(this.R, this.f37814f, false);
        }
    }

    @Override
    public final void j() {
        q();
        org.telegram.ui.Cells.y1 y1Var = this.v;
        if (y1Var != null) {
            y1Var.c(this.R.f38175y, false);
        }
        AndroidUtilities.runOnUIThread(new uf0(this, 0), fg0.f38150p0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f37810a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f37811b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37810a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f37811b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override
    public final void n() {
        this.f37812c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false);
        org.telegram.ui.Components.y80 y80Var = this.f37815n;
        y80Var.setTextColor(w02);
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.j01 j01Var = this.d;
            if (i10 >= j01Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) j01Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        ImageView imageView = this.f37817s;
        imageView.setColorFilter(w03);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(this.R.getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        ij0 ij0Var = this.f37810a;
        ij0Var.setTextColor(w04);
        int i13 = org.telegram.ui.ActionBar.g6.f23206l6;
        ij0Var.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f37816r.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23189k6, false));
        int w05 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        bg0 bg0Var = this.f37811b;
        bg0Var.setTextColor(w05);
        bg0Var.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        bg0Var.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        org.telegram.ui.Cells.y1 y1Var = this.v;
        if (y1Var != null) {
            int i14 = org.telegram.ui.ActionBar.g6.Y6;
            int i15 = org.telegram.ui.ActionBar.g6.W6;
            int i16 = org.telegram.ui.ActionBar.g6.X6;
            CheckBoxSquare checkBoxSquare = y1Var.f25987n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f26340s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f26341w = i16;
                checkBoxSquare.invalidate();
            }
            y1Var.g();
        }
        org.telegram.ui.Cells.y1 y1Var2 = this.f37818w;
        if (y1Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.g6.Y6;
            int i18 = org.telegram.ui.ActionBar.g6.W6;
            int i19 = org.telegram.ui.ActionBar.g6.X6;
            CheckBoxSquare checkBoxSquare2 = y1Var2.f25987n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f26340s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f26341w = i19;
                checkBoxSquare2.invalidate();
            }
            y1Var2.g();
        }
        this.f37814f.f();
        this.f37813e.f();
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
        if (this.D) {
            this.D = false;
            return;
        }
        this.E = true;
        this.f37810a.setText(((lt) this.A.get(i10)).f40274c);
        this.E = false;
    }

    public final void q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eg0.q():void");
    }

    public final void r() {
        String str;
        int i10;
        String str2 = this.L;
        bg0 bg0Var = this.f37811b;
        if (bg0Var.getText() == null) {
            str = "";
        } else {
            str = bg0Var.getText().toString().replace(" ", "");
        }
        HashMap hashMap = this.C;
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
            if (this.M != i10) {
                String str5 = (String) ((List) hashMap.get(str2)).get(i10);
                int selectionStart = bg0Var.getSelectionStart();
                int selectionEnd = bg0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                bg0Var.setHintText(str3);
                bg0Var.setSelection(Math.max(0, Math.min(bg0Var.length(), selectionStart)), Math.max(0, Math.min(bg0Var.length(), selectionEnd)));
                this.M = i10;
            }
        } else if (this.M != -1) {
            int selectionStart2 = bg0Var.getSelectionStart();
            int selectionEnd2 = bg0Var.getSelectionEnd();
            bg0Var.setHintText((String) null);
            bg0Var.setSelection(selectionStart2, selectionEnd2);
            this.M = -1;
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
        this.R.getConnectionsManager().sendRequest(tL_help_getCountriesList, new yf0(this, 0), 10);
    }

    public final void t(boolean z10) {
        fg0 fg0Var = this.R;
        if (fg0Var.B == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.P) {
            if (z10 || !this.O) {
                this.P = true;
                this.O = true;
                this.Q = PasskeysController.login(getContext(), fg0.Y0(fg0Var), z10, new xf0(this, 0));
            }
        }
    }

    public final void v(String str, lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.gz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.f40272a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.L = str;
        this.M = -1;
        r();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.util.Property;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;

public final class hg0 extends org.telegram.ui.Components.ev0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
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
    public final ig0 R;

    public final mj0 f38804a;

    public final eg0 f38805b;

    public final TextView f38806c;
    public final org.telegram.ui.Components.zz0 d;

    public final org.telegram.ui.Components.jc0 f38807e;

    public final org.telegram.ui.Components.jc0 f38808f;
    public final TextView h;

    public final org.telegram.ui.Components.p80 f38809n;

    public final View f38810r;

    public final ImageView f38811s;
    public final org.telegram.ui.Cells.y1 v;

    public final org.telegram.ui.Cells.y1 f38812w;

    public int f38813x;

    public nt f38814y;

    public hg0(ig0 ig0Var, Context context) {
        int i10;
        super(context);
        this.R = ig0Var;
        this.f38813x = 0;
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
        this.f38806c = textView;
        org.telegram.ui.Cells.pa.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(ig0Var.B == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, h7.z5.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new u70(9, this, context));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.f38809n = p80Var;
        p80Var.setText(LocaleController.getString(ig0Var.B == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(p80Var, h7.z5.t(-1, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0(context);
        this.d = zz0Var;
        zz0Var.setFactory(new dg0(context, 0));
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        animationLoadAnimation.setInterpolator(org.telegram.ui.Components.ws.f34319e);
        zz0Var.setInAnimation(animationLoadAnimation);
        ImageView imageView = new ImageView(context);
        this.f38811s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(zz0Var, h7.z5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, h7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
        this.f38807e = jc0Var;
        jc0Var.setText(LocaleController.getString(R.string.Country));
        jc0Var.addView(linearLayout, h7.z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        jc0Var.setForceUseCenter(true);
        jc0Var.setFocusable(true);
        jc0Var.setContentDescription(LocaleController.getString(R.string.Country));
        jc0Var.setOnFocusChangeListener(new ld(this, 9));
        addView(jc0Var, h7.z5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        final int i11 = 1;
        jc0Var.setOnClickListener(new View.OnClickListener(this) {

            public final hg0 f45160b;

            {
                this.f45160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ig0 ig0Var2 = this.f45160b.R;
                        if (ig0Var2.getParentActivity() != null) {
                            boolean z10 = !ig0Var2.f39103y;
                            ig0Var2.f39103y = z10;
                            ((org.telegram.ui.Cells.y1) view).c(z10, true);
                            if (!ig0Var2.f39103y) {
                                new org.telegram.ui.Components.mc(ig0Var2.V, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                            } else {
                                new org.telegram.ui.Components.mc(ig0Var2.V, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                            }
                            break;
                        }
                        break;
                    default:
                        hg0 hg0Var = this.f45160b;
                        tt ttVar = new tt(hg0Var.A, true);
                        ttVar.f43010r = new zt(hg0Var, 20);
                        hg0Var.R.presentFragment(ttVar);
                        break;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.jc0 jc0Var2 = new org.telegram.ui.Components.jc0(context, null);
        this.f38808f = jc0Var2;
        jc0Var2.addView(linearLayout2, h7.z5.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        jc0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(jc0Var2, h7.z5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, h7.z5.n(-2, -2));
        mj0 mj0Var = new mj0(this, context, 2);
        this.f38804a = mj0Var;
        mj0Var.setInputType(3);
        mj0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        mj0Var.setCursorWidth(1.5f);
        mj0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        mj0Var.setTextSize(1, 16.0f);
        mj0Var.setMaxLines(1);
        mj0Var.setGravity(19);
        mj0Var.setImeOptions(268435461);
        mj0Var.setBackground(null);
        mj0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        mj0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(mj0Var, h7.z5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        mj0Var.addTextChangedListener(new p0(this, 10));
        final int i12 = 1;
        mj0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final hg0 f44804b;

            {
                this.f44804b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        hg0 hg0Var = this.f44804b;
                        if (i13 != 5) {
                            hg0Var.getClass();
                            return false;
                        }
                        wf0 wf0Var = hg0Var.R.X;
                        if (wf0Var != null) {
                            wf0Var.h.callOnClick();
                            return true;
                        }
                        hg0Var.h(null);
                        return true;
                    default:
                        eg0 eg0Var = this.f44804b.f38805b;
                        if (i13 != 5) {
                            return false;
                        }
                        eg0Var.requestFocus();
                        eg0Var.setSelection(eg0Var.length());
                        return true;
                }
            }
        });
        View view = new View(context);
        this.f38810r = view;
        LinearLayout.LayoutParams layoutParamsK = h7.z5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        layoutParamsK.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, layoutParamsK);
        eg0 eg0Var = new eg0(this, context);
        this.f38805b = eg0Var;
        eg0Var.setInputType(3);
        eg0Var.setPadding(0, 0, 0, 0);
        eg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        eg0Var.setCursorWidth(1.5f);
        eg0Var.setTextSize(1, 16.0f);
        eg0Var.setMaxLines(1);
        eg0Var.setGravity(19);
        eg0Var.setImeOptions(268435461);
        eg0Var.setBackground(null);
        eg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        eg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(eg0Var, h7.z5.c(36.0f, -1));
        eg0Var.addTextChangedListener(new tr(this, 1));
        final int i13 = 0;
        eg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final hg0 f44804b;

            {
                this.f44804b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        hg0 hg0Var = this.f44804b;
                        if (i14 != 5) {
                            hg0Var.getClass();
                            return false;
                        }
                        wf0 wf0Var = hg0Var.R.X;
                        if (wf0Var != null) {
                            wf0Var.h.callOnClick();
                            return true;
                        }
                        hg0Var.h(null);
                        return true;
                    default:
                        eg0 eg0Var2 = this.f44804b.f38805b;
                        if (i14 != 5) {
                            return false;
                        }
                        eg0Var2.requestFocus();
                        eg0Var2.setSelection(eg0Var2.length());
                        return true;
                }
            }
        });
        if (ig0Var.f39102x && ig0Var.B == 0) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 2);
            this.v = y1Var;
            y1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", ig0Var.f39103y, false, false);
            addView(y1Var, h7.z5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            final int i14 = 0;
            y1Var.setOnClickListener(new View.OnClickListener(this) {

                public final hg0 f45160b;

                {
                    this.f45160b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            ig0 ig0Var2 = this.f45160b.R;
                            if (ig0Var2.getParentActivity() != null) {
                                boolean z10 = !ig0Var2.f39103y;
                                ig0Var2.f39103y = z10;
                                ((org.telegram.ui.Cells.y1) view2).c(z10, true);
                                if (!ig0Var2.f39103y) {
                                    new org.telegram.ui.Components.mc(ig0Var2.V, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                } else {
                                    new org.telegram.ui.Components.mc(ig0Var2.V, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                }
                                break;
                            }
                            break;
                        default:
                            hg0 hg0Var = this.f45160b;
                            tt ttVar = new tt(hg0Var.A, true);
                            ttVar.f43010r = new zt(hg0Var, 20);
                            hg0Var.R.presentFragment(ttVar);
                            break;
                    }
                }
            });
            i10 = 48;
        } else {
            i10 = 72;
        }
        boolean z10 = BuildVars.DEBUG_VERSION || ig0Var.getConnectionsManager().isTestBackend();
        if (z10 && ig0Var.B == 0) {
            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(context, 2);
            this.f38812w = y1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean zIsTestBackend = ig0Var.getConnectionsManager().isTestBackend();
            ig0Var.A = zIsTestBackend;
            y1Var2.e(string, "", zIsTestBackend, false, false);
            addView(y1Var2, h7.z5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
            i10 -= 24;
            y1Var2.setOnClickListener(new jh.a2(8, this, z10));
        }
        if (i10 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i10));
            addView(space, h7.z5.n(-2, -2));
        }
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                nt ntVar = new nt();
                ntVar.f40915a = strArrSplit[2];
                String str = strArrSplit[0];
                ntVar.f40917c = str;
                ntVar.d = strArrSplit[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(ntVar.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(ntVar.d, countryName)) {
                        ntVar.f40916b = ntVar.f40915a;
                        ntVar.f40915a = countryName;
                    }
                }
                this.A.add(0, ntVar);
                List list = (List) this.B.get(strArrSplit[0]);
                if (list == null) {
                    HashMap map2 = this.B;
                    String str2 = strArrSplit[0];
                    ArrayList arrayList = new ArrayList();
                    map2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(ntVar);
                if (strArrSplit.length > 3) {
                    this.C.put(strArrSplit[0], Collections.singletonList(strArrSplit[3]));
                }
                map.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        Collections.sort(this.A, Comparator$CC.comparing(new l8(6)));
        try {
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ig0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new v80(8, this, map), 10);
        if (this.f38804a.length() == 0) {
            setCountryButtonText(null);
            this.f38805b.setHintText((String) null);
            this.f38813x = 1;
        }
        if (this.f38804a.length() != 0) {
            this.f38805b.requestFocus();
            eg0 eg0Var2 = this.f38805b;
            eg0Var2.setSelection(eg0Var2.length());
        } else {
            this.f38804a.requestFocus();
        }
        s();
    }

    public static void o(hg0 hg0Var, ArrayList arrayList) {
        ig0 ig0Var = hg0Var.R;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !ig0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            ig0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.P = string;
        ig0Var.f39096n = ig0Var.showDialog(b2Var, true, null);
        ig0Var.Y = true;
    }

    public void setCountryButtonText(CharSequence charSequence) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.d.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
        animationLoadAnimation.setInterpolator(org.telegram.ui.Components.ws.f34319e);
        this.d.setOutAnimation(animationLoadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        this.d.a(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true, false);
        org.telegram.ui.Components.jc0 jc0Var = this.f38807e;
        float f10 = charSequence != null ? 1.0f : 0.0f;
        jc0Var.b(f10, f10, true);
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
        TLObject tLObject;
        int i10;
        if (this.R.getParentActivity() == null || this.G || this.R.f39094k0) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("sim status = " + telephonyManager.getSimState());
        }
        int i11 = 0;
        if (this.f38804a.length() == 0 || this.f38805b.length() == 0) {
            ig0.U0(this.R, this.f38808f, false);
            return;
        }
        String str2 = "+" + ((Object) this.f38804a.getText()) + " " + ((Object) this.f38805b.getText());
        int i12 = 1;
        if (!this.H) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y && !this.R.h1() && this.R.O.R() > AndroidUtilities.dp(20.0f)) {
                ig0 ig0Var = this.R;
                ig0Var.P = new xf0(this, i12);
                AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                return;
            }
            ig0 ig0Var2 = this.R;
            Context context = this.R.fragmentView.getContext();
            ig0 ig0Var3 = this.R;
            ig0Var2.X = new wf0(context, (ViewGroup) ig0Var3.fragmentView, ig0Var3.J, str2, new gg0(this));
            wf0 wf0Var = this.R.X;
            wf0Var.getClass();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new vf0(wf0Var, i11));
            duration.addUpdateListener(new sf0(wf0Var, 1));
            duration.setInterpolator(org.telegram.ui.Components.er.f28122f);
            duration.start();
            return;
        }
        this.H = false;
        wf0 wf0Var2 = this.R.X;
        if (wf0Var2 != null) {
            int i13 = wf0.A;
            wf0Var2.a();
        }
        boolean zIsSimAvailable = AndroidUtilities.isSimAvailable();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 23 || !zIsSimAvailable) {
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
        } else {
            z11 = this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            z12 = this.R.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            z13 = i14 < 28 || this.R.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i14 < 26 || this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            ig0 ig0Var4 = this.R;
            if (ig0Var4.v) {
                ig0Var4.f39099r.clear();
                if (!z11) {
                    this.R.f39099r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    this.R.f39099r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    this.R.f39099r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i14 >= 26) {
                    this.R.f39099r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!this.R.f39099r.isEmpty()) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (!globalMainSettings.getBoolean("firstlogin", true) && !this.R.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.R.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            this.R.getParentActivity().requestPermissions((String[]) this.R.f39099r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                    globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.R.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                    if (!z11 && (!z12 || !z13)) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                        i10 = R.raw.calls_log;
                    } else if (z12 && z13) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                        i10 = R.raw.incoming_calls;
                    } else {
                        alertDialog$Builder.f22702a.P = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                        i10 = R.raw.calls_log;
                    }
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                    ig0 ig0Var5 = this.R;
                    ig0Var5.h = ig0Var5.showDialog(alertDialog$Builder.f22702a);
                    this.H = true;
                    return;
                }
            }
            z10 = true;
        }
        int i15 = this.f38813x;
        if (i15 == z10) {
            this.R.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
            this.R.k1(false, z10);
            return;
        }
        if (i15 == 2 && !BuildVars.DEBUG_VERSION) {
            this.R.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
            this.R.k1(false, true);
            return;
        }
        String strD = oe.b.d("" + ((Object) this.f38804a.getText()) + ((Object) this.f38805b.getText()), false);
        ig0 ig0Var6 = this.R;
        if (ig0Var6.B == 0 && (ig0Var6.getParentActivity() instanceof LaunchActivity)) {
            for (int i16 = 0; i16 < 4; i16++) {
                UserConfig userConfig = UserConfig.getInstance(i16);
                if (userConfig.isClientActivated() && PhoneNumberUtils.compare(strD, userConfig.getCurrentUser().phone)) {
                    boolean zIsTestBackend = ConnectionsManager.getInstance(i16).isTestBackend();
                    ig0 ig0Var7 = this.R;
                    if (zIsTestBackend == ig0Var7.A) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var7.getParentActivity());
                        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder2.f22702a.P = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                        alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new cg.p2(this, i16, 12));
                        alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                        this.R.showDialog(alertDialog$Builder2.f22702a);
                        this.R.k1(false, true);
                        return;
                    }
                }
            }
        }
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        tL_codeSettings.allow_flashcall = zIsSimAvailable != 0 && z11 && z12 && z13;
        tL_codeSettings.allow_missed_call = zIsSimAvailable && z11;
        boolean zHasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
        tL_codeSettings.allow_firebase = zHasServices;
        tL_codeSettings.allow_app_hash = zHasServices;
        if (this.R.f39091h0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
            tL_codeSettings.allow_firebase = false;
        }
        ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
        int i17 = 20;
        if (savedLogInTokens != null) {
            for (int i18 = 0; i18 < savedLogInTokens.size(); i18++) {
                if (savedLogInTokens.get(i18).future_auth_token != null) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i18).future_auth_token, StandardCharsets.UTF_8)));
                    }
                    tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i18).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
            }
        }
        ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
        if (savedLogOutTokens != null) {
            for (int i19 = 0; i19 < savedLogOutTokens.size(); i19++) {
                if (tL_codeSettings.logout_tokens == null) {
                    tL_codeSettings.logout_tokens = new ArrayList<>();
                }
                tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i19).future_auth_token);
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
                HashSet hashSetV0 = ig0.V0(this.R);
                if (hashSetV0.isEmpty()) {
                    tL_codeSettings.unknown_number = true;
                    if (UserConfig.getActivatedAccountsCount() > 0) {
                        tL_codeSettings.allow_flashcall = false;
                    } else {
                        tL_codeSettings.current_number = false;
                    }
                } else {
                    tL_codeSettings.unknown_number = false;
                    tL_codeSettings.current_number = Collection.EL.stream(hashSetV0).anyMatch(new a80(strD, 1));
                }
            } catch (Exception e10) {
                tL_codeSettings.unknown_number = true;
                FileLog.e(e10);
            }
        }
        ig0 ig0Var8 = this.R;
        if (ig0Var8.B == 2) {
            TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
            sendchangephonecode.phone_number = strD;
            sendchangephonecode.settings = tL_codeSettings;
            tLObject = sendchangephonecode;
        } else {
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var8).currentAccount).cleanup(false);
            TLRPC.TL_auth_sendCode tL_auth_sendCode = new TLRPC.TL_auth_sendCode();
            tL_auth_sendCode.api_hash = BuildVars.APP_HASH;
            tL_auth_sendCode.api_id = BuildVars.APP_ID;
            tL_auth_sendCode.phone_number = strD;
            tL_auth_sendCode.settings = tL_codeSettings;
            tLObject = tL_auth_sendCode;
        }
        TLObject tLObject2 = tLObject;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + ((Object) this.f38804a.getText()) + " " + ((Object) this.f38805b.getText()));
        try {
            bundle.putString("ephone", "+" + oe.b.d(this.f38804a.getText().toString(), false) + " " + oe.b.d(this.f38805b.getText().toString(), false));
        } catch (Exception e11) {
            FileLog.e(e11);
            bundle.putString("ephone", "+" + strD);
        }
        bundle.putString("phoneFormated", strD);
        nt ntVar = this.f38814y;
        if (ntVar != null) {
            bundle.putString("country", ntVar.f40917c);
        }
        this.G = true;
        j9.a aVar = new j9.a(i17, false);
        aVar.f12863b = "+" + ((Object) this.f38804a.getText()) + " " + ((Object) this.f38805b.getText());
        aVar.f12864c = this.f38814y;
        aVar.d = (List) this.C.get(this.f38804a.getText().toString());
        this.R.n1(ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) this.R).currentAccount).sendRequest(tLObject2, new cg.e0(this, bundle, strD, aVar, tLObject2, 12), 27), true);
    }

    @Override
    public final void j() {
        q();
        org.telegram.ui.Cells.y1 y1Var = this.v;
        if (y1Var != null) {
            y1Var.c(this.R.f39103y, false);
        }
        AndroidUtilities.runOnUIThread(new xf0(this, 0), ig0.f39078p0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f38804a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f38805b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String string = this.f38804a.getText().toString();
        if (string.length() != 0) {
            bundle.putString("phoneview_code", string);
        }
        String string2 = this.f38805b.getText().toString();
        if (string2.length() != 0) {
            bundle.putString("phoneview_phone", string2);
        }
    }

    @Override
    public final void n() {
        this.f38806c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false);
        org.telegram.ui.Components.p80 p80Var = this.f38809n;
        p80Var.setTextColor(iW0);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.zz0 zz0Var = this.d;
            if (i10 >= zz0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) zz0Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        ImageView imageView = this.f38811s;
        imageView.setColorFilter(iW1);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(this.R.getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        mj0 mj0Var = this.f38804a;
        mj0Var.setTextColor(iW2);
        int i13 = org.telegram.ui.ActionBar.g6.f23198l6;
        mj0Var.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f38810r.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181k6, false));
        int iW3 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        eg0 eg0Var = this.f38805b;
        eg0Var.setTextColor(iW3);
        eg0Var.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        eg0Var.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        org.telegram.ui.Cells.y1 y1Var = this.v;
        if (y1Var != null) {
            int i14 = org.telegram.ui.ActionBar.g6.Y6;
            int i15 = org.telegram.ui.ActionBar.g6.W6;
            int i16 = org.telegram.ui.ActionBar.g6.X6;
            CheckBoxSquare checkBoxSquare = y1Var.f25980n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f26325s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f26326w = i16;
                checkBoxSquare.invalidate();
            }
            y1Var.g();
        }
        org.telegram.ui.Cells.y1 y1Var2 = this.f38812w;
        if (y1Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.g6.Y6;
            int i18 = org.telegram.ui.ActionBar.g6.W6;
            int i19 = org.telegram.ui.ActionBar.g6.X6;
            CheckBoxSquare checkBoxSquare2 = y1Var2.f25980n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f26325s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f26326w = i19;
                checkBoxSquare2.invalidate();
            }
            y1Var2.g();
        }
        this.f38808f.f();
        this.f38807e.f();
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
        this.f38804a.setText(((nt) this.A.get(i10)).f40917c);
        this.E = false;
    }

    public final void q() {
        boolean z10;
        boolean z11;
        boolean z12;
        nt ntVar;
        if (this.N || this.R.B != 0) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (AndroidUtilities.isSimAvailable()) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    z10 = this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                    z11 = i10 < 26 || this.R.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
                    ig0 ig0Var = this.R;
                    if (ig0Var.f39101w && (!z10 || !z11)) {
                        ig0Var.f39100s.clear();
                        if (!z10) {
                            this.R.f39100s.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z11 && i10 >= 26) {
                            this.R.f39100s.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (this.R.f39100s.isEmpty()) {
                            return;
                        }
                        o(this, new ArrayList(this.R.f39100s));
                        return;
                    }
                } else {
                    z10 = true;
                    z11 = true;
                }
                this.N = true;
                if (!this.R.f39102x && z10 && z11) {
                    this.f38804a.setAlpha(0.0f);
                    this.f38805b.setAlpha(0.0f);
                    String strD = oe.b.d(telephonyManager.getLine1Number(), false);
                    if (!TextUtils.isEmpty(strD)) {
                        int i11 = 4;
                        String strSubstring = null;
                        if (strD.length() > 4) {
                            while (true) {
                                if (i11 < 1) {
                                    z12 = false;
                                    break;
                                }
                                String strSubstring2 = strD.substring(0, i11);
                                List list = (List) this.B.get(strSubstring2);
                                if (list == null) {
                                    ntVar = null;
                                } else if (list.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring2, null);
                                    ntVar = (nt) list.get(list.size() - 1);
                                    if (string != null) {
                                        ArrayList arrayList = this.A;
                                        int size = arrayList.size();
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj = arrayList.get(i12);
                                            i12++;
                                            nt ntVar2 = (nt) obj;
                                            if (Objects.equals(ntVar2.d, string)) {
                                                ntVar = ntVar2;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    ntVar = (nt) list.get(0);
                                }
                                if (ntVar != null) {
                                    strSubstring = strD.substring(i11);
                                    this.f38804a.setText(strSubstring2);
                                    z12 = true;
                                    break;
                                }
                                i11--;
                            }
                            if (!z12) {
                                strSubstring = strD.substring(1);
                                this.f38804a.setText(strD.substring(0, 1));
                            }
                        }
                        if (strSubstring != null) {
                            this.f38805b.requestFocus();
                            this.f38805b.setText(strSubstring);
                            eg0 eg0Var = this.f38805b;
                            eg0Var.setSelection(eg0Var.length());
                        }
                    }
                    if (this.f38805b.length() <= 0) {
                        this.f38804a.setAlpha(1.0f);
                        this.f38805b.setAlpha(1.0f);
                        return;
                    }
                    AnimatorSet duration = new AnimatorSet().setDuration(300L);
                    mj0 mj0Var = this.f38804a;
                    Property property = View.ALPHA;
                    duration.playTogether(ObjectAnimator.ofFloat(mj0Var, (Property<mj0, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f38805b, (Property<eg0, Float>) property, 1.0f));
                    duration.start();
                    this.H = true;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void r() {
        int i10;
        String str = this.L;
        eg0 eg0Var = this.f38805b;
        String strReplace = eg0Var.getText() != null ? eg0Var.getText().toString().replace(" ", "") : "";
        HashMap map = this.C;
        if (map.get(str) == null || ((List) map.get(str)).isEmpty()) {
            if (this.M != -1) {
                int selectionStart = eg0Var.getSelectionStart();
                int selectionEnd = eg0Var.getSelectionEnd();
                eg0Var.setHintText((String) null);
                eg0Var.setSelection(selectionStart, selectionEnd);
                this.M = -1;
                return;
            }
            return;
        }
        List list = (List) map.get(str);
        if (strReplace.isEmpty()) {
            i10 = -1;
            break;
        }
        i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                i10 = -1;
                break;
            } else if (strReplace.startsWith(((String) list.get(i10)).replace(" ", "").replace("X", "").replace("0", ""))) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str2 = (String) list.get(i11);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i10 = i11;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = 0;
            }
        }
        if (this.M != i10) {
            String str3 = (String) ((List) map.get(str)).get(i10);
            int selectionStart2 = eg0Var.getSelectionStart();
            int selectionEnd2 = eg0Var.getSelectionEnd();
            eg0Var.setHintText(str3 != null ? str3.replace('X', '0') : null);
            eg0Var.setSelection(Math.max(0, Math.min(eg0Var.length(), selectionStart2)), Math.max(0, Math.min(eg0Var.length(), selectionEnd2)));
            this.M = i10;
        }
    }

    public final void s() {
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        this.R.getConnectionsManager().sendRequest(tL_help_getCountriesList, new bg0(this, 0), 10);
    }

    public final void t(boolean z10) {
        ig0 ig0Var = this.R;
        if (ig0Var.B == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.P) {
            if (z10 || !this.O) {
                this.P = true;
                this.O = true;
                this.Q = PasskeysController.login(getContext(), ((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount, z10, new ag0(this, 0));
            }
        }
    }

    public final void u(String str, nt ntVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ntVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.zy(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ntVar.f40915a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.L = str;
        this.M = -1;
        r();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
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
public final class hg0 extends org.telegram.ui.Components.tw0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public lt F;
    public final ArrayList G;
    public final HashMap H;
    public final HashMap I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public Toast Q;
    public String R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final pj0 f37845a;
    public final ig0 f37846a0;
    public final eg0 f37847b;
    public final TextView f37848c;
    public final org.telegram.ui.Components.s11 d;
    public final org.telegram.ui.Components.vd0 e;
    public final org.telegram.ui.Components.vd0 f37849f;
    public final TextView h;
    public final org.telegram.ui.Components.y90 f37850n;
    public final View f37851r;
    public final ImageView f37852s;
    public int v;
    public int f37853w;
    public final org.telegram.ui.Cells.z1 f37854x;
    public final org.telegram.ui.Cells.z1 f37855y;

    public hg0(ig0 ig0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.f37846a0 = ig0Var;
        this.E = 0;
        this.G = new ArrayList();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = 0;
        this.P = 0L;
        this.S = -1;
        this.U = false;
        this.V = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f37848c = textView;
        com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView);
        if (ig0Var.F == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.z5.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new ae0(2, this, context));
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(context, null);
        this.f37850n = y90Var;
        if (ig0Var.F == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        y90Var.setText(LocaleController.getString(i11));
        y90Var.setTextSize(1, 14.0f);
        y90Var.setGravity(17);
        y90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(y90Var, w7.z5.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new dg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.st.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f37852s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, w7.z5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(context, null);
        this.e = vd0Var;
        vd0Var.setText(LocaleController.getString(R.string.Country));
        vd0Var.addView(linearLayout, w7.z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        vd0Var.setForceUseCenter(true);
        vd0Var.setFocusable(true);
        vd0Var.setContentDescription(LocaleController.getString(R.string.Country));
        vd0Var.setOnFocusChangeListener(new pd(this, 9));
        addView(vd0Var, w7.z5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        vd0Var.setOnClickListener(new View.OnClickListener(this) {
            public final hg0 f44135b;

            {
                this.f44135b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ig0 ig0Var2 = this.f44135b.f37846a0;
                        if (ig0Var2.getParentActivity() != null) {
                            boolean z11 = !ig0Var2.f38223y;
                            ig0Var2.f38223y = z11;
                            ((org.telegram.ui.Cells.z1) view).c(z11, true);
                            if (ig0Var2.f38223y) {
                                new org.telegram.ui.Components.xc(ig0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.xc(ig0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        hg0 hg0Var = this.f44135b;
                        rt rtVar = new rt(hg0Var.G, true);
                        rtVar.f41245r = new xt(hg0Var, 20);
                        hg0Var.f37846a0.presentFragment(rtVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.vd0 vd0Var2 = new org.telegram.ui.Components.vd0(context, null);
        this.f37849f = vd0Var2;
        vd0Var2.addView(linearLayout2, w7.z5.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        vd0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(vd0Var2, w7.z5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.z5.n(-2, -2));
        pj0 pj0Var = new pj0(this, context, 2);
        this.f37845a = pj0Var;
        pj0Var.setInputType(3);
        pj0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        pj0Var.setCursorWidth(1.5f);
        pj0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        pj0Var.setTextSize(1, 16.0f);
        pj0Var.setMaxLines(1);
        pj0Var.setGravity(19);
        pj0Var.setImeOptions(268435461);
        pj0Var.setBackground(null);
        pj0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        pj0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(pj0Var, w7.z5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        pj0Var.addTextChangedListener(new n0(this, 10));
        pj0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hg0 f43846b;

            {
                this.f43846b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        hg0 hg0Var = this.f43846b;
                        if (i14 == 5) {
                            wf0 wf0Var = hg0Var.f37846a0.f38195b0;
                            if (wf0Var != null) {
                                wf0Var.h.callOnClick();
                                return true;
                            }
                            hg0Var.h(null);
                            return true;
                        }
                        hg0Var.getClass();
                        return false;
                    default:
                        eg0 eg0Var = this.f43846b.f37847b;
                        if (i14 == 5) {
                            eg0Var.requestFocus();
                            eg0Var.setSelection(eg0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f37851r = view;
        LinearLayout.LayoutParams k10 = w7.z5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        eg0 eg0Var = new eg0(this, context);
        this.f37847b = eg0Var;
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
        linearLayout2.addView(eg0Var, w7.z5.c(36.0f, -1));
        eg0Var.addTextChangedListener(new rr(this, 1));
        eg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hg0 f43846b;

            {
                this.f43846b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        hg0 hg0Var = this.f43846b;
                        if (i14 == 5) {
                            wf0 wf0Var = hg0Var.f37846a0.f38195b0;
                            if (wf0Var != null) {
                                wf0Var.h.callOnClick();
                                return true;
                            }
                            hg0Var.h(null);
                            return true;
                        }
                        hg0Var.getClass();
                        return false;
                    default:
                        eg0 eg0Var2 = this.f43846b.f37847b;
                        if (i14 == 5) {
                            eg0Var2.requestFocus();
                            eg0Var2.setSelection(eg0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (ig0Var.f38222x && ig0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.f37854x = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", ig0Var.f38223y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(z1Var, w7.z5.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            z1Var.setOnClickListener(new View.OnClickListener(this) {
                public final hg0 f44135b;

                {
                    this.f44135b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            ig0 ig0Var2 = this.f44135b.f37846a0;
                            if (ig0Var2.getParentActivity() != null) {
                                boolean z11 = !ig0Var2.f38223y;
                                ig0Var2.f38223y = z11;
                                ((org.telegram.ui.Cells.z1) view2).c(z11, true);
                                if (ig0Var2.f38223y) {
                                    new org.telegram.ui.Components.xc(ig0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.xc(ig0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            hg0 hg0Var = this.f44135b;
                            rt rtVar = new rt(hg0Var.G, true);
                            rtVar.f41245r = new xt(hg0Var, 20);
                            hg0Var.f37846a0.presentFragment(rtVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !ig0Var.getConnectionsManager().isTestBackend()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && ig0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.f37855y = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = ig0Var.getConnectionsManager().isTestBackend();
            ig0Var.E = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, w7.z5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? i14 : 0), 0));
            i12 -= 24;
            z1Var2.setOnClickListener(new ci.g2(8, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, w7.z5.n(-2, -2));
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
                obj.f39322a = split[2];
                String str = split[0];
                obj.f39324c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f39323b = obj.f39322a;
                        obj.f39322a = countryName;
                    }
                }
                this.G.add(0, obj);
                List list = (List) this.H.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.H;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(obj);
                if (split.length > 3) {
                    this.I.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.G, Comparator$CC.comparing(new k2.g(7)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        ig0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new a50(11, this, hashMap), 10);
        if (this.f37845a.length() == 0) {
            setCountryButtonText(null);
            this.f37847b.setHintText((String) null);
            this.E = 1;
        }
        if (this.f37845a.length() != 0) {
            this.f37847b.requestFocus();
            eg0 eg0Var2 = this.f37847b;
            eg0Var2.setSelection(eg0Var2.length());
        } else {
            this.f37845a.requestFocus();
        }
        q();
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
        loadAnimation.setInterpolator(org.telegram.ui.Components.st.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.s11 s11Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        s11Var.a(charSequence, z10, false);
        org.telegram.ui.Components.vd0 vd0Var = this.e;
        if (charSequence != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        vd0Var.b(f7, f7, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void d() {
        this.M = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override
    public final void f() {
        Runnable runnable = this.W;
        if (runnable != null) {
            runnable.run();
            this.W = null;
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
        if (this.f37846a0.getParentActivity() != null && !this.M && !this.f37846a0.f38210o0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f37845a.length() != 0 && this.f37847b.length() != 0) {
                String str2 = "+" + ((Object) this.f37845a.getText()) + " " + ((Object) this.f37847b.getText());
                if (!this.N) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.f37846a0.l1() && this.f37846a0.S.Q() > AndroidUtilities.dp(20.0f)) {
                        ig0 ig0Var = this.f37846a0;
                        ig0Var.T = new xf0(this, 1);
                        AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                        return;
                    }
                    ig0 ig0Var2 = this.f37846a0;
                    Context context = this.f37846a0.fragmentView.getContext();
                    ig0 ig0Var3 = this.f37846a0;
                    ig0Var2.f38195b0 = new wf0(context, (ViewGroup) ig0Var3.fragmentView, ig0Var3.N, str2, new gg0(this));
                    wf0 wf0Var = this.f37846a0.f38195b0;
                    wf0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new vf0(wf0Var, 0));
                    duration.addUpdateListener(new sf0(wf0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.bs.f25133f);
                    duration.start();
                    return;
                }
                this.N = false;
                wf0 wf0Var2 = this.f37846a0.f38195b0;
                if (wf0Var2 != null) {
                    int i11 = wf0.F;
                    wf0Var2.a();
                }
                boolean isSimAvailable = AndroidUtilities.isSimAvailable();
                int i12 = Build.VERSION.SDK_INT;
                if (isSimAvailable) {
                    if (this.f37846a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f37846a0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 >= 28 && this.f37846a0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i12 >= 26 && this.f37846a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    ig0 ig0Var4 = this.f37846a0;
                    z10 = isSimAvailable;
                    if (ig0Var4.v) {
                        ig0Var4.f38213r.clear();
                        if (!z12) {
                            this.f37846a0.f38213r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.f37846a0.f38213r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.f37846a0.f38213r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.f37846a0.f38213r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.f37846a0.f38213r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.f37846a0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.f37846a0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.f37846a0.getParentActivity().requestPermissions((String[]) this.f37846a0.f38213r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37846a0.getParentActivity());
                            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f20678a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f20678a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f20678a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            int i13 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.k6.x0(null, i13, false), null);
                            alertDialog$Builder.n(i13, null);
                            ig0 ig0Var5 = this.f37846a0;
                            ig0Var5.h = ig0Var5.showDialog(alertDialog$Builder.f20678a);
                            this.N = true;
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
                int i14 = this.E;
                if (i14 == z11) {
                    this.f37846a0.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.f37846a0.o1(false, z11);
                    return;
                } else if (i14 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.f37846a0.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.f37846a0.o1(false, true);
                    return;
                } else {
                    String d = jf.b.d("" + ((Object) this.f37845a.getText()) + ((Object) this.f37847b.getText()), false);
                    ig0 ig0Var6 = this.f37846a0;
                    if (ig0Var6.F == 0 && (ig0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i15 = 0; i15 < 4; i15++) {
                            UserConfig userConfig = UserConfig.getInstance(i15);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                                ig0 ig0Var7 = this.f37846a0;
                                if (isTestBackend == ig0Var7.E) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var7.getParentActivity());
                                    alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f20678a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.r(this, i15, 14));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.f37846a0.showDialog(alertDialog$Builder2.f20678a);
                                    this.f37846a0.o1(false, true);
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
                    if (this.f37846a0.f38207l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
                        tL_codeSettings.allow_firebase = false;
                    }
                    ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
                    if (savedLogInTokens != null) {
                        for (int i16 = 0; i16 < savedLogInTokens.size(); i16++) {
                            if (savedLogInTokens.get(i16).future_auth_token != null) {
                                if (tL_codeSettings.logout_tokens == null) {
                                    tL_codeSettings.logout_tokens = new ArrayList<>();
                                }
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i16).future_auth_token, StandardCharsets.UTF_8)));
                                }
                                tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i16).future_auth_token);
                                if (tL_codeSettings.logout_tokens.size() >= 20) {
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
                    if (savedLogOutTokens != null) {
                        for (int i17 = 0; i17 < savedLogOutTokens.size(); i17++) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i17).future_auth_token);
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
                            HashSet X0 = ig0.X0(this.f37846a0);
                            if (!X0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(X0).anyMatch(new e80(d, 1));
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
                    ig0 ig0Var8 = this.f37846a0;
                    if (ig0Var8.F == 2) {
                        TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                        sendchangephonecode.phone_number = d;
                        sendchangephonecode.settings = tL_codeSettings;
                        tL_auth_sendCode = sendchangephonecode;
                    } else {
                        ConnectionsManager.getInstance(ig0.Y0(ig0Var8)).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                        tL_auth_sendCode2.phone_number = d;
                        tL_auth_sendCode2.settings = tL_codeSettings;
                        tL_auth_sendCode = tL_auth_sendCode2;
                    }
                    TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", "+" + ((Object) this.f37845a.getText()) + " " + ((Object) this.f37847b.getText()));
                    try {
                        bundle.putString("ephone", "+" + jf.b.d(this.f37845a.getText().toString(), false) + " " + jf.b.d(this.f37847b.getText().toString(), false));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    lt ltVar = this.F;
                    if (ltVar != null) {
                        bundle.putString("country", ltVar.f39324c);
                    }
                    this.M = true;
                    m.g3 g3Var = new m.g3(16, false);
                    g3Var.d = "+" + ((Object) this.f37845a.getText()) + " " + ((Object) this.f37847b.getText());
                    g3Var.f16265b = this.F;
                    g3Var.f16266c = (List) this.I.get(this.f37845a.getText().toString());
                    this.f37846a0.r1(ConnectionsManager.getInstance(ig0.Z0(this.f37846a0)).sendRequest(tL_auth_sendCode3, new ai.s9(this, bundle, d, g3Var, tL_auth_sendCode3, 10), 27), true);
                    return;
                }
            }
            ig0.W0(this.f37846a0, this.f37849f, false);
        }
    }

    @Override
    public final void j() {
        o();
        org.telegram.ui.Cells.z1 z1Var = this.f37854x;
        if (z1Var != null) {
            z1Var.c(this.f37846a0.f38223y, false);
        }
        AndroidUtilities.runOnUIThread(new xf0(this, 0), ig0.f38191x0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f37845a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f37847b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37845a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f37847b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    public final void o() {
        boolean z10;
        boolean z11;
        ig0 ig0Var;
        boolean z12;
        lt ltVar;
        if (!this.T && this.f37846a0.F == 0) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                if (AndroidUtilities.isSimAvailable()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (this.f37846a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 >= 26 && this.f37846a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z11 = false;
                        ig0Var = this.f37846a0;
                        if (!ig0Var.f38220w && (!z10 || !z11)) {
                            ig0Var.f38215s.clear();
                            if (!z10) {
                                this.f37846a0.f38215s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i10 >= 26) {
                                this.f37846a0.f38215s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (!this.f37846a0.f38215s.isEmpty()) {
                                new f80(27, this, new ArrayList(this.f37846a0.f38215s)).run();
                                return;
                            }
                            return;
                        }
                        this.T = true;
                        if (ig0Var.f38222x && z10 && z11) {
                            this.f37845a.setAlpha(0.0f);
                            this.f37847b.setAlpha(0.0f);
                            String d = jf.b.d(telephonyManager.getLine1Number(), false);
                            if (!TextUtils.isEmpty(d)) {
                                int i11 = 4;
                                String str = null;
                                if (d.length() > 4) {
                                    while (true) {
                                        if (i11 >= 1) {
                                            String substring = d.substring(0, i11);
                                            List list = (List) this.H.get(substring);
                                            if (list == null) {
                                                ltVar = null;
                                            } else if (list.size() > 1) {
                                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                ltVar = (lt) list.get(list.size() - 1);
                                                if (string != null) {
                                                    ArrayList arrayList = this.G;
                                                    int size = arrayList.size();
                                                    int i12 = 0;
                                                    while (true) {
                                                        if (i12 >= size) {
                                                            break;
                                                        }
                                                        Object obj = arrayList.get(i12);
                                                        i12++;
                                                        lt ltVar2 = (lt) obj;
                                                        if (Objects.equals(ltVar2.d, string)) {
                                                            ltVar = ltVar2;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                ltVar = (lt) list.get(0);
                                            }
                                            if (ltVar != null) {
                                                str = d.substring(i11);
                                                this.f37845a.setText(substring);
                                                z12 = true;
                                                break;
                                            }
                                            i11--;
                                        } else {
                                            z12 = false;
                                            break;
                                        }
                                    }
                                    if (!z12) {
                                        str = d.substring(1);
                                        this.f37845a.setText(d.substring(0, 1));
                                    }
                                }
                                if (str != null) {
                                    this.f37847b.requestFocus();
                                    this.f37847b.setText(str);
                                    eg0 eg0Var = this.f37847b;
                                    eg0Var.setSelection(eg0Var.length());
                                }
                            }
                            if (this.f37847b.length() > 0) {
                                AnimatorSet duration = new AnimatorSet().setDuration(300L);
                                pj0 pj0Var = this.f37845a;
                                Property property = View.ALPHA;
                                duration.playTogether(ObjectAnimator.ofFloat(pj0Var, property, 1.0f), ObjectAnimator.ofFloat(this.f37847b, property, 1.0f));
                                duration.start();
                                this.N = true;
                                return;
                            }
                            this.f37845a.setAlpha(1.0f);
                            this.f37847b.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    ig0Var = this.f37846a0;
                    if (!ig0Var.f38220w) {
                    }
                    this.T = true;
                    if (ig0Var.f38222x) {
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
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
        if (this.J) {
            this.J = false;
            return;
        }
        this.K = true;
        this.f37845a.setText(((lt) this.G.get(i10)).f39324c);
        this.K = false;
    }

    public final void p() {
        String str;
        int i10;
        String str2 = this.R;
        eg0 eg0Var = this.f37847b;
        if (eg0Var.getText() == null) {
            str = "";
        } else {
            str = eg0Var.getText().toString().replace(" ", "");
        }
        HashMap hashMap = this.I;
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
            if (this.S != i10) {
                String str5 = (String) ((List) hashMap.get(str2)).get(i10);
                int selectionStart = eg0Var.getSelectionStart();
                int selectionEnd = eg0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                eg0Var.setHintText(str3);
                eg0Var.setSelection(Math.max(0, Math.min(eg0Var.length(), selectionStart)), Math.max(0, Math.min(eg0Var.length(), selectionEnd)));
                this.S = i10;
            }
        } else if (this.S != -1) {
            int selectionStart2 = eg0Var.getSelectionStart();
            int selectionEnd2 = eg0Var.getSelectionEnd();
            eg0Var.setHintText((String) null);
            eg0Var.setSelection(selectionStart2, selectionEnd2);
            this.S = -1;
        }
    }

    public final void q() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.f37846a0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new bg0(this, 0), 10);
    }

    public final void r(boolean z10) {
        ig0 ig0Var = this.f37846a0;
        if (ig0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.V) {
            if (z10 || !this.U) {
                this.V = true;
                this.U = true;
                this.W = PasskeysController.login(getContext(), ig0.a1(ig0Var), z10, new ag0(this, 0));
            }
        }
    }

    public final void s(String str, lt ltVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ltVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ltVar.f39322a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.R = str;
        this.S = -1;
        p();
    }

    @Override
    public final void updateColors() {
        this.f37848c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.y90 y90Var = this.f37850n;
        y90Var.setTextColor(x02);
        y90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21242gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.s11 s11Var = this.d;
            if (i10 >= s11Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) s11Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = this.v;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.f37852s;
        ig0.g1(imageView, x03, i12, mode);
        this.v = x03;
        int themedColor = this.f37846a0.getThemedColor(org.telegram.ui.ActionBar.k6.f21272i6);
        ig0.h1(imageView, themedColor, this.f37853w);
        this.f37853w = themedColor;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        pj0 pj0Var = this.f37845a;
        pj0Var.setTextColor(x04);
        int i14 = org.telegram.ui.ActionBar.k6.f21327l6;
        pj0Var.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        this.f37851r.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21310k6, false));
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        eg0 eg0Var = this.f37847b;
        eg0Var.setTextColor(x05);
        eg0Var.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        eg0Var.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        org.telegram.ui.Cells.z1 z1Var = this.f37854x;
        if (z1Var != null) {
            int i15 = org.telegram.ui.ActionBar.k6.Y6;
            int i16 = org.telegram.ui.ActionBar.k6.W6;
            int i17 = org.telegram.ui.ActionBar.k6.X6;
            CheckBoxSquare checkBoxSquare = z1Var.f24014n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f24311s = i15;
                checkBoxSquare.v = i16;
                checkBoxSquare.f24312w = i17;
                checkBoxSquare.invalidate();
            }
            z1Var.g();
        }
        org.telegram.ui.Cells.z1 z1Var2 = this.f37855y;
        if (z1Var2 != null) {
            int i18 = org.telegram.ui.ActionBar.k6.Y6;
            int i19 = org.telegram.ui.ActionBar.k6.W6;
            int i20 = org.telegram.ui.ActionBar.k6.X6;
            CheckBoxSquare checkBoxSquare2 = z1Var2.f24014n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f24311s = i18;
                checkBoxSquare2.v = i19;
                checkBoxSquare2.f24312w = i20;
                checkBoxSquare2.invalidate();
            }
            z1Var2.g();
        }
        this.f37849f.f();
        this.e.f();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

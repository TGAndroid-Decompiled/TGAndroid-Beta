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
public final class fg0 extends org.telegram.ui.Components.ax0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public jt F;
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
    public final mj0 f39361a;
    public final gg0 f39362a0;
    public final cg0 f39363b;
    public final TextView f39364c;
    public final org.telegram.ui.Components.a21 d;
    public final org.telegram.ui.Components.rd0 e;
    public final org.telegram.ui.Components.rd0 f39365f;
    public final TextView h;
    public final org.telegram.ui.Components.z90 f39366n;
    public final View f39367r;
    public final ImageView f39368s;
    public int v;
    public int f39369w;
    public final org.telegram.ui.Cells.y1 f39370x;
    public final org.telegram.ui.Cells.y1 f39371y;

    public fg0(gg0 gg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.f39362a0 = gg0Var;
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
        this.f39364c = textView;
        ic.a.o(18.0f, 1, textView);
        if (gg0Var.F == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new xd0(2, this, context));
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(context, null);
        this.f39366n = z90Var;
        if (gg0Var.F == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        z90Var.setText(LocaleController.getString(i11));
        z90Var.setTextSize(1, 14.0f);
        z90Var.setGravity(17);
        z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(z90Var, org.telegram.ui.Components.gb1.x(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new bg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ut.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f39368s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, org.telegram.ui.Components.gb1.q(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, org.telegram.ui.Components.gb1.y(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.rd0 rd0Var = new org.telegram.ui.Components.rd0(context, null);
        this.e = rd0Var;
        rd0Var.setText(LocaleController.getString(R.string.Country));
        rd0Var.addView(linearLayout, org.telegram.ui.Components.gb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        rd0Var.setForceUseCenter(true);
        rd0Var.setFocusable(true);
        rd0Var.setContentDescription(LocaleController.getString(R.string.Country));
        rd0Var.setOnFocusChangeListener(new rd(this, 9));
        addView(rd0Var, org.telegram.ui.Components.gb1.o(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        rd0Var.setOnClickListener(new View.OnClickListener(this) {
            public final fg0 f45479b;

            {
                this.f45479b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        gg0 gg0Var2 = this.f45479b.f39362a0;
                        if (gg0Var2.getParentActivity() != null) {
                            boolean z11 = !gg0Var2.f39682y;
                            gg0Var2.f39682y = z11;
                            ((org.telegram.ui.Cells.y1) view).c(z11, true);
                            if (gg0Var2.f39682y) {
                                new org.telegram.ui.Components.wc(gg0Var2.Z, null).R(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.wc(gg0Var2.Z, null).R(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        fg0 fg0Var = this.f45479b;
                        ot otVar = new ot(fg0Var.G, true);
                        otVar.f42286r = new qt(fg0Var, 21);
                        fg0Var.f39362a0.presentFragment(otVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.rd0 rd0Var2 = new org.telegram.ui.Components.rd0(context, null);
        this.f39365f = rd0Var2;
        rd0Var2.addView(linearLayout2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        rd0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(rd0Var2, org.telegram.ui.Components.gb1.o(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, org.telegram.ui.Components.gb1.r(-2, -2));
        mj0 mj0Var = new mj0(this, context, 2);
        this.f39361a = mj0Var;
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
        linearLayout2.addView(mj0Var, org.telegram.ui.Components.gb1.o(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        mj0Var.addTextChangedListener(new m0(this, 10));
        mj0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final fg0 f44797b;

            {
                this.f44797b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        fg0 fg0Var = this.f44797b;
                        if (i14 == 5) {
                            tf0 tf0Var = fg0Var.f39362a0.f39654b0;
                            if (tf0Var != null) {
                                tf0Var.h.callOnClick();
                                return true;
                            }
                            fg0Var.h(null);
                            return true;
                        }
                        fg0Var.getClass();
                        return false;
                    default:
                        cg0 cg0Var = this.f44797b.f39363b;
                        if (i14 == 5) {
                            cg0Var.requestFocus();
                            cg0Var.setSelection(cg0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f39367r = view;
        LinearLayout.LayoutParams o10 = org.telegram.ui.Components.gb1.o(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        o10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, o10);
        cg0 cg0Var = new cg0(this, context);
        this.f39363b = cg0Var;
        cg0Var.setInputType(3);
        cg0Var.setPadding(0, 0, 0, 0);
        cg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        cg0Var.setCursorWidth(1.5f);
        cg0Var.setTextSize(1, 16.0f);
        cg0Var.setMaxLines(1);
        cg0Var.setGravity(19);
        cg0Var.setImeOptions(268435461);
        cg0Var.setBackground(null);
        cg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        cg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(cg0Var, org.telegram.ui.Components.gb1.g(36.0f, -1));
        cg0Var.addTextChangedListener(new ur(this, 1));
        cg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final fg0 f44797b;

            {
                this.f44797b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        fg0 fg0Var = this.f44797b;
                        if (i14 == 5) {
                            tf0 tf0Var = fg0Var.f39362a0.f39654b0;
                            if (tf0Var != null) {
                                tf0Var.h.callOnClick();
                                return true;
                            }
                            fg0Var.h(null);
                            return true;
                        }
                        fg0Var.getClass();
                        return false;
                    default:
                        cg0 cg0Var2 = this.f44797b.f39363b;
                        if (i14 == 5) {
                            cg0Var2.requestFocus();
                            cg0Var2.setSelection(cg0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (gg0Var.f39681x && gg0Var.F == 0) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 2);
            this.f39370x = y1Var;
            y1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", gg0Var.f39682y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(y1Var, org.telegram.ui.Components.gb1.x(-2, -1, 51, 16, 0, 16 + i13, 0));
            y1Var.setOnClickListener(new View.OnClickListener(this) {
                public final fg0 f45479b;

                {
                    this.f45479b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            gg0 gg0Var2 = this.f45479b.f39362a0;
                            if (gg0Var2.getParentActivity() != null) {
                                boolean z11 = !gg0Var2.f39682y;
                                gg0Var2.f39682y = z11;
                                ((org.telegram.ui.Cells.y1) view2).c(z11, true);
                                if (gg0Var2.f39682y) {
                                    new org.telegram.ui.Components.wc(gg0Var2.Z, null).R(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.wc(gg0Var2.Z, null).R(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            fg0 fg0Var = this.f45479b;
                            ot otVar = new ot(fg0Var.G, true);
                            otVar.f42286r = new qt(fg0Var, 21);
                            fg0Var.f39362a0.presentFragment(otVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !gg0Var.getConnectionsManager().isTestBackend()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && gg0Var.F == 0) {
            org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(context, 2);
            this.f39371y = y1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = gg0Var.getConnectionsManager().isTestBackend();
            gg0Var.E = isTestBackend;
            y1Var2.e(string, "", isTestBackend, false, false);
            addView(y1Var2, org.telegram.ui.Components.gb1.x(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? i14 : 0), 0));
            i12 -= 24;
            y1Var2.setOnClickListener(new di.g2(8, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, org.telegram.ui.Components.gb1.r(-2, -2));
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
                obj.f40743a = split[2];
                String str = split[0];
                obj.f40745c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f40744b = obj.f40743a;
                        obj.f40743a = countryName;
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        gg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new j10(12, this, hashMap), 10);
        if (this.f39361a.length() == 0) {
            setCountryButtonText(null);
            this.f39363b.setHintText((String) null);
            this.E = 1;
        }
        if (this.f39361a.length() != 0) {
            this.f39363b.requestFocus();
            cg0 cg0Var2 = this.f39363b;
            cg0Var2.setSelection(cg0Var2.length());
        } else {
            this.f39361a.requestFocus();
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
        loadAnimation.setInterpolator(org.telegram.ui.Components.ut.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.a21 a21Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a21Var.a(charSequence, z10, false);
        org.telegram.ui.Components.rd0 rd0Var = this.e;
        if (charSequence != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        rd0Var.b(f7, f7, true);
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
        if (this.f39362a0.getParentActivity() != null && !this.M && !this.f39362a0.f39669o0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f39361a.length() != 0 && this.f39363b.length() != 0) {
                String str2 = "+" + ((Object) this.f39361a.getText()) + " " + ((Object) this.f39363b.getText());
                if (!this.N) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.f39362a0.m1() && this.f39362a0.S.Q() > AndroidUtilities.dp(20.0f)) {
                        gg0 gg0Var = this.f39362a0;
                        gg0Var.T = new uf0(this, 1);
                        AndroidUtilities.hideKeyboard(gg0Var.fragmentView);
                        return;
                    }
                    gg0 gg0Var2 = this.f39362a0;
                    Context context = this.f39362a0.fragmentView.getContext();
                    gg0 gg0Var3 = this.f39362a0;
                    gg0Var2.f39654b0 = new tf0(context, (ViewGroup) gg0Var3.fragmentView, gg0Var3.N, str2, new eg0(this));
                    tf0 tf0Var = this.f39362a0.f39654b0;
                    tf0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new sf0(tf0Var, 0));
                    duration.addUpdateListener(new pf0(tf0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.ds.f27586f);
                    duration.start();
                    return;
                }
                this.N = false;
                tf0 tf0Var2 = this.f39362a0.f39654b0;
                if (tf0Var2 != null) {
                    int i11 = tf0.F;
                    tf0Var2.a();
                }
                boolean isSimAvailable = AndroidUtilities.isSimAvailable();
                int i12 = Build.VERSION.SDK_INT;
                if (isSimAvailable) {
                    if (this.f39362a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f39362a0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 >= 28 && this.f39362a0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i12 >= 26 && this.f39362a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    gg0 gg0Var4 = this.f39362a0;
                    z10 = isSimAvailable;
                    if (gg0Var4.v) {
                        gg0Var4.f39672r.clear();
                        if (!z12) {
                            this.f39362a0.f39672r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.f39362a0.f39672r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.f39362a0.f39672r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.f39362a0.f39672r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.f39362a0.f39672r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.f39362a0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.f39362a0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.f39362a0.getParentActivity().requestPermissions((String[]) this.f39362a0.f39672r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39362a0.getParentActivity());
                            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f22368a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f22368a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f22368a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            int i13 = org.telegram.ui.ActionBar.y6.L5;
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.y6.x0(null, i13, false), null);
                            alertDialog$Builder.n(i13, null);
                            gg0 gg0Var5 = this.f39362a0;
                            gg0Var5.h = gg0Var5.showDialog(alertDialog$Builder.f22368a);
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
                    this.f39362a0.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.f39362a0.p1(false, z11);
                    return;
                } else if (i14 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.f39362a0.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.f39362a0.p1(false, true);
                    return;
                } else {
                    String d = kf.b.d("" + ((Object) this.f39361a.getText()) + ((Object) this.f39363b.getText()), false);
                    gg0 gg0Var6 = this.f39362a0;
                    if (gg0Var6.F == 0 && (gg0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i15 = 0; i15 < 4; i15++) {
                            UserConfig userConfig = UserConfig.getInstance(i15);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                                gg0 gg0Var7 = this.f39362a0;
                                if (isTestBackend == gg0Var7.E) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gg0Var7.getParentActivity());
                                    alertDialog$Builder2.f22368a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f22368a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.r(this, i15, 14));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.f39362a0.showDialog(alertDialog$Builder2.f22368a);
                                    this.f39362a0.p1(false, true);
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
                    if (this.f39362a0.f39666l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
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
                            HashSet Y0 = gg0.Y0(this.f39362a0);
                            if (!Y0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(Y0).anyMatch(new e80(d, 1));
                            } else {
                                tL_codeSettings.unknown_number = true;
                                if (UserConfig.getActivatedAccountsCount() > 0) {
                                    tL_codeSettings.allow_flashcall = false;
                                } else {
                                    tL_codeSettings.current_number = false;
                                }
                            }
                        } catch (Exception e10) {
                            tL_codeSettings.unknown_number = true;
                            FileLog.e(e10);
                        }
                    }
                    gg0 gg0Var8 = this.f39362a0;
                    if (gg0Var8.F == 2) {
                        TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                        sendchangephonecode.phone_number = d;
                        sendchangephonecode.settings = tL_codeSettings;
                        tL_auth_sendCode = sendchangephonecode;
                    } else {
                        ConnectionsManager.getInstance(gg0.Z0(gg0Var8)).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                        tL_auth_sendCode2.phone_number = d;
                        tL_auth_sendCode2.settings = tL_codeSettings;
                        tL_auth_sendCode = tL_auth_sendCode2;
                    }
                    TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", "+" + ((Object) this.f39361a.getText()) + " " + ((Object) this.f39363b.getText()));
                    try {
                        bundle.putString("ephone", "+" + kf.b.d(this.f39361a.getText().toString(), false) + " " + kf.b.d(this.f39363b.getText().toString(), false));
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    jt jtVar = this.F;
                    if (jtVar != null) {
                        bundle.putString("country", jtVar.f40745c);
                    }
                    this.M = true;
                    k6.c cVar = new k6.c(21, false);
                    cVar.f16407c = "+" + ((Object) this.f39361a.getText()) + " " + ((Object) this.f39363b.getText());
                    cVar.f16406b = this.F;
                    cVar.d = (List) this.I.get(this.f39361a.getText().toString());
                    this.f39362a0.s1(ConnectionsManager.getInstance(gg0.a1(this.f39362a0)).sendRequest(tL_auth_sendCode3, new bi.n9(this, bundle, d, cVar, tL_auth_sendCode3, 10), 27), true);
                    return;
                }
            }
            gg0.X0(this.f39362a0, this.f39365f, false);
        }
    }

    @Override
    public final void j() {
        o();
        org.telegram.ui.Cells.y1 y1Var = this.f39370x;
        if (y1Var != null) {
            y1Var.c(this.f39362a0.f39682y, false);
        }
        AndroidUtilities.runOnUIThread(new uf0(this, 0), gg0.f39650x0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f39361a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f39363b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f39361a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f39363b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    public final void o() {
        boolean z10;
        boolean z11;
        gg0 gg0Var;
        boolean z12;
        jt jtVar;
        if (!this.T && this.f39362a0.F == 0) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                if (AndroidUtilities.isSimAvailable()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (this.f39362a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 >= 26 && this.f39362a0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z11 = false;
                        gg0Var = this.f39362a0;
                        if (!gg0Var.f39679w && (!z10 || !z11)) {
                            gg0Var.f39674s.clear();
                            if (!z10) {
                                this.f39362a0.f39674s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i10 >= 26) {
                                this.f39362a0.f39674s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (!this.f39362a0.f39674s.isEmpty()) {
                                new wb0(14, this, new ArrayList(this.f39362a0.f39674s)).run();
                                return;
                            }
                            return;
                        }
                        this.T = true;
                        if (gg0Var.f39681x && z10 && z11) {
                            this.f39361a.setAlpha(0.0f);
                            this.f39363b.setAlpha(0.0f);
                            String d = kf.b.d(telephonyManager.getLine1Number(), false);
                            if (!TextUtils.isEmpty(d)) {
                                int i11 = 4;
                                String str = null;
                                if (d.length() > 4) {
                                    while (true) {
                                        if (i11 >= 1) {
                                            String substring = d.substring(0, i11);
                                            List list = (List) this.H.get(substring);
                                            if (list == null) {
                                                jtVar = null;
                                            } else if (list.size() > 1) {
                                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                jtVar = (jt) list.get(list.size() - 1);
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
                                                        jt jtVar2 = (jt) obj;
                                                        if (Objects.equals(jtVar2.d, string)) {
                                                            jtVar = jtVar2;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                jtVar = (jt) list.get(0);
                                            }
                                            if (jtVar != null) {
                                                str = d.substring(i11);
                                                this.f39361a.setText(substring);
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
                                        this.f39361a.setText(d.substring(0, 1));
                                    }
                                }
                                if (str != null) {
                                    this.f39363b.requestFocus();
                                    this.f39363b.setText(str);
                                    cg0 cg0Var = this.f39363b;
                                    cg0Var.setSelection(cg0Var.length());
                                }
                            }
                            if (this.f39363b.length() > 0) {
                                AnimatorSet duration = new AnimatorSet().setDuration(300L);
                                mj0 mj0Var = this.f39361a;
                                Property property = View.ALPHA;
                                duration.playTogether(ObjectAnimator.ofFloat(mj0Var, property, 1.0f), ObjectAnimator.ofFloat(this.f39363b, property, 1.0f));
                                duration.start();
                                this.N = true;
                                return;
                            }
                            this.f39361a.setAlpha(1.0f);
                            this.f39363b.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    gg0Var = this.f39362a0;
                    if (!gg0Var.f39679w) {
                    }
                    this.T = true;
                    if (gg0Var.f39681x) {
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
        this.f39361a.setText(((jt) this.G.get(i10)).f40745c);
        this.K = false;
    }

    public final void p() {
        String str;
        int i10;
        String str2 = this.R;
        cg0 cg0Var = this.f39363b;
        if (cg0Var.getText() == null) {
            str = "";
        } else {
            str = cg0Var.getText().toString().replace(" ", "");
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
                int selectionStart = cg0Var.getSelectionStart();
                int selectionEnd = cg0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                cg0Var.setHintText(str3);
                cg0Var.setSelection(Math.max(0, Math.min(cg0Var.length(), selectionStart)), Math.max(0, Math.min(cg0Var.length(), selectionEnd)));
                this.S = i10;
            }
        } else if (this.S != -1) {
            int selectionStart2 = cg0Var.getSelectionStart();
            int selectionEnd2 = cg0Var.getSelectionEnd();
            cg0Var.setHintText((String) null);
            cg0Var.setSelection(selectionStart2, selectionEnd2);
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
        this.f39362a0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new yf0(this, 0), 10);
    }

    public final void r(boolean z10) {
        gg0 gg0Var = this.f39362a0;
        if (gg0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.V) {
            if (z10 || !this.U) {
                this.V = true;
                this.U = true;
                this.W = PasskeysController.login(getContext(), gg0.b1(gg0Var), z10, new xf0(this, 0));
            }
        }
    }

    public final void s(String str, jt jtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(jtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) jtVar.f40743a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.R = str;
        this.S = -1;
        p();
    }

    @Override
    public final void updateColors() {
        this.f39364c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false);
        org.telegram.ui.Components.z90 z90Var = this.f39366n;
        z90Var.setTextColor(x02);
        z90Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.a21 a21Var = this.d;
            if (i10 >= a21Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) a21Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.y6.H6;
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        int i12 = this.v;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.f39368s;
        gg0.h1(imageView, x03, i12, mode);
        this.v = x03;
        int themedColor = this.f39362a0.getThemedColor(org.telegram.ui.ActionBar.y6.f23448i6);
        gg0.i1(imageView, themedColor, this.f39369w);
        this.f39369w = themedColor;
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        mj0 mj0Var = this.f39361a;
        mj0Var.setTextColor(x04);
        int i14 = org.telegram.ui.ActionBar.y6.f23502l6;
        mj0Var.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i14, false));
        this.f39367r.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23484k6, false));
        int x05 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        cg0 cg0Var = this.f39363b;
        cg0Var.setTextColor(x05);
        cg0Var.setHintTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        cg0Var.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i14, false));
        org.telegram.ui.Cells.y1 y1Var = this.f39370x;
        if (y1Var != null) {
            int i15 = org.telegram.ui.ActionBar.y6.Y6;
            int i16 = org.telegram.ui.ActionBar.y6.W6;
            int i17 = org.telegram.ui.ActionBar.y6.X6;
            CheckBoxSquare checkBoxSquare = y1Var.f25740n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f26104s = i15;
                checkBoxSquare.v = i16;
                checkBoxSquare.f26105w = i17;
                checkBoxSquare.invalidate();
            }
            y1Var.g();
        }
        org.telegram.ui.Cells.y1 y1Var2 = this.f39371y;
        if (y1Var2 != null) {
            int i18 = org.telegram.ui.ActionBar.y6.Y6;
            int i19 = org.telegram.ui.ActionBar.y6.W6;
            int i20 = org.telegram.ui.ActionBar.y6.X6;
            CheckBoxSquare checkBoxSquare2 = y1Var2.f25740n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f26104s = i18;
                checkBoxSquare2.v = i19;
                checkBoxSquare2.f26105w = i20;
                checkBoxSquare2.invalidate();
            }
            y1Var2.g();
        }
        this.f39365f.f();
        this.e.f();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import android.util.Log;
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
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
public final class de0 extends org.telegram.ui.Components.fu0 implements AdapterView.OnItemSelectedListener, org.telegram.messenger.fs {
    public final org.telegram.ui.Cells.d2 E;
    public int F;
    public ps G;
    public final ArrayList H;
    public final HashMap I;
    public final HashMap J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public Toast R;
    public String S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final be0 f46866a;
    public boolean f46867a0;
    public final be0 f46868b;
    public CancellationTokenSource f46869b0;
    public final TextView f46870c;
    public org.telegram.ui.ActionBar.u1 f46871c0;
    public final org.telegram.ui.Components.fz0 d;
    public org.telegram.ui.ActionBar.u1 f46872d0;
    public final org.telegram.ui.Components.xb0 f46873e;
    public boolean f46874e0;
    public final org.telegram.ui.Components.xb0 f46875f;
    public boolean f46876f0;
    public org.telegram.messenger.nk f46877g0;
    public final TextView h;
    public final ee0 f46878h0;
    public final org.telegram.ui.Components.k80 f46879n;
    public final View f46880r;
    public final ImageView f46881s;
    public int f46882w;
    public int f46883x;
    public final org.telegram.ui.Cells.d2 f46884y;

    public de0(ee0 ee0Var, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        this.f46878h0 = ee0Var;
        this.F = 0;
        this.H = new ArrayList();
        this.I = new HashMap();
        this.J = new HashMap();
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0L;
        this.T = -1;
        this.f46874e0 = false;
        this.f46876f0 = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f46870c = textView;
        i5.c.x(textView, 1, 18.0f);
        if (ee0Var.G == 2) {
            i7 = 2131752527;
        } else {
            i7 = 2131742548;
        }
        textView.setText(org.telegram.messenger.gd.M0(i7, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, c8.ma.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new cd0(1, this, context));
        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(context, null);
        this.f46879n = k80Var;
        if (ee0Var.G == 2) {
            i10 = 2131752528;
        } else {
            i10 = 2131744672;
        }
        k80Var.setText(org.telegram.messenger.gd.M0(i10, null));
        k80Var.setTextSize(1, 14.0f);
        k80Var.setGravity(17);
        k80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(k80Var, c8.ma.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new ae0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772019);
        loadAnimation.setInterpolator(org.telegram.ui.Components.xs.f42178e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f46881s = imageView;
        imageView.setImageResource(2131232191);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, c8.ma.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, c8.ma.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.xb0 xb0Var = new org.telegram.ui.Components.xb0(context, null);
        this.f46873e = xb0Var;
        xb0Var.setText(org.telegram.messenger.gd.M0(2131751743, null));
        xb0Var.addView(linearLayout, c8.ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        xb0Var.setForceUseCenter(true);
        xb0Var.setFocusable(true);
        xb0Var.setContentDescription(org.telegram.messenger.gd.M0(2131751743, null));
        xb0Var.setOnFocusChangeListener(new ed(this, 9));
        addView(xb0Var, c8.ma.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        xb0Var.setOnClickListener(new View.OnClickListener(this) {
            public final de0 f52538b;

            {
                this.f52538b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.lc lcVar;
                String str;
                int i13;
                int i14;
                int i15 = r2;
                de0 de0Var = this.f52538b;
                switch (i15) {
                    case 0:
                        ee0 ee0Var2 = de0Var.f46878h0;
                        if (ee0Var2.getParentActivity() != null) {
                            boolean z10 = !ee0Var2.E;
                            ee0Var2.E = z10;
                            ((org.telegram.ui.Cells.d2) view).c(z10, true);
                            if (ee0Var2.E) {
                                lcVar = new org.telegram.ui.Components.lc(ee0Var2.f47178a0, null);
                                str = "SyncContactsOn";
                                i13 = 2131744055;
                                i14 = 2131623992;
                            } else {
                                lcVar = new org.telegram.ui.Components.lc(ee0Var2.f47178a0, null);
                                str = "SyncContactsOff";
                                i13 = 2131744056;
                                i14 = 2131623991;
                            }
                            org.telegram.messenger.f3.n(str, i13, lcVar, i14, 36);
                            return;
                        }
                        return;
                    case 1:
                        ee0 ee0Var3 = de0Var.f46878h0;
                        if (ee0Var3.getParentActivity() != null) {
                            boolean z11 = !ee0Var3.F;
                            ee0Var3.F = z11;
                            ((org.telegram.ui.Cells.d2) view).c(z11, true);
                            if (ee0Var3.getConnectionsManager().isTestBackend() != ee0Var3.F) {
                                ee0Var3.getConnectionsManager().switchBackend(false);
                            }
                            de0Var.r();
                            return;
                        }
                        return;
                    default:
                        ts tsVar = new ts(de0Var.H, true);
                        tsVar.f52346r = new yd0(de0Var);
                        de0Var.f46878h0.presentFragment(tsVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.xb0 xb0Var2 = new org.telegram.ui.Components.xb0(context, null);
        this.f46875f = xb0Var2;
        xb0Var2.addView(linearLayout2, c8.ma.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        xb0Var2.setText(org.telegram.messenger.gd.M0(2131747097, null));
        addView(xb0Var2, c8.ma.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, c8.ma.o(-2, -2));
        be0 be0Var = new be0(this, context, 0);
        this.f46866a = be0Var;
        be0Var.setInputType(3);
        be0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        be0Var.setCursorWidth(1.5f);
        be0Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        be0Var.setTextSize(1, 16.0f);
        be0Var.setMaxLines(1);
        be0Var.setGravity(19);
        be0Var.setImeOptions(268435461);
        be0Var.setBackground(null);
        be0Var.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        be0Var.setContentDescription(org.telegram.messenger.gd.M0(2131748548, null));
        linearLayout2.addView(be0Var, c8.ma.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        be0Var.addTextChangedListener(new m0(this, 12));
        be0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final de0 f52263b;

            {
                this.f52263b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        de0 de0Var = this.f52263b;
                        if (i13 == 5) {
                            rd0 rd0Var = de0Var.f46878h0.f47182c0;
                            if (rd0Var != null) {
                                rd0Var.h.callOnClick();
                                return true;
                            }
                            de0Var.h(null);
                            return true;
                        }
                        de0Var.getClass();
                        return false;
                    default:
                        be0 be0Var2 = this.f52263b.f46868b;
                        if (i13 == 5) {
                            be0Var2.requestFocus();
                            be0Var2.setSelection(be0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f46880r = view;
        LinearLayout.LayoutParams k10 = c8.ma.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(view, k10);
        be0 be0Var2 = new be0(this, context, 1);
        this.f46868b = be0Var2;
        be0Var2.setInputType(3);
        be0Var2.setPadding(0, 0, 0, 0);
        be0Var2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        be0Var2.setCursorWidth(1.5f);
        be0Var2.setTextSize(1, 16.0f);
        be0Var2.setMaxLines(1);
        be0Var2.setGravity(19);
        be0Var2.setImeOptions(268435461);
        be0Var2.setBackground(null);
        be0Var2.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        be0Var2.setContentDescription(org.telegram.messenger.gd.M0(2131747097, null));
        linearLayout2.addView(be0Var2, c8.ma.c(36.0f, -1));
        be0Var2.addTextChangedListener(new ar(this, 1));
        be0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final de0 f52263b;

            {
                this.f52263b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        de0 de0Var = this.f52263b;
                        if (i13 == 5) {
                            rd0 rd0Var = de0Var.f46878h0.f47182c0;
                            if (rd0Var != null) {
                                rd0Var.h.callOnClick();
                                return true;
                            }
                            de0Var.h(null);
                            return true;
                        }
                        de0Var.getClass();
                        return false;
                    default:
                        be0 be0Var22 = this.f52263b.f46868b;
                        if (i13 == 5) {
                            be0Var22.requestFocus();
                            be0Var22.setSelection(be0Var22.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i13 = 56;
        if (ee0Var.f47210y && ee0Var.G == 0) {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, 2);
            this.f46884y = d2Var;
            d2Var.e(org.telegram.messenger.gd.M0(2131744063, "SyncContacts"), "", ee0Var.E, false, false);
            if (org.telegram.messenger.gd.f24213a0 && org.telegram.messenger.g0.O1()) {
                i12 = 56;
            } else {
                i12 = 0;
            }
            addView(d2Var, c8.ma.t(-2, -1, 51, 16, 0, 16 + i12, 0));
            d2Var.setOnClickListener(new View.OnClickListener(this) {
                public final de0 f52538b;

                {
                    this.f52538b = this;
                }

                @Override
                public final void onClick(View view2) {
                    org.telegram.ui.Components.lc lcVar;
                    String str;
                    int i132;
                    int i14;
                    int i15 = r2;
                    de0 de0Var = this.f52538b;
                    switch (i15) {
                        case 0:
                            ee0 ee0Var2 = de0Var.f46878h0;
                            if (ee0Var2.getParentActivity() != null) {
                                boolean z10 = !ee0Var2.E;
                                ee0Var2.E = z10;
                                ((org.telegram.ui.Cells.d2) view2).c(z10, true);
                                if (ee0Var2.E) {
                                    lcVar = new org.telegram.ui.Components.lc(ee0Var2.f47178a0, null);
                                    str = "SyncContactsOn";
                                    i132 = 2131744055;
                                    i14 = 2131623992;
                                } else {
                                    lcVar = new org.telegram.ui.Components.lc(ee0Var2.f47178a0, null);
                                    str = "SyncContactsOff";
                                    i132 = 2131744056;
                                    i14 = 2131623991;
                                }
                                org.telegram.messenger.f3.n(str, i132, lcVar, i14, 36);
                                return;
                            }
                            return;
                        case 1:
                            ee0 ee0Var3 = de0Var.f46878h0;
                            if (ee0Var3.getParentActivity() != null) {
                                boolean z11 = !ee0Var3.F;
                                ee0Var3.F = z11;
                                ((org.telegram.ui.Cells.d2) view2).c(z11, true);
                                if (ee0Var3.getConnectionsManager().isTestBackend() != ee0Var3.F) {
                                    ee0Var3.getConnectionsManager().switchBackend(false);
                                }
                                de0Var.r();
                                return;
                            }
                            return;
                        default:
                            ts tsVar = new ts(de0Var.H, true);
                            tsVar.f52346r = new yd0(de0Var);
                            de0Var.f46878h0.presentFragment(tsVar);
                            return;
                    }
                }
            });
            i11 = 48;
        } else {
            i11 = 72;
        }
        boolean z10 = org.telegram.messenger.s2.f26721a;
        if (ee0Var.G == 0) {
            org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context, 2);
            this.E = d2Var2;
            String M0 = org.telegram.messenger.gd.M0(2131751595, null);
            boolean isTestBackend = ee0Var.getConnectionsManager().isTestBackend();
            ee0Var.F = isTestBackend;
            d2Var2.e(M0, "", isTestBackend, false, false);
            addView(d2Var2, c8.ma.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.gd.f24213a0 && org.telegram.messenger.g0.O1()) ? i13 : 0), 0));
            i11 -= 24;
            d2Var2.setOnClickListener(new View.OnClickListener(this) {
                public final de0 f52538b;

                {
                    this.f52538b = this;
                }

                @Override
                public final void onClick(View view2) {
                    org.telegram.ui.Components.lc lcVar;
                    String str;
                    int i132;
                    int i14;
                    int i15 = r2;
                    de0 de0Var = this.f52538b;
                    switch (i15) {
                        case 0:
                            ee0 ee0Var2 = de0Var.f46878h0;
                            if (ee0Var2.getParentActivity() != null) {
                                boolean z102 = !ee0Var2.E;
                                ee0Var2.E = z102;
                                ((org.telegram.ui.Cells.d2) view2).c(z102, true);
                                if (ee0Var2.E) {
                                    lcVar = new org.telegram.ui.Components.lc(ee0Var2.f47178a0, null);
                                    str = "SyncContactsOn";
                                    i132 = 2131744055;
                                    i14 = 2131623992;
                                } else {
                                    lcVar = new org.telegram.ui.Components.lc(ee0Var2.f47178a0, null);
                                    str = "SyncContactsOff";
                                    i132 = 2131744056;
                                    i14 = 2131623991;
                                }
                                org.telegram.messenger.f3.n(str, i132, lcVar, i14, 36);
                                return;
                            }
                            return;
                        case 1:
                            ee0 ee0Var3 = de0Var.f46878h0;
                            if (ee0Var3.getParentActivity() != null) {
                                boolean z11 = !ee0Var3.F;
                                ee0Var3.F = z11;
                                ((org.telegram.ui.Cells.d2) view2).c(z11, true);
                                if (ee0Var3.getConnectionsManager().isTestBackend() != ee0Var3.F) {
                                    ee0Var3.getConnectionsManager().switchBackend(false);
                                }
                                de0Var.r();
                                return;
                            }
                            return;
                        default:
                            ts tsVar = new ts(de0Var.H, true);
                            tsVar.f52346r = new yd0(de0Var);
                            de0Var.f46878h0.presentFragment(tsVar);
                            return;
                    }
                }
            });
        }
        if (i11 > 0 && !org.telegram.messenger.g0.O1()) {
            View space = new Space(context);
            space.setMinimumHeight(org.telegram.messenger.g0.L(i11));
            addView(space, c8.ma.o(-2, -2));
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
                obj.f50920a = split[2];
                String str = split[0];
                obj.f50922c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i02 = org.telegram.messenger.gd.i0(2131750505, obj.d);
                    if (!TextUtils.isEmpty(i02) && !TextUtils.equals(obj.d, i02)) {
                        obj.f50921b = obj.f50920a;
                        obj.f50920a = i02;
                    }
                }
                this.H.add(0, obj);
                List list = (List) this.I.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.I;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(obj);
                if (split.length > 3) {
                    this.J.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.H, Comparator$CC.comparing(new aa.l(14)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f26913b.getSystemService("phone");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        ConnectionsManager.getInstance(ee0Var.getAccountInstance().f23218a).sendRequest(new TLRPC.TL_help_getNearestDc(), new e00(12, this, hashMap), 10);
        if (this.f46866a.length() == 0) {
            setCountryButtonText(null);
            this.f46868b.setHintText((String) null);
            this.F = 1;
        }
        if (this.f46866a.length() != 0) {
            this.f46868b.requestFocus();
            be0 be0Var3 = this.f46868b;
            be0Var3.setSelection(be0Var3.length());
        } else {
            this.f46866a.requestFocus();
        }
        r();
    }

    public void setCountryButtonText(CharSequence charSequence) {
        int i7;
        boolean z10;
        float f10;
        Context context = org.telegram.messenger.t0.f26913b;
        if (this.d.getCurrentView().getText() != null && charSequence == null) {
            i7 = 2130772021;
        } else {
            i7 = 2130772020;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i7);
        loadAnimation.setInterpolator(org.telegram.ui.Components.xs.f42178e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.fz0 fz0Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        fz0Var.a(charSequence, z10, false);
        org.telegram.ui.Components.xb0 xb0Var = this.f46873e;
        if (charSequence != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        xb0Var.b(f10, f10, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void d() {
        this.N = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        if (i7 == org.telegram.messenger.ks.f25148l4) {
            this.d.getCurrentView().invalidate();
            return;
        }
        int i13 = org.telegram.messenger.ks.J2;
        if (i7 == i13) {
            ee0 ee0Var = this.f46878h0;
            i11 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
            if (i10 == i11 && this.W) {
                this.W = false;
                i12 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                org.telegram.messenger.ks.f(i12).n(this, i13);
                if (o()) {
                    s();
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7;
        org.telegram.messenger.nk nkVar = this.f46877g0;
        if (nkVar != null) {
            nkVar.run();
            this.f46877g0 = null;
        }
        this.f46867a0 = true;
        if (this.W) {
            this.W = false;
            i7 = ((org.telegram.ui.ActionBar.h2) this.f46878h0).currentAccount;
            org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.J2);
        }
        CancellationTokenSource cancellationTokenSource = this.f46869b0;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
            this.f46869b0 = null;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.f46871c0;
        if (u1Var != null) {
            u1Var.dismiss();
            this.f46871c0 = null;
        }
        org.telegram.ui.ActionBar.u1 u1Var2 = this.f46872d0;
        if (u1Var2 != null) {
            u1Var2.dismiss();
            this.f46872d0 = null;
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.M0(2131742538, "YourPhone");
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
        int i7;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i10;
        boolean z17;
        if (this.f46878h0.getParentActivity() != null && !this.N && !this.f46878h0.f47200r0) {
            boolean z18 = org.telegram.messenger.s2.f26721a;
            org.telegram.messenger.a8.b("sim status = " + ((TelephonyManager) org.telegram.messenger.t0.f26913b.getSystemService("phone")).getSimState());
            if (this.f46866a.length() != 0 && this.f46868b.length() != 0) {
                String str2 = "+" + ((Object) this.f46866a.getText()) + " " + ((Object) this.f46868b.getText());
                if (!this.O) {
                    Point point = org.telegram.messenger.g0.f24118q;
                    if (point.x > point.y && !this.f46878h0.z1() && this.f46878h0.T.Q() > org.telegram.messenger.g0.L(20.0f)) {
                        ee0 ee0Var = this.f46878h0;
                        ee0Var.U = new sd0(this, 1);
                        org.telegram.messenger.g0.v1(ee0Var.fragmentView);
                        return;
                    }
                    ee0 ee0Var2 = this.f46878h0;
                    Context context = this.f46878h0.fragmentView.getContext();
                    ee0 ee0Var3 = this.f46878h0;
                    ee0Var2.f47182c0 = new rd0(context, (ViewGroup) ee0Var3.fragmentView, ee0Var3.O, str2, new f(this, 21));
                    rd0 rd0Var = this.f46878h0.f47182c0;
                    rd0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new qd0(rd0Var, 0));
                    duration.addUpdateListener(new od0(rd0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                    duration.start();
                    return;
                }
                this.O = false;
                rd0 rd0Var2 = this.f46878h0.f47182c0;
                if (rd0Var2 != null) {
                    int i11 = rd0.G;
                    rd0Var2.a();
                }
                boolean N1 = org.telegram.messenger.g0.N1();
                int i12 = Build.VERSION.SDK_INT;
                if (N1) {
                    if (this.f46878h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f46878h0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 >= 28 && this.f46878h0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i12 >= 26 && this.f46878h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    ee0 ee0Var4 = this.f46878h0;
                    z10 = N1;
                    if (ee0Var4.f47206w) {
                        ee0Var4.f47199r.clear();
                        if (!z12) {
                            this.f46878h0.f47199r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.f46878h0.f47199r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.f46878h0.f47199r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.f46878h0.f47199r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.f46878h0.f47199r.isEmpty()) {
                            SharedPreferences g12 = org.telegram.messenger.mp.g1();
                            if (!g12.getBoolean("firstlogin", true) && !this.f46878h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.f46878h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.f46878h0.getParentActivity().requestPermissions((String[]) this.f46878h0.f47199r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            g12.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f46878h0.getParentActivity());
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, "Continue"), null);
                            int i13 = 2131623958;
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f28744a.U = org.telegram.messenger.gd.M0(2131754272, "AllowReadCallAndLog");
                            } else if (z13 && z14) {
                                alertDialog$Builder.f28744a.U = org.telegram.messenger.gd.M0(2131754273, "AllowReadCall");
                                i13 = 2131624067;
                            } else {
                                alertDialog$Builder.f28744a.U = org.telegram.messenger.gd.M0(2131754271, "AllowReadCallLog");
                            }
                            int i14 = org.telegram.ui.ActionBar.n6.L5;
                            alertDialog$Builder.m(i13, 46, org.telegram.ui.ActionBar.n6.x0(null, i14, false), null);
                            alertDialog$Builder.n(i14, null);
                            ee0 ee0Var5 = this.f46878h0;
                            ee0Var5.h = ee0Var5.showDialog(alertDialog$Builder.f28744a);
                            this.O = true;
                            return;
                        }
                    }
                    z11 = true;
                } else {
                    z10 = N1;
                    z11 = true;
                    z12 = true;
                    z13 = true;
                    z14 = true;
                }
                if (this.F == z11) {
                    this.f46878h0.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752123, "ChooseCountry"));
                    this.f46878h0.C1(false, z11);
                    return;
                }
                String str3 = "";
                String d = pf.b.d("" + ((Object) this.f46866a.getText()) + ((Object) this.f46868b.getText()), false);
                ee0 ee0Var6 = this.f46878h0;
                if (ee0Var6.G == 0 && (ee0Var6.getParentActivity() instanceof LaunchActivity)) {
                    for (int i15 = 0; i15 < 4; i15++) {
                        org.telegram.messenger.j10 i16 = org.telegram.messenger.j10.i(i15);
                        if (i16.p() && PhoneNumberUtils.compare(d, i16.f().phone)) {
                            boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                            ee0 ee0Var7 = this.f46878h0;
                            if (isTestBackend == ee0Var7.F) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ee0Var7.getParentActivity());
                                alertDialog$Builder2.f28744a.S = org.telegram.messenger.gd.M0(2131689472, null);
                                alertDialog$Builder2.f28744a.U = org.telegram.messenger.gd.M0(2131754709, "AccountAlreadyLoggedIn");
                                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131754694, "AccountSwitch"), new ai.s1(this, i15, 16));
                                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131747638, "OK"), null);
                                this.f46878h0.showDialog(alertDialog$Builder2.f28744a);
                                this.f46878h0.C1(false, true);
                                return;
                            }
                        }
                    }
                }
                ArrayList arrayList = null;
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
                boolean hasServices = org.telegram.messenger.nt.f25966b.hasServices();
                tL_codeSettings.allow_firebase = hasServices;
                tL_codeSettings.allow_app_hash = hasServices;
                if (this.f46878h0.m0 || TextUtils.isEmpty(org.telegram.messenger.s2.f26725f)) {
                    tL_codeSettings.allow_firebase = false;
                }
                ArrayList b10 = org.telegram.messenger.v0.b();
                if (b10 != null) {
                    for (int i17 = 0; i17 < b10.size(); i17++) {
                        if (((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token != null) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            boolean z19 = org.telegram.messenger.s2.f26721a;
                            org.telegram.messenger.a8.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token, StandardCharsets.UTF_8)));
                            tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token);
                            if (tL_codeSettings.logout_tokens.size() >= 20) {
                                break;
                            }
                        }
                    }
                }
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("saved_tokens", 0);
                int i18 = sharedPreferences.getInt("count", 0);
                if (i18 != 0) {
                    arrayList = new ArrayList();
                    int i19 = 0;
                    while (i19 < i18) {
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_out_token_" + i19, str3)));
                        String str4 = str3;
                        TLRPC.TL_auth_loggedOut TLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                        }
                        i19++;
                        sharedPreferences = sharedPreferences2;
                        str3 = str4;
                    }
                }
                if (arrayList != null) {
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        if (tL_codeSettings.logout_tokens == null) {
                            tL_codeSettings.logout_tokens = new ArrayList<>();
                        }
                        tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_loggedOut) arrayList.get(i20)).future_auth_token);
                        if (tL_codeSettings.logout_tokens.size() >= 20) {
                            break;
                        }
                    }
                    SharedPreferences sharedPreferences3 = org.telegram.messenger.t0.f26913b.getSharedPreferences("saved_tokens", 0);
                    ArrayList arrayList2 = new ArrayList();
                    sharedPreferences3.edit().clear().apply();
                    System.currentTimeMillis();
                    for (int i21 = 0; i21 < Math.min(20, arrayList.size()); i21++) {
                        arrayList2.add((TLRPC.TL_auth_loggedOut) arrayList.get(i21));
                    }
                    if (arrayList2.size() > 0) {
                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                            SerializedData serializedData2 = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList2.get(i22)).getObjectSize());
                            ((TLRPC.TL_auth_loggedOut) arrayList2.get(i22)).serializeToStream(serializedData2);
                            edit.putString("log_out_token_" + i22, Utilities.f(serializedData2.toByteArray()));
                        }
                        edit.apply();
                    }
                }
                if (tL_codeSettings.logout_tokens != null) {
                    tL_codeSettings.flags |= 64;
                }
                SharedPreferences sharedPreferences4 = org.telegram.messenger.t0.f26913b.getSharedPreferences("mainconfig", 0);
                sharedPreferences4.edit().remove("sms_hash_code").apply();
                if (tL_codeSettings.allow_app_hash) {
                    SharedPreferences.Editor edit2 = sharedPreferences4.edit();
                    org.telegram.messenger.t0.u();
                    edit2.putString("sms_hash", "O2P2z+/jBpJ").apply();
                } else {
                    sharedPreferences4.edit().remove("sms_hash").apply();
                }
                if (tL_codeSettings.allow_flashcall) {
                    try {
                        HashSet d12 = ee0.d1(this.f46878h0);
                        if (!d12.isEmpty()) {
                            tL_codeSettings.unknown_number = false;
                            tL_codeSettings.current_number = Collection.EL.stream(d12).anyMatch(new i60(d, 1));
                        } else {
                            tL_codeSettings.unknown_number = true;
                            if (org.telegram.messenger.j10.c() > 0) {
                                tL_codeSettings.allow_flashcall = false;
                            } else {
                                tL_codeSettings.current_number = false;
                            }
                        }
                    } catch (Exception e11) {
                        tL_codeSettings.unknown_number = true;
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                ee0 ee0Var8 = this.f46878h0;
                if (ee0Var8.G != 2) {
                    i7 = ((org.telegram.ui.ActionBar.h2) ee0Var8).currentAccount;
                    ConnectionsManager.getInstance(i7).cleanup(false);
                    TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                    tL_auth_sendCode2.api_hash = org.telegram.messenger.s2.f26724e;
                    tL_auth_sendCode2.api_id = org.telegram.messenger.s2.d;
                    tL_auth_sendCode2.phone_number = d;
                    tL_auth_sendCode2.settings = tL_codeSettings;
                    tL_auth_sendCode = tL_auth_sendCode2;
                } else {
                    TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                    sendchangephonecode.phone_number = d;
                    sendchangephonecode.settings = tL_codeSettings;
                    tL_auth_sendCode = sendchangephonecode;
                }
                TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                Bundle bundle = new Bundle();
                bundle.putString("phone", "+" + ((Object) this.f46866a.getText()) + " " + ((Object) this.f46868b.getText()));
                try {
                    bundle.putString("ephone", "+" + pf.b.d(this.f46866a.getText().toString(), false) + " " + pf.b.d(this.f46868b.getText().toString(), false));
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    bundle.putString("ephone", "+" + d);
                }
                bundle.putString("phoneFormated", d);
                ps psVar = this.G;
                if (psVar != null) {
                    bundle.putString("country", psVar.f50922c);
                }
                this.N = true;
                nd0 nd0Var = new nd0(0, false);
                nd0Var.d = "+" + ((Object) this.f46866a.getText()) + " " + ((Object) this.f46868b.getText());
                nd0Var.f50148b = this.G;
                nd0Var.f50149c = (List) this.J.get(this.f46866a.getText().toString());
                i10 = ((org.telegram.ui.ActionBar.h2) this.f46878h0).currentAccount;
                this.f46878h0.F1(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_sendCode3, new di.m7(this, bundle, d, nd0Var, tL_auth_sendCode3, 10), 27), true);
                return;
            }
            ee0.c1(this.f46878h0, this.f46875f, false);
        }
    }

    @Override
    public final void j() {
        p();
        org.telegram.ui.Cells.d2 d2Var = this.f46884y;
        if (d2Var != null) {
            d2Var.c(this.f46878h0.E, false);
        }
        org.telegram.messenger.g0.h3(new sd0(this, 0), ee0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f46866a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f46868b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f46866a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f46868b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    public final boolean o() {
        ee0 ee0Var = this.f46878h0;
        Activity parentActivity = ee0Var.getParentActivity();
        if (!this.f46867a0 && !this.N && ee0Var.f47177a == 0 && parentActivity != null && !parentActivity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25148l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25148l4);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.K) {
            this.K = false;
            return;
        }
        this.L = true;
        this.f46866a.setText(((ps) this.H.get(i7)).f50922c);
        this.L = false;
    }

    public final void p() {
        boolean z10;
        boolean z11;
        ee0 ee0Var;
        boolean z12;
        ps psVar;
        if (!this.U && this.f46878h0.G == 0) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f26913b.getSystemService("phone");
                if (org.telegram.messenger.g0.N1()) {
                    int i7 = Build.VERSION.SDK_INT;
                    if (this.f46878h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i7 >= 26 && this.f46878h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z11 = false;
                        ee0Var = this.f46878h0;
                        if (!ee0Var.f47208x && (!z10 || !z11)) {
                            ee0Var.f47201s.clear();
                            if (!z10) {
                                this.f46878h0.f47201s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i7 >= 26) {
                                this.f46878h0.f47201s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (!this.f46878h0.f47201s.isEmpty()) {
                                new o60(26, this, new ArrayList(this.f46878h0.f47201s)).run();
                                return;
                            }
                            return;
                        }
                        this.U = true;
                        if (ee0Var.f47210y && z10 && z11) {
                            this.f46866a.setAlpha(0.0f);
                            this.f46868b.setAlpha(0.0f);
                            String d = pf.b.d(telephonyManager.getLine1Number(), false);
                            if (!TextUtils.isEmpty(d)) {
                                int i10 = 4;
                                String str = null;
                                if (d.length() > 4) {
                                    while (true) {
                                        if (i10 >= 1) {
                                            String substring = d.substring(0, i10);
                                            List list = (List) this.I.get(substring);
                                            if (list == null) {
                                                psVar = null;
                                            } else if (list.size() > 1) {
                                                String string = org.telegram.messenger.mp.g1().getString("phone_code_last_matched_" + substring, null);
                                                psVar = (ps) list.get(list.size() - 1);
                                                if (string != null) {
                                                    ArrayList arrayList = this.H;
                                                    int size = arrayList.size();
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 >= size) {
                                                            break;
                                                        }
                                                        Object obj = arrayList.get(i11);
                                                        i11++;
                                                        ps psVar2 = (ps) obj;
                                                        if (Objects.equals(psVar2.d, string)) {
                                                            psVar = psVar2;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                psVar = (ps) list.get(0);
                                            }
                                            if (psVar != null) {
                                                str = d.substring(i10);
                                                this.f46866a.setText(substring);
                                                z12 = true;
                                                break;
                                            }
                                            i10--;
                                        } else {
                                            z12 = false;
                                            break;
                                        }
                                    }
                                    if (!z12) {
                                        str = d.substring(1);
                                        this.f46866a.setText(d.substring(0, 1));
                                    }
                                }
                                if (str != null) {
                                    this.f46868b.requestFocus();
                                    this.f46868b.setText(str);
                                    be0 be0Var = this.f46868b;
                                    be0Var.setSelection(be0Var.length());
                                }
                            }
                            if (this.f46868b.length() > 0) {
                                AnimatorSet duration = new AnimatorSet().setDuration(300L);
                                be0 be0Var2 = this.f46866a;
                                Property property = View.ALPHA;
                                duration.playTogether(ObjectAnimator.ofFloat(be0Var2, property, 1.0f), ObjectAnimator.ofFloat(this.f46868b, property, 1.0f));
                                duration.start();
                                this.O = true;
                                return;
                            }
                            this.f46866a.setAlpha(1.0f);
                            this.f46868b.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    ee0Var = this.f46878h0;
                    if (!ee0Var.f47208x) {
                    }
                    this.U = true;
                    if (ee0Var.f47210y) {
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void q() {
        String str;
        int i7;
        String str2 = this.S;
        be0 be0Var = this.f46868b;
        if (be0Var.getText() == null) {
            str = "";
        } else {
            str = be0Var.getText().toString().replace(" ", "");
        }
        HashMap hashMap = this.J;
        String str3 = null;
        if (hashMap.get(str2) != null && !((List) hashMap.get(str2)).isEmpty()) {
            List list = (List) hashMap.get(str2);
            if (!str.isEmpty()) {
                i7 = 0;
                while (i7 < list.size()) {
                    if (str.startsWith(((String) list.get(i7)).replace(" ", "").replace("X", "").replace("0", ""))) {
                        break;
                    }
                    i7++;
                }
            }
            i7 = -1;
            if (i7 == -1) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    String str4 = (String) list.get(i10);
                    if (str4.startsWith("X") || str4.startsWith("0")) {
                        i7 = i10;
                        break;
                    }
                }
                if (i7 == -1) {
                    i7 = 0;
                }
            }
            if (this.T != i7) {
                String str5 = (String) ((List) hashMap.get(str2)).get(i7);
                int selectionStart = be0Var.getSelectionStart();
                int selectionEnd = be0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                be0Var.setHintText(str3);
                be0Var.setSelection(Math.max(0, Math.min(be0Var.length(), selectionStart)), Math.max(0, Math.min(be0Var.length(), selectionEnd)));
                this.T = i7;
            }
        } else if (this.T != -1) {
            int selectionStart2 = be0Var.getSelectionStart();
            int selectionEnd2 = be0Var.getSelectionEnd();
            be0Var.setHintText((String) null);
            be0Var.setSelection(selectionStart2, selectionEnd2);
            this.T = -1;
        }
    }

    public final void r() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (org.telegram.messenger.gd.E0().B != null) {
            country = org.telegram.messenger.gd.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.f46878h0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new xd0(this, 0), 10);
    }

    public final void s() {
        int i7;
        int i10;
        int i11;
        ee0 ee0Var = this.f46878h0;
        if (ee0Var.G == 0 && !this.V && !this.f46867a0) {
            i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            if (!u12.f25696l4) {
                if (!this.W) {
                    this.W = true;
                    i10 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                    org.telegram.messenger.ks.f(i10).b(this, org.telegram.messenger.ks.J2);
                    i11 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).updateDcSettings();
                    return;
                }
                return;
            }
            this.V = true;
            boolean z10 = org.telegram.messenger.s2.f26728j;
            if (z10 && u12.f25704m4) {
                r3 r3Var = new r3(this, 13);
                if (!z10) {
                    r3Var.a(Collections.EMPTY_LIST);
                    return;
                }
                if (org.telegram.messenger.g9.f24184a == null) {
                    Object b10 = o9.g.c().b(db.a.class);
                    kotlin.jvm.internal.j.d(b10, "firebaseApp.get(Firebase…Verification::class.java)");
                    org.telegram.messenger.g9.f24184a = (db.a) b10;
                }
                db.n nVar = (db.n) org.telegram.messenger.g9.f24184a;
                nVar.getClass();
                db.n.f8258b.a("Getting Verification Support Info for all SIM slots", new Object[0]);
                db.q qVar = new db.q(hd.g.c(0, 1));
                db.d dVar = nVar.f8259a;
                org.telegram.messenger.d1 d1Var = db.d.f8246l;
                Log.i(d1Var.f23458b, d1Var.b("Requesting verification support info.", new Object[0]));
                com.google.android.gms.common.api.internal.t b11 = com.google.android.gms.common.api.internal.u.b();
                b11.d = new n6.c[]{db.j.f8253a};
                b11.f6354c = new a1.c(qVar, 20);
                b11.f6352a = 37303;
                Task e10 = dVar.e(0, b11.a());
                kotlin.jvm.internal.j.d(e10, "doRead(\n      TaskApiCal…Y)\n        .build()\n    )");
                Task continueWithTask = e10.continueWithTask(new a1.c(nVar, 21));
                kotlin.jvm.internal.j.d(continueWithTask, "fpnvClient.getVerificati…_SUPPORTED,\n      )\n    }");
                continueWithTask.addOnSuccessListener(new d3.b(1), new org.telegram.messenger.d9(r3Var)).addOnFailureListener(new d3.b(1), new org.telegram.messenger.d9(r3Var));
                return;
            }
            t(false);
        }
    }

    public final void t(final boolean z10) {
        boolean z11;
        final int i7;
        org.telegram.messenger.nk nkVar;
        ee0 ee0Var = this.f46878h0;
        if (ee0Var.G == 0 && Build.VERSION.SDK_INT >= 28 && (z11 = org.telegram.messenger.s2.f26727i) && !this.f46876f0) {
            if (z10 || !this.f46874e0) {
                this.f46876f0 = true;
                this.f46874e0 = true;
                final Context context = getContext();
                i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                final vd0 vd0Var = new vd0(this, 0);
                if (!z11) {
                    nkVar = null;
                } else {
                    kotlin.jvm.internal.j.e(context, "context");
                    final androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 4);
                    final boolean[] zArr = new boolean[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = org.telegram.messenger.s2.d;
                    initpasskeylogin.api_hash = org.telegram.messenger.s2.f26724e;
                    final Runnable[] runnableArr = {new org.telegram.messenger.e9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(initpasskeylogin, new d3.b(1), new org.telegram.messenger.q10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            jt.a(zArr, vd0Var, z10, nVar, context, i7, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), 3)};
                    nkVar = new org.telegram.messenger.nk(zArr, runnableArr, 1);
                }
                this.f46877g0 = nkVar;
            }
        }
    }

    public final void u(String str, ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.gd.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.sy(4), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.f50920a);
        setCountryButtonText(org.telegram.messenger.j6.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.S = str;
        this.T = -1;
        q();
    }

    @Override
    public final void updateColors() {
        this.f46870c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false);
        org.telegram.ui.Components.k80 k80Var = this.f46879n;
        k80Var.setTextColor(x02);
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.fz0 fz0Var = this.d;
            if (i7 >= fz0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) fz0Var.getChildAt(i7);
            textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.H6, false));
            i7++;
        }
        int i10 = org.telegram.ui.ActionBar.n6.H6;
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i11 = this.f46882w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.f46881s;
        ee0.u1(imageView, x03, i11, mode);
        this.f46882w = x03;
        int themedColor = this.f46878h0.getThemedColor(org.telegram.ui.ActionBar.n6.f29486i6);
        ee0.v1(imageView, themedColor, this.f46883x);
        this.f46883x = themedColor;
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        be0 be0Var = this.f46866a;
        be0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.n6.f29541l6;
        be0Var.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
        this.f46880r.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29523k6, false));
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
        be0 be0Var2 = this.f46868b;
        be0Var2.setTextColor(x05);
        be0Var2.setHintTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        be0Var2.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
        org.telegram.ui.Cells.d2 d2Var = this.f46884y;
        if (d2Var != null) {
            int i14 = org.telegram.ui.ActionBar.n6.Y6;
            int i15 = org.telegram.ui.ActionBar.n6.W6;
            int i16 = org.telegram.ui.ActionBar.n6.X6;
            CheckBoxSquare checkBoxSquare = d2Var.f30530n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f32854s = i14;
                checkBoxSquare.f32855w = i15;
                checkBoxSquare.f32856x = i16;
                checkBoxSquare.invalidate();
            }
            d2Var.g();
        }
        org.telegram.ui.Cells.d2 d2Var2 = this.E;
        if (d2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.n6.Y6;
            int i18 = org.telegram.ui.ActionBar.n6.W6;
            int i19 = org.telegram.ui.ActionBar.n6.X6;
            CheckBoxSquare checkBoxSquare2 = d2Var2.f30530n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f32854s = i17;
                checkBoxSquare2.f32855w = i18;
                checkBoxSquare2.f32856x = i19;
                checkBoxSquare2.invalidate();
            }
            d2Var2.g();
        }
        this.f46875f.f();
        this.f46873e.f();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

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
public final class ce0 extends org.telegram.ui.Components.iu0 implements AdapterView.OnItemSelectedListener, org.telegram.messenger.gs {
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
    public final ae0 f46530a;
    public boolean f46531a0;
    public final ae0 f46532b;
    public CancellationTokenSource f46533b0;
    public final TextView f46534c;
    public org.telegram.ui.ActionBar.t1 f46535c0;
    public final org.telegram.ui.Components.hz0 d;
    public org.telegram.ui.ActionBar.t1 f46536d0;
    public final org.telegram.ui.Components.yb0 f46537e;
    public boolean f46538e0;
    public final org.telegram.ui.Components.yb0 f46539f;
    public boolean f46540f0;
    public org.telegram.messenger.ok f46541g0;
    public final TextView h;
    public final de0 f46542h0;
    public final org.telegram.ui.Components.m80 f46543n;
    public final View f46544r;
    public final ImageView f46545s;
    public int f46546w;
    public int f46547x;
    public final org.telegram.ui.Cells.d2 f46548y;

    public ce0(de0 de0Var, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        this.f46542h0 = de0Var;
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
        this.f46538e0 = false;
        this.f46540f0 = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f46534c = textView;
        i5.c.x(textView, 1, 18.0f);
        if (de0Var.G == 2) {
            i7 = 2131752526;
        } else {
            i7 = 2131742540;
        }
        textView.setText(org.telegram.messenger.hd.N0(i7, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, c8.ma.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new org.telegram.ui.Components.q31(29, this, context));
        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(context, null);
        this.f46543n = m80Var;
        if (de0Var.G == 2) {
            i10 = 2131752527;
        } else {
            i10 = 2131744664;
        }
        m80Var.setText(org.telegram.messenger.hd.N0(i10, null));
        m80Var.setTextSize(1, 14.0f);
        m80Var.setGravity(17);
        m80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(m80Var, c8.ma.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new zd0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772019);
        loadAnimation.setInterpolator(org.telegram.ui.Components.zs.f42977e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f46545s = imageView;
        imageView.setImageResource(2131232191);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, c8.ma.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, c8.ma.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0(context, null);
        this.f46537e = yb0Var;
        yb0Var.setText(org.telegram.messenger.hd.N0(2131751742, null));
        yb0Var.addView(linearLayout, c8.ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        yb0Var.setForceUseCenter(true);
        yb0Var.setFocusable(true);
        yb0Var.setContentDescription(org.telegram.messenger.hd.N0(2131751742, null));
        yb0Var.setOnFocusChangeListener(new ed(this, 9));
        addView(yb0Var, c8.ma.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        yb0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ce0 f52317b;

            {
                this.f52317b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.lc lcVar;
                String str;
                int i13;
                int i14;
                int i15 = r2;
                ce0 ce0Var = this.f52317b;
                switch (i15) {
                    case 0:
                        de0 de0Var2 = ce0Var.f46542h0;
                        if (de0Var2.getParentActivity() != null) {
                            boolean z10 = !de0Var2.E;
                            de0Var2.E = z10;
                            ((org.telegram.ui.Cells.d2) view).c(z10, true);
                            if (de0Var2.E) {
                                lcVar = new org.telegram.ui.Components.lc(de0Var2.f46927a0, null);
                                str = "SyncContactsOn";
                                i13 = 2131744047;
                                i14 = 2131623992;
                            } else {
                                lcVar = new org.telegram.ui.Components.lc(de0Var2.f46927a0, null);
                                str = "SyncContactsOff";
                                i13 = 2131744048;
                                i14 = 2131623991;
                            }
                            org.telegram.messenger.f3.n(str, i13, lcVar, i14, 36);
                            return;
                        }
                        return;
                    case 1:
                        de0 de0Var3 = ce0Var.f46542h0;
                        if (de0Var3.getParentActivity() != null) {
                            boolean z11 = !de0Var3.F;
                            de0Var3.F = z11;
                            ((org.telegram.ui.Cells.d2) view).c(z11, true);
                            if (de0Var3.getConnectionsManager().isTestBackend() != de0Var3.F) {
                                de0Var3.getConnectionsManager().switchBackend(false);
                            }
                            ce0Var.r();
                            return;
                        }
                        return;
                    default:
                        us usVar = new us(ce0Var.H, true);
                        usVar.f52629r = new xd0(ce0Var);
                        ce0Var.f46542h0.presentFragment(usVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.yb0 yb0Var2 = new org.telegram.ui.Components.yb0(context, null);
        this.f46539f = yb0Var2;
        yb0Var2.addView(linearLayout2, c8.ma.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        yb0Var2.setText(org.telegram.messenger.hd.N0(2131747096, null));
        addView(yb0Var2, c8.ma.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, c8.ma.o(-2, -2));
        ae0 ae0Var = new ae0(this, context, 0);
        this.f46530a = ae0Var;
        ae0Var.setInputType(3);
        ae0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ae0Var.setCursorWidth(1.5f);
        ae0Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        ae0Var.setTextSize(1, 16.0f);
        ae0Var.setMaxLines(1);
        ae0Var.setGravity(19);
        ae0Var.setImeOptions(268435461);
        ae0Var.setBackground(null);
        ae0Var.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ae0Var.setContentDescription(org.telegram.messenger.hd.N0(2131748547, null));
        linearLayout2.addView(ae0Var, c8.ma.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ae0Var.addTextChangedListener(new m0(this, 12));
        ae0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ce0 f52030b;

            {
                this.f52030b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        ce0 ce0Var = this.f52030b;
                        if (i13 == 5) {
                            qd0 qd0Var = ce0Var.f46542h0.f46931c0;
                            if (qd0Var != null) {
                                qd0Var.h.callOnClick();
                                return true;
                            }
                            ce0Var.h(null);
                            return true;
                        }
                        ce0Var.getClass();
                        return false;
                    default:
                        ae0 ae0Var2 = this.f52030b.f46532b;
                        if (i13 == 5) {
                            ae0Var2.requestFocus();
                            ae0Var2.setSelection(ae0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f46544r = view;
        LinearLayout.LayoutParams k10 = c8.ma.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(view, k10);
        ae0 ae0Var2 = new ae0(this, context, 1);
        this.f46532b = ae0Var2;
        ae0Var2.setInputType(3);
        ae0Var2.setPadding(0, 0, 0, 0);
        ae0Var2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ae0Var2.setCursorWidth(1.5f);
        ae0Var2.setTextSize(1, 16.0f);
        ae0Var2.setMaxLines(1);
        ae0Var2.setGravity(19);
        ae0Var2.setImeOptions(268435461);
        ae0Var2.setBackground(null);
        ae0Var2.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ae0Var2.setContentDescription(org.telegram.messenger.hd.N0(2131747096, null));
        linearLayout2.addView(ae0Var2, c8.ma.c(36.0f, -1));
        ae0Var2.addTextChangedListener(new ar(this, 1));
        ae0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ce0 f52030b;

            {
                this.f52030b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        ce0 ce0Var = this.f52030b;
                        if (i13 == 5) {
                            qd0 qd0Var = ce0Var.f46542h0.f46931c0;
                            if (qd0Var != null) {
                                qd0Var.h.callOnClick();
                                return true;
                            }
                            ce0Var.h(null);
                            return true;
                        }
                        ce0Var.getClass();
                        return false;
                    default:
                        ae0 ae0Var22 = this.f52030b.f46532b;
                        if (i13 == 5) {
                            ae0Var22.requestFocus();
                            ae0Var22.setSelection(ae0Var22.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i13 = 56;
        if (de0Var.f46959y && de0Var.G == 0) {
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, 2);
            this.f46548y = d2Var;
            d2Var.e(org.telegram.messenger.hd.N0(2131744055, "SyncContacts"), "", de0Var.E, false, false);
            if (org.telegram.messenger.hd.f24444a0 && org.telegram.messenger.g0.O1()) {
                i12 = 56;
            } else {
                i12 = 0;
            }
            addView(d2Var, c8.ma.t(-2, -1, 51, 16, 0, 16 + i12, 0));
            d2Var.setOnClickListener(new View.OnClickListener(this) {
                public final ce0 f52317b;

                {
                    this.f52317b = this;
                }

                @Override
                public final void onClick(View view2) {
                    org.telegram.ui.Components.lc lcVar;
                    String str;
                    int i132;
                    int i14;
                    int i15 = r2;
                    ce0 ce0Var = this.f52317b;
                    switch (i15) {
                        case 0:
                            de0 de0Var2 = ce0Var.f46542h0;
                            if (de0Var2.getParentActivity() != null) {
                                boolean z10 = !de0Var2.E;
                                de0Var2.E = z10;
                                ((org.telegram.ui.Cells.d2) view2).c(z10, true);
                                if (de0Var2.E) {
                                    lcVar = new org.telegram.ui.Components.lc(de0Var2.f46927a0, null);
                                    str = "SyncContactsOn";
                                    i132 = 2131744047;
                                    i14 = 2131623992;
                                } else {
                                    lcVar = new org.telegram.ui.Components.lc(de0Var2.f46927a0, null);
                                    str = "SyncContactsOff";
                                    i132 = 2131744048;
                                    i14 = 2131623991;
                                }
                                org.telegram.messenger.f3.n(str, i132, lcVar, i14, 36);
                                return;
                            }
                            return;
                        case 1:
                            de0 de0Var3 = ce0Var.f46542h0;
                            if (de0Var3.getParentActivity() != null) {
                                boolean z11 = !de0Var3.F;
                                de0Var3.F = z11;
                                ((org.telegram.ui.Cells.d2) view2).c(z11, true);
                                if (de0Var3.getConnectionsManager().isTestBackend() != de0Var3.F) {
                                    de0Var3.getConnectionsManager().switchBackend(false);
                                }
                                ce0Var.r();
                                return;
                            }
                            return;
                        default:
                            us usVar = new us(ce0Var.H, true);
                            usVar.f52629r = new xd0(ce0Var);
                            ce0Var.f46542h0.presentFragment(usVar);
                            return;
                    }
                }
            });
            i11 = 48;
        } else {
            i11 = 72;
        }
        boolean z10 = org.telegram.messenger.s2.f26730a;
        if (de0Var.G == 0) {
            org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(context, 2);
            this.E = d2Var2;
            String N0 = org.telegram.messenger.hd.N0(2131751594, null);
            boolean isTestBackend = de0Var.getConnectionsManager().isTestBackend();
            de0Var.F = isTestBackend;
            d2Var2.e(N0, "", isTestBackend, false, false);
            addView(d2Var2, c8.ma.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.hd.f24444a0 && org.telegram.messenger.g0.O1()) ? i13 : 0), 0));
            i11 -= 24;
            d2Var2.setOnClickListener(new View.OnClickListener(this) {
                public final ce0 f52317b;

                {
                    this.f52317b = this;
                }

                @Override
                public final void onClick(View view2) {
                    org.telegram.ui.Components.lc lcVar;
                    String str;
                    int i132;
                    int i14;
                    int i15 = r2;
                    ce0 ce0Var = this.f52317b;
                    switch (i15) {
                        case 0:
                            de0 de0Var2 = ce0Var.f46542h0;
                            if (de0Var2.getParentActivity() != null) {
                                boolean z102 = !de0Var2.E;
                                de0Var2.E = z102;
                                ((org.telegram.ui.Cells.d2) view2).c(z102, true);
                                if (de0Var2.E) {
                                    lcVar = new org.telegram.ui.Components.lc(de0Var2.f46927a0, null);
                                    str = "SyncContactsOn";
                                    i132 = 2131744047;
                                    i14 = 2131623992;
                                } else {
                                    lcVar = new org.telegram.ui.Components.lc(de0Var2.f46927a0, null);
                                    str = "SyncContactsOff";
                                    i132 = 2131744048;
                                    i14 = 2131623991;
                                }
                                org.telegram.messenger.f3.n(str, i132, lcVar, i14, 36);
                                return;
                            }
                            return;
                        case 1:
                            de0 de0Var3 = ce0Var.f46542h0;
                            if (de0Var3.getParentActivity() != null) {
                                boolean z11 = !de0Var3.F;
                                de0Var3.F = z11;
                                ((org.telegram.ui.Cells.d2) view2).c(z11, true);
                                if (de0Var3.getConnectionsManager().isTestBackend() != de0Var3.F) {
                                    de0Var3.getConnectionsManager().switchBackend(false);
                                }
                                ce0Var.r();
                                return;
                            }
                            return;
                        default:
                            us usVar = new us(ce0Var.H, true);
                            usVar.f52629r = new xd0(ce0Var);
                            ce0Var.f46542h0.presentFragment(usVar);
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
                obj.f50969a = split[2];
                String str = split[0];
                obj.f50971c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i02 = org.telegram.messenger.hd.i0(2131750504, obj.d);
                    if (!TextUtils.isEmpty(i02) && !TextUtils.equals(obj.d, i02)) {
                        obj.f50970b = obj.f50969a;
                        obj.f50969a = i02;
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
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f26931b.getSystemService("phone");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        ConnectionsManager.getInstance(de0Var.getAccountInstance().f23202a).sendRequest(new TLRPC.TL_help_getNearestDc(), new e00(12, this, hashMap), 10);
        if (this.f46530a.length() == 0) {
            setCountryButtonText(null);
            this.f46532b.setHintText((String) null);
            this.F = 1;
        }
        if (this.f46530a.length() != 0) {
            this.f46532b.requestFocus();
            ae0 ae0Var3 = this.f46532b;
            ae0Var3.setSelection(ae0Var3.length());
        } else {
            this.f46530a.requestFocus();
        }
        r();
    }

    public void setCountryButtonText(CharSequence charSequence) {
        int i7;
        boolean z10;
        float f10;
        Context context = org.telegram.messenger.t0.f26931b;
        if (this.d.getCurrentView().getText() != null && charSequence == null) {
            i7 = 2130772021;
        } else {
            i7 = 2130772020;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i7);
        loadAnimation.setInterpolator(org.telegram.ui.Components.zs.f42977e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.hz0 hz0Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        hz0Var.a(charSequence, z10, false);
        org.telegram.ui.Components.yb0 yb0Var = this.f46537e;
        if (charSequence != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        yb0Var.b(f10, f10, true);
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
        if (i7 == org.telegram.messenger.ls.f25342l4) {
            this.d.getCurrentView().invalidate();
            return;
        }
        int i13 = org.telegram.messenger.ls.J2;
        if (i7 == i13) {
            de0 de0Var = this.f46542h0;
            i11 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            if (i10 == i11 && this.W) {
                this.W = false;
                i12 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                org.telegram.messenger.ls.f(i12).n(this, i13);
                if (o()) {
                    s();
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7;
        org.telegram.messenger.ok okVar = this.f46541g0;
        if (okVar != null) {
            okVar.run();
            this.f46541g0 = null;
        }
        this.f46531a0 = true;
        if (this.W) {
            this.W = false;
            i7 = ((org.telegram.ui.ActionBar.g2) this.f46542h0).currentAccount;
            org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.J2);
        }
        CancellationTokenSource cancellationTokenSource = this.f46533b0;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
            this.f46533b0 = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.f46535c0;
        if (t1Var != null) {
            t1Var.dismiss();
            this.f46535c0 = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var2 = this.f46536d0;
        if (t1Var2 != null) {
            t1Var2.dismiss();
            this.f46536d0 = null;
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.N0(2131742530, "YourPhone");
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
        if (this.f46542h0.getParentActivity() != null && !this.N && !this.f46542h0.f46949r0) {
            boolean z18 = org.telegram.messenger.s2.f26730a;
            org.telegram.messenger.a8.b("sim status = " + ((TelephonyManager) org.telegram.messenger.t0.f26931b.getSystemService("phone")).getSimState());
            if (this.f46530a.length() != 0 && this.f46532b.length() != 0) {
                String str2 = "+" + ((Object) this.f46530a.getText()) + " " + ((Object) this.f46532b.getText());
                if (!this.O) {
                    Point point = org.telegram.messenger.g0.f24046q;
                    if (point.x > point.y && !this.f46542h0.z1() && this.f46542h0.T.Q() > org.telegram.messenger.g0.L(20.0f)) {
                        de0 de0Var = this.f46542h0;
                        de0Var.U = new rd0(this, 1);
                        org.telegram.messenger.g0.v1(de0Var.fragmentView);
                        return;
                    }
                    de0 de0Var2 = this.f46542h0;
                    Context context = this.f46542h0.fragmentView.getContext();
                    de0 de0Var3 = this.f46542h0;
                    de0Var2.f46931c0 = new qd0(context, (ViewGroup) de0Var3.fragmentView, de0Var3.O, str2, new f(this, 21));
                    qd0 qd0Var = this.f46542h0.f46931c0;
                    qd0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new pd0(qd0Var, 0));
                    duration.addUpdateListener(new nd0(qd0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.nr.f37960f);
                    duration.start();
                    return;
                }
                this.O = false;
                qd0 qd0Var2 = this.f46542h0.f46931c0;
                if (qd0Var2 != null) {
                    int i11 = qd0.G;
                    qd0Var2.a();
                }
                boolean N1 = org.telegram.messenger.g0.N1();
                int i12 = Build.VERSION.SDK_INT;
                if (N1) {
                    if (this.f46542h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f46542h0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 >= 28 && this.f46542h0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i12 >= 26 && this.f46542h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    de0 de0Var4 = this.f46542h0;
                    z10 = N1;
                    if (de0Var4.f46955w) {
                        de0Var4.f46948r.clear();
                        if (!z12) {
                            this.f46542h0.f46948r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.f46542h0.f46948r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.f46542h0.f46948r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.f46542h0.f46948r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.f46542h0.f46948r.isEmpty()) {
                            SharedPreferences g12 = org.telegram.messenger.np.g1();
                            if (!g12.getBoolean("firstlogin", true) && !this.f46542h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.f46542h0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.f46542h0.getParentActivity().requestPermissions((String[]) this.f46542h0.f46948r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            g12.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f46542h0.getParentActivity());
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751759, "Continue"), null);
                            int i13 = 2131623958;
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f28777a.U = org.telegram.messenger.hd.N0(2131754271, "AllowReadCallAndLog");
                            } else if (z13 && z14) {
                                alertDialog$Builder.f28777a.U = org.telegram.messenger.hd.N0(2131754272, "AllowReadCall");
                                i13 = 2131624067;
                            } else {
                                alertDialog$Builder.f28777a.U = org.telegram.messenger.hd.N0(2131754270, "AllowReadCallLog");
                            }
                            int i14 = org.telegram.ui.ActionBar.m6.L5;
                            alertDialog$Builder.m(i13, 46, org.telegram.ui.ActionBar.m6.x0(null, i14, false), null);
                            alertDialog$Builder.n(i14, null);
                            de0 de0Var5 = this.f46542h0;
                            de0Var5.h = de0Var5.showDialog(alertDialog$Builder.f28777a);
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
                    this.f46542h0.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752122, "ChooseCountry"));
                    this.f46542h0.C1(false, z11);
                    return;
                }
                String str3 = "";
                String d = pf.b.d("" + ((Object) this.f46530a.getText()) + ((Object) this.f46532b.getText()), false);
                de0 de0Var6 = this.f46542h0;
                if (de0Var6.G == 0 && (de0Var6.getParentActivity() instanceof LaunchActivity)) {
                    for (int i15 = 0; i15 < 4; i15++) {
                        org.telegram.messenger.k10 i16 = org.telegram.messenger.k10.i(i15);
                        if (i16.p() && PhoneNumberUtils.compare(d, i16.f().phone)) {
                            boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                            de0 de0Var7 = this.f46542h0;
                            if (isTestBackend == de0Var7.F) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var7.getParentActivity());
                                alertDialog$Builder2.f28777a.S = org.telegram.messenger.hd.N0(2131689472, null);
                                alertDialog$Builder2.f28777a.U = org.telegram.messenger.hd.N0(2131754708, "AccountAlreadyLoggedIn");
                                alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131754693, "AccountSwitch"), new ai.v1(this, i15, 16));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131747637, "OK"), null);
                                this.f46542h0.showDialog(alertDialog$Builder2.f28777a);
                                this.f46542h0.C1(false, true);
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
                boolean hasServices = org.telegram.messenger.ot.f26165b.hasServices();
                tL_codeSettings.allow_firebase = hasServices;
                tL_codeSettings.allow_app_hash = hasServices;
                if (this.f46542h0.m0 || TextUtils.isEmpty(org.telegram.messenger.s2.f26734f)) {
                    tL_codeSettings.allow_firebase = false;
                }
                ArrayList b10 = org.telegram.messenger.v0.b();
                if (b10 != null) {
                    for (int i17 = 0; i17 < b10.size(); i17++) {
                        if (((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token != null) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            boolean z19 = org.telegram.messenger.s2.f26730a;
                            org.telegram.messenger.a8.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token, StandardCharsets.UTF_8)));
                            tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token);
                            if (tL_codeSettings.logout_tokens.size() >= 20) {
                                break;
                            }
                        }
                    }
                }
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26931b.getSharedPreferences("saved_tokens", 0);
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
                    SharedPreferences sharedPreferences3 = org.telegram.messenger.t0.f26931b.getSharedPreferences("saved_tokens", 0);
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
                SharedPreferences sharedPreferences4 = org.telegram.messenger.t0.f26931b.getSharedPreferences("mainconfig", 0);
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
                        HashSet d12 = de0.d1(this.f46542h0);
                        if (!d12.isEmpty()) {
                            tL_codeSettings.unknown_number = false;
                            tL_codeSettings.current_number = Collection.EL.stream(d12).anyMatch(new j60(d, 1));
                        } else {
                            tL_codeSettings.unknown_number = true;
                            if (org.telegram.messenger.k10.c() > 0) {
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
                de0 de0Var8 = this.f46542h0;
                if (de0Var8.G != 2) {
                    i7 = ((org.telegram.ui.ActionBar.g2) de0Var8).currentAccount;
                    ConnectionsManager.getInstance(i7).cleanup(false);
                    TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                    tL_auth_sendCode2.api_hash = org.telegram.messenger.s2.f26733e;
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
                bundle.putString("phone", "+" + ((Object) this.f46530a.getText()) + " " + ((Object) this.f46532b.getText()));
                try {
                    bundle.putString("ephone", "+" + pf.b.d(this.f46530a.getText().toString(), false) + " " + pf.b.d(this.f46532b.getText().toString(), false));
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    bundle.putString("ephone", "+" + d);
                }
                bundle.putString("phoneFormated", d);
                ps psVar = this.G;
                if (psVar != null) {
                    bundle.putString("country", psVar.f50971c);
                }
                this.N = true;
                md0 md0Var = new md0(0, false);
                md0Var.d = "+" + ((Object) this.f46530a.getText()) + " " + ((Object) this.f46532b.getText());
                md0Var.f49857b = this.G;
                md0Var.f49858c = (List) this.J.get(this.f46530a.getText().toString());
                i10 = ((org.telegram.ui.ActionBar.g2) this.f46542h0).currentAccount;
                this.f46542h0.F1(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_sendCode3, new di.m7(this, bundle, d, md0Var, tL_auth_sendCode3, 10), 27), true);
                return;
            }
            de0.c1(this.f46542h0, this.f46539f, false);
        }
    }

    @Override
    public final void j() {
        p();
        org.telegram.ui.Cells.d2 d2Var = this.f46548y;
        if (d2Var != null) {
            d2Var.c(this.f46542h0.E, false);
        }
        org.telegram.messenger.g0.h3(new rd0(this, 0), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f46530a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f46532b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f46530a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f46532b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    public final boolean o() {
        de0 de0Var = this.f46542h0;
        Activity parentActivity = de0Var.getParentActivity();
        if (!this.f46531a0 && !this.N && de0Var.f46926a == 0 && parentActivity != null && !parentActivity.isFinishing()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25342l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25342l4);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.K) {
            this.K = false;
            return;
        }
        this.L = true;
        this.f46530a.setText(((ps) this.H.get(i7)).f50971c);
        this.L = false;
    }

    public final void p() {
        boolean z10;
        boolean z11;
        de0 de0Var;
        boolean z12;
        ps psVar;
        if (!this.U && this.f46542h0.G == 0) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f26931b.getSystemService("phone");
                if (org.telegram.messenger.g0.N1()) {
                    int i7 = Build.VERSION.SDK_INT;
                    if (this.f46542h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i7 >= 26 && this.f46542h0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z11 = false;
                        de0Var = this.f46542h0;
                        if (!de0Var.f46957x && (!z10 || !z11)) {
                            de0Var.f46950s.clear();
                            if (!z10) {
                                this.f46542h0.f46950s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i7 >= 26) {
                                this.f46542h0.f46950s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (!this.f46542h0.f46950s.isEmpty()) {
                                new h60(28, this, new ArrayList(this.f46542h0.f46950s)).run();
                                return;
                            }
                            return;
                        }
                        this.U = true;
                        if (de0Var.f46959y && z10 && z11) {
                            this.f46530a.setAlpha(0.0f);
                            this.f46532b.setAlpha(0.0f);
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
                                                String string = org.telegram.messenger.np.g1().getString("phone_code_last_matched_" + substring, null);
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
                                                this.f46530a.setText(substring);
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
                                        this.f46530a.setText(d.substring(0, 1));
                                    }
                                }
                                if (str != null) {
                                    this.f46532b.requestFocus();
                                    this.f46532b.setText(str);
                                    ae0 ae0Var = this.f46532b;
                                    ae0Var.setSelection(ae0Var.length());
                                }
                            }
                            if (this.f46532b.length() > 0) {
                                AnimatorSet duration = new AnimatorSet().setDuration(300L);
                                ae0 ae0Var2 = this.f46530a;
                                Property property = View.ALPHA;
                                duration.playTogether(ObjectAnimator.ofFloat(ae0Var2, property, 1.0f), ObjectAnimator.ofFloat(this.f46532b, property, 1.0f));
                                duration.start();
                                this.O = true;
                                return;
                            }
                            this.f46530a.setAlpha(1.0f);
                            this.f46532b.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    de0Var = this.f46542h0;
                    if (!de0Var.f46957x) {
                    }
                    this.U = true;
                    if (de0Var.f46959y) {
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
        ae0 ae0Var = this.f46532b;
        if (ae0Var.getText() == null) {
            str = "";
        } else {
            str = ae0Var.getText().toString().replace(" ", "");
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
                int selectionStart = ae0Var.getSelectionStart();
                int selectionEnd = ae0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                ae0Var.setHintText(str3);
                ae0Var.setSelection(Math.max(0, Math.min(ae0Var.length(), selectionStart)), Math.max(0, Math.min(ae0Var.length(), selectionEnd)));
                this.T = i7;
            }
        } else if (this.T != -1) {
            int selectionStart2 = ae0Var.getSelectionStart();
            int selectionEnd2 = ae0Var.getSelectionEnd();
            ae0Var.setHintText((String) null);
            ae0Var.setSelection(selectionStart2, selectionEnd2);
            this.T = -1;
        }
    }

    public final void r() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (org.telegram.messenger.hd.E0().B != null) {
            country = org.telegram.messenger.hd.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.f46542h0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new wd0(this, 0), 10);
    }

    public final void s() {
        int i7;
        int i10;
        int i11;
        de0 de0Var = this.f46542h0;
        if (de0Var.G == 0 && !this.V && !this.f46531a0) {
            i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
            if (!u12.f25895l4) {
                if (!this.W) {
                    this.W = true;
                    i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    org.telegram.messenger.ls.f(i10).b(this, org.telegram.messenger.ls.J2);
                    i11 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i11).updateDcSettings();
                    return;
                }
                return;
            }
            this.V = true;
            boolean z10 = org.telegram.messenger.s2.f26737j;
            if (z10 && u12.f25903m4) {
                r3 r3Var = new r3(this, 13);
                if (!z10) {
                    r3Var.a(Collections.EMPTY_LIST);
                    return;
                }
                if (org.telegram.messenger.h9.f24415a == null) {
                    Object b10 = o9.g.c().b(db.a.class);
                    kotlin.jvm.internal.j.d(b10, "firebaseApp.get(Firebase…Verification::class.java)");
                    org.telegram.messenger.h9.f24415a = (db.a) b10;
                }
                db.n nVar = (db.n) org.telegram.messenger.h9.f24415a;
                nVar.getClass();
                db.n.f8290b.a("Getting Verification Support Info for all SIM slots", new Object[0]);
                db.q qVar = new db.q(hd.g.c(0, 1));
                db.d dVar = nVar.f8291a;
                org.telegram.messenger.d1 d1Var = db.d.f8278l;
                Log.i(d1Var.f23471b, d1Var.b("Requesting verification support info.", new Object[0]));
                com.google.android.gms.common.api.internal.t b11 = com.google.android.gms.common.api.internal.u.b();
                b11.d = new n6.c[]{db.j.f8285a};
                b11.f6386c = new a1.c(qVar, 21);
                b11.f6384a = 37303;
                Task e10 = dVar.e(0, b11.a());
                kotlin.jvm.internal.j.d(e10, "doRead(\n      TaskApiCal…Y)\n        .build()\n    )");
                Task continueWithTask = e10.continueWithTask(new a1.c(nVar, 22));
                kotlin.jvm.internal.j.d(continueWithTask, "fpnvClient.getVerificati…_SUPPORTED,\n      )\n    }");
                continueWithTask.addOnSuccessListener(new d3.b(1), new org.telegram.messenger.e9(r3Var)).addOnFailureListener(new d3.b(1), new org.telegram.messenger.e9(r3Var));
                return;
            }
            t(false);
        }
    }

    public final void t(final boolean z10) {
        boolean z11;
        final int i7;
        org.telegram.messenger.ok okVar;
        de0 de0Var = this.f46542h0;
        if (de0Var.G == 0 && Build.VERSION.SDK_INT >= 28 && (z11 = org.telegram.messenger.s2.f26736i) && !this.f46540f0) {
            if (z10 || !this.f46538e0) {
                this.f46540f0 = true;
                this.f46538e0 = true;
                final Context context = getContext();
                i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                final ud0 ud0Var = new ud0(this, 0);
                if (!z11) {
                    okVar = null;
                } else {
                    kotlin.jvm.internal.j.e(context, "context");
                    final androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(context, 4);
                    final boolean[] zArr = new boolean[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = org.telegram.messenger.s2.d;
                    initpasskeylogin.api_hash = org.telegram.messenger.s2.f26733e;
                    final Runnable[] runnableArr = {new org.telegram.messenger.f9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(initpasskeylogin, new d3.b(1), new org.telegram.messenger.r10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            kt.a(zArr, ud0Var, z10, nVar, context, i7, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), 3)};
                    okVar = new org.telegram.messenger.ok(zArr, runnableArr, 1);
                }
                this.f46541g0 = okVar;
            }
        }
    }

    public final void u(String str, ps psVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.hd.F0(psVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uy(4), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) psVar.f50969a);
        setCountryButtonText(org.telegram.messenger.j6.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.S = str;
        this.T = -1;
        q();
    }

    @Override
    public final void updateColors() {
        this.f46534c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false);
        org.telegram.ui.Components.m80 m80Var = this.f46543n;
        m80Var.setTextColor(x02);
        m80Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xc, false));
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.hz0 hz0Var = this.d;
            if (i7 >= hz0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) hz0Var.getChildAt(i7);
            textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
            i7++;
        }
        int i10 = org.telegram.ui.ActionBar.m6.H6;
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int i11 = this.f46546w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.f46545s;
        de0.u1(imageView, x03, i11, mode);
        this.f46546w = x03;
        int themedColor = this.f46542h0.getThemedColor(org.telegram.ui.ActionBar.m6.f29473i6);
        de0.v1(imageView, themedColor, this.f46547x);
        this.f46547x = themedColor;
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        ae0 ae0Var = this.f46530a;
        ae0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.m6.f29528l6;
        ae0Var.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i13, false));
        this.f46544r.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29510k6, false));
        int x05 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
        ae0 ae0Var2 = this.f46532b;
        ae0Var2.setTextColor(x05);
        ae0Var2.setHintTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        ae0Var2.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i13, false));
        org.telegram.ui.Cells.d2 d2Var = this.f46548y;
        if (d2Var != null) {
            int i14 = org.telegram.ui.ActionBar.m6.Y6;
            int i15 = org.telegram.ui.ActionBar.m6.W6;
            int i16 = org.telegram.ui.ActionBar.m6.X6;
            CheckBoxSquare checkBoxSquare = d2Var.f30561n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f32890s = i14;
                checkBoxSquare.f32891w = i15;
                checkBoxSquare.f32892x = i16;
                checkBoxSquare.invalidate();
            }
            d2Var.g();
        }
        org.telegram.ui.Cells.d2 d2Var2 = this.E;
        if (d2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.m6.Y6;
            int i18 = org.telegram.ui.ActionBar.m6.W6;
            int i19 = org.telegram.ui.ActionBar.m6.X6;
            CheckBoxSquare checkBoxSquare2 = d2Var2.f30561n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f32890s = i17;
                checkBoxSquare2.f32891w = i18;
                checkBoxSquare2.f32892x = i19;
                checkBoxSquare2.invalidate();
            }
            d2Var2.g();
        }
        this.f46539f.f();
        this.f46537e.f();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

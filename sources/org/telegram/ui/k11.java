package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k11 extends org.telegram.ui.ActionBar.o2 {
    public float A;
    public float[] B;
    public boolean C;
    public ValueAnimator D;
    public ClipboardManager E;
    public final boolean F;
    public SharedConfig.ProxyInfo G;
    public boolean H;
    public ClipboardManager.OnPrimaryClipChangedListener I;
    public EditTextBoldCursor[] f39665a;
    public h11 f39666b;
    public g11 f39667c;
    public LinearLayout d;
    public org.telegram.ui.Cells.z6[] f39668e;
    public org.telegram.ui.Cells.b9[] f39669f;
    public org.telegram.ui.Cells.ba h;
    public org.telegram.ui.Cells.ba f39670n;
    public org.telegram.ui.ActionBar.w0 f39671r;
    public org.telegram.ui.Cells.j6[] f39672s;
    public int v;
    public int f39673w;
    public String f39674x;
    public String[] f39675y;

    public k11() {
        super(null);
        this.f39668e = new org.telegram.ui.Cells.z6[3];
        this.f39669f = new org.telegram.ui.Cells.b9[2];
        this.f39672s = new org.telegram.ui.Cells.j6[2];
        this.v = -1;
        this.f39673w = -1;
        this.A = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new d11(this);
        this.G = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.F = true;
    }

    public final void T(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i9;
        if (this.h != null && this.f39671r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f39665a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (editTextBoldCursor.length() != 0 && Utilities.parseInt((CharSequence) this.f39665a[1].getText().toString()).intValue() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.C != z11) {
                ValueAnimator valueAnimator = this.D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.D = ofFloat;
                    ofFloat.setDuration(200L);
                    this.D.addUpdateListener(new v01(this, 1));
                }
                float f10 = 0.0f;
                float f11 = 1.0f;
                if (z10) {
                    float[] fArr = this.B;
                    fArr[0] = this.A;
                    if (z11) {
                        f10 = 1.0f;
                    }
                    fArr[1] = f10;
                    this.D.start();
                } else {
                    if (z11) {
                        f10 = 1.0f;
                    }
                    this.A = f10;
                    org.telegram.ui.Cells.ba baVar = this.h;
                    if (z11) {
                        i9 = org.telegram.ui.ActionBar.f6.f23229q6;
                    } else {
                        i9 = org.telegram.ui.ActionBar.f6.f23386z6;
                    }
                    baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                    org.telegram.ui.ActionBar.w0 w0Var = this.f39671r;
                    if (!z11) {
                        f11 = 0.5f;
                    }
                    w0Var.setAlpha(f11);
                }
                this.h.setEnabled(z11);
                this.f39671r.setEnabled(z11);
                this.C = z11;
            }
        }
    }

    public final void U(int i9, boolean z10, ky0 ky0Var) {
        boolean z11;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f39672s;
        org.telegram.ui.Cells.b9[] b9VarArr = this.f39669f;
        if (this.v != i9) {
            this.v = i9;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f39667c);
            }
            boolean z12 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f28844f).setDuration(250L);
                if (ky0Var != null) {
                    duration.addListener((Transition.TransitionListener) new j11(ky0Var));
                }
                TransitionManager.beginDelayedTransition(this.f39667c, duration);
            }
            int i10 = this.v;
            if (i10 == 0) {
                b9VarArr[0].setVisibility(0);
                b9VarArr[1].setVisibility(8);
                ((View) this.f39665a[4].getParent()).setVisibility(8);
                ((View) this.f39665a[3].getParent()).setVisibility(0);
                ((View) this.f39665a[2].getParent()).setVisibility(0);
            } else if (i10 == 1) {
                b9VarArr[0].setVisibility(8);
                b9VarArr[1].setVisibility(0);
                ((View) this.f39665a[4].getParent()).setVisibility(0);
                ((View) this.f39665a[3].getParent()).setVisibility(8);
                ((View) this.f39665a[2].getParent()).setVisibility(8);
            }
            org.telegram.ui.Cells.j6 j6Var = j6VarArr[0];
            if (this.v == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var.a(z11, z10);
            org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[1];
            if (this.v != 1) {
                z12 = false;
            }
            j6Var2.a(z12, z10);
        }
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k11.V():void");
    }

    @Override
    public final View createView(Context context) {
        int i9;
        float f10;
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.b9[] b9VarArr = this.f39669f;
        SharedConfig.ProxyInfo proxyInfo = this.G;
        org.telegram.ui.Cells.z6[] z6VarArr = this.f39668e;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f39672s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new f11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f39671r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        this.f39667c = new gh.m(context);
        ?? in0Var = new org.telegram.ui.Components.in0(context, this.f39667c, this.resourceProvider, true);
        this.f39666b = in0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.in0) in0Var);
        this.f39666b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f39666b, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23269s8, false));
        int i10 = -1;
        frameLayout.addView(this.f39666b, g7.e6.c(-1.0f, -1));
        this.f39667c.setOrientation(1);
        this.f39666b.addView(this.f39667c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final k11 f37789b;

            {
                this.f37789b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37789b.U(((Integer) view.getTag()).intValue(), true, null);
                        return;
                    default:
                        k11 k11Var = this.f37789b;
                        if (k11Var.f39673w != -1) {
                            int i11 = 0;
                            while (true) {
                                String[] strArr = k11Var.f39675y;
                                if (i11 < strArr.length) {
                                    int i12 = k11Var.f39673w;
                                    if ((i12 != 0 || i11 != 4) && (i12 != 1 || (i11 != 2 && i11 != 3))) {
                                        String str = strArr[i11];
                                        if (str != null) {
                                            try {
                                                k11Var.f39665a[i11].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                k11Var.f39665a[i11].setText(k11Var.f39675y[i11]);
                                            }
                                        } else {
                                            k11Var.f39665a[i11].setText((CharSequence) null);
                                        }
                                    }
                                    i11++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = k11Var.f39665a[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    k11Var.U(k11Var.f39673w, true, new ky0(k11Var, 8));
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                        break;
                }
            }
        };
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            j6VarArr[i11] = j6Var;
            j6Var.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
            j6VarArr[i11].setTag(Integer.valueOf(i11));
            if (i11 == 0) {
                org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[i11];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (i11 == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var2.c(string, z11, true);
            } else {
                org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[i11];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (i11 == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var3.c(string2, z10, false);
            }
            this.f39667c.addView(j6VarArr[i11], g7.e6.n(-1, 50));
            j6VarArr[i11].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        z6VarArr[0] = z6Var;
        this.f39667c.addView(z6Var, g7.e6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f39667c.addView(this.d, g7.e6.n(-1, -2));
        int i12 = 5;
        this.f39665a = new EditTextBoldCursor[5];
        int i13 = 0;
        while (i13 < i12) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, g7.e6.n(i10, 64));
            this.f39665a[i13] = new EditTextBoldCursor(context);
            this.f39665a[i13].setTag(Integer.valueOf(i13));
            this.f39665a[i13].setTextSize(1, 16.0f);
            this.f39665a[i13].setHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f39665a[i13];
            int i14 = org.telegram.ui.ActionBar.f6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            this.f39665a[i13].setBackground(null);
            this.f39665a[i13].setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            this.f39665a[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f39665a[i13].setCursorWidth(1.5f);
            this.f39665a[i13].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f39665a[i13];
            if (LocaleController.isRTL) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            editTextBoldCursor2.setGravity(i9 | 16);
            this.f39665a[i13].setHeaderHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
            this.f39665a[i13].setTransformHintToHeader(true);
            this.f39665a[i13].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23127k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
            if (i13 == 0) {
                this.f39665a[i13].setInputType(524305);
                this.f39665a[i13].addTextChangedListener(new i11(this, 0));
            } else if (i13 == 1) {
                this.f39665a[i13].setInputType(2);
                this.f39665a[i13].addTextChangedListener(new i11(this, 1));
            } else if (i13 == 3) {
                this.f39665a[i13].setInputType(129);
                this.f39665a[i13].setTypeface(Typeface.DEFAULT);
                this.f39665a[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f39665a[i13].setInputType(524289);
            }
            this.f39665a[i13].setImeOptions(268435461);
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                this.f39665a[i13].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f39665a[i13].setText(proxyInfo.secret);
                            }
                        } else {
                            this.f39665a[i13].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f39665a[i13].setText(proxyInfo.password);
                        }
                    } else {
                        this.f39665a[i13].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f39665a[i13].setText(proxyInfo.username);
                    }
                } else {
                    this.f39665a[i13].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    EditTextBoldCursor editTextBoldCursor3 = this.f39665a[i13];
                    editTextBoldCursor3.setText("" + proxyInfo.port);
                }
            } else {
                this.f39665a[i13].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f39665a[i13].setText(proxyInfo.address);
            }
            EditTextBoldCursor editTextBoldCursor4 = this.f39665a[i13];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            this.f39665a[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor5 = this.f39665a[i13];
            if (i13 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor5, g7.e6.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f39665a[i13].setOnEditorActionListener(new ea(this, 10));
            i13++;
            i12 = 5;
            i10 = -1;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9VarArr[i15] = b9Var;
            if (i15 == 0) {
                b9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                b9Var.setText(sb2.toString());
                b9VarArr[i15].setVisibility(8);
            }
            this.f39667c.addView(b9VarArr[i15], g7.e6.n(-1, -2));
        }
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(this.fragmentView.getContext());
        this.f39670n = baVar;
        baVar.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
        this.f39670n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ba baVar2 = this.f39670n;
        int i16 = org.telegram.ui.ActionBar.f6.f23229q6;
        baVar2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.f39670n.setOnClickListener(new View.OnClickListener(this) {
            public final k11 f37789b;

            {
                this.f37789b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37789b.U(((Integer) view.getTag()).intValue(), true, null);
                        return;
                    default:
                        k11 k11Var = this.f37789b;
                        if (k11Var.f39673w != -1) {
                            int i112 = 0;
                            while (true) {
                                String[] strArr = k11Var.f39675y;
                                if (i112 < strArr.length) {
                                    int i122 = k11Var.f39673w;
                                    if ((i122 != 0 || i112 != 4) && (i122 != 1 || (i112 != 2 && i112 != 3))) {
                                        String str = strArr[i112];
                                        if (str != null) {
                                            try {
                                                k11Var.f39665a[i112].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                k11Var.f39665a[i112].setText(k11Var.f39675y[i112]);
                                            }
                                        } else {
                                            k11Var.f39665a[i112].setText((CharSequence) null);
                                        }
                                    }
                                    i112++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor6 = k11Var.f39665a[0];
                                    editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                                    k11Var.U(k11Var.f39673w, true, new ky0(k11Var, 8));
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                        break;
                }
            }
        });
        this.f39667c.addView(this.f39670n, 0, g7.e6.n(-1, -2));
        this.f39670n.setVisibility(8);
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(this.fragmentView.getContext(), (org.telegram.ui.Cells.j2) null);
        z6VarArr[2] = z6Var2;
        this.f39667c.addView(z6Var2, 1, g7.e6.n(-1, -2));
        z6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ba baVar3 = new org.telegram.ui.Cells.ba(context);
        this.h = baVar3;
        baVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        this.f39667c.addView(this.h, g7.e6.n(-1, -2));
        this.h.setOnClickListener(new v80(18, this, context));
        org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        z6VarArr[1] = z6Var3;
        this.f39667c.addView(z6Var3, g7.e6.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.A = 1.0f;
        T(false);
        this.v = -1;
        U(!TextUtils.isEmpty(proxyInfo.secret) ? 1 : 0, false, null);
        this.f39673w = -1;
        this.f39674x = null;
        V();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.b9[] b9VarArr = this.f39669f;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f39672s;
        sx0 sx0Var = new sx0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39666b, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        LinearLayout linearLayout = this.d;
        int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39667c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 268435456, null, null, null, null, i10));
        org.telegram.ui.Cells.ba baVar = this.h;
        int i11 = org.telegram.ui.ActionBar.f6.f23092i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(baVar, 268435456, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.f23229q6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39670n, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39670n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39670n, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        for (int i13 = 0; i13 < j6VarArr.length; i13++) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23056g7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23074h7));
        }
        if (this.f39665a != null) {
            int i14 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f39665a;
                if (i14 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i14];
                int i15 = org.telegram.ui.ActionBar.f6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 4, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39665a[i14], 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39665a[i14], 8390656, null, null, null, null, org.telegram.ui.ActionBar.f6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39665a[i14], 16777216, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.f23127k6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.f23144l6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.f23212p7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.f39668e;
            if (i16 >= z6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.z6 z6Var = z6VarArr[i16];
            if (z6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(z6Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
            }
            i16++;
        }
        for (int i17 = 0; i17 < b9VarArr.length; i17++) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        }
        return arrayList;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.E.removePrimaryClipChangedListener(this.I);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.E.addPrimaryClipChangedListener(this.I);
        V();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.F) {
            this.f39665a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f39665a[0]);
        }
    }
}

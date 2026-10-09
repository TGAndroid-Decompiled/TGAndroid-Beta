package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
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
public final class n21 extends org.telegram.ui.ActionBar.n2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public EditTextBoldCursor[] f40052a;
    public k21 f40053b;
    public j21 f40054c;
    public LinearLayout d;
    public org.telegram.ui.Cells.b7[] f40055e;
    public org.telegram.ui.Cells.e9[] f40056f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.ca f40057n;
    public org.telegram.ui.ActionBar.v0 f40058r;
    public org.telegram.ui.Cells.k6[] f40059s;
    public int v;
    public oi.b f40060w;
    public String f40061x;
    public float f40062y;

    public n21() {
        super(null);
        this.f40055e = new org.telegram.ui.Cells.b7[3];
        this.f40056f = new org.telegram.ui.Cells.e9[2];
        this.f40059s = new org.telegram.ui.Cells.k6[3];
        this.f40062y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new g21(this);
        this.J = new SharedConfig.ProxyInfo(oi.b.f17160i);
        this.I = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f40058r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f40052a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f40052a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(oi.k.j(editTextBoldCursor.getText().toString())) || oi.k.d(this.f40052a[4].getText().toString()) == null)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.F != z11) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.G = ofFloat;
                    ofFloat.setDuration(200L);
                    this.G.addUpdateListener(new y11(this, 1));
                }
                float f7 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f40062y;
                    if (z11) {
                        f7 = 1.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    this.f40062y = f7;
                    org.telegram.ui.Cells.ca caVar = this.h;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.i6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f21199z6;
                    }
                    caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
                    org.telegram.ui.ActionBar.v0 v0Var = this.f40058r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    v0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f40058r.setEnabled(z11);
                this.F = z11;
            }
        }
    }

    public final void V(int i10, boolean z10, org.telegram.ui.Components.nd ndVar) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f40059s;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f40056f;
        if (this.v != i10) {
            this.v = i10;
            TransitionManager.endTransitions(this.f40054c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.hs.f27118f).setDuration(250L);
                if (ndVar != null) {
                    duration.addListener((Transition.TransitionListener) new m21(ndVar));
                }
                TransitionManager.beginDelayedTransition(this.f40054c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                e9VarArr[0].setVisibility(0);
                e9VarArr[1].setVisibility(8);
                ((View) this.f40052a[4].getParent()).setVisibility(8);
                ((View) this.f40052a[3].getParent()).setVisibility(0);
                ((View) this.f40052a[2].getParent()).setVisibility(0);
                ((View) this.f40052a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.e9 e9Var = e9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                ((View) this.f40052a[4].getParent()).setVisibility(0);
                ((View) this.f40052a[3].getParent()).setVisibility(8);
                ((View) this.f40052a[2].getParent()).setVisibility(8);
                ((View) this.f40052a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                e9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f40052a[4].getParent()).setVisibility(0);
                ((View) this.f40052a[3].getParent()).setVisibility(8);
                ((View) this.f40052a[2].getParent()).setVisibility(8);
                ((View) this.f40052a[1].getParent()).setVisibility(8);
                this.f40052a[1].setText("443");
            }
            org.telegram.ui.Cells.ca caVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            caVar.setVisibility(i12);
            org.telegram.ui.Cells.k6 k6Var = k6VarArr[0];
            if (this.v == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            k6Var.a(z11, z10);
            org.telegram.ui.Cells.k6 k6Var2 = k6VarArr[1];
            if (this.v == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            k6Var2.a(z12, z10);
            org.telegram.ui.Cells.k6 k6Var3 = k6VarArr[2];
            if (this.v != 3) {
                z13 = false;
            }
            k6Var3.a(z13, z10);
            U(z10);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n21.W():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f40056f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.b7[] b7VarArr = this.f40055e;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f40059s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new i21(this));
        org.telegram.ui.ActionBar.v0 g10 = this.actionBar.o().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f40058r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        this.f40054c = new yd(context);
        ?? ep0Var = new org.telegram.ui.Components.ep0(context, this.f40054c, this.resourceProvider, true);
        this.f40053b = ep0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.ep0) ep0Var);
        this.f40053b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f40053b, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21075s8, false));
        int i11 = -1;
        frameLayout.addView(this.f40053b, w7.x5.d(-1.0f, -1));
        this.f40054c.setOrientation(1);
        this.f40053b.addView(this.f40054c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final n21 f38205b;

            {
                this.f38205b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f38205b.V(oi.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        n21 n21Var = this.f38205b;
                        oi.b bVar = n21Var.f40060w;
                        if (bVar != null) {
                            int i12 = bVar.f17161a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = n21Var.f40052a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = n21Var.f40060w.f17162b;
                                        } else if (i13 == 1) {
                                            int i14 = n21Var.f40060w.f17163c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = n21Var.f40060w.d;
                                        } else if (i13 == 3) {
                                            str = n21Var.f40060w.f17164e;
                                        } else {
                                            if (i13 == 4) {
                                                str = n21Var.f40060w.f17165f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                n21Var.f40052a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                n21Var.f40052a[i13].setText(str);
                                            }
                                        } else {
                                            n21Var.f40052a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    n21Var.V(i12, true, new org.telegram.ui.Components.nd(n21Var, i12, 25));
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
        for (int i12 = 0; i12 < 3; i12++) {
            int e7 = oi.b.e(i12);
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
            k6VarArr[i12] = k6Var;
            k6Var.setBackground(org.telegram.ui.ActionBar.i6.L0(true));
            k6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.k6 k6Var2 = k6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (e7 == this.v) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k6Var2.c(string, z12, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.k6 k6Var3 = k6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (e7 == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k6Var3.c(string2, z11, true);
            } else {
                org.telegram.ui.Cells.k6 k6Var4 = k6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (e7 == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k6Var4.c(string3, z10, false);
            }
            this.f40054c.addView(k6VarArr[i12], w7.x5.n(-1, 50));
            k6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        b7VarArr[0] = b7Var;
        this.f40054c.addView(b7Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f40054c.addView(this.d, w7.x5.n(-1, -2));
        int i13 = 5;
        this.f40052a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.x5.n(i11, 64));
            this.f40052a[i14] = new EditTextBoldCursor(context);
            this.f40052a[i14].setTag(Integer.valueOf(i14));
            this.f40052a[i14].setTextSize(1, 16.0f);
            this.f40052a[i14].setHintColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f40052a[i14];
            int i15 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
            this.f40052a[i14].setBackground(null);
            this.f40052a[i14].setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
            this.f40052a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f40052a[i14].setCursorWidth(1.5f);
            this.f40052a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f40052a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f40052a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L6, false));
            this.f40052a[i14].setTransformHintToHeader(true);
            this.f40052a[i14].setLineColors(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20925k6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20943l6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21018p7, false));
            if (i14 == 0) {
                this.f40052a[i14].setInputType(524305);
                this.f40052a[i14].addTextChangedListener(new l21(this, 0));
            } else if (i14 == 1) {
                this.f40052a[i14].setInputType(2);
                this.f40052a[i14].addTextChangedListener(new l21(this, 1));
            } else if (i14 == 3) {
                this.f40052a[i14].setInputType(129);
                this.f40052a[i14].setTypeface(Typeface.DEFAULT);
                this.f40052a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f40052a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f40052a[i14].addTextChangedListener(new l21(this, 2));
            }
            this.f40052a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f40052a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f40052a[i14].setText(proxyInfo.settings.f17165f);
                            }
                        } else {
                            this.f40052a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f40052a[i14].setText(proxyInfo.settings.f17164e);
                        }
                    } else {
                        this.f40052a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f40052a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f40052a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f40052a[i14].setText(Integer.toString(proxyInfo.settings.f17163c));
                }
            } else {
                this.f40052a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f40052a[i14].setText(proxyInfo.settings.f17162b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f40052a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f40052a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f40052a[i14];
            if (i14 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.x5.a(-1.0f, 17.0f, f7, 17.0f, 0.0f, -1, 51));
            this.f40052a[i14].setOnEditorActionListener(new ja(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9VarArr[i16] = e9Var;
            if (i16 == 0) {
                e9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                e9VarArr[i16].setVisibility(8);
            }
            this.f40054c.addView(e9VarArr[i16], w7.x5.n(-1, -2));
        }
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(this.fragmentView.getContext());
        this.f40057n = caVar;
        caVar.setBackground(org.telegram.ui.ActionBar.i6.L0(true));
        this.f40057n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ca caVar2 = this.f40057n;
        int i17 = org.telegram.ui.ActionBar.i6.q6;
        caVar2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i17, false));
        this.f40057n.setOnClickListener(new View.OnClickListener(this) {
            public final n21 f38205b;

            {
                this.f38205b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f38205b.V(oi.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        n21 n21Var = this.f38205b;
                        oi.b bVar = n21Var.f40060w;
                        if (bVar != null) {
                            int i122 = bVar.f17161a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = n21Var.f40052a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = n21Var.f40060w.f17162b;
                                        } else if (i132 == 1) {
                                            int i142 = n21Var.f40060w.f17163c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = n21Var.f40060w.d;
                                        } else if (i132 == 3) {
                                            str = n21Var.f40060w.f17164e;
                                        } else {
                                            if (i132 == 4) {
                                                str = n21Var.f40060w.f17165f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                n21Var.f40052a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                n21Var.f40052a[i132].setText(str);
                                            }
                                        } else {
                                            n21Var.f40052a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    n21Var.V(i122, true, new org.telegram.ui.Components.nd(n21Var, i122, 25));
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
        this.f40054c.addView(this.f40057n, 0, w7.x5.n(-1, -2));
        this.f40057n.setVisibility(8);
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(this.fragmentView.getContext(), (org.telegram.ui.Cells.c1) null);
        b7VarArr[2] = b7Var2;
        this.f40054c.addView(b7Var2, 1, w7.x5.n(-1, -2));
        b7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ca caVar3 = new org.telegram.ui.Cells.ca(context);
        this.h = caVar3;
        caVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i17, false));
        this.f40054c.addView(this.h, w7.x5.n(-1, -2));
        this.h.setOnClickListener(new vy0(1, this, context));
        org.telegram.ui.Cells.b7 b7Var3 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        b7VarArr[1] = b7Var3;
        this.f40054c.addView(b7Var3, w7.x5.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f40062y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f17161a, false, null);
        this.f40060w = null;
        this.f40061x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.e9[] e9VarArr = this.f40056f;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f40059s;
        wy0 wy0Var = new wy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21075s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40053b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.i6.f20797d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40054c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.ca caVar = this.h;
        int i12 = org.telegram.ui.ActionBar.i6.f20888i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(caVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f21199z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40057n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40057n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40057n, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < k6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20854g7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20870h7));
        }
        if (this.f40052a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f40052a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.i6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40052a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40052a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.i6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40052a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.f20925k6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.f20943l6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.f21018p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.b7[] b7VarArr = this.f40055e;
            if (i17 >= b7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.b7 b7Var = b7VarArr[i17];
            if (b7Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(b7Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20761b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < e9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20761b7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        }
        return arrayList;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.H.removePrimaryClipChangedListener(this.L);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.H.addPrimaryClipChangedListener(this.L);
        W();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.f40052a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f40052a[0]);
        }
    }
}

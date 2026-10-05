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
public final class h21 extends org.telegram.ui.ActionBar.n2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public EditTextBoldCursor[] f36865a;
    public e21 f36866b;
    public d21 f36867c;
    public LinearLayout d;
    public org.telegram.ui.Cells.b7[] f36868e;
    public org.telegram.ui.Cells.e9[] f36869f;
    public org.telegram.ui.Cells.ea h;
    public org.telegram.ui.Cells.ea f36870n;
    public org.telegram.ui.ActionBar.v0 f36871r;
    public org.telegram.ui.Cells.k6[] f36872s;
    public int v;
    public qi.b f36873w;
    public String f36874x;
    public float f36875y;

    public h21() {
        super(null);
        this.f36868e = new org.telegram.ui.Cells.b7[3];
        this.f36869f = new org.telegram.ui.Cells.e9[2];
        this.f36872s = new org.telegram.ui.Cells.k6[3];
        this.f36875y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new z11(this);
        this.J = new SharedConfig.ProxyInfo(qi.b.f45526i);
        this.I = true;
    }

    public final void S(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f36871r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f36865a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f36865a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(qi.j.j(editTextBoldCursor.getText().toString())) || qi.j.d(this.f36865a[4].getText().toString()) == null)) {
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
                    this.G.addUpdateListener(new b21(this, 0));
                }
                float f7 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f36875y;
                    if (z11) {
                        f7 = 1.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    this.f36875y = f7;
                    org.telegram.ui.Cells.ea eaVar = this.h;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.i6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f21233z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                    org.telegram.ui.ActionBar.v0 v0Var = this.f36871r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    v0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f36871r.setEnabled(z11);
                this.F = z11;
            }
        }
    }

    public final void T(int i10, boolean z10, org.telegram.ui.Components.ld ldVar) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f36872s;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f36869f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f36867c);
            }
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.tr.f31215f).setDuration(250L);
                if (ldVar != null) {
                    duration.addListener((Transition.TransitionListener) new g21(ldVar));
                }
                TransitionManager.beginDelayedTransition(this.f36867c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                e9VarArr[0].setVisibility(0);
                e9VarArr[1].setVisibility(8);
                ((View) this.f36865a[4].getParent()).setVisibility(8);
                ((View) this.f36865a[3].getParent()).setVisibility(0);
                ((View) this.f36865a[2].getParent()).setVisibility(0);
                ((View) this.f36865a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.e9 e9Var = e9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                ((View) this.f36865a[4].getParent()).setVisibility(0);
                ((View) this.f36865a[3].getParent()).setVisibility(8);
                ((View) this.f36865a[2].getParent()).setVisibility(8);
                ((View) this.f36865a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                e9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f36865a[4].getParent()).setVisibility(0);
                ((View) this.f36865a[3].getParent()).setVisibility(8);
                ((View) this.f36865a[2].getParent()).setVisibility(8);
                ((View) this.f36865a[1].getParent()).setVisibility(8);
                this.f36865a[1].setText("443");
            }
            org.telegram.ui.Cells.ea eaVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            eaVar.setVisibility(i12);
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
            S(z10);
        }
    }

    public final void U() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h21.U():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f36869f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.b7[] b7VarArr = this.f36868e;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f36872s;
        setHasOwnBackground(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new c21(this));
        org.telegram.ui.ActionBar.v0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f36871r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f36867c = new org.telegram.ui.Components.ro0(context);
        ?? so0Var = new org.telegram.ui.Components.so0(context, this.f36867c, this.resourceProvider, true);
        this.f36866b = so0Var;
        so0Var.setDrawBackground(true);
        this.f36866b.setFillViewport(true);
        this.f36866b.setOverScrollMode(0);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f36866b, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21109s8, false));
        int i11 = -1;
        frameLayout.addView(this.f36866b, w7.z5.c(-1.0f, -1));
        this.f36867c.setOrientation(1);
        this.f36866b.addView(this.f36867c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final h21 f34662b;

            {
                this.f34662b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f34662b.T(qi.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        h21 h21Var = this.f34662b;
                        qi.b bVar = h21Var.f36873w;
                        if (bVar != null) {
                            int i12 = bVar.f45527a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f36865a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = h21Var.f36873w.f45528b;
                                        } else if (i13 == 1) {
                                            int i14 = h21Var.f36873w.f45529c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = h21Var.f36873w.d;
                                        } else if (i13 == 3) {
                                            str = h21Var.f36873w.f45530e;
                                        } else {
                                            if (i13 == 4) {
                                                str = h21Var.f36873w.f45531f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                h21Var.f36865a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                h21Var.f36865a[i13].setText(str);
                                            }
                                        } else {
                                            h21Var.f36865a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    h21Var.T(i12, true, new org.telegram.ui.Components.ld(h21Var, i12, 24));
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
            int e7 = qi.b.e(i12);
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
            k6VarArr[i12] = k6Var;
            k6Var.setBackground(org.telegram.ui.ActionBar.i6.K0(true));
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
            this.f36867c.addView(k6VarArr[i12], w7.z5.n(-1, 50));
            k6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        b7VarArr[0] = b7Var;
        this.f36867c.addView(b7Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f36867c.addView(this.d, w7.z5.n(-1, -2));
        int i13 = 5;
        this.f36865a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.z5.n(i11, 64));
            this.f36865a[i14] = new EditTextBoldCursor(context);
            this.f36865a[i14].setTag(Integer.valueOf(i14));
            this.f36865a[i14].setTextSize(1, 16.0f);
            this.f36865a[i14].setHintColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f36865a[i14];
            int i15 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
            this.f36865a[i14].setBackground(null);
            this.f36865a[i14].setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
            this.f36865a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f36865a[i14].setCursorWidth(1.5f);
            this.f36865a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f36865a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f36865a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L6, false));
            this.f36865a[i14].setTransformHintToHeader(true);
            this.f36865a[i14].setLineColors(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20956k6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20974l6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21049p7, false));
            if (i14 == 0) {
                this.f36865a[i14].setInputType(524305);
                this.f36865a[i14].addTextChangedListener(new f21(this, 0));
            } else if (i14 == 1) {
                this.f36865a[i14].setInputType(2);
                this.f36865a[i14].addTextChangedListener(new f21(this, 1));
            } else if (i14 == 3) {
                this.f36865a[i14].setInputType(129);
                this.f36865a[i14].setTypeface(Typeface.DEFAULT);
                this.f36865a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f36865a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f36865a[i14].addTextChangedListener(new f21(this, 2));
            }
            this.f36865a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f36865a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f36865a[i14].setText(proxyInfo.settings.f45531f);
                            }
                        } else {
                            this.f36865a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f36865a[i14].setText(proxyInfo.settings.f45530e);
                        }
                    } else {
                        this.f36865a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f36865a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f36865a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f36865a[i14].setText(Integer.toString(proxyInfo.settings.f45529c));
                }
            } else {
                this.f36865a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f36865a[i14].setText(proxyInfo.settings.f45528b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f36865a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f36865a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f36865a[i14];
            if (i14 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.z5.d(-1, -1.0f, 51, 17.0f, f7, 17.0f, 0.0f));
            this.f36865a[i14].setOnEditorActionListener(new ka(this, 10));
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
                org.telegram.ui.Cells.c1.n(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                e9VarArr[i16].setVisibility(8);
            }
            this.f36867c.addView(e9VarArr[i16], w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(this.fragmentView.getContext());
        this.f36870n = eaVar;
        eaVar.setBackground(org.telegram.ui.ActionBar.i6.K0(true));
        this.f36870n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ea eaVar2 = this.f36870n;
        int i17 = org.telegram.ui.ActionBar.i6.q6;
        eaVar2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
        this.f36870n.setOnClickListener(new View.OnClickListener(this) {
            public final h21 f34662b;

            {
                this.f34662b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f34662b.T(qi.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        h21 h21Var = this.f34662b;
                        qi.b bVar = h21Var.f36873w;
                        if (bVar != null) {
                            int i122 = bVar.f45527a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f36865a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = h21Var.f36873w.f45528b;
                                        } else if (i132 == 1) {
                                            int i142 = h21Var.f36873w.f45529c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = h21Var.f36873w.d;
                                        } else if (i132 == 3) {
                                            str = h21Var.f36873w.f45530e;
                                        } else {
                                            if (i132 == 4) {
                                                str = h21Var.f36873w.f45531f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                h21Var.f36865a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                h21Var.f36865a[i132].setText(str);
                                            }
                                        } else {
                                            h21Var.f36865a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    h21Var.T(i122, true, new org.telegram.ui.Components.ld(h21Var, i122, 24));
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
        this.f36867c.addView(this.f36870n, 0, w7.z5.n(-1, -2));
        this.f36870n.setVisibility(8);
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(this.fragmentView.getContext(), (org.telegram.ui.Cells.c1) null);
        b7VarArr[2] = b7Var2;
        this.f36867c.addView(b7Var2, 1, w7.z5.n(-1, -2));
        b7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ea eaVar3 = new org.telegram.ui.Cells.ea(context);
        this.h = eaVar3;
        eaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
        this.f36867c.addView(this.h, w7.z5.n(-1, -2));
        this.h.setOnClickListener(new py0(1, this, context));
        org.telegram.ui.Cells.b7 b7Var3 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        b7VarArr[1] = b7Var3;
        this.f36867c.addView(b7Var3, w7.z5.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f36875y = 1.0f;
        S(false);
        this.v = 0;
        T(proxyInfo.settings.f45527a, false, null);
        this.f36873w = null;
        this.f36874x = null;
        U();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.so0 getScrollViewForSimpleGlass() {
        return this.f36866b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.e9[] e9VarArr = this.f36869f;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f36872s;
        qy0 qy0Var = new qy0(2, this);
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21109s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36866b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.i6.f20827d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36867c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.ea eaVar = this.h;
        int i12 = org.telegram.ui.ActionBar.i6.f20918i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(eaVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f21233z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36870n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36870n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36870n, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < k6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20883g7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(k6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20901h7));
        }
        if (this.f36865a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f36865a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.i6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36865a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36865a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.i6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36865a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.f20956k6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.f20974l6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.f21049p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20827d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.b7[] b7VarArr = this.f36868e;
            if (i17 >= b7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.b7 b7Var = b7VarArr[i17];
            if (b7Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(b7Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20791b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < e9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20791b7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(e9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
        U();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.f36865a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f36865a[0]);
        }
    }
}

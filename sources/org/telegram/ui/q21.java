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
public final class q21 extends org.telegram.ui.ActionBar.n2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public EditTextBoldCursor[] f39708a;
    public n21 f39709b;
    public m21 f39710c;
    public LinearLayout d;
    public org.telegram.ui.Cells.a7[] f39711e;
    public org.telegram.ui.Cells.e9[] f39712f;
    public org.telegram.ui.Cells.ea h;
    public org.telegram.ui.Cells.ea f39713n;
    public org.telegram.ui.ActionBar.v0 f39714r;
    public org.telegram.ui.Cells.j6[] f39715s;
    public int v;
    public fg.b f39716w;
    public String f39717x;
    public float f39718y;

    public q21() {
        super(null);
        this.f39711e = new org.telegram.ui.Cells.a7[3];
        this.f39712f = new org.telegram.ui.Cells.e9[2];
        this.f39715s = new org.telegram.ui.Cells.j6[3];
        this.f39718y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new j21(this);
        this.J = new SharedConfig.ProxyInfo(fg.b.f9505g);
        this.I = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f39714r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f39708a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f39708a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(fg.k.i(editTextBoldCursor.getText().toString())) || fg.k.d(this.f39708a[4].getText().toString()) == null)) {
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
                    this.G.addUpdateListener(new b21(this, 1));
                }
                float f7 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f39718y;
                    if (z11) {
                        f7 = 1.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    this.f39718y = f7;
                    org.telegram.ui.Cells.ea eaVar = this.h;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.j6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f21088z6;
                    }
                    eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    org.telegram.ui.ActionBar.v0 v0Var = this.f39714r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    v0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f39714r.setEnabled(z11);
                this.F = z11;
            }
        }
    }

    public final void V(int i10, boolean z10, org.telegram.ui.Components.m8 m8Var) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f39715s;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f39712f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f39710c);
            }
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.pr.f29493f).setDuration(250L);
                if (m8Var != null) {
                    duration.addListener((Transition.TransitionListener) new p21(m8Var));
                }
                TransitionManager.beginDelayedTransition(this.f39710c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                e9VarArr[0].setVisibility(0);
                e9VarArr[1].setVisibility(8);
                ((View) this.f39708a[4].getParent()).setVisibility(8);
                ((View) this.f39708a[3].getParent()).setVisibility(0);
                ((View) this.f39708a[2].getParent()).setVisibility(0);
                ((View) this.f39708a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.e9 e9Var = e9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.wl.l(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                ((View) this.f39708a[4].getParent()).setVisibility(0);
                ((View) this.f39708a[3].getParent()).setVisibility(8);
                ((View) this.f39708a[2].getParent()).setVisibility(8);
                ((View) this.f39708a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                e9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f39708a[4].getParent()).setVisibility(0);
                ((View) this.f39708a[3].getParent()).setVisibility(8);
                ((View) this.f39708a[2].getParent()).setVisibility(8);
                ((View) this.f39708a[1].getParent()).setVisibility(8);
                this.f39708a[1].setText("443");
            }
            org.telegram.ui.Cells.ea eaVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            eaVar.setVisibility(i12);
            org.telegram.ui.Cells.j6 j6Var = j6VarArr[0];
            if (this.v == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var.a(z11, z10);
            org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[1];
            if (this.v == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            j6Var2.a(z12, z10);
            org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[2];
            if (this.v != 3) {
                z13 = false;
            }
            j6Var3.a(z13, z10);
            U(z10);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q21.W():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f39712f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.a7[] a7VarArr = this.f39711e;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f39715s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new l21(this));
        org.telegram.ui.ActionBar.v0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f39714r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20634a7, false));
        this.f39710c = new yd(context);
        ?? zn0Var = new org.telegram.ui.Components.zn0(context, this.f39710c, this.resourceProvider, true);
        this.f39709b = zn0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.zn0) zn0Var);
        this.f39709b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f39709b, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20964s8, false));
        int i11 = -1;
        frameLayout.addView(this.f39709b, w7.x5.c(-1.0f, -1));
        this.f39710c.setOrientation(1);
        this.f39709b.addView(this.f39710c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final q21 f37927b;

            {
                this.f37927b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f37927b.V(fg.b.d(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        q21 q21Var = this.f37927b;
                        fg.b bVar = q21Var.f39716w;
                        if (bVar != null) {
                            int i12 = bVar.f9506a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f39708a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = q21Var.f39716w.f9507b;
                                        } else if (i13 == 1) {
                                            int i14 = q21Var.f39716w.f9508c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = q21Var.f39716w.d;
                                        } else if (i13 == 3) {
                                            str = q21Var.f39716w.f9509e;
                                        } else {
                                            if (i13 == 4) {
                                                str = q21Var.f39716w.f9510f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                q21Var.f39708a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                q21Var.f39708a[i13].setText(str);
                                            }
                                        } else {
                                            q21Var.f39708a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    q21Var.V(i12, true, new org.telegram.ui.Components.m8(q21Var, i12, 26));
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
            int d = fg.b.d(i12);
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            j6VarArr[i12] = j6Var;
            j6Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            j6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (d == this.v) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j6Var2.c(string, z12, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (d == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var3.c(string2, z11, true);
            } else {
                org.telegram.ui.Cells.j6 j6Var4 = j6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (d == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var4.c(string3, z10, false);
            }
            this.f39710c.addView(j6VarArr[i12], w7.x5.n(-1, 50));
            j6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        a7VarArr[0] = a7Var;
        this.f39710c.addView(a7Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f39710c.addView(this.d, w7.x5.n(-1, -2));
        int i13 = 5;
        this.f39708a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.x5.n(i11, 64));
            this.f39708a[i14] = new EditTextBoldCursor(context);
            this.f39708a[i14].setTag(Integer.valueOf(i14));
            this.f39708a[i14].setTextSize(1, 16.0f);
            this.f39708a[i14].setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f39708a[i14];
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.f39708a[i14].setBackground(null);
            this.f39708a[i14].setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.f39708a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f39708a[i14].setCursorWidth(1.5f);
            this.f39708a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f39708a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f39708a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
            this.f39708a[i14].setTransformHintToHeader(true);
            this.f39708a[i14].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20818k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20836l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20907p7, false));
            if (i14 == 0) {
                this.f39708a[i14].setInputType(524305);
                this.f39708a[i14].addTextChangedListener(new o21(this, 0));
            } else if (i14 == 1) {
                this.f39708a[i14].setInputType(2);
                this.f39708a[i14].addTextChangedListener(new o21(this, 1));
            } else if (i14 == 3) {
                this.f39708a[i14].setInputType(129);
                this.f39708a[i14].setTypeface(Typeface.DEFAULT);
                this.f39708a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f39708a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f39708a[i14].addTextChangedListener(new o21(this, 2));
            }
            this.f39708a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f39708a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f39708a[i14].setText(proxyInfo.settings.f9510f);
                            }
                        } else {
                            this.f39708a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f39708a[i14].setText(proxyInfo.settings.f9509e);
                        }
                    } else {
                        this.f39708a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f39708a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f39708a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f39708a[i14].setText(Integer.toString(proxyInfo.settings.f9508c));
                }
            } else {
                this.f39708a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f39708a[i14].setText(proxyInfo.settings.f9507b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f39708a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f39708a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f39708a[i14];
            if (i14 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.x5.d(-1, -1.0f, 51, 17.0f, f7, 17.0f, 0.0f));
            this.f39708a[i14].setOnEditorActionListener(new ia(this, 10));
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
                org.telegram.messenger.wl.l(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                e9VarArr[i16].setVisibility(8);
            }
            this.f39710c.addView(e9VarArr[i16], w7.x5.n(-1, -2));
        }
        org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(this.fragmentView.getContext());
        this.f39713n = eaVar;
        eaVar.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
        this.f39713n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ea eaVar2 = this.f39713n;
        int i17 = org.telegram.ui.ActionBar.j6.q6;
        eaVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f39713n.setOnClickListener(new View.OnClickListener(this) {
            public final q21 f37927b;

            {
                this.f37927b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f37927b.V(fg.b.d(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        q21 q21Var = this.f37927b;
                        fg.b bVar = q21Var.f39716w;
                        if (bVar != null) {
                            int i122 = bVar.f9506a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f39708a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = q21Var.f39716w.f9507b;
                                        } else if (i132 == 1) {
                                            int i142 = q21Var.f39716w.f9508c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = q21Var.f39716w.d;
                                        } else if (i132 == 3) {
                                            str = q21Var.f39716w.f9509e;
                                        } else {
                                            if (i132 == 4) {
                                                str = q21Var.f39716w.f9510f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                q21Var.f39708a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                q21Var.f39708a[i132].setText(str);
                                            }
                                        } else {
                                            q21Var.f39708a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    q21Var.V(i122, true, new org.telegram.ui.Components.m8(q21Var, i122, 26));
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
        this.f39710c.addView(this.f39713n, 0, w7.x5.n(-1, -2));
        this.f39713n.setVisibility(8);
        org.telegram.ui.Cells.a7 a7Var2 = new org.telegram.ui.Cells.a7(this.fragmentView.getContext(), (org.telegram.ui.Cells.p6) null);
        a7VarArr[2] = a7Var2;
        this.f39710c.addView(a7Var2, 1, w7.x5.n(-1, -2));
        a7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ea eaVar3 = new org.telegram.ui.Cells.ea(context);
        this.h = eaVar3;
        eaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f39710c.addView(this.h, w7.x5.n(-1, -2));
        this.h.setOnClickListener(new wy0(1, this, context));
        org.telegram.ui.Cells.a7 a7Var3 = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        a7VarArr[1] = a7Var3;
        this.f39710c.addView(a7Var3, w7.x5.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f39718y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f9506a, false, null);
        this.f39716w = null;
        this.f39717x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.e9[] e9VarArr = this.f39712f;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f39715s;
        xy0 xy0Var = new xy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20634a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20964s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39709b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21019v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20983t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.j6.f20690d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39710c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20812k0, null, null, org.telegram.ui.ActionBar.j6.f20691d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.ea eaVar = this.h;
        int i12 = org.telegram.ui.ActionBar.j6.f20780i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(eaVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.f21088z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39713n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39713n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39713n, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < j6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f20690d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f20780i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20746g7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20763h7));
        }
        if (this.f39708a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f39708a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39708a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39708a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39708a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.f20818k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.f20836l6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.f20907p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20690d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.a7[] a7VarArr = this.f39711e;
            if (i17 >= a7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.a7 a7Var = a7VarArr[i17];
            if (a7Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(a7Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20654b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < e9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20654b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
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
            this.f39708a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f39708a[0]);
        }
    }
}

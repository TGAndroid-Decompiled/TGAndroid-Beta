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
public final class o21 extends org.telegram.ui.ActionBar.n2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public EditTextBoldCursor[] f36171a;
    public l21 f36172b;
    public k21 f36173c;
    public LinearLayout d;
    public org.telegram.ui.Cells.c7[] e;
    public org.telegram.ui.Cells.f9[] f36174f;
    public org.telegram.ui.Cells.fa h;
    public org.telegram.ui.Cells.fa f36175n;
    public org.telegram.ui.ActionBar.v0 f36176r;
    public org.telegram.ui.Cells.l6[] f36177s;
    public int v;
    public oi.b f36178w;
    public String f36179x;
    public float f36180y;

    public o21() {
        super(null);
        this.e = new org.telegram.ui.Cells.c7[3];
        this.f36174f = new org.telegram.ui.Cells.f9[2];
        this.f36177s = new org.telegram.ui.Cells.l6[3];
        this.f36180y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new g21(this);
        this.J = new SharedConfig.ProxyInfo(oi.b.f15735i);
        this.I = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f36176r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f36171a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f36171a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(oi.k.j(editTextBoldCursor.getText().toString())) || oi.k.d(this.f36171a[4].getText().toString()) == null)) {
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
                    this.G.addUpdateListener(new i21(this, 0));
                }
                float f7 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f36180y;
                    if (z11) {
                        f7 = 1.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    this.f36180y = f7;
                    org.telegram.ui.Cells.fa faVar = this.h;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.j6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19496z6;
                    }
                    faVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    org.telegram.ui.ActionBar.v0 v0Var = this.f36176r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    v0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f36176r.setEnabled(z11);
                this.F = z11;
            }
        }
    }

    public final void V(int i10, boolean z10, org.telegram.ui.Components.kd kdVar) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.l6[] l6VarArr = this.f36177s;
        org.telegram.ui.Cells.f9[] f9VarArr = this.f36174f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f36173c);
            }
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.qr.f27642f).setDuration(250L);
                if (kdVar != null) {
                    duration.addListener((Transition.TransitionListener) new n21(kdVar));
                }
                TransitionManager.beginDelayedTransition(this.f36173c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                f9VarArr[0].setVisibility(0);
                f9VarArr[1].setVisibility(8);
                ((View) this.f36171a[4].getParent()).setVisibility(8);
                ((View) this.f36171a[3].getParent()).setVisibility(0);
                ((View) this.f36171a[2].getParent()).setVisibility(0);
                ((View) this.f36171a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                f9VarArr[0].setVisibility(8);
                f9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.f9 f9Var = f9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.o(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                f9Var.setText(sb2.toString());
                ((View) this.f36171a[4].getParent()).setVisibility(0);
                ((View) this.f36171a[3].getParent()).setVisibility(8);
                ((View) this.f36171a[2].getParent()).setVisibility(8);
                ((View) this.f36171a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                f9VarArr[0].setVisibility(8);
                f9VarArr[1].setVisibility(0);
                f9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f36171a[4].getParent()).setVisibility(0);
                ((View) this.f36171a[3].getParent()).setVisibility(8);
                ((View) this.f36171a[2].getParent()).setVisibility(8);
                ((View) this.f36171a[1].getParent()).setVisibility(8);
                this.f36171a[1].setText("443");
            }
            org.telegram.ui.Cells.fa faVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            faVar.setVisibility(i12);
            org.telegram.ui.Cells.l6 l6Var = l6VarArr[0];
            if (this.v == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            l6Var.a(z11, z10);
            org.telegram.ui.Cells.l6 l6Var2 = l6VarArr[1];
            if (this.v == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            l6Var2.a(z12, z10);
            org.telegram.ui.Cells.l6 l6Var3 = l6VarArr[2];
            if (this.v != 3) {
                z13 = false;
            }
            l6Var3.a(z13, z10);
            U(z10);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o21.W():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.f9[] f9VarArr = this.f36174f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.c7[] c7VarArr = this.e;
        org.telegram.ui.Cells.l6[] l6VarArr = this.f36177s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new j21(this));
        org.telegram.ui.ActionBar.v0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f36176r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        this.f36173c = new yd(context);
        ?? mo0Var = new org.telegram.ui.Components.mo0(context, this.f36173c, this.resourceProvider, true);
        this.f36172b = mo0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.mo0) mo0Var);
        this.f36172b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f36172b, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19372s8, false));
        int i11 = -1;
        frameLayout.addView(this.f36172b, w7.y5.c(-1.0f, -1));
        this.f36173c.setOrientation(1);
        this.f36172b.addView(this.f36173c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final o21 f34061b;

            {
                this.f34061b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f34061b.V(oi.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        o21 o21Var = this.f34061b;
                        oi.b bVar = o21Var.f36178w;
                        if (bVar != null) {
                            int i12 = bVar.f15736a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36171a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = o21Var.f36178w.f15737b;
                                        } else if (i13 == 1) {
                                            int i14 = o21Var.f36178w.f15738c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = o21Var.f36178w.d;
                                        } else if (i13 == 3) {
                                            str = o21Var.f36178w.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = o21Var.f36178w.f15739f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                o21Var.f36171a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                o21Var.f36171a[i13].setText(str);
                                            }
                                        } else {
                                            o21Var.f36171a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    o21Var.V(i12, true, new org.telegram.ui.Components.kd(o21Var, i12, 25));
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
            int e = oi.b.e(i12);
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, null);
            l6VarArr[i12] = l6Var;
            l6Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            l6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.l6 l6Var2 = l6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (e == this.v) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                l6Var2.c(string, z12, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.l6 l6Var3 = l6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (e == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l6Var3.c(string2, z11, true);
            } else {
                org.telegram.ui.Cells.l6 l6Var4 = l6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (e == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l6Var4.c(string3, z10, false);
            }
            this.f36173c.addView(l6VarArr[i12], w7.y5.n(-1, 50));
            l6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
        c7VarArr[0] = c7Var;
        this.f36173c.addView(c7Var, w7.y5.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f36173c.addView(this.d, w7.y5.n(-1, -2));
        int i13 = 5;
        this.f36171a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.y5.n(i11, 64));
            this.f36171a[i14] = new EditTextBoldCursor(context);
            this.f36171a[i14].setTag(Integer.valueOf(i14));
            this.f36171a[i14].setTextSize(1, 16.0f);
            this.f36171a[i14].setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f36171a[i14];
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.f36171a[i14].setBackground(null);
            this.f36171a[i14].setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.f36171a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f36171a[i14].setCursorWidth(1.5f);
            this.f36171a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f36171a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f36171a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
            this.f36171a[i14].setTransformHintToHeader(true);
            this.f36171a[i14].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19222k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19240l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19315p7, false));
            if (i14 == 0) {
                this.f36171a[i14].setInputType(524305);
                this.f36171a[i14].addTextChangedListener(new m21(this, 0));
            } else if (i14 == 1) {
                this.f36171a[i14].setInputType(2);
                this.f36171a[i14].addTextChangedListener(new m21(this, 1));
            } else if (i14 == 3) {
                this.f36171a[i14].setInputType(129);
                this.f36171a[i14].setTypeface(Typeface.DEFAULT);
                this.f36171a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f36171a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f36171a[i14].addTextChangedListener(new m21(this, 2));
            }
            this.f36171a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f36171a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f36171a[i14].setText(proxyInfo.settings.f15739f);
                            }
                        } else {
                            this.f36171a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f36171a[i14].setText(proxyInfo.settings.e);
                        }
                    } else {
                        this.f36171a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f36171a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f36171a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f36171a[i14].setText(Integer.toString(proxyInfo.settings.f15738c));
                }
            } else {
                this.f36171a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f36171a[i14].setText(proxyInfo.settings.f15737b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f36171a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f36171a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f36171a[i14];
            if (i14 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.y5.d(-1, -1.0f, 51, 17.0f, f7, 17.0f, 0.0f));
            this.f36171a[i14].setOnEditorActionListener(new ja(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            f9VarArr[i16] = f9Var;
            if (i16 == 0) {
                f9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.o(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                f9Var.setText(sb2.toString());
                f9VarArr[i16].setVisibility(8);
            }
            this.f36173c.addView(f9VarArr[i16], w7.y5.n(-1, -2));
        }
        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(this.fragmentView.getContext());
        this.f36175n = faVar;
        faVar.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
        this.f36175n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.fa faVar2 = this.f36175n;
        int i17 = org.telegram.ui.ActionBar.j6.q6;
        faVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f36175n.setOnClickListener(new View.OnClickListener(this) {
            public final o21 f34061b;

            {
                this.f34061b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f34061b.V(oi.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        o21 o21Var = this.f34061b;
                        oi.b bVar = o21Var.f36178w;
                        if (bVar != null) {
                            int i122 = bVar.f15736a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36171a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = o21Var.f36178w.f15737b;
                                        } else if (i132 == 1) {
                                            int i142 = o21Var.f36178w.f15738c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = o21Var.f36178w.d;
                                        } else if (i132 == 3) {
                                            str = o21Var.f36178w.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = o21Var.f36178w.f15739f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                o21Var.f36171a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                o21Var.f36171a[i132].setText(str);
                                            }
                                        } else {
                                            o21Var.f36171a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    o21Var.V(i122, true, new org.telegram.ui.Components.kd(o21Var, i122, 25));
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
        this.f36173c.addView(this.f36175n, 0, w7.y5.n(-1, -2));
        this.f36175n.setVisibility(8);
        org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(this.fragmentView.getContext(), (org.telegram.ui.Cells.c1) null);
        c7VarArr[2] = c7Var2;
        this.f36173c.addView(c7Var2, 1, w7.y5.n(-1, -2));
        c7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.fa faVar3 = new org.telegram.ui.Cells.fa(context);
        this.h = faVar3;
        faVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f36173c.addView(this.h, w7.y5.n(-1, -2));
        this.h.setOnClickListener(new vy0(1, this, context));
        org.telegram.ui.Cells.c7 c7Var3 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
        c7VarArr[1] = c7Var3;
        this.f36173c.addView(c7Var3, w7.y5.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f36180y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f15736a, false, null);
        this.f36178w = null;
        this.f36179x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.f9[] f9VarArr = this.f36174f;
        org.telegram.ui.Cells.l6[] l6VarArr = this.f36177s;
        wy0 wy0Var = new wy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19038a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19372s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36172b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.j6.f19094d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36173c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19216k0, null, null, org.telegram.ui.ActionBar.j6.f19095d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.fa faVar = this.h;
        int i12 = org.telegram.ui.ActionBar.j6.f19184i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(faVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, wy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.f19496z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36175n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36175n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36175n, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < l6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(l6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19094d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(l6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(l6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(l6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19149g7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(l6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19167h7));
        }
        if (this.f36171a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f36171a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36171a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36171a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36171a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.f19222k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.f19240l6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.f19315p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19094d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.e;
            if (i17 >= c7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.c7 c7Var = c7VarArr[i17];
            if (c7Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(c7Var, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19058b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < f9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19058b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
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
            this.f36171a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f36171a[0]);
        }
    }
}

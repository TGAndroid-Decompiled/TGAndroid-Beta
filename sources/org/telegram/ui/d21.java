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
public final class d21 extends org.telegram.ui.ActionBar.p2 {
    public float[] B;
    public boolean C;
    public ValueAnimator D;
    public ClipboardManager E;
    public final boolean F;
    public SharedConfig.ProxyInfo G;
    public boolean H;
    public ClipboardManager.OnPrimaryClipChangedListener I;
    public EditTextBoldCursor[] f35946a;
    public a21 f35947b;
    public z11 f35948c;
    public LinearLayout d;
    public org.telegram.ui.Cells.z6[] f35949e;
    public org.telegram.ui.Cells.a9[] f35950f;
    public org.telegram.ui.Cells.aa h;
    public org.telegram.ui.Cells.aa f35951n;
    public org.telegram.ui.ActionBar.w0 f35952r;
    public org.telegram.ui.Cells.j6[] f35953s;
    public int v;
    public sf.b f35954w;
    public String f35955x;
    public float f35956y;

    public d21() {
        super(null);
        this.f35949e = new org.telegram.ui.Cells.z6[3];
        this.f35950f = new org.telegram.ui.Cells.a9[2];
        this.f35953s = new org.telegram.ui.Cells.j6[3];
        this.f35956y = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new w11(this);
        this.G = new SharedConfig.ProxyInfo(sf.b.f47335g);
        this.F = true;
    }

    public final void U(boolean z4) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z10;
        int i10;
        if (this.h != null && this.f35952r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f35946a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f35946a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(sf.k.i(editTextBoldCursor.getText().toString())) || sf.k.d(this.f35946a[4].getText().toString()) == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.C != z10) {
                ValueAnimator valueAnimator = this.D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z4) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.D = ofFloat;
                    ofFloat.setDuration(200L);
                    this.D.addUpdateListener(new n11(this, 1));
                }
                float f10 = 0.0f;
                float f11 = 1.0f;
                if (z4) {
                    float[] fArr = this.B;
                    fArr[0] = this.f35956y;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    fArr[1] = f10;
                    this.D.start();
                } else {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    this.f35956y = f10;
                    org.telegram.ui.Cells.aa aaVar = this.h;
                    if (z10) {
                        i10 = org.telegram.ui.ActionBar.k6.f21896q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f22055z6;
                    }
                    aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                    org.telegram.ui.ActionBar.w0 w0Var = this.f35952r;
                    if (!z10) {
                        f11 = 0.5f;
                    }
                    w0Var.setAlpha(f11);
                }
                this.h.setEnabled(z10);
                this.f35952r.setEnabled(z10);
                this.C = z10;
            }
        }
    }

    public final void V(int i10, boolean z4, org.telegram.ui.Components.im imVar) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f35953s;
        org.telegram.ui.Cells.a9[] a9VarArr = this.f35950f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f35948c);
            }
            boolean z12 = true;
            if (z4) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.pr.f30168f).setDuration(250L);
                if (imVar != null) {
                    duration.addListener((Transition.TransitionListener) new c21(imVar));
                }
                TransitionManager.beginDelayedTransition(this.f35948c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                a9VarArr[0].setVisibility(0);
                a9VarArr[1].setVisibility(8);
                ((View) this.f35946a[4].getParent()).setVisibility(8);
                ((View) this.f35946a[3].getParent()).setVisibility(0);
                ((View) this.f35946a[2].getParent()).setVisibility(0);
                ((View) this.f35946a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.a9 a9Var = a9VarArr[1];
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                a9Var.setText(sb.toString());
                ((View) this.f35946a[4].getParent()).setVisibility(0);
                ((View) this.f35946a[3].getParent()).setVisibility(8);
                ((View) this.f35946a[2].getParent()).setVisibility(8);
                ((View) this.f35946a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                a9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f35946a[4].getParent()).setVisibility(0);
                ((View) this.f35946a[3].getParent()).setVisibility(8);
                ((View) this.f35946a[2].getParent()).setVisibility(8);
                ((View) this.f35946a[1].getParent()).setVisibility(8);
                this.f35946a[1].setText("443");
            }
            org.telegram.ui.Cells.aa aaVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            aaVar.setVisibility(i12);
            org.telegram.ui.Cells.j6 j6Var = j6VarArr[0];
            if (this.v == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var.a(z10, z4);
            org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[1];
            if (this.v == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var2.a(z11, z4);
            org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[2];
            if (this.v != 3) {
                z12 = false;
            }
            j6Var3.a(z12, z4);
            U(z4);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d21.W():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f10;
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.a9[] a9VarArr = this.f35950f;
        SharedConfig.ProxyInfo proxyInfo = this.G;
        org.telegram.ui.Cells.z6[] z6VarArr = this.f35949e;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f35953s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new y11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f35952r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        this.f35948c = new eg.s3(context);
        ?? eo0Var = new org.telegram.ui.Components.eo0(context, this.f35948c, this.resourceProvider, true);
        this.f35947b = eo0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.eo0) eo0Var);
        this.f35947b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f35947b, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21932s8, false));
        int i11 = -1;
        frameLayout.addView(this.f35947b, k7.c6.c(-1.0f, -1));
        this.f35948c.setOrientation(1);
        this.f35947b.addView(this.f35948c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final d21 f42902b;

            {
                this.f42902b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f42902b.V(sf.b.d(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        d21 d21Var = this.f42902b;
                        sf.b bVar = d21Var.f35954w;
                        if (bVar != null) {
                            int i12 = bVar.f47336a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f35946a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = d21Var.f35954w.f47337b;
                                        } else if (i13 == 1) {
                                            int i14 = d21Var.f35954w.f47338c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = d21Var.f35954w.d;
                                        } else if (i13 == 3) {
                                            str = d21Var.f35954w.f47339e;
                                        } else {
                                            if (i13 == 4) {
                                                str = d21Var.f35954w.f47340f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                d21Var.f35946a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                d21Var.f35946a[i13].setText(str);
                                            }
                                        } else {
                                            d21Var.f35946a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    d21Var.V(i12, true, new org.telegram.ui.Components.im(d21Var, i12, 23));
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
            int d = sf.b.d(i12);
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            j6VarArr[i12] = j6Var;
            j6Var.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
            j6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (d == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var2.c(string, z11, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (d == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var3.c(string2, z10, true);
            } else {
                org.telegram.ui.Cells.j6 j6Var4 = j6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (d == this.v) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                j6Var4.c(string3, z4, false);
            }
            this.f35948c.addView(j6VarArr[i12], k7.c6.n(-1, 50));
            j6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        z6VarArr[0] = z6Var;
        this.f35948c.addView(z6Var, k7.c6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f35948c.addView(this.d, k7.c6.n(-1, -2));
        int i13 = 5;
        this.f35946a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, k7.c6.n(i11, 64));
            this.f35946a[i14] = new EditTextBoldCursor(context);
            this.f35946a[i14].setTag(Integer.valueOf(i14));
            this.f35946a[i14].setTextSize(1, 16.0f);
            this.f35946a[i14].setHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f35946a[i14];
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
            this.f35946a[i14].setBackground(null);
            this.f35946a[i14].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
            this.f35946a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f35946a[i14].setCursorWidth(1.5f);
            this.f35946a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f35946a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f35946a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L6, false));
            this.f35946a[i14].setTransformHintToHeader(true);
            this.f35946a[i14].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21787k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21805l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21878p7, false));
            if (i14 == 0) {
                this.f35946a[i14].setInputType(524305);
                this.f35946a[i14].addTextChangedListener(new b21(this, 0));
            } else if (i14 == 1) {
                this.f35946a[i14].setInputType(2);
                this.f35946a[i14].addTextChangedListener(new b21(this, 1));
            } else if (i14 == 3) {
                this.f35946a[i14].setInputType(129);
                this.f35946a[i14].setTypeface(Typeface.DEFAULT);
                this.f35946a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f35946a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f35946a[i14].addTextChangedListener(new b21(this, 2));
            }
            this.f35946a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f35946a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f35946a[i14].setText(proxyInfo.settings.f47340f);
                            }
                        } else {
                            this.f35946a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f35946a[i14].setText(proxyInfo.settings.f47339e);
                        }
                    } else {
                        this.f35946a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f35946a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f35946a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f35946a[i14].setText(Integer.toString(proxyInfo.settings.f47338c));
                }
            } else {
                this.f35946a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f35946a[i14].setText(proxyInfo.settings.f47337b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f35946a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f35946a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f35946a[i14];
            if (i14 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, k7.c6.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f35946a[i14].setOnEditorActionListener(new ha(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9VarArr[i16] = a9Var;
            if (i16 == 0) {
                a9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                a9Var.setText(sb.toString());
                a9VarArr[i16].setVisibility(8);
            }
            this.f35948c.addView(a9VarArr[i16], k7.c6.n(-1, -2));
        }
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(this.fragmentView.getContext());
        this.f35951n = aaVar;
        aaVar.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
        this.f35951n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.aa aaVar2 = this.f35951n;
        int i17 = org.telegram.ui.ActionBar.k6.f21896q6;
        aaVar2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        this.f35951n.setOnClickListener(new View.OnClickListener(this) {
            public final d21 f42902b;

            {
                this.f42902b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f42902b.V(sf.b.d(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        d21 d21Var = this.f42902b;
                        sf.b bVar = d21Var.f35954w;
                        if (bVar != null) {
                            int i122 = bVar.f47336a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f35946a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = d21Var.f35954w.f47337b;
                                        } else if (i132 == 1) {
                                            int i142 = d21Var.f35954w.f47338c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = d21Var.f35954w.d;
                                        } else if (i132 == 3) {
                                            str = d21Var.f35954w.f47339e;
                                        } else {
                                            if (i132 == 4) {
                                                str = d21Var.f35954w.f47340f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                d21Var.f35946a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                d21Var.f35946a[i132].setText(str);
                                            }
                                        } else {
                                            d21Var.f35946a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    d21Var.V(i122, true, new org.telegram.ui.Components.im(d21Var, i122, 23));
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
        this.f35948c.addView(this.f35951n, 0, k7.c6.n(-1, -2));
        this.f35951n.setVisibility(8);
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(this.fragmentView.getContext(), (b) null);
        z6VarArr[2] = z6Var2;
        this.f35948c.addView(z6Var2, 1, k7.c6.n(-1, -2));
        z6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.aa aaVar3 = new org.telegram.ui.Cells.aa(context);
        this.h = aaVar3;
        aaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        this.f35948c.addView(this.h, k7.c6.n(-1, -2));
        this.h.setOnClickListener(new hb0(16, this, context));
        org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (b) null);
        z6VarArr[1] = z6Var3;
        this.f35948c.addView(z6Var3, k7.c6.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.f35956y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f47336a, false, null);
        this.f35954w = null;
        this.f35955x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.a9[] a9VarArr = this.f35950f;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f35953s;
        jy0 jy0Var = new jy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35947b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35948c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.aa aaVar = this.h;
        int i12 = org.telegram.ui.ActionBar.k6.f21752i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(aaVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f21896q6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35951n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35951n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35951n, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < j6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21717g7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21735h7));
        }
        if (this.f35946a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f35946a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.k6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35946a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35946a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f35946a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.f21787k6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.f21805l6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.f21878p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.f35949e;
            if (i17 >= z6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.z6 z6Var = z6VarArr[i17];
            if (z6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.m6(z6Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < a9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
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
        W();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !z10 && this.F) {
            this.f35946a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f35946a[0]);
        }
    }
}

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
    public EditTextBoldCursor[] f33303a;
    public a21 f33304b;
    public z11 f33305c;
    public LinearLayout d;
    public org.telegram.ui.Cells.y6[] e;
    public org.telegram.ui.Cells.z8[] f33306f;
    public org.telegram.ui.Cells.z9 h;
    public org.telegram.ui.Cells.z9 f33307n;
    public org.telegram.ui.ActionBar.w0 f33308r;
    public org.telegram.ui.Cells.i6[] f33309s;
    public int v;
    public rf.b f33310w;
    public String f33311x;
    public float f33312y;

    public d21() {
        super(null);
        this.e = new org.telegram.ui.Cells.y6[3];
        this.f33306f = new org.telegram.ui.Cells.z8[2];
        this.f33309s = new org.telegram.ui.Cells.i6[3];
        this.f33312y = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new w11(this);
        this.G = new SharedConfig.ProxyInfo(rf.b.f43475g);
        this.F = true;
    }

    public final void U(boolean z4) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z10;
        int i10;
        if (this.h != null && this.f33308r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f33303a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f33303a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(rf.j.i(editTextBoldCursor.getText().toString())) || rf.j.d(this.f33303a[4].getText().toString()) == null)) {
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
                    this.D.addUpdateListener(new o11(this, 1));
                }
                float f10 = 0.0f;
                float f11 = 1.0f;
                if (z4) {
                    float[] fArr = this.B;
                    fArr[0] = this.f33312y;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    fArr[1] = f10;
                    this.D.start();
                } else {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    this.f33312y = f10;
                    org.telegram.ui.Cells.z9 z9Var = this.h;
                    if (z10) {
                        i10 = org.telegram.ui.ActionBar.j6.f20115q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20273z6;
                    }
                    z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    org.telegram.ui.ActionBar.w0 w0Var = this.f33308r;
                    if (!z10) {
                        f11 = 0.5f;
                    }
                    w0Var.setAlpha(f11);
                }
                this.h.setEnabled(z10);
                this.f33308r.setEnabled(z10);
                this.C = z10;
            }
        }
    }

    public final void V(int i10, boolean z4, org.telegram.ui.Components.dw dwVar) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.i6[] i6VarArr = this.f33309s;
        org.telegram.ui.Cells.z8[] z8VarArr = this.f33306f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f33305c);
            }
            boolean z12 = true;
            if (z4) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.mr.f27122f).setDuration(250L);
                if (dwVar != null) {
                    duration.addListener((Transition.TransitionListener) new c21(dwVar));
                }
                TransitionManager.beginDelayedTransition(this.f33305c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                z8VarArr[0].setVisibility(0);
                z8VarArr[1].setVisibility(8);
                ((View) this.f33303a[4].getParent()).setVisibility(8);
                ((View) this.f33303a[3].getParent()).setVisibility(0);
                ((View) this.f33303a[2].getParent()).setVisibility(0);
                ((View) this.f33303a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.z8 z8Var = z8VarArr[1];
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                z8Var.setText(sb.toString());
                ((View) this.f33303a[4].getParent()).setVisibility(0);
                ((View) this.f33303a[3].getParent()).setVisibility(8);
                ((View) this.f33303a[2].getParent()).setVisibility(8);
                ((View) this.f33303a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                z8VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f33303a[4].getParent()).setVisibility(0);
                ((View) this.f33303a[3].getParent()).setVisibility(8);
                ((View) this.f33303a[2].getParent()).setVisibility(8);
                ((View) this.f33303a[1].getParent()).setVisibility(8);
                this.f33303a[1].setText("443");
            }
            org.telegram.ui.Cells.z9 z9Var = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            z9Var.setVisibility(i12);
            org.telegram.ui.Cells.i6 i6Var = i6VarArr[0];
            if (this.v == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var.a(z10, z4);
            org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[1];
            if (this.v == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var2.a(z11, z4);
            org.telegram.ui.Cells.i6 i6Var3 = i6VarArr[2];
            if (this.v != 3) {
                z12 = false;
            }
            i6Var3.a(z12, z4);
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
        org.telegram.ui.Cells.z8[] z8VarArr = this.f33306f;
        SharedConfig.ProxyInfo proxyInfo = this.G;
        org.telegram.ui.Cells.y6[] y6VarArr = this.e;
        org.telegram.ui.Cells.i6[] i6VarArr = this.f33309s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new y11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f33308r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        this.f33305c = new dg.u3(context);
        ?? do0Var = new org.telegram.ui.Components.do0(context, this.f33305c, this.resourceProvider, true);
        this.f33304b = do0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.do0) do0Var);
        this.f33304b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f33304b, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20151s8, false));
        int i11 = -1;
        frameLayout.addView(this.f33304b, k7.b6.c(-1.0f, -1));
        this.f33305c.setOrientation(1);
        this.f33304b.addView(this.f33305c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final d21 f39828b;

            {
                this.f39828b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f39828b.V(rf.b.d(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        d21 d21Var = this.f39828b;
                        rf.b bVar = d21Var.f33310w;
                        if (bVar != null) {
                            int i12 = bVar.f43476a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f33303a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = d21Var.f33310w.f43477b;
                                        } else if (i13 == 1) {
                                            int i14 = d21Var.f33310w.f43478c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = d21Var.f33310w.d;
                                        } else if (i13 == 3) {
                                            str = d21Var.f33310w.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = d21Var.f33310w.f43479f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                d21Var.f33303a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                d21Var.f33303a[i13].setText(str);
                                            }
                                        } else {
                                            d21Var.f33303a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    d21Var.V(i12, true, new org.telegram.ui.Components.dw(d21Var, i12, 22));
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
            int d = rf.b.d(i12);
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
            i6VarArr[i12] = i6Var;
            i6Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            i6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (d == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i6Var2.c(string, z11, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.i6 i6Var3 = i6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (d == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i6Var3.c(string2, z10, true);
            } else {
                org.telegram.ui.Cells.i6 i6Var4 = i6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (d == this.v) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i6Var4.c(string3, z4, false);
            }
            this.f33305c.addView(i6VarArr[i12], k7.b6.n(-1, 50));
            i6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
        y6VarArr[0] = y6Var;
        this.f33305c.addView(y6Var, k7.b6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f33305c.addView(this.d, k7.b6.n(-1, -2));
        int i13 = 5;
        this.f33303a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, k7.b6.n(i11, 64));
            this.f33303a[i14] = new EditTextBoldCursor(context);
            this.f33303a[i14].setTag(Integer.valueOf(i14));
            this.f33303a[i14].setTextSize(1, 16.0f);
            this.f33303a[i14].setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f33303a[i14];
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.f33303a[i14].setBackground(null);
            this.f33303a[i14].setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.f33303a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f33303a[i14].setCursorWidth(1.5f);
            this.f33303a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f33303a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f33303a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
            this.f33303a[i14].setTransformHintToHeader(true);
            this.f33303a[i14].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20006k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20024l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
            if (i14 == 0) {
                this.f33303a[i14].setInputType(524305);
                this.f33303a[i14].addTextChangedListener(new b21(this, 0));
            } else if (i14 == 1) {
                this.f33303a[i14].setInputType(2);
                this.f33303a[i14].addTextChangedListener(new b21(this, 1));
            } else if (i14 == 3) {
                this.f33303a[i14].setInputType(129);
                this.f33303a[i14].setTypeface(Typeface.DEFAULT);
                this.f33303a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f33303a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f33303a[i14].addTextChangedListener(new b21(this, 2));
            }
            this.f33303a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f33303a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f33303a[i14].setText(proxyInfo.settings.f43479f);
                            }
                        } else {
                            this.f33303a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f33303a[i14].setText(proxyInfo.settings.e);
                        }
                    } else {
                        this.f33303a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f33303a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f33303a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f33303a[i14].setText(Integer.toString(proxyInfo.settings.f43478c));
                }
            } else {
                this.f33303a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f33303a[i14].setText(proxyInfo.settings.f43477b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f33303a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f33303a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f33303a[i14];
            if (i14 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, k7.b6.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f33303a[i14].setOnEditorActionListener(new ja(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8VarArr[i16] = z8Var;
            if (i16 == 0) {
                z8Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                z8Var.setText(sb.toString());
                z8VarArr[i16].setVisibility(8);
            }
            this.f33305c.addView(z8VarArr[i16], k7.b6.n(-1, -2));
        }
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(this.fragmentView.getContext());
        this.f33307n = z9Var;
        z9Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
        this.f33307n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.z9 z9Var2 = this.f33307n;
        int i17 = org.telegram.ui.ActionBar.j6.f20115q6;
        z9Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f33307n.setOnClickListener(new View.OnClickListener(this) {
            public final d21 f39828b;

            {
                this.f39828b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f39828b.V(rf.b.d(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        d21 d21Var = this.f39828b;
                        rf.b bVar = d21Var.f33310w;
                        if (bVar != null) {
                            int i122 = bVar.f43476a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f33303a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = d21Var.f33310w.f43477b;
                                        } else if (i132 == 1) {
                                            int i142 = d21Var.f33310w.f43478c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = d21Var.f33310w.d;
                                        } else if (i132 == 3) {
                                            str = d21Var.f33310w.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = d21Var.f33310w.f43479f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                d21Var.f33303a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                d21Var.f33303a[i132].setText(str);
                                            }
                                        } else {
                                            d21Var.f33303a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    d21Var.V(i122, true, new org.telegram.ui.Components.dw(d21Var, i122, 22));
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
        this.f33305c.addView(this.f33307n, 0, k7.b6.n(-1, -2));
        this.f33307n.setVisibility(8);
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(this.fragmentView.getContext(), (b) null);
        y6VarArr[2] = y6Var2;
        this.f33305c.addView(y6Var2, 1, k7.b6.n(-1, -2));
        y6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.z9 z9Var3 = new org.telegram.ui.Cells.z9(context);
        this.h = z9Var3;
        z9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f33305c.addView(this.h, k7.b6.n(-1, -2));
        this.h.setOnClickListener(new ib0(16, this, context));
        org.telegram.ui.Cells.y6 y6Var3 = new org.telegram.ui.Cells.y6(context, (b) null);
        y6VarArr[1] = y6Var3;
        this.f33305c.addView(y6Var3, k7.b6.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.f33312y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f43476a, false, null);
        this.f33310w = null;
        this.f33311x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.z8[] z8VarArr = this.f33306f;
        org.telegram.ui.Cells.i6[] i6VarArr = this.f33309s;
        jy0 jy0Var = new jy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33304b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33305c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.z9 z9Var = this.h;
        int i12 = org.telegram.ui.ActionBar.j6.f19971i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(z9Var, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f20115q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33307n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33307n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33307n, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < i6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19936g7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(i6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19954h7));
        }
        if (this.f33303a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f33303a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33303a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33303a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33303a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.f20006k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.f20024l6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.j6.f20097p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.y6[] y6VarArr = this.e;
            if (i17 >= y6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.y6 y6Var = y6VarArr[i17];
            if (y6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(y6Var, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19846b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < z8VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(z8VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19846b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(z8VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(z8VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
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
            this.f33303a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f33303a[0]);
        }
    }
}

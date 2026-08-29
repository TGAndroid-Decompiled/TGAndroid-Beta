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
import org.telegram.messenger.WebProxyTransport;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l11 extends org.telegram.ui.ActionBar.o2 {
    public float A;
    public final float[] B;
    public boolean C;
    public ValueAnimator D;
    public ClipboardManager E;
    public boolean F;
    public final SharedConfig.ProxyInfo G;
    public boolean H;
    public final ClipboardManager.OnPrimaryClipChangedListener I;
    public EditTextBoldCursor[] f40053a;
    public i11 f40054b;
    public h11 f40055c;
    public LinearLayout d;
    public final org.telegram.ui.Cells.x6[] f40056e;
    public final org.telegram.ui.Cells.y8[] f40057f;
    public org.telegram.ui.Cells.y9 h;
    public org.telegram.ui.Cells.y9 f40058n;
    public org.telegram.ui.ActionBar.w0 f40059r;
    public final org.telegram.ui.Cells.h6[] f40060s;
    public int v;
    public int f40061w;
    public String f40062x;
    public String[] f40063y;

    public l11() {
        super(null);
        this.f40056e = new org.telegram.ui.Cells.x6[3];
        this.f40057f = new org.telegram.ui.Cells.y8[2];
        this.f40060s = new org.telegram.ui.Cells.h6[3];
        this.v = -1;
        this.f40061w = -1;
        this.A = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new ClipboardManager.OnPrimaryClipChangedListener() {
            @Override
            public final void onPrimaryClipChanged() {
                l11.this.W();
            }
        };
        this.G = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.F = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f40059r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f40053a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 2 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f40053a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(WebProxyTransport.normalizeHost(editTextBoldCursor.getText().toString())) || !WebProxyTransport.isValidSecret(this.f40053a[4].getText().toString()))) {
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
                    this.D.addUpdateListener(new w01(this, 1));
                }
                float f9 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float f11 = this.A;
                    float[] fArr = this.B;
                    fArr[0] = f11;
                    if (z11) {
                        f9 = 1.0f;
                    }
                    fArr[1] = f9;
                    this.D.start();
                } else {
                    if (z11) {
                        f9 = 1.0f;
                    }
                    this.A = f9;
                    org.telegram.ui.Cells.y9 y9Var = this.h;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.g6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f23450z6;
                    }
                    y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                    org.telegram.ui.ActionBar.w0 w0Var = this.f40059r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    w0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f40059r.setEnabled(z11);
                this.C = z11;
            }
        }
    }

    public final void V(int i10, boolean z10, ky0 ky0Var) {
        boolean z11;
        boolean z12;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f40055c);
            }
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.jr.f29800f).setDuration(250L);
                if (ky0Var != null) {
                    duration.addListener((Transition.TransitionListener) new k11(ky0Var));
                }
                TransitionManager.beginDelayedTransition(this.f40055c, duration);
            }
            int i11 = this.v;
            org.telegram.ui.Cells.y8[] y8VarArr = this.f40057f;
            int i12 = 8;
            if (i11 == 0) {
                y8VarArr[0].setVisibility(0);
                y8VarArr[1].setVisibility(8);
                ((View) this.f40053a[4].getParent()).setVisibility(8);
                ((View) this.f40053a[3].getParent()).setVisibility(0);
                ((View) this.f40053a[2].getParent()).setVisibility(0);
                ((View) this.f40053a[1].getParent()).setVisibility(0);
            } else if (i11 == 1) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.y8 y8Var = y8VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                b.j(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                y8Var.setText(sb2.toString());
                ((View) this.f40053a[4].getParent()).setVisibility(0);
                ((View) this.f40053a[3].getParent()).setVisibility(8);
                ((View) this.f40053a[2].getParent()).setVisibility(8);
                ((View) this.f40053a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                y8VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f40053a[4].getParent()).setVisibility(0);
                ((View) this.f40053a[3].getParent()).setVisibility(8);
                ((View) this.f40053a[2].getParent()).setVisibility(8);
                ((View) this.f40053a[1].getParent()).setVisibility(8);
                this.f40053a[1].setText("443");
            }
            org.telegram.ui.Cells.y9 y9Var = this.h;
            if (this.v != 2) {
                i12 = 0;
            }
            y9Var.setVisibility(i12);
            org.telegram.ui.Cells.h6[] h6VarArr = this.f40060s;
            org.telegram.ui.Cells.h6 h6Var = h6VarArr[0];
            if (this.v == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            h6Var.a(z11, z10);
            org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[1];
            if (this.v == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            h6Var2.a(z12, z10);
            org.telegram.ui.Cells.h6 h6Var3 = h6VarArr[2];
            if (this.v != 2) {
                z13 = false;
            }
            h6Var3.a(z13, z10);
            U(z10);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l11.W():void");
    }

    @Override
    public final View createView(Context context) {
        SharedConfig.ProxyInfo proxyInfo;
        int i10;
        float f9;
        boolean z10;
        boolean z11;
        boolean z12;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new g11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f40059r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        this.f40055c = new bg.y3(context);
        ?? un0Var = new org.telegram.ui.Components.un0(context, this.f40055c, this.resourceProvider, true);
        this.f40054b = un0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.un0) un0Var);
        this.f40054b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f40054b, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23329s8, false));
        int i11 = -1;
        frameLayout.addView(this.f40054b, i7.f6.c(-1.0f, -1));
        this.f40055c.setOrientation(1);
        this.f40054b.addView(this.f40055c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final l11 f37957b;

            {
                this.f37957b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37957b.V(((Integer) view.getTag()).intValue(), true, null);
                        return;
                    default:
                        l11 l11Var = this.f37957b;
                        if (l11Var.f40061w != -1) {
                            int i12 = 0;
                            while (true) {
                                String[] strArr = l11Var.f40063y;
                                if (i12 < strArr.length) {
                                    int i13 = l11Var.f40061w;
                                    if ((i13 != 0 || i12 != 4) && (i13 != 1 || (i12 != 2 && i12 != 3))) {
                                        String str = strArr[i12];
                                        if (str != null) {
                                            try {
                                                l11Var.f40053a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                l11Var.f40053a[i12].setText(l11Var.f40063y[i12]);
                                            }
                                        } else {
                                            l11Var.f40053a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = l11Var.f40053a[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    l11Var.V(l11Var.f40061w, true, new ky0(l11Var, 8));
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
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
            org.telegram.ui.Cells.h6[] h6VarArr = this.f40060s;
            h6VarArr[i12] = h6Var;
            h6Var.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
            h6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (i12 == this.v) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h6Var2.c(string, z12, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.h6 h6Var3 = h6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (i12 == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h6Var3.c(string2, z11, true);
            } else {
                org.telegram.ui.Cells.h6 h6Var4 = h6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (i12 == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6Var4.c(string3, z10, false);
            }
            this.f40055c.addView(h6VarArr[i12], i7.f6.n(-1, 50));
            h6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
        org.telegram.ui.Cells.x6[] x6VarArr = this.f40056e;
        x6VarArr[0] = x6Var;
        this.f40055c.addView(x6Var, i7.f6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f40055c.addView(this.d, i7.f6.n(-1, -2));
        int i13 = 5;
        this.f40053a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (true) {
            proxyInfo = this.G;
            if (i14 >= i13) {
                break;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, i7.f6.n(i11, 64));
            this.f40053a[i14] = new EditTextBoldCursor(context);
            this.f40053a[i14].setTag(Integer.valueOf(i14));
            this.f40053a[i14].setTextSize(1, 16.0f);
            this.f40053a[i14].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f40053a[i14];
            int i15 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.f40053a[i14].setBackground(null);
            this.f40053a[i14].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.f40053a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f40053a[i14].setCursorWidth(1.5f);
            this.f40053a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f40053a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f40053a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
            this.f40053a[i14].setTransformHintToHeader(true);
            this.f40053a[i14].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23189k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
            if (i14 == 0) {
                this.f40053a[i14].setInputType(524305);
                this.f40053a[i14].addTextChangedListener(new j11(this, 0));
            } else if (i14 == 1) {
                this.f40053a[i14].setInputType(2);
                this.f40053a[i14].addTextChangedListener(new j11(this, 1));
            } else if (i14 == 3) {
                this.f40053a[i14].setInputType(129);
                this.f40053a[i14].setTypeface(Typeface.DEFAULT);
                this.f40053a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f40053a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f40053a[i14].addTextChangedListener(new j11(this, 2));
            }
            this.f40053a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f40053a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f40053a[i14].setText(proxyInfo.secret);
                            }
                        } else {
                            this.f40053a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f40053a[i14].setText(proxyInfo.password);
                        }
                    } else {
                        this.f40053a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f40053a[i14].setText(proxyInfo.username);
                    }
                } else {
                    this.f40053a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    EditTextBoldCursor editTextBoldCursor3 = this.f40053a[i14];
                    editTextBoldCursor3.setText("" + proxyInfo.port);
                }
            } else {
                this.f40053a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f40053a[i14].setText(proxyInfo.address);
            }
            EditTextBoldCursor editTextBoldCursor4 = this.f40053a[i14];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            this.f40053a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor5 = this.f40053a[i14];
            if (i14 == 0) {
                f9 = 12.0f;
            } else {
                f9 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor5, i7.f6.d(-1, -1.0f, 51, 17.0f, f9, 17.0f, 0.0f));
            this.f40053a[i14].setOnEditorActionListener(new da(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.Cells.y8[] y8VarArr = this.f40057f;
            y8VarArr[i16] = y8Var;
            if (i16 == 0) {
                y8Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                b.j(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                y8Var.setText(sb2.toString());
                y8VarArr[i16].setVisibility(8);
            }
            this.f40055c.addView(y8VarArr[i16], i7.f6.n(-1, -2));
        }
        org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(this.fragmentView.getContext());
        this.f40058n = y9Var;
        y9Var.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
        this.f40058n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.y9 y9Var2 = this.f40058n;
        int i17 = org.telegram.ui.ActionBar.g6.q6;
        y9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.f40058n.setOnClickListener(new View.OnClickListener(this) {
            public final l11 f37957b;

            {
                this.f37957b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37957b.V(((Integer) view.getTag()).intValue(), true, null);
                        return;
                    default:
                        l11 l11Var = this.f37957b;
                        if (l11Var.f40061w != -1) {
                            int i122 = 0;
                            while (true) {
                                String[] strArr = l11Var.f40063y;
                                if (i122 < strArr.length) {
                                    int i132 = l11Var.f40061w;
                                    if ((i132 != 0 || i122 != 4) && (i132 != 1 || (i122 != 2 && i122 != 3))) {
                                        String str = strArr[i122];
                                        if (str != null) {
                                            try {
                                                l11Var.f40053a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                l11Var.f40053a[i122].setText(l11Var.f40063y[i122]);
                                            }
                                        } else {
                                            l11Var.f40053a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor6 = l11Var.f40053a[0];
                                    editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                                    l11Var.V(l11Var.f40061w, true, new ky0(l11Var, 8));
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
        this.f40055c.addView(this.f40058n, 0, i7.f6.n(-1, -2));
        this.f40058n.setVisibility(8);
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(this.fragmentView.getContext(), (b) null);
        x6VarArr[2] = x6Var2;
        this.f40055c.addView(x6Var2, 1, i7.f6.n(-1, -2));
        x6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.y9 y9Var3 = new org.telegram.ui.Cells.y9(context);
        this.h = y9Var3;
        y9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.f40055c.addView(this.h, i7.f6.n(-1, -2));
        this.h.setOnClickListener(new t70(19, this, context));
        org.telegram.ui.Cells.x6 x6Var3 = new org.telegram.ui.Cells.x6(context, (b) null);
        x6VarArr[1] = x6Var3;
        this.f40055c.addView(x6Var3, i7.f6.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.A = 1.0f;
        U(false);
        this.v = -1;
        V(proxyInfo.type, false, null);
        this.f40061w = -1;
        this.f40062x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        rx0 rx0Var = new rx0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40054b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.y9 y9Var = this.h;
        int i12 = org.telegram.ui.ActionBar.g6.f23152i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(y9Var, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40058n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40058n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40058n, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = 0;
        while (true) {
            org.telegram.ui.Cells.h6[] h6VarArr = this.f40060s;
            if (i14 >= h6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23118g7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23135h7));
            i14++;
        }
        if (this.f40053a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f40053a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40053a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40053a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40053a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.f23189k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.f23206l6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.f23279p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.f40056e;
            if (i17 >= x6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.x6 x6Var = x6VarArr[i17];
            if (x6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(x6Var, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
            }
            i17++;
        }
        int i18 = 0;
        while (true) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.f40057f;
            if (i18 < y8VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
                i18++;
            } else {
                return arrayList;
            }
        }
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
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.F) {
            this.f40053a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f40053a[0]);
        }
    }

    public l11(SharedConfig.ProxyInfo proxyInfo) {
        super(null);
        this.f40056e = new org.telegram.ui.Cells.x6[3];
        this.f40057f = new org.telegram.ui.Cells.y8[2];
        this.f40060s = new org.telegram.ui.Cells.h6[3];
        this.v = -1;
        this.f40061w = -1;
        this.A = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new ClipboardManager.OnPrimaryClipChangedListener() {
            @Override
            public final void onPrimaryClipChanged() {
                l11.this.W();
            }
        };
        this.G = proxyInfo;
    }
}

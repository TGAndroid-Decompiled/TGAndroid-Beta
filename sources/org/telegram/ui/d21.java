package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d21 extends org.telegram.ui.ActionBar.r2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public int M;
    public EditTextBoldCursor[] f38498a;
    public a21 f38499b;
    public z11 f38500c;
    public LinearLayout d;
    public org.telegram.ui.Cells.f7[] e;
    public org.telegram.ui.Cells.i9[] f38501f;
    public org.telegram.ui.Cells.ga h;
    public org.telegram.ui.Cells.ga f38502n;
    public org.telegram.ui.ActionBar.u5 f38503r;
    public org.telegram.ui.Cells.o6[] f38504s;
    public int v;
    public ti.a f38505w;
    public String f38506x;
    public float f38507y;

    public d21() {
        super(null);
        this.e = new org.telegram.ui.Cells.f7[3];
        this.f38501f = new org.telegram.ui.Cells.i9[2];
        this.f38504s = new org.telegram.ui.Cells.o6[3];
        this.f38507y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new v11(this);
        this.J = new SharedConfig.ProxyInfo(ti.a.f49204i);
        this.I = true;
    }

    public final void V(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f38503r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f38498a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f38498a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ti.j.j(editTextBoldCursor.getText().toString())) || ti.j.d(this.f38498a[4].getText().toString()) == null)) {
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
                    this.G.addUpdateListener(new x11(this, 0));
                }
                float f7 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f38507y;
                    if (!z11) {
                        f7 = 0.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (!z11) {
                        f7 = 0.0f;
                    }
                    this.f38507y = f7;
                    TextView textView = this.h.getTextView();
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.y6.f23598q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.y6.f23768z6;
                    }
                    org.telegram.ui.ActionBar.f7.V(textView, i10, null);
                }
                this.h.setEnabled(z11);
                this.f38503r.a(z11, z10);
                this.F = z11;
            }
        }
    }

    public final void W(int i10, boolean z10, org.telegram.ui.Components.h2 h2Var) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.o6[] o6VarArr = this.f38504s;
        org.telegram.ui.Cells.i9[] i9VarArr = this.f38501f;
        if (this.v != i10) {
            this.v = i10;
            TransitionManager.endTransitions(this.f38500c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.ds.f27530f).setDuration(250L);
                if (h2Var != null) {
                    duration.addListener((Transition.TransitionListener) new c21(h2Var));
                }
                TransitionManager.beginDelayedTransition(this.f38500c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                i9VarArr[0].setVisibility(0);
                i9VarArr[1].setVisibility(8);
                ((View) this.f38498a[4].getParent()).setVisibility(8);
                ((View) this.f38498a[3].getParent()).setVisibility(0);
                ((View) this.f38498a[2].getParent()).setVisibility(0);
                ((View) this.f38498a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                i9VarArr[0].setVisibility(8);
                i9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.i9 i9Var = i9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                d3.p(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                i9Var.setText(sb2.toString());
                ((View) this.f38498a[4].getParent()).setVisibility(0);
                ((View) this.f38498a[3].getParent()).setVisibility(8);
                ((View) this.f38498a[2].getParent()).setVisibility(8);
                ((View) this.f38498a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                i9VarArr[0].setVisibility(8);
                i9VarArr[1].setVisibility(0);
                i9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f38498a[4].getParent()).setVisibility(0);
                ((View) this.f38498a[3].getParent()).setVisibility(8);
                ((View) this.f38498a[2].getParent()).setVisibility(8);
                ((View) this.f38498a[1].getParent()).setVisibility(8);
                this.f38498a[1].setText("443");
            }
            org.telegram.ui.Cells.ga gaVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            gaVar.setVisibility(i12);
            org.telegram.ui.Cells.o6 o6Var = o6VarArr[0];
            if (this.v == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            o6Var.a(z11, z10);
            org.telegram.ui.Cells.o6 o6Var2 = o6VarArr[1];
            if (this.v == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            o6Var2.a(z12, z10);
            org.telegram.ui.Cells.o6 o6Var3 = o6VarArr[2];
            if (this.v != 3) {
                z13 = false;
            }
            o6Var3.a(z13, z10);
            V(z10);
        }
    }

    public final void X() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d21.X():void");
    }

    public final void Y() {
        int x02;
        try {
            int i10 = 0;
            if (this.f38499b != null && (x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23637s8, false)) != this.M) {
                this.M = x02;
                AndroidUtilities.setScrollViewEdgeEffectColor(this.f38499b, x02);
            }
            if (this.f38498a != null) {
                org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.H6);
                org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.G6);
                org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f38498a;
                    if (i10 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.y6.H6, null);
                            org.telegram.ui.ActionBar.f7.w(this.f38498a[i10], org.telegram.ui.ActionBar.y6.G6, null);
                            org.telegram.ui.ActionBar.f7.A(this.f38498a[i10], org.telegram.ui.ActionBar.y6.L6, null);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23430h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.i9[] i9VarArr = this.f38501f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.f7[] f7VarArr = this.e;
        org.telegram.ui.Cells.o6[] o6VarArr = this.f38504s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new y11(this));
        this.f38503r = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f38500c = new org.telegram.ui.Components.gp0(context);
        ?? hp0Var = new org.telegram.ui.Components.hp0(context, this.f38500c, this.resourceProvider, true);
        this.f38499b = hp0Var;
        hp0Var.setDrawBackground(true);
        this.f38499b.setFillViewport(true);
        this.f38499b.setOverScrollMode(0);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f38499b, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23637s8, false));
        int i11 = -1;
        frameLayout.addView(this.f38499b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f38500c.setOrientation(1);
        this.f38499b.addView(this.f38500c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final d21 f44487b;

            {
                this.f44487b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f44487b.W(ti.a.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        d21 d21Var = this.f44487b;
                        ti.a aVar = d21Var.f38505w;
                        if (aVar != null) {
                            int i12 = aVar.f49205a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f38498a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = d21Var.f38505w.f49206b;
                                        } else if (i13 == 1) {
                                            int i14 = d21Var.f38505w.f49207c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = d21Var.f38505w.d;
                                        } else if (i13 == 3) {
                                            str = d21Var.f38505w.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = d21Var.f38505w.f49208f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                d21Var.f38498a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                d21Var.f38498a[i13].setText(str);
                                            }
                                        } else {
                                            d21Var.f38498a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    d21Var.W(i12, true, new org.telegram.ui.Components.h2(d21Var, i12, 28));
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
        int i12 = 0;
        while (i12 < 3) {
            int e = ti.a.e(i12);
            org.telegram.ui.Cells.o6 o6Var = new org.telegram.ui.Cells.o6(context, null);
            o6VarArr[i12] = o6Var;
            org.telegram.ui.ActionBar.f7.R(o6Var, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.f23357d6), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.f23449i6), null);
            o6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.o6 o6Var2 = o6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (e == this.v) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o6Var2.c(string, z12, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.o6 o6Var3 = o6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (e == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                o6Var3.c(string2, z11, true);
            } else {
                org.telegram.ui.Cells.o6 o6Var4 = o6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (e == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o6Var4.c(string3, z10, false);
            }
            this.f38500c.addView(o6VarArr[i12], org.telegram.ui.Components.kb1.r(-1, 50));
            o6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
            i11 = -1;
        }
        org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        f7VarArr[0] = f7Var;
        this.f38500c.addView(f7Var, org.telegram.ui.Components.kb1.r(i11, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f38500c.addView(this.d, org.telegram.ui.Components.kb1.r(-1, -2));
        this.f38498a = new EditTextBoldCursor[5];
        int i13 = 0;
        for (int i14 = 5; i13 < i14; i14 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, org.telegram.ui.Components.kb1.r(-1, 64));
            this.f38498a[i13] = new EditTextBoldCursor(context);
            this.f38498a[i13].setTag(Integer.valueOf(i13));
            this.f38498a[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.B(this.f38498a[i13], org.telegram.ui.ActionBar.y6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.f38498a[i13];
            int i15 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i15, null);
            this.f38498a[i13].setBackground(null);
            org.telegram.ui.ActionBar.f7.w(this.f38498a[i13], i15, null);
            this.f38498a[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f38498a[i13].setCursorWidth(1.5f);
            this.f38498a[i13].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f38498a[i13];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            org.telegram.ui.ActionBar.f7.A(this.f38498a[i13], org.telegram.ui.ActionBar.y6.L6, null);
            this.f38498a[i13].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.f7.G(this.f38498a[i13], org.telegram.ui.ActionBar.y6.f23485k6, org.telegram.ui.ActionBar.y6.f23503l6, org.telegram.ui.ActionBar.y6.f23582p7, null);
            if (i13 == 0) {
                this.f38498a[i13].setInputType(524305);
                this.f38498a[i13].addTextChangedListener(new b21(this, 0));
            } else if (i13 == 1) {
                this.f38498a[i13].setInputType(2);
                this.f38498a[i13].addTextChangedListener(new b21(this, 1));
            } else if (i13 == 3) {
                this.f38498a[i13].setInputType(129);
                this.f38498a[i13].setTypeface(Typeface.DEFAULT);
                this.f38498a[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f38498a[i13].setInputType(524289);
            }
            if (i13 == 4) {
                this.f38498a[i13].addTextChangedListener(new b21(this, 2));
            }
            this.f38498a[i13].setImeOptions(268435461);
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                this.f38498a[i13].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f38498a[i13].setText(proxyInfo.settings.f49208f);
                            }
                        } else {
                            this.f38498a[i13].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f38498a[i13].setText(proxyInfo.settings.e);
                        }
                    } else {
                        this.f38498a[i13].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f38498a[i13].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f38498a[i13].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f38498a[i13].setText(Integer.toString(proxyInfo.settings.f49207c));
                }
            } else {
                this.f38498a[i13].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f38498a[i13].setText(proxyInfo.settings.f49206b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f38498a[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f38498a[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f38498a[i13];
            if (i13 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 17.0f, f7, 17.0f, 0.0f));
            this.f38498a[i13].setOnEditorActionListener(new la(this, 10));
            i13++;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            i9VarArr[i16] = i9Var;
            if (i16 == 0) {
                i9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                d3.p(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                i9Var.setText(sb2.toString());
                i9VarArr[i16].setVisibility(8);
            }
            this.f38500c.addView(i9VarArr[i16], org.telegram.ui.Components.kb1.r(-1, -2));
        }
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(this.fragmentView.getContext());
        this.f38502n = gaVar;
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
        int i17 = org.telegram.ui.ActionBar.y6.f23357d6;
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i17);
        int i18 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i18);
        gaVar.setBackground(M0);
        org.telegram.ui.ActionBar.f7.k(gaVar, M0, N, N2, null);
        this.f38502n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        TextView textView = this.f38502n.getTextView();
        int i19 = org.telegram.ui.ActionBar.y6.f23598q6;
        org.telegram.ui.ActionBar.f7.V(textView, i19, null);
        this.f38502n.setOnClickListener(new View.OnClickListener(this) {
            public final d21 f44487b;

            {
                this.f44487b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f44487b.W(ti.a.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        d21 d21Var = this.f44487b;
                        ti.a aVar = d21Var.f38505w;
                        if (aVar != null) {
                            int i122 = aVar.f49205a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f38498a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = d21Var.f38505w.f49206b;
                                        } else if (i132 == 1) {
                                            int i142 = d21Var.f38505w.f49207c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = d21Var.f38505w.d;
                                        } else if (i132 == 3) {
                                            str = d21Var.f38505w.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = d21Var.f38505w.f49208f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                d21Var.f38498a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                d21Var.f38498a[i132].setText(str);
                                            }
                                        } else {
                                            d21Var.f38498a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    d21Var.W(i122, true, new org.telegram.ui.Components.h2(d21Var, i122, 28));
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
        this.f38500c.addView(this.f38502n, 0, org.telegram.ui.Components.kb1.r(-1, -2));
        this.f38502n.setVisibility(8);
        org.telegram.ui.Cells.f7 f7Var2 = new org.telegram.ui.Cells.f7(this.fragmentView.getContext(), (d3) null);
        f7VarArr[2] = f7Var2;
        this.f38500c.addView(f7Var2, 1, org.telegram.ui.Components.kb1.r(-1, -2));
        f7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context);
        this.h = gaVar2;
        org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.y6.M0(true);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i17);
        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i18);
        gaVar2.setBackground(M02);
        org.telegram.ui.ActionBar.f7.k(gaVar2, M02, N3, N4, null);
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        org.telegram.ui.ActionBar.f7.V(this.h.getTextView(), i19, null);
        this.f38500c.addView(this.h, org.telegram.ui.Components.kb1.r(-1, -2));
        this.h.setOnClickListener(new zd0(12, this, context));
        org.telegram.ui.Cells.f7 f7Var3 = new org.telegram.ui.Cells.f7(context, (d3) null);
        f7VarArr[1] = f7Var3;
        this.f38500c.addView(f7Var3, org.telegram.ui.Components.kb1.r(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f38507y = 1.0f;
        V(false);
        this.v = 0;
        W(proxyInfo.settings.f49205a, false, null);
        this.f38505w = null;
        this.f38506x = null;
        X();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.hp0 getScrollViewForSimpleGlass() {
        return this.f38499b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38499b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23637s8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
        for (int i10 = 0; i10 < this.f38504s.length; i10++) {
        }
        if (this.f38498a != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f38498a;
                if (i11 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursorArr[i11], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.f38498a[i11], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L6));
                i11++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23357d6));
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.f7[] f7VarArr = this.e;
            if (i12 >= f7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.f7 f7Var = f7VarArr[i12];
            i12++;
        }
        for (int i13 = 0; i13 < this.f38501f.length; i13++) {
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
        X();
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                TextView textView = this.h.getTextView();
                if (this.F) {
                    i10 = org.telegram.ui.ActionBar.y6.f23598q6;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.f23768z6;
                }
                org.telegram.ui.ActionBar.f7.V(textView, i10, null);
            }
            Y();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.f38498a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f38498a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

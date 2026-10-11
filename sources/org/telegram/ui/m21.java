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
public final class m21 extends org.telegram.ui.ActionBar.m2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public EditTextBoldCursor[] f39827a;
    public j21 f39828b;
    public i21 f39829c;
    public LinearLayout d;
    public org.telegram.ui.Cells.b7[] f39830e;
    public org.telegram.ui.Cells.e9[] f39831f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.ca f39832n;
    public org.telegram.ui.ActionBar.u0 f39833r;
    public org.telegram.ui.Cells.k6[] f39834s;
    public int v;
    public pi.b f39835w;
    public String f39836x;
    public float f39837y;

    public m21() {
        super(null);
        this.f39830e = new org.telegram.ui.Cells.b7[3];
        this.f39831f = new org.telegram.ui.Cells.e9[2];
        this.f39834s = new org.telegram.ui.Cells.k6[3];
        this.f39837y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new f21(this);
        this.J = new SharedConfig.ProxyInfo(pi.b.f45957i);
        this.I = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f39833r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f39827a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f39827a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(pi.k.j(editTextBoldCursor.getText().toString())) || pi.k.d(this.f39827a[4].getText().toString()) == null)) {
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
                    this.G.addUpdateListener(new x11(this, 1));
                }
                float f7 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f39837y;
                    if (z11) {
                        f7 = 1.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    this.f39837y = f7;
                    org.telegram.ui.Cells.ca caVar = this.h;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.h6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21225z6;
                    }
                    caVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    org.telegram.ui.ActionBar.u0 u0Var = this.f39833r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    u0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f39833r.setEnabled(z11);
                this.F = z11;
            }
        }
    }

    public final void V(int i10, boolean z10, org.telegram.ui.Components.nd ndVar) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f39834s;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f39831f;
        if (this.v != i10) {
            this.v = i10;
            TransitionManager.endTransitions(this.f39829c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.is.f27500f).setDuration(250L);
                if (ndVar != null) {
                    duration.addListener((Transition.TransitionListener) new l21(ndVar));
                }
                TransitionManager.beginDelayedTransition(this.f39829c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                e9VarArr[0].setVisibility(0);
                e9VarArr[1].setVisibility(8);
                ((View) this.f39827a[4].getParent()).setVisibility(8);
                ((View) this.f39827a[3].getParent()).setVisibility(0);
                ((View) this.f39827a[2].getParent()).setVisibility(0);
                ((View) this.f39827a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.e9 e9Var = e9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                ((View) this.f39827a[4].getParent()).setVisibility(0);
                ((View) this.f39827a[3].getParent()).setVisibility(8);
                ((View) this.f39827a[2].getParent()).setVisibility(8);
                ((View) this.f39827a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                e9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f39827a[4].getParent()).setVisibility(0);
                ((View) this.f39827a[3].getParent()).setVisibility(8);
                ((View) this.f39827a[2].getParent()).setVisibility(8);
                ((View) this.f39827a[1].getParent()).setVisibility(8);
                this.f39827a[1].setText("443");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m21.W():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f39831f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.b7[] b7VarArr = this.f39830e;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f39834s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new h21(this));
        org.telegram.ui.ActionBar.u0 g10 = this.actionBar.o().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f39833r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false));
        this.f39829c = new xd(context);
        ?? fp0Var = new org.telegram.ui.Components.fp0(context, this.f39829c, this.resourceProvider, true);
        this.f39828b = fp0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.fp0) fp0Var);
        this.f39828b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f39828b, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21101s8, false));
        int i11 = -1;
        frameLayout.addView(this.f39828b, w7.x5.d(-1.0f, -1));
        this.f39829c.setOrientation(1);
        this.f39828b.addView(this.f39829c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final m21 f37892b;

            {
                this.f37892b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f37892b.V(pi.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        m21 m21Var = this.f37892b;
                        pi.b bVar = m21Var.f39835w;
                        if (bVar != null) {
                            int i12 = bVar.f45958a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = m21Var.f39827a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = m21Var.f39835w.f45959b;
                                        } else if (i13 == 1) {
                                            int i14 = m21Var.f39835w.f45960c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = m21Var.f39835w.d;
                                        } else if (i13 == 3) {
                                            str = m21Var.f39835w.f45961e;
                                        } else {
                                            if (i13 == 4) {
                                                str = m21Var.f39835w.f45962f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                m21Var.f39827a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                m21Var.f39827a[i13].setText(str);
                                            }
                                        } else {
                                            m21Var.f39827a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    m21Var.V(i12, true, new org.telegram.ui.Components.nd(m21Var, i12, 26));
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
            int e7 = pi.b.e(i12);
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
            k6VarArr[i12] = k6Var;
            k6Var.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
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
            this.f39829c.addView(k6VarArr[i12], w7.x5.n(-1, 50));
            k6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        b7VarArr[0] = b7Var;
        this.f39829c.addView(b7Var, w7.x5.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f39829c.addView(this.d, w7.x5.n(-1, -2));
        int i13 = 5;
        this.f39827a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.x5.n(i11, 64));
            this.f39827a[i14] = new EditTextBoldCursor(context);
            this.f39827a[i14].setTag(Integer.valueOf(i14));
            this.f39827a[i14].setTextSize(1, 16.0f);
            this.f39827a[i14].setHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f39827a[i14];
            int i15 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            this.f39827a[i14].setBackground(null);
            this.f39827a[i14].setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            this.f39827a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f39827a[i14].setCursorWidth(1.5f);
            this.f39827a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f39827a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f39827a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L6, false));
            this.f39827a[i14].setTransformHintToHeader(true);
            this.f39827a[i14].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20950k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20968l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21043p7, false));
            if (i14 == 0) {
                this.f39827a[i14].setInputType(524305);
                this.f39827a[i14].addTextChangedListener(new k21(this, 0));
            } else if (i14 == 1) {
                this.f39827a[i14].setInputType(2);
                this.f39827a[i14].addTextChangedListener(new k21(this, 1));
            } else if (i14 == 3) {
                this.f39827a[i14].setInputType(129);
                this.f39827a[i14].setTypeface(Typeface.DEFAULT);
                this.f39827a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f39827a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f39827a[i14].addTextChangedListener(new k21(this, 2));
            }
            this.f39827a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f39827a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f39827a[i14].setText(proxyInfo.settings.f45962f);
                            }
                        } else {
                            this.f39827a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f39827a[i14].setText(proxyInfo.settings.f45961e);
                        }
                    } else {
                        this.f39827a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f39827a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f39827a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f39827a[i14].setText(Integer.toString(proxyInfo.settings.f45960c));
                }
            } else {
                this.f39827a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f39827a[i14].setText(proxyInfo.settings.f45959b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f39827a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f39827a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f39827a[i14];
            if (i14 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.x5.a(-1.0f, 17.0f, f7, 17.0f, 0.0f, -1, 51));
            this.f39827a[i14].setOnEditorActionListener(new ia(this, 10));
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
            this.f39829c.addView(e9VarArr[i16], w7.x5.n(-1, -2));
        }
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(this.fragmentView.getContext());
        this.f39832n = caVar;
        caVar.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
        this.f39832n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ca caVar2 = this.f39832n;
        int i17 = org.telegram.ui.ActionBar.h6.q6;
        caVar2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.f39832n.setOnClickListener(new View.OnClickListener(this) {
            public final m21 f37892b;

            {
                this.f37892b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f37892b.V(pi.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        m21 m21Var = this.f37892b;
                        pi.b bVar = m21Var.f39835w;
                        if (bVar != null) {
                            int i122 = bVar.f45958a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = m21Var.f39827a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = m21Var.f39835w.f45959b;
                                        } else if (i132 == 1) {
                                            int i142 = m21Var.f39835w.f45960c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = m21Var.f39835w.d;
                                        } else if (i132 == 3) {
                                            str = m21Var.f39835w.f45961e;
                                        } else {
                                            if (i132 == 4) {
                                                str = m21Var.f39835w.f45962f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                m21Var.f39827a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                m21Var.f39827a[i132].setText(str);
                                            }
                                        } else {
                                            m21Var.f39827a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    m21Var.V(i122, true, new org.telegram.ui.Components.nd(m21Var, i122, 26));
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
        this.f39829c.addView(this.f39832n, 0, w7.x5.n(-1, -2));
        this.f39832n.setVisibility(8);
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(this.fragmentView.getContext(), (org.telegram.ui.Cells.c1) null);
        b7VarArr[2] = b7Var2;
        this.f39829c.addView(b7Var2, 1, w7.x5.n(-1, -2));
        b7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ca caVar3 = new org.telegram.ui.Cells.ca(context);
        this.h = caVar3;
        caVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.f39829c.addView(this.h, w7.x5.n(-1, -2));
        this.h.setOnClickListener(new uy0(1, this, context));
        org.telegram.ui.Cells.b7 b7Var3 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        b7VarArr[1] = b7Var3;
        this.f39829c.addView(b7Var3, w7.x5.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f39837y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f45958a, false, null);
        this.f39835w = null;
        this.f39836x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.e9[] e9VarArr = this.f39831f;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f39834s;
        vy0 vy0Var = new vy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20766a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21101s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39828b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21156v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.h6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39829c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20944k0, null, null, org.telegram.ui.ActionBar.h6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.ca caVar = this.h;
        int i12 = org.telegram.ui.ActionBar.h6.f20913i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(caVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, vy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, vy0Var, org.telegram.ui.ActionBar.h6.f21225z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39832n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39832n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39832n, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < k6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(k6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.h6.f20822d6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(k6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.h6.f20913i6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(k6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(k6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20879g7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(k6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20895h7));
        }
        if (this.f39827a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f39827a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.h6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39827a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39827a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.h6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39827a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.f20950k6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.f20968l6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.f21043p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.b7[] b7VarArr = this.f39830e;
            if (i17 >= b7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.b7 b7Var = b7VarArr[i17];
            if (b7Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(b7Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < e9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(e9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786b7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(e9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(e9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
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
            this.f39827a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f39827a[0]);
        }
    }
}

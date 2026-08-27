package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
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
import android.widget.ScrollView;
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

public final class j11 extends org.telegram.ui.ActionBar.n2 {
    public float A;
    public float[] B;
    public boolean C;
    public ValueAnimator D;
    public ClipboardManager E;
    public final boolean F;
    public SharedConfig.ProxyInfo G;
    public boolean H;
    public ClipboardManager.OnPrimaryClipChangedListener I;

    public EditTextBoldCursor[] f39223a;

    public ScrollView f39224b;

    public LinearLayout f39225c;
    public LinearLayout d;

    public org.telegram.ui.Cells.w6[] f39226e;

    public org.telegram.ui.Cells.x8[] f39227f;
    public org.telegram.ui.Cells.x9 h;

    public org.telegram.ui.Cells.x9 f39228n;

    public org.telegram.ui.ActionBar.v0 f39229r;

    public org.telegram.ui.Cells.g6[] f39230s;
    public int v;

    public int f39231w;

    public String f39232x;

    public String[] f39233y;

    public j11() {
        super(null);
        this.f39226e = new org.telegram.ui.Cells.w6[3];
        this.f39227f = new org.telegram.ui.Cells.x8[2];
        this.f39230s = new org.telegram.ui.Cells.g6[2];
        this.v = -1;
        this.f39231w = -1;
        this.A = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new e11(this);
        this.G = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.F = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.f39229r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.f39223a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z11 = (editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f39223a[1].getText().toString()).intValue() == 0) ? false : true;
        if (this.C != z11) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z10) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.D = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(200L);
                this.D.addUpdateListener(new w01(this, 1));
            }
            if (z10) {
                float[] fArr = this.B;
                fArr[0] = this.A;
                fArr[1] = z11 ? 1.0f : 0.0f;
                this.D.start();
            } else {
                this.A = z11 ? 1.0f : 0.0f;
                this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, z11 ? org.telegram.ui.ActionBar.g6.q6 : org.telegram.ui.ActionBar.g6.f23441z6, false));
                this.f39229r.setAlpha(z11 ? 1.0f : 0.5f);
            }
            this.h.setEnabled(z11);
            this.f39229r.setEnabled(z11);
            this.C = z11;
        }
    }

    public final void V(int i10, boolean z10, ky0 ky0Var) {
        org.telegram.ui.Cells.g6[] g6VarArr = this.f39230s;
        org.telegram.ui.Cells.x8[] x8VarArr = this.f39227f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f39225c);
            }
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.er.f28122f).setDuration(250L);
                if (ky0Var != null) {
                    duration.addListener((Transition.TransitionListener) new i11(ky0Var));
                }
                TransitionManager.beginDelayedTransition(this.f39225c, duration);
            }
            int i11 = this.v;
            if (i11 == 0) {
                x8VarArr[0].setVisibility(0);
                x8VarArr[1].setVisibility(8);
                ((View) this.f39223a[4].getParent()).setVisibility(8);
                ((View) this.f39223a[3].getParent()).setVisibility(0);
                ((View) this.f39223a[2].getParent()).setVisibility(0);
            } else if (i11 == 1) {
                x8VarArr[0].setVisibility(8);
                x8VarArr[1].setVisibility(0);
                ((View) this.f39223a[4].getParent()).setVisibility(0);
                ((View) this.f39223a[3].getParent()).setVisibility(8);
                ((View) this.f39223a[2].getParent()).setVisibility(8);
            }
            g6VarArr[0].a(this.v == 0, z10);
            g6VarArr[1].a(this.v == 1, z10);
        }
    }

    public final void W() {
        String string;
        org.telegram.ui.Cells.w6[] w6VarArr = this.f39226e;
        ClipData primaryClip = this.E.getPrimaryClip();
        String[] strArrSplit = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            string = null;
        } else {
            try {
                string = primaryClip.getItemAt(0).coerceToText(this.fragmentView.getContext()).toString();
            } catch (Exception unused) {
                string = null;
            }
        }
        if (TextUtils.equals(string, this.f39232x)) {
            return;
        }
        this.f39231w = -1;
        this.f39232x = string;
        this.f39233y = new String[this.f39223a.length];
        if (string != null) {
            String[] strArr = {"t.me/socks?", "tg://socks?"};
            for (int i10 = 0; i10 < 2; i10++) {
                int iIndexOf = string.indexOf(strArr[i10]);
                if (iIndexOf >= 0) {
                    this.f39231w = 0;
                    strArrSplit = string.substring(strArr[i10].length() + iIndexOf).split("&");
                    break;
                }
            }
            if (strArrSplit == null) {
                String[] strArr2 = {"t.me/proxy?", "tg://proxy?"};
                for (int i11 = 0; i11 < 2; i11++) {
                    int iIndexOf2 = string.indexOf(strArr2[i11]);
                    if (iIndexOf2 >= 0) {
                        this.f39231w = 1;
                        strArrSplit = string.substring(strArr2[i11].length() + iIndexOf2).split("&");
                        break;
                    }
                }
            }
            if (strArrSplit != null) {
                for (String str : strArrSplit) {
                    String[] strArrSplit2 = str.split("=");
                    if (strArrSplit2.length == 2) {
                        String lowerCase = strArrSplit2[0].toLowerCase();
                        lowerCase.getClass();
                        switch (lowerCase) {
                            case "secret":
                                if (this.f39231w == 1) {
                                    this.f39233y[4] = strArrSplit2[1];
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "server":
                                this.f39233y[0] = strArrSplit2[1];
                                break;
                            case "pass":
                                if (this.f39231w == 0) {
                                    this.f39233y[3] = strArrSplit2[1];
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "port":
                                this.f39233y[1] = strArrSplit2[1];
                                break;
                            case "user":
                                if (this.f39231w == 0) {
                                    this.f39233y[2] = strArrSplit2[1];
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    }
                }
            }
        }
        if (this.f39231w != -1) {
            if (this.f39228n.getVisibility() != 0) {
                this.f39228n.setVisibility(0);
                w6VarArr[2].setVisibility(0);
                return;
            }
            return;
        }
        if (this.f39228n.getVisibility() != 8) {
            this.f39228n.setVisibility(8);
            w6VarArr[2].setVisibility(8);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Cells.x8[] x8VarArr = this.f39227f;
        SharedConfig.ProxyInfo proxyInfo = this.G;
        org.telegram.ui.Cells.g6[] g6VarArr = this.f39230s;
        org.telegram.ui.Cells.w6[] w6VarArr = this.f39226e;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new g11(this));
        org.telegram.ui.ActionBar.v0 v0VarG = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f39229r = v0VarG;
        v0VarG.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        ScrollView scrollView = new ScrollView(context);
        this.f39224b = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f39224b, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, false));
        int i10 = -1;
        frameLayout.addView(this.f39224b, h7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39225c = linearLayout;
        linearLayout.setOrientation(1);
        this.f39224b.addView(this.f39225c, new FrameLayout.LayoutParams(-1, -2));
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) {

            public final j11 f37906b;

            {
                this.f37906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f37906b.V(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        j11 j11Var = this.f37906b;
                        if (j11Var.f39231w != -1) {
                            int i12 = 0;
                            while (true) {
                                String[] strArr = j11Var.f39233y;
                                if (i12 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = j11Var.f39223a[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    j11Var.V(j11Var.f39231w, true, new ky0(j11Var, 8));
                                } else {
                                    int i13 = j11Var.f39231w;
                                    if ((i13 != 0 || i12 != 4) && (i13 != 1 || (i12 != 2 && i12 != 3))) {
                                        String str = strArr[i12];
                                        if (str != null) {
                                            try {
                                                j11Var.f39223a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                j11Var.f39223a[i12].setText(j11Var.f39233y[i12]);
                                            }
                                        } else {
                                            j11Var.f39223a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i12 = 0;
        while (i12 < 2) {
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
            g6VarArr[i12] = g6Var;
            g6Var.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
            g6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                g6VarArr[i12].c(LocaleController.getString(R.string.UseProxySocks5), i12 == this.v, true);
            } else {
                g6VarArr[i12].c(LocaleController.getString(R.string.UseProxyTelegram), i12 == this.v, false);
            }
            this.f39225c.addView(g6VarArr[i12], h7.z5.n(-1, 50));
            g6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
        }
        org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        w6VarArr[0] = w6Var;
        this.f39225c.addView(w6Var, h7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f39225c.addView(this.d, h7.z5.n(-1, -2));
        int i13 = 5;
        this.f39223a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, h7.z5.n(i10, 64));
            this.f39223a[i14] = new EditTextBoldCursor(context);
            this.f39223a[i14].setTag(Integer.valueOf(i14));
            this.f39223a[i14].setTextSize(1, 16.0f);
            this.f39223a[i14].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f39223a[i14];
            int i15 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.f39223a[i14].setBackground(null);
            this.f39223a[i14].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.f39223a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f39223a[i14].setCursorWidth(1.5f);
            this.f39223a[i14].setSingleLine(true);
            this.f39223a[i14].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.f39223a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
            this.f39223a[i14].setTransformHintToHeader(true);
            this.f39223a[i14].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
            if (i14 == 0) {
                this.f39223a[i14].setInputType(524305);
                this.f39223a[i14].addTextChangedListener(new h11(this, 0));
            } else if (i14 == 1) {
                this.f39223a[i14].setInputType(2);
                this.f39223a[i14].addTextChangedListener(new h11(this, 1));
            } else if (i14 == 3) {
                this.f39223a[i14].setInputType(129);
                this.f39223a[i14].setTypeface(Typeface.DEFAULT);
                this.f39223a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f39223a[i14].setInputType(524289);
            }
            this.f39223a[i14].setImeOptions(268435461);
            if (i14 == 0) {
                this.f39223a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f39223a[i14].setText(proxyInfo.address);
            } else if (i14 == 1) {
                this.f39223a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                this.f39223a[i14].setText("" + proxyInfo.port);
            } else if (i14 == 2) {
                this.f39223a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                this.f39223a[i14].setText(proxyInfo.username);
            } else if (i14 == 3) {
                this.f39223a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                this.f39223a[i14].setText(proxyInfo.password);
            } else if (i14 == 4) {
                this.f39223a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                this.f39223a[i14].setText(proxyInfo.secret);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f39223a[i14];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.f39223a[i14].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.f39223a[i14], h7.z5.d(-1, -1.0f, 51, 17.0f, i14 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.f39223a[i14].setOnEditorActionListener(new fa(this, 10));
            i14++;
            i13 = 5;
            i10 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8VarArr[i16] = x8Var;
            x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            if (i16 == 0) {
                x8VarArr[i16].setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                org.telegram.ui.Cells.x8 x8Var2 = x8VarArr[i16];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.rl.j(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                x8Var2.setText(sb2.toString());
                x8VarArr[i16].setVisibility(8);
            }
            this.f39225c.addView(x8VarArr[i16], h7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(this.fragmentView.getContext());
        this.f39228n = x9Var;
        x9Var.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
        this.f39228n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.x9 x9Var2 = this.f39228n;
        int i17 = org.telegram.ui.ActionBar.g6.q6;
        x9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        final int i18 = 1;
        this.f39228n.setOnClickListener(new View.OnClickListener(this) {

            public final j11 f37906b;

            {
                this.f37906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.f37906b.V(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        j11 j11Var = this.f37906b;
                        if (j11Var.f39231w != -1) {
                            int i19 = 0;
                            while (true) {
                                String[] strArr = j11Var.f39233y;
                                if (i19 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = j11Var.f39223a[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    j11Var.V(j11Var.f39231w, true, new ky0(j11Var, 8));
                                } else {
                                    int i110 = j11Var.f39231w;
                                    if ((i110 != 0 || i19 != 4) && (i110 != 1 || (i19 != 2 && i19 != 3))) {
                                        String str = strArr[i19];
                                        if (str != null) {
                                            try {
                                                j11Var.f39223a[i19].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                j11Var.f39223a[i19].setText(j11Var.f39233y[i19]);
                                            }
                                        } else {
                                            j11Var.f39223a[i19].setText((CharSequence) null);
                                        }
                                    }
                                    i19++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.f39225c.addView(this.f39228n, 0, h7.z5.n(-1, -2));
        this.f39228n.setVisibility(8);
        org.telegram.ui.Cells.w6 w6Var2 = new org.telegram.ui.Cells.w6(this.fragmentView.getContext(), (org.telegram.messenger.rl) null);
        w6VarArr[2] = w6Var2;
        Context context2 = this.fragmentView.getContext();
        int i19 = R.drawable.greydivider_bottom;
        int i20 = org.telegram.ui.ActionBar.g6.f23018b7;
        w6Var2.setBackground(org.telegram.ui.ActionBar.g6.V0(context2, i19, i20));
        this.f39225c.addView(w6VarArr[2], 1, h7.z5.n(-1, -2));
        w6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context);
        this.h = x9Var3;
        x9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.f39225c.addView(this.h, h7.z5.n(-1, -2));
        this.h.setOnClickListener(new u70(19, this, context));
        org.telegram.ui.Cells.w6 w6Var3 = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        w6VarArr[1] = w6Var3;
        w6Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i20));
        this.f39225c.addView(w6VarArr[1], h7.z5.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.A = 1.0f;
        U(false);
        this.v = -1;
        V(!TextUtils.isEmpty(proxyInfo.secret) ? 1 : 0, false, null);
        this.f39231w = -1;
        this.f39232x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.x8[] x8VarArr = this.f39227f;
        org.telegram.ui.Cells.g6[] g6VarArr = this.f39230s;
        sx0 sx0Var = new sx0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39224b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39225c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.x9 x9Var = this.h;
        int i12 = org.telegram.ui.ActionBar.g6.f23144i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x9Var, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39228n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39228n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39228n, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < g6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(g6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(g6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(g6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(g6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23109g7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(g6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23126h7));
        }
        if (this.f39223a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f39223a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39223a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39223a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39223a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.f23181k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.f23198l6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.f23269p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.w6[] w6VarArr = this.f39226e;
            if (i17 >= w6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.w6 w6Var = w6VarArr[i17];
            if (w6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(w6Var, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < x8VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
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
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.F) {
            this.f39223a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f39223a[0]);
        }
    }
}

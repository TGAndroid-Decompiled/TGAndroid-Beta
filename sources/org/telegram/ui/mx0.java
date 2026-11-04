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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mx0 extends org.telegram.ui.ActionBar.d2 {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public org.telegram.messenger.zy K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] f47810a;
    public jx0 f47811b;
    public ix0 f47812c;
    public LinearLayout d;
    public org.telegram.ui.Cells.x6[] f47813e;
    public org.telegram.ui.Cells.y8[] f47814f;
    public org.telegram.ui.Cells.v9 h;
    public org.telegram.ui.Cells.v9 f47815n;
    public org.telegram.ui.ActionBar.b5 f47816r;
    public org.telegram.ui.Cells.h6[] f47817s;
    public int f47818w;
    public ui.a f47819x;
    public String f47820y;

    public mx0() {
        super(null);
        this.f47813e = new org.telegram.ui.Cells.x6[3];
        this.f47814f = new org.telegram.ui.Cells.y8[2];
        this.f47817s = new org.telegram.ui.Cells.h6[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new gx0(this);
        this.K = new org.telegram.messenger.zy(ui.a.f56370i);
        this.J = true;
    }

    public final void Z(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i3;
        if (this.h != null && this.f47816r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f47810a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.f47818w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.f47810a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ui.j.l(editTextBoldCursor.getText().toString())) || ui.j.f(this.f47810a[4].getText().toString()) == null)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.G != z11) {
                ValueAnimator valueAnimator = this.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.H = ofFloat;
                    ofFloat.setDuration(200L);
                    this.H.addUpdateListener(new b3(this, 29));
                }
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.F;
                    fArr[0] = this.E;
                    if (!z11) {
                        f10 = 0.0f;
                    }
                    fArr[1] = f10;
                    this.H.start();
                } else {
                    if (!z11) {
                        f10 = 0.0f;
                    }
                    this.E = f10;
                    TextView textView = this.h.getTextView();
                    if (z11) {
                        i3 = org.telegram.ui.ActionBar.k6.f28121q6;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.f28290z6;
                    }
                    org.telegram.ui.ActionBar.r6.V(textView, i3, null);
                }
                this.h.setEnabled(z11);
                this.f47816r.a(z11, z10);
                this.G = z11;
            }
        }
    }

    public final void a0(int i3, boolean z10, org.telegram.ui.Components.o2 o2Var) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.h6[] h6VarArr = this.f47817s;
        org.telegram.ui.Cells.y8[] y8VarArr = this.f47814f;
        if (this.f47818w != i3) {
            this.f47818w = i3;
            TransitionManager.endTransitions(this.f47812c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.xq.f40452f).setDuration(250L);
                if (o2Var != null) {
                    duration.addListener((Transition.TransitionListener) new lx0(o2Var));
                }
                TransitionManager.beginDelayedTransition(this.f47812c, duration);
            }
            int i10 = this.f47818w;
            if (i10 == 1) {
                y8VarArr[0].setVisibility(0);
                y8VarArr[1].setVisibility(8);
                ((View) this.f47810a[4].getParent()).setVisibility(8);
                ((View) this.f47810a[3].getParent()).setVisibility(0);
                ((View) this.f47810a[2].getParent()).setVisibility(0);
                ((View) this.f47810a[1].getParent()).setVisibility(0);
            } else if (i10 == 2) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.y8 y8Var = y8VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743787, sb2, "\n\n");
                sb2.append(org.telegram.messenger.bd.M0(2131743786, null));
                y8Var.setText(sb2.toString());
                ((View) this.f47810a[4].getParent()).setVisibility(0);
                ((View) this.f47810a[3].getParent()).setVisibility(8);
                ((View) this.f47810a[2].getParent()).setVisibility(8);
                ((View) this.f47810a[1].getParent()).setVisibility(0);
            } else if (i10 == 3) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                y8VarArr[1].setText(org.telegram.messenger.bd.M0(2131743782, null));
                ((View) this.f47810a[4].getParent()).setVisibility(0);
                ((View) this.f47810a[3].getParent()).setVisibility(8);
                ((View) this.f47810a[2].getParent()).setVisibility(8);
                ((View) this.f47810a[1].getParent()).setVisibility(8);
                this.f47810a[1].setText("443");
            }
            org.telegram.ui.Cells.h6 h6Var = h6VarArr[0];
            if (this.f47818w == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            h6Var.a(z11, z10);
            org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[1];
            if (this.f47818w == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            h6Var2.a(z12, z10);
            org.telegram.ui.Cells.h6 h6Var3 = h6VarArr[2];
            if (this.f47818w != 3) {
                z13 = false;
            }
            h6Var3.a(z13, z10);
            Z(z10);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    public final void b0(Context context, String str) {
        org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(context, org.telegram.messenger.bd.M0(2131745458, null), str, org.telegram.messenger.bd.M0(2131746512, null), true);
        og0Var.f36827o1.setImageBitmap(org.telegram.messenger.kz.e(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.y2(null, 2131624168)));
        showDialog(og0Var);
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mx0.c0():void");
    }

    @Override
    public final View createView(Context context) {
        int i3;
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.y8[] y8VarArr = this.f47814f;
        org.telegram.messenger.zy zyVar = this.K;
        org.telegram.ui.Cells.x6[] x6VarArr = this.f47813e;
        org.telegram.ui.Cells.h6[] h6VarArr = this.f47817s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746612, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 5));
        this.f47816r = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f47812c = new org.telegram.ui.Components.jm0(context);
        ?? km0Var = new org.telegram.ui.Components.km0(context, this.f47812c, this.resourceProvider, true);
        this.f47811b = km0Var;
        km0Var.setDrawBackground(true);
        this.f47811b.setFillViewport(true);
        this.f47811b.setOverScrollMode(0);
        org.telegram.messenger.g0.z3(this.f47811b, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28160s8, false));
        int i10 = -1;
        frameLayout.addView(this.f47811b, b8.mf.c(-1.0f, -1));
        this.f47812c.setOrientation(1);
        this.f47811b.addView(this.f47812c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final mx0 f46005b;

            {
                this.f46005b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f46005b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        mx0 mx0Var = this.f46005b;
                        ui.a aVar = mx0Var.f47819x;
                        if (aVar != null) {
                            int i11 = aVar.f56371a;
                            int i12 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = mx0Var.f47810a;
                                if (i12 < editTextBoldCursorArr.length) {
                                    if ((i11 != 1 || i12 != 4) && (i11 != 2 || (i12 != 2 && i12 != 3))) {
                                        if (i12 == 0) {
                                            str = mx0Var.f47819x.f56372b;
                                        } else if (i12 == 1) {
                                            int i13 = mx0Var.f47819x.f56373c;
                                            if (i13 != 0) {
                                                str = Integer.toString(i13);
                                            }
                                            str = null;
                                        } else if (i12 == 2) {
                                            str = mx0Var.f47819x.d;
                                        } else if (i12 == 3) {
                                            str = mx0Var.f47819x.f56374e;
                                        } else {
                                            if (i12 == 4) {
                                                str = mx0Var.f47819x.f56375f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                mx0Var.f47810a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                mx0Var.f47810a[i12].setText(str);
                                            }
                                        } else {
                                            mx0Var.f47810a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    mx0Var.a0(i11, true, new org.telegram.ui.Components.o2(mx0Var, i11, 25));
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
        int i11 = 0;
        while (i11 < 3) {
            int f11 = ui.a.f(i11);
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
            h6VarArr[i11] = h6Var;
            org.telegram.ui.ActionBar.r6.R(h6Var, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27878d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6), null);
            h6VarArr[i11].setTag(Integer.valueOf(i11));
            if (i11 == 0) {
                org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[i11];
                String M0 = org.telegram.messenger.bd.M0(2131743792, null);
                if (f11 == this.f47818w) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h6Var2.c(M0, z12, true);
            } else if (i11 == 1) {
                org.telegram.ui.Cells.h6 h6Var3 = h6VarArr[i11];
                String M02 = org.telegram.messenger.bd.M0(2131743789, null);
                if (f11 == this.f47818w) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h6Var3.c(M02, z11, true);
            } else {
                org.telegram.ui.Cells.h6 h6Var4 = h6VarArr[i11];
                String M03 = org.telegram.messenger.bd.M0(2131743783, null);
                if (f11 == this.f47818w) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6Var4.c(M03, z10, false);
            }
            this.f47812c.addView(h6VarArr[i11], b8.mf.o(-1, 50));
            h6VarArr[i11].setOnClickListener(onClickListener);
            i11++;
            i10 = -1;
        }
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        x6VarArr[0] = x6Var;
        this.f47812c.addView(x6Var, b8.mf.o(i10, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.g0.L(1.0f));
        this.d.setOutlineProvider(null);
        int i12 = -1;
        this.f47812c.addView(this.d, b8.mf.o(-1, -2));
        int i13 = 5;
        this.f47810a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, b8.mf.o(i12, 64));
            this.f47810a[i14] = new EditTextBoldCursor(context);
            this.f47810a[i14].setTag(Integer.valueOf(i14));
            this.f47810a[i14].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.f47810a[i14], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.f47810a[i14];
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i15, null);
            this.f47810a[i14].setBackground(null);
            org.telegram.ui.ActionBar.r6.w(this.f47810a[i14], i15, null);
            this.f47810a[i14].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f47810a[i14].setCursorWidth(1.5f);
            this.f47810a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f47810a[i14];
            if (org.telegram.messenger.bd.f21784a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            editTextBoldCursor2.setGravity(i3 | 16);
            org.telegram.ui.ActionBar.r6.A(this.f47810a[i14], org.telegram.ui.ActionBar.k6.L6, null);
            this.f47810a[i14].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.r6.G(this.f47810a[i14], org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, null);
            if (i14 == 0) {
                this.f47810a[i14].setInputType(524305);
                this.f47810a[i14].addTextChangedListener(new kx0(this, 0));
            } else if (i14 == 1) {
                this.f47810a[i14].setInputType(2);
                this.f47810a[i14].addTextChangedListener(new kx0(this, 1));
            } else if (i14 == 3) {
                this.f47810a[i14].setInputType(129);
                this.f47810a[i14].setTypeface(Typeface.DEFAULT);
                this.f47810a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f47810a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f47810a[i14].addTextChangedListener(new kx0(this, 2));
            }
            this.f47810a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f47810a[i14].setHintText(org.telegram.messenger.bd.M0(2131743794, null));
                                this.f47810a[i14].setText(zyVar.f26993a.f56375f);
                            }
                        } else {
                            this.f47810a[i14].setHintText(org.telegram.messenger.bd.M0(2131743797, null));
                            this.f47810a[i14].setText(zyVar.f26993a.f56374e);
                        }
                    } else {
                        this.f47810a[i14].setHintText(org.telegram.messenger.bd.M0(2131743784, null));
                        this.f47810a[i14].setText(zyVar.f26993a.d);
                    }
                } else {
                    this.f47810a[i14].setHintText(org.telegram.messenger.bd.M0(2131743796, null));
                    this.f47810a[i14].setText(Integer.toString(zyVar.f26993a.f56373c));
                }
            } else {
                this.f47810a[i14].setHintText(org.telegram.messenger.bd.M0(2131743801, null));
                this.f47810a[i14].setText(zyVar.f26993a.f56372b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f47810a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f47810a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f47810a[i14];
            if (i14 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, b8.mf.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f47810a[i14].setOnEditorActionListener(new ea(this, 10));
            i14++;
            i13 = 5;
            i12 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8VarArr[i16] = y8Var;
            if (i16 == 0) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131743798, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743787, sb2, "\n\n");
                sb2.append(org.telegram.messenger.bd.M0(2131743786, null));
                y8Var.setText(sb2.toString());
                y8VarArr[i16].setVisibility(8);
            }
            this.f47812c.addView(y8VarArr[i16], b8.mf.o(-1, -2));
        }
        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(this.fragmentView.getContext());
        this.f47815n = v9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        int i17 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        int i18 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
        v9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
        this.f47815n.b(org.telegram.messenger.bd.M0(2131747442, null), false);
        TextView textView = this.f47815n.getTextView();
        int i19 = org.telegram.ui.ActionBar.k6.f28121q6;
        org.telegram.ui.ActionBar.r6.V(textView, i19, null);
        this.f47815n.setOnClickListener(new View.OnClickListener(this) {
            public final mx0 f46005b;

            {
                this.f46005b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f46005b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        mx0 mx0Var = this.f46005b;
                        ui.a aVar = mx0Var.f47819x;
                        if (aVar != null) {
                            int i112 = aVar.f56371a;
                            int i122 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = mx0Var.f47810a;
                                if (i122 < editTextBoldCursorArr.length) {
                                    if ((i112 != 1 || i122 != 4) && (i112 != 2 || (i122 != 2 && i122 != 3))) {
                                        if (i122 == 0) {
                                            str = mx0Var.f47819x.f56372b;
                                        } else if (i122 == 1) {
                                            int i132 = mx0Var.f47819x.f56373c;
                                            if (i132 != 0) {
                                                str = Integer.toString(i132);
                                            }
                                            str = null;
                                        } else if (i122 == 2) {
                                            str = mx0Var.f47819x.d;
                                        } else if (i122 == 3) {
                                            str = mx0Var.f47819x.f56374e;
                                        } else {
                                            if (i122 == 4) {
                                                str = mx0Var.f47819x.f56375f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                mx0Var.f47810a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                mx0Var.f47810a[i122].setText(str);
                                            }
                                        } else {
                                            mx0Var.f47810a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    mx0Var.a0(i112, true, new org.telegram.ui.Components.o2(mx0Var, i112, 25));
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
        this.f47812c.addView(this.f47815n, 0, b8.mf.o(-1, -2));
        this.f47815n.setVisibility(8);
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(this.fragmentView.getContext(), (org.telegram.ui.Cells.f1) null);
        x6VarArr[2] = x6Var2;
        this.f47812c.addView(x6Var2, 1, b8.mf.o(-1, -2));
        x6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
        this.h = v9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i17);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i18);
        v9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.r6.k(v9Var2, N02, N3, N4, null);
        this.h.b(org.telegram.messenger.bd.M0(2131745469, null), false);
        org.telegram.ui.ActionBar.r6.V(this.h.getTextView(), i19, null);
        this.f47812c.addView(this.h, b8.mf.o(-1, -2));
        this.h.setOnClickListener(new hb0(13, this, context));
        org.telegram.ui.Cells.x6 x6Var3 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        x6VarArr[1] = x6Var3;
        this.f47812c.addView(x6Var3, b8.mf.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Z(false);
        this.f47818w = 0;
        a0(zyVar.f26993a.f56371a, false, null);
        this.f47819x = null;
        this.f47820y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int x02;
        try {
            int i3 = 0;
            if (this.f47811b != null && (x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28160s8, false)) != this.N) {
                this.N = x02;
                org.telegram.messenger.g0.z3(this.f47811b, x02);
            }
            if (this.f47810a != null) {
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6);
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6);
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f47810a;
                    if (i3 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i3];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                            org.telegram.ui.ActionBar.r6.w(this.f47810a[i3], org.telegram.ui.ActionBar.k6.G6, null);
                            org.telegram.ui.ActionBar.r6.A(this.f47810a[i3], org.telegram.ui.ActionBar.k6.L6, null);
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.f47811b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47811b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28160s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        for (int i3 = 0; i3 < this.f47817s.length; i3++) {
        }
        if (this.f47810a != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f47810a;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47810a[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.f47813e;
            if (i11 >= x6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.x6 x6Var = x6VarArr[i11];
            i11++;
        }
        for (int i12 = 0; i12 < this.f47814f.length; i12++) {
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
        this.I.removePrimaryClipChangedListener(this.M);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        c0();
    }

    @Override
    public final void onThemeColorsChanged() {
        int i3;
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.H;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                TextView textView = this.h.getTextView();
                if (this.G) {
                    i3 = org.telegram.ui.ActionBar.k6.f28121q6;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.f28290z6;
                }
                org.telegram.ui.ActionBar.r6.V(textView, i3, null);
            }
            d0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.J) {
            this.f47810a[0].requestFocus();
            org.telegram.messenger.g0.K3(this.f47810a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

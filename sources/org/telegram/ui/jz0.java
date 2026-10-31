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
public final class jz0 extends org.telegram.ui.ActionBar.k2 {
    public float D;
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public org.telegram.messenger.sz J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public int M;
    public EditTextBoldCursor[] f38635a;
    public gz0 f38636b;
    public fz0 f38637c;
    public LinearLayout d;
    public org.telegram.ui.Cells.c7[] e;
    public org.telegram.ui.Cells.b9[] f38638f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.x9 f38639n;
    public org.telegram.ui.ActionBar.l5 f38640r;
    public org.telegram.ui.Cells.m6[] f38641s;
    public int f38642w;
    public ji.b f38643x;
    public String f38644y;

    public jz0() {
        super(null);
        this.e = new org.telegram.ui.Cells.c7[3];
        this.f38638f = new org.telegram.ui.Cells.b9[2];
        this.f38641s = new org.telegram.ui.Cells.m6[3];
        this.D = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new dz0(this);
        this.J = new org.telegram.messenger.sz(ji.b.f10426i);
        this.I = true;
    }

    public final void Y(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f38640r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f38635a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.f38642w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.f38635a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ji.k.l(editTextBoldCursor.getText().toString())) || ji.k.f(this.f38635a[4].getText().toString()) == null)) {
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
                    this.G.addUpdateListener(new a3(this, 29));
                }
                float f7 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.D;
                    if (!z11) {
                        f7 = 0.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (!z11) {
                        f7 = 0.0f;
                    }
                    this.D = f7;
                    TextView textView = this.h.getTextView();
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.t6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.f21330z6;
                    }
                    org.telegram.ui.ActionBar.a7.V(textView, i10, null);
                }
                this.h.setEnabled(z11);
                this.f38640r.a(z11, z10);
                this.F = z11;
            }
        }
    }

    public final void Z(int i10, boolean z10, org.telegram.ui.Components.qq qqVar) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.m6[] m6VarArr = this.f38641s;
        org.telegram.ui.Cells.b9[] b9VarArr = this.f38638f;
        if (this.f38642w != i10) {
            this.f38642w = i10;
            TransitionManager.endTransitions(this.f38637c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f26495f).setDuration(250L);
                if (qqVar != null) {
                    duration.addListener((Transition.TransitionListener) new iz0(qqVar));
                }
                TransitionManager.beginDelayedTransition(this.f38637c, duration);
            }
            int i11 = this.f38642w;
            int i12 = 8;
            if (i11 == 1) {
                b9VarArr[0].setVisibility(0);
                b9VarArr[1].setVisibility(8);
                ((View) this.f38635a[4].getParent()).setVisibility(8);
                ((View) this.f38635a[3].getParent()).setVisibility(0);
                ((View) this.f38635a[2].getParent()).setVisibility(0);
                ((View) this.f38635a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                b9VarArr[0].setVisibility(8);
                b9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.b9 b9Var = b9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.z20.q(null, 2131743803, sb2, "\n\n");
                sb2.append(org.telegram.messenger.cd.L0(2131743802, null));
                b9Var.setText(sb2.toString());
                ((View) this.f38635a[4].getParent()).setVisibility(0);
                ((View) this.f38635a[3].getParent()).setVisibility(8);
                ((View) this.f38635a[2].getParent()).setVisibility(8);
                ((View) this.f38635a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                b9VarArr[0].setVisibility(8);
                b9VarArr[1].setVisibility(0);
                b9VarArr[1].setText(org.telegram.messenger.cd.L0(2131743798, null));
                ((View) this.f38635a[4].getParent()).setVisibility(0);
                ((View) this.f38635a[3].getParent()).setVisibility(8);
                ((View) this.f38635a[2].getParent()).setVisibility(8);
                ((View) this.f38635a[1].getParent()).setVisibility(8);
                this.f38635a[1].setText("443");
            }
            org.telegram.ui.Cells.x9 x9Var = this.h;
            if (this.f38642w != 3) {
                i12 = 0;
            }
            x9Var.setVisibility(i12);
            org.telegram.ui.Cells.m6 m6Var = m6VarArr[0];
            if (this.f38642w == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            m6Var.a(z11, z10);
            org.telegram.ui.Cells.m6 m6Var2 = m6VarArr[1];
            if (this.f38642w == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            m6Var2.a(z12, z10);
            org.telegram.ui.Cells.m6 m6Var3 = m6VarArr[2];
            if (this.f38642w != 3) {
                z13 = false;
            }
            m6Var3.a(z13, z10);
            Y(z10);
        }
    }

    public final void a0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jz0.a0():void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21003h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20986g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    public final void b0() {
        int x02;
        try {
            int i10 = 0;
            if (this.f38636b != null && (x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21206s8, false)) != this.M) {
                this.M = x02;
                org.telegram.messenger.i0.y3(this.f38636b, x02);
            }
            if (this.f38635a != null) {
                org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.H6);
                org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.G6);
                org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f38635a;
                    if (i10 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.t6.H6, null);
                            org.telegram.ui.ActionBar.a7.w(this.f38635a[i10], org.telegram.ui.ActionBar.t6.G6, null);
                            org.telegram.ui.ActionBar.a7.A(this.f38635a[i10], org.telegram.ui.ActionBar.t6.L6, null);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.b9[] b9VarArr = this.f38638f;
        org.telegram.messenger.sz szVar = this.J;
        org.telegram.ui.Cells.c7[] c7VarArr = this.e;
        org.telegram.ui.Cells.m6[] m6VarArr = this.f38641s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746619, null));
        this.simpleActionBar.setBackButtonImage(2131231241);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 25));
        this.f38640r = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f38637c = new org.telegram.ui.Components.hn0(context);
        ?? in0Var = new org.telegram.ui.Components.in0(context, this.f38637c, this.resourceProvider, true);
        this.f38636b = in0Var;
        in0Var.setDrawBackground(true);
        this.f38636b.setFillViewport(true);
        this.f38636b.setOverScrollMode(0);
        org.telegram.messenger.i0.y3(this.f38636b, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21206s8, false));
        int i11 = -1;
        frameLayout.addView(this.f38636b, w7.b6.c(-1.0f, -1));
        this.f38637c.setOrientation(1);
        this.f38636b.addView(this.f38637c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final jz0 f37133b;

            {
                this.f37133b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f37133b.Z(ji.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        jz0 jz0Var = this.f37133b;
                        ji.b bVar = jz0Var.f38643x;
                        if (bVar != null) {
                            int i12 = bVar.f10427a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = jz0Var.f38635a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = jz0Var.f38643x.f10428b;
                                        } else if (i13 == 1) {
                                            int i14 = jz0Var.f38643x.f10429c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = jz0Var.f38643x.d;
                                        } else if (i13 == 3) {
                                            str = jz0Var.f38643x.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = jz0Var.f38643x.f10430f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                jz0Var.f38635a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                jz0Var.f38635a[i13].setText(str);
                                            }
                                        } else {
                                            jz0Var.f38635a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    jz0Var.Z(i12, true, new org.telegram.ui.Components.qq(jz0Var, i12, 20));
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
            int e = ji.b.e(i12);
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, null);
            m6VarArr[i12] = m6Var;
            org.telegram.ui.ActionBar.a7.R(m6Var, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20929d6), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6), null);
            m6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.m6 m6Var2 = m6VarArr[i12];
                String L0 = org.telegram.messenger.cd.L0(2131743808, null);
                if (e == this.f38642w) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m6Var2.c(L0, z12, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.m6 m6Var3 = m6VarArr[i12];
                String L02 = org.telegram.messenger.cd.L0(2131743805, null);
                if (e == this.f38642w) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m6Var3.c(L02, z11, true);
            } else {
                org.telegram.ui.Cells.m6 m6Var4 = m6VarArr[i12];
                String L03 = org.telegram.messenger.cd.L0(2131743799, null);
                if (e == this.f38642w) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m6Var4.c(L03, z10, false);
            }
            this.f38637c.addView(m6VarArr[i12], w7.b6.o(-1, 50));
            m6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
            i11 = -1;
        }
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        c7VarArr[0] = c7Var;
        this.f38637c.addView(c7Var, w7.b6.o(i11, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.i0.L(1.0f));
        this.d.setOutlineProvider(null);
        this.f38637c.addView(this.d, w7.b6.o(-1, -2));
        this.f38635a = new EditTextBoldCursor[5];
        int i13 = 0;
        for (int i14 = 5; i13 < i14; i14 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.b6.o(-1, 64));
            this.f38635a[i13] = new EditTextBoldCursor(context);
            this.f38635a[i13].setTag(Integer.valueOf(i13));
            this.f38635a[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.B(this.f38635a[i13], org.telegram.ui.ActionBar.t6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.f38635a[i13];
            int i15 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i15, null);
            this.f38635a[i13].setBackground(null);
            org.telegram.ui.ActionBar.a7.w(this.f38635a[i13], i15, null);
            this.f38635a[i13].setCursorSize(org.telegram.messenger.i0.L(20.0f));
            this.f38635a[i13].setCursorWidth(1.5f);
            this.f38635a[i13].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f38635a[i13];
            if (org.telegram.messenger.cd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            org.telegram.ui.ActionBar.a7.A(this.f38635a[i13], org.telegram.ui.ActionBar.t6.L6, null);
            this.f38635a[i13].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.a7.G(this.f38635a[i13], org.telegram.ui.ActionBar.t6.f21058k6, org.telegram.ui.ActionBar.t6.f21076l6, org.telegram.ui.ActionBar.t6.f21153p7, null);
            if (i13 == 0) {
                this.f38635a[i13].setInputType(524305);
                this.f38635a[i13].addTextChangedListener(new hz0(this, 0));
            } else if (i13 == 1) {
                this.f38635a[i13].setInputType(2);
                this.f38635a[i13].addTextChangedListener(new hz0(this, 1));
            } else if (i13 == 3) {
                this.f38635a[i13].setInputType(129);
                this.f38635a[i13].setTypeface(Typeface.DEFAULT);
                this.f38635a[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f38635a[i13].setInputType(524289);
            }
            if (i13 == 4) {
                this.f38635a[i13].addTextChangedListener(new hz0(this, 2));
            }
            this.f38635a[i13].setImeOptions(268435461);
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                this.f38635a[i13].setHintText(org.telegram.messenger.cd.L0(2131743810, null));
                                this.f38635a[i13].setText(szVar.f17974a.f10430f);
                            }
                        } else {
                            this.f38635a[i13].setHintText(org.telegram.messenger.cd.L0(2131743813, null));
                            this.f38635a[i13].setText(szVar.f17974a.e);
                        }
                    } else {
                        this.f38635a[i13].setHintText(org.telegram.messenger.cd.L0(2131743800, null));
                        this.f38635a[i13].setText(szVar.f17974a.d);
                    }
                } else {
                    this.f38635a[i13].setHintText(org.telegram.messenger.cd.L0(2131743812, null));
                    this.f38635a[i13].setText(Integer.toString(szVar.f17974a.f10429c));
                }
            } else {
                this.f38635a[i13].setHintText(org.telegram.messenger.cd.L0(2131743817, null));
                this.f38635a[i13].setText(szVar.f17974a.f10428b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f38635a[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f38635a[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f38635a[i13];
            if (i13 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.b6.d(-1, -1.0f, 51, 17.0f, f7, 17.0f, 0.0f));
            this.f38635a[i13].setOnEditorActionListener(new ha(this, 10));
            i13++;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9VarArr[i16] = b9Var;
            if (i16 == 0) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131743814, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.z20.q(null, 2131743803, sb2, "\n\n");
                sb2.append(org.telegram.messenger.cd.L0(2131743802, null));
                b9Var.setText(sb2.toString());
                b9VarArr[i16].setVisibility(8);
            }
            this.f38637c.addView(b9VarArr[i16], w7.b6.o(-1, -2));
        }
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(this.fragmentView.getContext());
        this.f38639n = x9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
        int i17 = org.telegram.ui.ActionBar.t6.f20929d6;
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i17);
        int i18 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i18);
        x9Var.setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(x9Var, N0, N, N2, null);
        this.f38639n.b(org.telegram.messenger.cd.L0(2131747450, null), false);
        TextView textView = this.f38639n.getTextView();
        int i19 = org.telegram.ui.ActionBar.t6.q6;
        org.telegram.ui.ActionBar.a7.V(textView, i19, null);
        this.f38639n.setOnClickListener(new View.OnClickListener(this) {
            public final jz0 f37133b;

            {
                this.f37133b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f37133b.Z(ji.b.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        jz0 jz0Var = this.f37133b;
                        ji.b bVar = jz0Var.f38643x;
                        if (bVar != null) {
                            int i122 = bVar.f10427a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = jz0Var.f38635a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = jz0Var.f38643x.f10428b;
                                        } else if (i132 == 1) {
                                            int i142 = jz0Var.f38643x.f10429c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = jz0Var.f38643x.d;
                                        } else if (i132 == 3) {
                                            str = jz0Var.f38643x.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = jz0Var.f38643x.f10430f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                jz0Var.f38635a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                jz0Var.f38635a[i132].setText(str);
                                            }
                                        } else {
                                            jz0Var.f38635a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    jz0Var.Z(i122, true, new org.telegram.ui.Components.qq(jz0Var, i122, 20));
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
        this.f38637c.addView(this.f38639n, 0, w7.b6.o(-1, -2));
        this.f38639n.setVisibility(8);
        org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(this.fragmentView.getContext(), (org.telegram.ui.Cells.f1) null);
        c7VarArr[2] = c7Var2;
        this.f38637c.addView(c7Var2, 1, w7.b6.o(-1, -2));
        c7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
        this.h = x9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(true);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i17);
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i18);
        x9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.a7.k(x9Var2, N02, N3, N4, null);
        this.h.b(org.telegram.messenger.cd.L0(2131745477, null), false);
        org.telegram.ui.ActionBar.a7.V(this.h.getTextView(), i19, null);
        this.f38637c.addView(this.h, w7.b6.o(-1, -2));
        this.h.setOnClickListener(new rv0(1, this, context));
        org.telegram.ui.Cells.c7 c7Var3 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        c7VarArr[1] = c7Var3;
        this.f38637c.addView(c7Var3, w7.b6.o(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.D = 1.0f;
        Y(false);
        this.f38642w = 0;
        Z(szVar.f17974a.f10427a, false, null);
        this.f38643x = null;
        this.f38644y = null;
        a0();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.in0 getScrollViewForSimpleGlass() {
        return this.f38636b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38636b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21206s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        for (int i10 = 0; i10 < this.f38641s.length; i10++) {
        }
        if (this.f38635a != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f38635a;
                if (i11 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i11], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38635a[i11], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                i11++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.e;
            if (i12 >= c7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.c7 c7Var = c7VarArr[i12];
            i12++;
        }
        for (int i13 = 0; i13 < this.f38638f.length; i13++) {
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
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        this.H.addPrimaryClipChangedListener(this.L);
        a0();
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
                    i10 = org.telegram.ui.ActionBar.t6.q6;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.f21330z6;
                }
                org.telegram.ui.ActionBar.a7.V(textView, i10, null);
            }
            b0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.f38635a[0].requestFocus();
            org.telegram.messenger.i0.J3(this.f38635a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

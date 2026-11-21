package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pc0 extends org.telegram.ui.Components.iu0 implements org.telegram.ui.Components.w30 {
    public final TextView E;
    public String F;
    public String G;
    public boolean H;
    public Bundle I;
    public boolean J;
    public final org.telegram.ui.Components.oh0 K;
    public final org.telegram.ui.Components.oh0 L;
    public boolean M;
    public final org.telegram.ui.Components.x30 N;
    public TLRPC.FileLocation O;
    public TLRPC.FileLocation P;
    public final de0 Q;
    public final org.telegram.ui.Components.yb0 f50844a;
    public final org.telegram.ui.Components.yb0 f50845b;
    public final EditTextBoldCursor f50846c;
    public final EditTextBoldCursor d;
    public final fi.t3 f50847e;
    public final org.telegram.ui.Components.b9 f50848f;
    public final hi.l5 h;
    public final xc f50849n;
    public final yc f50850r;
    public AnimatorSet f50851s;
    public final TextView f50852w;
    public final TextView f50853x;
    public final TextView f50854y;

    public pc0(de0 de0Var, Context context) {
        super(context);
        int i7;
        float f10;
        this.Q = de0Var;
        this.J = false;
        this.M = true;
        setOrientation(1);
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(0, false, false);
        this.N = x30Var;
        x30Var.I = true;
        x30Var.K = false;
        x30Var.H = false;
        x30Var.L = false;
        x30Var.f41966a = de0Var;
        x30Var.f41967b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ma.r(78, 78, 1));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f50848f = b9Var;
        fi.t3 t3Var = new fi.t3(10, context, this);
        this.f50847e = t3Var;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(64.0f));
        b9Var.g(13);
        b9Var.k(5L, null, null, null);
        t3Var.setImageDrawable(b9Var);
        frameLayout.addView(t3Var, c8.ma.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        hi.l5 l5Var = new hi.l5(this, context, paint, 14);
        this.h = l5Var;
        frameLayout.addView(l5Var, c8.ma.c(-1.0f, -1));
        l5Var.setOnClickListener(new View.OnClickListener(this) {
            public final pc0 f48964b;

            {
                this.f48964b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        pc0 pc0Var = this.f48964b;
                        xc xcVar = pc0Var.f50849n;
                        org.telegram.ui.Components.oh0 oh0Var = pc0Var.K;
                        org.telegram.ui.Components.x30 x30Var2 = pc0Var.N;
                        if (pc0Var.O != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x30Var2.n(z10, new cb0(pc0Var, 1), new q5(pc0Var, 8), 0);
                        pc0Var.M = false;
                        xcVar.setAnimation(oh0Var);
                        oh0Var.M(0);
                        oh0Var.P(43);
                        xcVar.d();
                        return;
                    default:
                        pc0 pc0Var2 = this.f48964b;
                        if (pc0Var2.Q.W.getTag() == null) {
                            pc0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131623959, org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f), false, null);
        this.K = oh0Var;
        this.L = new org.telegram.ui.Components.oh0(2131623967, org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f), false, null);
        xc xcVar = new xc(4, context, this);
        this.f50849n = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        xcVar.setAnimation(oh0Var);
        xcVar.setEnabled(false);
        xcVar.setClickable(false);
        frameLayout.addView(xcVar, c8.ma.c(-1.0f, -1));
        xcVar.addOnAttachStateChangeListener(new oc0(this));
        yc ycVar = new yc(this, context, 2);
        this.f50850r = ycVar;
        ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
        ycVar.setProgressColor(-1);
        frameLayout.addView(ycVar, c8.ma.c(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setText(org.telegram.messenger.gd.N0(2131746142, null));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, c8.ma.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.f50852w = textView2;
        textView2.setText(org.telegram.messenger.gd.N0(2131746143, "RegisterText2"));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ma.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, c8.ma.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0(context, null);
        this.f50844a = yb0Var;
        yb0Var.setText(org.telegram.messenger.gd.N0(2131750677, null));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f50846c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final pc0 f49276b;

            {
                this.f49276b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.yb0 yb0Var2 = this.f49276b.f50844a;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        yb0Var2.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.yb0 yb0Var3 = this.f49276b.f50845b;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        yb0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        yb0Var.e(editTextBoldCursor);
        yb0Var.addView(editTextBoldCursor, c8.ma.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pc0 f49582b;

            {
                this.f49582b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        pc0 pc0Var = this.f49582b;
                        if (i10 == 5) {
                            pc0Var.d.requestFocus();
                            return true;
                        }
                        pc0Var.getClass();
                        return false;
                    default:
                        pc0 pc0Var2 = this.f49582b;
                        pc0Var2.getClass();
                        if (i10 != 6 && i10 != 5) {
                            return false;
                        }
                        pc0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.yb0 yb0Var2 = new org.telegram.ui.Components.yb0(context, null);
        this.f50845b = yb0Var2;
        yb0Var2.setText(org.telegram.messenger.gd.N0(2131748839, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final pc0 f49276b;

            {
                this.f49276b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.yb0 yb0Var22 = this.f49276b.f50844a;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        yb0Var22.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.yb0 yb0Var3 = this.f49276b.f50845b;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        yb0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        yb0Var2.e(editTextBoldCursor2);
        yb0Var2.addView(editTextBoldCursor2, c8.ma.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pc0 f49582b;

            {
                this.f49582b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        pc0 pc0Var = this.f49582b;
                        if (i10 == 5) {
                            pc0Var.d.requestFocus();
                            return true;
                        }
                        pc0Var.getClass();
                        return false;
                    default:
                        pc0 pc0Var2 = this.f49582b;
                        pc0Var2.getClass();
                        if (i10 != 6 && i10 != 5) {
                            return false;
                        }
                        pc0Var2.h(null);
                        return true;
                }
            }
        });
        boolean O1 = org.telegram.messenger.g0.O1();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (O1) {
            LinearLayout linearLayout = new LinearLayout(de0Var.getParentActivity());
            linearLayout.setOrientation(0);
            yb0Var.setText(org.telegram.messenger.gd.N0(2131750676, null));
            yb0Var2.setText(org.telegram.messenger.gd.N0(2131748838, null));
            linearLayout.addView(yb0Var, c8.ma.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(yb0Var2, c8.ma.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor2);
            }
        } else {
            yb0Var.setText(org.telegram.messenger.gd.N0(2131750677, null));
            yb0Var2.setText(org.telegram.messenger.gd.N0(2131748839, null));
            frameLayout2.addView(yb0Var, c8.ma.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(yb0Var2, c8.ma.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f50853x = textView3;
        textView3.setText(org.telegram.messenger.gd.N0(2131752560, "CancelRegistration"));
        if (org.telegram.messenger.gd.f24241a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView3.setGravity(i7 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView3.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, c8.ma.t(-2, -2, (org.telegram.messenger.gd.f24241a0 ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final pc0 f48964b;

            {
                this.f48964b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        pc0 pc0Var = this.f48964b;
                        xc xcVar2 = pc0Var.f50849n;
                        org.telegram.ui.Components.oh0 oh0Var2 = pc0Var.K;
                        org.telegram.ui.Components.x30 x30Var2 = pc0Var.N;
                        if (pc0Var.O != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x30Var2.n(z10, new cb0(pc0Var, 1), new q5(pc0Var, 8), 0);
                        pc0Var.M = false;
                        xcVar2.setAnimation(oh0Var2);
                        oh0Var2.M(0);
                        oh0Var2.P(43);
                        xcVar2.d();
                        return;
                    default:
                        pc0 pc0Var2 = this.f48964b;
                        if (pc0Var2.Q.W.getTag() == null) {
                            pc0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, c8.ma.r(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f50854y = textView4;
        textView4.setMovementMethod(new org.telegram.messenger.c0(false));
        if (org.telegram.messenger.g0.O1()) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView4.setTextSize(1, f10);
        textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, c8.ma.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        h6.m.i(textView4);
        String N0 = org.telegram.messenger.gd.N0(2131743956, "TermsOfServiceLogin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
        int indexOf = N0.indexOf(42);
        int lastIndexOf = N0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new hi.ha(this, 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new mc0(this, photoSize2, photoSize, 0));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        de0 de0Var = this.Q;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131742684, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131754077, "AreYouSureRegistration");
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131744600, "Stop"), new ic0(this, 0));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, "Continue"), null);
            de0Var.showDialog(t1Var);
            return false;
        }
        de0Var.C1(true, true);
        this.J = false;
        this.I = null;
        return true;
    }

    @Override
    public final void d() {
        this.J = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.N0(2131742546, "YourName");
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signUp tL_auth_signUp;
        int i7;
        if (this.J) {
            return;
        }
        de0 de0Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = de0Var.f46948s0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f50846c;
        if (editTextBoldCursor.length() == 0) {
            de0.c1(de0Var, this.f50844a, true);
            return;
        }
        this.J = true;
        boolean z10 = this.H;
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        if (z10) {
            TLRPC.TL_auth_firebasePnvSignUp tL_auth_firebasePnvSignUp = new TLRPC.TL_auth_firebasePnvSignUp();
            tL_auth_firebasePnvSignUp.first_name = editTextBoldCursor.getText().toString();
            tL_auth_firebasePnvSignUp.last_name = editTextBoldCursor2.getText().toString();
            tL_auth_signUp = tL_auth_firebasePnvSignUp;
        } else {
            TLRPC.TL_auth_signUp tL_auth_signUp2 = new TLRPC.TL_auth_signUp();
            tL_auth_signUp2.phone_code_hash = this.G;
            tL_auth_signUp2.phone_number = this.F;
            tL_auth_signUp2.first_name = editTextBoldCursor.getText().toString();
            tL_auth_signUp2.last_name = editTextBoldCursor2.getText().toString();
            tL_auth_signUp = tL_auth_signUp2;
        }
        de0Var.F1(0, true);
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_signUp, new d3.b(1), new a5(this, 15), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f50854y;
        if (textView != null) {
            if (this.Q.f46932f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(org.telegram.messenger.g0.F).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f50846c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            org.telegram.messenger.g0.I3(editTextBoldCursor);
        }
        org.telegram.messenger.g0.h3(new cb0(this, 3), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.Q.f46948s0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f50846c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f50846c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        de0 de0Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = de0Var.f46948s0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            de0Var.f46948s0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f50846c.setText("");
        this.d.setText("");
        this.F = bundle.getString("phoneFormated");
        this.G = bundle.getString("phoneHash");
        this.H = bundle.getBoolean("fromFirebasePhoneNumberVerification");
        this.I = bundle;
    }

    public final void n() {
        this.f50854y.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(org.telegram.messenger.g0.G).start();
    }

    public final void o(boolean z10) {
        xc xcVar = this.f50849n;
        if (xcVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f50851s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f50851s = null;
        }
        yc ycVar = this.f50850r;
        if (z10) {
            this.f50851s = new AnimatorSet();
            xcVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f50851s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, property, 1.0f), ObjectAnimator.ofFloat(ycVar, property, 0.0f));
            this.f50851s.setDuration(180L);
            this.f50851s.addListener(new ay(this, 5));
            this.f50851s.start();
            return;
        }
        xcVar.setAlpha(1.0f);
        xcVar.setVisibility(0);
        ycVar.setAlpha(0.0f);
        ycVar.setVisibility(4);
    }

    public final void p(boolean z10) {
        de0 de0Var = this.Q;
        if (de0Var.f46948s0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131743957, "TermsOfService");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
        t1Var.S = N0;
        if (z10) {
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754716, "Accept"), new ic0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751592, "Decline"), new ic0(this, 2));
        } else {
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, "OK"), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(de0Var.f46948s0.text);
        org.telegram.messenger.fj.b(spannableStringBuilder, de0Var.f46948s0.entities, false, false, false, false, 0);
        t1Var.U = spannableStringBuilder;
        de0Var.showDialog(t1Var);
    }

    @Override
    public final void updateColors() {
        this.f50848f.invalidateSelf();
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.E.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.m6.D6;
        this.f50852w.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f50846c;
        editTextBoldCursor.setTextColor(x02);
        int i11 = org.telegram.ui.ActionBar.m6.f29525l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        this.f50853x.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29618q6, false));
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        TextView textView = this.f50854y;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        this.f50844a.f();
        this.f50845b.f();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void I(float f10) {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
    }
}

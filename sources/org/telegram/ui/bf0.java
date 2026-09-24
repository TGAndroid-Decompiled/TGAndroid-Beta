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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bf0 extends org.telegram.ui.Components.fw0 implements org.telegram.ui.Components.u40 {
    public String E;
    public String F;
    public Bundle G;
    public boolean H;
    public final org.telegram.ui.Components.ij0 I;
    public final org.telegram.ui.Components.ij0 J;
    public boolean K;
    public final org.telegram.ui.Components.v40 L;
    public TLRPC.FileLocation M;
    public TLRPC.FileLocation N;
    public final qg0 O;
    public final org.telegram.ui.Components.jd0 f32392a;
    public final org.telegram.ui.Components.jd0 f32393b;
    public final EditTextBoldCursor f32394c;
    public final EditTextBoldCursor d;
    public final ai.y5 e;
    public final org.telegram.ui.Components.h9 f32395f;
    public final ci.r6 h;
    public final id f32396n;
    public final jd f32397r;
    public AnimatorSet f32398s;
    public final TextView v;
    public final TextView f32399w;
    public final TextView f32400x;
    public final TextView f32401y;

    public bf0(qg0 qg0Var, Context context) {
        super(context);
        int i10;
        float f7;
        this.O = qg0Var;
        this.H = false;
        this.K = true;
        setOrientation(1);
        org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(0, false, false);
        this.L = v40Var;
        v40Var.H = true;
        v40Var.J = false;
        v40Var.G = false;
        v40Var.K = false;
        v40Var.f28985a = qg0Var;
        v40Var.f28986b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.y5.q(78, 78, 1));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f32395f = h9Var;
        ai.y5 y5Var = new ai.y5(this, context, 10);
        this.e = y5Var;
        y5Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        h9Var.g(13);
        h9Var.n(5L, null, null);
        y5Var.setImageDrawable(h9Var);
        frameLayout.addView(y5Var, w7.y5.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ci.r6 r6Var = new ci.r6(this, context, paint, 12);
        this.h = r6Var;
        frameLayout.addView(r6Var, w7.y5.c(-1.0f, -1));
        r6Var.setOnClickListener(new View.OnClickListener(this) {
            public final bf0 f38957b;

            {
                this.f38957b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        bf0 bf0Var = this.f38957b;
                        id idVar = bf0Var.f32396n;
                        org.telegram.ui.Components.ij0 ij0Var = bf0Var.I;
                        org.telegram.ui.Components.v40 v40Var2 = bf0Var.L;
                        if (bf0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v40Var2.o(z10, new od0(bf0Var, 1), new r5(bf0Var, 8), 0);
                        bf0Var.K = false;
                        idVar.setAnimation(ij0Var);
                        ij0Var.M(0);
                        ij0Var.P(43);
                        idVar.d();
                        return;
                    default:
                        bf0 bf0Var2 = this.f38957b;
                        if (bf0Var2.O.V.getTag() == null) {
                            bf0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.camera, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.I = ij0Var;
        this.J = new org.telegram.ui.Components.ij0(R.raw.camera_wait, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        id idVar = new id(this, context, 3);
        this.f32396n = idVar;
        idVar.setScaleType(ImageView.ScaleType.CENTER);
        idVar.setAnimation(ij0Var);
        idVar.setEnabled(false);
        idVar.setClickable(false);
        frameLayout.addView(idVar, w7.y5.c(-1.0f, -1));
        idVar.addOnAttachStateChangeListener(new af0(this));
        jd jdVar = new jd(this, context, 2);
        this.f32397r = jdVar;
        jdVar.setSize(AndroidUtilities.dp(30.0f));
        jdVar.setProgressColor(-1);
        frameLayout.addView(jdVar, w7.y5.c(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.f32401y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, w7.y5.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.y5.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, w7.y5.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.jd0 jd0Var = new org.telegram.ui.Components.jd0(context, null);
        this.f32392a = jd0Var;
        jd0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f32394c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final bf0 f39894b;

            {
                this.f39894b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.jd0 jd0Var2 = this.f39894b.f32392a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        jd0Var2.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.jd0 jd0Var3 = this.f39894b.f32393b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        jd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        jd0Var.e(editTextBoldCursor);
        jd0Var.addView(editTextBoldCursor, w7.y5.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final bf0 f40122b;

            {
                this.f40122b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        bf0 bf0Var = this.f40122b;
                        if (i11 == 5) {
                            bf0Var.d.requestFocus();
                            return true;
                        }
                        bf0Var.getClass();
                        return false;
                    default:
                        bf0 bf0Var2 = this.f40122b;
                        bf0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        bf0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.jd0 jd0Var2 = new org.telegram.ui.Components.jd0(context, null);
        this.f32393b = jd0Var2;
        jd0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final bf0 f39894b;

            {
                this.f39894b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.jd0 jd0Var22 = this.f39894b.f32392a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        jd0Var22.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.jd0 jd0Var3 = this.f39894b.f32393b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        jd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        jd0Var2.e(editTextBoldCursor2);
        jd0Var2.addView(editTextBoldCursor2, w7.y5.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final bf0 f40122b;

            {
                this.f40122b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        bf0 bf0Var = this.f40122b;
                        if (i11 == 5) {
                            bf0Var.d.requestFocus();
                            return true;
                        }
                        bf0Var.getClass();
                        return false;
                    default:
                        bf0 bf0Var2 = this.f40122b;
                        bf0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        bf0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(qg0Var.getParentActivity());
            linearLayout.setOrientation(0);
            jd0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            jd0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(jd0Var, w7.y5.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(jd0Var2, w7.y5.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            jd0Var.setText(LocaleController.getString(R.string.FirstName));
            jd0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(jd0Var, w7.y5.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(jd0Var2, w7.y5.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f32399w = textView3;
        textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView3.setGravity(i10 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, w7.y5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final bf0 f38957b;

            {
                this.f38957b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        bf0 bf0Var = this.f38957b;
                        id idVar2 = bf0Var.f32396n;
                        org.telegram.ui.Components.ij0 ij0Var2 = bf0Var.I;
                        org.telegram.ui.Components.v40 v40Var2 = bf0Var.L;
                        if (bf0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v40Var2.o(z10, new od0(bf0Var, 1), new r5(bf0Var, 8), 0);
                        bf0Var.K = false;
                        idVar2.setAnimation(ij0Var2);
                        ij0Var2.M(0);
                        ij0Var2.P(43);
                        idVar2.d();
                        return;
                    default:
                        bf0 bf0Var2 = this.f38957b;
                        if (bf0Var2.O.V.getTag() == null) {
                            bf0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, w7.y5.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f32400x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (AndroidUtilities.isSmallScreen()) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView4.setTextSize(1, f7);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, w7.y5.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        n7.z0.k(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new ci.ac(this, 7), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new sq(this, photoSize2, photoSize, 28));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        qg0 qg0Var = this.O;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
            alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f18647a.T = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new ve0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            qg0Var.showDialog(alertDialog$Builder.f18647a);
            return false;
        }
        qg0Var.k1(true, true);
        this.H = false;
        this.G = null;
        return true;
    }

    @Override
    public final void d() {
        this.H = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public vu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("YourName", R.string.YourName);
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.H) {
            return;
        }
        qg0 qg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = qg0Var.f36889p0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f32394c;
        if (editTextBoldCursor.length() == 0) {
            qg0.U0(qg0Var, this.f32392a, true);
            return;
        }
        this.H = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.F;
        tL_auth_signUp.phone_number = this.E;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        qg0Var.n1(0, true);
        i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new m(this, 11), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f32400x;
        if (textView != null) {
            if (this.O.f36878f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f32394c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new od0(this, 3), qg0.f36869t0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.G = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.O.f36889p0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f32394c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f32394c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        qg0 qg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = qg0Var.f36889p0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            qg0Var.f36889p0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f32394c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle;
    }

    @Override
    public final void n() {
        this.f32395f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f32401y.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.h6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f32394c;
        editTextBoldCursor.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.h6.f19190l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        this.f32399w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        int w04 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        TextView textView = this.f32400x;
        textView.setTextColor(w04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
        this.f32392a.f();
        this.f32393b.f();
    }

    public final void o() {
        this.f32400x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z10) {
        id idVar = this.f32396n;
        if (idVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f32398s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f32398s = null;
        }
        jd jdVar = this.f32397r;
        if (z10) {
            this.f32398s = new AnimatorSet();
            idVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f32398s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(idVar, property, 1.0f), ObjectAnimator.ofFloat(jdVar, property, 0.0f));
            this.f32398s.setDuration(180L);
            this.f32398s.addListener(new org.telegram.ui.Components.q81(this, 26));
            this.f32398s.start();
            return;
        }
        idVar.setAlpha(1.0f);
        idVar.setVisibility(0);
        jdVar.setAlpha(0.0f);
        jdVar.setVisibility(4);
    }

    public final void q(boolean z10) {
        qg0 qg0Var = this.O;
        if (qg0Var.f36889p0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
        alertDialog$Builder.f18647a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new ve0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ve0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qg0Var.f36889p0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, qg0Var.f36889p0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18647a;
        a2Var.T = spannableStringBuilder;
        qg0Var.showDialog(a2Var);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void B(float f7) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void L(boolean z10, boolean z11) {
    }
}

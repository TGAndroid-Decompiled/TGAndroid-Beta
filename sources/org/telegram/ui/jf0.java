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
public final class jf0 extends org.telegram.ui.Components.hw0 implements org.telegram.ui.Components.t40 {
    public String E;
    public String F;
    public Bundle G;
    public boolean H;
    public final org.telegram.ui.Components.kj0 I;
    public final org.telegram.ui.Components.kj0 J;
    public boolean K;
    public final org.telegram.ui.Components.u40 L;
    public TLRPC.FileLocation M;
    public TLRPC.FileLocation N;
    public final yg0 O;
    public final org.telegram.ui.Components.kd0 f34937a;
    public final org.telegram.ui.Components.kd0 f34938b;
    public final EditTextBoldCursor f34939c;
    public final EditTextBoldCursor d;
    public final ai.z5 e;
    public final org.telegram.ui.Components.g9 f34940f;
    public final ci.s6 h;
    public final jd f34941n;
    public final kd f34942r;
    public AnimatorSet f34943s;
    public final TextView v;
    public final TextView f34944w;
    public final TextView f34945x;
    public final TextView f34946y;

    public jf0(yg0 yg0Var, Context context) {
        super(context);
        int i10;
        float f7;
        this.O = yg0Var;
        this.H = false;
        this.K = true;
        setOrientation(1);
        org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, false, false);
        this.L = u40Var;
        u40Var.H = true;
        u40Var.J = false;
        u40Var.G = false;
        u40Var.K = false;
        u40Var.f28619a = yg0Var;
        u40Var.f28620b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.y5.q(78, 78, 1));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.f34940f = g9Var;
        ai.z5 z5Var = new ai.z5(this, context, 10);
        this.e = z5Var;
        z5Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        g9Var.g(13);
        g9Var.n(5L, null, null);
        z5Var.setImageDrawable(g9Var);
        frameLayout.addView(z5Var, w7.y5.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ci.s6 s6Var = new ci.s6(this, context, paint, 12);
        this.h = s6Var;
        frameLayout.addView(s6Var, w7.y5.c(-1.0f, -1));
        s6Var.setOnClickListener(new View.OnClickListener(this) {
            public final jf0 f33352b;

            {
                this.f33352b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        jf0 jf0Var = this.f33352b;
                        jd jdVar = jf0Var.f34941n;
                        org.telegram.ui.Components.kj0 kj0Var = jf0Var.I;
                        org.telegram.ui.Components.u40 u40Var2 = jf0Var.L;
                        if (jf0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u40Var2.o(z10, new wd0(jf0Var, 1), new r5(jf0Var, 8), 0);
                        jf0Var.K = false;
                        jdVar.setAnimation(kj0Var);
                        kj0Var.M(0);
                        kj0Var.P(43);
                        jdVar.d();
                        return;
                    default:
                        jf0 jf0Var2 = this.f33352b;
                        if (jf0Var2.O.V.getTag() == null) {
                            jf0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.camera, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.I = kj0Var;
        this.J = new org.telegram.ui.Components.kj0(R.raw.camera_wait, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        jd jdVar = new jd(this, context, 3);
        this.f34941n = jdVar;
        jdVar.setScaleType(ImageView.ScaleType.CENTER);
        jdVar.setAnimation(kj0Var);
        jdVar.setEnabled(false);
        jdVar.setClickable(false);
        frameLayout.addView(jdVar, w7.y5.c(-1.0f, -1));
        jdVar.addOnAttachStateChangeListener(new if0(this));
        kd kdVar = new kd(this, context, 2);
        this.f34942r = kdVar;
        kdVar.setSize(AndroidUtilities.dp(30.0f));
        kdVar.setProgressColor(-1);
        frameLayout.addView(kdVar, w7.y5.c(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.f34946y = textView;
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
        org.telegram.ui.Components.kd0 kd0Var = new org.telegram.ui.Components.kd0(context, null);
        this.f34937a = kd0Var;
        kd0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34939c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final jf0 f33612b;

            {
                this.f33612b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.kd0 kd0Var2 = this.f33612b.f34937a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        kd0Var2.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.kd0 kd0Var3 = this.f33612b.f34938b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        kd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        kd0Var.e(editTextBoldCursor);
        kd0Var.addView(editTextBoldCursor, w7.y5.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final jf0 f33907b;

            {
                this.f33907b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        jf0 jf0Var = this.f33907b;
                        if (i11 == 5) {
                            jf0Var.d.requestFocus();
                            return true;
                        }
                        jf0Var.getClass();
                        return false;
                    default:
                        jf0 jf0Var2 = this.f33907b;
                        jf0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        jf0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.kd0 kd0Var2 = new org.telegram.ui.Components.kd0(context, null);
        this.f34938b = kd0Var2;
        kd0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final jf0 f33612b;

            {
                this.f33612b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.kd0 kd0Var22 = this.f33612b.f34937a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        kd0Var22.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.kd0 kd0Var3 = this.f33612b.f34938b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        kd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        kd0Var2.e(editTextBoldCursor2);
        kd0Var2.addView(editTextBoldCursor2, w7.y5.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final jf0 f33907b;

            {
                this.f33907b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        jf0 jf0Var = this.f33907b;
                        if (i11 == 5) {
                            jf0Var.d.requestFocus();
                            return true;
                        }
                        jf0Var.getClass();
                        return false;
                    default:
                        jf0 jf0Var2 = this.f33907b;
                        jf0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        jf0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(yg0Var.getParentActivity());
            linearLayout.setOrientation(0);
            kd0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            kd0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(kd0Var, w7.y5.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(kd0Var2, w7.y5.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            kd0Var.setText(LocaleController.getString(R.string.FirstName));
            kd0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(kd0Var, w7.y5.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(kd0Var2, w7.y5.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f34944w = textView3;
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
            public final jf0 f33352b;

            {
                this.f33352b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        jf0 jf0Var = this.f33352b;
                        jd jdVar2 = jf0Var.f34941n;
                        org.telegram.ui.Components.kj0 kj0Var2 = jf0Var.I;
                        org.telegram.ui.Components.u40 u40Var2 = jf0Var.L;
                        if (jf0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u40Var2.o(z10, new wd0(jf0Var, 1), new r5(jf0Var, 8), 0);
                        jf0Var.K = false;
                        jdVar2.setAnimation(kj0Var2);
                        kj0Var2.M(0);
                        kj0Var2.P(43);
                        jdVar2.d();
                        return;
                    default:
                        jf0 jf0Var2 = this.f33352b;
                        if (jf0Var2.O.V.getTag() == null) {
                            jf0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, w7.y5.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f34945x = textView4;
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
        org.telegram.ui.Cells.f3.j(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new ci.dc(this, 7), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new vq(this, photoSize2, photoSize, 28));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        yg0 yg0Var = this.O;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f18669a.T = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new df0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            yg0Var.showDialog(alertDialog$Builder.f18669a);
            return false;
        }
        yg0Var.k1(true, true);
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
    public dv0 getCloseIntoObject() {
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
        yg0 yg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = yg0Var.f39948p0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f34939c;
        if (editTextBoldCursor.length() == 0) {
            yg0.U0(yg0Var, this.f34937a, true);
            return;
        }
        this.H = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.F;
        tL_auth_signUp.phone_number = this.E;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        yg0Var.n1(0, true);
        i10 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new m(this, 11), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f34945x;
        if (textView != null) {
            if (this.O.f39937f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f34939c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new wd0(this, 3), yg0.f39928t0);
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
                this.O.f39948p0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f34939c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34939c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        yg0 yg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = yg0Var.f39948p0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            yg0Var.f39948p0.serializeToStream(serializedData);
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
        this.f34939c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle;
    }

    @Override
    public final void n() {
        this.f34940f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f34946y.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f34939c;
        editTextBoldCursor.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.j6.f19255l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34944w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        TextView textView = this.f34945x;
        textView.setTextColor(w04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        this.f34937a.f();
        this.f34938b.f();
    }

    public final void o() {
        this.f34945x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z10) {
        jd jdVar = this.f34941n;
        if (jdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f34943s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f34943s = null;
        }
        kd kdVar = this.f34942r;
        if (z10) {
            this.f34943s = new AnimatorSet();
            jdVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f34943s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, property, 1.0f), ObjectAnimator.ofFloat(kdVar, property, 0.0f));
            this.f34943s.setDuration(180L);
            this.f34943s.addListener(new org.telegram.ui.Components.t81(this, 26));
            this.f34943s.start();
            return;
        }
        jdVar.setAlpha(1.0f);
        jdVar.setVisibility(0);
        kdVar.setAlpha(0.0f);
        kdVar.setVisibility(4);
    }

    public final void q(boolean z10) {
        yg0 yg0Var = this.O;
        if (yg0Var.f39948p0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
        alertDialog$Builder.f18669a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new df0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new df0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yg0Var.f39948p0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, yg0Var.f39948p0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
        b2Var.T = spannableStringBuilder;
        yg0Var.showDialog(b2Var);
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

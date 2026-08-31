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
public final class af0 extends org.telegram.ui.Components.wv0 implements org.telegram.ui.Components.x40 {
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public final org.telegram.ui.Components.ij0 F;
    public final org.telegram.ui.Components.ij0 G;
    public boolean H;
    public final org.telegram.ui.Components.y40 I;
    public TLRPC.FileLocation J;
    public TLRPC.FileLocation K;
    public final og0 L;
    public final org.telegram.ui.Components.cd0 f35150a;
    public final org.telegram.ui.Components.cd0 f35151b;
    public final EditTextBoldCursor f35152c;
    public final EditTextBoldCursor d;
    public final oh.a4 f35153e;
    public final org.telegram.ui.Components.z8 f35154f;
    public final fg.i0 h;
    public final kd f35155n;
    public final ld f35156r;
    public AnimatorSet f35157s;
    public final TextView v;
    public final TextView f35158w;
    public final TextView f35159x;
    public final TextView f35160y;

    public af0(og0 og0Var, Context context) {
        super(context);
        int i10;
        float f10;
        this.L = og0Var;
        this.E = false;
        this.H = true;
        setOrientation(1);
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, false, false);
        this.I = y40Var;
        y40Var.E = true;
        y40Var.G = false;
        y40Var.D = false;
        y40Var.H = false;
        y40Var.f33294a = og0Var;
        y40Var.f33295b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, k7.c6.q(78, 78, 1));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f35154f = z8Var;
        oh.a4 a4Var = new oh.a4(this, context, 9);
        this.f35153e = a4Var;
        a4Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        z8Var.g(13);
        z8Var.n(5L, null, null);
        a4Var.setImageDrawable(z8Var);
        frameLayout.addView(a4Var, k7.c6.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fg.i0 i0Var = new fg.i0(this, context, paint, 11);
        this.h = i0Var;
        frameLayout.addView(i0Var, k7.c6.c(-1.0f, -1));
        i0Var.setOnClickListener(new View.OnClickListener(this) {
            public final af0 f42216b;

            {
                this.f42216b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z4;
                switch (r2) {
                    case 0:
                        af0 af0Var = this.f42216b;
                        kd kdVar = af0Var.f35155n;
                        org.telegram.ui.Components.ij0 ij0Var = af0Var.F;
                        org.telegram.ui.Components.y40 y40Var2 = af0Var.I;
                        if (af0Var.J != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        y40Var2.o(z4, new nd0(af0Var, 1), new v5(af0Var, 8), 0);
                        af0Var.H = false;
                        kdVar.setAnimation(ij0Var);
                        ij0Var.K(0);
                        ij0Var.N(43);
                        kdVar.d();
                        return;
                    default:
                        af0 af0Var2 = this.f42216b;
                        if (af0Var2.L.S.getTag() == null) {
                            af0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        int i11 = R.raw.camera;
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(i11, String.valueOf(i11), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.F = ij0Var;
        int i12 = R.raw.camera_wait;
        this.G = new org.telegram.ui.Components.ij0(i12, String.valueOf(i12), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        kd kdVar = new kd(this, context, 3);
        this.f35155n = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        kdVar.setAnimation(ij0Var);
        kdVar.setEnabled(false);
        kdVar.setClickable(false);
        frameLayout.addView(kdVar, k7.c6.c(-1.0f, -1));
        kdVar.addOnAttachStateChangeListener(new ze0(this));
        ld ldVar = new ld(this, context, 2);
        this.f35156r = ldVar;
        ldVar.setSize(AndroidUtilities.dp(30.0f));
        ldVar.setProgressColor(-1);
        frameLayout.addView(ldVar, k7.c6.c(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.f35160y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, k7.c6.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, k7.c6.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, k7.c6.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0(context, null);
        this.f35150a = cd0Var;
        cd0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f35152c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final af0 f42452b;

            {
                this.f42452b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z4) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.cd0 cd0Var2 = this.f42452b.f35150a;
                        if (z4) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        cd0Var2.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.cd0 cd0Var3 = this.f42452b.f35151b;
                        if (z4) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        cd0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        cd0Var.e(editTextBoldCursor);
        cd0Var.addView(editTextBoldCursor, k7.c6.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final af0 f43041b;

            {
                this.f43041b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        af0 af0Var = this.f43041b;
                        if (i13 == 5) {
                            af0Var.d.requestFocus();
                            return true;
                        }
                        af0Var.getClass();
                        return false;
                    default:
                        af0 af0Var2 = this.f43041b;
                        af0Var2.getClass();
                        if (i13 != 6 && i13 != 5) {
                            return false;
                        }
                        af0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.cd0 cd0Var2 = new org.telegram.ui.Components.cd0(context, null);
        this.f35151b = cd0Var2;
        cd0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final af0 f42452b;

            {
                this.f42452b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z4) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.cd0 cd0Var22 = this.f42452b.f35150a;
                        if (z4) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        cd0Var22.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.cd0 cd0Var3 = this.f42452b.f35151b;
                        if (z4) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        cd0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        cd0Var2.e(editTextBoldCursor2);
        cd0Var2.addView(editTextBoldCursor2, k7.c6.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final af0 f43041b;

            {
                this.f43041b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        af0 af0Var = this.f43041b;
                        if (i13 == 5) {
                            af0Var.d.requestFocus();
                            return true;
                        }
                        af0Var.getClass();
                        return false;
                    default:
                        af0 af0Var2 = this.f43041b;
                        af0Var2.getClass();
                        if (i13 != 6 && i13 != 5) {
                            return false;
                        }
                        af0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(og0Var.getParentActivity());
            linearLayout.setOrientation(0);
            cd0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            cd0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(cd0Var, k7.c6.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(cd0Var2, k7.c6.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            cd0Var.setText(LocaleController.getString(R.string.FirstName));
            cd0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(cd0Var, k7.c6.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(cd0Var2, k7.c6.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f35158w = textView3;
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
        addView(textView3, k7.c6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final af0 f42216b;

            {
                this.f42216b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z4;
                switch (r2) {
                    case 0:
                        af0 af0Var = this.f42216b;
                        kd kdVar2 = af0Var.f35155n;
                        org.telegram.ui.Components.ij0 ij0Var2 = af0Var.F;
                        org.telegram.ui.Components.y40 y40Var2 = af0Var.I;
                        if (af0Var.J != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        y40Var2.o(z4, new nd0(af0Var, 1), new v5(af0Var, 8), 0);
                        af0Var.H = false;
                        kdVar2.setAnimation(ij0Var2);
                        ij0Var2.K(0);
                        ij0Var2.N(43);
                        kdVar2.d();
                        return;
                    default:
                        af0 af0Var2 = this.f42216b;
                        if (af0Var2.L.S.getTag() == null) {
                            af0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, k7.c6.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f35159x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (AndroidUtilities.isSmallScreen()) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView4.setTextSize(1, f10);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, k7.c6.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        n7.qa.M0(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new fg.l0(this, 7), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new sq(this, photoSize2, photoSize, 28));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z4) {
        og0 og0Var = this.L;
        if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f21166a.Q = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new ue0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            og0Var.showDialog(alertDialog$Builder.f21166a);
            return false;
        }
        og0Var.k1(true, true);
        this.E = false;
        this.D = null;
        return true;
    }

    @Override
    public final void d() {
        this.E = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public lu0 getCloseIntoObject() {
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
        if (this.E) {
            return;
        }
        og0 og0Var = this.L;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = og0Var.m0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f35152c;
        if (editTextBoldCursor.length() == 0) {
            og0.U0(og0Var, this.f35150a, true);
            return;
        }
        this.E = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.C;
        tL_auth_signUp.phone_number = this.B;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        og0Var.n1(0, true);
        i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new o(this, 11), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f35159x;
        if (textView != null) {
            if (this.L.f39759f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f35152c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new nd0(this, 3), og0.f39749q0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.L.m0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f35152c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f35152c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        og0 og0Var = this.L;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = og0Var.m0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            og0Var.m0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.D;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        if (bundle == null) {
            return;
        }
        this.f35152c.setText("");
        this.d.setText("");
        this.B = bundle.getString("phoneFormated");
        this.C = bundle.getString("phoneHash");
        this.D = bundle;
    }

    @Override
    public final void n() {
        this.f35154f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f35160y.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.k6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f35152c;
        editTextBoldCursor.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.k6.f21803l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f35158w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false));
        int w04 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        TextView textView = this.f35159x;
        textView.setTextColor(w04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
        this.f35150a.f();
        this.f35151b.f();
    }

    public final void o() {
        this.f35159x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z4) {
        kd kdVar = this.f35155n;
        if (kdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f35157s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f35157s = null;
        }
        ld ldVar = this.f35156r;
        if (z4) {
            this.f35157s = new AnimatorSet();
            kdVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f35157s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 1.0f), ObjectAnimator.ofFloat(ldVar, property, 0.0f));
            this.f35157s.setDuration(180L);
            this.f35157s.addListener(new org.telegram.ui.Components.g91(this, 24));
            this.f35157s.start();
            return;
        }
        kdVar.setAlpha(1.0f);
        kdVar.setVisibility(0);
        ldVar.setAlpha(0.0f);
        ldVar.setVisibility(4);
    }

    public final void q(boolean z4) {
        og0 og0Var = this.L;
        if (og0Var.m0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
        alertDialog$Builder.f21166a.O = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z4) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new ue0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ue0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(og0Var.m0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, og0Var.m0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.Q = spannableStringBuilder;
        og0Var.showDialog(d2Var);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void D(float f10) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void K(boolean z4, boolean z10) {
    }
}
